package components;

import javax.swing.JButton;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Cursor;

public class CmpButton extends JButton {

  private Color fontColor;
  private Color fondoColor;
  private Color bordeColor;

  public Color getFontColor() {
    return fontColor;
  }

  public void setFontColor(Color fontColor) {
    this.fontColor = fontColor;
  }

  public Color getFondoColor() {
    return fondoColor;
  }

  public void setFondoColor(Color fondoColor) {
    this.fondoColor = fondoColor;
  }

  public Color getBordeColor() {
    return bordeColor;
  }

  public void setBordeColor(Color bordeColor) {
    this.bordeColor = bordeColor;
  }

  public CmpButton() {
    setContentAreaFilled(false);
    setBorderPainted(false);
    setFocusPainted(false);
    setCursor(new Cursor(Cursor.HAND_CURSOR));

    fondoColor = Color.white;
    bordeColor = Color.blue;
  }

  @Override
  protected void paintComponent(Graphics g) {
    Graphics2D g2 = (Graphics2D) g.create();
    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

    g2.setColor(bordeColor);
    g2.fillRoundRect(0, 0, getWidth(), getHeight(), getHeight(), getHeight());

    g2.setColor(fondoColor);
    g2.fillRoundRect(2, 2, getWidth() - 4, getHeight() - 4, getHeight(), getHeight());

    super.paintComponent(g);
  }

}
