import javafx.collections.FXCollections;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;

public class ElectronicStoreView extends Application{
//    private ElectronicStore model;

    public void start (Stage primarystage){
        Pane  aPane = new Pane();

        //create labels
        Label storeSummary = new Label("Store Summary:");
        storeSummary.relocate(70, 25);
        Label numSales = new Label("# Sales:");
        numSales.relocate(26, 55);
        Label revenue = new Label("Revenue:");
        revenue.relocate(20, 95);
        Label moneyPerSale = new Label("$ / Sale:");
        moneyPerSale.relocate(25, 135);
        Label mostPopItem = new Label("Most Popular Items:");
        mostPopItem.relocate(60, 175);
        Label storeStock = new Label("Store Stock:");
        storeStock.relocate(340, 25);
        Label currentCart = new Label("Current Cart:");
        currentCart.relocate(620, 25);

        //create lists
        ListView<Product> stockList = new ListView<>();
        //stockList.setItems(FXCollections.observableArrayList(model.getStock()));
        stockList.setPrefSize(270, 280);
        stockList.relocate(240, 50);

        ListView<Product> cartList = new ListView<>();
        //cartList.setItems(FXCollections.observableArrayList(model.smth));
        cartList.setPrefSize(270, 280);
        cartList.relocate(520, 50);

        ListView<Product> popularItemList = new ListView<>();
        //popularItemList.setItems(FXCollections.observableArrayList(model.smth));
        popularItemList.setPrefSize(200, 130);
        popularItemList.relocate(20, 200);

        //create text fields
        TextField salesInput = new TextField();
        salesInput.setPrefSize(120, 30);
        salesInput.relocate(80, 50);

        TextField revenueInput = new TextField();
        revenueInput.setPrefSize(120, 30);
        revenueInput.relocate(80, 90);

        TextField moneySaleInput = new TextField();
        moneySaleInput.setPrefSize(120, 30);
        moneySaleInput.relocate(80, 130);

        //create buttons
        Button resetStore = new Button("Reset Store");
        resetStore.setPrefSize(130, 40);
        resetStore.relocate(55, 340);

        Button addToCart = new Button("Add to Cart");
        addToCart.setPrefSize(130, 40);
        addToCart.relocate(310, 340);

        Button removeFromCart = new Button("Remove from Cart");
        removeFromCart.setPrefSize(130, 40);
        removeFromCart.relocate(520, 340);

        Button completeSale = new Button("Complete Sale");
        completeSale.setPrefSize(130, 40);
        completeSale.relocate(660, 340);

        //add to pane
        aPane.getChildren().addAll(storeSummary, numSales, revenue, moneyPerSale, mostPopItem, storeStock, currentCart,
                salesInput, revenueInput, moneySaleInput, resetStore, addToCart, removeFromCart, completeSale,
                stockList, cartList, popularItemList);
        //set window title and size
        primarystage.setTitle("Electronic Store");
        primarystage.setScene(new Scene(aPane, 800,400));
        primarystage.show();
    }
    public static void main (String[] args){
        launch(args);
    }
}
