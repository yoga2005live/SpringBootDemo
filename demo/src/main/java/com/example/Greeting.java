package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

@Controller
public class Greeting {

	@RequestMapping("/greetings")
	public @ResponseBody String greeting() {
		return "Rest Spring";
	}
}
