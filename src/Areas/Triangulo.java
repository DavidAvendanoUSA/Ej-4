package Areas;

public class Triangulo extends Figura {
    private double ld1, ld2, ld3, base, altura; 
    public Triangulo(double ld1, double ld2, double ld3, double base, double altura) {
        super();
        this.altura = altura; 
        this.base = base; 
        this.ld1= ld1;
        this.ld2 = ld2;
        this.ld3 = ld3; 

    }
    @Override
    public void calcularArea() {
        setArea((base * altura)/2);
    }
    @Override
    public void calcularPerimetro() {
        setPerimetro(ld1 + ld2 + ld3);
    }
    @Override
    public String toString() {
        return "El trinagulo de lados, " + ld1 + " " + ld2 + " " + ld3 + " con base y altura de: " + base + ", " + altura + super.toString(); 
    }
}
