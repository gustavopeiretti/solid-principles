package com.gustavopeiretti.noncomplying.SRPBad;

// Single responsibility principle violation
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

    // email responsibility should not be part of Login responsibility
    void sendEmail(User user, String msg) {
        // sendEmail email to user
    }

}
