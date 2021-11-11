package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class PaymentScreen extends Application {
	
	private final static String title = "CreditCard Info";
	
	private static Button createButton(String name, double prefW, double prefH) {
		Button btn = new Button(name);
		btn.setPrefWidth(prefW);
		btn.setPrefHeight(prefH);
		return btn;
	}
  
	@Override
    
public void start(Stage primaryStage2) {
		
		try {
			
			VBox root = new VBox();
			Scene scene2 = new Scene(root,500,800);
			StackPane titleBackground = new StackPane();			
			VBox fields = new VBox(15);			
			VBox buttons = new VBox(30);
			
			
			
			
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
			
			Image img = new Image(getClass().getResourceAsStream("image/drink/CreditCard.png"));
			ImageView imgView = new ImageView(img);
			imgView.setFitWidth(150);
			imgView.setFitHeight(150);
			fields.getChildren().addAll(imgView);
			
			
			Text card = new Text("Card Information");
			card.setFont(new Font("Arial", 24));
			card.setX(500);
			card.setY(400);
			
			
			TextField cardNum = new TextField();
			cardNum.setPromptText("0000-0000-0000-0000");
			cardNum.setMaxSize(250,50);
			cardNum.setFont(Font.font("Arial", FontWeight.NORMAL, 20));
			
			TextField cardDate = new TextField();
			cardDate.setPromptText("MM/YYYY");
			cardDate.setMaxSize(100,50);
			
			TextField cardCode = new TextField();
			cardCode.setPromptText("Security Code");
			cardCode.setMaxSize(100,50);
			
			
		
		
			Button Submit = createButton("Submit", 300,50);
			Submit.setStyle("-fx-background-color: #90EE90; ");
		
			Button goBack = createButton("Go Back", 300, 50);
			goBack.setStyle("-fx-background-color: #EF836B; ");
		
			
			
			root.setStyle("-fx-background-color: #f8e192");
			root.getChildren().addAll(titleBackground, fields, buttons);
			fields.getChildren().addAll(cardNum, cardDate, cardCode);
			buttons.getChildren().addAll(Submit,goBack);
			
			primaryStage2.setScene(scene2);
			primaryStage2.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
    

    public static void main(String[] args) {
        launch(args);
    }
}