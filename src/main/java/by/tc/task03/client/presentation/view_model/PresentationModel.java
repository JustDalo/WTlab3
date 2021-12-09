package by.tc.task03.client.presentation.view_model;

import by.tc.task03.client.entity.Student;
import by.tc.task03.client.service.StudentClientService;

import java.util.List;

public abstract class PresentationModel {
    protected StudentClientService studentService;
    public PresentationModel(StudentClientService studentService) {
        this.studentService = studentService;
    }

    public abstract List<Student> getItems();
}
