module com.example.labor6 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires java.xml;
    requires java.sql;
    requires java.desktop;

    opens com.example.labor6 to javafx.fxml;
    exports com.example.labor6;
}