package com.google.firebase.components;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0;
import androidx.compose.runtime.ComposerKt;
import com.google.firebase.dynamicloading.ComponentLoader;
import com.google.firebase.events.Publisher;
import com.google.firebase.events.Subscriber;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import defpackage.SessionConfigValidatingBuilderExternalSyntheticLambda0;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes4.dex */
public class ComponentRuntime implements ComponentContainer, ComponentLoader {
    private static final Provider<Set<Object>> EMPTY_PROVIDER = new Provider() { // from class: com.google.firebase.components.ComponentRuntime$$ExternalSyntheticLambda1
        private static short[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private static final byte[] $$c = {39, -79, 42};
        private static final int $$f = 182;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {106, -66, 28, 119, -6, 23, -41, 38, 20, 0, 21, -9, -19, 35, 10, 25, 3, 11, 15, -33, 42, 5, 15, -5, 3, 9, 21, -70, 70, 41, -4, 19, -3, 14, 7, -22, 25, 32, -4, 0, 17, 14, -38, 52, -9, 14, 14, 0, 17, 14, 7, 5, -3, 6, 14, 0, 19, 5, 13, 6, 5, 13, -1, 7, 26, -5, 4, 26, -34, 42, -3, 9, 15, 0, 9, 9, 3, 28, -1, 16, -57};
        private static final int $$e = 46;
        private static final byte[] $$a = {25, -93, -120, -48, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
        private static final int $$b = 209;
        private static int asInterface = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f818a = 1;
        private static int b = -302702396;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -1934795614;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 920582033;
        private static byte[] TuitionPaymentFragmentbindingInflater1 = {72, -116, 85, 107, 110, 72, -125, 83, -70, 126, ByteCompanionObject.MAX_VALUE, -3, 92, 19, -118, -67, -70, -121, 86, -114, 87, -109, 103, -106, 99, 96, -97, 104, -115, -100, -119, -104, 108, -106, 100, 120, 101, 104, 115, 77, ByteCompanionObject.MIN_VALUE, 122, 112, 104, 114, 106, 86, 91, 72, -89, 121, 116, 40, -77, 96, 99, 98, 119, 111, 114, -74, -65, -96, -126, -73, -85, -88, -87, -75, 102, -8, -65, -68, -94, -75, -88, -125, -35, 18, -94, 15, -5, -58, 24, 10, -34, 22, -61, 30, 60, -74, 8, -64, -76, 29, -106, -76, -33, -56, -70, -60, -58, -76, -61, -8, -64, -74, -26, -26, -26, -26, -26, -26};

        /* JADX WARN: Code duplicated, block: B:10:0x002a  */
        /* JADX WARN: Code duplicated, block: B:8:0x0022  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002c). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(int r6, short r7, short r8, java.lang.Object[] r9) {
            /*
                int r8 = r8 * 52
                int r8 = 55 - r8
                int r7 = r7 * 14
                int r7 = r7 + 84
                int r0 = r6 + 1
                byte[] r1 = com.google.firebase.components.ComponentRuntime$$ExternalSyntheticLambda1.$$a
                byte[] r0 = new byte[r0]
                r2 = 0
                if (r1 != 0) goto L15
                r3 = r6
                r7 = r8
                r4 = r2
                goto L2c
            L15:
                r3 = r2
                r5 = r8
                r8 = r7
                r7 = r5
            L19:
                int r7 = r7 + 1
                byte r4 = (byte) r8
                r0[r3] = r4
                int r4 = r3 + 1
                if (r3 != r6) goto L2a
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L2a:
                r3 = r1[r7]
            L2c:
                int r3 = -r3
                int r8 = r8 + r3
                int r8 = r8 + (-10)
                r3 = r4
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.components.ComponentRuntime$$ExternalSyntheticLambda1.c(int, short, short, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:10:0x002a  */
        /* JADX WARN: Code duplicated, block: B:8:0x0022  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002c). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void e(byte r7, byte r8, short r9, java.lang.Object[] r10) {
            /*
                byte[] r0 = com.google.firebase.components.ComponentRuntime$$ExternalSyntheticLambda1.$$d
                int r8 = r8 * 25
                int r8 = 29 - r8
                int r7 = r7 * 31
                int r7 = r7 + 84
                int r9 = r9 * 27
                int r9 = 53 - r9
                byte[] r1 = new byte[r9]
                r2 = 0
                if (r0 != 0) goto L17
                r7 = r8
                r3 = r9
                r4 = r2
                goto L2c
            L17:
                r3 = r2
                r6 = r8
                r8 = r7
                r7 = r6
            L1b:
                int r4 = r3 + 1
                byte r5 = (byte) r8
                r1[r3] = r5
                if (r4 != r9) goto L2a
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L2a:
                r3 = r0[r7]
            L2c:
                int r8 = r8 + r3
                int r7 = r7 + 1
                int r8 = r8 + (-8)
                r3 = r4
                goto L1b
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.components.ComponentRuntime$$ExternalSyntheticLambda1.e(byte, byte, short, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:21:0x0089 A[PHI: r4
  0x0089: PHI (r4v9 byte[] A[IMMUTABLE_TYPE]) = (r4v8 byte[]), (r4v22 byte[]) binds: [B:20:0x0087, B:17:0x0082] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:23:0x008f  */
        /* JADX WARN: Code duplicated, block: B:25:0x009d  */
        /* JADX WARN: Code duplicated, block: B:28:0x00ad A[Catch: all -> 0x0362, TryCatch #0 {all -> 0x0362, blocks: (B:3:0x000f, B:6:0x002a, B:7:0x0058, B:41:0x0165, B:43:0x017c, B:44:0x01b3, B:26:0x009f, B:28:0x00ad, B:29:0x00e4, B:32:0x00f6, B:34:0x0104, B:35:0x0139, B:49:0x020e, B:51:0x022b, B:52:0x0270), top: B:88:0x000f }] */
        /* JADX WARN: Code duplicated, block: B:31:0x00f4  */
        /* JADX WARN: Code duplicated, block: B:34:0x0104 A[Catch: all -> 0x0362, TryCatch #0 {all -> 0x0362, blocks: (B:3:0x000f, B:6:0x002a, B:7:0x0058, B:41:0x0165, B:43:0x017c, B:44:0x01b3, B:26:0x009f, B:28:0x00ad, B:29:0x00e4, B:32:0x00f6, B:34:0x0104, B:35:0x0139, B:49:0x020e, B:51:0x022b, B:52:0x0270), top: B:88:0x000f }] */
        /* JADX WARN: Code duplicated, block: B:74:0x02d7  */
        /* JADX WARN: Code duplicated, block: B:76:0x02e1  */
        /* JADX WARN: Code duplicated, block: B:77:0x02ff  */
        /* JADX WARN: Code duplicated, block: B:79:0x0323  */
        private static void d(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
            boolean z;
            int i4;
            int length;
            byte[] bArr;
            int i5;
            byte[] bArr2;
            int length2;
            byte[] bArr3;
            int i6;
            int i7;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
            int i8 = 2;
            int i9 = 2 % 2;
            SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
            StringBuilder sb = new StringBuilder();
            try {
                Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) TextUtils.getCapsMode("", 0, 0), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 2267, 33 - TextUtils.getCapsMode("", 0, 0), 1387473586, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr2)).intValue();
                int i10 = iIntValue == -1 ? 1 : 0;
                float f = 0.0f;
                if ((i10 ^ 1) != 1) {
                    int i11 = $10 + 31;
                    $11 = i11 % 128;
                    char c = '0';
                    if (i11 % 2 == 0) {
                        bArr2 = TuitionPaymentFragmentbindingInflater1;
                        int i12 = 80 / 0;
                        if (bArr2 != null) {
                            length2 = bArr2.length;
                            bArr3 = new byte[length2];
                            i6 = 0;
                            while (i6 < length2) {
                                i7 = $10 + 31;
                                $11 = i7 % 128;
                                if (i7 % i8 == 0) {
                                    Object[] objArr3 = {Integer.valueOf(bArr2[i6])};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                        char c2 = (char) (AudioTrack.getMinVolume() > f ? 1 : (AudioTrack.getMinVolume() == f ? 0 : -1));
                                        int iIndexOf = TextUtils.indexOf("", c, 0) + 3359;
                                        int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 18;
                                        byte b5 = (byte) ($$f & 13);
                                        byte b6 = (byte) (b5 - 4);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c2, iIndexOf, packedPositionType, -1054011043, false, $$g(b5, b6, b6), new Class[]{Integer.TYPE});
                                    }
                                    bArr3[i6] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                                } else {
                                    Object[] objArr4 = {Integer.valueOf(bArr2[i6])};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                        char cIndexOf = (char) TextUtils.indexOf("", "", 0, 0);
                                        int capsMode = 3358 - TextUtils.getCapsMode("", 0, 0);
                                        int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 18;
                                        byte b7 = (byte) ($$f & 13);
                                        byte b8 = (byte) (b7 - 4);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, capsMode, scrollDefaultDelay, -1054011043, false, $$g(b7, b8, b8), new Class[]{Integer.TYPE});
                                    }
                                    bArr3[i6] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr4)).byteValue();
                                    i6++;
                                }
                                i8 = 2;
                                c = '0';
                                f = 0.0f;
                            }
                            bArr2 = bArr3;
                        }
                    } else {
                        bArr2 = TuitionPaymentFragmentbindingInflater1;
                        if (bArr2 != null) {
                            length2 = bArr2.length;
                            bArr3 = new byte[length2];
                            i6 = 0;
                            while (i6 < length2) {
                                i7 = $10 + 31;
                                $11 = i7 % 128;
                                if (i7 % i8 == 0) {
                                    Object[] objArr5 = {Integer.valueOf(bArr2[i6])};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                        char c3 = (char) (AudioTrack.getMinVolume() > f ? 1 : (AudioTrack.getMinVolume() == f ? 0 : -1));
                                        int iIndexOf2 = TextUtils.indexOf("", c, 0) + 3359;
                                        int packedPositionType2 = ExpandableListView.getPackedPositionType(0L) + 18;
                                        byte b9 = (byte) ($$f & 13);
                                        byte b10 = (byte) (b9 - 4);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c3, iIndexOf2, packedPositionType2, -1054011043, false, $$g(b9, b10, b10), new Class[]{Integer.TYPE});
                                    }
                                    bArr3[i6] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr5)).byteValue();
                                } else {
                                    Object[] objArr6 = {Integer.valueOf(bArr2[i6])};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                        char cIndexOf2 = (char) TextUtils.indexOf("", "", 0, 0);
                                        int capsMode2 = 3358 - TextUtils.getCapsMode("", 0, 0);
                                        int scrollDefaultDelay2 = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 18;
                                        byte b11 = (byte) ($$f & 13);
                                        byte b12 = (byte) (b11 - 4);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf2, capsMode2, scrollDefaultDelay2, -1054011043, false, $$g(b11, b12, b12), new Class[]{Integer.TYPE});
                                    }
                                    bArr3[i6] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr6)).byteValue();
                                    i6++;
                                }
                                i8 = 2;
                                c = '0';
                                f = 0.0f;
                            }
                            bArr2 = bArr3;
                        }
                    }
                    if (bArr2 != null) {
                        int i13 = $10 + 49;
                        $11 = i13 % 128;
                        int i14 = i13 % 2;
                        byte[] bArr4 = TuitionPaymentFragmentbindingInflater1;
                        Object[] objArr7 = {Integer.valueOf(i3), Integer.valueOf(b)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b13 = (byte) 0;
                            byte b14 = b13;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TextUtils.lastIndexOf("", '0') + 1), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 2267, TextUtils.lastIndexOf("", '0', 0) + 34, 1387473586, false, $$g(b13, b14, b14), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (((long) bArr4[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr7)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 3046761265686732006L)));
                    } else {
                        iIntValue = (short) (((short) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1[i3 + ((int) (((long) b) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 3046761265686732006L)));
                    }
                }
                if (iIntValue > 0) {
                    int i15 = $11 + 125;
                    $10 = i15 % 128;
                    int i16 = i15 % 2;
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.b = ((i3 + iIntValue) - 2) + ((int) (((long) b) ^ 3046761265686732006L)) + i10;
                    Object[] objArr8 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2), sb};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        byte b15 = (byte) 1;
                        byte b16 = (byte) (b15 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 55904), TextUtils.getTrimmedLength("") + 2855, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 12, -1529949196, false, $$g(b15, b16, b16), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr8)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    byte[] bArr5 = TuitionPaymentFragmentbindingInflater1;
                    if (bArr5 != null) {
                        int i17 = $10 + 115;
                        $11 = i17 % 128;
                        if (i17 % 2 == 0) {
                            length = bArr5.length;
                            bArr = new byte[length];
                            i5 = 1;
                        } else {
                            length = bArr5.length;
                            bArr = new byte[length];
                            i5 = 0;
                        }
                        while (i5 < length) {
                            bArr[i5] = (byte) (((long) bArr5[i5]) ^ 3046761265686732006L);
                            i5++;
                        }
                        bArr5 = bArr;
                    }
                    if (bArr5 != null) {
                        int i18 = $11 + 73;
                        $10 = i18 % 128;
                        int i19 = i18 % 2;
                        z = true;
                    } else {
                        z = false;
                    }
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                    while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                        int i20 = $10;
                        int i21 = i20 + 55;
                        $11 = i21 % 128;
                        if (i21 % 2 == 0) {
                            int i22 = 26 / 0;
                            if (z) {
                                i4 = i20 + 81;
                                $11 = i4 % 128;
                                if (i4 % 2 == 0) {
                                    byte[] bArr6 = TuitionPaymentFragmentbindingInflater1;
                                    int i23 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                                    sessionConfigValidatingBuilderExternalSyntheticLambda0.b = 0;
                                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 >> (((byte) (((byte) (((long) bArr6[i23]) ^ 3046761265686732006L)) - s)) ^ b2));
                                } else {
                                    byte[] bArr7 = TuitionPaymentFragmentbindingInflater1;
                                    int i24 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                                    sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i24 - 1;
                                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr7[i24]) ^ 3046761265686732006L)) + s)) ^ b2));
                                }
                            } else {
                                short[] sArr = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                int i25 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i25 - 1;
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i25]) ^ 3046761265686732006L)) + s)) ^ b2));
                            }
                        } else if (z) {
                            i4 = i20 + 81;
                            $11 = i4 % 128;
                            if (i4 % 2 == 0) {
                                byte[] bArr8 = TuitionPaymentFragmentbindingInflater1;
                                int i26 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = 0;
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 >> (((byte) (((byte) (((long) bArr8[i26]) ^ 3046761265686732006L)) - s)) ^ b2));
                            } else {
                                byte[] bArr9 = TuitionPaymentFragmentbindingInflater1;
                                int i27 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i27 - 1;
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr9[i27]) ^ 3046761265686732006L)) + s)) ^ b2));
                            }
                        } else {
                            short[] sArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            int i28 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i28 - 1;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr2[i28]) ^ 3046761265686732006L)) + s)) ^ b2));
                        }
                        sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                    }
                }
                objArr[0] = sb.toString();
                int i29 = $10 + 5;
                $11 = i29 % 128;
                int i30 = i29 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }

        /* JADX WARN: Code duplicated, block: B:22:0x02a0  */
        @Override // com.google.firebase.inject.Provider
        public final Object get() throws Throwable {
            Object[] objArr;
            int i = 2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char c = (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 31533);
                int i2 = 921 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                int iCombineMeasuredStates = 28 - View.combineMeasuredStates(0, 0);
                byte[] bArr = $$a;
                byte b2 = bArr[80];
                byte b3 = bArr[7];
                Object[] objArr2 = new Object[1];
                c(b2, b3, b3, objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, i2, iCombineMeasuredStates, -1048449946, false, (String) objArr2[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            d(TextUtils.indexOf((CharSequence) "", '0', 0) + 1166824683, (-47) - Process.getGidForName(""), (short) ((-11) - TextUtils.getOffsetAfter("", 0)), (byte) ((-85) - KeyEvent.getDeadChar(0, 0)), TextUtils.lastIndexOf("", '0', 0, 0) - 1633188897, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d(1150047470 - Color.rgb(0, 0, 0), (-53) - Color.blue(0), (short) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 4), (byte) ((-128) - MotionEvent.axisFromString("")), TextUtils.lastIndexOf("", '0', 0, 0) - 1633188876, objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char c2 = (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 31533);
                int tapTimeout = 921 - (ViewConfiguration.getTapTimeout() >> 16);
                int iResolveOpacity = 28 - Drawable.resolveOpacity(0, 0);
                byte b4 = (byte) ($$b >>> 2);
                byte[] bArr2 = $$a;
                Object[] objArr5 = new Object[1];
                c(b4, bArr2[80], bArr2[7], objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c2, tapTimeout, iResolveOpacity, -778300370, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                int i3 = f818a + 107;
                asInterface = i3 % 128;
                int i4 = i3 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char c3 = (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 31533);
                    int packedPositionType = 921 - ExpandableListView.getPackedPositionType(0L);
                    int i5 = 29 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                    byte[] bArr3 = $$a;
                    byte b5 = (byte) (bArr3[17] + 1);
                    byte b6 = bArr3[80];
                    Object[] objArr6 = new Object[1];
                    c(b5, b6, b6, objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c3, packedPositionType, i5, -1142834547, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
                int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                int i6 = ~iElapsedRealtime;
                int i7 = ~(430345947 | i6);
                int i8 = (-728872061) + ((1074868480 | i7) * (-712)) + (((~(iElapsedRealtime | 1505214427)) | (~(i6 | (-1074868481)))) * (-712)) + (((-1343733697) | i7) * 712) + 382791764;
                int i9 = (i8 << 13) ^ i8;
                int i10 = i9 ^ (i9 >>> 17);
                ((int[]) objArr[0])[0] = i10 ^ (i10 << 5);
            } else {
                Object[] objArr8 = new Object[1];
                d(ExpandableListView.getPackedPositionGroup(0L) + 1166824682, ImageFormat.getBitsPerPixel(0) - 41, (short) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 17), (byte) ((ViewConfiguration.getKeyRepeatDelay() >> 16) - 114), MotionEvent.axisFromString("") - 1633188862, objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                d(1166824684 - ((Process.getThreadPriority(0) + 20) >> 6), AndroidCharacter.getMirror('0') - 'b', (short) ((-82) - ExpandableListView.getPackedPositionGroup(0L)), (byte) ((ViewConfiguration.getScrollBarSize() >> 8) + 1), (-1633188839) - TextUtils.lastIndexOf("", '0'), objArr9);
                Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                if (applicationContext != null) {
                    int i11 = f818a + 23;
                    int i12 = i11 % 128;
                    asInterface = i12;
                    int i13 = i11 % 2;
                    if (applicationContext instanceof ContextWrapper) {
                        int i14 = i12 + 31;
                        f818a = i14 % 128;
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
                d((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1166824691, (-53) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (short) (Color.argb(0, 0, 0, 0) + 107), (byte) ((-82) - View.resolveSizeAndState(0, 0, 0)), (-1633188822) - ImageFormat.getBitsPerPixel(0), objArr10);
                Class<?> cls3 = Class.forName((String) objArr10[0]);
                Object[] objArr11 = new Object[1];
                d((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1166824689, (ViewConfiguration.getPressedStateDuration() >> 16) - 52, (short) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 69), (byte) (View.MeasureSpec.getSize(0) + 109), (-1633188807) - Process.getGidForName(""), objArr11);
                try {
                    Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, 382791764};
                    byte[] bArr4 = $$d;
                    byte b7 = (byte) (-bArr4[62]);
                    byte b8 = b7;
                    Object[] objArr13 = new Object[1];
                    e(b7, b8, b8, objArr13);
                    Class<?> cls4 = Class.forName((String) objArr13[0]);
                    byte b9 = bArr4[9];
                    byte b10 = b9;
                    Object[] objArr14 = new Object[1];
                    e(b9, b10, b10, objArr14);
                    objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char scrollBarSize = (char) (31533 - (ViewConfiguration.getScrollBarSize() >> 8));
                        int capsMode = 921 - TextUtils.getCapsMode("", 0, 0);
                        int iAxisFromString = 27 - MotionEvent.axisFromString("");
                        byte[] bArr5 = $$a;
                        byte b11 = (byte) (bArr5[17] + 1);
                        byte b12 = bArr5[80];
                        Object[] objArr15 = new Object[1];
                        c(b11, b12, b12, objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(scrollBarSize, capsMode, iAxisFromString, -1142834547, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr16 = new Object[1];
                        d((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1166824681, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) - 46, (short) ((ViewConfiguration.getKeyRepeatDelay() >> 16) - 11), (byte) ((-86) - ExpandableListView.getPackedPositionChild(0L)), (-1633188897) - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr16);
                        Class<?> cls5 = Class.forName((String) objArr16[0]);
                        Object[] objArr17 = new Object[1];
                        d(1166824686 - ((Process.getThreadPriority(0) + 20) >> 6), (-53) - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (short) (View.resolveSize(0, 0) + 4), (byte) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + ComposerKt.defaultsKey), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 1633188877, objArr17);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 31534);
                            int i16 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 920;
                            int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 28;
                            byte b13 = (byte) ($$b >>> 2);
                            byte[] bArr6 = $$a;
                            Object[] objArr18 = new Object[1];
                            c(b13, bArr6[80], bArr6[7], objArr18);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(packedPositionChild, i16, maxKeyCode, -778300370, false, (String) objArr18[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char jumpTapTimeout = (char) (31533 - (ViewConfiguration.getJumpTapTimeout() >> 16));
                            int iRgb = (-16776295) - Color.rgb(0, 0, 0);
                            int iRgb2 = Color.rgb(0, 0, 0) + 16777244;
                            byte[] bArr7 = $$a;
                            byte b14 = bArr7[80];
                            byte b15 = bArr7[7];
                            Object[] objArr19 = new Object[1];
                            c(b14, b15, b15, objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(jumpTapTimeout, iRgb, iRgb2, -1048449946, false, (String) objArr19[0], null);
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
            int i17 = ((int[]) objArr[1])[0];
            int i18 = ((int[]) objArr[3])[0];
            if (i18 != i17) {
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) objArr[4];
                if (strArr != null) {
                    int i19 = asInterface + 117;
                    f818a = i19 % 128;
                    int i20 = i19 % 2;
                    for (String str : strArr) {
                        arrayList.add(str);
                    }
                }
                throw new RuntimeException(String.valueOf(i18));
            }
            int i21 = ((int[]) objArr[0])[0];
            Object[] objArr20 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i22 = ~elapsedCpuTime;
            int i23 = i21 + (-2027480308) + ((998002260 | i22) * (-757)) + ((~((-67239940) | elapsedCpuTime)) * 1514) + (((~(elapsedCpuTime | 1065242199)) | (~(i22 | (-776077384))) | 708837444) * 757);
            int i24 = (i23 << 13) ^ i23;
            int i25 = i24 ^ (i24 >>> 17);
            ((int[]) objArr20[0])[0] = i25 ^ (i25 << 5);
            return Collections.emptySet();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0022  */
        /* JADX WARN: Code duplicated, block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$g(short r6, short r7, short r8) {
            /*
                int r7 = r7 * 4
                int r7 = 1 - r7
                int r8 = r8 * 4
                int r8 = 3 - r8
                byte[] r0 = com.google.firebase.components.ComponentRuntime$$ExternalSyntheticLambda1.$$c
                int r6 = r6 + 117
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L14
                r3 = r7
                r5 = r2
                goto L24
            L14:
                r3 = r2
            L15:
                byte r4 = (byte) r6
                int r5 = r3 + 1
                r1[r3] = r4
                if (r5 != r7) goto L22
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L22:
                r3 = r0[r8]
            L24:
                int r3 = -r3
                int r6 = r6 + r3
                int r8 = r8 + 1
                r3 = r5
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.components.ComponentRuntime$$ExternalSyntheticLambda1.$$g(short, short, short):java.lang.String");
        }
    };
    private final ComponentRegistrarProcessor componentRegistrarProcessor;
    private final Map<Component<?>, Provider<?>> components;
    private final AtomicReference<Boolean> eagerComponentsInitializedWith;
    private final EventBus eventBus;
    private final Map<Qualified<?>, Provider<?>> lazyInstanceMap;
    private final Map<Qualified<?>, LazySet<?>> lazySetMap;
    private Set<String> processedCoroutineDispatcherInterfaces;
    private final List<Provider<ComponentRegistrar>> unprocessedRegistrarProviders;

    static /* synthetic */ ComponentRegistrar lambda$toProviders$1(ComponentRegistrar componentRegistrar) {
        return componentRegistrar;
    }

    @Deprecated
    public ComponentRuntime(Executor executor, Iterable<ComponentRegistrar> iterable, Component<?>... componentArr) {
        this(executor, toProviders(iterable), Arrays.asList(componentArr), ComponentRegistrarProcessor.NOOP);
    }

    public static Builder builder(Executor executor) {
        return new Builder(executor);
    }

    private ComponentRuntime(Executor executor, Iterable<Provider<ComponentRegistrar>> iterable, Collection<Component<?>> collection, ComponentRegistrarProcessor componentRegistrarProcessor) {
        this.components = new HashMap();
        this.lazyInstanceMap = new HashMap();
        this.lazySetMap = new HashMap();
        this.processedCoroutineDispatcherInterfaces = new HashSet();
        this.eagerComponentsInitializedWith = new AtomicReference<>();
        EventBus eventBus = new EventBus(executor);
        this.eventBus = eventBus;
        this.componentRegistrarProcessor = componentRegistrarProcessor;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Component.of(eventBus, (Class<EventBus>) EventBus.class, (Class<? super EventBus>[]) new Class[]{Subscriber.class, Publisher.class}));
        arrayList.add(Component.of(this, (Class<ComponentRuntime>) ComponentLoader.class, (Class<? super ComponentRuntime>[]) new Class[0]));
        for (Component<?> component : collection) {
            if (component != null) {
                arrayList.add(component);
            }
        }
        this.unprocessedRegistrarProviders = iterableToList(iterable);
        discoverComponents(arrayList);
    }

    private void discoverComponents(List<Component<?>> list) {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<Provider<ComponentRegistrar>> it = this.unprocessedRegistrarProviders.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = it.next().get();
                    if (componentRegistrar != null) {
                        list.addAll(this.componentRegistrarProcessor.processRegistrar(componentRegistrar));
                        it.remove();
                    }
                } catch (InvalidRegistrarException unused) {
                    it.remove();
                }
            }
            Iterator<Component<?>> it2 = list.iterator();
            while (it2.hasNext()) {
                for (Object obj : it2.next().getProvidedInterfaces().toArray()) {
                    if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                        if (this.processedCoroutineDispatcherInterfaces.contains(obj.toString())) {
                            it2.remove();
                            break;
                        }
                        this.processedCoroutineDispatcherInterfaces.add(obj.toString());
                    }
                }
            }
            if (this.components.isEmpty()) {
                CycleDetector.detect(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.components.keySet());
                arrayList2.addAll(list);
                CycleDetector.detect(arrayList2);
            }
            for (final Component<?> component : list) {
                this.components.put(component, new Lazy(new Provider() { // from class: com.google.firebase.components.ComponentRuntime$$ExternalSyntheticLambda2
                    @Override // com.google.firebase.inject.Provider
                    public final Object get() {
                        return this.f$0.m7917xc080f8d8(component);
                    }
                }));
            }
            arrayList.addAll(processInstanceComponents(list));
            arrayList.addAll(processSetComponents());
            processDependencies();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ((Runnable) it3.next()).run();
        }
        maybeInitializeEagerComponents();
    }

    /* JADX INFO: renamed from: lambda$discoverComponents$0$com-google-firebase-components-ComponentRuntime, reason: not valid java name */
    /* synthetic */ Object m7917xc080f8d8(Component component) {
        return component.getFactory().create(new RestrictedComponentContainer(component, this));
    }

    private void maybeInitializeEagerComponents() {
        Boolean bool = this.eagerComponentsInitializedWith.get();
        if (bool != null) {
            doInitializeEagerComponents(this.components, bool.booleanValue());
        }
    }

    private static Iterable<Provider<ComponentRegistrar>> toProviders(Iterable<ComponentRegistrar> iterable) {
        ArrayList arrayList = new ArrayList();
        for (final ComponentRegistrar componentRegistrar : iterable) {
            arrayList.add(new Provider() { // from class: com.google.firebase.components.ComponentRuntime$$ExternalSyntheticLambda0
                @Override // com.google.firebase.inject.Provider
                public final Object get() {
                    return ComponentRuntime.lambda$toProviders$1(componentRegistrar);
                }
            });
        }
        return arrayList;
    }

    private static <T> List<T> iterableToList(Iterable<T> iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    private List<Runnable> processInstanceComponents(List<Component<?>> list) {
        ArrayList arrayList = new ArrayList();
        for (Component<?> component : list) {
            if (component.isValue()) {
                final Provider<?> provider = this.components.get(component);
                for (Qualified<? super Object> qualified : component.getProvidedInterfaces()) {
                    if (!this.lazyInstanceMap.containsKey(qualified)) {
                        this.lazyInstanceMap.put(qualified, provider);
                    } else {
                        final OptionalProvider optionalProvider = (OptionalProvider) this.lazyInstanceMap.get(qualified);
                        arrayList.add(new Runnable() { // from class: com.google.firebase.components.ComponentRuntime$$ExternalSyntheticLambda3
                            @Override // java.lang.Runnable
                            public final void run() {
                                optionalProvider.set(provider);
                            }
                        });
                    }
                }
            }
        }
        return arrayList;
    }

    private List<Runnable> processSetComponents() {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        for (Map.Entry<Component<?>, Provider<?>> entry : this.components.entrySet()) {
            Component<?> key = entry.getKey();
            if (!key.isValue()) {
                Provider<?> value = entry.getValue();
                for (Qualified<? super Object> qualified : key.getProvidedInterfaces()) {
                    if (!map.containsKey(qualified)) {
                        map.put(qualified, new HashSet());
                    }
                    ((Set) map.get(qualified)).add(value);
                }
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            if (!this.lazySetMap.containsKey(entry2.getKey())) {
                this.lazySetMap.put((Qualified) entry2.getKey(), LazySet.fromCollection((Collection) entry2.getValue()));
            } else {
                final LazySet<?> lazySet = this.lazySetMap.get(entry2.getKey());
                for (final Provider provider : (Set) entry2.getValue()) {
                    arrayList.add(new Runnable() { // from class: com.google.firebase.components.ComponentRuntime$$ExternalSyntheticLambda4
                        @Override // java.lang.Runnable
                        public final void run() {
                            lazySet.add(provider);
                        }
                    });
                }
            }
        }
        return arrayList;
    }

    @Override // com.google.firebase.components.ComponentContainer
    public <T> Provider<T> getProvider(Qualified<T> qualified) {
        Provider<T> provider;
        synchronized (this) {
            Preconditions.checkNotNull(qualified, "Null interface requested.");
            provider = (Provider) this.lazyInstanceMap.get(qualified);
        }
        return provider;
    }

    @Override // com.google.firebase.components.ComponentContainer
    public <T> Deferred<T> getDeferred(Qualified<T> qualified) {
        Provider<T> provider = getProvider(qualified);
        if (provider == null) {
            return OptionalProvider.empty();
        }
        if (provider instanceof OptionalProvider) {
            return (OptionalProvider) provider;
        }
        return OptionalProvider.of(provider);
    }

    @Override // com.google.firebase.components.ComponentContainer
    public <T> Provider<Set<T>> setOfProvider(Qualified<T> qualified) {
        synchronized (this) {
            LazySet<?> lazySet = this.lazySetMap.get(qualified);
            if (lazySet != null) {
                return lazySet;
            }
            return (Provider<Set<T>>) EMPTY_PROVIDER;
        }
    }

    public void initializeEagerComponents(boolean z) {
        HashMap map;
        if (PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.eagerComponentsInitializedWith, null, Boolean.valueOf(z))) {
            synchronized (this) {
                map = new HashMap(this.components);
            }
            doInitializeEagerComponents(map, z);
        }
    }

    private void doInitializeEagerComponents(Map<Component<?>, Provider<?>> map, boolean z) {
        for (Map.Entry<Component<?>, Provider<?>> entry : map.entrySet()) {
            Component<?> key = entry.getKey();
            Provider<?> value = entry.getValue();
            if (key.isAlwaysEager() || (key.isEagerInDefaultApp() && z)) {
                value.get();
            }
        }
        this.eventBus.enablePublishingAndFlushPending();
    }

    @Override // com.google.firebase.dynamicloading.ComponentLoader
    public void discoverComponents() {
        synchronized (this) {
            if (this.unprocessedRegistrarProviders.isEmpty()) {
                return;
            }
            discoverComponents(new ArrayList());
        }
    }

    public void initializeAllComponentsForTests() {
        Iterator<Provider<?>> it = this.components.values().iterator();
        while (it.hasNext()) {
            it.next().get();
        }
    }

    private void processDependencies() {
        for (Component<?> component : this.components.keySet()) {
            for (Dependency dependency : component.getDependencies()) {
                if (dependency.isSet() && !this.lazySetMap.containsKey(dependency.getInterface())) {
                    this.lazySetMap.put(dependency.getInterface(), LazySet.fromCollection(Collections.emptySet()));
                } else if (this.lazyInstanceMap.containsKey(dependency.getInterface())) {
                    continue;
                } else {
                    if (dependency.isRequired()) {
                        throw new MissingDependencyException(String.format("Unsatisfied dependency for component %s: %s", component, dependency.getInterface()));
                    }
                    if (!dependency.isSet()) {
                        this.lazyInstanceMap.put(dependency.getInterface(), OptionalProvider.empty());
                    }
                }
            }
        }
    }

    Collection<Component<?>> getAllComponentsForTest() {
        return this.components.keySet();
    }

    public static final class Builder {
        private final Executor defaultExecutor;
        private final List<Provider<ComponentRegistrar>> lazyRegistrars = new ArrayList();
        private final List<Component<?>> additionalComponents = new ArrayList();
        private ComponentRegistrarProcessor componentRegistrarProcessor = ComponentRegistrarProcessor.NOOP;

        static /* synthetic */ ComponentRegistrar lambda$addComponentRegistrar$0(ComponentRegistrar componentRegistrar) {
            return componentRegistrar;
        }

        Builder(Executor executor) {
            this.defaultExecutor = executor;
        }

        public final Builder addLazyComponentRegistrars(Collection<Provider<ComponentRegistrar>> collection) {
            this.lazyRegistrars.addAll(collection);
            return this;
        }

        public final Builder addComponentRegistrar(final ComponentRegistrar componentRegistrar) {
            this.lazyRegistrars.add(new Provider() { // from class: com.google.firebase.components.ComponentRuntime$Builder$$ExternalSyntheticLambda0
                @Override // com.google.firebase.inject.Provider
                public final Object get() {
                    return ComponentRuntime.Builder.lambda$addComponentRegistrar$0(componentRegistrar);
                }
            });
            return this;
        }

        public final Builder addComponent(Component<?> component) {
            this.additionalComponents.add(component);
            return this;
        }

        public final Builder setProcessor(ComponentRegistrarProcessor componentRegistrarProcessor) {
            this.componentRegistrarProcessor = componentRegistrarProcessor;
            return this;
        }

        public final ComponentRuntime build() {
            return new ComponentRuntime(this.defaultExecutor, this.lazyRegistrars, this.additionalComponents, this.componentRegistrarProcessor);
        }
    }
}
