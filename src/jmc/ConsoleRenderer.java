/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jmc;

/**
 * Handles text user interface.
 * @author Dejv
 * @version 1.2
 */
public class ConsoleRenderer implements Renderer {

    @Override
    public ConsoleRenderer showServerState(Server s) {
        System.out.print("Connecting: " + s.getHostname() + "...");
        if (s.state()) {
            System.out.print("\t [ \u001B[32mOK\u001B[m ]\n");
        } else {
            System.out.print("\t [\u001B[31mfail\u001B[m]\n");
        }
        return this;
    }

    @Override
    public Renderer showOnlineCharacters() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Renderer showCharacterDetail(Character c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
