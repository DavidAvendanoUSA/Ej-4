package Areas;

public class Circulo extends Figura {
    private double radio; 
    public Circulo(double radio) {
        super();
        this.radio = radio; 

    }
    @Override
    public void calcularArea() {
        setArea(Math.PI * (radio * radio) );
    }
    @Override
    public void calcularPerimetro() {
        setPerimetro(2 * Math.PI * radio);
    }
    @Override
    public String toString() {
        return "El circulo con radio " + radio + super.toString();  
    }
}
