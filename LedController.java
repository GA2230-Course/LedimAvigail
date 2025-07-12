
import LedsSim.LedStrip;

public class LedController {
    private LedStrip strip;
    private AnimationBase currentAnimation;

    public LedController(LedStrip strip) //call order 1
    {
     this.strip = strip;
    }
    public void setAnimation(AnimationBase animation) //call order 2 - this initializes the setting animation stage
    {
        currentAnimation = animation;
        currentAnimation.setStrip(strip);
        currentAnimation.init();
    }
    public void periodic() //call order 3
    {
        currentAnimation.periodic();
    }

    
}
