package com.example.volleydemo2;

import java.util.ArrayList;

import java.util.ArrayList;

public class UserModelList {
    private ArrayList<UserModel> userModelList;

    public UserModelList() {
        this.userModelList = new ArrayList<>();
    }

    public void addUserModel(UserModel userModel) {
        userModelList.add(userModel);
    }

    public void removeUserModel(UserModel userModel) {
        userModelList.remove(userModel);
    }

    public ArrayList<UserModel> getUserModelList() {
        return userModelList;
    }

    public void setUserModelList(ArrayList<UserModel> userModelList) {
        this.userModelList = userModelList;
    }
}



