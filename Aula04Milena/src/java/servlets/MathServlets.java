/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author micam
 */
@WebServlet(name = "MathServlets", urlPatterns = {"/math-servlets"})
public class MathServlets extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Cálculo</title>");            
            out.println("</head>");
            String html = null;
            out.println("<body><html>\n" + "<CENTER>\n" + "<FORM NAME=\"Calc\">\n" + "<TABLE BORDER=4 WIDTH=\"155\" bgcolor=\"green\">\n" +
"	<TR>\n" +
"		<TD ALIGN=\"CENTER\">\n" +
"			<INPUT TYPE=\"text\"  NAME=\"Input\" SIZE=\"16\">\n" +
"		</TD>\n" +
"	</TR>\n" +
"	<TR>\n" +
"		<TD ALIGN=\"CENTER\">\n" +
"			<INPUT TYPE=\"button\" NAME=\"one\"\n" +
"			VALUE=\"  1  \" onClick=\"Calc.Input.value += '1'\">\n" +
"			<INPUT TYPE=\"button\" NAME=\"two\"\n" +
"			VALUE=\"  2  \" onClick=\"Calc.Input.value += '2'\">\n" +
"			<INPUT TYPE=\"button\" NAME=\"three\"\n" +
"			VALUE=\"  3  \" onClick=\"Calc.Input.value += '3'\">\n" +
"			<INPUT TYPE=\"button\" NAME=\"plus\"\n" +
"			VALUE=\"  +  \" onClick=\"Calc.Input.value += ' + '\">\n" +
"			<BR>\n" +
"			<INPUT TYPE=\"button\" NAME=\"four\"\n" +
"			 VALUE=\"  4  \" onClick=\"Calc.Input.value += '4'\">\n" +
"			 <INPUT TYPE=\"button\" NAME=\"five\"\n" +
"			 VALUE=\"  5  \" onClick=\"Calc.Input.value += '5'\">\n" +
"			 <INPUT TYPE=\"button\" NAME=\"six\"\n" +
"			 VALUE=\"  6  \" onClick=\"Calc.Input.value += '6'\">\n" +
"			 <INPUT TYPE=\"button\" NAME=\"minus\"\n" +
"			 VALUE=\"  -   \" onClick=\"Calc.Input.value += ' - '\">\n" +
"			<BR>\n" +
"			 <INPUT TYPE=\"button\" NAME=\"seven\"\n" +
"			 VALUE=\"  7  \" onClick=\"Calc.Input.value += '7'\">\n" +
"			 <INPUT TYPE=\"button\" NAME=\"eight\"\n" +
"			 VALUE=\"  8  \" onClick=\"Calc.Input.value += '8'\">\n" +
"			 <INPUT TYPE=\"button\" NAME=\"nine\"\n" +
"			 VALUE=\"  9  \" onClick=\"Calc.Input.value += '9'\">\n" +
"			 <INPUT TYPE=\"button\" NAME=\"times\"\n" +
"			 VALUE=\"  x  \" onClick=\"Calc.Input.value += ' * '\">\n" +
"			<BR>\n" +
"			<INPUT TYPE=\"button\" NAME=\"clear\"\n" +
"			 VALUE=\"  c  \" onClick=\"Calc.Input.value = ''\">\n" +
"			 <INPUT TYPE=\"button\" NAME=\"zero\"\n" +
"			 VALUE=\"  0  \" onClick=\"Calc.Input.value += '0'\">\n" +
"			 <INPUT TYPE=\"button\" NAME=\"DoIt\"\n" +
"			 VALUE=\"  =  \" onClick=\"Calc.Input.value = eval(Calc.Input.value)\">\n" +
"			 <INPUT TYPE=\"button\" NAME=\"div\"\n" +
"			 VALUE=\"  /   \" onClick=\"Calc.Input.value += ' / '\">\n" +
"		</TD>\n" +
"	</TR>\n" +
"</TABLE>\n" +
"</FORM>\n" +
"</CENTER>\n" +
"</html></body>");
            out.println("<center><h1>Math Servlets</h></center>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
