package fr.ynov.nuitsduport.staff.shared;

import java.util.ArrayList;
import java.util.List;

import fr.ynov.nuitsduport.billet.shared.DomainEvent;

public abstract class AggregateRoot {

    private final List<DomainEvent> events = new ArrayList<>();

    protected void record(DomainEvent event) {
        events.add(event);
    }

    public List<DomainEvent> events() {
        return List.copyOf(events);
    }

    public List<DomainEvent> pullEvents() {
        List<DomainEvent> pulled = List.copyOf(events);
        events.clear();
        return pulled;
    }
}
