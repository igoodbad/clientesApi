package com.igoodbadDev;

public class Cliente {

	private String folio;
	private String nombre;
	private String appPat;
	private String appMat;
	private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Cliente() {
		
	}
	
	public Cliente(String folio, String nombre, String appPat, String appMat, String email) {
		this.folio = folio;
		this.nombre = nombre;
		this.appPat = appPat;
		this.appMat = appMat;
		this.email = email;
	}

	public String getFolio() {
		return folio;
	}

	public void setFolio(String folio) {
		this.folio = folio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAppPat() {
		return appPat;
	}

	public void setAppPat(String appPat) {
		this.appPat = appPat;
	}

	public String getAppMat() {
		return appMat;
	}

	public void setAppMat(String appMat) {
		this.appMat = appMat;
	}

}
