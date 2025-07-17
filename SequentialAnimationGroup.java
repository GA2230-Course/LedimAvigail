public class SequentialAnimationGroup extends AnimationBase {
    private  int animationQueueIndex;
    private  AnimationBase[] animationQueue;
    private boolean isDone;

    public SequentialAnimationGroup(AnimationBase... animation)
    {
        animationQueue = animation;
        animationQueueIndex = 0;
        isDone = false;
    }
    public void init()
    {   
        System.out.println("I'm initializing " + animationQueueIndex);
        animationQueue[animationQueueIndex].setStrip(strip);
        animationQueue[animationQueueIndex].init();
    }
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

    public boolean isOver()
    {
        return isDone;
    }

}
