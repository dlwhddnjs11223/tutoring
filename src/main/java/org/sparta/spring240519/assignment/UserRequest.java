package org.sparta.spring240519.assignment;

public class UserRequest {
    private String name;
    private String email;
    private int age;
    
   @Override
   public String toString() {
      return "UserRequest{name=" + name + ", email=" + email + ", age=" + age + "}";

}

    public String getUser() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public void setUser(String user) {
        this.name = user;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
