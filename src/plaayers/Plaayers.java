/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package plaayers;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Primm
 */
public class Plaayers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
    int optionNum = mainMenu();
     if (optionNum==1){
         dataInput();
     }
     //this is to avoid code reputation 
     //if you want the code you can just copy the code as is 
    }
    
    public static int mainMenu(){// we are using next to be able to ... ai nami angazi 
        System.out.println("1:Welcome to Primmys football club");
        System.out.println("2:Initialize the program with data ");
        System.out.println("3:Please name your players ");
        Scanner sc = new Scanner(System.in);
        String option = sc.nextLine();
       // int optionNum = Integer.parseInt(option); //adding the data types
        return Integer.parseInt(option);
    }
    public static void dataInput() throws FileNotFoundException, IOException{
    BufferedReader br = new BufferedReader(new FileReader("FantasyFootballData2.csv"));// adding a file method
    String line;// = br.readLine();// reading line 
    while ((line =br.readLine()) != null) {
        String[] playerData = line.split(",");// commas seperate the 
        System.out.println(playerData[0]);
        if (playerData[4].equals("Forward")){
            Forward player = new Forward(0,playerData[0],playerData[1], playerData[2],Integer.parseInt(playerData[3]),playerData[4]);
        }
    }
 //   System.out.println("the first line is:"+ line );
  //  String[] playerData = line.split(",");// adding thE data types 
        
    }
}

