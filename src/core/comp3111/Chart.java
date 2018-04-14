package core.comp3111;

import java.io.Serializable;

/**
 * @author wonyoung1026
 *
 */
public abstract class Chart implements Serializable{

	//attribute
	protected static DataTable dataTable;
	private static final long serialVersionUID = 645367683485015133L;
	private int option = 1;
	
	//function
	/**
	 * 
	 */
	protected abstract boolean dataRequirementValidation();
	public Chart() {
		option = 1;
	}
}
