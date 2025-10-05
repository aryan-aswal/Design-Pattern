package CreationalDesignPattern.FactoryPattern;

public class Truck implements Transport{
    @Override
    public void deliver() {
        System.out.println("Deliver through roads");
    }
}
