package com.example.mywebapp;

import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.Mockito;
import javax.servlet.http.HttpServletRequest;

public class RegisterServletTest {
    @Test
    public void testEmailAndPasswordFieldsPresent() {
        // Create a mock HttpServletRequest object
        HttpServletRequest request = Mockito.mock(HttpServletRequest.class);

        // Set the necessary parameters for the test
        Mockito.when(request.getParameter("email")).thenReturn("test@example.com");
        Mockito.when(request.getParameter("password")).thenReturn("password123");

        // Create an instance of the RegisterServlet
        RegisterServlet registerServlet = new RegisterServlet();

        // Assert that the email and password fields are present
        assertNotNull("Email field is not present", registerServlet.getParameter(request, "email"));
        assertNotNull("Password field is not present", registerServlet.getParameter(request, "password"));
    }
}

