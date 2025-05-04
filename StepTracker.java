
public class StepTracker
{
    private int required_steps = 0;
    private int active_count = 0;
    private double total_steps = 0;
    private double days = 0;
    public StepTracker(int active)
    {
        required_steps = active;
    }
    public void addDailySteps(int steps)
    {
        total_steps += steps;
        days ++;
        if(steps >= required_steps) active_count++;
    }
    public int activeDays()
    {
        return active_count;
    }
    public double averageSteps()
    {
        if(days == 0) return 0.0;
        return total_steps / days;
    }
}