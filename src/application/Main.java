package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override 
	public void start(Stage primaryStage) {
		try {
			SampleController samplecontroller= new SampleController() ;
			FXMLLoader Loader = new FXMLLoader();    
	    	Loader.setLocation(getClass().getClassLoader().getResource("application/Sample.fxml"));
	    	Loader.setController(samplecontroller);
	    	Loader.load();
	    	BorderPane root = Loader.getRoot();
			Scene scene = new Scene(root,1000,600);
			scene.getStylesheets().add("application/application.css");
			primaryStage.setTitle("LayItOut");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
