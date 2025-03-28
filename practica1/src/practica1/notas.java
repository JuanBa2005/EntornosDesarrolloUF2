package practica1;
import java.util.Scanner;

/**
 * La clase {@code notas} permite gestionar el ingreso, validación, cálculo y
 * presentación de notas de un estudiante.
 * <p>
 * La clase incluye métodos para solicitar notas al usuario, verificar que se
 * encuentren en el rango correcto (0 a 10), calcular la nota definitiva según
 * ponderaciones y determinar si el estudiante ha aprobado o suspendido.
 * </p>
 * 
 * @author Juan Bautista
 * @version 1.0
 */
public class notas {

	/**
     * Variables para almacenar las notas ingresadas.
     * <p>
     * Estas variables son: {@code uf1}, {@code uf2} y {@code uf3}.
     * </p>
     */
	double uf1, uf2, uf3;
	
	/**
     * Variables para almacenar los acumulados y la nota definitiva.
     * <p>
     * Estas variables son: {@code acu1}, {@code acu2}, {@code acu3} y {@code def}.
     * </p>
     */
	double acu1, acu2, acu3, def;
	
	/**
     * Objeto {@code Scanner} para la entrada de datos desde la consola.
     */
	Scanner entrada = new Scanner(System.in);

	/**
     * Solicita al usuario que ingrese las tres notas del estudiante.
     * <p>
     * Utiliza un objeto {@code Scanner} para capturar la entrada desde la consola.
     * Cada nota se almacena en las variables {@code uf1}, {@code uf2} y {@code uf3}.
     * </p>
     */
	public void InrgresaPuntos() {
		System.out.println("ingrese las notas del estudiante");

		System.out.print("ingrese nota 1: ");
		uf1 = entrada.nextDouble();

		System.out.print("ingrese nota 2: ");
		uf2 = entrada.nextDouble();

		System.out.print("ingrese nota 3: ");
		uf3 = entrada.nextDouble();
	}

	/**
     * Verifica que las notas ingresadas estén dentro del rango válido (0 a 10).
     * <p>
     * Para cada nota, si el valor es mayor a 10 se imprime un mensaje indicando que
     * la nota fue mal introducida; de lo contrario, se confirma que la nota es
     * correcta.
     * </p>
     */
	public void comprobarcion() {

		if (uf1 > 10) {
			System.out.println(" nota1 mal introducida");

		} else {
			System.out.println(" nota1 correcta");
		}

		if (uf2 > 10) {
			System.out.println(" nota2 mal introducida");

		} else {
			System.out.println(" nota2 correcta");
		}

		if (uf3 > 10) {
			System.out.println(" nota3 mal introducida");

		} else {
			System.out.println(" nota3 correcta");
		}
	}

	/**
     * Calcula los acumulados y la nota definitiva del estudiante.
     * <p>
     * Las notas se ponderan de la siguiente manera:
     * <ul>
     *   <li>{@code acu1} = {@code uf1} * 0.35</li>
     *   <li>{@code acu2} = {@code uf2} * 0.35</li>
     *   <li>{@code acu3} = {@code uf3} * 0.30</li>
     * </ul>
     * La nota definitiva {@code def} se obtiene sumando los acumulados.
     * </p>
     */
	public void Calculonotas() {
		acu1 = uf1 * 0.35;
		acu2 = uf2 * 0.35;
		acu3 = uf3 * 0.30;
		def = acu1 + acu2 + acu3;
	}

	/**
     * Muestra en consola las notas ingresadas, los acumulados y la nota definitiva.
     * <p>
     * Se utiliza {@code System.out.println} para imprimir cada uno de los valores.
     * </p>
     */
	public void Mostrar() {
		System.out.println(" notas introducidas son:");
		System.out.println(" nota1 = " + uf1);
		System.out.println(" nota2 = " + uf2);
		System.out.println(" nota3 = " + uf3);

		System.out.println(" acumulado 1 = " + acu1);
		System.out.println(" acumulado 2 = " + acu2);
		System.out.println(" acumulado 3 = " + acu3);

		System.out.println(" nota definitiva es = " + def);

	}

	/**
     * Determina e imprime si el estudiante ha aprobado o suspendido.
     * <p>
     * Se evalúa la nota definitiva {@code def} con los siguientes criterios:
     * <ul>
     *   <li>Si {@code def} es menor que 5 y mayor o igual a 0, el estudiante suspende.</li>
     *   <li>Si {@code def} está entre 5 y 10 (inclusive), el estudiante aprueba.</li>
     *   <li>En caso contrario, se indica un error en la nota.</li>
     * </ul>
     * </p>
     */
	public void aprobado() {
		if (def < 5 && def >= 0) {
			System.out.println("suspendió");
		} else {
			if (def >= 5 && def <= 10) {
				System.out.println("aprobado");
			} else {
				System.out.println(" error en la nota");
			}
		}
	}

	/**
     * Método principal de la aplicación.
     * <p>
     * Se crea una instancia de la clase {@code notas} y se invocan los métodos para
     * ingresar notas, verificar la validez, calcular los acumulados, mostrar los
     * resultados y determinar si el estudiante ha aprobado o suspendido.
     * </p>
     *
     * @param args Argumentos de la línea de comandos (no utilizados).
     */
	public static void main(String[] args) {
		notas fc = new notas();
		fc.InrgresaPuntos();
		fc.comprobarcion();
		fc.Calculonotas();
		fc.Mostrar();
		fc.aprobado();
	}
}