package tp2_1;

import java.util.ArrayList;

public class etudiant implements IStatisticable,Comparable<etudiant>{
	private String mat;
	private String nom;
	private ArrayList <Note> ln;
	
	
	public String getMat() {
		return mat;
	}
	public void setMat(String mat) {
		this.mat = mat;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public ArrayList<Note> getLn() {
		return ln;
	}
	public void setLn(ArrayList<Note> ln) {
		this.ln = ln;
	}
	@Override
	public String toString() {
		return "etudiant [mat=" + mat + ", nom=" + nom +  "]";
	}
	public etudiant(String mat, String nom) {
		this.mat = mat;
		this.nom = nom;
		this.ln=new ArrayList<>();
	}
	public void addNote(Note n)
	{
		ln.add(n);
	}
	@Override
	public float getValue() {
		float s=0;
		int x=0;
		for(int i=0;i<ln.size();i++)
		{
			s=(float) (s+ln.get(i).getNote());
			x++;
		}
		return s/x;
	}
	public double maxNote()
	{
		double max=ln.get(0).getNote();
		for(int i=1;i<this.ln.size();i++)
		{
			if(max<ln.get(i).getNote())
			{
				max=ln.get(i).getNote();
			}
			
		}
		return max;	
		}
	public double minNote()
	{
		double min=ln.get(0).getNote();
		for(int i=1;i<this.ln.size();i++)
		{
			if(min>ln.get(i).getNote())
			{
				min=ln.get(i).getNote();
			}
			
		}
		return min;	
		}
	@Override
	public int compareTo(etudiant o) {
		if(this.getValue()>o.getValue())
			return 1;
		if(this.getValue()>o.getValue())
			return -1;
		return 0;
	}
	
}
