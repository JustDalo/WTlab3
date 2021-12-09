package by.tc.task03.client.service;

import by.tc.task03.client.entity.Student;
import by.tc.task03.client.entity.user.User;

import java.util.List;

public interface StudentClientService {

    boolean edit(Student newValue);

    List<Student> getAll();

    Student get(int id);

    boolean create(Student student);

    User register(User user);

    User login(User user);
}
