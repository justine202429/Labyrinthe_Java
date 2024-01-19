package modele;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Sirène extends Personnages {
	private int x;
	private int y;
	private boolean aEteRencontre;

	public Sirène(int x, int y) {
		this.x = x;
		this.y = y;
		this.aEteRencontre = false;
	}

	public String getNom() {
		return "une sirène";
	}

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}

	public boolean aEteRencontre() {
		return aEteRencontre;
	}

	public void setAEteRencontre(boolean aEteRencontre) {
		this.aEteRencontre = aEteRencontre;
	}

	public void action(Aventurier a) {
		if (!aEteRencontre && a.getX() == this.getX() && a.getY() == this.getY()) {
			setAEteRencontre(true);
			a.setPv(a.getPv() - 10);

			// Chargement de l'image du pirate + texte
			ImageIcon sireneIcone = new ImageIcon("data/sirene.gif");
			JLabel label = new JLabel(sireneIcone);

			String message = "Ohé moussailon ! Il se passe quelque chose !";
			String message2 = "Il te faut de la cire pour ne plus être ralenti !";

			JOptionPane.showMessageDialog(null, label, message, JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null, message2, "Arf..la mer est énervée aujourd'hui...", JOptionPane.INFORMATION_MESSAGE);
			a.setARencontreSirene(true); // L'aventurier a rencontré une sirène
		}
	}
} /*----- Fin de la classe Sirene-----*/