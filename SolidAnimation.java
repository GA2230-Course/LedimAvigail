import java.awt.Color;

public class SolidAnimation extends AnimationBase {
   protected Color color;
   public SolidAnimation(Color color)
   {
      this.color = color;
   }

   @Override
   public void init() 
   {
      strip.setAll(color);
   }

   @Override
   public void periodic()
   {
      //strip.setRange(color, 0, 1); to avoid with setRange out of bounds error use setAll
      strip.setAll(Color.GREEN); //change back to color general
   }

}
