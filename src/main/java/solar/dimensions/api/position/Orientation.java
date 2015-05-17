package solar.dimensions.api.position;

public class Orientation {
    private float yaw;
    private float pitch;

    public Orientation(float yaw, float pitch) {
        this.yaw = yaw % 360;
        this.pitch = pitch % 360;
    }

    public float getYaw() {
        return yaw;
    }

    public float getPitch() {
        return pitch;
    }
}
