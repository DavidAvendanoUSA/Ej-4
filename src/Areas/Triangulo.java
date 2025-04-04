package Areas;

public class Triangulo extends Figura {
    private double ld1, ld2, ld3; 
    public Triangulo(double ld1, double ld2, double ld3) {
        super();

        this.ld1= ld1;
        this.ld2 = ld2;
        this.ld3 = ld3; 

    }
    
    public double calcularSemiPerimetro(){
        return (ld1 + ld2 + ld3) / 2; 
    }
    @Override
    public double  calcularArea() {
        return Math.sqrt(calcularSemiPerimetro()*((calcularPerimetro()-ld1)*(calcularPerimetro()-ld2)*(calcularPerimetro()-ld3)));
    }
    @Override
    public double  calcularPerimetro() {
        return (ld1 + ld2 + ld3);
    }
    @Override
    public String toString() {
        return "El trinagulo de lados, " + ld1 + " " + ld2 + " " + ld3 + " perimetro " +  calcularPerimetro() + " area: " + calcularArea(); 
    }
}
