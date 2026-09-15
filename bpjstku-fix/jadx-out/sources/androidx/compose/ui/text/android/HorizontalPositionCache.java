package androidx.compose.ui.text.android;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\tJ/\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Landroidx/compose/ui/text/android/HorizontalPositionCache;", "", "Landroidx/compose/ui/text/android/TextLayout;", "p0", "<init>", "(Landroidx/compose/ui/text/android/TextLayout;)V", "", "", "getPrimaryDownstream", "(I)F", "getPrimaryUpstream", "getSecondaryDownstream", "getSecondaryUpstream", "", "p1", "p2", "p3", "get", "(IZZZ)F", "layout", "Landroidx/compose/ui/text/android/TextLayout;", "getLayout", "()Landroidx/compose/ui/text/android/TextLayout;", "cachedKey", "I", "cachedValue", "F"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class HorizontalPositionCache {
    private int cachedKey = -1;
    private float cachedValue;
    private final TextLayout layout;

    public HorizontalPositionCache(TextLayout textLayout) {
        this.layout = textLayout;
    }

    public final TextLayout getLayout() {
        return this.layout;
    }

    public final float getPrimaryDownstream(int p0) {
        return get(p0, false, false, true);
    }

    public final float getPrimaryUpstream(int p0) {
        return get(p0, true, true, true);
    }

    public final float getSecondaryDownstream(int p0) {
        return get(p0, false, false, false);
    }

    public final float getSecondaryUpstream(int p0) {
        return get(p0, true, true, false);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    private final float get(int p0, boolean p1, boolean p2, boolean p3) {
        boolean z;
        float secondaryHorizontal;
        int i = 0;
        if (p1) {
            int lineForOffset = LayoutCompat_androidKt.getLineForOffset(this.layout.getLayout(), p0, p1);
            int lineStart = this.layout.getLineStart(lineForOffset);
            int lineEnd = this.layout.getLineEnd(lineForOffset);
            if (p0 == lineStart || p0 == lineEnd) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (!p3) {
            i = z ? 2 : 3;
        } else if (!z) {
            i = 1;
        }
        int i2 = (p0 * 4) + i;
        if (this.cachedKey == i2) {
            return this.cachedValue;
        }
        if (p3) {
            secondaryHorizontal = this.layout.getPrimaryHorizontal(p0, p1);
        } else {
            secondaryHorizontal = this.layout.getSecondaryHorizontal(p0, p1);
        }
        if (p2) {
            this.cachedKey = i2;
            this.cachedValue = secondaryHorizontal;
        }
        return secondaryHorizontal;
    }
}
