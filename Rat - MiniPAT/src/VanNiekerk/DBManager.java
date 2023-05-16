/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VanNiekerk;

import java.sql.*;
import java.time.LocalDate;
import java.util.Vector;

/**
 *
 * @author cvnie
 */
public class DBManager {
    
    
    
    
    private Connection connection;
    
    public void connectDB()
    {
        try
        {
            connection = DriverManager.getConnection("jdbc:ucanaccess://CounterRat.accdb");
            System.out.println ("Connection Successful");
        }
        catch (SQLException e)
        {
            System.out.println ("Failed to connect " + e);
        }
    }
    
    public void disconnectDB()
    {
        try
        {
            connection.close();
            System.out.println ("Disconnected successfully");
        }
        catch (Exception e)
        {
            System.out.println ("Disconnect Failed " + e);
        }
    }
    
    public void DisplayAllRats()
    {
        connectDB();
        try
        {
            
            Statement s = connection.createStatement();
            String sql = "SELECT * FROM RatMarket";
            
            ResultSet rs = s.executeQuery(sql);
            
            while (rs.next())
            {
                int id = rs.getInt("ID");
                String ratName = rs.getString ("RatName");
                int price = rs.getInt("Price");
                double health = rs.getDouble("Health");
                LocalDate collection = rs.getDate ("Collection").toLocalDate();
                boolean statrat = rs.getBoolean("StatRat");
                
                System.out.println("ID: " + id + " RatName: " + ratName + " Price: " + price + " Health: " + health + " Collection: " + collection + " StatRat: " + statrat  );
            }
           
        }
        catch (SQLException e)
         {
           System.out.println ("Error in display all Rats " + e);
         }
         disconnectDB();
    }
    
    
    public void findRatsWithName (String search)
    {
        connectDB();
        
        try 
        {
            Statement s = connection.createStatement();
            String sql = "SELECT * FROM RatMarket WHERE RatName LIKE '*" + search + "*'";
            
            
            //System.out.println (sql);\
            
            ResultSet rs = s.executeQuery (sql);
            
            while (rs.next())
            {
               String ratName = rs.getString("RatName");
                System.out.println("RatName: " + ratName);
            }
            rs.close();
            s.close();
            
        }
        catch (SQLException e)
        {
             System.out.println("Error in find by name" + e);       
        }
        
        disconnectDB();
    }
    
    public void findRatsAboveAvarage ()
    {
        connectDB();
        
        try 
        {
            Statement s = connection.createStatement();
            String sql = "SELECT * FROM RatMarket WHERE Health > (SELECT AVG(GOLD) FROM RatMarket";
            
            
            //System.out.println (sql);\
            
            ResultSet rs = s.executeQuery (sql);
            
            while (rs.next())
            {
               int ratHealth = rs.getInt("Health");
                System.out.println("RatName: " + ratHealth);
            }
            rs.close();
            s.close();
            
        }
        catch (SQLException e)
        {
             System.out.println("Error in find by name" + e);       
        }
        
        disconnectDB();
    }
    
    
    public Vector getAllRats ()
     {
         
         Vector v = new Vector();
         
         
         connectDB();
        try
        {
            
            Statement s = connection.createStatement();
            String sql = "SELECT * FROM RatMarket";
            
            ResultSet rs = s.executeQuery(sql);
            
            while (rs.next())
            {
                int id = rs.getInt("ID");
                String ratName = rs.getString ("RatName");
                int price = rs.getInt("Price");
                double health = rs.getDouble("Health");
                LocalDate collection = rs.getDate ("Collection").toLocalDate();
                boolean statrat = rs.getBoolean("StatRat");
                
                Rat r = new Rat(id, ratName, price, health, statrat, collection);
                v.add(r);
                
                System.out.println("ID: " + id + " RatName: " + ratName + " Price: " + price + " Health: " + health + " Collection: " + collection + " StatRat: " + statrat  );
            }
           
        }
        catch (SQLException e)
         {
           System.out.println ("Error in display all Rats " + e);
         }
         disconnectDB();
         return v;
    
         
     }
    public Vector getAllOwners ()
     {
         
         Vector v = new Vector();
         
         
         connectDB();
        try
        {
            
            Statement s = connection.createStatement();
            String sql = "SELECT * FROM Owners";
            
            ResultSet rs = s.executeQuery(sql);
            
            while (rs.next())
            {
                int id = rs.getInt("OwnerID");
                String ownername = rs.getString ("OwnerName");
                LocalDate dc = rs.getDate("DateCollected").toLocalDate();
                double ratworth = rs.getDouble("RatWorth");
                int ratsowned = rs.getInt ("RatsOwned");
                boolean individual = rs.getBoolean("Individual");
                String nat = rs.getString ("Nationality");
                
                Owners o = new Owners (id, ownername, dc, ratworth, ratsowned, individual, nat);
                v.add(o);
                //System.out.println(v);
                
               // System.out.println("ID: " + id + " Owner Name: " + ownername + " DateCollected: " + dc + " Ratworth: " + ratworth + " RatsOwned: " + ratsowned + " Individual: " + individual + " Nationality: " + nat);
            }
           
        }
        catch (SQLException e)
         {
           System.out.println ("Error in display all Rats " + e);
         }
         disconnectDB();
         return v;
    
         
     }
    
