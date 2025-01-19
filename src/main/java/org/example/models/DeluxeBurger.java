package org.example.models;

public class DeluxeBurger extends Hamburger{
    private String cips;
    private String drink;

    public DeluxeBurger() {
        super(19.10, "Deluxe Burger", "Basic", "Wrap");
        this.cips="CURVY";
        this.drink="COKE";
    }

    public String getCips() {
        return cips;
    }
    public String getDrink(){
        return drink;
    }

    @Override
    public void addHamburgerAddition1(String addition1Name, double addition1Price) {
        super.addHamburgerAddition1(addition1Name, addition1Price);
        System.out.println("Deluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition2(String addition2Name, double addition2Price) {
        super.addHamburgerAddition2(addition2Name, addition2Price);
        System.out.println("Deluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition3(String addition3Name, double addition3Price) {
        super.addHamburgerAddition3(addition3Name, addition3Price);
        System.out.println("Deluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition4(String addition4Name, double addition4Price) {
        super.addHamburgerAddition4(addition4Name, addition4Price);
        System.out.println("Deluxe Burger için yeni malzeme eklenemez.");
    }
}