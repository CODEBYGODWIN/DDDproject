package fr.ynov.nuitsduport.shared;
import java.util.Objects;
import java.util.UUID;
    

public record BilletId (UUID value) {

    public BilletId {
        Objects.requireNonNull(value);
    }

    public static BilletId generate() {
        return new BilletId(UUID.randomUUID());
    }

}

