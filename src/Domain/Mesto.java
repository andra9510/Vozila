/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

/**
 *
 * @author Andrija
 */
public class Mesto {
    private int MestoId;
    private String Naziv;
    private int Ptt;
    
    public Mesto() {
    }

    public Mesto(int AdresaId, String Naziv, int Ptt) {
        this.MestoId = AdresaId;
        this.Naziv = Naziv;
        this.Ptt = Ptt;
    }
    
    

    public int getMestoId() {
        return MestoId;
    }

    public void setMestoId(int MestoId) {
        this.MestoId = MestoId;
    }

    public String getNaziv() {
        return Naziv;
    }

    public void setNaziv(String Naziv) {
        this.Naziv = Naziv;
    }

    public int getPtt() {
        return Ptt;
    }

    public void setPtt(int Ptt) {
        this.Ptt = Ptt;
    }
    
}
