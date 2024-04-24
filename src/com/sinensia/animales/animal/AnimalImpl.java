package com.sinensia.animales.animal;

public abstract class AnimalImpl implements Animal{

	private Integer numPatas;
	private TipoAnimal tipo;
	private String nombre;
	//festivos mayo 17,8,29  abril 17,22,23  curso termina el 10 de junio
	
	public AnimalImpl(TipoAnimal tipo) {
		this.tipo = tipo;
	}

	public String getNombre() {
		if(tipo == TipoAnimal.MASCOTA) {
			return nombre;
		}else {
			String sinNombre = "No es una mascota y no tiene nombre.";
			System.out.println(sinNombre);
			return sinNombre;
		}
	}

	public void setNombre(String nombre) {
		if(tipo == TipoAnimal.MASCOTA) {
			this.nombre = nombre;
		}else {
			System.out.println("No es una mascota y no se puede asignar un nombre.");
		}
	}

	public Integer getNumPatas() {
		return numPatas;
	}

	public void setNumPatas(Integer numPatas) {
		this.numPatas = numPatas;
	}

	public TipoAnimal getTipo() {
		return tipo;
	}

	public void setTipo(TipoAnimal tipo) {
		this.tipo = tipo;
	}

	@Override
	public void comer() {
		if(tipo == TipoAnimal.MASCOTA) {
			System.out.println(String.format("%s esta comiendo.", nombre));
		}else {
			System.out.println("El animal está comiendo...");
		}
	}

	@Override
	public void beber() {
		if(tipo == TipoAnimal.MASCOTA) {
			System.out.println(String.format("%s esta bebiendo.", nombre));
		}else {
			System.out.println("El animal está bebiendo...");
		}
	}

	@Override
	public void dormir() {
		if(tipo == TipoAnimal.MASCOTA) {
			System.out.println(String.format("%s esta durmiendo.", nombre));
		}else {
			System.out.println("El animal está durmiendo.");
		}
	}

	@Override
	public void jugar() {
		if(tipo == TipoAnimal.MASCOTA) {
			System.out.println(String.format("%s esta jugando.", nombre));
		}else {
			System.out.println("No es una mascota y no puede jugar.");
		}
	}

	
	
}
