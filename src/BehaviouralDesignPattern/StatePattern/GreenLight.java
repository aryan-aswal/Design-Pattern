package BehaviouralDesignPattern.StatePattern;

public class GreenLight implements TrafficLightState {
    @Override
    public void next(TrafficLightContext context) {
        System.out.println("Changing state to yellow light");
        context.changeState(new YellowLight());
    }
}
