package com.hiveit.pe.eai.salessystemservice.bean;
public class ciudadBean {
  private String distrito;
  private String provincia;
  private String region;
  private String pais;
  private int idciudad;
  private String codciudad;

  public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

	public int getIdciudad() {
		return idciudad;
	}

	public void setIdciudad(int idciudad) {
		this.idciudad = idciudad;
	}

	public String getCodciudad() {
		return codciudad;
	}

	public void setCodciudad(String codciudad) {
		this.codciudad = codciudad;
	}
}
