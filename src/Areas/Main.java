package Areas;

public class Main {
    public static void main(String[] args) {
        Circulo c = new Circulo(5); 
        c.calcularArea();
        c.calcularPerimetro();
        System.out.println(c);
        Triangulo t  = new Triangulo(4, 3, 5, 3, 5); 
        t.calcularArea();
        t.calcularPerimetro();
        System.out.println(t);
        Rectangulo r = new Rectangulo(4, 7);
        r.calcularArea();
        r.calcularPerimetro();
        System.out.println(r);
    }
}
