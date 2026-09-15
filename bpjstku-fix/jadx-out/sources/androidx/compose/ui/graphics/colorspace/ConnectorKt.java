package androidx.compose.ui.graphics.colorspace;

import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntObjectMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a(\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b\u0005\u0010\u0006\" \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"", "p0", "p1", "Landroidx/compose/ui/graphics/colorspace/RenderIntent;", "p2", "connectorKey-YBCOT_4", "(III)I", "connectorKey", "Landroidx/collection/MutableIntObjectMap;", "Landroidx/compose/ui/graphics/colorspace/Connector;", "Connectors", "Landroidx/collection/MutableIntObjectMap;", "getConnectors", "()Landroidx/collection/MutableIntObjectMap;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ConnectorKt {
    private static final MutableIntObjectMap<Connector> Connectors;

    /* JADX INFO: renamed from: connectorKey-YBCOT_4, reason: not valid java name */
    public static final int m4664connectorKeyYBCOT_4(int i, int i2, int i3) {
        return i | (i2 << 6) | (i3 << 12);
    }

    public static final MutableIntObjectMap<Connector> getConnectors() {
        return Connectors;
    }

    static {
        int id2 = ColorSpaces.INSTANCE.getSrgb().getId();
        int id3 = ColorSpaces.INSTANCE.getSrgb().getId();
        int iM4673getPerceptualuksYyKA = RenderIntent.INSTANCE.m4673getPerceptualuksYyKA();
        Connector connectorIdentity$ui_graphics_release = Connector.INSTANCE.identity$ui_graphics_release(ColorSpaces.INSTANCE.getSrgb());
        int id4 = ColorSpaces.INSTANCE.getSrgb().getId();
        int id5 = ColorSpaces.INSTANCE.getOklab().getId();
        int iM4673getPerceptualuksYyKA2 = RenderIntent.INSTANCE.m4673getPerceptualuksYyKA();
        DefaultConstructorMarker defaultConstructorMarker = null;
        int i = id2 | (id3 << 6) | (iM4673getPerceptualuksYyKA << 12);
        int i2 = (id5 << 6) | id4 | (iM4673getPerceptualuksYyKA2 << 12);
        Connectors = IntObjectMapKt.mutableIntObjectMapOf(i, connectorIdentity$ui_graphics_release, i2, new Connector(ColorSpaces.INSTANCE.getSrgb(), ColorSpaces.INSTANCE.getOklab(), RenderIntent.INSTANCE.m4673getPerceptualuksYyKA(), defaultConstructorMarker), (ColorSpaces.INSTANCE.getSrgb().getId() << 6) | ColorSpaces.INSTANCE.getOklab().getId() | (RenderIntent.INSTANCE.m4673getPerceptualuksYyKA() << 12), new Connector(ColorSpaces.INSTANCE.getOklab(), ColorSpaces.INSTANCE.getSrgb(), RenderIntent.INSTANCE.m4673getPerceptualuksYyKA(), defaultConstructorMarker));
    }
}
