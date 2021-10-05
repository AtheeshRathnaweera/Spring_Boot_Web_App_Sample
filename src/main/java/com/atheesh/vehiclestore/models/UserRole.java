package com.atheesh.vehiclestore.models;

public class UserRole {
    private long id;
    private Role role;
    private User user;

    public UserRole() {
    }

    public UserRole(long id, Role role, User user) {
        this.id = id;
        this.role = role;
        this.user = user;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "UserRole{" +
                "id=" + id +
                ", role=" + role +
                ", user=" + user +
                '}';
    }
}
