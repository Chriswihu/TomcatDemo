package com.example.demo;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import javax.sql.rowset.serial.SerialException;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Velkommen til min Servlet";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
//        response.setContentType("text/html");
//
//        // Hello
//
////        int i = 5;
//
////        while (i > 0) {
//            PrintWriter out = response.getWriter();
//        out.write("\n");
//        out.write("<!DOCTYPE html>\n");
//        out.write("<html>\n");
//        out.write("<head>\n");
//
//        out.println("<h1>" + message + "</h1>");
//        out.write("    <title>Mit første faneblad</title>\n");
//        out.write("</head>\n");
//        out.write("<body>\n");
//        out.write("<h1>");
//        out.print( "Velkommen til min Index side!" );
//        out.write("\n");
//        out.write("</h1>\n");
//        out.write("<br/>\n");
//        out.write("<a href=\"hello-servlet\">Klik here for at gå til din Servlet</a>\n");
//
//        out.write("</body>\n");
//        out.write("</html>");
//
//
//
//
////            out.println("<html><body>");
////            out.println("</body></html>");
////            i--;
////        }
        log("var lige et hurtigt smut forbi min Servlet!");
//        System.out.println("var lige et hurtigt smut forbi min Servlet!");

        request.setAttribute("besked", message);
        request.getRequestDispatcher("WEB-INF/minFirstJSP.jsp").forward(request, response);


    }

    public void destroy() {
    }
}