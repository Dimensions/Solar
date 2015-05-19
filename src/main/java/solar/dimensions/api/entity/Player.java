package solar.dimensions.api.entity;

import java.util.UUID;

public interface Player extends LivingEntity {

    String getName();

    String getDisplayName();

    UUID getUUID();

}
