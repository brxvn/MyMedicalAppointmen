public class Doctor {
    //Atributos
    static int id = 0;  //Auntoincrement
    String name;
    String speciality;

    Doctor(){
        id++;
    }

    //Comportamientos
    public void showName(){
        System.out.println(name);
    }

    public void showID(){
        System.out.println("ID Doctor: " + id);
    }
}
