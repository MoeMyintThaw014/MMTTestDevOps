package org.DevOps;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Database_read {
    private Connection con;
    public Database_read(Connection con) {
        this.con = con;
    }
    protected void read(){
        try {
            PreparedStatement ps = con.prepareStatement("SELECT * FROM offices WHERE country =?");
            ps.setString(1,"USA");
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                System.out.print(rs.getInt(1));
                System.out.print("|");
                System.out.print(rs.getString("city"));
                System.out.println();
            }
            rs.close();
            ps.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
