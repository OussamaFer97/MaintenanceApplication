/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package story_p7;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author lex99
 */
public class AssignActivityModel {
    
    private Connection conn;
    private static Statement stm;
    
    public AssignActivityModel() throws SQLException {
        conn = getConnection();
    }
    
    public Connection getConnection() throws SQLException {
        String url = "jdbc:postgresql://ec2-46-137-124-19.eu-west-1.compute.amazonaws.com:5432/d5qf11bpj4ug0e";
        String user = "iekjwlviubdoza";
        String pwd = "4b7ae6fe88334715c35cdabf0aa73c90d9102dd1f89a240cc164971a1c63e4ca";
    
        return DriverManager.getConnection(url, user, pwd);
    }
    
    public String getWeekActivity(int activityID) throws SQLException {
        
        try {
            stm = conn.createStatement();
            ResultSet rst = stm.executeQuery("SELECT week FROM public.appactivity WHERE id = "+activityID+" ");
            rst.next();
            return rst.getString("week");
        } catch(Exception e){
        System.out.println("ERRORE weekActivity");}
        
        return null;     
    }
    
    public int getEstimatedTimeActivity(int activityID) {
        try {
            stm = conn.createStatement();
            ResultSet rst = stm.executeQuery("SELECT estimated_time FROM public.appactivity WHERE id = "+activityID+" ");
            rst.next();
            return rst.getInt("estimated_time");
        } catch(Exception e){
        System.out.println("ERRORE estimatedTimeActivity");}
        
        return -1;  
    }
    
    public String getStringActivity(int activityID) throws SQLException {
        try {
            stm = conn.createStatement();
            ResultSet rst = stm.executeQuery("SELECT * FROM public.appactivity WHERE id = "+activityID+" ");
            rst.next();
            String s = "";
            s += rst.getString("id") + " - ";
            s += rst.getString("area") + " - ";
            s += rst.getString("typology") + " - ";
            s += rst.getString("estimated_time") + "'";
            //System.out.println(s);
            return s;
        } catch(Exception e){
        System.out.println("ERRORRE stringActivity");}
        
        return null;     
    }
    
    public String getNameMaintainer(String cf) {
        try {
            stm = conn.createStatement();
            ResultSet rst = stm.executeQuery("SELECT * FROM public.appuser WHERE cf = '"+cf+"' ");
            rst.next();
            return rst.getString("name") + " " + rst.getString("surname");
        } catch(Exception e){
        System.out.println("ERRORE nameMaintainer");}
        
        return null;  
    }
    
    public int[] getDayAvaibility(String cf, String week, int day) throws SQLException{
        
        int[] avaibilityDay = {60, 60, 60, 60, 60, 60, 60};
        int i = 0;
        
        
        try {
            stm = conn.createStatement();
            String query = "SELECT * FROM (public.appactivity INNER JOIN public.assignment ON public.appactivity.id = public.assignment.activity)"
                + " WHERE day = "+Integer.toString(day)+" AND week = "+week+" ";
            ResultSet rst = stm.executeQuery(query);
            while(rst.next()) {
                int oraInizio = rst.getTime("start_time").toLocalTime().getHour();
                int durata = rst.getInt("estimated_time");
                if(oraInizio > 12) 
                    i = oraInizio - 10;
                else
                    i = oraInizio - 8;
                if (avaibilityDay[i] <= durata) {
                    int d = durata;
                    d -= avaibilityDay[i];
                    avaibilityDay[i+1] -= d;
                }
                avaibilityDay[i] -= durata;
                    
                
            }
            
        } catch(Exception e){
        System.out.println("ERRORE getDayAvaibility");}
        
        return avaibilityDay;
    }
    
    public int insertAssign(String cf, int activityID, int day, int start_time, int end_time) throws SQLException {
        try {
            String query = "INSERT INTO public.assignment(day,start_time,end_time,maintainer,activity)"
                + "VALUES ("+ Integer.toString(day) +","
                + Integer.toString(start_time) + ","
                + Integer.toString(end_time) + ","
                + Integer.toString(start_time) + ","
                + cf + ","
                + Integer.toString(activityID) + ")";
            stm = conn.createStatement();
            return stm.executeUpdate(query);
            
            
        } catch(Exception e){
        System.out.println("ERRORE insertAssign");}
        
        return 0;
    }
    
}