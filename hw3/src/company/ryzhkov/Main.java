package company.ryzhkov;

import company.ryzhkov.model.GenericUserBuilder;
import company.ryzhkov.model.User;

public class Main {

    public static void main(String[] args) {
        User user1 = GenericUserBuilder
                .builder()
                .createUser("Bob")
                .build();

        User user2 = GenericUserBuilder
                .builder()
                .createUser("Alice")
                .setAge(30)
                .setFirstName("Alicia")
                .setSecondName("Smith")
                .setHasDriverLicence(true)
                .setAge(30)
                .build();

        System.out.println(user1);
        System.out.println(user2);
    }
}
