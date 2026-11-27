package fr.ynov.nuitsduport.shared;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AggregateRootTest {

    private record SomethingHappened() implements DomainEvent {
    }

    private static class SomeRoot extends AggregateRoot {
        void doSomething() {
            record(new SomethingHappened());
        }
    }

    @Test
    void eventsShowsRecordedEventsWithoutRemovingThem() {
        SomeRoot root = new SomeRoot();
        root.doSomething();

        assertEquals(1, root.events().size());
        assertEquals(1, root.events().size());
    }

    @Test
    void pullEventsReturnsRecordedEventsThenClearsThem() {
        SomeRoot root = new SomeRoot();
        root.doSomething();

        List<DomainEvent> pulled = root.pullEvents();

        assertEquals(List.of(new SomethingHappened()), pulled);
        assertTrue(root.events().isEmpty());
    }
}
