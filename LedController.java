
import LedsSim.LedStrip;

public class LedController {
    private LedStrip strip;
    private AnimationBase currentAnimation;

    public void setAnimation(AnimationBase animation) //call order 2
    {
        currentAnimation = animation;
        currentAnimation.setStrip(strip);
    }
    public LedController(LedStrip strip) //call order 1
    {
     this.strip = strip;
     
    }
    public void periodic() //call order 3
    {
        currentAnimation.periodic();
    }

    
}
