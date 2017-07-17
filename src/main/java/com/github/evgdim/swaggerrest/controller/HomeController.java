package com.github.evgdim.swaggerrest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.evgdim.swaggerrest.DataSource;
import com.github.evgdim.swaggerrest.aspect.Loggable;

@RestController
@RequestMapping("/")
public class HomeController {
	@GetMapping
	@Loggable
	public String index(){
		return "index";
	}
	
	@PatchMapping
	public DataSource bodyAndQueryParams(@RequestBody DataSource ds, @RequestParam("retry") Boolean retry) {
		System.out.println(retry);
		return ds;
	}
}
