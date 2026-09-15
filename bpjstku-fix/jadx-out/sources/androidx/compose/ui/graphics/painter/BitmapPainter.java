package androidx.compose.ui.graphics.painter;

import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.FilterQuality;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0014¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0012H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0017¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u0010$R\"\u0010'\u001a\u00020&8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u001d\"\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b,\u0010$R\u0016\u0010-\u001a\u00020\u000e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u0010/\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00104\u001a\u0002018WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103"}, d2 = {"Landroidx/compose/ui/graphics/painter/BitmapPainter;", "Landroidx/compose/ui/graphics/painter/Painter;", "Landroidx/compose/ui/graphics/ImageBitmap;", "p0", "Landroidx/compose/ui/unit/IntOffset;", "p1", "Landroidx/compose/ui/unit/IntSize;", "p2", "<init>", "(Landroidx/compose/ui/graphics/ImageBitmap;JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "onDraw", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "", "", "applyAlpha", "(F)Z", "Landroidx/compose/ui/graphics/ColorFilter;", "applyColorFilter", "(Landroidx/compose/ui/graphics/ColorFilter;)Z", "validateSize-N5eqBDc", "(JJ)J", "validateSize", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "image", "Landroidx/compose/ui/graphics/ImageBitmap;", "srcOffset", "J", "srcSize", "Landroidx/compose/ui/graphics/FilterQuality;", "filterQuality", "I", "getFilterQuality-f-v9h1I$ui_graphics_release", "setFilterQuality-vDHp3xo$ui_graphics_release", "(I)V", "size", "alpha", "F", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "Landroidx/compose/ui/geometry/Size;", "getIntrinsicSize-NH-jbRc", "()J", "intrinsicSize"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BitmapPainter extends Painter {
    private float alpha;
    private ColorFilter colorFilter;
    private int filterQuality;
    private final ImageBitmap image;
    private final long size;
    private final long srcOffset;
    private final long srcSize;

    public /* synthetic */ BitmapPainter(ImageBitmap imageBitmap, long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(imageBitmap, (i & 2) != 0 ? IntOffset.INSTANCE.m7074getZeronOccac() : j, (i & 4) != 0 ? IntSize.m7101constructorimpl((((long) imageBitmap.getHeight()) & 4294967295L) | (((long) imageBitmap.getWidth()) << 32)) : j2, null);
    }

    private BitmapPainter(ImageBitmap imageBitmap, long j, long j2) {
        this.image = imageBitmap;
        this.srcOffset = j;
        this.srcSize = j2;
        this.filterQuality = FilterQuality.INSTANCE.m4320getLowfv9h1I();
        this.size = m4916validateSizeN5eqBDc(j, j2);
        this.alpha = 1.0f;
    }

    /* JADX INFO: renamed from: getFilterQuality-f-v9h1I$ui_graphics_release, reason: not valid java name and from getter */
    public final int getFilterQuality() {
        return this.filterQuality;
    }

    /* JADX INFO: renamed from: setFilterQuality-vDHp3xo$ui_graphics_release, reason: not valid java name */
    public final void m4918setFilterQualityvDHp3xo$ui_graphics_release(int i) {
        this.filterQuality = i;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected final void onDraw(DrawScope drawScope) {
        ImageBitmap imageBitmap = this.image;
        long j = this.srcOffset;
        long j2 = this.srcSize;
        int iRound = Math.round(Float.intBitsToFloat((int) (drawScope.mo4798getSizeNHjbRc() >> 32)));
        DrawScope.m4781drawImageAZ2fEMs$default(drawScope, imageBitmap, j, j2, 0L, IntSize.m7101constructorimpl((((long) Math.round(Float.intBitsToFloat((int) (drawScope.mo4798getSizeNHjbRc() & 4294967295L)))) & 4294967295L) | (((long) iRound) << 32)), this.alpha, null, this.colorFilter, 0, this.filterQuality, 328, null);
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* JADX INFO: renamed from: getIntrinsicSize-NH-jbRc */
    public final long mo0getIntrinsicSizeNHjbRc() {
        return IntSizeKt.m7118toSizeozmzZPI(this.size);
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected final boolean applyAlpha(float p0) {
        this.alpha = p0;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected final boolean applyColorFilter(ColorFilter p0) {
        this.colorFilter = p0;
        return true;
    }

    /* JADX INFO: renamed from: validateSize-N5eqBDc, reason: not valid java name */
    private final long m4916validateSizeN5eqBDc(long p0, long p1) {
        int i;
        int i2;
        if (IntOffset.m7063getXimpl(p0) < 0 || IntOffset.m7064getYimpl(p0) < 0 || (i = (int) (p1 >> 32)) < 0 || (i2 = (int) (4294967295L & p1)) < 0 || i > this.image.getWidth() || i2 > this.image.getHeight()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        return p1;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof BitmapPainter)) {
            return false;
        }
        BitmapPainter bitmapPainter = (BitmapPainter) p0;
        return Intrinsics.areEqual(this.image, bitmapPainter.image) && IntOffset.m7062equalsimpl0(this.srcOffset, bitmapPainter.srcOffset) && IntSize.m7104equalsimpl0(this.srcSize, bitmapPainter.srcSize) && FilterQuality.m4315equalsimpl0(this.filterQuality, bitmapPainter.filterQuality);
    }

    public final int hashCode() {
        int iHashCode = this.image.hashCode();
        return (((((iHashCode * 31) + IntOffset.m7065hashCodeimpl(this.srcOffset)) * 31) + IntSize.m7107hashCodeimpl(this.srcSize)) * 31) + FilterQuality.m4316hashCodeimpl(this.filterQuality);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BitmapPainter(image=");
        sb.append(this.image);
        sb.append(", srcOffset=");
        sb.append((Object) IntOffset.m7070toStringimpl(this.srcOffset));
        sb.append(", srcSize=");
        sb.append((Object) IntSize.m7109toStringimpl(this.srcSize));
        sb.append(", filterQuality=");
        sb.append((Object) FilterQuality.m4317toStringimpl(this.filterQuality));
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ BitmapPainter(ImageBitmap imageBitmap, long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(imageBitmap, j, j2);
    }
}
