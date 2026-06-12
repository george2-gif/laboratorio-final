package laboratoriofinal;

public class Empleado {

	    private int idEmpleado;
	    private String nombre;
	    private String cargo;
	    private String direccion;
	    private String fechaIngreso;
	    private String horaEntrada;
	    private String horaSalida;

	    public Empleado(int id, String nombre, String cargo) {
	        this.idEmpleado = id;
	        this.nombre = nombre;
	        this.cargo = cargo;
	    }

	    public int getIdEmpleado() {
	        return idEmpleado;
	    }

	    public void setIdEmpleado(int id) {
	        this.idEmpleado = id;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public String getCargo() {
	        return cargo;
	    }

	    public void setCargo(String cargo) {
	        this.cargo = cargo;
	    }

	    public String getDireccion() {
	        return direccion;
	    }

	    public void setDireccion(String dir) {
	        this.direccion = dir;
	    }

	    public String getFechaIngreso() {
	        return fechaIngreso;
	    }

	    public String getHoraEntrada() {
	        return horaEntrada;
	    }

	    public String getHoraSalida() {
	        return horaSalida;
	    }

	    @Override
	    public String toString() {
	        return "Empleado{" +
	                "idEmpleado=" + idEmpleado +
	                ", nombre='" + nombre + '\'' +
	                ", cargo='" + cargo + '\'' +
	                ", direccion='" + direccion + '\'' +
	                ", fechaIngreso='" + fechaIngreso + '\'' +
	                ", horaEntrada='" + horaEntrada + '\'' +
	                ", horaSalida='" + horaSalida + '\'' +
	                '}';
	    }
	}
