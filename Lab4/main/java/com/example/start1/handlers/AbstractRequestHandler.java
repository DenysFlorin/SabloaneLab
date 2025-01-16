package com.example.start1.handlers;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public abstract class AbstractRequestHandler implements RequestHandler {
    private RequestHandler nextHandler;

    @Override
    public void setNextHandler(RequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    protected void passToNext(HttpServletRequest request, HttpServletResponse response) throws IOException {
        if (nextHandler != null) {
            nextHandler.handle(request, response);
        }
    }
}

