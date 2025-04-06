module com.example.zhanbolot {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.apache.poi.ooxml;


    opens com.example.zhanbolot to javafx.fxml;
    exports com.example.zhanbolot;
}