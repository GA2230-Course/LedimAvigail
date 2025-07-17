import LedsSim.LedStrip;
public abstract class AnimationBase {
    protected LedStrip strip;
    public void setStrip(LedStrip strip)
    {
        this.strip = strip;
    }
    public abstract boolean isOver();
    public abstract void init();
    public abstract void periodic();

    //I'm adding a stopwatch object to animatino base instead of individually
}