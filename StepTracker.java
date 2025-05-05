public class StepTracker{
    private int days; 
    private int steps; 
    private int threshold; 
    private int activeDays; 

    public StepTracker(int threshold){
        this.threshold = threshold; 
    }

    public int getActiveDays(){
        return activeDays; 
    }

    public double averageSteps(){
        if (days==0){
            return 0; 
        }
        return (double) steps/days; 
    }

    public void addDailySteps(int step){
        days++; 
        steps += step; 
        if (step >= threshold){
            activeDays++; 
        }
    }



}