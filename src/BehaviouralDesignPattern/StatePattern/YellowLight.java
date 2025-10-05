package BehaviouralDesignPattern.StatePattern;

public class YellowLight implements TrafficLightState {
    @Override
    public void next(TrafficLightContext context) {
        System.out.println("Changing state to red light");
        context.changeState(new RedLight());
    }
}
