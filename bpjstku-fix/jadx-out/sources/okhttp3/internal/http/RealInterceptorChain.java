package okhttp3.internal.http;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import com.bpjstku.databinding.ActivityLoginBinding;
import com.google.firebase.analytics.FirebaseAnalytics;
import defpackage.getSupportedPostviewSize;
import defpackage.initSession;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0017¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019JM\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00072\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\b\u001a\u00020\u000b2\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001f\u0010\u0016J\u000f\u0010 \u001a\u00020\u000bH\u0017¢\u0006\u0004\b \u0010!J\u001f\u0010#\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\"H\u0017¢\u0006\u0004\b#\u0010$J\u001f\u0010%\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\"H\u0017¢\u0006\u0004\b%\u0010$J\u001f\u0010&\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\"H\u0017¢\u0006\u0004\b&\u0010$J\u000f\u0010'\u001a\u00020\u0007H\u0016¢\u0006\u0004\b'\u0010\u0016R\u001a\u0010\u0013\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0013\u0010(\u001a\u0004\b)\u0010*R\u0016\u0010+\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u0010\u0015\u001a\u00020\u00078\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0015\u0010,\u001a\u0004\b-\u0010\u0016R\u001c\u0010.\u001a\u0004\u0018\u00010\t8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0014\u00102\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b2\u0010,R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001a\u0010\u001f\u001a\u00020\u00078\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u001f\u0010,\u001a\u0004\b5\u0010\u0016R\u001a\u0010 \u001a\u00020\u000b8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b \u00106\u001a\u0004\b7\u0010!R\u001a\u0010'\u001a\u00020\u00078\u0001X\u0081\u0004¢\u0006\f\n\u0004\b'\u0010,\u001a\u0004\b8\u0010\u0016"}, d2 = {"Lokhttp3/internal/http/RealInterceptorChain;", "Lokhttp3/Interceptor$Chain;", "Lokhttp3/internal/connection/RealCall;", "p0", "", "Lokhttp3/Interceptor;", "p1", "", "p2", "Lokhttp3/internal/connection/Exchange;", "p3", "Lokhttp3/Request;", "p4", "p5", "p6", "p7", "<init>", "(Lokhttp3/internal/connection/RealCall;Ljava/util/List;ILokhttp3/internal/connection/Exchange;Lokhttp3/Request;III)V", "Lokhttp3/Call;", NotificationCompat.CATEGORY_CALL, "()Lokhttp3/Call;", "connectTimeoutMillis", "()I", "Lokhttp3/Connection;", "connection", "()Lokhttp3/Connection;", "copy$okhttp", "(ILokhttp3/internal/connection/Exchange;Lokhttp3/Request;III)Lokhttp3/internal/http/RealInterceptorChain;", "Lokhttp3/Response;", "proceed", "(Lokhttp3/Request;)Lokhttp3/Response;", "readTimeoutMillis", "request", "()Lokhttp3/Request;", "Ljava/util/concurrent/TimeUnit;", "withConnectTimeout", "(ILjava/util/concurrent/TimeUnit;)Lokhttp3/Interceptor$Chain;", "withReadTimeout", "withWriteTimeout", "writeTimeoutMillis", "Lokhttp3/internal/connection/RealCall;", "getCall$okhttp", "()Lokhttp3/internal/connection/RealCall;", "calls", "I", "getConnectTimeoutMillis$okhttp", "exchange", "Lokhttp3/internal/connection/Exchange;", "getExchange$okhttp", "()Lokhttp3/internal/connection/Exchange;", FirebaseAnalytics.Param.INDEX, "interceptors", "Ljava/util/List;", "getReadTimeoutMillis$okhttp", "Lokhttp3/Request;", "getRequest$okhttp", "getWriteTimeoutMillis$okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RealInterceptorChain implements Interceptor.Chain {
    private static int TuitionPaymentFragmentbindingInflater1;
    private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static int asBinder;
    private static char[] b;
    private final RealCall call;
    private int calls;
    private final int connectTimeoutMillis;
    private final Exchange exchange;
    private final int index;
    private final List<Interceptor> interceptors;
    private final int readTimeoutMillis;
    private final Request request;
    private final int writeTimeoutMillis;
    private static final byte[] $$c = {80, -8, 43, 65};
    private static final int $$d = 167;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {93, -77, 2, Base64.padSymbol, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54};
    private static final int $$b = 98;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f1288a = 1;
    private static int g = 0;
    private static int d = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 2
            int r7 = 84 - r7
            int r6 = r6 * 15
            int r0 = 53 - r6
            byte[] r1 = okhttp3.internal.http.RealInterceptorChain.$$a
            int r8 = r8 + 4
            byte[] r0 = new byte[r0]
            int r6 = 52 - r6
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
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L27:
            r3 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r5
        L2c:
            int r7 = r7 + r8
            int r7 = r7 + (-11)
            int r8 = r3 + 1
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http.RealInterceptorChain.c(byte, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RealInterceptorChain(RealCall realCall, List<? extends Interceptor> list, int i, Exchange exchange, Request request, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(realCall, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(request, "");
        this.call = realCall;
        this.interceptors = list;
        this.index = i;
        this.exchange = exchange;
        this.request = request;
        this.connectTimeoutMillis = i2;
        this.readTimeoutMillis = i3;
        this.writeTimeoutMillis = i4;
    }

    public final RealCall getCall$okhttp() {
        int i = 2 % 2;
        int i2 = g + 59;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        RealCall realCall = this.call;
        int i5 = i3 + 51;
        g = i5 % 128;
        if (i5 % 2 == 0) {
            return realCall;
        }
        throw null;
    }

    public final Exchange getExchange$okhttp() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 43;
        d = i3 % 128;
        int i4 = i3 % 2;
        Exchange exchange = this.exchange;
        int i5 = i2 + 55;
        d = i5 % 128;
        if (i5 % 2 != 0) {
            return exchange;
        }
        throw null;
    }

    public final Request getRequest$okhttp() {
        int i = 2 % 2;
        int i2 = d + 119;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            return this.request;
        }
        throw null;
    }

    public final int getConnectTimeoutMillis$okhttp() {
        int i;
        int i2 = 2 % 2;
        int i3 = g + 99;
        int i4 = i3 % 128;
        d = i4;
        if (i3 % 2 == 0) {
            i = this.connectTimeoutMillis;
            int i5 = 82 / 0;
        } else {
            i = this.connectTimeoutMillis;
        }
        int i6 = i4 + 59;
        g = i6 % 128;
        int i7 = i6 % 2;
        return i;
    }

    public final int getReadTimeoutMillis$okhttp() {
        int i = 2 % 2;
        int i2 = d + 23;
        int i3 = i2 % 128;
        g = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = this.readTimeoutMillis;
        int i5 = i3 + 33;
        d = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public final int getWriteTimeoutMillis$okhttp() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 125;
        g = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.writeTimeoutMillis;
        int i6 = i2 + 33;
        g = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        throw null;
    }

    public static /* synthetic */ RealInterceptorChain copy$okhttp$default(RealInterceptorChain realInterceptorChain, int i, Exchange exchange, Request request, int i2, int i3, int i4, int i5, Object obj) {
        int i6 = 2 % 2;
        if ((i5 & 1) != 0) {
            i = realInterceptorChain.index;
        }
        int i7 = i;
        if ((i5 & 2) != 0) {
            int i8 = d + 107;
            g = i8 % 128;
            if (i8 % 2 != 0) {
                Exchange exchange2 = realInterceptorChain.exchange;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            exchange = realInterceptorChain.exchange;
        }
        Exchange exchange3 = exchange;
        if ((i5 & 4) != 0) {
            int i9 = g + 87;
            d = i9 % 128;
            int i10 = i9 % 2;
            request = realInterceptorChain.request;
        }
        Request request2 = request;
        if ((i5 & 8) != 0) {
            i2 = realInterceptorChain.connectTimeoutMillis;
        }
        int i11 = i2;
        if ((i5 & 16) != 0) {
            int i12 = d + 21;
            g = i12 % 128;
            int i13 = i12 % 2;
            i3 = realInterceptorChain.readTimeoutMillis;
        }
        int i14 = i3;
        if ((i5 & 32) != 0) {
            i4 = realInterceptorChain.writeTimeoutMillis;
        }
        return realInterceptorChain.copy$okhttp(i7, exchange3, request2, i11, i14, i4);
    }

    public final RealInterceptorChain copy$okhttp(int p0, Exchange p1, Request p2, int p3, int p4, int p5) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p2, "");
        RealInterceptorChain realInterceptorChain = new RealInterceptorChain(this.call, this.interceptors, p0, p1, p2, p3, p4, p5);
        int i2 = g + 37;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            return realInterceptorChain;
        }
        throw null;
    }

    private static void e(char[] cArr, int[] iArr, int i, byte[] bArr, Object[] objArr) throws Throwable {
        char[] cArr2;
        int i2 = 2 % 2;
        getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
        char[] cArr3 = b;
        long j = 0;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i3 = 0;
            while (i3 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i3])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 31340);
                        int iBlue = 2994 - Color.blue(0);
                        int i4 = 18 - (SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1));
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, iBlue, i4, 1182129903, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr4[i3] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i3++;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr4;
        }
        try {
            Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 43325), 254 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 22 - KeyEvent.getDeadChar(0, 0), 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
            try {
                if (TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    int i5 = $10 + 103;
                    $11 = i5 % 128;
                    if (i5 % 2 == 0) {
                        getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
                        cArr2 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                        getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                    } else {
                        getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
                        cArr2 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                        getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                    }
                    while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                        int i6 = $10 + 97;
                        $11 = i6 % 128;
                        if (i6 % 2 == 0) {
                            cArr2[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 + 1) << getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] * iIntValue);
                            Object[] objArr4 = {getsupportedpostviewsize, getsupportedpostviewsize};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                byte b4 = (byte) 0;
                                byte b5 = b4;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (33601 - ExpandableListView.getPackedPositionChild(0L)), (ViewConfiguration.getPressedStateDuration() >> 16) + 3085, Color.blue(0) + 26, -2146875848, false, $$e(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                        } else {
                            cArr2[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                            Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                byte b6 = (byte) 0;
                                byte b7 = b6;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 33601), 3084 - ExpandableListView.getPackedPositionChild(0L), Color.alpha(0) + 26, -2146875848, false, $$e(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                        }
                    }
                    objArr[0] = new String(cArr2);
                    return;
                }
                if (!TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                    getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
                    char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                    while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                        cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                        getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1++;
                    }
                    objArr[0] = new String(cArr5);
                    return;
                }
                int i7 = $11 + 101;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
                char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                int i9 = $11 + 63;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                    int i11 = $10 + 17;
                    $11 = i11 % 128;
                    int i12 = i11 % 2;
                    cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                    Object[] objArr6 = {getsupportedpostviewsize, getsupportedpostviewsize};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        byte b8 = (byte) 0;
                        byte b9 = b8;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (ImageFormat.getBitsPerPixel(0) + 33603), 3085 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 26 - (KeyEvent.getMaxKeyCode() >> 16), -2146875848, false, $$e(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
                }
                objArr[0] = new String(cArr6);
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
    }

    @Override // okhttp3.Interceptor.Chain
    public final Connection connection() throws Throwable {
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) (29945 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
            int iAlpha = 1755 - Color.alpha(0);
            int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 23;
            byte[] bArr = $$a;
            byte b2 = bArr[28];
            byte b3 = bArr[7];
            Object[] objArr = new Object[1];
            c(b2, b3, b3, objArr);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, iAlpha, threadPriority, 986134021, false, (String) objArr[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr2 = new Object[1];
        e(null, null, (ViewConfiguration.getEdgeSlop() >> 16) + 127, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        e(null, null, Gravity.getAbsoluteGravity(0, 0) + 127, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr3);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c2 = (char) (29944 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 1756;
            int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 23;
            byte b4 = $$a[7];
            byte b5 = b4;
            Object[] objArr4 = new Object[1];
            c(b4, b5, (byte) (b5 | 37), objArr4);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c2, iIndexOf, keyRepeatTimeout, 1596667560, false, (String) objArr4[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char defaultSize = (char) (29944 - View.getDefaultSize(0, 0));
                int i2 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1754;
                int pressedStateDuration = 23 - (ViewConfiguration.getPressedStateDuration() >> 16);
                byte b6 = $$a[7];
                byte b7 = b6;
                Object[] objArr5 = new Object[1];
                c(b6, b7, (byte) (b7 | 89), objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(defaultSize, i2, pressedStateDuration, 1599039318, false, (String) objArr5[0], null);
            }
            Object[] objArr6 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da = new Object[]{new int[]{((int[]) objArr6[0])[0]}, new int[]{((int[]) objArr6[1])[0]}, (Object[]) objArr6[2], new int[1], (String[]) objArr6[4]};
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i3 = (((-118798613) + (((~((~startUptimeMillis) | 44583615)) | 223612992) * 446)) + (((~(startUptimeMillis | 268196607)) | 33573049) * 446)) - 1498776532;
            int i4 = (i3 << 13) ^ i3;
            int i5 = i4 ^ (i4 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[3])[0] = i5 ^ (i5 << 5);
        } else {
            Object[] objArr7 = new Object[1];
            e(null, null, 127 - KeyEvent.getDeadChar(0, 0), new byte[]{-115, -116, -117, -120, -118, -119, -121, -106, -126, -127, -113, -121, -127, -107, -127, -108}, objArr7);
            Class<?> cls2 = Class.forName((String) objArr7[0]);
            Object[] objArr8 = new Object[1];
            e(null, null, Color.alpha(0) + 127, new byte[]{-116, -125, -123, -114, -104, -120, -127, -105, -118, -117, -122, -117, -126, -116, -125, -122}, objArr8);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr8[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr9 = {-369726346};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 42049), 1726 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (-16777187) - Color.rgb(0, 0, 0), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da = ActivityLoginBinding.TuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da(iIntValue, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr9), 1849044140);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cIndexOf = (char) (TextUtils.indexOf("", "", 0) + 29944);
                    int iIndexOf2 = TextUtils.indexOf("", "", 0, 0) + 1755;
                    int edgeSlop = 23 - (ViewConfiguration.getEdgeSlop() >> 16);
                    byte b8 = $$a[7];
                    byte b9 = b8;
                    Object[] objArr10 = new Object[1];
                    c(b8, b9, (byte) (b9 | 89), objArr10);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf, iIndexOf2, edgeSlop, 1599039318, false, (String) objArr10[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da);
                try {
                    Object[] objArr11 = new Object[1];
                    e(null, null, 127 - Color.alpha(0), new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr11);
                    Class<?> cls3 = Class.forName((String) objArr11[0]);
                    Object[] objArr12 = new Object[1];
                    e(null, null, Drawable.resolveOpacity(0, 0) + 127, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr12);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr12[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char deadChar = (char) (KeyEvent.getDeadChar(0, 0) + 29944);
                        int i6 = 1756 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                        int iKeyCodeFromString = 23 - KeyEvent.keyCodeFromString("");
                        byte b10 = $$a[7];
                        byte b11 = b10;
                        Object[] objArr13 = new Object[1];
                        c(b10, b11, (byte) (b11 | 37), objArr13);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(deadChar, i6, iKeyCodeFromString, 1596667560, false, (String) objArr13[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char cRgb = (char) (Color.rgb(0, 0, 0) + 16807160);
                        int i7 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1754;
                        int i8 = 23 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        byte[] bArr2 = $$a;
                        byte b12 = bArr2[28];
                        byte b13 = bArr2[7];
                        Object[] objArr14 = new Object[1];
                        c(b12, b13, b13, objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cRgb, i7, i8, 986134021, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf2);
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
        int i9 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[1])[0];
        int i10 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[0])[0];
        if (i10 == i9) {
            int i11 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[3])[0];
            Object[] objArr15 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[4]};
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i12 = i11 + (-396228247) + (((~(startElapsedRealtime | 302676339)) | 90073913) * (-668)) + ((302676339 | (~(90073913 | startElapsedRealtime))) * 1336) + ((startElapsedRealtime | 392067963) * 668);
            int i13 = (i12 << 13) ^ i12;
            int i14 = i13 ^ (i13 >>> 17);
            ((int[]) objArr15[3])[0] = i14 ^ (i14 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[4];
            if (strArr != null) {
                for (String str : strArr) {
                    int i15 = d + 7;
                    g = i15 % 128;
                    int i16 = i15 % 2;
                    arrayList.add(str);
                }
            }
            Toast.makeText((Context) null, i10 / (((i10 - 1) * i10) % 2), 0).show();
            int i17 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[3])[0];
            Object[] objArr16 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i18 = ~iIdentityHashCode;
            int i19 = ~((-437360038) | i18);
            int i20 = ~(224757611 | iIdentityHashCode);
            int i21 = i17 + (-1774707662) + ((i19 | i20) * 1150) + (((~((-224757612) | i18)) | i20) * (-575)) + (((~(iIdentityHashCode | (-437360038))) | (~(i18 | 437360037))) * 575);
            int i22 = (i21 << 13) ^ i21;
            int i23 = i22 ^ (i22 >>> 17);
            ((int[]) objArr16[3])[0] = i23 ^ (i23 << 5);
            int i24 = d + 41;
            g = i24 % 128;
            if (i24 % 2 != 0) {
                int i25 = 4 / 4;
            }
        }
        Exchange exchange = this.exchange;
        return exchange != null ? exchange.getConnection$okhttp() : null;
    }

    @Override // okhttp3.Interceptor.Chain
    public final int connectTimeoutMillis() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 57;
        g = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.connectTimeoutMillis;
        int i6 = i2 + 7;
        g = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    @Override // okhttp3.Interceptor.Chain
    public final Interceptor.Chain withConnectTimeout(int p0, TimeUnit p1) {
        int i = 2 % 2;
        int i2 = d + 99;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(p1, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(p1, "");
        if (this.exchange != null) {
            throw new IllegalStateException("Timeouts can't be adjusted in a network interceptor".toString());
        }
        RealInterceptorChain realInterceptorChainCopy$okhttp$default = copy$okhttp$default(this, 0, null, null, Util.checkDuration("connectTimeout", p0, p1), 0, 0, 55, null);
        int i3 = g + 115;
        d = i3 % 128;
        int i4 = i3 % 2;
        return realInterceptorChainCopy$okhttp$default;
    }

    @Override // okhttp3.Interceptor.Chain
    public final int readTimeoutMillis() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 21;
        d = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.readTimeoutMillis;
        int i6 = i2 + 95;
        d = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    @Override // okhttp3.Interceptor.Chain
    public final Interceptor.Chain withReadTimeout(int p0, TimeUnit p1) {
        int i = 2 % 2;
        int i2 = g + 57;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(p1, "");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(p1, "");
        if (this.exchange != null) {
            throw new IllegalStateException("Timeouts can't be adjusted in a network interceptor".toString());
        }
        RealInterceptorChain realInterceptorChainCopy$okhttp$default = copy$okhttp$default(this, 0, null, null, 0, Util.checkDuration("readTimeout", p0, p1), 0, 47, null);
        int i3 = d + 57;
        g = i3 % 128;
        int i4 = i3 % 2;
        return realInterceptorChainCopy$okhttp$default;
    }

    @Override // okhttp3.Interceptor.Chain
    public final int writeTimeoutMillis() {
        int i = 2 % 2;
        int i2 = d + 93;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            return this.writeTimeoutMillis;
        }
        throw null;
    }

    @Override // okhttp3.Interceptor.Chain
    public final Interceptor.Chain withWriteTimeout(int p0, TimeUnit p1) {
        int i = 2 % 2;
        int i2 = d + 69;
        g = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(p1, "");
        if (this.exchange != null) {
            throw new IllegalStateException("Timeouts can't be adjusted in a network interceptor".toString());
        }
        int i4 = g + 37;
        d = i4 % 128;
        int i5 = i4 % 2;
        RealInterceptorChain realInterceptorChainCopy$okhttp$default = copy$okhttp$default(this, 0, null, null, 0, 0, Util.checkDuration("writeTimeout", p0, p1), 31, null);
        int i6 = d + 35;
        g = i6 % 128;
        int i7 = i6 % 2;
        return realInterceptorChainCopy$okhttp$default;
    }

    @Override // okhttp3.Interceptor.Chain
    public final Call call() {
        int i = 2 % 2;
        int i2 = d + 97;
        g = i2 % 128;
        int i3 = i2 % 2;
        RealCall realCall = this.call;
        if (i3 == 0) {
            return realCall;
        }
        throw null;
    }

    @Override // okhttp3.Interceptor.Chain
    public final Request request() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 97;
        g = i3 % 128;
        int i4 = i3 % 2;
        Request request = this.request;
        int i5 = i2 + 67;
        g = i5 % 128;
        int i6 = i5 % 2;
        return request;
    }

    @Override // okhttp3.Interceptor.Chain
    public final Response proceed(Request p0) throws IOException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        if (this.index >= this.interceptors.size()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.calls++;
        Exchange exchange = this.exchange;
        if (exchange != null) {
            if (!exchange.getFinder$okhttp().sameHostAndPort(p0.url())) {
                StringBuilder sb = new StringBuilder("network interceptor ");
                sb.append(this.interceptors.get(this.index - 1));
                sb.append(" must retain the same host and port");
                throw new IllegalStateException(sb.toString().toString());
            }
            int i2 = g + 119;
            d = i2 % 128;
            int i3 = i2 % 2;
            if (this.calls != 1) {
                StringBuilder sb2 = new StringBuilder("network interceptor ");
                sb2.append(this.interceptors.get(this.index - 1));
                sb2.append(" must call proceed() exactly once");
                throw new IllegalStateException(sb2.toString().toString());
            }
        }
        RealInterceptorChain realInterceptorChainCopy$okhttp$default = copy$okhttp$default(this, this.index + 1, null, p0, 0, 0, 0, 58, null);
        Interceptor interceptor = this.interceptors.get(this.index);
        Response responseIntercept = interceptor.intercept(realInterceptorChainCopy$okhttp$default);
        if (responseIntercept == null) {
            StringBuilder sb3 = new StringBuilder("interceptor ");
            sb3.append(interceptor);
            sb3.append(" returned null");
            throw new NullPointerException(sb3.toString());
        }
        if (this.exchange != null && this.index + 1 < this.interceptors.size()) {
            int i4 = g + 67;
            d = i4 % 128;
            int i5 = i4 % 2;
            if (realInterceptorChainCopy$okhttp$default.calls != 1) {
                StringBuilder sb4 = new StringBuilder("network interceptor ");
                sb4.append(interceptor);
                sb4.append(" must call proceed() exactly once");
                throw new IllegalStateException(sb4.toString().toString());
            }
        }
        if (responseIntercept.body() == null) {
            StringBuilder sb5 = new StringBuilder("interceptor ");
            sb5.append(interceptor);
            sb5.append(" returned a response with no body");
            throw new IllegalStateException(sb5.toString().toString());
        }
        int i6 = g + 93;
        d = i6 % 128;
        if (i6 % 2 != 0) {
            return responseIntercept;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        asBinder = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1359153254;
        int i = f1288a + 3;
        asBinder = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        b = new char[]{47226, 47213, 47223, 47209, 47212, 47218, 47149, 47208, 47176, 47202, 47207, 47222, 47214, 47192, 47215, 47224, 47216, 47211, 47177, 47217, 47205, 47220, 47187, 47219};
        TuitionPaymentFragmentbindingInflater1 = 2047719451;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(int r5, int r6, byte r7) {
        /*
            int r5 = r5 * 4
            int r5 = r5 + 4
            int r6 = r6 * 2
            int r0 = r6 + 1
            byte[] r1 = okhttp3.internal.http.RealInterceptorChain.$$c
            int r7 = 68 - r7
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r4 = r5
            r7 = r6
            r3 = r2
            goto L25
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L21
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L21:
            int r3 = r3 + 1
            r4 = r1[r5]
        L25:
            int r5 = r5 + 1
            int r7 = r7 + r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http.RealInterceptorChain.$$e(int, int, byte):java.lang.String");
    }
}
