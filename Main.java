import LedsSim.LedSim;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        /* 
        // Initialize the LED simulation with a row layout
        LedSim ledSim = LedSim.getRowsSim(100);

        // Set all LEDs to a specific color
        ledSim.setAll(Color.CYAN);

        // Set a multiple LEDs to different colors
        ledSim.setRange(Color.ORANGE, 20, 40);;
        
        // Set one LED to red
        ledSim.setLed(Color.RED, 5);

        // Apply the changes to the simulation
        ledSi
        m.apply();
        */
        //LedSim ledStrip10x10 = LedSim.getRowsSim(100);
        SolidAnimation solid1 = new SolidAnimation(Color.RED);
        BlinkAnimation blink1 = new BlinkAnimation(Color.RED, Color.BLUE);
        //LedController control1 = new LedController(ledStrip10x10);
        TimedAnimation blink1Stop = new TimedAnimation(blink1, 15);
        
        //control1.setAnimation(blink1);
        BlinkAnimation blink2 = new BlinkAnimation(Color.GREEN, Color.pink);
        //control1.setAnimation(blink1Stop);
        GA2230Animation GAanimation = new GA2230Animation(Color.BLUE);
        TimedAnimation GAanimationStop = new TimedAnimation(GAanimation, 15);
        LedSim ledStrip20x20 = LedSim.getRowsSim(200);
        LedController control2 = new LedController(ledStrip20x20);
        control2.setDefaultAnimation(blink2);
        control2.setAnimation(GAanimationStop);
        
        while (true) {
            control2.periodic();
        }

    }
}
