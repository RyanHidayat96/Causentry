package com.bpjstku.presentation.bsu.model;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.bpjstku.data.bsu.model.response.DataAccountBalanceEmployee;
import com.bpjstku.data.bsu.model.response.DataEmployee;
import com.bpjstku.data.bsu.model.response.DataEmployeeOffice;
import defpackage.SessionConfigValidatingBuilder;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0003\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0010J\u0010\u0010\u0016\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u00182\u0006\u0010\u0004\u001a\u00020\u000e¢\u0006\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0016\u0010!\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001c\u0010%\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010#\u001a\u0004\b \u0010$R\u0018\u0010'\u001a\u0004\u0018\u00010\n8\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b%\u0010&"}, d2 = {"Lcom/bpjstku/presentation/bsu/model/CheckEligibleResult;", "Landroid/os/Parcelable;", "", "p0", "p1", "p2", "Lcom/bpjstku/data/bsu/model/response/DataEmployee;", "p3", "Lcom/bpjstku/data/bsu/model/response/DataAccountBalanceEmployee;", "p4", "Lcom/bpjstku/data/bsu/model/response/DataEmployeeOffice;", "p5", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/bpjstku/data/bsu/model/response/DataEmployee;Lcom/bpjstku/data/bsu/model/response/DataAccountBalanceEmployee;Lcom/bpjstku/data/bsu/model/response/DataEmployeeOffice;)V", "", "describeContents", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "asBinder", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "b", "TuitionPaymentFragmentbindingInflater1", "Lcom/bpjstku/data/bsu/model/response/DataEmployee;", "Lcom/bpjstku/data/bsu/model/response/DataAccountBalanceEmployee;", "()Lcom/bpjstku/data/bsu/model/response/DataAccountBalanceEmployee;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lcom/bpjstku/data/bsu/model/response/DataEmployeeOffice;", "asInterface"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class CheckEligibleResult implements Parcelable {
    public static final Parcelable.Creator<CheckEligibleResult> CREATOR;
    private static int asInterface;
    private static int[] g;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public final DataEmployee TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public final String b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public final String TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public DataEmployeeOffice asInterface;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final DataAccountBalanceEmployee TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static final byte[] $$c = {58, 66, -1, 15};
    private static final int $$f = 171;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {91, -17, 90, 37, 9, -5, -66, 54, 5, -3, -11, 2, -10, -58, 48, 10, -13, 11, -6, -9, -8, -57, 59, -6, -10, 13, -20, 14, -12, -7, 11, -72, 63, -7, -14, -1, -1, 11, -72, 56, 2, 3, -18, 10, -7, -16, 8, -65, 73, -3, -18, 8, 30, -15, 8, -14, 3, -4, -33, 14, 21, -15, -11, 6, 3, -49, 41, -20, 3, 3, -11, 6, 3, -4, -6, -14, -5, 3, -11, 8, -6, 2, -5, -6, 2, -12, -4, 15, -16, -7, 15, -45, 31, -14, -2, 4, -11, -2, -2, -8, 17, -12, 5, -70};
    private static final int $$e = 231;
    private static final byte[] $$a = {59, -124, -78, 46, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$b = 170;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f474a = 0;
    private static int cancelAll = 1;
    private static int d = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 52
            int r6 = r6 + 4
            int r8 = r8 * 52
            int r0 = r8 + 1
            int r7 = r7 + 84
            byte[] r1 = com.bpjstku.presentation.bsu.model.CheckEligibleResult.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r4 = r7
            r3 = r2
            r7 = r6
            goto L2a
        L15:
            r3 = r2
            r5 = r7
            r7 = r6
            r6 = r5
        L19:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L26:
            r4 = r1[r7]
            int r3 = r3 + 1
        L2a:
            int r6 = r6 + r4
            int r7 = r7 + 1
            int r6 = r6 + (-11)
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.bsu.model.CheckEligibleResult.c(short, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(short r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 4
            int r7 = 53 - r7
            byte[] r0 = com.bpjstku.presentation.bsu.model.CheckEligibleResult.$$d
            int r6 = r6 * 15
            int r6 = r6 + 84
            int r8 = r8 * 48
            int r8 = 52 - r8
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r7
            r5 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            r3 = r0[r8]
        L28:
            int r8 = r8 + 1
            int r6 = r6 + r3
            int r6 = r6 + 3
            r3 = r5
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.bsu.model.CheckEligibleResult.f(short, short, byte, java.lang.Object[]):void");
    }

    public CheckEligibleResult(String str, String str2, String str3, DataEmployee dataEmployee, DataAccountBalanceEmployee dataAccountBalanceEmployee, DataEmployeeOffice dataEmployeeOffice) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str;
        this.b = str2;
        this.TuitionPaymentFragmentbindingInflater1 = str3;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = dataEmployee;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = dataAccountBalanceEmployee;
        this.asInterface = dataEmployeeOffice;
    }

    private static void e(int[] iArr, int i, Object[] objArr) throws Throwable {
        char c = 2;
        int i2 = 2 % 2;
        SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = g;
        double d2 = 0.0d;
        int i3 = -1870535734;
        int i4 = 0;
        int i5 = 1;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i6 = $11 + 15;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i8])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i3);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char c2 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > d2 ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == d2 ? 0 : -1));
                        int i9 = 3292 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                        int minimumFlingVelocity = 31 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        byte b = (byte) ($$c[c] + 1);
                        byte b2 = b;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c2, i9, minimumFlingVelocity, 1948206109, false, $$g(b, b2, b2), new Class[]{Integer.TYPE});
                    }
                    iArr3[i8] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    i8++;
                    c = 2;
                    d2 = 0.0d;
                    i3 = -1870535734;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i10 = $10 + 81;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = g;
        float f = 0.0f;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i12 = $10 + 113;
            $11 = i12 % 128;
            int i13 = 2;
            int i14 = i12 % 2;
            int i15 = 0;
            while (i15 < length3) {
                int i16 = $10 + 103;
                $11 = i16 % 128;
                int i17 = i16 % i13;
                Object[] objArr3 = new Object[i5];
                objArr3[i4] = Integer.valueOf(iArr5[i15]);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char c3 = (char) (PointF.length(f, f) > f ? 1 : (PointF.length(f, f) == f ? 0 : -1));
                    int i18 = 3291 - (CdmaCellLocation.convertQuartSecToDecDegrees(i4) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i4) == 0.0d ? 0 : -1));
                    int keyRepeatTimeout = 31 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    byte b3 = (byte) ($$c[2] + 1);
                    byte b4 = b3;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c3, i18, keyRepeatTimeout, 1948206109, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE});
                }
                iArr6[i15] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                i15++;
                f = 0.0f;
                i4 = 0;
                i5 = 1;
                i13 = 2;
            }
            iArr5 = iArr6;
        }
        int i19 = i4;
        System.arraycopy(iArr5, i19, iArr4, i19, length2);
        int i20 = 2;
        sessionConfigValidatingBuilder.b = 2;
        while (sessionConfigValidatingBuilder.b < iArr.length) {
            int i21 = $10 + 23;
            $11 = i21 % 128;
            int i22 = i21 % i20;
            cArr[0] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
            cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
            cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
            cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
            int i23 = 17;
            for (int i24 = 1; i23 > i24; i24 = 1) {
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i23];
                Object[] objArr4 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char c4 = (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                    int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 2559;
                    int gidForName = Process.getGidForName("") + 30;
                    byte b5 = $$c[2];
                    byte b6 = (byte) (b5 + 1);
                    byte b7 = (byte) (-b5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c4, edgeSlop, gidForName, 683220507, false, $$g(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                i23--;
            }
            int i25 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i25;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
            int i26 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object[] objArr5 = {sessionConfigValidatingBuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 28879), 347 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 25 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), -30507727, false, "G", new Class[]{Object.class});
            }
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i26 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()];
            cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
            cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
            cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
            sessionConfigValidatingBuilder.b += 2;
            i20 = 2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:27:0x020b  */
    public final DataAccountBalanceEmployee b() {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = cancelAll + 71;
        f474a = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char defaultSize = (char) View.getDefaultSize(0, 0);
            int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 876;
            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 11;
            byte b = $$a[7];
            byte b2 = b;
            Object[] objArr2 = new Object[1];
            c(b2, (byte) (b2 | 14), b, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(defaultSize, minimumFlingVelocity, iIndexOf, 252381699, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new int[]{1607406556, -91209937, 1399007237, 1377519457, 1877031554, -122525256, -84341306, 129427281, 930067726, 1875464247, 1168409638, 370465967, -2125332259, 912863443}, View.resolveSize(0, 0) + 22, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new int[]{-821077348, -1747497805, 944039265, 272699769, 1524062780, 525151827, 309280616, -53076661, -1666675717, 1177040727}, 15 - TextUtils.indexOf("", "", 0), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char offsetAfter = (char) TextUtils.getOffsetAfter("", 0);
            int doubleTapTimeout = 876 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
            int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 10;
            byte[] bArr = $$a;
            byte b3 = bArr[7];
            Object[] objArr5 = new Object[1];
            c(b3, b3, (byte) (-bArr[5]), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(offsetAfter, doubleTapTimeout, longPressTimeout, 2009631821, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                int windowTouchSlop = 876 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                int iIndexOf2 = TextUtils.indexOf("", "", 0, 0) + 10;
                byte[] bArr2 = $$a;
                Object[] objArr6 = new Object[1];
                c((byte) (-bArr2[5]), bArr2[54], bArr2[7], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(packedPositionType, windowTouchSlop, iIndexOf2, 256017550, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i4 = ~iIdentityHashCode;
            int i5 = (((352475116 + (((~((-819745655) | i4)) | 779435425) * (-865))) + ((~(iIdentityHashCode | 819745654)) * 865)) + (((~(779435425 | i4)) | (~(i4 | 819745654))) * 865)) - 1826384070;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArr[1])[0] = i7 ^ (i7 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(new int[]{-1703264266, -21539397, -1356267500, 661102868, -1716297047, 2092314526, 911086275, -1912693499, 855917185, 805977781, 2029097190, 433513387, -994348581, 812968203, 1353700620, 115901764}, 26 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new int[]{1660518485, -2059154074, -1108560862, 892849328, -477961891, 1531919845, 652901574, -1405543075, -375611630, 176207961, 311493035, 1802585220}, Color.rgb(0, 0, 0) + 16777234, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i8 = cancelAll + 101;
                int i9 = i8 % 128;
                f474a = i9;
                if (i8 % 2 != 0) {
                    int i10 = 56 / 0;
                    if (applicationContext instanceof ContextWrapper) {
                        int i11 = i9 + 77;
                        cancelAll = i11 % 128;
                        int i12 = i11 % 2;
                        if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                            applicationContext = null;
                        }
                    }
                } else if (applicationContext instanceof ContextWrapper) {
                    int i13 = i9 + 77;
                    cancelAll = i13 % 128;
                    int i14 = i13 % 2;
                    if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = null;
                    }
                }
                applicationContext = applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            e(new int[]{-1323670109, -1530987, -1383231756, 574145595, 218017898, 1317395187, 995082603, -19323102, -1050690327, 1342325264}, ImageFormat.getBitsPerPixel(0) + 17, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            e(new int[]{1093156059, 1917982614, -1038019659, -628759360, 1348976500, 1119627892, -466660421, 1465844173, -1073330304, -1022493287}, (ViewConfiguration.getEdgeSlop() >> 16) + 16, objArr11);
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), -1826384070};
                byte[] bArr3 = $$d;
                byte b4 = (byte) (-bArr3[35]);
                byte b5 = b4;
                Object[] objArr13 = new Object[1];
                f(b4, b5, b5, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b6 = (byte) (bArr3[35] + 1);
                byte b7 = b6;
                Object[] objArr14 = new Object[1];
                f(b6, b7, b7, objArr14);
                objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (applicationContext != null) {
                    int i15 = cancelAll + 61;
                    f474a = i15 % 128;
                    int i16 = i15 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cGreen = (char) Color.green(0);
                        int i17 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 875;
                        int packedPositionType2 = ExpandableListView.getPackedPositionType(0L) + 10;
                        byte[] bArr4 = $$a;
                        Object[] objArr15 = new Object[1];
                        c((byte) (-bArr4[5]), bArr4[54], bArr4[7], objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cGreen, i17, packedPositionType2, 256017550, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr16 = new Object[1];
                        e(new int[]{1607406556, -91209937, 1399007237, 1377519457, 1877031554, -122525256, -84341306, 129427281, 930067726, 1875464247, 1168409638, 370465967, -2125332259, 912863443}, (ViewConfiguration.getEdgeSlop() >> 16) + 22, objArr16);
                        Class<?> cls5 = Class.forName((String) objArr16[0]);
                        Object[] objArr17 = new Object[1];
                        e(new int[]{-821077348, -1747497805, 944039265, 272699769, 1524062780, 525151827, 309280616, -53076661, -1666675717, 1177040727}, View.getDefaultSize(0, 0) + 15, objArr17);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char offsetBefore = (char) TextUtils.getOffsetBefore("", 0);
                            int i18 = 877 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                            int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 10;
                            byte[] bArr5 = $$a;
                            byte b8 = bArr5[7];
                            Object[] objArr18 = new Object[1];
                            c(b8, b8, (byte) (-bArr5[5]), objArr18);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(offsetBefore, i18, iResolveSizeAndState, 2009631821, false, (String) objArr18[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char c = (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                            int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 876;
                            int i19 = 10 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                            byte b9 = $$a[7];
                            byte b10 = b9;
                            Object[] objArr19 = new Object[1];
                            c(b10, (byte) (b10 | 14), b9, objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c, jumpTapTimeout, i19, 252381699, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i20 = ((int[]) objArr[2])[0];
        int i21 = ((int[]) objArr[0])[0];
        if (i21 == i20) {
            int i22 = f474a + 91;
            cancelAll = i22 % 128;
            int i23 = i22 % 2;
            int i24 = ((int[]) objArr[1])[0];
            Object[] objArr20 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iMyTid = Process.myTid();
            int i25 = ~iMyTid;
            int i26 = i24 + (-1466140148) + ((402628317 | iMyTid) * (-676)) + (((~(368483481 | i25)) | (-402628318)) * 676) + (((~(iMyTid | (-34144837))) | (~(i25 | 328173252)) | 74455065) * 676);
            int i27 = (i26 << 13) ^ i26;
            int i28 = i27 ^ (i27 >>> 17);
            ((int[]) objArr20[1])[0] = i28 ^ (i28 << 5);
        } else {
            Toast.makeText((Context) null, i21 / (((i21 - 1) * i21) % 2), 0).show();
            int i29 = ((int[]) objArr[1])[0];
            Object[] objArr21 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i30 = ~iIdentityHashCode2;
            int i31 = (-686571108) + (((~((-923721168) | i30)) | 822399364) * (-1188));
            int i32 = (~(iIdentityHashCode2 | 923721167)) | 822399364;
            int i33 = ~(964031396 | i30);
            int i34 = i29 + i31 + ((i32 | i33) * 594) + (((~(923721167 | i30)) | (-1065353200) | i33) * 594);
            int i35 = (i34 << 13) ^ i34;
            int i36 = i35 ^ (i35 >>> 17);
            ((int[]) objArr21[1])[0] = i36 ^ (i36 << 5);
        }
        DataAccountBalanceEmployee dataAccountBalanceEmployee = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i37 = cancelAll + 113;
        f474a = i37 % 128;
        int i38 = i37 % 2;
        return dataAccountBalanceEmployee;
    }

    static {
        asInterface = 0;
        TuitionPaymentFragmentbindingInflater1();
        CREATOR = new TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int i = d + 115;
        asInterface = i % 128;
        int i2 = i % 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = f474a + 1;
        int i3 = i2 % 128;
        cancelAll = i3;
        int i4 = i2 % 2 != 0 ? 0 : 1;
        int i5 = i3 + 15;
        f474a = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public final boolean equals(Object p0) {
        int i = 2 % 2;
        int i2 = f474a + 75;
        int i3 = i2 % 128;
        cancelAll = i3;
        int i4 = i2 % 2;
        if (this == p0) {
            int i5 = i3 + 65;
            f474a = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(!(p0 instanceof CheckEligibleResult))) {
            CheckEligibleResult checkEligibleResult = (CheckEligibleResult) p0;
            if (!(!Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, checkEligibleResult.TuitionPaymentFragmentspecialinlinedviewModeldefault2))) {
                if (!Intrinsics.areEqual(this.b, checkEligibleResult.b)) {
                    int i7 = f474a + 51;
                    cancelAll = i7 % 128;
                    int i8 = i7 % 2;
                    return false;
                }
                if (!Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, checkEligibleResult.TuitionPaymentFragmentbindingInflater1)) {
                    int i9 = cancelAll + 27;
                    f474a = i9 % 128;
                    int i10 = i9 % 2;
                    return false;
                }
                if (!Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, checkEligibleResult.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
                    return false;
                }
                if (!Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, checkEligibleResult.TuitionPaymentFragmentspecialinlinedviewModeldefault3)) {
                    int i11 = f474a + 57;
                    cancelAll = i11 % 128;
                    if (i11 % 2 != 0) {
                        return false;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (Intrinsics.areEqual(this.asInterface, checkEligibleResult.asInterface)) {
                    return true;
                }
                int i12 = f474a;
                int i13 = i12 + 33;
                cancelAll = i13 % 128;
                int i14 = i13 % 2;
                int i15 = i12 + 73;
                cancelAll = i15 % 128;
                int i16 = i15 % 2;
                return false;
            }
            int i17 = f474a + 65;
            cancelAll = i17 % 128;
            if (i17 % 2 == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int iHashCode4 = 1;
        int iHashCode5 = 0;
        if (str == null) {
            int i2 = f474a + 91;
            cancelAll = i2 % 128;
            iHashCode = i2 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.b;
        if (str2 == null) {
            int i3 = cancelAll + 109;
            f474a = i3 % 128;
            int i4 = i3 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
        }
        String str3 = this.TuitionPaymentFragmentbindingInflater1;
        if (str3 == null) {
            int i5 = cancelAll + 73;
            f474a = i5 % 128;
            int i6 = i5 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str3.hashCode();
        }
        DataEmployee dataEmployee = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (dataEmployee == null) {
            int i7 = cancelAll + 49;
            f474a = i7 % 128;
            if (i7 % 2 == 0) {
                iHashCode4 = 0;
            }
        } else {
            iHashCode4 = dataEmployee.hashCode();
        }
        DataAccountBalanceEmployee dataAccountBalanceEmployee = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int iHashCode6 = dataAccountBalanceEmployee == null ? 0 : dataAccountBalanceEmployee.hashCode();
        DataEmployeeOffice dataEmployeeOffice = this.asInterface;
        if (dataEmployeeOffice != null) {
            iHashCode5 = dataEmployeeOffice.hashCode();
            int i8 = f474a + 77;
            cancelAll = i8 % 128;
            int i9 = i8 % 2;
        }
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode6) * 31) + iHashCode5;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        String str2 = this.b;
        String str3 = this.TuitionPaymentFragmentbindingInflater1;
        DataEmployee dataEmployee = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        DataAccountBalanceEmployee dataAccountBalanceEmployee = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        DataEmployeeOffice dataEmployeeOffice = this.asInterface;
        StringBuilder sb = new StringBuilder("CheckEligibleResult(TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
        sb.append(str);
        sb.append(", b=");
        sb.append(str2);
        sb.append(", TuitionPaymentFragmentbindingInflater1=");
        sb.append(str3);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
        sb.append(dataEmployee);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
        sb.append(dataAccountBalanceEmployee);
        sb.append(", asInterface=");
        sb.append(dataEmployeeOffice);
        sb.append(")");
        String string = sb.toString();
        int i2 = f474a + 3;
        cancelAll = i2 % 128;
        if (i2 % 2 != 0) {
            return string;
        }
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        int i = 2 % 2;
        int i2 = f474a + 53;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        p0.writeString(this.b);
        p0.writeString(this.TuitionPaymentFragmentbindingInflater1);
        DataEmployee dataEmployee = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (dataEmployee == null) {
            p0.writeInt(0);
        } else {
            p0.writeInt(1);
            dataEmployee.writeToParcel(p0, p1);
            int i4 = cancelAll + 1;
            f474a = i4 % 128;
            int i5 = i4 % 2;
        }
        DataAccountBalanceEmployee dataAccountBalanceEmployee = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (dataAccountBalanceEmployee == null) {
            p0.writeInt(0);
        } else {
            p0.writeInt(1);
            dataAccountBalanceEmployee.writeToParcel(p0, p1);
        }
        DataEmployeeOffice dataEmployeeOffice = this.asInterface;
        if (dataEmployeeOffice == null) {
            p0.writeInt(0);
        } else {
            p0.writeInt(1);
            dataEmployeeOffice.writeToParcel(p0, p1);
        }
    }

    static void TuitionPaymentFragmentbindingInflater1() {
        g = new int[]{1506362387, 1202214342, -1663515210, 276941876, -1879988615, 1102695952, -1394578226, -1419295840, 1004756558, -1308399820, 1730666735, -1440179222, 540224602, -104693121, 1044393600, 2075486123, -905225430, 474071388};
    }

    private static String $$g(short s, int i, int i2) {
        int i3 = 4 - (i2 * 4);
        int i4 = (i * 56) + 66;
        byte[] bArr = $$c;
        int i5 = s * 2;
        byte[] bArr2 = new byte[1 - i5];
        int i6 = 0 - i5;
        int i7 = -1;
        if (bArr == null) {
            i4 += -i6;
            i3++;
        }
        while (true) {
            i7++;
            bArr2[i7] = (byte) i4;
            if (i7 == i6) {
                return new String(bArr2, 0);
            }
            i4 += -bArr[i3];
            i3++;
        }
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements Parcelable.Creator<CheckEligibleResult> {
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ CheckEligibleResult createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CheckEligibleResult(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : DataEmployee.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : DataAccountBalanceEmployee.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? DataEmployeeOffice.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CheckEligibleResult[] newArray(int i) {
            return new CheckEligibleResult[i];
        }
    }
}
