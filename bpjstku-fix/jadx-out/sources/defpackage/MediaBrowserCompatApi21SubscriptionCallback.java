package defpackage;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public final class MediaBrowserCompatApi21SubscriptionCallback extends InputStream {
    private final InputStream TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private int b = BasicMeasure.EXACTLY;
    private static final byte[] $$c = {119, -102, -34, -3};
    private static final int $$d = 152;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {88, ByteCompanionObject.MAX_VALUE, -112, -47, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
    private static final int $$b = 158;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
    private static long TuitionPaymentFragmentbindingInflater1 = -4032705300126809824L;

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r7, short r8, short r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 * 52
            int r8 = 55 - r8
            int r7 = r7 * 14
            int r7 = r7 + 84
            int r9 = 53 - r9
            byte[] r0 = defpackage.MediaBrowserCompatApi21SubscriptionCallback.$$a
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r5 = r2
            goto L2b
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r9) goto L24
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L24:
            int r8 = r8 + 1
            r3 = r0[r8]
            r6 = r3
            r3 = r8
            r8 = r6
        L2b:
            int r7 = r7 + r8
            int r7 = r7 + (-11)
            r8 = r3
            r3 = r5
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.MediaBrowserCompatApi21SubscriptionCallback.a(int, short, short, java.lang.Object[]):void");
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        abortCapture abortcapture = new abortCapture();
        char[] cArrB = abortCapture.b(TuitionPaymentFragmentbindingInflater1 ^ (-2687588926731523482L), cArr, i);
        abortcapture.b = 4;
        while (abortcapture.b < cArrB.length) {
            int i3 = $10 + 77;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
            int i5 = abortcapture.b;
            try {
                Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(TuitionPaymentFragmentbindingInflater1)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (64839 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 1356 - View.MeasureSpec.getMode(0), 38 - View.MeasureSpec.getSize(0), 894276454, false, $$e(b, b2, b2), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrB[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {abortcapture, abortcapture};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ExpandableListView.getPackedPositionGroup(0L) + 47773), TextUtils.lastIndexOf("", '0', 0, 0) + 469, View.MeasureSpec.makeMeasureSpec(0, 0) + 13, 896083767, false, "n", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                int i6 = $10 + 105;
                $11 = i6 % 128;
                int i7 = i6 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrB, 4, cArrB.length - 4);
    }

    public MediaBrowserCompatApi21SubscriptionCallback(InputStream inputStream) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = inputStream;
    }

    @Override // java.io.InputStream
    public final int read() throws Throwable {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 119;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.read());
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 93;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
        return iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws Throwable {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.read(bArr));
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 != 0) {
            return iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
        throw null;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws Throwable {
        int i3 = 2 % 2;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 25;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.read(bArr, i, i2));
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 121;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
        if (i6 % 2 == 0) {
            return iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 95;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        InputStream inputStream = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (i3 == 0) {
            return inputStream.skip(j);
        }
        inputStream.skip(j);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // java.io.InputStream
    public final int available() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.b;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.close();
        if (i3 == 0) {
            int i4 = 34 / 0;
        }
    }

    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i) throws Throwable {
        Object[] objArr;
        int i2 = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
        int i3 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            int iNormalizeMetaState = 651 - KeyEvent.normalizeMetaState(0);
            int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 44;
            byte[] bArr = $$a;
            byte b = bArr[7];
            Object[] objArr2 = new Object[1];
            a(b, bArr[80], b, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, iNormalizeMetaState, longPressTimeout, -459846511, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{27123, 27026, 45501, 6805, 695, 21297, 21599, 21137, 50308, 17058, 375, 65013, 13228, 8080, 45605, 3936, 28354, 43112, 24343, 23118, 56830, 17776, 2103, 58732, 2280, 5696}, View.MeasureSpec.makeMeasureSpec(0, 0), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{6328, 6365, 9579, 36417, 17038, 59826, 5219, 59408, 46547, 54906, 16718, 18186, 17133, 35670, 62046, 46532, 8089, 15522, 7999}, View.combineMeasuredStates(0, 0), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
            int i4 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 650;
            int offsetAfter = 44 - TextUtils.getOffsetAfter("", 0);
            byte[] bArr2 = $$a;
            byte b2 = bArr2[80];
            byte b3 = bArr2[7];
            Object[] objArr5 = new Object[1];
            a(b2, b3, (byte) (b3 | 52), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, i4, offsetAfter, -873460649, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                int iArgb = Color.argb(0, 0, 0, 0) + 651;
                int bitsPerPixel = 43 - ImageFormat.getBitsPerPixel(0);
                byte b4 = $$a[7];
                byte b5 = b4;
                Object[] objArr6 = new Object[1];
                a(b4, b5, (byte) (b5 | 15), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(doubleTapTimeout, iArgb, bitsPerPixel, -1595579076, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[]{i ^ (i << 5)}};
            int i5 = ((int[]) objArr7[2])[0];
            int i6 = ((int[]) objArr7[0])[0];
            int i7 = ~i;
            int i8 = (((1134741573 + ((232253934 | i) * (-676))) + (((~(218571238 | i7)) | (-232253935)) * 676)) + ((((~(i7 | 215140428)) | 17113506) | (~((-13682697) | i))) * 676)) - 1470886500;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
        } else {
            try {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), View.MeasureSpec.getMode(0) + 1610, 26 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 2145681644, false, null, new Class[0]);
                }
                Object[] objArr8 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(null), -1470886500, 0};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cIndexOf2 = (char) TextUtils.indexOf("", "", 0, 0);
                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 652;
                    int iArgb2 = Color.argb(0, 0, 0, 0) + 44;
                    byte[] bArr3 = $$a;
                    byte b6 = bArr3[80];
                    byte b7 = bArr3[7];
                    Object[] objArr9 = new Object[1];
                    a(b6, b7, (byte) (b7 | 52), objArr9);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf2, iIndexOf, iArgb2, 2075921419, false, (String) objArr9[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), TextUtils.getCapsMode("", 0, 0) + 695, View.MeasureSpec.makeMeasureSpec(0, 0) + 98), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (63407 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 793 - KeyEvent.normalizeMetaState(0), 83 - KeyEvent.keyCodeFromString("")), Integer.TYPE, Integer.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr8);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char c2 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 652;
                    int iRgb = (-16777172) - Color.rgb(0, 0, 0);
                    byte b8 = $$a[7];
                    byte b9 = b8;
                    Object[] objArr10 = new Object[1];
                    a(b8, b9, (byte) (b9 | 15), objArr10);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, modifierMetaStateMask, iRgb, -1595579076, false, (String) objArr10[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr11 = new Object[1];
                    c(new char[]{27123, 27026, 45501, 6805, 695, 21297, 21599, 21137, 50308, 17058, 375, 65013, 13228, 8080, 45605, 3936, 28354, 43112, 24343, 23118, 56830, 17776, 2103, 58732, 2280, 5696}, (-1) - Process.getGidForName(""), objArr11);
                    Class<?> cls2 = Class.forName((String) objArr11[0]);
                    Object[] objArr12 = new Object[1];
                    c(new char[]{6328, 6365, 9579, 36417, 17038, 59826, 5219, 59408, 46547, 54906, 16718, 18186, 17133, 35670, 62046, 46532, 8089, 15522, 7999}, KeyEvent.keyCodeFromString(""), objArr12);
                    long jLongValue2 = ((Long) cls2.getDeclaredMethod((String) objArr12[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        int i11 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 650;
                        int iRed = Color.red(0) + 44;
                        byte[] bArr4 = $$a;
                        byte b10 = bArr4[80];
                        byte b11 = bArr4[7];
                        Object[] objArr13 = new Object[1];
                        a(b10, b11, (byte) (b11 | 52), objArr13);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(minimumFlingVelocity, i11, iRed, -873460649, false, (String) objArr13[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char c3 = (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                        int iIndexOf2 = 650 - TextUtils.indexOf((CharSequence) "", '0', 0);
                        int iIndexOf3 = 44 - TextUtils.indexOf("", "", 0);
                        byte[] bArr5 = $$a;
                        byte b12 = bArr5[7];
                        Object[] objArr14 = new Object[1];
                        a(b12, bArr5[80], b12, objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c3, iIndexOf2, iIndexOf3, -459846511, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
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
        int i12 = ((int[]) objArr[0])[0];
        int i13 = ((int[]) objArr[2])[0];
        if (i13 != i12) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[1];
            if (strArr != null) {
                int i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 57;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i14 % 128;
                int i15 = i14 % 2;
                while (i3 < strArr.length) {
                    int i16 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 51;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i16 % 128;
                    if (i16 % 2 != 0) {
                        arrayList.add(strArr[i3]);
                        i3 += 85;
                    } else {
                        arrayList.add(strArr[i3]);
                        i3++;
                    }
                }
            }
            throw new RuntimeException(String.valueOf(i13));
        }
        int i17 = ((int[]) objArr[3])[0];
        int i18 = ((int[]) objArr[2])[0];
        int i19 = ((int[]) objArr[0])[0];
        new int[1][0] = i18;
        new int[1][0] = i19;
        int i20 = ~i;
        int i21 = i17 + (-1777159062) + (((~((-692136484) | i20)) | (-688705674)) * 519) + (((~(i20 | (-687865858))) | (~((-839817) | i))) * (-519)) + (((~(i | (-688705674))) | 692136483) * 519);
        int i22 = (i21 << 13) ^ i21;
        int i23 = i22 ^ (i22 >>> 17);
        int[] iArr = {i23 ^ (i23 << 5)};
        int i24 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 115;
        int i25 = i24 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i25;
        int i26 = i24 % 2;
        int i27 = iArr[0];
        int i28 = i27 * i27;
        int i29 = -(1985508522 * i27);
        int i30 = (i28 & i29) + (i28 | i29);
        int i31 = -(i27 * 72540530);
        int i32 = (i30 & i31) + (i31 | i30);
        int i33 = (i32 & (-1248348988)) + ((-1248348988) | i32);
        int i34 = i33 >> 26;
        int i35 = (((i34 | ComposerKt.defaultsKey) << 1) - (i34 ^ ComposerKt.defaultsKey)) / 64;
        int i36 = (i35 ^ 1) + ((i35 & 1) << 1);
        int i37 = (i33 & i36) + (i36 | i33);
        int i38 = ((i33 >> 20) - 8191) / 4096;
        int i39 = -(i37 ^ ((i38 & 1) + (i38 | 1)));
        int i40 = ((i39 | 4) << 1) - (i39 ^ 4);
        int i41 = i40 >> 19;
        int i42 = (((i41 | (-16383)) << 1) - (i41 ^ (-16383))) / 8192;
        int i43 = (i42 ^ 1) + ((i42 & 1) << 1);
        if (i == (-2892) / (((-(((i43 | 1) << 1) - (i43 ^ 1))) & i40) * 723)) {
            int i44 = i25 + 51;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i44 % 128;
            int i45 = i44 % 2;
            this.b = 0;
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(int r6, int r7, byte r8) {
        /*
            int r7 = r7 * 3
            int r7 = 4 - r7
            int r8 = r8 * 4
            int r0 = 1 - r8
            int r6 = r6 * 4
            int r6 = r6 + 107
            byte[] r1 = defpackage.MediaBrowserCompatApi21SubscriptionCallback.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            int r8 = 0 - r8
            if (r1 != 0) goto L19
            r6 = r7
            r4 = r8
            r3 = r2
            goto L2f
        L19:
            r3 = r2
        L1a:
            r5 = r7
            r7 = r6
            r6 = r5
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r8) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L28:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r7
            r7 = r6
            r6 = r5
        L2f:
            int r7 = r7 + 1
            int r6 = r6 + r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.MediaBrowserCompatApi21SubscriptionCallback.$$e(int, int, byte):java.lang.String");
    }
}
