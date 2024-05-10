module project {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    
    opens test to javafx.fxml;
    
    opens resources.img;
    exports test;
    
}
