package modele;

public abstract class Personnages {
	public abstract String getNom();

	public abstract int getX();

	public abstract int getY();

	public final String getClassName() {
		return this.getClass().getSimpleName();
	}

	public abstract void action(Aventurier a);

} /*----- Fin de la classe Personnages -----*/
