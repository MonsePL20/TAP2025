package com.example.demo;

import com.example.demo.Vistas.Calculadora;
import com.example.demo.Vistas.VentasRestaurante;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    private VBox vBox;
    private MenuBar mnbPrincipal;
    private Menu menCompentencia1, menCompetencia2;
    private MenuItem mitCalculadora, mitRestaurante;
    private Scene escena;

    void CrearUI(){
        mitCalculadora = new MenuItem("Calculadora");
        mitCalculadora.setOnAction(event -> new Calculadora());
        mitRestaurante = new MenuItem("Restaurante");
        mitRestaurante.setOnAction(event -> new VentasRestaurante());
        menCompentencia1 = new Menu("Competencia 1");
        menCompentencia1.getItems().addAll(mitCalculadora, mitRestaurante);
        mnbPrincipal = new MenuBar();
        mnbPrincipal.getMenus().addAll(menCompentencia1);
        vBox = new VBox(mnbPrincipal);
        escena = new Scene(vBox);
        escena.getStylesheets().add(getClass().getResource("/styles/main.css").toString());
    }

    @Override
    public void start(Stage stage) throws IOException {
        CrearUI();
        stage.setTitle("Hola Mundo de Eventos :)");
        stage.setScene(escena);
        stage.show();
        stage.setMaximized(true);
    }

    public static void main(String[] args) {
        launch();
    }
    void clickEvent(){
        System.out.println("Evento desde un metodo :)");
    }
}

/*
public class HelloApplication extends Application {
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