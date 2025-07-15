import LedsSim.LedStrip;
import Utils.StopWatch;

public abstract class AnimationBase {
    protected LedStrip strip;
    protected StopWatch stopWatch;
    public void setStrip(LedStrip strip)
    {
        this.strip = strip;
    }
   public StopWatch getStopWatch()
   {
    return stopWatch;
   }
    public abstract boolean isOver();
    public abstract void init();
    public abstract void periodic();

    //I'm adding a stopwatch object to animatino base instead of individually
}