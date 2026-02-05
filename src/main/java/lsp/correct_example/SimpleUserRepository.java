package lsp.correct_example;

public class SimpleUserRepository implements UserRepository {

    @Override
    public void save(User user) {
        System.out.println("saving user...");
    }

}
