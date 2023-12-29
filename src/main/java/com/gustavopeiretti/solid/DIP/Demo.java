package com.gustavopeiretti.solid.DIP;

public class Demo {

    public static void main(String[] args) {
        // the Cash class is no longer coupled to the specific implementation
        // of the MySqlDatabase class
        Persistence persistence = new MySqlDatabase();
        Cash cash = new Cash(persistence);
        cash.pay(new Product());
    }

}
