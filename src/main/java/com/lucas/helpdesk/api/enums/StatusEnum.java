package com.lucas.helpdesk.api.enums;

import org.springframework.data.mongodb.core.aggregation.ConditionalOperators.Switch;

public enum StatusEnum {
	New,
	Assigned,
	Resolved,
	Approved,
	Disapproved,
	Closed;
	
	public static StatusEnum geStatus(String status) {
		switch (status) {
			case "New": return New;
			case "Assigned": return Assigned;
			case "Resolved": return Resolved;
			case "Approved": return Approved;
			case "Disapproved": return Disapproved;
			case "Closed": return Closed;
			default: return New;
		}
	}
	
}
