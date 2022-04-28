package com.fidenz.test.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User implements SuperEntity {

    @Id
    private String id;
    private String index;
    private String age;
    private String eyeColor;
    private String name;
    private String gender;
    private String company;
    private String email;
    private String phone;
    private String address__number;
    private String address__street;
    private String address__city;
    private String address__state;
    private String address__zipcode;
    private String about;
    private String registered;
    private String latitude;
    private String longitude;
    private String tags__001;
    private String tags__002;
    private String tags__003;
    private String tags__004;
    private String tags__005;
    private String tags__006;
    private String tags__007;

    public User() {
    }

    public User(String id, String index, String age, String eyeColor, String name, String gender, String company, String email, String phone, String address__number, String address__street, String address__city, String address__state, String address__zipcode, String about, String registered, String latitude, String longitude, String tags__001, String tags__002, String tags__003, String tags__004, String tags__005, String tags__006, String tags__007) {
        this.id = id;
        this.index = index;
        this.age = age;
        this.eyeColor = eyeColor;
        this.name = name;
        this.gender = gender;
        this.company = company;
        this.email = email;
        this.phone = phone;
        this.address__number = address__number;
        this.address__street = address__street;
        this.address__city = address__city;
        this.address__state = address__state;
        this.address__zipcode = address__zipcode;
        this.about = about;
        this.registered = registered;
        this.latitude = latitude;
        this.longitude = longitude;
        this.tags__001 = tags__001;
        this.tags__002 = tags__002;
        this.tags__003 = tags__003;
        this.tags__004 = tags__004;
        this.tags__005 = tags__005;
        this.tags__006 = tags__006;
        this.tags__007 = tags__007;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
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

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
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

    public String getAddress__number() {
        return address__number;
    }

    public void setAddress__number(String address__number) {
        this.address__number = address__number;
    }

    public String getAddress__street() {
        return address__street;
    }

    public void setAddress__street(String address__street) {
        this.address__street = address__street;
    }

    public String getAddress__city() {
        return address__city;
    }

    public void setAddress__city(String address__city) {
        this.address__city = address__city;
    }

    public String getAddress__state() {
        return address__state;
    }

    public void setAddress__state(String address__state) {
        this.address__state = address__state;
    }

    public String getAddress__zipcode() {
        return address__zipcode;
    }

    public void setAddress__zipcode(String address__zipcode) {
        this.address__zipcode = address__zipcode;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getRegistered() {
        return registered;
    }

    public void setRegistered(String registered) {
        this.registered = registered;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getTags__001() {
        return tags__001;
    }

    public void setTags__001(String tags__001) {
        this.tags__001 = tags__001;
    }

    public String getTags__002() {
        return tags__002;
    }

    public void setTags__002(String tags__002) {
        this.tags__002 = tags__002;
    }

    public String getTags__003() {
        return tags__003;
    }

    public void setTags__003(String tags__003) {
        this.tags__003 = tags__003;
    }

    public String getTags__004() {
        return tags__004;
    }

    public void setTags__004(String tags__004) {
        this.tags__004 = tags__004;
    }

    public String getTags__005() {
        return tags__005;
    }

    public void setTags__005(String tags__005) {
        this.tags__005 = tags__005;
    }

    public String getTags__006() {
        return tags__006;
    }

    public void setTags__006(String tags__006) {
        this.tags__006 = tags__006;
    }

    public String getTags__007() {
        return tags__007;
    }

    public void setTags__007(String tags__007) {
        this.tags__007 = tags__007;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", index='" + index + '\'' +
                ", age='" + age + '\'' +
                ", eyeColor='" + eyeColor + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", company='" + company + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address__number='" + address__number + '\'' +
                ", address__street='" + address__street + '\'' +
                ", address__city='" + address__city + '\'' +
                ", address__state='" + address__state + '\'' +
                ", address__zipcode='" + address__zipcode + '\'' +
                ", about='" + about + '\'' +
                ", registered='" + registered + '\'' +
                ", latitude='" + latitude + '\'' +
                ", longitude='" + longitude + '\'' +
                ", tags__001='" + tags__001 + '\'' +
                ", tags__002='" + tags__002 + '\'' +
                ", tags__003='" + tags__003 + '\'' +
                ", tags__004='" + tags__004 + '\'' +
                ", tags__005='" + tags__005 + '\'' +
                ", tags__006='" + tags__006 + '\'' +
                ", tags__007='" + tags__007 + '\'' +
                '}';
    }
}
