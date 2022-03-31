package com.example.configclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AttributeController {

	@Autowired
	Attributes attributes;
	
	@GetMapping("/val")
	public ResponseEntity<String> getAttributes(){
		String val = "name: "+attributes.getName()+"\n"+
				"age: "+attributes.getAge()+"\n"+
				"place: "+attributes.getPlace()+"\n";
		return ResponseEntity.ok(val);
	}
}
