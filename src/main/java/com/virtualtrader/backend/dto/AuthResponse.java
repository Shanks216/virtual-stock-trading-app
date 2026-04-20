package com.virtualtrader.backend.dto;

public class AuthResponse {
    private String token;

    // --- No-Lombok Boilerplate ---

    // Constructor to easily create an instance with a token
    public AuthResponse(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}