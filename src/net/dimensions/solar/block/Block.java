package net.dimensions.solar.block;

public interface Block
{
    String getUnlocalizedName();

    float getHardness();

    int getLightValue();

    boolean isReplaceable();

    boolean isBurning();

    int getFlammability();

    boolean isFlammable();

    int getFireSpreadSpeed();

    boolean hasTileEntity();
}
