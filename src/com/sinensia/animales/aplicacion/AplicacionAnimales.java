package com.sinensia.animales.aplicacion;

import java.util.ArrayList;
import java.util.List;

import com.sinensia.animales.animal.*;

public class AplicacionAnimales {

	public static void main(String[] args) {
		
		Animal pez = new Pez(TipoAnimal.SALVAJE);
		((AnimalImpl)pez).setNombre("Pececito");
		Animal gato = new Gato(TipoAnimal.MASCOTA);
		((AnimalImpl)gato).setNombre("Copito");
		
		List<Animal> animales = new ArrayList<Animal>();
		animales.add(pez);
		animales.add(gato);
		animales.forEach(animal -> {
			if(((AnimalImpl)animal).getTipo() == TipoAnimal.MASCOTA) {
				((AnimalImpl) animal).jugar();
			}
			animal.andar();
			animal.beber();
			animal.comer();
			animal.dormir();
			animal.jugar();
		});
		
	}
	
}
