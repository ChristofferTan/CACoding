package use_case.clear_users;

// TODO Complete me

import use_case.signup.SignupUserDataAccessInterface;

import java.util.Set;

public interface ClearUserDataAccessInterface extends SignupUserDataAccessInterface {
    Set<String> clearAllUsers();
}
