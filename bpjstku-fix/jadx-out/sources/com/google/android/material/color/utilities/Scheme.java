package com.google.android.material.color.utilities;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import defpackage.SessionConfigValidatingBuilderExternalSyntheticLambda0;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes6.dex */
public class Scheme {
    private static short[] TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private int background;
    private int error;
    private int errorContainer;
    private int inverseOnSurface;
    private int inversePrimary;
    private int inverseSurface;
    private int onBackground;
    private int onError;
    private int onErrorContainer;
    private int onPrimary;
    private int onPrimaryContainer;
    private int onSecondary;
    private int onSecondaryContainer;
    private int onSurface;
    private int onSurfaceVariant;
    private int onTertiary;
    private int onTertiaryContainer;
    private int outline;
    private int outlineVariant;
    private int primary;
    private int primaryContainer;
    private int scrim;
    private int secondary;
    private int secondaryContainer;
    private int shadow;
    private int surface;
    private int surfaceVariant;
    private int tertiary;
    private int tertiaryContainer;
    private static final byte[] $$c = {14, 70, 6, -35};
    private static final int $$f = 23;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {111, 40, 23, -13, 2, 31, -21, 54, 15, 12, 21, 15, -30, 57, 19, 11, 4, 35, -64, 64, 49, 4, 27, 5, 22, 15, -14, 33, 40, 4, 8, 25, 22, -30, 60, -1, 22, 22, 8, 25, 22, -2, 23, 21, 6, 21, 21, 9, -14, 53, 8, 22, 5, 35, 1, 29, -49, 49, 4, 27, 5, 22, 15, -14, 33, 40, 4, 8, 25, 22, -30, 60, -1, 22, 22, 8, 25, 22, -2, 23, 21, 6, 21, 21, 9, -14, 53, 8, 22, 5, 35, 1, 29, -49};
    private static final int $$e = 169;
    private static final byte[] $$a = {25, -93, -120, -48, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
    private static final int $$b = 42;
    private static int asInterface = 0;
    private static int asBinder = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 382296418;
    private static int b = -1934795533;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1495543272;
    private static byte[] TuitionPaymentFragmentbindingInflater1 = {-108, 104, -97, -75, 74, -108, 109, -99, 102, -70, -71, 39, -104, -35, 86, 103, 102, 97, -110, 106, -111, 87, -85, 90, -89, -92, 83, -68, 65, 80, 93, -84, -96, 90, -88, -126, 123, -117, 112, -84, -81, 77, 115, -121, ByteCompanionObject.MAX_VALUE, -76, 71, 97, -97, 125, 65, -75, 108, -101, -75, 82, 89, -113, 69, 75, -75, 70, 73, 65, -69, -26, -26, -26, -26};

    private static void a(short s, int i, short s2, Object[] objArr) {
        int i2 = (s2 * 52) + 4;
        int i3 = 84 - (i * 3);
        int i4 = s * 15;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[53 - i4];
        int i5 = 52 - i4;
        int i6 = -1;
        if (bArr == null) {
            i3 = (i5 + (-i3)) - 11;
            i2++;
            i6 = -1;
        }
        while (true) {
            int i7 = i6 + 1;
            bArr2[i7] = (byte) i3;
            if (i7 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i3 = (i3 + (-bArr[i2])) - 11;
            i2++;
            i6 = i7;
        }
    }

    private static void d(short s, short s2, byte b2, Object[] objArr) {
        int i = (s * 31) + 84;
        int i2 = 57 - (b2 * 53);
        int i3 = s2 * 16;
        byte[] bArr = $$d;
        byte[] bArr2 = new byte[i3 + 38];
        int i4 = i3 + 37;
        int i5 = -1;
        if (bArr == null) {
            i = (i4 + i2) - 16;
            i2++;
            i5 = -1;
        }
        while (true) {
            int i6 = i5 + 1;
            bArr2[i6] = (byte) i;
            if (i6 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i7 = i2;
            i = (i + bArr[i2]) - 16;
            i2 = i7 + 1;
            i5 = i6;
        }
    }

    public Scheme() {
    }

    public Scheme(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, int i29) {
        this.primary = i;
        this.onPrimary = i2;
        this.primaryContainer = i3;
        this.onPrimaryContainer = i4;
        this.secondary = i5;
        this.onSecondary = i6;
        this.secondaryContainer = i7;
        this.onSecondaryContainer = i8;
        this.tertiary = i9;
        this.onTertiary = i10;
        this.tertiaryContainer = i11;
        this.onTertiaryContainer = i12;
        this.error = i13;
        this.onError = i14;
        this.errorContainer = i15;
        this.onErrorContainer = i16;
        this.background = i17;
        this.onBackground = i18;
        this.surface = i19;
        this.onSurface = i20;
        this.surfaceVariant = i21;
        this.onSurfaceVariant = i22;
        this.outline = i23;
        this.outlineVariant = i24;
        this.shadow = i25;
        this.scrim = i26;
        this.inverseSurface = i27;
        this.inverseOnSurface = i28;
        this.inversePrimary = i29;
    }

    public static Scheme light(int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 75;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        Scheme schemeLightFromCorePalette = lightFromCorePalette(CorePalette.of(i));
        if (i4 != 0) {
            int i5 = 53 / 0;
        }
        return schemeLightFromCorePalette;
    }

    public static Scheme dark(int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 95;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        Scheme schemeDarkFromCorePalette = darkFromCorePalette(CorePalette.of(i));
        int i5 = asBinder + 9;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            return schemeDarkFromCorePalette;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static Scheme lightContent(int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 123;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        CorePalette corePaletteContentOf = CorePalette.contentOf(i);
        if (i4 == 0) {
            lightFromCorePalette(corePaletteContentOf);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Scheme schemeLightFromCorePalette = lightFromCorePalette(corePaletteContentOf);
        int i5 = asBinder + 59;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 69 / 0;
        }
        return schemeLightFromCorePalette;
    }

    public static Scheme darkContent(int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 97;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        Scheme schemeDarkFromCorePalette = darkFromCorePalette(CorePalette.contentOf(i));
        int i5 = asBinder + 11;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            return schemeDarkFromCorePalette;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static Scheme lightFromCorePalette(CorePalette corePalette) {
        int i = 2 % 2;
        Scheme schemeWithInversePrimary = new Scheme().withPrimary(corePalette.a1.tone(40)).withOnPrimary(corePalette.a1.tone(100)).withPrimaryContainer(corePalette.a1.tone(90)).withOnPrimaryContainer(corePalette.a1.tone(10)).withSecondary(corePalette.a2.tone(40)).withOnSecondary(corePalette.a2.tone(100)).withSecondaryContainer(corePalette.a2.tone(90)).withOnSecondaryContainer(corePalette.a2.tone(10)).withTertiary(corePalette.a3.tone(40)).withOnTertiary(corePalette.a3.tone(100)).withTertiaryContainer(corePalette.a3.tone(90)).withOnTertiaryContainer(corePalette.a3.tone(10)).withError(corePalette.error.tone(40)).withOnError(corePalette.error.tone(100)).withErrorContainer(corePalette.error.tone(90)).withOnErrorContainer(corePalette.error.tone(10)).withBackground(corePalette.n1.tone(99)).withOnBackground(corePalette.n1.tone(10)).withSurface(corePalette.n1.tone(99)).withOnSurface(corePalette.n1.tone(10)).withSurfaceVariant(corePalette.n2.tone(90)).withOnSurfaceVariant(corePalette.n2.tone(30)).withOutline(corePalette.n2.tone(50)).withOutlineVariant(corePalette.n2.tone(80)).withShadow(corePalette.n1.tone(0)).withScrim(corePalette.n1.tone(0)).withInverseSurface(corePalette.n1.tone(20)).withInverseOnSurface(corePalette.n1.tone(95)).withInversePrimary(corePalette.a1.tone(80));
        int i2 = asInterface + 63;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 35 / 0;
        }
        return schemeWithInversePrimary;
    }

    private static Scheme darkFromCorePalette(CorePalette corePalette) {
        int i = 2 % 2;
        Scheme schemeWithInversePrimary = new Scheme().withPrimary(corePalette.a1.tone(80)).withOnPrimary(corePalette.a1.tone(20)).withPrimaryContainer(corePalette.a1.tone(30)).withOnPrimaryContainer(corePalette.a1.tone(90)).withSecondary(corePalette.a2.tone(80)).withOnSecondary(corePalette.a2.tone(20)).withSecondaryContainer(corePalette.a2.tone(30)).withOnSecondaryContainer(corePalette.a2.tone(90)).withTertiary(corePalette.a3.tone(80)).withOnTertiary(corePalette.a3.tone(20)).withTertiaryContainer(corePalette.a3.tone(30)).withOnTertiaryContainer(corePalette.a3.tone(90)).withError(corePalette.error.tone(80)).withOnError(corePalette.error.tone(20)).withErrorContainer(corePalette.error.tone(30)).withOnErrorContainer(corePalette.error.tone(80)).withBackground(corePalette.n1.tone(10)).withOnBackground(corePalette.n1.tone(90)).withSurface(corePalette.n1.tone(10)).withOnSurface(corePalette.n1.tone(90)).withSurfaceVariant(corePalette.n2.tone(30)).withOnSurfaceVariant(corePalette.n2.tone(80)).withOutline(corePalette.n2.tone(60)).withOutlineVariant(corePalette.n2.tone(30)).withShadow(corePalette.n1.tone(0)).withScrim(corePalette.n1.tone(0)).withInverseSurface(corePalette.n1.tone(90)).withInverseOnSurface(corePalette.n1.tone(20)).withInversePrimary(corePalette.a1.tone(40));
        int i2 = asInterface + 45;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return schemeWithInversePrimary;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int getPrimary() {
        int i = 2 % 2;
        int i2 = asInterface + 61;
        int i3 = i2 % 128;
        asBinder = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i4 = this.primary;
        int i5 = i3 + 9;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            return i4;
        }
        obj.hashCode();
        throw null;
    }

    public void setPrimary(int i) {
        int i2 = 2 % 2;
        int i3 = asInterface;
        int i4 = i3 + 117;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        this.primary = i;
        if (i5 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = i3 + 47;
        asBinder = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 75 / 0;
        }
    }

    public Scheme withPrimary(int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 29;
        int i4 = i3 % 128;
        asInterface = i4;
        int i5 = i3 % 2;
        this.primary = i;
        int i6 = i4 + 61;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
        return this;
    }

    public int getOnPrimary() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 45;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.onPrimary;
        int i6 = i2 + 39;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public void setOnPrimary(int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 111;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        this.onPrimary = i;
        if (i4 == 0) {
            int i5 = 31 / 0;
        }
    }

    public Scheme withOnPrimary(int i) {
        int i2 = 2 % 2;
        int i3 = asInterface;
        int i4 = i3 + 45;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        this.onPrimary = i;
        int i6 = i3 + 91;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
        return this;
    }

    private static void c(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
        boolean z;
        long j;
        int i4;
        boolean z2;
        int length;
        byte[] bArr;
        int i5 = 2 % 2;
        SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(b)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                byte b3 = (byte) 0;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 2267 - TextUtils.getOffsetBefore("", 0), Gravity.getAbsoluteGravity(0, 0) + 33, 1387473586, false, $$g(b3, b3, (byte) $$c.length), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i6 = $10 + 21;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                z = true;
            } else {
                z = false;
            }
            long j2 = 0;
            if (z) {
                int i8 = $10 + 71;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                byte[] bArr2 = TuitionPaymentFragmentbindingInflater1;
                if (bArr2 != null) {
                    int length2 = bArr2.length;
                    byte[] bArr3 = new byte[length2];
                    int i10 = 0;
                    while (i10 < length2) {
                        Object[] objArr3 = {Integer.valueOf(bArr2[i10])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) View.MeasureSpec.makeMeasureSpec(0, 0), (Process.getElapsedCpuTime() > j2 ? 1 : (Process.getElapsedCpuTime() == j2 ? 0 : -1)) + 3357, (-16777198) - Color.rgb(0, 0, 0), -1054011043, false, $$g(b4, b5, b5), new Class[]{Integer.TYPE});
                        }
                        bArr3[i10] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                        i10++;
                        j2 = 0;
                    }
                    bArr2 = bArr3;
                }
                if (bArr2 != null) {
                    byte[] bArr4 = TuitionPaymentFragmentbindingInflater1;
                    Object[] objArr4 = {Integer.valueOf(i3), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b6 = (byte) 0;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (KeyEvent.getMaxKeyCode() >> 16), 2267 - KeyEvent.normalizeMetaState(0), 33 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 1387473586, false, $$g(b6, b6, (byte) $$c.length), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr4[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) b) ^ 3046761265686732006L)));
                    j = 3046761265686732006L;
                } else {
                    j = 3046761265686732006L;
                    iIntValue = (short) (((short) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2[i3 + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) b) ^ 3046761265686732006L)));
                }
            } else {
                j = 3046761265686732006L;
            }
            if (iIntValue > 0) {
                int i11 = ((i3 + iIntValue) - 2) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ j));
                if (z) {
                    int i12 = $11 + 67;
                    $10 = i12 % 128;
                    int i13 = i12 % 2;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i11 + i4;
                Object[] objArr5 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3), sb};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b7 = (byte) 0;
                    byte b8 = b7;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (55904 - TextUtils.indexOf("", "")), TextUtils.indexOf("", "", 0) + 2855, 12 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), -1529949196, false, $$g(b7, b8, (byte) (b8 + 3)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                byte[] bArr5 = TuitionPaymentFragmentbindingInflater1;
                if (bArr5 != null) {
                    int i14 = $11 + 25;
                    $10 = i14 % 128;
                    if (i14 % 2 != 0) {
                        length = bArr5.length;
                        bArr = new byte[length];
                    } else {
                        length = bArr5.length;
                        bArr = new byte[length];
                    }
                    for (int i15 = 0; i15 < length; i15++) {
                        int i16 = $11 + 107;
                        $10 = i16 % 128;
                        int i17 = i16 % 2;
                        bArr[i15] = (byte) (((long) bArr5[i15]) ^ 3046761265686732006L);
                    }
                    bArr5 = bArr;
                }
                if (bArr5 != null) {
                    int i18 = $11 + 3;
                    $10 = i18 % 128;
                    int i19 = i18 % 2;
                    z2 = true;
                } else {
                    z2 = false;
                }
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                    if (z2) {
                        int i20 = $10 + 125;
                        $11 = i20 % 128;
                        int i21 = i20 % 2;
                        byte[] bArr6 = TuitionPaymentFragmentbindingInflater1;
                        int i22 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i22 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr6[i22]) ^ 3046761265686732006L)) + s)) ^ b2));
                    } else {
                        short[] sArr = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        int i23 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i23 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i23]) ^ 3046761265686732006L)) + s)) ^ b2));
                    }
                    sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                    int i24 = $10 + 105;
                    $11 = i24 % 128;
                    int i25 = i24 % 2;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public int getPrimaryContainer() {
        int i = 2 % 2;
        int i2 = asInterface + 67;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return this.primaryContainer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setPrimaryContainer(int i) {
        int i2 = 2 % 2;
        int i3 = asInterface;
        int i4 = i3 + 1;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        this.primaryContainer = i;
        int i6 = i3 + 91;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
    }

    public Scheme withPrimaryContainer(int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 53;
        int i4 = i3 % 128;
        asInterface = i4;
        int i5 = i3 % 2;
        Object obj = null;
        this.primaryContainer = i;
        if (i5 != 0) {
            obj.hashCode();
            throw null;
        }
        int i6 = i4 + 45;
        asBinder = i6 % 128;
        if (i6 % 2 != 0) {
            return this;
        }
        obj.hashCode();
        throw null;
    }

    public int getOnPrimaryContainer() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 117;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.onPrimaryContainer;
        int i6 = i2 + 105;
        asInterface = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        throw null;
    }

    public void setOnPrimaryContainer(int i) throws IllegalAccessException {
        int i2 = 2 % 2;
        int i3 = asBinder + 105;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1096626159);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 46400), 39 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), KeyEvent.normalizeMetaState(0) + 19, 1513912262, false, "b", null);
        }
        int i5 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-914723831);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (37836 - Gravity.getAbsoluteGravity(0, 0)), Process.getGidForName("") + 60, 17 - ((byte) KeyEvent.getModifierMetaStateMask()), 769969118, false, "TuitionPaymentFragmentbindingInflater1", null);
        }
        int i6 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(null);
        long j = i6;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-639884696);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 37836), Drawable.resolveOpacity(0, 0) + 59, 19 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 1027769791, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
        }
        int i7 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).getInt(null);
        long j2 = -68;
        long j3 = -1;
        long j4 = 4287949484169086701L ^ j3;
        long j5 = j3 ^ 1231304012990699538L;
        long jIdentityHashCode = System.identityHashCode(this);
        long j6 = jIdentityHashCode ^ j3;
        long j7 = (((long) 69) * 4287949484169086701L) + (((long) (-67)) * 1231304012990699538L) + (((((j4 | j5) | j6) ^ j3) | (4294177296811024127L ^ j3) | ((jIdentityHashCode | 1231304012990699538L) ^ j3)) * j2) + (j2 * (((j4 | j6) | 1231304012990699538L) ^ j3)) + (((long) 68) * (((j5 | j6) ^ j3) | j4));
        int i8 = asBinder + 37;
        asInterface = i8 % 128;
        int i9 = i8 % 2;
        int i10 = 0;
        while (true) {
            for (int i11 = 0; i11 != 8; i11++) {
                i7 = (((((int) (j >> i11)) & 255) + (i7 << 6)) + (i7 << 16)) - i7;
            }
            if (i10 != 0) {
                break;
            }
            i10++;
            j = j7;
        }
        if (i7 != i5) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551937752);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (View.resolveSize(0, 0) + 46400), 39 - TextUtils.lastIndexOf("", '0'), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 19, -1205987569, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault2", null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null);
            throw new RuntimeException(String.valueOf(i6));
        }
        this.onPrimaryContainer = i;
    }

    public Scheme withOnPrimaryContainer(int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 45;
        int i4 = i3 % 128;
        asInterface = i4;
        int i5 = i3 % 2;
        this.onPrimaryContainer = i;
        if (i5 != 0) {
            throw null;
        }
        int i6 = i4 + 29;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
        return this;
    }

    public int getSecondary() {
        int i = 2 % 2;
        int i2 = asInterface + 67;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        int i5 = this.secondary;
        int i6 = i3 + 13;
        asInterface = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        throw null;
    }

    public void setSecondary(int i) {
        int i2 = 2 % 2;
        int i3 = asInterface;
        int i4 = i3 + 5;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        this.secondary = i;
        int i6 = i3 + 107;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
    }

    public Scheme withSecondary(int i) {
        int i2 = 2 % 2;
        int i3 = asInterface;
        int i4 = i3 + 3;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        this.secondary = i;
        int i6 = i3 + 47;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
        return this;
    }

    public int getOnSecondary() {
        int i = 2 % 2;
        int i2 = asBinder + 123;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.onSecondary;
        if (i3 != 0) {
            int i5 = 83 / 0;
        }
        return i4;
    }

    public void setOnSecondary(int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 23;
        int i4 = i3 % 128;
        asInterface = i4;
        int i5 = i3 % 2;
        this.onSecondary = i;
        int i6 = i4 + 89;
        asBinder = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 64 / 0;
        }
    }

    public Scheme withOnSecondary(int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 33;
        int i4 = i3 % 128;
        asBinder = i4;
        int i5 = i3 % 2;
        this.onSecondary = i;
        int i6 = i4 + 7;
        asInterface = i6 % 128;
        if (i6 % 2 == 0) {
            return this;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int getSecondaryContainer() {
        int i;
        int i2 = 2 % 2;
        int i3 = asBinder + 43;
        int i4 = i3 % 128;
        asInterface = i4;
        if (i3 % 2 != 0) {
            i = this.secondaryContainer;
            int i5 = 36 / 0;
        } else {
            i = this.secondaryContainer;
        }
        int i6 = i4 + 35;
        asBinder = i6 % 128;
        if (i6 % 2 != 0) {
            return i;
        }
        throw null;
    }

    public void setSecondaryContainer(int i) {
        int i2 = 2 % 2;
        int i3 = asBinder;
        int i4 = i3 + 25;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        this.secondaryContainer = i;
        int i6 = i3 + 119;
        asInterface = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Scheme withSecondaryContainer(int i) {
        int i2 = 2 % 2;
        int i3 = asInterface;
        int i4 = i3 + 49;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        this.secondaryContainer = i;
        int i6 = i3 + 119;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
        return this;
    }

    public int getOnSecondaryContainer() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 29;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.onSecondaryContainer;
        int i6 = i2 + 21;
        asBinder = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        throw null;
    }

    public void setOnSecondaryContainer(int i) {
        int i2 = 2 % 2;
        int i3 = asBinder;
        int i4 = i3 + 21;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        this.onSecondaryContainer = i;
        int i6 = i3 + 97;
        asInterface = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 68 / 0;
        }
    }

    public Scheme withOnSecondaryContainer(int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 13;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        this.onSecondaryContainer = i;
        if (i4 != 0) {
            return this;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int getTertiary() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char threadPriority = (char) (43042 - ((Process.getThreadPriority(0) + 20) >> 6));
            int i2 = 3112 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
            int iResolveSizeAndState = 22 - View.resolveSizeAndState(0, 0, 0);
            byte b2 = $$a[7];
            byte b3 = b2;
            Object[] objArr2 = new Object[1];
            a(b2, b3, b3, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(threadPriority, i2, iResolveSizeAndState, -1272852037, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(712413011 - TextUtils.getOffsetBefore("", 0), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1, (short) (ViewConfiguration.getJumpTapTimeout() >> 16), (byte) (View.combineMeasuredStates(0, 0) + 122), 1704706683 - TextUtils.lastIndexOf("", '0', 0, 0), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(712413016 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), ((byte) KeyEvent.getModifierMetaStateMask()) - 5, (short) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), (byte) (TextUtils.lastIndexOf("", '0', 0) + 74), 1704706706 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cKeyCodeFromString = (char) (KeyEvent.keyCodeFromString("") + 43042);
            int iIndexOf = 3110 - TextUtils.indexOf((CharSequence) "", '0', 0);
            int touchSlop = 22 - (ViewConfiguration.getTouchSlop() >> 8);
            byte[] bArr = $$a;
            byte b4 = bArr[7];
            Object[] objArr5 = new Object[1];
            a(b4, b4, bArr[5], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cKeyCodeFromString, iIndexOf, touchSlop, -1269618118, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i3 = asBinder + 67;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char mirror = (char) (43090 - AndroidCharacter.getMirror('0'));
                int minimumFlingVelocity = 3111 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                int capsMode = 22 - TextUtils.getCapsMode("", 0, 0);
                byte[] bArr2 = $$a;
                Object[] objArr6 = new Object[1];
                a(bArr2[5], bArr2[7], bArr2[40], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(mirror, minimumFlingVelocity, capsMode, 154975793, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i5 = ((int[]) objArr7[2])[0];
            int i6 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[3];
            int[] iArr = {i5};
            int[] iArr2 = {i6};
            int iIdentityHashCode = System.identityHashCode(this);
            int i7 = ~((-1564129732) | iIdentityHashCode);
            int i8 = ~iIdentityHashCode;
            int i9 = i7 | (~(140901727 | i8));
            int i10 = ~(1564129731 | i8);
            int i11 = 1651273906 + ((i9 | i10) * (-516)) + (((~(iIdentityHashCode | (-136362308))) | (~((-4539421) | i8))) * 516) + ((4539420 | i10) * 516) + 1899453846;
            int i12 = (i11 << 13) ^ i11;
            int i13 = i12 ^ (i12 >>> 17);
            ((int[]) objArr[0])[0] = i13 ^ (i13 << 5);
            objArr = new Object[]{new int[1], iArr2, iArr, strArr};
        } else {
            Object[] objArr8 = new Object[1];
            c((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 712413020, (-5) - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (short) (ViewConfiguration.getEdgeSlop() >> 16), (byte) (((Process.getThreadPriority(0) + 20) >> 6) + 108), 1704706719 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(712413019 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (-6) - Process.getGidForName(""), (short) ((-1) - ExpandableListView.getPackedPositionChild(0L)), (byte) ((-90) - Color.blue(0)), 1704706734 - Color.green(0), objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            int i14 = asBinder + 63;
            asInterface = i14 % 128;
            int i15 = i14 % 2;
            try {
                Object[] objArr10 = {null, Integer.valueOf(iIntValue), 0, 1899453846};
                byte[] bArr3 = $$d;
                byte b5 = bArr3[54];
                byte b6 = b5;
                Object[] objArr11 = new Object[1];
                d(b5, b6, b6, objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                byte b7 = (byte) (bArr3[54] - 1);
                byte b8 = b7;
                Object[] objArr12 = new Object[1];
                d(b7, b8, b8, objArr12);
                objArr = (Object[]) cls3.getMethod((String) objArr12[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char modifierMetaStateMask = (char) (43041 - ((byte) KeyEvent.getModifierMetaStateMask()));
                    int packedPositionType = 3111 - ExpandableListView.getPackedPositionType(0L);
                    int i16 = 22 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    byte[] bArr4 = $$a;
                    Object[] objArr13 = new Object[1];
                    a(bArr4[5], bArr4[7], bArr4[40], objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(modifierMetaStateMask, packedPositionType, i16, 154975793, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    c(View.combineMeasuredStates(0, 0) + 712413011, (ViewConfiguration.getWindowTouchSlop() >> 8) + 1, (short) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (byte) (122 - TextUtils.getCapsMode("", 0, 0)), 1704706684 - TextUtils.getOffsetBefore("", 0), objArr14);
                    Class<?> cls4 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    c(712413016 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (-6) - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (short) (TextUtils.indexOf((CharSequence) "", '0') + 1), (byte) (72 - ImageFormat.getBitsPerPixel(0)), 1704706705 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr15);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char c = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 43041);
                        int gidForName = Process.getGidForName("") + 3112;
                        int iRed = Color.red(0) + 22;
                        byte[] bArr5 = $$a;
                        byte b9 = bArr5[7];
                        Object[] objArr16 = new Object[1];
                        a(b9, b9, bArr5[5], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, gidForName, iRed, -1269618118, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c2 = (char) (43042 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                        int iArgb = Color.argb(0, 0, 0, 0) + 3111;
                        int i17 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 21;
                        byte b10 = $$a[7];
                        byte b11 = b10;
                        Object[] objArr17 = new Object[1];
                        a(b10, b11, b11, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, iArgb, i17, -1272852037, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
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
        int i19 = ((int[]) objArr[2])[0];
        if (i19 == i18) {
            int i20 = ((int[]) objArr[0])[0];
            int i21 = ((int[]) objArr[2])[0];
            int i22 = ((int[]) objArr[1])[0];
            String[] strArr2 = (String[]) objArr[3];
            int[] iArr3 = {i21};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i23 = ~iIdentityHashCode2;
            int i24 = i20 + (-73590875) + (((~((-178051851) | i23)) | (~(iIdentityHashCode2 | 1526979608))) * 333) + (((~(iIdentityHashCode2 | (-178051851))) | (~(i23 | 1526979608))) * 333);
            int i25 = (i24 << 13) ^ i24;
            int i26 = i25 ^ (i25 >>> 17);
            ((int[]) objArr[0])[0] = i26 ^ (i26 << 5);
            Object[] objArr18 = {new int[1], new int[]{i22}, iArr3, strArr2};
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[3];
            if (strArr3 != null) {
                int i27 = 0;
                while (i27 < strArr3.length) {
                    arrayList.add(strArr3[i27]);
                    i27++;
                    int i28 = asInterface + 9;
                    asBinder = i28 % 128;
                    int i29 = i28 % 2;
                }
            }
            int[] iArr4 = new int[i19];
            int i30 = i19 - 1;
            iArr4[i30] = 1;
            Toast.makeText((Context) null, iArr4[((i19 * i30) % 2) - 1], 1).show();
            int i31 = ((int[]) objArr[0])[0];
            int i32 = ((int[]) objArr[2])[0];
            int i33 = ((int[]) objArr[1])[0];
            String[] strArr4 = (String[]) objArr[3];
            int[] iArr5 = {i32};
            int iIdentityHashCode3 = System.identityHashCode(this);
            int i34 = ~iIdentityHashCode3;
            int i35 = i31 + (-1984962272) + (((~((-1337522217) | i34)) | 367509242) * 226) + (((~(i34 | (-1243103233))) | (~((-367509243) | iIdentityHashCode3)) | 273090258) * (-113)) + ((~(iIdentityHashCode3 | (-1337522217))) * 113);
            int i36 = (i35 << 13) ^ i35;
            int i37 = i36 ^ (i36 >>> 17);
            ((int[]) objArr[0])[0] = i37 ^ (i37 << 5);
            Object[] objArr19 = {new int[1], new int[]{i33}, iArr5, strArr4};
        }
        return this.tertiary;
    }

    public void setTertiary(int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 43;
        int i4 = i3 % 128;
        asInterface = i4;
        int i5 = i3 % 2;
        this.tertiary = i;
        if (i5 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = i4 + 29;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
    }

    public Scheme withTertiary(int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 91;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        this.tertiary = i;
        if (i4 == 0) {
            return this;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int getOnTertiary() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 103;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.onTertiary;
        int i6 = i2 + 109;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public void setOnTertiary(int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 3;
        int i4 = i3 % 128;
        asInterface = i4;
        int i5 = i3 % 2;
        this.onTertiary = i;
        if (i5 != 0) {
            throw null;
        }
        int i6 = i4 + 111;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
    }

    public Scheme withOnTertiary(int i) {
        int i2 = 2 % 2;
        int i3 = asInterface;
        int i4 = i3 + 95;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        this.onTertiary = i;
        int i6 = i3 + 103;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
        return this;
    }

    public int getTertiaryContainer() {
        int i = 2 % 2;
        int i2 = asBinder + 27;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return this.tertiaryContainer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setTertiaryContainer(int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 41;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        this.tertiaryContainer = i;
        if (i4 != 0) {
            throw null;
        }
    }

    public Scheme withTertiaryContainer(int i) {
        int i2 = 2 % 2;
        int i3 = asBinder;
        int i4 = i3 + 49;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        this.tertiaryContainer = i;
        int i6 = i3 + 111;
        asInterface = i6 % 128;
        if (i6 % 2 == 0) {
            return this;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int getOnTertiaryContainer() {
        int i = 2 % 2;
        int i2 = asBinder + 83;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        int i5 = this.onTertiaryContainer;
        int i6 = i3 + 81;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public void setOnTertiaryContainer(int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 45;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        this.onTertiaryContainer = i;
        if (i4 != 0) {
            int i5 = 30 / 0;
        }
    }

    public Scheme withOnTertiaryContainer(int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 33;
        int i4 = i3 % 128;
        asInterface = i4;
        int i5 = i3 % 2;
        this.onTertiaryContainer = i;
        int i6 = i4 + 21;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
        return this;
    }

    public int getError() {
        int i = 2 % 2;
        int i2 = asInterface + 81;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return this.error;
        }
        throw null;
    }

    public void setError(int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 119;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        this.error = i;
        if (i4 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Scheme withError(int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 101;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        this.error = i;
        if (i4 == 0) {
            int i5 = 92 / 0;
        }
        return this;
    }

    public int getOnError() {
        int i = 2 % 2;
        int i2 = asBinder + 55;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        int i5 = this.onError;
        int i6 = i3 + 9;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public void setOnError(int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 113;
        int i4 = i3 % 128;
        asBinder = i4;
        int i5 = i3 % 2;
        this.onError = i;
        if (i5 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = i4 + 95;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
    }

    public Scheme withOnError(int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 13;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        this.onError = i;
        if (i4 != 0) {
            int i5 = 42 / 0;
        }
        return this;
    }

    public int getErrorContainer() {
        int i = 2 % 2;
        int i2 = asInterface + 29;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        int i5 = this.errorContainer;
        int i6 = i3 + 75;
        asInterface = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        throw null;
    }

    public void setErrorContainer(int i) {
        int i2 = 2 % 2;
        int i3 = asBinder;
        int i4 = i3 + 53;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        this.errorContainer = i;
        int i6 = i3 + 121;
        asInterface = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 66 / 0;
        }
    }

    public Scheme withErrorContainer(int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 41;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        this.errorContainer = i;
        if (i4 != 0) {
            return this;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int getOnErrorContainer() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 13;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.onErrorContainer;
        int i6 = i2 + 55;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public void setOnErrorContainer(int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 105;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        this.onErrorContainer = i;
        if (i4 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Scheme withOnErrorContainer(int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 41;
        int i4 = i3 % 128;
        asInterface = i4;
        int i5 = i3 % 2;
        this.onErrorContainer = i;
        int i6 = i4 + 97;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
        return this;
    }

    public int getBackground() {
        int i = 2 % 2;
        int i2 = asBinder + 79;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        int i5 = this.background;
        int i6 = i3 + 69;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public void setBackground(int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 43;
        int i4 = i3 % 128;
        asBinder = i4;
        int i5 = i3 % 2;
        this.background = i;
        int i6 = i4 + 43;
        asInterface = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 10 / 0;
        }
    }

    public Scheme withBackground(int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 1;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        this.background = i;
        if (i4 != 0) {
            return this;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int getOnBackground() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 63;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.onBackground;
        int i6 = i2 + 35;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public void setOnBackground(int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 71;
        int i4 = i3 % 128;
        asBinder = i4;
        int i5 = i3 % 2;
        this.onBackground = i;
        int i6 = i4 + 117;
        asInterface = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    public Scheme withOnBackground(int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 51;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        this.onBackground = i;
        if (i4 == 0) {
            return this;
        }
        throw null;
    }

    public int getSurface() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 51;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.surface;
        int i6 = i2 + 119;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public void setSurface(int i) {
        int i2 = 2 % 2;
        int i3 = asBinder;
        int i4 = i3 + 101;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        this.surface = i;
        int i6 = i3 + 85;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
    }

    public Scheme withSurface(int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 109;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        this.surface = i;
        if (i4 == 0) {
            return this;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int getOnSurface() {
        int i = 2 % 2;
        int i2 = asInterface + 67;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onSurface;
        }
        throw null;
    }

    public void setOnSurface(int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 91;
        int i4 = i3 % 128;
        asInterface = i4;
        int i5 = i3 % 2;
        this.onSurface = i;
        if (i5 != 0) {
            throw null;
        }
        int i6 = i4 + 97;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
    }

    public Scheme withOnSurface(int i) {
        int i2 = 2 % 2;
        int i3 = asBinder;
        int i4 = i3 + 11;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        this.onSurface = i;
        if (i5 != 0) {
            throw null;
        }
        int i6 = i3 + 81;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
        return this;
    }

    public int getSurfaceVariant() {
        int i = 2 % 2;
        int i2 = asInterface + 103;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.surfaceVariant;
        if (i3 == 0) {
            int i5 = 43 / 0;
        }
        return i4;
    }

    public void setSurfaceVariant(int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 105;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        this.surfaceVariant = i;
        if (i4 != 0) {
            int i5 = 85 / 0;
        }
    }

    public Scheme withSurfaceVariant(int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 19;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        this.surfaceVariant = i;
        if (i4 == 0) {
            int i5 = 51 / 0;
        }
        return this;
    }

    public int getOnSurfaceVariant() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 111;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i4 = this.onSurfaceVariant;
        int i5 = i2 + 95;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public void setOnSurfaceVariant(int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 79;
        int i4 = i3 % 128;
        asBinder = i4;
        int i5 = i3 % 2;
        this.onSurfaceVariant = i;
        if (i5 == 0) {
            throw null;
        }
        int i6 = i4 + 67;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
    }

    public Scheme withOnSurfaceVariant(int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 93;
        int i4 = i3 % 128;
        asBinder = i4;
        int i5 = i3 % 2;
        this.onSurfaceVariant = i;
        int i6 = i4 + 27;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
        return this;
    }

    public int getOutline() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 53;
        asInterface = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i4 = this.outline;
        int i5 = i2 + 119;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            return i4;
        }
        obj.hashCode();
        throw null;
    }

    public void setOutline(int i) {
        int i2 = 2 % 2;
        int i3 = asBinder;
        int i4 = i3 + 49;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        this.outline = i;
        if (i5 != 0) {
            throw null;
        }
        int i6 = i3 + 17;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
    }

    public Scheme withOutline(int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 125;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        this.outline = i;
        if (i4 != 0) {
            int i5 = 35 / 0;
        }
        return this;
    }

    public int getOutlineVariant() {
        int i = 2 % 2;
        int i2 = asInterface + 89;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        int i5 = this.outlineVariant;
        int i6 = i3 + 103;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public void setOutlineVariant(int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 103;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        this.outlineVariant = i;
        if (i4 != 0) {
            throw null;
        }
    }

    public Scheme withOutlineVariant(int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 35;
        int i4 = i3 % 128;
        asBinder = i4;
        int i5 = i3 % 2;
        this.outlineVariant = i;
        int i6 = i4 + 79;
        asInterface = i6 % 128;
        if (i6 % 2 == 0) {
            return this;
        }
        throw null;
    }

    public int getShadow() {
        int i = 2 % 2;
        int i2 = asInterface + 11;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return this.shadow;
        }
        throw null;
    }

    public void setShadow(int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 73;
        int i4 = i3 % 128;
        asInterface = i4;
        int i5 = i3 % 2;
        this.shadow = i;
        if (i5 != 0) {
            int i6 = 90 / 0;
        }
        int i7 = i4 + 125;
        asBinder = i7 % 128;
        int i8 = i7 % 2;
    }

    public Scheme withShadow(int i) {
        int i2 = 2 % 2;
        int i3 = asBinder;
        int i4 = i3 + 51;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        this.shadow = i;
        int i6 = i3 + 105;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
        return this;
    }

    public int getScrim() {
        int i = 2 % 2;
        int i2 = asBinder + 3;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.scrim;
        if (i3 != 0) {
            int i5 = 53 / 0;
        }
        return i4;
    }

    public void setScrim(int i) {
        int i2 = 2 % 2;
        int i3 = asInterface;
        int i4 = i3 + 27;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        this.scrim = i;
        if (i5 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = i3 + 31;
        asBinder = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 74 / 0;
        }
    }

    public Scheme withScrim(int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 43;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        this.scrim = i;
        if (i4 != 0) {
            int i5 = 33 / 0;
        }
        return this;
    }

    public int getInverseSurface() {
        int i = 2 % 2;
        int i2 = asBinder + 111;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        int i5 = this.inverseSurface;
        int i6 = i3 + 17;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public void setInverseSurface(int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 65;
        int i4 = i3 % 128;
        asBinder = i4;
        int i5 = i3 % 2;
        this.inverseSurface = i;
        if (i5 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = i4 + 21;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
    }

    public Scheme withInverseSurface(int i) {
        int i2 = 2 % 2;
        int i3 = asInterface;
        int i4 = i3 + 33;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        this.inverseSurface = i;
        if (i5 == 0) {
            throw null;
        }
        int i6 = i3 + 75;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
        return this;
    }

    public int getInverseOnSurface() {
        int i = 2 % 2;
        int i2 = asBinder + 67;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return this.inverseOnSurface;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setInverseOnSurface(int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 63;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        this.inverseOnSurface = i;
        if (i4 != 0) {
            throw null;
        }
    }

    public Scheme withInverseOnSurface(int i) {
        int i2 = 2 % 2;
        int i3 = asBinder;
        int i4 = i3 + 75;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        this.inverseOnSurface = i;
        if (i5 != 0) {
            throw null;
        }
        int i6 = i3 + 99;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
        return this;
    }

    public int getInversePrimary() {
        int i = 2 % 2;
        int i2 = asBinder + 107;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        int i5 = this.inversePrimary;
        int i6 = i3 + 63;
        asBinder = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        throw null;
    }

    public void setInversePrimary(int i) {
        int i2 = 2 % 2;
        int i3 = asInterface;
        int i4 = i3 + 81;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        this.inversePrimary = i;
        int i6 = i3 + 87;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
    }

    public Scheme withInversePrimary(int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 113;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        this.inversePrimary = i;
        if (i4 == 0) {
            return this;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("Scheme{primary=");
        sb.append(this.primary);
        sb.append(", onPrimary=");
        sb.append(this.onPrimary);
        sb.append(", primaryContainer=");
        sb.append(this.primaryContainer);
        sb.append(", onPrimaryContainer=");
        sb.append(this.onPrimaryContainer);
        sb.append(", secondary=");
        sb.append(this.secondary);
        sb.append(", onSecondary=");
        sb.append(this.onSecondary);
        sb.append(", secondaryContainer=");
        sb.append(this.secondaryContainer);
        sb.append(", onSecondaryContainer=");
        sb.append(this.onSecondaryContainer);
        sb.append(", tertiary=");
        sb.append(this.tertiary);
        sb.append(", onTertiary=");
        sb.append(this.onTertiary);
        sb.append(", tertiaryContainer=");
        sb.append(this.tertiaryContainer);
        sb.append(", onTertiaryContainer=");
        sb.append(this.onTertiaryContainer);
        sb.append(", error=");
        sb.append(this.error);
        sb.append(", onError=");
        sb.append(this.onError);
        sb.append(", errorContainer=");
        sb.append(this.errorContainer);
        sb.append(", onErrorContainer=");
        sb.append(this.onErrorContainer);
        sb.append(", background=");
        sb.append(this.background);
        sb.append(", onBackground=");
        sb.append(this.onBackground);
        sb.append(", surface=");
        sb.append(this.surface);
        sb.append(", onSurface=");
        sb.append(this.onSurface);
        sb.append(", surfaceVariant=");
        sb.append(this.surfaceVariant);
        sb.append(", onSurfaceVariant=");
        sb.append(this.onSurfaceVariant);
        sb.append(", outline=");
        sb.append(this.outline);
        sb.append(", outlineVariant=");
        sb.append(this.outlineVariant);
        sb.append(", shadow=");
        sb.append(this.shadow);
        sb.append(", scrim=");
        sb.append(this.scrim);
        sb.append(", inverseSurface=");
        sb.append(this.inverseSurface);
        sb.append(", inverseOnSurface=");
        sb.append(this.inverseOnSurface);
        sb.append(", inversePrimary=");
        sb.append(this.inversePrimary);
        sb.append('}');
        String string = sb.toString();
        int i2 = asInterface + 103;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scheme) || !super.equals(obj)) {
            return false;
        }
        Scheme scheme = (Scheme) obj;
        if (this.primary != scheme.primary || this.onPrimary != scheme.onPrimary || this.primaryContainer != scheme.primaryContainer || this.onPrimaryContainer != scheme.onPrimaryContainer || this.secondary != scheme.secondary) {
            return false;
        }
        if (this.onSecondary != scheme.onSecondary) {
            int i2 = asBinder + 61;
            asInterface = i2 % 128;
            return i2 % 2 != 0;
        }
        if (this.secondaryContainer != scheme.secondaryContainer || this.onSecondaryContainer != scheme.onSecondaryContainer || this.tertiary != scheme.tertiary || this.onTertiary != scheme.onTertiary || this.tertiaryContainer != scheme.tertiaryContainer || this.onTertiaryContainer != scheme.onTertiaryContainer || this.error != scheme.error || this.onError != scheme.onError) {
            return false;
        }
        if (this.errorContainer != scheme.errorContainer) {
            int i3 = asInterface + 37;
            asBinder = i3 % 128;
            return i3 % 2 == 0;
        }
        if (this.onErrorContainer != scheme.onErrorContainer || this.background != scheme.background || this.onBackground != scheme.onBackground) {
            return false;
        }
        if (this.surface != scheme.surface) {
            int i4 = asBinder + 75;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (this.onSurface != scheme.onSurface || this.surfaceVariant != scheme.surfaceVariant) {
            return false;
        }
        if (this.onSurfaceVariant != scheme.onSurfaceVariant) {
            int i6 = asBinder + 47;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (this.outline != scheme.outline) {
            int i8 = asInterface + 105;
            asBinder = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (this.outlineVariant != scheme.outlineVariant) {
            int i10 = asInterface + 71;
            asBinder = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (this.shadow == scheme.shadow) {
            return this.scrim == scheme.scrim && this.inverseSurface == scheme.inverseSurface && this.inverseOnSurface == scheme.inverseOnSurface && this.inversePrimary == scheme.inversePrimary;
        }
        int i12 = asBinder + 37;
        asInterface = i12 % 128;
        int i13 = i12 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = asBinder + 103;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = super.hashCode();
        int i4 = this.primary;
        int i5 = this.onPrimary;
        int i6 = this.primaryContainer;
        int i7 = this.onPrimaryContainer;
        int i8 = this.secondary;
        int i9 = this.onSecondary;
        int i10 = this.secondaryContainer;
        int i11 = this.onSecondaryContainer;
        int i12 = this.tertiary;
        int i13 = this.onTertiary;
        int i14 = this.tertiaryContainer;
        int i15 = this.onTertiaryContainer;
        int i16 = this.error;
        int i17 = this.onError;
        int i18 = this.errorContainer;
        int i19 = this.onErrorContainer;
        int i20 = this.background;
        int i21 = this.onBackground;
        int i22 = this.surface;
        int i23 = this.onSurface;
        int i24 = this.surfaceVariant;
        int i25 = this.onSurfaceVariant;
        int i26 = this.outline;
        int i27 = this.outlineVariant;
        int i28 = this.shadow;
        int i29 = this.scrim;
        int i30 = (((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + i4) * 31) + i5) * 31) + i6) * 31) + i7) * 31) + i8) * 31) + i9) * 31) + i10) * 31) + i11) * 31) + i12) * 31) + i13) * 31) + i14) * 31) + i15) * 31) + i16) * 31) + i17) * 31) + i18) * 31) + i19) * 31) + i20) * 31) + i21) * 31) + i22) * 31) + i23) * 31) + i24) * 31) + i25) * 31) + i26) * 31) + i27) * 31) + i28) * 31) + i29) * 31) + this.inverseSurface) * 31) + this.inverseOnSurface) * 31) + this.inversePrimary;
        int i31 = asBinder + 57;
        asInterface = i31 % 128;
        if (i31 % 2 == 0) {
            return i30;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r6, int r7, int r8) {
        /*
            int r8 = 121 - r8
            int r6 = r6 * 3
            int r6 = 4 - r6
            byte[] r0 = com.google.android.material.color.utilities.Scheme.$$c
            int r7 = r7 * 3
            int r1 = 1 - r7
            byte[] r1 = new byte[r1]
            r2 = 0
            int r7 = 0 - r7
            if (r0 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L2a
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L22:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2a:
            int r8 = -r8
            int r8 = r8 + r3
            int r6 = r6 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.color.utilities.Scheme.$$g(byte, int, int):java.lang.String");
    }
}
