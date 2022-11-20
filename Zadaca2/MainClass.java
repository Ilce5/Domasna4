public class MainClass {

    public static void main(String[] args){

        Restoran restoran = new Restoran();
        restoran.setIme("Ilce");
        restoran.setLokacija("Naumovski");
        restoran.setTelefonskiBroj(7066055);
        restoran.setBrojNaSedista(78);

        System.out.println("Ime: " + restoran.getIme() +
                "\nLokacija: " + restoran.getLokacija() +
                "\nTelefonski broj: 07" + restoran.getTelefonskiBroj() +
                "\nBroj na sedista: " + restoran.getBrojNaSedista());
    }
}