package org.example.models;

import java.sql.SQLOutput;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;
    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;

    public Hamburger(double price, String name, String meat, String breadRollType) {
        this.price = price;
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
    }

    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public void addHamburgerAddition1(String addition1Name, double addition1Price) {
        this.addition1Name=addition1Name;
        this.addition1Price=addition1Price;
    }

    public void addHamburgerAddition2(String addition2Name, double addition2Price) {
        this.addition2Name=addition2Name;
        this.addition2Price=addition2Price;
    }

    public void addHamburgerAddition3(String addition3Name, double addition3Price) {
        this.addition3Name=addition3Name;
        this.addition3Price=addition3Price;
    }

    public void addHamburgerAddition4(String addition4Name, double addition4Price) {
        this.addition4Name=addition4Name;
        this.addition4Price=addition4Price;
    }

    public double itemizeHamburger() {
        System.out.println("Hamburger: " + name + "Meat: " + meat + "Bread Type: " + breadRollType + "Additions: " +addition1Name + "," + addition2Name + "," + addition3Name );
        double totalPrice = price;
        if (addition1Name != null) {
            totalPrice += addition1Price;
        }
        if (addition2Name != null) {
            totalPrice += addition2Price;
        }
        if (addition3Name != null) {
            totalPrice += addition3Price;
        }
        return totalPrice;
    }
}