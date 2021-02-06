package application;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class SampleController implements Initializable { 
	
	   
	   @FXML
		private AnchorPane anchpane;

	   @FXML
	    private TabPane mainpane;
	   
	    @FXML
	    private AnchorPane homepageanch;
	   
	   @FXML
	    private Tab brochure;
	   
	   @FXML
	    private AnchorPane brochureanch;

	    @FXML
	    private Tab essay;
	    @FXML
	    private AnchorPane essayanch;

	    @FXML
	    private Tab infographic;
	    
	    @FXML
	    private AnchorPane infographicanch;
	   

	    @FXML
	    private Tab poster;
	    
	    @FXML
	    private AnchorPane posteranch;

	   @FXML 
	    private Tab powerpoint;
	   
	   @FXML
	    private AnchorPane powerpointanch;
	   
	    @FXML
	    private AnchorPane profileanch;
	    
	    private static Stage stg;
	    public Scene scene;
	    
	    
	    @FXML
	   public void infop2(ActionEvent event) throws IOException  {
			SampleController samplecontroller= new SampleController() ;
	    	FXMLLoader Loader = new FXMLLoader();    
	    	Loader.setLocation(getClass().getClassLoader().getResource("application/infop2.fxml"));
	    	Loader.setController(samplecontroller);
	    	Loader.load();
	    	AnchorPane root = Loader.getRoot();
	    	infographicanch.getChildren().setAll(root); 	
	    }
	    
	    
	    @FXML
		   public void infop3(ActionEvent event) throws IOException  {
				SampleController samplecontroller= new SampleController() ;
		    	FXMLLoader Loader = new FXMLLoader();    
		    	Loader.setLocation(getClass().getClassLoader().getResource("application/infop3.fxml"));
		    	Loader.setController(samplecontroller);
		    	Loader.load();
		    	AnchorPane root = Loader.getRoot();
		    	infographicanch.getChildren().setAll(root); 	
		    }
	    
	   
	    @FXML
		   public void infop4(ActionEvent event) throws IOException  {
				SampleController samplecontroller= new SampleController() ;
		    	FXMLLoader Loader = new FXMLLoader();    
		    	Loader.setLocation(getClass().getClassLoader().getResource("application/infop4.fxml"));
		    	Loader.setController(samplecontroller);
		    	Loader.load();
		    	AnchorPane root = Loader.getRoot();
		    	infographicanch.getChildren().setAll(root); 	
		    }
	        
	    @FXML
		   public void infop5(ActionEvent event) throws IOException  {
				SampleController samplecontroller= new SampleController() ;
		    	FXMLLoader Loader = new FXMLLoader();    
		    	Loader.setLocation(getClass().getClassLoader().getResource("application/infop5.fxml"));
		    	Loader.setController(samplecontroller);
		    	Loader.load();
		    	AnchorPane root = Loader.getRoot();
		    	infographicanch.getChildren().setAll(root); 	
		    }
	    
	    @FXML
		   public void infop6(ActionEvent event) throws IOException  {
				SampleController samplecontroller= new SampleController() ;
		    	FXMLLoader Loader = new FXMLLoader();    
		    	Loader.setLocation(getClass().getClassLoader().getResource("application/infop6.fxml"));
		    	Loader.setController(samplecontroller);
		    	Loader.load();
		    	AnchorPane root = Loader.getRoot();
		    	infographicanch.getChildren().setAll(root); 	
		    }
	        
	    @FXML
		   public void infop7(ActionEvent event) throws IOException  {
				SampleController samplecontroller= new SampleController() ;
		    	FXMLLoader Loader = new FXMLLoader();    
		    	Loader.setLocation(getClass().getClassLoader().getResource("application/infop7.fxml"));
		    	Loader.setController(samplecontroller);
		    	Loader.load();
		    	AnchorPane root = Loader.getRoot();
		    	infographicanch.getChildren().setAll(root); 	
		    }
	        
	    @FXML
		   public void infop8(ActionEvent event) throws IOException  {
				SampleController samplecontroller= new SampleController() ;
		    	FXMLLoader Loader = new FXMLLoader();    
		    	Loader.setLocation(getClass().getClassLoader().getResource("application/infop8.fxml"));
		    	Loader.setController(samplecontroller);
		    	Loader.load();
		    	AnchorPane root = Loader.getRoot();
		    	infographicanch.getChildren().setAll(root); 	
		    }
	    
	    @FXML
		   public void Infoquiz (ActionEvent event) throws IOException  {
	    	try {
				AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("Infoquiz.fxml"));
				Scene scene = new Scene(root,1000,600);
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				Stage newStage = new Stage();
				newStage.setTitle("Quiz");
				newStage.setResizable(false);
				newStage.setScene(scene);
				newStage.show();
			} catch(Exception e) {
				e.printStackTrace();
			}
		    	
		    }
	    
	    
	    
	    @FXML
	    public void QuizBtn(ActionEvent toQuiz){
			
			try {
				AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("essayquiz.fxml"));
				Scene scene = new Scene(root,1000,600);
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				Stage newStage = new Stage();
				newStage.setTitle("Essay Quiz");
				newStage.setResizable(false);
				newStage.setScene(scene);
				newStage.show();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	    
	@Override
    public void initialize(URL url, ResourceBundle rb) {
    			
    }
}