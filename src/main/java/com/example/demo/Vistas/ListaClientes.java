package com.example.demo.Vistas;

import com.example.demo.modelos.ClientesDAO;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.ToolBar;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ListaClientes extends Stage {

    private ToolBar tlbMenu;
    private TableView<ClientesDAO> tbvClientes;
    private VBox vBox;
    private Scene escena;
    private Button btnAgregar;
    public ListaClientes(){
        CrearUI();
        this.setTitle("Listado de Clientes :)");
        this.setScene(escena);
        this.show();
    }

    private void CrearUI() {
        btnAgregar = new Button();
        ImageView imv = new ImageView(getClass().getResource("/images/human_icon.png").toString());
        imv.setFitWidth(20);
        imv.setFitHeight(20);
        btnAgregar.setGraphic(imv);
        tlbMenu = new ToolBar(btnAgregar);
        tbvClientes = new TableView<>();
        CreateTable();
        vBox = new VBox(tlbMenu,tbvClientes);
        escena = new Scene(vBox, 800, 600);
    }

    private void CreateTable() {

        TableColumn<ClientesDAO,String> tbcNomCte = new TableColumn<>("Nombre");
        TableColumn<ClientesDAO,String> tbcDireccion = new TableColumn<>("Dirección");
        TableColumn<ClientesDAO,String> tbcTel = new TableColumn<>("Telefono");
        TableColumn<ClientesDAO,String> tbcEmail = new TableColumn<>("Email");

    }
}