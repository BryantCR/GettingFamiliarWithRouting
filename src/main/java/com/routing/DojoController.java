package com.routing;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DojoController {
		
	@RequestMapping(value="/dojo", method = RequestMethod.GET)
	public String getDojo() {
		return"<h1>The dojo is awesome!</h1>";
	}
	
	@RequestMapping(value="/{dojoName}", method = RequestMethod.GET)
	public String getDojoName(@PathVariable("dojoName") String dojoName) {

			if(dojoName.equals("san-jose")) {
				return "<h2>SJ dojo is the headquarters<h2>";
			}
			else {
				if(dojoName.equals("burbank-dojo")) {
					return "<h2>Burbank Dojo is located in Southern California<h2>";
				}
			}	
		return "<h2>You insert a dojo that doesn't exist<h2>";
	}
}
