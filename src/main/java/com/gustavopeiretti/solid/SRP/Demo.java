package com.gustavopeiretti.solid.SRP;

public class Demo {

    public static void main(String[] args) {


        UserLoginService userLoginService = new UserLoginService(new DataBase());
        User user = userLoginService.login("Bart", "Simpson");

        MessageSenderService messageSenderService = new MessageSenderService();
        messageSenderService.sendEmail(user, "Hi Bart");

    }

}
