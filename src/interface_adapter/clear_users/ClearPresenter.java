package interface_adapter.clear_users;

// TODO Complete me

import interface_adapter.ViewManagerModel;
import interface_adapter.signup.SignupViewModel;
import use_case.clear_users.ClearOutputBoundary;
import use_case.clear_users.ClearOutputData;

public class ClearPresenter implements ClearOutputBoundary {
    private final SignupViewModel signupViewModel;
    private ViewManagerModel viewManagerModel;
    private ClearViewModel clearViewModel;
    public ClearPresenter(ViewManagerModel viewManagerModel, SignupViewModel signupViewModel, ClearViewModel clearViewModel) {
        this.viewManagerModel = viewManagerModel;
        this.signupViewModel = signupViewModel;
        this.clearViewModel = clearViewModel;
    }

    @Override
    public void prepareSuccessView(ClearOutputData clearOutputData) {
        ClearState clearState = clearViewModel.getState();
        clearState.setUsernamesDeleted(clearOutputData.getUsernames());
        this.clearViewModel.setState(clearState);
        clearViewModel.firePropertyChanged();

        viewManagerModel.setActiveView(clearViewModel.getViewName());
        viewManagerModel.firePropertyChanged();
    }
}
