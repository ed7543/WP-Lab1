package mk.finki.ukim.mk.artefactId.lab.model;

public class EventBooking {
    private String eventName;
    private String attendeeName;
    private String attendeeAddress;
    private Long numberOfTickets;

    //constuctor
    public Event(String eventName, String attendeeName, String attendeeAddress, Long numberOfTickets) {
        this.eventName = eventName;
        this.attendeeName = attendeeName;
        this.attendeeAddress = attendeeAddress;
        this.numberOfTickets = numberOfTickets;
    }

    //getter za site
    public String getEventName() {
        return eventName;
    }

    public String getAttendeeName() {
        return  attendeeName;
    }

    public String getAttendeeAddress() {
        return attendeeAddress;
    }

    public Long getNumberOfTickets() {
        return numberOfTickets;
    }

    //setter za site
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public void setAttendeeName(String attendeeName) {
        this.attendeeName = attendeeName;
    }

    public void setAttendeeAddress(String attendeeAddress) {
        this.attendeeAddress = attendeeAddress;
    }

    public void setNumberOfTickets(Long numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }
}