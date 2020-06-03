package com.u_learn.rs.pojo;

public class UserModel {
    private String country;
    private String email;
    private String lastName;
    private String name;
    private String userName;
    private Integer totalGames;
    private Integer wonGames;
    private Integer lostGames;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getTotalGames() {
        return totalGames;
    }

    public void setTotalGames(Integer totalGames) {
        this.totalGames = totalGames;
    }

    public Integer getWonGames() {
        return wonGames;
    }

    public void setWonGames(Integer wonGames) {
        this.wonGames = wonGames;
    }

    public Integer getLostGames() {
        return lostGames;
    }

    public void setLostGames(Integer lostGames) {
        this.lostGames = lostGames;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("UserModel [name=");
        builder.append(name);
        builder.append(", lastName=");
        builder.append(lastName);
        builder.append(", email=");
        builder.append(email);
        builder.append(", userName=");
        builder.append(userName);
        builder.append(", country=");
        builder.append(country);
        builder.append(", totalGames=");
        builder.append(totalGames);
        builder.append(", wonGames=");
        builder.append(wonGames);
        builder.append(", lostGames=");
        builder.append(lostGames);
        builder.append("]");
        return builder.toString();
    }
}
