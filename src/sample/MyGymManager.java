package sample;

import sun.net.www.http.ChunkedInputStream;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class MyGymManager {

    public static void AddMember1(ArrayList<DefaultMember> members){
        for (int i=0; i<members.size(); i++){

            File file = new File("MembershipName");
            PrintWriter printWriter;
            FileWriter fileWriter;
            try {
                fileWriter = new FileWriter(file,true);
                printWriter = new PrintWriter(fileWriter,true);
                printWriter.println(members.get(i).getMembershipName());



            }catch (Exception e){
                System.out.println("Invalid input");
            }
        }

        for (int i=0; i<members.size(); i++){

            File file = new File("MembershipNumber");
            PrintWriter printWriter;
            FileWriter fileWriter;
            try {
                fileWriter = new FileWriter(file,true);
                printWriter = new PrintWriter(fileWriter,true);
                printWriter.println(members.get(i).getMembershipNumber());


            }catch (Exception e){
                System.out.println("Invalid input");
            }
        }


        for (int i=0; i<members.size(); i++){

            File file = new File("Date");
            PrintWriter printWriter;
            FileWriter fileWriter;
            try {
                fileWriter = new FileWriter(file,true);
                printWriter = new PrintWriter(fileWriter,true);
                printWriter.println(members.get(i).getDate());


            }catch (Exception e){
                System.out.println("Invalid input");
            }
        }


    }

    public static void AddMember2(ArrayList<StudentMember> sMember){
        for (int i=0; i<sMember.size(); i++){
            File file = new File("MembershipName");
            PrintWriter printWriter;
            FileWriter fileWriter;
            try {
                fileWriter = new FileWriter(file,true);
                printWriter = new PrintWriter(fileWriter,true);
                printWriter.println(sMember.get(i).getMembershipName());


            }catch (Exception e){
                System.out.println("Invalid input");
            }

        }

        for (int i=0; i<sMember.size(); i++){
            File file = new File("MembershipNumber");
            PrintWriter printWriter;
            FileWriter fileWriter;
            try {
                fileWriter = new FileWriter(file,true);
                printWriter = new PrintWriter(fileWriter,true);
                printWriter.println(sMember.get(i).getMembershipNumber());



            }catch (Exception e){
                System.out.println("Invalid input");
            }

        }

        for (int i=0; i<sMember.size(); i++){
            File file = new File("Date");
            PrintWriter printWriter;
            FileWriter fileWriter;
            try {
                fileWriter = new FileWriter(file,true);
                printWriter = new PrintWriter(fileWriter,true);
                printWriter.println(sMember.get(i).getDate());



            }catch (Exception e){
                System.out.println("Invalid input");
            }

        }

    }

    public static void AddMember3(ArrayList<Over60Member> oMember){
        for (int i=0; i<oMember.size(); i++){
            File file = new File("MembershipName");
            PrintWriter printWriter;
            FileWriter fileWriter;
            try {
                fileWriter = new FileWriter(file,true);
                printWriter = new PrintWriter(fileWriter,true);
                printWriter.println(oMember.get(i).getMembershipName());


            }catch (Exception e){
                System.out.println("Invalid input");
            }

        }

        for (int i=0; i<oMember.size(); i++){
            File file = new File("MembershipNumber");
            PrintWriter printWriter;
            FileWriter fileWriter;
            try {
                fileWriter = new FileWriter(file,true);
                printWriter = new PrintWriter(fileWriter,true);
                printWriter.println(oMember.get(i).getMembershipNumber());


            }catch (Exception e){
                System.out.println("Invalid input");
            }
        }

        for (int i=0; i<oMember.size(); i++){
            File file = new File("Date");
            PrintWriter printWriter;
            FileWriter fileWriter;
            try {
                fileWriter = new FileWriter(file,true);
                printWriter = new PrintWriter(fileWriter,true);
                printWriter.println(oMember.get(i).getDate());


            }catch (Exception e){
                System.out.println("Invalid input");
            }
        }
    }

    public static void delete1(ArrayList<DefaultMember> members1){



        System.out.print("Enter student name :-");
        Scanner sc = new Scanner(System.in);
        String removeMem = sc.nextLine();


        for (int i=0; i<members1.size(); i++){
            if (members1.get(i).equals(removeMem)){
                members1.remove(i);
                System.out.println("\nMember,"+removeMem+" is removed");

            }
        }
    }
}
