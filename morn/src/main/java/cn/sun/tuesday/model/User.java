package cn.sun.tuesday.model;

import java.io.Serializable;

public class User implements Serializable {

    private String userName;
    private Integer age;
    private String interest;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", age=" + age +
                ", interest='" + interest + '\'' +
                '}';
    }
}
