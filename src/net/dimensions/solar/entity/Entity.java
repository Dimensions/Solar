package net.dimensions.solar.entity;

import net.dimensions.solar.world.World;

import java.util.UUID;

public interface Entity
{
    int getEntityId();

    UUID getEntityUuid();

    World getWorld();

    float getPosX();

    float getPosY();

    float getPosZ();

    void setPosition(float posX, float posY, float posZ);

    void setPosition(float posX, float posY, float posZ, float yaw, float pitch);

    void setPosition(Entity entity);

    float getVelX();

    float getVelY();

    float getVelZ();

    void setVelocity(float velX, float velY, float velZ);

    float getYaw();

    float getPitch();

    void setYaw(float yaw);

    void setPitch(float pitch);

    public boolean onGround();
}
