package org.behnaz.model;

import java.util.Date;
import java.util.Set;

import lombok.Builder;
import lombok.Getter;

@Builder
public class Event {
	@Getter
	private Set<EventType> types;

	@Getter
	private Location location;

	@Getter
	private int price;

	@Getter
	private Date day;

	@Getter
	private int startTime;

	@Getter
	private int endTime;
}
