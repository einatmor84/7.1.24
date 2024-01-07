public class SpiderMan implements SuperHero{
    int Cobwebs;

    public SpiderMan(int cobwebs) {
        Cobwebs = cobwebs;
    }

    @Override
    public String SuperPower() {
        return "Spider sense and web shooting ability";
    }

    @Override
    public Boolean checkIfThereIsPowerLeft() {
        return null;
    }

    @Override
    public void Fight() {

    }
}
