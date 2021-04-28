package sample;

import javafx.application.Application;
import javafx.stage.Stage;
import java.util.ArrayList;
import java.util.Scanner;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        ArrayList<DefaultMember> members = new ArrayList<DefaultMember>();
        ArrayList<StudentMember> sMembers = new ArrayList<StudentMember>();
        ArrayList<Over60Member> oMember = new ArrayList<Over60Member>();



        while (true) {
            System.out.println("\n'a' -- Enter member details.");
            System.out.println("'b' -- Delete members");
            System.out.println("'c' -- Member list");

            Scanner scan = new Scanner(System.in);
            System.out.print("Enter your option :- ");
            char choose = scan.next().charAt(0);

            if (choose == 'a') {

                System.out.println("\nEnter Members Details");

                int count = 0;
                while (count <= 100) {
                    System.out.print("\nEnter Membership Name :-");
                    String MembershipName = scan.next();
                    if (MembershipName.equals("q")){
                        break;
                    }

                    System.out.print("Enter your Membership NUmber :-");
                    String MembershipNumber = scan.next();
                    if (MembershipNumber.equals("q")){
                        break;
                    }


                    System.out.print("Enter start membership date :-");
                    String date = scan.next();
                    if (date.equals("q")){
                        break;
                    }

                    while (true) {

                        System.out.println("\n(0)<-- School or (1)<--Age or (3)<-- Skip");
                        System.out.print("Enter (0) or (1) or (3) :-");
                        int SA = scan.nextInt();


                        if (SA == 0) {
                            System.out.print("\nEnter your School :-");
                            String School = scan.next();
                            if (School.equals("q")){
                                break;
                            }

                            sMembers.add(new StudentMember(MembershipNumber, MembershipName, date, School));
                            break;
                        } else if (SA == 1) {
                            System.out.print("\nEnter Member Age :-");
                            String age = scan.next();
                            if (age.equals("q")){
                                break;
                            }

                            oMember.add(new Over60Member(MembershipNumber, MembershipName, date, age));
                            break;
                        } else if (SA == 3) {
                            break;
                        } else {
                            System.out.println("Invalid Input");
                        }
                    }

                    members.add(new DefaultMember(MembershipNumber, MembershipName, date));


                    System.out.println("\n(1)<---Default member/(2)<---Student member/(3)<---Over60Member");
                    System.out.print("Enter (1) or (2) or (3) :-");

                    int num = scan.nextInt();
                    switch (num) {
                        case 1:
                            MyGymManager.AddMember1(members);
                            break;
                        case 2:
                            MyGymManager.AddMember2(sMembers);
                            break;
                        case 3:
                            MyGymManager.AddMember3(oMember);
                            break;
                        default:
                            System.out.println("Invalid input");
                            break;

                    }

                    System.out.println("Member " + (count + 1) + " details complete");
                    count++;
                }
            }else if (choose =='b'){

                //Delete Member

                MyGymManager.delete1(members);




            } else if (choose == 'c') {
                //GUI interface
                GymManager.manager();
                break;


            }else {
                System.out.println("Invalid Input");
            }
        }

    }
    public static void main(String[] args) {
        launch(args);
    }
}
