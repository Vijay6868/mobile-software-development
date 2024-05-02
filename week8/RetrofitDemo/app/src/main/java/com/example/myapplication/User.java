package com.example.myapplication;
    /*{
            "id": 1,
            "email": "george.bluth@reqres.in",
            "first_name": "George",
            "last_name": "Bluth",
            "avatar": "https://reqres.in/img/faces/1-image.jpg"
            }*/
public class User {
    int id;
    String email, fname, lname, avatar;

        public User(int id, String email, String fname, String lname, String avatar) {
            this.id = id;
            this.email = email;
            this.fname = fname;
            this.lname = lname;
            this.avatar = avatar;
        }

        public int getId() {
            return id;
        }

        public String getEmail() {
            return email;
        }

        public String getFname() {
            return fname;
        }

        public String getLname() {
            return lname;
        }

        public String getAvatar() {
            return avatar;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public void setFname(String fname) {
            this.fname = fname;
        }

        public void setLname(String lname) {
            this.lname = lname;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }

        @Override
        public String toString() {
            return "User{" +
                    "id=" + id +
                    ", email='" + email + '\'' +
                    ", fname='" + fname + '\'' +
                    ", lname='" + lname + '\'' +
                    ", avatar='" + avatar + '\'' +
                    '}';
        }
    }

