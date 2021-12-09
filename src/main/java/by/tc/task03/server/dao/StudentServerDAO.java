package by.tc.task03.server.dao;

import by.tc.task03.client.entity.Student;
import by.tc.task03.client.entity.user.User;

import java.io.FileNotFoundException;
import java.util.List;

public interface StudentServerDAO {

    List<Student> getAll();

    Student get(int id);

    User userExists(User user);

    List<User> getAllUsers ();

    void rewriteUsers(List<User> users) throws FileNotFoundException;

    void rewriteStudents(List<Student> students) throws FileNotFoundException;
}
