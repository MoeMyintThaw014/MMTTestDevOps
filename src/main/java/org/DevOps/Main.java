package org.DevOps;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    private Connection get_Db_Connection() {
        Connection con =null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","");
            System.out.println("Database is connected");
        }
        catch(ClassNotFoundException ce){
            System.out.println(ce.getMessage());
        }
        catch(SQLException se){
            se.printStackTrace();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return con;
    }
    public static void main(String[] args) {
        Main m=new Main();
        Connection con=m.get_Db_Connection();
        try{
            con.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }
        System.out.println("Hello world!");
        int i=10;
        if(i>0) {
            System.out.println("i>0");
        }

        for (int j=0; j<5; j++){}

        int[] k =new int[10];
        for(int a:k){
        }
        //1.Connection /connection take the longest time to open and close/
        //2.Statement
        //3.Result set index start from 1 not from 0
        //4.Close
        //my sequel is written by c++ so use driver if you want to connect and use other language.
        //go to mysql resposatory of maven mysql and use latest version


    }
    }

