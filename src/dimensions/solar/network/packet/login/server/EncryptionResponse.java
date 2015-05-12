package dimensions.solar.network.packet.login.server;

import dimensions.solar.network.packet.Packet;
import dimensions.solar.network.packet.PacketDirection;

public interface EncryptionResponse extends Packet {
    public default PacketDirection getDirection(){
	return PacketDirection.CLIENT_BOUND;
    }
}
