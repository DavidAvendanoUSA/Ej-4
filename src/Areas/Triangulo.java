package Areas;

public class Triangulo extends Figura {
    private double ld1, ld2, ld3;
   /**
     * Constructor de la clase Triangulo.
     * Inicializa los tres lados del triángulo con los valores proporcionados.
     * 
     * @param ld1 El primer lado del triángulo.
     * @param ld2 El segundo lado del triángulo.
     * @param ld3 El tercer lado del triángulo.
     */
    public Triangulo(double ld1, double ld2, double ld3) {
        super();

        this.ld1= ld1;
        this.ld2 = ld2;
        this.ld3 = ld3; 

    }
   /**
     * Calcula el área del triángulo utilizando la fórmula de Herón.
     * La fórmula de Herón utiliza el semiperímetro y los tres lados del triángulo para calcular el área.
     * 
     * @return El área del triángulo.
     */
    public double calcularSemiPerimetro(){
        return (ld1 + ld2 + ld3) / 2; 
    }
    /**
     * Calcula el perímetro del triángulo.
     * El perímetro es la suma de los tres lados del triángulo.
     * 
     * @return El perímetro del triángulo.
     */
    @Override
    public double  calcularArea() {
        return Math.sqrt(calcularSemiPerimetro()*((calcularPerimetro()-ld1)*(calcularPerimetro()-ld2)*(calcularPerimetro()-ld3)));
    }

    @Override
    public double  calcularPerimetro() {
        return (ld1 + ld2 + ld3);
    }
    /**
     * Representación en cadena del objeto Triangulo.
     * Devuelve una cadena con el perímetro y el área del triángulo.
     * 
     * @return La cadena con la descripción del triángulo.
     */
    @Override
    public String toString() {
        return "El trinagulo   perimetro " +  calcularPerimetro() + " area: " + calcularArea(); 
    }
}
