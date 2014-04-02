package Visitors;

import Human.*;

public class Visitors extends Human{
	public Visitors(){
		super();
		super.name = "Visitor";
	}
	public void purchaseTicket(){
		System.out.println(super.name + " Purchase Ticket");
	}
	public void baggageCheck(){
		System.out.println(super.name + " Baggage check");
	}
}
