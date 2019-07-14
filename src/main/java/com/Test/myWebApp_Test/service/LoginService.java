package com.Test.myWebApp_Test.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

    public boolean validateUser(String userid, String password) {
        // in28minutes, dummy
        return userid.equalsIgnoreCase("Subha")
                && password.equalsIgnoreCase("Subha");
    }

}