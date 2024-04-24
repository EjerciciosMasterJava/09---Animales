package com.sinensia.animales.animal;

public class Gato extends AnimalImpl{

	public Gato(TipoAnimal tipo) {
		super(tipo);
		setNumPatas(4);
	}

	@Override
	public void comer() {
		if(getTipo() == TipoAnimal.MASCOTA) {
			System.out.println("A los gatos les gusta comer peces y arañas.");
		}else {
			System.out.println(String.format("A %s le gusta jugar con pelotas.", getNombre()));
		}
	}

	@Override
	public void andar() {
		System.out.println(String.format("El gato anda sobre %s patas.", getNumPatas()));
	}
	

	
	
}
