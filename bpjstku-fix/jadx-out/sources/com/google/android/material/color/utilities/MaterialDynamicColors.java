package com.google.android.material.color.utilities;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.support.v4.media.session.MediaSessionCompat;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.ViewCompat;
import com.google.firebase.messaging.Constants;
import defpackage.SessionConfigValidatingBuilder;
import defpackage.deInitSession;
import defpackage.initSession;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
import defpackage.setOrVerifyExpectFrameRateRange;
import defpackage.setVideoStabilizationMode;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Random;
import java.util.function.Function;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes4.dex */
public final class MaterialDynamicColors {
    private static final byte[] $$c = {31, 115, -100, -11};
    private static final int $$f = 100;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {106, -22, 107, 95, -15, -1, 60, -60, -11, -3, 5, -8, 4, 52, -54, -16, 7, -17, 0, 3, 2, 51, -60, -9, -9, 66, -66, 9, -18, -6, 66, -66, -5, 8, -4, -10, 59, -37, -34, 0, -16, 15, -11, -2, -36, 9, -14, 8, -9, -2, 27, -20, -27, 9, 5, -12, -9, 43, -47, 14, -9, -9, 5, -12, -9, 15, -10, -8, 7, -8, -8, 4, 27, -40, 5, -9, 8, -22, 12, -16, 62};
    private static final int $$e = 166;
    private static final byte[] $$a = {29, -5, -24, -13, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
    private static final int $$b = 108;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
    private static int TuitionPaymentFragmentbindingInflater1 = -83722248;

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 14
            int r6 = r6 + 84
            int r7 = r7 * 52
            int r7 = 55 - r7
            byte[] r0 = com.google.android.material.color.utilities.MaterialDynamicColors.$$a
            int r1 = r8 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L15
            r6 = r7
            r4 = r8
            r3 = r2
            goto L2c
        L15:
            r3 = r2
        L16:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r5
        L2c:
            int r7 = r7 + r4
            int r7 = r7 + (-10)
            r5 = r7
            r7 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.color.utilities.MaterialDynamicColors.a(short, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0031). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 15
            int r6 = r6 + 84
            int r7 = r7 * 3
            int r0 = 41 - r7
            int r8 = r8 * 40
            int r8 = 43 - r8
            byte[] r1 = com.google.android.material.color.utilities.MaterialDynamicColors.$$d
            byte[] r0 = new byte[r0]
            int r7 = 40 - r7
            r2 = 0
            if (r1 != 0) goto L19
            r6 = r7
            r3 = r8
            r4 = r2
            goto L31
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L27:
            int r8 = r8 + 1
            r4 = r1[r8]
            int r3 = r3 + 1
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L31:
            int r8 = -r8
            int r6 = r6 + r8
            int r6 = r6 + (-3)
            r8 = r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.color.utilities.MaterialDynamicColors.c(byte, byte, byte, java.lang.Object[]):void");
    }

