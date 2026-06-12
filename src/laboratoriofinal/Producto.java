package laboratoriofinal;

public class Producto {
	
	    private int idProducto;
	    private String nombre;
	    private double precio;
	    private int stock;

	    // Constructor
	    public Producto(int idProducto, String nombre, double precio, int stock) {
	        this.idProducto = idProducto;
	        this.nombre = nombre;
	        this.precio = precio;
	        this.stock = stock;
	    }

	    // Getters
	    public int getIdProducto() {
	        return idProducto;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public double getPrecio() {
	        return precio;
	    }

	    public int getStock() {
	        return stock;
	    }

	    // Setters
	    public void setIdProducto(int idProducto) {
	        this.idProducto = idProducto;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public void setPrecio(double precio) {
	        this.precio = precio;
	    }

	    public void setStock(int stock) {
	        this.stock = stock;
	    }
	}


