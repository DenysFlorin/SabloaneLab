package com.example.start1.filters;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.IOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import jakarta.servlet.Filter;


@Component
@Order(1)
public class RequstLoggingFilter implements Filter {

    private static final Logger LOG = LoggerFactory.getLogger(RequstLoggingFilter.class);

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        LOG.info(
                "Logging Request {} : {}", request.getMethod(), request.getRequestURI());
        filterChain.doFilter(request, response);
        LOG.info(
                "Logging Request {} : {}", request.getMethod(), request.getRequestURI());
    }
}
