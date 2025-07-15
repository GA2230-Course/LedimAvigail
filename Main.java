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
        ledSim.apply();
        */
        
        LedSim ledStrip = LedSim.getRowsSim(100);
        SolidAnimation solid1 = new SolidAnimation(Color.RED);
        BlinkAnimation blink1 = new BlinkAnimation(Color.RED, Color.BLUE);
        LedController control1 = new LedController(ledStrip);

        TimedAnimation blinkStop = new TimedAnimation(blink1, 2);
        
        //control1.setAnimation(blink1);
        control1.setAnimation(blinkStop);
        
        while (true) {
            control1.periodic();
        }

    }
}
