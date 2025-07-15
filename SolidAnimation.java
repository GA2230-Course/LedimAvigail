import java.awt.Color;

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
      strip.setAll(color);
   }

   //strip.setRange(color, 0, 1); to avoid with setRange out of bounds error use setAll
   @Override
   public void periodic()
   {
      
   }

}
