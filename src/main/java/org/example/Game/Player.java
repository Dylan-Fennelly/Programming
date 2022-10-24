package org.example.Game;

import java.util.ArrayList;

public class Player
{
    private static int playerId = 1;
    private String name;
    private int maxHealth;
    private int health;
    private int strength;
    private int dexterity;
    private ArrayList<Weapons> weapons;
    private ArrayList<Loot> loot;
    private int score;
    private int lives;


    public Player()
    {
        this("Player 1",10,5,5,null,null,0,5);
    }
    public Player(String name, int maxHealth, int strength, int dexterity, ArrayList<Weapons> weapons, ArrayList<Loot> loot, int score, int lives)
    {
        this.name = name;
        this.maxHealth = maxHealth;
        this.health = maxHealth;
        this.strength = strength;
        this.dexterity = dexterity;
        this.weapons = weapons;
        this.loot = loot;
        this.score = score;
        this.lives = lives;
        this.playerId++;
    }

    public int attack()
    {
        return strength;
    }
    public boolean respawn()
    {
        if(lives>0)
        {
            return true;
        }
        return false;

    }
    public void heal()
    {
        if((health/maxHealth)*100 <40)
        {
            health = (int) (maxHealth*0.1)+dexterity;
        }
    }
    public void levelUp()
    {

    }

}
