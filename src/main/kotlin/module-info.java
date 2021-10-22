module edu.voiciehb.yetanothercalculatorkotlinedition {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;
    requires java.desktop;


    opens edu.voiciehb.yetanothercalculatorkotlinedition to javafx.fxml;
    exports edu.voiciehb.yetanothercalculatorkotlinedition;
}