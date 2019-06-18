
package aplikacijaosoba;

import Domain.Osoba;
import guid.JFramelMain;
import java.util.List;
import sistemskeoperacije.osoba.PretraziSve;

public class AplikacijaOsoba {

    public static void main(String[] args) {
        //JFOsoba jfosoba= new JFramelMain();
        //jfosoba.setVisible(true);
        List<Osoba> listaOsoba = new PretraziSve().GetAllOsoba();
       JFramelMain f = new JFramelMain();
       f.setVisible(true);
    }
    
}
