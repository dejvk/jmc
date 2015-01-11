/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.cvut.fit.pjv.knapdavi.jmc.dao;

import cz.cvut.fit.pjv.knapdavi.jmc.model.Character;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author knapdavi
 */
public class CharacterDaoMysql implements CharacterDao {

    Connection db;
    String DB_CHARS = "characters";

    public CharacterDaoMysql(String url, String user, String password) throws CharacterDaoException {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            db = DriverManager.getConnection("jdbc:mysql://" + url, user, password);
        } catch (SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            throw new CharacterDaoException("Nelze načíst data.");
        }
    }

    @Override
    public List getOnlineCharacters() throws CharacterDaoException {
        try {
            Statement s = db.createStatement();
            String query = "SELECT c.guid, c.name, e.name as fullname, c.totaltime "
                         + "FROM " + DB_CHARS + ".characters c "
                         + "LEFT JOIN " + DB_CHARS + ".character_extended_data e ON c.guid = e.guid "
                         + "WHERE online = 1 ORDER BY name";
            ResultSet rs = s.executeQuery(query);
            List<Character> chars = new ArrayList<>();
            while (rs.next()) {
                chars.add(new Character(rs.getInt("guid")).setName(rs.getString("name")).setPlayedTime(rs.getInt("totaltime")).setFullName(rs.getString("fullname")));
            }
            return chars;
        } catch (SQLException ex) {
            throw new CharacterDaoException("Nelze načíst data.");
        }

    }

    @Override
    public Character getCharacter(String name) throws CharacterDaoException {
        try {
            String query = "SELECT c.guid, c.name, e.name as fullname, c.totaltime "
                         + "FROM " + DB_CHARS + ".characters c "
                         + "LEFT JOIN " + DB_CHARS + ".character_extended_data e ON c.guid = e.guid "
                         + "WHERE c.name = ?";
            PreparedStatement s = db.prepareStatement(query);
            s.setString(1, name);
            ResultSet rs = s.executeQuery();
            if (!rs.next()) {
                throw new CharacterDaoException("Postava nenalezena.");
            }
            return new Character(rs.getInt("guid")).setName(rs.getString("name")).setFullName(rs.getString("fullname")).setPlayedTime(rs.getInt("totaltime"));
        } catch (SQLException e) {
            throw new CharacterDaoException("Připojení selhalo: " + e.getMessage());
        }
    }

}
