package laboratoriofinal;
import laboratoriofinal.Categoria.Producto; // Importación necesaria por el formato de tu compañera


public class DetalleVenta {


	    private int idDetalle;
	    private int cantidad;
	    private double subtotal;
	    private Producto producto;

	    public DetalleVenta(int id, int cant, Producto prod) {
	        this.idDetalle = id;
	        this.cantidad = cant;
	        this.producto = prod;
	        this.subtotal = calcularSubtotal();
	    }

	    public double calcularSubtotal() {
	        if (producto != null) {
	            // Usamos getPrecio() que es el método real de tu compañera
	            this.subtotal = this.cantidad * producto.getPrecio();
	        } else {
	            this.subtotal = 0.0;
	        }
	        return this.subtotal;
	    }

	    public int getIdDetalle() { return idDetalle; }
	    public void setIdDetalle(int id) { this.idDetalle = id; }
	    public int getCantidad() { return cantidad; }
	    public void setString(int cant) { this.cantidad = cant; calcularSubtotal(); }
	    public Producto getProducto() { return producto; }
	    public void setProducto(Producto prod) { this.producto = prod; calcularSubtotal(); }
	    public double getSubtotal() { return subtotal; }

	    @Override
	    public String toString() {
	        return producto.getNombre() + " x" + cantidad + " | Subtotal: $" + subtotal;
	    }
	}