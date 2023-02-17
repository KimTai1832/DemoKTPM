module com.ntlt.demoapp {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.ntlt.demoapp to javafx.fxml;
    exports com.ntlt.demoapp;
}
