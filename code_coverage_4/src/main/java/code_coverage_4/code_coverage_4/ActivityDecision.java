package code_coverage_4.code_coverage_4;
 
public class ActivityDecision {

    public String decideActivity(
            boolean walking,
            boolean midnight,
            boolean raining,
            boolean flashlight,
            boolean umbrella) {

        if (walking && midnight && raining && flashlight && umbrella) {
            return "Take umbrella and searchlight";
        }

        if (walking && raining && umbrella) {
            return "Take umbrella";
        }

        if (midnight && flashlight) {
            return "Take searchlight";
        }

        return "Do nothing";
    }
}
