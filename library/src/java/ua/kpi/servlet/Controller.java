package ua.kpi.servlet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import ua.kpi.servlet.commands.Command;
import org.apache.log4j.Logger;

public class Controller extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    RequestHelper requestHelper = RequestHelper.getInstance();
    static Logger logger = Logger.getLogger(Controller.class);

    public Controller() {
        super();
    }

    private void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String page = null;
        
        try {
            //??????????? ???????, ????????? ?? JSP
            Command command = requestHelper.getCommand(request);
            /*????? ?????????????? ?????? execute() ?????????? Command ? ???????? ??????????
             ??????-??????????? ?????????? ???????*/
            page = command.execute(request, response);
            //????? ?????????? ???????? ??????
        } catch (ServletException e) {
            logger.info("ServletException was thrown");
            logger.error("Exception was thrown:", e);

        } catch (IOException e) {
            logger.info("IOException was thrown");
            logger.error("Exception was thrown:", e);
        }

        //????? ???????? ?????? ?? ??????
        RequestDispatcher dispatcher = request.getRequestDispatcher(page);

        dispatcher.forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}