package dimensions.solar.entity;

import dimensions.solar.position.Location;
import dimensions.solar.position.Orientation;
import dimensions.solar.position.Vector;

import java.util.List;

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

	public int getFireTicks();

	public void setFireTicks(int i);

	/**
	 * Remove entity
	 */
	public void kill();

}
