package company.ryzhkov.model;

public class GenericUserBuilder extends AbstractUserBuilder {

    public static GenericUserBuilder builder() {
        return new GenericUserBuilder();
    }

    @Override
    public AbstractUserBuilder setPassword(String password) {
        user.setPassword(password);
        return this;
    }

    @Override
    public AbstractUserBuilder setEmail(String email) {
        user.setEmail(email);
        return this;
    }

    @Override
    public AbstractUserBuilder setFirstName(String firstName) {
        user.setFirstName(firstName);
        return this;
    }

    @Override
    public AbstractUserBuilder setSecondName(String secondName) {
        user.setSecondName(secondName);
        return this;
    }

    @Override
    public AbstractUserBuilder setHasDriverLicence(boolean hasDriverLicence) {
        user.setHasDriverLicence(hasDriverLicence);
        return this;
    }

    @Override
    public AbstractUserBuilder setAddress(String address) {
        user.setAddress(address);
        return this;
    }

    @Override
    public AbstractUserBuilder setAge(int age) {
        user.setAge(age);
        return this;
    }
}
