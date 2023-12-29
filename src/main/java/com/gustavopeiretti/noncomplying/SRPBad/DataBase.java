package com.gustavopeiretti.noncomplying.SRPBad;

class DataBase {

    User findUserByUserName(String userName) {
        // searching user
        return new User(userName);
    }

}
