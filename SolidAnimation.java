import java.awt.Color;

import Utils.StopWatch;

public class SolidAnimation extends AnimationBase {
   private Color color;
   //Doesn't need a stopwatch
   public SolidAnimation(Color color)
   {
      this.color = color;
   }

   //I'm putting the apply in the controller and not here even though it's still related to the animation just for ease of use.
   @Override
   public void init() 
   {
      strip.setAll(color);
   }

   //strip.setRange(color, 0, 1); to avoid with setRange out of bounds error use setAll
   @Override
   public void periodic()
   {
      
   }
   @Override
   public boolean isOver()
   {
       //logical condition for Solid.
      return 5 > 6; 
   }

}
