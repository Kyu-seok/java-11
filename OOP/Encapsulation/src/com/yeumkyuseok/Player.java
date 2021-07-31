package com.yeumkyuseok;

public class Player {

    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage) {
        this.health = this.health - damage;
        if (this.health <= 0) {
            System.out.println("Player knowcked out");
            //  reduced number of lives remaining for the player
        }
    }

    public int healthRemaining() {
        return this.health;
    }
}
