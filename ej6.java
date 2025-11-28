package tarea5b;

public class ej6 {
	public static int[] sinrepe(int[] t) {
	    int[] temp = new int[t.length];
	    int count = 0;

	    for (int i = 0; i < t.length; i++) {
	        boolean esta = false;

	        for (int j = 0; j < count; j++) {
	            if (temp[j] == t[i]) {
	                esta = true;
	                break;
	            }
	        }

	        if (!esta) {
	            temp[count] = t[i];
	            count++;
	        }
	    }

	    int[] res = new int[count];
	    for (int i = 0; i < count; i++) res[i] = temp[i];

	    return res;
	}

}
