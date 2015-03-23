package dimensions.solar.material;

public enum Material{
    
    //Names according to the Minecraft wiki: https://minecraft.gamepedia.com/Data_values/Block_IDs
    
    //Blocks
    AIR("Air", "air", true, false),
    STONE("Stone", "stone", true, true),
    GRASS("Grass Block", "grass", true, true),
    DIRT("Dirt", "dirt", true, true),
    COBBLESTONE("Cobblestone", "cobblestone", true, true),
    WOOD_PLANKS("Wood Planks", "planks", true, true),
    SAPLING("Sapling", "sapling", true, false),
    BEDROCK("Bedrock", "bedrock", true, true),
    WATER("Flowing Water", "flowing_water", true, false),
    STATIONARY_WATER("Stationary Water", "water", true, false),
    LAVA("Flowing Lava", "flowing_lava", true, false),
    STATIONARY_LAVA("Stationary Lava", "lava", true, false),
    SAND("Sand", "sand", true, true),
    GRAVEL("Gravel", "gravel", true, true),
    GOLD_ORE("Gold Ore", "gold_ore", true, true),
    IRON_ORE("Iron Ore", "iron_ore", true, true),
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
