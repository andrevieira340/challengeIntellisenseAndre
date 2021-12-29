package com.starwarsandre.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controller {
	/*
	 * api visually represented by System.out.println and json localhost	
	 */
	
	//using for consume api starwars
	private final RestTemplate restTemplate;
	//inject resttemplate
	@Autowired 
	public Controller(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
		// TODO Auto-generated constructor stub
	}

	@GetMapping("/people/{id}")
	public Object getApi(@PathVariable Integer id) {
		String url = "https://www.swapi.tech/api/people/"+id;
		System.out.println("People: "+id);
		Object forObject = restTemplate.getForObject(url, Object.class);
		return forObject;
	}
	
	@GetMapping("people")
	public Object getApiListAllPeople() {
		String url = "https://www.swapi.tech/api/people";
		Object forObject = restTemplate.getForObject(url, Object.class);
		return forObject;
	}
	@GetMapping("/planets/{id}")
	public Object getApiPlanetForId(@PathVariable Integer id) {
		String url = "https://www.swapi.tech/api/planets/"+id;
		System.out.println("Planet: "+id);
		Object forObject = restTemplate.getForObject(url, Object.class);
		return forObject;
	}
	@GetMapping("planets")
	public Object getApiListAllPlanets() {
		String url = "https://www.swapi.tech/api/planets";
		Object forObject = restTemplate.getForObject(url, Object.class);
		return forObject;
	}
	@GetMapping("/starships/{id}")
	public Object getApiStarshipForId(@PathVariable Integer id) {
		String url = "https://www.swapi.tech/api/starships/"+id;
		Object forObject = restTemplate.getForObject(url, Object.class);
		if (id == 10) {
			System.out.println("Pilots - Millenium Falcom");
			System.out.println("https://swapi.tech/api/people/13/ + name = chewbacca "
					+ 	       "https://swapi.tech/api/people/14/ + name = Han Solo "
					+ 		   "https://swapi.tech/api/people/25/ + name = Lando Calrissian "
					+ 		   "https://swapi.tech/api/people/31/ + name = Nien Nunb ");
		}
		return forObject;
	}
	@GetMapping("/starships")
	public Object getApiListAllStarships() {
		String url = "https://www.swapi.tech/api/starships";
		Object forObject = restTemplate.getForObject(url, Object.class);
		return forObject;
	}
	
}
