package com.helixlab.orai_munka_2024_11_14.service;

import com.helixlab.orai_munka_2024_11_14.config.JWT;
import com.helixlab.orai_munka_2024_11_14.model.User;
import java.util.ArrayList;
import org.json.JSONObject;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;

public class UserService {

    private User layer = new User();
    private static final String EMAIL_REGEX = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";

    public static boolean isValidEmail(String email) {
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static boolean isValidPassword(String password) {
        if (password.length() < 8) {
            return false;
        }

        boolean hasNumber = false;
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasSpecialChar = false;

        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                hasNumber = true;
            } else if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(c)) {
                hasLowerCase = true;
            } else if ("!@#$%^&*()_+-=[]{}|;':,.<>?/`~".indexOf(c) != -1) {
                hasSpecialChar = true;
            }
        }

        return hasNumber && hasUpperCase && hasLowerCase && hasSpecialChar;
    }

   

    /*public JSONObject login(String email, String password) {
    JSONObject toReturn = new JSONObject();
    String status = "success";
    int statusCode = 200;
    
    if (isValidEmail(email)) {
    User modelResult = layer.login(email, password);
    
    if (modelResult == null) {
    status = "modelException";
    statusCode = 500;
    } else {
    if (modelResult.getId() == null) {
    status = "userNotFound";
    statusCode = 417;
    } else {
    JSONObject result = new JSONObject();
    result.put("id", modelResult.getId());
    result.put("email", modelResult.getEmail());
    result.put("firstName", modelResult.getFirstName());
    result.put("lastName", modelResult.getLastName());
    result.put("isAdmin", modelResult.getIsAdmin());
    result.put("isDeleted", modelResult.getIsDeleted());
    result.put("jwt", JWT.createJWT(modelResult));
    
    toReturn.put("result", result);
    }
    }
    
    } else {
    status = "invalidEmail";
    statusCode = 417;
    }
    
    toReturn.put("status", status);
    toReturn.put("statusCode", statusCode);
    return toReturn;
    }*/
    public JSONObject registerUser(User u) {
        JSONObject toReturn = new JSONObject();
        String status = "success";
        int statusCode = 200;

        //Az email cím benne van-e a db-ben
        //valid-e az email cím
        //valid-e a jelszó
        if (isValidEmail(u.getEmail())) {
            if (isValidPassword(u.getPassword())) {
                boolean userIsExists = User.isUserExists(u.getEmail());
                if (userIsExists == true) {
                    status = "UserAlreadyExists";
                    statusCode = 417;
                } else {
                    boolean registerUser = layer.registerUser(u);
                    if (registerUser == false) {
                        status = "fail";
                        statusCode = 417;
                    }
                }
            } else {
                status = "InvalidPassword";
                statusCode = 417;
            }
        } else {
            status = "InvalidEmail";
            statusCode = 417;
        }

        toReturn.put("status", status);
        toReturn.put("statusCode", statusCode);
        return toReturn;
    }

    public ArrayList<User> getAllUsers() {
    ArrayList<User> userList = new ArrayList<>(); 
    try {
        userList = layer.getAllUsers();     
        
    } catch (Exception e) {
        System.err.println("Error fetching users: " + e.getMessage());
    }

    return userList;
}

    
}
