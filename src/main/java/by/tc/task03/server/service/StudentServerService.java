package by.tc.task03.server.service;

import by.tc.task03.client.entity.Student;
import by.tc.task03.client.entity.user.User;

import java.util.List;

public interface StudentServerService {
    boolean edit(Student newValue);

    List<Student> getAll();

    Student get(int id);

    boolean create(Student student);

    User login(User user);

    User register(User user);
}
