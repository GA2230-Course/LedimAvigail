import Utils.StopWatch;
import java.awt.Color;

public class BlinkAnimation extends AnimationBase {
 private StopWatch stopWatch;
 private Color color1;
 private Color color2;

   public BlinkAnimation(Color color1, Color color2)
   {
      this.color1 = color1;
      this.color2 = color2;
   }

 @Override
 public void init()
  {
    stopWatch = new StopWatch();
    stopWatch.start();
    strip.setAll(color1);
 }
    
 @Override
 public void periodic()
 {
    if ((int)(stopWatch.get()) % 2 == 0)
    {
        strip.setAll(color2);
    }
    else
    {
        strip.setAll(color1);
    }
}
}
