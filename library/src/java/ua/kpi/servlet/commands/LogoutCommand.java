package ua.kpi.servlet.commands;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import ua.kpi.manager.PathManager;
import static ua.kpi.servlet.commands.Command.logger;


public class LogoutCommand implements Command {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        logger.info("Start Logout command;");
        HttpSession session = request.getSession(false);
        session.invalidate();
        return PathManager.getInstance().getProperty(PathManager.MAIN_PAGE_PATH);

    }
}