package com.mycompany.registro_mina;

import java.util.Scanner;

public class Registro_Mina {

    public static void main(String[] args) {
        Scanner worker = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = worker.next();
        
        System.out.println("Enter your document");
        float document = worker.nextFloat();
       
        Trabajador worker1 = new Trabajador(name, document);
        
        System.out.println("--MENU--");
        System.out.println("[1] Enter day");
        System.out.println("[2] Login News");
        System.out.print("Select an option: ");
        int option = worker.nextInt();
        
        switch (option) {
            case 1:
                System.out.println("--WELCOME TO YOUR WORKDAY--");
                System.out.println("Check-in time: ");
                int hour1 = worker.nextInt();
                System.out.println("Departure time: ");
                int hour2 = worker.nextInt();
                worker1.Journeys(hour1, hour2);
                break;
            
            case 2:
                System.out.println("--TYPES OF NEWS--");
                System.out.println("[1] Licenses");
                System.out.println("[2] Disabilities");
                System.out.println("[3] Vacation");
                System.out.println("[4] Permissions");
                System.out.print("Select your novelty:");
                int noveltyType = worker.nextInt();
                
                switch (noveltyType) {
                    case 1:{
                        System.out.println("--TYPE OF LICENSES--");
                        System.out.println("[1] Temporary");
                        System.out.println("[2] Maternity");
                        System.out.println("[3] Paternity");
                        System.out.print("Select your license:");
                        int licenseType = worker.nextInt();
                        
                        System.out.println("Enter the days you will take your license: ");
                        int day = worker.nextInt();
                        
                        if(licenseType == 1){
                            worker1.Temporary_License(day);
                        }
                        else if (licenseType == 2){
                            worker1.Maternity_Leave(day);
                        }
                        else if (licenseType == 3){
                            worker1.Paternity_Leave(day);
                               
                        }
                        break;
                    }
                    case 2:{
                        System.out.println("--INABILITY--");
                        System.out.println("Days of disability: ");
                        int disability_days = worker.nextInt();
                        worker1.Inability(disability_days);
                        break;
                    }
                    case 3:
                        System.out.println("--VACATION DAYS--");
                        System.out.println("Holidays: ");
                        int vacation_Days = worker.nextInt();
                        worker1.Vacation(vacation_Days);
                        return;
                    
                    case 4:
                        System.out.println("--PERMISSIONS--");
                        System.out.println("Leave hours: ");
                        int hours_Leave = worker.nextInt();
                        worker1.Permissions(hours_Leave);
                        
                }
                
        }
    }
}
        
    

