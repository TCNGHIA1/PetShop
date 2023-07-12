package com.example.petshop.models;

import com.google.gson.annotations.SerializedName;

public class ResetPasswordRequest {
    @SerializedName("token")
    private String token;
    @SerializedName("newPassword")
    private String newPassword;
    @SerializedName("username")
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public ResetPasswordRequest(){}
    public ResetPasswordRequest(String token, String newPassword,String username) {
        this.token = token;
        this.newPassword = newPassword;
        this.username = username;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }
}
