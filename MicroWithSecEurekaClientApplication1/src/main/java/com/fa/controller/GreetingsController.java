/**
 * 
 */
package com.fa.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author testing
 *
 */
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/greetings")
public class GreetingsController {
	

	@GetMapping
    public String fetchGreeting() {
		
        return "Hello from MicroServiceA";
    }
    @PostMapping
    public String addGreeting(@RequestBody String greeting) {
         // Business logic to save the greeting typically to a DB table
         return "Greeting successfully saved";
    }
}
