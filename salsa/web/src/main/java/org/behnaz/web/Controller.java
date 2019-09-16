package org.behnaz.web;

import java.util.ArrayList;
import java.util.List;

import org.behnaz.model.Event;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@RequestMapping("/salsa")
	public List<Event> fetchEvents() {
		List<Event> dances = new ArrayList<>();
		dances.add(Event.builder().price(5).build());
		return dances;
	}

}
