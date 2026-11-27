package fr.ynov.nuitsduport.billet.festivalier.domaine;

import fr.ynov.nuitsduport.shared.FullName;
import fr.ynov.nuitsduport.shared.festivalierId;

public class festivalier {
    private  festivalierId id;
    private FullName name;
    private  String email;

    public festivalier(festivalierId id, FullName name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
        record(new festivalierRegistered(id));
    }

    public festivalierId id() {
        return id;
    }

    public FullName name() {
        return name;
    }

    public String email() {
        return email;
    }

   


    @Override
    public boolean equals(Object other) {
        return other instanceof festivalier festivalier && id.equals(festivalier.id);
    }

    private void record(festivalierRegistered festivalierRegistered) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
