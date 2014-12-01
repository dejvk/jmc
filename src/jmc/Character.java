/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jmc;

import jdk.nashorn.internal.codegen.CompilerConstants;

/**
 *
 * @author Dejv
 * @version 0.1.1
 */
public class Character implements Comparable {

    private final int guid;
    private String name;
    private int playedTime;
    private Zone zone;

    public Character(int guid) {
        this.guid = guid;
    }

    /**
     * @return the guid
     */
    public int getGuid() {
        return guid;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     * @return
     */
    public Character setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * @return the playedTime
     */
    public int getPlayedTime() {
        return playedTime;
    }

    /**
     * @param playedTime the playedTime to set
     */
    public void setPlayedTime(int playedTime) {
        this.playedTime = playedTime;
    }

    /**
     * @return the zone
     */
    public Zone getZone() {
        return zone;
    }

    /**
     * @param zone the zone to set
     */
    public void setZone(Zone zone) {
        this.zone = zone;
    }

    /**
     *
     * @param t
     * @return
     */
    public int compareChars(Character t) {
        return this.name.compareTo(t.getName());
    }

    @Override
    public int compareTo(Object t) {
        if (t.getClass() == this.getClass())
            return compareChars((Character) t);
        throw new IllegalArgumentException("Cannot compare Character to different type.");
    }

}
