package sample.dao;

import sample.model.User;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserDAOImpl implements UserDAO{

    private static final String FILE_NAME = "usuarios.txt";
    private List<User> userDatabase = new ArrayList<User>();

    public UserDAOImpl() {
    }

    @Override
    public void addUser(String cedula, String nombre, String apellido) {
        User usuario = new User(cedula, nombre, apellido);
        userDatabase.add(usuario);
    }

    @Override
    public void createFile() {
        try{
            Writer bufferedWriter = new OutputStreamWriter(
                    new FileOutputStream(FILE_NAME),
                    System.getProperty("file.encoding"));
            PrintWriter printWriter = new PrintWriter(bufferedWriter);
            for (int i = 0; i<userDatabase.size(); i++){
                printWriter.println(userDatabase.get(i).toString());
                printWriter.flush();
            }
            printWriter.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public void readFile() {
        try {
            Scanner scan = new Scanner(new File(FILE_NAME));
            while(scan.hasNext()){
                String line = scan.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void readFile2() {
        try{
            BufferedReader bfr = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(FILE_NAME), System.getProperty("file.encoding")));
            String userRecord = bfr.readLine();
            while((userRecord = bfr.readLine()) != null){
                System.out.println(userRecord);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public String searchUser(String id) {
        return null;
    }
}
