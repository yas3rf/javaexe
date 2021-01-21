package com.company.burgerProject;

public class DeluxeBurger extends  Hamburger{
    public DeluxeBurger() {
        super("Deluxe", "Sausage or Bacon", 14.15, "white");
        super.addHamburgerAddition1("Chips",8);
        super.addHamburgerAddition2("Drink",5);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot add Extra item from Deluxe Burger!! ");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot add Extra item from Deluxe Burger!! ");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot add Extra item from Deluxe Burger!! ");
    }
}
