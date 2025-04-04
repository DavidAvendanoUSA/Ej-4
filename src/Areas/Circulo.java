package Areas;

public class Circulo extends Figura {
    private double radio; 
    /**
     * Constructor de la clase Circulo.
     * Inicializa el radio del círculo con el valor proporcionado.
     * 
     * @param radio El radio del círculo.
     */
    public Circulo(double radio) {
        super();
        this.radio = radio; 

    }
    /**
     * Calcula el área del círculo.
     * El área se calcula utilizando la fórmula A = π * radio².
     * 
     * @return El área del círculo.
     */
    @Override
    public double  calcularArea() {
        return  (Math.PI * (radio * radio) );
    }
    /**
     * Calcula el perímetro (circunferencia) del círculo.
     * El perímetro se calcula utilizando la fórmula P = 2 * π * radio.
     * 
     * @return El perímetro del círculo.
     */
    @Override
    public double  calcularPerimetro() {
        return (2 * Math.PI * radio);
    }

    @Override
    public String toString() {
        return "Circulo"; 
    }

}
