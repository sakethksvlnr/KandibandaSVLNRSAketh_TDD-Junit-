package com.EPAM.maven.TDD_JUNIT;

public class RemoveFirstTwoA {

	public String removeA(String string) {
		String result="";
		if(string.length()==1 && string.charAt(0)!='A')
		{
			result=result+string.charAt(0);
		}
		else if(string.length()>=2)
		{
			for(int i=0;i<2;i++)
			{
				if(string.charAt(i)!='A')
				{
					result=result+string.charAt(i);
				}
			}
			if(string.length()>2)
			{
				result=result+string.substring(2);
			}
		}
		return result;
	}

}
