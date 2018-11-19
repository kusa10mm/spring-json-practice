package com.example.springjsonpractice.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

@Configuration
public class WebConfig {

    private MappingJackson2HttpMessageConverter httpMessageConverter;
}

