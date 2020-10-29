package com.devopslab;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@RequestMapping(value = "/hello", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public String helloWorld(String name) {
		try {
			System.out.print("Got hello request from "+name);
			String localip=InetAddress.getLocalHost().getHostAddress();
			return "Hello, "+name+"!, you are visiting "+localip+" V3 version";
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Hello, "+name+"!";
		
	}
	
}
