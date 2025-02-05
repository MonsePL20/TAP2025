package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javafx.geometry.Insets;
import java.io.IOException;

public class HelloApplication extends Application {
    private VBox vBox;
    private MenuBar menuprincipal;
    private Menu mencompetencia1,menconpetencia2;
    private MenuItem mitCalculadora;
    private Scene escena;

    void CrearUI(){
        mitCalculadora = new MenuItem("Calculadora");
        mencompetencia1 = new Menu("Competencia 1");
        mencompetencia1.getItems().addAll(mitCalculadora);
        menuprincipal = new MenuBar();
        menuprincipal.getMenus().addAll(mencompetencia1);
    }

    @Override
    public void start(Stage stage) throws IOException {
        vBox = new VBox();
        stage.setTitle(" Hola Mundo de Eventos :)");
        stage.setScene(new Scene(vBox,200,200));
        stage.show();
        stage.setMaximized(true);

    }

    public static void main(String[] args) {
        launch();
    }

    void clickEvent(){
        System.out.println("Eventos desde un metodo :)");
    }



}
/*public class HelloApplication extends Application {
    private Button btnsaludo,btnsaludo2,btnsaludo3;
    private VBox vBox;

    @Override
    public void start(Stage stage) throws IOException {
        btnsaludo = new Button("Bienvenido Amiguito :)");
        btnsaludo.setOnAction(actionEvent ->  clickEvent());
        btnsaludo2 = new Button("Bienvenido Amiguito :)");
        btnsaludo2.setOnAction(actionEvent ->  clickEvent());
        btnsaludo3 = new Button("Bienvenido Amiguito :)");
        btnsaludo3.setOnAction(actionEvent ->  clickEvent());

        vBox = new VBox(btnsaludo, btnsaludo2, btnsaludo3);
        vBox.setSpacing(10);
        vBox.setPadding(new Insets(10,0,0,0));
        stage.setTitle(" Hola Mundo de Eventos :)");
        stage.setScene(new Scene(vBox,200,200));
        stage.show();
        stage.setMaximized(true);


    }

    public static void main(String[] args) {
        launch();
    }

    void clickEvent(){
        System.out.println("Eventos desde un metodo :)");
    }



}
*/