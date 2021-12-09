package by.tc.task03.client.main;

import by.tc.task03.client.dao.ClientDAOFactory;
import by.tc.task03.client.presentation.Presentation;
import by.tc.task03.client.service.ServiceClientFactory;

public class Main {
    public static void main(String[] args) {
        ServiceClientFactory factory = ServiceClientFactory.getInstance();
        ClientDAOFactory daoFactory = ClientDAOFactory.getInstance();
        Presentation presentation = new Presentation(factory.getStudentService(daoFactory.getStudentDAO()));
        presentation.show();
    }
}
