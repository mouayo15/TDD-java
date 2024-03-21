
public class personnage {
	
private int pointDeVie=100;
private boolean estMort= false;


public int getPointDeVie() {
	return pointDeVie;
}
public void setPointDeVie(int pointDeVie) {
	this.pointDeVie = pointDeVie;
}
public boolean isEstMort() {
	return estMort;
}
public void setEstMort(boolean estMort) {
	this.estMort = estMort;
}

public void Tuer() {
	this.pointDeVie=0;
	this.estMort=true;
}

public void attaquer(personnage cible, int degats) {
    if (!cible.isEstMort()) {
        cible.subirDegats(degats);
    }
}
private void subirDegats(int degats) {
	// TODO Auto-generated method stub
	pointDeVie -= degats;
    if (pointDeVie < 0) {
        pointDeVie = 0;
    }
}

}
