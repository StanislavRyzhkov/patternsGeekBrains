package company.ryzhkov.model;

public class User {
    private static long idGenerator = 0L;

    private final long id = ++idGenerator;
    private final String username;
    private String password;
    private String email;
    private String firstName;
    private String secondName;
    private boolean hasDriverLicence;
    private String address;
    private Integer age;

    User(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setHasDriverLicence(boolean hasDriverLicence) {
        this.hasDriverLicence = hasDriverLicence;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public boolean hasDriverLicence() {
        return hasDriverLicence;
    }

    public String getAddress() {
        return address;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("User(%d, %s, %s, %s, %s, %s, %b, %s, %d)\n",
                id, username, password, email, firstName, secondName,
                hasDriverLicence, address, age);
    }
}
