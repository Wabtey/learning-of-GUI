package firstGUIapp

// Imports needed for working with Swing in Scala
import scala.swing._
import scala.swing.MainFrame

/** Simple application for a smooth Scala/Swing introduction
 */
object MyFirstGUIApp extends SimpleSwingApplication {

  /* top method : returns a Main Frame, that is
   * open when the swing application starts
   * this method is required for extending a 
   * SimpleSwingApplication */
    val text : String = readLine("Votre label est : ");
  def top : MainFrame = new UI(text)
  

  println("End of object constructor, but the program keeps running!!")
  
}