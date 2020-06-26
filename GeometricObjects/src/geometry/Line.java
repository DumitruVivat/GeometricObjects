package geometry;

public class Line {
	 // properties
	  public int startX;
	  public int endX;
	  public int startY;
	  public int endY;


	  // constructor
	  public Line(int startX,int startY,int endX,int endY) {
		if(startX != endX) {
	        this.startX = startX;
	        this.endX   = endX;
		} else {
			System.err.println( "The coordonate are at the same dote!");
		} if(startY != endY) {
			this.startY = startY;
		    this.endY   = endY;
		} else {
			System.err.println( "The coordonate are at the same dote!");
		}
	  } 
	  public void printCoords() {
		  System.out.println( "[" + startX + ":" + startY + "]" +
	                           "----->"                         +
	                          "[" + endX + ":" + endY + "]"   
				  );
	  }
	  public int length() {
		  return (int) Math.sqrt((startX - endX) * (startX - endX) + (startY - endY) * (startY - endY));
	  }
 }
