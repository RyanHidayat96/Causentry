package androidx.core.util;

import android.util.Size;
import android.util.SizeF;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086\n¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0086\n¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0014\u0010\u0002\u001a\u00020\u0006*\u00020\u0005H\u0086\n¢\u0006\u0004\b\u0002\u0010\u0007\u001a\u0014\u0010\u0004\u001a\u00020\u0006*\u00020\u0005H\u0086\n¢\u0006\u0004\b\u0004\u0010\u0007\u001a\u0014\u0010\u0002\u001a\u00020\u0006*\u00020\bH\u0086\n¢\u0006\u0004\b\u0002\u0010\t\u001a\u0014\u0010\u0004\u001a\u00020\u0006*\u00020\bH\u0086\n¢\u0006\u0004\b\u0004\u0010\t"}, d2 = {"Landroid/util/Size;", "", "component1", "(Landroid/util/Size;)I", "component2", "Landroid/util/SizeF;", "", "(Landroid/util/SizeF;)F", "Landroidx/core/util/SizeFCompat;", "(Landroidx/core/util/SizeFCompat;)F"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class SizeKt {
    public static final int component1(Size size) {
        return size.getWidth();
    }

    public static final int component2(Size size) {
        return size.getHeight();
    }

    public static final float component1(SizeF sizeF) {
        return sizeF.getWidth();
    }

    public static final float component2(SizeF sizeF) {
        return sizeF.getHeight();
    }

    public static final float component1(SizeFCompat sizeFCompat) {
        return sizeFCompat.getWidth();
    }

    public static final float component2(SizeFCompat sizeFCompat) {
        return sizeFCompat.getHeight();
    }
}
