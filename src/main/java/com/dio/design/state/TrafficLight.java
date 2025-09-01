package com.dio.design.state;
public class TrafficLight {
    private State state = new RedState();
    public void setState(State s) { this.state = s; }
    public void next() { state.next(this); }
}
interface State { void next(TrafficLight light); }
class RedState implements State {
    public void next(TrafficLight light) { System.out.println("RED -> GREEN"); light.setState(new GreenState()); }
}
class GreenState implements State {
    public void next(TrafficLight light) { System.out.println("GREEN -> YELLOW"); light.setState(new YellowState()); }
}
class YellowState implements State {
    public void next(TrafficLight light) { System.out.println("YELLOW -> RED"); light.setState(new RedState()); }
}
