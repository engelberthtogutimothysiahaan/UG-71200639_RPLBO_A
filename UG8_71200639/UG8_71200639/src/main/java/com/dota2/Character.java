package com.dota2;

public abstract class Character implements ObjectAttack{
    protected int damage;
    protected String name;
    protected int health;

    public Character (String name, int health, int damage){
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public void ShowCharacterInfo{

    }

    public boolean IsDie{

    }

    void attacked(int damaged){

    }
}