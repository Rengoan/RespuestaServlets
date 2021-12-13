package web;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/HoraServlet")
public class HoraServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        
        response.setContentType("text/html;charset=UTF-8");
        
        /*
        Vamos a usar el header que nos permite refrescar la informacion del 
        navegador cada segundo
        */
        response.setHeader("refresh", "1");
        Date fecha = new Date();
        
        //Establecemos un formato de hora
        SimpleDateFormat formatoFecha = new SimpleDateFormat();
        
        //Aplicamos el formato a nuestra fecha
        String horaConFormato = formatoFecha.format(fecha);
        
        PrintWriter out = response.getWriter();
        
        out.print("Hora actualizada: "+ horaConFormato);
        out.close();
    }
    
}
