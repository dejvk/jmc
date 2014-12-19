/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.cvut.fit.pjv.knapdavi.jmc.dao;

import cz.cvut.fit.pjv.knapdavi.jmc.model.Character;
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
        
        chars.add(new Character(1).setName("berhndav").setFullName("David Bernhauer"));
        chars.add(new Character(2).setName("knapdavi").setFullName("David Knap"));
        chars.add(new Character(3).setName("alexaja1").setFullName("Jan Alexander"));
        chars.add(new Character(4).setName("koranlu2").setFullName("Lukáš Kořán"));
        chars.add(new Character(5).setName("cernycyr").setFullName("Cyril Černý"));
        chars.add(new Character(6).setName("masekja7").setFullName("Jan Mašek"));
        chars.add(new Character(7).setName("skalaja2").setFullName("Jan Skála"));
        chars.add(new Character(8).setName("hunkajir").setFullName("Jiří Hunka"));
        chars.add(new Character(9).setName("solankar").setFullName("Karolína Solanská"));
        chars.add(new Character(10).setName("kopecev1").setFullName("Eva Kopecká"));
        chars.add(new Character(11).setName("staraluc").setFullName("Lucie Stará"));
        chars.add(new Character(12).setName("rezacvit").setFullName("Vít Řezáč"));
        chars.add(new Character(13).setName("havlista").setFullName("Stanislav Havlík"));
        chars.add(new Character(14).setName("cernym11").setFullName("Michal Černý"));

        return chars;
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
