package es.studium.Práctica1;

public class ArticuloAcomprar 
{
	private String descripcion;
	private int cantidad;
	private String unidad;
	
	public ArticuloAcomprar()
	{
		descripcion="";
		cantidad=0;
		unidad="";
	}

	public String getDescripcion()
	{
		return descripcion;
	}

	public void setDescripcion(String descripcion)
	{
		this.descripcion = descripcion;
	}

	public int getCantidad()
	{
		return cantidad;
	}

	public void setCantidad(int cantidad)
	{
		this.cantidad = cantidad;
	}

	public String getUnidad()
	{
		return unidad;
	}

	public void setUnidad(String unidad)
	{
		this.unidad = unidad;
	}
	
}
