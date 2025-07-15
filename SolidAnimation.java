import java.awt.Color;

import Utils.StopWatch;

public class SolidAnimation extends AnimationBase {
   private Color color;
   public SolidAnimation(Color color)
   {
      this.color = color;
   }

   //I'm putting the apply in the controller and not here even though it's still related to the animation just for ease of use.
   @Override
   public void init() 
   {
      stopWatch = new StopWatch();
      stopWatch.start();
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
       if (stopWatch.get() > 15) // I chose to keep the duration unchangeable between diferent interactions.
       {
           return true;
       }

       return false;
   }

}
