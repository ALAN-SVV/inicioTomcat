package com.alan.holamundo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

//necesitamos implementar una llave
@WebServlet("/holaServlet")
public class HolaServlet extends HttpServlet {
    @Override//sobreescribimos el metodo doget
    //manejo de excepciones, request es el mensaje y manejo de usuario, resp es la respuesta de la apliacion, ponemos excepciones paar posibles errores
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
    resp.setContentType("text/html");
        //creamos un objeto de tipo Print Write, esto me va apermitir escribir en el navegador
        PrintWriter out = resp.getWriter();
    //generamos el contenido de respuesta
    out.println("<!DOCTYPE html>");
    out.println("<html>");
    out.println("<head>");
    out.println("<title>Hola Servlet</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<h1>Hola Servlet</h1>");
    out.println("</body>");
    out.println("</html>");
    out.close();
    }
}
