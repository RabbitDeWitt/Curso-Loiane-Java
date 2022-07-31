package Formas;

public class Cilindro extends Figura3D{
  private double raio;
  private double altura;

  public double getAltura() {
    return altura;
  }
  public void setAltura(double altura) {
    this.altura = altura;
  }

  public double getRaio() {
    return raio;
  }

  public void setRaio(double raio) {
    this.raio = raio;
  }
  
  @Override
  public double calcularArea() {
    double areaLateral = this.getAltura() + this.getRaio();
    double area = ((Math.PI * this.getRaio()) * 2) * areaLateral;
    return area;
  }

  @Override
  public double calcularVolume() {
    double volume = (Math.PI * Math.pow(this.getRaio(), 2)) * this.getAltura();
    return volume;
    
  }
}
