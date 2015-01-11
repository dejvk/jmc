/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.cvut.fit.pjv.knapdavi.jmc.dao;

import cz.cvut.fit.pjv.knapdavi.jmc.model.Character;
import java.util.List;

/**
 * Defines which methods are required by connection classes.
 * @author knapdavi
 */
public interface CharacterDao {
    List getOnlineCharacters() throws CharacterDaoException;
    Character getCharacter(String name) throws CharacterDaoException;
}
