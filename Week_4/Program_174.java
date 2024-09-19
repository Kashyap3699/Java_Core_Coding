package Week_4;

import java.util.EnumSet;


enum TrafficLights {
    RED(120),
    YELLOW(5),
    GREEN(40);

    private final int duration;

    TrafficLights(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }
}

public class Program_174 {
    public static void main(String[] args) {
        EnumSet<TrafficLights> lights = EnumSet.allOf(TrafficLights.class);
        for (TrafficLights light : lights) {
            System.out.println(light + " lights stays on for " + light.getDuration() + " seconds");
        }
    }
}
