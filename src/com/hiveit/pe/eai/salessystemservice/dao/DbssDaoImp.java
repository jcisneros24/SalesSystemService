package com.hiveit.pe.eai.salessystemservice.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import com.hiveit.pe.eai.salessystemservice.ConDb;
import com.hiveit.pe.eai.salessystemservice.bean.ArticulosBean;

public class DbssDaoImp implements DbssDao{
	ConDb conDb;	

	/*Implementacion tabla Articulos*/
	@Override
	public ArticulosBean insertarArticulo(ArticulosBean request) throws SQLException {
		ArticulosBean response = null;
		Connection cnn = null;
	    PreparedStatement ps = null;
	    try {
	    	cnn = conDb.getConnection();
	    	response = new ArticulosBean();
	    	response.setCodarticulo(request.getCodarticulo());
	    	response.setDescripcion(request.getDescripcion());
	    	response.setColor(request.getColor());
	    	
	        ps = cnn.prepareStatement("INSERT INTO articulos (codarticulo, descripcion,color,codfam,codmedida,proveedor,estado,fingreso) VALUES (?,?,?,?,?,?,?,?)");
	        ps.setString(1, request.getCodarticulo());
	        ps.setString(2, request.getDescripcion());
	        ps.setString(3, a.getColor());
	        ps.setString(4, a.getCodfam());
	        ps.setString(5, a.getCodmedida());
	        ps.setString(6, a.getCodprove());
	        ps.setString(7, a.getEstado());
	        ps.setString(8, a.getFingreso());
	        ps.executeUpdate();
	        cnn.close();
	        ps.close();
		} catch (Exception e) {
			// TODO: handle exception
		}

        return response;
	}

	@Override
	public ArticulosBean buscarArtCod(String codarticulo) throws SQLException {
		return buscarArtCod(codarticulo, null);
	}

	@Override
	public ArticulosBean buscarArtCod(String codarticulo, ArticulosBean a) throws SQLException {
		Connection cnn = conDb.getConnection();
        PreparedStatement ps = null;
        ps = cnn.prepareStatement("select * from articulos where codarticulo=?");
        ps.setString(1, codarticulo);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            if (a == null) {
                a = new ArticulosBean() {};
            }
            a.setIdarticulo(rs.getInt("idarticulo"));
            a.setCodarticulo(rs.getString("codarticulo"));
            a.setDescripcion(rs.getString("descripcion"));
            a.setColor(rs.getString("color"));
            a.setCodfam(rs.getString("codfam"));
            a.setCodmedida(rs.getString("codmedida"));
            a.setCodprove(rs.getString("proveedor"));
            a.setEstado(rs.getString("estado"));
            a.setFingreso(rs.getString("fingreso"));
        }
        cnn.close();
        ps.close();
        return a;
	}

	@Override
	public boolean eliminarArticulo(String codarticulo) throws SQLException {
			Connection cnn = conDb.getConnection();
	        PreparedStatement ps = null;
	        ps = cnn.prepareStatement("delete from articulos WHERE codarticulo=?");
	        ps.setString(1, codarticulo);
	        int rowsUpdated = ps.executeUpdate();
	        cnn.close();
	        ps.close();
	        if (rowsUpdated > 0) {
	            return true;
	        } else {
	            return false;
	        }
	}

	@Override
	public boolean actualizarArticulo(ArticulosBean a) throws SQLException {
		Connection cnn = conDb.getConnection();
        PreparedStatement ps = null;

        ps = cnn.prepareStatement("UPDATE articulos SET codarticulo=?, descripcion=?,color=?,codfam=?, codmedida=?, proveedor=?,estado=?, fingreso=? WHERE idarticulo=" + a.getIdarticulo());
        ps.setString(1, a.getCodarticulo());
        ps.setString(2,a.getDescripcion());
        ps.setString(3,a.getColor());
        ps.setString(4, a.getCodfam());
        ps.setString(5, a.getCodmedida());
        ps.setString(6,a.getCodprove());
        ps.setString(7, a.getEstado());
        ps.setString(8, a.getFingreso());
        int rowsUpdated = ps.executeUpdate();
        cnn.close();
        ps.close();
        if (rowsUpdated > 0) {
            return true;
        } else {
            return false;
        }
	}

	@Override
	public ArrayList<ArticulosBean> mostrarArticulosConsulta() throws SQLException {
		Connection cnn = conDb.getConnection();
        PreparedStatement ps = null;
        ArrayList<ArticulosBean> lista = new ArrayList<ArticulosBean>();

        ps = cnn.prepareStatement("SELECT *from articulos ");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
        	ArticulosBean a = new ArticulosBean() {};
            a.setCodarticulo(rs.getString("codarticulo"));
            a.setDescripcion(rs.getString("descripcion"));
            a.setColor(rs.getString("color"));
            a.setCodfam(rs.getString("codfam"));
            a.setCodmedida(rs.getString("codmedida"));
            a.setCodprove(rs.getString("proveedor"));
            a.setEstado(rs.getString("estado"));
            a.setFingreso(rs.getString("fingreso"));
            lista.add(a);
        }
        cnn.close();
        ps.close();
        return lista;
	}

	@Override
	public ArrayList<ArticulosBean> mostrarArticulosMantenimiento() throws SQLException {
		Connection cnn = conDb.getConnection();
        PreparedStatement ps = null;
        ArrayList<ArticulosBean> lista = new ArrayList<ArticulosBean>();
        ps = cnn.prepareStatement("SELECT * FROM articulos");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
        	ArticulosBean a = new ArticulosBean() {};
            a.setCodarticulo(rs.getString("codarticulo"));
            a.setDescripcion(rs.getString("descripcion"));
            a.setColor(rs.getString("color"));
            a.setCodfam(rs.getString("codfam"));
            a.setCodmedida(rs.getString("codmedida"));
            a.setCodprove(rs.getString("proveedor"));
            a.setEstado(rs.getString("estado"));
            a.setFingreso(rs.getString("fingreso"));
            lista.add(a);
        }
        cnn.close();
        ps.close();
        return lista;
	}
	/*Implementacion tabla Articulos*/	
}
