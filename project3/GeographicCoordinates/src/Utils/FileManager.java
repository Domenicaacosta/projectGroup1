/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;





/**
 *
 * @author Domenica
 */


public class FileManager {

    public static boolean createFile(String fileName) {
        boolean created = false;

        try {
            File file = new File(fileName + ".txt");
            if (file.createNewFile()) {
                System.out.println("file was created");

                created = true;

            } else {
                System.out.println("file already exists");
                created = false;
            }
        } catch (IOException ex) {
            ex.printStackTrace();
            created = false;
        }
        return created;
    }

    public static boolean save(String data, String fileName) {
        boolean saved = false;

        createFile(fileName);

        try {
            FileWriter myWrite = new FileWriter(fileName + ".txt", true);
            myWrite.write(System.getProperty("line.separator") + data);
            myWrite.close();
            System.out.println("a new record of " + fileName + " was saved");
            saved = true;
        } catch (IOException ex) {
            ex.printStackTrace();
            saved = false;
        }
        return saved;
    }

    

}
