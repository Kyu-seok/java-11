module com.example.reentrantlock {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.reentrantlock to javafx.fxml;
    exports com.example.reentrantlock;
}