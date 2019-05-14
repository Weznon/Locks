package melonslise.locks.common.item;

import com.google.common.base.Predicates;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.ArrayList;

import melonslise.locks.common.config.LocksConfiguration;
import melonslise.locks.common.container.ContainerLockPicking;
import melonslise.locks.common.network.LocksNetworks;
import melonslise.locks.common.network.client.MessageLockPicking;
import melonslise.locks.common.world.storage.Box;
import melonslise.locks.common.world.storage.Lockable;
import melonslise.locks.common.world.storage.StorageLockables;
import melonslise.locks.utility.LocksUtilities;
import melonslise.locks.utility.predicate.LocksSelectors;
import melonslise.locks.utility.predicate.PredicateIntersecting;

public class ItemLockPickStrong extends ItemLockPick {
    public ItemLockPickStrong(String name) {
        super(name);
    }

    @Override
    public float getStrength(World world) {
        return LocksConfiguration.getMain(world).lock_pick_strength;
    }

}