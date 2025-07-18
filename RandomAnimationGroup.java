import java.util.Random;

public class RandomAnimationGroup extends AnimationBase {
    private  int animationQueueIndex;
    private  AnimationBase[] animationQueue;

    public RandomAnimationGroup(AnimationBase... animation)
    {
        animationQueue = animation;
    }
    public void init()
    {   
        Random rand1 = new Random();
        animationQueueIndex = rand1.nextInt(animationQueue.length);
        System.out.println("I'm initializing " + animationQueueIndex);
        animationQueue[animationQueueIndex].setStrip(strip);
        animationQueue[animationQueueIndex].init();
    }
    public void periodic()
    {
       if (animationQueue[animationQueueIndex].isOver())
        {
            init();
        }

        animationQueue[animationQueueIndex].periodic();
    }

    public boolean isOver()
    {
        return false;
    }

}
