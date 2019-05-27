
package aplikacijaosoba;

import Domain.Osoba;
import guid.JFOsoba;
import java.util.List;
import sistemskeoperacije.PretraziSve;

public class AplikacijaOsoba {

    public static void main(String[] args) {
        //JFOsoba jfosoba= new JFOsoba();
        //jfosoba.setVisible(true);
        List<Osoba> listaOsaba = new PretraziSve().GetAllOsoaba();
    }
    
}
