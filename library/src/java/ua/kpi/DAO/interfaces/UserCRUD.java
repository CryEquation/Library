package ua.kpi.DAO.Interfaces;

import ua.kpi.exceptions.DAOException;
import java.util.List;
import ua.kpi.model.User;


public interface UserCRUD extends CRUD<User> {

    public List<User> getAll() throws DAOException;

    public User findByLogin(String login) throws DAOException;
}