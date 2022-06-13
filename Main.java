import java.util.*;
import java.io.*;

class Main {
  public static void main(String[] args) throws IOException {

    File fileName = new File("Hail.txt");
    Scanner inputFile = new Scanner(fileName);

    // use while loop to read token from the file Hail.txt
    String token = "";
    int count = 0;

    while(inputFile.hasNext())
    {
      token = inputFile.next();
      System.out.println(token);
      count++;
    }

    inputFile.close();

    System.out.println("\nThe number of tokens in Hail.txt is " + count + "\n");


    Scanner inputFile2 = new Scanner(fileName);
    String[] hail = new String[count];

    int index = 0;

    while(inputFile2.hasNext())
    {
      hail[index] = inputFile2.next();
      index++;
    }

    inputFile2.close();

    for(String i : hail)
    {
      System.out.println(i);
    }

    System.out.println();


    // read HailCommas.txt file with comma delimiter
    File fileName3 = new File("HailCommas.txt");
    Scanner inputFile3 = new Scanner(fileName3).useDelimiter(",");

    while(inputFile3.hasNext())
    {
      token = inputFile3.next();
      System.out.println(token);
    }

    inputFile3.close();


    // read integers.txt file and calculate an average
    File fileName4 = new File("integers.txt");
    Scanner inputFile4 = new Scanner(fileName4);

    double sum4 = 0;
    int count4 = 0;

    while(inputFile4.hasNextInt())
    {
      sum4 += inputFile4.nextInt();
      count4++;
    }

    inputFile4.close();

    System.out.println("\nAverage = " + (sum4 / count4));


    // writing to an output file
    File fileName5 = new File("hello.txt");
    PrintWriter outFile5 = new PrintWriter(fileName5);
   
    for(int loop = 1; loop <= 10; loop++)
    {
      outFile5.println(loop + " Hello, World!");
    }
   
    outFile5.close( );


    // read intCommas.txt, calculate average, write to output file
    File fileName6 = new File("intCommas.txt");
    File fileName66 = new File("intCommasAvg.txt");
    Scanner inputFile6 = new Scanner(fileName6).useDelimiter(",");
    PrintWriter outFile6 = new PrintWriter(fileName66);

    double sum6 = 0;
    int count6 = 0;

    while(inputFile6.hasNextInt())
    {
      sum6 += inputFile6.nextInt();
      count6++;
    }

    inputFile6.close();

    outFile6.println("\nAverage = " + (sum6 / count6));

    outFile6.close();

  }
}