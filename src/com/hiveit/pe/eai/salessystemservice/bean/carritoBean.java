package com.hiveit.pe.eai.salessystemservice.bean;
public class carritoBean {
		private String codarticulo;
		private String numventa;
		public double cantidad;
		private double pvunt;
		public  double importe; 
		
		public String getCodarticulo() {
			return codarticulo;
		}
		public void setCodarticulo(String codarticulo) {
			this.codarticulo = codarticulo;
		}
		public double getPvunt() {
			return pvunt;
		}
		public void setPvunt(double pvunt) {
			this.pvunt = pvunt;
		}
		public double getCantidad() {
			return cantidad;
		}
		public void setCantidad(double cantidad) {
			this.cantidad = cantidad;
		}
		public String getNumventa() {
			return numventa;
		}
		public void setNumventa(String numventa) {
			this.numventa = numventa;
		}
		public double getImporte() {
			return importe;
		}
		public void setImporte(double importe) {
			this.importe = importe;
		}

}
