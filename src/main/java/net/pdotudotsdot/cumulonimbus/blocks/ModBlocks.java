package net.pdotudotsdot.cumulonimbus.blocks;

import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.component.type.SuspiciousStewEffectsComponent;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.pdotudotsdot.cumulonimbus.Cumulonimbus;

import java.util.List;

public class ModBlocks {

    public static final Block SKY_RUBY_BLOCK = registerBlock("sky_ruby_block",new Block(AbstractBlock.Settings.create()
            .strength(5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.YELLOW)));

    public static final Block SKY_RUBY_ORE = registerBlock("sky_ruby_ore",new ExperienceDroppingBlock(UniformIntProvider.create(3,7),
            AbstractBlock.Settings.create().strength(3f).requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.STONE_GRAY)));

    public static final Block DEEPSLATE_SKY_RUBY_ORE = registerBlock("deepslate_sky_ruby_ore",new ExperienceDroppingBlock(UniformIntProvider.create(3,7),
            AbstractBlock.Settings.create().strength(4.5f).requiresTool().sounds(BlockSoundGroup.DEEPSLATE).mapColor(MapColor.DEEPSLATE_GRAY)));

    public static final Block CLOUD_BLOCK = registerBlock("cloud_block",new Block(AbstractBlock.Settings.create()
            .strength(0f).sounds(BlockSoundGroup.WOOL).breakInstantly().dropsNothing().nonOpaque().mapColor(MapColor.CLEAR)));


    // Chrysanthemum's
    public static final Block GREEN_CHRYSANTHEMUM = registerBlock("green_chrysanthemum", new FlowerBlock(createStewEffects(
            new SuspiciousStewEffectsComponent.StewEffect(StatusEffects.SLOW_FALLING, 400)),
            AbstractBlock.Settings.create().noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_GREEN_CHRYSANTHEMUM = registerBlock("potted_green_chrysanthemum", Blocks.createFlowerPotBlock(GREEN_CHRYSANTHEMUM));
    public static final Block RED_CHRYSANTHEMUM = registerBlock("red_chrysanthemum", new FlowerBlock(createStewEffects(
            new SuspiciousStewEffectsComponent.StewEffect(StatusEffects.SLOW_FALLING, 400)),
            AbstractBlock.Settings.create().noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_RED_CHRYSANTHEMUM = registerBlock("potted_red_chrysanthemum", Blocks.createFlowerPotBlock(RED_CHRYSANTHEMUM));
    public static final Block ORANGE_CHRYSANTHEMUM = registerBlock("orange_chrysanthemum", new FlowerBlock(createStewEffects(
            new SuspiciousStewEffectsComponent.StewEffect(StatusEffects.SLOW_FALLING, 400)),
            AbstractBlock.Settings.create().noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_ORANGE_CHRYSANTHEMUM = registerBlock("potted_orange_chrysanthemum", Blocks.createFlowerPotBlock(ORANGE_CHRYSANTHEMUM));
    public static final Block YELLOW_CHRYSANTHEMUM = registerBlock("yellow_chrysanthemum", new FlowerBlock(createStewEffects(
            new SuspiciousStewEffectsComponent.StewEffect(StatusEffects.SLOW_FALLING, 400)),
            AbstractBlock.Settings.create().noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_YELLOW_CHRYSANTHEMUM = registerBlock("potted_yellow_chrysanthemum", Blocks.createFlowerPotBlock(YELLOW_CHRYSANTHEMUM));
    public static final Block WHITE_CHRYSANTHEMUM = registerBlock("white_chrysanthemum", new FlowerBlock(createStewEffects(
            new SuspiciousStewEffectsComponent.StewEffect(StatusEffects.SLOW_FALLING, 400)),
            AbstractBlock.Settings.create().noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_WHITE_CHRYSANTHEMUM = registerBlock("potted_white_chrysanthemum", Blocks.createFlowerPotBlock(WHITE_CHRYSANTHEMUM));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Cumulonimbus.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block){
        Registry.register(Registries.ITEM, Identifier.of(Cumulonimbus.MOD_ID, name), new BlockItem(block, new Item.Settings()));
    }

    public static SuspiciousStewEffectsComponent createStewEffects (SuspiciousStewEffectsComponent.StewEffect...effects){
        return  new SuspiciousStewEffectsComponent(List.of(effects));
    }

    public static void registerModBlocks() {


    }
}
