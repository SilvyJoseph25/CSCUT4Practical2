import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.lang.Number;

/**
 * 
 * CSCU9T4 Java strings and files exercise.
 *
 */
public class FilesInOut {

    public static void main(String[] args) {
    	
        // Replace this with statements to set the file name (input) and file name (output).
    	
    	System.out.println("Supply filename for input:");
    	try
    		{
    		//inputFileName=in.nextLine();
    		File inputFile=new File("\"C:\\Users\\caran\\Downloads\\CSCUT4Practical2-main\\CSCUT4Practical2-main\\input.txt\"");
    		Scanner inFile=new Scanner(inputFile);
    		}
    	catch (IOException e)
    		{
    		System.err.println("IOException : " + e.getMessage() + "not found");
    		}
    	
    	System.out.println("Supply filename for output:");
    	try
    		{
    		outputFile=new PrintWriter(filename);
    		}
    	catch (FileNotFoundException e)
    		{
    		System.err.println("FileNotFoundException:" + e.getMessage() + " not openable");
    		System.exit(0);
    		}
        // Initially it will be easier to hardcode suitable file names.

        // Set up a new Scanner to read the input file.
        // Processing line by line would be sensible here.
        // Initially, echo the text to System.out to check you are reading correctly.
        // Then add code to modify the text to the output format.

        // Set up a new PrintWriter to write the output file.
        // Add suitable code into the above processing (because you need to do this line by line also.
        // That is, read a line, write a line, loop.

        // Finally, add code to read the filenames as arguments from the command line.

        System.out.println("You need to add your own code to do anything");

    } // main

} // FilesInOut
