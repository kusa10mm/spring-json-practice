package com.example.springjsonpractice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class JsonReceiveController {

    @PostMapping("/json")
    public ResponseEntity<JsonTestDTO> testMethod(@RequestBody JsonTestDTO jsonTestDTO) {
        // JsonTestDTO postJsonTestDTO = new JsonTestDTO();
        // postJsonTestDTO.setTestText("成功");
        // return new ResponseEntity<>(postJsonTestDTO, HttpStatus.OK);
        return new ResponseEntity<>(new JsonTestDTO(jsonTestDTO.getTestText()), HttpStatus.OK);
    }

    @GetMapping("/json")
    public ResponseEntity<JsonTestDTO> testGetMethod() {
        return new ResponseEntity<>(new JsonTestDTO(), HttpStatus.OK);
    }

    @GetMapping
    public String testNormalGetMethod() {
        return "Hello World";
    }

}
