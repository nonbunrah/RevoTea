/*
 * Ripujit Bamrah, Eric Van, Tien Nguyen
 * 10/22/2021
 * 
 * This part of the program shows our login page with a title at the top, 
 * a username text field, a password textfield, and a login, sign up, and checkout as guest button below.
*/

package application;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class OrderConfirmMain extends Application {
	
	private final static String title = "Order";
	
	private static Button createButton(String name, double prefW, double prefH) {
		Button btn = new Button(name);
		btn.setPrefWidth(prefW);
		btn.setPrefHeight(prefH);
		return btn;
	}
	
	private static Button imgButton(Image img) {
		Button btn = new Button();
		ImageView imgView = new ImageView(img);
		btn.setGraphic(imgView);
		imgView.setFitWidth(140);
		imgView.setFitHeight(70);
		return btn;
	}
	
	@Override
	public void start(Stage primaryStage) {
		
		try {
			
			// created multiple boxes to group nodes together
			VBox root = new VBox();
			Scene scene = new Scene(root,500,800);
			StackPane titleBackground = new StackPane();
			VBox buttons = new VBox(5);
			HBox bobaButtonsRow1 = new HBox(3);
			HBox bobaButtonsRow2 = new HBox(3);
			HBox bobaButtonsRow3 = new HBox(3);
			HBox bobaButtonsRow4 = new HBox(3);
			HBox bobaButtonsRow5 = new HBox(3);
			VBox bobaButtons = new VBox(5);
			
			// set image path variables
			Image beelong = new Image(getClass().getResourceAsStream("image/drink/BeeLong.JPG"));
			Image blackSesameHoji = new Image(getClass().getResourceAsStream("image/drink/Black_Sesam_Hoji.JPG"));
			Image brownSugarMilk = new Image(getClass().getResourceAsStream("image/drink/brown_sugar_milk.JPG"));
			
			Image hongKong = new Image(getClass().getResourceAsStream("image/drink/Hong_Kong_MT.JPG"));
			Image houseCoffee = new Image(getClass().getResourceAsStream("image/drink/House_coffee.JPG"));
			Image lavenderRose = new Image(getClass().getResourceAsStream("image/drink/Lavender_Rose.JPG"));
			Image lycheeRefresher = new Image(getClass().getResourceAsStream("image/drink/Lychee_refresher.JPG"));
			Image matchaLatte = new Image(getClass().getResourceAsStream("image/drink/Matcha_Latte.JPG"));
			Image milkTri = new Image(getClass().getResourceAsStream("image/drink/Milk_Trifecta.JPG"));
			Image taroMilk = new Image(getClass().getResourceAsStream("image/drink/Taro_milk.JPG"));
			Image thaiCoffee = new Image(getClass().getResourceAsStream("image/drink/Thai_coffee.JPG"));
			Image thaiTea = new Image(getClass().getResourceAsStream("image/drink/Thai_tea.JPG"));
			Image vietCoffee = new Image(getClass().getResourceAsStream("image/drink/Viet_coffee.JPG"));
			Image watermelonOat = new Image(getClass().getResourceAsStream("image/drink/Watermelon_Oat.JPG"));
			Image yokult = new Image(getClass().getResourceAsStream("image/drink/Yokult_Green_Tea.JPG"));
			
			// create image buttons
			bobaButtonsRow1.getChildren().addAll(
				imgButton(beelong), 
				imgButton(blackSesameHoji),
				imgButton(brownSugarMilk)
			);
			
			bobaButtonsRow2.getChildren().addAll(
				imgButton(hongKong),
				imgButton(houseCoffee),
				imgButton(lavenderRose)
			);
			
			bobaButtonsRow3.getChildren().addAll(
				imgButton(lycheeRefresher),
				imgButton(matchaLatte),
				imgButton(milkTri)
			);
			
			bobaButtonsRow4.getChildren().addAll(
				imgButton(taroMilk),
				imgButton(thaiCoffee),
				imgButton(thaiTea)
			);
			
			bobaButtonsRow5.getChildren().addAll(
				imgButton(vietCoffee),
				imgButton(watermelonOat),
				imgButton(yokult)
			);
			
			
			
			// set styling and background color for nodes
			Text pageTitle = new Text("RevoTea");
			pageTitle.setFont(new Font("Arial", 48));
			titleBackground.setStyle("-fx-background-color: lightgray");
			
			// added spacing between nodes
			root.setPadding(new Insets(20, 0, 0, 0));
			buttons.setAlignment(Pos.CENTER);
			buttons.setPadding(new Insets(50, 0, 0, 0));
			
			bobaButtons.getChildren().addAll(bobaButtonsRow1, bobaButtonsRow2, bobaButtonsRow3, bobaButtonsRow4, bobaButtonsRow5);
			bobaButtons.setAlignment(Pos.CENTER);
			bobaButtons.setPadding(new Insets(50, 0, 0, 10));
			
			// added title to shape so we can have background color for application title
			titleBackground.getChildren().add(pageTitle);
			
			// created buttons for viewCart button
			Button viewCart = createButton("View Cart", 140, 30);
			
			// styled buttons
			viewCart.setFont(Font.font("Arial", FontWeight.NORMAL, 14));
		
			// added children scenes to parent
			root.setStyle("-fx-background-color: #f8e192");
			root.getChildren().addAll(titleBackground, bobaButtons, buttons);
			buttons.getChildren().addAll(viewCart);
			primaryStage.setScene(scene);
			primaryStage.setTitle(title);
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