    public final DynamicColor highestSurface(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        if (!(!dynamicScheme.isDark)) {
            DynamicColor dynamicColorSurfaceBright = surfaceBright();
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 15;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            int i5 = i4 % 2;
            return dynamicColorSurfaceBright;
        }
        DynamicColor dynamicColorSurfaceDim = surfaceDim();
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 81 / 0;
        }
        return dynamicColorSurfaceDim;
    }

    public final DynamicColor primaryPaletteKeyColor() {
        int i = 2 % 2;
        DynamicColor dynamicColorFromPalette = DynamicColor.fromPalette("primary_palette_key_color", new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda72
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$primaryPaletteKeyColor$0((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda73
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$primaryPaletteKeyColor$1((DynamicScheme) obj);
            }
        });
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            return dynamicColorFromPalette;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ TonalPalette lambda$primaryPaletteKeyColor$0(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 85;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        TonalPalette tonalPalette = dynamicScheme.primaryPalette;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 63;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return tonalPalette;
    }

    static /* synthetic */ Double lambda$primaryPaletteKeyColor$1(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 95;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Double dValueOf = Double.valueOf(dynamicScheme.primaryPalette.getKeyColor().getTone());
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 15;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 30 / 0;
        }
        return dValueOf;
    }

    public final DynamicColor secondaryPaletteKeyColor() {
        int i = 2 % 2;
        DynamicColor dynamicColorFromPalette = DynamicColor.fromPalette("secondary_palette_key_color", new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda79
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$secondaryPaletteKeyColor$2((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda80
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$secondaryPaletteKeyColor$3((DynamicScheme) obj);
            }
        });
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 17;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            return dynamicColorFromPalette;
        }
        throw null;
    }

    static /* synthetic */ TonalPalette lambda$secondaryPaletteKeyColor$2(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        TonalPalette tonalPalette = dynamicScheme.secondaryPalette;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 63;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 33 / 0;
        }
        return tonalPalette;
    }

    static /* synthetic */ Double lambda$secondaryPaletteKeyColor$3(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 15;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        Hct keyColor = dynamicScheme.secondaryPalette.getKeyColor();
        if (i3 != 0) {
            return Double.valueOf(keyColor.getTone());
        }
        Double.valueOf(keyColor.getTone());
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final DynamicColor tertiaryPaletteKeyColor() {
        int i = 2 % 2;
        DynamicColor dynamicColorFromPalette = DynamicColor.fromPalette("tertiary_palette_key_color", new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda91
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$tertiaryPaletteKeyColor$4((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda92
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$tertiaryPaletteKeyColor$5((DynamicScheme) obj);
            }
        });
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 75;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        return dynamicColorFromPalette;
    }

    static /* synthetic */ TonalPalette lambda$tertiaryPaletteKeyColor$4(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 121;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        TonalPalette tonalPalette = dynamicScheme.tertiaryPalette;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 55;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 47 / 0;
        }
        return tonalPalette;
    }

    static /* synthetic */ Double lambda$tertiaryPaletteKeyColor$5(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 65;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        Double dValueOf = Double.valueOf(dynamicScheme.tertiaryPalette.getKeyColor().getTone());
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            return dValueOf;
        }
        throw null;
    }

    public final DynamicColor neutralPaletteKeyColor() {
        int i = 2 % 2;
        DynamicColor dynamicColorFromPalette = DynamicColor.fromPalette("neutral_palette_key_color", new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda11
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$neutralPaletteKeyColor$6((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda22
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$neutralPaletteKeyColor$7((DynamicScheme) obj);
            }
        });
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        return dynamicColorFromPalette;
    }

    static /* synthetic */ TonalPalette lambda$neutralPaletteKeyColor$6(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 107;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        TonalPalette tonalPalette = dynamicScheme.neutralPalette;
        if (i3 == 0) {
            throw null;
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 67;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            return tonalPalette;
        }
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ Double lambda$neutralPaletteKeyColor$7(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Double dValueOf = Double.valueOf(dynamicScheme.neutralPalette.getKeyColor().getTone());
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 71;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return dValueOf;
    }

    public final DynamicColor neutralVariantPaletteKeyColor() {
        int i = 2 % 2;
        DynamicColor dynamicColorFromPalette = DynamicColor.fromPalette("neutral_variant_palette_key_color", new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda144
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$neutralVariantPaletteKeyColor$8((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda145
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$neutralVariantPaletteKeyColor$9((DynamicScheme) obj);
            }
        });
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 93;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            return dynamicColorFromPalette;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ TonalPalette lambda$neutralVariantPaletteKeyColor$8(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        TonalPalette tonalPalette = dynamicScheme.neutralVariantPalette;
        if (i3 == 0) {
            return tonalPalette;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ Double lambda$neutralVariantPaletteKeyColor$9(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 9;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Double dValueOf = Double.valueOf(dynamicScheme.neutralVariantPalette.getKeyColor().getTone());
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 25;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            return dValueOf;
        }
        throw null;
    }

    public final DynamicColor background() {
        int i = 2 % 2;
        DynamicColor dynamicColor = new DynamicColor("background", new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda100
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$background$10((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda101
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$background$11((DynamicScheme) obj);
            }
        }, true, null, null, null, null);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 68 / 0;
        }
        return dynamicColor;
    }

    static /* synthetic */ TonalPalette lambda$background$10(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 37;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        TonalPalette tonalPalette = dynamicScheme.neutralPalette;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 115;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            return tonalPalette;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ Double lambda$background$11(DynamicScheme dynamicScheme) {
        double d;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        boolean z = dynamicScheme.isDark;
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        if (z) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 59;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            if (i4 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            d = 6.0d;
        } else {
            d = 98.0d;
        }
        Double dValueOf = Double.valueOf(d);
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 89;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        int i6 = i5 % 2;
        return dValueOf;
    }

    public final DynamicColor onBackground() {
        int i = 2 % 2;
        DynamicColor dynamicColor = new DynamicColor("on_background", new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda104
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$onBackground$12((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda105
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$onBackground$13((DynamicScheme) obj);
            }
        }, false, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda106
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f$0.m7830x24678954((DynamicScheme) obj);
            }
        }, null, new ContrastCurve(3.0d, 3.0d, 4.5d, 7.0d), null);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 31;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        return dynamicColor;
    }

    static /* synthetic */ TonalPalette lambda$onBackground$12(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        TonalPalette tonalPalette = dynamicScheme.neutralPalette;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 47;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return tonalPalette;
    }

    static /* synthetic */ Double lambda$onBackground$13(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 15;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Double dValueOf = Double.valueOf(dynamicScheme.isDark ? 90.0d : 10.0d);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 113;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            return dValueOf;
        }
        throw null;
    }

    /* JADX INFO: renamed from: lambda$onBackground$14$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    final /* synthetic */ DynamicColor m7830x24678954(DynamicScheme dynamicScheme) {
        DynamicColor dynamicColorBackground;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 61;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            dynamicColorBackground = background();
            int i3 = 90 / 0;
        } else {
            dynamicColorBackground = background();
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return dynamicColorBackground;
    }

    public final DynamicColor surface() {
        int i = 2 % 2;
        DynamicColor dynamicColor = new DynamicColor("surface", new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$surface$15((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda74
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$surface$16((DynamicScheme) obj);
            }
        }, true, null, null, null, null);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 107;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            return dynamicColor;
        }
        throw null;
    }

    static /* synthetic */ TonalPalette lambda$surface$15(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 31;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        TonalPalette tonalPalette = dynamicScheme.neutralPalette;
        if (i3 == 0) {
            return tonalPalette;
        }
        throw null;
    }

    static /* synthetic */ Double lambda$surface$16(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        Double dValueOf = Double.valueOf(dynamicScheme.isDark ? 6.0d : 98.0d);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 95;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 13 / 0;
        }
        return dValueOf;
    }

    public final DynamicColor surfaceDim() {
        int i = 2 % 2;
        DynamicColor dynamicColor = new DynamicColor("surface_dim", new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda33
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$surfaceDim$17((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda44
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$surfaceDim$18((DynamicScheme) obj);
            }
        }, true, null, null, null, null);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 87;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            return dynamicColor;
        }
        throw null;
    }

    private static void b(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
        char[] cArr2 = new char[i2];
        setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
            int i5 = $10 + 3;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i7 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i7]), Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), (ViewConfiguration.getPressedStateDuration() >> 16) + 3291, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 30, 1199271174, false, $$g(b, b2, b2), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) KeyEvent.keyCodeFromString(""), 651 - ExpandableListView.getPackedPositionType(0L), 44 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), -450685997, false, $$g(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        if (i3 > 0) {
            int i8 = $11 + 15;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            System.arraycopy(cArr3, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr2, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
        }
        if (z) {
            char[] cArr4 = new char[i2];
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                int i10 = $10 + 13;
                $11 = i10 % 128;
                if (i10 % 2 == 0) {
                    cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(i2 >> setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) >> 1];
                    try {
                        Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b5 = (byte) 0;
                            byte b6 = b5;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getWindowTouchSlop() >> 8), 650 - TextUtils.lastIndexOf("", '0'), TextUtils.getOffsetBefore("", 0) + 44, -450685997, false, $$g(b5, b6, (byte) (b6 + 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                } else {
                    cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                    Object[] objArr5 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = b7;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0)), 651 - TextUtils.indexOf("", "", 0, 0), (ViewConfiguration.getJumpTapTimeout() >> 16) + 44, -450685997, false, $$g(b7, b8, (byte) (b8 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                }
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    static /* synthetic */ TonalPalette lambda$surfaceDim$17(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 55;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        TonalPalette tonalPalette = dynamicScheme.neutralPalette;
        if (i3 != 0) {
            int i4 = 40 / 0;
        }
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 43;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 49 / 0;
        }
        return tonalPalette;
    }

    static /* synthetic */ Double lambda$surfaceDim$18(DynamicScheme dynamicScheme) {
        double d;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 51;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        boolean z = dynamicScheme.isDark;
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (z) {
            d = 6.0d;
        } else {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 57;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            int i5 = i4 % 2;
            d = 87.0d;
        }
        return Double.valueOf(d);
    }

    public final DynamicColor surfaceBright() {
        int i = 2 % 2;
        DynamicColor dynamicColor = new DynamicColor("surface_bright", new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda110
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$surfaceBright$19((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda111
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$surfaceBright$20((DynamicScheme) obj);
            }
        }, true, null, null, null, null);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 47;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        return dynamicColor;
    }

    static /* synthetic */ TonalPalette lambda$surfaceBright$19(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 113;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        TonalPalette tonalPalette = dynamicScheme.neutralPalette;
        if (i3 != 0) {
            return tonalPalette;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ Double lambda$surfaceBright$20(DynamicScheme dynamicScheme) {
        double d;
        int i = 2 % 2;
        if (!dynamicScheme.isDark) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 75;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            int i3 = i2 % 2;
            d = 98.0d;
        } else {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 9;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            int i5 = i4 % 2;
            d = 24.0d;
        }
        Double dValueOf = Double.valueOf(d);
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
        if (i6 % 2 != 0) {
            return dValueOf;
        }
        throw null;
    }

    public final DynamicColor surfaceContainerLowest() {
        int i = 2 % 2;
        DynamicColor dynamicColor = new DynamicColor("surface_container_lowest", new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda7
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$surfaceContainerLowest$21((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda8
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$surfaceContainerLowest$22((DynamicScheme) obj);
            }
        }, true, null, null, null, null);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 51;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        return dynamicColor;
    }

    static /* synthetic */ TonalPalette lambda$surfaceContainerLowest$21(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        TonalPalette tonalPalette = dynamicScheme.neutralPalette;
        if (i3 != 0) {
            int i4 = 23 / 0;
        }
        return tonalPalette;
    }

    static /* synthetic */ Double lambda$surfaceContainerLowest$22(DynamicScheme dynamicScheme) {
        double d;
        int i = 2 % 2;
        if (dynamicScheme.isDark) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 43;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            d = 4.0d;
            if (i2 % 2 != 0) {
                int i3 = 25 / 0;
            }
        } else {
            d = 100.0d;
        }
        Double dValueOf = Double.valueOf(d);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 85;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            return dValueOf;
        }
        throw null;
    }

    public final DynamicColor surfaceContainerLow() {
        int i = 2 % 2;
        DynamicColor dynamicColor = new DynamicColor("surface_container_low", new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda81
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$surfaceContainerLow$23((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda82
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$surfaceContainerLow$24((DynamicScheme) obj);
            }
        }, true, null, null, null, null);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            return dynamicColor;
        }
        throw null;
    }

    static /* synthetic */ TonalPalette lambda$surfaceContainerLow$23(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 87;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        TonalPalette tonalPalette = dynamicScheme.neutralPalette;
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 67;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            return tonalPalette;
        }
        throw null;
    }

    static /* synthetic */ Double lambda$surfaceContainerLow$24(DynamicScheme dynamicScheme) {
        double d;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        if (dynamicScheme.isDark) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 63;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            int i5 = i4 % 2;
            d = 10.0d;
        } else {
            d = 96.0d;
        }
        return Double.valueOf(d);
    }

    public final DynamicColor surfaceContainer() {
        int i = 2 % 2;
        DynamicColor dynamicColor = new DynamicColor("surface_container", new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda38
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$surfaceContainer$25((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda39
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$surfaceContainer$26((DynamicScheme) obj);
            }
        }, true, null, null, null, null);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        return dynamicColor;
    }

    static /* synthetic */ TonalPalette lambda$surfaceContainer$25(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 5;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        TonalPalette tonalPalette = dynamicScheme.neutralPalette;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return tonalPalette;
    }

    static /* synthetic */ Double lambda$surfaceContainer$26(DynamicScheme dynamicScheme) {
        double d;
        int i = 2 % 2;
        if (!dynamicScheme.isDark) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 67;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            d = 94.0d;
        } else {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 33;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            int i5 = i4 % 2;
            d = 12.0d;
        }
        Double dValueOf = Double.valueOf(d);
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 17;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
        int i7 = i6 % 2;
        return dValueOf;
    }

    public final DynamicColor surfaceContainerHigh() {
        int i = 2 % 2;
        DynamicColor dynamicColor = new DynamicColor("surface_container_high", new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda102
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$surfaceContainerHigh$27((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda103
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$surfaceContainerHigh$28((DynamicScheme) obj);
            }
        }, true, null, null, null, null);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 71;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            return dynamicColor;
        }
        throw null;
    }

    static /* synthetic */ TonalPalette lambda$surfaceContainerHigh$27(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        TonalPalette tonalPalette = dynamicScheme.neutralPalette;
        if (i3 == 0) {
            return tonalPalette;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ Double lambda$surfaceContainerHigh$28(DynamicScheme dynamicScheme) {
        double d;
        int i = 2 % 2;
        if (!(!dynamicScheme.isDark)) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int i3 = i2 + 29;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i4 = i2 + 15;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            int i5 = i4 % 2;
            d = 17.0d;
        } else {
            d = 92.0d;
        }
        Double dValueOf = Double.valueOf(d);
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 7;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 26 / 0;
        }
        return dValueOf;
    }

    public final DynamicColor surfaceContainerHighest() {
        int i = 2 % 2;
        DynamicColor dynamicColor = new DynamicColor("surface_container_highest", new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda150
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$surfaceContainerHighest$29((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda152
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$surfaceContainerHighest$30((DynamicScheme) obj);
            }
        }, true, null, null, null, null);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 93;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            return dynamicColor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ TonalPalette lambda$surfaceContainerHighest$29(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 17;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        TonalPalette tonalPalette = dynamicScheme.neutralPalette;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 51;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return tonalPalette;
    }

    static /* synthetic */ Double lambda$surfaceContainerHighest$30(DynamicScheme dynamicScheme) {
        double d;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        if (dynamicScheme.isDark) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 5;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            int i5 = i4 % 2;
            d = 22.0d;
        } else {
            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 119;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
            int i7 = i6 % 2;
            d = 90.0d;
        }
        return Double.valueOf(d);
    }

    public final DynamicColor onSurface() {
        int i = 2 % 2;
        DynamicColor dynamicColor = new DynamicColor("on_surface", new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda140
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$onSurface$31((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda151
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$onSurface$32((DynamicScheme) obj);
            }
        }, false, new MaterialDynamicColors$$ExternalSyntheticLambda162(this), null, new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 60 / 0;
        }
        return dynamicColor;
    }

    static /* synthetic */ TonalPalette lambda$onSurface$31(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 37;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        TonalPalette tonalPalette = dynamicScheme.neutralPalette;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            return tonalPalette;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ Double lambda$onSurface$32(DynamicScheme dynamicScheme) {
        double d;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 71;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        if (!dynamicScheme.isDark) {
            d = 10.0d;
        } else {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 17;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            if (i4 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            d = 90.0d;
        }
        return Double.valueOf(d);
    }

    /* JADX WARN: Type inference failed for: r8v67, types: [boolean, int] */
    public final DynamicColor surfaceVariant() throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 75;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char size = (char) (View.MeasureSpec.getSize(0) + 31533);
            int defaultSize = View.getDefaultSize(0, 0) + 921;
            int i4 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 27;
            byte[] bArr = $$a;
            byte b = bArr[37];
            Object[] objArr3 = new Object[1];
            a(b, b, bArr[80], objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(size, defaultSize, i4, -1048449946, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        b(true, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 252, (KeyEvent.getMaxKeyCode() >> 16) + 22, (ViewConfiguration.getFadingEdgeLength() >> 16) + 13, new char[]{22, 65520, 65483, 16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534, '\b', 0, '\f', '\t', 65504, '\n', 2, 17, 16}, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        b(true, TextUtils.lastIndexOf("", '0') + 258, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 14, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 10, new char[]{65530, 65534, 65515, 65533, 65534, '\f', '\t', 65530, 5, 65534, 65534, 6, 2, '\r', 5}, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cIndexOf = (char) (31533 - TextUtils.indexOf("", "", 0, 0));
            int i5 = 921 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            int i6 = 28 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            byte[] bArr2 = $$a;
            Object[] objArr6 = new Object[1];
            a(bArr2[80], bArr2[37], (byte) 52, objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, i5, i6, -778300370, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 85;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
            int i8 = i7 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cResolveSize = (char) (31533 - View.resolveSize(0, 0));
                int keyRepeatTimeout = 921 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                int i9 = 29 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                byte b2 = $$a[80];
                byte b3 = b2;
                Object[] objArr7 = new Object[1];
                a(b2, b3, (byte) (b3 | 37), objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cResolveSize, keyRepeatTimeout, i9, -1142834547, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr8[1])[0]}, (Object[]) objArr8[2], new int[]{((int[]) objArr8[3])[0]}, (String[]) objArr8[4]};
            int iMyPid = Process.myPid();
            int i10 = (((1725486140 + (((-270543361) | iMyPid) * (-627))) + (((~((-752718940) | iMyPid)) | 1021360704) * (-627))) + (((~(iMyPid | 1021360704)) | (~((~iMyPid) | 752718939))) * 627)) - 286352144;
            int i11 = (i10 << 13) ^ i10;
            int i12 = i11 ^ (i11 >>> 17);
            ((int[]) objArr[0])[0] = i12 ^ (i12 << 5);
        } else {
            Object[] objArr9 = new Object[1];
            b(false, 253 - (ViewConfiguration.getLongPressTimeout() >> 16), 26 - (ViewConfiguration.getTouchSlop() >> 8), 25 - ImageFormat.getBitsPerPixel(0), new char[]{65534, 11, 1, 15, '\f', 6, 1, 65483, 65534, '\r', '\r', 65483, 65502, 0, 17, 6, 19, 6, 17, 22, 65521, 5, 15, 2, 65534, 1}, objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            b(false, 259 - ((byte) KeyEvent.getModifierMetaStateMask()), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 18, 3 - TextUtils.getOffsetAfter("", 0), new char[]{65535, 5, 4, 65529, 11, '\b', '\b', 65531, 4, '\n', 65495, 6, 6, 2, 65535, 65529, 65527, '\n'}, objArr10);
            Context applicationContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr11 = new Object[1];
            b(false, 251 - ((byte) KeyEvent.getModifierMetaStateMask()), 16 - (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 12, new char[]{65535, 65484, '\n', 65535, '\f', 5, 65484, 65521, 23, 17, 18, 3, 11, '\b', 65535, 20}, objArr11);
            Class<?> cls3 = Class.forName((String) objArr11[0]);
            Object[] objArr12 = new Object[1];
            b(true, (ViewConfiguration.getLongPressTimeout() >> 16) + 256, 16 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 4 - Process.getGidForName(""), new char[]{14, '\b', 65535, 65534, 3, 65535, 65534, '\t', 65501, 2, '\r', 65531, 65506, 19, 14, 3}, objArr12);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr12[0], Object.class).invoke(null, this)).intValue();
            int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 123;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i13 % 128;
            int i14 = i13 % 2;
            try {
                Object[] objArr13 = {applicationContext, Integer.valueOf(iIntValue), 0, -286352144};
                byte[] bArr3 = $$d;
                byte b4 = bArr3[5];
                Object[] objArr14 = new Object[1];
                c((byte) (-b4), bArr3[18], (byte) (-b4), objArr14);
                Class<?> cls4 = Class.forName((String) objArr14[0]);
                byte b5 = bArr3[18];
                Object[] objArr15 = new Object[1];
                c(b5, (byte) (-bArr3[5]), b5, objArr15);
                Object[] objArr16 = (Object[]) cls4.getMethod((String) objArr15[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr13);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char deadChar = (char) (31533 - KeyEvent.getDeadChar(0, 0));
                    int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 921;
                    int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 28;
                    byte b6 = $$a[80];
                    byte b7 = b6;
                    Object[] objArr17 = new Object[1];
                    a(b6, b7, (byte) (b7 | 37), objArr17);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(deadChar, scrollDefaultDelay, packedPositionGroup, -1142834547, false, (String) objArr17[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr16);
                try {
                    Object[] objArr18 = new Object[1];
                    b(true, 253 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 22, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 13, new char[]{22, 65520, 65483, 16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534, '\b', 0, '\f', '\t', 65504, '\n', 2, 17, 16}, objArr18);
                    Class<?> cls5 = Class.forName((String) objArr18[0]);
                    Object[] objArr19 = new Object[1];
                    b(true, View.combineMeasuredStates(0, 0) + 257, 15 - TextUtils.indexOf("", "", 0, 0), 10 - ExpandableListView.getPackedPositionType(0L), new char[]{65530, 65534, 65515, 65533, 65534, '\f', '\t', 65530, 5, 65534, 65534, 6, 2, '\r', 5}, objArr19);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr19[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cIndexOf2 = (char) (31532 - TextUtils.indexOf((CharSequence) "", '0'));
                        int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 921;
                        int iResolveSize = 28 - View.resolveSize(0, 0);
                        byte[] bArr4 = $$a;
                        Object[] objArr20 = new Object[1];
                        a(bArr4[80], bArr4[37], (byte) 52, objArr20);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf2, iNormalizeMetaState, iResolveSize, -778300370, false, (String) objArr20[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char touchSlop = (char) ((ViewConfiguration.getTouchSlop() >> 8) + 31533);
                        int i15 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 920;
                        int minimumFlingVelocity = 28 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        byte[] bArr5 = $$a;
                        byte b8 = bArr5[37];
                        Object[] objArr21 = new Object[1];
                        a(b8, b8, bArr5[80], objArr21);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(touchSlop, i15, minimumFlingVelocity, -1048449946, false, (String) objArr21[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArr16;
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i16 = ((int[]) objArr[1])[0];
        int i17 = ((int[]) objArr[3])[0];
        if (i17 == i16) {
            int i18 = ((int[]) objArr[0])[0];
            objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int i19 = ~System.identityHashCode(this);
            int i20 = i18 + ((((-662413848) + (((~((-360947091) | i19)) | (-1413132554)) * (-933))) + (((~(i19 | (-1413132554))) | 1077420041) * 933)) - 1966737804);
            int i21 = (i20 << 13) ^ i20;
            int i22 = i21 ^ (i21 >>> 17);
            ((int[]) objArr2[0])[0] = i22 ^ (i22 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            Toast.makeText((Context) null, i17 / (((i17 - 1) * i17) % 2), 0).show();
            int i23 = ((int[]) objArr[0])[0];
            objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iNextInt = new Random().nextInt();
            int i24 = i23 + (((~((-1347199025) | iNextInt)) | 1228738139) * 398) + 1802287591 + (((~((~iNextInt) | (-1347199025))) | 1228738139) * 398);
            int i25 = (i24 << 13) ^ i24;
            int i26 = i25 ^ (i25 >>> 17);
            ((int[]) objArr2[0])[0] = i26 ^ (i26 << 5);
        }
        Function function = new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda142
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$surfaceVariant$33((DynamicScheme) obj);
            }
        };
        Function function2 = new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda143
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$surfaceVariant$34((DynamicScheme) obj);
            }
        };
        int i27 = ((int[]) objArr2[0])[0];
        int i28 = i27 * i27;
        int i29 = -(226584106 * i27);
        int i30 = (i28 & i29) + (i28 | i29);
        int i31 = -(i27 * (-1537146392));
        int i32 = ((i30 | i31) << 1) - (i31 ^ i30);
        int i33 = (i32 ^ 864397393) + ((864397393 & i32) << 1);
        int i34 = i33 >> 25;
        int i35 = (((i34 ^ (-255)) + ((i34 & (-255)) << 1)) / 128) + 1;
        int i36 = ((i33 | i35) << 1) - (i35 ^ i33);
        int i37 = i33 >> 24;
        int i38 = (((i37 | (-511)) << 1) - (i37 ^ (-511))) / 256;
        int i39 = -(i36 ^ (((i38 | 1) << 1) - (i38 ^ 1)));
        int i40 = (i39 ^ 9) + ((i39 & 9) << 1);
        int i41 = i40 >> 16;
        int i42 = ((((-131071) | i41) << 1) - (i41 ^ (-131071))) / 65536;
        return new DynamicColor("surface_variant", function, function2, 4284 / (((-(((i42 & 1) + (1 | i42)) + 1)) & i40) * 476), null, null, null, null);
    }

    static /* synthetic */ TonalPalette lambda$surfaceVariant$33(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 61;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        TonalPalette tonalPalette = dynamicScheme.neutralVariantPalette;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 15;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            return tonalPalette;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001e  */
    /* JADX WARN: Code duplicated, block: B:9:0x001b  */
    static /* synthetic */ Double lambda$surfaceVariant$34(DynamicScheme dynamicScheme) {
        double d;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        boolean z = dynamicScheme.isDark;
        if (i3 != 0) {
            int i4 = 50 / 0;
            if (z) {
                d = 30.0d;
            } else {
                int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 97;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
                int i6 = i5 % 2;
                d = 90.0d;
            }
        } else if (!(!z)) {
            d = 30.0d;
        } else {
            int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 97;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
            int i8 = i7 % 2;
            d = 90.0d;
        }
        return Double.valueOf(d);
    }

    public final DynamicColor onSurfaceVariant() {
        int i = 2 % 2;
        DynamicColor dynamicColor = new DynamicColor("on_surface_variant", new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda40
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$onSurfaceVariant$35((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda41
            private static final byte[] $$c = {Base64.padSymbol, -108, 49, -100};
            private static final int $$d = 37;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {49, -45, -112, 57, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54};
            private static final int $$b = 182;
            private static int TuitionPaymentFragmentbindingInflater1 = 0;
            private static int b = 1;
            private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {60072, 60045, 60060, 60056, 60040, 60047, 60055, 60053, 60063, 60058, 60050, 60043, 60088, 60049, 60083, 60117, 60054, 60052, 60048, 60075, 60073, 60062, 60051, 60041, 60034};
            private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 57188;

            /* JADX WARN: Code duplicated, block: B:10:0x0027  */
            /* JADX WARN: Code duplicated, block: B:8:0x001f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void a(int r6, byte r7, byte r8, java.lang.Object[] r9) {
                /*
                    int r7 = r7 * 3
                    int r7 = 84 - r7
                    int r6 = 93 - r6
                    int r8 = r8 * 15
                    int r0 = 53 - r8
                    byte[] r1 = com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda41.$$a
                    byte[] r0 = new byte[r0]
                    int r8 = 52 - r8
                    r2 = 0
                    if (r1 != 0) goto L17
                    r7 = r6
                    r3 = r8
                    r4 = r2
                    goto L2c
                L17:
                    r3 = r2
                L18:
                    byte r4 = (byte) r7
                    r0[r3] = r4
                    int r4 = r3 + 1
                    if (r3 != r8) goto L27
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r0, r2)
                    r9[r2] = r6
                    return
                L27:
                    r3 = r1[r6]
                    r5 = r7
                    r7 = r6
                    r6 = r5
                L2c:
                    int r6 = r6 + r3
                    int r6 = r6 + (-11)
                    int r7 = r7 + 1
                    r3 = r4
                    r5 = r7
                    r7 = r6
                    r6 = r5
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda41.a(int, byte, byte, java.lang.Object[]):void");
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) throws Throwable {
                Object[] objArr;
                int i2 = 2 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char pressedStateDuration = (char) (29944 - (ViewConfiguration.getPressedStateDuration() >> 16));
                    int iRed = 1755 - Color.red(0);
                    int i3 = 23 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    byte[] bArr = $$a;
                    Object[] objArr2 = new Object[1];
                    a((byte) 89, bArr[7], bArr[28], objArr2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(pressedStateDuration, iRed, i3, 986134021, false, (String) objArr2[0], null);
                }
                long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                Object[] objArr3 = new Object[1];
                c(new char[]{5, '\b', '\r', 3, 15, '\f', 5, 18, 19, 2, 20, 5, 4, '\t', 6, 20, 17, 11, 7, 16, '\b', 23}, (byte) (TextUtils.indexOf("", "") + 84), (Process.myPid() >> 22) + 22, objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                c(new char[]{1, 11, 6, 14, 1, 24, 5, 23, 24, 6, 7, 6, 11, 15, 13921}, (byte) (98 - (ViewConfiguration.getScrollBarSize() >> 8)), 15 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr4);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char maximumDrawingCacheSize = (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 29944);
                    int offsetAfter = 1755 - TextUtils.getOffsetAfter("", 0);
                    int iCombineMeasuredStates = 23 - View.combineMeasuredStates(0, 0);
                    byte b2 = (byte) ($$b & 125);
                    byte b3 = $$a[7];
                    Object[] objArr5 = new Object[1];
                    a(b2, b3, b3, objArr5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(maximumDrawingCacheSize, offsetAfter, iCombineMeasuredStates, 1596667560, false, (String) objArr5[0], null);
                }
                if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char scrollBarSize = (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 29944);
                        int i4 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1754;
                        int iRed2 = Color.red(0) + 23;
                        byte b4 = $$a[7];
                        byte b5 = b4;
                        Object[] objArr6 = new Object[1];
                        a(b4, b5, b5, objArr6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(scrollBarSize, i4, iRed2, 1599039318, false, (String) objArr6[0], null);
                    }
                    Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                    objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[1], (String[]) objArr7[4]};
                    int i5 = ~System.identityHashCode(this);
                    int i6 = ~(254354309 | i5);
                    int i7 = 638135493 + ((i6 | (-41751884)) * 764) + (((~(i5 | (-41751884))) | 36241665) * (-1528)) + (((-223622863) | i6) * 764) + 1678633492;
                    int i8 = (i7 << 13) ^ i7;
                    int i9 = i8 ^ (i8 >>> 17);
                    ((int[]) objArr[3])[0] = i9 ^ (i9 << 5);
                } else {
                    Object[] objArr8 = new Object[1];
                    c(new char[]{14, '\b', 4, 6, 16, 5, 5, '\b', 0, 17, 4, 20, 0, '\t', 1, 21}, (byte) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 10), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 16, objArr8);
                    Class<?> cls2 = Class.forName((String) objArr8[0]);
                    Object[] objArr9 = new Object[1];
                    c(new char[]{'\r', 5, 22, 6, '\n', 15, '\t', 20, 19, 14, 2, 24, 17, 22, 6, 23}, (byte) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 21), 15 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr9);
                    int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
                    try {
                        Object[] objArr10 = {-1017415587};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (Color.red(0) + 42049), (Process.myPid() >> 22) + 1726, 30 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), -1637387971, false, null, new Class[]{Integer.TYPE});
                        }
                        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da = MediaSessionCompat.MediaSessionImplBase.AnonymousClass1.TuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da(iIntValue, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), 1678633492);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char edgeSlop = (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 29944);
                            int touchSlop = 1755 - (ViewConfiguration.getTouchSlop() >> 8);
                            int i10 = 23 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                            byte b6 = $$a[7];
                            byte b7 = b6;
                            Object[] objArr11 = new Object[1];
                            a(b6, b7, b7, objArr11);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(edgeSlop, touchSlop, i10, 1599039318, false, (String) objArr11[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da);
                        try {
                            Object[] objArr12 = new Object[1];
                            c(new char[]{5, '\b', '\r', 3, 15, '\f', 5, 18, 19, 2, 20, 5, 4, '\t', 6, 20, 17, 11, 7, 16, '\b', 23}, (byte) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 84), 22 - TextUtils.getTrimmedLength(""), objArr12);
                            Class<?> cls3 = Class.forName((String) objArr12[0]);
                            Object[] objArr13 = new Object[1];
                            c(new char[]{1, 11, 6, 14, 1, 24, 5, 23, 24, 6, 7, 6, 11, 15, 13921}, (byte) (146 - AndroidCharacter.getMirror('0')), (-16777201) - Color.rgb(0, 0, 0), objArr13);
                            long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char c = (char) (29945 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                                int i11 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1755;
                                int gidForName = Process.getGidForName("") + 24;
                                byte b8 = (byte) ($$b & 125);
                                byte b9 = $$a[7];
                                Object[] objArr14 = new Object[1];
                                a(b8, b9, b9, objArr14);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c, i11, gidForName, 1596667560, false, (String) objArr14[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                                char c2 = (char) (29945 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                                int modifierMetaStateMask = 1754 - ((byte) KeyEvent.getModifierMetaStateMask());
                                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 23;
                                byte[] bArr2 = $$a;
                                Object[] objArr15 = new Object[1];
                                a((byte) 89, bArr2[7], bArr2[28], objArr15);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c2, modifierMetaStateMask, iMakeMeasureSpec, 986134021, false, (String) objArr15[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf2);
                            objArr = objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da;
                        } catch (Exception unused) {
                            throw new RuntimeException();
                        }
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
                if (((int[]) objArr[0])[0] != ((int[]) objArr[1])[0]) {
                    ArrayList arrayList = new ArrayList();
                    String[] strArr = (String[]) objArr[4];
                    if (strArr == null) {
                        throw null;
                    }
                    int i12 = TuitionPaymentFragmentbindingInflater1 + 107;
                    b = i12 % 128;
                    int i13 = i12 % 2;
                    for (String str : strArr) {
                        int i14 = b + 9;
                        TuitionPaymentFragmentbindingInflater1 = i14 % 128;
                        int i15 = i14 % 2;
                        arrayList.add(str);
                    }
                    throw null;
                }
                int i16 = b + 59;
                TuitionPaymentFragmentbindingInflater1 = i16 % 128;
                int i17 = i16 % 2;
                int i18 = ((int[]) objArr[3])[0];
                Object[] objArr16 = {new int[]{((int[]) objArr[0])[0]}, new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[1], (String[]) objArr[4]};
                int i19 = ~System.identityHashCode(this);
                int i20 = i18 + 821834749 + ((~((-23335369) | i19)) * 52) + (((~(513420834 | i19)) | (~(300818408 | i19)) | (-536756203)) * (-52)) + (((~(i19 | (-513420835))) | 277483040) * 52);
                int i21 = (i20 << 13) ^ i20;
                int i22 = i21 ^ (i21 >>> 17);
                ((int[]) objArr16[3])[0] = i22 ^ (i22 << 5);
                int i23 = TuitionPaymentFragmentbindingInflater1 + 107;
                b = i23 % 128;
                int i24 = i23 % 2;
                return MaterialDynamicColors.lambda$onSurfaceVariant$36((DynamicScheme) obj);
            }

            private static void c(char[] cArr, byte b2, int i2, Object[] objArr) throws Throwable {
                int i3;
                Object obj;
                int i4 = 2;
                int i5 = 2 % 2;
                deInitSession deinitsession = new deInitSession();
                char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                char c = '0';
                int i6 = 1770390596;
                Object obj2 = null;
                int i7 = -1;
                if (cArr2 != null) {
                    int length = cArr2.length;
                    char[] cArr3 = new char[length];
                    int i8 = 0;
                    while (i8 < length) {
                        int i9 = $11 + 119;
                        $10 = i9 % 128;
                        if (i9 % i4 != 0) {
                            try {
                                Object[] objArr2 = {Integer.valueOf(cArr2[i8])};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i6);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                                    int iMyPid = 2267 - (Process.myPid() >> 22);
                                    int iIndexOf = TextUtils.indexOf("", c) + 34;
                                    byte b3 = (byte) i7;
                                    byte b4 = (byte) (b3 + 4);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cCombineMeasuredStates, iMyPid, iIndexOf, -1927765101, false, $$e(b3, b4, (byte) (b4 - 3)), new Class[]{Integer.TYPE});
                                }
                                cArr3[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        } else {
                            try {
                                Object[] objArr3 = {Integer.valueOf(cArr2[i8])};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    byte b5 = (byte) (-1);
                                    byte b6 = (byte) (b5 + 4);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) TextUtils.indexOf("", "", 0, 0), 2267 - Gravity.getAbsoluteGravity(0, 0), TextUtils.indexOf("", "") + 33, -1927765101, false, $$e(b5, b6, (byte) (b6 - 3)), new Class[]{Integer.TYPE});
                                }
                                cArr3[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                                i8++;
                            } catch (Throwable th2) {
                                Throwable cause2 = th2.getCause();
                                if (cause2 == null) {
                                    throw th2;
                                }
                                throw cause2;
                            }
                        }
                        i4 = 2;
                        c = '0';
                        i6 = 1770390596;
                        i7 = -1;
                    }
                    cArr2 = cArr3;
                }
                Object[] objArr4 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b7 = (byte) (-1);
                    byte b8 = (byte) (b7 + 4);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((-1) - TextUtils.lastIndexOf("", '0')), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2267, 33 - (Process.myPid() >> 22), -1927765101, false, $$e(b7, b8, (byte) (b8 - 3)), new Class[]{Integer.TYPE});
                }
                char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                char[] cArr4 = new char[i2];
                if (i2 % 2 != 0) {
                    i3 = i2 - 1;
                    cArr4[i3] = (char) (cArr[i3] - b2);
                } else {
                    i3 = i2;
                }
                if (i3 > 1) {
                    char c2 = 11;
                    int i10 = $10 + 11;
                    $11 = i10 % 128;
                    if (i10 % 2 == 0) {
                        deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                    } else {
                        deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                    }
                    while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i3) {
                        deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                        deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                        if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                            obj = obj2;
                        } else {
                            Object[] objArr5 = new Object[13];
                            objArr5[12] = deinitsession;
                            objArr5[c2] = Integer.valueOf(cCharValue);
                            objArr5[10] = deinitsession;
                            objArr5[9] = deinitsession;
                            objArr5[8] = Integer.valueOf(cCharValue);
                            objArr5[7] = deinitsession;
                            objArr5[6] = deinitsession;
                            objArr5[5] = Integer.valueOf(cCharValue);
                            objArr5[4] = deinitsession;
                            objArr5[3] = deinitsession;
                            objArr5[2] = Integer.valueOf(cCharValue);
                            objArr5[1] = deinitsession;
                            objArr5[0] = deinitsession;
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                byte b9 = (byte) (-1);
                                byte b10 = (byte) (b9 + 3);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TextUtils.indexOf("", "", 0) + 49267), (ViewConfiguration.getEdgeSlop() >> 16) + 3261, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 30, -127612708, false, $$e(b9, b10, (byte) (b10 - 2)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                            }
                            if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue() == deinitsession.asBinder) {
                                Object[] objArr6 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                    char tapTimeout = (char) ((ViewConfiguration.getTapTimeout() >> 16) + 22878);
                                    int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 595;
                                    int offsetBefore = TextUtils.getOffsetBefore("", 0) + 17;
                                    byte b11 = (byte) (-1);
                                    byte b12 = (byte) (b11 + 1);
                                    String str$$e = $$e(b11, b12, b12);
                                    c2 = 11;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(tapTimeout, iLastIndexOf, offsetBefore, 1570859318, false, str$$e, new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                } else {
                                    c2 = 11;
                                }
                                obj = null;
                                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).intValue();
                                int i11 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i11];
                            } else {
                                c2 = 11;
                                obj = null;
                                if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                    deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                    deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                    int i12 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                    int i13 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i12];
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i13];
                                } else {
                                    int i14 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                    int i15 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i14];
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i15];
                                }
                            }
                        }
                        deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                        obj2 = obj;
                    }
                }
                int i16 = $11 + 117;
                $10 = i16 % 128;
                int i17 = i16 % 2;
                for (int i18 = 0; i18 < i2; i18++) {
                    cArr4[i18] = (char) (cArr4[i18] ^ 13722);
                }
                objArr[0] = new String(cArr4);
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0022  */
            /* JADX WARN: Code duplicated, block: B:8:0x001c  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0027). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$e(int r7, short r8, byte r9) {
                /*
                    int r8 = 116 - r8
                    int r7 = r7 + 4
                    byte[] r0 = com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda41.$$c
                    int r9 = r9 * 2
                    int r9 = r9 + 1
                    byte[] r1 = new byte[r9]
                    r2 = 0
                    if (r0 != 0) goto L12
                    r3 = r9
                    r4 = r2
                    goto L27
                L12:
                    r3 = r2
                L13:
                    int r7 = r7 + 1
                    int r4 = r3 + 1
                    byte r5 = (byte) r8
                    r1[r3] = r5
                    if (r4 != r9) goto L22
                    java.lang.String r7 = new java.lang.String
                    r7.<init>(r1, r2)
                    return r7
                L22:
                    r3 = r0[r7]
                    r6 = r3
                    r3 = r8
                    r8 = r6
                L27:
                    int r8 = -r8
                    int r8 = r8 + r3
                    r3 = r4
                    goto L13
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda41.$$e(int, short, byte):java.lang.String");
            }
        }, false, new MaterialDynamicColors$$ExternalSyntheticLambda162(this), null, new ContrastCurve(3.0d, 4.5d, 7.0d, 11.0d), null);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 5;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        return dynamicColor;
    }

    static /* synthetic */ TonalPalette lambda$onSurfaceVariant$35(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 59;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        TonalPalette tonalPalette = dynamicScheme.neutralVariantPalette;
        if (i3 != 0) {
            int i4 = 57 / 0;
        }
        return tonalPalette;
    }

    static /* synthetic */ Double lambda$onSurfaceVariant$36(DynamicScheme dynamicScheme) {
        double d;
        int i = 2 % 2;
        if (dynamicScheme.isDark) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 45;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            d = 80.0d;
        } else {
            d = 30.0d;
        }
        Double dValueOf = Double.valueOf(d);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 113;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return dValueOf;
    }

    public final DynamicColor inverseSurface() {
        int i = 2 % 2;
        DynamicColor dynamicColor = new DynamicColor("inverse_surface", new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda42
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$inverseSurface$37((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda43
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$inverseSurface$38((DynamicScheme) obj);
            }
        }, false, null, null, null, null);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 65;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            return dynamicColor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ TonalPalette lambda$inverseSurface$37(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 85;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        TonalPalette tonalPalette = dynamicScheme.neutralPalette;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 9;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return tonalPalette;
    }

    static /* synthetic */ Double lambda$inverseSurface$38(DynamicScheme dynamicScheme) {
        double d;
        int i = 2 % 2;
        if (dynamicScheme.isDark) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i3 = i2 + 75;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 33;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 5 % 2;
            }
            d = 90.0d;
        } else {
            d = 20.0d;
        }
        return Double.valueOf(d);
    }

    public final DynamicColor inverseOnSurface() {
        int i = 2 % 2;
        DynamicColor dynamicColor = new DynamicColor("inverse_on_surface", new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda18
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$inverseOnSurface$39((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda19
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$inverseOnSurface$40((DynamicScheme) obj);
            }
        }, false, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda20
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f$0.m7828xcbcaf83d((DynamicScheme) obj);
            }
        }, null, new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 61;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 89 / 0;
        }
        return dynamicColor;
    }

    static /* synthetic */ TonalPalette lambda$inverseOnSurface$39(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        TonalPalette tonalPalette = dynamicScheme.neutralPalette;
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 15;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            return tonalPalette;
        }
        throw null;
    }

    static /* synthetic */ Double lambda$inverseOnSurface$40(DynamicScheme dynamicScheme) {
        double d;
        int i = 2 % 2;
        if (dynamicScheme.isDark) {
            d = 20.0d;
        } else {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 97;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            int i3 = i2 % 2;
            d = 95.0d;
        }
        Double dValueOf = Double.valueOf(d);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 23;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return dValueOf;
    }

    /* JADX INFO: renamed from: lambda$inverseOnSurface$41$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    final /* synthetic */ DynamicColor m7828xcbcaf83d(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 47;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            return inverseSurface();
        }
        inverseSurface();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final DynamicColor outline() {
        int i = 2 % 2;
        DynamicColor dynamicColor = new DynamicColor("outline", new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda9
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$outline$42((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda10
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$outline$43((DynamicScheme) obj);
            }
        }, false, new MaterialDynamicColors$$ExternalSyntheticLambda162(this), null, new ContrastCurve(1.5d, 3.0d, 4.5d, 7.0d), null);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        return dynamicColor;
    }

    static /* synthetic */ TonalPalette lambda$outline$42(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 37;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        TonalPalette tonalPalette = dynamicScheme.neutralVariantPalette;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 113;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return tonalPalette;
    }

    static /* synthetic */ Double lambda$outline$43(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 51;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        Double dValueOf = Double.valueOf(dynamicScheme.isDark ? 60.0d : 50.0d);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return dValueOf;
    }

    public final DynamicColor outlineVariant() {
        int i = 2 % 2;
        DynamicColor dynamicColor = new DynamicColor("outline_variant", new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda108
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$outlineVariant$44((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda109
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$outlineVariant$45((DynamicScheme) obj);
            }
        }, false, new MaterialDynamicColors$$ExternalSyntheticLambda162(this), null, new ContrastCurve(1.0d, 1.0d, 3.0d, 7.0d), null);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 55;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            return dynamicColor;
        }
        throw null;
    }

    static /* synthetic */ TonalPalette lambda$outlineVariant$44(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 113;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        TonalPalette tonalPalette = dynamicScheme.neutralVariantPalette;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 47;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 52 / 0;
        }
        return tonalPalette;
    }

    static /* synthetic */ Double lambda$outlineVariant$45(DynamicScheme dynamicScheme) {
        double d;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        if (!dynamicScheme.isDark) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 103;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            int i5 = i4 % 2;
            d = 80.0d;
        } else {
            d = 30.0d;
        }
        Double dValueOf = Double.valueOf(d);
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
        if (i6 % 2 == 0) {
            return dValueOf;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final DynamicColor shadow() {
        int i = 2 % 2;
        DynamicColor dynamicColor = new DynamicColor("shadow", new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda148
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$shadow$46((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda149
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$shadow$47((DynamicScheme) obj);
            }
        }, false, null, null, null, null);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        return dynamicColor;
    }

    static /* synthetic */ TonalPalette lambda$shadow$46(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 21;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        TonalPalette tonalPalette = dynamicScheme.neutralPalette;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 51;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            return tonalPalette;
        }
        throw null;
    }

    static /* synthetic */ Double lambda$shadow$47(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        Double dValueOf = Double.valueOf(0.0d);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return dValueOf;
    }

    public final DynamicColor scrim() {
        int i = 2 % 2;
        DynamicColor dynamicColor = new DynamicColor("scrim", new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda60
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$scrim$48((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda61
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$scrim$49((DynamicScheme) obj);
            }
        }, false, null, null, null, null);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 65;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 16 / 0;
        }
        return dynamicColor;
    }

    static /* synthetic */ TonalPalette lambda$scrim$48(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        TonalPalette tonalPalette = dynamicScheme.neutralPalette;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 63;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return tonalPalette;
    }

    static /* synthetic */ Double lambda$scrim$49(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 87;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Double dValueOf = Double.valueOf(0.0d);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return dValueOf;
    }

    public final DynamicColor surfaceTint() {
        int i = 2 % 2;
        DynamicColor dynamicColor = new DynamicColor("surface_tint", new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda12
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$surfaceTint$50((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda13
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$surfaceTint$51((DynamicScheme) obj);
            }
        }, true, null, null, null, null);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            return dynamicColor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ TonalPalette lambda$surfaceTint$50(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 63;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        TonalPalette tonalPalette = dynamicScheme.primaryPalette;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 85;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            return tonalPalette;
        }
        throw null;
    }

    static /* synthetic */ Double lambda$surfaceTint$51(DynamicScheme dynamicScheme) {
        double d;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        if (dynamicScheme.isDark) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int i5 = i4 + 65;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 93;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
            int i8 = i7 % 2;
            d = 80.0d;
        } else {
            d = 40.0d;
        }
        return Double.valueOf(d);
    }

    public final DynamicColor primary() {
        int i = 2 % 2;
        DynamicColor dynamicColor = new DynamicColor("primary", new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda57
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$primary$52((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda58
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$primary$53((DynamicScheme) obj);
            }
        }, true, new MaterialDynamicColors$$ExternalSyntheticLambda162(this), null, new ContrastCurve(3.0d, 4.5d, 7.0d, 11.0d), new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda59
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f$0.m7854x39203b5((DynamicScheme) obj);
            }
        });
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 105;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        return dynamicColor;
    }

    static /* synthetic */ TonalPalette lambda$primary$52(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 47;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        TonalPalette tonalPalette = dynamicScheme.primaryPalette;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return tonalPalette;
    }

    static /* synthetic */ Double lambda$primary$53(DynamicScheme dynamicScheme) {
        double d;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 5;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        if (isMonochrome(dynamicScheme)) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 85;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            int i5 = i4 % 2;
            return Double.valueOf(dynamicScheme.isDark ? 100.0d : 0.0d);
        }
        if (!dynamicScheme.isDark) {
            d = 40.0d;
        } else {
            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 81;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
            int i7 = i6 % 2;
            d = 80.0d;
        }
        return Double.valueOf(d);
    }

    /* JADX INFO: renamed from: lambda$primary$54$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    final /* synthetic */ ToneDeltaPair m7854x39203b5(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        ToneDeltaPair toneDeltaPair = new ToneDeltaPair(primaryContainer(), primary(), 15.0d, TonePolarity.NEARER, false);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 17;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            return toneDeltaPair;
        }
        throw null;
    }

    public final DynamicColor onPrimary() {
        int i = 2 % 2;
        DynamicColor dynamicColor = new DynamicColor("on_primary", new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda112
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$onPrimary$55((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda113
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$onPrimary$56((DynamicScheme) obj);
            }
        }, false, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda114
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f$0.m7833x16f20f37((DynamicScheme) obj);
            }
        }, null, new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 113;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 64 / 0;
        }
        return dynamicColor;
    }

    static /* synthetic */ TonalPalette lambda$onPrimary$55(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        TonalPalette tonalPalette = dynamicScheme.primaryPalette;
        if (i3 != 0) {
            return tonalPalette;
        }
        throw null;
    }

    static /* synthetic */ Double lambda$onPrimary$56(DynamicScheme dynamicScheme) {
        double d;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 57;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        if (isMonochrome(dynamicScheme)) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 47;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            if (i4 % 2 == 0) {
                return Double.valueOf(!dynamicScheme.isDark ? 90.0d : 10.0d);
            }
            boolean z = dynamicScheme.isDark;
            throw null;
        }
        if (dynamicScheme.isDark) {
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 101;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            d = 20.0d;
            if (i5 % 2 == 0) {
                int i6 = 71 / 0;
            }
        } else {
            d = 100.0d;
        }
        return Double.valueOf(d);
    }

    /* JADX INFO: renamed from: lambda$onPrimary$57$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    final /* synthetic */ DynamicColor m7833x16f20f37(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        DynamicColor dynamicColorPrimary = primary();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 115;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            return dynamicColorPrimary;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final DynamicColor primaryContainer() {
        int i = 2 % 2;
        DynamicColor dynamicColor = new DynamicColor("primary_container", new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda97
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$primaryContainer$58((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda98
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$primaryContainer$59((DynamicScheme) obj);
            }
        }, true, new MaterialDynamicColors$$ExternalSyntheticLambda162(this), null, new ContrastCurve(1.0d, 1.0d, 3.0d, 7.0d), new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda99
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f$0.m7855x8277b1b9((DynamicScheme) obj);
            }
        });
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 115;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            return dynamicColor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ TonalPalette lambda$primaryContainer$58(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 25;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        TonalPalette tonalPalette = dynamicScheme.primaryPalette;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 5;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            return tonalPalette;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ Double lambda$primaryContainer$59(DynamicScheme dynamicScheme) {
        double d;
        int i = 2 % 2;
        if (isFidelity(dynamicScheme)) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 113;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            int i3 = i2 % 2;
            Double dValueOf = Double.valueOf(performAlbers(dynamicScheme.sourceColorHct, dynamicScheme));
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 25;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 64 / 0;
            }
            return dValueOf;
        }
        if (isMonochrome(dynamicScheme)) {
            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 35;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
            int i7 = i6 % 2;
            return Double.valueOf(dynamicScheme.isDark ? 85.0d : 25.0d);
        }
        if (!dynamicScheme.isDark) {
            d = 90.0d;
        } else {
            int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 73;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i8 % 128;
            if (i8 % 2 == 0) {
                throw null;
            }
            d = 30.0d;
        }
        return Double.valueOf(d);
    }

    /* JADX INFO: renamed from: lambda$primaryContainer$60$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    final /* synthetic */ ToneDeltaPair m7855x8277b1b9(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        ToneDeltaPair toneDeltaPair = new ToneDeltaPair(primaryContainer(), primary(), 15.0d, TonePolarity.NEARER, false);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 79;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 32 / 0;
        }
        return toneDeltaPair;
    }

    public final DynamicColor onPrimaryContainer() {
        int i = 2 % 2;
        DynamicColor dynamicColor = new DynamicColor("on_primary_container", new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda135
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$onPrimaryContainer$61((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda136
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f$0.m7834x617ce7dc((DynamicScheme) obj);
            }
        }, false, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda137
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f$0.m7835x3d3e639d((DynamicScheme) obj);
            }
        }, null, new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 65;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        return dynamicColor;
    }

    static /* synthetic */ TonalPalette lambda$onPrimaryContainer$61(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 59;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        TonalPalette tonalPalette = dynamicScheme.primaryPalette;
        if (i3 == 0) {
            return tonalPalette;
        }
        throw null;
    }

    /* JADX INFO: renamed from: lambda$onPrimaryContainer$62$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    final /* synthetic */ Double m7834x617ce7dc(DynamicScheme dynamicScheme) {
        double d;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 9;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            isFidelity(dynamicScheme);
            throw null;
        }
        if (isFidelity(dynamicScheme)) {
            return Double.valueOf(DynamicColor.foregroundTone(primaryContainer().tone.apply(dynamicScheme).doubleValue(), 4.5d));
        }
        if (!isMonochrome(dynamicScheme)) {
            return Double.valueOf(dynamicScheme.isDark ? 90.0d : 10.0d);
        }
        if (dynamicScheme.isDark) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 61;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
            int i4 = i3 % 2;
            d = 0.0d;
        } else {
            d = 100.0d;
        }
        return Double.valueOf(d);
    }

    /* JADX INFO: renamed from: lambda$onPrimaryContainer$63$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    final /* synthetic */ DynamicColor m7835x3d3e639d(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        DynamicColor dynamicColorPrimaryContainer = primaryContainer();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return dynamicColorPrimaryContainer;
    }

    public final DynamicColor inversePrimary() {
        int i = 2 % 2;
        DynamicColor dynamicColor = new DynamicColor("inverse_primary", new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda115
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$inversePrimary$64((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda116
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$inversePrimary$65((DynamicScheme) obj);
            }
        }, false, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda117
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f$0.m7829x6f94cccc((DynamicScheme) obj);
            }
        }, null, new ContrastCurve(3.0d, 4.5d, 7.0d, 11.0d), null);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 63;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        return dynamicColor;
    }

    static /* synthetic */ TonalPalette lambda$inversePrimary$64(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 15;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        TonalPalette tonalPalette = dynamicScheme.primaryPalette;
        if (i3 != 0) {
            return tonalPalette;
        }
        throw null;
    }

    static /* synthetic */ Double lambda$inversePrimary$65(DynamicScheme dynamicScheme) {
        double d;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        boolean z = dynamicScheme.isDark;
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (z) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 99;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            int i5 = i4 % 2;
            d = 40.0d;
        } else {
            d = 80.0d;
        }
        return Double.valueOf(d);
    }

    /* JADX INFO: renamed from: lambda$inversePrimary$66$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    final /* synthetic */ DynamicColor m7829x6f94cccc(DynamicScheme dynamicScheme) {
        DynamicColor dynamicColorInverseSurface;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            dynamicColorInverseSurface = inverseSurface();
            int i3 = 52 / 0;
        } else {
            dynamicColorInverseSurface = inverseSurface();
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 113;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            return dynamicColorInverseSurface;
        }
        throw null;
    }

    public final DynamicColor secondary() {
        int i = 2 % 2;
        DynamicColor dynamicColor = new DynamicColor("secondary", new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$secondary$67((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda5
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$secondary$68((DynamicScheme) obj);
            }
        }, true, new MaterialDynamicColors$$ExternalSyntheticLambda162(this), null, new ContrastCurve(3.0d, 4.5d, 7.0d, 11.0d), new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda6
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f$0.m7858x991d7367((DynamicScheme) obj);
            }
        });
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 67;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            return dynamicColor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ TonalPalette lambda$secondary$67(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 25;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        TonalPalette tonalPalette = dynamicScheme.secondaryPalette;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 71 / 0;
        }
        return tonalPalette;
    }

    static /* synthetic */ Double lambda$secondary$68(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 17;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        boolean z = dynamicScheme.isDark;
        if (i3 == 0) {
            throw null;
        }
        Double dValueOf = Double.valueOf(z ? 80.0d : 40.0d);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 59;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            return dValueOf;
        }
        throw null;
    }

    /* JADX INFO: renamed from: lambda$secondary$69$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    final /* synthetic */ ToneDeltaPair m7858x991d7367(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        ToneDeltaPair toneDeltaPair = new ToneDeltaPair(secondaryContainer(), secondary(), 15.0d, TonePolarity.NEARER, false);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 93;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        return toneDeltaPair;
    }

    public final DynamicColor onSecondary() {
        int i = 2 % 2;
        DynamicColor dynamicColor = new DynamicColor("on_secondary", new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$onSecondary$70((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$onSecondary$71((DynamicScheme) obj);
            }
        }, false, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f$0.m7840x1ad791fe((DynamicScheme) obj);
            }
        }, null, new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 41;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            return dynamicColor;
        }
        throw null;
    }

    static /* synthetic */ TonalPalette lambda$onSecondary$70(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 95;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        TonalPalette tonalPalette = dynamicScheme.secondaryPalette;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            return tonalPalette;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ Double lambda$onSecondary$71(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        double d = 100.0d;
        if (isMonochrome(dynamicScheme)) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 97;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            if (i2 % 2 == 0) {
                return Double.valueOf(dynamicScheme.isDark ? 10.0d : 100.0d);
            }
            boolean z = dynamicScheme.isDark;
            throw null;
        }
        if (dynamicScheme.isDark) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 81;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
            int i4 = i3 % 2;
            d = 20.0d;
        }
        return Double.valueOf(d);
    }

    /* JADX INFO: renamed from: lambda$onSecondary$72$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    final /* synthetic */ DynamicColor m7840x1ad791fe(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        DynamicColor dynamicColorSecondary = secondary();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return dynamicColorSecondary;
    }

    public final DynamicColor secondaryContainer() {
        int i = 2 % 2;
        DynamicColor dynamicColor = new DynamicColor("secondary_container", new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda83
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$secondaryContainer$73((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda84
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$secondaryContainer$74((DynamicScheme) obj);
            }
        }, true, new MaterialDynamicColors$$ExternalSyntheticLambda162(this), null, new ContrastCurve(1.0d, 1.0d, 3.0d, 7.0d), new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda86
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f$0.m7859x485cd00f((DynamicScheme) obj);
            }
        });
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            return dynamicColor;
        }
        throw null;
    }

    static /* synthetic */ TonalPalette lambda$secondaryContainer$73(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        TonalPalette tonalPalette = dynamicScheme.secondaryPalette;
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return tonalPalette;
    }

    static /* synthetic */ Double lambda$secondaryContainer$74(DynamicScheme dynamicScheme) {
        double d;
        int i = 2 % 2;
        if (dynamicScheme.isDark) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 67;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 39 / 0;
            }
            d = 30.0d;
        } else {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 45;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            int i5 = i4 % 2;
            d = 90.0d;
        }
        if (isMonochrome(dynamicScheme)) {
            return Double.valueOf(dynamicScheme.isDark ^ true ? 85.0d : 30.0d);
        }
        if (isFidelity(dynamicScheme)) {
            return Double.valueOf(performAlbers(dynamicScheme.secondaryPalette.getHct(findDesiredChromaByTone(dynamicScheme.secondaryPalette.getHue(), dynamicScheme.secondaryPalette.getChroma(), d, !dynamicScheme.isDark)), dynamicScheme));
        }
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 89;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
        if (i6 % 2 == 0) {
            return Double.valueOf(d);
        }
        Double.valueOf(d);
        throw null;
    }

    /* JADX INFO: renamed from: lambda$secondaryContainer$75$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    final /* synthetic */ ToneDeltaPair m7859x485cd00f(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        ToneDeltaPair toneDeltaPair = new ToneDeltaPair(secondaryContainer(), secondary(), 15.0d, TonePolarity.NEARER, false);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        return toneDeltaPair;
    }

    public final DynamicColor onSecondaryContainer() {
        int i = 2 % 2;
        DynamicColor dynamicColor = new DynamicColor("on_secondary_container", new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda25
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$onSecondaryContainer$76((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda26
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f$0.m7841x4fcce1f2((DynamicScheme) obj);
            }
        }, false, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda27
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f$0.m7842x2b8e5db3((DynamicScheme) obj);
            }
        }, null, new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 121;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        return dynamicColor;
    }

    static /* synthetic */ TonalPalette lambda$onSecondaryContainer$76(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 93;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        TonalPalette tonalPalette = dynamicScheme.secondaryPalette;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 85;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            return tonalPalette;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: lambda$onSecondaryContainer$77$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    final /* synthetic */ Double m7841x4fcce1f2(DynamicScheme dynamicScheme) {
        double d;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 75;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            isFidelity(dynamicScheme);
            obj.hashCode();
            throw null;
        }
        if (isFidelity(dynamicScheme)) {
            return Double.valueOf(DynamicColor.foregroundTone(secondaryContainer().tone.apply(dynamicScheme).doubleValue(), 4.5d));
        }
        if (dynamicScheme.isDark) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 125;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            d = 90.0d;
        } else {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 27;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 4;
            }
            d = 10.0d;
        }
        return Double.valueOf(d);
    }

    /* JADX INFO: renamed from: lambda$onSecondaryContainer$78$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    final /* synthetic */ DynamicColor m7842x2b8e5db3(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        DynamicColor dynamicColorSecondaryContainer = secondaryContainer();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 87;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 9 / 0;
        }
        return dynamicColorSecondaryContainer;
    }

    public final DynamicColor tertiary() {
        int i = 2 % 2;
        DynamicColor dynamicColor = new DynamicColor("tertiary", new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda67
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$tertiary$79((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda68
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$tertiary$80((DynamicScheme) obj);
            }
        }, true, new MaterialDynamicColors$$ExternalSyntheticLambda162(this), null, new ContrastCurve(3.0d, 4.5d, 7.0d, 11.0d), new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda69
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f$0.m7862x1f6aa165((DynamicScheme) obj);
            }
        });
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 23;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        return dynamicColor;
    }

    static /* synthetic */ TonalPalette lambda$tertiary$79(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 43;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        TonalPalette tonalPalette = dynamicScheme.tertiaryPalette;
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return tonalPalette;
    }

    static /* synthetic */ Double lambda$tertiary$80(DynamicScheme dynamicScheme) {
        double d;
        int i = 2 % 2;
        if (!isMonochrome(dynamicScheme)) {
            return Double.valueOf(dynamicScheme.isDark ? 80.0d : 40.0d);
        }
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        if (dynamicScheme.isDark) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 13;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            if (i4 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            d = 90.0d;
        } else {
            d = 25.0d;
        }
        return Double.valueOf(d);
    }

    /* JADX INFO: renamed from: lambda$tertiary$81$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    final /* synthetic */ ToneDeltaPair m7862x1f6aa165(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        ToneDeltaPair toneDeltaPair = new ToneDeltaPair(tertiaryContainer(), tertiary(), 15.0d, TonePolarity.NEARER, false);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            return toneDeltaPair;
        }
        throw null;
    }

    public final DynamicColor onTertiary() {
        int i = 2 % 2;
        DynamicColor dynamicColor = new DynamicColor("on_tertiary", new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda107
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$onTertiary$82((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda118
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$onTertiary$83((DynamicScheme) obj);
            }
        }, false, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda129
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f$0.m7847x36068449((DynamicScheme) obj);
            }
        }, null, new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 23;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            return dynamicColor;
        }
        throw null;
    }

    static /* synthetic */ TonalPalette lambda$onTertiary$82(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 123;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        TonalPalette tonalPalette = dynamicScheme.tertiaryPalette;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            return tonalPalette;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ Double lambda$onTertiary$83(DynamicScheme dynamicScheme) {
        double d;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 85;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        if (isMonochrome(dynamicScheme)) {
            return Double.valueOf(dynamicScheme.isDark ? 10.0d : 90.0d);
        }
        if (dynamicScheme.isDark) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 81;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            d = 20.0d;
        } else {
            d = 100.0d;
        }
        return Double.valueOf(d);
    }

    /* JADX INFO: renamed from: lambda$onTertiary$84$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    final /* synthetic */ DynamicColor m7847x36068449(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 79;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        DynamicColor dynamicColorTertiary = tertiary();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 5;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 70 / 0;
        }
        return dynamicColorTertiary;
    }

    public final DynamicColor tertiaryContainer() {
        int i = 2 % 2;
        DynamicColor dynamicColor = new DynamicColor("tertiary_container", new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda159
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$tertiaryContainer$85((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda160
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$tertiaryContainer$86((DynamicScheme) obj);
            }
        }, true, new MaterialDynamicColors$$ExternalSyntheticLambda162(this), null, new ContrastCurve(1.0d, 1.0d, 3.0d, 7.0d), new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda161
            private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            private static final byte[] $$c = {111, 40, 23, -13};
            private static final int $$d = 156;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {94, 6, -99, -107};
            private static final int $$b = 136;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            private static int TuitionPaymentFragmentbindingInflater1 = 1;

            /* JADX WARN: Code duplicated, block: B:10:0x0024  */
            /* JADX WARN: Code duplicated, block: B:8:0x001c  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void b(short r5, short r6, byte r7, java.lang.Object[] r8) {
                /*
                    byte[] r0 = com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda161.$$a
                    int r5 = r5 * 3
                    int r5 = 4 - r5
                    int r6 = r6 + 97
                    int r7 = r7 * 2
                    int r7 = r7 + 1
                    byte[] r1 = new byte[r7]
                    r2 = 0
                    if (r0 != 0) goto L14
                    r4 = r7
                    r3 = r2
                    goto L26
                L14:
                    r3 = r2
                L15:
                    byte r4 = (byte) r6
                    r1[r3] = r4
                    int r3 = r3 + 1
                    if (r3 != r7) goto L24
                    java.lang.String r5 = new java.lang.String
                    r5.<init>(r1, r2)
                    r8[r2] = r5
                    return
                L24:
                    r4 = r0[r5]
                L26:
                    int r4 = -r4
                    int r6 = r6 + r4
                    int r5 = r5 + 1
                    goto L15
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda161.b(short, short, byte, java.lang.Object[]):void");
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                int i2 = 2 % 2;
                int i3 = TuitionPaymentFragmentbindingInflater1 + 53;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
                int i4 = i3 % 2;
                ToneDeltaPair toneDeltaPairM7863x357de1a8 = this.f$0.m7863x357de1a8((DynamicScheme) obj);
                int i5 = TuitionPaymentFragmentbindingInflater1 + 33;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
                int i6 = i5 % 2;
                return toneDeltaPairM7863x357de1a8;
            }

            private static void a(int i2, int i3, char c, Object[] objArr) throws Throwable {
                int i4 = 2 % 2;
                lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
                long[] jArr = new long[i3];
                lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i3) {
                    int i5 = $11 + 21;
                    $10 = i5 % 128;
                    int i6 = i5 % 2;
                    int i7 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    try {
                        Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3[i2 + i7])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b = (byte) 0;
                            byte b2 = (byte) (b - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) View.MeasureSpec.getMode(0), 2187 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 40, 841711447, false, $$e(b, b2, (byte) (b2 + 3)), new Class[]{Integer.TYPE});
                        }
                        Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i7), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2), Integer.valueOf(c)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = (byte) (b3 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (View.MeasureSpec.getMode(0) + 33017), 3012 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 25 - Process.getGidForName(""), 321985076, false, $$e(b3, b4, (byte) (b4 + 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i7] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                        Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b5 = (byte) 0;
                            byte b6 = (byte) (b5 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 36505), 3376 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 17 - TextUtils.indexOf("", "", 0, 0), -968507904, false, $$e(b5, b6, (byte) (-b6)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                char[] cArr = new char[i3];
                lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                int i8 = $11 + 115;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i3) {
                    int i10 = $11 + 41;
                    $10 = i10 % 128;
                    if (i10 % 2 != 0) {
                        cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                        Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b7 = (byte) 0;
                            byte b8 = (byte) (b7 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 36505), View.resolveSizeAndState(0, 0, 0) + 3376, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 17, -968507904, false, $$e(b7, b8, (byte) (-b8)), new Class[]{Object.class, Object.class});
                        }
                        Object obj = null;
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                        obj.hashCode();
                        throw null;
                    }
                    cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                    Object[] objArr6 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        byte b9 = (byte) 0;
                        byte b10 = (byte) (b9 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (36505 - View.getDefaultSize(0, 0)), (ViewConfiguration.getPressedStateDuration() >> 16) + 3376, 16 - Process.getGidForName(""), -968507904, false, $$e(b9, b10, (byte) (-b10)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
                }
                objArr[0] = new String(cArr);
            }

            /* JADX WARN: Code duplicated, block: B:127:0x0a54  */
            /* JADX WARN: Code duplicated, block: B:130:0x0a63 A[Catch: all -> 0x022a, TryCatch #4 {all -> 0x022a, blocks: (B:6:0x0124, B:8:0x0131, B:9:0x016c, B:21:0x02be, B:23:0x02cb, B:24:0x0309, B:33:0x043d, B:35:0x044a, B:36:0x0482, B:67:0x0734, B:69:0x073a, B:70:0x077d, B:128:0x0a56, B:130:0x0a63, B:131:0x0aa2, B:138:0x0bd4, B:140:0x0be1, B:141:0x0c25, B:203:0x0de3, B:205:0x0df0, B:206:0x0e2f, B:218:0x0fd5, B:220:0x0fe2, B:221:0x1026, B:229:0x10bc, B:231:0x10c9, B:232:0x110e, B:251:0x139b, B:253:0x13a8, B:254:0x13e9, B:266:0x154a, B:268:0x1557, B:269:0x1599, B:276:0x167c, B:278:0x1682, B:279:0x16be, B:282:0x175c, B:284:0x176e, B:285:0x17ad, B:294:0x18a3, B:296:0x18b0, B:297:0x18f2, B:299:0x18fb, B:301:0x1913, B:302:0x195c, B:339:0x27cd, B:341:0x27da, B:342:0x2818, B:358:0x2da1, B:360:0x2dae, B:361:0x2dee, B:368:0x2f18, B:370:0x2f25, B:371:0x2f64, B:389:0x330b, B:391:0x3318, B:393:0x3375, B:452:0x35c5, B:454:0x35d2, B:455:0x3604, B:345:0x2823, B:347:0x283b, B:348:0x287d, B:310:0x25f6, B:312:0x2603, B:314:0x2651, B:237:0x11f7, B:239:0x1204, B:240:0x1245, B:48:0x0633, B:50:0x063d, B:51:0x067f, B:57:0x06c0, B:59:0x06ca, B:60:0x0709, B:39:0x0500, B:41:0x050d, B:42:0x0542), top: B:485:0x0124 }] */
            /* JADX WARN: Code duplicated, block: B:135:0x0b41 A[LOOP:2: B:125:0x0a51->B:135:0x0b41, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:140:0x0be1 A[Catch: all -> 0x022a, TryCatch #4 {all -> 0x022a, blocks: (B:6:0x0124, B:8:0x0131, B:9:0x016c, B:21:0x02be, B:23:0x02cb, B:24:0x0309, B:33:0x043d, B:35:0x044a, B:36:0x0482, B:67:0x0734, B:69:0x073a, B:70:0x077d, B:128:0x0a56, B:130:0x0a63, B:131:0x0aa2, B:138:0x0bd4, B:140:0x0be1, B:141:0x0c25, B:203:0x0de3, B:205:0x0df0, B:206:0x0e2f, B:218:0x0fd5, B:220:0x0fe2, B:221:0x1026, B:229:0x10bc, B:231:0x10c9, B:232:0x110e, B:251:0x139b, B:253:0x13a8, B:254:0x13e9, B:266:0x154a, B:268:0x1557, B:269:0x1599, B:276:0x167c, B:278:0x1682, B:279:0x16be, B:282:0x175c, B:284:0x176e, B:285:0x17ad, B:294:0x18a3, B:296:0x18b0, B:297:0x18f2, B:299:0x18fb, B:301:0x1913, B:302:0x195c, B:339:0x27cd, B:341:0x27da, B:342:0x2818, B:358:0x2da1, B:360:0x2dae, B:361:0x2dee, B:368:0x2f18, B:370:0x2f25, B:371:0x2f64, B:389:0x330b, B:391:0x3318, B:393:0x3375, B:452:0x35c5, B:454:0x35d2, B:455:0x3604, B:345:0x2823, B:347:0x283b, B:348:0x287d, B:310:0x25f6, B:312:0x2603, B:314:0x2651, B:237:0x11f7, B:239:0x1204, B:240:0x1245, B:48:0x0633, B:50:0x063d, B:51:0x067f, B:57:0x06c0, B:59:0x06ca, B:60:0x0709, B:39:0x0500, B:41:0x050d, B:42:0x0542), top: B:485:0x0124 }] */
            /* JADX WARN: Code duplicated, block: B:143:0x0c30  */
            /* JADX WARN: Code duplicated, block: B:145:0x0c61  */
            /* JADX WARN: Code duplicated, block: B:146:0x0c68  */
            /* JADX WARN: Code duplicated, block: B:155:0x0ce6  */
            /* JADX WARN: Code duplicated, block: B:167:0x0d19 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:168:0x0d1b A[Catch: all -> 0x0d8f, IOException -> 0x0d9b, TryCatch #23 {IOException -> 0x0d9b, all -> 0x0d8f, blocks: (B:152:0x0cdc, B:153:0x0cdf, B:160:0x0cfe, B:165:0x0d11, B:168:0x0d1b, B:172:0x0d22, B:180:0x0d5d, B:163:0x0d0b), top: B:507:0x0cdc }] */
            /* JADX WARN: Code duplicated, block: B:170:0x0d1f  */
            /* JADX WARN: Code duplicated, block: B:172:0x0d22 A[Catch: all -> 0x0d8f, IOException -> 0x0d9b, TRY_LEAVE, TryCatch #23 {IOException -> 0x0d9b, all -> 0x0d8f, blocks: (B:152:0x0cdc, B:153:0x0cdf, B:160:0x0cfe, B:165:0x0d11, B:168:0x0d1b, B:172:0x0d22, B:180:0x0d5d, B:163:0x0d0b), top: B:507:0x0cdc }] */
            /* JADX WARN: Code duplicated, block: B:175:0x0d41 A[LOOP:18: B:171:0x0d20->B:175:0x0d41, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:178:0x0d5a  */
            /* JADX WARN: Code duplicated, block: B:190:0x0d8c  */
            /* JADX WARN: Code duplicated, block: B:329:0x26a2  */
            /* JADX WARN: Code duplicated, block: B:330:0x26d2  */
            /* JADX WARN: Code duplicated, block: B:341:0x27da A[Catch: all -> 0x022a, TryCatch #4 {all -> 0x022a, blocks: (B:6:0x0124, B:8:0x0131, B:9:0x016c, B:21:0x02be, B:23:0x02cb, B:24:0x0309, B:33:0x043d, B:35:0x044a, B:36:0x0482, B:67:0x0734, B:69:0x073a, B:70:0x077d, B:128:0x0a56, B:130:0x0a63, B:131:0x0aa2, B:138:0x0bd4, B:140:0x0be1, B:141:0x0c25, B:203:0x0de3, B:205:0x0df0, B:206:0x0e2f, B:218:0x0fd5, B:220:0x0fe2, B:221:0x1026, B:229:0x10bc, B:231:0x10c9, B:232:0x110e, B:251:0x139b, B:253:0x13a8, B:254:0x13e9, B:266:0x154a, B:268:0x1557, B:269:0x1599, B:276:0x167c, B:278:0x1682, B:279:0x16be, B:282:0x175c, B:284:0x176e, B:285:0x17ad, B:294:0x18a3, B:296:0x18b0, B:297:0x18f2, B:299:0x18fb, B:301:0x1913, B:302:0x195c, B:339:0x27cd, B:341:0x27da, B:342:0x2818, B:358:0x2da1, B:360:0x2dae, B:361:0x2dee, B:368:0x2f18, B:370:0x2f25, B:371:0x2f64, B:389:0x330b, B:391:0x3318, B:393:0x3375, B:452:0x35c5, B:454:0x35d2, B:455:0x3604, B:345:0x2823, B:347:0x283b, B:348:0x287d, B:310:0x25f6, B:312:0x2603, B:314:0x2651, B:237:0x11f7, B:239:0x1204, B:240:0x1245, B:48:0x0633, B:50:0x063d, B:51:0x067f, B:57:0x06c0, B:59:0x06ca, B:60:0x0709, B:39:0x0500, B:41:0x050d, B:42:0x0542), top: B:485:0x0124 }] */
            /* JADX WARN: Code duplicated, block: B:344:0x2820  */
            /* JADX WARN: Code duplicated, block: B:345:0x2823 A[Catch: all -> 0x022a, TryCatch #4 {all -> 0x022a, blocks: (B:6:0x0124, B:8:0x0131, B:9:0x016c, B:21:0x02be, B:23:0x02cb, B:24:0x0309, B:33:0x043d, B:35:0x044a, B:36:0x0482, B:67:0x0734, B:69:0x073a, B:70:0x077d, B:128:0x0a56, B:130:0x0a63, B:131:0x0aa2, B:138:0x0bd4, B:140:0x0be1, B:141:0x0c25, B:203:0x0de3, B:205:0x0df0, B:206:0x0e2f, B:218:0x0fd5, B:220:0x0fe2, B:221:0x1026, B:229:0x10bc, B:231:0x10c9, B:232:0x110e, B:251:0x139b, B:253:0x13a8, B:254:0x13e9, B:266:0x154a, B:268:0x1557, B:269:0x1599, B:276:0x167c, B:278:0x1682, B:279:0x16be, B:282:0x175c, B:284:0x176e, B:285:0x17ad, B:294:0x18a3, B:296:0x18b0, B:297:0x18f2, B:299:0x18fb, B:301:0x1913, B:302:0x195c, B:339:0x27cd, B:341:0x27da, B:342:0x2818, B:358:0x2da1, B:360:0x2dae, B:361:0x2dee, B:368:0x2f18, B:370:0x2f25, B:371:0x2f64, B:389:0x330b, B:391:0x3318, B:393:0x3375, B:452:0x35c5, B:454:0x35d2, B:455:0x3604, B:345:0x2823, B:347:0x283b, B:348:0x287d, B:310:0x25f6, B:312:0x2603, B:314:0x2651, B:237:0x11f7, B:239:0x1204, B:240:0x1245, B:48:0x0633, B:50:0x063d, B:51:0x067f, B:57:0x06c0, B:59:0x06ca, B:60:0x0709, B:39:0x0500, B:41:0x050d, B:42:0x0542), top: B:485:0x0124 }] */
            /* JADX WARN: Code duplicated, block: B:347:0x283b A[Catch: all -> 0x022a, TryCatch #4 {all -> 0x022a, blocks: (B:6:0x0124, B:8:0x0131, B:9:0x016c, B:21:0x02be, B:23:0x02cb, B:24:0x0309, B:33:0x043d, B:35:0x044a, B:36:0x0482, B:67:0x0734, B:69:0x073a, B:70:0x077d, B:128:0x0a56, B:130:0x0a63, B:131:0x0aa2, B:138:0x0bd4, B:140:0x0be1, B:141:0x0c25, B:203:0x0de3, B:205:0x0df0, B:206:0x0e2f, B:218:0x0fd5, B:220:0x0fe2, B:221:0x1026, B:229:0x10bc, B:231:0x10c9, B:232:0x110e, B:251:0x139b, B:253:0x13a8, B:254:0x13e9, B:266:0x154a, B:268:0x1557, B:269:0x1599, B:276:0x167c, B:278:0x1682, B:279:0x16be, B:282:0x175c, B:284:0x176e, B:285:0x17ad, B:294:0x18a3, B:296:0x18b0, B:297:0x18f2, B:299:0x18fb, B:301:0x1913, B:302:0x195c, B:339:0x27cd, B:341:0x27da, B:342:0x2818, B:358:0x2da1, B:360:0x2dae, B:361:0x2dee, B:368:0x2f18, B:370:0x2f25, B:371:0x2f64, B:389:0x330b, B:391:0x3318, B:393:0x3375, B:452:0x35c5, B:454:0x35d2, B:455:0x3604, B:345:0x2823, B:347:0x283b, B:348:0x287d, B:310:0x25f6, B:312:0x2603, B:314:0x2651, B:237:0x11f7, B:239:0x1204, B:240:0x1245, B:48:0x0633, B:50:0x063d, B:51:0x067f, B:57:0x06c0, B:59:0x06ca, B:60:0x0709, B:39:0x0500, B:41:0x050d, B:42:0x0542), top: B:485:0x0124 }] */
            /* JADX WARN: Code duplicated, block: B:382:0x3085  */
            /* JADX WARN: Code duplicated, block: B:386:0x32f1  */
            /* JADX WARN: Code duplicated, block: B:388:0x3301  */
            /* JADX WARN: Code duplicated, block: B:391:0x3318 A[Catch: all -> 0x022a, TryCatch #4 {all -> 0x022a, blocks: (B:6:0x0124, B:8:0x0131, B:9:0x016c, B:21:0x02be, B:23:0x02cb, B:24:0x0309, B:33:0x043d, B:35:0x044a, B:36:0x0482, B:67:0x0734, B:69:0x073a, B:70:0x077d, B:128:0x0a56, B:130:0x0a63, B:131:0x0aa2, B:138:0x0bd4, B:140:0x0be1, B:141:0x0c25, B:203:0x0de3, B:205:0x0df0, B:206:0x0e2f, B:218:0x0fd5, B:220:0x0fe2, B:221:0x1026, B:229:0x10bc, B:231:0x10c9, B:232:0x110e, B:251:0x139b, B:253:0x13a8, B:254:0x13e9, B:266:0x154a, B:268:0x1557, B:269:0x1599, B:276:0x167c, B:278:0x1682, B:279:0x16be, B:282:0x175c, B:284:0x176e, B:285:0x17ad, B:294:0x18a3, B:296:0x18b0, B:297:0x18f2, B:299:0x18fb, B:301:0x1913, B:302:0x195c, B:339:0x27cd, B:341:0x27da, B:342:0x2818, B:358:0x2da1, B:360:0x2dae, B:361:0x2dee, B:368:0x2f18, B:370:0x2f25, B:371:0x2f64, B:389:0x330b, B:391:0x3318, B:393:0x3375, B:452:0x35c5, B:454:0x35d2, B:455:0x3604, B:345:0x2823, B:347:0x283b, B:348:0x287d, B:310:0x25f6, B:312:0x2603, B:314:0x2651, B:237:0x11f7, B:239:0x1204, B:240:0x1245, B:48:0x0633, B:50:0x063d, B:51:0x067f, B:57:0x06c0, B:59:0x06ca, B:60:0x0709, B:39:0x0500, B:41:0x050d, B:42:0x0542), top: B:485:0x0124 }] */
            /* JADX WARN: Code duplicated, block: B:392:0x336b  */
            /* JADX WARN: Code duplicated, block: B:397:0x3425 A[LOOP:8: B:387:0x32ff->B:397:0x3425, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:409:0x34e5  */
            /* JADX WARN: Code duplicated, block: B:411:0x34f6  */
            /* JADX WARN: Code duplicated, block: B:412:0x34f8  */
            /* JADX WARN: Code duplicated, block: B:418:0x3506 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:421:0x351e  */
            /* JADX WARN: Code duplicated, block: B:423:0x3529  */
            /* JADX WARN: Code duplicated, block: B:424:0x352b  */
            /* JADX WARN: Code duplicated, block: B:426:0x352e A[Catch: all -> 0x3578, IOException -> 0x3583, TRY_ENTER, TRY_LEAVE, TryCatch #22 {IOException -> 0x3583, all -> 0x3578, blocks: (B:406:0x34db, B:407:0x34de, B:415:0x34fd, B:426:0x352e), top: B:509:0x34db }] */
            /* JADX WARN: Code duplicated, block: B:429:0x3546 A[LOOP:12: B:425:0x352c->B:429:0x3546, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:434:0x3568  */
            /* JADX WARN: Code duplicated, block: B:435:0x356a  */
            /* JADX WARN: Code duplicated, block: B:438:0x3570  */
            /* JADX WARN: Code duplicated, block: B:449:0x3588  */
            /* JADX WARN: Code duplicated, block: B:454:0x35d2 A[Catch: all -> 0x022a, TryCatch #4 {all -> 0x022a, blocks: (B:6:0x0124, B:8:0x0131, B:9:0x016c, B:21:0x02be, B:23:0x02cb, B:24:0x0309, B:33:0x043d, B:35:0x044a, B:36:0x0482, B:67:0x0734, B:69:0x073a, B:70:0x077d, B:128:0x0a56, B:130:0x0a63, B:131:0x0aa2, B:138:0x0bd4, B:140:0x0be1, B:141:0x0c25, B:203:0x0de3, B:205:0x0df0, B:206:0x0e2f, B:218:0x0fd5, B:220:0x0fe2, B:221:0x1026, B:229:0x10bc, B:231:0x10c9, B:232:0x110e, B:251:0x139b, B:253:0x13a8, B:254:0x13e9, B:266:0x154a, B:268:0x1557, B:269:0x1599, B:276:0x167c, B:278:0x1682, B:279:0x16be, B:282:0x175c, B:284:0x176e, B:285:0x17ad, B:294:0x18a3, B:296:0x18b0, B:297:0x18f2, B:299:0x18fb, B:301:0x1913, B:302:0x195c, B:339:0x27cd, B:341:0x27da, B:342:0x2818, B:358:0x2da1, B:360:0x2dae, B:361:0x2dee, B:368:0x2f18, B:370:0x2f25, B:371:0x2f64, B:389:0x330b, B:391:0x3318, B:393:0x3375, B:452:0x35c5, B:454:0x35d2, B:455:0x3604, B:345:0x2823, B:347:0x283b, B:348:0x287d, B:310:0x25f6, B:312:0x2603, B:314:0x2651, B:237:0x11f7, B:239:0x1204, B:240:0x1245, B:48:0x0633, B:50:0x063d, B:51:0x067f, B:57:0x06c0, B:59:0x06ca, B:60:0x0709, B:39:0x0500, B:41:0x050d, B:42:0x0542), top: B:485:0x0124 }] */
            /* JADX WARN: Code duplicated, block: B:505:0x0cd0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:513:0x34cf A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:519:0x0b3a A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:520:0x0b48 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:534:0x3455 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:535:0x3411 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:537:0x3566 A[EDGE_INSN: B:537:0x3566->B:433:0x3566 BREAK  A[LOOP:9: B:407:0x34de->B:538:0x34de], SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:541:0x3508 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:542:0x3503 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:543:0x3557 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:544:0x3555 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:545:0x3553 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:55:0x0690  */
            /* JADX WARN: Code duplicated, block: B:560:0x0d5c A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:566:0x0d5e A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:567:0x0d4c A[SYNTHETIC] */
            /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:156:0x0ce7
                	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
                	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
                	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
                	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
                	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
                	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
                	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
                	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.processExcHandler(ExcHandlersRegionMaker.java:154)
                	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:77)
                	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
                	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
                */
            public static java.lang.Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault2(android.content.Context r61, int r62, int r63, int r64) {
                /*
                    Method dump skipped, instruction units count: 14162
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda161.TuitionPaymentFragmentspecialinlinedviewModeldefault2(android.content.Context, int, int, int):java.lang.Object[]");
            }

            static {
                char[] cArr = new char[2154];
                ByteBuffer.wrap("\u0096Â\u0083\u008d¼\u0080©\u0097ÂÒÿ\u009eè\u009a\u0005\u009d>©+¯D¬q²jµ\u0087\u0086°´\u00adµÆÉóÛìÀ\u0019Ò2Î/æXÆuÁnì\u009bê´àÍÑØ\u009eç\u0093ò\u0084\u0099Á¤\u008d³\u0089^\u008eeºp¼\u001f¿*¡1¦Ü\u0095ë¶ö«\u009dÎ¨ß·éBÖiÞtØ\u0003Å.Ö5ú±³¤ü\u009bñ\u008eæå£ØïÏë\"ì\u0019Ø\fÞcÝVÃMÄ ÷\u0097×\u008aÙá²Ô»±³¤ë\u009bí\u008eãå£ØåÏë\"ä\u0019É\fÔcÑV\u009fMË Ç\u0097È\u008aÄáºÔ±Ë§>¸\u0015\u0093\bª\u007f¥R´I\u0088¼\u009d\u0093\u0086\u0086\u0089^\u0090KÞtÃaÐ\n\u00807Ï ÀÍ\u008döïãé\u008cø¹ã\u009eµ\u008bû´æ¡õÊ¥÷ýàë\rë6\u0094#ÎLÀyÙbÚö\u000fãWÜLÉO¢Q\u009fF\u0088\\e\u0013^RKB$E\u0011c\nfçqÐ\\Í}¦\u0014\u0093\u0005H*]eblw}\u001ct!>63ÛzàUõT\u009aD¯G´SY^\u0090i\u0085pº=¯uÄdù`îw\u0003)8I-ZBWwElD\u0081F¶G«xÀ5õ:ê'\u001f\b4/)!^0sv±î¤÷\u009bº\u008eòåãØçÏð\"®\u0019Î\fÝcÐVÂMÃ Á\u0097À\u008aÿá²Ô½Ë >\u008f\u0015¨\b¦\u007f·RòÅñÐ©ï¯ú¡\u0091º¬¯»«Vím\u0092x\u0093\u0017\u0094\"Ý9\u0082Ô\u0083ã\u0084þ\u008c\u0095ü ´¿åJýë\u0092þ\u009dÁ\u009fÔ\u0092¿\u008f\u0082\u009cÂ\u001b×CèEýK\u0096P«E¼AQ\u0007jv\u007fy\u0010r%7>jÓeäaù}\u0092\"§=¸QM\u0016f\u0001{\r\f\u0019!E:7Ï?à2õ,\u008e6£/´ \u000f\n\u001aR%T0Z[AfTqP\u009c\u0016§g²hÝcè&ó{\u001et)p4l_3j,u@\u0080\u0019«\u0007¶\u001eÁ\ry5lmSkFe-~\u0010k\u0007oê)ÑVÄW«P\u009e\u0019\u0085FhG_@BH)?\u001c3\u0003'ö\u0000Ý\u0007À>·0\u009a)\u0081\ntP[\u0001N\u0019±³¤ü\u009bñ\u008eæå£ØæÏá\"í\u0019É\fßcÁVÕMß Ü0\u0099%\u0080\u001aÍ\u000f\u0085d\u008eY\u0096N\u009f£\u0093\u0098å\u008d§â¬×´Ì¯±ò¤ý\u009bõ\u008eãåéØ¦Ïê\"å\u0019È±³¤è\u009bæ\u008eÿåïØ§Ïâ\"é\u0019Ð\fÝcÇVÉMß Ü\u0097Á\u008aÍá¯±ò¤ý\u009bù\u008eååÿØî±î¤÷\u009bº\u008eàåþØçÏà\"õ\u0019ß\fÌc\u009aVÝMÍ Æ\u0097Ñ\u008aÆá½Ô»Ë >¥\u0015¾\b\u00ad\u007f¶\u0018 \r&2!'2¥¾°¯\u008f´\u009a±ñ·Ì©Û¢6ü\r\u009d\u0018\u0093w\u0095BÌY\u009c´\u009e\u0083Ø\u009e\u0096õëÀèßó*å\u0001°\u001cýkæFç]\u0080¨Ì\u0087Ç\u0092ÉéÛÄåÓÑ.Â\u0005;\u0010\u0015o4z'Q0¬>»3\u0096 í\u000bø\u0018F\u0088S\u0099l\u0082y\u0087\u0012\u0081/\u009f8\u0094ÕÊî«û¥\u0094£¡úºªW¨`î} \u0016Ý#Þ<ÅÉÓâ\u0086ÿË\u0088Ð¥Ñ¾¶Kúdñqÿ\ní'Ó0çÍôæ\ró#\u008c\u0006\u0099\u0011²\u0006O\bX\u000fu\u0016±ì¤ý\u009bæ\u008eãååØûÏð\"®\u0019Ï\fÁcÇV\u009eMÎ Ì\u0097\u008a\u008aÄá¹ÔºË¡>·\u0015â\bº\u007f«RîI\u009f¼\u0089\u0093\u009dÑlÄ}ûfîc\u0085e¸{¯pB.yOlA\u0003G6\u001e-NÀL÷\nêD\u00819´:«!^7ubh:\u001f+2n)\u0010Ü\u0019ó\u0017R^GOxTmQ\u0006W;I,BÁ\u001cú}ïs\u0080uµ,®|C~t8iv\u0002\u000b7\b(\u0013Ý\u0005öPë\b\u009c\u0019±\\ª#_)p%±ì¤ý\u009bæ\u008eãååØûÏð\"®\u0019Ï\fÁcÇV\u009eMÎ Ì\u0097\u008a\u008aÄá¹ÔºË¡>·\u0015â\bº\u007f«RîI\u0091¼\u0096\u0093\u0097±ê¤ú\u009bû\u008eèåÿØî±³¤è\u009bæ\u008eÿåïØ§Ïé\"ï\u0019Ø\fÍcØVÕMß2\u0095'\u0085\u0018\u0084\r\u0097f\u0094[\u0082L\u009e¡\u008c\u009a·¬'¹\u007f\u0086y\u0093wølÅyÒ}?;\u0004N\u0011^~AKIP]½K\u008a_\u0097Fü#ÉcÖ7#-\b6\u00158b?O#T\u001b¡A\u008e\u0013\u009b\u001dà\u000bÍ\bÚ\u0015'\u0019\f×\u0019ÿfåsöXî¥ù²â\u009fºäÂñÍÞÒ±³¤î\u009bñ\u008eþåèØçÏö\"¯\u0019Ð\fÑcÖV\u0086M\u0098 \u0087\u0097Ì\u008a×áóÔ¹Ë¡>´\u0015¥\b§\u007fêR°I\u008e¼\u0091\u0093\u0099\u0086\u0091ý\u009eÐ\u0091ÇÊ:\u0097\u0011u\u0004v{pn\u007fE{¸{¯*\u0082sùS±³¤î\u009bñ\u008eþåèØçÏö\"¯\u0019Ð\fÑcÖV\u0086M\u0098 \u0087\u0097Ì\u008a×áóÔ°Ë£>³\u0015£\b¥\u007f´R¯I\u008f¼\u009d\u0093\u0086\u0086Þý\u009bÐ\u0081Ç\u008a:\u0084\u0011s\u0004o{gn>E\u007f¸g±³¤ë\u009bí\u008eãåøØíÏé\"¯\u0019Ð\fÑcÖV\u0086M\u0098 \u0087\u0097Ç\u008aÌá³Ô\u00adË°>\u008f\u0015\u00ad\b¡\u007f R¬I£¼\u0091\u0093\u009a\u0086\u0084ý\u0089Ð\u009aÇ\u0082:\u0081\u0011\u007f\u0004}{9nsE|¸x¯*\u0082sùS`eu+J6_%4u\t7\u001e<ó?È\u001eÝA²\u000b\u0087\b\u009c\u0013q\nF\\[\u00150f\u0005a\u001awïbÄiÙ{®`\u0083`\u0098CmMBGW\b,H\u0001]±Û¤ý\u009bú\u008eéåáØçÏð\"é\u0019Ó\fÖQÔDË{ÂnÃ\u0005Þ8Â/×\b3\u001d<\"*73\\-a-v=\u009b!±î¤÷\u009bº\u008eàåþØçÏà\"õ\u0019ß\fÌc\u009aVÔMÉ Þ\u0097Í\u008aÃá¹±ê¤ú\u009bû\u008eèå´Ø¾Ïô±û¤ý\u009bú\u008eõåþØáÏç±û¤ý\u009bú\u008eõåþØáÏç\"ß\u0019Ä\f\u0080c\u0082\u0097}\u0082{½|¨sÃxþgéa\u0004Y?B*\u0006E\u0004pik\u001c\u0086\u001aIþ\\çcªvð\u001dî ÷7ðÚåáÏôÜ\u009b\u008a®ÍµÓXÜoÑrÜ±ï¤ü\u009bÿ±ù¤õ\u009bá\u008eüåíØüÏë\"òx.m\u001bR\u0017GC,-\u0011\u000e\u0006\u0019ë\u0007Ð&Å&ª\"\u009fc\u00849i4^%Cs(l\u001dC\u0002U÷LÜRÁ^6«#\u0080\u001c\u0086\t\u0094b\u0095_\u0097H\u0096¥Ö\u009e\u0099\u008b\u008aä\u0089ÑæÊ¸'«\u0010»\rºfÞS\u008eLÄ¹É\u0092È\u008f\u009eøÊÕ\u008eÎ¼*\u0091?º\u0000¼\u0015®~¯C\u00adT¬¹ì\u0082£\u0097°ø³ÍÜÖ\u0082;\u0091\f\u0081\u0011\u0080zäO´Pþ¥ó\u008eò\u0093¤äðÉ´Ò\u0086'ë\b\u008e\u001d\u0088±î¤÷\u009bº\u008eøåíØúÏà\"÷\u0019Ý\fÊcÑ±û¤÷\u009bø\u008eôåêØáÏ÷\"èzvofPgEt.(\u0013\"$@1W\u000eT\u001b]pJMS±î¤÷\u009bº\u008eàåþØçÏà\"õ\u0019ß\fÌc\u009aVÒMÞ É\u0097Ê\u008aÄ±î¤÷\u009bº\u008eûåéØúÏê\"å\u0019Ð\f\u0096cÅVÕMÁ Ý\u009dÐñÍäÔÛ\u0099ÎÀ¥Ê\u0098È\u008fÒbÑYú\u008cq±î¤÷\u009bº\u008eòåùØáÏè\"ä\u0019\u0092\fÈcÆVßMÈ Ý\u0097Ç\u008aÔCHV_iJ|N\u0017a*B=\u000eÐ\u0004±î¤÷\u009bº\u008eòåùØáÏè\"ä\u0019\u0092\fÞcÝVÞMË Í\u0097Ö\u008aÐá®Ô±Ëº>¤±û¤ý\u009bú\u008eõåþØáÏç\"¯\u0019Ï\fÜcßV\u009fMË Í\u0097Ê\u008aÅá®Ô±Ë·¬Ç¹Á\u0086Æ\u0093ÉøÂÅÝÒÛ?ã\u0004ø\u0011¼~¾K£Pã½ð\u008aó\u0097Ãü\u0098ÉÜÖÞ#Ã\b\u0097\u0015\u0091b\u0096O\u0099T²¡\u00ad\u008e«\u009b\u0093à¨ÍìÚî±û¤ý\u009bú\u008eõåþØáÏç\"¯\u0019Û\f×cÛV×MÀ Í\u0097û\u008aÓá¸Ô³Ëû>·\u0015©\b¦\u007f¡R²I\u0095¼\u009b´ª¡¬\u009e«\u008b¤à¯Ý°Ê¶'þ\u001c\u009b\t\u008bf\u008aS\u0099HÅ¥Ï\u0092\u0085\u008fÞäûÑëÎê;ù\u0010¥\r¯zå\u000fÉ\u001aÅ%É0Å[Òfßq\u0099\u009cÁ§ê²áÝÙèåóî\u001eò)ù4ü_\u008bjµu\u009e\u0080Ú«È¶ÕÁ\u0091ì\u0097÷ \u0002¯-´8«C½n\u0085y®\u0084ê¯\u0018÷¥â¼ÝñÈ¹£¨\u009e¬\u0089»d§_\u0098J\u0092%\u009b\u0010\u009e\u000b\u0095\u0089£\u009cº£÷¶¿Ý®àª÷½\u001a¤!\u009c4\u0094[\u009en\u0098uÏ\u0098\u0087¯\u009c²\u0084Ùýìñó·\u0006û-è0ëGîjèqÃ\u0084Å«Ë¾ÔÅÏèÑª.¿\u0005\u0080\u0003\u0095\u0011þ\u0010Ã\u0012Ô\u00139^\u00027\u0017sxq±î¤÷\u009bº\u008eòåùØáÏè\"ä\u0019\u0092\fÜcÝVÃMÜ Ä\u0097Å\u008aÙáòÔ±Ë°\u008c\u0090\u0099\u0085¦\u009f³\u009cØÙ±õ¤ö\u009bý\u008eäå¢ØûÏò\"ã\u0019\u0092\fÉcÑVÝMÙ \u0085\u0097Ô\u008aÒá³Ô¨Ë§±í¤ý\u009bù\u008eåå¢ØàÏó\"®\u0019Ñ\fÙcÝVÞMÇ Í\u0097Ý\u008aÓ±í¤ý\u009bù\u008eåå¢ØûÏâ\"®\u0019Ú\fÙcßVÕMó Ë\u0097Å\u008aÍá¹ÔªËµ±í¤ý\u009bù\u008eåå¢ØûÏâ\"®\u0019Ð\fÛcÐVïMÈ Í\u0097Ê\u008aÓáµÔ¬Ë\u00ad\u0082Î\u0097×¨\u009a½ÛÖÉëÚüÊ\u0011Å*ð?¶Põeþ~è\u0093ú¤ë¹éÒ\u0098çÖø\u0085\r\u0095&\u0081;\u009dL\u0080íêøóÇ¾Òö¹ç\u0084ã\u0093ô~ªEÉPÙ?Ý\nÁ\u0011\u0086üÍËÖÖÀ½\u0087\u0088²\u0097±b¹I\u00ad±î¤÷\u009bº\u008eÿåèØåÏª\"â\u0019É\fÑcØVÔM\u0082 Î\u0097Í\u008aÎá»Ô½Ë¦> \u0015¾\b¡\u007fªR´-\r8\u0014\u0007Y\u0012\u0003y\u001dD\u0004S\u0003¾\u0016\u0085<\u0090/ÿyÊ1Ñ:<\"\u000b+\u0016'}\u0011H]W^¢]\u0089H\u0094NãUÎSÕm r\u000fy\u001ag±î¤÷\u009bº\u008eãåõØûÏð\"å\u0019Ñ\f\u0096cÖVÅMÅ Ä\u0097À\u008a\u008eáºÔ±Ëº>·\u0015©\bº\u007f´R²I\u0095¼\u0096\u0093\u0080b\nw\u0013H^]\u00076\u0011\u000b\u001f\u001c\u0014ñ\u0001Ê5ß\u0003°5\u0085,\u009e<sbD\"Y12Q\u0007P\u0018Tí\u001aÆNÛE¬N\u0081C\u009a}on@`Uf.a\u0003b\u0014t±î¤÷\u009bº\u008eæåéØæÏà\"ï\u0019Î\f\u0096cÖVÅMÅ Ä\u0097À\u008a\u008eáºÔ±Ëº>·\u0015©\bº\u007f´R²I\u0095¼\u0096\u0093\u0080\u0094b\u0081{¾6«jÀeýjêl\u0007c<B)kF\\sPhK\u0085I²\u0006¯NÄ%ñ=î4\u001b80n-\"Z!w\"l\u0017\u0099\u0011¶\n£\fØ\u0012õ\râ\u0006\u001f\u0018±´i\u008e|\u0086±¦±µ±³¤ü\u009bñ\u008eæå£ØùÏá\"í\u0019É\fçcÄVÙMÜ Í±³¤ü\u009bñ\u008eæå£ØûÏë\"ã\u0019×\fÝcÀV\u009fMÎ É\u0097×\u008aÅá¾Ô¹Ëº>´\u0015\u0093\b¯\u007f¡R®I\u0085¼\u009c±³¤ü\u009bñ\u008eæå£ØûÏë\"ã\u0019×\fÝcÀV\u009fMË Í\u0097Ê\u008aÙá¸±³¤ü\u009bñ\u008eæå£ØûÏë\"ã\u0019×\fÝcÀV\u009fMÝ Í\u0097É\u008aÕá¸ê\nÿRÀTÕZ¾\u001a\u0083@\u0094XyTBpW^8y\r{\u0016tûrÌx±³¤ë\u009bí\u008eãåøØíÏé\"¯\u0019Ð\fÑcÖV\u009fMÀ Á\u0097Æ\u008aÃá\u0083ÔµËµ>¼\u0015 \b§\u007f§R\u009fI\u0098¼\u009d\u0093\u0096\u0086\u0085ý\u008bÐ·Ç\u0095:\u0085\u0011q\u0004m{:ncEc\u0090-\u0085bºo¯xÄ=ùtîi\u0003j8}-ABZw]±³¤ü\u009bñ\u008eæå£ØêÏ÷\"ô\u0019ã\fÌcÝVÝMÉ7)\"f\u001dk\b|c9^aIq¤y\u009fM\u008aGåZÐ\u0005ËT&A\u0011J\f\\g)R.M*¸/\u0093$\u008e6±³¤ë\u009bí\u008eãåøØíÏé\"¯\u0019Ð\fÑcÖV\u009fMÀ Á\u0097Æ\u008aÂá¯Ô¬Ë²>¿\u0015 \b¬\u007f¡R²I£¼\u0092\u0093\u009a\u0086\u0099ýÂÐ\u009bÇ\u008b\u00997\u008cx³u¦bÍ'ðnçs\np1Y$_KS~Q\u009a<\u008fs°~¥iÎ,óeäx\t{2T'NHI}Pá\u0018ôWËZÞMµ\b\u0088A\u009f\\r_Iz\\v3x\u0006ub\u008awÅHÈ]ß6\u009a\u000bÓ\u001cÎñÍÊêßó°ä\u0085ì±³¤ü\u009bñ\u008eæå£ØêÏ÷\"ô\u0019Ê\fÕcÇV×±³¤ü\u009bñ\u008eæå£ØêÏ÷\"ô\u0019Ì\fßcÕVÙMÜ Ë±³¤ü\u009bñ\u008eæå£ØêÏ÷\"ô\u0019ã\fÑcÙVÕ*\u0018?W\u0000^\u0015O~FC\fTK¹D\u0082`\u0097}øsÍtÖf;g\f|\u0011$zYO\u000bP\u001d¥T\u008e\u0005\u0093\u0010ä\u001bÉ\u0000\u0014Ð\u0001\u0096>\u0099+\u0087@À}\u009cj\u008e\u0087\u008d¼»©´Æ ó èà\u0005\u00892´/·DìqÓnÖ\u009bÁ°Ê\u00adÏÚá÷Ììó\u0019ÿ6ò#á±³¤è\u009bæ\u008eÿåïØ§Ïí\"ï\u0019Ì\f×cÆVÄMß±¬¤þ\u009bò\u008e°å¶³\u00ad¦ö\u0099ø\u008cáçñÚ¹Íé û\u001bÎ\u000eÀa\u0085TÃOÓ¢Æ\u0095É¯¤ºµ\u0085ª\u0090£û¿Æ¸Ñ¸<ñ\u0007\u0084\u0012\u0088}\u0087H\u008bS\u0095¾\u009e\u0089\u0088\u0094\u0097ÿ\u00adÊôÕä±ð¤ñ\u009bö\u008e×åÀØÍÏ×\"ß\u0019Þ\fËcÀV\u009eMß ÇFÀS\u008el\u0093y\u0080\u0012Ð/\u00968\u0092Õ\u0097î¦ûª\u0094\u0098¡ º°W¿`²}°\u0016Ü#\u0085<ßÉÎâÓ\u0086[\u0093Q¬D¹PÒZïYø@\u0015F.r;nE÷P¹o¤z·\u0011ç,¡;¯Ö±í\u0096ø\u0088\u0097\u0083±³¤ü\u009bõ\u008eäåíØ§Ïà\"ï\u0019Ë\fÖcØVßMÍ Ì\u0097×\u008a\u008fáòÔ¼Ë¤>ÿ\u0015\u00ad\b¸\u007f´R³IÒ¼\u0080\u0093\u0099\u0086\u009cîMû\u0016Ä\u0018Ñ\u0001º\u0011\u0087Y\u0090\u0019}\u000eF7S/<$\t(\u0012=(ë=Ç\u0002È\u0017Ä|ÚAÑVÇ»ØÈiÝ&â/÷>\u009c7¡}¶3[3`\u0015u\u0001\u001aA/\u001a4\u0004Ù\u001dî\u0018ó\u0013\u0098j\u00adg²}G%luqg\u0006l+50\u0016Å\rêMÿE\u0084[©\u001c¾SCSh¥}°\u0002¡\u0017¼<¿Á Öªûô\u0080\u008b\u0095\u0087º\u0083O\u009fT\u009fy\u009f\u000e\u009b".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 2154);
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = cArr;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 4741379529083888792L;
            }

            private static String $$e(int i2, int i3, short s) {
                int i4 = i3 + 4;
                byte[] bArr = $$c;
                int i5 = i2 * 3;
                int i6 = 115 - (s * 3);
                byte[] bArr2 = new byte[i5 + 1];
                int i7 = -1;
                if (bArr == null) {
                    i7 = -1;
                    i6 = i4 + i6;
                    i4 = i4;
                }
                while (true) {
                    int i8 = i7 + 1;
                    bArr2[i8] = (byte) i6;
                    int i9 = i4 + 1;
                    if (i8 == i5) {
                        return new String(bArr2, 0);
                    }
                    i7 = i8;
                    i6 = bArr[i9] + i6;
                    i4 = i9;
                }
            }
        });
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 81 / 0;
        }
        return dynamicColor;
    }

    static /* synthetic */ TonalPalette lambda$tertiaryContainer$85(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 115;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        TonalPalette tonalPalette = dynamicScheme.tertiaryPalette;
        if (i3 == 0) {
            return tonalPalette;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ Double lambda$tertiaryContainer$86(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 63;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        if (isMonochrome(dynamicScheme)) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 35;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            if (i4 % 2 != 0) {
                return Double.valueOf(dynamicScheme.isDark ? 60.0d : 49.0d);
            }
            boolean z = dynamicScheme.isDark;
            throw null;
        }
        if (isFidelity(dynamicScheme)) {
            return Double.valueOf(DislikeAnalyzer.fixIfDisliked(dynamicScheme.tertiaryPalette.getHct(performAlbers(dynamicScheme.tertiaryPalette.getHct(dynamicScheme.sourceColorHct.getTone()), dynamicScheme))).getTone());
        }
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 103;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 == 0) {
            return Double.valueOf(dynamicScheme.isDark ? 30.0d : 90.0d);
        }
        boolean z2 = dynamicScheme.isDark;
        throw null;
    }

    /* JADX INFO: renamed from: lambda$tertiaryContainer$87$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    final /* synthetic */ ToneDeltaPair m7863x357de1a8(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        ToneDeltaPair toneDeltaPair = new ToneDeltaPair(tertiaryContainer(), tertiary(), 15.0d, TonePolarity.NEARER, false);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            return toneDeltaPair;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final DynamicColor onTertiaryContainer() {
        int i = 2 % 2;
        DynamicColor dynamicColor = new DynamicColor("on_tertiary_container", new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda21
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$onTertiaryContainer$88((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda23
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f$0.m7848xb5c66ea9((DynamicScheme) obj);
            }
        }, false, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda24
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f$0.m7849x9867113f((DynamicScheme) obj);
            }
        }, null, new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        return dynamicColor;
    }

    static /* synthetic */ TonalPalette lambda$onTertiaryContainer$88(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 75;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        TonalPalette tonalPalette = dynamicScheme.tertiaryPalette;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 37;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            return tonalPalette;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        if (r5.isDark == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        r5 = com.google.android.material.color.utilities.MaterialDynamicColors.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 31;
        com.google.android.material.color.utilities.MaterialDynamicColors.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r5 % 128;
        r5 = r5 % 2;
        r0 = 0.0d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        r0 = 100.0d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
    
        return java.lang.Double.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if (isFidelity(r5) != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
    
        if (r5.isDark == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
    
        r5 = com.google.android.material.color.utilities.MaterialDynamicColors.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 71;
        com.google.android.material.color.utilities.MaterialDynamicColors.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = r5 % 128;
        r5 = r5 % 2;
        r0 = 90.0d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
    
        r0 = 10.0d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
    
        return java.lang.Double.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0070, code lost:
    
        return java.lang.Double.valueOf(com.google.android.material.color.utilities.DynamicColor.foregroundTone(tertiaryContainer().tone.apply(r5).doubleValue(), 4.5d));
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (isMonochrome(r5) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (isMonochrome(r5) != false) goto L9;
     */
    /* JADX INFO: renamed from: lambda$onTertiaryContainer$89$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final /* synthetic */ java.lang.Double m7848xb5c66ea9(com.google.android.material.color.utilities.DynamicScheme r5) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.android.material.color.utilities.MaterialDynamicColors.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            int r1 = r1 + 41
            int r2 = r1 % 128
            com.google.android.material.color.utilities.MaterialDynamicColors.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L19
            boolean r1 = isMonochrome(r5)
            r2 = 66
            int r2 = r2 / 0
            if (r1 == 0) goto L36
            goto L1f
        L19:
            boolean r1 = isMonochrome(r5)
            if (r1 == 0) goto L36
        L1f:
            boolean r5 = r5.isDark
            if (r5 == 0) goto L2f
            int r5 = com.google.android.material.color.utilities.MaterialDynamicColors.TuitionPaymentFragmentspecialinlinedviewModeldefault2
            int r5 = r5 + 31
            int r1 = r5 % 128
            com.google.android.material.color.utilities.MaterialDynamicColors.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r1
            int r5 = r5 % r0
            r0 = 0
            goto L31
        L2f:
            r0 = 4636737291354636288(0x4059000000000000, double:100.0)
        L31:
            java.lang.Double r5 = java.lang.Double.valueOf(r0)
            return r5
        L36:
            boolean r1 = isFidelity(r5)
            if (r1 != 0) goto L56
            boolean r5 = r5.isDark
            if (r5 == 0) goto L4f
            int r5 = com.google.android.material.color.utilities.MaterialDynamicColors.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            int r5 = r5 + 71
            int r1 = r5 % 128
            com.google.android.material.color.utilities.MaterialDynamicColors.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = r1
            int r5 = r5 % r0
            r0 = 4636033603912859648(0x4056800000000000, double:90.0)
            goto L51
        L4f:
            r0 = 4621819117588971520(0x4024000000000000, double:10.0)
        L51:
            java.lang.Double r5 = java.lang.Double.valueOf(r0)
            return r5
        L56:
            com.google.android.material.color.utilities.DynamicColor r0 = r4.tertiaryContainer()
            java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, java.lang.Double> r0 = r0.tone
            java.lang.Object r5 = r0.apply(r5)
            java.lang.Double r5 = (java.lang.Double) r5
            double r0 = r5.doubleValue()
            r2 = 4616752568008179712(0x4012000000000000, double:4.5)
            double r0 = com.google.android.material.color.utilities.DynamicColor.foregroundTone(r0, r2)
            java.lang.Double r5 = java.lang.Double.valueOf(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.color.utilities.MaterialDynamicColors.m7848xb5c66ea9(com.google.android.material.color.utilities.DynamicScheme):java.lang.Double");
    }

    /* JADX INFO: renamed from: lambda$onTertiaryContainer$90$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    final /* synthetic */ DynamicColor m7849x9867113f(DynamicScheme dynamicScheme) {
        DynamicColor dynamicColorTertiaryContainer;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            dynamicColorTertiaryContainer = tertiaryContainer();
            int i3 = 61 / 0;
        } else {
            dynamicColorTertiaryContainer = tertiaryContainer();
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 63;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return dynamicColorTertiaryContainer;
    }

    public final DynamicColor error() {
        int i = 2 % 2;
        DynamicColor dynamicColor = new DynamicColor(Constants.IPC_BUNDLE_KEY_SEND_ERROR, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda32
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$error$91((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda34
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$error$92((DynamicScheme) obj);
            }
        }, true, new MaterialDynamicColors$$ExternalSyntheticLambda162(this), null, new ContrastCurve(3.0d, 4.5d, 7.0d, 11.0d), new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda35
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f$0.m7826x590ec46a((DynamicScheme) obj);
            }
        });
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 57;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        return dynamicColor;
    }

    static /* synthetic */ TonalPalette lambda$error$91(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 65;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        TonalPalette tonalPalette = dynamicScheme.errorPalette;
        if (i3 == 0) {
            return tonalPalette;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ Double lambda$error$92(DynamicScheme dynamicScheme) {
        double d;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 17;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        if (dynamicScheme.isDark) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 37;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 87 / 0;
            }
            d = 80.0d;
        } else {
            d = 40.0d;
        }
        return Double.valueOf(d);
    }

    /* JADX INFO: renamed from: lambda$error$93$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    final /* synthetic */ ToneDeltaPair m7826x590ec46a(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        ToneDeltaPair toneDeltaPair = new ToneDeltaPair(errorContainer(), error(), 15.0d, TonePolarity.NEARER, false);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        return toneDeltaPair;
    }

    public final DynamicColor onError() {
        int i = 2 % 2;
        DynamicColor dynamicColor = new DynamicColor("on_error", new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda130
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$onError$94((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda131
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$onError$95((DynamicScheme) obj);
            }
        }, false, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda132
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f$0.m7831xb6a5d3ac((DynamicScheme) obj);
            }
        }, null, new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 21;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        return dynamicColor;
    }

    static /* synthetic */ TonalPalette lambda$onError$94(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 47;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        TonalPalette tonalPalette = dynamicScheme.errorPalette;
        if (i3 != 0) {
            throw null;
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 41;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return tonalPalette;
    }

    static /* synthetic */ Double lambda$onError$95(DynamicScheme dynamicScheme) {
        double d;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 21;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        if (!(!dynamicScheme.isDark)) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 77;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            if (i4 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            d = 20.0d;
        } else {
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 103;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
            int i6 = i5 % 2;
            d = 100.0d;
        }
        return Double.valueOf(d);
    }

    /* JADX INFO: renamed from: lambda$onError$96$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    final /* synthetic */ DynamicColor m7831xb6a5d3ac(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 29;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            error();
            throw null;
        }
        DynamicColor dynamicColorError = error();
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 51;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 == 0) {
            return dynamicColorError;
        }
        throw null;
    }

    public final DynamicColor errorContainer() {
        int i = 2 % 2;
        DynamicColor dynamicColor = new DynamicColor("error_container", new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda50
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$errorContainer$97((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda51
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$errorContainer$98((DynamicScheme) obj);
            }
        }, true, new MaterialDynamicColors$$ExternalSyntheticLambda162(this), null, new ContrastCurve(1.0d, 1.0d, 3.0d, 7.0d), new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda52
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f$0.m7827x33346ee5((DynamicScheme) obj);
            }
        });
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            return dynamicColor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ TonalPalette lambda$errorContainer$97(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        TonalPalette tonalPalette = dynamicScheme.errorPalette;
        if (i3 == 0) {
            return tonalPalette;
        }
        throw null;
    }

    static /* synthetic */ Double lambda$errorContainer$98(DynamicScheme dynamicScheme) {
        double d;
        int i = 2 % 2;
        if (dynamicScheme.isDark) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 99;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            d = 30.0d;
        } else {
            d = 90.0d;
        }
        Double dValueOf = Double.valueOf(d);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 82 / 0;
        }
        return dValueOf;
    }

    /* JADX INFO: renamed from: lambda$errorContainer$99$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    final /* synthetic */ ToneDeltaPair m7827x33346ee5(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        ToneDeltaPair toneDeltaPair = new ToneDeltaPair(errorContainer(), error(), 15.0d, TonePolarity.NEARER, false);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 51;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            return toneDeltaPair;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final DynamicColor onErrorContainer() {
        int i = 2 % 2;
        DynamicColor dynamicColor = new DynamicColor("on_error_container", new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda45
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$onErrorContainer$100((DynamicScheme) obj);
            }
        }, new MaterialDynamicColors$$ExternalSyntheticLambda46(), false, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda47
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f$0.m7832x2dffdbdb((DynamicScheme) obj);
            }
        }, null, new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 57;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            return dynamicColor;
        }
        throw null;
    }

    static /* synthetic */ TonalPalette lambda$onErrorContainer$100(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        TonalPalette tonalPalette = dynamicScheme.errorPalette;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 55;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 61 / 0;
        }
        return tonalPalette;
    }

    static /* synthetic */ Double lambda$onErrorContainer$101(DynamicScheme dynamicScheme) {
        double d;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 89;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        boolean z = dynamicScheme.isDark;
        if (i3 == 0) {
            throw null;
        }
        if (z) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 27;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            d = 90.0d;
        } else {
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 21;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            int i6 = i5 % 2;
            d = 10.0d;
        }
        return Double.valueOf(d);
    }

    /* JADX INFO: renamed from: lambda$onErrorContainer$102$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    final /* synthetic */ DynamicColor m7832x2dffdbdb(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        DynamicColor dynamicColorErrorContainer = errorContainer();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 99 / 0;
        }
        return dynamicColorErrorContainer;
    }

    public final DynamicColor primaryFixed() {
        int i = 2 % 2;
        DynamicColor dynamicColor = new DynamicColor("primary_fixed", new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda153
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$primaryFixed$103((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda154
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$primaryFixed$104((DynamicScheme) obj);
            }
        }, true, new MaterialDynamicColors$$ExternalSyntheticLambda162(this), null, new ContrastCurve(1.0d, 1.0d, 3.0d, 7.0d), new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda155
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f$0.m7856xcb141198((DynamicScheme) obj);
            }
        });
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            return dynamicColor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ TonalPalette lambda$primaryFixed$103(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 47;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        TonalPalette tonalPalette = dynamicScheme.primaryPalette;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return tonalPalette;
    }

    static /* synthetic */ Double lambda$primaryFixed$104(DynamicScheme dynamicScheme) {
        double d;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 37;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        if (isMonochrome(dynamicScheme)) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 29;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            int i5 = i4 % 2;
            d = 40.0d;
        } else {
            d = 90.0d;
        }
        return Double.valueOf(d);
    }

    /* JADX INFO: renamed from: lambda$primaryFixed$105$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    final /* synthetic */ ToneDeltaPair m7856xcb141198(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        ToneDeltaPair toneDeltaPair = new ToneDeltaPair(primaryFixed(), primaryFixedDim(), 10.0d, TonePolarity.LIGHTER, true);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            return toneDeltaPair;
        }
        throw null;
    }

    public final DynamicColor primaryFixedDim() {
        int i = 2 % 2;
        DynamicColor dynamicColor = new DynamicColor("primary_fixed_dim", new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda156
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$primaryFixedDim$106((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda157
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$primaryFixedDim$107((DynamicScheme) obj);
            }
        }, true, new MaterialDynamicColors$$ExternalSyntheticLambda162(this), null, new ContrastCurve(1.0d, 1.0d, 3.0d, 7.0d), new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda158
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f$0.m7857x8f195ac5((DynamicScheme) obj);
            }
        });
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 67;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        return dynamicColor;
    }

    static /* synthetic */ TonalPalette lambda$primaryFixedDim$106(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 105;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        TonalPalette tonalPalette = dynamicScheme.primaryPalette;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 93 / 0;
        }
        return tonalPalette;
    }

    static /* synthetic */ Double lambda$primaryFixedDim$107(DynamicScheme dynamicScheme) {
        double d;
        int i = 2 % 2;
        if (!(!isMonochrome(dynamicScheme))) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int i3 = i2 + 23;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 25;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            int i6 = i5 % 2;
            d = 30.0d;
        } else {
            d = 80.0d;
        }
        return Double.valueOf(d);
    }

    /* JADX INFO: renamed from: lambda$primaryFixedDim$108$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    final /* synthetic */ ToneDeltaPair m7857x8f195ac5(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        ToneDeltaPair toneDeltaPair = new ToneDeltaPair(primaryFixed(), primaryFixedDim(), 10.0d, TonePolarity.LIGHTER, true);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 71;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        return toneDeltaPair;
    }

    public final DynamicColor onPrimaryFixed() {
        int i = 2 % 2;
        DynamicColor dynamicColor = new DynamicColor("on_primary_fixed", new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda28
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$onPrimaryFixed$109((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda29
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$onPrimaryFixed$110((DynamicScheme) obj);
            }
        }, false, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda30
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f$0.m7836x702e4bf2((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda31
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f$0.m7837x4befc7b3((DynamicScheme) obj);
            }
        }, new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 9;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        return dynamicColor;
    }

    static /* synthetic */ TonalPalette lambda$onPrimaryFixed$109(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        TonalPalette tonalPalette = dynamicScheme.primaryPalette;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            return tonalPalette;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ Double lambda$onPrimaryFixed$110(DynamicScheme dynamicScheme) {
        double d;
        int i = 2 % 2;
        if (isMonochrome(dynamicScheme)) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 97;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            d = 100.0d;
        } else {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 51;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 4 / 3;
            }
            d = 10.0d;
        }
        return Double.valueOf(d);
    }

    /* JADX INFO: renamed from: lambda$onPrimaryFixed$111$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    final /* synthetic */ DynamicColor m7836x702e4bf2(DynamicScheme dynamicScheme) {
        DynamicColor dynamicColorPrimaryFixedDim;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 125;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            dynamicColorPrimaryFixedDim = primaryFixedDim();
            int i3 = 91 / 0;
        } else {
            dynamicColorPrimaryFixedDim = primaryFixedDim();
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 59;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            return dynamicColorPrimaryFixedDim;
        }
        throw null;
    }

    /* JADX INFO: renamed from: lambda$onPrimaryFixed$112$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    final /* synthetic */ DynamicColor m7837x4befc7b3(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        DynamicColor dynamicColorPrimaryFixed = primaryFixed();
        if (i3 != 0) {
            int i4 = 41 / 0;
        }
        return dynamicColorPrimaryFixed;
    }

    public final DynamicColor onPrimaryFixedVariant() {
        int i = 2 % 2;
        DynamicColor dynamicColor = new DynamicColor("on_primary_fixed_variant", new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda122
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$onPrimaryFixedVariant$113((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda123
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$onPrimaryFixedVariant$114((DynamicScheme) obj);
            }
        }, false, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda124
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f$0.m7838x19d0bbbf((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda125
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f$0.m7839xf5923780((DynamicScheme) obj);
            }
        }, new ContrastCurve(3.0d, 4.5d, 7.0d, 11.0d), null);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            return dynamicColor;
        }
        throw null;
    }

    static /* synthetic */ TonalPalette lambda$onPrimaryFixedVariant$113(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        TonalPalette tonalPalette = dynamicScheme.primaryPalette;
        if (i3 == 0) {
            int i4 = 57 / 0;
        }
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 115;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        return tonalPalette;
    }

    static /* synthetic */ Double lambda$onPrimaryFixedVariant$114(DynamicScheme dynamicScheme) {
        double d;
        int i = 2 % 2;
        if (isMonochrome(dynamicScheme)) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 3;
            int i3 = i2 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 33;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 5;
            }
            d = 90.0d;
        } else {
            d = 30.0d;
        }
        return Double.valueOf(d);
    }

    /* JADX INFO: renamed from: lambda$onPrimaryFixedVariant$115$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    final /* synthetic */ DynamicColor m7838x19d0bbbf(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 57;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        DynamicColor dynamicColorPrimaryFixedDim = primaryFixedDim();
        if (i3 == 0) {
            int i4 = 25 / 0;
        }
        return dynamicColorPrimaryFixedDim;
    }

    /* JADX INFO: renamed from: lambda$onPrimaryFixedVariant$116$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    final /* synthetic */ DynamicColor m7839xf5923780(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 51;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        DynamicColor dynamicColorPrimaryFixed = primaryFixed();
        if (i3 == 0) {
            int i4 = 55 / 0;
        }
        return dynamicColorPrimaryFixed;
    }

    public final DynamicColor secondaryFixed() {
        int i = 2 % 2;
        DynamicColor dynamicColor = new DynamicColor("secondary_fixed", new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda119
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$secondaryFixed$117((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda120
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$secondaryFixed$118((DynamicScheme) obj);
            }
        }, true, new MaterialDynamicColors$$ExternalSyntheticLambda162(this), null, new ContrastCurve(1.0d, 1.0d, 3.0d, 7.0d), new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda121
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f$0.m7860x75ece309((DynamicScheme) obj);
            }
        });
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 68 / 0;
        }
        return dynamicColor;
    }

    static /* synthetic */ TonalPalette lambda$secondaryFixed$117(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 63;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        TonalPalette tonalPalette = dynamicScheme.secondaryPalette;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 87 / 0;
        }
        return tonalPalette;
    }

    static /* synthetic */ Double lambda$secondaryFixed$118(DynamicScheme dynamicScheme) {
        double d;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            isMonochrome(dynamicScheme);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (isMonochrome(dynamicScheme)) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 115;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
            int i4 = i3 % 2;
            d = 80.0d;
        } else {
            d = 90.0d;
        }
        return Double.valueOf(d);
    }

    /* JADX INFO: renamed from: lambda$secondaryFixed$119$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    final /* synthetic */ ToneDeltaPair m7860x75ece309(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        ToneDeltaPair toneDeltaPair = new ToneDeltaPair(secondaryFixed(), secondaryFixedDim(), 10.0d, TonePolarity.LIGHTER, true);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 71;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        return toneDeltaPair;
    }

    public final DynamicColor secondaryFixedDim() {
        int i = 2 % 2;
        DynamicColor dynamicColor = new DynamicColor("secondary_fixed_dim", new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda138
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$secondaryFixedDim$120((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda139
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$secondaryFixedDim$121((DynamicScheme) obj);
            }
        }, true, new MaterialDynamicColors$$ExternalSyntheticLambda162(this), null, new ContrastCurve(1.0d, 1.0d, 3.0d, 7.0d), new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda141
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f$0.m7861x801c242f((DynamicScheme) obj);
            }
        });
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            return dynamicColor;
        }
        throw null;
    }

    static /* synthetic */ TonalPalette lambda$secondaryFixedDim$120(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        TonalPalette tonalPalette = dynamicScheme.secondaryPalette;
        if (i3 != 0) {
            throw null;
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return tonalPalette;
    }

    static /* synthetic */ Double lambda$secondaryFixedDim$121(DynamicScheme dynamicScheme) {
        double d;
        int i = 2 % 2;
        if (isMonochrome(dynamicScheme)) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 21;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            if (i2 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            d = 70.0d;
        } else {
            d = 80.0d;
        }
        Double dValueOf = Double.valueOf(d);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 85;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        return dValueOf;
    }

    /* JADX INFO: renamed from: lambda$secondaryFixedDim$122$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    final /* synthetic */ ToneDeltaPair m7861x801c242f(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        ToneDeltaPair toneDeltaPair = new ToneDeltaPair(secondaryFixed(), secondaryFixedDim(), 10.0d, TonePolarity.LIGHTER, true);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 25;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            return toneDeltaPair;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final DynamicColor onSecondaryFixed() {
        int i = 2 % 2;
        DynamicColor dynamicColor = new DynamicColor("on_secondary_fixed", new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda14
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$onSecondaryFixed$123((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda15
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$onSecondaryFixed$124((DynamicScheme) obj);
            }
        }, false, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda16
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f$0.m7843xf72fd9a3((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda17
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f$0.m7844xd2f15564((DynamicScheme) obj);
            }
        }, new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 17;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            return dynamicColor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ TonalPalette lambda$onSecondaryFixed$123(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 79;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        TonalPalette tonalPalette = dynamicScheme.secondaryPalette;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 115;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 60 / 0;
        }
        return tonalPalette;
    }

    static /* synthetic */ Double lambda$onSecondaryFixed$124(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Double dValueOf = Double.valueOf(10.0d);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 41;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 0 / 0;
        }
        return dValueOf;
    }

    /* JADX INFO: renamed from: lambda$onSecondaryFixed$125$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    final /* synthetic */ DynamicColor m7843xf72fd9a3(DynamicScheme dynamicScheme) {
        DynamicColor dynamicColorSecondaryFixedDim;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 85;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            dynamicColorSecondaryFixedDim = secondaryFixedDim();
            int i3 = 45 / 0;
        } else {
            dynamicColorSecondaryFixedDim = secondaryFixedDim();
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            return dynamicColorSecondaryFixedDim;
        }
        throw null;
    }

    /* JADX INFO: renamed from: lambda$onSecondaryFixed$126$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    final /* synthetic */ DynamicColor m7844xd2f15564(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            secondaryFixed();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        DynamicColor dynamicColorSecondaryFixed = secondaryFixed();
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 121;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        return dynamicColorSecondaryFixed;
    }

    public final DynamicColor onSecondaryFixedVariant() {
        int i = 2 % 2;
        DynamicColor dynamicColor = new DynamicColor("on_secondary_fixed_variant", new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda62
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$onSecondaryFixedVariant$127((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda63
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$onSecondaryFixedVariant$128((DynamicScheme) obj);
            }
        }, false, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda64
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f$0.m7845x26187114((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda65
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f$0.m7846x8b913aa((DynamicScheme) obj);
            }
        }, new ContrastCurve(3.0d, 4.5d, 7.0d, 11.0d), null);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        return dynamicColor;
    }

    static /* synthetic */ TonalPalette lambda$onSecondaryFixedVariant$127(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 95;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        TonalPalette tonalPalette = dynamicScheme.secondaryPalette;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return tonalPalette;
    }

    static /* synthetic */ Double lambda$onSecondaryFixedVariant$128(DynamicScheme dynamicScheme) {
        double d;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 63;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        if (!isMonochrome(dynamicScheme)) {
            d = 30.0d;
        } else {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 79;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            int i5 = i4 % 2;
            d = 25.0d;
        }
        return Double.valueOf(d);
    }

    /* JADX INFO: renamed from: lambda$onSecondaryFixedVariant$129$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    final /* synthetic */ DynamicColor m7845x26187114(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 93;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        DynamicColor dynamicColorSecondaryFixedDim = secondaryFixedDim();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return dynamicColorSecondaryFixedDim;
    }

    /* JADX INFO: renamed from: lambda$onSecondaryFixedVariant$130$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    final /* synthetic */ DynamicColor m7846x8b913aa(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        DynamicColor dynamicColorSecondaryFixed = secondaryFixed();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 59;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return dynamicColorSecondaryFixed;
    }

    public final DynamicColor tertiaryFixed() {
        int i = 2 % 2;
        DynamicColor dynamicColor = new DynamicColor("tertiary_fixed", new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda53
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$tertiaryFixed$131((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda54
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$tertiaryFixed$132((DynamicScheme) obj);
            }
        }, true, new MaterialDynamicColors$$ExternalSyntheticLambda162(this), null, new ContrastCurve(1.0d, 1.0d, 3.0d, 7.0d), new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda56
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f$0.m7864x59237289((DynamicScheme) obj);
            }
        });
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 10 / 0;
        }
        return dynamicColor;
    }

    static /* synthetic */ TonalPalette lambda$tertiaryFixed$131(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 59;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        TonalPalette tonalPalette = dynamicScheme.tertiaryPalette;
        if (i3 != 0) {
            return tonalPalette;
        }
        throw null;
    }

    static /* synthetic */ Double lambda$tertiaryFixed$132(DynamicScheme dynamicScheme) {
        double d;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 87;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        if (!isMonochrome(dynamicScheme)) {
            d = 90.0d;
        } else {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 19;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            if (i4 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            d = 40.0d;
        }
        Double dValueOf = Double.valueOf(d);
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 105;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        return dValueOf;
    }

    /* JADX INFO: renamed from: lambda$tertiaryFixed$133$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    final /* synthetic */ ToneDeltaPair m7864x59237289(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        ToneDeltaPair toneDeltaPair = new ToneDeltaPair(tertiaryFixed(), tertiaryFixedDim(), 10.0d, TonePolarity.LIGHTER, true);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        return toneDeltaPair;
    }

    public final DynamicColor tertiaryFixedDim() {
        int i = 2 % 2;
        DynamicColor dynamicColor = new DynamicColor("tertiary_fixed_dim", new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda126
            private static final byte[] $$c = {106, -93, -11, -74};
            private static final int $$f = 30;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$d = {107, 48, 57, 107, -7, -8, 5, 0, -8, Base64.padSymbol, -72, 11, -15, -7, 13, -12, 8, -5, -17, 66, -40, -21, -15, -7, 13, -12, 8, -5, -17, 37, -44, 18, -3, -3, 9, -21, -15, -7, 13, -12, 8, -5, -17, 37, -44, 77, -76, 1, -8, -10, -1, 76, -16, 10, -3, -36, -54, 1, 12, -16, 1, 10, -14, 22, -41, 8, -9, 9, 0, -18, 8, 3, 20, -24, -15, 8, -5, 0, 46, -36, 9, -14, 8, -9, -2, 27, -20, -27, 9, 5, -12, -9, 43, -47, 14, -9, -9, 5, -12, -9, -2, 0, 8, -1, -9, 5, -14, 0, -8, -1, 0, -8, 6, -2, -21, 10, 1, -21, 39, -37, 8, -4, -10, 5, -4, -4, 2, -23, 6, -11, 62};
            private static final int $$e = 11;
            private static final byte[] $$a = {41, 2, 45, -60, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
            private static final int $$b = 164;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
            private static int b = 1;
            private static int[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = {794905986, -980037127, 313991959, -1830789229, 631612438, -691721880, 468924767, 1981007990, -291057401, -1695731667, -147421737, -1001963370, -516297205, 412242848, -568206367, -466440700, -1262414846, 1628431652};

            /* JADX WARN: Code duplicated, block: B:10:0x0027  */
            /* JADX WARN: Code duplicated, block: B:8:0x001f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void a(int r5, byte r6, int r7, java.lang.Object[] r8) {
                /*
                    byte[] r0 = com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda126.$$a
                    int r1 = 53 - r6
                    int r7 = r7 * 52
                    int r7 = r7 + 4
                    int r5 = r5 * 14
                    int r5 = 98 - r5
                    byte[] r1 = new byte[r1]
                    int r6 = 52 - r6
                    r2 = 0
                    if (r0 != 0) goto L17
                    r5 = r6
                    r3 = r7
                    r4 = r2
                    goto L29
                L17:
                    r3 = r2
                L18:
                    byte r4 = (byte) r5
                    r1[r3] = r4
                    int r4 = r3 + 1
                    if (r3 != r6) goto L27
                    java.lang.String r5 = new java.lang.String
                    r5.<init>(r1, r2)
                    r8[r2] = r5
                    return
                L27:
                    r3 = r0[r7]
                L29:
                    int r7 = r7 + 1
                    int r5 = r5 + r3
                    int r5 = r5 + (-10)
                    r3 = r4
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda126.a(int, byte, int, java.lang.Object[]):void");
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0027  */
            /* JADX WARN: Code duplicated, block: B:8:0x001f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void d(byte r7, byte r8, short r9, java.lang.Object[] r10) {
                /*
                    int r9 = r9 * 23
                    int r9 = r9 + 84
                    byte[] r0 = com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda126.$$d
                    int r8 = r8 * 75
                    int r8 = 79 - r8
                    int r7 = r7 * 23
                    int r7 = r7 + 53
                    byte[] r1 = new byte[r7]
                    r2 = 0
                    if (r0 != 0) goto L17
                    r3 = r9
                    r5 = r2
                    r9 = r8
                    goto L2d
                L17:
                    r3 = r2
                L18:
                    byte r4 = (byte) r9
                    int r5 = r3 + 1
                    r1[r3] = r4
                    if (r5 != r7) goto L27
                    java.lang.String r7 = new java.lang.String
                    r7.<init>(r1, r2)
                    r10[r2] = r7
                    return
                L27:
                    r3 = r0[r8]
                    r6 = r9
                    r9 = r8
                    r8 = r3
                    r3 = r6
                L2d:
                    int r8 = -r8
                    int r3 = r3 + r8
                    int r8 = r3 + (-3)
                    int r9 = r9 + 1
                    r3 = r5
                    r6 = r9
                    r9 = r8
                    r8 = r6
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda126.d(byte, byte, short, java.lang.Object[]):void");
            }

            private static void c(int[] iArr, int i2, Object[] objArr) throws Throwable {
                int i3 = 2 % 2;
                SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length * 2];
                int[] iArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int i4 = -1870535734;
                long j = 0;
                int i5 = 1;
                int i6 = 0;
                if (iArr2 != null) {
                    int length = iArr2.length;
                    int[] iArr3 = new int[length];
                    int i7 = 0;
                    while (i7 < length) {
                        try {
                            Object[] objArr2 = new Object[1];
                            objArr2[i6] = Integer.valueOf(iArr2[i7]);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                char c = (char) (1 - (SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1)));
                                int iIndexOf = 3290 - TextUtils.indexOf((CharSequence) "", '0', i6, i6);
                                int i8 = 32 - (ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1));
                                byte b2 = (byte) i6;
                                byte b3 = b2;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, iIndexOf, i8, 1948206109, false, $$g(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                            }
                            iArr3[i7] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                            i7++;
                            i4 = -1870535734;
                            j = 0;
                            i6 = 0;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    iArr2 = iArr3;
                }
                int length2 = iArr2.length;
                int[] iArr4 = new int[length2];
                int[] iArr5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                if (iArr5 != null) {
                    int length3 = iArr5.length;
                    int[] iArr6 = new int[length3];
                    int i9 = 0;
                    while (i9 < length3) {
                        int i10 = $11 + 11;
                        $10 = i10 % 128;
                        int i11 = i10 % 2;
                        try {
                            Object[] objArr3 = new Object[i5];
                            objArr3[0] = Integer.valueOf(iArr5[i9]);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                byte b4 = (byte) 0;
                                byte b5 = b4;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), View.combineMeasuredStates(0, 0) + 3291, 31 - View.resolveSizeAndState(0, 0, 0), 1948206109, false, $$g(b4, b5, (byte) (b5 + 1)), new Class[]{Integer.TYPE});
                            }
                            iArr6[i9] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                            i9++;
                            iArr5 = iArr5;
                            i5 = 1;
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }
                    iArr5 = iArr6;
                }
                char c2 = 0;
                System.arraycopy(iArr5, 0, iArr4, 0, length2);
                sessionConfigValidatingBuilder.b = 2;
                while (sessionConfigValidatingBuilder.b < iArr.length) {
                    cArr[c2] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
                    cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
                    cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
                    cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
                    int i12 = 17;
                    for (int i13 = 1; i12 > i13; i13 = 1) {
                        int i14 = $10 + 21;
                        $11 = i14 % 128;
                        if (i14 % 2 == 0) {
                            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i12];
                            try {
                                Object[] objArr4 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                    byte b6 = (byte) 0;
                                    byte b7 = b6;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) TextUtils.indexOf("", "", 0, 0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 2560, TextUtils.getOffsetBefore("", 0) + 29, 683220507, false, $$g(b6, b7, b7), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                                }
                                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                                i12 += 99;
                            } catch (Throwable th3) {
                                Throwable cause3 = th3.getCause();
                                if (cause3 == null) {
                                    throw th3;
                                }
                                throw cause3;
                            }
                        } else {
                            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i12];
                            Object[] objArr5 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                byte b8 = (byte) 0;
                                byte b9 = b8;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (Process.myTid() >> 22), 2559 - (ViewConfiguration.getTapTimeout() >> 16), Color.blue(0) + 29, 683220507, false, $$g(b8, b9, b9), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                            }
                            int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue2;
                            i12--;
                        }
                    }
                    int i15 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i15;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
                    int i16 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    Object[] objArr6 = {sessionConfigValidatingBuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (Color.green(0) + 28879), View.MeasureSpec.getMode(0) + 348, 25 - ExpandableListView.getPackedPositionGroup(0L), -30507727, false, "G", new Class[]{Object.class});
                    }
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i16 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).intValue()];
                    cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
                    cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
                    cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
                    cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
                    cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
                    cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
                    cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
                    sessionConfigValidatingBuilder.b += 2;
                    c2 = 0;
                }
                objArr[0] = new String(cArr2, 0, i2);
                int i17 = $11 + 5;
                $10 = i17 % 128;
                int i18 = i17 % 2;
            }

            /* JADX WARN: Code duplicated, block: B:22:0x0207  */
            @Override // java.util.function.Function
            public final Object apply(Object obj) throws Throwable {
                Object[] objArr;
                int i2 = 2 % 2;
                int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 57;
                b = i3 % 128;
                int i4 = i3 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                int i5 = 0;
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char longPressTimeout = (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 31533);
                    int iKeyCodeFromString = 921 - KeyEvent.keyCodeFromString("");
                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 29;
                    byte b2 = $$a[80];
                    byte b3 = b2;
                    Object[] objArr2 = new Object[1];
                    a(b3, (byte) (b3 | 52), b2, objArr2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(longPressTimeout, iKeyCodeFromString, iIndexOf, -1048449946, false, (String) objArr2[0], null);
                }
                long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                Object[] objArr3 = new Object[1];
                c(new int[]{1022833378, -1545288654, -806388886, -1700882988, 1056664775, -312758988, -883965538, -977230269, -1343198327, -1338804518, -585219620, 2095472165, -379601611, 1235630428}, 21 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                c(new int[]{-2061202343, -135211978, 2060980942, 1363992476, 1583043130, -1449202153, -584282319, -562911094, 1321639104, -1400483359}, TextUtils.lastIndexOf("", '0') + 16, objArr4);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char maximumFlingVelocity = (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 31533);
                    int i6 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 920;
                    int iIndexOf2 = 28 - TextUtils.indexOf("", "", 0, 0);
                    byte[] bArr = $$a;
                    byte b4 = bArr[37];
                    byte b5 = bArr[80];
                    Object[] objArr5 = new Object[1];
                    a(b4, b5, b5, objArr5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(maximumFlingVelocity, i6, iIndexOf2, -778300370, false, (String) objArr5[0], null);
                }
                if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                    int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 17;
                    b = i7 % 128;
                    int i8 = i7 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char absoluteGravity = (char) (Gravity.getAbsoluteGravity(0, 0) + 31533);
                        int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 921;
                        int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 28;
                        byte[] bArr2 = $$a;
                        byte b6 = bArr2[37];
                        Object[] objArr6 = new Object[1];
                        a(b6, bArr2[33], b6, objArr6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(absoluteGravity, scrollBarFadeDuration, packedPositionType, -1142834547, false, (String) objArr6[0], null);
                    }
                    Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                    int i9 = ((int[]) objArr7[3])[0];
                    objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{i9}, (String[]) objArr7[4]};
                    int iIdentityHashCode = System.identityHashCode(this);
                    int i10 = ~iIdentityHashCode;
                    int i11 = 2042230422 + ((iIdentityHashCode | 652197694) * (-859)) + (((~(iIdentityHashCode | (-48140061))) | (~(652197694 | i10))) * 859) + (((~((-1121881950) | i10)) | 1073741889) * 859) + 705834138;
                    int i12 = (i11 << 13) ^ i11;
                    int i13 = i12 ^ (i12 >>> 17);
                    ((int[]) objArr[0])[0] = i13 ^ (i13 << 5);
                } else {
                    Object[] objArr8 = new Object[1];
                    c(new int[]{1530388673, -902520926, -1057424343, 732345365, -295309562, 1933437679, -1050191830, 572319025, 1319181606, 2145605072, -1838310625, 531561990, 424159508, 650422339, 26700025, 283425998}, Drawable.resolveOpacity(0, 0) + 26, objArr8);
                    Class<?> cls2 = Class.forName((String) objArr8[0]);
                    Object[] objArr9 = new Object[1];
                    c(new int[]{1707604737, -102940752, -2096494681, 1888956690, -512651502, -1962413974, 2130351338, -716793946, -1069176608, 1798627812, -2001014370, 649203619}, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 18, objArr9);
                    Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                    if (applicationContext != null) {
                        if (applicationContext instanceof ContextWrapper) {
                            int i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 73;
                            b = i14 % 128;
                            int i15 = i14 % 2;
                            if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                                applicationContext = applicationContext.getApplicationContext();
                            } else {
                                applicationContext = null;
                            }
                        } else {
                            applicationContext = applicationContext.getApplicationContext();
                        }
                    }
                    Object[] objArr10 = new Object[1];
                    c(new int[]{-1053957845, -1172754795, 2139242643, 545340401, 2130580908, 178560687, 48424301, 751313462, -1384008261, 22391732}, KeyEvent.keyCodeFromString("") + 16, objArr10);
                    Class<?> cls3 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    c(new int[]{-213483135, 2135483560, 1560624261, 1169151038, -566901513, 1153040685, 1625929355, -276640825, -944634507, -1580455278}, View.combineMeasuredStates(0, 0) + 16, objArr11);
                    int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
                    int i16 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 47;
                    b = i16 % 128;
                    int i17 = i16 % 2;
                    try {
                        Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, 705834138};
                        byte[] bArr3 = $$d;
                        byte b7 = bArr3[47];
                        byte b8 = b7;
                        Object[] objArr13 = new Object[1];
                        d(b7, b8, b8, objArr13);
                        Class<?> cls4 = Class.forName((String) objArr13[0]);
                        byte b9 = bArr3[7];
                        byte b10 = b9;
                        Object[] objArr14 = new Object[1];
                        d(b9, b10, b10, objArr14);
                        Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char cArgb = (char) (Color.argb(0, 0, 0, 0) + 31533);
                            int iBlue = 921 - Color.blue(0);
                            int touchSlop = 28 - (ViewConfiguration.getTouchSlop() >> 8);
                            byte[] bArr4 = $$a;
                            byte b11 = bArr4[37];
                            Object[] objArr16 = new Object[1];
                            a(b11, bArr4[33], b11, objArr16);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cArgb, iBlue, touchSlop, -1142834547, false, (String) objArr16[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                        try {
                            Object[] objArr17 = new Object[1];
                            c(new int[]{1022833378, -1545288654, -806388886, -1700882988, 1056664775, -312758988, -883965538, -977230269, -1343198327, -1338804518, -585219620, 2095472165, -379601611, 1235630428}, View.resolveSize(0, 0) + 22, objArr17);
                            Class<?> cls5 = Class.forName((String) objArr17[0]);
                            Object[] objArr18 = new Object[1];
                            c(new int[]{-2061202343, -135211978, 2060980942, 1363992476, 1583043130, -1449202153, -584282319, -562911094, 1321639104, -1400483359}, 15 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr18);
                            long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char c = (char) (31534 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                                int mirror = AndroidCharacter.getMirror('0') + 873;
                                int touchSlop2 = 28 - (ViewConfiguration.getTouchSlop() >> 8);
                                byte[] bArr5 = $$a;
                                byte b12 = bArr5[37];
                                byte b13 = bArr5[80];
                                Object[] objArr19 = new Object[1];
                                a(b12, b13, b13, objArr19);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, mirror, touchSlop2, -778300370, false, (String) objArr19[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char c2 = (char) (31534 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                                int iBlue2 = Color.blue(0) + 921;
                                int iKeyCodeFromString2 = 28 - KeyEvent.keyCodeFromString("");
                                byte b14 = $$a[80];
                                byte b15 = b14;
                                Object[] objArr20 = new Object[1];
                                a(b15, (byte) (b15 | 52), b14, objArr20);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, iBlue2, iKeyCodeFromString2, -1048449946, false, (String) objArr20[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                            objArr = objArr15;
                        } catch (Exception unused) {
                            throw new RuntimeException();
                        }
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
                int i18 = ((int[]) objArr[1])[0];
                int i19 = ((int[]) objArr[3])[0];
                if (i19 != i18) {
                    ArrayList arrayList = new ArrayList();
                    String[] strArr = (String[]) objArr[4];
                    if (strArr != null) {
                        while (i5 < strArr.length) {
                            int i20 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 19;
                            b = i20 % 128;
                            if (i20 % 2 == 0) {
                                arrayList.add(strArr[i5]);
                                i5 += 98;
                            } else {
                                arrayList.add(strArr[i5]);
                                i5++;
                            }
                        }
                    }
                    throw new RuntimeException(String.valueOf(i19));
                }
                int i21 = ((int[]) objArr[0])[0];
                int i22 = ((int[]) objArr[3])[0];
                Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{i22}, (String[]) objArr[4]};
                int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
                int i23 = ~((-1073809473) | iFreeMemory);
                int i24 = i21 + 1815473455 + ((288891907 | i23) * (-476)) + (i23 * 952) + ((~((~iFreeMemory) | (-1073809473))) * 476);
                int i25 = (i24 << 13) ^ i24;
                int i26 = i25 ^ (i25 >>> 17);
                ((int[]) objArr21[0])[0] = i26 ^ (i26 << 5);
                return MaterialDynamicColors.lambda$tertiaryFixedDim$134((DynamicScheme) obj);
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0027  */
            /* JADX WARN: Code duplicated, block: B:8:0x0021  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$g(byte r7, short r8, byte r9) {
                /*
                    int r8 = r8 * 3
                    int r8 = 1 - r8
                    int r9 = r9 * 56
                    int r9 = 122 - r9
                    int r7 = r7 * 4
                    int r7 = 3 - r7
                    byte[] r0 = com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda126.$$c
                    byte[] r1 = new byte[r8]
                    r2 = 0
                    if (r0 != 0) goto L17
                    r9 = r7
                    r3 = r8
                    r4 = r2
                    goto L2c
                L17:
                    r3 = r2
                L18:
                    int r4 = r3 + 1
                    byte r5 = (byte) r9
                    r1[r3] = r5
                    int r7 = r7 + 1
                    if (r4 != r8) goto L27
                    java.lang.String r7 = new java.lang.String
                    r7.<init>(r1, r2)
                    return r7
                L27:
                    r3 = r0[r7]
                    r6 = r9
                    r9 = r7
                    r7 = r6
                L2c:
                    int r7 = r7 + r3
                    r3 = r4
                    r6 = r9
                    r9 = r7
                    r7 = r6
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda126.$$g(byte, short, byte):java.lang.String");
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda127
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$tertiaryFixedDim$135((DynamicScheme) obj);
            }
        }, true, new MaterialDynamicColors$$ExternalSyntheticLambda162(this), null, new ContrastCurve(1.0d, 1.0d, 3.0d, 7.0d), new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda128
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f$0.m7865x24c02d4a((DynamicScheme) obj);
            }
        });
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 103;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 51 / 0;
        }
        return dynamicColor;
    }

    static /* synthetic */ TonalPalette lambda$tertiaryFixedDim$134(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 59;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        TonalPalette tonalPalette = dynamicScheme.tertiaryPalette;
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            return tonalPalette;
        }
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ Double lambda$tertiaryFixedDim$135(DynamicScheme dynamicScheme) {
        double d;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        if (isMonochrome(dynamicScheme)) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 85;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            int i5 = i4 % 2;
            d = 30.0d;
        } else {
            d = 80.0d;
        }
        return Double.valueOf(d);
    }

    /* JADX INFO: renamed from: lambda$tertiaryFixedDim$136$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    final /* synthetic */ ToneDeltaPair m7865x24c02d4a(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        ToneDeltaPair toneDeltaPair = new ToneDeltaPair(tertiaryFixed(), tertiaryFixedDim(), 10.0d, TonePolarity.LIGHTER, true);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        return toneDeltaPair;
    }

    public final DynamicColor onTertiaryFixed() {
        int i = 2 % 2;
        DynamicColor dynamicColor = new DynamicColor("on_tertiary_fixed", new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda87
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$onTertiaryFixed$137((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda88
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$onTertiaryFixed$138((DynamicScheme) obj);
            }
        }, false, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda89
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f$0.m7850xfe3fcbf0((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda90
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f$0.m7851xe0e06e86((DynamicScheme) obj);
            }
        }, new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 57;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        return dynamicColor;
    }

    static /* synthetic */ TonalPalette lambda$onTertiaryFixed$137(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        TonalPalette tonalPalette = dynamicScheme.tertiaryPalette;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 89;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return tonalPalette;
    }

    static /* synthetic */ Double lambda$onTertiaryFixed$138(DynamicScheme dynamicScheme) {
        double d;
        int i = 2 % 2;
        if (!(!isMonochrome(dynamicScheme))) {
            d = 100.0d;
        } else {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 79;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            int i3 = i2 % 2;
            d = 10.0d;
        }
        Double dValueOf = Double.valueOf(d);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 75;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 19 / 0;
        }
        return dValueOf;
    }

    /* JADX INFO: renamed from: lambda$onTertiaryFixed$139$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    final /* synthetic */ DynamicColor m7850xfe3fcbf0(DynamicScheme dynamicScheme) {
        DynamicColor dynamicColorTertiaryFixedDim;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 23;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            dynamicColorTertiaryFixedDim = tertiaryFixedDim();
            int i3 = 42 / 0;
        } else {
            dynamicColorTertiaryFixedDim = tertiaryFixedDim();
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            return dynamicColorTertiaryFixedDim;
        }
        throw null;
    }

    /* JADX INFO: renamed from: lambda$onTertiaryFixed$140$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    final /* synthetic */ DynamicColor m7851xe0e06e86(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 25;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            tertiaryFixed();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        DynamicColor dynamicColorTertiaryFixed = tertiaryFixed();
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 63;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        return dynamicColorTertiaryFixed;
    }

    public final DynamicColor onTertiaryFixedVariant() {
        int i = 2 % 2;
        DynamicColor dynamicColor = new DynamicColor("on_tertiary_fixed_variant", new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda75
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$onTertiaryFixedVariant$141((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda76
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$onTertiaryFixedVariant$142((DynamicScheme) obj);
            }
        }, false, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda77
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f$0.m7852x702fc122((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda78
            private static final byte[] $$c = {46, 47, -18, 64};
            private static final int $$d = 110;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {23, -73, 107, 5, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
            private static final int $$b = 74;
            private static int TuitionPaymentFragmentbindingInflater1 = 0;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
            private static char[] b = {59711, 59751, 59771, 59744, 59746, 59756, 59757, 59756, 59746, 59750, 59740, 59731, 59746, 59751, 59768, 59773, 59757, 59723, 59739, 59770, 59717, 59714, 59783, 59419, 59397, 59419, 59398, 59418, 59416, 59421, 59411, 59397, 59392, 59400, 59400, 59399, 59423, 59709, 59757, 59756, 59745, 59713, 59723, 59757, 59773, 59768, 59751, 59746, 59744, 59758, 59744, 59744, 59724, 59697, 59770, 59746, 59759, 59757, 59756, 59759, 59746, 59730, 59742, 59750, 59745, 59743, 59755, 59773, 59749};

            /* JADX WARN: Code duplicated, block: B:10:0x0025  */
            /* JADX WARN: Code duplicated, block: B:8:0x001d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void c(short r6, byte r7, short r8, java.lang.Object[] r9) {
                /*
                    int r7 = r7 * 3
                    int r7 = r7 + 84
                    int r8 = r8 * 4
                    int r0 = r8 + 53
                    int r6 = r6 + 4
                    byte[] r1 = com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda78.$$a
                    byte[] r0 = new byte[r0]
                    int r8 = r8 + 52
                    r2 = 0
                    if (r1 != 0) goto L17
                    r7 = r6
                    r4 = r8
                    r3 = r2
                    goto L2e
                L17:
                    r3 = r2
                L18:
                    byte r4 = (byte) r7
                    r0[r3] = r4
                    if (r3 != r8) goto L25
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r0, r2)
                    r9[r2] = r6
                    return
                L25:
                    int r6 = r6 + 1
                    r4 = r1[r6]
                    int r3 = r3 + 1
                    r5 = r7
                    r7 = r6
                    r6 = r5
                L2e:
                    int r4 = -r4
                    int r6 = r6 + r4
                    int r6 = r6 + (-11)
                    r5 = r7
                    r7 = r6
                    r6 = r5
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda78.c(short, byte, short, java.lang.Object[]):void");
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) throws Throwable {
                int iIntValue;
                int i2;
                int i3;
                int i4 = 2 % 2;
                int i5 = TuitionPaymentFragmentbindingInflater1 + 55;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
                int i6 = i5 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1552861273);
                int i7 = 0;
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (46400 - View.combineMeasuredStates(0, 0)), 40 - (Process.myTid() >> 22), TextUtils.indexOf((CharSequence) "", '0', 0) + 20, -1206882418, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
                }
                int i8 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
                Object[] objArr = new Object[1];
                a(new int[]{0, 22, 0, 6}, true, new byte[]{1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0}, objArr);
                Class<?> cls = Class.forName((String) objArr[0]);
                Object[] objArr2 = new Object[1];
                a(new int[]{22, 15, 168, 4}, true, new byte[]{0, 1, 1, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0}, objArr2);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
                long j = -1;
                long j2 = 2043534702844374221L ^ j;
                int i9 = i8;
                long jIdentityHashCode = System.identityHashCode(this);
                long j3 = jIdentityHashCode ^ j;
                long j4 = (((long) 302) * 2043534702844374221L) + (((long) TypedValues.MotionType.TYPE_EASING) * 53722471897584766L) + (((long) (-602)) * (((j2 | j3) ^ j) | 53722471897584766L)) + (((long) (-301)) * (((j2 | (j ^ 53722471897584766L)) ^ j) | ((jIdentityHashCode | j2) ^ j) | ((j3 | 2089353557919268095L) ^ j))) + (((long) 301) * (j ^ (j3 | 53722471897584766L)));
                int i10 = 0;
                try {
                    while (i10 != 10) {
                        int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 61;
                        TuitionPaymentFragmentbindingInflater1 = i11 % 128;
                        if (i11 % 2 != 0) {
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-638037654);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (37836 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), 59 - TextUtils.getTrimmedLength(""), KeyEvent.keyCodeFromString("") + 18, 1030158013, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
                            }
                            i2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(null);
                            i3 = 1;
                        } else {
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-638037654);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (37836 - View.combineMeasuredStates(0, 0)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 59, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 18, 1030158013, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
                            }
                            i2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).getInt(null);
                            i3 = 0;
                        }
                        long j5 = jLongValue;
                        while (true) {
                            for (int i12 = 0; i12 != 8; i12++) {
                                i2 = (((((int) (j5 >> i12)) & 255) + (i2 << 6)) + (i2 << 16)) - i2;
                            }
                            if (i3 != 0) {
                                break;
                            }
                            int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 73;
                            TuitionPaymentFragmentbindingInflater1 = i13 % 128;
                            i3 = i13 % 2 != 0 ? i3 + 106 : i3 + 1;
                            j5 = j4;
                        }
                        int i14 = i9;
                        if (i2 == i14) {
                            return this.f$0.m7853x4bf13ce3((DynamicScheme) obj);
                        }
                        int i15 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 33;
                        TuitionPaymentFragmentbindingInflater1 = i15 % 128;
                        int i16 = i15 % 2;
                        jLongValue -= 1024;
                        i10++;
                        i9 = i14;
                    }
                    Object[] objArr3 = {-621158371};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 46038), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1133, TextUtils.getTrimmedLength("") + 18, 807763283, false, null, new Class[]{Integer.TYPE});
                    }
                    Object[] objArr4 = {Integer.valueOf(iIntValue), 0, 1950935520, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr3), false};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char offsetBefore = (char) TextUtils.getOffsetBefore("", 0);
                        int iCombineMeasuredStates = 1031 - View.combineMeasuredStates(0, 0);
                        int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 15;
                        byte[] bArr = $$a;
                        byte b2 = (byte) (-bArr[5]);
                        byte b3 = bArr[7];
                        Object[] objArr5 = new Object[1];
                        c(b2, b3, b3, objArr5);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(offsetBefore, iCombineMeasuredStates, iKeyCodeFromString, 1298546779, false, (String) objArr5[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - View.resolveSize(0, 0)), 1117 - TextUtils.indexOf("", "", 0), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 17), Boolean.TYPE});
                    }
                    Object[] objArr6 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr4);
                    int i17 = ((int[]) objArr6[1])[0];
                    int i18 = ((int[]) objArr6[3])[0];
                    if (i18 != i17) {
                        ArrayList arrayList = new ArrayList();
                        String[] strArr = (String[]) objArr6[0];
                        if (strArr != null) {
                            while (i7 < strArr.length) {
                                int i19 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 89;
                                TuitionPaymentFragmentbindingInflater1 = i19 % 128;
                                if (i19 % 2 != 0) {
                                    arrayList.add(strArr[i7]);
                                    i7 += 115;
                                } else {
                                    arrayList.add(strArr[i7]);
                                    i7++;
                                }
                                int i20 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 89;
                                TuitionPaymentFragmentbindingInflater1 = i20 % 128;
                                int i21 = i20 % 2;
                            }
                        }
                        throw new RuntimeException(String.valueOf(i18));
                    }
                    return this.f$0.m7853x4bf13ce3((DynamicScheme) obj);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
                Object[] objArr7 = new Object[1];
                a(new int[]{37, 16, 0, 11}, false, new byte[]{0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0, 1, 1, 1, 1, 1}, objArr7);
                Class<?> cls2 = Class.forName((String) objArr7[0]);
                Object[] objArr8 = new Object[1];
                a(new int[]{53, 16, 0, 5}, true, new byte[]{0, 0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1}, objArr8);
                iIntValue = ((Integer) cls2.getMethod((String) objArr8[0], Object.class).invoke(null, this)).intValue();
            }

            private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
                int i2;
                int i3 = 2;
                int i4 = 2 % 2;
                setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
                int i5 = 0;
                int i6 = iArr[0];
                int i7 = 1;
                int i8 = iArr[1];
                int i9 = iArr[2];
                int i10 = iArr[3];
                char[] cArr = b;
                if (cArr != null) {
                    int length = cArr.length;
                    char[] cArr2 = new char[length];
                    int i11 = $10 + 101;
                    $11 = i11 % 128;
                    int i12 = i11 % 2;
                    int i13 = 0;
                    while (i13 < length) {
                        int i14 = $11 + 61;
                        $10 = i14 % 128;
                        if (i14 % i3 != 0) {
                            try {
                                Object[] objArr2 = new Object[i7];
                                objArr2[i5] = Integer.valueOf(cArr[i13]);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    byte b2 = (byte) i5;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) Color.blue(i5), 1270 - (ViewConfiguration.getJumpTapTimeout() >> 16), 18 - KeyEvent.normalizeMetaState(i5), 407021364, false, $$e(b2, (byte) (b2 + 5), (byte) (-1)), new Class[]{Integer.TYPE});
                                }
                                cArr2[i13] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                                i13 >>>= 1;
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        } else {
                            length = length;
                            Object[] objArr3 = {Integer.valueOf(cArr[i13])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                byte b3 = (byte) 0;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getJumpTapTimeout() >> 16), AndroidCharacter.getMirror('0') + 1222, TextUtils.lastIndexOf("", '0', 0) + 19, 407021364, false, $$e(b3, (byte) (b3 + 5), (byte) (-1)), new Class[]{Integer.TYPE});
                            }
                            cArr2[i13] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                            i13++;
                        }
                        length = length;
                        i3 = 2;
                        i5 = 0;
                        i7 = 1;
                    }
                    cArr = cArr2;
                }
                char[] cArr3 = new char[i8];
                System.arraycopy(cArr, i6, cArr3, 0, i8);
                if (bArr != null) {
                    int i15 = $10 + 87;
                    $11 = i15 % 128;
                    int i16 = i15 % 2;
                    char[] cArr4 = new char[i8];
                    setvideostabilizationmode.b = 0;
                    char c = 0;
                    while (setvideostabilizationmode.b < i8) {
                        int i17 = $10 + 87;
                        $11 = i17 % 128;
                        int i18 = i17 % 2;
                        if (bArr[setvideostabilizationmode.b] == 1) {
                            int i19 = setvideostabilizationmode.b;
                            Object[] objArr4 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c)};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                byte b4 = (byte) 0;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), Gravity.getAbsoluteGravity(0, 0) + 3225, 12 - ExpandableListView.getPackedPositionChild(0L), 2133916302, false, $$e(b4, (byte) (b4 | 6), (byte) (-1)), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr4[i19] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                        } else {
                            int i20 = setvideostabilizationmode.b;
                            Object[] objArr5 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c)};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                char cResolveSize = (char) (29944 - View.resolveSize(0, 0));
                                int keyRepeatDelay = 1755 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                                int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 24;
                                byte length2 = (byte) $$c.length;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cResolveSize, keyRepeatDelay, modifierMetaStateMask, 387247676, false, $$e((byte) 0, length2, (byte) (length2 - 5)), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr4[i20] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                        }
                        c = cArr4[setvideostabilizationmode.b];
                        Object[] objArr6 = {setvideostabilizationmode, setvideostabilizationmode};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            byte b5 = (byte) 0;
                            byte b6 = b5;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (41241 - ExpandableListView.getPackedPositionGroup(0L)), Color.rgb(0, 0, 0) + 16778921, KeyEvent.keyCodeFromString("") + 21, -1434471773, false, $$e(b5, b6, (byte) (b6 - 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
                    }
                    cArr3 = cArr4;
                }
                if (i10 > 0) {
                    char[] cArr5 = new char[i8];
                    i2 = 0;
                    System.arraycopy(cArr3, 0, cArr5, 0, i8);
                    int i21 = i8 - i10;
                    System.arraycopy(cArr5, 0, cArr3, i21, i10);
                    System.arraycopy(cArr5, i10, cArr3, 0, i21);
                } else {
                    i2 = 0;
                }
                if (z) {
                    char[] cArr6 = new char[i8];
                    loop2: while (true) {
                        setvideostabilizationmode.b = i2;
                        while (true) {
                            if (setvideostabilizationmode.b >= i8) {
                                break loop2;
                            }
                            int i22 = $10 + 47;
                            $11 = i22 % 128;
                            if (i22 % 2 == 0) {
                                cArr6[setvideostabilizationmode.b] = cArr3[i8 >>> setvideostabilizationmode.b];
                                setvideostabilizationmode.b--;
                            } else {
                                cArr6[setvideostabilizationmode.b] = cArr3[(i8 - setvideostabilizationmode.b) - 1];
                                i2 = setvideostabilizationmode.b + 1;
                            }
                        }
                    }
                    cArr3 = cArr6;
                }
                if (i9 > 0) {
                    int i23 = $10 + 33;
                    $11 = i23 % 128;
                    int i24 = i23 % 2;
                    int i25 = 0;
                    loop4: while (true) {
                        setvideostabilizationmode.b = i25;
                        while (true) {
                            if (setvideostabilizationmode.b >= i8) {
                                break loop4;
                            }
                            int i26 = $11 + 93;
                            $10 = i26 % 128;
                            if (i26 % 2 != 0) {
                                cArr3[setvideostabilizationmode.b] = (char) (cArr3[setvideostabilizationmode.b] + iArr[2]);
                                setvideostabilizationmode.b = setvideostabilizationmode.b;
                            }
                        }
                        cArr3[setvideostabilizationmode.b] = (char) (cArr3[setvideostabilizationmode.b] - iArr[2]);
                        i25 = setvideostabilizationmode.b + 1;
                    }
                }
                objArr[0] = new String(cArr3);
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0023  */
            /* JADX WARN: Code duplicated, block: B:8:0x001c  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$e(byte r5, short r6, short r7) {
                /*
                    int r7 = r7 + 4
                    int r5 = r5 * 2
                    int r0 = r5 + 1
                    int r6 = 105 - r6
                    byte[] r1 = com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda78.$$c
                    byte[] r0 = new byte[r0]
                    r2 = -1
                    if (r1 != 0) goto L12
                    r3 = r5
                    r6 = r7
                    goto L27
                L12:
                    r4 = r7
                    r7 = r6
                    r6 = r4
                L15:
                    int r2 = r2 + 1
                    byte r3 = (byte) r7
                    r0[r2] = r3
                    if (r2 != r5) goto L23
                    java.lang.String r5 = new java.lang.String
                    r6 = 0
                    r5.<init>(r0, r6)
                    return r5
                L23:
                    int r6 = r6 + 1
                    r3 = r1[r6]
                L27:
                    int r3 = -r3
                    int r7 = r7 + r3
                    goto L15
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda78.$$e(byte, short, short):java.lang.String");
            }
        }, new ContrastCurve(3.0d, 4.5d, 7.0d, 11.0d), null);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 21;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 96 / 0;
        }
        return dynamicColor;
    }

    static /* synthetic */ TonalPalette lambda$onTertiaryFixedVariant$141(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 79;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        TonalPalette tonalPalette = dynamicScheme.tertiaryPalette;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 64 / 0;
        }
        return tonalPalette;
    }

    static /* synthetic */ Double lambda$onTertiaryFixedVariant$142(DynamicScheme dynamicScheme) {
        double d;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 15;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        if (isMonochrome(dynamicScheme)) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 119;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            d = 90.0d;
            if (i4 % 2 != 0) {
                int i5 = 4 / 0;
            }
        } else {
            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 123;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
            int i7 = i6 % 2;
            d = 30.0d;
        }
        Double dValueOf = Double.valueOf(d);
        int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 85;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i8 % 128;
        int i9 = i8 % 2;
        return dValueOf;
    }

    /* JADX INFO: renamed from: lambda$onTertiaryFixedVariant$143$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    final /* synthetic */ DynamicColor m7852x702fc122(DynamicScheme dynamicScheme) {
        DynamicColor dynamicColorTertiaryFixedDim;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 15;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            dynamicColorTertiaryFixedDim = tertiaryFixedDim();
            int i3 = 24 / 0;
        } else {
            dynamicColorTertiaryFixedDim = tertiaryFixedDim();
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 37;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return dynamicColorTertiaryFixedDim;
    }

    /* JADX INFO: renamed from: lambda$onTertiaryFixedVariant$144$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    final /* synthetic */ DynamicColor m7853x4bf13ce3(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            return tertiaryFixed();
        }
        tertiaryFixed();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final DynamicColor controlActivated() {
        int i = 2 % 2;
        DynamicColor dynamicColorFromPalette = DynamicColor.fromPalette("control_activated", new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda70
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$controlActivated$145((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda71
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$controlActivated$146((DynamicScheme) obj);
            }
        });
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 123;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        return dynamicColorFromPalette;
    }

    static /* synthetic */ TonalPalette lambda$controlActivated$145(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 107;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        TonalPalette tonalPalette = dynamicScheme.primaryPalette;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 45;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            return tonalPalette;
        }
        throw null;
    }

    static /* synthetic */ Double lambda$controlActivated$146(DynamicScheme dynamicScheme) {
        double d;
        int i = 2 % 2;
        if (dynamicScheme.isDark) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 109;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            d = 30.0d;
        } else {
            d = 90.0d;
        }
        Double dValueOf = Double.valueOf(d);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 25;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 92 / 0;
        }
        return dValueOf;
    }

    public final DynamicColor controlNormal() {
        int i = 2 % 2;
        DynamicColor dynamicColorFromPalette = DynamicColor.fromPalette("control_normal", new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda55
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$controlNormal$147((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda66
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$controlNormal$148((DynamicScheme) obj);
            }
        });
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            return dynamicColorFromPalette;
        }
        throw null;
    }

    static /* synthetic */ TonalPalette lambda$controlNormal$147(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        TonalPalette tonalPalette = dynamicScheme.neutralVariantPalette;
        if (i3 == 0) {
            int i4 = 85 / 0;
        }
        return tonalPalette;
    }

    static /* synthetic */ Double lambda$controlNormal$148(DynamicScheme dynamicScheme) {
        double d;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 57;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        if (dynamicScheme.isDark) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 125;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            int i5 = i4 % 2;
            d = 80.0d;
        } else {
            d = 30.0d;
        }
        return Double.valueOf(d);
    }

    public final DynamicColor controlHighlight() {
        int i = 2 % 2;
        DynamicColor dynamicColor = new DynamicColor("control_highlight", new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda93
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$controlHighlight$149((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda94
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$controlHighlight$150((DynamicScheme) obj);
            }
        }, false, null, null, null, null, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda95
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$controlHighlight$151((DynamicScheme) obj);
            }
        });
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 25;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            return dynamicColor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ TonalPalette lambda$controlHighlight$149(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 115;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        TonalPalette tonalPalette = dynamicScheme.neutralPalette;
        if (i3 == 0) {
            int i4 = 75 / 0;
        }
        return tonalPalette;
    }

    static /* synthetic */ Double lambda$controlHighlight$150(DynamicScheme dynamicScheme) {
        double d;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        boolean z = dynamicScheme.isDark;
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!z) {
            d = 0.0d;
        } else {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 93;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            int i5 = i4 % 2;
            d = 100.0d;
        }
        return Double.valueOf(d);
    }

    static /* synthetic */ Double lambda$controlHighlight$151(DynamicScheme dynamicScheme) {
        double d;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 55;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        if (dynamicScheme.isDark) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 65;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            int i5 = i4 % 2;
            d = 0.2d;
        } else {
            d = 0.12d;
        }
        Double dValueOf = Double.valueOf(d);
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 121;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
        if (i6 % 2 != 0) {
            return dValueOf;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final DynamicColor textPrimaryInverse() {
        int i = 2 % 2;
        DynamicColor dynamicColorFromPalette = DynamicColor.fromPalette("text_primary_inverse", new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda36
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$textPrimaryInverse$152((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda37
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$textPrimaryInverse$153((DynamicScheme) obj);
            }
        });
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 57;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            return dynamicColorFromPalette;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ TonalPalette lambda$textPrimaryInverse$152(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 107;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        TonalPalette tonalPalette = dynamicScheme.neutralPalette;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 71;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return tonalPalette;
    }

    static /* synthetic */ Double lambda$textPrimaryInverse$153(DynamicScheme dynamicScheme) {
        double d;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 95;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        if (dynamicScheme.isDark) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 19;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            int i5 = i4 % 2;
            d = 10.0d;
        } else {
            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 123;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
            int i7 = i6 % 2;
            d = 90.0d;
        }
        return Double.valueOf(d);
    }

    public final DynamicColor textSecondaryAndTertiaryInverse() {
        int i = 2 % 2;
        DynamicColor dynamicColorFromPalette = DynamicColor.fromPalette("text_secondary_and_tertiary_inverse", new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda48
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$textSecondaryAndTertiaryInverse$154((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda49
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$textSecondaryAndTertiaryInverse$155((DynamicScheme) obj);
            }
        });
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 17;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        return dynamicColorFromPalette;
    }

    static /* synthetic */ TonalPalette lambda$textSecondaryAndTertiaryInverse$154(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 89;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        TonalPalette tonalPalette = dynamicScheme.neutralVariantPalette;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return tonalPalette;
    }

    static /* synthetic */ Double lambda$textSecondaryAndTertiaryInverse$155(DynamicScheme dynamicScheme) {
        double d;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 31;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        boolean z = dynamicScheme.isDark;
        if (i3 != 0) {
            throw null;
        }
        if (z) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 103;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            int i5 = i4 % 2;
            d = 30.0d;
        } else {
            d = 80.0d;
        }
        return Double.valueOf(d);
    }

    public final DynamicColor textPrimaryInverseDisableOnly() {
        int i = 2 % 2;
        DynamicColor dynamicColorFromPalette = DynamicColor.fromPalette("text_primary_inverse_disable_only", new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda133
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$textPrimaryInverseDisableOnly$156((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda134
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$textPrimaryInverseDisableOnly$157((DynamicScheme) obj);
            }
        });
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 57;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        return dynamicColorFromPalette;
    }

    static /* synthetic */ TonalPalette lambda$textPrimaryInverseDisableOnly$156(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 5;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        TonalPalette tonalPalette = dynamicScheme.neutralPalette;
        if (i3 == 0) {
            return tonalPalette;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ Double lambda$textPrimaryInverseDisableOnly$157(DynamicScheme dynamicScheme) {
        double d;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        if (dynamicScheme.isDark) {
            d = 10.0d;
        } else {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 57;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            int i5 = i4 % 2;
            d = 90.0d;
        }
        return Double.valueOf(d);
    }

    public final DynamicColor textSecondaryAndTertiaryInverseDisabled() {
        int i = 2 % 2;
        DynamicColor dynamicColorFromPalette = DynamicColor.fromPalette("text_secondary_and_tertiary_inverse_disabled", new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda85
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$textSecondaryAndTertiaryInverseDisabled$158((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda96
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$textSecondaryAndTertiaryInverseDisabled$159((DynamicScheme) obj);
            }
        });
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 55;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        return dynamicColorFromPalette;
    }

    static /* synthetic */ TonalPalette lambda$textSecondaryAndTertiaryInverseDisabled$158(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 85;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        TonalPalette tonalPalette = dynamicScheme.neutralPalette;
        if (i3 != 0) {
            return tonalPalette;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ Double lambda$textSecondaryAndTertiaryInverseDisabled$159(DynamicScheme dynamicScheme) {
        double d;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        boolean z = dynamicScheme.isDark;
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        if (z) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 105;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            if (i4 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            d = 10.0d;
        } else {
            d = 90.0d;
        }
        return Double.valueOf(d);
    }

    public final DynamicColor textHintInverse() {
        int i = 2 % 2;
        DynamicColor dynamicColorFromPalette = DynamicColor.fromPalette("text_hint_inverse", new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda146
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$textHintInverse$160((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda147
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$textHintInverse$161((DynamicScheme) obj);
            }
        });
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        return dynamicColorFromPalette;
    }

    static /* synthetic */ TonalPalette lambda$textHintInverse$160(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 57;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        TonalPalette tonalPalette = dynamicScheme.neutralPalette;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return tonalPalette;
    }

    static /* synthetic */ Double lambda$textHintInverse$161(DynamicScheme dynamicScheme) {
        double d;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 37;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        if (!(!dynamicScheme.isDark)) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 85;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            int i5 = i4 % 2;
            d = 10.0d;
        } else {
            d = 90.0d;
        }
        return Double.valueOf(d);
    }

    private static ViewingConditions viewingConditionsForAlbers(DynamicScheme dynamicScheme) {
        double d;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 75;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        if (dynamicScheme.isDark) {
            d = 30.0d;
        } else {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 41;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            int i5 = i4 % 2;
            d = 80.0d;
        }
        ViewingConditions viewingConditionsDefaultWithBackgroundLstar = ViewingConditions.defaultWithBackgroundLstar(d);
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 51;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
        if (i6 % 2 != 0) {
            return viewingConditionsDefaultWithBackgroundLstar;
        }
        throw null;
    }

    private static boolean isFidelity(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 95;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        if (dynamicScheme.variant == Variant.FIDELITY) {
            return true;
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 93;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        Variant variant = dynamicScheme.variant;
        if (i5 == 0) {
            return variant == Variant.CONTENT;
        }
        Variant variant2 = Variant.CONTENT;
        throw null;
    }

    private static boolean isMonochrome(DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        if (dynamicScheme.variant != Variant.MONOCHROME) {
            return false;
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 87;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            return true;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0082  */
    /* JADX WARN: Code duplicated, block: B:33:0x0083 A[SYNTHETIC] */
    static double findDesiredChromaByTone(double d, double d2, double d3, boolean z) {
        double d4;
        int i = 2 % 2;
        Hct hctFrom = Hct.from(d, d2, d3);
        if (hctFrom.getChroma() < d2) {
            double chroma = hctFrom.getChroma();
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 93;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            Hct hct = hctFrom;
            double dMax = chroma;
            d4 = d3;
            while (hct.getChroma() < d2) {
                double d5 = d4 + (z ? -1.0d : 1.0d);
                Hct hctFrom2 = Hct.from(d, d2, d5);
                if (dMax <= hctFrom2.getChroma()) {
                    int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 39;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
                    if (i4 % 2 != 0) {
                        if (Math.abs(hctFrom2.getChroma() + d2) < 0.4d) {
                        }
                        if (Math.abs(hctFrom2.getChroma() - d2) < Math.abs(hct.getChroma() - d2)) {
                            hct = hctFrom2;
                        }
                        dMax = Math.max(dMax, hctFrom2.getChroma());
                        d4 = d5;
                    } else {
                        if (Math.abs(hctFrom2.getChroma() - d2) < 0.4d) {
                        }
                        if (Math.abs(hctFrom2.getChroma() - d2) < Math.abs(hct.getChroma() - d2)) {
                            hct = hctFrom2;
                        }
                        dMax = Math.max(dMax, hctFrom2.getChroma());
                        d4 = d5;
                    }
                }
                return d5;
            }
        }
        d4 = d3;
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        int i6 = i5 % 2;
        return d4;
    }

    static double performAlbers(Hct hct, DynamicScheme dynamicScheme) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 37;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        Hct hctInViewingConditions = hct.inViewingConditions(viewingConditionsForAlbers(dynamicScheme));
        if (DynamicColor.tonePrefersLightForeground(hct.getTone())) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 43;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            int i5 = i4 % 2;
            if (!DynamicColor.toneAllowsLightForeground(hctInViewingConditions.getTone())) {
                return DynamicColor.enableLightForeground(hct.getTone());
            }
        }
        return DynamicColor.enableLightForeground(hctInViewingConditions.getTone());
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r6, int r7, byte r8) {
        /*
            byte[] r0 = com.google.android.material.color.utilities.MaterialDynamicColors.$$c
            int r8 = 120 - r8
            int r7 = r7 * 3
            int r7 = r7 + 4
            int r6 = r6 * 4
            int r1 = 1 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            int r6 = 0 - r6
            if (r0 != 0) goto L17
            r3 = r6
            r8 = r7
            r4 = r2
            goto L2c
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            r4 = r0[r7]
            int r3 = r3 + 1
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r7 = r7 + r3
            int r8 = r8 + 1
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.color.utilities.MaterialDynamicColors.$$g(short, int, byte):java.lang.String");
    }
}
