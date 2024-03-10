package tp2_1;

import java.util.ArrayList;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {
		
		ArrayList <etudiant> e= new ArrayList<>();
		Stats s=new Stats();
		
		
		e.add(new etudiant("b","axli"));
		e.get(0).addNote(new Note("php",10));
		e.get(0).addNote(new Note("java",13.5));
		
		
		e.add(new etudiant("a","arzouga"));
		e.get(1).addNote(new Note("php",17));
		e.get(1).addNote(new Note("java",15));
		
	s.afficherStatsEtudiants(e);
	float x=s.getMoyenneGroupe(e);
	System.out.println(x);
	etudiant ex = s.getMaximumGroupe(e);

	if (ex != null) {
	    System.out.println(" le meilleur étudiant: " + ex.toString());
	} 
	etudiant exx = s.getMinimumGroupe(e);

	if (ex != null) {
	    System.out.println(" Le moins bon étudiant.: " + exx.toString());
	} 
	
	System.out.println("*************************************");
	Collections.sort(e);
	System.out.println(e);
	
	
	
	
	System.out.println("*************************************");
	Matcomparator cm=new Matcomparator();
	Collections.sort(e,cm);
	System.out.println(e);
	
	
	
	
	System.out.println("*************************************");
	CompareNom cn=new CompareNom();
	Collections.sort(e,cn);
	System.out.println(e);
	
	
	}	
}
