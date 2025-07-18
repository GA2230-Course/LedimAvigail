import java.util.Random;

public class RandomGroup extends AnimationGroup {
    public RandomGroup(AnimationBase... animation)
    {
        setUnlimitedAnimations(animation);
    }

    @Override
    public void init()
    {   
        Random rand1 = new Random();
        animationQueueIndex = rand1.nextInt(animationQueue.length);
        initCore();
    }
    @Override
    public void periodic()
    {
       if (animationQueue[animationQueueIndex].isOver())
        {
            init();
        }

        animationQueue[animationQueueIndex].periodic();
    }
    @Override
    public boolean isOver()
    {
        return false;
    }
}
