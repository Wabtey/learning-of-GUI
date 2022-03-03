package clicCounter

import scala.swing._
import java.awt.Color

/**
 * MainFrame realizing the CopyThat application
 */
class UI extends MainFrame {

  // Propriétés de la fenêtre
  title = "My Second Reactive Application!"
  preferredSize = new Dimension(500, 200)
  var countOne = new Label("0")
  var countTwo = new Label("0")
  val counterOne = new ClicButton(" Joseph", countOne)
  val counterTwo = new ClicButton(" Jotaro", countTwo)

  // Ajout des composants à la fenêtre
  contents = new BoxPanel(Orientation.Vertical) {
    contents += new BoxPanel(Orientation.Horizontal) {
      contents += counterOne

      contents += Button("reset the first counter") {
        counterOne.text = (counterOne.text.split(" ").drop(1).mkString)
        countOne.text = ("0")
      }
    }

    contents += Swing.VStrut(5)

    contents += new BoxPanel(Orientation.Horizontal) {
      contents += counterTwo

      contents += Button("reset the second counter") {
        counterTwo.text = (counterTwo.text.split(" ").drop(1).mkString)
        countTwo.text_=("0")
      }
    }
  }

}