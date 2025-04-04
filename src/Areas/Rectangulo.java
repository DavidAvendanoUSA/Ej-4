package Areas;

class Rectangulo extends Figura {
    private double base;
    private double altura;
/**
     * Constructor de la clase Rectangulo.
     * Inicializa la base y la altura del rectángulo con los valores proporcionados.
     * 
     * @param base La base del rectángulo.
     * @param altura La altura del rectángulo.
     */
    public Rectangulo(double base, double altura) {
        super(); 
        this.base = base;
        this.altura = altura;
    }
 /**
     * Calcula el área del rectángulo.
     * El área se calcula multiplicando la base por la altura.
     * 
     * @return El área del rectángulo.
     */
    @Override
    public double  calcularArea() {
        return (base * altura);
    }
/**
     * Calcula el perímetro del rectángulo.
     * El perímetro se calcula como dos veces la suma de la base y la altura.
     * 
     * @return El perímetro del rectángulo.
     */
    @Override
    public double  calcularPerimetro() {
        return (2 * (base + altura));
    }
    @Override
    public String toString() {
        return "Rectangulo "; 
    }

}