package com.google.android.gms.common.api.internal;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.TransformedResult;
import com.google.android.gms.common.internal.ICancelToken;
import com.google.android.gms.common.internal.Preconditions;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import defpackage.getSupportedPostviewSize;
import defpackage.initSession;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BasePendingResult<R extends Result> extends PendingResult<R> {
    private static boolean TuitionPaymentFragmentbindingInflater1;
    private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static int b;
    static final ThreadLocal zaa;
    public static final /* synthetic */ int zad = 0;
    private zas resultGuardian;
    protected final CallbackHandler zab;
    protected final WeakReference zac;
    private final Object zae;
    private final CountDownLatch zaf;
    private final ArrayList zag;
    private ResultCallback zah;
    private final AtomicReference zai;
    private Result zaj;
    private Status zak;
    private volatile boolean zal;
    private boolean zam;
    private boolean zan;
    private ICancelToken zao;
    private volatile zada zap;
    private boolean zaq;
    private static final byte[] $$j = {94, 6, -99, -107};
    private static final int $$k = 80;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {53, -70, 9, -72, 58, -52, 11, -12, 11, -2, 3, 29, -4, -37, 30, -41, 41, 31, -9, -43, 23, -41, 19, -11, 28, 34, -20, 13, -32, 33, -31, 36, -65, 19, 41, -17, -18, -33, 12, -11, 11, -6, 1, 30, -17, -24, 12, 8, -9, -6, 46, -44, 17, -6, -6, 8, -9, -6, 1, 3, 11, 2, -6, 8, -11, 3, -5, 2, 3, -5, 9, 1, -18, 13, 4, -18, 42, -34, 11, -1, -7, 8, -1, -1, 5, -20, 9, -8, 65};
    private static final int $$h = 211;
    private static final byte[] $$d = {111, 40, 23, -13, 23, -37, 42, 11, -10, 18, -7, 0, 7, 7, 23, -44, 44, 10, -5, 6, 18};
    private static final int $$e = 7;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f770a = 0;
    private static int asInterface = 1;
    private static int d = 1;

    static {
        b = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        zaa = new zaq();
        int i = d + 45;
        b = i % 128;
        int i2 = i % 2;
    }

    @Deprecated
    BasePendingResult() {
        this.zae = new Object();
        this.zaf = new CountDownLatch(1);
        this.zag = new ArrayList();
        this.zai = new AtomicReference();
        this.zaq = false;
        this.zab = new CallbackHandler(Looper.getMainLooper());
        this.zac = new WeakReference(null);
    }

    private static void f(byte b2, byte b3, int i, Object[] objArr) {
        int i2 = (b2 * 10) + 4;
        byte[] bArr = $$d;
        int i3 = (b3 * 3) + 97;
        byte[] bArr2 = new byte[i + 1];
        int i4 = -1;
        if (bArr == null) {
            i2++;
            i3 = (i2 + i) - 5;
        }
        while (true) {
            int i5 = i3;
            int i6 = i2;
            i4++;
            bArr2[i4] = (byte) i5;
            if (i4 == i) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i2 = i6 + 1;
                i3 = (i5 + bArr[i6]) - 5;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void h(short r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 19
            int r0 = 53 - r7
            int r6 = r6 * 33
            int r6 = r6 + 4
            byte[] r1 = com.google.android.gms.common.api.internal.BasePendingResult.$$g
            int r8 = r8 * 30
            int r8 = 114 - r8
            byte[] r0 = new byte[r0]
            int r7 = 52 - r7
            r2 = 0
            if (r1 != 0) goto L18
            r3 = r7
            r4 = r2
            goto L2e
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r7) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L26:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2e:
            int r8 = -r8
            int r8 = r8 + r3
            int r6 = r6 + 1
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.h(short, short, int, java.lang.Object[]):void");
    }

    private final Result zaa() {
        Result result;
        synchronized (this.zae) {
            Preconditions.checkState(!this.zal, "Result has already been consumed.");
            Preconditions.checkState(isReady(), "Result is not ready.");
            result = this.zaj;
            this.zaj = null;
            this.zah = null;
            this.zal = true;
        }
        zadb zadbVar = (zadb) this.zai.getAndSet(null);
        if (zadbVar != null) {
            zadbVar.zaa.zab.remove(this);
        }
        return (Result) Preconditions.checkNotNull(result);
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final void addStatusListener(PendingResult.StatusListener statusListener) {
        Preconditions.checkArgument(statusListener != null, "Callback cannot be null.");
        synchronized (this.zae) {
            if (isReady()) {
                statusListener.onComplete(this.zak);
            } else {
                this.zag.add(statusListener);
            }
        }
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public void cancel() {
        synchronized (this.zae) {
            if (!this.zam && !this.zal) {
                ICancelToken iCancelToken = this.zao;
                if (iCancelToken != null) {
                    try {
                        iCancelToken.cancel();
                    } catch (RemoteException unused) {
                    }
                }
                zal(this.zaj);
                this.zam = true;
                zab(createFailedResult(Status.RESULT_CANCELED));
            }
        }
    }

    protected abstract R createFailedResult(Status status);

    @Deprecated
    public final void forceFailureUnlessReady(Status status) {
        synchronized (this.zae) {
            if (!isReady()) {
                setResult(createFailedResult(status));
                this.zan = true;
            }
        }
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final boolean isCanceled() {
        boolean z;
        synchronized (this.zae) {
            z = this.zam;
        }
        return z;
    }

    public final boolean isReady() {
        int i = 2 % 2;
        int i2 = asInterface + 47;
        f770a = i2 % 128;
        if (i2 % 2 == 0 ? this.zaf.getCount() == 0 : this.zaf.getCount() == 1) {
            int i3 = asInterface + 57;
            f770a = i3 % 128;
            int i4 = i3 % 2;
            return true;
        }
        int i5 = f770a + 63;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 8 / 0;
        }
        return false;
    }

    protected final void setCancelToken(ICancelToken iCancelToken) {
        synchronized (this.zae) {
            this.zao = iCancelToken;
        }
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final void setResultCallback(ResultCallback<? super R> resultCallback) {
        synchronized (this.zae) {
            try {
                if (resultCallback == null) {
                    this.zah = null;
                    return;
                }
                boolean z = true;
                Preconditions.checkState(!this.zal, "Result has already been consumed.");
                if (this.zap != null) {
                    z = false;
                }
                Preconditions.checkState(z, "Cannot set callbacks if then() has been called.");
                if (isCanceled()) {
                    return;
                }
                if (isReady()) {
                    this.zab.zaa(resultCallback, zaa());
                } else {
                    this.zah = resultCallback;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final <S extends Result> TransformedResult<S> then(ResultTransform<? super R, ? extends S> resultTransform) {
        TransformedResult<S> transformedResultThen;
        Preconditions.checkState(!this.zal, "Result has already been consumed.");
        synchronized (this.zae) {
            Preconditions.checkState(this.zap == null, "Cannot call then() twice.");
            Preconditions.checkState(this.zah == null, "Cannot call then() if callbacks are set.");
            Preconditions.checkState(!this.zam, "Cannot call then() if result was canceled.");
            this.zaq = true;
            this.zap = new zada(this.zac);
            transformedResultThen = this.zap.then(resultTransform);
            if (isReady()) {
                this.zab.zaa(this.zap, zaa());
            } else {
                this.zah = this.zap;
            }
        }
        return transformedResultThen;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002a  */
    public final void zak() {
        boolean z;
        int i = 2 % 2;
        int i2 = asInterface + 107;
        f770a = i2 % 128;
        boolean z2 = false;
        if (i2 % 2 != 0) {
            if (!this.zaq) {
                z = false;
                if (!(!((Boolean) zaa.get()).booleanValue())) {
                    int i3 = asInterface + 83;
                    f770a = i3 % 128;
                    int i4 = i3 % 2;
                    z2 = z;
                }
            }
        } else if (this.zaq) {
            z2 = true;
        } else {
            z = true;
            if (!(!((Boolean) zaa.get()).booleanValue())) {
                int i5 = asInterface + 83;
                f770a = i5 % 128;
                int i6 = i5 % 2;
                z2 = z;
            }
        }
        this.zaq = z2;
    }

    public final boolean zam() {
        boolean zIsCanceled;
        synchronized (this.zae) {
            if (((GoogleApiClient) this.zac.get()) == null || !this.zaq) {
                cancel();
            }
            zIsCanceled = isCanceled();
        }
        return zIsCanceled;
    }

    public final void zan(zadb zadbVar) {
        int i = 2 % 2;
        int i2 = f770a + 111;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        this.zai.set(zadbVar);
        int i4 = f770a + 97;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static class CallbackHandler<R extends Result> extends com.google.android.gms.internal.base.zau {
        public CallbackHandler() {
            super(Looper.getMainLooper());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i = message.what;
            if (i != 1) {
                if (i == 2) {
                    ((BasePendingResult) message.obj).forceFailureUnlessReady(Status.RESULT_TIMEOUT);
                    return;
                }
                int i2 = message.what;
                StringBuilder sb = new StringBuilder("Don't know how to handle message: ");
                sb.append(i2);
                Log.wtf("BasePendingResult", sb.toString(), new Exception());
                return;
            }
            Pair pair = (Pair) message.obj;
            ResultCallback resultCallback = (ResultCallback) pair.first;
            Result result = (Result) pair.second;
            try {
                resultCallback.onResult(result);
            } catch (RuntimeException e2) {
                BasePendingResult.zal(result);
                throw e2;
            }
        }

        public final void zaa(ResultCallback resultCallback, Result result) {
            int i = BasePendingResult.zad;
            sendMessage(obtainMessage(1, new Pair((ResultCallback) Preconditions.checkNotNull(resultCallback), result)));
        }

        public CallbackHandler(Looper looper) {
            super(looper);
        }
    }

    public static void zal(Result result) {
        int i = 2 % 2;
        int i2 = f770a;
        int i3 = i2 + 19;
        asInterface = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            boolean z = result instanceof Releasable;
            obj.hashCode();
            throw null;
        }
        if (result instanceof Releasable) {
            int i4 = i2 + 103;
            asInterface = i4 % 128;
            try {
                if (i4 % 2 != 0) {
                    ((Releasable) result).release();
                    return;
                } else {
                    ((Releasable) result).release();
                    obj.hashCode();
                    throw null;
                }
            } catch (RuntimeException e2) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(String.valueOf(result))), e2);
            }
        }
        int i5 = asInterface + 15;
        f770a = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void setResult(R r) {
        synchronized (this.zae) {
            if (this.zan || this.zam) {
                zal(r);
                return;
            }
            isReady();
            Preconditions.checkState(!isReady(), "Results have already been set");
            Preconditions.checkState(!this.zal, "Result has already been consumed");
            zab(r);
        }
    }

    @Deprecated
    public BasePendingResult(Looper looper) {
        this.zae = new Object();
        this.zaf = new CountDownLatch(1);
        this.zag = new ArrayList();
        this.zai = new AtomicReference();
        this.zaq = false;
        this.zab = new CallbackHandler(looper);
        this.zac = new WeakReference(null);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0036  */
    /* JADX WARN: Code duplicated, block: B:9:0x002c  */
    @Override // com.google.android.gms.common.api.PendingResult
    @ResultIgnorabilityUnspecified
    public final R await() {
        int i = 2 % 2;
        boolean z = true;
        int i2 = f770a + 1;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            Preconditions.checkNotMainThread("await must not be called on the UI thread");
            Preconditions.checkState(this.zal, "Result has already been consumed");
            if (this.zap == null) {
                int i3 = f770a + 73;
                asInterface = i3 % 128;
                int i4 = i3 % 2;
            } else {
                z = false;
            }
        } else {
            Preconditions.checkNotMainThread("await must not be called on the UI thread");
            Preconditions.checkState(!this.zal, "Result has already been consumed");
            if (this.zap == null) {
                int i5 = f770a + 73;
                asInterface = i5 % 128;
                int i6 = i5 % 2;
            } else {
                z = false;
            }
        }
        Preconditions.checkState(z, "Cannot await if then() has been called.");
        try {
            this.zaf.await();
        } catch (InterruptedException unused) {
            forceFailureUnlessReady(Status.RESULT_INTERRUPTED);
        }
        Preconditions.checkState(isReady(), "Result is not ready.");
        return (R) zaa();
    }

    private final void zab(Result result) {
        int i = 2 % 2;
        this.zaj = result;
        this.zak = result.getStatus();
        zar zarVar = null;
        this.zao = null;
        this.zaf.countDown();
        if (!(!this.zam)) {
            int i2 = f770a + 59;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            this.zah = null;
        } else {
            ResultCallback resultCallback = this.zah;
            if (resultCallback == null) {
                int i4 = asInterface + 119;
                f770a = i4 % 128;
                int i5 = i4 % 2;
                if (this.zaj instanceof Releasable) {
                    this.resultGuardian = new zas(this, zarVar);
                }
            } else {
                this.zab.removeMessages(2);
                this.zab.zaa(resultCallback, zaa());
            }
        }
        ArrayList arrayList = this.zag;
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            ((PendingResult.StatusListener) arrayList.get(i6)).onComplete(this.zak);
            i6++;
            int i7 = f770a + 13;
            asInterface = i7 % 128;
            int i8 = i7 % 2;
        }
        this.zag.clear();
        int i9 = f770a + 85;
        asInterface = i9 % 128;
        if (i9 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final void setResultCallback(ResultCallback<? super R> resultCallback, long j, TimeUnit timeUnit) throws Throwable {
        Object[] objArr;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char scrollDefaultDelay = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
            int iMyPid = 876 - (Process.myPid() >> 22);
            int iIndexOf = TextUtils.indexOf("", "", 0) + 10;
            byte[] bArr = $$d;
            byte b2 = bArr[11];
            Object[] objArr2 = new Object[1];
            f(b2, b2, bArr[17], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(scrollDefaultDelay, iMyPid, iIndexOf, -1199417970, false, (String) objArr2[0], null);
        }
        long j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        g(128 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), null, null, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        g(127 - View.MeasureSpec.getMode(0), null, null, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            int maxKeyCode = 876 - (KeyEvent.getMaxKeyCode() >> 16);
            int iAlpha = Color.alpha(0) + 10;
            byte b3 = (byte) ($$e >>> 2);
            Object[] objArr5 = new Object[1];
            f(b3, b3, $$d[11], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, maxKeyCode, iAlpha, 254769921, false, (String) objArr5[0], null);
        }
        if (j2 == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                int i = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 875;
                int packedPositionType = 10 - ExpandableListView.getPackedPositionType(0L);
                int i2 = $$e;
                Object[] objArr6 = new Object[1];
                f((byte) (i2 >>> 2), $$d[11], (byte) i2, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cResolveSizeAndState, i, packedPositionType, 1324201839, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i3 = (((-208210156) + (((~((-852127283) | iIdentityHashCode)) | 42477090) * 1504)) + ((~(iIdentityHashCode | (-809650193))) * (-1504))) - 1665423878;
            int i4 = (i3 << 13) ^ i3;
            int i5 = i4 ^ (i4 >>> 17);
            ((int[]) objArr[1])[0] = i5 ^ (i5 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            g(127 - (Process.myPid() >> 22), null, null, new byte[]{-115, -116, -117, -120, -118, -119, -121, -106, -126, -127, -113, -121, -127, -107, -127, -108}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            g(TextUtils.indexOf((CharSequence) "", '0', 0) + 128, null, null, new byte[]{-116, -125, -123, -114, -104, -120, -127, -105, -118, -117, -122, -117, -126, -116, -125, -122}, objArr9);
            try {
                Object[] objArr10 = {Integer.valueOf(((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue()), 1842056954};
                byte[] bArr2 = $$g;
                byte b4 = bArr2[42];
                byte b5 = (byte) (b4 - 1);
                byte b6 = b4;
                Object[] objArr11 = new Object[1];
                h(b5, b6, (byte) (b6 - 1), objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                byte b7 = bArr2[42];
                byte b8 = b7;
                Object[] objArr12 = new Object[1];
                h(b8, (byte) (b8 - 1), b7, objArr12);
                objArr = (Object[]) cls3.getMethod((String) objArr12[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cIndexOf = (char) TextUtils.indexOf("", "", 0);
                    int iArgb = 876 - Color.argb(0, 0, 0, 0);
                    int capsMode = 10 - TextUtils.getCapsMode("", 0, 0);
                    int i6 = $$e;
                    Object[] objArr13 = new Object[1];
                    f((byte) (i6 >>> 2), $$d[11], (byte) i6, objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf, iArgb, capsMode, 1324201839, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    g(126 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), null, null, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr14);
                    Class<?> cls4 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    g(126 - TextUtils.indexOf((CharSequence) "", '0'), null, null, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr15);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                        int gidForName = 875 - Process.getGidForName("");
                        int gidForName2 = 9 - Process.getGidForName("");
                        byte b9 = (byte) ($$e >>> 2);
                        Object[] objArr16 = new Object[1];
                        f(b9, b9, $$d[11], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cMakeMeasureSpec, gidForName, gidForName2, 254769921, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cIndexOf2 = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1);
                        int iBlue = 876 - Color.blue(0);
                        int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 10;
                        byte[] bArr3 = $$d;
                        byte b10 = bArr3[11];
                        Object[] objArr17 = new Object[1];
                        f(b10, b10, bArr3[17], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf2, iBlue, minimumFlingVelocity, -1199417970, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
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
        int i7 = ((int[]) objArr[2])[0];
        int i8 = ((int[]) objArr[0])[0];
        if (i8 == i7) {
            int i9 = ((int[]) objArr[1])[0];
            Object[] objArr18 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iMyPid2 = Process.myPid();
            int i10 = ~iMyPid2;
            int i11 = i9 + 400299292 + (((~(463523637 | i10)) | (~((-503833867) | iMyPid2))) * 1900) + (((~(i10 | 503833866)) | (~(iMyPid2 | (-463523638)))) * (-950)) + (((~(iMyPid2 | 503833866)) | (~(i10 | (-463523638)))) * 950);
            int i12 = (i11 << 13) ^ i11;
            int i13 = i12 ^ (i12 >>> 17);
            ((int[]) objArr18[1])[0] = i13 ^ (i13 << 5);
            synchronized (this.zae) {
                try {
                    if (resultCallback == null) {
                        this.zah = null;
                        return;
                    }
                    Preconditions.checkState(!this.zal, "Result has already been consumed.");
                    boolean z = this.zap == null;
                    String strConcat = "5;30;30;12;".concat("Cannot set callbacks if then() has been called.");
                    int i14 = ((int[]) objArr18[1])[0];
                    int i15 = i14 * i14;
                    int i16 = -(496996811 * i14);
                    int i17 = (i15 ^ i16) + ((i15 & i16) << 1);
                    int i18 = -(i14 * 1985510335);
                    int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
                    int i20 = ((i19 | (-1375349863)) << 1) - ((-1375349863) ^ i19);
                    int i21 = i20 >> 18;
                    int i22 = ((i21 ^ (-32767)) + ((i21 & (-32767)) << 1)) / 16384;
                    int i23 = (i22 & 1) + (i22 | 1);
                    int i24 = (i20 ^ i23) + ((i23 & i20) << 1);
                    int i25 = ((i20 >> 25) - 255) / 128;
                    int i26 = -(i24 ^ ((i25 ^ 1) + ((i25 & 1) << 1)));
                    int i27 = ((i26 | 1) << 1) - (i26 ^ 1);
                    int i28 = i27 >> 21;
                    int i29 = (((i28 | (-4095)) << 1) - (i28 ^ (-4095))) / 2048;
                    int i30 = (i29 & 1) + (i29 | 1);
                    Preconditions.checkState(z, strConcat.substring(20922 / (((-((i30 & 1) + (i30 | 1))) & i27) * 1902)));
                    if (isCanceled()) {
                        return;
                    }
                    if (isReady()) {
                        this.zab.zaa(resultCallback, zaa());
                    } else {
                        this.zah = resultCallback;
                        CallbackHandler callbackHandler = this.zab;
                        callbackHandler.sendMessageDelayed(callbackHandler.obtainMessage(2, this), timeUnit.toMillis(j));
                    }
                    return;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        String[] strArr = (String[]) objArr[3];
        if (strArr != null) {
            for (String str : strArr) {
                arrayList.add(str);
            }
        }
        throw new RuntimeException(String.valueOf(i8));
    }

    @Override // com.google.android.gms.common.api.PendingResult
    @ResultIgnorabilityUnspecified
    public final R await(long j, TimeUnit timeUnit) {
        int i = 2 % 2;
        int i2 = f770a + 121;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        if (j > 0) {
            int i5 = i3 + 101;
            f770a = i5 % 128;
            int i6 = i5 % 2;
            Preconditions.checkNotMainThread("await must not be called on the UI thread when time is greater than zero.");
            int i7 = asInterface + 121;
            f770a = i7 % 128;
            int i8 = i7 % 2;
        }
        Preconditions.checkState(!this.zal, "Result has already been consumed.");
        Preconditions.checkState(this.zap == null, "Cannot await if then() has been called.");
        try {
            if (!this.zaf.await(j, timeUnit)) {
                int i9 = f770a + 13;
                asInterface = i9 % 128;
                int i10 = i9 % 2;
                forceFailureUnlessReady(Status.RESULT_TIMEOUT);
            }
        } catch (InterruptedException unused) {
            forceFailureUnlessReady(Status.RESULT_INTERRUPTED);
        }
        Preconditions.checkState(isReady(), "Result is not ready.");
        return (R) zaa();
    }

    public BasePendingResult(GoogleApiClient googleApiClient) {
        Looper mainLooper;
        this.zae = new Object();
        this.zaf = new CountDownLatch(1);
        this.zag = new ArrayList();
        this.zai = new AtomicReference();
        this.zaq = false;
        if (googleApiClient != null) {
            mainLooper = googleApiClient.getLooper();
            int i = asInterface + 113;
            f770a = i % 128;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } else {
            mainLooper = Looper.getMainLooper();
        }
        this.zab = new CallbackHandler(mainLooper);
        this.zac = new WeakReference(googleApiClient);
        int i4 = f770a + 79;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 8 / 0;
        }
    }

    private static void g(int i, char[] cArr, int[] iArr, byte[] bArr, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
        char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        long j = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                int i5 = $11 + 111;
                $10 = i5 % 128;
                if (i5 % i2 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char cCombineMeasuredStates = (char) (View.combineMeasuredStates(0, 0) + 31339);
                            int i6 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 2994;
                            int i7 = 17 - (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1));
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cCombineMeasuredStates, i6, i7, 1182129903, false, $$l(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                        }
                        cArr3[i4] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr2[i4])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 31340), Drawable.resolveOpacity(0, 0) + 2994, 17 - Color.green(0), 1182129903, false, $$l(b4, b5, (byte) (b5 + 1)), new Class[]{Integer.TYPE});
                        }
                        cArr3[i4] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                        i4++;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                i2 = 2;
                j = 0;
            }
            cArr2 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (43325 - KeyEvent.normalizeMetaState(0)), 252 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), View.MeasureSpec.makeMeasureSpec(0, 0) + 22, 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
        if (TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
            char[] cArr4 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                int i8 = $11 + 73;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                cArr4[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (33602 - TextUtils.indexOf("", "", 0, 0)), 3085 - View.getDefaultSize(0, 0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 26, -2146875848, false, $$l(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                int i10 = $10 + 67;
                $11 = i10 % 128;
                int i11 = i10 % 2;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!TuitionPaymentFragmentbindingInflater1) {
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
            char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            int i12 = $10 + 97;
            $11 = i12 % 128;
            int i13 = i12 % 2;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i14 = $11 + 115;
        $10 = i14 % 128;
        int i15 = i14 % 2;
        getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
        char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
        getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
            cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
            Object[] objArr6 = {getsupportedpostviewsize, getsupportedpostviewsize};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                byte b8 = (byte) 0;
                byte b9 = b8;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 33602), 3085 - Color.green(0), TextUtils.getOffsetAfter("", 0) + 26, -2146875848, false, $$l(b8, b9, b9), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr6);
    }

    protected BasePendingResult(CallbackHandler<R> callbackHandler) {
        this.zae = new Object();
        this.zaf = new CountDownLatch(1);
        this.zag = new ArrayList();
        this.zai = new AtomicReference();
        this.zaq = false;
        this.zab = (CallbackHandler) Preconditions.checkNotNull(callbackHandler, "CallbackHandler must not be null");
        this.zac = new WeakReference(null);
    }

    static /* synthetic */ Result zaj(BasePendingResult basePendingResult) {
        int i = 2 % 2;
        int i2 = f770a;
        int i3 = i2 + 125;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        Result result = basePendingResult.zaj;
        int i5 = i2 + 29;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return result;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new char[]{47386, 47373, 47383, 47369, 47372, 47378, 47309, 47368, 47336, 47362, 47367, 47382, 47374, 47352, 47375, 47384, 47376, 47371, 47337, 47377, 47365, 47380, 47347, 47379};
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2047719611;
        TuitionPaymentFragmentbindingInflater1 = true;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
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
    private static java.lang.String $$l(int r6, short r7, short r8) {
        /*
            int r7 = r7 * 3
            int r7 = r7 + 4
            byte[] r0 = com.google.android.gms.common.api.internal.BasePendingResult.$$j
            int r8 = r8 + 67
            int r6 = r6 * 4
            int r6 = 1 - r6
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r6
            r5 = r2
            goto L24
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r6) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L22:
            r3 = r0[r7]
        L24:
            int r8 = r8 + r3
            int r7 = r7 + 1
            r3 = r5
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.$$l(int, short, short):java.lang.String");
    }
}
