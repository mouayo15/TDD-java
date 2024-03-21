import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class personnageTest {

    @Test
    public void hpInitiaux() {
        personnage personnage = new personnage();
        assertEquals(100, personnage.getPointDeVie());
    }

    @Test
    public void initialementVivant() {
        personnage personnage = new personnage();
        assertFalse(personnage.isEstMort());
    }

    @Test
    public void mort() {
        personnage personnage = new personnage();
        personnage.Tuer();
        assertEquals(0, personnage.getPointDeVie());
        assertTrue(personnage.isEstMort());
    }
    
    @Test
    public void attaquerAutrePersonnage() {
        personnage attaquant = new personnage();
        personnage victime = new personnage();
        int pointDeVieAvantAttaque = victime.getPointDeVie();
        int degat = attaquant.getPuissanceAttaque();
        	
        attaquant.attaquer(victime, degat);
        assertEquals(pointDeVieAvantAttaque - attaquant.getPuissanceAttaque(), victime.getPointDeVie());
    }
}