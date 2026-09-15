package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0014\b'\u0018\u0000 52\u00020\u0001:\u00015B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0006H&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0006H&¢\u0006\u0004\b\u000e\u0010\rJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000fH'¢\u0006\u0004\b\u0010\u0010\u0012J'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u000bH\u0010¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u000bH\u0010¢\u0006\u0004\b\u0016\u0010\u0017J7\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0000H\u0010¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u001e\u0010\u0011J\u0017\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000fH'¢\u0006\u0004\b\u001e\u0010\u0012J\u000f\u0010\u001f\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020!2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0006H\u0016¢\u0006\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010 R\u001a\u0010)\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010-\u001a\u00020\u00068\u0001X\u0081\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u0010%R\u0011\u00101\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b0\u0010%R\u0014\u00102\u001a\u00020!8'X¦\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0014\u00104\u001a\u00020!8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00103"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "", "", "p0", "Landroidx/compose/ui/graphics/colorspace/ColorModel;", "p1", "", "p2", "<init>", "(Ljava/lang/String;JILkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Ljava/lang/String;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "getMinValue", "(I)F", "getMaxValue", "", "toXyz", "(FFF)[F", "([F)[F", "", "toXy$ui_graphics_release", "(FFF)J", "toZ$ui_graphics_release", "(FFF)F", "p3", "p4", "Landroidx/compose/ui/graphics/Color;", "xyzaToColor-JlNiLsg$ui_graphics_release", "(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "xyzaToColor", "fromXyz", "toString", "()Ljava/lang/String;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "name", "Ljava/lang/String;", "getName", "model", "J", "getModel-xdoWZVw", "()J", "id", "I", "getId$ui_graphics_release", "getComponentCount", "componentCount", "isWideGamut", "()Z", "isSrgb", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ColorSpace {
    public static final int MaxId = 63;
    public static final int MinId = -1;
    private final int id;
    private final long model;
    private final String name;

    public abstract float[] fromXyz(float[] p0);

    public abstract float getMaxValue(int p0);

    public abstract float getMinValue(int p0);

    public boolean isSrgb() {
        return false;
    }

    public abstract boolean isWideGamut();

    public abstract float[] toXyz(float[] p0);

    private ColorSpace(String str, long j, int i) {
        this.name = str;
        this.model = j;
        this.id = i;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i < -1 || i > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }

    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: getModel-xdoWZVw, reason: not valid java name and from getter */
    public final long getModel() {
        return this.model;
    }

    /* JADX INFO: renamed from: getId$ui_graphics_release, reason: from getter */
    public final int getId() {
        return this.id;
    }

    private ColorSpace(String str, long j) {
        this(str, j, -1, null);
    }

    public final int getComponentCount() {
        return ColorModel.m4645getComponentCountimpl(this.model);
    }

    public final float[] toXyz(float p0, float p1, float p2) {
        return toXyz(new float[]{p0, p1, p2});
    }

    public long toXy$ui_graphics_release(float p0, float p1, float p2) {
        float[] xyz = toXyz(p0, p1, p2);
        return (((long) Float.floatToRawIntBits(xyz[0])) << 32) | (((long) Float.floatToRawIntBits(xyz[1])) & 4294967295L);
    }

    public float toZ$ui_graphics_release(float p0, float p1, float p2) {
        return toXyz(p0, p1, p2)[2];
    }

    /* JADX INFO: renamed from: xyzaToColor-JlNiLsg$ui_graphics_release, reason: not valid java name */
    public long mo4654xyzaToColorJlNiLsg$ui_graphics_release(float p0, float p1, float p2, float p3, ColorSpace p4) {
        float[] fArrFromXyz = fromXyz(p0, p1, p2);
        return ColorKt.Color(fArrFromXyz[0], fArrFromXyz[1], fArrFromXyz[2], p3, p4);
    }

    public final float[] fromXyz(float p0, float p1, float p2) {
        float[] fArr = new float[ColorModel.m4645getComponentCountimpl(this.model)];
        fArr[0] = p0;
        fArr[1] = p1;
        fArr[2] = p2;
        return fromXyz(fArr);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name);
        sb.append(" (id=");
        sb.append(this.id);
        sb.append(", model=");
        sb.append((Object) ColorModel.m4647toStringimpl(this.model));
        sb.append(')');
        return sb.toString();
    }

    public boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (p0 == null || getClass() != p0.getClass()) {
            return false;
        }
        ColorSpace colorSpace = (ColorSpace) p0;
        if (this.id == colorSpace.id && Intrinsics.areEqual(this.name, colorSpace.name)) {
            return ColorModel.m4644equalsimpl0(this.model, colorSpace.model);
        }
        return false;
    }

    public int hashCode() {
        return (((this.name.hashCode() * 31) + ColorModel.m4646hashCodeimpl(this.model)) * 31) + this.id;
    }

    public /* synthetic */ ColorSpace(String str, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, i);
    }

    public /* synthetic */ ColorSpace(String str, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j);
    }
}
