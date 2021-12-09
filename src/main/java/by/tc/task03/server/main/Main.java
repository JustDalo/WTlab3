package by.tc.task03.server.main;

import by.tc.task03.server.socket.ServerSocket;

public class Main {
    public static void main(String[] args) {
        ServerSocket server = new ServerSocket(5555);
        server.start();
        try {
            server.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }
}
