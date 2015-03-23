package dimensions.solar.position;

import dimensions.solar.world.World;

public class Position {

	public World w;
	public double x = 0;
	public double y = 0;
	public double z = 0;

	public Position(World w, double x, double y, double z) {
		this.w = w;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public World getWorld(){
		return w;
	}
	
	public void setWorld(World w){
		this.w = w;
	}
	
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}
	
}
