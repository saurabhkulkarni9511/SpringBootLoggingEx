package com.app.runner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ConsoleRunner implements CommandLineRunner{

	//Apache Log4j
	private static Logger log=LogManager.getLogger(ConsoleRunner.class);
	
	@Override
	public void run(String... args) throws Exception {
	try {
	log.info("Console Runner Started");
	
	int a=10,b=20,c=-1;
	
	log.info("Data Initialization Done");
	if (a>0 && b>0) {
		c=a+b;
		log.info("If Block Executed");
	}else {
		c=a-b;
		log.info("Else Block Executed");
	}
	log.debug("Final Result is:"+c);
	if(c>0) {
		throw new RuntimeException("Hello Sample");
	}
	} catch (Exception e) {
		log.error("Problem Found:"+e);
	}
	//Stop server
	System.exit(0);
	}
}
