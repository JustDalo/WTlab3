package by.tc.task03.server.service;

import by.tc.task03.server.dao.StudentServerDAO;
import by.tc.task03.server.service.impl.StudentServerServiceImpl;

public class ServiceServerFactory {
    private static final ServiceServerFactory instance = new ServiceServerFactory();

    private ServiceServerFactory() {}

    public StudentServerService getStudentService(StudentServerDAO studentDAO) {

        return new StudentServerServiceImpl(studentDAO);
    }

    public static ServiceServerFactory getInstance() {
        return instance;
    }
}
