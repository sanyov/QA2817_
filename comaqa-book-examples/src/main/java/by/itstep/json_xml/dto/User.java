package by.itstep.json_xml.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class User {

    private int userId;
    private String firstName;
    private String lastName;
    private String phone;
    private Address address;

    public User() {
    }

    public User(int userId, String firstName, String lastName, String phone, Address address) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
