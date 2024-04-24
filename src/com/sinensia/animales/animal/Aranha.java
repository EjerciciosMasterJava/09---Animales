package com.sinensia.animales.animal;

public class Aranha extends AnimalImpl{



	public Aranha(TipoAnimal tipo) {
		super(tipo);
		setNumPatas(8);
	}

	@Override
	public void andar() {
		System.out.println(String.format("La aranha anda sobre %s patas.", getNumPatas()));
	}
	
	@Override
	public void comer() {
		System.out.println("Las arañas comen mosquitos.");
	}

	@Override
	public void beber() {
		System.out.println("La araña está bebiendo.");
	}

	@Override
	public void dormir() {
		System.out.println("La araña está durmiendo.");
	}


}
