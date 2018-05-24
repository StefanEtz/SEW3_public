import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Label l1_1 = new Label("HTBLA_WELS");
        l1_1.setStyle("-fx-font: 20 verdana");

        final ToggleGroup group1 = new ToggleGroup();

        //Button zur Auswahl der Höheren Abteilung
        RadioButton r1_1_HA = new RadioButton("Höhere Abteilung");
        r1_1_HA.setToggleGroup(group1);

        //Button zur Auswahl der Fachschule
        RadioButton r1_2_FS = new RadioButton("Fachschule");
        r1_2_FS.setToggleGroup(group1);

        //Eine Box um die Buttons herum
        VBox radiobuttonbox1 = new VBox(r1_1_HA, r1_2_FS);

        Label l1_2 = new Label("für:");

        //Dropdownmenü zur Auswahl der Abteilungen!
        ObservableList<String> options =
                FXCollections.observableArrayList("IT", "CH", "ET", "MB", "MT");
        final ComboBox comboBox = new ComboBox(options);
        //ende Dropdown

        Label l1_3 = new Label("2018/19");

        //Daraus ergibt sich die erste Zeile (Hbox)
        HBox ersteZeile = new HBox(10, l1_1, radiobuttonbox1, l1_2, comboBox, l1_3);


        //Nachname-Feld
        Label l2_1 = new Label("Familienname: ");
        TextField tf2_1 = new TextField();

        //Vorname-Feld
        Label l2_2 = new Label("Vorname: ");
        TextField tf2_2 = new TextField();

        //Geburtsdatum
        Label l2_3 = new Label("Geboren am: ");
        TextField tf2_3 = new TextField();

        //Geboren in Ort
        Label l2_4 = new Label("Geboren in Ort: ");
        TextField tf2_4 = new TextField();

        //Bezirk des Ortes
        Label l2_5 = new Label("Bezirk des Wohnortes: ");
        TextField tf2_5 = new TextField();

        //Geboren in Land
        Label l2_6 = new Label("Geboren in Land: ");
        TextField tf2_6 = new TextField();

        //Schulpflicht
        Label l2_7 = new Label("Schulpflicht erfüllt: ");
        RadioButton r2_1_Schulpflicht = new RadioButton("Ja!");
        RadioButton r2_2_Schulpflicht = new RadioButton("Nein!");

        final ToggleGroup group2 = new ToggleGroup();

        r2_1_Schulpflicht.setToggleGroup(group2);
        r2_2_Schulpflicht.setToggleGroup(group2);

        VBox Radiobuttonbox2 = new VBox(r2_1_Schulpflicht, r2_2_Schulpflicht);

        //Staatsbürgerschaft, aus welchem Land
        CheckBox cb2_1 = new CheckBox();
        CheckBox cb2_2 = new CheckBox();
        Label l2_8 = new Label("Österreich");
        TextField tf2_7 = new TextField("...");

        Label l2_9 = new Label("Staatsbürgerschaft: ");

        HBox Staatsbürgerschaft_Box1 = new HBox(cb2_1, l2_8);
        HBox Staatsbürgerschaft_Box2 = new HBox(cb2_2, tf2_7);
        VBox Staatsbürgerschaft_VBox1 = new VBox(Staatsbürgerschaft_Box1, Staatsbürgerschaft_Box2);

        //Auswahl Muttersprache
        CheckBox cb2_3 = new CheckBox();
        CheckBox cb2_4 = new CheckBox();
        Label l2_10 = new Label("Deutsch");
        TextField tf2_8 = new TextField("...");
        Label l2_11 = new Label("Muttersprache: ");
        HBox Muttersprache_Box1 = new HBox(cb2_3, l2_10);
        HBox Muttersprache_Box2 = new HBox(cb2_4, tf2_8);
        VBox Muttersprache_VBox1 = new VBox(Muttersprache_Box1, Muttersprache_Box2);

        //Auswahl der Glaubens-Bekenntnisses
        CheckBox cb2_5 = new CheckBox();
        CheckBox cb2_6 = new CheckBox();
        Label l2_12 = new Label("Röm-kat.");
        TextField tf2_9 = new TextField("...");
        Label l2_13 = new Label("Bekenntnis: ");
        HBox Bekenntnis_Box1 = new HBox(cb2_5, l2_12);
        HBox Bekenntnis_Box2 = new HBox(cb2_6, tf2_9);
        VBox Bekenntnis_VBox1 = new VBox(Bekenntnis_Box1, Bekenntnis_Box2);

        //Auswahl des jeweiligen Gemeindeamtes
        Label Gemeindeamt_label1 = new Label("Zuständiges Gemeindeamt: ");
        TextField Gemeindeamt_textfield1 = new TextField();


        //Eingabe der Sozialversicherungsnummer
        Label Svr_label1 = new Label("SVR-Nr: ");
        TextField Svr_textfield1 = new TextField();


        GridPane gridPane_Daten1 = new GridPane();

        //konkrete Eingabe des Nachnamen
        gridPane_Daten1.getChildren().add(l2_1);
        gridPane_Daten1.setConstraints(l2_1, 1, 1);
        gridPane_Daten1.getChildren().add(tf2_1);
        gridPane_Daten1.setConstraints(tf2_1, 2, 1);


        //konkrete Eingabe des Vornamen
        gridPane_Daten1.getChildren().add(l2_2);
        gridPane_Daten1.setConstraints(l2_2, 1, 2);
        gridPane_Daten1.getChildren().add(tf2_2);
        gridPane_Daten1.setConstraints(tf2_2, 2, 2);

        //konkrete Eingabe des Geburtsdatums
        gridPane_Daten1.getChildren().add(l2_3);
        gridPane_Daten1.setConstraints(l2_3, 1, 3);
        gridPane_Daten1.getChildren().add(tf2_3);
        gridPane_Daten1.setConstraints(tf2_3, 2, 3);

        //geboren in Eingabe
        gridPane_Daten1.getChildren().add(l2_4);
        gridPane_Daten1.setConstraints(l2_4, 1, 4);
        gridPane_Daten1.getChildren().add(tf2_4);
        gridPane_Daten1.setConstraints(tf2_4, 2, 4);

        //konkrete Eingabe des Bezirks
        gridPane_Daten1.getChildren().add(l2_5);
        gridPane_Daten1.setConstraints(l2_5, 1, 5);
        gridPane_Daten1.getChildren().add(tf2_5);
        gridPane_Daten1.setConstraints(tf2_5, 2, 5);

        //konkrete Eingabe des Landes
        gridPane_Daten1.getChildren().add(l2_6);
        gridPane_Daten1.setConstraints(l2_6, 1, 6);
        gridPane_Daten1.getChildren().add(tf2_6);
        gridPane_Daten1.setConstraints(tf2_6, 2, 6);

        //Schulpflicht - ja, nein
        gridPane_Daten1.getChildren().add(l2_7);
        gridPane_Daten1.setConstraints(l2_7, 3, 1);
        gridPane_Daten1.getChildren().add(Radiobuttonbox2);
        gridPane_Daten1.setConstraints(Radiobuttonbox2, 4, 1);

        //konkrete Eingabe des Nachnamen
        gridPane_Daten1.getChildren().add(l2_9);
        gridPane_Daten1.setConstraints(l2_9, 3, 2);
        gridPane_Daten1.getChildren().add(Staatsbürgerschaft_VBox1);
        gridPane_Daten1.setConstraints(Staatsbürgerschaft_VBox1, 4, 2);

        //konkrete Eingabe der Muttersprache
        gridPane_Daten1.getChildren().add(l2_11);
        gridPane_Daten1.setConstraints(l2_11, 3, 3);
        gridPane_Daten1.getChildren().add(Muttersprache_VBox1);
        gridPane_Daten1.setConstraints(Muttersprache_VBox1, 4, 3);

        //konkrete Eingabe des Bekenntnisses
        gridPane_Daten1.getChildren().add(l2_13);
        gridPane_Daten1.setConstraints(l2_13, 3, 4);
        gridPane_Daten1.getChildren().add(Bekenntnis_VBox1);
        gridPane_Daten1.setConstraints(Bekenntnis_VBox1, 4, 4);

        //konkrete Eingabe des Gemeindeamtes
        gridPane_Daten1.getChildren().add(Gemeindeamt_label1);
        gridPane_Daten1.setConstraints(Gemeindeamt_label1, 3, 5);
        gridPane_Daten1.getChildren().add(Gemeindeamt_textfield1);
        gridPane_Daten1.setConstraints(Gemeindeamt_textfield1, 4, 5);

        //konkrete Eingabe der Sozialversicherungsnummer
        gridPane_Daten1.getChildren().add(Svr_label1);
        gridPane_Daten1.setConstraints(Svr_label1, 3, 6);
        gridPane_Daten1.getChildren().add(Svr_textfield1);
        gridPane_Daten1.setConstraints(Svr_textfield1, 4, 6);

        //Anzeigen der Linie des Formulares
        gridPane_Daten1.setGridLinesVisible(true);

        VBox Mainbox = new VBox(ersteZeile, gridPane_Daten1);

        //Höhe und Breite wird eingestellt
        Mainbox.setPrefSize(1500, 1000);
        Scene scene = new Scene(Mainbox);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
