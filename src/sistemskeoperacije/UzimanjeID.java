
package sistemskeoperacije;

/*import broker.BrokerBP;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UzimanjeID {
    public int id;
    public String firstname;
    public String lastname;
    public int age;
    public static UzimanjeID getById(int id)throws SQLException{
        Connection conn = BrokerBP.getConnn();
        PreparedStatement st = conn.prepareStatement("select * from person where id =?");
                st.setInt(1, id);
                ResultSet res = st.executeQuery();
                if(!res.isBeforeFirst()){
                    return null;
                    
                }else{
                    res.next();
                    UzimanjeID u = new UzimanjeID();//kreiraj mi osobu
                    u.firstname = res.getString(1);//prvi int iz tabele prvi iz reda
                    u.lastname = res.getString(2);//dodeli firstname get string iz drugog upitnika u tabeli
                    u.age = res.getInt(3);//dodeli lastname get string iz treceg upitnika u tabeli
                    u.id = res.getInt(4);//
                    return u;//tako smo pokupili podatke iz baze
                }
    }
}
*/