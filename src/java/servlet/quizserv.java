/*author---Katha Roy */
package servlet;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class quizserv extends HttpServlet {
protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
         try (PrintWriter out = response.getWriter()) {
            /*author---Katha Roy */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>KRoy/quizserv</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>RESULT OF THE QUIZ</h1><br>");
            out.println("___________________________________________<br><br>");
            int cnt=0;
             String a="",b="",c="",d="",e="";
            a=request.getParameter("ans1");
            b=request.getParameter("ans2");
            c=request.getParameter("ans3");
            d=request.getParameter("ans4");
            /*author---Katha Roy */
            if(a.equals("1d"))
            {out.println("<h2>1: Correct!</h2><br>");cnt++;}
            else
                out.println("<h2>1: Correct answer:d)All of the above</h2><br>");
            if(b.equals("2d"))
            {out.println("<h2>2: Correct!</h2><br>");cnt++;}
            else
                out.println("<h2>2: Correct answer:d)None of the above</h2><br>");
            if(c.equals("3b"))
            {out.println("<h2>3: Correct!</h2><br>");cnt++;}
            else
                out.println("<h2>3: Correct answer:b)-101</h2><br>");
            if(d.equals("4d"))
            {out.println("<h2>4: Correct!</h2><br>");cnt++;}
            else
                out.println("<h2>4: Correct answer:d)lang<br></h2>");
            out.println("<br>");
            if(cnt==4)
                out.println("<h1>----->Well Done!All the answers are correct.</h1><br>");
            else
                out.println("<h1>------>Number of questions answered correctly :"+cnt+"</h2><br>");
            out.println("</body>");
            out.println("</html>");
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
/*author---Katha Roy */
}
