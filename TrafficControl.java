/**
 * 
 */
package snellweaver.junction;

/**
 * @author ALISHA
 *
 */
public class TrafficControl {

	/**
	 * @param args
	 */
	int SnellNorth, SnellSouth, WeaverEast, WeaverWest, second;
	
	private void numberOfCars()
	{
		int count;
		this.second = 0;
		System.out.println(this.second+": N = " + this.SnellNorth+"; S = " + this.SnellSouth + "; E = " + this.WeaverEast + "; W = " + this.WeaverWest);
		for (this.second = 1; this.second <= 20; this.second++)
		{
			count = second % 8;
			switch(count)
			{
			case 0:
			case 1:
			case 5: this.SnellNorth += 1;
				    this.SnellSouth += 1;
				    this.WeaverEast += 1;
				    this.WeaverWest += 1;
				    break;
			case 2: 
			case 3: this.WeaverEast += 1;
    	    		this.WeaverWest += 1;
    	    		break;
			case 4: 
			case 6: 
			case 7:	this.SnellNorth += 1;
    				this.SnellSouth += 1;
    				break;				    
			}
			System.out.println(this.second+": N = " + this.SnellNorth+"; S = " + this.SnellSouth + "; E = " + this.WeaverEast + "; W = " + this.WeaverWest);			
		}
	}
	
	
	public TrafficControl(int SnellNorthStart, int SnellSouthStart, int WeaverEastStart, int WeaverWestStart)
	{
		SnellNorth = SnellNorthStart;
		SnellSouth = SnellSouthStart;
		WeaverEast = WeaverEastStart;
		WeaverWest = WeaverWestStart;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TrafficControl SWT = new TrafficControl(0,0,0,0);
		SWT.numberOfCars();

	}

}
