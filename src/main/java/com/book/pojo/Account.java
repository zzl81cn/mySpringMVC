package com.book.pojo;

/**
 * Created by zhouzilong on 2016/7/26.
 */
public class Account {
    private int id;
    private String userName;
    private String passWord;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

//    @Override
//    public String toString(){
//        return "User [userName=" + userName + ", passWord=" + passWord + "]";
//    }
}
