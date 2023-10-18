package use_case.clear_users;

// TODO Complete me

import use_case.signup.SignupOutputData;
import use_case.signup.SignupUserDataAccessInterface;

import java.util.Set;

public class ClearInteractor implements ClearInputBoundary{
    final ClearUserDataAccessInterface userDataAccessObject;
    final ClearOutputBoundary clearPresenter;

    public ClearInteractor(ClearUserDataAccessInterface userDataAccessObject, ClearOutputBoundary clearOutputBoundary) {
        this.userDataAccessObject = userDataAccessObject;
        this.clearPresenter = clearOutputBoundary;
    }

    @Override
    public void execute() {
        Set<String> keys = userDataAccessObject.clearAllUsers();
        String[] usernames = new String[keys.size()];
        int i = 0;
        for (String key: keys) {
            usernames[i] = key;
            i++;
        }

        ClearOutputData clearOutputData = new ClearOutputData(usernames);
        clearPresenter.prepareSuccessView(clearOutputData);
    }
}
