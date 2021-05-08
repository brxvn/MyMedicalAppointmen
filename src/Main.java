import static ui.UImenu.showMenu;

public class Main {
    public static void main(String[] args) {
        //showMenu();
        Doctor myDoctor = new Doctor("Bryan", "General");
        //System.out.println("\n" + myDoctor.name);
        //System.out.println(myDoctor.speciality);

        Patient patient = new Patient("Bryan Gonzalez", "bryan@mail.com");
        patient.setHeight(1.75);
        patient.setWeight(75);
        patient.setPhoneNumber("1234567890");

        System.out.println();
        System.out.println(patient.getName());
        System.out.println(patient.getHeight());
        System.out.println(patient.getWeight());
        System.out.println(patient.getPhoneNumber());
    }
}
