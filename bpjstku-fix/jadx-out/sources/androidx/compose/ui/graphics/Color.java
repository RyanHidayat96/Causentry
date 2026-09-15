package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaceKt;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.Rgb;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.UnsignedKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0017\b\u0087@\u0018\u0000 ;2\u00020\u0001:\u0001;B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\r\u001a\u00020\nH\u0087\n¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000f\u001a\u00020\nH\u0087\n¢\u0006\u0004\b\u000e\u0010\fJ\u0010\u0010\u0011\u001a\u00020\nH\u0087\n¢\u0006\u0004\b\u0010\u0010\fJ\u0010\u0010\u0013\u001a\u00020\nH\u0087\n¢\u0006\u0004\b\u0012\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u0006H\u0087\n¢\u0006\u0004\b\u0014\u0010\u0015J7\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\n2\b\b\u0002\u0010\u0017\u001a\u00020\n2\b\b\u0002\u0010\u0018\u001a\u00020\n2\b\b\u0002\u0010\u0019\u001a\u00020\nH\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010 \u001a\u00020\u001dH\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&R\u0017\u0010'\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010.\u001a\u00020\u00068GX\u0087\u0004¢\u0006\f\u0012\u0004\b,\u0010-\u001a\u0004\b+\u0010\u0015R\u001a\u00101\u001a\u00020\n8GX\u0087\u0004¢\u0006\f\u0012\u0004\b0\u0010-\u001a\u0004\b/\u0010\fR\u001a\u00104\u001a\u00020\n8GX\u0087\u0004¢\u0006\f\u0012\u0004\b3\u0010-\u001a\u0004\b2\u0010\fR\u001a\u00107\u001a\u00020\n8GX\u0087\u0004¢\u0006\f\u0012\u0004\b6\u0010-\u001a\u0004\b5\u0010\fR\u001a\u0010:\u001a\u00020\n8GX\u0087\u0004¢\u0006\f\u0012\u0004\b9\u0010-\u001a\u0004\b8\u0010\f\u0088\u0001'\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/ui/graphics/Color;", "", "Lkotlin/ULong;", "p0", "constructor-impl", "(J)J", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "convert-vNxB06k", "(JLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "convert", "", "component1-impl", "(J)F", "component1", "component2-impl", "component2", "component3-impl", "component3", "component4-impl", "component4", "component5-impl", "(J)Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "component5", "p1", "p2", "p3", "copy-wmQWz5c", "(JFFFF)J", "copy", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "value", "J", "getValue-s-VKNKU", "()J", "getColorSpace-impl", "getColorSpace$annotations", "()V", "colorSpace", "getRed-impl", "getRed$annotations", "red", "getGreen-impl", "getGreen$annotations", "green", "getBlue-impl", "getBlue$annotations", "blue", "getAlpha-impl", "getAlpha$annotations", "alpha", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
@JvmInline
public final class Color {
    private final long value;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long Black = ColorKt.Color(4278190080L);
    private static final long DarkGray = ColorKt.Color(4282664004L);
    private static final long Gray = ColorKt.Color(4287137928L);
    private static final long LightGray = ColorKt.Color(4291611852L);
    private static final long White = ColorKt.Color(4294967295L);
    private static final long Red = ColorKt.Color(4294901760L);
    private static final long Green = ColorKt.Color(4278255360L);
    private static final long Blue = ColorKt.Color(4278190335L);
    private static final long Yellow = ColorKt.Color(4294967040L);
    private static final long Cyan = ColorKt.Color(4278255615L);
    private static final long Magenta = ColorKt.Color(4294902015L);
    private static final long Transparent = ColorKt.Color(0);
    private static final long Unspecified = ColorKt.Color(0.0f, 0.0f, 0.0f, 0.0f, ColorSpaces.INSTANCE.getUnspecified$ui_graphics_release());

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m4214constructorimpl(long j) {
        return j;
    }

    public static /* synthetic */ void getAlpha$annotations() {
    }

    public static /* synthetic */ void getBlue$annotations() {
    }

    public static /* synthetic */ void getColorSpace$annotations() {
    }

    public static /* synthetic */ void getGreen$annotations() {
    }

    public static /* synthetic */ void getRed$annotations() {
    }

    private /* synthetic */ Color(long j) {
        this.value = j;
    }

    /* JADX INFO: renamed from: getValue-s-VKNKU, reason: not valid java name and from getter */
    public final long getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: getColorSpace-impl, reason: not valid java name */
    public static final ColorSpace m4222getColorSpaceimpl(long j) {
        ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
        return colorSpaces.getColorSpacesArray$ui_graphics_release()[(int) ULong.m8203constructorimpl(j & 63)];
    }

    /* JADX INFO: renamed from: convert-vNxB06k, reason: not valid java name */
    public static final long m4215convertvNxB06k(long j, ColorSpace colorSpace) {
        return ColorSpaceKt.m4656connectYBCOT_4$default(m4222getColorSpaceimpl(j), colorSpace, 0, 2, null).mo4660transformToColorl2rxGTc$ui_graphics_release(j);
    }

    /* JADX INFO: renamed from: getRed-impl, reason: not valid java name */
    public static final float m4224getRedimpl(long j) {
        int i;
        int i2;
        int i3;
        if (ULong.m8203constructorimpl(63 & j) == 0) {
            return ((float) UnsignedKt.ulongToDouble(ULong.m8203constructorimpl(ULong.m8203constructorimpl(j >>> 48) & 255))) / 255.0f;
        }
        short sM8203constructorimpl = (short) ULong.m8203constructorimpl(ULong.m8203constructorimpl(j >>> 48) & WebSocketProtocol.PAYLOAD_SHORT_MAX);
        int i4 = Short.MIN_VALUE & sM8203constructorimpl;
        int i5 = ((65535 & sM8203constructorimpl) >>> 10) & 31;
        int i6 = sM8203constructorimpl & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - Float16Kt.Fp32DenormalFloat;
                return i4 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    /* JADX INFO: renamed from: getGreen-impl, reason: not valid java name */
    public static final float m4223getGreenimpl(long j) {
        int i;
        int i2;
        int i3;
        if (ULong.m8203constructorimpl(63 & j) == 0) {
            return ((float) UnsignedKt.ulongToDouble(ULong.m8203constructorimpl(ULong.m8203constructorimpl(j >>> 40) & 255))) / 255.0f;
        }
        short sM8203constructorimpl = (short) ULong.m8203constructorimpl(ULong.m8203constructorimpl(j >>> 32) & WebSocketProtocol.PAYLOAD_SHORT_MAX);
        int i4 = Short.MIN_VALUE & sM8203constructorimpl;
        int i5 = ((65535 & sM8203constructorimpl) >>> 10) & 31;
        int i6 = sM8203constructorimpl & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - Float16Kt.Fp32DenormalFloat;
                return i4 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    /* JADX INFO: renamed from: getBlue-impl, reason: not valid java name */
    public static final float m4221getBlueimpl(long j) {
        int i;
        int i2;
        int i3;
        if (ULong.m8203constructorimpl(63 & j) == 0) {
            return ((float) UnsignedKt.ulongToDouble(ULong.m8203constructorimpl(ULong.m8203constructorimpl(j >>> 32) & 255))) / 255.0f;
        }
        short sM8203constructorimpl = (short) ULong.m8203constructorimpl(ULong.m8203constructorimpl(j >>> 16) & WebSocketProtocol.PAYLOAD_SHORT_MAX);
        int i4 = Short.MIN_VALUE & sM8203constructorimpl;
        int i5 = ((65535 & sM8203constructorimpl) >>> 10) & 31;
        int i6 = sM8203constructorimpl & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - Float16Kt.Fp32DenormalFloat;
                return i4 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    /* JADX INFO: renamed from: getAlpha-impl, reason: not valid java name */
    public static final float m4220getAlphaimpl(long j) {
        float fUlongToDouble;
        float f;
        if (ULong.m8203constructorimpl(63 & j) == 0) {
            fUlongToDouble = (float) UnsignedKt.ulongToDouble(ULong.m8203constructorimpl(ULong.m8203constructorimpl(j >>> 56) & 255));
            f = 255.0f;
        } else {
            fUlongToDouble = (float) UnsignedKt.ulongToDouble(ULong.m8203constructorimpl(ULong.m8203constructorimpl(j >>> 6) & 1023));
            f = 1023.0f;
        }
        return fUlongToDouble / f;
    }

    /* JADX INFO: renamed from: component1-impl, reason: not valid java name */
    public static final float m4209component1impl(long j) {
        return m4224getRedimpl(j);
    }

    /* JADX INFO: renamed from: component2-impl, reason: not valid java name */
    public static final float m4210component2impl(long j) {
        return m4223getGreenimpl(j);
    }

    /* JADX INFO: renamed from: component3-impl, reason: not valid java name */
    public static final float m4211component3impl(long j) {
        return m4221getBlueimpl(j);
    }

    /* JADX INFO: renamed from: component4-impl, reason: not valid java name */
    public static final float m4212component4impl(long j) {
        return m4220getAlphaimpl(j);
    }

    /* JADX INFO: renamed from: component5-impl, reason: not valid java name */
    public static final ColorSpace m4213component5impl(long j) {
        return m4222getColorSpaceimpl(j);
    }

    /* JADX INFO: renamed from: copy-wmQWz5c$default, reason: not valid java name */
    public static /* synthetic */ long m4217copywmQWz5c$default(long j, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = m4220getAlphaimpl(j);
        }
        float f5 = f;
        if ((i & 2) != 0) {
            f2 = m4224getRedimpl(j);
        }
        float f6 = f2;
        if ((i & 4) != 0) {
            f3 = m4223getGreenimpl(j);
        }
        float f7 = f3;
        if ((i & 8) != 0) {
            f4 = m4221getBlueimpl(j);
        }
        return m4216copywmQWz5c(j, f5, f6, f7, f4);
    }

    /* JADX INFO: renamed from: copy-wmQWz5c, reason: not valid java name */
    public static final long m4216copywmQWz5c(long j, float f, float f2, float f3, float f4) {
        return ColorKt.Color(f2, f3, f4, f, m4222getColorSpaceimpl(j));
    }

    public final String toString() {
        return m4226toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m4226toStringimpl(long j) {
        StringBuilder sb = new StringBuilder("Color(");
        sb.append(m4224getRedimpl(j));
        sb.append(", ");
        sb.append(m4223getGreenimpl(j));
        sb.append(", ");
        sb.append(m4221getBlueimpl(j));
        sb.append(", ");
        sb.append(m4220getAlphaimpl(j));
        sb.append(", ");
        sb.append(m4222getColorSpaceimpl(j).getName());
        sb.append(')');
        return sb.toString();
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b.\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J9\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\rJ/\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0011R \u0010\u0015\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u0019\u0010\u0003\u001a\u0004\b\u0017\u0010\u0018R \u0010\u001a\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u0016\u0012\u0004\b\u001c\u0010\u0003\u001a\u0004\b\u001b\u0010\u0018R \u0010\u001d\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u0016\u0012\u0004\b\u001f\u0010\u0003\u001a\u0004\b\u001e\u0010\u0018R \u0010 \u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010\u0016\u0012\u0004\b\"\u0010\u0003\u001a\u0004\b!\u0010\u0018R \u0010#\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b#\u0010\u0016\u0012\u0004\b%\u0010\u0003\u001a\u0004\b$\u0010\u0018R \u0010&\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b&\u0010\u0016\u0012\u0004\b(\u0010\u0003\u001a\u0004\b'\u0010\u0018R \u0010)\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b)\u0010\u0016\u0012\u0004\b+\u0010\u0003\u001a\u0004\b*\u0010\u0018R \u0010,\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b,\u0010\u0016\u0012\u0004\b.\u0010\u0003\u001a\u0004\b-\u0010\u0018R \u0010/\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b/\u0010\u0016\u0012\u0004\b1\u0010\u0003\u001a\u0004\b0\u0010\u0018R \u00102\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b2\u0010\u0016\u0012\u0004\b4\u0010\u0003\u001a\u0004\b3\u0010\u0018R \u00105\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b5\u0010\u0016\u0012\u0004\b7\u0010\u0003\u001a\u0004\b6\u0010\u0018R \u00108\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b8\u0010\u0016\u0012\u0004\b:\u0010\u0003\u001a\u0004\b9\u0010\u0018R \u0010;\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b;\u0010\u0016\u0012\u0004\b=\u0010\u0003\u001a\u0004\b<\u0010\u0018"}, d2 = {"Landroidx/compose/ui/graphics/Color$Companion;", "", "<init>", "()V", "", "p0", "p1", "p2", "p3", "Landroidx/compose/ui/graphics/colorspace/Rgb;", "p4", "Landroidx/compose/ui/graphics/Color;", "hsv-JlNiLsg", "(FFFFLandroidx/compose/ui/graphics/colorspace/Rgb;)J", "hsv", "", "hsvToRgbComponent", "(IFFF)F", "hsl-JlNiLsg", "hsl", "hslToRgbComponent", "Black", "J", "getBlack-0d7_KjU", "()J", "getBlack-0d7_KjU$annotations", "DarkGray", "getDarkGray-0d7_KjU", "getDarkGray-0d7_KjU$annotations", "Gray", "getGray-0d7_KjU", "getGray-0d7_KjU$annotations", "LightGray", "getLightGray-0d7_KjU", "getLightGray-0d7_KjU$annotations", "White", "getWhite-0d7_KjU", "getWhite-0d7_KjU$annotations", "Red", "getRed-0d7_KjU", "getRed-0d7_KjU$annotations", "Green", "getGreen-0d7_KjU", "getGreen-0d7_KjU$annotations", "Blue", "getBlue-0d7_KjU", "getBlue-0d7_KjU$annotations", "Yellow", "getYellow-0d7_KjU", "getYellow-0d7_KjU$annotations", "Cyan", "getCyan-0d7_KjU", "getCyan-0d7_KjU$annotations", "Magenta", "getMagenta-0d7_KjU", "getMagenta-0d7_KjU$annotations", "Transparent", "getTransparent-0d7_KjU", "getTransparent-0d7_KjU$annotations", "Unspecified", "getUnspecified-0d7_KjU", "getUnspecified-0d7_KjU$annotations"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        /* JADX INFO: renamed from: getBlack-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m4229getBlack0d7_KjU$annotations() {
        }

        /* JADX INFO: renamed from: getBlue-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m4230getBlue0d7_KjU$annotations() {
        }

        /* JADX INFO: renamed from: getCyan-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m4231getCyan0d7_KjU$annotations() {
        }

        /* JADX INFO: renamed from: getDarkGray-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m4232getDarkGray0d7_KjU$annotations() {
        }

        /* JADX INFO: renamed from: getGray-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m4233getGray0d7_KjU$annotations() {
        }

        /* JADX INFO: renamed from: getGreen-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m4234getGreen0d7_KjU$annotations() {
        }

        /* JADX INFO: renamed from: getLightGray-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m4235getLightGray0d7_KjU$annotations() {
        }

        /* JADX INFO: renamed from: getMagenta-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m4236getMagenta0d7_KjU$annotations() {
        }

        /* JADX INFO: renamed from: getRed-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m4237getRed0d7_KjU$annotations() {
        }

        /* JADX INFO: renamed from: getTransparent-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m4238getTransparent0d7_KjU$annotations() {
        }

        /* JADX INFO: renamed from: getUnspecified-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m4239getUnspecified0d7_KjU$annotations() {
        }

        /* JADX INFO: renamed from: getWhite-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m4240getWhite0d7_KjU$annotations() {
        }

        /* JADX INFO: renamed from: getYellow-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m4241getYellow0d7_KjU$annotations() {
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: getBlack-0d7_KjU, reason: not valid java name */
        public final long m4244getBlack0d7_KjU() {
            return Color.Black;
        }

        /* JADX INFO: renamed from: getDarkGray-0d7_KjU, reason: not valid java name */
        public final long m4247getDarkGray0d7_KjU() {
            return Color.DarkGray;
        }

        /* JADX INFO: renamed from: getGray-0d7_KjU, reason: not valid java name */
        public final long m4248getGray0d7_KjU() {
            return Color.Gray;
        }

        /* JADX INFO: renamed from: getLightGray-0d7_KjU, reason: not valid java name */
        public final long m4250getLightGray0d7_KjU() {
            return Color.LightGray;
        }

        /* JADX INFO: renamed from: getWhite-0d7_KjU, reason: not valid java name */
        public final long m4255getWhite0d7_KjU() {
            return Color.White;
        }

        /* JADX INFO: renamed from: getRed-0d7_KjU, reason: not valid java name */
        public final long m4252getRed0d7_KjU() {
            return Color.Red;
        }

        /* JADX INFO: renamed from: getGreen-0d7_KjU, reason: not valid java name */
        public final long m4249getGreen0d7_KjU() {
            return Color.Green;
        }

        /* JADX INFO: renamed from: getBlue-0d7_KjU, reason: not valid java name */
        public final long m4245getBlue0d7_KjU() {
            return Color.Blue;
        }

        /* JADX INFO: renamed from: getYellow-0d7_KjU, reason: not valid java name */
        public final long m4256getYellow0d7_KjU() {
            return Color.Yellow;
        }

        /* JADX INFO: renamed from: getCyan-0d7_KjU, reason: not valid java name */
        public final long m4246getCyan0d7_KjU() {
            return Color.Cyan;
        }

        /* JADX INFO: renamed from: getMagenta-0d7_KjU, reason: not valid java name */
        public final long m4251getMagenta0d7_KjU() {
            return Color.Magenta;
        }

        /* JADX INFO: renamed from: getTransparent-0d7_KjU, reason: not valid java name */
        public final long m4253getTransparent0d7_KjU() {
            return Color.Transparent;
        }

        /* JADX INFO: renamed from: getUnspecified-0d7_KjU, reason: not valid java name */
        public final long m4254getUnspecified0d7_KjU() {
            return Color.Unspecified;
        }

        /* JADX INFO: renamed from: hsv-JlNiLsg$default, reason: not valid java name */
        public static /* synthetic */ long m4243hsvJlNiLsg$default(Companion companion, float f, float f2, float f3, float f4, Rgb rgb, int i, Object obj) {
            if ((i & 8) != 0) {
                f4 = 1.0f;
            }
            float f5 = f4;
            if ((i & 16) != 0) {
                rgb = ColorSpaces.INSTANCE.getSrgb();
            }
            return companion.m4258hsvJlNiLsg(f, f2, f3, f5, rgb);
        }

        /* JADX INFO: renamed from: hsv-JlNiLsg, reason: not valid java name */
        public final long m4258hsvJlNiLsg(float p0, float p1, float p2, float p3, Rgb p4) {
            if (0.0f > p0 || p0 > 360.0f || 0.0f > p1 || p1 > 1.0f || 0.0f > p2 || p2 > 1.0f) {
                StringBuilder sb = new StringBuilder("HSV (");
                sb.append(p0);
                sb.append(", ");
                sb.append(p1);
                sb.append(", ");
                sb.append(p2);
                sb.append(") must be in range (0..360, 0..1, 0..1)");
                InlineClassHelperKt.throwIllegalArgumentException(sb.toString());
            }
            return ColorKt.Color(hsvToRgbComponent(5, p0, p1, p2), hsvToRgbComponent(3, p0, p1, p2), hsvToRgbComponent(1, p0, p1, p2), p3, p4);
        }

        private final float hsvToRgbComponent(int p0, float p1, float p2, float p3) {
            float f = (p0 + (p1 / 60.0f)) % 6.0f;
            return p3 - ((p2 * p3) * Math.max(0.0f, Math.min(f, Math.min(4.0f - f, 1.0f))));
        }

        /* JADX INFO: renamed from: hsl-JlNiLsg$default, reason: not valid java name */
        public static /* synthetic */ long m4242hslJlNiLsg$default(Companion companion, float f, float f2, float f3, float f4, Rgb rgb, int i, Object obj) {
            if ((i & 8) != 0) {
                f4 = 1.0f;
            }
            float f5 = f4;
            if ((i & 16) != 0) {
                rgb = ColorSpaces.INSTANCE.getSrgb();
            }
            return companion.m4257hslJlNiLsg(f, f2, f3, f5, rgb);
        }

        /* JADX INFO: renamed from: hsl-JlNiLsg, reason: not valid java name */
        public final long m4257hslJlNiLsg(float p0, float p1, float p2, float p3, Rgb p4) {
            if (0.0f > p0 || p0 > 360.0f || 0.0f > p1 || p1 > 1.0f || 0.0f > p2 || p2 > 1.0f) {
                StringBuilder sb = new StringBuilder("HSL (");
                sb.append(p0);
                sb.append(", ");
                sb.append(p1);
                sb.append(", ");
                sb.append(p2);
                sb.append(") must be in range (0..360, 0..1, 0..1)");
                InlineClassHelperKt.throwIllegalArgumentException(sb.toString());
            }
            return ColorKt.Color(hslToRgbComponent(0, p0, p1, p2), hslToRgbComponent(8, p0, p1, p2), hslToRgbComponent(4, p0, p1, p2), p3, p4);
        }

        private final float hslToRgbComponent(int p0, float p1, float p2, float p3) {
            float f = (p0 + (p1 / 30.0f)) % 12.0f;
            return p3 - ((p2 * Math.min(p3, 1.0f - p3)) * Math.max(-1.0f, Math.min(f - 3.0f, Math.min(9.0f - f, 1.0f))));
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Color m4208boximpl(long j) {
        return new Color(j);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m4218equalsimpl(long j, Object obj) {
        return (obj instanceof Color) && j == ((Color) obj).m4228unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4219equalsimpl0(long j, long j2) {
        return ULong.m8210equalsimpl0(j, j2);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m4225hashCodeimpl(long j) {
        return ULong.m8215hashCodeimpl(j);
    }

    public final boolean equals(Object p0) {
        return m4218equalsimpl(this.value, p0);
    }

    public final int hashCode() {
        return m4225hashCodeimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m4228unboximpl() {
        return this.value;
    }
}
