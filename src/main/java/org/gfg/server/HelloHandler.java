package org.gfg.server;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;

public class HelloHandler implements HttpHandler {
    @Override
    public void handle(HttpExchange exchange) throws IOException {
        String resp = "I am in hello handler with thread: "+Thread.currentThread().getName();
        exchange.sendResponseHeaders(200, resp.length());
        OutputStream stream = exchange.getResponseBody();
        stream.write(resp.getBytes());
        stream.flush();
        stream.close();

    }
}
