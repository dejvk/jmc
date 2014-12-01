/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jmc;

/**
 * Defines which methods are required to be supported by any kind of renderer.
 * @author Dejv
 * @version 1.0
 */
public interface Renderer {
    Renderer showServerState(Server s);
    Renderer showOnlineCharacters();
    Renderer showCharacterDetail(Character c);
}
