package dimensions.solar.position;

public class Vector {

	public double x = 0;
	public double y = 0;
	public double z = 0;

	public Vector(double x, double y, double z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}

	private Vector() {
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

	@Override
	public int hashCode() {
		return (x + ":" + y + ":" + z).hashCode();
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Vector))
			return false;
		Vector l = (Vector) o;
		return l.x == x && l.y == y && l.z == z;
	}

	public static Vector fromLong(long l) {
		Vector loc = new Vector();
		loc.x = ((int) (l >> 38)) / 32;
		loc.y = ((int) (l << 26 >> 52)) / 32;
		loc.z = ((int) (l << 38 >> 38)) / 32;
		return loc;
	}

	public static long toLong(Vector l) {
		return (((int) l.x * 32) & 0x3ffffff) << 38 | (((int) l.y * 32) & 0xfff) << 26 | (((int) l.z * 32) & 0x3ffffff);
	}
}
