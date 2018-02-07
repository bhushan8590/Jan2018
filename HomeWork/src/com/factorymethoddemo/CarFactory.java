package com.factorymethoddemo;

public class CarFactory {
	public Car getCar(String c){
		if(c == null){
	         return null;
	      }		
	      if(c.equalsIgnoreCase("honda")){
	         return new Honda();
	         
	      } else if(c.equalsIgnoreCase("nissan")){
	         return new Nissan();
	         
	      } else if(c.equalsIgnoreCase("toyota")){
	         return new Toyota();
	      }
	      
	      return null;
	}
}
