package org.gfg.server;

import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WebServerDemo {

    public static void main(String[] args) throws IOException {
        HttpServer httpServer = HttpServer.create(new InetSocketAddress("localhost", 9091), 0);
        httpServer.setExecutor(Executors.newFixedThreadPool(4));
        httpServer.createContext("/hello", new HelloHandler());
        httpServer.createContext("/hello1", new HelloHandler1());
        httpServer.start();
    }
}
