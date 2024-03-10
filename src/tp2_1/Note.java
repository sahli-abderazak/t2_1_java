package tp2_1;

public class Note {
	private String nomCours;
	private double note ;
	public String getNomCours() {
		return nomCours;
	}
	public void setNomCours(String nomCours) {
		this.nomCours = nomCours;
	}
	public double getNote() {
		return note;
	}
	public void setNote(double note) {
		this.note = note;
	}
	@Override
	public String toString() {
		return "Note [nomCours=" + nomCours + ", note=" + note + "]";
	}
	public Note(String nomCours, double note) {
		this.nomCours = nomCours;
		this.note = note;
	}

	
	
}
