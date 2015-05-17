package solar.dimensions.api.entity;

import solar.dimensions.api.position.Location;
import solar.dimensions.api.position.Orientation;
import solar.dimensions.api.position.Vector;

import java.util.List;

public interface Entity {
    int getEntityId();

    Location getLocation();

    void setLocation(Location p);

    Orientation getOrientation();

    void setOrientation(Orientation o);

    Vector getVelocity();

    void setVelocity(Vector v);

    boolean isOnGround();

    void teleport(Location l);

    void teleport(Location l, Orientation o);

    void teleport(Entity e);

    List<Entity> getNearbyEntities(double x, double y, double z);

    int getFireTicks();

    void setFireTicks(int i);

    void kill();
}
