package cn.wlf.entity;


import java.util.Date;

public class User {
    private Integer id;
    private String username;
    private Date birthday;
    private String sex;
    private String homeAddress;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", birthday=" + birthday +
                ", sex='" + sex + '\'' +
                ", homeAddress='" + homeAddress + '\'' +
                '}';
    }

    public User() {
    }

    public User(Integer id, String username, Date birthday, String sex, String homeAddress) {
        this.id = id;
        this.username = username;
        this.birthday = birthday;
        this.sex = sex;
        this.homeAddress = homeAddress;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }
}
