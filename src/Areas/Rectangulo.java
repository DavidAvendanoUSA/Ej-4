package Areas;

class Rectangulo extends Figura {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        super(); // Llama al constructor de Figura
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        setArea(base * altura);
    }

    @Override
    public void calcularPerimetro() {
        setPerimetro(2 * (base + altura));
    }

    @Override
    public String toString() {
        return "Rectángulo - Base: " + base + ", Altura: " + altura + ", " + super.toString();
    }
}