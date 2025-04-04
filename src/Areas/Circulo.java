package Areas;

public class Circulo extends Figura {
    private double radio; 
    public Circulo(double radio) {
        super();
        this.radio = radio; 

    }
    @Override
    public double  calcularArea() {
        return  (Math.PI * (radio * radio) );
    }
    @Override
    public double  calcularPerimetro() {
        return (2 * Math.PI * radio);
    }
    @Override
    public String toString() {
        return "El circulo con radio " + radio + " perimetro: " + calcularPerimetro() + " area: " + calcularArea(); 
    }
}
