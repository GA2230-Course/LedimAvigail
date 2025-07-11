import java.awt.Color;

import LedsSim.LedSim;

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

        SolidAnimation CYAN4LIFE = new SolidAnimation(Color.RED);
        CYAN4LIFE.init();
        for (int i=0; i < 100; i++)
        {
            CYAN4LIFE.periodic();
        }
        

    }
}
