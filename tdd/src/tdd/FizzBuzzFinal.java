package tdd;

public class FizzBuzzFinal 
{
   
   public void finaloutput()
   {
	   FizzBuzzconverter f= new FizzBuzzconverter();
	for(int i=1; i<=100; i++)
	{
		System.out.println(f.convert(i));
	}
   }
}
