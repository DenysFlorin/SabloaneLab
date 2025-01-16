package com.example.start1.handlers;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class AuthenticationHandler extends AbstractRequestHandler {

    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response) throws IOException, IOException {
        // Example authentication logic
        String authHeader = request.getHeader("Authorization");
        if (authHeader == null || !authHeader.startsWith("Bearer ")) {
            response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Unauthorized");
            return;
        }

        passToNext(request, response);
    }
}

