public class MainClass {

    public static void main(String[] args){

        Avtomobil avtomobil = new Avtomobil("Renault", "Clio", "Sina", 174345);

        System.out.println("Marka: " + avtomobil.getMarka() +
                "\nModel: " + avtomobil.getModel() +
                "\nBoja: " + avtomobil.getBoja() +
                "\nPominati km: " + avtomobil.getPominatiKm() +
                "\nPomnozeni km: " + avtomobil.PomnoziKm(3L));
    }
}