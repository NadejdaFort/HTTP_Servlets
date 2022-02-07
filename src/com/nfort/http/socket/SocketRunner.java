package com.nfort.http.socket;

import java.io.*;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.Socket;

public class SocketRunner {

    public static void main(String[] args) throws IOException {
        // http - 80
        // https - 443
        // это поорты TCP
        var inetAddress = Inet4Address.getByName("localhost");
        try (var socket = new Socket(inetAddress, 7777);
             var outputStream = new DataOutputStream(socket.getOutputStream());
             var inputStream = new DataInputStream(socket.getInputStream())) {
            outputStream.writeUTF("Hello, World!");
//            var response = inputStream.readAllBytes();
            System.out.println("Response from server: " + inputStream.readUTF());
        }
    }
}
