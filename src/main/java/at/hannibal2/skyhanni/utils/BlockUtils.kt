package at.hannibal2.skyhanni.utils

import net.minecraft.block.Block
import net.minecraft.block.state.IBlockState
import net.minecraft.client.Minecraft
import net.minecraft.tileentity.TileEntitySkull
import net.minecraft.util.BlockPos
import net.minecraftforge.common.util.Constants

object BlockUtils {

    fun LorenzVec.getBlockAt(): Block =
        getBlockStateAt().block

    fun LorenzVec.getBlockStateAt(): IBlockState =
        Minecraft.getMinecraft().theWorld.getBlockState(toBlocPos())

    fun LorenzVec.isInLoadedChunk(): Boolean =
        Minecraft.getMinecraft().theWorld.chunkProvider.provideChunk(toBlocPos()).isLoaded

    fun getTextureFromSkull(position: BlockPos?): String? {
        val entity = Minecraft.getMinecraft().theWorld.getTileEntity(position) as TileEntitySkull
        val serializeNBT = entity.serializeNBT()
        return serializeNBT.getCompoundTag("Owner").getCompoundTag("Properties")
            .getTagList("textures", Constants.NBT.TAG_COMPOUND).getCompoundTagAt(0).getString("Value")
    }
}