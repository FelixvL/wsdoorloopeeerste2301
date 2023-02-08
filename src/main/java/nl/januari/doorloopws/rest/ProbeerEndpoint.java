package nl.januari.doorloopws.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import nl.januari.doorloopws.model.Spreker;
import nl.januari.doorloopws.persistence.SprekerRepository;

@RestController
public class ProbeerEndpoint {
	
	@Autowired
	SprekerRepository sr;
	
	
	@GetMapping("test1")
	public void herewego() {
		System.out.println("Here we go");
		sr.save(new Spreker());
	}
	@GetMapping("test2")
	public String herewego2() {
		System.out.println("Here we go2");
		return "{hier komt iets}";
	}
	@GetMapping("test3/{voornaam}")
	public Spreker herewego3(@PathVariable("voornaam") String voornaam) {
		Spreker spreker = new Spreker();
		spreker.setVoornaam(voornaam);
		spreker.setAchternaam("Jansen");
		sr.save(spreker);
		System.out.println("Here we go2");
		return spreker;
	}
}
