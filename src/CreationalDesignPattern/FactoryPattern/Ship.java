package CreationalDesignPattern.FactoryPattern;

public class Ship implements Transport {
    @Override
    public void deliver() {
        System.out.println("Deliver through ocean");
    }
}
