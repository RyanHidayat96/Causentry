package androidx.compose.material3;

import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.material3.tokens.ShapeTokens;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\b"}, d2 = {"Landroidx/compose/material3/ShapeDefaults;", "", "<init>", "()V", "Landroidx/compose/foundation/shape/CornerBasedShape;", "ExtraLarge", "Landroidx/compose/foundation/shape/CornerBasedShape;", "getExtraLarge", "()Landroidx/compose/foundation/shape/CornerBasedShape;", "ExtraSmall", "getExtraSmall", "Large", "getLarge", "Medium", "getMedium", "Small", "getSmall"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ShapeDefaults {
    public static final int $stable = 0;
    public static final ShapeDefaults INSTANCE = new ShapeDefaults();
    private static final CornerBasedShape ExtraSmall = ShapeTokens.INSTANCE.getCornerExtraSmall();
    private static final CornerBasedShape Small = ShapeTokens.INSTANCE.getCornerSmall();
    private static final CornerBasedShape Medium = ShapeTokens.INSTANCE.getCornerMedium();
    private static final CornerBasedShape Large = ShapeTokens.INSTANCE.getCornerLarge();
    private static final CornerBasedShape ExtraLarge = ShapeTokens.INSTANCE.getCornerExtraLarge();

    private ShapeDefaults() {
    }

    public final CornerBasedShape getExtraSmall() {
        return ExtraSmall;
    }

    public final CornerBasedShape getSmall() {
        return Small;
    }

    public final CornerBasedShape getMedium() {
        return Medium;
    }

    public final CornerBasedShape getLarge() {
        return Large;
    }

    public final CornerBasedShape getExtraLarge() {
        return ExtraLarge;
    }
}
