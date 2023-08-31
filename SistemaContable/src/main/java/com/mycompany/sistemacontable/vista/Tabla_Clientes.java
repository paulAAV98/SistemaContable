package com.mycompany.sistemacontable.vista;


/**
 * @(#) ModelPersona.java 11 may. 2018
 * Universidad Politecnica Salesiana
 * Cuenca-Ecuador
 */


import com.mycompany.sistemacontable.modelo.Cliente;
import com.mycompany.sistemacontable.modelo.ClienteT;
import com.mycompany.sistemacontable.modelo.Persona;
import java.sql.Date;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;








public class Tabla_Clientes extends AbstractTableModel {

	public String[] columnas = {"CEDULA","NOMBRE","APELLIDO","DIRECCION","TELEFONO"};//array de las columnas con el titulo del contenido
	public Class[] columnasTipos = {String.class,String.class,String.class,String.class,String.class};//tipo de dato a trbajar
	private ArrayList<ClienteT> listaClientes = new ArrayList<>();//array list de tipo medico

	/**
	 * constructor de la clase que recibe los datos
	 * @param datos
	 */
	public Tabla_Clientes(ArrayList<ClienteT> datos) {
		super();
		listaClientes= new ArrayList<ClienteT>();
		this.listaClientes= datos;
	}

	/** 
	 * constructor vacio
	 */
	public Tabla_Clientes() {
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
		return listaClientes.size();
	}

	/**
	 * establece los tados que se optiene de persona
	 */
	public void setValueAt(Object value, int row, int col) {
		ClienteT emp = (ClienteT) (listaClientes.get(row));

		switch (col) {
		
		case 0:
			emp.setCedula((String) value);
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
		ClienteT emp = (ClienteT) (listaClientes.get(row));

		switch (col) {
		
		case 0:
			return emp.getCedula();
		case 1:
			return emp.getNombre();
                case 2:
			return emp.getApellido();
		case 3:
			return emp.getDireccion();
                 case 4:
			return emp.getTelefono();
                
		
                      
		}
		return new String();
	}

}