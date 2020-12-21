package com.example.easy.session;

import com.google.firebase.auth.FirebaseUser;

import javax.xml.transform.sax.SAXResult;

public class UserSessionModel
{

    UserSessionModel(){}
    
    int ID;
    String name ;

    public UserSessionModel(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
