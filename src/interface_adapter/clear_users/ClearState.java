package interface_adapter.clear_users;

// TODO Complete me

import data_access.FileUserDataAccessObject;
import entity.CommonUserFactory;
import entity.User;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ClearState {

    public String currentUsers = "Cleared Users: ";
    public String execute() {
        FileUserDataAccessObject userDataAccessObject;
        try {
            userDataAccessObject = new FileUserDataAccessObject("./users.csv", new CommonUserFactory());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        ArrayList<String> currentUsers = userDataAccessObject.getUsers();
        for (String username : currentUsers) {
            this.currentUsers += username + ", ";
        }
        if (this.currentUsers.endsWith(", ")) {
            this.currentUsers = this.currentUsers.substring(0, this.currentUsers.length() - 2);
        }
        return this.currentUsers;
    }
}
