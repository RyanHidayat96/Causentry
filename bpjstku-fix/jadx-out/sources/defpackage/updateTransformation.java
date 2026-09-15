package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.koushikdutta.async.AsyncServer;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Random;

/* JADX INFO: loaded from: classes4.dex */
public class updateTransformation implements checkReadyToRelease {
    private static int $10 = 0;
    private static int $11 = 1;
    InputStream TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    lambdainitGlRenderer9androidxcameracoreprocessingDefaultSurfaceProcessor TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private lambdasnapshot8androidxcameracoreprocessingDefaultSurfaceProcessor b;
    private AsyncServer d;
    private boolean g;
    private static final byte[] $$a = {118, 35, -100, -35, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$b = 207;
    private static int asInterface = 0;
    private static int onTransact = 1;
    private static long asBinder = -7506111294167246859L;
    int TuitionPaymentFragmentbindingInflater1 = 0;
    AutoValue_Packet TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new AutoValue_Packet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Runnable f1424a = new Runnable() { // from class: updateTransformation.3
        private static final byte[] $$c = {58, 66, -14, -31};
        private static final int $$d = 86;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$a = {17, 104, 102, -28, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54};
        private static final int $$b = 128;
        private static int b = 0;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
        private static long TuitionPaymentFragmentbindingInflater1 = -4362139308503093696L;

        /* JADX WARN: Code duplicated, block: B:10:0x0028  */
        /* JADX WARN: Code duplicated, block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002d). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(int r6, short r7, int r8, java.lang.Object[] r9) {
            /*
                int r7 = r7 * 4
                int r7 = 84 - r7
                byte[] r0 = defpackage.updateTransformation.AnonymousClass3.$$a
                int r8 = r8 * 15
                int r1 = r8 + 38
                int r6 = r6 + 4
                byte[] r1 = new byte[r1]
                int r8 = r8 + 37
                r2 = 0
                if (r0 != 0) goto L16
                r3 = r8
                r4 = r2
                goto L2d
            L16:
                r3 = r2
            L17:
                byte r4 = (byte) r7
                r1[r3] = r4
                int r6 = r6 + 1
                int r4 = r3 + 1
                if (r3 != r8) goto L28
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L28:
                r3 = r0[r6]
                r5 = r3
                r3 = r7
                r7 = r5
            L2d:
                int r7 = -r7
                int r3 = r3 + r7
                int r7 = r3 + (-11)
                r3 = r4
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.updateTransformation.AnonymousClass3.a(int, short, int, java.lang.Object[]):void");
        }

        private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            abortCapture abortcapture = new abortCapture();
            char[] cArrB = abortCapture.b(TuitionPaymentFragmentbindingInflater1 ^ (-2687588926731523482L), cArr, i);
            abortcapture.b = 4;
            int i3 = $11 + 105;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 3 / 2;
            }
            while (abortcapture.b < cArrB.length) {
                int i5 = $10 + 85;
                $11 = i5 % 128;
                int i6 = i5 % 2;
                abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
                int i7 = abortcapture.b;
                try {
                    Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(TuitionPaymentFragmentbindingInflater1)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 64838), 1356 - Color.alpha(0), 38 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 894276454, false, $$e(b2, b3, b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                    }
                    cArrB[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {abortcapture, abortcapture};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47773 - ExpandableListView.getPackedPositionType(0L)), 467 - ExpandableListView.getPackedPositionChild(0L), TextUtils.indexOf("", "", 0, 0) + 13, 896083767, false, "n", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            objArr[0] = new String(cArrB, 4, cArrB.length - 4);
            int i8 = $10 + 33;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                throw null;
            }
        }

        @Override // java.lang.Runnable
        public final void run() throws Throwable {
            Object[] objArrTuitionPaymentFragmentbindingInflater1$5f1425da;
            int i;
            int i2 = 2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char maximumFlingVelocity = (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 29944);
                int bitsPerPixel = 1754 - ImageFormat.getBitsPerPixel(0);
                int i3 = 23 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                byte[] bArr = $$a;
                byte b2 = bArr[28];
                byte b3 = bArr[7];
                Object[] objArr = new Object[1];
                a(b2, b3, b3, objArr);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(maximumFlingVelocity, bitsPerPixel, i3, 986134021, false, (String) objArr[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr2 = new Object[1];
            c(new char[]{6042, 6139, 63227, 45747, 50054, 19374, 16195, 62275, 1901, 58980, 23302, 57959, 14021, 55190, 27348, 53938, 9771, 50990, 31206, 49436, 21911, 13430, 2374, 12798, 17665, 9670}, KeyEvent.keyCodeFromString(""), objArr2);
            Class<?> cls = Class.forName((String) objArr2[0]);
            Object[] objArr3 = new Object[1];
            c(new char[]{27488, 27397, 49842, 34552, 31389, 62128, 23399, 38757, 31627, 53795, 57885, 34367, 18997, 58319, 54157, 46769, 23233, 62331, 49388}, TextUtils.getTrimmedLength(""), objArr3);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char modifierMetaStateMask = (char) (29943 - ((byte) KeyEvent.getModifierMetaStateMask()));
                int minimumFlingVelocity = 1755 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                int offsetAfter = 23 - TextUtils.getOffsetAfter("", 0);
                byte[] bArr2 = $$a;
                Object[] objArr4 = new Object[1];
                a((byte) (bArr2[17] + 1), bArr2[7], bArr2[5], objArr4);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(modifierMetaStateMask, minimumFlingVelocity, offsetAfter, 1596667560, false, (String) objArr4[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char windowTouchSlop = (char) (29944 - (ViewConfiguration.getWindowTouchSlop() >> 8));
                    int gidForName = 1754 - Process.getGidForName("");
                    int pressedStateDuration = 23 - (ViewConfiguration.getPressedStateDuration() >> 16);
                    byte[] bArr3 = $$a;
                    Object[] objArr5 = new Object[1];
                    a((byte) 88, bArr3[7], bArr3[5], objArr5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(windowTouchSlop, gidForName, pressedStateDuration, 1599039318, false, (String) objArr5[0], null);
                }
                Object[] objArr6 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArrTuitionPaymentFragmentbindingInflater1$5f1425da = new Object[]{new int[]{((int[]) objArr6[0])[0]}, new int[]{((int[]) objArr6[1])[0]}, (Object[]) objArr6[2], new int[1], (String[]) objArr6[4]};
                int iNextInt = new Random().nextInt(1938096928);
                int i4 = (-1492734885) + (((~((-407509061) | iNextInt)) | 194906634) * (-318));
                int i5 = ~(194906634 | iNextInt);
                int i6 = ~iNextInt;
                int i7 = ((i4 + ((i5 | (~((-60031499) | i6))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET)) + (((~(iNextInt | (-60031499))) | (~(467540558 | i6))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET)) - 1714315864;
                int i8 = (i7 << 13) ^ i7;
                int i9 = i8 ^ (i8 >>> 17);
                ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[3])[0] = i9 ^ (i9 << 5);
            } else {
                Object[] objArr7 = new Object[1];
                c(new char[]{14239, 14325, 38730, 54029, 41039, 10357, 10947, 59088, 10025, 34783, 14538, 63399, 5832, 46709, 2400, 50968, 1572, 42647, 6718, 54420}, View.resolveSizeAndState(0, 0, 0), objArr7);
                Class<?> cls2 = Class.forName((String) objArr7[0]);
                Object[] objArr8 = new Object[1];
                c(new char[]{34639, 34598, 52133, 36839, 57759, 27062, 39894, 22474, 38819, 56112, 30991, 18085, 42551, 60112, 18576, 30236, 46788, 64102, 23535, 25993}, Color.argb(0, 0, 0, 0), objArr8);
                int iIntValue = ((Integer) cls2.getMethod((String) objArr8[0], Object.class).invoke(null, this)).intValue();
                try {
                    Object[] objArr9 = {-1775161844};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 42048), TextUtils.getCapsMode("", 0, 0) + 1726, 30 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), -1637387971, false, null, new Class[]{Integer.TYPE});
                    }
                    objArrTuitionPaymentFragmentbindingInflater1$5f1425da = CaptureSession1.Companion.TuitionPaymentFragmentbindingInflater1$5f1425da(iIntValue, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr9), -1714315864);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char packedPositionType = (char) (ExpandableListView.getPackedPositionType(0L) + 29944);
                        int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 1755;
                        int iBlue = Color.blue(0) + 23;
                        byte[] bArr4 = $$a;
                        Object[] objArr10 = new Object[1];
                        a((byte) 88, bArr4[7], bArr4[5], objArr10);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(packedPositionType, touchSlop, iBlue, 1599039318, false, (String) objArr10[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArrTuitionPaymentFragmentbindingInflater1$5f1425da);
                    try {
                        Object[] objArr11 = new Object[1];
                        c(new char[]{6042, 6139, 63227, 45747, 50054, 19374, 16195, 62275, 1901, 58980, 23302, 57959, 14021, 55190, 27348, 53938, 9771, 50990, 31206, 49436, 21911, 13430, 2374, 12798, 17665, 9670}, Color.green(0), objArr11);
                        Class<?> cls3 = Class.forName((String) objArr11[0]);
                        Object[] objArr12 = new Object[1];
                        c(new char[]{27488, 27397, 49842, 34552, 31389, 62128, 23399, 38757, 31627, 53795, 57885, 34367, 18997, 58319, 54157, 46769, 23233, 62331, 49388}, KeyEvent.getDeadChar(0, 0), objArr12);
                        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr12[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cResolveSizeAndState = (char) (View.resolveSizeAndState(0, 0, 0) + 29944);
                            int edgeSlop = 1755 - (ViewConfiguration.getEdgeSlop() >> 16);
                            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 24;
                            byte[] bArr5 = $$a;
                            Object[] objArr13 = new Object[1];
                            a((byte) (bArr5[17] + 1), bArr5[7], bArr5[5], objArr13);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cResolveSizeAndState, edgeSlop, iIndexOf, 1596667560, false, (String) objArr13[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                            char cIndexOf = (char) (29944 - TextUtils.indexOf("", "", 0, 0));
                            int iBlue2 = Color.blue(0) + 1755;
                            int i10 = 24 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                            byte[] bArr6 = $$a;
                            byte b4 = bArr6[28];
                            byte b5 = bArr6[7];
                            Object[] objArr14 = new Object[1];
                            a(b4, b5, b5, objArr14);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cIndexOf, iBlue2, i10, 986134021, false, (String) objArr14[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            if (((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[0])[0] != ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[1])[0]) {
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[4];
                if (strArr == null) {
                    throw null;
                }
                for (String str : strArr) {
                    arrayList.add(str);
                }
                throw null;
            }
            int i11 = b + 9;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i11 % 128;
            int i12 = i11 % 2;
            int i13 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[3])[0];
            Object[] objArr15 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[4]};
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i14 = i13 + (-396168939) + (((~(89090557 | iUptimeMillis)) | 301692983) * (-366)) + (((~(iUptimeMillis | 369064447)) | 21719093) * 366);
            int i15 = (i14 << 13) ^ i14;
            int i16 = i15 ^ (i15 >>> 17);
            ((int[]) objArr15[3])[0] = i16 ^ (i16 << 5);
            try {
                if (updateTransformation.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == 0) {
                    i = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 119;
                } else {
                    updateTransformation.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentbindingInflater1(new Runnable() { // from class: updateTransformation.3.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            lambdainitGlRenderer10androidxcameracoreprocessingDefaultSurfaceProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2(updateTransformation.this, updateTransformation.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                        }
                    });
                    if (updateTransformation.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 != 0) {
                        return;
                    } else {
                        i = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 65;
                    }
                }
                b = i % 128;
                int i17 = i % 2;
                do {
                    ByteBuffer byteBufferTuitionPaymentFragmentspecialinlinedviewModeldefault2 = AutoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault2(Math.min(Math.max(updateTransformation.this.TuitionPaymentFragmentbindingInflater1, 4096), 262144));
                    int i18 = updateTransformation.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.read(byteBufferTuitionPaymentFragmentspecialinlinedviewModeldefault2.array());
                    int i19 = ((int[]) objArr15[3])[0];
                    int i20 = i19 * i19;
                    int i21 = -(451071668 * i19);
                    int i22 = (i20 & i21) + (i20 | i21);
                    int i23 = -(i19 * (-2127062606));
                    int i24 = ((i22 & i23) + (i23 | i22)) - (-1808974377);
                    int i25 = i24 >> 26;
                    int i26 = ((i25 ^ ComposerKt.defaultsKey) + ((i25 & ComposerKt.defaultsKey) << 1)) / 64;
                    int i27 = (i26 ^ 1) + ((i26 & 1) << 1);
                    int i28 = ((i24 | i27) << 1) - (i27 ^ i24);
                    int i29 = i24 >> 21;
                    int i30 = ((i29 & (-4095)) + (i29 | (-4095))) / 2048;
                    int i31 = -(((i30 & 1) + (i30 | 1)) ^ i28);
                    int i32 = ((i31 | 9) << 1) - (i31 ^ 9);
                    int i33 = ((i32 >> 27) - 63) / 32;
                    int i34 = ((i33 | 1) << 1) - (i33 ^ 1);
                    if ((-5193) / (((-((i34 ^ 1) + ((i34 & 1) << 1))) & i32) * 577) == i18) {
                        updateTransformation.TuitionPaymentFragmentspecialinlinedviewModeldefault2(updateTransformation.this, null);
                        return;
                    }
                    updateTransformation.this.TuitionPaymentFragmentbindingInflater1 = i18 * 2;
                    byteBufferTuitionPaymentFragmentspecialinlinedviewModeldefault2.limit(i18);
                    updateTransformation.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(byteBufferTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    updateTransformation.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentbindingInflater1(new Runnable() { // from class: updateTransformation.3.4
                        @Override // java.lang.Runnable
                        public final void run() {
                            lambdainitGlRenderer10androidxcameracoreprocessingDefaultSurfaceProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2(updateTransformation.this, updateTransformation.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                        }
                    });
                    if (updateTransformation.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 != 0) {
                        return;
                    }
                } while (!updateTransformation.this.f_());
            } catch (Exception e2) {
                updateTransformation.TuitionPaymentFragmentspecialinlinedviewModeldefault2(updateTransformation.this, e2);
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0025  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$e(byte r6, short r7, byte r8) {
            /*
                int r8 = r8 * 2
                int r8 = 107 - r8
                int r7 = r7 * 2
                int r7 = 3 - r7
                int r6 = r6 * 2
                int r0 = r6 + 1
                byte[] r1 = defpackage.updateTransformation.AnonymousClass3.$$c
                byte[] r0 = new byte[r0]
                r2 = 0
                if (r1 != 0) goto L17
                r4 = r6
                r8 = r7
                r3 = r2
                goto L2c
            L17:
                r3 = r2
            L18:
                int r7 = r7 + 1
                byte r4 = (byte) r8
                r0[r3] = r4
                if (r3 != r6) goto L25
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                return r6
            L25:
                int r3 = r3 + 1
                r4 = r1[r7]
                r5 = r8
                r8 = r7
                r7 = r5
            L2c:
                int r4 = -r4
                int r7 = r7 + r4
                r5 = r8
                r8 = r7
                r7 = r5
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.updateTransformation.AnonymousClass3.$$e(byte, short, byte):java.lang.String");
        }
    };

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(short r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = defpackage.updateTransformation.$$a
            int r7 = r7 * 52
            int r1 = 53 - r7
            int r6 = r6 * 14
            int r6 = r6 + 84
            int r8 = r8 + 4
            byte[] r1 = new byte[r1]
            int r7 = 52 - r7
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L2e
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r8 = r8 + 1
            if (r3 != r7) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2e:
            int r8 = -r8
            int r6 = r6 + r8
            int r6 = r6 + (-11)
            r8 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.updateTransformation.e(short, short, short, java.lang.Object[]):void");
    }

    static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(updateTransformation updatetransformation, Exception exc) {
        int i = 2 % 2;
        updatetransformation.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentbindingInflater1(updatetransformation.new AnonymousClass1(exc), 0L);
        int i2 = onTransact + 117;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public updateTransformation(AsyncServer asyncServer, InputStream inputStream) {
        this.d = asyncServer;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = inputStream;
        new Thread(this.f1424a).start();
    }

    @Override // defpackage.checkReadyToRelease
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(lambdasnapshot8androidxcameracoreprocessingDefaultSurfaceProcessor lambdasnapshot8androidxcameracoreprocessingdefaultsurfaceprocessor) {
        int i = 2 % 2;
        int i2 = asInterface + 41;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        this.b = lambdasnapshot8androidxcameracoreprocessingdefaultsurfaceprocessor;
        if (i3 == 0) {
            throw null;
        }
    }

    @Override // defpackage.checkReadyToRelease
    public final lambdasnapshot8androidxcameracoreprocessingDefaultSurfaceProcessor i_() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 81;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        lambdasnapshot8androidxcameracoreprocessingDefaultSurfaceProcessor lambdasnapshot8androidxcameracoreprocessingdefaultsurfaceprocessor = this.b;
        int i5 = i2 + 119;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return lambdasnapshot8androidxcameracoreprocessingdefaultsurfaceprocessor;
    }

    @Override // defpackage.checkReadyToRelease
    public final void g_() {
        int i = 2 % 2;
        int i2 = onTransact + 117;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        this.g = true;
        int i5 = i3 + 31;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // defpackage.checkReadyToRelease
    public final void h_() {
        int i = 2 % 2;
        this.g = false;
        new Thread(this.f1424a).start();
        int i2 = onTransact + 53;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX INFO: renamed from: updateTransformation$1, reason: invalid class name */
    final class AnonymousClass1 implements Runnable {
        private /* synthetic */ Exception TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        AnonymousClass1(Exception exc) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = exc;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Exception e2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            try {
                updateTransformation.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.close();
            } catch (Exception e3) {
                e2 = e3;
            }
            if (updateTransformation.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                updateTransformation.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(e2);
            }
        }
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        int i3 = $10 + 55;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i5 = $11 + 35;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = getrealtimecapturelatency.b;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (19472 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), 2624 - View.resolveSize(0, 0), View.combineMeasuredStates(0, 0) + 13, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i7] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (asBinder ^ 9053247990562531611L);
                Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 39422), 481 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 37 - (ViewConfiguration.getJumpTapTimeout() >> 16), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr2 = new char[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i8 = $10 + 117;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((-16737794) - Color.rgb(0, 0, 0)), (ViewConfiguration.getPressedStateDuration() >> 16) + 481, 37 - TextUtils.indexOf("", "", 0), 1781041463, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }

