

public class Main {

    interface QuackBehavior {
        String quack();
    }
    class Quack implements QuackBehavior
    {

        @Override
        public String quack() {
            return "Quack";
        }
    }
    class Squack implements QuackBehavior
    {

        @Override
        public String quack() {
            return "Squack";
        }
    }
    class MuteQuack implements QuackBehavior
    {

        @Override
        public String quack() {
            return "MuteQuack";
        }
    }


    interface FlyBehavior
    {
        String fly();
    }
    class FlyWithWings implements FlyBehavior
    {

        @Override
        public String fly() {
            return "Can Fly";
        }
    }
    class FlyNoWay implements FlyBehavior
    {

        @Override
        public String fly() {
            return "Can Not fly";
        }
    }



    class Duck
    {
        FlyBehavior flyBehavior;
        QuackBehavior quackBehavior;
        void performQuack()
        {
            quackBehavior.quack();
        }
        void performFly()
        {
            flyBehavior.fly();
        }
    }



    public static void main(String[] args) {


    }
}
