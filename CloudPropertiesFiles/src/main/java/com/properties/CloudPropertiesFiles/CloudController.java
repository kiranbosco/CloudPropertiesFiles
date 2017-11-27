package com.properties.CloudPropertiesFiles;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CloudController {

	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public String wishToAll(){
		return "Good to All";
	}

	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public int intValue() {
		int a=100;
		int b=200;
		int c=a+b;
		return c;
	}
	@RequestMapping(value="/integer",method=RequestMethod.GET)
	public String StringValue() {
		return "Kiran";
}
}
