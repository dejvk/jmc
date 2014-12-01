/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jmc;

import java.util.List;

/**
 * Defines which methods are required by connection classes.
 * @author Dejv
 */
public interface CharacterDao {
    List getOnlineCharacters();
    List getOnlineCharacters(Zone z);
    Character getCharacter(String name);
    Character getCharacter(int guid);
}
