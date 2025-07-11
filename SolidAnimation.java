import java.awt.Color;

import LedsSim.LedSim;

public class SolidAnimation extends AnimationBase {
   protected Color color;
   public SolidAnimation(Color color)
   {
    LedSim strip = LedSim.getRowsSim(100); //adding the strip for the animation
    this.color = color;
    setStrip(strip);
   }
   public void init() 
   {
    strip.setAll(color);
   }
   public void periodic()
   {
    strip.setRange(Color.CYAN, 5, 13);
   }

}
