/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author asus
 */
public class Data {

    protected ArrayList<String[]> users;
    protected ArrayList<String[]> magazines;
    protected ArrayList<String[]> students;
    //--------------------------------------------------------------------------
    public Data() {
        users     = new ArrayList<>();
        magazines = new ArrayList<>();
        students  = new ArrayList<>();
    }
    //--------------------------------------------------------------------------
    public void loadUsers() {
        File file = new File("data/users.data");
        try {
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                StringTokenizer tokens = new StringTokenizer(line, ",");
                String[] fields = new String[3];
                for (int i = 0; i < 3; i++) {
                    fields[i] = tokens.nextToken();
                }
                users.add(fields);
            }
        } catch (FileNotFoundException ex) {
        }

    }

    public void saveUsers() {
        try {
            FileWriter file = new FileWriter("data/users.data");
            for (String[] user : users) {
                String tokens = "";
                for (String field : user) {
                    tokens += field + ",";
                }
                file.write(tokens);
                file.write("\n");
            }
            file.close();
        } catch (IOException ex) {
        }
    }

    public void addUser(String id, String name, String pass,String icon) {
        String fields[] = {id, name, pass,icon};
        users.add(fields);
    }

    public ArrayList<String[]> getUsers() {
        return users;
    }

    public String getUsers(String id) {
        for (String[] fields : users) {
            if (id.equals(fields[0])) {
                return fields[0] + "\n"
                        + fields[1]+ "\n"
                        + fields[2]+ "\n"
                        + fields[3];
            }
        }
        return "";
    }

    public boolean search_user(String id) {
        for (String[] f_user : users) {
            if (f_user[0].equals(id)) {
                return true;
            }
        }
        return false;
    }

    public void removeUser(String id) {
        for (String[] fields : users) {
            //si encontro al usuario
            if (id.equals(fields[0])) {
                users.remove(fields);
                break;
            }
        }
    }
    //--------------------------------------------------------------------------
    public void loadMagazine() {
        File file = new File("data/magazine.data");
        try {
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                StringTokenizer tokens = new StringTokenizer(line, ",");
                String[] fields = new String[6];
                for (int i = 0; i < 6; i++)
                    fields[i] = tokens.nextToken();
                
                magazines.add(fields);
            }
        } catch (FileNotFoundException ex) {
        }

    }

    public void saveMagazine() {
        try {
            FileWriter file = new FileWriter("data/magazine.data");
            for (String[] magazine : magazines) {
                String tokens = "";
                for (String field : magazine) {
                    tokens += field + ",";
                }
                file.write(tokens);
                file.write("\n");
            }
            file.close();
        } catch (IOException ex) {
        }
    }

    public void addMagazine(String numMagazine, String volume, String date, String stock, String loan, String icon) {
        String fields[] = {numMagazine, volume, date, stock, loan, icon};
        magazines.add(fields);
    }

    public ArrayList<String[]> getMagazines() {
        return magazines;
    }

    public String getMagazine(String numMagazine) {
        for (String[] fields : magazines) {
            if (numMagazine.equals(fields[0])) {
                return fields[0] + "\n"
                        + fields[1] + "\n"
                        + fields[2] + "\n"
                        + fields[3] + "\n"
                        + fields[4] + "\n"
                        + fields[5];
            }
        }
        return "";
    }

    public boolean search_Magazine(String numMagazine) {
        for (String[] f_user : magazines) {
            if (f_user[0].equals(numMagazine)) {
                return true;
            }
        }
        return false;
    }

    public void removeMagazine(String numMagazine) {
        for (String[] fields : magazines) {
            //si encontro el magazine
            if (numMagazine.equals(fields[0])){
                magazines.remove(fields);
                break;
            }
        }
    }
    //--------------------------------------------------------------------------
    public void loadStudent() {
        File file = new File("data/student.data");
        try {
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                StringTokenizer tokens = new StringTokenizer(line, ",");
                String[] fields = new String[3];
                for (int i = 0; i < 3; i++) {
                    fields[i] = tokens.nextToken();
                }
                students.add(fields);
            }
        } catch (FileNotFoundException ex) {
        }

    }

    public void saveStudent() {
        try {
            FileWriter file = new FileWriter("data/student.data");
            for (String[] student : students) {
                String tokens = "";
                for (String field : student) {
                    tokens += field + ",";
                }
                file.write(tokens);
                file.write("\n");
            }
            file.close();
        } catch (IOException ex) {
        }
    }

    public void addStudent(String code, String name, String icon) {
        String fields[] = {code, name, icon};
        students.add(fields);
    }

    public ArrayList<String[]> getStudents() {
        return students;
    }

    public String getStudent(String code) {
        for (String[] fields : students) {
            if (code.equals(fields[0])) {
                return fields[0] + "\n"
                        + fields[1]+ "\n"
                        + fields[2];
            }
        }
        return "";
    }

    public boolean search_Student(String code) {
        for (String[] f_student : students) {
            if (f_student[0].equals(code)) {
                return true;
            }
        }
        return false;
    }

    public void removeStudent(String code) {
        for (String[] fields : students) {
            //si encontro al estudiante
            if (code.equals(fields[0])){
                students.remove(fields);
                break;
            }
        }
    }
    
}
