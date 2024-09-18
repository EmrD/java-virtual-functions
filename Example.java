class Base{
    public void Example(){
        System.out.println("This is a base function output and could be empty.");
    }
}

class Main extends Base{

    @Override
    public void Example(){
        System.out.println("This is a edited function output!");
    }

    public static void main(String[] args) {
        Base base = new Main(); //Polymorphism
        base.Example(); //Call the overriden metod from Main class
    }
}
