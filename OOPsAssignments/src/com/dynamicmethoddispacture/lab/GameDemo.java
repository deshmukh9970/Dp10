package com.dynamicmethoddispacture.lab;

//Create a class Game having the method rules() and noOfPlayers(). Create a class BasketBall, Soccer, Cricket
//which are child class of Game. Override the above methods and use dynamic method dispatch
//to show thw rules and noofPlayers according to the object passed


class Game
{
	
	void rules()
	{
		System.out.println("According to Game Craete Rule : ");
	}
	
	void noOfPlayers()
	{
		System.out.println("According to Game Craete Team : ");
	}
	
}

class BasketBall extends Game
{
	@Override
	void rules()
	{
		System.out.println("Game is BasketBall.  Rules are : ");
		System.out.println("Rules 1 Crate two team : ");
		System.out.println("Rules 2 Time  is 30 minute to play game : ");
	}
	
	@Override
	void noOfPlayers()
	{
		System.out.println("Game is BasketBall.  noOfPlayers are  8 : ");
		System.out.println("Each team  ");
	}
	
}

class Soccer extends Game
{
	@Override
	void rules()
	{
		System.out.println("Game is Soccer.  Rules are : ");
		System.out.println("Rules 1 Crate two team : ");
		System.out.println("Rules 2 Time  is 40 minute to play game : ");
	}
	
	@Override
	void noOfPlayers()
	{
		System.out.println("Game is Soccer.  noOfPlayers are  9 : ");
		System.out.println("Each team  ");
	}
}

class Cricket extends Game
{
	
	@Override
	void rules()
	{
		System.out.println("Game is Cricket.  Rules are : ");
		System.out.println("Rules 1 Crate two team : ");
		System.out.println("Rules 2 Time  is no limit to play game : ");
	}
	
	@Override
	void noOfPlayers()
	{
		System.out.println("Game is Cricket.  noOfPlayers are  11 : ");
		System.out.println("Each team  ");
	}
	
}


public class GameDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Game g;
		
		System.out.println("*******BasketBall*********");
		g=new BasketBall();
		g.rules();
		g.noOfPlayers();
		
		System.out.println("*******Soccer*********");
		g=new Soccer();
		g.rules();
		g.noOfPlayers();
		
		System.out.println("*******Cricket*********");
		g=new Cricket();
		g.rules();
		g.noOfPlayers();
		
		

	}

}
