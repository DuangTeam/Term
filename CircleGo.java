import processing.core.PApplet;


public class CircleGo extends PApplet {
	
	float i = 0, x = 0, y = 0;
	
	public void settings() {
		size(1000, 600);
	}

	public void setup() {
		
		
		
	}

	public void draw() {
		background(144, 207, 240);
		
		fill(245, 222, 179);
		rect(300, 250, 100, 100);
		
		fill(176, 224, 230);
		rect(600, 250, 100, 100);
		
		fill(0, 224, 158);
		ellipse(x, y, 50, 50);
		fill(244, 188, 199);
		ellipse(1000 - x, 600 - y, 50, 50); 
		
		if(i >= PI * 0.25 && i <= PI * 1.75 || i >= PI * 2.25 && i <= PI * 3.75){
			i += 0.035f;
		}else{
			i += 0.08f;
		}
		i = i >= 4 * PI ? 0 : i;
		
		if(i >= 0 && i <= 2 * PI){
			y = 300 - 150 * sin(i);
			x = 350 + 150 * cos(i);
		}else{
			y = 300 - 150 * sin(i);
			x = 650 - 150 * cos(i);
		}
		
	}
	
	public static void main(String[] args) {
		PApplet.main("CircleGo");
	}
	
}



