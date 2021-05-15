package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss(700,50,"Защита");
        System.out.println("Boss" + " " + boss.getHealth()
                + " " + boss.getDamage()+ " " + boss.getDefence());



    }
}
