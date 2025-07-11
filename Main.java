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
        SolidAnimation animation = new SolidAnimation(Color.RED);
        animation.setStrip(ledStrip); //we receive the ledStrip once and distribute it later
        while (true) { 
            animation.periodic();
        }
        

    }
}
