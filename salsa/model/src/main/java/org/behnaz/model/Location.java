package org.behnaz.model;

import lombok.Builder;
import lombok.Getter;

@Builder
public class Location {
	@Getter
	private String country;
	
	@Getter
	private String city;
}
