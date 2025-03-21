public class PracticeProblem{
	static void selectionSortName(String[] names, int[] ages){
		for(int i = 0; i < names.length; ++i){
			int smallestIndex = i;
			for(int j = i+1; j < names.length; ++j){
				if(names[j].compareToIgnoreCase(names[smallestIndex]) < 0){
					smallestIndex = j;
				}
			}
			String temp = names[i];
			int temp1 = ages[i];
			names[i] = names[smallestIndex];
			ages[i] = ages[smallestIndex];
			names[smallestIndex] = temp;
			ages[smallestIndex] = temp1;
		}
	}

	static void selectionSortAge(String[] names, int[] ages){
		for(int i = 0; i < ages.length; ++i){
			int smallestIndex = i;
			for(int j = i+1; j < ages.length; ++j){
				if(ages[j] < ages[smallestIndex]){
					smallestIndex = j;
				}
			}
			String temp = names[i];
			int temp1 = ages[i];
			names[i] = names[smallestIndex];
			ages[i] = ages[smallestIndex];
			names[smallestIndex] = temp;
			ages[smallestIndex] = temp1;
		}
	}

	public static void main(String args[]){}
}