    @Override // defpackage.checkReadyToRelease
    public final boolean f_() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = asInterface + 117;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1096626159);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (46399 - TextUtils.lastIndexOf("", '0', 0, 0)), 40 - (ViewConfiguration.getScrollDefaultDelay() >> 16), TextUtils.lastIndexOf("", '0') + 20, 1513912262, false, "b", null);
        }
        int i4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-914723831);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (37836 - TextUtils.getOffsetAfter("", 0)), 59 - (ViewConfiguration.getTapTimeout() >> 16), 18 - ExpandableListView.getPackedPositionGroup(0L), 769969118, false, "TuitionPaymentFragmentbindingInflater1", null);
        }
        int i5 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(null);
        long j = i5;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-639884696);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (37835 - TextUtils.indexOf((CharSequence) "", '0')), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 59, 18 - TextUtils.indexOf("", "", 0), 1027769791, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
        }
        int i6 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).getInt(null);
        long j2 = -112;
        long j3 = -1;
        long j4 = j3 ^ 4128409658673721571L;
        long jIdentityHashCode = System.identityHashCode(this);
        long j5 = j4 | (jIdentityHashCode ^ j3);
        long j6 = j3 ^ 1390843838486064668L;
        long j7 = (j2 * 1390843838486064668L) + (j2 * 4128409658673721571L) + (((long) 226) * ((j5 ^ j3) | 1390843838486064668L)) + (((long) (-113)) * (((j6 | 4128409658673721571L) ^ j3) | ((j6 | jIdentityHashCode) ^ j3) | ((j5 | 1390843838486064668L) ^ j3))) + (((long) 113) * ((j4 | jIdentityHashCode) ^ j3));
        int i7 = 0;
        while (true) {
            int i8 = 0;
            while (i8 != 8) {
                int i9 = asInterface + 73;
                onTransact = i9 % 128;
                if (i9 % 2 == 0) {
                    i6 += ((((int) (j >>> i8)) & 21286) >>> (i6 << 90)) / (i6 * 28);
                    i8 += 39;
                } else {
                    i6 = (((((int) (j >> i8)) & 255) + (i6 << 6)) + (i6 << 16)) - i6;
                    i8++;
                }
            }
            if (i7 != 0) {
                break;
            }
            i7++;
            j = j7;
        }
        if (i6 != i4) {
            int i10 = asInterface + 61;
            onTransact = i10 % 128;
            int i11 = i10 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551937752);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TextUtils.indexOf("", "", 0, 0) + 46400), 40 - (ViewConfiguration.getJumpTapTimeout() >> 16), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 19, -1205987569, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault2", null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null);
            Toast.makeText((Context) null, i5 / (((i5 - 1) * i5) % 2), 0).show();
        }
        return this.g;
    }

    @Override // defpackage.checkReadyToRelease
    public final void b(lambdainitGlRenderer9androidxcameracoreprocessingDefaultSurfaceProcessor lambdainitglrenderer9androidxcameracoreprocessingdefaultsurfaceprocessor) {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 3;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = lambdainitglrenderer9androidxcameracoreprocessingdefaultsurfaceprocessor;
        int i5 = i2 + 41;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    @Override // defpackage.checkReadyToRelease
    public final AsyncServer TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 59;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        AsyncServer asyncServer = this.d;
        int i5 = i2 + 5;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return asyncServer;
    }

    @Override // defpackage.checkReadyToRelease
    public final void TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentbindingInflater1(new AnonymousClass1(null), 0L);
        try {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.close();
            int i2 = asInterface + 49;
            onTransact = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        } catch (Exception unused) {
        }
    }

    /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
        java.util.NoSuchElementException
        	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
        	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    public static java.lang.Object[] TuitionPaymentFragmentbindingInflater1(java.lang.Class r33, int r34, int r35, int r36) {
        /*
            Method dump skipped, instruction units count: 2900
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.updateTransformation.TuitionPaymentFragmentbindingInflater1(java.lang.Class, int, int, int):java.lang.Object[]");
    }
}
