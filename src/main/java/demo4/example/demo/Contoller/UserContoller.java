package demo4.example.demo.Contoller;

import demo4.example.demo.Model.User;
import demo4.example.demo.Service.UserSercieLayer;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class UserContoller {

    UserSercieLayer userSercieLayer = new UserSercieLayer();


    @PostMapping("/addUser")
    public  String addUser(@RequestParam("name") String name,
                           @RequestParam("age")Integer age){

        String str = userSercieLayer.addUser(name ,age);

        return str;
    }

    @GetMapping("/getData")
    public ArrayList<String> voterList() {

        ArrayList<String > res = userSercieLayer.voterList();

        return  res;
    }

    @GetMapping("/hello")
    public String hi(){
        return "hello world";
    }

    // get all the users who are eligible for the vote age > 20
    @GetMapping("/eligibleVoters")
    public ArrayList<String> allUsers(@RequestParam("age")Integer age) {

        ArrayList<String> res = userSercieLayer.allUsers(age);

        return  res;
    }

    @PostMapping("/add")
    public String add(@RequestBody User user ,
                      @RequestParam("voterId") Integer voterId){

        String  res = userSercieLayer.add(user , voterId);

        return  res;
    }

    @GetMapping("/get")
    public ArrayList<String> getUserDetails(){

        return userSercieLayer.userDetails();
    }


    /*
    1. print all the voterId who are belong to AP  ((Address(villagename-districtname-pincode-Statename)))

    2.get all the male users whose age is greater than 21 and voter id lies between 10 and 20

    3.users who's mobno is start with 9



     */
}
