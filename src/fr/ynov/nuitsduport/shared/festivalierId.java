package fr.ynov.nuitsduport.shared;
import java.util.Objects;
import java.util.UUID;
    

public record festivalierId (UUID value) {

    public festivalierId {
        Objects.requireNonNull(value);
    }

    public static festivalierId generate() {
        return new festivalierId(UUID.randomUUID());
    }
}

