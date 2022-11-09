package com.portfolie3.portfolie3v2;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import java.util.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

import java.io.IOException;

public class Main extends Application {

    private Model model=new Model();
    private Controller con=new Controller(model,this);
    private TextField field=new TextField();
    private TextArea area=new TextArea();

    public ComboBox combo_box = new ComboBox();


    void setArea(String s){area.setText(s);}
    void clearField(){field.setText("");}

    @Override
    public void start(Stage stage) throws IOException {
model.add("Hej"); //Tilføjer "hej" til listen list1, blot en test




        field.setOnAction(e->con.enterText(field.getText()));
        //VBox root = new VBox(field,area);
        String fromPort[] =
                { "Monday", "Tuesday", "Wednesday",
                        "Thursday", "Friday" };
        String to_Port[] =
                { "Hej", "Det", "Virker",
                        "Ikke", "ØV" };

        ComboBox combo_box_from= new ComboBox(FXCollections
                .observableArrayList(fromPort));
        ComboBox combo_box_to = new ComboBox(FXCollections
                .observableArrayList(to_Port));
       // setFromArray(FromArray);
        System.out.println();
        // Create a combo box

        // Create a tile pane
        TilePane tile_pane = new TilePane();
        tile_pane.getChildren().addAll(combo_box_from, combo_box_to);

        Scene scene = new Scene(tile_pane, 500, 500);
        stage.setTitle("JavaFX Demo");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}