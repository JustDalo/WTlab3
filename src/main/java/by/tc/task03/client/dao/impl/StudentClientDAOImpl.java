package by.tc.task03.client.dao.impl;

import by.tc.task03.client.dao.StudentClientDAO;
import by.tc.task03.client.entity.Student;
import by.tc.task03.client.entity.StudentResponse;
import by.tc.task03.client.entity.request.RequestType;
import by.tc.task03.client.entity.request.ResponseType;
import by.tc.task03.client.entity.user.User;
import by.tc.task03.client.socket.SocketManager;

import java.util.ArrayList;
import java.util.List;

public class StudentClientDAOImpl implements StudentClientDAO {
    private final SocketManager socketManager = new SocketManager("localhost", 5555);

    @Override
    public boolean edit(Student newValue) {
        StudentResponse response = socketManager
                .sendRequest(newValue, RequestType.EDIT);
        return (response != null)
                && (response.getResponseType() == ResponseType.OK);
    }

    @Override
    public List<Student> getAll() {
        StudentResponse response = socketManager
                .sendRequest(null, RequestType.GET_ALL);

        if ((response != null)
                && (response.getResponseType() == ResponseType.OK)
                && (response.getBody() instanceof ArrayList<?>)) {
            try {
                return (ArrayList<Student>) response.getBody();
            } catch (ClassCastException e) {
                return new ArrayList<>();
            }
        }

        return new ArrayList<>();
    }

    @Override
    public Student get(int id) {
        StudentResponse response = socketManager
                .sendRequest(id, RequestType.GET);

        if ((response != null)
                && (response.getResponseType() == ResponseType.OK)
                && (response.getBody() instanceof Student student)) {
            return student;
        }

        return null;
    }

    @Override
    public boolean create(Student item) {
        StudentResponse response = socketManager
                .sendRequest(item, RequestType.CREATE);
        return (response != null)
                && (response.getResponseType() == ResponseType.OK);
    }

    @Override
    public User register(User user) {
        StudentResponse response = socketManager
                .sendRequest(user, RequestType.REGISTER);
        if (response.getBody() instanceof User body) {
            return body;
        }

        return null;
    }

    @Override
    public User login(User user) {
        StudentResponse response = socketManager
                .sendRequest(user, RequestType.LOGIN);
        if (response.getBody() instanceof User body) {
            return body;
        }

        return null;
    }
}
