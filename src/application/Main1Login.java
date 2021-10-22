package application;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
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
			Scene scene = new Scene(root,350,500);
			StackPane titleBackground = new StackPane();
			VBox fields = new VBox(5);
			VBox buttons = new VBox(5);
	
			Text title = new Text("RevoTea");
			title.setFont(new Font("Arial", 48));
			title.setStyle("-fx-background-color: #d6d6d6" + "-fx-font-weight: bold");
			titleBackground.setStyle("-fx-background-color: lightgray");
			root.setPadding(new Insets(20, 0, 0, 0));
			fields.setAlignment(Pos.CENTER);
			fields.setPadding(new Insets(100, 0, 0, 0));
			buttons.setAlignment(Pos.CENTER);
			buttons.setPadding(new Insets(50, 0, 0, 0));
			
			titleBackground.getChildren().add(title);
			
			TextField userField = new TextField();
			userField.setPromptText("Username");
			userField.setMaxSize(250,50);
			userField.setFont(Font.font("Arial", FontWeight.NORMAL, 20));
			
			TextField passField = new TextField();
			passField.setPromptText("Password");
			passField.setMaxSize(250,50);
			passField.setFont(Font.font("Arial", FontWeight.NORMAL, 20));
			
			Button login = createButton("Login", 140, 30);
			Button signup = createButton("Sign Up", 140, 30);
			Button checkout = createButton("Checkout as Guest", 140, 30);
			login.setFont(Font.font("Arial", FontWeight.NORMAL, 14));
			signup.setFont(Font.font("Arial", FontWeight.NORMAL, 14));
			checkout.setFont(Font.font("Arial", FontWeight.NORMAL, 14));
		
			root.setStyle("-fx-background-color: #f8e192");
			root.getChildren().addAll(titleBackground, fields, buttons);
			buttons.getChildren().addAll(login, signup, checkout);
			fields.getChildren().addAll(userField, passField);
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
