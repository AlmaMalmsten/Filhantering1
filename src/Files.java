import java.util.ArrayList;
import java.util.Scanner;

public class Files {
    Scanner scanner = new Scanner(System.in);
    public Files(){


    }

    ArrayList<String> persons = new ArrayList<>(); //creating Arraylist used later in methods

    //read from file chosen by user
    void readFile() {
        //if user wants to overwrite file
        String overWrite = "";
            try {
                System.out.println("Want to over write?");
                overWrite = scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Y or N pls");
            }
        if (overWrite == "Y") {

        }
        //add to end of file
        else {

        }
    }
    //write to file
    void writeFile(){

    }
    //save persons in persons Arraylist in file
    void namePerson(){

    }
    //take in persons from file and sort in persons arraylist
    void sortPerson(){

    }
    //is posseble to write read from file?
    void posseble(){

    }
    //find the longest word in file
    void findLongest(){

    }
    //find most common word
    void comWord(){

    }
    //list all files in map
    void allFiles(){

    }
}
