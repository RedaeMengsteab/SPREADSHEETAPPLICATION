package ClassDomain3_3;

public class Application {
	public void builSample() {
		Sheet samples=new Sheet("sheet1",4,4);
		samples.addCell(new Cell("Airfair:",1,1));
		samples.addCell(new Cell("485.15",1,2));
		samples.addCell(new Cell("What we pay for Airline",1,4));
		
		samples.addCell(new Cell("Taxi:",2,1));
		samples.addCell(new Cell("118",2,2));
		samples.addCell(new Cell("Rental:",3,1));
		samples.addCell(new Cell("295.85",3,2));
		samples.addCell(new Cell("Hotel:",4,1));
		samples.addCell(new Cell("431",4,2));
		samples.addCell(new Cell("Meals:",5,1));
		samples.addCell(new Cell("150",5,2));
		samples.addCell(new Cell("All our meals",5,4));
		
		
		samples.addCell(new Cell("Sub Total:",7,1));
		samples.addCell(new Cell("[1,2]+[2,2]+[3,2]+[4,2]+[5,2]",7,2));
		
		samples.addCell(new Cell("Tax:",8,1));
		samples.addCell(new Cell("0.15",8,2));
		
		samples.addCell(new Cell("Total:",9,1));
	
		
	    samples.addCell(new Cell("Parners",10,1));
		samples.addCell(new Cell("4.0",10,2));
		
		samples.addCell(new Cell("Months:",11,1));
		samples.addCell(new Cell("12.0",11,2));
		
		samples.addCell(new Cell("Installments:",12,1));
		
		
		samples.displaySheet();
		samples.displayAll();
	}
	public static void main(String []args) {
		Application app=new Application();
		app.builSample();
	}

}
