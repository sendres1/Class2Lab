package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.WelcomeService;

/**
 *This is the main controller for the Greeting App.
 * @author Steven
 */
@WebServlet(name = "GreetingController", urlPatterns = {"/greeter"})
public class GreetingController extends HttpServlet {
     private static final String RESULT_PAGE = "welcomeResult.jsp";
     
      // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method. Not currently used.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    }
    // <editor-fold 
    
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
        response.setContentType("text/html");

        // parameters are name attributes in view pages
        // Here we're retrieving form content from form.html
       // String c = request.getParameter("color");
      //  String name = request.getParameter("form1");
        String name = request.getParameter("name");
        
        // Create a new instance of a model object
        // For some applications, we would not want to create a new one each time.
 //       BeerExpert be = new BeerExpert();
        WelcomeService ws = new WelcomeService();
       
        // Always a good idea to trim and/or validate input data
        //List result = be.getBrands(c.trim());
        
        //List result = ws.createGreeting(name.trim());
        
       String result = ws.createGreeting(name.trim());
       
       //Object result = s;

       // i am here
        // Parameters are read only Request object properties, but attributes
        // are read/write. We can use attributes to store data for use on
        // another page.
        request.setAttribute("welcome", result);
        
        // This object lets you forward both the request and response
        // objects to a destination page
        RequestDispatcher view =
                request.getRequestDispatcher(RESULT_PAGE);
        view.forward(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Main Controller";
    }// </editor-fold>

}
