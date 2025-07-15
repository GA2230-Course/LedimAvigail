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
        strip.apply();
    }
    public void periodic() //call order 3
    {
        if (currentAnimation.isOver()) {
            return;
        }
        
        currentAnimation.periodic();
        strip.apply();
    }
    //strip.apply(); needs to be in ledcontroller to repeat less code same for isOver()

    //LedSim inherits from LedStrip, it implements it
}
