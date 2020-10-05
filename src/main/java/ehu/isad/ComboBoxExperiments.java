package ehu.isad;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class ComboBoxExperiments extends Application  {

    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("ComboBox Experiment 1");

        Text testua = new Text();
        testua.setFont(new Font(12));
        testua.setX(20);
        testua.setY(20);

        ComboBox comboBox = new ComboBox();

        comboBox.getItems().add("BTC");
        comboBox.getItems().add("ETH");
        comboBox.getItems().add("LTC");

        comboBox.setEditable(true);

        comboBox.setOnAction(e -> {

            float balioa = KriptoMonetenApp.zenbatBalioDu((String)comboBox.getValue());
            //System.out.println( comboBox.getValue());
            //System.out.println(balioa);
            testua.setText("1 "+(String)comboBox.getValue()+"="+
                    KriptoMonetenApp.zenbatBalioDu((String)comboBox.getValue()));
        });


        VBox vbox = new VBox(testua, comboBox);

        Scene scene = new Scene(vbox, 200, 120);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
