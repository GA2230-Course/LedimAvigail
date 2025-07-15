public class TimedAnimation extends AnimationBase{
    private double turnOffAfter;
    private AnimationBase animation;
    public TimedAnimation(AnimationBase animation, double turnOffAfter)
    {
        this.animation = animation;
        this.turnOffAfter = turnOffAfter;
    }
    public boolean isOver()
    {
        if (animation.getStopWatch().get() > turnOffAfter) // I chose to keep the duration unchangeable between diferent interactions.
       {
           return true;
       }

       return false;
    }
    public void init()
    {
        animation.init();
    }
    public void periodic()
    {
        if(isOver())
        {
            animation.periodic();
        }
    }

}
