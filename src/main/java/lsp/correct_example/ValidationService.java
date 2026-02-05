package lsp.correct_example;

public class ValidationService {

    private final UserRepository userRepository;

    public ValidationService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    void register(User user) {
        if  (user.getEmail() == null) {
            throw new IllegalArgumentException("Email required");
        }
        userRepository.save(user);
    }
}
