package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.colorspace.ColorModel;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.DoubleFunction;
import androidx.compose.ui.graphics.colorspace.Rgb;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u0014\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\u001a;\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t\u001a;\u0010\n\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\n\u0010\t\u001a\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\b\u0010\f\u001a\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\rH\u0007¢\u0006\u0004\b\b\u0010\u000e\u001a1\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b2\b\b\u0002\u0010\u0004\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\b\u0010\u000f\u001a'\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001b\u0010\u0015\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a8\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0082\b¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0013\u0010\u001b\u001a\u00020\u0018*\u00020\u0007H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0013\u0010\u001e\u001a\u00020\u0000*\u00020\u0007H\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0013\u0010!\u001a\u00020\u000b*\u00020\u0007H\u0007¢\u0006\u0004\b\u001f\u0010 \u001a\"\u0010%\u001a\u00020\u0007*\u00020\u00072\f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070\"H\u0086\b¢\u0006\u0004\b#\u0010$\"\u001a\u0010'\u001a\u00020&8\u0000X\u0081T¢\u0006\f\n\u0004\b'\u0010(\u0012\u0004\b)\u0010*\"\u001f\u00100\u001a\u00020+*\u00020\u00078Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b.\u0010/\u001a\u0004\b,\u0010-\"\u001f\u00103\u001a\u00020+*\u00020\u00078Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b2\u0010/\u001a\u0004\b1\u0010-"}, d2 = {"", "p0", "p1", "p2", "p3", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "p4", "Landroidx/compose/ui/graphics/Color;", "Color", "(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "UncheckedColor", "", "(I)J", "", "(J)J", "(IIII)J", "lerp-jxsXWHM", "(JJF)J", "lerp", "compositeOver--OWjLjI", "(JJ)J", "compositeOver", "compositeComponent", "(FFFFF)F", "", "getComponents-8_81llA", "(J)[F", "getComponents", "luminance-8_81llA", "(J)F", "luminance", "toArgb-8_81llA", "(J)I", "toArgb", "Lkotlin/Function0;", "takeOrElse-DxMtmZc", "(JLkotlin/jvm/functions/Function0;)J", "takeOrElse", "Lkotlin/ULong;", "UnspecifiedColor", "J", "getUnspecifiedColor$annotations", "()V", "", "isSpecified-8_81llA", "(J)Z", "isSpecified-8_81llA$annotations", "(J)V", "isSpecified", "isUnspecified-8_81llA", "isUnspecified-8_81llA$annotations", "isUnspecified"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ColorKt {
    public static final long UnspecifiedColor = 16;

    private static final float compositeComponent(float f, float f2, float f3, float f4, float f5) {
        if (f5 == 0.0f) {
            return 0.0f;
        }
        return ((f * f3) + ((f2 * f4) * (1.0f - f3))) / f5;
    }

    public static /* synthetic */ void getUnspecifiedColor$annotations() {
    }

    /* JADX INFO: renamed from: isSpecified-8_81llA, reason: not valid java name */
    public static final boolean m4265isSpecified8_81llA(long j) {
        return j != 16;
    }

    /* JADX INFO: renamed from: isSpecified-8_81llA$annotations, reason: not valid java name */
    public static /* synthetic */ void m4266isSpecified8_81llA$annotations(long j) {
    }

    /* JADX INFO: renamed from: isUnspecified-8_81llA, reason: not valid java name */
    public static final boolean m4267isUnspecified8_81llA(long j) {
        return j == 16;
    }

    /* JADX INFO: renamed from: isUnspecified-8_81llA$annotations, reason: not valid java name */
    public static /* synthetic */ void m4268isUnspecified8_81llA$annotations(long j) {
    }

    public static /* synthetic */ long Color$default(float f, float f2, float f3, float f4, ColorSpace colorSpace, int i, Object obj) {
        if ((i & 8) != 0) {
            f4 = 1.0f;
        }
        if ((i & 16) != 0) {
            colorSpace = ColorSpaces.INSTANCE.getSrgb();
        }
        return Color(f, f2, f3, f4, colorSpace);
    }

    /* JADX WARN: Code duplicated, block: B:103:0x015a  */
    /* JADX WARN: Code duplicated, block: B:107:0x0161  */
    /* JADX WARN: Code duplicated, block: B:110:0x016e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:111:0x0170  */
    /* JADX WARN: Code duplicated, block: B:112:0x0173  */
    /* JADX WARN: Code duplicated, block: B:114:0x0177  */
    /* JADX WARN: Code duplicated, block: B:116:0x017b  */
    /* JADX WARN: Code duplicated, block: B:117:0x017f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:118:0x0181 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:119:0x0183  */
    /* JADX WARN: Code duplicated, block: B:121:0x018c  */
    /* JADX WARN: Code duplicated, block: B:123:0x0192  */
    /* JADX WARN: Code duplicated, block: B:125:0x0196  */
    /* JADX WARN: Code duplicated, block: B:127:0x019c  */
    /* JADX WARN: Code duplicated, block: B:128:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:133:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:136:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:74:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:78:0x0102  */
    /* JADX WARN: Code duplicated, block: B:81:0x0110 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x0112  */
    /* JADX WARN: Code duplicated, block: B:83:0x0115  */
    /* JADX WARN: Code duplicated, block: B:85:0x0118  */
    /* JADX WARN: Code duplicated, block: B:87:0x011c  */
    /* JADX WARN: Code duplicated, block: B:88:0x0120 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x0122 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:90:0x0124  */
    /* JADX WARN: Code duplicated, block: B:92:0x012d  */
    /* JADX WARN: Code duplicated, block: B:94:0x0132  */
    /* JADX WARN: Code duplicated, block: B:96:0x0135  */
    /* JADX WARN: Code duplicated, block: B:98:0x013b  */
    /* JADX WARN: Code duplicated, block: B:99:0x0143  */
    public static final long Color(float f, float f2, float f3, float f4, ColorSpace colorSpace) {
        int i;
        int i2;
        int i3;
        float minValue;
        float maxValue;
        int iFloatToRawIntBits;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        float minValue2;
        float maxValue2;
        int iFloatToRawIntBits2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        float f5;
        if (colorSpace.getIsSrgb()) {
            float f6 = f4 < 0.0f ? 0.0f : f4;
            if (f6 > 1.0f) {
                f6 = 1.0f;
            }
            int i21 = (int) ((f6 * 255.0f) + 0.5f);
            float f7 = f < 0.0f ? 0.0f : f;
            if (f7 > 1.0f) {
                f7 = 1.0f;
            }
            int i22 = (int) ((f7 * 255.0f) + 0.5f);
            float f8 = f2 < 0.0f ? 0.0f : f2;
            if (f8 > 1.0f) {
                f8 = 1.0f;
            }
            int i23 = (int) ((f8 * 255.0f) + 0.5f);
            f5 = f3 >= 0.0f ? f3 : 0.0f;
            return Color.m4214constructorimpl(ULong.m8203constructorimpl(ULong.m8203constructorimpl((((i21 << 24) | (i22 << 16)) | (i23 << 8)) | ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 255.0f) + 0.5f))) << 32));
        }
        if (colorSpace.getComponentCount() != 3) {
            InlineClassHelperKt.throwIllegalArgumentException("Color only works with ColorSpaces with 3 components");
        }
        int id$ui_graphics_release = colorSpace.getId();
        if (id$ui_graphics_release == -1) {
            InlineClassHelperKt.throwIllegalArgumentException("Unknown color space, please use a color space in ColorSpaces");
        }
        float minValue3 = colorSpace.getMinValue(0);
        float maxValue3 = colorSpace.getMaxValue(0);
        if (f >= minValue3) {
            minValue3 = f;
        }
        if (minValue3 <= maxValue3) {
            maxValue3 = minValue3;
        }
        int iFloatToRawIntBits3 = Float.floatToRawIntBits(maxValue3);
        int i24 = iFloatToRawIntBits3 >>> 31;
        int i25 = (iFloatToRawIntBits3 >>> 23) & 255;
        int i26 = iFloatToRawIntBits3 & 8388607;
        if (i25 == 255) {
            i2 = i26 != 0 ? 512 : 0;
            i = 31;
        } else {
            i = i25 - 112;
            if (i >= 31) {
                i = 49;
                i2 = 0;
            } else {
                if (i > 0) {
                    int i27 = i26 >> 13;
                    if ((iFloatToRawIntBits3 & 4096) != 0) {
                        i2 = ((i << 10) | i27) + 1;
                        i3 = i24 << 15;
                    } else {
                        i2 = i27;
                    }
                    short s = (short) (i2 | i3);
                    minValue = colorSpace.getMinValue(1);
                    maxValue = colorSpace.getMaxValue(1);
                    if (f2 >= minValue) {
                        minValue = f2;
                    }
                    if (minValue <= maxValue) {
                        maxValue = minValue;
                    }
                    iFloatToRawIntBits = Float.floatToRawIntBits(maxValue);
                    i4 = iFloatToRawIntBits >>> 31;
                    i5 = (iFloatToRawIntBits >>> 23) & 255;
                    i6 = iFloatToRawIntBits & 8388607;
                    if (i5 == 255) {
                        if (i6 != 0) {
                            i9 = 512;
                        } else {
                            i9 = 0;
                        }
                        i7 = 31;
                    } else {
                        i7 = i5 - 112;
                        if (i7 >= 31) {
                            i7 = 49;
                            i9 = 0;
                        } else {
                            if (i7 <= 0) {
                                i8 = i6 >> 13;
                                if ((iFloatToRawIntBits & 4096) != 0) {
                                    i9 = ((i7 << 10) | i8) + 1;
                                    i10 = i4 << 15;
                                } else {
                                    i9 = i8;
                                }
                                short s2 = (short) (i9 | i10);
                                minValue2 = colorSpace.getMinValue(2);
                                maxValue2 = colorSpace.getMaxValue(2);
                                if (f3 >= minValue2) {
                                    minValue2 = f3;
                                }
                                if (minValue2 <= maxValue2) {
                                    maxValue2 = minValue2;
                                }
                                iFloatToRawIntBits2 = Float.floatToRawIntBits(maxValue2);
                                i12 = iFloatToRawIntBits2 >>> 31;
                                i13 = (iFloatToRawIntBits2 >>> 23) & 255;
                                i14 = 8388607 & iFloatToRawIntBits2;
                                if (i13 == 255) {
                                    if (i14 != 0) {
                                        i17 = 512;
                                    } else {
                                        i17 = 0;
                                    }
                                    i18 = 31;
                                } else {
                                    i15 = i13 - 112;
                                    if (i15 >= 31) {
                                        i18 = 49;
                                        i17 = 0;
                                    } else {
                                        if (i15 <= 0) {
                                            i16 = i14 >> 13;
                                            if ((iFloatToRawIntBits2 & 4096) != 0) {
                                                i19 = (((i15 << 10) | i16) + 1) | (i12 << 15);
                                            } else {
                                                i17 = i16;
                                                i18 = i15;
                                            }
                                            short s3 = (short) i19;
                                            f5 = f4 >= 0.0f ? f4 : 0.0f;
                                            return Color.m4214constructorimpl(ULong.m8203constructorimpl((((long) id$ui_graphics_release) & 63) | ((((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((((long) s2) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((((long) s3) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16) | ((1023 & ((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f)))) << 6)));
                                        }
                                        if (i15 >= -10) {
                                            i20 = (i14 | 8388608) >> (1 - i15);
                                            if ((i20 & 4096) != 0) {
                                                i20 += 8192;
                                            }
                                            i17 = i20 >> 13;
                                        } else {
                                            i17 = 0;
                                        }
                                        i18 = 0;
                                    }
                                }
                                i19 = (i12 << 15) | (i18 << 10) | i17;
                                short s4 = (short) i19;
                                if (f4 >= 0.0f) {
                                }
                                return Color.m4214constructorimpl(ULong.m8203constructorimpl((((long) id$ui_graphics_release) & 63) | ((((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((((long) s2) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((((long) s4) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16) | ((1023 & ((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f)))) << 6)));
                            }
                            if (i7 >= -10) {
                                i11 = (i6 | 8388608) >> (1 - i7);
                                if ((i11 & 4096) != 0) {
                                    i11 += 8192;
                                }
                                i9 = i11 >> 13;
                            } else {
                                i9 = 0;
                            }
                            i7 = 0;
                        }
                    }
                    i10 = (i4 << 15) | (i7 << 10);
                    short s5 = (short) (i9 | i10);
                    minValue2 = colorSpace.getMinValue(2);
                    maxValue2 = colorSpace.getMaxValue(2);
                    if (f3 >= minValue2) {
                        minValue2 = f3;
                    }
                    if (minValue2 <= maxValue2) {
                        maxValue2 = minValue2;
                    }
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(maxValue2);
                    i12 = iFloatToRawIntBits2 >>> 31;
                    i13 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i14 = 8388607 & iFloatToRawIntBits2;
                    if (i13 == 255) {
                        if (i14 != 0) {
                            i17 = 512;
                        } else {
                            i17 = 0;
                        }
                        i18 = 31;
                    } else {
                        i15 = i13 - 112;
                        if (i15 >= 31) {
                            i18 = 49;
                            i17 = 0;
                        } else {
                            if (i15 <= 0) {
                                i16 = i14 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i19 = (((i15 << 10) | i16) + 1) | (i12 << 15);
                                } else {
                                    i17 = i16;
                                    i18 = i15;
                                }
                                short s6 = (short) i19;
                                if (f4 >= 0.0f) {
                                }
                                return Color.m4214constructorimpl(ULong.m8203constructorimpl((((long) id$ui_graphics_release) & 63) | ((((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((((long) s5) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((((long) s6) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16) | ((1023 & ((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f)))) << 6)));
                            }
                            if (i15 >= -10) {
                                i20 = (i14 | 8388608) >> (1 - i15);
                                if ((i20 & 4096) != 0) {
                                    i20 += 8192;
                                }
                                i17 = i20 >> 13;
                            } else {
                                i17 = 0;
                            }
                            i18 = 0;
                        }
                    }
                    i19 = (i12 << 15) | (i18 << 10) | i17;
                    short s7 = (short) i19;
                    if (f4 >= 0.0f) {
                    }
                    return Color.m4214constructorimpl(ULong.m8203constructorimpl((((long) id$ui_graphics_release) & 63) | ((((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((((long) s5) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((((long) s7) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16) | ((1023 & ((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f)))) << 6)));
                }
                if (i >= -10) {
                    int i28 = (i26 | 8388608) >> (1 - i);
                    if ((i28 & 4096) != 0) {
                        i28 += 8192;
                    }
                    i2 = i28 >> 13;
                } else {
                    i2 = 0;
                }
                i = 0;
            }
        }
        i3 = (i24 << 15) | (i << 10);
        short s8 = (short) (i2 | i3);
        minValue = colorSpace.getMinValue(1);
        maxValue = colorSpace.getMaxValue(1);
        if (f2 >= minValue) {
            minValue = f2;
        }
        if (minValue <= maxValue) {
            maxValue = minValue;
        }
        iFloatToRawIntBits = Float.floatToRawIntBits(maxValue);
        i4 = iFloatToRawIntBits >>> 31;
        i5 = (iFloatToRawIntBits >>> 23) & 255;
        i6 = iFloatToRawIntBits & 8388607;
        if (i5 == 255) {
            if (i6 != 0) {
                i9 = 512;
            } else {
                i9 = 0;
            }
            i7 = 31;
        } else {
            i7 = i5 - 112;
            if (i7 >= 31) {
                i7 = 49;
                i9 = 0;
            } else {
                if (i7 <= 0) {
                    i8 = i6 >> 13;
                    if ((iFloatToRawIntBits & 4096) != 0) {
                        i9 = ((i7 << 10) | i8) + 1;
                        i10 = i4 << 15;
                    } else {
                        i9 = i8;
                    }
                    short s9 = (short) (i9 | i10);
                    minValue2 = colorSpace.getMinValue(2);
                    maxValue2 = colorSpace.getMaxValue(2);
                    if (f3 >= minValue2) {
                        minValue2 = f3;
                    }
                    if (minValue2 <= maxValue2) {
                        maxValue2 = minValue2;
                    }
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(maxValue2);
                    i12 = iFloatToRawIntBits2 >>> 31;
                    i13 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i14 = 8388607 & iFloatToRawIntBits2;
                    if (i13 == 255) {
                        if (i14 != 0) {
                            i17 = 512;
                        } else {
                            i17 = 0;
                        }
                        i18 = 31;
                    } else {
                        i15 = i13 - 112;
                        if (i15 >= 31) {
                            i18 = 49;
                            i17 = 0;
                        } else {
                            if (i15 <= 0) {
                                i16 = i14 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i19 = (((i15 << 10) | i16) + 1) | (i12 << 15);
                                } else {
                                    i17 = i16;
                                    i18 = i15;
                                }
                                short s10 = (short) i19;
                                if (f4 >= 0.0f) {
                                }
                                return Color.m4214constructorimpl(ULong.m8203constructorimpl((((long) id$ui_graphics_release) & 63) | ((((long) s8) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((((long) s9) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((((long) s10) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16) | ((1023 & ((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f)))) << 6)));
                            }
                            if (i15 >= -10) {
                                i20 = (i14 | 8388608) >> (1 - i15);
                                if ((i20 & 4096) != 0) {
                                    i20 += 8192;
                                }
                                i17 = i20 >> 13;
                            } else {
                                i17 = 0;
                            }
                            i18 = 0;
                        }
                    }
                    i19 = (i12 << 15) | (i18 << 10) | i17;
                    short s11 = (short) i19;
                    if (f4 >= 0.0f) {
                    }
                    return Color.m4214constructorimpl(ULong.m8203constructorimpl((((long) id$ui_graphics_release) & 63) | ((((long) s8) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((((long) s9) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((((long) s11) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16) | ((1023 & ((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f)))) << 6)));
                }
                if (i7 >= -10) {
                    i11 = (i6 | 8388608) >> (1 - i7);
                    if ((i11 & 4096) != 0) {
                        i11 += 8192;
                    }
                    i9 = i11 >> 13;
                } else {
                    i9 = 0;
                }
                i7 = 0;
            }
        }
        i10 = (i4 << 15) | (i7 << 10);
        short s12 = (short) (i9 | i10);
        minValue2 = colorSpace.getMinValue(2);
        maxValue2 = colorSpace.getMaxValue(2);
        if (f3 >= minValue2) {
            minValue2 = f3;
        }
        if (minValue2 <= maxValue2) {
            maxValue2 = minValue2;
        }
        iFloatToRawIntBits2 = Float.floatToRawIntBits(maxValue2);
        i12 = iFloatToRawIntBits2 >>> 31;
        i13 = (iFloatToRawIntBits2 >>> 23) & 255;
        i14 = 8388607 & iFloatToRawIntBits2;
        if (i13 == 255) {
            if (i14 != 0) {
                i17 = 512;
            } else {
                i17 = 0;
            }
            i18 = 31;
        } else {
            i15 = i13 - 112;
            if (i15 >= 31) {
                i18 = 49;
                i17 = 0;
            } else {
                if (i15 <= 0) {
                    i16 = i14 >> 13;
                    if ((iFloatToRawIntBits2 & 4096) != 0) {
                        i19 = (((i15 << 10) | i16) + 1) | (i12 << 15);
                    } else {
                        i17 = i16;
                        i18 = i15;
                    }
                    short s13 = (short) i19;
                    if (f4 >= 0.0f) {
                    }
                    return Color.m4214constructorimpl(ULong.m8203constructorimpl((((long) id$ui_graphics_release) & 63) | ((((long) s8) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((((long) s12) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((((long) s13) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16) | ((1023 & ((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f)))) << 6)));
                }
                if (i15 >= -10) {
                    i20 = (i14 | 8388608) >> (1 - i15);
                    if ((i20 & 4096) != 0) {
                        i20 += 8192;
                    }
                    i17 = i20 >> 13;
                } else {
                    i17 = 0;
                }
                i18 = 0;
            }
        }
        i19 = (i12 << 15) | (i18 << 10) | i17;
        short s14 = (short) i19;
        if (f4 >= 0.0f) {
        }
        return Color.m4214constructorimpl(ULong.m8203constructorimpl((((long) id$ui_graphics_release) & 63) | ((((long) s8) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((((long) s12) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((((long) s14) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16) | ((1023 & ((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f)))) << 6)));
    }

    public static /* synthetic */ long UncheckedColor$default(float f, float f2, float f3, float f4, ColorSpace colorSpace, int i, Object obj) {
        if ((i & 8) != 0) {
            f4 = 1.0f;
        }
        if ((i & 16) != 0) {
            colorSpace = ColorSpaces.INSTANCE.getSrgb();
        }
        return UncheckedColor(f, f2, f3, f4, colorSpace);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x009c  */
    /* JADX WARN: Code duplicated, block: B:31:0x009f  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x00ab A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:42:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:43:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00f3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:63:0x0105  */
    /* JADX WARN: Code duplicated, block: B:64:0x0107  */
    /* JADX WARN: Code duplicated, block: B:66:0x010d  */
    /* JADX WARN: Code duplicated, block: B:67:0x0116  */
    public static final long UncheckedColor(float f, float f2, float f3, float f4, ColorSpace colorSpace) {
        int i;
        int i2;
        int i3;
        int iFloatToRawIntBits;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int iFloatToRawIntBits2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        if (colorSpace.getIsSrgb()) {
            return Color.m4214constructorimpl(ULong.m8203constructorimpl(ULong.m8203constructorimpl((((((int) ((f4 * 255.0f) + 0.5f)) << 24) | (((int) ((f * 255.0f) + 0.5f)) << 16)) | (((int) ((f2 * 255.0f) + 0.5f)) << 8)) | ((int) ((255.0f * f3) + 0.5f))) << 32));
        }
        int iFloatToRawIntBits3 = Float.floatToRawIntBits(f);
        int i19 = iFloatToRawIntBits3 >>> 31;
        int i20 = (iFloatToRawIntBits3 >>> 23) & 255;
        int i21 = iFloatToRawIntBits3 & 8388607;
        int i22 = 49;
        int i23 = 0;
        if (i20 == 255) {
            i2 = i21 != 0 ? 512 : 0;
            i = 31;
        } else {
            i = i20 - 112;
            if (i >= 31) {
                i = 49;
                i2 = 0;
            } else {
                if (i > 0) {
                    int i24 = i21 >> 13;
                    if ((iFloatToRawIntBits3 & 4096) != 0) {
                        i2 = ((i << 10) | i24) + 1;
                        i3 = i19 << 15;
                    } else {
                        i2 = i24;
                    }
                    short s = (short) (i2 | i3);
                    iFloatToRawIntBits = Float.floatToRawIntBits(f2);
                    i4 = iFloatToRawIntBits >>> 31;
                    i5 = (iFloatToRawIntBits >>> 23) & 255;
                    i6 = iFloatToRawIntBits & 8388607;
                    if (i5 == 255) {
                        if (i6 != 0) {
                            i9 = 512;
                        } else {
                            i9 = 0;
                        }
                        i7 = 31;
                    } else {
                        i7 = i5 - 112;
                        if (i7 >= 31) {
                            i7 = 49;
                            i9 = 0;
                        } else {
                            if (i7 <= 0) {
                                i8 = i6 >> 13;
                                if ((iFloatToRawIntBits & 4096) != 0) {
                                    i9 = ((i7 << 10) | i8) + 1;
                                    i10 = i4 << 15;
                                } else {
                                    i9 = i8;
                                }
                                short s2 = (short) (i9 | i10);
                                iFloatToRawIntBits2 = Float.floatToRawIntBits(f3);
                                i12 = iFloatToRawIntBits2 >>> 31;
                                i13 = (iFloatToRawIntBits2 >>> 23) & 255;
                                i14 = 8388607 & iFloatToRawIntBits2;
                                if (i13 == 255) {
                                    i15 = i13 - 112;
                                    if (i15 < 31) {
                                        if (i15 <= 0) {
                                            i23 = i14 >> 13;
                                            if ((iFloatToRawIntBits2 & 4096) != 0) {
                                                i16 = (((i15 << 10) | i23) + 1) | (i12 << 15);
                                            } else {
                                                i22 = i15;
                                            }
                                        } else if (i15 >= -10) {
                                            i17 = (i14 | 8388608) >> (1 - i15);
                                            if ((i17 & 4096) != 0) {
                                                i17 += 8192;
                                            }
                                            i22 = 0;
                                            i23 = i17 >> 13;
                                        } else {
                                            i22 = 0;
                                        }
                                    }
                                    return Color.m4214constructorimpl(ULong.m8203constructorimpl(((((long) ((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | ((((long) ((short) i16)) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16) | ((((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((((long) s2) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | (63 & ((long) colorSpace.getId()))));
                                }
                                if (i14 != 0) {
                                    i18 = 512;
                                } else {
                                    i18 = 0;
                                }
                                i23 = i18;
                                i22 = 31;
                                i16 = (i12 << 15) | (i22 << 10) | i23;
                                return Color.m4214constructorimpl(ULong.m8203constructorimpl(((((long) ((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | ((((long) ((short) i16)) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16) | ((((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((((long) s2) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | (63 & ((long) colorSpace.getId()))));
                            }
                            if (i7 >= -10) {
                                i11 = (i6 | 8388608) >> (1 - i7);
                                if ((i11 & 4096) != 0) {
                                    i11 += 8192;
                                }
                                i9 = i11 >> 13;
                                i7 = 0;
                            } else {
                                i9 = 0;
                                i7 = 0;
                            }
                        }
                    }
                    i10 = (i4 << 15) | (i7 << 10);
                    short s3 = (short) (i9 | i10);
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(f3);
                    i12 = iFloatToRawIntBits2 >>> 31;
                    i13 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i14 = 8388607 & iFloatToRawIntBits2;
                    if (i13 == 255) {
                        i15 = i13 - 112;
                        if (i15 < 31) {
                            if (i15 <= 0) {
                                i23 = i14 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i16 = (((i15 << 10) | i23) + 1) | (i12 << 15);
                                } else {
                                    i22 = i15;
                                }
                            } else if (i15 >= -10) {
                                i17 = (i14 | 8388608) >> (1 - i15);
                                if ((i17 & 4096) != 0) {
                                    i17 += 8192;
                                }
                                i22 = 0;
                                i23 = i17 >> 13;
                            } else {
                                i22 = 0;
                            }
                        }
                        return Color.m4214constructorimpl(ULong.m8203constructorimpl(((((long) ((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | ((((long) ((short) i16)) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16) | ((((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((((long) s3) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | (63 & ((long) colorSpace.getId()))));
                    }
                    if (i14 != 0) {
                        i18 = 512;
                    } else {
                        i18 = 0;
                    }
                    i23 = i18;
                    i22 = 31;
                    i16 = (i12 << 15) | (i22 << 10) | i23;
                    return Color.m4214constructorimpl(ULong.m8203constructorimpl(((((long) ((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | ((((long) ((short) i16)) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16) | ((((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((((long) s3) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | (63 & ((long) colorSpace.getId()))));
                }
                if (i >= -10) {
                    int i25 = (i21 | 8388608) >> (1 - i);
                    if ((i25 & 4096) != 0) {
                        i25 += 8192;
                    }
                    i2 = i25 >> 13;
                    i = 0;
                } else {
                    i2 = 0;
                    i = 0;
                }
            }
        }
        i3 = (i19 << 15) | (i << 10);
        short s4 = (short) (i2 | i3);
        iFloatToRawIntBits = Float.floatToRawIntBits(f2);
        i4 = iFloatToRawIntBits >>> 31;
        i5 = (iFloatToRawIntBits >>> 23) & 255;
        i6 = iFloatToRawIntBits & 8388607;
        if (i5 == 255) {
            if (i6 != 0) {
                i9 = 512;
            } else {
                i9 = 0;
            }
            i7 = 31;
        } else {
            i7 = i5 - 112;
            if (i7 >= 31) {
                i7 = 49;
                i9 = 0;
            } else {
                if (i7 <= 0) {
                    i8 = i6 >> 13;
                    if ((iFloatToRawIntBits & 4096) != 0) {
                        i9 = ((i7 << 10) | i8) + 1;
                        i10 = i4 << 15;
                    } else {
                        i9 = i8;
                    }
                    short s5 = (short) (i9 | i10);
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(f3);
                    i12 = iFloatToRawIntBits2 >>> 31;
                    i13 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i14 = 8388607 & iFloatToRawIntBits2;
                    if (i13 == 255) {
                        i15 = i13 - 112;
                        if (i15 < 31) {
                            if (i15 <= 0) {
                                i23 = i14 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i16 = (((i15 << 10) | i23) + 1) | (i12 << 15);
                                } else {
                                    i22 = i15;
                                }
                            } else if (i15 >= -10) {
                                i17 = (i14 | 8388608) >> (1 - i15);
                                if ((i17 & 4096) != 0) {
                                    i17 += 8192;
                                }
                                i22 = 0;
                                i23 = i17 >> 13;
                            } else {
                                i22 = 0;
                            }
                        }
                        return Color.m4214constructorimpl(ULong.m8203constructorimpl(((((long) ((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | ((((long) ((short) i16)) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16) | ((((long) s4) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((((long) s5) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | (63 & ((long) colorSpace.getId()))));
                    }
                    if (i14 != 0) {
                        i18 = 512;
                    } else {
                        i18 = 0;
                    }
                    i23 = i18;
                    i22 = 31;
                    i16 = (i12 << 15) | (i22 << 10) | i23;
                    return Color.m4214constructorimpl(ULong.m8203constructorimpl(((((long) ((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | ((((long) ((short) i16)) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16) | ((((long) s4) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((((long) s5) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | (63 & ((long) colorSpace.getId()))));
                }
                if (i7 >= -10) {
                    i11 = (i6 | 8388608) >> (1 - i7);
                    if ((i11 & 4096) != 0) {
                        i11 += 8192;
                    }
                    i9 = i11 >> 13;
                    i7 = 0;
                } else {
                    i9 = 0;
                    i7 = 0;
                }
            }
        }
        i10 = (i4 << 15) | (i7 << 10);
        short s6 = (short) (i9 | i10);
        iFloatToRawIntBits2 = Float.floatToRawIntBits(f3);
        i12 = iFloatToRawIntBits2 >>> 31;
        i13 = (iFloatToRawIntBits2 >>> 23) & 255;
        i14 = 8388607 & iFloatToRawIntBits2;
        if (i13 == 255) {
            i15 = i13 - 112;
            if (i15 < 31) {
                if (i15 <= 0) {
                    i23 = i14 >> 13;
                    if ((iFloatToRawIntBits2 & 4096) != 0) {
                        i16 = (((i15 << 10) | i23) + 1) | (i12 << 15);
                    } else {
                        i22 = i15;
                    }
                } else if (i15 >= -10) {
                    i17 = (i14 | 8388608) >> (1 - i15);
                    if ((i17 & 4096) != 0) {
                        i17 += 8192;
                    }
                    i22 = 0;
                    i23 = i17 >> 13;
                } else {
                    i22 = 0;
                }
            }
            return Color.m4214constructorimpl(ULong.m8203constructorimpl(((((long) ((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | ((((long) ((short) i16)) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16) | ((((long) s4) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((((long) s6) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | (63 & ((long) colorSpace.getId()))));
        }
        if (i14 != 0) {
            i18 = 512;
        } else {
            i18 = 0;
        }
        i23 = i18;
        i22 = 31;
        i16 = (i12 << 15) | (i22 << 10) | i23;
        return Color.m4214constructorimpl(ULong.m8203constructorimpl(((((long) ((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | ((((long) ((short) i16)) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16) | ((((long) s4) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((((long) s6) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | (63 & ((long) colorSpace.getId()))));
    }

    public static final long Color(int i) {
        return Color.m4214constructorimpl(ULong.m8203constructorimpl(ULong.m8203constructorimpl(i) << 32));
    }

    public static final long Color(long j) {
        return Color.m4214constructorimpl(ULong.m8203constructorimpl(j << 32));
    }

    public static /* synthetic */ long Color$default(int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 8) != 0) {
            i4 = 255;
        }
        return Color(i, i2, i3, i4);
    }

    public static final long Color(int i, int i2, int i3, int i4) {
        return Color(((i & 255) << 16) | ((i4 & 255) << 24) | ((i2 & 255) << 8) | (i3 & 255));
    }

    /* JADX INFO: renamed from: lerp-jxsXWHM, reason: not valid java name */
    public static final long m4269lerpjxsXWHM(long j, long j2, float f) {
        ColorSpace oklab = ColorSpaces.INSTANCE.getOklab();
        long jM4215convertvNxB06k = Color.m4215convertvNxB06k(j, oklab);
        long jM4215convertvNxB06k2 = Color.m4215convertvNxB06k(j2, oklab);
        float fM4220getAlphaimpl = Color.m4220getAlphaimpl(jM4215convertvNxB06k);
        float fM4224getRedimpl = Color.m4224getRedimpl(jM4215convertvNxB06k);
        float fM4223getGreenimpl = Color.m4223getGreenimpl(jM4215convertvNxB06k);
        float fM4221getBlueimpl = Color.m4221getBlueimpl(jM4215convertvNxB06k);
        float fM4220getAlphaimpl2 = Color.m4220getAlphaimpl(jM4215convertvNxB06k2);
        float fM4224getRedimpl2 = Color.m4224getRedimpl(jM4215convertvNxB06k2);
        float fM4223getGreenimpl2 = Color.m4223getGreenimpl(jM4215convertvNxB06k2);
        float fM4221getBlueimpl2 = Color.m4221getBlueimpl(jM4215convertvNxB06k2);
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        return Color.m4215convertvNxB06k(UncheckedColor(MathHelpersKt.lerp(fM4224getRedimpl, fM4224getRedimpl2, f), MathHelpersKt.lerp(fM4223getGreenimpl, fM4223getGreenimpl2, f), MathHelpersKt.lerp(fM4221getBlueimpl, fM4221getBlueimpl2, f), MathHelpersKt.lerp(fM4220getAlphaimpl, fM4220getAlphaimpl2, f), oklab), Color.m4222getColorSpaceimpl(j2));
    }

    /* JADX INFO: renamed from: compositeOver--OWjLjI, reason: not valid java name */
    public static final long m4263compositeOverOWjLjI(long j, long j2) {
        long jM4215convertvNxB06k = Color.m4215convertvNxB06k(j, Color.m4222getColorSpaceimpl(j2));
        float fM4220getAlphaimpl = Color.m4220getAlphaimpl(j2);
        float fM4220getAlphaimpl2 = Color.m4220getAlphaimpl(jM4215convertvNxB06k);
        float f = 1.0f - fM4220getAlphaimpl2;
        float f2 = (fM4220getAlphaimpl * f) + fM4220getAlphaimpl2;
        return UncheckedColor(f2 == 0.0f ? 0.0f : ((Color.m4224getRedimpl(jM4215convertvNxB06k) * fM4220getAlphaimpl2) + ((Color.m4224getRedimpl(j2) * fM4220getAlphaimpl) * f)) / f2, f2 == 0.0f ? 0.0f : ((Color.m4223getGreenimpl(jM4215convertvNxB06k) * fM4220getAlphaimpl2) + ((Color.m4223getGreenimpl(j2) * fM4220getAlphaimpl) * f)) / f2, f2 != 0.0f ? ((Color.m4221getBlueimpl(jM4215convertvNxB06k) * fM4220getAlphaimpl2) + ((Color.m4221getBlueimpl(j2) * fM4220getAlphaimpl) * f)) / f2 : 0.0f, f2, Color.m4222getColorSpaceimpl(j2));
    }

    /* JADX INFO: renamed from: getComponents-8_81llA, reason: not valid java name */
    private static final float[] m4264getComponents8_81llA(long j) {
        return new float[]{Color.m4224getRedimpl(j), Color.m4223getGreenimpl(j), Color.m4221getBlueimpl(j), Color.m4220getAlphaimpl(j)};
    }

    /* JADX INFO: renamed from: luminance-8_81llA, reason: not valid java name */
    public static final float m4270luminance8_81llA(long j) {
        ColorSpace colorSpaceM4222getColorSpaceimpl = Color.m4222getColorSpaceimpl(j);
        if (!ColorModel.m4644equalsimpl0(colorSpaceM4222getColorSpaceimpl.getModel(), ColorModel.INSTANCE.m4651getRgbxdoWZVw())) {
            StringBuilder sb = new StringBuilder("The specified color must be encoded in an RGB color space. The supplied color space is ");
            sb.append((Object) ColorModel.m4647toStringimpl(colorSpaceM4222getColorSpaceimpl.getModel()));
            InlineClassHelperKt.throwIllegalArgumentException(sb.toString());
        }
        Intrinsics.checkNotNull(colorSpaceM4222getColorSpaceimpl, "");
        DoubleFunction eotfFunc$ui_graphics_release = ((Rgb) colorSpaceM4222getColorSpaceimpl).getEotfFunc();
        float fInvoke = (float) ((eotfFunc$ui_graphics_release.invoke(Color.m4224getRedimpl(j)) * 0.2126d) + (eotfFunc$ui_graphics_release.invoke(Color.m4223getGreenimpl(j)) * 0.7152d) + (eotfFunc$ui_graphics_release.invoke(Color.m4221getBlueimpl(j)) * 0.0722d));
        if (fInvoke < 0.0f) {
            fInvoke = 0.0f;
        }
        if (fInvoke > 1.0f) {
            return 1.0f;
        }
        return fInvoke;
    }

    /* JADX INFO: renamed from: toArgb-8_81llA, reason: not valid java name */
    public static final int m4272toArgb8_81llA(long j) {
        return (int) ULong.m8203constructorimpl(Color.m4215convertvNxB06k(j, ColorSpaces.INSTANCE.getSrgb()) >>> 32);
    }

    /* JADX INFO: renamed from: takeOrElse-DxMtmZc, reason: not valid java name */
    public static final long m4271takeOrElseDxMtmZc(long j, Function0<Color> function0) {
        return j != 16 ? j : function0.invoke().m4228unboximpl();
    }
}
