package ArrayList;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<String>();
		names.remove(1);
		names.remove(2);
		names.add("John");
		names.add("Greg");
		names.add("Maria");
		names.add("Heldi");
		System.out.println();
		for(int k=0;k<names.size();k++) {
			System.out.print(names.get(k)+" ");
		}

	}

}
