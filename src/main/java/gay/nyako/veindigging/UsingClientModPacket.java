package gay.nyako.veindigging;

import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.network.packet.CustomPayload;

public record UsingClientModPacket() implements CustomPayload {
    public static final UsingClientModPacket INSTANCE = new UsingClientModPacket();
    public static final Id<UsingClientModPacket> ID = CustomPayload.id("veindigging:using_client_mod");
    public static final PacketCodec<PacketByteBuf, UsingClientModPacket> CODEC = PacketCodec.unit(UsingClientModPacket.INSTANCE);

    @Override
    public Id<? extends CustomPayload> getId() {
        return ID;
    }
}
