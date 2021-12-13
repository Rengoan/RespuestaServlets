package web;

import java.io.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/GeneracionExcelServlet")
public class GeneracionExcelServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response )throws IOException{
        
        //Indicamos el tipo de respuesta
        response.setContentType("application/vnd.ms-excel");
        /*Tambien vamos a indicar al cliente que cuando haga click en el vinculo 
        se descargue el documento*/
        response.setHeader("Content-Disposition",
                "attachment;filename=excelEjemplo.xls");
        
        //Vamos a usar otros 3 header
        response.setHeader("Pragma", "no-cache");
        response.setHeader("Cache-Control", "no-store");
        response.setDateHeader("Expire", -1);
        
        //Desplegamos informacion en el cliente
        PrintWriter out = response.getWriter();
        
        out.println("\tValores");
        out.println("\t1");
        out.println("\t5");
        out.println("Total\t=SUMA(B2:B3)");
        out.close();
        
        
    }
    
}
