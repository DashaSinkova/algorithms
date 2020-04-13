package headfirst.firstchapter.patternstrategy;

public class MallarDuck extends Duck {
   public MallarDuck() {
       quackBehavior = new Quack();
       flyBehavior = new FlyWithWings();
   }
    @Override
    public void display() {
        System.out.println("I'm real mallard duck");
    }

}
