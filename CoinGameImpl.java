
import java.util.Scanner;

public class CoinGameImpl implements Game 
{
	
	Scanner in =new Scanner(System.in);
	CoinGameObj coinGameObj=new CoinGameObj();
	public void initGame()
	{	
		System.out.println("Welcome to Coin Game!!!");
		System.out.println("Enter player1 Name");
		coinGameObj.setPlayer1Name(in.nextLine());
		System.out.println("Enter player2 Name");
		coinGameObj.setPlayer2Name(in.nextLine());
		coinGameObj.setFlipper(coinGameObj.getPlayer1Name());
		coinGameObj.setTeller(coinGameObj.getPlayer2Name());
	}
	public void startGame()
	{
		initGame();
		int i=0;
		do
		{
			System.out.println("Turn:::"+i+"\n");
			System.out.println("flipper Name::"+coinGameObj.getFlipper()+"  Teller Name::"+coinGameObj.getTeller()+"\n");
			coinGameObj.setFlipResult(CoinGameUtil.flipCoin());
			System.out.println("Head or Tail ?"+coinGameObj.getTeller());
			coinGameObj.setTellerAnswer(in.nextLine());
			String winnerName=CoinGameUtil.getWinner(coinGameObj);
			System.out.println("Flip Result::"+coinGameObj.getFlipResult());
			System.out.println("Winner:::"+winnerName);
			ScoreBoard();
		}
		while(coinGameObj.getMaxPoint() < CoinGameConstants.MAX_WINNING_POINT);
		if(coinGameObj.getMaxPoint()==CoinGameConstants.MAX_WINNING_POINT)
		{
			endGame();
		}
	}
	public void endGame() 
	{	
		System.out.println("Game End::");
		System.out.println("Final Winner Name:::"+coinGameObj.getFinalWinner());
	}
	public void ScoreBoard()
	{		
		int player1Score=coinGameObj.getScore(coinGameObj.getPlayer1Name());
		int player2Score=coinGameObj.getScore(coinGameObj.getPlayer2Name());
		System.out.println("Player1 Score::"+player1Score);
		System.out.println("Player2 Score::"+player2Score);
		int maxscore=CoinGameUtil.getMaxScore(player1Score, player2Score);
		coinGameObj.setMaxPoint(maxscore);
		if(maxscore==player1Score)
		{
			coinGameObj.setFinalWinner(coinGameObj.getPlayer1Name());
		}
		else 
		{
			coinGameObj.setFinalWinner(coinGameObj.getPlayer2Name());
		}
	}

}
