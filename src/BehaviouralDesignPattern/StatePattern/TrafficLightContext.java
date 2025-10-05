package BehaviouralDesignPattern.StatePattern;

public class TrafficLightContext {
    private TrafficLightState currentState;
    public TrafficLightContext() {
        currentState = new RedLight();
    }
    public void changeState(TrafficLightState state) {
        currentState = state;
    }
    public void next() {
        currentState.next(this);
    }
}
