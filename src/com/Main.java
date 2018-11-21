package com;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

public class Main extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
      /*  BorderPane borderPane=new BorderPane();
        borderPane.setBottom(new Button("Press"));
        borderPane.setMinWidth(200);
        borderPane.setMinHeight(150);*/

      /*  HBox hBox=new HBox();
        hBox.getChildren().addAll(new Button("one"));
        hBox.getChildren().addAll(new Button("two"));
        hBox.setSpacing(5);
        hBox.setPadding(new Insets(5));*/

        GridPane gridPane=new GridPane();
        gridPane.setVgap(10);
        gridPane.setHgap(10);
        gridPane.setPadding(new Insets(0,10,0,10));

        gridPane.add(new Button("one"),1,1,2,2);
        gridPane.add(new Button("two"),5,1,2,2);
        gridPane.add(new Button("three"),1,4,4,8);





        Group root = new Group();
        root.getChildren().addAll(gridPane);
        primaryStage.setScene(new Scene(root,400,300));
        primaryStage.show();
    }
}
