/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemskeoperacije.mesto;

import Domain.Mesto;
import Domain.Osoba;
import broker.BrokerBP;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andrija
 */
public class MestoService {
    
    public List<Mesto> GetAllMesta() {
        try {
            BrokerBP.connn();
            Statement st = BrokerBP.st;
            List<Mesto> result = new ArrayList<Mesto>();//lista je interfejs
            ResultSet res = st.executeQuery("select * from mesto");
            while (res.next()) {
                Mesto mesto = new Mesto();
                mesto.setMestoId(res.getInt(1));
                mesto.setNaziv(res.getString(2));
                mesto.setPtt(res.getInt(3));
                
                result.add(mesto);
                
            }
            return result;
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;
    }
    
}
