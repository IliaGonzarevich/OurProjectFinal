module com.example.ourproject {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.example.ourproject to javafx.fxml;
    exports com.example.ourproject;
}