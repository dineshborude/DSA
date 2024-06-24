public class TrafficLightExample {
    public static void main(String[] args) {
        String lightColor = "Yellow";
        boolean isDaytime = false;
        String action;

        switch (lightColor) {
            case "Red":
                action = isDaytime ? "Stop and wait for the light to turn green" : "Stop and turn on your headlights";
                break;
            case "Yellow":
                action = isDaytime ? "Prepare to stop" : "Slow down and prepare to stop";
                break;
            case "Green":
                action = isDaytime ? "Go ahead" : "Proceed with caution";
                break;
            default:
                action = "Unknown light color";
                break;
        }

        System.out.println("Action: " + action);
    }
}
