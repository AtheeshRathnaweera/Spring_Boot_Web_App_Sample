package com.atheesh.vehiclestore.models;

public class User {
    private long id;
    private String name;
    private String email;
    private String phone;
    private Boolean enable;
    private String password;
    private String lastUpdated;
    private String dateCreated;

    public User() {
    }

    public User(long id, String name, String email, String phone, Boolean enable, String password, String lastUpdated, String dateCreated) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.enable = enable;
        this.password = password;
        this.lastUpdated = lastUpdated;
        this.dateCreated = dateCreated;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", enable=" + enable +
                ", password='" + password + '\'' +
                ", lastUpdated='" + lastUpdated + '\'' +
                ", dateCreated='" + dateCreated + '\'' +
                '}';
    }
}
