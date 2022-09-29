module com.example.wheels {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.wheels to javafx.fxml;
    exports com.example.wheels;
}