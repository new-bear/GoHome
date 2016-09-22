package com.youtu.entity;

/**
 * Created by jiax on 2016/8/22.
 */
public class Loster {
    private int id;
    private String losterUuid;
    private String losterName;
    private int age;
    private String losterBirthday;
    private int gender;
    private int height;
    private String lostDate;
    private String picture;
    private String lostLocation;
    private String characteristic;
    private int datasource;
    private String sourceId;

    @Override
    public String toString() {
        return "Loster{" +
                "id=" + id +
                ", losterUuid='" + losterUuid + '\'' +
                ", losterName='" + losterName + '\'' +
                ", age=" + age +
                ", losterBirthday='" + losterBirthday + '\'' +
                ", gender=" + gender +
                ", height=" + height +
                ", lostDate='" + lostDate + '\'' +
                ", picture='" + picture + '\'' +
                ", lostLocation='" + lostLocation + '\'' +
                ", characteristic='" + characteristic + '\'' +
                ", datasource=" + datasource +
                ", sourceId='" + sourceId + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLosterUuid() {
        return losterUuid;
    }

    public void setLosterUuid(String losterUuid) {
        this.losterUuid = losterUuid;
    }

    public String getLosterName() {
        return losterName;
    }

    public void setLosterName(String losterName) {
        this.losterName = losterName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLosterBirthday() {
        return losterBirthday;
    }

    public void setLosterBirthday(String losterBirthday) {
        this.losterBirthday = losterBirthday;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getLostDate() {
        return lostDate;
    }

    public void setLostDate(String lostDate) {
        this.lostDate = lostDate;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getLostLocation() {
        return lostLocation;
    }

    public void setLostLocation(String lostLocation) {
        this.lostLocation = lostLocation;
    }

    public String getCharacteristic() {
        return characteristic;
    }

    public void setCharacteristic(String characteristic) {
        this.characteristic = characteristic;
    }

    public int getDatasource() {
        return datasource;
    }

    public void setDatasource(int datasource) {
        this.datasource = datasource;
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }
}
