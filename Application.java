package classDomain3cleancode;


public class Application {
	
		public void builSample() {
			Sheet samples=new Sheet("sheet1",4,4);
			samples.addCell("Airfair:",1,1);
			samples.addCell("485.15",1,2);
			samples.addCell(" ",1,3);
			samples.addCell("What we pay to the Airline",1,4);
			
			samples.addCell("Taxi:",2,1);
			samples.addCell("[1,2]",2,2);
			samples.addCell("Rental Car:",3,1);
			samples.addCell("295.85",3,2);
			samples.addCell("Hotel:",4,1);
			samples.addCell("431",4,2);
			samples.addCell("Meals:",5,1);
			samples.addCell("[2,2]",5,2);
			samples.addCell(" ",5,3);
			samples.addCell("All meals combined ",5,4);
			
			
			samples.addCell("Sub Total:",7,1);
			samples.addCell("[1,2]+[2,2]+[3,2]+[4,2]+[5,2]",7,2);
			
			samples.addCell("Dicount:",8,1);
			samples.addCell("0.15",8,2);
			
			samples.addCell("Total:",9,1);
		
			
		    samples.addCell("Partners 007: ",10,1);
			samples.addCell("4",10,2);
			
			samples.addCell("Months:",11,1);
			samples.addCell("12.0",11,2);
			
			samples.addCell("Installments:",12,1);
			
			
			samples.displaySheet();
			samples.displayAll();
		}
		public static void main(String []args) {
			Application app=new Application();
			app.builSample();
		}

	}
