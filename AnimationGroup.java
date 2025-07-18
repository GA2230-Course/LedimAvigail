import LedsSim.LedStrip;
//NOTE TO SELF
//In TimedAnimation we used a wrapper like how I tried, but it maybe doesn't fit here because in either case we have functionality in the base layer that the other won't have
//so it's wasted thus it's better to create a new class that the two classes that once would've been base and wrapper, are now on the same level and both are inhereting from the same place
// with only the shared Traits, that's why it's better
//a wrapper is basically if one has more functionalitlly than the other, like it's a circle containing another circle, an abstract class is where you have a venn-diagram
//wrapper - variables wise, is when there are exactly the same + 1 to the wrapper properties, it doesn't matter if there be exactly the same amount of methods
//just that the methods of the wrapper, contain the methods of the base within them, and maybe they add

public abstract class AnimationGroup extends AnimationBase{
    protected LedStrip strip;
    protected  int animationQueueIndex;
    protected  AnimationBase[] animationQueue;

    public void setUnlimitedAnimations(AnimationBase[] animationQueue)
    {
        this.animationQueue = animationQueue;
    }
    public abstract boolean isOver();
    public abstract void init();
    public abstract void periodic();
    public void initCore()
    {
        System.out.println("I'm initializing " + animationQueueIndex);
        animationQueue[animationQueueIndex].setStrip(strip);
        animationQueue[animationQueueIndex].init();
    }

}
