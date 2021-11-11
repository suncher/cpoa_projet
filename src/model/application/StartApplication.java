package model.application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;


		public class StartApplication extends Application {
			@Override
			public void start(Stage stage) throws IOException {
				Parent root = FXMLLoader.load(getClass().getResource("../../javafx/vue/FenetreAccueil.fxml"));
				Scene scene = new Scene(root);
				stage.setTitle("Gestion");
				stage.setScene(scene);
				stage.show();
				stage.setResizable(false);
			}

			public static void main(String[] args) {

				launch(args);
			}


}
