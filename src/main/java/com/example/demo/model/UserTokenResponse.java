package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class UserTokenResponse {
    @JsonProperty(value = "Server")
    private List<String> server;

    @JsonProperty(value = "X-Request-Id")
    private List<String> requestId;

    @JsonProperty(value = "X-Content-Type-Options")
    private List<String> typeOptions;

    @JsonProperty(value = "Connection")
    private List<String> connection;

    @JsonProperty(value = "X-Download-Options")
    private List<String> downloadOptions;

    @JsonProperty(value = "Pragma")
    private List<String> pragma;

    @JsonProperty(value = "X-Subject-Token")
    private List<String> subjectToken;

    @JsonProperty(value = "Date")
    private List<String> date;


}
