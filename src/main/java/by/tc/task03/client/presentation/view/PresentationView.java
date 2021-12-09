package by.tc.task03.client.presentation.view;


import by.tc.task03.client.entity.user.User;
import by.tc.task03.client.presentation.view_model.PresentationModel;
import by.tc.task03.client.service.StudentClientService;

public abstract class PresentationView {
    protected PresentationModel model;
    protected StudentClientService studentService;
    protected User currentUser;

    protected PresentationView(StudentClientService studentService, User user) {
        this.studentService = studentService;
        this.currentUser = user;
    }

    public abstract void show();
    public abstract PresentationView getInput(String input);
}
