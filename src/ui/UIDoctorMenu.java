package ui;

import model.Doctor;

import java.util.ArrayList;
import java.util.Scanner;

public class UIDoctorMenu {

    public static ArrayList<Doctor> doctorAvailableAppointments = new ArrayList<>();
    public static void showDoctorMenu(){
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Doctor");
            System.out.println("Welcome " + UImenu.doctorLogged.getName());
            System.out.println("1. Add Available Appointment");
            System.out.println("2. My Schedule Appointments");
            System.out.println("0. Logout");

            Scanner sc = new Scanner(System.in);
            response = Integer.parseInt(sc.nextLine());

            switch(response){
                case 1:
                    showAddAvailableAppointmentsMenu();
                    break;
                case 2:
                    break;
                case 0:
                    UImenu.showMenu();
                    break;
            }

        }while(response != 0);
    }

    private static void showAddAvailableAppointmentsMenu(){
        int response = 0;
        do {
            System.out.println();
            System.out.println("::Add Available Appointments");
            System.out.println("::Select Month");
            for (int i = 0; i < 3; i++) {
                int j = i + 1;
                System.out.println(j + ". " + UImenu.MONTHS[i]);
            }
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.parseInt(sc.nextLine());

            if (response > 0 && response < 4) {
                int monthSelected = response;
                System.out.println(monthSelected + " . " + UImenu.MONTHS[monthSelected - 1]);
                System.out.println("Insert the date available: [dd/mm/yyyy");
                String date = sc.nextLine();

                System.out.println("Your date is: " + date);
                System.out.println("1. Correct");
                System.out.println("2. Incorrect, change date!");

                int responseDate = Integer.parseInt(sc.nextLine());
                if(responseDate == 2) continue;

                int responseTime = 0;
                String time = "";
                do {
                    System.out.println("Insert the time available for date: " + date + "[16:00]");
                    time = sc.nextLine();
                    System.out.println("Your time is: " + time);
                    System.out.println("1. Correct");
                    System.out.println("2. Incorrect, change time!");
                    responseTime = Integer.parseInt(sc.nextLine());


                }while(responseTime == 2);

                UImenu.doctorLogged.addAvailableAppointment(date,time);
                checkDoctorAvailableAppointment(UImenu.doctorLogged);


            }else if (response == 0){
                showDoctorMenu();
            }

        }while(response != 0);
    }

    private static void checkDoctorAvailableAppointment(Doctor doctor){
        if(doctor.getAvailableAppointments().size() > 0 && !doctorAvailableAppointments.contains(doctor)){
            doctorAvailableAppointments.add(doctor);
        }
    }
}
