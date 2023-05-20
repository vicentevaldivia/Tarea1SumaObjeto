public class Main {
    public static void main(String[] args) {
        int resultado = sumarNumeros(69, 420, 666);
        System.out.println("El resultado de la suma es: " + resultado);

        Coche miCoche = new Coche();
        miCoche.incrementarPuertas();
        System.out.println("Mi coche tiene " + miCoche.getNumeroPuertas() + " puertas.");
    }

    public static int sumarNumeros(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
}
