/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tas_fa18;

import java.sql.Time;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.LocalTime;
/**
 *
 * @author Chao
 */
public class Shift {
    
    public int ID;
    public String Description;
    public GregorianCalendar Start;
    public GregorianCalendar Stop;
    public int Internal;
    public int Graceperiod;
    public int Dock;
    public GregorianCalendar LunchStart;
    public GregorianCalendar LunchStop;
    public int LunchDeduct; 
    
    public Shift(int ID, String Description, GregorianCalendar Start, GregorianCalendar Stop, int Internal,
            int Graceperiod, int Dock, GregorianCalendar LunchStart, GregorianCalendar LunchStop, 
            int LunchDeduct){
       
        this.ID= ID;
        this.Description = Description;
        this.Start= Start;
        this.Stop= Stop;
        this.Internal= Internal;
        this.Graceperiod= Graceperiod;
        this.Dock= Dock;
        this.LunchStart= LunchStart;
        this.LunchStop= LunchStop;
        this.LunchDeduct= LunchDeduct;
                
}    
    public int getID(){
        return ID;
    }
    
    
    public String getDescription(){
        return Description;
    }
   
    public GregorianCalendar getStart(){
        return Start;
    }
    
    public GregorianCalendar getStop(){
        return Stop;
    }
    public int getInternal(){
        return Internal;
    }
    public int getDock(){
        return Dock;
    }
    public GregorianCalendar getLunchStart(){
        return LunchStart;
    }
    public GregorianCalendar getLunchStop(){
        return LunchStop;
    }
    public int getLunchDeduct(){
        return LunchDeduct;
    }
    private String getHourMin(GregorianCalendar time){
        return time.toString().substring(0,0);
    }
    
    public String toString(){
            return Description + ": " + getHourMin(Start) + " - " + getHourMin(Stop) + " (510 minutes); Lunch: " + getHourMin(LunchStart) + " - " + getHourMin(LunchStop) + " (30 minutes)";
            
    }
    
}



