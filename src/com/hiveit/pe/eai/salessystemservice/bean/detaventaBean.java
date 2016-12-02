package com.hiveit.pe.eai.salessystemservice.bean;
public class detaventaBean {
  private int iddetaventa;
  private String numcompro;
  private String codarticulo;
  public double cantidad;
  private double pvunt;
  public double total;
  
public int getIddetaventa() {
	return iddetaventa;
}
public void setIddetaventa(int iddetaventa) {
	this.iddetaventa = iddetaventa;
}
public String getNumcompro() {
	return numcompro;
}
public void setNumcompro(String numcompro) {
	this.numcompro = numcompro;
}
public String getCodarticulo() {
	return codarticulo;
}
public void setCodarticulo(String codarticulo) {
	this.codarticulo = codarticulo;
}
public double getCantidad() {
	return cantidad;
}
public void setCantidad(double cantidad) {
	this.cantidad = cantidad;
}
public double getPvunt() {
	return pvunt;
}
public void setPvunt(double pvunt) {
	this.pvunt = pvunt;
}
public double getTotal() {
	return total;
}
public void setTotal(double total) {
	this.total = total;
}

}
