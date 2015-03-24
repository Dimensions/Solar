package net.dimensions.solar.entity;

import java.util.List;	
import net.dimensions.solar.position.Location;		
import net.dimensions.solar.position.Orientation;		
import net.dimensions.solar.position.Vector;		
		
public interface Entity {		
			
	public int getEntityId();		
			
	public Location getLocation();		
			
	public void setLocation(Location p);		
			
	public Orientation getOrientation();		
			
	public void setOrientation(Orientation o);		
			
	public Vector getVelocity();		
			
	public void setVelocity(Vector v);		
			
	public boolean isOnGround();		
			
	public void teleport(Location l);		
			
	public void teleport(Location l, Orientation o);		
			
	public void teleport(Entity e);		
			
	public List<Entity> getNearbyEntities(double x, double y, double z);		
			
}
