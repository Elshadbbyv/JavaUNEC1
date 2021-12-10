module com.example.javaunec1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.javaunec1 to javafx.fxml;
    exports com.example.javaunec1;
}