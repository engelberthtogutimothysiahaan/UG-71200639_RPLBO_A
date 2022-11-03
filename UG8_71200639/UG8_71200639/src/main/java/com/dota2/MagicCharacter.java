package com.dota2;

public abstract class MagicCharacter extends Character{
    protected int mana;

    public Character (String name, int health, int damage, int mana){
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.mana = mana;
    }

    public void ShowCharacterInfo{

    }

    void attacked(int damaged){

    }
}
