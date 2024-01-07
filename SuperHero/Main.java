public class Main {
    public static void main(String[] args) {

        SuperHero clark_Kent = new SuperMan();
        clark_Kent.Fight();
        clark_Kent.Fight();
        clark_Kent.Fight();
        clark_Kent.Fight();
        clark_Kent.Fight();
        System.out.println("is there power left? " + clark_Kent.checkIfThereIsPowerLeft());

        clark_Kent.Fight();
    }
}