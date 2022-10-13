module com.example.study {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.study to javafx.fxml;
    exports com.example.study;
}