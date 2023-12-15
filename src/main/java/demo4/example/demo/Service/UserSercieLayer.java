package demo4.example.demo.Service;

import demo4.example.demo.Model.User;
import demo4.example.demo.Repository.UserRepositoryLayer;

import java.util.ArrayList;
import java.util.HashMap;

public class UserSercieLayer {
    UserRepositoryLayer userRepoisitotyLayer = new UserRepositoryLayer();

    public String addUser(String name , Integer age){

        HashMap<String  , Integer> database = userRepoisitotyLayer.voterList;

        database.put(name , age);

        return name + " add succefully to the DB";
    }

    public ArrayList<String> voterList() {

        ArrayList<String> ans = new ArrayList<>();

        HashMap<String  , Integer> database = userRepoisitotyLayer.voterList;

        for(String user:database.keySet()) {

            String str = user + " his age is " + database.get(user);

            ans.add(str);
        }

        return  ans;
    }

    public ArrayList<String> allUsers(Integer age){

        ArrayList<String > ans = new ArrayList<>();

        HashMap<String  , Integer> database = userRepoisitotyLayer.voterList;

        for(String user : database.keySet()) {

            if(database.get(user) > age) {
                String  str = user + " is eligible for vote";

                ans.add(str);
            }
        }

        return  ans;
    }

    public String add(User user , Integer voterId){

        HashMap<User ,Integer> db = userRepoisitotyLayer.db;

        db.put(user , voterId);

        return user.getName() + " added succesfully to db!";

    }

    // username + " voter id is + voterId;


    public ArrayList<String> userDetails() {

        ArrayList<String > ans = new ArrayList<>();

        HashMap<User , Integer> db = userRepoisitotyLayer.db;

        for(User user : db.keySet()){

            String str = user.getName() + " his voter id is " + db.get(user);

            ans.add(str);
        }

        return  ans;

    }

//    public String eligibility(String userName){
//
//        HashMap<User , Integer> db = userRepoisitotyLayer.db;
//
//        int reqAge = -1;
//
//        for(User user : db.keySet()){
//
//            if(user.getName().equals(userName)) {
//
//            }
//        }
//    }
}
