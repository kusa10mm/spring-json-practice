package com.example.springjsonpractice.controller;

import java.io.Serializable;

class JsonTestDTO implements Serializable {

    private String testText;

    public String getTestText() {
        return testText;
    }

    JsonTestDTO(){

    }

    JsonTestDTO(String postText) {
        this.testText = postText;
    }

    // public void setTestText(String testText) {
    //     this.testText = testText;
    // }
}
