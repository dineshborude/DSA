public class TrafficLightExample {
    public static void main(String[] args) {
        String lightColor = "green";
        boolean isDaytime = true;
        String action;

        switch (lightColor) {
            default:
                action = "Unknown light color";
                break;
        }

        System.out.println("Action: " + action);
    }
}
