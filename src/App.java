public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Wizard vs Warlock\n");

        Wizard Raava = new Wizard("Raava");
        Warlock Vaatu = new Warlock("Vaatu");

        Raava.displayName("Raava");
        Vaatu.displayName("Vaatu");
        Raava.meteorFall(Vaatu);
        Vaatu.combustion(Raava);
        Raava.waterHealing();
        Vaatu.fireDagger(Raava);
        Raava.airBlast(Vaatu);
        Vaatu.breathOfFire();
        Raava.meteorFall(Vaatu);
    }
}
