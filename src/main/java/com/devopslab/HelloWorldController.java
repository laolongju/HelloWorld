package com.devopslab;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorldController {
	 private static final Log log = LogFactory.getLog(HelloWorldController.class);
	@RequestMapping(value = "/api/hello")
	public String helloWorld(String name) {
		try {
			log.info("Got hello request from "+name);
			log.debug("Debug get hello request from "+name);
			String localip=InetAddress.getLocalHost().getHostAddress();
			return "Hello, "+name+"!, you are visiting "+localip+" V10 version";
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Hello, "+name+"!";
		
	}
	@RequestMapping(value = "/")
	public String defaultEcho() {
		try {
			log.info("Got hello request from default");
			String localip=InetAddress.getLocalHost().getHostAddress();
			return "Hello, default!, you are visiting "+localip+" V10 version";
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Hello,default !";
		
	}
	@RequestMapping(value = "/echo")
	public String echo(String name) {
		try {
			log.info("Got hello request from "+name);
			String localip=InetAddress.getLocalHost().getHostAddress();
			return "echo, "+name+"!, you are visiting "+localip+" V10 version";
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Hello, "+name+"!";
		
	}
}
