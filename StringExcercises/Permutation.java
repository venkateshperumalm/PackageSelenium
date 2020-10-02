package StringExcercises;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

class Permutation {
	public static void main (String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Permutations for How many strings?");
		int t = Integer.parseInt(br.readLine());
		System.out.println("Type Permutation strings: ");
		while(t-->0)
		{
			String s = br.readLine();   
			char a[] = s.toCharArray();  //Convert the input string to char array.

			List<String> list = permute(a);     

			for(int i=0;i<list.size();i++)
				System.out.print(list.get(i)+" ");

			System.out.println();
		}
	}

	static List<String> permute(char a[])
	{   
		int n =a.length;

		////We use TreeMap so that the char array is sorted according to the keys. Thus we get result in lexological order.
		TreeMap<Character,Integer> map = new TreeMap<>();  

		//Now we store the counts of all characters.
		for(int i=0;i<n;i++)
		{
			if(map.get(a[i])==null)
				map.put(a[i],1);

			else  
				map.put(a[i],map.get(a[i])+1);
		}

		//string array -> to store all the unique chars ,  integer array -> to store the count of each char 
		char str[] = new char[map.size()]; 
		int count[] = new int[map.size()];

		//We create an entrySet for the TreeMap. We transfer all counts and chars from the map to the above arrays.
		int index = 0;
		for(Map.Entry<Character,Integer> e : map.entrySet())  
		{
			str[index] = e.getKey();
			count[index] = e.getValue();
			index++;
		}

		//res size = length of input string as the result will have same length as input string. STORES INDIVIDUAL RESULTS.
		char res[] = new char[a.length];

		//We use ArrayList because we do not know how many unique permutations will be generated. STORES ALL THE RESULTS.
		ArrayList<String> resList = new ArrayList<>();

		recursion(str,count,res,resList,0);   //pass level as 0.

		return resList;
	}

	static void recursion(char str[], int count[], char res[] , List<String> resList , int level )
	{
		//BASE CASE : If we reach last level ->one permutation is formed.
		if(level==res.length)                 
		{ resList.add(String.valueOf(res));   //char array is converted into String.
		return; }

		for(int i=0 ;i<str.length;i++)  //Move from left to right of unique char array(str) to find non-zero count character.
		{
			if(count[i]==0) continue;  //If the count is 0, then skip.

			res[level] = str[i];  // Store non-zero count char in result at the index equal to CURRENT LEVEL.
			count[i]--;
			recursion(str,count,res,resList,level+1); //RECURSIVE CASE
			count[i]++; //Restoring count to account for backtracking to find other permutations.
		}
	}

}

