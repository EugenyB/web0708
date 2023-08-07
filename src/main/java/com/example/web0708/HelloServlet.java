package com.example.web0708;

import com.example.web0708.beans.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "helloServlet", value = {"/hello-servlet"})
public class HelloServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String name = request.getParameter("username");
        int age = Integer.parseInt(request.getParameter("userage"));
        User user = new User(name, age);
        request.setAttribute("user", user);

        request.getRequestDispatcher("/hello.jsp").forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    public void destroy() {
    }
}

/*
http://localhost:8080/web0708-1.0-SNAPSHOT/hello-servlet?username=Qwerty&userage=25

http://localhost:8080/web0708-1.0-SNAPSHOT/hello-servlet
 */
