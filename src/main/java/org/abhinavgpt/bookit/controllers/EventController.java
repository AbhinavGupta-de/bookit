package org.abhinavgpt.bookit.controllers;

import org.abhinavgpt.bookit.modals.Event;
import org.abhinavgpt.bookit.services.event.EventService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class EventController {
    private EventService eventService;

    // add
    @PostMapping
    public ResponseEntity<Event> addEvent(@RequestBody Event event) {
        Event newEvent = EventService.addEvent(event);
        return ResponseEntity.ok(newEvent);

    }

    //update

    @PutMapping("/{}")
    public ResponseEntity<Event> updateEvent(@PathVariable long Event_Id ,@RequestBody Event Updatedevent) {
        Event event = EventService.updateEvent(Updatedevent);
        return ResponseEntity.ok(event);
    }

    //getAll

    @GetMapping()
    public ResponseEntity<List<Event>> getAllEvents() {
        List<Event>  event = eventService.getAllEvents();
        return ResponseEntity.ok(event);
    }

    // getById

    @GetMapping("/{}")
    public ResponseEntity<Event> getEvent(@PathVariable long Event_Id) {
        Event event = EventService.getEventById(Event_Id);
        return ResponseEntity.ok(event);
    }

    // deleteById

    @DeleteMapping("/{}")
    public ResponseEntity<Event> deleteEvent(@PathVariable long Event_Id) {
        EventService.deleteEventById(Event_Id);
        return ResponseEntity.ok(event);
    }

    // deleteAll
    @DeleteMapping()
    public ResponseEntity<Event> deleteAllEvents() {
        return null;
    }

}
