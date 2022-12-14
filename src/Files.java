import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Files {
    Scanner scanner = new Scanner(System.in);
    public Files(){

    }

    ArrayList<String> persons = new ArrayList<>(); //creating Arraylist used later in methods
    File myFile = new File("myFile.txt");
    //read from file
    void writeFile() {
        //if user wants to overwrite file
        String overWrite = "";
        String writing = "";
            try {
                System.out.println("Want to over write?");
                overWrite = scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Y or N pls");
            }
            try {
                System.out.println("What do yoou wanna write? ");
                writing = scanner.nextLine();
            }
            catch (Exception e){
                System.out.println("no");
            }

        if (overWrite == "Y") {
            try {
                FileWriter myWriter = new FileWriter("myFile.txt");
                myWriter.write(writing);
                myWriter.close();
            }
            catch (IOException e){
                System.out.println("NO");
            }
        }
        //add to end of file
        else {
            try {
                FileWriter myWriter = new FileWriter("myFile.txt", true);
                myWriter.write(writing);
                myWriter.close();
            }
            catch (IOException e){
                System.out.println("NO");
            }
        }
    }

    //write to file
    void readFile(){
        try {
            Scanner myReader = new Scanner(myFile);

            while (myReader.hasNextLine()) {
                String data =
                        myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
                    e.printStackTrace();
        }
    }

    //save persons in persons Arraylist in file
    void namePerson(){
        for (String person:persons) {
            try {
                FileWriter myWriter = new FileWriter("persons.txt");
                myWriter.write(person + "/n");
                        myWriter.close();
            } catch (IOException e) {
                System.out.println("Could not write to file");
                        e.printStackTrace();
            }
        }
        System.out.println("Successfully wrote to the file.");
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
