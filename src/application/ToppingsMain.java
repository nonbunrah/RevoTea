/*
 * Ripujit Bamrah, Eric Van, Tien Nguyen
 * 10/22/2021
 * 
 * This part of the program shows our login page with a title at the top, 
 * a username text field, a password textfield, and a login, sign up, and checkout as guest button below.
*/

package application;
	
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ToppingsMain extends Application {
	
	private final static String title = "Order";
	private int counter = 0; // initial counter value
	
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
		imgView.setFitWidth(90);
		imgView.setFitHeight(80);
		return btn;
	}
	
	public void btnInc(Button btn, Label lblView) {
		btn.setOnAction(event -> {
			lblView.setText("Items in Cart: " + (++counter));
		});
	}
	
	private GridPane createOrderPane() {
        // Instantiate a new Grid Pane
        GridPane gridPane = new GridPane();

        // Position the pane at the center of the screen, both vertically and horizontally
        gridPane.setAlignment(Pos.CENTER);

        // Set a padding of 20px on each side
        gridPane.setPadding(new Insets(40, 40, 40, 40));

        // Set the horizontal gap between columns
        gridPane.setHgap(10);

        // Set the vertical gap between rows
        gridPane.setVgap(10);

        // Add Column Constraints

        // columnOneConstraints will be applied to all the nodes placed in column one.
        ColumnConstraints columnOneConstraints = new ColumnConstraints(100, 100, Double.MAX_VALUE);
        columnOneConstraints.setHalignment(HPos.RIGHT);

        // columnTwoConstraints will be applied to all the nodes placed in column two.
        ColumnConstraints columnTwoConstraints = new ColumnConstraints(150, 100, Double.MAX_VALUE);
        columnTwoConstraints.setHalignment(HPos.CENTER);
        
        ColumnConstraints columnThreeConstraints = new ColumnConstraints(100, 100, Double.MAX_VALUE);
        columnThreeConstraints.setHalignment(HPos.LEFT);

        gridPane.getColumnConstraints().addAll(columnOneConstraints, columnTwoConstraints, columnThreeConstraints);

        return gridPane;
    }
	
	@Override
	public void start(Stage primaryStage) {
		
		try {
			
			// created multiple boxes to group nodes together
			Label paneTitle = new Label("Order");
			VBox root = new VBox();
			Scene scene = new Scene(root,500,800);
			StackPane titleBackground = new StackPane();
			VBox buttons = new VBox(5);
			Label lblView = new Label("Items in Cart: 0");
			HBox lblHolder = new HBox();
			
			GridPane gridPane = createOrderPane();
			
			// set image path variables
			Image blackBubbleImg = new Image(getClass().getResourceAsStream("image/topping/Black_bubble.JPG"));
			Image cheeseCreamImg = new Image(getClass().getResourceAsStream("image/topping/Cheese_cream.JPG"));
			Image coconutJellyImg = new Image(getClass().getResourceAsStream("image/topping/Coconut_Jelly.JPG"));
			Image coffeeJellyImg = new Image(getClass().getResourceAsStream("image/topping/Coffee_Jelly.JPG"));
			Image grassJellyImg = new Image(getClass().getResourceAsStream("image/topping/Grass_Jelly.JPG"));
			Image greenTeaJellyImg = new Image(getClass().getResourceAsStream("image/topping/GreenTea_Jelly.JPG"));
			Image lycheePoppingImg = new Image(getClass().getResourceAsStream("image/topping/Lychee_popping.JPG"));
			Image mangoJellyImg = new Image(getClass().getResourceAsStream("image/topping/Mango_Jelly.JPG"));
			Image mangoPoppingImg = new Image(getClass().getResourceAsStream("image/topping/Mango_popping.JPG"));
			Image puddingImg = new Image(getClass().getResourceAsStream("image/topping/Pudding.JPG"));
			Image rainbowJellyImg = new Image(getClass().getResourceAsStream("image/topping/Rainbow_Jelly.JPG"));
			Image redBeanImg = new Image(getClass().getResourceAsStream("image/topping/Red_Bean.JPG"));
			Image strawberryPoppingImg = new Image(getClass().getResourceAsStream("image/topping/Strawberry_popping.JPG"));
			Image whipCreamImg = new Image(getClass().getResourceAsStream("image/topping/Whip_cream.JPG"));
			Image whitePearlImg = new Image(getClass().getResourceAsStream("image/topping/White_pearl.JPG"));
			
			Button blackBubbleBtn = imgButton(blackBubbleImg);
			Button cheeseCreamBtn = imgButton(cheeseCreamImg);
			Button coconutJellyBtn = imgButton(coconutJellyImg);
			Button coffeeJellyBtn = imgButton(coffeeJellyImg);
			Button grassJellyBtn = imgButton(grassJellyImg);
			Button greenTeaJellyBtn = imgButton(greenTeaJellyImg);
			Button lycheePoppingBtn = imgButton(lycheePoppingImg);
			Button mangoJellyBtn = imgButton(mangoJellyImg);
			Button mangoPoppingBtn = imgButton(mangoPoppingImg);
			Button puddingBtn = imgButton(puddingImg);
			Button rainbowJellyBtn = imgButton(rainbowJellyImg);
			Button redBeanBtn = imgButton(redBeanImg);
			Button strawberryPoppingBtn = imgButton(strawberryPoppingImg);
			Button whipCreamBtn = imgButton(whipCreamImg);
			Button whitePearlBtn = imgButton(whitePearlImg);
			
	        gridPane.add(blackBubbleBtn, 0,1);
	        gridPane.add(cheeseCreamBtn, 1,1);
	        gridPane.add(coconutJellyBtn, 2,1);
	        gridPane.add(coffeeJellyBtn, 0, 2);
	        gridPane.add(grassJellyBtn, 1, 2);
	        gridPane.add(greenTeaJellyBtn, 2, 2);
	        gridPane.add(lycheePoppingBtn, 0, 3);
	        gridPane.add(mangoJellyBtn, 1, 3);
	        gridPane.add(mangoPoppingBtn, 2, 3);
	        gridPane.add(puddingBtn, 0, 4);
	        gridPane.add(rainbowJellyBtn, 1, 4);
	        gridPane.add(redBeanBtn, 2, 4);
	        gridPane.add(strawberryPoppingBtn, 0, 5);
	        gridPane.add(whipCreamBtn, 1, 5);
	        gridPane.add(whitePearlBtn, 2, 5);
	        gridPane.add(paneTitle, 0,0,2,1);
			
			// set styling and background color for nodes
			Text pageTitle = new Text("RevoTea");
			pageTitle.setFont(new Font("Arial", 48));
			titleBackground.setStyle("-fx-background-color: lightgray");
			lblHolder.getChildren().add(lblView);
			lblHolder.setStyle("-fx-text-alignment: center");
			lblHolder.setAlignment(Pos.CENTER);
			lblView.setAlignment(Pos.CENTER);
			paneTitle.setAlignment(Pos.CENTER);
			
			// added spacing between nodes
			root.setPadding(new Insets(20, 0, 0, 0));
			buttons.setAlignment(Pos.CENTER);
			buttons.setPadding(new Insets(50, 0, 0, 0));
			
			// added title to shape so we can have background color for application title
			titleBackground.getChildren().add(pageTitle);
			
			// created buttons for viewCart button
			Button viewCart = createButton("View Cart", 140, 30);
			
			// styled buttons
			viewCart.setFont(Font.font("Arial", FontWeight.NORMAL, 14));
		
			// added children scenes to parent
			root.setStyle("-fx-background-color: #f8e192");
			root.getChildren().addAll(titleBackground, gridPane, buttons);
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
