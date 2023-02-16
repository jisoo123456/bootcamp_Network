package Network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class Task0216Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("IP주소입력: ");
        String server_ip = sc.nextLine();
        try (
                Socket socket = new Socket(server_ip, 5000);
                BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                ){

            String answer = br.readLine();
            System.out.println(answer);

        } catch (IOException e) {
            System.out.println("접속 실패!");
        }
    }
}
