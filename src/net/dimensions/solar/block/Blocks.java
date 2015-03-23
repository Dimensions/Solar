package net.dimensions.solar.block;

public enum Blocks implements Block
{
    ;

    public String getUnlocalizedName()
    {
        return null;
    }

    public float getHardness()
    {
        return 0;
    }

    public int getLightValue()
    {
        return 0;
    }

    public boolean isReplaceable()
    {
        return false;
    }

    public boolean isBurning()
    {
        return false;
    }

    public int getFlammability()
    {
        return 0;
    }

    public boolean isFlammable()
    {
        return false;
    }

    public int getFireSpreadSpeed()
    {
        return 0;
    }

    public boolean hasTileEntity()
    {
        return false;
    }
}
