/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jmc;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dejvk
 */
public class CharacterDaoTest implements CharacterDao {

    @Override
    public List getOnlineCharacters() {
        List<Character> chars = new ArrayList<>();
        
        chars.add(new Character(1).setName("Honzík"));
        chars.add(new Character(2).setName("Anička"));
        chars.add(new Character(3).setName("Maruška"));
        chars.add(new Character(4).setName("Terezka"));
        chars.add(new Character(5).setName("Tomášek"));
        chars.add(new Character(6).setName("Jeníček"));
        chars.add(new Character(7).setName("Mařenka"));
        chars.add(new Character(8).setName("Vlk"));
        chars.add(new Character(9).setName("Babička"));
        chars.add(new Character(10).setName("Dědeček"));

        return chars;
    }

    @Override
    public List getOnlineCharacters(Zone z) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Character getCharacter(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Character getCharacter(int guid) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
