package by.tc.task03.client.presentation.view;

import by.tc.task03.client.entity.user.User;
import by.tc.task03.client.service.StudentClientService;

public class IndexView extends PresentationView {
    public IndexView(StudentClientService studentService, User user) {
        super(studentService, user);
    }

    @Override
    public void show() {
        System.out.println("1: Get\n2: exit");
    }

    @Override
    public PresentationView getInput(String input) {
        return switch (input) {
            case "1" -> new GetSelectView(this.studentService, this.currentUser);
            case "2" -> null;
            default -> throw new IllegalArgumentException();
        };
    }
}