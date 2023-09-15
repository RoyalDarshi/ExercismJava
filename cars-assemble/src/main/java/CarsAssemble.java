public class CarsAssemble {
    public double getSuccessRate(int speed){
        switch(speed){
            case 1: case 2: case 3: case 4:
                return 1;
            case 5: case 6: case 7: case 8:
                return 0.9;
            case 9:
                return 0.8;
            default:
                return 0.77;
        }
    }

    public double productionRatePerHour(int speed) {
        return 221*speed*getSuccessRate(speed);
    }

    public int workingItemsPerMinute(int speed) {
        return (int)productionRatePerHour(speed)/60;
    }
}
