/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package segovia_3_methodmadness;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;


public class Segovia_3_MethodMadness extends Application {
    
    public static void main(String[] ergs){
        launch(ergs);
    }
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Drawing Operations Test");
        Group root = new Group();
        Canvas canvas = new Canvas(300, 250);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        drawShapes(gc);
        drawText(gc);
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    private void drawText(GraphicsContext gc) {
        gc.fillText("My Face", 95, 10);
    }
   
    private void drawShapes(GraphicsContext gc) {
        gc.setFill(Color.RED);
        gc.setStroke(Color.BLUE);
        gc.setLineWidth(5);
        gc.strokeLine(45, 35, 90, 50);
        gc.strokeLine(195, 35, 150, 50);
        gc.strokeLine(30, 50, 45, 35);
        gc.strokeLine(210, 50, 195, 35);
        gc.fillOval(60, 60, 30, 30);
        gc.strokeOval(60, 60, 30, 30);
        gc.fillOval(150, 60, 30, 30);
        gc.strokeOval(150, 60, 30, 30);
        gc.fillPolygon(new double[]{125, 100, 150  },
                       new double[]{100, 125, 125  }, 3);
        gc.strokePolygon(new double[]{125, 100, 150  },
                       new double[]{100, 125, 125  }, 3);

        gc.strokeArc(75, 175, 90, 45, 35, 125, ArcType.OPEN);


    }
}
              