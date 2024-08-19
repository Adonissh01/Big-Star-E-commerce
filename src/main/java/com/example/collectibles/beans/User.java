package com.example.collectibles.beans;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

@Entity
public class User {
    @Id
    private Long id;
    @NotEmpty(message="Email cannot be empty")
    @Email(message = "Should be a well-formed email address")
    private String email;
    @NotEmpty(message="Name cannot be empty")
    @Size(min=1, max=20,message="Size must be between 1 and 20")
    private String name;
    @NotEmpty(message="Message cannot be empty")
    private String gender;
    private String message;
    private boolean newsLetter;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    //using not null instead of not empty beacause date is reference type
    @NotNull(message="Date of birth cannot be empty")
    @Past(message="Date of birth cannot be a future date")
    private Date dateOfBirth;
    @NotEmpty(message="selection cannot be empty")
    private String favoriteCollecton;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public boolean isNewsLetter() {
        return newsLetter;
    }
    public void setNewsLetter(boolean newsLetter) {
        this.newsLetter = newsLetter;
    }
    public Date getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public String getFavoriteCollecton() {
        return favoriteCollecton;
    }
    public void setFavoriteCollecton(String favoriteCollecton) {
        this.favoriteCollecton = favoriteCollecton;
    }
    


}
