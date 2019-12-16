package com.example.onlinewaiter.data.model.restaurant;

import java.util.List;

public class Restaurant {
    private int id;
    private String name;
    private String slogan;
    private String description;
    private String address;
    private String lattitude;
    private String longtitude;
    private String phoneNumber;

    private String dailyWorkDay;
    private String dailyOpenHour;
    private String dailyCloseHour;

    private String weekendWorkDay;
    private String weekendOpenHour;
    private String weekendCloseHour;

    private int menuId;
    private List<String> imagesUrl;
    private List<Integer> stockIdList;

    public Restaurant() {
    }

    public Restaurant(int id, String name, String slogan, String description, String address, String lattitude, String longtitude, String phoneNumber, String dailyWorkDay, String dailyOpenHour, String dailyCloseHour, String weekendWorkDay, String weekendOpenHour, String weekendCloseHour) {
        this.id = id;
        this.name = name;
        this.slogan = slogan;
        this.description = description;
        this.address = address;
        this.lattitude = lattitude;
        this.longtitude = longtitude;
        this.phoneNumber = phoneNumber;
        this.dailyWorkDay = dailyWorkDay;
        this.dailyOpenHour = dailyOpenHour;
        this.dailyCloseHour = dailyCloseHour;
        this.weekendWorkDay = weekendWorkDay;
        this.weekendOpenHour = weekendOpenHour;
        this.weekendCloseHour = weekendCloseHour;
    }

    public Restaurant(int id, String name, String slogan, String description, String address, String lattitude, String longtitude, String phoneNumber, String dailyWorkDay, String dailyOpenHour, String dailyCloseHour, String weekendWorkDay, String weekendOpenHour, String weekendCloseHour, int menuId, List<String> imagesUrl, List<Integer> stockIdList) {
        this.id = id;
        this.name = name;
        this.slogan = slogan;
        this.description = description;
        this.address = address;
        this.lattitude = lattitude;
        this.longtitude = longtitude;
        this.phoneNumber = phoneNumber;
        this.dailyWorkDay = dailyWorkDay;
        this.dailyOpenHour = dailyOpenHour;
        this.dailyCloseHour = dailyCloseHour;
        this.weekendWorkDay = weekendWorkDay;
        this.weekendOpenHour = weekendOpenHour;
        this.weekendCloseHour = weekendCloseHour;
        this.menuId = menuId;
        this.imagesUrl = imagesUrl;
        this.stockIdList = stockIdList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLattitude() {
        return lattitude;
    }

    public void setLattitude(String lattitude) {
        this.lattitude = lattitude;
    }

    public String getLongtitude() {
        return longtitude;
    }

    public void setLongtitude(String longtitude) {
        this.longtitude = longtitude;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDailyWorkDay() {
        return dailyWorkDay;
    }

    public void setDailyWorkDay(String dailyWorkDay) {
        this.dailyWorkDay = dailyWorkDay;
    }

    public String getDailyOpenHour() {
        return dailyOpenHour;
    }

    public void setDailyOpenHour(String dailyOpenHour) {
        this.dailyOpenHour = dailyOpenHour;
    }

    public String getDailyCloseHour() {
        return dailyCloseHour;
    }

    public void setDailyCloseHour(String dailyCloseHour) {
        this.dailyCloseHour = dailyCloseHour;
    }

    public String getWeekendWorkDay() {
        return weekendWorkDay;
    }

    public void setWeekendWorkDay(String weekendWorkDay) {
        this.weekendWorkDay = weekendWorkDay;
    }

    public String getWeekendOpenHour() {
        return weekendOpenHour;
    }

    public void setWeekendOpenHour(String weekendOpenHour) {
        this.weekendOpenHour = weekendOpenHour;
    }

    public String getWeekendCloseHour() {
        return weekendCloseHour;
    }

    public void setWeekendCloseHour(String weekendCloseHour) {
        this.weekendCloseHour = weekendCloseHour;
    }

    public int getMenuId() {
        return menuId;
    }

    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }

    public List<String> getImagesUrl() {
        return imagesUrl;
    }

    public void setImagesUrl(List<String> imagesUrl) {
        this.imagesUrl = imagesUrl;
    }

    public List<Integer> getStockIdList() {
        return stockIdList;
    }

    public void setStockIdList(List<Integer> stockIdList) {
        this.stockIdList = stockIdList;
    }
}
