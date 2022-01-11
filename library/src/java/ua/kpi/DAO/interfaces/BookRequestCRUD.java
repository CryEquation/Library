package ua.kpi.DAO.Interfaces;

import java.util.List;
import ua.kpi.exceptions.DAOException;
import ua.kpi.model.BookRequest;

public interface BookRequestCRUD extends CRUD <BookRequest> {
        
      public List<BookRequest> getAll() throws DAOException;
      
      public List<BookRequest> findByLogin(String login) throws DAOException;
}