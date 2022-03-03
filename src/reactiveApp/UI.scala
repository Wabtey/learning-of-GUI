package reactiveApp

import scala.swing._
import java.awt.Color

/**
 * MainFrame realizing the CopyThat application
 */
class UI extends MainFrame {

  // Propriétés de la fenêtre
  title = "My First Reactive Application!"
  preferredSize = new Dimension(500, 100)

  // Quelques champs définissant les composants
  val leftInput = new InField
  val rightInput = new InField
  val copyLeftToRight = new CopyButton("Copy That right!", leftInput, rightInput)
  val copyRightToLeft = new CopyButton("Copy this left!", rightInput, leftInput)

  // Ajout des composants à la fenêtre
  contents = new BoxPanel(Orientation.Horizontal) {
    background = Color.BLACK
    contents += leftInput
    contents += copyLeftToRight
    contents += copyRightToLeft
    contents += rightInput
  }

  //  prettyPrinter(leftInput.text)
  //
  //  def prettyPrinter(text: String)= {
  //    println("ui")
  //    if((text.size) >= 80) {
  //      text match {
  //        case "" => ""
  //        case a => a+"NowI'mInsideYou~<3"
  ////        case a1 + " " + a2 => a1+"\n"+prettyPrinter(a2)
  //      }
  //    }
  //  }

}