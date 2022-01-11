package ua.kpi.servlet.commands;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import ua.kpi.logic.PageContentMaker;
import ua.kpi.manager.PathManager;
import static ua.kpi.servlet.commands.Command.logger;


public class GoToAddBookPageCommand implements Command {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        logger.info("Start GoToAddBookPage command;");
        HttpSession session = request.getSession(false);
        session.setAttribute("CurrentPagePath", PathManager.ADD_BOOK_PAGE_PATH);
        return PathManager.getInstance().getProperty(PathManager.ADD_BOOK_PAGE_PATH);
    }
}