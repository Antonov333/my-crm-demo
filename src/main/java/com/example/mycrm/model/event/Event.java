package com.example.mycrm.model.event;

import com.example.mycrm.model.human.Person;
import com.example.mycrm.model.organization.BusinessEventType;

import java.time.LocalDateTime;
import java.util.List;

/**<h2>public class Event</h2>
 * Anything that happens in company is an event: customer's order, request or claim (it may happen...) are events
 * When you plan something you prepare some future event. So, this entity is to combine kind of log and calendar.
 * More exactly - calendar, cause log is a set of calendar records in past
 */
public class Event {
    private LocalDateTime creationTime;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private List<Person> participants;
    private List<String> attachments;

    private BusinessEventType eventType;

}
