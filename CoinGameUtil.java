

import java.util.Random;

public class CoinGameUtil
{
	public static String flipCoin()
	{
		Random random=new Random();
		String flipResult=new String("");
		int rNum=random.nextInt(CoinGameConstants.FLIP_TIME_INTERVAL);
		int i=0;
		int count=0;
		System.out.println("coin flipping...");
		while(i<rNum)
		{
			flipResult=CoinGameConstants.FLIP_ARRAY[count];
			count++;
			if(count==2)
			{
				count=0;
			}
			i++;
		}
		return flipResult;
	}
	public static String  getWinner(CoinGameObj coinGameObj)
	{
		String winnerName="";
		if(coinGameObj.getFlipResult().equals(coinGameObj.getTellerAnswer()))
		{
			winnerName=coinGameObj.getTeller();
			String flipperName=coinGameObj.getFlipper();
			String tellerName=coinGameObj.getTeller();
			coinGameObj.setFlipper(tellerName);
			coinGameObj.setTeller(flipperName);
			
		}
		else 
		{
			winnerName=coinGameObj.getFlipper();
		}
		coinGameObj.setScore(winnerName, coinGameObj.getScore(winnerName)+1);
		return winnerName;
	}
	public static int getMaxScore(int player1Score,int Player2Score)
	{
		int maxscore=player1Score;
		if(maxscore < Player2Score)
		{
			maxscore=Player2Score;
		}
		return maxscore;
	}
	public static final String getFinalWinner(CoinGameObj coinGameObj)
	{
		String winner="";
		return winner;
	}

}
