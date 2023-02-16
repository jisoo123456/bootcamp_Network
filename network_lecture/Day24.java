package network_lecture;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Day24 {
    public static void main(String[] args) {
        InetAddress addr1 = null, addr2 = null;
        System.out.println("input hostname: ");
        Scanner sc = new Scanner(System.in);
        String url = sc.nextLine();

        try {
            addr1 = InetAddress.getByName(url);
            addr2 = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("%s의 IP주소: %s \n로컬 IP주소: %s", url, addr1.getHostAddress(), addr2.getHostAddress());
    }

}



