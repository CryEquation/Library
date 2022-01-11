package ua.kpi.servlet.commands;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;
import ua.kpi.servlet.Controller;


public interface Command {

    static Logger logger = Logger.getLogger(Controller.class);

    public String execute(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException;
}