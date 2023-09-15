
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        int[] lastWeekBirds=new int[7];
        for(int i=0;i<7;i++){
            lastWeekBirds[i]=birdsPerDay[birdsPerDay.length-7+i];
        }
        return lastWeekBirds;
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length-1];
    }

    public void incrementTodaysCount() {
         ++birdsPerDay[birdsPerDay.length-1];
    }

    public boolean hasDayWithoutBirds() {
        for(int noOfBirds:birdsPerDay){
            if(noOfBirds==0){
                return true;
            }            
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        if(numberOfDays>7){
            numberOfDays=7;
        }
        int count=0;
        for(int i=0;i<numberOfDays;i++){
            count+=birdsPerDay[i];
        }
        return count;
    }

    public int getBusyDays() {
       int countBusyDays=0;
        for(int birds:birdsPerDay){
            if(birds>=5){
                countBusyDays++;
            }
        }
        return countBusyDays;
    }
}
