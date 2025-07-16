import Utils.StopWatch;

public class TimedAnimation extends AnimationBase{
    private double turnOffAfter;
    private AnimationBase animation;
    private StopWatch stopWatch;
    public TimedAnimation(AnimationBase animation, double turnOffAfter)
    {
        this.animation = animation;
        this.turnOffAfter = turnOffAfter;
    }
    @Override
    public boolean isOver()
    {
        if (stopWatch.get() > turnOffAfter || animation.isOver())
       {
         return true;
       }

       return false;
    }
    @Override
    public void init()
    {
        stopWatch = new StopWatch();
        stopWatch.start();
        animation.setStrip(strip); //becauses the ledcontroller only set timedanimation's ledStrip and not for the Animation base inside
        animation.init();
    }
    @Override
    public void periodic()
    {
        animation.periodic();
    }

}
