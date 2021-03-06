package ua.kpi.exceptions;

public class DAOException extends Exception {

    private String message;

    public DAOException() {
        message = "DAO connection failure";
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}