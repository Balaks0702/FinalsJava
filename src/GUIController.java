import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Set;

public class GUIController implements Initializable
{
    CarLoader carLoader;

    @FXML private TableView<Car> table;

    @FXML private TableColumn<Car, Integer> year;

    @FXML private TableColumn<Car, String> brand;

    @FXML private TableColumn<Car, String> model;

    @FXML private TableColumn<Car, String> kilometers;

    @FXML private TableColumn<Car, Double> price;

    @FXML private Button sell;

    @FXML private ImageView imageView;

    @FXML private ChoiceBox<?> brandBox;

    @FXML private Label inventory;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML public void selectBrand(String brand)
    {

    }
}

