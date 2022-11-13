package com.kiranacademy.InfrastructureStatistic;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BridgeController {
	
	@RequestMapping ("countBridges")
	int noOfBridgesCountInIndia() {
		return 5555;
	}
	@RequestMapping ("favouriteInIndia")
	ArrayList <Bridge> mostFavouriteBridgeInIndia(){
		ArrayList <Bridge> albridge=new ArrayList <Bridge> ();
		Bridge bridge=new Bridge("Shirud",23,"55 mtr","22 mtr");
		Bridge bridge1=new Bridge("Dehradun",64,"333 mtr","12 mtr");
		Bridge bridge2=new Bridge("Akkalpada",65,"683 mtr","25 mtr");
		Bridge bridge3=new Bridge("delhi",53,"544 mtr","54 mtr");
		Bridge bridge4=new Bridge("Gadarpur",98,"652 mtr","45 mtr");
		
		albridge.add(bridge);
		albridge.add(bridge1);
		albridge.add(bridge2);
		albridge.add(bridge3);
		albridge.add(bridge4);


		return albridge;
		
	}

}
