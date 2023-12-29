package com.gustavopeiretti.noncomplying.SRPBad;

public class Demo {

    public static void main(String[] args) {

        UserLoginService userLoginService = new UserLoginService(new DataBase());
        User user = userLoginService.login("Bart", "Simpson");
        userLoginService.sendEmail(user, "Hi Bart");

    }

}
