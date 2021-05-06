
import java.util.StringTokenizer;

public class MyClass {

	public static void main(String[] args) {
		
		
		StringBuffer input = new StringBuffer();
		
		for(int i =0; i <args.length; i++)
		{
			input.append(args[i]  + " ");
		}
		String sentence = input.toString();
		
		
		
		StringTokenizer st = new StringTokenizer(sentence, " ");
        	StringBuffer pigLatinSentence = new StringBuffer();
	    
	    
	    
	   

		while(st.hasMoreTokens())
		{
		
			String word  = st.nextToken();
			StringBuffer punctuationMarks = new StringBuffer();
			
			
			StringBuffer sb = new StringBuffer();
			String append = "ay";
			boolean isUpper = false;

			for (int i =0; i < word.length() ; i ++)
			{
				if (i==0)
				{
					 
					 char begin = word.charAt(i);
					 if(Character.isUpperCase(begin) &&
							 begin !='A' && begin !='E' && begin !='I' 
							 && begin != 'O' && begin != 'U')
					 {
						 isUpper = true;
					 }
	
					 if ( begin != 'a' && begin != 'e' && begin != 'i' &&
					      begin !='o' && begin != 'u' && begin !='A' && begin !='E' && begin !='I' 
							 && begin != 'O' && begin != 'U')
							 {
						             begin = Character.toLowerCase (begin);

					                     append = begin + append; 
							 }
					 else
					 {
							sb.append(begin);
	
					 }
						
							
				}
				else
				{
					
					String matcher = Character.toString (word.charAt(i));
					
					if (matcher.matches("\\p{Punct}+"))
				    {
						punctuationMarks.append(matcher);
					
				    }
					
					
					else if( (isUpper == true) && i==1)
					{
					
						sb.append(Character.toUpperCase(word.charAt(i)));
					}
					else
					{
	
						
						sb.append(Character.toLowerCase
								(word.charAt(i)));
					}
				}
			}
			sb.append(append);
			pigLatinSentence.append(sb.toString());
			pigLatinSentence.append(punctuationMarks.toString());
			pigLatinSentence.append(" ");
		}
		// TODO Auto-generated method stub
        System.out.println(pigLatinSentence.toString());
	}
    
}
