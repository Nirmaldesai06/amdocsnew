package com.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class spr {
@RequestMapping("/get")
public String show() {
	return "Welcome to nirmal";
}
}