    public void addNewEntry (Rat r)
    {
            connectDB();
            
            try
            {
                
                Statement s = connection.createStatement();
                String sql = "INSERT INTO RatMarket ( RatName, Price, Health, StatRat, Collection )\n";
                        sql += "VALUES ('" + r.getRatname() + "'," + r.getPrice() + "," + r.getHealth() + "," + r.isStatrat() + ",#" + r.getCollection() + "#)";
                        
                System.out.println(sql);
                int records = s.executeUpdate(sql);
                
                System.out.println (records + " Records have been added");
                
            }
            catch (SQLException e)
            {
                System.out.println ("Problem in addNewEntry" + e);
            }
            
            disconnectDB();
    
    
    }
    
    
    
        public void deleteEntry (Rat r)
    {
            connectDB();
            
            try
            {
                
                Statement s = connection.createStatement();
                String sql = "DELETE\n" + "FROM RatMarket\n" + "WHERE ID =" + " " + r.getId();
                //DELETE FROM RatMarket WHERE ID = 12
                       
                        
                System.out.println(sql);
                int records = s.executeUpdate(sql);
                
                System.out.println (records + " Records have been deleted");
                
            }
            catch (SQLException e)
            {
                System.out.println ("Problem in deleteEntry" + e);
            }
            
            disconnectDB();
    
    
    }
        
    public Rat searchWithID (int r)
    {
        connectDB();
            
            Rat j = new Rat();
            try
            {
                
                Statement s = connection.createStatement();
                String sql = "SELECT *\n" + "FROM RatMarket\n" + "WHERE ID =" + " " + r;
                //SELECT * FROM RatMarket WHERE ID = 12
                       
                        
                System.out.println(sql);
                ResultSet rs = s.executeQuery(sql);
                
                while (rs.next())
            {
                int id = rs.getInt("ID");
                String ratName = rs.getString ("RatName");
                int price = rs.getInt("Price");
                double health = rs.getDouble("Health");
                LocalDate collection = rs.getDate ("Collection").toLocalDate();
                boolean statrat = rs.getBoolean("StatRat");
                
                j = new Rat(id, ratName, price, health, statrat, collection);
            }
                
                
                System.out.println (rs + " Records have been found");
                
                
            }
            catch (SQLException e)
            {
                System.out.println ("Problem in searchWithID" + e);
            }
            
            disconnectDB();
            return j;
    }
    
    
    
    
    public void modifyRAT (Rat r)
    {
        connectDB();
            
            
            try
            {
                
                String rn = r.getRatname();
                int p = r.getPrice();
                double h = r.getHealth();
                boolean sr = r.isStatrat();
                LocalDate c = r.getCollection();
                
                
                
                Statement s = connection.createStatement();
                String sql = "UPDATE RatMarket set RatName = '" + rn + "' , Price =  " + p + " , Health = " + h + " , StatRat = " + sr + " , Collection = " + " #" + c + "# " + "where ID = " + r.getId();
                //UPDATE RatMarket set [Field] = [value] where ID = [value]       
                
                System.out.println(sql);
                s.executeUpdate(sql);
                
                
                
               
                
                
                System.out.println (" Records have been found");
                
                
            }
            catch (SQLException e)
            {
                System.out.println ("Problem in modify rat" + e);
            }
            
            disconnectDB();
    }
    
    
    
    
    
    }

