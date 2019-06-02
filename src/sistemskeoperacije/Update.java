package sistemskeoperacije;

import broker.BrokerBP;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
 /*
public class Update {
      public int id;
    
    public String firstname;
    public String lastname;
    public byte age;
    public boolean update() throws SQLException{
        Connection conn = BrokerBP.getConnn();//unutar nje kreiramo konekciju
        PreparedStatement st = conn.prepareStatement("update person set firstname=?. lastname=?, age=? where id=?");//upitnik
        st.setString(1, firstname);//setujemo upitnik   
        st.setString(2, lastname);// isto setujemo upitnik
        st.setByte(3, this.age);//isto setujemo upitnik
        st.setInt(4, this.id);//isto setujemo upitnik
        int res = st.executeUpdate();//rezultat smestamo u promenljivu int
        return res >=1;
}
}*/