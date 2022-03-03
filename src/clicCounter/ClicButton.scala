package clicCounter

import scala.swing._
import event._

/**
 * A button for realizing a text-copy
 * @param lab the label of the button
 * @param from the Infield from which the text is copied
 * @param to the ResultText to which the text is copied
 */
class ClicButton(lab: String, countOne: Label) extends Button {

  text = lab
  

  // Ajout d'une reaction au clic sur le bouton
  // c'est à dire copier le contenu du champ from dans le label de to.
  reactions += {
    case ButtonClicked(_) => {
      val t = (((countOne.text).toInt) + 1).toString
      text = t + lab;
      countOne.text_=(t)
    }
  }

}