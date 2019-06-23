
package aplikacijaosoba;

import Domain.Mesto;
import Domain.Osoba;
import guid.JFramelMain;
import java.util.List;
import sistemskeoperacije.mesto.MestoService;
import sistemskeoperacije.osoba.PretraziSve;

public class AplikacijaOsoba {

    public static void main(String[] args) {
        //JFOsoba jfosoba= new JFramelMain();
        //jfosoba.setVisible(true);
        List<Osoba> listaOsoba = new PretraziSve().GetAllOsoba();
        List<Mesto> listaMesto = new MestoService().GetAllMesta();
        JFramelMain f = new JFramelMain();
        f.setVisible(true);
      
       
    }
    
}
