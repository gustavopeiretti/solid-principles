package com.gustavopeiretti.noncomplying.DIPBad;

class Cash {

    public void pay(Product product) {

        MySqlDatabase persistence = new MySqlDatabase();
        persistence.save(product);

    }

}
