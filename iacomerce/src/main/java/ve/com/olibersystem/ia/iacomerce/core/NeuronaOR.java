package ve.com.olibersystem.ia.iacomerce.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class NeuronaOR {
	public static final Logger LOG = LoggerFactory.getLogger(NeuronaOR.class);
	public static void main(String[] args){
		new NeuronaOR().activar();
		//new Neurona(1, 2, 3, 4).getY1();
	}
	
	
	public void activar() {
		LOG.info("hoola info");
		LOG.debug("HOLA debug");
        //Tabla de la verdad (X1,X2,Y1)
       /* int[][] tv = {{1, 1, 1}, {1, 1, 1}, {-1, -1, 1}, {-1, 1, -1}};

        System.out.println("\nInicializar pesos:\n");
        double w1 = new Random().nextDouble() / 2.5;//valores proximos a 0
        double w2 = new Random().nextDouble() / 2.5;
        double θ = -0.4;

        double y = 0;
        final double E = 0.6;//Factor de aprendizaje        

        System.out.println("w1: " + w1);
        System.out.println("w2: " + w2);
        System.out.println("θ: " + θ);

        System.out.println("\nIniciando fase de aprendizaje puerta logica OR...\n");
        int i = 0;
        int cont = 1;
        while (i < tv.length && cont < 100) {
            y = Math.tanh((tv[i][0] * w1) + (tv[i][1] * w2) + (-1 * θ));
            y = (y >= θ) ? 1 : -1;
            System.out.println("Entrada[" + tv[i][0] + "," + tv[i][1]
                    + "]) Valor esperado[" + tv[i][2]
                    + "] Salida[" + (int) y + "]");
            if (y == tv[i][2]) {
                i++;
            } else {
                System.out.println("Valor esperado difiere de la salida. Hay que reajustar pesos...");
                //Ajuste de pesos
                w1 = w1 + 2 * E * tv[i][2] * tv[i][0];
                w2 = w2 + 2 * E * tv[i][2] * tv[i][1];
                θ = θ + 2 * E * tv[i][2] * (-1);

                System.out.println("\nAjuste de pesos (" + cont + "):");
                System.out.println("w1: " + w1);
                System.out.println("w2: " + w2);
                System.out.println("θ: " + θ + "\n");
                cont++;
                i = 0;
            }
        }

        if (cont <= 9999) {
            System.out.println("\nFase de aprendizaje terminado con exito ");
            System.out.println("\nResultados:");
            System.out.println("w1: " + w1);
            System.out.println("w2: " + w2);
            System.out.println("θ: " + θ);
            System.out.println("\nIniciando fase de testeo...");
            System.out.println("Introduce Entrada 1 (X1): ");
            Scanner leerX1 = new Scanner(System.in);
            double x1 = Double.parseDouble(leerX1.next());

            System.out.println("Introduce Entrada 2 (X2): ");
            Scanner leerX2 = new Scanner(System.in);
            double x2 = Double.parseDouble(leerX2.next());

            y = Math.tanh((x1 * w1) + (x2 * w2) + (-1 * θ));
            y = (y >= θ) ? 1 : -1;

            System.out.println("\nSalida: " + (int)y);
        } else {
            System.out.println("\nFase de aprendizaje ha fallado\n");
        }*/

    }
}
