package by.tc.task03.server.socket;

import by.tc.task03.server.socket.handle.ClientHandler;

import java.io.IOException;
import java.net.Socket;
import java.util.LinkedList;

public class ServerSocket extends Thread {
    private final int port;
    private static LinkedList<ClientHandler> clients = new LinkedList<>();

    public ServerSocket(int port) {
        this.port = port;
    }

    @Override
    public void run() {
        java.net.ServerSocket server = null;
        try {
            try {
                server = new java.net.ServerSocket(this.port);
                while (true) {
                    Socket socket = server.accept();
                    try {
                        clients.add(new ClientHandler(socket));
                    } catch (IOException e) {
                        socket.close();
                    }
                }
            } catch (IOException ignored) {
            } finally {
                if ((server != null) && !server.isClosed()) {
                    server.close();
                }
            }

        } catch (IOException ignored) {
        }
    }
}
