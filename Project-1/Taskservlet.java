package com.example.todo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet("/TaskServlet")
public class TaskServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String task = request.getParameter("task");
        HttpSession session = request.getSession();
        List<String> tasks = (List<String>) session.getAttribute("tasks");

        if (tasks != null && task != null && !task.trim().isEmpty()) {
            tasks.add(task);
            session.setAttribute("tasks", tasks);
        }
        response.sendRedirect("index.jsp");
    }
}
