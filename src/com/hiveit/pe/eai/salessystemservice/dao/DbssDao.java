package com.hiveit.pe.eai.salessystemservice.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import com.hiveit.pe.eai.salessystemservice.bean.ArticulosBean;
import com.hiveit.pe.eai.salessystemservice.bean.ArticulosBeanResponse;

public interface DbssDao{
	
	/*Tabla Articulos*/
	ArticulosBeanResponse registrarArticulo (ArticulosBean request) throws SQLException;
	ArticulosBean buscarArticulo(String codarticulo) throws SQLException;
	ArticulosBeanResponse eliminarArticulo(String codarticulo) throws SQLException;
	ArticulosBean actualizarArticulo(String codarticulo) throws SQLException;
	ArrayList<ArticulosBean> consultarArticulos() throws SQLException;
	ArrayList<ArticulosBean> consultarArticulosMantenimiento() throws SQLException;

}
