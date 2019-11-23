package com.example.myapplication.models;

import java.util.ArrayList;
import java.util.List;

public class Users {
    public String username;
    public String password;


    public static  Boolean passwordidValid (String User,
                                           String password) {

        for (Users i:getUsers() ) {
            if ( i.username.equals(User) ) {
                if (i.password.equals(password) ) {
                    return true;
                }

            }

        }
        return false;
    }



    public static List<Users> getUsers() {
        List<Users> list = new ArrayList<Users>();

        Users o = new Users();
        o.username = "bichito";
        o.password = "123456";
        list.add(o);


        Users t = new Users();
        t.username = "Yesenia";
        t.password = "123456789";
        list.add(t);

        return list;
    }
}
