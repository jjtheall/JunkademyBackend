package com.csc492;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="users")
public class UserClass {

    //Instance variables
	@Id
    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "admin")
    private boolean admin;

    @Column(name = "basicChal1")
    private boolean basicChal1;

    @Column(name = "basicChal2")
    private boolean basicChal2;

    @Column(name = "basicChal3")
    private boolean basicChal3;

    @Column(name = "stringChal1")
    private boolean stringChal1;

    @Column(name = "stringChal2")
    private boolean stringChal2;

    @Column(name = "stringChal3")
    private boolean stringChal3;

    @Column(name = "arrayChal1")
    private boolean arrayChal1;

    @Column(name = "arrayChal2")
    private boolean arrayChal2;

    @Column(name = "arrayChal3")
    private boolean arrayChal3;

    @Column(name = "boolChal1")
    private boolean boolChal1;

    @Column(name = "boolChal2")
    private boolean boolChal2;

    @Column(name = "boolChal3")
    private boolean boolChal3;


    public UserClass() {
        super();
    }

    //Constructor if needed
    public UserClass(String username, String password, boolean admin, boolean basicChal1, boolean basicChal2, boolean basicChal3,
    boolean stringChal1, boolean stringChal2, boolean stringChal3, boolean arrayChal1, boolean arrayChal2, boolean arrayChal3,
    boolean boolChal1, boolean boolChal2, boolean boolChal3) {

        this.username = username;
        this.password = password;
        this.admin = admin;
        this.basicChal1 = basicChal1;
        this.basicChal2 = basicChal2;
        this.basicChal3 = basicChal3;
        this.stringChal1 = stringChal1;
        this.stringChal2 = stringChal2;
        this.stringChal3 = stringChal3;
        this.arrayChal1 = arrayChal1;
        this.arrayChal2 = arrayChal2;
        this.arrayChal3 = arrayChal3;
        this.boolChal1 = boolChal1;
        this.boolChal2 = boolChal2;
        this.boolChal3 = boolChal3;
    }

    //Getters
    public String getUserName() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public boolean getAdmin() {
        return admin;
    }

    public boolean getBasicChal1() {
        return basicChal1;
    }

    public boolean getBasicChal2() {
        return basicChal2;
    }

    public boolean getBasicChal3() {
        return basicChal3;
    }

    public boolean getStringChal1() {
        return stringChal1;
    }

    public boolean getStringChal2() {
        return stringChal2;
    }

    public boolean getStringChal3() {
        return stringChal3;
    }

    public boolean getArrayChal1() {
        return arrayChal1;
    }

    public boolean getArrayChal2() {
        return arrayChal2;
    }

    public boolean getArrayChal3() {
        return arrayChal3;
    }

    public boolean getBoolChal1() {
        return boolChal1;
    }

    public boolean getBoolChal2() {
        return boolChal2;
    }

    public boolean getBoolChal3() {
        return boolChal3;
    }

    //Setters
    public void setUserName(String userName) {
        username = userName;
    }

    public void setPassword(String userPassword) {
        password = userPassword;
    }

    public void setAdmin(boolean adminStatus) {
        admin = adminStatus;
    }

    public void setBasicChal1(boolean basicChalStatus1) {
        basicChalStatus1 = basicChal1;
    }

    public void setBasicChal2(boolean basicChalStatus2) {
        basicChalStatus2 = basicChal2;
    }

    public void setBasicChal3(boolean basicChalStatus3) {
        basicChalStatus3 = basicChal3;
    }

    public void setStringChal1(boolean stringChalStatus1) {
        stringChalStatus1 = stringChal1;
    }

    public void setStringChal2(boolean stringChalStatus2) {
        stringChalStatus2 = stringChal2;
    }

    public void setStringChal3(boolean stringChalStatus3) {
        stringChalStatus3 = stringChal3;
    }

    public void setArrayChal1(boolean arrayChalStatus1) {
        arrayChalStatus1 = arrayChal1;
    }

    public void setArrayChal2(boolean arrayChalStatus2) {
        arrayChalStatus2 = arrayChal2;
    }

    public void setArrayChal3(boolean arrayChalStatus3) {
        arrayChalStatus3 = arrayChal3;
    }

    public void setBoolChal1(boolean boolChalStatus1) {
        boolChalStatus1 = boolChal1;
    }

    public void setBoolChal2(boolean boolChalStatus2) {
        boolChalStatus2 = boolChal2;
    }

    public void setBoolChal3(boolean boolChalStatus3) {
        boolChalStatus3 = boolChal3;
    }

}
