package laboratoriofinal;
import java.util.ArrayList;

public class Venta {


	    private int idVenta;
	    private String fecha;
	    private double total;
	    private Cliente cliente;
	    private Empleado empleado;
	    private ArrayList<DetalleVenta> detalles;

	    public Venta(int id, String fecha, Cliente cli, Empleado emp) {
	        this.idVenta = id;
	        this.fecha = fecha;
	        this.cliente = cli;
	        this.empleado = emp;
	        this.detalles = new ArrayList<>();
	        this.total = 0.0;
	    }

	    public void agregarDetalle(DetalleVenta det) {
	        this.detalles.add(det);
	        calcularTotal();
	    }

	    public double calcularTotal() {
	        this.total = 0.0;
	        for (DetalleVenta det : detalles) {
	            this.total += det.getSubtotal();
	        }
	        return this.total;
	    }

	    public int getIdVenta() { return idVenta; }
	    public void setIdVenta(int id) { this.idVenta = id; }
	    public String getFecha() { return fecha; }
	    public void setFecha(String fecha) { this.fecha = fecha; }
	    public Cliente getCliente() { return cliente; }
	    public void setCliente(Cliente cli) { this.cliente = cli; }
	    public Empleado getEmpleado() { return empleado; }
	    public void setEmpleado(Empleado emp) { this.empleado = emp; }
	    public ArrayList<DetalleVenta> getDetalles() { return detalles; }
	    public double getTotal() { return total; }

	    @Override
	    public String toString() {
	        return "Venta N°" + idVenta + " | Total: $" + total;
	    }
	}