module dev.lin_blackberry.magic_eight_ball {
    requires javafx.controls;
    requires javafx.fxml;

    opens dev.lin_blackberry.magic_eight_ball to javafx.fxml;
    exports dev.lin_blackberry.magic_eight_ball;
}
