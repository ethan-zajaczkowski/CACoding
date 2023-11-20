package use_case.clear_users;

// TODO Complete me

import data_access.FileUserDataAccessObject;
import entity.CommonUserFactory;
import entity.UserFactory;
import use_case.signup.SignupOutputBoundary;

import java.io.IOException;

public class ClearInteractor implements ClearInputBoundary {
    @Override
    public void execute() {
        FileUserDataAccessObject userDataAccessObject;
        try {
            userDataAccessObject = new FileUserDataAccessObject("./users.csv", new CommonUserFactory());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        userDataAccessObject.clearUsers();
    }
}
