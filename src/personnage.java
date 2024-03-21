
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

}
