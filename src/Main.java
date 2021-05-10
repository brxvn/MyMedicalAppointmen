import model.Doctor;
import model.Patient;
import model.User;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //showMenu();
        Doctor myDoctor = new Doctor("Bryan", "General");
        myDoctor.addAvailableAppointment(new Date(), "4pm");

        User user = new User("Bryan", "bryan@mail.com") {
            @Override
            public void showDataUser() {
                System.out.println("Doctor");
                System.out.println("Hospital: Cruz");
                System.out.println("Departamento: Gediatría");
            }
        };

        user.showDataUser();

        Patient patient = new Patient("Bryan Gonzalez", "bryan@mail.com");
        System.out.println(patient);
        System.out.println(myDoctor);

    }
}
