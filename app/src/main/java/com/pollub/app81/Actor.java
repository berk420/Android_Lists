package com.pollub.app81;

public class Actor {
    private final int flag;
    private final String country;
    private final String capital;
    private final String name;

    public Actor(int flag, String country, String capital,String name) {
        this.flag = flag;
        this.country = country;
        this.capital = capital;
        this.name=name;
    }
    public int getFlag() {return flag;}
    public String getCountry() {return country;}
    public String getCapital() {return capital;}
    public String getName() {return name;}


}
