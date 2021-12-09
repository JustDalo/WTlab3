package by.tc.task03.client.dao;

import by.tc.task03.client.entity.Student;
import by.tc.task03.client.entity.user.User;

import java.util.List;

public interface StudentClientDAO {

    boolean edit(Student newValue);

    List<Student> getAll();

    Student get(int id);

    boolean create(Student item);

    User register(User user);

    User login(User user);
}
