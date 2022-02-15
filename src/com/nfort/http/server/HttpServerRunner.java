package com.nfort.http.server;

public class HttpServerRunner {

    public static void main(String[] args) {

        var httpServer = new HttpServer(100, 9000);
        httpServer.run();
    }
}
