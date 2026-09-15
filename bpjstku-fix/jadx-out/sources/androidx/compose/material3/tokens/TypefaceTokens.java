package androidx.compose.material3.tokens;

import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.GenericFontFamily;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\f\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000f"}, d2 = {"Landroidx/compose/material3/tokens/TypefaceTokens;", "", "<init>", "()V", "Landroidx/compose/ui/text/font/GenericFontFamily;", "Brand", "Landroidx/compose/ui/text/font/GenericFontFamily;", "getBrand", "()Landroidx/compose/ui/text/font/GenericFontFamily;", "Plain", "getPlain", "Landroidx/compose/ui/text/font/FontWeight;", "WeightBold", "Landroidx/compose/ui/text/font/FontWeight;", "getWeightBold", "()Landroidx/compose/ui/text/font/FontWeight;", "WeightMedium", "getWeightMedium", "WeightRegular", "getWeightRegular"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TypefaceTokens {
    public static final int $stable = 0;
    public static final TypefaceTokens INSTANCE = new TypefaceTokens();
    private static final GenericFontFamily Brand = FontFamily.INSTANCE.getSansSerif();
    private static final GenericFontFamily Plain = FontFamily.INSTANCE.getSansSerif();
    private static final FontWeight WeightBold = FontWeight.INSTANCE.getBold();
    private static final FontWeight WeightMedium = FontWeight.INSTANCE.getMedium();
    private static final FontWeight WeightRegular = FontWeight.INSTANCE.getNormal();

    private TypefaceTokens() {
    }

    public final GenericFontFamily getBrand() {
        return Brand;
    }

    public final GenericFontFamily getPlain() {
        return Plain;
    }

    public final FontWeight getWeightBold() {
        return WeightBold;
    }

    public final FontWeight getWeightMedium() {
        return WeightMedium;
    }

    public final FontWeight getWeightRegular() {
        return WeightRegular;
    }
}
