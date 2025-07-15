import Utils.StopWatch;
import java.awt.Color;

public class BlinkAnimation extends AnimationBase {
 private StopWatch stopWatch;
 private Color currentColor;
 private Color color1;
 private Color color2;
 
 private double interval;
 private double lastChangeTime;
   public BlinkAnimation(Color color1, Color color2)
   {
      this.currentColor = color1;
      this.color1 = color1;
      this.color2 = color2;
      interval = 2;
   }

 @Override
 public void init()
  {
    stopWatch = new StopWatch();
    stopWatch.start();
    strip.setAll(color1);
    lastChangeTime = stopWatch.get();
 }
    
 @Override
 public void periodic()
 {
    if (stopWatch.get() > lastChangeTime + interval)
    {
        if (currentColor.equals(color1)) {
            currentColor = color2;
        } else {
            currentColor = color1;
        }
        strip.setAll(currentColor);
        lastChangeTime = stopWatch.get();
    }
 }
}
