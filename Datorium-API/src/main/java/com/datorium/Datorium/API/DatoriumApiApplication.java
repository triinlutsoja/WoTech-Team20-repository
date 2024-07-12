// Front end: http://localhost:8080/

package com.datorium.Datorium.API;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@SpringBootApplication
@RestController
@CrossOrigin
public class DatoriumApiApplication {

	ArrayList<Chocolate> chocolateBasket = new ArrayList<>();

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
	@GetMapping("/array")
	// Example: http://localhost:8080/array?string1=Kintija&string2=Lasma&string3=Liisa&string4=Triin
	public String[] array(
			@RequestParam(value = "string1") String string1,
			@RequestParam(value = "string2") String string2,
			@RequestParam(value = "string3") String string3,
			@RequestParam(value = "string4") String string4) {
		return new String[]{string1, string2, string3, string4};
	}

	@GetMapping("/my-chocolate")
	public String addChocolate(
			@RequestParam(value = "name") String name,
			@RequestParam(value = "price") double price) {
		Chocolate chocolate = new Chocolate();
		chocolate.setName(name);
		chocolate.setPrice(price);
		chocolateBasket.add(chocolate);
		return "Your basket contains this delicious chocolate: " + chocolate.getName() + " " + chocolate.getPrice() + " EUR.";
	}

	@GetMapping(value = "/chocolate-Bar", produces = "text/plain")
	public String chocolateBar() {
		if (!chocolateBasket.isEmpty()) {
			StringBuilder bar = new StringBuilder();
			for (Chocolate chocolate : chocolateBasket) {
				bar.append(chocolate.getName()).append(" ").append(chocolate.getPrice()).append(" €").append("\n");
			}
			return bar.toString().trim();
		}
		return "No chocolates in your basket.";
	}
}