package miniprojJDBC.db;

import java.sql.*;

public class DB {
    private static final String user ="peaga";
    private static final String password ="peaga";
    private static final String url="jdbc:mysql://localhost:3306/coursejdbc";

    public static Connection getConnection(){ //realzia conexao com banco
        Connection con=null;
        try{
            con=DriverManager.getConnection(url,user,password);
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
            if(!st.isClosed()){
                st.close();
            }
        }catch (SQLException e){
            throw new DbException(e.getMessage());
        }
    }
    public static void closeResultSet(ResultSet rs){
        try{
           if(!rs.isClosed()){
               rs.close();
           }
        }catch (SQLException e){
            throw new DbException(e.getMessage());
        }
    }
}
