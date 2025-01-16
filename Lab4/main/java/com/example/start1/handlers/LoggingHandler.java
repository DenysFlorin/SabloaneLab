package com.example.start1.handlers;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class LoggingHandler extends AbstractRequestHandler {

    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response) throws IOException, IOException {
        System.out.println("Logging Request: " + request.getMethod() + " " + request.getRequestURI());
        passToNext(request, response);
        System.out.println("Logging Response: " + response.getStatus());
    }
}

