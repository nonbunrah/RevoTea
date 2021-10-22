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
			Scene scene = new Scene(root,500,400);
			StackPane titleBackground = new StackPane();
			VBox rootMinusTitle = new VBox(5);
	
			Text title = new Text("RevoTea");
			title.setFont(new Font("Arial", 48));
			title.setStyle("-fx-background-color: #d6d6d6" + "-fx-font-weight: bold");
			titleBackground.setStyle("-fx-background-color: lightgray");
			rootMinusTitle.setAlignment(Pos.TOP_CENTER);
			rootMinusTitle.setPadding(new Insets(20, 0, 0, 0));
			
			titleBackground.getChildren().add(title);
			
			TextField userField = new TextField();
			userField.setPromptText("Username");
			
			TextField passField = new TextField();
			passField.setPromptText("Password");
			
			Button login = createButton("login", 70, 30);
			Button signup = createButton("signup", 70, 30);
			Button checkout = createButton("checkout", 70, 30);
		
			root.setStyle("-fx-background-color: #f8e192");
			root.getChildren().addAll(titleBackground, rootMinusTitle);
			rootMinusTitle.getChildren().addAll(userField, passField, login, signup, checkout);
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
