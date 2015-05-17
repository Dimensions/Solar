package solar.dimensions.api.block;

import solar.dimensions.api.material.Material;
import solar.dimensions.api.world.World;

public interface Block {
    Material getType();

    void setType(Material m);

    World getWorld();

    float getHardness();

    int getLightValue();

    boolean isReplaceable();

    boolean isBurning();

    int getFlameTick();

    boolean isFlammable();

    int getFireSpreadSpeed();

    boolean isTileEntity();
}
