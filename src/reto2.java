import java.util.Scanner;

//mi programa calculara el IVA, de un producto en base al precio que determine el usuario, ademas claculara tambien
//si es que quiere mas de un producto, cuanto pagaria si lo financia a la cantidad de meses que el quiera, y si el
//producto le cuesta mas o menos que 100euros al mes

public class reto2 {
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Introduce el precio de tu producto");
        double precioInicial = input.nextDouble();
        double precioConIva = precioInicial * 1.21;

        while(true){
            System.out.println("Calcular el precio final con IVA(+21%)");
            System.out.println("Presione Y para continuar");

            char ivaChar = input.next().charAt(0);

            if (ivaChar == 'y' ||ivaChar == 'Y'){
                System.out.println("El precio final con Iva es de: " + precioConIva + " euros");
                break;
            }else{
                System.out.println("Introduzca Y. Intente nuevamente");
            }
        }

        System.out.println("Diga cuantos productos desea Comprar");
        int cantidadDeProductos = input.nextInt();
        double precioDeMasProdcuntos = precioConIva * cantidadDeProductos;

        System.out.println("Ha seleccionado " + cantidadDeProductos + " productos");
        System.out.println("El precio de todos los productos seria de: " + precioDeMasProdcuntos + "(IVA incluido)");

        System.out.println("A cuantos meses desea Financiar el/los productos");
        int mesesFinanciacion = input.nextInt();
        double precioFinanciado = precioDeMasProdcuntos / mesesFinanciacion;
        System.out.println("Tendria que pagar " + precioFinanciado + " al mes");
        if(precioFinanciado > 100.00){
            System.out.println("Usted no puede pagar esta financiacion");
        }else{
            System.out.println("Es una financiacion aceptable");
        }

        input.close();

    }
}
