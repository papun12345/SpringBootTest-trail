package com.Test.myWebApp_Test;

import java.util.ArrayList;
import java.util.List;

public class DataList {
	public List<Details> getDetails()
	{
		List<Details> listDetails=new ArrayList<Details>();
		listDetails.add(new Details("subha","papunpikun@gmail.com",22));
		listDetails.add(new Details("sanket","subhasanket.satapathy.wipro.com",22));
		listDetails.add(new Details("satapathy","hello@gmail.com",22));
		return listDetails;
				
	}

}
