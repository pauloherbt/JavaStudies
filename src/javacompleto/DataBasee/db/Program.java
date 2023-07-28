package javacompleto.DataBasee.db;

import java.sql.*;
import java.text.SimpleDateFormat;

public class Program {
    public static void main(String[] args) {
        Connection connection = DB.getConnection();
        Statement state; //to select from
        PreparedStatement pstate=null;//to insert into
        ResultSet rs;
        SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
        int rAffected=0;
        try{
           //insert
            /* pstate=connection.prepareStatement("INSERT INTO seller (Name, Email, BirthDate, BaseSalary, DepartmentId) VALUES (?,?,?,?,?)");
            pstate.setString(1,"Peaga");
            pstate.setString(2,"Peaga@mail.com");
            pstate.setDate(3,new Date(sdf.parse("05/04/2004").getTime()));
            pstate.setDouble(4,1500.0);
            pstate.setInt(5,2);
            pstate.executeUpdate();
            return generated keys para pegar dados dos elementos q foram adicionados
            */

            //select
            //rs=state.executeQuery("select seller.DepartmentId,seller.Name,department.Name from seller,department where DepartmentId=department.Id && DepartmentId>2");
           /* while(rs.next()){
                System.out.println(rs.getInt("DepartmentId")+" "+rs.getString("Name")+" "+rs.getString("department.Name"));
            }*/

            //update
            /*pstate= connection.prepareStatement("update seller set BaseSalary =BaseSalary * (?)  where DepartmentId=?",Statement.RETURN_GENERATED_KEYS);
            pstate.setDouble(1,1.10);
            pstate.setInt(2,2);
            rAffected=pstate.executeUpdate();*/

            //delete
            /*pstate=connection.prepareStatement("delete from department where Id=2");
            pstate.executeUpdate();*/

            //TRANSACAO
            connection.setAutoCommit(false);
            pstate= connection.prepareStatement("UPDATE seller set BaseSalary = 1000 where DepartmentId=1");
            rAffected+=pstate.executeUpdate();

            if(pstate!=null) //teste da exception
                //throw new SQLException("fake natyy");

            pstate= connection.prepareStatement("UPDATE seller set BaseSalary = 2000 where DepartmentId=2");
            rAffected+=pstate.executeUpdate();
            connection.commit();

        }catch (SQLException e){
            //throw new DbIntegrityException("cannot delete a parent"); delete
            try{
                connection.rollback();
                throw new DbException("Erro na transacao: rollback aplicado");
            }
            catch (SQLException e1){
                System.out.println("Erro no rollback"+ e1.getMessage());
            }
        }
        finally {
            DB.closeStatement(pstate);
            DB.closeConnection(connection);
        }
        System.out.println("Rows Affected: "+rAffected);
    }
}
