package lsp.incorrect_example;

public class ValidatingUserRepository extends UserRepository {

    @Override
    public void save(User user) {
        if (user.getEmail() == null) {
            throw new IllegalArgumentException("Email required");
        }
    }
}
