package bank.management.system;

import java.sql.*;

public class Connn
{
    Connection connection;
    Statement statement;


    public Connn()
    {
        try
        {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/banksystem","root","admin");
            statement = connection.createStatement();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }


    }
}
