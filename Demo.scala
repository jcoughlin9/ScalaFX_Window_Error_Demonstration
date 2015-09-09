import javafx.embed.swing.JFXPanel
import scalafx.application.Platform
import scalafx.scene.Scene
import scalafx.scene.control.Label
import scalafx.stage.Stage

new JFXPanel

// Open the first window
Platform.runLater {
  val stage = new Stage {
    title = "Stage 1"
    width = 300
    height = 200

    scene = new Scene {
      root = new Label("Stage 1")
    }
  }

  stage.showAndWait()
}

// Wait 3 seconds to give time to drag the first window around
Thread sleep 3000

// Open the second window
Platform.runLater {
  val stage = new Stage {
    title = "Stage 2"
    width = 300
    height = 200

    scene = new Scene {
      root = new Label("Stage 2")
    }
  }

  stage.showAndWait()
}
