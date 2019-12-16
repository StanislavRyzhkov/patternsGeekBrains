package company.ryzhkov.model;

public abstract class AbstractUserBuilder {
    protected User user;

    public AbstractUserBuilder createUser(String username) {
        user = new User(username);
        return this;
    }

    public abstract AbstractUserBuilder setPassword(String password);
    public abstract AbstractUserBuilder setEmail(String email);
    public abstract AbstractUserBuilder setFirstName(String firstName);
    public abstract AbstractUserBuilder setSecondName(String secondName);
    public abstract AbstractUserBuilder setHasDriverLicence(boolean hasDriverLicence);
    public abstract AbstractUserBuilder setAddress(String address);
    public abstract AbstractUserBuilder setAge(int age);

    public User build() {
        return user;
    }
}
