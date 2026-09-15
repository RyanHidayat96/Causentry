package com.bpjstku.data.queueing.remote;

import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import com.bpjstku.data.queueing.model.request.AntrianOnlineUrlRequest;
import com.bpjstku.data.queueing.model.request.GetDataAntrianRequest;
import com.bpjstku.data.queueing.model.request.InsertAntrianRequest;
import com.bpjstku.data.queueing.model.request.NearestOfficeRequest;
import com.bpjstku.data.queueing.model.request.QuotaBookingRequest;
import com.bpjstku.data.queueing.model.response.AntrianOnlineUrlResponse;
import com.bpjstku.data.queueing.model.response.GetDataAntrianResponse;
import com.bpjstku.data.queueing.model.response.InsertAntrianResponse;
import com.bpjstku.data.queueing.model.response.NearestOfficeResponse;
import com.bpjstku.data.queueing.model.response.QuotaBookingResponse;
import defpackage.deriveCodec;
import defpackage.initSession;
import defpackage.setOrVerifyExpectFrameRateRange;
import defpackage.unbindChildren;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Response;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\b0\u00072\u0006\u0010\u0003\u001a\u00020\fH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0012\u0010\u0016J#\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0017H\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0017H\u0017¢\u0006\u0004\b\u0019\u0010\u001bJ#\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\b0\u00072\u0006\u0010\u0003\u001a\u00020\u001cH\u0017¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010!"}, d2 = {"Lcom/bpjstku/data/queueing/remote/QueueingApi;", "LunbindChildren;", "Lcom/bpjstku/data/queueing/remote/QueueingApiClient;", "p0", "<init>", "(Lcom/bpjstku/data/queueing/remote/QueueingApiClient;)V", "Lcom/bpjstku/data/queueing/model/request/NearestOfficeRequest;", "LderiveCodec;", "Lretrofit2/Response;", "Lcom/bpjstku/data/queueing/model/response/NearestOfficeResponse;", "getNearestOffice", "(Lcom/bpjstku/data/queueing/model/request/NearestOfficeRequest;)LderiveCodec;", "Lcom/bpjstku/data/queueing/model/request/QuotaBookingRequest;", "Lcom/bpjstku/data/queueing/model/response/QuotaBookingResponse;", "getQuotaBooking", "(Lcom/bpjstku/data/queueing/model/request/QuotaBookingRequest;)LderiveCodec;", "Lcom/bpjstku/data/queueing/model/request/InsertAntrianRequest;", "Lcom/bpjstku/data/queueing/model/response/InsertAntrianResponse;", "insertAntrian", "(Lcom/bpjstku/data/queueing/model/request/InsertAntrianRequest;)LderiveCodec;", "", "p1", "(Ljava/lang/String;Lcom/bpjstku/data/queueing/model/request/InsertAntrianRequest;)LderiveCodec;", "Lcom/bpjstku/data/queueing/model/request/GetDataAntrianRequest;", "Lcom/bpjstku/data/queueing/model/response/GetDataAntrianResponse;", "getDataAntrian", "(Lcom/bpjstku/data/queueing/model/request/GetDataAntrianRequest;)LderiveCodec;", "(Ljava/lang/String;Lcom/bpjstku/data/queueing/model/request/GetDataAntrianRequest;)LderiveCodec;", "Lcom/bpjstku/data/queueing/model/request/AntrianOnlineUrlRequest;", "Lcom/bpjstku/data/queueing/model/response/AntrianOnlineUrlResponse;", "getAntrianOnlineUrl", "(Lcom/bpjstku/data/queueing/model/request/AntrianOnlineUrlRequest;)LderiveCodec;", "apiClient", "Lcom/bpjstku/data/queueing/remote/QueueingApiClient;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class QueueingApi implements unbindChildren, QueueingApiClient {
    public static final int $stable = 8;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static int b;
    private final QueueingApiClient apiClient;
    private static final byte[] $$c = {106, -66, 28, 119};
    private static final int $$d = 43;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {22, 102, 43, -6, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$b = 31;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    private static int TuitionPaymentFragmentbindingInflater1 = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 14
            int r7 = r7 + 84
            byte[] r0 = com.bpjstku.data.queueing.remote.QueueingApi.$$a
            int r6 = r6 * 52
            int r6 = r6 + 1
            int r8 = r8 * 3
            int r8 = r8 + 4
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L17
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2d
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            r4 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2d:
            int r7 = r7 + r8
            int r8 = r3 + 1
            int r7 = r7 + (-11)
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.queueing.remote.QueueingApi.c(int, byte, byte, java.lang.Object[]):void");
    }

    public QueueingApi(QueueingApiClient queueingApiClient) {
        Intrinsics.checkNotNullParameter(queueingApiClient, "");
        this.apiClient = queueingApiClient;
    }

    @Override // com.bpjstku.data.queueing.remote.QueueingApiClient
    public final deriveCodec<Response<NearestOfficeResponse>> getNearestOffice(NearestOfficeRequest p0) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 85;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(p0, "");
            return this.apiClient.getNearestOffice(p0);
        }
        Intrinsics.checkNotNullParameter(p0, "");
        this.apiClient.getNearestOffice(p0);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.bpjstku.data.queueing.remote.QueueingApiClient
    public final deriveCodec<Response<QuotaBookingResponse>> getQuotaBooking(QuotaBookingRequest p0) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 1;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.apiClient.getQuotaBooking(p0);
            throw null;
        }
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<QuotaBookingResponse>> quotaBooking = this.apiClient.getQuotaBooking(p0);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 47;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        if (i3 % 2 != 0) {
            return quotaBooking;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.bpjstku.data.queueing.remote.QueueingApiClient
    public final deriveCodec<Response<InsertAntrianResponse>> insertAntrian(InsertAntrianRequest p0) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 67;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(p0, "");
            return this.apiClient.insertAntrian(p0);
        }
        Intrinsics.checkNotNullParameter(p0, "");
        this.apiClient.insertAntrian(p0);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.bpjstku.data.queueing.remote.QueueingApiClient
    public final deriveCodec<Response<InsertAntrianResponse>> insertAntrian(String p0, InsertAntrianRequest p1) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 61;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        deriveCodec<Response<InsertAntrianResponse>> derivecodecInsertAntrian = this.apiClient.insertAntrian(p0, p1);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 13;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 != 0) {
            return derivecodecInsertAntrian;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.bpjstku.data.queueing.remote.QueueingApiClient
    public final deriveCodec<Response<GetDataAntrianResponse>> getDataAntrian(GetDataAntrianRequest p0) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(p0, "");
            return this.apiClient.getDataAntrian(p0);
        }
        Intrinsics.checkNotNullParameter(p0, "");
        this.apiClient.getDataAntrian(p0);
        throw null;
    }

    @Override // com.bpjstku.data.queueing.remote.QueueingApiClient
    public final deriveCodec<Response<GetDataAntrianResponse>> getDataAntrian(String p0, GetDataAntrianRequest p1) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        deriveCodec<Response<GetDataAntrianResponse>> dataAntrian = this.apiClient.getDataAntrian(p0, p1);
        int i4 = TuitionPaymentFragmentbindingInflater1 + 105;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            return dataAntrian;
        }
        throw null;
    }

    @Override // com.bpjstku.data.queueing.remote.QueueingApiClient
    public final deriveCodec<Response<AntrianOnlineUrlResponse>> getAntrianOnlineUrl(AntrianOnlineUrlRequest p0) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 101;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(p0, "");
            return this.apiClient.getAntrianOnlineUrl(p0);
        }
        Intrinsics.checkNotNullParameter(p0, "");
        int i3 = 8 / 0;
        return this.apiClient.getAntrianOnlineUrl(p0);
    }

    private static void a(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
        char[] cArr2;
        int i4 = 2 % 2;
        setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
        char[] cArr3 = new char[i2];
        setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr3[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i5 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr3[i5]), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 3292 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 31 - TextUtils.getOffsetAfter("", 0), 1199271174, false, $$e(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr3[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), AndroidCharacter.getMirror('0') + 603, 44 - View.MeasureSpec.getMode(0), -450685997, false, $$e(b4, b5, b5), new Class[]{Object.class, Object.class});
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
        if (i3 > 0) {
            int i6 = $11 + 115;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
            char[] cArr4 = new char[i2];
            System.arraycopy(cArr3, 0, cArr4, 0, i2);
            System.arraycopy(cArr4, 0, cArr3, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            System.arraycopy(cArr4, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr3, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
        }
        if (z) {
            int i8 = $11 + 13;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                cArr2 = new char[i2];
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            } else {
                cArr2 = new char[i2];
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            }
            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getLongPressTimeout() >> 16), 651 - View.MeasureSpec.getSize(0), 44 - View.MeasureSpec.makeMeasureSpec(0, 0), -450685997, false, $$e(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            }
            cArr3 = cArr2;
        }
        objArr[0] = new String(cArr3);
        int i9 = $11 + 41;
        $10 = i9 % 128;
        int i10 = i9 % 2;
    }

    static {
        b = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 7;
        b = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
        java.util.NoSuchElementException
        	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
        	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    public static java.lang.Object[] b(java.lang.Class r35, int r36, int r37, int r38) {
        /*
            Method dump skipped, instruction units count: 3252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.queueing.remote.QueueingApi.b(java.lang.Class, int, int, int):java.lang.Object[]");
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -83722432;
    }

    private static String $$e(int i, int i2, byte b2) {
        int i3 = 3 - (i2 * 2);
        byte[] bArr = $$c;
        int i4 = b2 + 119;
        int i5 = i * 3;
        byte[] bArr2 = new byte[1 - i5];
        int i6 = 0 - i5;
        int i7 = -1;
        if (bArr == null) {
            i7 = -1;
            i4 = i3 + i4;
            i3 = i3;
        }
        while (true) {
            int i8 = i7 + 1;
            int i9 = i3 + 1;
            bArr2[i8] = (byte) i4;
            if (i8 == i6) {
                return new String(bArr2, 0);
            }
            i7 = i8;
            i4 = bArr[i9] + i4;
            i3 = i9;
        }
    }
}
