public class SequentialGroup extends AnimationGroup{
    private boolean isDone;
    public SequentialGroup(AnimationBase... animation)
    {
        setUnlimitedAnimations(animation);
        animationQueueIndex = 0;
        isDone = false;
    }

    @Override
    public void indexAdvancing()
    {
        System.out.println("I'm initializing " + animationQueueIndex);
        animationQueue[animationQueueIndex].setStrip(strip);
        animationQueue[animationQueueIndex].init();
    }
    @Override
    public boolean isOver()
    {
        return isDone;
    }
    @Override
    public void periodicInternal()
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
}
