package BehaviouralDesignPattern.StatePattern;

public class RedLight implements TrafficLightState {
    @Override
    public void next(TrafficLightContext context) {
        System.out.println("Changing state to green light");
        context.changeState(new GreenLight());
    }
}
