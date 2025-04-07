package com.web.web.dto;

public class UserRegestationDto {
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    public UserRegestationDto(String firstName, String email, String lastName, String password) {
        this.firstName = firstName;
        this.email = email;
        this.lastName = lastName;
        this.password = password;
    }

    public UserRegestationDto() {

    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
