package com.cydeo.solid.singleResponsibility.example.good;

public class UserController {

    public static void getRequest(){
        //get the request
        // send this request to validation and security part
    }
    public static String createResponse(){
        return "Response"; // for example "User is created"
    }
    public static void sendResponse(){
        //Send usera response
    }
}
