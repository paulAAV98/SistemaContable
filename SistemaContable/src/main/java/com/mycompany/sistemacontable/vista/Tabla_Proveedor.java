package com.mycompany.sistemacontable.vista;


/**
 * @(#) ModelPersona.java 11 may. 2018
 * Universidad Politecnica Salesiana
 * Cuenca-Ecuador
 */


import com.mycompany.sistemacontable.modelo.Cliente;
import com.mycompany.sistemacontable.modelo.ClienteT;
import com.mycompany.sistemacontable.modelo.Persona;
import com.mycompany.sistemacontable.modelo.Proveedor;
import com.mycompany.sistemacontable.modelo.ProveedorT;
import java.sql.Date;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;








public class Tabla_Proveedor extends AbstractTableModel {

	public String[] columnas = {"RUC","NOMBRE","APELLIDO","DIRECCION","TELEFONO","EMPRESA"};//array de las columnas con el titulo del contenido
	public Class[] columnasTipos = {String.class,String.class,String.class,String.class,String.class,String.class};//tipo de dato a trbajar
	private ArrayList<ProveedorT> listaProveedor = new ArrayList<>();//array list de tipo medico

	/**
	 * constructor de la clase que recibe los datos
	 * @param datos
	 */
	public Tabla_Proveedor(ArrayList<ProveedorT> datos) {
		super();
		listaProveedor= new ArrayList<ProveedorT>();
		this.listaProveedor= datos;
	}

	/** 
	 * constructor vacio
	 */
	public Tabla_Proveedor() {
	}


	/**
	 * devuelve el numero de columnas que posee la tabla
	 * @return 
	 */
	public int getColumnCount() {
		return columnas.length;
	}

	/**
	 * devuelve la cantidad de filas que posee la tabla
	 */
	public int getRowCount() {
		return listaProveedor.size();
	}

	/**
	 * establece los tados que se optiene de persona
	 */
	public void setValueAt(Object value, int row, int col) {
		ProveedorT emp = (ProveedorT) (listaProveedor.get(row));

		switch (col) {
		
		case 0:
			emp.setRuc((String) value);
			break;
		case 1:
			emp.setNombre((String)value);
			break;
		
		case 2:
			emp.setApellido((String) value);
			break;
		case 3:
			emp.setDireccion((String) value);
			break;
                case 4:
			emp.setTelefono((String) value);
			break;
                     
                case 5:
			emp.setEmpresa((String) value);
			break;
		
                
		}
	}

	/**
	 * devuelve el nombre de la columna
	 */
	public String getColumnName(int col) {
		return columnas[col];
	}

	/**
	 * devuelve el tipo de colunma
	 */
	public Class getColumnClass(int col) {
		return columnasTipos[col];
	}
	/**
	 * obtiene la informacion de persona 
	 */
	public Object getValueAt(int row, int col) {
		ProveedorT emp = (ProveedorT) (listaProveedor.get(row));

		switch (col) {
		
		case 0:
			return emp.getRuc();
		case 1:
			return emp.getNombre();
                case 2:
			return emp.getApellido();
		case 3:
			return emp.getDireccion();
                 case 4:
			return emp.getTelefono();
                 case 5:
			return emp.getEmpresa();
                
		
                      
		}
		return new String();
	}

}