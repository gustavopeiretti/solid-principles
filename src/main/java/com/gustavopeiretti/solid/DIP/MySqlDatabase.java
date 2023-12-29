package com.gustavopeiretti.solid.DIP;

class MySqlDatabase implements Persistence {

    public void save(Product product) {
        System.out.println("Save product " + product);
        // save into MySqlDatabase...
    }

}
