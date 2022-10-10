package components;

import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class CmpPasswordField extends JPasswordField {
  private Color fondocolor = Color.WHITE;

  public CmpPasswordField() {
    setBackground(new Color(255, 255, 0));
    setOpaque(false);
    setBorder(new EmptyBorder(5, 10, 5, 10));
    setColumns(10);

  }

  public Color getFondocolor() {
    return fondocolor;
  }

  public void setFondocolor(Color fondocolor) {
    this.fondocolor = fondocolor;
  }

  @Override
  protected void paintComponent(Graphics g) {
    int width = getWidth();
    int height = getHeight();

    Graphics2D g2 = (Graphics2D) g.create();

    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);

    g2.setColor(fondocolor);
    g2.fillRoundRect(0, 0, width, height, height, height);

    super.paintComponent(g);
  }
}
