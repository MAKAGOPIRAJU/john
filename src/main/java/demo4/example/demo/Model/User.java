package demo4.example.demo.Model;

public class User {

    private String name;
    private Integer age;

    private String mobNo;


   private String Gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getMobNo() {
        return mobNo;
    }

    public void setMobNo(String mobNo) {
        this.mobNo = mobNo;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getAddRess() {
        return addRess;
    }

    public void setAddRess(String addRess) {
        this.addRess = addRess;
    }

    String addRess;

    public User(String name, Integer age, String mobNo, String gender, String addRess) {
        this.name = name;
        this.age = age;
        this.mobNo = mobNo;
        Gender = gender;
        this.addRess = addRess;
    }
}
