
public class BadToffes {

	public static int [] noofBadTofee(int [] arr, int n){

		int [] badToffee = new int[5];

		int index = 0;

		int stIndex = 0;

		int endIndex = 4;

		while (index < 5){

		int count = 0;

		for (int i = stIndex;i<endIndex;i++){

		if ( checkForbadToffe(arr[stIndex] , stIndex+1)){

		count++;

		}

		}

		stIndex +=5;

		endIndex+=5;

		badToffee[index++] = count;

		}

		return badToffee;

		}

	private static boolean checkForbadToffe(int i, int j) {
		// TODO Auto-generated method stub
		return false;
	}
}
