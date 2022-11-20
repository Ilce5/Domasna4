public class MainClass {

    public static void main(String[] args){

        Covek covek = new Covek();
        covek.setIme("Ilce");
        covek.setPrezime("Naumovski");
        covek.setMaticen(1234567891011L);

        System.out.println("Ime: " + covek.ime +
                "\nPrezime: " + covek.prezime +
                "\nMaticen: " + covek.maticen);
    }
}