package com.video.videodao.pojo.bean;

public class User {
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    private String id;
    private  String namn;

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", namn='" + namn + '\'' +
                '}';
    }
}
