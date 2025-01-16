package com.example.start1.filters;

import com.example.start1.handlers.RequestHandler;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import jakarta.servlet.Filter;

@Component
@Order(1)
public class RequestFilter implements Filter {
    private final RequestHandler chain;

    @Autowired
    public RequestFilter(List<RequestHandler> handlers) {
        // Set up the chain
        for (int i = 0; i < handlers.size() - 1; i++) {
            handlers.get(i).setNextHandler(handlers.get(i + 1));
        }
        this.chain = handlers.getFirst();
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        chain.handle(request, response);

        // Proceed with the normal filter chain
        filterChain.doFilter(servletRequest, servletResponse);
    }
}

