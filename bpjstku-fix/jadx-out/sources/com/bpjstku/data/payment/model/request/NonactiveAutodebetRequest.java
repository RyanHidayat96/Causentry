package com.bpjstku.data.payment.model.request;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.exifinterface.media.ExifInterface;
import com.bpjstku.data.lib.model.BaseRequest;
import com.google.gson.annotations.SerializedName;
import defpackage.getSupportedPostviewSize;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0015\u0010\tR\u001a\u0010\u0016\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0019\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u001b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\t"}, d2 = {"Lcom/bpjstku/data/payment/model/request/NonactiveAutodebetRequest;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "", "p0", "p1", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/payment/model/request/NonactiveAutodebetRequest;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "KodePlanRecurring", "Ljava/lang/String;", "getKodePlanRecurring", "email", "getEmail", "keterangan", "getKeterangan"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class NonactiveAutodebetRequest extends BaseRequest {
    public static final int $stable = 0;
    private static char[] TuitionPaymentFragmentbindingInflater1;
    private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static int b;
    private static int d;

    @SerializedName("kodePlanRecurring")
    private final String KodePlanRecurring;

    @SerializedName("email")
    private final String email;

    @SerializedName("keterangan")
    private final String keterangan;
    private static final byte[] $$c = {12, -88, 33, 118};
    private static final int $$f = 150;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {46, 126, -84, 108, 9, -5, -66, 54, 5, -3, -11, 2, -10, -58, 48, 10, -13, 11, -6, -9, -8, -57, 54, 3, 3, -72, 59, 0, -15, -5, 16, -14, 3, -4, -67, 73, -3, -5};
    private static final int $$e = 20;
    private static final byte[] $$a = {60, 80, 13, 34, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54};
    private static final int $$b = DerHeader.TAG_CLASS_PRIVATE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f395a = 0;
    private static int asBinder = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r5, byte r6, short r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = com.bpjstku.data.payment.model.request.NonactiveAutodebetRequest.$$a
            int r6 = r6 * 14
            int r6 = 98 - r6
            int r5 = r5 * 52
            int r1 = r5 + 1
            int r7 = r7 + 4
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L15
            r4 = r6
            r3 = r2
            r6 = r5
            goto L29
        L15:
            r3 = r2
        L16:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r5) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L25:
            r4 = r0[r7]
            int r3 = r3 + 1
        L29:
            int r6 = r6 + r4
            int r6 = r6 + (-11)
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.payment.model.request.NonactiveAutodebetRequest.c(byte, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(short r5, short r6, int r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 * 34
            int r0 = r5 + 1
            byte[] r1 = com.bpjstku.data.payment.model.request.NonactiveAutodebetRequest.$$d
            int r6 = 99 - r6
            int r7 = r7 * 34
            int r7 = 38 - r7
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r4 = r6
            r3 = r2
            r6 = r5
            goto L27
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r5) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L23:
            r4 = r1[r7]
            int r3 = r3 + 1
        L27:
            int r6 = r6 + r4
            int r7 = r7 + 1
            int r6 = r6 + 3
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.payment.model.request.NonactiveAutodebetRequest.f(short, short, int, java.lang.Object[]):void");
    }

    public NonactiveAutodebetRequest(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.KodePlanRecurring = str;
        this.email = str2;
        this.keterangan = str3;
    }

    private static void e(char[] cArr, int[] iArr, int i, byte[] bArr, Object[] objArr) throws Throwable {
        int length;
        char[] cArr2;
        int i2;
        int i3 = 2 % 2;
        getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
        char[] cArr3 = TuitionPaymentFragmentbindingInflater1;
        int i4 = 0;
        if (cArr3 != null) {
            int i5 = $11 + 113;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                length = cArr3.length;
                cArr2 = new char[length];
                i2 = 1;
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
                i2 = 0;
            }
            while (i2 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i4] = Integer.valueOf(cArr3[i2]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) i4;
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (31339 - (ViewConfiguration.getJumpTapTimeout() >> 16)), 2994 - TextUtils.getOffsetBefore("", i4), 17 - Color.blue(i4), 1182129903, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr2[i2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i2++;
                    i4 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i6 = $10 + 105;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            cArr3 = cArr2;
        }
        try {
            Object[] objArr3 = {Integer.valueOf(b)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 43326), 253 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), View.MeasureSpec.getMode(0) + 22, 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
            int i8 = 1687675375;
            if (TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
                char[] cArr4 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                    int i9 = $10 + 95;
                    $11 = i9 % 128;
                    int i10 = i9 % 2;
                    cArr4[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                    Object[] objArr4 = {getsupportedpostviewsize, getsupportedpostviewsize};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i8);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (33602 - Color.argb(0, 0, 0, 0)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 3086, 26 - (ViewConfiguration.getTapTimeout() >> 16), -2146875848, false, $$g(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    i8 = 1687675375;
                }
                objArr[0] = new String(cArr4);
                return;
            }
            int i11 = 0;
            if (TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
                char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                int i12 = $10 + 45;
                $11 = i12 % 128;
                int i13 = 2;
                int i14 = i12 % 2;
                while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                    int i15 = $10 + 17;
                    $11 = i15 % 128;
                    if (i15 % i13 == 0) {
                        cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 >>> 1) << getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] * iIntValue);
                        Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = b6;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 33601), View.resolveSizeAndState(0, 0, 0) + 3085, 26 - (ViewConfiguration.getEdgeSlop() >> 16), -2146875848, false, $$g(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                        i13 = 2;
                    } else {
                        cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                        Object[] objArr6 = {getsupportedpostviewsize, getsupportedpostviewsize};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char gidForName = (char) (Process.getGidForName("") + 33603);
                            int scrollDefaultDelay = 3085 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                            int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 26;
                            byte b8 = (byte) 0;
                            byte b9 = b8;
                            String str$$g = $$g(b8, b9, (byte) (b9 + 1));
                            i13 = 2;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(gidForName, scrollDefaultDelay, jumpTapTimeout, -2146875848, false, str$$g, new Class[]{Object.class, Object.class});
                        } else {
                            i13 = 2;
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
                    }
                }
                objArr[0] = new String(cArr5);
                return;
            }
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
            char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            while (true) {
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i11;
                if (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >= getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                    objArr[0] = new String(cArr6);
                    return;
                } else {
                    cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                    i11 = getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1;
                }
            }
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    public final String getKodePlanRecurring() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char edgeSlop = (char) (37567 - (ViewConfiguration.getEdgeSlop() >> 16));
            int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 626;
            int offsetAfter = TextUtils.getOffsetAfter("", 0) + 14;
            byte[] bArr = $$a;
            byte b2 = bArr[7];
            Object[] objArr2 = new Object[1];
            c(b2, b2, bArr[5], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(edgeSlop, packedPositionChild, offsetAfter, -477065106, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(null, null, 127 - Color.green(0), new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(null, null, (ViewConfiguration.getFadingEdgeLength() >> 16) + 127, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cIndexOf = (char) (TextUtils.indexOf("", "", 0) + 37567);
            int i3 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 625;
            int i4 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 13;
            byte b3 = $$a[5];
            byte b4 = (byte) (-b3);
            Object[] objArr5 = new Object[1];
            c(b4, b4, b3, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, i3, i4, -976899241, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i5 = asBinder + 65;
            f395a = i5 % 128;
            int i6 = i5 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cCombineMeasuredStates = (char) (View.combineMeasuredStates(0, 0) + 37567);
                int iCombineMeasuredStates = 625 - View.combineMeasuredStates(0, 0);
                int deadChar = KeyEvent.getDeadChar(0, 0) + 14;
                byte b5 = (byte) (-$$a[5]);
                byte b6 = b5;
                Object[] objArr6 = new Object[1];
                c(b5, b6, (byte) (b6 | 50), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cCombineMeasuredStates, iCombineMeasuredStates, deadChar, -973632554, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i7 = ((int[]) objArr7[2])[0];
            int i8 = ((int[]) objArr7[0])[0];
            String[] strArr = (String[]) objArr7[3];
            int[] iArr = {i7};
            int[] iArr2 = {i8};
            int i9 = (int) Runtime.getRuntime().totalMemory();
            int i10 = ~i9;
            int i11 = (~((-1659229041) | i10)) | 1646379616 | (~(164509080 | i10));
            int i12 = (-1054748456) + (((~(i9 | (-151659657))) | i11) * 590) + (i11 * (-1180)) + (((~((-164509081) | i10)) | (~(i10 | 1659229040))) * 590) + 187392144;
            int i13 = (i12 << 13) ^ i12;
            int i14 = i13 ^ (i13 >>> 17);
            ((int[]) objArr[1])[0] = i14 ^ (i14 << 5);
            objArr = new Object[]{iArr2, new int[1], iArr, strArr};
        } else {
            Object[] objArr8 = new Object[1];
            e(null, null, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 126, new byte[]{-125, -127, -116, -124, -105, -106, -118, -117, -122, -107, -122, -117, -112, -108, -121, -110, -110, -127, -121, -125, -122, -123, -124, -125, -126, -127}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(null, null, 127 - Color.argb(0, 0, 0, 0), new byte[]{-126, -123, -122, -117, -127, -112, -122, -113, -110, -110, -108, -117, -126, -116, -124, -124, -104, -112}, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = (!((applicationContext instanceof ContextWrapper) ^ true) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            e(null, null, 127 - (Process.myPid() >> 22), new byte[]{-115, -116, -117, -120, -118, -119, -121, -102, -126, -127, -113, -121, -127, -107, -127, -103}, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            e(null, null, TextUtils.indexOf("", "", 0) + 127, new byte[]{-116, -125, -123, -114, -105, -120, -127, -101, -118, -117, -122, -117, -126, -116, -125, -122}, objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr12 = new Object[1];
            e(null, null, 126 - TextUtils.lastIndexOf("", '0', 0), new byte[]{-98, -100, -99, -98, -98, -91, -90, -96, -98, -100, -90, -91, -127, -90, -89, -127, -95, -92, -116, -99, -90, -91, -95, -99, -127, -90, -93, -93, -96, -100, -127, -96, -96, -91, -125, -92, -93, -98, -94, -116, -98, -94, -94, -95, -116, -97, -93, -94, -95, -127, -116, -116, -95, -99, -99, -96, -97, -99, -98, -127, -127, -99, -116, -100}, objArr12);
            String str = (String) objArr12[0];
            Object[] objArr13 = new Object[1];
            e(null, null, 126 - TextUtils.lastIndexOf("", '0'), new byte[]{-99, -97, -89, -127, -91, -100, -99, -112, -100, -92, -91, -98, -96, -96, -112, -96, -92, -92, -91, -94, -97, -99, -116, -100, -100, -127, -116, -91, -93, -95, -98, -96, -90, -96, -96, -92, -96, -98, -91, -98, -97, -99, -94, -95, -92, -97, -92, -100, -91, -99, -100, -116, -98, -89, -99, -116, -94, -98, -95, -89, -97, -125, -127, -112}, objArr13);
            try {
                Object[] objArr14 = {applicationContext, new String[]{str, (String) objArr13[0]}, Integer.valueOf(iIntValue), 17, 187392144};
                byte[] bArr2 = $$d;
                byte b7 = (byte) (bArr2[11] - 1);
                byte b8 = bArr2[27];
                Object[] objArr15 = new Object[1];
                f(b7, b8, (byte) (b8 + 1), objArr15);
                Class<?> cls4 = Class.forName((String) objArr15[0]);
                byte b9 = bArr2[27];
                byte b10 = b9;
                Object[] objArr16 = new Object[1];
                f(b10, (byte) (b10 + 1), b9, objArr16);
                Object[] objArr17 = (Object[]) cls4.getMethod((String) objArr16[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr14);
                int i15 = ((int[]) objArr17[0])[0];
                int i16 = ((int[]) objArr17[2])[0];
                if (applicationContext != null) {
                    int i17 = asBinder + 117;
                    f395a = i17 % 128;
                    int i18 = i17 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cLastIndexOf = (char) (37566 - TextUtils.lastIndexOf("", '0', 0, 0));
                        int iAlpha = 625 - Color.alpha(0);
                        int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 14;
                        byte b11 = (byte) (-$$a[5]);
                        byte b12 = b11;
                        Object[] objArr18 = new Object[1];
                        c(b11, b12, (byte) (b12 | 50), objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cLastIndexOf, iAlpha, longPressTimeout, -973632554, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr17);
                    try {
                        Object[] objArr19 = new Object[1];
                        e(null, null, ImageFormat.getBitsPerPixel(0) + 128, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr19);
                        Class<?> cls5 = Class.forName((String) objArr19[0]);
                        Object[] objArr20 = new Object[1];
                        e(null, null, 127 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr20);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr20[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char size = (char) (View.MeasureSpec.getSize(0) + 37567);
                            int minimumFlingVelocity = 625 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                            int modifierMetaStateMask = 13 - ((byte) KeyEvent.getModifierMetaStateMask());
                            byte b13 = $$a[5];
                            byte b14 = (byte) (-b13);
                            Object[] objArr21 = new Object[1];
                            c(b14, b14, b13, objArr21);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(size, minimumFlingVelocity, modifierMetaStateMask, -976899241, false, (String) objArr21[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cResolveOpacity = (char) (Drawable.resolveOpacity(0, 0) + 37567);
                            int keyRepeatTimeout = 625 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                            int fadingEdgeLength = 14 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                            byte[] bArr3 = $$a;
                            byte b15 = bArr3[7];
                            Object[] objArr22 = new Object[1];
                            c(b15, b15, bArr3[5], objArr22);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cResolveOpacity, keyRepeatTimeout, fadingEdgeLength, -477065106, false, (String) objArr22[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr17;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i19 = ((int[]) objArr[0])[0];
        int i20 = ((int[]) objArr[2])[0];
        if (i20 != i19) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[3];
            if (strArr2 != null) {
                while (i2 < strArr2.length) {
                    arrayList.add(strArr2[i2]);
                    i2++;
                    int i21 = asBinder + 17;
                    f395a = i21 % 128;
                    int i22 = i21 % 2;
                }
            }
            throw new RuntimeException(String.valueOf(i20));
        }
        int i23 = ((int[]) objArr[1])[0];
        int i24 = ((int[]) objArr[2])[0];
        int i25 = ((int[]) objArr[0])[0];
        String[] strArr3 = (String[]) objArr[3];
        int[] iArr3 = {i24};
        int i26 = ~((~System.identityHashCode(this)) | 1160545653);
        int i27 = i23 + (((1076364388 | i26) * (-970)) - 2126274170) + ((i26 | 84181265) * 970);
        int i28 = (i27 << 13) ^ i27;
        int i29 = i28 ^ (i28 >>> 17);
        ((int[]) objArr[1])[0] = i29 ^ (i29 << 5);
        Object[] objArr23 = {new int[]{i25}, new int[1], iArr3, strArr3};
        return this.KodePlanRecurring;
    }

    public final String getEmail() {
        int i = 2 % 2;
        int i2 = asBinder + 69;
        f395a = i2 % 128;
        if (i2 % 2 == 0) {
            return this.email;
        }
        throw null;
    }

    public final String getKeterangan() {
        int i = 2 % 2;
        int i2 = f395a + 31;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return this.keterangan;
        }
        throw null;
    }

    static {
        d = 1;
        TuitionPaymentFragmentbindingInflater1();
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 57;
        d = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ NonactiveAutodebetRequest copy$default(NonactiveAutodebetRequest nonactiveAutodebetRequest, String str, String str2, String str3, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = f395a + 47;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            str = nonactiveAutodebetRequest.KodePlanRecurring;
        }
        if ((i & 2) != 0) {
            int i5 = f395a + 75;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            str2 = nonactiveAutodebetRequest.email;
        }
        if ((i & 4) != 0) {
            str3 = nonactiveAutodebetRequest.keterangan;
            int i7 = f395a + 109;
            asBinder = i7 % 128;
            int i8 = i7 % 2;
        }
        return nonactiveAutodebetRequest.copy(str, str2, str3);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 47;
        f395a = i3 % 128;
        int i4 = i3 % 2;
        String str = this.KodePlanRecurring;
        int i5 = i2 + 25;
        f395a = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = f395a + 15;
        int i3 = i2 % 128;
        asBinder = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.email;
        int i4 = i3 + 117;
        f395a = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 52 / 0;
        }
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = asBinder + 51;
        int i3 = i2 % 128;
        f395a = i3;
        int i4 = i2 % 2;
        String str = this.keterangan;
        int i5 = i3 + 25;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final NonactiveAutodebetRequest copy(String p0, String p1, String p2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        NonactiveAutodebetRequest nonactiveAutodebetRequest = new NonactiveAutodebetRequest(p0, p1, p2);
        int i2 = f395a + 109;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return nonactiveAutodebetRequest;
        }
        throw null;
    }

    public final boolean equals(Object p0) {
        int i = 2 % 2;
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof NonactiveAutodebetRequest)) {
            int i2 = f395a + 85;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        NonactiveAutodebetRequest nonactiveAutodebetRequest = (NonactiveAutodebetRequest) p0;
        if (!Intrinsics.areEqual(this.KodePlanRecurring, nonactiveAutodebetRequest.KodePlanRecurring)) {
            int i4 = f395a + 73;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.email, nonactiveAutodebetRequest.email)) {
            int i6 = f395a + 103;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.keterangan, nonactiveAutodebetRequest.keterangan)) {
            return true;
        }
        int i8 = f395a + 91;
        asBinder = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = f395a + 61;
        asBinder = i2 % 128;
        int iHashCode = i2 % 2 == 0 ? (((this.KodePlanRecurring.hashCode() >>> 3) / this.email.hashCode()) % 83) - this.keterangan.hashCode() : (((this.KodePlanRecurring.hashCode() * 31) + this.email.hashCode()) * 31) + this.keterangan.hashCode();
        int i3 = asBinder + 9;
        f395a = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = this.KodePlanRecurring;
        String str2 = this.email;
        String str3 = this.keterangan;
        StringBuilder sb = new StringBuilder("NonactiveAutodebetRequest(KodePlanRecurring=");
        sb.append(str);
        sb.append(", email=");
        sb.append(str2);
        sb.append(", keterangan=");
        sb.append(str3);
        sb.append(")");
        String string = sb.toString();
        int i2 = f395a + 5;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    static void TuitionPaymentFragmentbindingInflater1() {
        TuitionPaymentFragmentbindingInflater1 = new char[]{47213, 47200, 47210, 47260, 47263, 47205, 47136, 47259, 47227, 47253, 47258, 47209, 47201, 47179, 47202, 47211, 47203, 47262, 47228, 47181, 47256, 47226, 47206, 47257, 47204, 47207, 47174, 47196, 47208, 47212, 47192, 47189, 47193, 47191, 47197, 47195, 47194, 47190, 47198};
        b = 2047719438;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r7, short r8, byte r9) {
        /*
            int r7 = r7 * 3
            int r7 = 3 - r7
            int r9 = 68 - r9
            int r8 = r8 * 4
            int r8 = 1 - r8
            byte[] r0 = com.bpjstku.data.payment.model.request.NonactiveAutodebetRequest.$$c
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r9 = r7
            r3 = r8
            r4 = r2
            goto L2a
        L15:
            r3 = r2
            r6 = r9
            r9 = r7
            r7 = r6
        L19:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            int r9 = r9 + 1
            if (r4 != r8) goto L28
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L28:
            r3 = r0[r9]
        L2a:
            int r7 = r7 + r3
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.payment.model.request.NonactiveAutodebetRequest.$$g(int, short, byte):java.lang.String");
    }
}
