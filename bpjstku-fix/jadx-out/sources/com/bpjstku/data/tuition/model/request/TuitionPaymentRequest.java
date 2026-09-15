package com.bpjstku.data.tuition.model.request;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.bpjstku.data.lib.model.BaseRequest;
import com.google.gson.annotations.SerializedName;
import defpackage.initSession;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0003\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0017\u0010\nR\u001a\u0010\u0018\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u001b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\nR\u001a\u0010\u001d\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\nR\u001a\u0010\u001f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b \u0010\n"}, d2 = {"Lcom/bpjstku/data/tuition/model/request/TuitionPaymentRequest;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "", "p0", "p1", "p2", "p3", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/tuition/model/request/TuitionPaymentRequest;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "email", "Ljava/lang/String;", "getEmail", "jmlBulan", "getJmlBulan", "kodePaket", "getKodePaket", "nik", "getNik"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class TuitionPaymentRequest extends BaseRequest {
    public static final int $stable = 0;
    private static int TuitionPaymentFragmentbindingInflater1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    @SerializedName("email")
    private final String email;

    @SerializedName("jmlBulan")
    private final String jmlBulan;

    @SerializedName("kodePaket")
    private final String kodePaket;

    @SerializedName("nik")
    private final String nik;
    private static final byte[] $$c = {21, ByteCompanionObject.MAX_VALUE, 49, -115};
    private static final int $$f = 187;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {68, 104, -93, -37, -7, -8, 5, 0, -8, Base64.padSymbol, -72, 11, -15, -7, 13, -12, 8, -5, -17, 66, -40, -21, -15, -7, 13, -12, 8, -5, -17, 37, -44, 18, -3, -3, 9, -21, -15, -7, 13, -12, 8, -5, -17, 37, -44, 77, -76, 1, -8, -10, -1, 76, -16, 10, -3, -36, -54, 1, 12, -16, 1, 10, -14, 22, -41, 8, -9, 9, 0, -18, 8, 3, 20, -24, -15, 8, -5, 0, 46, -36, 9, -14, 8, -9, -2, 27, -20, -27, 9, 5, -12, -9, 43, -47, 14, -9, -9, 5, -12, -9, -2, 0, 8, -1, -9, 5, -14, 0, -8, -1, 0, -8, 6, -2, -21, 10, 1, -21, 39, -37, 8, -4, -10, 5, -4, -4, 2, -23, 6, -11, 62};
    private static final int $$e = 19;
    private static final byte[] $$a = {123, -2, -101, -104, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
    private static final int $$b = 180;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int d = 1;
    private static int b = 0;

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r7, int r8, byte r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 14
            int r9 = 98 - r9
            int r8 = r8 * 52
            int r8 = 55 - r8
            byte[] r0 = com.bpjstku.data.tuition.model.request.TuitionPaymentRequest.$$a
            int r7 = r7 + 1
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r9
            r4 = r2
            r9 = r8
            goto L2d
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r7) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L25:
            int r8 = r8 + 1
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r6
        L2d:
            int r8 = -r8
            int r3 = r3 + r8
            int r8 = r3 + (-10)
            r3 = r4
            r6 = r9
            r9 = r8
            r8 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.tuition.model.request.TuitionPaymentRequest.a(int, int, byte, java.lang.Object[]):void");
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
    private static void e(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 23
            int r6 = r6 + 84
            int r8 = r8 * 23
            int r0 = 76 - r8
            byte[] r1 = com.bpjstku.data.tuition.model.request.TuitionPaymentRequest.$$d
            int r7 = r7 * 75
            int r7 = r7 + 4
            byte[] r0 = new byte[r0]
            int r8 = 75 - r8
            r2 = 0
            if (r1 != 0) goto L18
            r3 = r7
            r4 = r2
            goto L2e
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L26:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r3
            r3 = r6
            r6 = r4
            r4 = r5
        L2e:
            int r6 = -r6
            int r7 = r7 + 1
            int r3 = r3 + r6
            int r6 = r3 + (-3)
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.tuition.model.request.TuitionPaymentRequest.e(byte, int, short, java.lang.Object[]):void");
    }

    public final String getEmail() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 33;
        d = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.email;
        int i4 = i2 + 23;
        d = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getJmlBulan() {
        String str;
        int i = 2 % 2;
        int i2 = d + 125;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        if (i2 % 2 != 0) {
            str = this.jmlBulan;
            int i4 = 40 / 0;
        } else {
            str = this.jmlBulan;
        }
        int i5 = i3 + 99;
        d = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 79 / 0;
        }
        return str;
    }

    public final String getKodePaket() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 5;
        d = i3 % 128;
        int i4 = i3 % 2;
        String str = this.kodePaket;
        int i5 = i2 + 35;
        d = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getNik() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 83;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        String str = this.nik;
        int i5 = i3 + 29;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public TuitionPaymentRequest(String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.email = str;
        this.jmlBulan = str2;
        this.kodePaket = str3;
        this.nik = str4;
    }

    private static void c(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2;
        int i4 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i5 = $10 + 107;
            $11 = i5 % 128;
            if (i5 % i3 == 0) {
                int i6 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                try {
                    Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3[i << i6])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1);
                        int i7 = 2188 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                        int i8 = 40 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                        byte b2 = (byte) ($$f & 6);
                        byte b3 = (byte) (b2 - 2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, i7, i8, 841711447, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    try {
                        Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2), Integer.valueOf(c)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ImageFormat.getBitsPerPixel(0) + 33018), 3011 - (KeyEvent.getMaxKeyCode() >> 16), 25 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 321985076, false, $$g(b4, b5, b5), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i6] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                        try {
                            Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                char offsetBefore = (char) (TextUtils.getOffsetBefore("", 0) + 36505);
                                int mode = View.MeasureSpec.getMode(0) + 3376;
                                int iArgb = 17 - Color.argb(0, 0, 0, 0);
                                byte b6 = (byte) ($$f & 5);
                                byte b7 = (byte) (b6 - 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(offsetBefore, mode, iArgb, -968507904, false, $$g(b6, b7, b7), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
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
            } else {
                int i9 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                try {
                    Object[] objArr5 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3[i + i9])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char c2 = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1);
                        int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 2187;
                        int i10 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 39;
                        byte b8 = (byte) ($$f & 6);
                        byte b9 = (byte) (b8 - 2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, tapTimeout, i10, 841711447, false, $$g(b8, b9, b9), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr6 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).longValue()), Long.valueOf(i9), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        byte b10 = (byte) 0;
                        byte b11 = b10;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (33017 - View.MeasureSpec.getMode(0)), 3011 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 25 - Process.getGidForName(""), 321985076, false, $$g(b10, b11, b11), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i9] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).longValue();
                    Object[] objArr7 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cCombineMeasuredStates = (char) (View.combineMeasuredStates(0, 0) + 36505);
                        int i11 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 3375;
                        int iAlpha = 17 - Color.alpha(0);
                        byte b12 = (byte) ($$f & 5);
                        byte b13 = (byte) (b12 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cCombineMeasuredStates, i11, iAlpha, -968507904, false, $$g(b12, b13, b13), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7);
                } catch (Throwable th4) {
                    Throwable cause4 = th4.getCause();
                    if (cause4 == null) {
                        throw th4;
                    }
                    throw cause4;
                }
            }
            i3 = 2;
        }
        char[] cArr = new char[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
            Object[] objArr8 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                char minimumFlingVelocity = (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 36505);
                int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 3376;
                int i12 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 16;
                byte b14 = (byte) ($$f & 5);
                byte b15 = (byte) (b14 - 1);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(minimumFlingVelocity, packedPositionType, i12, -968507904, false, $$g(b14, b15, b15), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr8);
            int i13 = $10 + 113;
            $11 = i13 % 128;
            if (i13 % 2 == 0) {
                int i14 = 5 % 3;
            }
        }
        objArr[0] = new String(cArr);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0236  */
    /* JADX WARN: Code duplicated, block: B:26:0x0240  */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    public final boolean equals(Object p0) throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        int i = 2 % 2;
        int i2 = d + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char mirror = (char) (AndroidCharacter.getMirror('0') + 31485);
            int tapTimeout = 921 - (ViewConfiguration.getTapTimeout() >> 16);
            int i4 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 28;
            byte[] bArr = $$a;
            byte b2 = bArr[80];
            Object[] objArr3 = new Object[1];
            a(b2, bArr[7], b2, objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(mirror, tapTimeout, i4, -1048449946, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        c((-1) - TextUtils.lastIndexOf("", '0'), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 22, (char) (ViewConfiguration.getEdgeSlop() >> 16), objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        c(21 - TextUtils.lastIndexOf("", '0'), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 14, (char) (ViewConfiguration.getLongPressTimeout() >> 16), objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cMakeMeasureSpec = (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 31533);
            int iRed = 921 - Color.red(0);
            int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 29;
            byte b3 = (byte) ($$b & 127);
            byte b4 = $$a[7];
            Object[] objArr6 = new Object[1];
            a(b3, b4, b4, objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cMakeMeasureSpec, iRed, bitsPerPixel, -778300370, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c = (char) (31534 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 921;
                int i5 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 27;
                byte[] bArr2 = $$a;
                Object[] objArr7 = new Object[1];
                a((byte) (bArr2[17] + 1), bArr2[80], bArr2[7], objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, fadingEdgeLength, i5, -1142834547, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr8[1])[0]}, (Object[]) objArr8[2], new int[]{((int[]) objArr8[3])[0]}, (String[]) objArr8[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i6 = ~iIdentityHashCode;
            int i7 = (((589698187 + (((~(i6 | 783943203)) | ((~((-990136441) | i6)) | 285493336)) * 464)) + (((-704643105) | iIdentityHashCode) * (-464))) + (((~(iIdentityHashCode | 783943203)) | 285493336) * 464)) - 201125526;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[0])[0] = i9 ^ (i9 << 5);
        } else {
            Object[] objArr9 = new Object[1];
            c(37 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 25, (char) (View.resolveSizeAndState(0, 0, 0) + 42202), objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            c(63 - (ViewConfiguration.getTapTimeout() >> 16), 17 - ExpandableListView.getPackedPositionChild(0L), (char) View.MeasureSpec.makeMeasureSpec(0, 0), objArr10);
            Context applicationContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i10 = d + 27;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i10 % 128;
                if (i10 % 2 != 0) {
                    int i11 = 29 / 0;
                    if (applicationContext instanceof ContextWrapper) {
                        if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                            applicationContext = null;
                        }
                    }
                } else if (applicationContext instanceof ContextWrapper) {
                    if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = null;
                    }
                }
                applicationContext = applicationContext.getApplicationContext();
            }
            Object[] objArr11 = new Object[1];
            c((ViewConfiguration.getTouchSlop() >> 8) + 81, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 15, (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), objArr11);
            Class<?> cls3 = Class.forName((String) objArr11[0]);
            Object[] objArr12 = new Object[1];
            c(96 - TextUtils.lastIndexOf("", '0'), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 15, (char) (TextUtils.getCapsMode("", 0, 0) + 47473), objArr12);
            try {
                Object[] objArr13 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr12[0], Object.class).invoke(null, this)).intValue()), 0, -201125526};
                byte[] bArr3 = $$d;
                byte b5 = bArr3[47];
                byte b6 = bArr3[7];
                Object[] objArr14 = new Object[1];
                e(b5, b6, b6, objArr14);
                Class<?> cls4 = Class.forName((String) objArr14[0]);
                byte b7 = bArr3[7];
                byte b8 = bArr3[47];
                Object[] objArr15 = new Object[1];
                e(b7, b8, b8, objArr15);
                objArr = (Object[]) cls4.getMethod((String) objArr15[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr13);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c2 = (char) (31534 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                    int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 921;
                    int bitsPerPixel2 = 27 - ImageFormat.getBitsPerPixel(0);
                    byte[] bArr4 = $$a;
                    Object[] objArr16 = new Object[1];
                    a((byte) (bArr4[17] + 1), bArr4[80], bArr4[7], objArr16);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, scrollBarFadeDuration, bitsPerPixel2, -1142834547, false, (String) objArr16[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr17 = new Object[1];
                    c(View.getDefaultSize(0, 0), TextUtils.lastIndexOf("", '0', 0, 0) + 23, (char) Color.alpha(0), objArr17);
                    Class<?> cls5 = Class.forName((String) objArr17[0]);
                    Object[] objArr18 = new Object[1];
                    c(23 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 15 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) TextUtils.getTrimmedLength(""), objArr18);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cResolveOpacity = (char) (Drawable.resolveOpacity(0, 0) + 31533);
                        int i12 = 922 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                        int offsetBefore = 28 - TextUtils.getOffsetBefore("", 0);
                        byte b9 = (byte) ($$b & 127);
                        byte b10 = $$a[7];
                        Object[] objArr19 = new Object[1];
                        a(b9, b10, b10, objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cResolveOpacity, i12, offsetBefore, -778300370, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char scrollBarSize = (char) (31533 - (ViewConfiguration.getScrollBarSize() >> 8));
                        int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 921;
                        int iIndexOf = 27 - TextUtils.indexOf((CharSequence) "", '0', 0);
                        byte[] bArr5 = $$a;
                        byte b11 = bArr5[80];
                        Object[] objArr20 = new Object[1];
                        a(b11, bArr5[7], b11, objArr20);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(scrollBarSize, edgeSlop, iIndexOf, -1048449946, false, (String) objArr20[0], null);
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
        int i13 = ((int[]) objArr[1])[0];
        int i14 = ((int[]) objArr[3])[0];
        if (i14 == i13) {
            int i15 = ((int[]) objArr[0])[0];
            objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i16 = ~startUptimeMillis;
            int i17 = i15 + 1412496018 + (((~((-538602756) | i16)) | 1235476888) * (-602)) + (((~(startUptimeMillis | (-538602756))) | 155904 | (~(1773923739 | i16))) * (-301)) + ((~(i16 | 1235476888)) * 301);
            int i18 = (i17 << 13) ^ i17;
            int i19 = i18 ^ (i18 >>> 17);
            ((int[]) objArr2[0])[0] = i19 ^ (i19 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                int i20 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 11;
                d = i20 % 128;
                int i21 = i20 % 2;
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            int[] iArr = new int[i14];
            int i22 = i14 - 1;
            iArr[i22] = 1;
            Toast.makeText((Context) null, iArr[((i14 * i22) % 2) - 1], 1).show();
            int i23 = ((int[]) objArr[0])[0];
            Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i24 = ~iFreeMemory;
            int i25 = i23 + (-1564176935) + (((~((-708870349) | i24)) | (~((-2950404) | iFreeMemory)) | (~((-353388545) | iFreeMemory))) * 765) + (((~((-711820752) | i24)) | 708870348) * 1530) + (((~(iFreeMemory | (-711820752))) | (~(i24 | (-353388545)))) * 765);
            int i26 = (i25 << 13) ^ i25;
            int i27 = i26 ^ (i26 >>> 17);
            ((int[]) objArr21[0])[0] = i27 ^ (i27 << 5);
            objArr2 = objArr21;
        }
        if (this == p0) {
            int i28 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 69;
            d = i28 % 128;
            int i29 = i28 % 2;
            return true;
        }
        if (!(p0 instanceof TuitionPaymentRequest)) {
            return false;
        }
        TuitionPaymentRequest tuitionPaymentRequest = (TuitionPaymentRequest) p0;
        if (!Intrinsics.areEqual(this.email, tuitionPaymentRequest.email)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.jmlBulan, tuitionPaymentRequest.jmlBulan)) {
            int i30 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 115;
            d = i30 % 128;
            int i31 = i30 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.kodePaket, tuitionPaymentRequest.kodePaket)) {
            int i32 = d + 23;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i32 % 128;
            int i33 = i32 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.nik, tuitionPaymentRequest.nik)) {
            return true;
        }
        int i34 = d + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i34 % 128;
        int i35 = i34 % 2;
        int i36 = ((int[]) objArr2[0])[0];
        int i37 = i36 * i36;
        int i38 = -(233751609 * i36);
        int i39 = (i37 ^ i38) + ((i37 & i38) << 1);
        int i40 = -(i36 * 1167962087);
        int i41 = (i39 & i40) + (i40 | i39);
        int i42 = (i41 & (-34914048)) + ((-34914048) | i41);
        int i43 = i42 >> 23;
        int i44 = ((i43 ^ (-1023)) + ((i43 & (-1023)) << 1)) / 512;
        int i45 = (i44 ^ 1) + ((i44 & 1) << 1);
        int i46 = (i42 ^ i45) + ((i45 & i42) << 1);
        int i47 = i42 >> 20;
        int i48 = ((i47 & (-8191)) + (i47 | (-8191))) / 4096;
        int i49 = -((((i48 | 1) << 1) - (i48 ^ 1)) ^ i46);
        int i50 = (i49 & 5) + (i49 | 5);
        int i51 = ((i50 >> 19) - 16383) / 8192;
        int i52 = ((i51 | 1) << 1) - (i51 ^ 1);
        return 0 / (((-((i52 & 1) + (i52 | 1))) & i50) * 379);
    }

    static {
        TuitionPaymentFragmentbindingInflater1 = 1;
        TuitionPaymentFragmentbindingInflater1();
        int i = b + 73;
        TuitionPaymentFragmentbindingInflater1 = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ TuitionPaymentRequest copy$default(TuitionPaymentRequest tuitionPaymentRequest, String str, String str2, String str3, String str4, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 39;
        int i4 = i3 % 128;
        d = i4;
        if (i3 % 2 != 0 ? (i & 1) != 0 : (i & 1) != 0) {
            str = tuitionPaymentRequest.email;
        }
        if ((i & 2) != 0) {
            str2 = tuitionPaymentRequest.jmlBulan;
            int i5 = i4 + 99;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
            int i6 = i5 % 2;
        }
        if ((i & 4) != 0) {
            str3 = tuitionPaymentRequest.kodePaket;
        }
        if ((i & 8) != 0) {
            str4 = tuitionPaymentRequest.nik;
        }
        return tuitionPaymentRequest.copy(str, str2, str3, str4);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 15;
        int i3 = i2 % 128;
        d = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.email;
        int i4 = i3 + 65;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component2() {
        String str;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 89;
        int i3 = i2 % 128;
        d = i3;
        if (i2 % 2 == 0) {
            str = this.jmlBulan;
            int i4 = 35 / 0;
        } else {
            str = this.jmlBulan;
        }
        int i5 = i3 + 107;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = d + 125;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.kodePaket;
        int i4 = i3 + 97;
        d = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component4() {
        String str;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 91;
        int i3 = i2 % 128;
        d = i3;
        if (i2 % 2 == 0) {
            str = this.nik;
            int i4 = 37 / 0;
        } else {
            str = this.nik;
        }
        int i5 = i3 + 23;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final TuitionPaymentRequest copy(String p0, String p1, String p2, String p3) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Intrinsics.checkNotNullParameter(p3, "");
        TuitionPaymentRequest tuitionPaymentRequest = new TuitionPaymentRequest(p0, p1, p2, p3);
        int i2 = d + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 == 0) {
            return tuitionPaymentRequest;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 111;
        d = i2 % 128;
        int iHashCode = (i2 % 2 == 0 ? ((((this.email.hashCode() / 11) << this.jmlBulan.hashCode()) << 90) >>> this.kodePaket.hashCode()) / 57 : ((((this.email.hashCode() * 31) + this.jmlBulan.hashCode()) * 31) + this.kodePaket.hashCode()) * 31) + this.nik.hashCode();
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 87;
        d = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = this.email;
        String str2 = this.jmlBulan;
        String str3 = this.kodePaket;
        String str4 = this.nik;
        StringBuilder sb = new StringBuilder("TuitionPaymentRequest(email=");
        sb.append(str);
        sb.append(", jmlBulan=");
        sb.append(str2);
        sb.append(", kodePaket=");
        sb.append(str3);
        sb.append(", nik=");
        sb.append(str4);
        sb.append(")");
        String string = sb.toString();
        int i2 = d + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    static void TuitionPaymentFragmentbindingInflater1() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new char[]{45565, 30573, 15558, 57907, 43919, 20718, 5698, 57323, 34059, 19064, 29572, 14618, 65169, 43004, 27994, 4776, 55297, 33104, 18142, 3134, 13715, 64252, 45561, 30575, 15555, 57905, 43923, 20706, 5698, 57239, 34049, 19050, 29638, 14653, 65153, 42978, 27979, 5415, 54199, 38940, 18153, 3925, 62516, 45720, 31537, 8671, 61089, 55040, 40381, 23155, 822, 51584, 46718, 31936, 9632, 57884, 43250, 37246, 24101, 1182, 52586, 35791, 28837, 45567, 30582, 15568, 57907, 43909, 20713, 5714, 57220, 34068, 19067, 29638, 14624, 65163, 42990, 27994, 4772, 55299, 33149, 45558, 30562, 15572, 57888, 43982, 20715, 5703, 57259, 34051, 18981, 29689, 14640, 65179, 43003, 27979, 4768, 2180, 52758, 34230, 23390, 4837, 59807, 44835, 26317, 15453, 62235, 51880, 32848, 18394, 7825, 54331, 43993};
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -8009082661119822077L;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r6, short r7, int r8) {
        /*
            byte[] r0 = com.bpjstku.data.tuition.model.request.TuitionPaymentRequest.$$c
            int r6 = r6 * 3
            int r6 = 115 - r6
            int r8 = r8 * 4
            int r8 = 1 - r8
            int r7 = r7 * 2
            int r7 = r7 + 4
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L26
        L16:
            r3 = r2
        L17:
            int r4 = r3 + 1
            byte r5 = (byte) r6
            r1[r3] = r5
            if (r4 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            r3 = r0[r7]
        L26:
            int r6 = r6 + r3
            int r7 = r7 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.tuition.model.request.TuitionPaymentRequest.$$g(short, short, int):java.lang.String");
    }
}
