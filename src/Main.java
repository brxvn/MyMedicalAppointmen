import model.Doctor;
import model.Patient;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //showMenu();
        Doctor myDoctor = new Doctor("Bryan", "General");
        myDoctor.addAvailableAppointment(new Date(), "4pm");

        Patient patient = new Patient("Bryan Gonzalez", "bryan@mail.com");
        System.out.println(patient);
        System.out.println(myDoctor);

    }
}
