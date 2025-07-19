import java.util.Random;

public class RandomGroup extends AnimationGroup {
    private Random rand1 = new Random();

    public RandomGroup(AnimationBase... animation)
    {
        setUnlimitedAnimations(animation);
    }
    @Override
    public void indexAdvancing() //keeping it self contained
    {
        animationQueueIndex = rand1.nextInt(animationQueue.length);
        System.out.println("I'm initializing " + animationQueueIndex);

        animationQueue[animationQueueIndex].setStrip(strip);
        animationQueue[animationQueueIndex].init();
        //System.out.println("Index advancing AFTER init of the animation " );
    }
    @Override
    public boolean isOver()
    {
        return false;
    }
    @Override
    public void periodicInternal()
    {
        init();
    }
}
