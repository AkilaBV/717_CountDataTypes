package CountDataTypes;

import org.testng.annotations.Test;

public class CountDataTypesString {
	
	@Test
	public void findCountOfDataTypesInAString(){
		String in= "can you give me 10 bucks puff in 7.5 or 7";
		
		String Arr[]=in.split(" ");
	
		int i=0;
		int lcount=0,icount=0,dcount=0;
		
		for( i=0;i<Arr.length;i++) {
			String temp=Arr[i];
			if(temp.matches("(.*)[a-z]|[A-Z](.*)")) {
				lcount++;
			}else if (temp.matches("(.*)[0-9](.*)") && !temp.contains(".")) {
				icount++;
			}else if (temp.matches("(.*)[0-9]|.|[0-9](.*)")) {
				dcount++;
			}
			
		}
		System.out.println("Number of integers in given string :" + icount);
		System.out.println("Number of double in given string :" + dcount);
		System.out.println("Number of words in given string :" + lcount);
	}

}
