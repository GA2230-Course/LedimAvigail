import java.awt.Color;

import Utils.StopWatch;

public class GA2230Animation extends AnimationBase {
   private Color color;
   //Doesn't need a stopwatch
   public GA2230Animation(Color color)
   {
      this.color = color;
   }

   //I'm putting the apply in the controller and not here even though it's still related to the animation just for ease of use.
   @Override
   public void init() 
   {
      System.out.println("I'm inside init");
      strip.setAll(color);
      //The GA part
      strip.setRange(Color.BLACK, 11, 14);
      strip.setRange(Color.BLACK, 16, 19);

      strip.setLed(Color.BLACK, 21);
      strip.setLed(Color.BLACK, 26);
      strip.setLed(Color.BLACK, 28);

      strip.setLed(Color.BLACK, 31);
      strip.setRange(Color.BLACK, 33, 35);
      strip.setRange(Color.BLACK, 36, 39);

      strip.setLed(Color.BLACK, 41);
      strip.setLed(Color.BLACK, 44);
      strip.setLed(Color.BLACK, 46);
      strip.setLed(Color.BLACK, 48);

      strip.setRange(Color.BLACK, 51, 55);
      strip.setLed(Color.BLACK, 56);
      strip.setLed(Color.BLACK, 58);
      //the 2230 part
      strip.setLed(Color.BLACK, 72);
      strip.setLed(Color.BLACK, 76);

      strip.setLed(Color.BLACK, 81);
      strip.setLed(Color.BLACK, 83);
      strip.setLed(Color.BLACK, 85);
      strip.setLed(Color.BLACK, 87);

      strip.setLed(Color.BLACK, 95);
      strip.setLed(Color.BLACK, 97);

      strip.setLed(Color.BLACK, 102);
      strip.setLed(Color.BLACK, 106);

      strip.setRange(Color.BLACK, 112, 115);
      strip.setRange(Color.BLACK, 116, 119);

      strip.setLed(Color.BLACK, 132);

      strip.setLed(Color.BLACK, 141);
      strip.setLed(Color.BLACK, 143);
      strip.setRange(Color.BLACK, 145, 148);

      strip.setLed(Color.BLACK, 153);
      strip.setLed(Color.BLACK, 155);
      strip.setLed(Color.BLACK, 157);

      strip.setLed(Color.BLACK, 162);
      strip.setLed(Color.BLACK, 165);
      strip.setLed(Color.BLACK, 167);

      strip.setLed(Color.BLACK, 173);
      strip.setLed(Color.BLACK, 175);
      strip.setLed(Color.BLACK, 177);
       strip.setRange(Color.BLACK, 181, 183);
       strip.setRange(Color.BLACK, 185, 188);
   }

   //strip.setRange(color, 0, 1); to avoid with setRange out of bounds error use setAll
   @Override
   public void periodic()
   {
      
   }
   @Override
   public boolean isOver()
   {
    return false;
   }
}

