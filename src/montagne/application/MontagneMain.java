package montagne.application;

import java.util.ArrayList;
import java.util.Collection;

import montagne.ihm.Console;
import montagne.metier.ChaineDeMontagne;
import montagne.metier.Sommet;

public class MontagneMain {

	public static void main(String[] args) {
		Collection<Sommet>sommets=new ArrayList<>();
			sommets.add(new Sommet("Mont Blanc",4809,ChaineDeMontagne.MONTBLANC));
			sommets.add(new Sommet("Aiguille des Grands Montets",3295,ChaineDeMontagne.MONTBLANC));
			sommets.add(new Sommet("La Rhune",905,ChaineDeMontagne.PYRENEES));
			sommets.add(new Sommet("Pic du Midi",2877,ChaineDeMontagne.PYRENEES));
			sommets.add(new Sommet("Pic d'Aneto",3404,ChaineDeMontagne.PYRENEES));
			sommets.add(new Sommet("Pic du Canigou",2785,ChaineDeMontagne.PYRENEES));
			sommets.add(new Sommet("Puy de Sancy",1579,ChaineDeMontagne.MASSIF_CENTRAL));
			sommets.add(new Sommet("Puy de Dôme",1465,ChaineDeMontagne.MASSIF_CENTRAL));
			sommets.add(new Sommet("Le Grand Ballon",1424,ChaineDeMontagne.VOSGES));
			Console.titre("Mes Sommets");
			for (Sommet sommet:sommets) {
				Console.message(sommet.description());
			}
		
	}
}
