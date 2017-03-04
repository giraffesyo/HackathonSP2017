import java.util.Scanner;

public class Model
{
	String id;
	Data data;
	public Model(String id){
		
		if(!id.contains("#"))
		{
			System.out.println("Please enter id like this: 	giraffesyo#1652 ");
		}
		else 
		{
			int seperate = id.indexOf("#");
			String name = id.substring(0,seperate);
			String number = id.substring(seperate+1);
			Machine statsGrabber = new Machine();
			statsGrabber.updateStats(name,number);

			//System.out.println(statsGrabber.getRawStats());
			data = new Data(statsGrabber.getRawStats());
		}
	}
	
	public Data getData()
	{
		return data;
	}
	
}