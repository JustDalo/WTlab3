package by.tc.task03.client.presentation;

import by.tc.task03.client.entity.user.User;
import by.tc.task03.client.entity.user.role.UserRole;
import by.tc.task03.client.presentation.view.GuestView;
import by.tc.task03.client.presentation.view.PresentationView;
import by.tc.task03.client.service.StudentClientService;

import java.util.Scanner;

public class Presentation {
    private PresentationView view;
    private User currentUser = null;
    public Presentation(StudentClientService studentService) {
        this.currentUser = new User();
        this.currentUser.setRole(UserRole.GUEST);
        this.view = new GuestView(studentService, this.currentUser);
    }

    public void show() {
        Scanner scanner = new Scanner(System.in);
        while (this.view != null) {
            this.view.show();
            while (!getInput(scanner.nextLine())) {
                System.out.println("Invalid input");
            }
        }
    }

    private boolean getInput(String input) {
        try {
            this.view = this.view.getInput(input);
            return true;
        } catch (IllegalArgumentException ex) {
            return false;
        }
    }
}
