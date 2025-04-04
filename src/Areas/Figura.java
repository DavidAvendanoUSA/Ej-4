package Areas;

public abstract class Figura {
    protected double area; 
    protected double perimetro; 
    public Figura() {
        super();
        this.area = 0; 
        this.perimetro = 0; 
    }
    public void setArea(double area) {
        this.area = area;
    }
    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
    public double getArea() {
        return area;
    }
    public double getPerimetro() {
        return perimetro;
    }
    public abstract void calcularArea(); 
    public abstract void calcularPerimetro(); 
    @Override
    public String toString() {
        return " El area es " + area + " el perimetro es: " + perimetro; 
    }
}
