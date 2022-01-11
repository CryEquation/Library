package ua.kpi.DAO;

import org.apache.log4j.Logger;


public class DAOFactory {

    static Logger logger = Logger.getLogger(DAOFactory.class);

    public DAOFactory(Logger log) {
        logger = log;
    }

    public BookDAO getBookDAO() {
        return new BookDAO(logger);
    }

    public UserDAO getUsetDAO() {
        return new UserDAO(logger);
    }

    public BookRequestDAO getBookRequestDAO() {
        return new BookRequestDAO(logger);
    }

    public AuthorDAO getAuthorDAO() {
        return new AuthorDAO(logger);
    }

    public GenreDAO getGenreDAO() {
        return new GenreDAO(logger);
    }
}