package application;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Main1Login extends Application {
	
	private final static String title = "Login";
	
	private static Button createButton(String name, double prefW, double prefH) {
		Button btn = new Button(name);
		btn.setPrefWidth(prefW);
		btn.setPrefHeight(prefH);
		return btn;
	}
	
	@Override
	public void start(Stage primaryStage) {
		
		try {
			
			VBox root = new VBox();
			Scene scene = new Scene(root,500,400);
			
			Label title = new Label("RevoTea");
			title.setFont(new Font("Arial", 48));
			title.setStyle("-fx-background-color: #d6d6d6");
			title.setPadding(new Insets(10, 150, 10, 150));
			title.setLineSpacing(10);
			root.setAlignment(Pos.CENTER);
			
			Label user = new Label("User:");
			TextField userField = new TextField();
			HBox innerUserHb = new HBox();
			innerUserHb.getChildren().addAll(user, userField);
			innerUserHb.setSpacing(10);
			
			Label password = new Label("Password:");
			TextField passField = new TextField();
			HBox innerPassHb = new HBox();
			innerUserHb.getChildren().addAll(password, passField);
			innerUserHb.setSpacing(10);
			
			Button login = createButton("login", 100, 50);
			Button signup = createButton("signup", 100, 50);
			Button checkout = createButton("checkout", 100, 50);
		
			root.setStyle("-fx-background-color: #f8e192");
			root.getChildren().addAll(title, innerUserHb, innerPassHb, login, signup, checkout);
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
