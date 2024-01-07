public class IronMan implements SuperHero{
    Boolean  armor;

    public IronMan(Boolean armor) {
        this.armor = armor;
    }

    @Override
    public String SuperPower() {
        return "Powered armor suit";
    }

    @Override
    public Boolean checkIfThereIsPowerLeft() {
        return null;
    }

    @Override
    public void Fight() {

    }
}
