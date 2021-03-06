package ua.kpi.servlet.commands;

import ua.kpi.DAO.BookRequestDAO;
import ua.kpi.DAO.DAOFactory;
import ua.kpi.exceptions.DAOException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import ua.kpi.logic.PageContentMaker;
import ua.kpi.manager.PathManager;
import ua.kpi.model.BookRequest;
import static ua.kpi.servlet.commands.Command.logger;


public class GoToLibPageCommand implements Command {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        logger.info("Start GoLibCommand;");
        PageContentMaker.makeLibPageContent(request);
        HttpSession session = request.getSession(false);
        session.setAttribute("CurrentPagePath", PathManager.REQUESTS_PAGE_PATH);
        return PathManager.getInstance().getProperty(PathManager.REQUESTS_PAGE_PATH);
    }
    
}