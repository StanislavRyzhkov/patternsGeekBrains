package company.ryzhkov;

import java.util.List;

public class BookShop implements Observer {

    @Override
    public void update(Publisher publisher, Object arg) {
        System.out.printf("The BookShop has received from Publishing house new Book: %s\n", arg.toString());
    }
}
