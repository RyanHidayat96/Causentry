package com.bpjstku.data.report.model.request;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bpjstku.data.lib.model.BaseRequest;
import com.google.gson.annotations.SerializedName;
import com.yalantis.ucrop.view.CropImageView;
import defpackage.SessionProcessor;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0003\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0017\u0010\nR\u001a\u0010\u0018\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u001b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\nR\u001a\u0010\u001d\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\nR\u001a\u0010\u001f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b \u0010\n"}, d2 = {"Lcom/bpjstku/data/report/model/request/PreloadDataRequest;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "", "p0", "p1", "p2", "p3", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/report/model/request/PreloadDataRequest;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "email", "Ljava/lang/String;", "getEmail", "kodeSegmen", "getKodeSegmen", "kpj", "getKpj", "checksum", "getChecksum"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class PreloadDataRequest extends BaseRequest {
    public static final int $stable = 0;
    private static char TuitionPaymentFragmentbindingInflater1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static int b;

    @SerializedName("checksum")
    private final String checksum;

    @SerializedName("email")
    private final String email;

    @SerializedName("kodeSegmen")
    private final String kodeSegmen;

    @SerializedName("kpj")
    private final String kpj;
    private static final byte[] $$c = {83, -44, 103, 46};
    private static final int $$d = 112;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {64, 73, -26, 82, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
    private static final int $$b = 52;
    private static int d = 0;
    private static int asInterface = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;

    private static void c(int i, int i2, int i3, Object[] objArr) {
        int i4 = 145 - i3;
        int i5 = (i * 14) + 84;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i2 + 1];
        int i6 = -1;
        if (bArr == null) {
            i5 = (i2 + i5) - 11;
            i4++;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i5;
            if (i6 == i2) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i5 = (i5 + bArr[i4]) - 11;
                i4++;
            }
        }
    }

    public final String getEmail() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 31;
        d = i3 % 128;
        int i4 = i3 % 2;
        String str = this.email;
        int i5 = i2 + 75;
        d = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getKodeSegmen() {
        int i = 2 % 2;
        int i2 = d + 83;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        String str = this.kodeSegmen;
        if (i3 == 0) {
            int i4 = 34 / 0;
        }
        return str;
    }

    public final String getKpj() {
        int i = 2 % 2;
        int i2 = d + 71;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return this.kpj;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getChecksum() {
        int i = 2 % 2;
        int i2 = asInterface + 35;
        int i3 = i2 % 128;
        d = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.checksum;
        int i4 = i3 + 111;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 78 / 0;
        }
        return str;
    }

    public PreloadDataRequest(String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.email = str;
        this.kodeSegmen = str2;
        this.kpj = str3;
        this.checksum = str4;
    }

    private static void a(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        SessionProcessor sessionProcessor = new SessionProcessor();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr.length;
        char[] cArr5 = new char[length2];
        int i3 = 0;
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr3.length;
        char[] cArr6 = new char[length3];
        sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
            int i4 = $10 + 103;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', i3, i3) + 8329);
                    int edgeSlop = 1235 - (ViewConfiguration.getEdgeSlop() >> 16);
                    int threadPriority = 35 - ((Process.getThreadPriority(i3) + 20) >> 6);
                    byte b2 = (byte) i3;
                    byte b3 = b2;
                    String str$$e = $$e(b2, b3, b3);
                    Class[] clsArr = new Class[1];
                    clsArr[i3] = Object.class;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cLastIndexOf, edgeSlop, threadPriority, -653973969, false, str$$e, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) 2;
                    byte b5 = (byte) (b4 - 2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) TextUtils.getCapsMode("", i3, i3), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 2764, (KeyEvent.getMaxKeyCode() >> 16) + 14, 1504416861, false, $$e(b4, b5, b5), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (43325 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), TextUtils.indexOf("", "", 0, 0) + 253, 22 - (ViewConfiguration.getScrollDefaultDelay() >> 16), -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b6 = (byte) 1;
                    byte b7 = (byte) (b6 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (65201 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 2891 - (ViewConfiguration.getWindowTouchSlop() >> 8), TextUtils.getTrimmedLength("") + 17, 2012627446, false, $$e(b6, b7, b7), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = sessionProcessor.b;
                cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault2 ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) TuitionPaymentFragmentbindingInflater1) ^ (-6377398940819159759L)))));
                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                i3 = 0;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
        int i6 = $10 + 25;
        $11 = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    static {
        b = 0;
        b();
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 31;
        b = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ PreloadDataRequest copy$default(PreloadDataRequest preloadDataRequest, String str, String str2, String str3, String str4, int i, Object obj) {
        int i2 = 2 % 2;
        Object obj2 = null;
        if ((i & 1) != 0) {
            int i3 = d + 53;
            asInterface = i3 % 128;
            if (i3 % 2 == 0) {
                String str5 = preloadDataRequest.email;
                obj2.hashCode();
                throw null;
            }
            str = preloadDataRequest.email;
        }
        if ((i & 2) != 0) {
            int i4 = d + 79;
            asInterface = i4 % 128;
            if (i4 % 2 == 0) {
                String str6 = preloadDataRequest.kodeSegmen;
                throw null;
            }
            str2 = preloadDataRequest.kodeSegmen;
        }
        if ((i & 4) != 0) {
            str3 = preloadDataRequest.kpj;
            int i5 = asInterface + 37;
            d = i5 % 128;
            int i6 = i5 % 2;
        }
        if ((i & 8) != 0) {
            int i7 = asInterface + 39;
            d = i7 % 128;
            if (i7 % 2 != 0) {
                String str7 = preloadDataRequest.checksum;
                throw null;
            }
            str4 = preloadDataRequest.checksum;
        }
        return preloadDataRequest.copy(str, str2, str3, str4);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = asInterface + 121;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        String str = this.email;
        int i5 = i3 + 35;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 71 / 0;
        }
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 63;
        d = i3 % 128;
        int i4 = i3 % 2;
        String str = this.kodeSegmen;
        int i5 = i2 + 47;
        d = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = d + 19;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        String str = this.kpj;
        if (i3 == 0) {
            int i4 = 77 / 0;
        }
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = d + 81;
        int i3 = i2 % 128;
        asInterface = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.checksum;
        int i4 = i3 + 85;
        d = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final PreloadDataRequest copy(String p0, String p1, String p2, String p3) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Intrinsics.checkNotNullParameter(p3, "");
        PreloadDataRequest preloadDataRequest = new PreloadDataRequest(p0, p1, p2, p3);
        int i2 = d + 103;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        return preloadDataRequest;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r6 instanceof com.bpjstku.data.report.model.request.PreloadDataRequest) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        r6 = (com.bpjstku.data.report.model.request.PreloadDataRequest) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.email, r6.email) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.kodeSegmen, r6.kodeSegmen) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        r6 = com.bpjstku.data.report.model.request.PreloadDataRequest.asInterface + 61;
        com.bpjstku.data.report.model.request.PreloadDataRequest.d = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.kpj, r6.kpj) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0052, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.checksum, r6.checksum) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0055, code lost:
    
        r6 = com.bpjstku.data.report.model.request.PreloadDataRequest.d + 87;
        com.bpjstku.data.report.model.request.PreloadDataRequest.asInterface = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.bpjstku.data.report.model.request.PreloadDataRequest.d
            int r1 = r1 + 33
            int r2 = r1 % 128
            com.bpjstku.data.report.model.request.PreloadDataRequest.asInterface = r2
            int r1 = r1 % r0
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L16
            r1 = 94
            int r1 = r1 / r3
            if (r5 != r6) goto L19
            goto L18
        L16:
            if (r5 != r6) goto L19
        L18:
            return r2
        L19:
            boolean r1 = r6 instanceof com.bpjstku.data.report.model.request.PreloadDataRequest
            if (r1 != 0) goto L1e
            return r3
        L1e:
            com.bpjstku.data.report.model.request.PreloadDataRequest r6 = (com.bpjstku.data.report.model.request.PreloadDataRequest) r6
            java.lang.String r1 = r5.email
            java.lang.String r4 = r6.email
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
            if (r1 != 0) goto L2b
            return r3
        L2b:
            java.lang.String r1 = r5.kodeSegmen
            java.lang.String r4 = r6.kodeSegmen
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
            if (r1 != 0) goto L3f
            int r6 = com.bpjstku.data.report.model.request.PreloadDataRequest.asInterface
            int r6 = r6 + 61
            int r1 = r6 % 128
            com.bpjstku.data.report.model.request.PreloadDataRequest.d = r1
            int r6 = r6 % r0
            return r3
        L3f:
            java.lang.String r1 = r5.kpj
            java.lang.String r4 = r6.kpj
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
            if (r1 != 0) goto L4a
            return r3
        L4a:
            java.lang.String r1 = r5.checksum
            java.lang.String r6 = r6.checksum
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r6)
            if (r6 != 0) goto L55
            return r3
        L55:
            int r6 = com.bpjstku.data.report.model.request.PreloadDataRequest.d
            int r6 = r6 + 87
            int r1 = r6 % 128
            com.bpjstku.data.report.model.request.PreloadDataRequest.asInterface = r1
            int r6 = r6 % r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.report.model.request.PreloadDataRequest.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = d + 3;
        asInterface = i2 % 128;
        int iHashCode = i2 % 2 == 0 ? (((((this.email.hashCode() >>> 3) * this.kodeSegmen.hashCode()) % 68) - this.kpj.hashCode()) >> 45) >> this.checksum.hashCode() : (((((this.email.hashCode() * 31) + this.kodeSegmen.hashCode()) * 31) + this.kpj.hashCode()) * 31) + this.checksum.hashCode();
        int i3 = d + 101;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = this.email;
        String str2 = this.kodeSegmen;
        String str3 = this.kpj;
        String str4 = this.checksum;
        StringBuilder sb = new StringBuilder("PreloadDataRequest(email=");
        sb.append(str);
        sb.append(", kodeSegmen=");
        sb.append(str2);
        sb.append(", kpj=");
        sb.append(str3);
        sb.append(", checksum=");
        sb.append(str4);
        sb.append(")");
        String string = sb.toString();
        int i2 = asInterface + 57;
        d = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:120:0x0340 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x032a  */
    /* JADX WARN: Code duplicated, block: B:41:0x0330  */
    /* JADX WARN: Code duplicated, block: B:44:0x0348 A[Catch: Exception -> 0x0672, TRY_LEAVE, TryCatch #5 {Exception -> 0x0672, blocks: (B:42:0x0340, B:44:0x0348, B:50:0x03d3, B:53:0x047d, B:55:0x0483, B:56:0x0484, B:57:0x0485, B:59:0x04a6, B:65:0x0522, B:67:0x0535, B:70:0x0566, B:75:0x05d6, B:79:0x05df, B:81:0x05e5, B:82:0x05e6, B:83:0x05e7, B:88:0x065e, B:93:0x066a, B:95:0x0670, B:96:0x0671, B:84:0x0607, B:86:0x0614, B:87:0x0657, B:45:0x037d, B:47:0x038a, B:48:0x03c2, B:71:0x0581, B:73:0x058e, B:74:0x05cf), top: B:120:0x0340, inners: #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x038a A[Catch: all -> 0x047c, TryCatch #3 {all -> 0x047c, blocks: (B:45:0x037d, B:47:0x038a, B:48:0x03c2), top: B:116:0x037d, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0485 A[Catch: Exception -> 0x0672, TRY_LEAVE, TryCatch #5 {Exception -> 0x0672, blocks: (B:42:0x0340, B:44:0x0348, B:50:0x03d3, B:53:0x047d, B:55:0x0483, B:56:0x0484, B:57:0x0485, B:59:0x04a6, B:65:0x0522, B:67:0x0535, B:70:0x0566, B:75:0x05d6, B:79:0x05df, B:81:0x05e5, B:82:0x05e6, B:83:0x05e7, B:88:0x065e, B:93:0x066a, B:95:0x0670, B:96:0x0671, B:84:0x0607, B:86:0x0614, B:87:0x0657, B:45:0x037d, B:47:0x038a, B:48:0x03c2, B:71:0x0581, B:73:0x058e, B:74:0x05cf), top: B:120:0x0340, inners: #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x04df  */
    /* JADX WARN: Code duplicated, block: B:63:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:70:0x0566 A[Catch: Exception -> 0x0672, TRY_ENTER, TRY_LEAVE, TryCatch #5 {Exception -> 0x0672, blocks: (B:42:0x0340, B:44:0x0348, B:50:0x03d3, B:53:0x047d, B:55:0x0483, B:56:0x0484, B:57:0x0485, B:59:0x04a6, B:65:0x0522, B:67:0x0535, B:70:0x0566, B:75:0x05d6, B:79:0x05df, B:81:0x05e5, B:82:0x05e6, B:83:0x05e7, B:88:0x065e, B:93:0x066a, B:95:0x0670, B:96:0x0671, B:84:0x0607, B:86:0x0614, B:87:0x0657, B:45:0x037d, B:47:0x038a, B:48:0x03c2, B:71:0x0581, B:73:0x058e, B:74:0x05cf), top: B:120:0x0340, inners: #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x058e A[Catch: all -> 0x05de, TryCatch #4 {all -> 0x05de, blocks: (B:71:0x0581, B:73:0x058e, B:74:0x05cf), top: B:118:0x0581, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x05dc  */
    /* JADX WARN: Code duplicated, block: B:83:0x05e7 A[Catch: Exception -> 0x0672, TRY_LEAVE, TryCatch #5 {Exception -> 0x0672, blocks: (B:42:0x0340, B:44:0x0348, B:50:0x03d3, B:53:0x047d, B:55:0x0483, B:56:0x0484, B:57:0x0485, B:59:0x04a6, B:65:0x0522, B:67:0x0535, B:70:0x0566, B:75:0x05d6, B:79:0x05df, B:81:0x05e5, B:82:0x05e6, B:83:0x05e7, B:88:0x065e, B:93:0x066a, B:95:0x0670, B:96:0x0671, B:84:0x0607, B:86:0x0614, B:87:0x0657, B:45:0x037d, B:47:0x038a, B:48:0x03c2, B:71:0x0581, B:73:0x058e, B:74:0x05cf), top: B:120:0x0340, inners: #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0614 A[Catch: all -> 0x0669, TryCatch #1 {all -> 0x0669, blocks: (B:84:0x0607, B:86:0x0614, B:87:0x0657), top: B:112:0x0607, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x0666  */
    /* JADX WARN: Code duplicated, block: B:91:0x0667  */
    /* JADX WARN: Code duplicated, block: B:97:0x0672  */
    public static Object[] TuitionPaymentFragmentbindingInflater1(Context context, int i, int i2, int i3) throws Throwable {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        String str;
        char[] cArr;
        char[] cArr2;
        char c;
        int i11;
        Object[] objArr;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object[] objArr2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        int i12;
        int i13;
        int i14 = 2 % 2;
        if (context != null) {
            int i15 = asInterface + 91;
            d = i15 % 128;
            int i16 = i15 % 2;
            try {
                Object[] objArr3 = new Object[1];
                a(new char[]{34999, 14383, 36455, 60114}, new char[]{17927, 2008, 17440, 37778}, (char) View.combineMeasuredStates(0, 0), 537385030 + View.getDefaultSize(0, 0), new char[]{54419, 19903, 32363, 9285, 32378, 61842, 36735, 16944, 26881, 30597, 1123, 20539, 3154, 45684, 924, 12273, 6951, 18420, 13911, 47336, 52411, 63996, 8151}, objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                int i17 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                int i18 = (i17 * (-743)) - 6684771;
                int i19 = (i17 ^ 8997) | (i17 & 8997);
                int i20 = ~i19;
                int i21 = ~((i17 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (i17 & iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                int i22 = (i20 ^ i21) | (i21 & i20);
                int i23 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault1 ^ 8997) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 & 8997));
                int i24 = ((i22 & i23) | (i22 ^ i23)) * (-744);
                int i25 = (i18 & i24) + (i24 | i18);
                int i26 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                int i27 = ~i17;
                int i28 = ~((i27 & (-8998)) | (i27 ^ (-8998)));
                char c2 = (char) (((i25 - (~(((i26 & i28) | (i26 ^ i28)) * 744))) - 1) + (((i19 & iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (i19 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1)) * 744));
                int i29 = -(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                Object[] objArr4 = new Object[1];
                a(new char[]{34999, 14383, 36455, 60114}, new char[]{8281, 9721, 9890, 58147}, c2, (i29 & 1) + (i29 | 1), new char[]{59784, 4459, 423, 51368, 20770, 5999, 21087, 10875, 51667, 42190, 54381, 53999, 16990, 48153, 44422, 36332, 28941, 44729}, objArr4);
                Object objInvoke = cls.getMethod((String) objArr4[0], null).invoke(context, null);
                int i30 = -ImageFormat.getBitsPerPixel(0);
                int i31 = (i30 * 367) - 367;
                int i32 = ~i30;
                int i33 = -(-((i32 | i30) * (-366)));
                int i34 = (i31 & i33) + (i31 | i33);
                int i35 = ~i;
                int i36 = i34 + (((i35 & i30) | (i30 ^ i35)) * (-366));
                int i37 = ~((~i32) | i32);
                int i38 = ~(i30 | i);
                int i39 = ((i38 & i37) | (i37 ^ i38)) * 366;
                Object[] objArr5 = new Object[1];
                a(new char[]{34999, 14383, 36455, 60114}, new char[]{37058, 2897, 48692, 58176}, (char) ((i36 ^ i39) + ((i39 & i36) << 1)), Process.myPid() >> 22, new char[]{6174, 18833, 2497, 36379, 30651, 56298, 33859, 54787, 25626, 39294, 22121, 46209, 19791, 61407, 60098, 12723, 47775, 26553, 60725, 64553, 6745, 63627, 54933, 20934, 2885, 34269, 46337, 46767, 61031, 55417, 64355, 18443, 253, 53377}, objArr5);
                Class<?> cls2 = Class.forName((String) objArr5[0]);
                int i40 = -(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                int i41 = i40 * 236;
                int i42 = ((i41 | 7121991) << 1) - (i41 ^ 7121991);
                int i43 = ~i40;
                int i44 = ~i;
                int i45 = -(-(((~((i44 & i43) | (i43 ^ i44))) | 15121) * (-235)));
                int i46 = (i42 & i45) + (i45 | i42);
                int i47 = ~i40;
                int i48 = (i46 - (~(-(-(((~((i47 & i) | (i47 ^ i))) | 15121) * (-470)))))) - 1;
                int i49 = asInterface;
                int i50 = ((i49 | 57) << 1) - (i49 ^ 57);
                d = i50 % 128;
                int i51 = i50 % 2;
                int i52 = (i43 & 15121) | (i43 ^ 15121);
                Object[] objArr6 = new Object[1];
                a(new char[]{34999, 14383, 36455, 60114}, new char[]{6263, 20256, 4103, 6459}, (char) ((i48 - (~(235 * ((~((i40 & (-15122)) | ((-15122) ^ i40))) | (~((i52 & i) | (i52 ^ i))))))) - 1), Color.red(0) + 122626072, new char[]{57055, 14082, 61592, 2922, 59297}, objArr6);
                int i53 = cls2.getField((String) objArr6[0]).getInt(objInvoke) & 2;
                int i54 = i & 1;
                int i55 = (~i54) & (i | 1);
                int i56 = -i53;
                int i57 = d;
                int i58 = (i57 ^ 109) + ((i57 & 109) << 1);
                asInterface = i58 % 128;
                if (i58 % 2 == 0) {
                    int i59 = (i53 & i56) | (i53 ^ i56);
                    int i60 = (i59 & (-124)) + (i59 | (-124));
                    int i61 = (~i60) & i;
                    int i62 = i55 & i60;
                    int i63 = (i61 & i62) | (i61 ^ i62);
                    i12 = i63 ^ i54;
                    i13 = i63 & i54;
                } else {
                    int i64 = ((i53 & i56) | (i53 ^ i56)) >> 31;
                    int i65 = (~i64) & i;
                    int i66 = i64 & i55;
                    i12 = i65 ^ i66;
                    i13 = i66 & i65;
                }
                i4 = i13 | i12;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } else {
            i4 = i;
        }
        try {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1122237249);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                char packedPositionChild = (char) (16948 - ExpandableListView.getPackedPositionChild(0L));
                int i67 = 2739 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 13;
                Object[] objArr7 = new Object[1];
                c($$a[7], (byte) $$b, (short) 141, objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(packedPositionChild, i67, longPressTimeout, 1501733736, false, (String) objArr7[0], new Class[0]);
            }
            Set set = (Set) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, null);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-431688923);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                char defaultSize = (char) (16949 - View.getDefaultSize(0, 0));
                int i68 = 2740 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 13;
                Object[] objArr8 = new Object[1];
                c($$a[7], (byte) $$b, (short) 89, objArr8);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(defaultSize, i68, iIndexOf, 47863026, false, (String) objArr8[0], null);
            }
            if (!set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null))) {
                int i69 = asInterface + 23;
                d = i69 % 128;
                if (i69 % 2 != 0) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1056710067);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cMakeMeasureSpec = (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 16949);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 2739;
                        int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 13;
                        byte b2 = $$a[7];
                        byte b3 = (byte) (b2 | 37);
                        Object[] objArr9 = new Object[1];
                        c(b2, b3, b3, objArr9);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cMakeMeasureSpec, iMakeMeasureSpec, touchSlop, 631063962, false, (String) objArr9[0], null);
                    }
                    set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).get(null));
                    throw null;
                }
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1056710067);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                    char cLastIndexOf = (char) (16948 - TextUtils.lastIndexOf("", '0'));
                    int deadChar = KeyEvent.getDeadChar(0, 0) + 2739;
                    int touchSlop2 = (ViewConfiguration.getTouchSlop() >> 8) + 13;
                    byte b4 = $$a[7];
                    byte b5 = (byte) (b4 | 37);
                    Object[] objArr10 = new Object[1];
                    c(b4, b5, b5, objArr10);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cLastIndexOf, deadChar, touchSlop2, 631063962, false, (String) objArr10[0], null);
                }
                if (!set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).get(null))) {
                    if (Build.VERSION.SDK_INT > 33) {
                        int i70 = -(-(ViewConfiguration.getKeyRepeatTimeout() >> 16));
                        Object[] objArr11 = new Object[1];
                        a(new char[]{34999, 14383, 36455, 60114}, new char[]{27504, 62478, 48841, 59434}, (char) ((i70 ^ 10942) + ((i70 & 10942) << 1)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), new char[]{23965, 52182, 13332, 16866, 57717, 61052, 45444, 59905, 1230, 5571, 7632, 223, 52473, 31998, 35125, 5600, 1494, 50811, 7342, 13477, 40727, 7102, 48721, 47553, 21903, 2519, 17347, 17732}, objArr11);
                        Object[] objArr12 = {(String) objArr11[0]};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            char cIndexOf = (char) TextUtils.indexOf("", "");
                            int i71 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 993;
                            int defaultSize2 = View.getDefaultSize(0, 0) + 8;
                            byte[] bArr = $$a;
                            byte b6 = bArr[132];
                            byte b7 = bArr[7];
                            Object[] objArr13 = new Object[1];
                            c(b6, b7, b7, objArr13);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, i71, defaultSize2, 410748506, false, (String) objArr13[0], new Class[]{String.class});
                        }
                        long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr12)).longValue();
                        long j = 1434659399;
                        long j2 = -318;
                        long j3 = -1;
                        long j4 = j ^ j3;
                        long j5 = jLongValue ^ j3;
                        long jFreeMemory = (int) Runtime.getRuntime().freeMemory();
                        long j6 = (((long) (-317)) * j) + (((long) 319) * jLongValue) + (((((j4 | j5) | jFreeMemory) ^ j3) | ((((jFreeMemory ^ j3) | j) | jLongValue) ^ j3)) * j2) + (j2 * (((j5 | j) ^ j3) | ((j | jFreeMemory) ^ j3))) + (((long) TypedValues.AttributesType.TYPE_PIVOT_TARGET) * (j5 | ((jFreeMemory | j4) ^ j3))) + ((long) (-1635577636));
                        int i72 = (int) (j6 >> 32);
                        int i73 = ~((~((int) Process.getStartElapsedRealtime())) | (-1294855557));
                        int i74 = i72 & (((268570704 | i73) * (-970)) + 357821916 + ((i73 | (-1563426261)) * 970));
                        int i75 = ~i;
                        int i76 = ((int) j6) & ((-1871736089) + (((~(558775340 | i75)) | (~(878451069 | i))) * 1900) + (((~(i75 | (-878451070))) | (~((-558775341) | i))) * (-950)) + (((~(i75 | (-558775341))) | (~((-878451070) | i))) * 950));
                        i6 = (i74 & i76) | (i74 ^ i76);
                        int i77 = asInterface;
                        int i78 = (i77 & 69) + (i77 | 69);
                        d = i78 % 128;
                        int i79 = i78 % 2;
                    } else {
                        char[] cArr3 = {34999, 14383, 36455, 60114};
                        char[] cArr4 = {5767, 17811, 12398, 43066};
                        char scrollBarFadeDuration = (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 14896);
                        int i80 = asInterface + 31;
                        d = i80 % 128;
                        int i81 = i80 % 2;
                        int i82 = -TextUtils.lastIndexOf("", '0', 0);
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        int i83 = d;
                        int i84 = i83 + 103;
                        asInterface = i84 % 128;
                        int i85 = i84 % 2;
                        i7 = (i82 * (-51)) - 731417767;
                        int i86 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        int i87 = i86 | i82;
                        i8 = ~((i87 & 1850053397) | (i87 ^ 1850053397));
                        i9 = ((i83 | 77) << 1) - (i83 ^ 77);
                        asInterface = i9 % 128;
                        if (i9 % 2 == 0) {
                            i10 = i7 << (51 - (~i8));
                        } else {
                            i10 = i7 + (i8 * 52);
                        }
                        int i88 = (~(((-1850053398) & i82) | ((-1850053398) ^ i82))) | (~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | (-1850053398)));
                        int i89 = ~((i86 & i82) | (i86 ^ i82));
                        int i90 = (i10 - (~((-52) * ((i88 & i89) | (i88 ^ i89))))) - 1;
                        int i91 = (i83 & 37) + (i83 | 37);
                        asInterface = i91 % 128;
                        int i92 = i91 % 2;
                        int i93 = ~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | (i82 ^ (-1)));
                        int i94 = ~((~i82) | 1850053397);
                        int i95 = -(-(52 * ((i94 & i93) | (i93 ^ i94))));
                        int i96 = ((i95 & i90) << 1) + (i90 ^ i95);
                        char[] cArr5 = {29847};
                        int i97 = ((i83 | 21) << 1) - (i83 ^ 21);
                        asInterface = i97 % 128;
                        int i98 = i97 % 2;
                        Object[] objArr14 = new Object[1];
                        a(cArr3, cArr4, scrollBarFadeDuration, i96, cArr5, objArr14);
                        str = (String) objArr14[0];
                        cArr = new char[]{34999, 14383, 36455, 60114};
                        cArr2 = new char[]{58221, 47535, 64091, 50283};
                        c = (char) (27643 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                        i11 = d + 107;
                        asInterface = i11 % 128;
                        if (i11 % 2 == 0) {
                            Object[] objArr15 = new Object[1];
                            a(cArr, cArr2, c, 1538895843 >> (ViewConfiguration.getWindowTouchSlop() % 4), new char[]{56376, 29260, 54257, 58724, 33277, 62741, 20195, 28633, 28381, 48603, 39560, 61409, 14744}, objArr15);
                            objArr2 = new Object[]{(String) objArr15[0]};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                char maxKeyCode = (char) (33602 - (KeyEvent.getMaxKeyCode() >> 16));
                                int packedPositionType = 3085 - ExpandableListView.getPackedPositionType(0L);
                                int iMakeMeasureSpec2 = 26 - View.MeasureSpec.makeMeasureSpec(0, 0);
                                byte[] bArr2 = $$a;
                                byte b8 = bArr2[132];
                                byte b9 = bArr2[7];
                                Object[] objArr16 = new Object[1];
                                c(b8, b9, b9, objArr16);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(maxKeyCode, packedPositionType, iMakeMeasureSpec2, 1411172903, false, (String) objArr16[0], new Class[]{String.class});
                            }
                            if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr2))) {
                                i6 = 1;
                            } else {
                                i6 = 0;
                            }
                        } else {
                            int i99 = -(-(ViewConfiguration.getWindowTouchSlop() >> 8));
                            Object[] objArr17 = new Object[1];
                            a(cArr, cArr2, c, (i99 & 1538895843) + (i99 | 1538895843), new char[]{56376, 29260, 54257, 58724, 33277, 62741, 20195, 28633, 28381, 48603, 39560, 61409, 14744}, objArr17);
                            objArr = new Object[]{(String) objArr17[0]};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                char cKeyCodeFromString = (char) (33602 - KeyEvent.keyCodeFromString(""));
                                int i100 = 3085 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                int i101 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 25;
                                byte[] bArr3 = $$a;
                                byte b10 = bArr3[132];
                                byte b11 = bArr3[7];
                                Object[] objArr18 = new Object[1];
                                c(b10, b11, b11, objArr18);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cKeyCodeFromString, i100, i101, 1411172903, false, (String) objArr18[0], new Class[]{String.class});
                            }
                            if (!str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr))) {
                                i6 = 0;
                            } else {
                                i6 = 1;
                            }
                        }
                    }
                    int i102 = (i & (-11)) | ((~i) & 10);
                    int i103 = -i6;
                    int i104 = ((i6 & i103) | (i6 ^ i103)) >> 31;
                    int i105 = d + 57;
                    asInterface = i105 % 128;
                    int i106 = i105 % 2;
                    int i107 = (~i104) & i;
                    int i108 = i104 & i102;
                    int i109 = (i108 & i107) | (i107 ^ i108);
                    CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    int i110 = i2 & 32;
                    int i111 = d;
                    int i112 = (i111 & 11) + (i111 | 11);
                    int i113 = i112 % 128;
                    asInterface = i113;
                    int i114 = i112 % 2;
                    int i115 = -i110;
                    int i116 = ((i110 & i115) | (i110 ^ i115)) >> 31;
                    int i117 = i109 & (~i116);
                    int i118 = i116 & i;
                    i5 = (i117 & i118) | (i117 ^ i118);
                    int i119 = (i113 ^ 103) + ((i113 & 103) << 1);
                    d = i119 % 128;
                    int i120 = i119 % 2;
                } else if (Build.VERSION.SDK_INT == 30) {
                    int i121 = d;
                    int i122 = (i121 & 71) + (i121 | 71);
                    asInterface = i122 % 128;
                    int i123 = i122 % 2;
                    i5 = i;
                } else {
                    try {
                        if (Build.VERSION.SDK_INT > 33) {
                            int i710 = -(-(ViewConfiguration.getKeyRepeatTimeout() >> 16));
                            Object[] objArr19 = new Object[1];
                            a(new char[]{34999, 14383, 36455, 60114}, new char[]{27504, 62478, 48841, 59434}, (char) ((i710 ^ 10942) + ((i710 & 10942) << 1)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), new char[]{23965, 52182, 13332, 16866, 57717, 61052, 45444, 59905, 1230, 5571, 7632, 223, 52473, 31998, 35125, 5600, 1494, 50811, 7342, 13477, 40727, 7102, 48721, 47553, 21903, 2519, 17347, 17732}, objArr19);
                            try {
                                Object[] objArr110 = {(String) objArr19[0]};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                    char cIndexOf2 = (char) TextUtils.indexOf("", "");
                                    int i711 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 993;
                                    int defaultSize3 = View.getDefaultSize(0, 0) + 8;
                                    byte[] bArr4 = $$a;
                                    byte b12 = bArr4[132];
                                    byte b13 = bArr4[7];
                                    Object[] objArr111 = new Object[1];
                                    c(b12, b13, b13, objArr111);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf2, i711, defaultSize3, 410748506, false, (String) objArr111[0], new Class[]{String.class});
                                }
                                long jLongValue2 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr110)).longValue();
                                long j7 = 1434659399;
                                long j8 = -318;
                                long j9 = -1;
                                long j10 = j7 ^ j9;
                                long j11 = jLongValue2 ^ j9;
                                long jFreeMemory2 = (int) Runtime.getRuntime().freeMemory();
                                long j12 = (((long) (-317)) * j7) + (((long) 319) * jLongValue2) + (((((j10 | j11) | jFreeMemory2) ^ j9) | ((((jFreeMemory2 ^ j9) | j7) | jLongValue2) ^ j9)) * j8) + (j8 * (((j11 | j7) ^ j9) | ((j7 | jFreeMemory2) ^ j9))) + (((long) TypedValues.AttributesType.TYPE_PIVOT_TARGET) * (j11 | ((jFreeMemory2 | j10) ^ j9))) + ((long) (-1635577636));
                                int i712 = (int) (j12 >> 32);
                                int i713 = ~((~((int) Process.getStartElapsedRealtime())) | (-1294855557));
                                int i714 = i712 & (((268570704 | i713) * (-970)) + 357821916 + ((i713 | (-1563426261)) * 970));
                                int i715 = ~i;
                                int i716 = ((int) j12) & ((-1871736089) + (((~(558775340 | i715)) | (~(878451069 | i))) * 1900) + (((~(i715 | (-878451070))) | (~((-558775341) | i))) * (-950)) + (((~(i715 | (-558775341))) | (~((-878451070) | i))) * 950));
                                i6 = (i714 & i716) | (i714 ^ i716);
                                int i717 = asInterface;
                                int i718 = (i717 & 69) + (i717 | 69);
                                d = i718 % 128;
                                int i719 = i718 % 2;
                            } catch (Throwable th2) {
                                Throwable cause2 = th2.getCause();
                                if (cause2 != null) {
                                    throw cause2;
                                }
                                throw th2;
                            }
                        } else {
                            char[] cArr6 = {34999, 14383, 36455, 60114};
                            char[] cArr7 = {5767, 17811, 12398, 43066};
                            char scrollBarFadeDuration2 = (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 14896);
                            int i810 = asInterface + 31;
                            d = i810 % 128;
                            int i811 = i810 % 2;
                            int i812 = -TextUtils.lastIndexOf("", '0', 0);
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            int i813 = d;
                            int i814 = i813 + 103;
                            asInterface = i814 % 128;
                            int i815 = i814 % 2;
                            i7 = (i812 * (-51)) - 731417767;
                            int i816 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            int i817 = i816 | i812;
                            i8 = ~((i817 & 1850053397) | (i817 ^ 1850053397));
                            i9 = ((i813 | 77) << 1) - (i813 ^ 77);
                            asInterface = i9 % 128;
                            if (i9 % 2 == 0) {
                                i10 = i7 << (51 - (~i8));
                            } else {
                                i10 = i7 + (i8 * 52);
                            }
                            int i818 = (~(((-1850053398) & i812) | ((-1850053398) ^ i812))) | (~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (-1850053398)));
                            int i819 = ~((i816 & i812) | (i816 ^ i812));
                            int i910 = (i10 - (~((-52) * ((i818 & i819) | (i818 ^ i819))))) - 1;
                            int i911 = (i813 & 37) + (i813 | 37);
                            asInterface = i911 % 128;
                            int i912 = i911 % 2;
                            int i913 = ~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i812 ^ (-1)));
                            int i914 = ~((~i812) | 1850053397);
                            int i915 = -(-(52 * ((i914 & i913) | (i913 ^ i914))));
                            int i916 = ((i915 & i910) << 1) + (i910 ^ i915);
                            char[] cArr8 = {29847};
                            int i917 = ((i813 | 21) << 1) - (i813 ^ 21);
                            asInterface = i917 % 128;
                            int i918 = i917 % 2;
                            Object[] objArr112 = new Object[1];
                            a(cArr6, cArr7, scrollBarFadeDuration2, i916, cArr8, objArr112);
                            str = (String) objArr112[0];
                            cArr = new char[]{34999, 14383, 36455, 60114};
                            cArr2 = new char[]{58221, 47535, 64091, 50283};
                            c = (char) (27643 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                            i11 = d + 107;
                            asInterface = i11 % 128;
                            if (i11 % 2 == 0) {
                                Object[] objArr113 = new Object[1];
                                a(cArr, cArr2, c, 1538895843 >> (ViewConfiguration.getWindowTouchSlop() % 4), new char[]{56376, 29260, 54257, 58724, 33277, 62741, 20195, 28633, 28381, 48603, 39560, 61409, 14744}, objArr113);
                                try {
                                    objArr2 = new Object[]{(String) objArr113[0]};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                        char maxKeyCode2 = (char) (33602 - (KeyEvent.getMaxKeyCode() >> 16));
                                        int packedPositionType2 = 3085 - ExpandableListView.getPackedPositionType(0L);
                                        int iMakeMeasureSpec3 = 26 - View.MeasureSpec.makeMeasureSpec(0, 0);
                                        byte[] bArr5 = $$a;
                                        byte b14 = bArr5[132];
                                        byte b15 = bArr5[7];
                                        Object[] objArr114 = new Object[1];
                                        c(b14, b15, b15, objArr114);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(maxKeyCode2, packedPositionType2, iMakeMeasureSpec3, 1411172903, false, (String) objArr114[0], new Class[]{String.class});
                                    }
                                    if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr2))) {
                                        i6 = 1;
                                    } else {
                                        i6 = 0;
                                    }
                                } catch (Throwable th3) {
                                    Throwable cause3 = th3.getCause();
                                    if (cause3 != null) {
                                        throw cause3;
                                    }
                                    throw th3;
                                }
                            } else {
                                int i919 = -(-(ViewConfiguration.getWindowTouchSlop() >> 8));
                                Object[] objArr115 = new Object[1];
                                a(cArr, cArr2, c, (i919 & 1538895843) + (i919 | 1538895843), new char[]{56376, 29260, 54257, 58724, 33277, 62741, 20195, 28633, 28381, 48603, 39560, 61409, 14744}, objArr115);
                                try {
                                    objArr = new Object[]{(String) objArr115[0]};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                        char cKeyCodeFromString2 = (char) (33602 - KeyEvent.keyCodeFromString(""));
                                        int i1010 = 3085 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                        int i1011 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 25;
                                        byte[] bArr6 = $$a;
                                        byte b16 = bArr6[132];
                                        byte b17 = bArr6[7];
                                        Object[] objArr116 = new Object[1];
                                        c(b16, b17, b17, objArr116);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cKeyCodeFromString2, i1010, i1011, 1411172903, false, (String) objArr116[0], new Class[]{String.class});
                                    }
                                    if (!str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr))) {
                                        i6 = 0;
                                    } else {
                                        i6 = 1;
                                    }
                                } catch (Throwable th4) {
                                    Throwable cause4 = th4.getCause();
                                    if (cause4 != null) {
                                        throw cause4;
                                    }
                                    throw th4;
                                }
                            }
                        }
                    } catch (Exception unused) {
                    }
                    int i1012 = (i & (-11)) | ((~i) & 10);
                    int i1013 = -i6;
                    int i1014 = ((i6 & i1013) | (i6 ^ i1013)) >> 31;
                    int i1015 = d + 57;
                    asInterface = i1015 % 128;
                    int i1016 = i1015 % 2;
                    int i1017 = (~i1014) & i;
                    int i1018 = i1014 & i1012;
                    int i1019 = (i1018 & i1017) | (i1017 ^ i1018);
                    CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    int i1110 = i2 & 32;
                    int i1111 = d;
                    int i1112 = (i1111 & 11) + (i1111 | 11);
                    int i1113 = i1112 % 128;
                    asInterface = i1113;
                    int i1114 = i1112 % 2;
                    int i1115 = -i1110;
                    int i1116 = ((i1110 & i1115) | (i1110 ^ i1115)) >> 31;
                    int i1117 = i1019 & (~i1116);
                    int i1118 = i1116 & i;
                    i5 = (i1117 & i1118) | (i1117 ^ i1118);
                    int i1119 = (i1113 ^ 103) + ((i1113 & 103) << 1);
                    d = i1119 % 128;
                    int i124 = i1119 % 2;
                }
            } else if (Build.VERSION.SDK_INT == 30) {
                int i125 = d;
                int i126 = (i125 & 71) + (i125 | 71);
                asInterface = i126 % 128;
                int i127 = i126 % 2;
                i5 = i;
            } else {
                if (Build.VERSION.SDK_INT > 33) {
                    int i7110 = -(-(ViewConfiguration.getKeyRepeatTimeout() >> 16));
                    Object[] objArr117 = new Object[1];
                    a(new char[]{34999, 14383, 36455, 60114}, new char[]{27504, 62478, 48841, 59434}, (char) ((i7110 ^ 10942) + ((i7110 & 10942) << 1)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), new char[]{23965, 52182, 13332, 16866, 57717, 61052, 45444, 59905, 1230, 5571, 7632, 223, 52473, 31998, 35125, 5600, 1494, 50811, 7342, 13477, 40727, 7102, 48721, 47553, 21903, 2519, 17347, 17732}, objArr117);
                    Object[] objArr118 = {(String) objArr117[0]};
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cIndexOf3 = (char) TextUtils.indexOf("", "");
                        int i7111 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 993;
                        int defaultSize4 = View.getDefaultSize(0, 0) + 8;
                        byte[] bArr7 = $$a;
                        byte b18 = bArr7[132];
                        byte b19 = bArr7[7];
                        Object[] objArr119 = new Object[1];
                        c(b18, b19, b19, objArr119);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf3, i7111, defaultSize4, 410748506, false, (String) objArr119[0], new Class[]{String.class});
                    }
                    long jLongValue3 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr118)).longValue();
                    long j13 = 1434659399;
                    long j14 = -318;
                    long j15 = -1;
                    long j16 = j13 ^ j15;
                    long j17 = jLongValue3 ^ j15;
                    long jFreeMemory3 = (int) Runtime.getRuntime().freeMemory();
                    long j18 = (((long) (-317)) * j13) + (((long) 319) * jLongValue3) + (((((j16 | j17) | jFreeMemory3) ^ j15) | ((((jFreeMemory3 ^ j15) | j13) | jLongValue3) ^ j15)) * j14) + (j14 * (((j17 | j13) ^ j15) | ((j13 | jFreeMemory3) ^ j15))) + (((long) TypedValues.AttributesType.TYPE_PIVOT_TARGET) * (j17 | ((jFreeMemory3 | j16) ^ j15))) + ((long) (-1635577636));
                    int i7112 = (int) (j18 >> 32);
                    int i7113 = ~((~((int) Process.getStartElapsedRealtime())) | (-1294855557));
                    int i7114 = i7112 & (((268570704 | i7113) * (-970)) + 357821916 + ((i7113 | (-1563426261)) * 970));
                    int i7115 = ~i;
                    int i7116 = ((int) j18) & ((-1871736089) + (((~(558775340 | i7115)) | (~(878451069 | i))) * 1900) + (((~(i7115 | (-878451070))) | (~((-558775341) | i))) * (-950)) + (((~(i7115 | (-558775341))) | (~((-878451070) | i))) * 950));
                    i6 = (i7114 & i7116) | (i7114 ^ i7116);
                    int i7117 = asInterface;
                    int i7118 = (i7117 & 69) + (i7117 | 69);
                    d = i7118 % 128;
                    int i7119 = i7118 % 2;
                } else {
                    char[] cArr9 = {34999, 14383, 36455, 60114};
                    char[] cArr10 = {5767, 17811, 12398, 43066};
                    char scrollBarFadeDuration3 = (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 14896);
                    int i8110 = asInterface + 31;
                    d = i8110 % 128;
                    int i8111 = i8110 % 2;
                    int i8112 = -TextUtils.lastIndexOf("", '0', 0);
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    int i8113 = d;
                    int i8114 = i8113 + 103;
                    asInterface = i8114 % 128;
                    int i8115 = i8114 % 2;
                    i7 = (i8112 * (-51)) - 731417767;
                    int i8116 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                    int i8117 = i8116 | i8112;
                    i8 = ~((i8117 & 1850053397) | (i8117 ^ 1850053397));
                    i9 = ((i8113 | 77) << 1) - (i8113 ^ 77);
                    asInterface = i9 % 128;
                    if (i9 % 2 == 0) {
                        i10 = i7 << (51 - (~i8));
                    } else {
                        i10 = i7 + (i8 * 52);
                    }
                    int i8118 = (~(((-1850053398) & i8112) | ((-1850053398) ^ i8112))) | (~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (-1850053398)));
                    int i8119 = ~((i8116 & i8112) | (i8116 ^ i8112));
                    int i9110 = (i10 - (~((-52) * ((i8118 & i8119) | (i8118 ^ i8119))))) - 1;
                    int i9111 = (i8113 & 37) + (i8113 | 37);
                    asInterface = i9111 % 128;
                    int i9112 = i9111 % 2;
                    int i9113 = ~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i8112 ^ (-1)));
                    int i9114 = ~((~i8112) | 1850053397);
                    int i9115 = -(-(52 * ((i9114 & i9113) | (i9113 ^ i9114))));
                    int i9116 = ((i9115 & i9110) << 1) + (i9110 ^ i9115);
                    char[] cArr11 = {29847};
                    int i9117 = ((i8113 | 21) << 1) - (i8113 ^ 21);
                    asInterface = i9117 % 128;
                    int i9118 = i9117 % 2;
                    Object[] objArr1110 = new Object[1];
                    a(cArr9, cArr10, scrollBarFadeDuration3, i9116, cArr11, objArr1110);
                    str = (String) objArr1110[0];
                    cArr = new char[]{34999, 14383, 36455, 60114};
                    cArr2 = new char[]{58221, 47535, 64091, 50283};
                    c = (char) (27643 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                    i11 = d + 107;
                    asInterface = i11 % 128;
                    if (i11 % 2 == 0) {
                        Object[] objArr1111 = new Object[1];
                        a(cArr, cArr2, c, 1538895843 >> (ViewConfiguration.getWindowTouchSlop() % 4), new char[]{56376, 29260, 54257, 58724, 33277, 62741, 20195, 28633, 28381, 48603, 39560, 61409, 14744}, objArr1111);
                        objArr2 = new Object[]{(String) objArr1111[0]};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            char maxKeyCode3 = (char) (33602 - (KeyEvent.getMaxKeyCode() >> 16));
                            int packedPositionType3 = 3085 - ExpandableListView.getPackedPositionType(0L);
                            int iMakeMeasureSpec4 = 26 - View.MeasureSpec.makeMeasureSpec(0, 0);
                            byte[] bArr8 = $$a;
                            byte b110 = bArr8[132];
                            byte b111 = bArr8[7];
                            Object[] objArr1112 = new Object[1];
                            c(b110, b111, b111, objArr1112);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(maxKeyCode3, packedPositionType3, iMakeMeasureSpec4, 1411172903, false, (String) objArr1112[0], new Class[]{String.class});
                        }
                        if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr2))) {
                            i6 = 1;
                        } else {
                            i6 = 0;
                        }
                    } else {
                        int i9119 = -(-(ViewConfiguration.getWindowTouchSlop() >> 8));
                        Object[] objArr1113 = new Object[1];
                        a(cArr, cArr2, c, (i9119 & 1538895843) + (i9119 | 1538895843), new char[]{56376, 29260, 54257, 58724, 33277, 62741, 20195, 28633, 28381, 48603, 39560, 61409, 14744}, objArr1113);
                        objArr = new Object[]{(String) objArr1113[0]};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char cKeyCodeFromString3 = (char) (33602 - KeyEvent.keyCodeFromString(""));
                            int i10110 = 3085 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                            int i10111 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 25;
                            byte[] bArr9 = $$a;
                            byte b112 = bArr9[132];
                            byte b113 = bArr9[7];
                            Object[] objArr1114 = new Object[1];
                            c(b112, b113, b113, objArr1114);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cKeyCodeFromString3, i10110, i10111, 1411172903, false, (String) objArr1114[0], new Class[]{String.class});
                        }
                        if (!str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr))) {
                            i6 = 0;
                        } else {
                            i6 = 1;
                        }
                    }
                }
                int i10112 = (i & (-11)) | ((~i) & 10);
                int i10113 = -i6;
                int i10114 = ((i6 & i10113) | (i6 ^ i10113)) >> 31;
                int i10115 = d + 57;
                asInterface = i10115 % 128;
                int i10116 = i10115 % 2;
                int i10117 = (~i10114) & i;
                int i10118 = i10114 & i10112;
                int i10119 = (i10118 & i10117) | (i10117 ^ i10118);
                CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                int i11110 = i2 & 32;
                int i11111 = d;
                int i11112 = (i11111 & 11) + (i11111 | 11);
                int i11113 = i11112 % 128;
                asInterface = i11113;
                int i11114 = i11112 % 2;
                int i11115 = -i11110;
                int i11116 = ((i11110 & i11115) | (i11110 ^ i11115)) >> 31;
                int i11117 = i10119 & (~i11116);
                int i11118 = i11116 & i;
                i5 = (i11117 & i11118) | (i11117 ^ i11118);
                int i11119 = (i11113 ^ 103) + ((i11113 & 103) << 1);
                d = i11119 % 128;
                int i128 = i11119 % 2;
            }
            int i129 = (~i4) & i;
            int i130 = ~i;
            int i131 = i129 | (i4 & i130);
            int i132 = -i131;
            int i133 = ((i131 & i132) | (i131 ^ i132)) >> 31;
            int i134 = (i5 & (~i133)) | (i4 & i133);
            int i135 = asInterface;
            int i136 = ((i135 | 91) << 1) - (i135 ^ 91);
            d = i136 % 128;
            int i137 = i136 % 2;
            int i138 = ((~i134) & i) | (i134 & i130);
            int i139 = -i138;
            int i140 = (((i138 & i139) | (i138 ^ i139)) >> 31) & 16;
            Object[] objArr20 = {new int[]{i}, new int[1], new int[]{i134}, null};
            int i141 = (-430115786) + (((~((-73930839) | i)) | (~(117415647 | i130))) * 497) + (((~((-83795039) | i130)) | 9864200 | (~(117415647 | i))) * 497);
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            int i142 = ~i140;
            int i143 = ~((i142 ^ i141) | (i142 & i141));
            int i144 = d;
            int i145 = (i144 ^ 97) + ((i144 & 97) << 1);
            int i146 = i145 % 128;
            asInterface = i146;
            int i147 = i145 % 2;
            int i148 = ~(i142 | iTuitionPaymentFragmentspecialinlinedviewModeldefault5);
            int i149 = (i148 & i143) | (i143 ^ i148);
            int i150 = ~((i141 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (i141 & iTuitionPaymentFragmentspecialinlinedviewModeldefault5));
            int i151 = (((i140 * 755) + (i141 * (-753))) - (~((-754) * ((i149 & i150) | (i149 ^ i150))))) - 1;
            int i152 = ~i140;
            int i153 = i152 | i141;
            int i154 = ~((i153 & iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (i153 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5));
            int i155 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
            int i156 = (i140 & i155) | (i155 ^ i140);
            int i157 = ~((i156 & i141) | (i156 ^ i141));
            int i158 = ((i157 & i154) | (i154 ^ i157)) * (-754);
            int i159 = ((i151 | i158) << 1) - (i158 ^ i151);
            int i160 = (i146 ^ 61) + ((i146 & 61) << 1);
            d = i160 % 128;
            int i161 = i160 % 2;
            int i162 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
            int i163 = 754 * ((i162 & i152) | (i152 ^ i162));
            int i164 = (i159 ^ i163) + ((i163 & i159) << 1);
            int i165 = (~i164) | (~i3);
            int i166 = ~i;
            int i167 = (i165 & i166) | (i165 ^ i166);
            int i168 = ((i146 | 115) << 1) - (i146 ^ 115);
            d = i168 % 128;
            int i169 = i168 % 2;
            int i170 = ~i167;
            int i171 = ~((i3 ^ i) | (i3 & i));
            int i172 = (i164 * (-519)) + (i3 * 521) + (520 * ((i170 & i171) | (i170 ^ i171)));
            int i173 = ~i3;
            int i174 = ~((i173 ^ i130) | (i173 & i130));
            int i175 = ~((i164 ^ i) | (i164 & i));
            int i176 = (i174 | i175) * (-1040);
            int i177 = ((i172 | i176) << 1) - (i172 ^ i176);
            int i178 = ~i164;
            int i179 = ~((i178 & i130) | (i178 ^ i130));
            int i180 = i146 + 31;
            d = i180 % 128;
            if (i180 % 2 != 0) {
                int i181 = ~((i164 & i173) | (i173 ^ i164));
                int i182 = i177 >>> (520 % (((i181 & i179) | (i179 ^ i181)) | i175));
                int i183 = (i182 ^ (-103)) + ((i182 & (-103)) << 1);
                int i184 = (i182 | i183) & (~(i182 & i183));
                int i185 = i184 % 73;
                int i186 = (i184 | i185) & (~(i184 & i185));
                int i187 = (i186 ^ (-2)) + ((i186 & (-2)) << 1);
                ((int[]) objArr20[0])[0] = ((~i186) & i187) | ((~i187) & i186);
            } else {
                int i188 = ~((i173 & i164) | (i173 ^ i164));
                int i189 = i177 + (((~(i164 | i)) | (i188 & i179) | (i179 ^ i188)) * 520);
                int i190 = i189 << 13;
                int i191 = (i190 | i189) & (~(i189 & i190));
                int i192 = i191 ^ (i191 >>> 17);
                ((int[]) objArr20[1])[0] = i192 ^ (i192 << 5);
            }
            return objArr20;
        } catch (Throwable th5) {
            Throwable cause5 = th5.getCause();
            if (cause5 != null) {
                throw cause5;
            }
            throw th5;
        }
    }

    static void b() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 5596957378720959878L;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -981105359;
        TuitionPaymentFragmentbindingInflater1 = (char) 34097;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(int r6, byte r7, byte r8) {
        /*
            byte[] r0 = com.bpjstku.data.report.model.request.PreloadDataRequest.$$c
            int r7 = r7 * 4
            int r7 = r7 + 4
            int r6 = r6 + 102
            int r8 = r8 * 4
            int r1 = 1 - r8
            byte[] r1 = new byte[r1]
            r2 = 0
            int r8 = 0 - r8
            if (r0 != 0) goto L17
            r3 = r7
            r6 = r8
            r4 = r2
            goto L2b
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2b:
            int r7 = -r7
            int r6 = r6 + r7
            int r7 = r3 + 1
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.report.model.request.PreloadDataRequest.$$e(int, byte, byte):java.lang.String");
    }
}
