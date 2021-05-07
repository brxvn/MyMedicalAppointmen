import static ui.UImenu.*;

public class Main {
    public static void main(String[] args) {

        Doctor myDoctor = new Doctor();
        myDoctor.name = "Horacio Quiroga";
        myDoctor.showName();
        myDoctor.showID();

        Doctor myDoctor2 = new Doctor();
        myDoctor2.name = "Bryan Gonzalez";
        myDoctor2.showName();
        myDoctor2.showID();

        showMenu();
    }
}
