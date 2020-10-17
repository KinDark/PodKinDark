import dao.CityDao;
import dao.CityDaoFile;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import model.City;
import service.CityService;
import service.CityServiceFile;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GraphCitiesApp extends Application {
    static CityDao dao;
    static CityService service;
    public static Logger logger = Logger.getLogger(GraphCitiesApp.class.getName());
    public static void main(String[] args) throws IOException {
        logger.addHandler(new FileHandler("cities"));
        launch();
    }
    public void start(Stage primaryStage) throws Exception {
        GridPane root = new GridPane();
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
        Button loadBtn = new Button("Wczytaj");
        loadBtn.setAlignment(Pos.CENTER);
        ListView<City> citiesList = new ListView<>();
        HBox row = new HBox();
        row.getChildren().add(loadBtn);
        Label label = new Label("Plik: ");
        row.getChildren().add(label);
        row.setAlignment(Pos.CENTER);
        row.setSpacing(10);
        root.add(row, 0,0);
        HBox filterBox= new HBox();
        ComboBox<String> countryCodeBox = new ComboBox<>();
        filterBox.getChildren().add(countryCodeBox);
        root.add(filterBox,0,1);
        root.add(citiesList, 0, 2);
        root.setVgap(10);
        root.setPadding(new Insets(10));
        root.setAlignment(Pos.CENTER);
        countryCodeBox.setOnAction(event -> {
            String code = countryCodeBox.getSelectionModel().getSelectedItem();
            if( "All".equals(code)) {
                citiesList.getItems().clear();
                citiesList.getItems().addAll(dao.findAll());
                return;
            }
            citiesList.getItems().clear();
            citiesList.getItems().addAll(service.findByCountryCode(code));
        });
        loadBtn.setOnAction(event -> {
            try {
                FileChooser fileChooser = new FileChooser();
                fileChooser.showOpenDialog(primaryStage);
                dao = new CityDaoFile("cities500.txt");
                service = new CityServiceFile(dao);
                citiesList.getItems().addAll(dao.findAll());
                label.setText("C:\\Users\\Programowanie\\Desktop\\Data\\cities500.txt");
                countryCodeBox.getItems().add("All");
                countryCodeBox.getItems().addAll(service.findCountryCodes());
                logger.log(Level.INFO,"Wczytano plik " + "C:\\Users\\Programowanie\\Desktop\\Data\\cities500.txt");
            } catch (IOException e) {
                System.out.println("Błąd odczytu pliki!!!");
            }
        });
    }
}