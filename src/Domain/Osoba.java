
package Domain;

import java.util.Date;

public class Osoba {
   String prezime;
   int datumRodjenja;
   int id;
   String name;
   Mesto mesto;

    public Osoba() {
    }
   

    public String getName() {
        return name;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDatumRodjenja() {
        return datumRodjenja;
    }

    public void setDatumRodjenja(int datumRodjenja) {
        this.datumRodjenja = datumRodjenja;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Mesto getMesto() {
        return mesto;
    }

    public void setMesto(Mesto mesto) {
        this.mesto = mesto;
    }
    
    
   
}
