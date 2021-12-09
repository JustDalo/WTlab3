package by.tc.task03.client.service;

import by.tc.task03.client.dao.StudentClientDAO;
import by.tc.task03.client.service.impl.StudentClientServiceImpl;

public class ServiceClientFactory {
    private static final ServiceClientFactory instance = new ServiceClientFactory();

    private ServiceClientFactory() {}

    public StudentClientService getStudentService(StudentClientDAO studentDAO) {

        return new StudentClientServiceImpl(studentDAO);
    }

    public static ServiceClientFactory getInstance() {
        return instance;
    }
}

