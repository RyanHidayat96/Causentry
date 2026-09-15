package com.android.volley.toolbox;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.ViewCompat;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import defpackage.SessionProcessor;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes6.dex */
public class RequestFuture<T> implements Future<T>, Response.Listener<T>, Response.ErrorListener {
    private VolleyError mException;
    private Request<?> mRequest;
    private T mResult;
    private boolean mResultReceived = false;
    private static final byte[] $$c = {73, 55, 58, 33};
    private static final int $$d = 235;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {41, 2, 45, -60, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
    private static final int $$b = 254;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    private static int TuitionPaymentFragmentbindingInflater1 = 1;
    private static long b = -6377398940819159759L;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -981105359;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 51823;

    private static void a(short s, byte b2, int i, Object[] objArr) {
        byte[] bArr = $$a;
        int i2 = i + 4;
        int i3 = 98 - (b2 * 14);
        byte[] bArr2 = new byte[53 - s];
        int i4 = 52 - s;
        int i5 = -1;
        if (bArr == null) {
            i3 = (i4 + (-i2)) - 11;
            i2 = i2;
            i5 = -1;
        }
        while (true) {
            int i6 = i5 + 1;
            bArr2[i6] = (byte) i3;
            int i7 = i2 + 1;
            if (i6 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i3 = (i3 + (-bArr[i7])) - 11;
                i2 = i7;
                i5 = i6;
            }
        }
    }

    public static <E> RequestFuture<E> newFuture() {
        int i = 2 % 2;
        RequestFuture<E> requestFuture = new RequestFuture<>();
        int i2 = TuitionPaymentFragmentbindingInflater1 + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        return requestFuture;
    }

    private RequestFuture() {
    }

    public void setRequest(Request<?> request) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 67;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        this.mRequest = request;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 71;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        synchronized (this) {
            if (this.mRequest == null) {
                return false;
            }
            if (isDone()) {
                return false;
            }
            this.mRequest.cancel();
            return true;
        }
    }

