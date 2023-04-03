package OTT;

public class Plan 
{
	private int PlanNo;
	private String AppName;
	private float Prize;
	
	public Plan(int planNo, String appName, float prize) 
	{
		super();
		PlanNo = planNo;
		AppName = appName;
		Prize = prize;
	}

	public int getPlanNo() 
	{
		return PlanNo;
	}

	public void setPlanNo(int planNo) 
	{
		PlanNo = planNo;
	}

	public String getAppName() 
	{
		return AppName;
	}

	public void setAppName(String appName) 
	{
		AppName = appName;
	}

	public float getPrize() 
	{
		return Prize;
	}

	public void setPrize(float prize) 
	{
		Prize = prize;
	}

	@Override
	public String toString() 
	{
		return "Plan No : " + PlanNo + " | App Name : " + AppName + " | Prize : " + Prize;
	}
	
	
}
