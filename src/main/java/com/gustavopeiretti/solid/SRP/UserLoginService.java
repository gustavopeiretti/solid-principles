package com.gustavopeiretti.solid.SRP;

class UserLoginService {

    private final DataBase db;

    UserLoginService(DataBase db) {
        this.db = db;
    }

    User login(String userName, String password) {
        User user = db.findUserByUserName(userName);
        if (user == null) {
            // do something
            throw new IllegalArgumentException("Not found");
        }
        // login process..
        return user;
    }

}
