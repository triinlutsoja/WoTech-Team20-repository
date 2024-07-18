// Front end: http://localhost:8080/

package com.datorium.Datorium.API;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@RestController
@CrossOrigin
public class DatoriumApiApplication {

	public static void main(String[] args) {
		System.out.println("asd");
		SpringApplication.run(DatoriumApiApplication.class, args);
	}

	@GetMapping("/ping")
	public String ping() {
		return "pong";
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}

	@GetMapping("/sum")  // example: http://localhost:8080/sum?number1=2&number2=5
	public int sum(@RequestParam(value="number1") int number1, @RequestParam(value="number2") int number2) {
		return number1 + number2;
	}

	@GetMapping("/multiply")
	public int multiply(@RequestParam(value="number1") int number1, @RequestParam(value="number2") int number2) {
		return number1 * number2;
	}

	@GetMapping("/array")  // example: http://localhost:8080/array?string1=Estonia&string2=Latvia
	public String[] array(@RequestParam(value="string1") String string1, @RequestParam(value="string2") String string2) {
		String[] stringArray = {string1, string2};
		return stringArray;
	}
	@GetMapping("/cheese")
	public Map<String, Object> getCheese(
			@RequestParam(value="Atleet") String string1,
			@RequestParam(value="Estonia") String string2,
			@RequestParam(value="1") String string3) {

		Map<String, Object> stringCheese = new HashMap<>();
		stringCheese.put("Atleet", string1);
		stringCheese.put("Estonia", string2);
		stringCheese.put("1", string3);

		return stringCheese;
	}

}