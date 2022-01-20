package com.bajaj.day2;


//component 
interface FeaturesMobile
{
	public void calling(); //2g calling
	public void sendSMS();
	public void playGame();
}

abstract class SimCardHolder
{
	//non abstract method
	public void simCard()
	{
		System.out.println("Normal Sim card");
	}
	
	// abstract method
	abstract void hybridSimCard();
	abstract void Brand();
}

class SmartMobile extends SimCardHolder implements FeaturesMobile
{
	public void OS()
	{
		System.out.println("Android ");
	}
	
	public void videoCalling()
	{
		System.out.println("Video Calling ");
	}

	@Override
	public void calling() {
		// TODO Auto-generated method stub
		System.out.println("4G Calling ");
		
	}

	@Override
	public void sendSMS() {
		// TODO Auto-generated method stub
		System.out.println("Send SMS ");
		
	}

	@Override
	public void playGame() {
		// TODO Auto-generated method stub
		System.out.println("Play games ");
		
	}

	@Override
	void hybridSimCard() {
		// TODO Auto-generated method stub
		System.out.println("Hybrid sim card");
		
	}

	@Override
	void Brand() {
		// TODO Auto-generated method stub
		System.out.println("Realme");
		
	}
	
}
public class MyMobile {
	
	public static void main(String args[])
	{
		SmartMobile m1=new SmartMobile();
		m1.calling();
		m1.hybridSimCard();
		m1.playGame();
		m1.sendSMS();
		m1.OS();
		m1.Brand();
		m1.videoCalling();
		
	}
}