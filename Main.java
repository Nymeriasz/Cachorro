public class Main {
    public static void main(String[] args) {
        Cachorro c = new Cachorro();
        c.emitirSom();
        c.reagir(true);
        c.reagir("Comida");
        c.reagir(5, 18);
        c.reagir(10, 5.3f);


    }
}
