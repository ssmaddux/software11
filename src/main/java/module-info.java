module s1p.software1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens s1p.software1 to javafx.fxml;
    exports s1p.software1;
}