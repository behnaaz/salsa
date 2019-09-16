package org.behnaz.model;

import java.util.Date;
import java.util.Set;

import lombok.Builder;
import lombok.Getter;

@Builder
public class AbstractEvent {
	@Getter
	private Set<EventType> types;
	
	@Getter
	private Schedule schedule;

	@Getter
	private Location location;
	
	@Getter
	private int price;
	
	@Getter
	private Date startDay;
	
	@Getter
	private int startTime;
	
	@Getter
	private int endTime;
}
