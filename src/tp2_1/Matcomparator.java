package tp2_1;

import java.util.Comparator;

public class Matcomparator implements Comparator<etudiant>{

	@Override
public int compare(etudiant o1, etudiant o2) {
		
		return o1.getMat().compareTo(o2.getMat());
	}

}
