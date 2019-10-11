import java.util.ArrayList;

public class Investment
{
	//field list
	ArrayList<Contribution> theContributions;
	
	public Investment()
	{
		//initializes fields
		this.theContributions = new ArrayList<Contribution>();
	}
	
	//ability to add contribution
	void addContribution(Contribution c)
	{
		for (int i = 0; i <= c.numContributions -1 ; i +=1 )
		{
			this.theContributions.add(c);
		}
	}
		
	
	double getCurrentValue(int howManyMonths)
	{
			
			double workingNum = 0;
			int priceAtTime = howManyMonths / theContributions.get(0).numContributions;
			for(int i = 0; i <= (howManyMonths-1) / priceAtTime; i +=1)
			{
				System.out.println("running top part");
				//adds contribution
				//adds contribution numContributons times
				workingNum += theContributions.get(0).amount;
				for(int k = 0; k <= priceAtTime-1; k+=1 )
				{
					//System.out.println("running mid part");
					workingNum = workingNum * 1.0067;
					
					
				}
				
					
					
				
			}
			
		
		//return the current value of this investment
		//taking time and an average 8% yearly or 0.67% monthly return
		//investment times 1.0067
		return workingNum;
	}
	
	double getTotalContributions()
	{
		int numContributions = theContributions.size();
		double workingNum = theContributions.get(0).amount;
		double answer = numContributions * workingNum;
		return answer;
		//get total amount ever invested not taking into account 
	}
	
}
