package company.ryzhkov;

public class Person implements Observer {

    @Override
    public void update(Publisher publisher, Object arg) {
        System.out.printf("The Person has received from Publishing house message: %s\n", arg.toString());
    }
}
