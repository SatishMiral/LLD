public class Client {
    public static void main(String[] args) {
        User user = new User.UserBuilder()
                .setName("John Doe")
                .age(30)
                .phone("123-456-7890")
                .email("john@gmail.com")
                .build();

        System.out.println("User created: " + user);
    }
}
