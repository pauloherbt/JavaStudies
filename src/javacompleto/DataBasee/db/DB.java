package javacompleto.DataBasee.db;

import java.sql.*;

public class DB {

    public static Connection getConnection(){ //realzia conexao com banco
        Connection con=null;
        try{
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/coursejdbc",
                    "peaga","peaga");
        }catch (SQLException e){
            throw new DbException(e.getMessage());
        }
        return con;
    }
    public static void closeConnection(Connection con){
        if(con!=null){
           try{
               con.close();
           }catch (SQLException e){
               throw new DbException(e.getMessage());
           }
        }
    }

    public static void closeStatement(Statement st){
        try{
            if(st!=null){
                st.close();
            }
        }catch (SQLException e){
            throw new DbException(e.getMessage());
        }
    }
    public static void closeResultSet(ResultSet rs){
        try{
           if(rs!=null){
               rs.close();
           }
        }catch (SQLException e){
            throw new DbException(e.getMessage());
        }
    }
}
