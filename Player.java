package com.company.encapsulation;

public class Player {
    private String name;
    private int health = 100;
    private String weapon;

    public Player(String name, int health, String weapon) {
        this.name = name;
        if (health > 0 && health <=100){
        this.health = health;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage){
        this.health = this.health - damage;
        if (health <= 0){
            System.out.println("You knocked out try again later!!! ");
        }else
            System.out.println("You got damage your health Power is: " + health);

    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    public String getWeapon() {
        return weapon;
    }
}
