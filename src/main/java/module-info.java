module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires mysql.connector.j;
    requires java.sql;

    opens com.example.demo to javafx.fxml;
    requires org.kordamp.bootstrapfx.core;
    exports com.example.demo;

}