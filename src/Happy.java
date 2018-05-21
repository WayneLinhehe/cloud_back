import java.io.IOException;
 
import java.io.PrintWriter;
 
import java.util.ArrayList;
 
import java.util.Arrays;
 
import java.util.HashMap;
 
import javax.servlet.ServletException;
 
import javax.servlet.annotation.WebServlet;
 
import javax.servlet.http.HttpServlet;
 
import javax.servlet.http.HttpServletRequest;
 
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

 
@WebServlet(name="Happy", urlPatterns="/Happy",loadOnStartup=1)
 
public class Happy extends HttpServlet {
 
    
 
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
 
            throws ServletException, IOException {
    	
    	
 
        response.setContentType("text/html;charset=UTF-8");
 
        //��Post����Ѽƶi��ѽX
 
        request.setCharacterEncoding("UTF-8");
 
        //���oAjax�ǤJ���Ѽ�
 
        String userName = request.getParameter("userName") + "17";
        System.out.println(userName);
 
        HashMap<String, String> userInfoMap = new HashMap();
 
        userInfoMap.put("userName", userName);
 
        JSONObject responseJSONObject = new JSONObject(userInfoMap);
        
        try {  
        	response.getWriter().print(responseJSONObject);
        }catch (IOException e) {  
            
        }  
        
        
 /*
        PrintWriter outt = response.getWriter();
 
        outt.println(responseJSONObject);
 */
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
 
 
    @Override
 
    public String getServletInfo() {
 
        return "Short description";
 
    }// </editor-fold>
 
 
 
}