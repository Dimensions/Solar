package dimensions.solar.material;

public enum Material{
    
    //Names according to the Minecraft wiki: https://minecraft.gamepedia.com/Data_values/Block_IDs
    AIR("Air", "air", true, false),
    STONE("Stone", "stone", true, true),
    GRASS("Grass Block", "grass", true, true),
    DIRT("Dirt", "dirt", true, true),
    COBBLESTONE("Cobblestone", "cobblestone", true, true),
    WOOD_PLANKS("Wood Planks", "planks", true, true),
    ;

    private String name;
    private boolean isBlock, isSolid;
    private String minecraft_id;
    
    Material(String name, String minecraft_id, boolean isBlock, boolean isSolid){
        this.name = name;
        this.minecraft_id = minecraft_id;
        this.isBlock = isBlock;
        this.isSolid = isSolid;
    }
    
    public String toString(){
        return name;
    }
    
    public String getId(){
        return "minecraft:" + minecraft_id;
    }
    
    public boolean isBlock(){
        return isBlock;
    }

    public boolean isSolid(){
        return isSolid;
    }

}
