package tp2_1;

import java.util.ArrayList;
import java.util.Iterator;

public class Stats {
	
	
	public void afficherStatsEtudiants(ArrayList<etudiant> e)
	{
		Iterator <etudiant> it=e.iterator();
		
		while(it.hasNext())
		{
			etudiant E=it.next();
			System.out.println("la moyene est");
			System.out.println(E.getValue());
			System.out.println("la meilleur note est");
			System.out.println(E.maxNote());
			System.out.println("la moins bonne note");
			System.out.println(E.minNote());
			
		}
	}
	
	public float getMoyenneGroupe(ArrayList<etudiant> e)
	{
		float s=0;
		int x=0;
		Iterator <etudiant> it=e.iterator();
		while(it.hasNext())
		{   etudiant E=it.next();
			s=s+E.getValue();
			x++;
		}
		return s/x;
	}
	public etudiant getMaximumGroupe(ArrayList<etudiant> e)
	{
		 Iterator<etudiant> it = e.iterator();
		    etudiant maxEtudiant = it.next(); 
		    float maxAverage = maxEtudiant.getValue();

		    while (it.hasNext()) {
		        etudiant E = it.next();
		        float average = E.getValue();

		        if (average > maxAverage) {
		            maxAverage = average;
		            maxEtudiant = E;
		        }
		    }

		    return maxEtudiant;
	}
	public etudiant getMinimumGroupe(ArrayList<etudiant> e)
	{
		 Iterator<etudiant> it = e.iterator();
		    etudiant min = it.next(); 
		    float minav = min.getValue();

		    while (it.hasNext()) {
		        etudiant E = it.next();
		        float average = E.getValue();

		        if (average > minav) {
		        	minav = average;
		        	min = E;
		        }
		    }

		    return min;
	}
}
