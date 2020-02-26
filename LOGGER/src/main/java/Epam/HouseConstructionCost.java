package Epam;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HouseConstructionCost {
	private static final Logger LOGGER =LogManager.getLogger(HouseConstructionCost.class);
		public double FullyAutomatedHomeCost(String MaterialStandard,double AreaOfHouseInFeets)
	{
			LOGGER.debug("THIS IS A DEBUG LOGGER");
			LOGGER.info("THIS IS A INFO LOGGER");
			LOGGER.warn("THIS IS A WARN LOGGER");
			LOGGER.error("THIS IS A ERROR LOGGER");
			LOGGER.fatal("THIS IS A FATAL LOGGER");
			

		double cost=0;
		if(MaterialStandard.equals("StandardMaterials"))
	   {
		cost=1200*(AreaOfHouseInFeets);
	   }
		else if(MaterialStandard.equals("AboveStandardMaterials"))
		{
		cost =1500*(AreaOfHouseInFeets);	
		}
		else if(MaterialStandard.equals("HighStandardMaterial"))
		{
		cost=1800*(AreaOfHouseInFeets);	
		}
		else if(MaterialStandard.equals("HighStandardMaterialAndFullyAutomatedHome"))
		{
		cost=2500*(AreaOfHouseInFeets);	
		}
		
			
		return cost;
	}

}
