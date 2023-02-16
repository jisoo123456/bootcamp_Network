package Network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class Task0216Server {
    public static void main(String[] args) {
        try(ServerSocket serverSocket =new ServerSocket(5000);
            Socket clientSocket = serverSocket.accept();
            PrintWriter pw = new PrintWriter(clientSocket.getOutputStream(),true);
            ) {
            pw.println(new Date().toString());
            } catch (IOException ex) {
            System.out.println("접속 실패!!");
        }
    }
}
