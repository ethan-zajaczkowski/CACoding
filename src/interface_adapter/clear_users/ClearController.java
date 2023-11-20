package interface_adapter.clear_users;

import data_access.InMemoryUserDataAccessObject;
import use_case.clear_users.ClearInputBoundary;
import use_case.clear_users.ClearInteractor;
import use_case.clear_users.ClearOutputData;
import use_case.signup.SignupInputBoundary;
import use_case.signup.SignupInputData;

// TODO Complete me
public class ClearController {
    public void execute() {
        ClearInteractor clearInteractor = new ClearInteractor();
        InMemoryUserDataAccessObject inMemoryUserDataAccessObject = new InMemoryUserDataAccessObject();
        clearInteractor.execute();
    }
}
