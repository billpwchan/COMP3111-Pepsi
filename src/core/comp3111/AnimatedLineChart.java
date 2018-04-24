package core.comp3111;

import java.util.ArrayList;
import java.util.List;

import core.comp3111.Chart;
import javafx.collections.ObservableList;

/**
 * @author wonyoung1026
 *
 */

public class AnimatedLineChart extends Chart {
	/**
	 * constructor for animated line chart object before columns for X and Y axis are selected
	 * @param dt
	 * */
	public AnimatedLineChart(DataTable dt){
	 
		dataTable = dt;
	}
	
	/**
	 * constructor for animated line chart object after columns for X and Y axis are selected
	 * @param dt
	 * @param X
	 * @param Y
	 */
	public AnimatedLineChart(DataTable dt, DataTable X, DataTable Y, String t){
		dataTable = dt;
		selectedItemsX = new DataTable();
		selectedItemsY = new DataTable();
		title = t + " animated line chart";
	}
	
	public int getTypeID() {
		return typeID;
	}
	
	public boolean dataRequirementValidation() {
		//at least 2 numeric columns
		if(dataTable.numCountDT() > 1)
			return true;
		
		return false;
	}
	
	//attribute
	private int typeID = 2;

}