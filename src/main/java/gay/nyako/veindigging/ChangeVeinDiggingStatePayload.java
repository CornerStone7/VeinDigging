package gay.nyako.veindigging;

import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.network.codec.PacketCodecs;
import net.minecraft.network.packet.CustomPayload;

public record ChangeVeinDiggingStatePayload(boolean state) implements CustomPayload {
    public static final Id<ChangeVeinDiggingStatePayload> ID = CustomPayload.id("veindigging:change_veindigging_state");
    public static final PacketCodec<PacketByteBuf, ChangeVeinDiggingStatePayload> CODEC = PacketCodec.tuple(
            PacketCodecs.BOOL,
            ChangeVeinDiggingStatePayload::state,
            ChangeVeinDiggingStatePayload::new
    );

    @Override
    public Id<? extends CustomPayload> getId() {
        return ID;
    }
}
