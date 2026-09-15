package com.bpjstku.data.office.model.response;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Toast;
import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bpjstku.data.lib.model.BaseItem;
import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.SerializedName;
import defpackage.deInitSession;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÇ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÇ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0004\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H×\u0001¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/bpjstku/data/office/model/response/BranchOfficeLocationByRegionResponse;", "Lcom/bpjstku/data/lib/model/BaseItem;", "", "Lcom/bpjstku/data/office/model/response/BranchOfficeItem;", "p0", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/bpjstku/data/office/model/response/BranchOfficeLocationByRegionResponse;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Ljava/util/List;", "getData"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class BranchOfficeLocationByRegionResponse extends BaseItem {
    public static final int $stable = 8;
    private static char TuitionPaymentFragmentbindingInflater1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    @SerializedName("kantorCabang")
    private final List<BranchOfficeItem> data;
    private static final byte[] $$c = {117, 50, 102, 124};
    private static final int $$f = 239;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {68, -119, -76, 97, 13, -1, -62, 53, 15, -5, 10, 2, -8, 11, -70, 55, -2, 20, -18, -50, 70, -15, 6, 8, -2, -10, 18, 2, -10, 2, 8, -65, 64, 3, -10, 2, 8, -61, 69, -12, 15, -2, 0, 0, 6, -13, -54, 22, 45, 0, -7, 4, 10, -4, -26, 20, 15, -2, 0, 0, 6, -13, 34, -11, 12, -10, 7, 0, -29, 18, 25, -11, -7, 10, 7, -45, 45, -16, 7, 7, -7, 10, 7, 0, -2, -10, -1, 7, -7, 12, -2, 6, -1, -2, 6, -8, 0, 19, -12, -3, 19, -41, 35, -10, 2, 8, -7, 2, 2, -4, 21, -8, 9, -64};
    private static final int $$e = 8;
    private static final byte[] $$a = {23, -73, 107, 5, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54};
    private static final int $$b = 201;
    private static int b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f393a = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 52
            int r0 = r6 + 1
            int r7 = r7 + 4
            byte[] r1 = com.bpjstku.data.office.model.response.BranchOfficeLocationByRegionResponse.$$a
            int r8 = r8 * 14
            int r8 = 98 - r8
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r3 = r6
            r8 = r7
            r4 = r2
            goto L2e
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r7 = r7 + 1
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L25:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r7 = -r7
            int r3 = r3 + r7
            int r7 = r3 + (-11)
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.office.model.response.BranchOfficeLocationByRegionResponse.c(byte, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(byte r5, short r6, int r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 * 58
            int r7 = 62 - r7
            int r6 = r6 * 15
            int r6 = 99 - r6
            byte[] r0 = com.bpjstku.data.office.model.response.BranchOfficeLocationByRegionResponse.$$d
            int r5 = r5 * 6
            int r1 = 59 - r5
            byte[] r1 = new byte[r1]
            int r5 = 58 - r5
            r2 = -1
            if (r0 != 0) goto L19
            r4 = r6
            r3 = r2
            r6 = r5
            goto L2c
        L19:
            r3 = r2
        L1a:
            int r3 = r3 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r5) goto L2a
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r1, r6)
            r8[r6] = r5
            return
        L2a:
            r4 = r0[r7]
        L2c:
            int r6 = r6 + r4
            int r6 = r6 + r2
            int r7 = r7 + 1
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.office.model.response.BranchOfficeLocationByRegionResponse.e(byte, short, int, java.lang.Object[]):void");
    }

    public final List<BranchOfficeItem> getData() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 13;
        f393a = i3 % 128;
        int i4 = i3 % 2;
        List<BranchOfficeItem> list = this.data;
        int i5 = i2 + 87;
        f393a = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        throw null;
    }

    public BranchOfficeLocationByRegionResponse(List<BranchOfficeItem> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.data = list;
    }

    private static void d(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        boolean z;
        int length;
        char[] cArr2;
        int i3 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        Object obj2 = null;
        int i4 = -1;
        if (cArr3 != null) {
            int i5 = $10 + 65;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                length = cArr3.length;
                cArr2 = new char[length];
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
            }
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i6])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b3 = (byte) i4;
                        byte b4 = (byte) (b3 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (Process.getGidForName("") + 1), 2267 - Gravity.getAbsoluteGravity(0, 0), (ViewConfiguration.getJumpTapTimeout() >> 16) + 33, -1927765101, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE});
                    }
                    cArr2[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i6++;
                    i4 = -1;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr2;
        }
        Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
        boolean z2 = false;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            byte b5 = (byte) (-1);
            byte b6 = (byte) (b5 + 1);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 2267 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 33 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), -1927765101, false, $$g(b5, b6, b6), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b2);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            int i7 = $10 + 115;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    int i9 = $11 + 97;
                    $10 = i9 % 128;
                    int i10 = i9 % 2;
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                    int i11 = $10 + 35;
                    $11 = i11 % 128;
                    int i12 = i11 % 2;
                    z = z2;
                    obj = obj2;
                } else {
                    Object[] objArr4 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b7 = (byte) (-1);
                        byte b8 = (byte) (-b7);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (49267 - View.MeasureSpec.getSize(0)), 3261 - (ViewConfiguration.getFadingEdgeLength() >> 16), 30 - KeyEvent.normalizeMetaState(0), -127612708, false, $$g(b7, b8, (byte) (b8 - 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                        int i13 = $11 + 17;
                        $10 = i13 % 128;
                        int i14 = i13 % 2;
                        Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            z = false;
                            byte b9 = (byte) (-1);
                            byte b10 = (byte) (b9 + 4);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((Process.myPid() >> 22) + 22878), 594 - (Process.myPid() >> 22), 17 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 1570859318, false, $$g(b9, b10, (byte) (b10 - 3)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        } else {
                            z = false;
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                        int i15 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[iIntValue];
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i15];
                    } else {
                        obj = null;
                        z = false;
                        if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                            deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                            deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                            int i16 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                            int i17 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[i16];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i17];
                        } else {
                            int i18 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                            int i19 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[i18];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i19];
                        }
                    }
                }
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                obj2 = obj;
                z2 = z;
            }
        }
        for (int i20 = 0; i20 < i; i20++) {
            int i21 = $10 + 75;
            $11 = i21 % 128;
            int i22 = i21 % 2;
            cArr4[i20] = (char) (cArr4[i20] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
    public final boolean equals(Object p0) throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        int i = 2 % 2;
        int i2 = b + 37;
        f393a = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 37567);
            int iRgb = Color.rgb(0, 0, 0) + 16777841;
            int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 14;
            byte[] bArr = $$a;
            byte b2 = bArr[7];
            Object[] objArr3 = new Object[1];
            c(b2, (byte) (-bArr[5]), b2, objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, iRgb, edgeSlop, -477065106, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        d(new char[]{25, '%', Typography.quote, 18, 2, ',', 28, 4, '-', '/', 5, '#', 25, '0', 29, ')', 7, ')', 2, '.', '#', '0'}, (byte) (2 - (ViewConfiguration.getEdgeSlop() >> 16)), 22 - View.MeasureSpec.getSize(0), objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        d(new char[]{'\'', 1, 22, '\t', '+', '\'', 30, 4, '%', 22, 6, ' ', ')', '\t', 13940}, (byte) (TextUtils.indexOf((CharSequence) "", '0') + 118), 15 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0') + 37568);
            int tapTimeout = 625 - (ViewConfiguration.getTapTimeout() >> 16);
            int jumpTapTimeout = 14 - (ViewConfiguration.getJumpTapTimeout() >> 16);
            byte b3 = $$a[5];
            byte b4 = b3;
            Object[] objArr6 = new Object[1];
            c(b4, (byte) (-b4), b3, objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cLastIndexOf, tapTimeout, jumpTapTimeout, -976899241, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char minimumFlingVelocity = (char) (37567 - (ViewConfiguration.getMinimumFlingVelocity() >> 16));
                int mode = 625 - View.MeasureSpec.getMode(0);
                int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 15;
                byte b5 = $$a[5];
                byte b6 = b5;
                Object[] objArr7 = new Object[1];
                c(b6, (byte) (b6 | 50), b5, objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(minimumFlingVelocity, mode, iLastIndexOf, -973632554, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i4 = ((int[]) objArr8[2])[0];
            int i5 = ((int[]) objArr8[0])[0];
            String[] strArr = (String[]) objArr8[3];
            int[] iArr = {i4};
            int iIdentityHashCode = System.identityHashCode(this);
            int i6 = ((~(iIdentityHashCode | 1657689048)) * TypedValues.CycleType.TYPE_EASING) + 1166645964 + (((~((~iIdentityHashCode) | 1657689048)) | 12849424) * TypedValues.CycleType.TYPE_EASING) + 1691251685;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[1])[0] = i8 ^ (i8 << 5);
            objArr = new Object[]{new int[]{i5}, new int[1], iArr, strArr};
            int i9 = f393a + 113;
            b = i9 % 128;
            int i10 = i9 % 2;
        } else {
            Object[] objArr9 = new Object[1];
            d(new char[]{25, '%', Typography.quote, 18, 2, ',', 28, 4, 22, '\t', 7, 1, '\r', '#', 30, ')', '\t', '(', ')', Typography.quote, 19, ',', 15, ')', 25, 30}, (byte) (TextUtils.indexOf((CharSequence) "", '0', 0) + 63), 26 - (Process.myTid() >> 22), objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            d(new char[]{Typography.dollar, Typography.quote, 13878, 13878, '%', '(', 28, '\r', 13880, 13880, 2, '\'', '%', 27, 30, ')', '.', '%'}, (byte) (77 - TextUtils.lastIndexOf("", '0', 0, 0)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 17, objArr10);
            Context applicationContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr11 = new Object[1];
            d(new char[]{'\t', 25, '\t', 26, 1, 5, 25, '%', 14, 4, ')', 26, '0', ' ', ')', '\b'}, (byte) (44 - (Process.myTid() >> 22)), Color.red(0) + 16, objArr11);
            Class<?> cls3 = Class.forName((String) objArr11[0]);
            Object[] objArr12 = new Object[1];
            d(new char[]{'\'', 30, '%', '(', 30, ')', ')', Typography.quote, 16, 30, '/', '0', '%', '*', 29, '\''}, (byte) (2 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), 16 - Color.argb(0, 0, 0, 0), objArr12);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr12[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr13 = new Object[1];
            d(new char[]{15, Typography.amp, 16, 22, 27, 2, 19, 29, '+', 17, 18, 22, 13835, 13835, 24, 26, 21, 31, 29, '(', 26, 25, 27, 3, Typography.amp, 22, 0, Typography.quote, 4, '!', 17, '/', ',', 24, 24, 3, 13751, 13751, '%', 30, 18, 22, 16, '!', 22, '+', 4, 26, 24, 27, '%', 30, 16, '!', 20, 3, ',', 31, 20, 5, 1, 20, 20, 3}, (byte) (11 - TextUtils.indexOf((CharSequence) "", '0', 0)), MotionEvent.axisFromString("") + 65, objArr13);
            String str = (String) objArr13[0];
            Object[] objArr14 = new Object[1];
            d(new char[]{'%', 27, '!', Typography.quote, 27, 26, 3, 27, '+', 22, 27, 5, Typography.amp, 15, 16, 20, 19, 3, '(', '\f', 26, 25, 19, 29, 5, 20, 3, '0', 3, '/', ',', 31, '0', 3, 21, ' ', 15, '(', 24, 16, 15, Typography.amp, 19, 29, 26, 17, 13837, 13837, '0', Typography.amp, 13831, 13831, 5, 20, 3, 19, Typography.dollar, 20, 18, 20, 24, 27, 29, 19}, (byte) (101 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 64 - TextUtils.indexOf("", ""), objArr14);
            String[] strArr2 = {str, (String) objArr14[0]};
            int i11 = f393a + 3;
            b = i11 % 128;
            int i12 = i11 % 2;
            try {
                Object[] objArr15 = {applicationContext, strArr2, Integer.valueOf(iIntValue), 17, 1691251685};
                byte[] bArr2 = $$d;
                byte b7 = bArr2[42];
                Object[] objArr16 = new Object[1];
                e(b7, b7, (byte) (-bArr2[5]), objArr16);
                Class<?> cls4 = Class.forName((String) objArr16[0]);
                byte b8 = (byte) (-bArr2[5]);
                Object[] objArr17 = new Object[1];
                e(b8, b8, bArr2[42], objArr17);
                objArr = (Object[]) cls4.getMethod((String) objArr17[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr15);
                int i13 = ((int[]) objArr[0])[0];
                int i14 = ((int[]) objArr[2])[0];
                if (applicationContext != null) {
                    int i15 = f393a + 111;
                    b = i15 % 128;
                    int i16 = i15 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cLastIndexOf2 = (char) (TextUtils.lastIndexOf("", '0') + 37568);
                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 626;
                        int iIndexOf2 = 14 - TextUtils.indexOf("", "", 0, 0);
                        byte b9 = $$a[5];
                        byte b10 = b9;
                        Object[] objArr18 = new Object[1];
                        c(b10, (byte) (b10 | 50), b9, objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cLastIndexOf2, iIndexOf, iIndexOf2, -973632554, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr19 = new Object[1];
                        d(new char[]{25, '%', Typography.quote, 18, 2, ',', 28, 4, '-', '/', 5, '#', 25, '0', 29, ')', 7, ')', 2, '.', '#', '0'}, (byte) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 2), 21 - TextUtils.lastIndexOf("", '0', 0, 0), objArr19);
                        Class<?> cls5 = Class.forName((String) objArr19[0]);
                        Object[] objArr20 = new Object[1];
                        d(new char[]{'\'', 1, 22, '\t', '+', '\'', 30, 4, '%', 22, 6, ' ', ')', '\t', 13940}, (byte) (117 - (ViewConfiguration.getLongPressTimeout() >> 16)), 16 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr20);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr20[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char offsetAfter = (char) (37567 - TextUtils.getOffsetAfter("", 0));
                            int bitsPerPixel = 624 - ImageFormat.getBitsPerPixel(0);
                            int keyRepeatDelay = 14 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                            byte b11 = $$a[5];
                            byte b12 = b11;
                            Object[] objArr21 = new Object[1];
                            c(b12, (byte) (-b12), b11, objArr21);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(offsetAfter, bitsPerPixel, keyRepeatDelay, -976899241, false, (String) objArr21[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char c2 = (char) (37568 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                            int trimmedLength = 625 - TextUtils.getTrimmedLength("");
                            int i17 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 13;
                            byte[] bArr3 = $$a;
                            byte b13 = bArr3[7];
                            Object[] objArr22 = new Object[1];
                            c(b13, (byte) (-bArr3[5]), b13, objArr22);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, trimmedLength, i17, -477065106, false, (String) objArr22[0], null);
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
        int i18 = ((int[]) objArr[0])[0];
        int i19 = ((int[]) objArr[2])[0];
        if (i19 == i18) {
            int i20 = ((int[]) objArr[1])[0];
            int i21 = ((int[]) objArr[2])[0];
            int i22 = ((int[]) objArr[0])[0];
            String[] strArr3 = (String[]) objArr[3];
            int[] iArr2 = {i21};
            int i23 = (int) Runtime.getRuntime().totalMemory();
            int i24 = i20 + 1243098616 + (((~((-88088589) | i23)) | (~(1735649532 | i23))) * 69) + (((~(i23 | 1165060204)) | (~((-658677917) | i23)) | 570589328) * (-69)) + 1296597472;
            int i25 = (i24 << 13) ^ i24;
            int i26 = i25 ^ (i25 >>> 17);
            ((int[]) objArr2[1])[0] = i26 ^ (i26 << 5);
            objArr2 = new Object[]{new int[]{i22}, new int[1], iArr2, strArr3};
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr4 = (String[]) objArr[3];
            if (strArr4 != null) {
                for (String str2 : strArr4) {
                    arrayList.add(str2);
                }
            }
            Toast.makeText((Context) null, i19 / (((i19 - 1) * i19) % 2), 0).show();
            int i27 = ((int[]) objArr[1])[0];
            int i28 = ((int[]) objArr[2])[0];
            int i29 = ((int[]) objArr[0])[0];
            String[] strArr5 = (String[]) objArr[3];
            int[] iArr3 = {i28};
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i30 = i27 + (((~((~elapsedCpuTime) | (-201506945))) * 130) - 111950724) + (((~(elapsedCpuTime | (-201506945))) | 11612230) * 130);
            int i31 = (i30 << 13) ^ i30;
            int i32 = i31 ^ (i31 >>> 17);
            ((int[]) objArr2[1])[0] = i32 ^ (i32 << 5);
            objArr2 = new Object[]{new int[]{i29}, new int[1], iArr3, strArr5};
        }
        if (this == p0) {
            return true;
        }
        if (p0 instanceof BranchOfficeLocationByRegionResponse) {
            if (Intrinsics.areEqual(this.data, ((BranchOfficeLocationByRegionResponse) p0).data)) {
                return true;
            }
            int i33 = f393a + 39;
            b = i33 % 128;
            int i34 = i33 % 2;
            return false;
        }
        int i35 = ((int[]) objArr2[1])[0];
        int i36 = ((((i35 * i35) - (~(-(1525842234 * i35)))) - 1) - (~(-(i35 * 728143782)))) - 1;
        int i37 = (i36 ^ 864727296) + ((864727296 & i36) << 1);
        int i38 = i37 >> 29;
        int i39 = (((i38 | (-15)) << 1) - (i38 ^ (-15))) / 8;
        int i40 = (i37 - (~((i39 & 1) + (i39 | 1)))) - 1;
        int i41 = i37 >> 26;
        int i42 = (((i41 | ComposerKt.defaultsKey) << 1) - (i41 ^ ComposerKt.defaultsKey)) / 64;
        int i43 = -(i40 ^ ((i42 ^ 1) + ((i42 & 1) << 1)));
        int i44 = (i43 ^ 6) + ((i43 & 6) << 1);
        int i45 = i44 >> 15;
        int i46 = ((((-262143) | i45) << 1) - (i45 ^ (-262143))) / 131072;
        int i47 = (i46 & 1) + (i46 | 1);
        return 0 / (((-((i47 & 1) + (i47 | 1))) & i44) * 68);
    }

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 87;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BranchOfficeLocationByRegionResponse copy$default(BranchOfficeLocationByRegionResponse branchOfficeLocationByRegionResponse, List list, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 + 101;
        f393a = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            int i6 = i3 + 59;
            f393a = i6 % 128;
            int i7 = i6 % 2;
            list = branchOfficeLocationByRegionResponse.data;
            if (i7 == 0) {
                int i8 = 5 / 0;
            }
        }
        BranchOfficeLocationByRegionResponse branchOfficeLocationByRegionResponseCopy = branchOfficeLocationByRegionResponse.copy(list);
        int i9 = f393a + 75;
        b = i9 % 128;
        int i10 = i9 % 2;
        return branchOfficeLocationByRegionResponseCopy;
    }

    public final List<BranchOfficeItem> component1() {
        int i = 2 % 2;
        int i2 = f393a + 41;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        List<BranchOfficeItem> list = this.data;
        int i5 = i3 + 97;
        f393a = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final BranchOfficeLocationByRegionResponse copy(List<BranchOfficeItem> p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        BranchOfficeLocationByRegionResponse branchOfficeLocationByRegionResponse = new BranchOfficeLocationByRegionResponse(p0);
        int i2 = b + 23;
        f393a = i2 % 128;
        int i3 = i2 % 2;
        return branchOfficeLocationByRegionResponse;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = b + 23;
        f393a = i2 % 128;
        if (i2 % 2 == 0) {
            iHashCode = this.data.hashCode();
            int i3 = 29 / 0;
        } else {
            iHashCode = this.data.hashCode();
        }
        int i4 = b + 95;
        f393a = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        List<BranchOfficeItem> list = this.data;
        StringBuilder sb = new StringBuilder("BranchOfficeLocationByRegionResponse(data=");
        sb.append(list);
        sb.append(")");
        String string = sb.toString();
        int i2 = f393a + 25;
        b = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new char[]{60117, 60123, 60073, 60124, 60055, 60104, 60057, 60090, 60043, 60083, 60122, 60049, 60045, 60054, 60116, 60061, 60079, 60105, 60060, 60111, 60041, 60118, 60120, 60058, 60108, 60110, 60107, 60034, 60106, 60046, 60099, 60119, 60063, 60109, 60047, 60088, 60062, 60050, 60127, 60053, 60072, 60056, 60048, 60121, 60052, 60098, 60040, 60051, 60125};
        TuitionPaymentFragmentbindingInflater1 = (char) 57190;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001e  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x001e -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x001e
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r6, byte r7, short r8) {
        /*
            int r7 = r7 + 113
            byte[] r0 = com.bpjstku.data.office.model.response.BranchOfficeLocationByRegionResponse.$$c
            int r8 = r8 * 4
            int r1 = r8 + 1
            int r6 = r6 + 4
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r8
            r4 = r2
            goto L28
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r8) goto L1e
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L1e:
            int r6 = r6 + 1
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L28:
            int r7 = -r7
            int r7 = r7 + r3
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.office.model.response.BranchOfficeLocationByRegionResponse.$$g(byte, byte, short):java.lang.String");
    }
}
