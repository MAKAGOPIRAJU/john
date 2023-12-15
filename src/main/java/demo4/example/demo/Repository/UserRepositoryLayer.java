package demo4.example.demo.Repository;

import demo4.example.demo.Model.User;

import java.util.HashMap;

public class UserRepositoryLayer {
    public HashMap<String , Integer> voterList = new HashMap<>();

    public HashMap<User , Integer> db = new HashMap<>(); // user name      user voterId


}
