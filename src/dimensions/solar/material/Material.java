package dimensions.solar.material;

public enum Material{
    
    //Blocks
    //Names according to the Minecraft wiki: https://minecraft.gamepedia.com/Data_values/Block_IDs
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
    COAL_ORE("Coal Ore", "coal_ore", true, true),
    WOOD("Wood", "log", true, true),
    LEAVES("Leaves", "leaves", true, true),
    SPONGE("Sponge", "sponge", true, true),
    GLASS("Glass", "glass", true, true),
    LAPIS_ORE("Lapis Ore", "lapis_ore", true, true),
    LAPIS_BLOCK("Lapis Block", "lapis_block", true, true),
    DISPENSER("Dispenser", "dispenser", true, true),
    SANDSTONE("Sandstone", "sandstone", true, true),
    NOTEBLOCK("Noteblock", "noteblock", true, true),
    BED("Bed", "bed", true, true),
    POWERED_RAILS("Powered Rails", "golden_rails", true, false),
    DETECTOR_RAILS("Detector Rails", "detector_rails", true, false),
    STICKY_PISTON("Sticky Piston", "sticky_piston", true, false),
    WEB("Cobweb", "web", true, false),
    TALLGRASS("Tallgrass", "tallgrass", true, false),
    DEADBUSH("Dead Bush", "deadbush", true, false),
    PISTON("Piston", "piston", true, true),
    PISTON_HEAD("Piston Head", "piston_head", true, false),
    WOOL("Wool", "wool", true, true),
    PISTON_EXTENSION("Piston Extension", "piston_extension", true, false),
    DANDELIOIN("Dandelion", "yellow_flower", true, false),
    POPPY("Poppy", "red_flower", true, false),
    BROWN_MUSHROOM("Brown Mushroom", "brown_mushroom", true, false),
    RED_MUSHROOM("Red Mushroom", "red_mushroom", true, false),
    GOLD_BLOCK("Gold Block", "gold_block", true, true),
    IRON_BLOCK("Iron Block", "iron_block", true, true),
    DOUBLE_STONE_SLAB("Double Stone Slab", "double_stone_slab", true, true),
    STONE_SLAB("Stone Slab", "stone_slab", true, true),
    BRICKS("Bricks", "brick_block", true, true),
    TNT("TNT", "tnt", true, true),
    BOOKSHELF("Bookshelf", "bookshelf", true, true),
    MOSSY_COBBLESTONE("Mossy Cobblestone", "mossy_cobblestone", true, true),
    OBSIDIAN("Obsidian", "obsidian", true, true),
    TORCH("Torch", "torch", true, false),
    FIRE("Fire", "fire", true, false),
    MOB_SPAWNER("Mod Spawner", "mob_spawner", true, true),
    OAK_STAIRS("Oak Stairs", "oak_stairs", true, true),
    CHEST("Chest", "chest", true, true),
    RESTONE_WIRE("Redstone Wire", "redstone_wire", true, false),
    DIAMOND_ORE("Diamond Ore", "diamond_ore", true, true),
    DIAMOND_BLOCK("Diamond Block", "diamond_block", true, true),
    CRAFTING_TABLE("Crafting Table", "crafting_table", true, true),
    WHEAT("Wheat", "wheat", true, false),
    FARMLAND("Farmland", "farmland", true, true),
    FURNACE("Furnace", "furnace", true, true), 
    FURNACE_BURNING("Burning Furnace", "lit_furnace", true, true),
    SIGN_STANDING("Standing Sign", "standing_sign", true, false),
    OAK_DOOR("Wooden Door", "wooden_door", true, true),
    LADDER("Ladder", "ladder", true, false),
    RAIL("Rail", "rail", true, false),
    STONE_STAIRS("Stone Stairs", "stone_stairs", true, true),
    WALL_SIGN("Wall Sign", "wall_sign", true, false),
    LEVER("Lever", "lever", true, false),
    STONE_PRESSURE_PLATE("Stone Pressure Plate", "stone_pressure_plate", true, false),
    IRON_DOOR("Iron Door", "iron_door", true, true),
    WOODEN_PRESSURE_PLATE("Wooden Pressure Plate", "wooden_pressure_plate", true, false),
    REDSTONE_ORE("Redstone Ore", "redstone_ore", true, true),
    REDSTONE_ORE_LIT("Lit Redstone Ore", "lit_redstone_ore", true, true),
    REDSTONE_TORCH_UNLIT("Unlit Redstone Torch", "unlit_redstone_torch", true, true),
    REDSTONE_TORCH("Redstone Torch", "redstone_torch", true, true),
    STONE_BUTTON("Stone Button", "stone_button", true, false),
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
