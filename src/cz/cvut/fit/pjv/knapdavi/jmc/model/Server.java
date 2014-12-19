/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.cvut.fit.pjv.knapdavi.jmc.model;

import java.io.IOException;
import java.net.Socket;

/**
 * Represents a server to communicate with. Default port is 80.
 * @author Dejv
 * @version 1.2
 */
public class Server {

    private final String hostname;
    private int port = 80;

    /**
     * @since 1.2
     * @param hostname
     * @param port 
     */
    public Server(String hostname, int port) {
        this.hostname = hostname;
        this.port = port;
    }

    /**
     * Add server with port 80.
     * @param hostname
     */
    public Server(String hostname) {
        this.hostname = hostname;
    }
    
    public String getHostname() {
        return hostname;
    }

    public int getPort() {
        return port;
    }


    public void setPort(int port) {
        this.port = port;
    }

    public boolean state() {

        Socket socket = null;
        boolean reachable = false;
        try {
            socket = new Socket(hostname, port);
            reachable = true;
        } catch (IOException ex) {

        } finally {
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                }
            }
        }
        return reachable;
    }

}
