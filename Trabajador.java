package com.mycompany.registro_mina;

import java.time.LocalDate;

public class Trabajador {
    //Atributos
    String Name;
    float Document;
    //yyyy-mm-dd "2023-10-27"
    LocalDate date;
    int Entry_Time, Departure_Time;
    int Days_Ordered, DayNotOrdered;

    public Trabajador(String Name, float Document) {
        this.Name = Name;
        this.Document = Document;
    }

    // Metodo en el cual se indique la hora de ingreso, y hora de salida, y si se valide.
    public void Journeys(int Entry_Time, int Departure_Time) {
    int Time_Worked = Departure_Time - Entry_Time;
    int Time_Left = 8 - Time_Worked;
    if(Time_Left < 8 && Time_Left > 1 ){
        System.out.println("you are missing " + Time_Left + " hours.");
    } 
    else{
        System.out.println("End of day");
        this.Entry_Time = Entry_Time;
        this.Departure_Time = Departure_Time;   
        }
    date = LocalDate.now();
        System.out.println(date);
    }
    public void Temporary_License(int days){
        if(days >= 1 && days <=4){
            System.out.println("You've taken " + days + " temporary leave days. ");
        }
        else {
            System.out.println("You can't take more than four days, request a vacation..");
        }
    }
    
    public void Maternity_Leave(int days){
        
        if(days >= 1 && days <=180){
            System.out.println("You've taken " + days + " days of your maternity leave." );
        }
        else {
            System.out.println("You can't take more than one hundred and eighty days.");
        }
    }
    public void Paternity_Leave(int days){
        if(days >= 1 && days <= 15){
            System.out.println("You've taken " + days + "days of your paternity leave.");
        }
        else {
            System.out.println("You can't take more than fifteen days.");
        }  
    }
    public void Inability(int days){
        if( days >= 1 &&  days <= 20){
            System.out.println("You've taken" + days + " Days of disability.");
        }
        else {
            System.out.println("You cannot take more than twenty days of disability.");
        }   
    }
    public void Vacation(int days){
        if(days >= 1 && days <= 15){
            System.out.println("You've taken " + days + " Holidays.");
        }
        else {
            System.out.println("You cannot take more than fifteen days of vacation.");
        }   
    }
    public void Permissions(int hours){
        if(hours >= 1 && hours <= 5){
            System.out.println("You've taken " + hours + " leave hours.");
        }
        else {
            System.out.println("You are advised to take a vacation day or temporary leave.");
        }   
    }
}
        
    
    


