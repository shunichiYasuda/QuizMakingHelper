module com.genSci.tools.QuizMakingHelper {
    requires javafx.controls;
    requires javafx.fxml;
	requires javafx.graphics;
	requires javafx.base;
	requires juniversalchardet;

    opens com.genSci.tools.QuizMakingHelper to javafx.fxml;
    exports com.genSci.tools.QuizMakingHelper;
}