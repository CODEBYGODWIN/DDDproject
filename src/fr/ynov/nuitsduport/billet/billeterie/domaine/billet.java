package fr.ynov.nuitsduport.billet.billeterie.domaine;

import fr.ynov.nuitsduport.shared.BilletId;
import fr.ynov.nuitsduport.shared.FullName;

public class billet {
    private  BilletId id;
    private FullName name;
    private String lieu;
    private String date;

    public billet(BilletId id, FullName name, String lieu, String date) {
        this.id = id;
        this.name = name;
        this.lieu = lieu;
        this.date = date;
    }

    public BilletId id() {
        return id;
    }

    public FullName name() {
        return name;
    }

    public String lieu() {
        return lieu;
    }

    public String date() {
        return date;
    }
}
