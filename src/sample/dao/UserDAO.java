package sample.dao;

public interface UserDAO {

    void addUser(String cedula, String nombre, String apellido);
    void createFile();
    void readFile();
    void readFile2();
    String searchUser(String id);
}
