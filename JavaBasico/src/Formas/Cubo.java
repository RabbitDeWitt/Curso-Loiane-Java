package Formas;

public class Cubo extends Figura3D{
  private double lado;

  public double getLado() {
    return lado;
  }

  public void setLado(double lado) {
    this.lado = lado;
  }
  
  @Override
  public double calcularArea() {
    double area = (Math.pow(this.getLado(), 2)) * 6;
    return area;
  }

  @Override
  public double calcularVolume() {
    double volume = Math.pow(this.getLado(), 3);
    return volume;
  }
}
