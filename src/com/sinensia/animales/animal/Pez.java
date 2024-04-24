package com.sinensia.animales.animal;

public class Pez extends AnimalImpl{

	public Pez(TipoAnimal tipo) {
		super(tipo);
		setNumPatas(0);
	}

	@Override
	public void setNumPatas(Integer numPatas) {
		System.out.println("Los peces no tienen patas...");
	}

	@Override
	public void andar() {
		System.out.println("Los peces no andan, nadan.");
	}

}
