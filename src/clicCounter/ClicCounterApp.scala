package clicCounter

// Imports needed for working with Swing in Scala
import scala.swing._
import scala.swing.MainFrame

/** Simple application that copies an input text to another text component
 */
object ClicCounterApp extends SimpleSwingApplication {

  def top : MainFrame = new UI
  
}