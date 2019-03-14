
import java.util.LinkedHashMap;

public class CoinGameObj 
{
	private static String player1=new String();
	private static String player2=new String();
	private static LinkedHashMap<String,Integer> scoreMap=new LinkedHashMap<String,Integer>();
	private static String flipResult=new String();
	private static String tellerAnswer=new String();
	private static String flipperName=new String();
	private static String tellerName=new String();
	private static int maximumPoint=0;
	private static String finalWinner=new String();
	public void setPlayer1Name(String player1)
	{
		CoinGameObj.player1=player1;
	}
	public String getPlayer1Name()
	{
		return CoinGameObj.player1;
	}
	public void setPlayer2Name(String player2)
	{
		CoinGameObj.player2=player2;
	}
	public String getPlayer2Name()
	{
		return CoinGameObj.player2;
	}
	public void setFlipper(String flipperName)
	{
		CoinGameObj.flipperName=flipperName;
	}
	public void setTeller(String tellerName)
	{
		CoinGameObj.tellerName=tellerName;
	}
	public String  getTeller()
	{
		return CoinGameObj.tellerName;
	}
	public String  getFlipper()
	{
		return CoinGameObj.flipperName;
	}
	public void setFlipResult(String flipresult)
	{
		CoinGameObj.flipResult=flipresult;
	}
	public String getFlipResult()
	{
		return CoinGameObj.flipResult;
	}
	public void setTellerAnswer(String tAns)
	{
		CoinGameObj.tellerAnswer=tAns;
	}
	public String getTellerAnswer()
	{
		return CoinGameObj.tellerAnswer;
	}
	public void setScore(String playerName,int score)
	{
		scoreMap.put(playerName,score);
	}
	public int getScore(String playerName)
	{
		if(scoreMap.containsKey(playerName))
		{			
			return CoinGameObj.scoreMap.get(playerName);
		}
		return 0;
	}
	public void setMaxPoint(int maxPoint)
	{
		CoinGameObj.maximumPoint=maxPoint;
	}
	public int getMaxPoint()
	{
		return CoinGameObj.maximumPoint;
	}
	public String getFinalWinner() 
	{
		return finalWinner;
	}
	public void setFinalWinner(String finalWinner)
	{
		CoinGameObj.finalWinner = finalWinner;
	}
	

}
