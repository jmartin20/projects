/**
 * Created by nomce on 14/01/16.
 */
public class Matiere {
    private String name;
    private int nbEtudiants;

    public Matiere(String name, int nb){
        this.name = name;
        this.nbEtudiants = nb;
    }

    public String getName() {
        return name;
    }

    public int getNbEtudiants() {
        return nbEtudiants;
    }

    public String toStringXML(){
        //<matiere name="RESO" nbEtudiants="54" />
        return "        <matiere name=\"" + name + "\" nbEtudiants=\"" + nbEtudiants + "\" />\n";
    }
}
