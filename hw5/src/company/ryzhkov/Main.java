package company.ryzhkov;

public class Main {

    public static void main(String[] args) {
        PublishingHouse publishingHouse = new PublishingHouse();
        Observer person = new Person();
        Observer bookShop = new BookShop();
        publishingHouse.attach(person);
        publishingHouse.attach(bookShop);
        publishingHouse.notify(publishingHouse.getLastBook());
    }
}
