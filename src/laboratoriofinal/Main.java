package laboratoriofinal;

import java.util.ArrayList;
import java.util.List;

public class Main {
	// Colores ANSI para consola
	public static final String RESET = "\u001B[0m";
	public static final String ROJO = "\u001B[31m";
	public static final String VERDE = "\u001B[32m";
	public static final String AMARILLO = "\u001B[33m";
	public static final String AZUL = "\u001B[34m";
	public static final String MORADO = "\u001B[35m";
	public static final String CYAN = "\u001B[36m";
	public static final String NEGRITA = "\u001B[1m";

	public static void main(String[] args) throws InterruptedException {
		// Limpiar pantalla
		System.out.print("\033[H\033[2J");
		System.out.flush();

		// Animación de carga
		System.out.println(CYAN + NEGRITA + "=== SISTEMA DE VENTAS ===" + RESET);
		System.out.print(AMARILLO + "Cargando");
		for (int i = 0; i < 3; i++) {
			Thread.sleep(500);
			System.out.print(".");
		}
		System.out.println(RESET + "\n");

		// Crear productos (AHORA SÍ FUNCIONA PORQUE Producto ES STATIC)
		Producto producto1 = new Producto(1, "Laptop Gamer", 15000.00, 10);
		Producto producto2 = new Producto(2, "Mouse RGB", 350.00, 25);
		Producto producto3 = new Producto(3, "Teclado Mecánico", 850.00, 15);

		// Mostrar productos con animación
		System.out.println(AZUL + NEGRITA + "--- PRODUCTOS DISPONIBLES ---" + RESET);
		mostrarProductoConAnimacion(producto1, 1);
		mostrarProductoConAnimacion(producto2, 2);
		mostrarProductoConAnimacion(producto3, 3);

		// Crear detalles de venta (id, cantidad, producto)
		List<DetalleVenta> detalles = new ArrayList<>();
		detalles.add(new DetalleVenta(1, 1, producto1));
		detalles.add(new DetalleVenta(2, 2, producto2));
		detalles.add(new DetalleVenta(3, 1, producto3));

		// Mostrar detalle de venta y calcular total
		double total = 0;
		System.out.println("\n" + VERDE + NEGRITA + "--- DETALLE DE VENTA ---" + RESET);

		for (DetalleVenta detalle : detalles) {
			Thread.sleep(800);
			System.out.println(MORADO + "  " + detalle.toString() + RESET);
			total += detalle.getSubtotal();
		}

		// Mostrar total con animación de parpadeo
		System.out.println("\n" + NEGRITA + "─────────────────────────────" + RESET);
		System.out.print(ROJO + NEGRITA + "TOTAL A PAGAR: ");
		for (int i = 0; i < 3; i++) {
			System.out.print("$" + String.format("%.2f", total));
			Thread.sleep(300);
			System.out.print("\r               \r");
			Thread.sleep(300);
		}
		System.out.println("$" + String.format("%.2f", total) + RESET);

		// Animación final de éxito
		System.out.println("\n" + VERDE + "✅ Venta registrada con éxito!" + RESET);

		// Barras de progreso decorativas
		System.out.print(CYAN + "Procesando");
		for (int i = 0; i < 5; i++) {
			Thread.sleep(200);
			System.out.print(" █");
		}
		System.out.println(RESET);
	}

	private static void mostrarProductoConAnimacion(Producto p, int numero) throws InterruptedException {
		System.out.print("  " + numero + ". ");
		for (char c : p.getNombre().toCharArray()) {
			System.out.print(c);
			Thread.sleep(30);
		}
		Thread.sleep(100);
		System.out.printf(" - " + AMARILLO + "$%.2f" + RESET + " (Stock: %d)\n", p.getPrecio(), p.getStock());
	}
}
