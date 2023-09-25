package com.tka.encapsulation;

public class Voting {
         
	  private  int voterid;
	  private String voternm;
	
	    void setData(int voterid,String voternm)
	    {
	    	this.voterid=voterid;
	    	this.voternm=voternm;
	    }
	    void getData()
	    {
	    	System.out.print(voterid);
	  
			System.out.println(voternm);
	    }
	    
	    

}
