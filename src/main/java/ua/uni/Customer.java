package ua.uni;

public class Customer extends Person {
    private final Email email;

    public Customer(String name, Email email) {
        super(name);
        if (email == null) {
            throw new IllegalArgumentException("Email is required");
        }
        this.email = email;
    }

    public Email getEmail() {
        return email;
    }
}
