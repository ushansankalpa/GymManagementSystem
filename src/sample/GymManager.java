package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.awt.*;
import java.io.File;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;

public class GymManager {
    public static void manager(){

        ArrayList<String> information1 = new ArrayList<String>();
        ArrayList<Integer> information2 = new ArrayList<Integer>();
        ArrayList<String> information3 = new ArrayList<String>();


        Stage stage = new Stage();
        stage.setTitle("Gym Manager");



        TextField search = new TextField();
        search.setPrefSize(300,30);
        search.setLayoutX(20);
        search.setLayoutY(20);

        Button find = new Button("Search");
        find.setPrefSize(80,30);
        find.setLayoutX(340);
        find.setLayoutY(20);

        TextArea list = new TextArea();
        list.setPrefSize(400,300);
        list.setLayoutX(20);
        list.setLayoutY(60);



        //membershipNames Add to file
        try {
            File memberData1 = new File("MembershipName");
            Scanner myReader1 = new Scanner(memberData1);

            while (myReader1.hasNextLine()) {
                String data = myReader1.nextLine();
                information1.add(data);
            }

        } catch (Exception e) {
            System.out.println("Error");

        }

        //Membership number add to file
        try {
            File memberData2 = new File("MembershipNumber");
            Scanner myReader2 = new Scanner(memberData2);

            while (myReader2.hasNextLine()){
                int data2 = myReader2.nextInt();
                information2.add(data2);
            }
        } catch (Exception e){
            System.out.println("Error");
        }

        //membership start date add to file
        try {
            File memberData3 = new File("Date");
            Scanner myReader3 = new Scanner(memberData3);

            while (myReader3.hasNextLine()){
                String data3 = myReader3.nextLine();
                information3.add(data3);
            }

        }catch (Exception e){
            System.out.println("Error");
        }


        list.appendText("Membership Name    "+"      Membership Number      "+"          Date");
        list.appendText("\n");

        try {


            for (int i = 0; i < information3.size(); i++) {
                list.appendText(String.valueOf(information1.get(i)) + "                                               "
                        + String.valueOf(information2.get(i)) + "                                "
                        + String.valueOf(information3.get(i)));
                list.appendText("\n");
            }

        }catch (Exception e){
            System.out.println("Error");;
        }


        //Search friends
        find.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                try {
                    String text = search.getText();

                    double fact = Double.parseDouble(text);

                    for (int i=0; i<information2.size(); i++){
                        if (fact== information2.get(i)){
                            Alert alert = new Alert(Alert.AlertType.INFORMATION);
                            alert.setContentText("Membership Name:- "+information1.get(i)+"\nMembership Number:- "+information2.get(i)+"\nDate:- "+information3.get(i));
                            Optional<ButtonType> result = alert.showAndWait();
                        }
                    }
                }catch (Exception e){

                    String text2 = search.getText();

                    for (int i=0; i<information1.size(); i++){
                        if (text2.equals(information1.get(i))){
                            Alert alert = new Alert(Alert.AlertType.INFORMATION);
                            alert.setContentText("Membership Name:- "+information1.get(i)+"\nMembership Number:- "+information2.get(i)+"\nDate:- "+information3.get(i));
                            Optional<ButtonType> result = alert.showAndWait();
                        }
                    }
                }
            }
        });


        Image imgGym = new Image("gym.png");
        ImageView imageView = new ImageView(imgGym);

        imageView.setLayoutX(420);
        imageView.setLayoutY(10);

        imageView.setFitHeight(350);
        imageView.setFitWidth(300);

        imageView.setPreserveRatio(true);
        imageView.setSmooth(true);
        imageView.setCache(true);



        Pane root = new Pane();
        root.getChildren().add(search);
        root.getChildren().add(find);
        root.getChildren().add(list);
        //root.getChildren().add(tableView);
        root.getChildren().addAll(imageView);


        root.setStyle("-fx-background-color: #3a1787;");

        stage.setScene(new Scene(root, 650, 400));
        stage.show();
    }
}
