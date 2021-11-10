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

public class OrderMain extends Application {
	
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
		imgView.setFitWidth(140);
		imgView.setFitHeight(70);
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
			Image beelongImg = new Image(getClass().getResourceAsStream("image/drink/BeeLong.JPG"));
			Image blackSesameHojiImg = new Image(getClass().getResourceAsStream("image/drink/Black_Sesam_Hoji.JPG"));
			Image brownSugarMilkImg = new Image(getClass().getResourceAsStream("image/drink/brown_sugar_milk.JPG"));
			Image hongKongImg = new Image(getClass().getResourceAsStream("image/drink/Hong_Kong_MT.JPG"));
			Image houseCoffeeImg = new Image(getClass().getResourceAsStream("image/drink/House_coffee.JPG"));
			Image lavenderRoseImg = new Image(getClass().getResourceAsStream("image/drink/Lavender_Rose.JPG"));
			Image lycheeRefresherImg = new Image(getClass().getResourceAsStream("image/drink/Lychee_refresher.JPG"));
			Image matchaLatteImg = new Image(getClass().getResourceAsStream("image/drink/Matcha_Latte.JPG"));
			Image milkTriImg = new Image(getClass().getResourceAsStream("image/drink/Milk_Trifecta.JPG"));
			Image taroMilkImg = new Image(getClass().getResourceAsStream("image/drink/Taro_milk.JPG"));
			Image thaiCoffeeImg = new Image(getClass().getResourceAsStream("image/drink/Thai_coffee.JPG"));
			Image thaiTeaImg = new Image(getClass().getResourceAsStream("image/drink/Thai_tea.JPG"));
			Image vietCoffeeImg = new Image(getClass().getResourceAsStream("image/drink/Viet_coffee.JPG"));
			Image watermelonOatImg = new Image(getClass().getResourceAsStream("image/drink/Watermelon_Oat.JPG"));
			Image yokultImg = new Image(getClass().getResourceAsStream("image/drink/Yokult_Green_Tea.JPG"));
			
			Button beelongBtn = imgButton(beelongImg);
			Button blackSesameHojiBtn = imgButton(blackSesameHojiImg);
			Button brownSugarMilkBtn = imgButton(brownSugarMilkImg);
			Button hongKongBtn = imgButton(hongKongImg);
			Button houseCoffeeBtn = imgButton(houseCoffeeImg);
			Button lavenderRoseBtn = imgButton(lavenderRoseImg);
			Button lycheeRefresherBtn = imgButton(lycheeRefresherImg);
			Button matchaLatteBtn = imgButton(matchaLatteImg);
			Button milkTriBtn = imgButton(milkTriImg);
			Button taroMilkBtn = imgButton(taroMilkImg);
			Button thaiCoffeeBtn = imgButton(thaiCoffeeImg);
			Button thaiTeaBtn = imgButton(thaiTeaImg);
			Button vietCoffeeBtn = imgButton(vietCoffeeImg);
			Button watermelonOatBtn = imgButton(watermelonOatImg);
			Button yokultBtn = imgButton(yokultImg);
			
	        gridPane.add(beelongBtn, 0,1);
	        gridPane.add(blackSesameHojiBtn, 1,1);
	        gridPane.add(brownSugarMilkBtn, 2,1);
	        gridPane.add(hongKongBtn, 0, 2);
	        gridPane.add(houseCoffeeBtn, 1, 2);
	        gridPane.add(lavenderRoseBtn, 2, 2);
	        gridPane.add(lycheeRefresherBtn, 0, 3);
	        gridPane.add(matchaLatteBtn, 1, 3);
	        gridPane.add(milkTriBtn, 2, 3);
	        gridPane.add(taroMilkBtn, 0, 4);
	        gridPane.add(thaiCoffeeBtn, 1, 4);
	        gridPane.add(thaiTeaBtn, 2, 4);
	        gridPane.add(vietCoffeeBtn, 0, 5);
	        gridPane.add(watermelonOatBtn, 1, 5);
	        gridPane.add(yokultBtn, 2, 5);
	        gridPane.add(paneTitle, 0,0,2,1);
			
			btnInc(beelongBtn, lblView);
			btnInc(blackSesameHojiBtn, lblView);
			btnInc(brownSugarMilkBtn, lblView);
			btnInc(hongKongBtn, lblView);
			btnInc(houseCoffeeBtn, lblView);
			btnInc(lavenderRoseBtn, lblView);
			btnInc(lycheeRefresherBtn, lblView);
			btnInc(matchaLatteBtn, lblView);
			btnInc(milkTriBtn, lblView);
			btnInc(taroMilkBtn, lblView);
			btnInc(thaiCoffeeBtn, lblView);
			btnInc(thaiTeaBtn, lblView);
			btnInc(vietCoffeeBtn, lblView);
			btnInc(watermelonOatBtn, lblView);
			btnInc(yokultBtn, lblView);	
			
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
