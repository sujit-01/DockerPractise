package com.example.dockers.com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/save")
public class DockersTestController {
	@GetMapping("/test")
	public String getValue()
	{
		return "hello Dockers";
	}

}
