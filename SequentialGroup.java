public class SequentialGroup extends AnimationGroup{
    private boolean isDone;
    public SequentialGroup(AnimationBase... animation)
    {
        setUnlimitedAnimations(animation);
        animationQueueIndex = 0;
        isDone = false;
    }

    @Override
    public void init()
    {
        initCore();
    }
    @Override
    public void periodic()
    {
       if (animationQueue[animationQueueIndex].isOver())
        {
            if (animationQueueIndex < animationQueue.length - 1)
            {
                animationQueueIndex++;
                init();
            }
            else
            {
                isDone = true;
            }
        }

        animationQueue[animationQueueIndex].periodic();
    }
    @Override
    public boolean isOver()
    {
        return isDone;
    }
}
