package com.gustavopeiretti.solid.SRP;

class DataBase {

    User findUserByUserName(String userName) {
        // searching user
        return new User(userName);
    }

}
