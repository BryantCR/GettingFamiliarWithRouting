package com.routing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping( "/coding")
public class CodingController {

	public static void main(String[] args) {
		SpringApplication.run(CodingController.class, args);
	}

    @RequestMapping(value = "/", method = RequestMethod.GET)
    
    // 3. Method that maps to the request route above
    public String page1() { // 3
            return "<h2>Hello Coding Dojo!<h2>";
    }
    @RequestMapping(value = "/python", method = RequestMethod.GET)
    
    // 3. Method that maps to the request route above
    public String page2() { // 3
            return "Python/Django was awesome!";
    }
    
    @RequestMapping(value = "/java", method = RequestMethod.GET)
    
    // 3. Method that maps to the request route above
    public String page3() { // 3
            return "Java/Spring is better!";
    }
}
