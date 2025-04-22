package com.StudentData.TechWork.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// import jakarta.validation.constraints.Email;
// import jakarta.validation.constraints.NotEmpty;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Userdata {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    // @Email
    // @NotEmpty
    private String email;
    private String number;
    private String gender;
    private String date;
    private String time;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Getter and Setter for number
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    // Getter and Setter for gender
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    // Getter and Setter for date
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    // Getter and Setter for time
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
