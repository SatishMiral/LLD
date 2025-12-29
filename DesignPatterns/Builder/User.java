public class User {
    // required parameters
    private final String firstName;
    private final int age;
    private final String phone;
    private final String email;

    // private constructor to enforce object creation through the builder
    private User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.age = builder.age;
        this.phone = builder.phone;
        this.email = builder.email;
    }

    // UserBuilder static nested class
    public static class UserBuilder {
        private String firstName;
        private int age;
        private String phone;
        private String email;

        // setter methods for builder pattern
        public UserBuilder setName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public UserBuilder email(String email) {
            this.email = email;
            return this;
        }

        // build method to create User object
        public User build() {
            return new User(this);
        }
    }
}