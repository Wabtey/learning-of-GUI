package mechanicalCounter

import scala.swing._

class UI extends MainFrame {
  title = "Super Mechanical Counter 2000"
  preferredSize = new Dimension(200, 200)

  val wheel1 = new Label("0")
  val wheel2 = new Label("0")
  val wheel3 = new Label("0")

  contents = new BoxPanel(Orientation.Vertical) {
    contents += new BoxPanel(Orientation.Horizontal) {
      contents += wheel3
      contents += Swing.HStrut(10)
      contents += wheel2
      contents += Swing.HStrut(10)
      contents += wheel1
    }
    contents += new BoxPanel(Orientation.Horizontal) {
      contents += Button("add") {
        var count1 = wheel1.text.toInt
        if (count1 < 9) {
          count1 += 1
          wheel1.text = count1.toString
        } else {
          count1 = 0
          wheel1.text = count1.toString
          var count2 = wheel2.text.toInt
          if (count2 < 5) {
            count2 += 1
            wheel2.text = count2.toString
          } else {
            count2 = 0
            wheel2.text = count2.toString
            var count3 = wheel3.text.toInt
            if (count3 < 2) {
              count3 += 1
              wheel3.text = count3.toString
            } else {
              wheel3.text = "0"
            }
          }
        }
      }
      contents += Button("reset") {
        wheel1.text = "0"
        wheel2.text = "0"
        wheel3.text = "0"

      }
    }
    border = Swing.EmptyBorder(5, 5, 5, 5)
  }
}