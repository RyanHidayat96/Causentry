package androidx.compose.ui.text.font;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.fonts.FontVariationAxis;
import android.os.ParcelFileDescriptor;
import androidx.compose.ui.unit.AndroidDensity_androidKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import java.io.File;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0010\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u000f2\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0013\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u00122\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015*\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\bH\u0003¢\u0006\u0004\b\u0017\u0010\u0018"}, d2 = {"Landroidx/compose/ui/text/font/TypefaceBuilderCompat;", "", "<init>", "()V", "Landroid/content/res/AssetManager;", "p0", "", "p1", "Landroid/content/Context;", "p2", "Landroidx/compose/ui/text/font/FontVariation$Settings;", "p3", "Landroid/graphics/Typeface;", "createFromAssets", "(Landroid/content/res/AssetManager;Ljava/lang/String;Landroid/content/Context;Landroidx/compose/ui/text/font/FontVariation$Settings;)Landroid/graphics/Typeface;", "Ljava/io/File;", "createFromFile", "(Ljava/io/File;Landroid/content/Context;Landroidx/compose/ui/text/font/FontVariation$Settings;)Landroid/graphics/Typeface;", "Landroid/os/ParcelFileDescriptor;", "createFromFileDescriptor", "(Landroid/os/ParcelFileDescriptor;Landroid/content/Context;Landroidx/compose/ui/text/font/FontVariation$Settings;)Landroid/graphics/Typeface;", "", "Landroid/graphics/fonts/FontVariationAxis;", "toVariationSettings", "(Landroidx/compose/ui/text/font/FontVariation$Settings;Landroid/content/Context;)[Landroid/graphics/fonts/FontVariationAxis;"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class TypefaceBuilderCompat {
    public static final TypefaceBuilderCompat INSTANCE = new TypefaceBuilderCompat();

    private TypefaceBuilderCompat() {
    }

    public final android.graphics.Typeface createFromAssets(AssetManager p0, String p1, Context p2, FontVariation.Settings p3) {
        if (p2 == null) {
            return null;
        }
        return new android.graphics.Typeface.Builder(p0, p1).setFontVariationSettings(toVariationSettings(p3, p2)).build();
    }

    public final android.graphics.Typeface createFromFile(File p0, Context p1, FontVariation.Settings p2) {
        if (p1 == null) {
            return null;
        }
        return new android.graphics.Typeface.Builder(p0).setFontVariationSettings(toVariationSettings(p2, p1)).build();
    }

    public final android.graphics.Typeface createFromFileDescriptor(ParcelFileDescriptor p0, Context p1, FontVariation.Settings p2) {
        if (p1 == null) {
            return null;
        }
        return new android.graphics.Typeface.Builder(p0.getFileDescriptor()).setFontVariationSettings(toVariationSettings(p2, p1)).build();
    }

    private final FontVariationAxis[] toVariationSettings(FontVariation.Settings settings, Context context) {
        Density Density;
        if (context != null) {
            Density = AndroidDensity_androidKt.Density(context);
        } else if (!settings.getNeedsDensity()) {
            Density = DensityKt.Density(1.0f, 1.0f);
        } else {
            throw new IllegalStateException("Required density, but not provided");
        }
        return PlatformFontVariationSettings_androidKt.toAndroidArray(settings, Density, PlatformFontVariationSettings_androidKt.getFontWeightAdjustment(context));
    }
}
