/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.cvut.fit.pjv.knapdavi.jmc.model;

/**
 *
 * @author knapdavi
 * @version 0.1.1
 */

public class Character implements Comparable {

    private final int guid;
    private String name;
    private String fullName;
    private int playedTime;

    public String getFullName() {
        return fullName;
    }

    public Character setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

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
    public String getPlayedTime() {
        String played = (playedTime / 60 / 60) + " hod (" + (playedTime / 60 / 60 / 24) + " dní)";
        return played;
    }

    /**
     * @param playedTime the playedTime to set
     */
    public Character setPlayedTime(int playedTime) {
        this.playedTime = playedTime;
        return this;
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
        if (t.getClass() == this.getClass()) {
            return compareChars((Character) t);
        }
        throw new IllegalArgumentException("Cannot compare Character to different type.");
    }

    @Override
    public String toString() {
        return name;
    }

}
