public class SuperMan implements SuperHero{
    boolean fly;
	float xRayVision;
    boolean arrayOfPower[];

    public SuperMan() {
        this.fly = true;
        this.xRayVision = 100.0f;
        arrayOfPower = new boolean[]{true, true, true, true, true};
        // {false, true, true, true, true}   -1
        // {false, false, true, true, true}   -2
        // {false, false, false, true, true}   -3
        // {false, false, false, false, true}   -4
        // {false, false, false, false, false}   -5

    }

    @Override
    public String SuperPower() {
        return "Super strength and flight";
    }

    @Override
    public Boolean checkIfThereIsPowerLeft() {
        for (int i = 0; i < arrayOfPower.length; i++) {
            if(arrayOfPower[i] == true){
                return true;
            }
        }
        return false;

      /*  for (boolean power: arrayOfPower) {
            if(power == true){
                return true;
            }
        }
        return false;*/
    }

    @Override
    public void Fight() {
        if (checkIfThereIsPowerLeft()) {
        for (int i = 0; i < arrayOfPower.length; i++) {
                if (arrayOfPower[i]) {
                    arrayOfPower[i] = false;
                    System.out.println("SuperMan used a power in a fight!");
                    break;
                }
            }
        }
        else {
            System.out.println("SuperMan has no powers left SuperMan died!");
        }
    }
}
