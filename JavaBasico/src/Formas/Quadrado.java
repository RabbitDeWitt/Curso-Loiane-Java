package Formas;

public class Quadrado extends Figura2D{
  private double lado;

  public double getLado() {
    return lado;
  }

  public void setLado(double lado) {
    this.lado = lado;
  }

  @Override
  public double calcularArea() {
    double area = Math.pow(this.getLado(), 2);
    return area;
  }
}
