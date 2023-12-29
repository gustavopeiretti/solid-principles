package com.gustavopeiretti.solid.DIP;

class Cash {

    Persistence persistence;

    public Cash(Persistence persistence) {
        this.persistence = persistence;
    }

    public void pay(Product product) {

        persistence.save(product);

    }

}
