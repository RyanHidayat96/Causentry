package com.google.common.collect;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.exifinterface.media.ExifInterface;
import defpackage.getCaptureConfig;
import defpackage.getSupportedPostviewSize;
import defpackage.initSession;
import defpackage.mergeOptionValue;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Random;
import java.util.SortedSet;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ImmutableSortedSet<E> extends ImmutableSet<E> implements NavigableSet<E>, getCaptureConfig<E> {
    private static final long serialVersionUID = 912559;
    final transient Comparator<? super E> TuitionPaymentFragmentbindingInflater1;
    private transient ImmutableSortedSet<E> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static final byte[] $$c = {59, -124, -78, 46};
    private static final int $$f = 215;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {55, -47, -47, 67, 6, 23, -41, 38, 23, 12, 9, 5, -5, -16, 42, -3, 9, -57, 56, 41, -4, 19, -3, 14, 7, -22, 25, 32, -4, 0, 17, 14, -38, 52, -9, 14, 14, 0, 17, 14, -10, 15, 13, -2, 13, 13, 1, -22, 45, 0, 14, -3, 27, -7, 21, -57, 41, -4, 19, -3, 14, 7, -22, 25, 32, -4, 0, 17, 14, -38, 52, -9, 14, 14, 0, 17, 14, 7, 5, -3, 6, 14, 0, 19, 5, 13, 6, 5, 13, -1, 7, 26, -5, 4, 26, -34, 42, -3, 9, 15, 0, 9, 9, 3, 28, -1, 16, -57};
    private static final int $$h = 109;
    private static final byte[] $$a = {14, 70, 6, -35, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
    private static final int $$b = 185;
    private static int asInterface = 0;
    private static int g = 1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {47478, 47465, 47475, 47461, 47464, 47470, 47401, 47460, 47428, 47518, 47459, 47474, 47466, 47444, 47467, 47476, 47468, 47463, 47429, 47446, 47457, 47427, 47471, 47458, 47469, 47472, 47439};
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2047719703;
    private static boolean b = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f813a = true;

    private static void c(byte b2, byte b3, int i, Object[] objArr) {
        byte[] bArr = $$a;
        int i2 = (i * 3) + 84;
        int i3 = b2 * 15;
        int i4 = (b3 * 52) + 4;
        byte[] bArr2 = new byte[i3 + 38];
        int i5 = i3 + 37;
        int i6 = -1;
        if (bArr == null) {
            i2 = (i4 + (-i2)) - 11;
            i4++;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i2;
            if (i6 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i7 = i2;
            i2 = (i7 + (-bArr[i4])) - 11;
            i4++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(short r7, short r8, short r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 19
            int r7 = r7 + 84
            byte[] r0 = com.google.common.collect.ImmutableSortedSet.$$g
            int r9 = r9 + 4
            int r8 = r8 * 4
            int r8 = r8 + 53
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r9
            r4 = r2
            goto L2b
        L14:
            r3 = r2
        L15:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            int r9 = r9 + 1
            if (r4 != r8) goto L26
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L26:
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L2b:
            int r7 = r7 + r9
            int r7 = r7 + (-8)
            r9 = r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.ImmutableSortedSet.f(short, short, short, java.lang.Object[]):void");
    }

    abstract ImmutableSortedSet<E> TuitionPaymentFragmentbindingInflater1(E e2, boolean z);

    abstract ImmutableSortedSet<E> TuitionPaymentFragmentbindingInflater1(E e2, boolean z, E e3, boolean z2);

    abstract ImmutableSortedSet<E> TuitionPaymentFragmentspecialinlinedviewModeldefault3(E e2, boolean z);

    abstract ImmutableSortedSet<E> cancel();

    public abstract mergeOptionValue<E> cancelAll();

    @Override // java.util.NavigableSet
    public /* synthetic */ Iterator descendingIterator() {
        int i = 2 % 2;
        int i2 = asInterface + 21;
        g = i2 % 128;
        int i3 = i2 % 2;
        mergeOptionValue<E> mergeoptionvalueCancelAll = cancelAll();
        int i4 = asInterface + 117;
        g = i4 % 128;
        int i5 = i4 % 2;
        return mergeoptionvalueCancelAll;
    }

    private static void e(char[] cArr, int[] iArr, int i, byte[] bArr, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
        char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        char c = '0';
        int i4 = 0;
        if (cArr2 != null) {
            int i5 = $10 + 49;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $10 + 57;
                $11 = i8 % 128;
                if (i8 % i2 == 0) {
                    try {
                        Object[] objArr2 = new Object[1];
                        objArr2[i4] = Integer.valueOf(cArr2[i7]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char capsMode = (char) (TextUtils.getCapsMode("", i4, i4) + 31339);
                            int scrollDefaultDelay = 2994 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                            int iIndexOf = 16 - TextUtils.indexOf("", c, i4, i4);
                            byte b2 = (byte) i4;
                            byte b3 = b2;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(capsMode, scrollDefaultDelay, iIndexOf, 1182129903, false, $$i(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                        }
                        cArr3[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i7])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.lastIndexOf("", '0', 0) + 31340), 2995 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 17 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 1182129903, false, $$i(b4, b5, (byte) (b5 + 1)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i7++;
                }
                i2 = 2;
                c = '0';
                i4 = 0;
            }
            int i9 = $10 + 71;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 3 % 5;
            }
            cArr2 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (KeyEvent.keyCodeFromString("") + 43325), 253 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 22 - ((Process.getThreadPriority(0) + 20) >> 6), 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
        if (f813a) {
            int i11 = $11 + 85;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
            char[] cArr4 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                cArr4[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (33602 - View.combineMeasuredStates(0, 0)), TextUtils.indexOf((CharSequence) "", '0', 0) + 3086, 26 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), -2146875848, false, $$i(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr4);
            return;
        }
        int i13 = 0;
        if (b) {
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
            char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                Object[] objArr6 = {getsupportedpostviewsize, getsupportedpostviewsize};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (33601 - TextUtils.lastIndexOf("", '0', 0)), View.getDefaultSize(0, 0) + 3085, 26 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -2146875848, false, $$i(b8, b9, b9), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
            }
            objArr[0] = new String(cArr5);
            return;
        }
        getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
        char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
        while (true) {
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i13;
            if (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >= getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                objArr[0] = new String(cArr6);
                return;
            } else {
                cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                i13 = getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1;
            }
        }
    }

    @Override // java.util.NavigableSet
    public /* synthetic */ NavigableSet descendingSet() throws Throwable {
        Object[] objArr;
        char c;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char threadPriority = (char) ((Process.getThreadPriority(0) + 20) >> 6);
            int iAlpha = 2267 - Color.alpha(0);
            int iLastIndexOf = 32 - TextUtils.lastIndexOf("", '0', 0, 0);
            byte[] bArr = $$a;
            byte b2 = bArr[5];
            byte b3 = bArr[7];
            Object[] objArr2 = new Object[1];
            c(b2, b3, b3, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(threadPriority, iAlpha, iLastIndexOf, -887667012, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(null, null, 127 - (ViewConfiguration.getKeyRepeatDelay() >> 16), new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(null, null, AndroidCharacter.getMirror('0') + 'O', new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
            int iResolveOpacity = 2267 - Drawable.resolveOpacity(0, 0);
            int maximumFlingVelocity = 33 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
            byte[] bArr2 = $$a;
            byte b4 = bArr2[5];
            Object[] objArr5 = new Object[1];
            c(b4, b4, bArr2[7], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(windowTouchSlop, iResolveOpacity, maximumFlingVelocity, -874156483, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i2 = g + 77;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cGreen = (char) Color.green(0);
                int i4 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 2267;
                int i5 = 34 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                byte[] bArr3 = $$a;
                byte b5 = bArr3[7];
                Object[] objArr6 = new Object[1];
                c(b5, bArr3[40], b5, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cGreen, i4, i5, -654680577, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i6 = ((int[]) objArr7[0])[0];
            int i7 = ((int[]) objArr7[3])[0];
            String[] strArr = (String[]) objArr7[1];
            int iIdentityHashCode = System.identityHashCode(this);
            int i8 = ~iIdentityHashCode;
            int i9 = ((((~((-295083067) | i8)) | (~(iIdentityHashCode | 513630249))) * 959) - 57934733) + (((~(iIdentityHashCode | (-295083067))) | (~(i8 | 513630249))) * 959) + 1979347379;
            int i10 = (i9 << 13) ^ i9;
            int i11 = i10 ^ (i10 >>> 17);
            ((int[]) objArr[2])[0] = i11 ^ (i11 << 5);
            c = 3;
        } else {
            Object[] objArr8 = new Object[1];
            e(null, null, View.resolveSizeAndState(0, 0, 0) + 127, new byte[]{-125, -127, -116, -124, -105, -106, -118, -117, -122, -107, -122, -117, -112, -108, -121, -110, -110, -127, -121, -125, -122, -123, -124, -125, -126, -127}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(null, null, 127 - ExpandableListView.getPackedPositionType(0L), new byte[]{-126, -123, -122, -117, -127, -112, -122, -113, -110, -110, -108, -117, -126, -116, -124, -124, -104, -112}, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            e(null, null, TextUtils.indexOf((CharSequence) "", '0') + 128, new byte[]{-115, -116, -117, -120, -118, -119, -121, -102, -126, -127, -113, -121, -127, -107, -127, -103}, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            e(null, null, View.MeasureSpec.makeMeasureSpec(0, 0) + 127, new byte[]{-116, -125, -123, -114, -105, -120, -127, -101, -118, -117, -122, -117, -126, -116, -125, -122}, objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i12 = asInterface + 73;
            g = i12 % 128;
            int i13 = i12 % 2;
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, 1979347379};
                byte[] bArr4 = $$g;
                Object[] objArr13 = new Object[1];
                f(bArr4[46], bArr4[29], bArr4[89], objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b6 = bArr4[29];
                byte b7 = b6;
                Object[] objArr14 = new Object[1];
                f(b6, b7, (byte) (b7 | 51), objArr14);
                objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (applicationContext != null) {
                    int i14 = asInterface + 83;
                    g = i14 % 128;
                    int i15 = i14 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char c2 = (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                        int iBlue = 2267 - Color.blue(0);
                        int offsetBefore = TextUtils.getOffsetBefore("", 0) + 33;
                        byte[] bArr5 = $$a;
                        byte b8 = bArr5[7];
                        Object[] objArr15 = new Object[1];
                        c(b8, bArr5[40], b8, objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, iBlue, offsetBefore, -654680577, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr16 = new Object[1];
                        e(null, null, ((byte) KeyEvent.getModifierMetaStateMask()) + ByteCompanionObject.MIN_VALUE, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr16);
                        Class<?> cls5 = Class.forName((String) objArr16[0]);
                        Object[] objArr17 = new Object[1];
                        e(null, null, Process.getGidForName("") + 128, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr17);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cIndexOf = (char) TextUtils.indexOf("", "");
                            int offsetAfter = TextUtils.getOffsetAfter("", 0) + 2267;
                            int iGreen = 33 - Color.green(0);
                            byte[] bArr6 = $$a;
                            byte b9 = bArr6[5];
                            Object[] objArr18 = new Object[1];
                            c(b9, b9, bArr6[7], objArr18);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf, offsetAfter, iGreen, -874156483, false, (String) objArr18[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                            int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 2267;
                            int iMyPid = 33 - (Process.myPid() >> 22);
                            byte[] bArr7 = $$a;
                            byte b10 = bArr7[5];
                            byte b11 = bArr7[7];
                            Object[] objArr19 = new Object[1];
                            c(b10, b11, b11, objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(scrollBarFadeDuration, edgeSlop, iMyPid, -887667012, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                c = 3;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i16 = ((int[]) objArr[c])[0];
        int i17 = ((int[]) objArr[0])[0];
        if (i17 == i16) {
            Object[] objArr20 = {new int[]{i}, strArr, new int[1], new int[]{i}};
            int i18 = ((int[]) objArr[2])[0];
            int i19 = ((int[]) objArr[0])[0];
            int i20 = ((int[]) objArr[3])[0];
            String[] strArr2 = (String[]) objArr[1];
            int i21 = ~new Random().nextInt(1922343257);
            int i22 = i18 + 707595402 + ((~((-260784385) | i21)) * (-783)) + (((~(i21 | (-260785413))) | (-1069498729)) * 783);
            int i23 = (i22 << 13) ^ i22;
            int i24 = i23 ^ (i23 >>> 17);
            ((int[]) objArr20[2])[0] = i24 ^ (i24 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[1];
            if (strArr3 != null) {
                int i25 = g + 123;
                asInterface = i25 % 128;
                int i26 = i25 % 2;
                for (String str : strArr3) {
                    arrayList.add(str);
                }
            }
            Toast.makeText((Context) null, i17 / (((i17 - 1) * i17) % 2), 0).show();
            Object[] objArr21 = {new int[]{i}, strArr, new int[1], new int[]{i}};
            int i27 = ((int[]) objArr[2])[0];
            int i28 = ((int[]) objArr[0])[0];
            int i29 = ((int[]) objArr[3])[0];
            String[] strArr4 = (String[]) objArr[1];
            int iMyPid2 = Process.myPid();
            int i30 = ~iMyPid2;
            int i31 = i27 + (-1453893174) + (((~(142429698 | i30)) | 951143014) * (-90)) + (((~(142429698 | iMyPid2)) | 4981760) * (-45)) + (((~(iMyPid2 | (-951143015))) | 142429698 | (~(i30 | 951143014))) * 45);
            int i32 = (i31 << 13) ^ i31;
            int i33 = i32 ^ (i32 >>> 17);
            ((int[]) objArr21[2])[0] = i33 ^ (i33 << 5);
        }
        ImmutableSortedSet<E> immutableSortedSet = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (immutableSortedSet != null) {
            return immutableSortedSet;
        }
        int i34 = g + 27;
        asInterface = i34 % 128;
        if (i34 % 2 == 0) {
            ImmutableSortedSet<E> immutableSortedSetCancel = cancel();
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = immutableSortedSetCancel;
            immutableSortedSetCancel.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = this;
            return immutableSortedSetCancel;
        }
        ImmutableSortedSet<E> immutableSortedSetCancel2 = cancel();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = immutableSortedSetCancel2;
        immutableSortedSetCancel2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = this;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableSet
    public /* synthetic */ NavigableSet headSet(Object obj, boolean z) {
        int i = 2 % 2;
        int i2 = g + 85;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            TuitionPaymentFragmentbindingInflater1(obj, z);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        ImmutableSortedSet<E> immutableSortedSetTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(obj, z);
        int i3 = g + 43;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return immutableSortedSetTuitionPaymentFragmentbindingInflater1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableSet, java.util.SortedSet
    public /* synthetic */ SortedSet headSet(Object obj) {
        int i = 2 % 2;
        int i2 = g + 101;
        asInterface = i2 % 128;
        ImmutableSortedSet<E> immutableSortedSetTuitionPaymentFragmentbindingInflater1 = i2 % 2 != 0 ? TuitionPaymentFragmentbindingInflater1(obj, true) : TuitionPaymentFragmentbindingInflater1(obj, false);
        int i3 = g + 21;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            return immutableSortedSetTuitionPaymentFragmentbindingInflater1;
        }
        throw null;
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Iterator iterator() {
        int i = 2 % 2;
        int i2 = g + 49;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            iterator();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        mergeOptionValue<E> it = iterator();
        int i3 = g + 85;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return it;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableSet
    public /* synthetic */ NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        int i = 2 % 2;
        int i2 = asInterface + 3;
        g = i2 % 128;
        int i3 = i2 % 2;
        ImmutableSortedSet<E> immutableSortedSetB = b(obj, z, obj2, z2);
        int i4 = asInterface + 81;
        g = i4 % 128;
        if (i4 % 2 != 0) {
            return immutableSortedSetB;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableSet, java.util.SortedSet
    public /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = g + 95;
        asInterface = i2 % 128;
        ImmutableSortedSet<E> immutableSortedSetB = i2 % 2 != 0 ? b(obj, true, obj2, false) : b(obj, true, obj2, false);
        int i3 = asInterface + 33;
        g = i3 % 128;
        int i4 = i3 % 2;
        return immutableSortedSetB;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableSet
    public /* synthetic */ NavigableSet tailSet(Object obj, boolean z) {
        int i = 2 % 2;
        int i2 = asInterface + 125;
        g = i2 % 128;
        int i3 = i2 % 2;
        ImmutableSortedSet<E> immutableSortedSetTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(obj, z);
        int i4 = asInterface + 49;
        g = i4 % 128;
        int i5 = i4 % 2;
        return immutableSortedSetTuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableSet, java.util.SortedSet
    public /* synthetic */ SortedSet tailSet(Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 91;
        g = i2 % 128;
        int i3 = i2 % 2;
        ImmutableSortedSet<E> immutableSortedSetTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(obj, true);
        int i4 = asInterface + 71;
        g = i4 % 128;
        int i5 = i4 % 2;
        return immutableSortedSetTuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class TuitionPaymentFragmentbindingInflater1<E> extends ImmutableSet.TuitionPaymentFragmentspecialinlinedviewModeldefault2<E> {
        private final Comparator<? super E> TuitionPaymentFragmentbindingInflater1;

        public TuitionPaymentFragmentbindingInflater1(Comparator<? super E> comparator) {
            this.TuitionPaymentFragmentbindingInflater1 = comparator;
        }

        public final TuitionPaymentFragmentbindingInflater1<E> TuitionPaymentFragmentbindingInflater1(E... eArr) {
            super.TuitionPaymentFragmentspecialinlinedviewModeldefault1((Object[]) eArr);
            return this;
        }

        @Override // com.google.common.collect.ImmutableSet.TuitionPaymentFragmentspecialinlinedviewModeldefault2
        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: merged with bridge method [inline-methods] */
        public final ImmutableSortedSet<E> TuitionPaymentFragmentbindingInflater1() {
            ImmutableSortedSet<E> immutableSortedSetTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ImmutableSortedSet.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1, this.b, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            this.b = immutableSortedSetTuitionPaymentFragmentspecialinlinedviewModeldefault2.size();
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
            return immutableSortedSetTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ImmutableSet.TuitionPaymentFragmentspecialinlinedviewModeldefault2, com.google.common.collect.ImmutableCollection.TuitionPaymentFragmentspecialinlinedviewModeldefault1
        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1 */
        public final /* synthetic */ ImmutableCollection.TuitionPaymentFragmentspecialinlinedviewModeldefault1 TuitionPaymentFragmentbindingInflater1(Object obj) {
            super.TuitionPaymentFragmentbindingInflater1(obj);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ImmutableSet.TuitionPaymentFragmentspecialinlinedviewModeldefault2, com.google.common.collect.ImmutableCollection.TuitionPaymentFragmentspecialinlinedviewModeldefault1, com.google.common.collect.ImmutableCollection.TuitionPaymentFragmentbindingInflater1
        public final /* synthetic */ ImmutableCollection.TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentbindingInflater1(Object obj) {
            super.TuitionPaymentFragmentbindingInflater1(obj);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ImmutableSet.TuitionPaymentFragmentspecialinlinedviewModeldefault2, com.google.common.collect.ImmutableCollection.TuitionPaymentFragmentspecialinlinedviewModeldefault1, com.google.common.collect.ImmutableCollection.TuitionPaymentFragmentbindingInflater1
        public final /* synthetic */ ImmutableCollection.TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
            super.TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ImmutableSet.TuitionPaymentFragmentspecialinlinedviewModeldefault2
        /* JADX INFO: renamed from: b */
        public final /* bridge */ /* synthetic */ ImmutableSet.TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentbindingInflater1(Object obj) {
            super.TuitionPaymentFragmentbindingInflater1(obj);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ImmutableSet.TuitionPaymentFragmentspecialinlinedviewModeldefault2
        /* JADX INFO: renamed from: b */
        public final /* bridge */ /* synthetic */ ImmutableSet.TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
            super.TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
            return this;
        }

        @Override // com.google.common.collect.ImmutableSet.TuitionPaymentFragmentspecialinlinedviewModeldefault2, com.google.common.collect.ImmutableCollection.TuitionPaymentFragmentspecialinlinedviewModeldefault1, com.google.common.collect.ImmutableCollection.TuitionPaymentFragmentbindingInflater1
        public final /* synthetic */ ImmutableCollection.TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentspecialinlinedviewModeldefault3(Iterable iterable) {
            super.TuitionPaymentFragmentspecialinlinedviewModeldefault3(iterable);
            return this;
        }

        @Override // com.google.common.collect.ImmutableSet.TuitionPaymentFragmentspecialinlinedviewModeldefault2
        /* JADX INFO: renamed from: b */
        public final /* bridge */ /* synthetic */ ImmutableSet.TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentspecialinlinedviewModeldefault3(Iterable iterable) {
            super.TuitionPaymentFragmentspecialinlinedviewModeldefault3(iterable);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ImmutableSet.TuitionPaymentFragmentspecialinlinedviewModeldefault2
        public final /* bridge */ /* synthetic */ ImmutableSet.TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentbindingInflater1(ImmutableSet.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            super.TuitionPaymentFragmentbindingInflater1(tuitionPaymentFragmentspecialinlinedviewModeldefault2);
            return this;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
    
        if (defpackage.setVideoStabilization.TuitionPaymentFragmentspecialinlinedviewModeldefault2().equals(r7) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
    
        return com.google.common.collect.RegularImmutableSortedSet.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
    
        return new com.google.common.collect.RegularImmutableSortedSet(com.google.common.collect.ImmutableList.asInterface(), r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
    
        if ((!defpackage.setVideoStabilization.TuitionPaymentFragmentspecialinlinedviewModeldefault2().equals(r7)) != true) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static <E> com.google.common.collect.ImmutableSortedSet<E> TuitionPaymentFragmentspecialinlinedviewModeldefault2(java.util.Comparator<? super E> r7, int r8, E... r9) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.common.collect.ImmutableSortedSet.g
            int r2 = r1 + 57
            int r3 = r2 % 128
            com.google.common.collect.ImmutableSortedSet.asInterface = r3
            int r2 = r2 % r0
            r3 = 0
            if (r2 != 0) goto Laf
            r2 = 0
            r4 = 1
            if (r8 != 0) goto L42
            int r1 = r1 + 105
            int r8 = r1 % 128
            com.google.common.collect.ImmutableSortedSet.asInterface = r8
            int r1 = r1 % r0
            if (r1 == 0) goto L2b
            setVideoStabilization r8 = defpackage.setVideoStabilization.TuitionPaymentFragmentspecialinlinedviewModeldefault2()
            boolean r8 = r8.equals(r7)
            r9 = 22
            int r9 = r9 / r2
            r8 = r8 ^ r4
            if (r8 == r4) goto L38
            goto L35
        L2b:
            setVideoStabilization r8 = defpackage.setVideoStabilization.TuitionPaymentFragmentspecialinlinedviewModeldefault2()
            boolean r8 = r8.equals(r7)
            if (r8 == 0) goto L38
        L35:
            com.google.common.collect.RegularImmutableSortedSet<java.lang.Comparable> r7 = com.google.common.collect.RegularImmutableSortedSet.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            return r7
        L38:
            com.google.common.collect.RegularImmutableSortedSet r8 = new com.google.common.collect.RegularImmutableSortedSet
            com.google.common.collect.ImmutableList r9 = com.google.common.collect.ImmutableList.asInterface()
            r8.<init>(r9, r7)
            return r8
        L42:
            r1 = r2
        L43:
            if (r1 >= r8) goto L6f
            int r5 = com.google.common.collect.ImmutableSortedSet.g
            int r5 = r5 + 119
            int r6 = r5 % 128
            com.google.common.collect.ImmutableSortedSet.asInterface = r6
            int r5 = r5 % r0
            if (r5 == 0) goto L58
            r5 = r9[r1]
            r6 = 26
            int r6 = r6 / r2
            if (r5 == 0) goto L5f
            goto L5c
        L58:
            r5 = r9[r1]
            if (r5 == 0) goto L5f
        L5c:
            int r1 = r1 + 1
            goto L43
        L5f:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            java.lang.String r8 = "at index "
            java.lang.String r9 = java.lang.String.valueOf(r1)
            java.lang.String r8 = r8.concat(r9)
            r7.<init>(r8)
            throw r7
        L6f:
            java.util.Arrays.sort(r9, r2, r8, r7)
            int r1 = com.google.common.collect.ImmutableSortedSet.asInterface
            int r1 = r1 + 55
            int r2 = r1 % 128
            com.google.common.collect.ImmutableSortedSet.g = r2
            int r1 = r1 % r0
            r1 = r4
        L7c:
            if (r4 >= r8) goto L9a
            r2 = r9[r4]
            int r5 = r1 + (-1)
            r5 = r9[r5]
            int r5 = r7.compare(r2, r5)
            if (r5 == 0) goto L97
            r9[r1] = r2
            int r1 = r1 + 1
            int r2 = com.google.common.collect.ImmutableSortedSet.g
            int r2 = r2 + 29
            int r5 = r2 % 128
            com.google.common.collect.ImmutableSortedSet.asInterface = r5
            int r2 = r2 % r0
        L97:
            int r4 = r4 + 1
            goto L7c
        L9a:
            java.util.Arrays.fill(r9, r1, r8, r3)
            int r8 = r9.length
            int r8 = r8 / r0
            if (r1 >= r8) goto La5
            java.lang.Object[] r9 = java.util.Arrays.copyOf(r9, r1)
        La5:
            com.google.common.collect.RegularImmutableSortedSet r8 = new com.google.common.collect.RegularImmutableSortedSet
            com.google.common.collect.ImmutableList r9 = com.google.common.collect.ImmutableList.TuitionPaymentFragmentbindingInflater1(r9, r1)
            r8.<init>(r9, r7)
            return r8
        Laf:
            r3.hashCode()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.ImmutableSortedSet.TuitionPaymentFragmentspecialinlinedviewModeldefault2(java.util.Comparator, int, java.lang.Object[]):com.google.common.collect.ImmutableSortedSet");
    }

    /* JADX INFO: loaded from: classes6.dex */
    static class SerializedForm<E> implements Serializable {
        private static final long serialVersionUID = 0;
        final Comparator<? super E> comparator;
        final Object[] elements;

        public SerializedForm(Comparator<? super E> comparator, Object[] objArr) {
            this.comparator = comparator;
            this.elements = objArr;
        }

        /* JADX WARN: Multi-variable type inference failed */
        Object readResolve() {
            return new TuitionPaymentFragmentbindingInflater1(this.comparator).TuitionPaymentFragmentbindingInflater1(this.elements).TuitionPaymentFragmentbindingInflater1();
        }
    }

    ImmutableSortedSet(Comparator<? super E> comparator) {
        this.TuitionPaymentFragmentbindingInflater1 = comparator;
    }

    @Override // java.util.SortedSet, defpackage.getCaptureConfig
    public Comparator<? super E> comparator() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 51;
        g = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        Comparator<? super E> comparator = this.TuitionPaymentFragmentbindingInflater1;
        int i4 = i2 + 3;
        g = i4 % 128;
        int i5 = i4 % 2;
        return comparator;
    }

    private ImmutableSortedSet<E> b(E e2, boolean z, E e3, boolean z2) {
        int i = 2 % 2;
        int i2 = asInterface + 25;
        g = i2 % 128;
        int i3 = i2 % 2;
        if (this.TuitionPaymentFragmentbindingInflater1.compare(e2, e3) <= 0) {
            int i4 = g + 123;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            return TuitionPaymentFragmentbindingInflater1(e2, z, e3, z2);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.NavigableSet
    public E lower(E e2) {
        mergeOptionValue<E> mergeoptionvalueCancelAll;
        int i = 2 % 2;
        int i2 = asInterface + 67;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            mergeoptionvalueCancelAll = TuitionPaymentFragmentbindingInflater1(e2, false).cancelAll();
            if (!mergeoptionvalueCancelAll.hasNext()) {
                return null;
            }
        } else {
            mergeoptionvalueCancelAll = TuitionPaymentFragmentbindingInflater1(e2, false).cancelAll();
            if (!mergeoptionvalueCancelAll.hasNext()) {
                return null;
            }
        }
        int i3 = g + 31;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            return mergeoptionvalueCancelAll.next();
        }
        int i4 = 95 / 0;
        return mergeoptionvalueCancelAll.next();
    }

    @Override // java.util.NavigableSet
    public E floor(E e2) {
        mergeOptionValue<E> mergeoptionvalueCancelAll;
        int i = 2 % 2;
        int i2 = g + 83;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            mergeoptionvalueCancelAll = TuitionPaymentFragmentbindingInflater1(e2, false).cancelAll();
            if (!mergeoptionvalueCancelAll.hasNext()) {
                return null;
            }
        } else {
            mergeoptionvalueCancelAll = TuitionPaymentFragmentbindingInflater1(e2, true).cancelAll();
            if (!mergeoptionvalueCancelAll.hasNext()) {
                return null;
            }
        }
        E next = mergeoptionvalueCancelAll.next();
        int i3 = g + 41;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return next;
    }

    @Override // java.util.NavigableSet
    public E ceiling(E e2) {
        int i = 2 % 2;
        Iterator<E> it = TuitionPaymentFragmentspecialinlinedviewModeldefault3((Object) e2, true).iterator();
        Object obj = null;
        if (!it.hasNext()) {
            return null;
        }
        int i2 = g + 77;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            it.next();
            obj.hashCode();
            throw null;
        }
        E next = it.next();
        int i3 = g + 59;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 51 / 0;
        }
        return next;
    }

    @Override // java.util.NavigableSet
    public E higher(E e2) {
        Iterator<E> it;
        int i = 2 % 2;
        int i2 = g + 125;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            it = TuitionPaymentFragmentspecialinlinedviewModeldefault3((Object) e2, true).iterator();
            if (!it.hasNext()) {
                return null;
            }
        } else {
            it = TuitionPaymentFragmentspecialinlinedviewModeldefault3((Object) e2, false).iterator();
            if (!it.hasNext()) {
                return null;
            }
        }
        E next = it.next();
        int i3 = g + 11;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return next;
    }

    @Override // java.util.SortedSet
    public E first() {
        int i = 2 % 2;
        int i2 = asInterface + 19;
        g = i2 % 128;
        int i3 = i2 % 2;
        E next = iterator().next();
        int i4 = g + 65;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return next;
    }

    @Override // java.util.SortedSet
    public E last() {
        int i = 2 % 2;
        int i2 = asInterface + 71;
        g = i2 % 128;
        int i3 = i2 % 2;
        E next = cancelAll().next();
        int i4 = g + 77;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 90 / 0;
        }
        return next;
    }

    @Override // java.util.NavigableSet
    @Deprecated
    public final E pollFirst() {
        int i = 2 % 2;
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    @Deprecated
    public final E pollLast() {
        int i = 2 % 2;
        throw new UnsupportedOperationException();
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        int i = 2 % 2;
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    Object writeReplace() {
        int i = 2 % 2;
        SerializedForm serializedForm = new SerializedForm(this.TuitionPaymentFragmentbindingInflater1, toArray());
        int i2 = g + 21;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return serializedForm;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
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
    private static java.lang.String $$i(short r6, byte r7, int r8) {
        /*
            byte[] r0 = com.google.common.collect.ImmutableSortedSet.$$c
            int r7 = r7 * 2
            int r7 = r7 + 1
            int r6 = r6 * 3
            int r6 = 4 - r6
            int r8 = r8 + 67
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L24
        L14:
            r3 = r2
        L15:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L22:
            r3 = r0[r6]
        L24:
            int r3 = -r3
            int r8 = r8 + r3
            int r6 = r6 + 1
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.ImmutableSortedSet.$$i(short, byte, int):java.lang.String");
    }
}