    @Override // java.util.concurrent.Future
    public T get() throws ExecutionException, InterruptedException {
        T tDoGet;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 75;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                tDoGet = doGet(null);
                int i3 = 51 / 0;
            } else {
                tDoGet = doGet(null);
            }
            int i4 = TuitionPaymentFragmentbindingInflater1 + 33;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            int i5 = i4 % 2;
            return tDoGet;
        } catch (TimeoutException e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // java.util.concurrent.Future
    public T get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 97;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            doGet(Long.valueOf(TimeUnit.MILLISECONDS.convert(j, timeUnit)));
            throw null;
        }
        T tDoGet = doGet(Long.valueOf(TimeUnit.MILLISECONDS.convert(j, timeUnit)));
        int i3 = TuitionPaymentFragmentbindingInflater1 + 67;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        return tDoGet;
    }

    private T doGet(Long l) throws ExecutionException, InterruptedException, TimeoutException {
        synchronized (this) {
            if (this.mException != null) {
                throw new ExecutionException(this.mException);
            }
            if (this.mResultReceived) {
                return this.mResult;
            }
            if (l == null) {
                while (!isDone()) {
                    wait(0L);
                }
            } else if (l.longValue() > 0) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                long jLongValue = l.longValue() + jUptimeMillis;
                while (!isDone() && jUptimeMillis < jLongValue) {
                    wait(jLongValue - jUptimeMillis);
                    jUptimeMillis = SystemClock.uptimeMillis();
                }
            }
            if (this.mException != null) {
                throw new ExecutionException(this.mException);
            }
            if (!this.mResultReceived) {
                throw new TimeoutException();
            }
            return this.mResult;
        }
    }

    private static void c(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        SessionProcessor sessionProcessor = new SessionProcessor();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr3.length;
        char[] cArr6 = new char[length3];
        sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
            int i4 = $11 + 31;
            $10 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = (byte) (b2 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.getOffsetAfter("", 0) + 8328), 1236 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 35, -653973969, false, $$e(b2, b3, (byte) (b3 + 1)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {sessionProcessor};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        char c2 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                        int i6 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 2765;
                        int packedPositionGroup = 14 - ExpandableListView.getPackedPositionGroup(0L);
                        byte b4 = (byte) ($$d & 6);
                        byte b5 = (byte) (b4 - 3);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c2, i6, packedPositionGroup, 1504416861, false, $$e(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                    try {
                        Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 43325), Gravity.getAbsoluteGravity(0, 0) + 253, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 23, -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                char offsetBefore = (char) (65200 - TextUtils.getOffsetBefore("", 0));
                                int iIndexOf = 2890 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                                int iMyPid = (Process.myPid() >> 22) + 17;
                                byte b6 = (byte) ($$d & 5);
                                byte b7 = (byte) (-b6);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(offsetBefore, iIndexOf, iMyPid, 2012627446, false, $$e(b6, b7, (byte) (b7 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = sessionProcessor.b;
                            cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (b ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ (-6377398940819159759L)))));
                            sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                            i2 = 2;
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
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        objArr[0] = new String(cArr6);
        int i7 = $11 + 61;
        $10 = i7 % 128;
        if (i7 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Type inference failed for: r9v5, types: [boolean, int] */
    @Override // java.util.concurrent.Future
    public boolean isCancelled() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 1);
            int i3 = 651 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            int iResolveSize = 44 - View.resolveSize(0, 0);
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            a(bArr[7], bArr[5], bArr[80], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cLastIndexOf, i3, iResolveSize, -459846511, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{0, 0, 0, 0}, new char[]{12182, 19313, 23956, 31017}, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), ViewConfiguration.getTapTimeout() >> 16, new char[]{33610, 26917, 45227, 21455, 7824, 13423, 45602, 31126, 31713, 30534, 61280, 1812, 64907, 26635, 58476, 36031, 56622, 29716, 2669, 56312, 14446, 4147}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{0, 0, 0, 0}, new char[]{19965, 5026, 9910, 9185}, (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 57638), (-1240227251) - Color.red(0), new char[]{64232, 2337, 38188, 11891, 18868, 57556, 32855, 59716, 58616, 10416, 32763, 65042, 33790, 10730, 40967}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
            int mode = 651 - View.MeasureSpec.getMode(0);
            int iIndexOf = 43 - TextUtils.indexOf((CharSequence) "", '0', 0);
            byte b2 = (byte) ($$b & 53);
            byte b3 = $$a[7];
            Object[] objArr5 = new Object[1];
            a(b2, b3, (byte) (b3 | 51), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(maximumDrawingCacheSize, mode, iIndexOf, -873460649, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char capsMode = (char) TextUtils.getCapsMode("", 0, 0);
                int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 652;
                int i4 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 43;
                byte b4 = $$a[5];
                Object[] objArr6 = new Object[1];
                a((byte) 15, b4, (byte) (b4 | 50), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(capsMode, iIndexOf2, i4, -1595579076, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i5 = ((int[]) objArr7[2])[0];
            int i6 = ((int[]) objArr7[0])[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i7 = ~((-8684609) | iIdentityHashCode);
            int i8 = ~iIdentityHashCode;
            int i9 = (((1142053825 + ((i7 | (~(788377590 | i8))) * 920)) + (((~((-783123793) | i8)) | 8684608) * 920)) + (((~(iIdentityHashCode | 788377590)) | ((~((-8684609) | i8)) | (~((-774439185) | iIdentityHashCode)))) * 920)) - 540217693;
            int i10 = (i9 << 13) ^ i9;
            int i11 = i10 ^ (i10 >>> 17);
            ((int[]) objArr[3])[0] = i11 ^ (i11 << 5);
        } else {
            try {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) View.MeasureSpec.makeMeasureSpec(0, 0), 1610 - Color.alpha(0), 26 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 2145681644, false, null, new Class[0]);
                }
                Object[] objArr8 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(null), -540217693, 0};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cRgb = (char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0));
                    int gidForName = Process.getGidForName("") + 652;
                    int defaultSize = View.getDefaultSize(0, 0) + 44;
                    byte b5 = (byte) ($$b & 53);
                    byte b6 = $$a[7];
                    Object[] objArr9 = new Object[1];
                    a(b5, b6, (byte) (b6 | 51), objArr9);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cRgb, gidForName, defaultSize, 2075921419, false, (String) objArr9[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) TextUtils.indexOf("", ""), 694 - TextUtils.lastIndexOf("", '0', 0), 98 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((KeyEvent.getMaxKeyCode() >> 16) + 63406), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 793, 83 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), Integer.TYPE, Integer.TYPE});
                }
                Object[] objArr10 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr8);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                    int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 651;
                    int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 44;
                    byte b7 = $$a[5];
                    Object[] objArr11 = new Object[1];
                    a((byte) 15, b7, (byte) (b7 | 50), objArr11);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cResolveSizeAndState, threadPriority, iCombineMeasuredStates, -1595579076, false, (String) objArr11[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr10);
                try {
                    Object[] objArr12 = new Object[1];
                    c(new char[]{0, 0, 0, 0}, new char[]{12182, 19313, 23956, 31017}, (char) ExpandableListView.getPackedPositionGroup(0L), ExpandableListView.getPackedPositionChild(0L) + 1, new char[]{33610, 26917, 45227, 21455, 7824, 13423, 45602, 31126, 31713, 30534, 61280, 1812, 64907, 26635, 58476, 36031, 56622, 29716, 2669, 56312, 14446, 4147}, objArr12);
                    Class<?> cls2 = Class.forName((String) objArr12[0]);
                    Object[] objArr13 = new Object[1];
                    c(new char[]{0, 0, 0, 0}, new char[]{19965, 5026, 9910, 9185}, (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 57637), (ViewConfiguration.getDoubleTapTimeout() >> 16) - 1240227251, new char[]{64232, 2337, 38188, 11891, 18868, 57556, 32855, 59716, 58616, 10416, 32763, 65042, 33790, 10730, 40967}, objArr13);
                    long jLongValue2 = ((Long) cls2.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                        int trimmedLength = TextUtils.getTrimmedLength("") + 651;
                        int i12 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 44;
                        byte b8 = (byte) ($$b & 53);
                        byte b9 = $$a[7];
                        Object[] objArr14 = new Object[1];
                        a(b8, b9, (byte) (b9 | 51), objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(scrollBarSize, trimmedLength, i12, -873460649, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char mirror = (char) (AndroidCharacter.getMirror('0') - '0');
                        int tapTimeout = 651 - (ViewConfiguration.getTapTimeout() >> 16);
                        int i13 = 45 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                        byte[] bArr2 = $$a;
                        Object[] objArr15 = new Object[1];
                        a(bArr2[7], bArr2[5], bArr2[80], objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(mirror, tapTimeout, i13, -459846511, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
                    objArr = objArr10;
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
        if (((int[]) objArr[2])[0] != ((int[]) objArr[0])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[1];
            if (strArr == null) {
                throw null;
            }
            while (i2 < strArr.length) {
                int i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 99;
                TuitionPaymentFragmentbindingInflater1 = i14 % 128;
                if (i14 % 2 == 0) {
                    arrayList.add(strArr[i2]);
                    i2 += 37;
                } else {
                    arrayList.add(strArr[i2]);
                    i2++;
                }
            }
            throw null;
        }
        Object[] objArr16 = {new int[]{i}, new String[0], new int[]{i}, new int[1]};
        int i15 = ((int[]) objArr[3])[0];
        int i16 = ((int[]) objArr[2])[0];
        int i17 = ((int[]) objArr[0])[0];
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i18 = i15 + ((((-2082959626) + (((~((-17080737) | iIdentityHashCode2)) | (~((-13649927) | iIdentityHashCode2))) * 69)) + (((~(iIdentityHashCode2 | (-854608464))) | ((~((-858039274) | iIdentityHashCode2)) | 840958537)) * (-69))) - 17012656);
        int i19 = (i18 << 13) ^ i18;
        int i20 = i19 ^ (i19 >>> 17);
        Object obj = objArr16[3];
        ((int[]) obj)[0] = i20 ^ (i20 << 5);
        int i21 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i22 = i21 + 31;
        TuitionPaymentFragmentbindingInflater1 = i22 % 128;
        int i23 = i22 % 2;
        Request<?> request = this.mRequest;
        if (request != null) {
            return request.isCanceled();
        }
        int i24 = i21 + 107;
        TuitionPaymentFragmentbindingInflater1 = i24 % 128;
        int i25 = i24 % 2;
        int i26 = ((int[]) obj)[0];
        int i27 = i26 * i26;
        int i28 = -(1082780187 * i26);
        int i29 = ((((i27 | i28) << 1) - (i27 ^ i28)) - (~(-(i26 * (-695389619))))) - 1;
        int i30 = (i29 & 863353488) + (863353488 | i29);
        int i31 = ((i30 >> 15) - 262143) / 131072;
        int i32 = ((i31 | 1) << 1) - (i31 ^ 1);
        int i33 = (i30 ^ i32) + ((i32 & i30) << 1);
        int i34 = i30 >> 19;
        int i35 = ((i34 ^ (-16383)) + ((i34 & (-16383)) << 1)) / 8192;
        int i36 = -(i33 ^ ((i35 & 1) + (i35 | 1)));
        int i37 = ((i36 | 9) << 1) - (i36 ^ 9);
        int i38 = i37 >> 23;
        int i39 = (((i38 & (-1023)) + (i38 | (-1023))) / 512) + 1;
        return 0 / (((-((i39 & 1) + (i39 | 1))) & i37) * 193);
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        boolean z;
        synchronized (this) {
            z = this.mResultReceived || this.mException != null || isCancelled();
        }
        return z;
    }

    @Override // com.android.volley.Response.Listener
    public void onResponse(T t) {
        synchronized (this) {
            this.mResultReceived = true;
            this.mResult = t;
            notifyAll();
        }
    }

    @Override // com.android.volley.Response.ErrorListener
    public void onErrorResponse(VolleyError volleyError) {
        synchronized (this) {
            this.mException = volleyError;
            notifyAll();
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0020
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(short r5, byte r6, short r7) {
        /*
            int r7 = r7 * 3
            int r0 = 1 - r7
            byte[] r1 = com.android.volley.toolbox.RequestFuture.$$c
            int r6 = r6 + 4
            int r5 = r5 + 102
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L14
            r4 = r7
            r3 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r5
            r0[r3] = r4
            if (r3 != r7) goto L20
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L20:
            int r6 = r6 + 1
            int r3 = r3 + 1
            r4 = r1[r6]
        L26:
            int r5 = r5 + r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.volley.toolbox.RequestFuture.$$e(short, byte, short):java.lang.String");
    }
}
