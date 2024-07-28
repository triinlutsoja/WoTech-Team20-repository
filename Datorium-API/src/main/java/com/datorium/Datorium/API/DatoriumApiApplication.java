// Front end: http://localhost:8080/

package com.datorium.Datorium.API;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import java.util.ArrayList;

@SpringBootApplication
@RestController
@CrossOrigin
public class DatoriumApiApplication {


	ArrayList<Wine> wineList = new ArrayList<>();

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
	@GetMapping("/cheese")
	public Map<String, Object> getCheese(
			@RequestParam(value="Name") String string1,
			@RequestParam(value="Country") String string2,
			@RequestParam(value="Age") String string3) {

		Map<String, Object> stringCheese = new HashMap<>();
		stringCheese.put("Atleet", string1);
		stringCheese.put("Estonia", string2);
		stringCheese.put("1", string3);
  
  	return stringCheese;
	}

	@GetMapping("/array")  // example: http://localhost:8080/array?string1=Estonia&string2=Latvia
	public String[] array(@RequestParam(value="string1") String string1, @RequestParam(value="string2") String string2) {
		return new String[]{string1, string2};
	}

	@GetMapping("/add-wine")
	public String addWine(@RequestParam(value="name") String name, @RequestParam(value="price") double price) {  // method to create new wine
		Wine wine = new Wine();
		wine.setName(name);
		wine.setPrice(price);
		wineList.add(wine);
		return "You have just added a new wine to the assortment: " + wine.getName() + " " + wine.getPrice() + " €.";
	}

	@GetMapping(value = "/wine-assortment", produces = "text/plain")
	public String wineAssortment() {
		if (!wineList.isEmpty()) {
			StringBuilder assortment = new StringBuilder();
			for (Wine w : wineList) {
				assortment.append(w.getName()).append(" ").append(w.getPrice()).append(" €").append("\n");
			}
			return assortment.toString().trim();
		}
		return "No wines found.";
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

