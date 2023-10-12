public class Main10 {
    public static void main (String args[]) {
        Suma suma = new Suma();
        int suma_De_Dos_Numeros_Enteros = suma.sumar(5000, 2000);
        System.out.println("Suma de dos numeros enteros sobrecargados: " + suma_De_Dos_Numeros_Enteros);
        System.out.println("---------------------------------------------------");

        int suma_de_tres_Numero_Enteros = suma.sumar(5000, 6000, 2000);
        System.out.println("Suma de tres numeros enteros sobrecargados: " +suma_de_tres_Numero_Enteros);
        System.out.println("----------------------------------------------------");

        double suma_Dos_Numeros_Dobles = suma.sumar(5000.5, 2000.6);
        System.out.println("Suma de dos numeros dobles sobrecargados: " +suma_Dos_Numeros_Dobles);
        System.out.println("-------------------------------------------------------");

        double suma_tres_Numeros_Triples = suma.sumar(5000.8, 300.6, 150.9);
        System.out.println("Suma de tres numeros triples sobrecargados: " + suma_tres_Numeros_Triples);
        System.out.println("-----------------------------------------------------");
    }
}
