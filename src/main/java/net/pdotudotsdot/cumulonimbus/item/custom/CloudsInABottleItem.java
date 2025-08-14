package net.pdotudotsdot.cumulonimbus.item.custom;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundCategory;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.Rarity;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.pdotudotsdot.cumulonimbus.blocks.ModBlocks;

import java.util.List;


public class CloudsInABottleItem extends Item {

    int maxCount = 1;
    Rarity rarity = Rarity.UNCOMMON;




    public CloudsInABottleItem(Settings settings) {
        super(settings);
    }

    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {

        //y-
        if (world.getBlockState(new BlockPos((int) user.getX(),  user.getBlockY() - 1, (int) user.getZ())).isAir()){

            world.setBlockState(new BlockPos((int) user.getX(),  user.getBlockY() - 1, (int) user.getZ()),
                    ModBlocks.CLOUD_BLOCK.getDefaultState());



      }
        //x+
        if (world.getBlockState(new BlockPos((int) user.getX() + 1,  user.getBlockY() - 1, (int) user.getZ())).isAir()){

            world.setBlockState(new BlockPos((int) user.getX() + 1,  user.getBlockY() - 1, (int) user.getZ()),
                    ModBlocks.CLOUD_BLOCK.getDefaultState());


        }

        //x-
        if (world.getBlockState(new BlockPos((int) user.getX() - 1,  user.getBlockY() - 1, (int) user.getZ())).isAir()){

            world.setBlockState(new BlockPos((int) user.getX() - 1,  user.getBlockY() - 1, (int) user.getZ()),
                    ModBlocks.CLOUD_BLOCK.getDefaultState());


        }

        //z+
        if (world.getBlockState(new BlockPos((int) user.getX(),  user.getBlockY() - 1, (int) user.getZ() + 1)).isAir()){

            world.setBlockState(new BlockPos((int) user.getX(),  user.getBlockY() - 1, (int) user.getZ() + 1),
                    ModBlocks.CLOUD_BLOCK.getDefaultState());



        }

        //z-
        if (world.getBlockState(new BlockPos((int) user.getX(),  user.getBlockY() - 1, (int) user.getZ() - 1)).isAir()){

            world.setBlockState(new BlockPos((int) user.getX(),  user.getBlockY() - 1, (int) user.getZ() - 1),
                    ModBlocks.CLOUD_BLOCK.getDefaultState());



        }

        //x+ z+
        if (world.getBlockState(new BlockPos((int) user.getX() + 1,  user.getBlockY() - 1, (int) user.getZ() + 1)).isAir()){

            world.setBlockState(new BlockPos((int) user.getX() + 1,  user.getBlockY() - 1, (int) user.getZ() + 1),
                    ModBlocks.CLOUD_BLOCK.getDefaultState());


        }

        //x+ z-
        if (world.getBlockState(new BlockPos((int) user.getX() + 1,  user.getBlockY() - 1, (int) user.getZ() - 1)).isAir()){

            world.setBlockState(new BlockPos((int) user.getX() + 1,  user.getBlockY() - 1, (int) user.getZ() - 1),
                    ModBlocks.CLOUD_BLOCK.getDefaultState());


        }

        //x- z-
        if (world.getBlockState(new BlockPos((int) user.getX() - 1,  user.getBlockY() - 1, (int) user.getZ() - 1)).isAir()){

            world.setBlockState(new BlockPos((int) user.getX() - 1,  user.getBlockY() - 1, (int) user.getZ() - 1),
                    ModBlocks.CLOUD_BLOCK.getDefaultState());


        }

        //x- z+
        if (world.getBlockState(new BlockPos((int) user.getX() - 1,  user.getBlockY() - 1, (int) user.getZ() + 1)).isAir()){

            world.setBlockState(new BlockPos((int) user.getX() - 1,  user.getBlockY() - 1, (int) user.getZ() + 1),
                    ModBlocks.CLOUD_BLOCK.getDefaultState());


        }

        world.playSound(null, user.getX(),  user.getBlockY() - 1, user.getZ(), BlockSoundGroup.WOOL.getPlaceSound(), SoundCategory.BLOCKS, 1f, 1f);
        if (!user.isCreative()) {
            ItemStack heldStack = user.getStackInHand(hand);
            heldStack.decrement(1);
        }
        return TypedActionResult.success(user.getStackInHand(hand));
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        if (!Screen.hasShiftDown()){
            tooltip.add(Text.translatable("tooltip.cumulonimbus.shift_down"));
        } else {
            tooltip.add(Text.translatable("tooltip.cumulonimbus.clouds_in_a_bottle"));
        }
        super.appendTooltip(stack, context, tooltip, type);
    }
}
