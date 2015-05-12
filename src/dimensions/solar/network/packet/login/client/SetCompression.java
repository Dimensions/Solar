package dimensions.solar.network.packet.login.client;

import dimensions.solar.network.packet.Packet;
import dimensions.solar.network.packet.PacketDirection;

public interface SetCompression extends Packet {
    public default PacketDirection getDirection(){
	return PacketDirection.SERVER_BOUND;
    }
}
