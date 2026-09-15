package com.bpjstku.data.asik.model.request;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
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
import com.bpjstku.data.lib.model.BaseRequest;
import com.google.gson.annotations.SerializedName;
import defpackage.initSession;
import defpackage.onCaptureSessionEnd;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ@\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0003\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0017\u0010\nR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\nR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\nR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b \u0010\n"}, d2 = {"Lcom/bpjstku/data/asik/model/request/AsikListKpjMobileRequest;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "", "p0", "p1", "p2", "p3", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/asik/model/request/AsikListKpjMobileRequest;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "email", "Ljava/lang/String;", "getEmail", "identityNumber", "getIdentityNumber", "fullName", "getFullName", "birthdate", "getBirthdate"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class AsikListKpjMobileRequest extends BaseRequest {
    public static final int $stable = 0;
    private static char TuitionPaymentFragmentbindingInflater1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static char b;

    @SerializedName("birthdate")
    private final String birthdate;

    @SerializedName("email")
    private final String email;

    @SerializedName("fullName")
    private final String fullName;

    @SerializedName("identityNumber")
    private final String identityNumber;
    private static final byte[] $$c = {88, 99, -94, -58};
    private static final int $$f = 45;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {29, -5, -24, -13, -38, 7, 0, 21, -13, 10, 38, -14, 9, -2, 14, 20, -21, 23, -9, 6, 17, -7};
    private static final int $$e = 90;
    private static final byte[] $$a = {1, -81, 2, 79, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$b = 214;
    private static int g = 0;
    private static int asBinder = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f379a = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r5, int r6, byte r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 + 84
            int r7 = r7 * 52
            int r7 = 55 - r7
            int r5 = r5 * 52
            int r0 = r5 + 1
            byte[] r1 = com.bpjstku.data.asik.model.request.AsikListKpjMobileRequest.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r4 = r6
            r3 = r2
            r6 = r5
            goto L29
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r7 = r7 + 1
            if (r3 != r5) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L25:
            int r3 = r3 + 1
            r4 = r1[r7]
        L29:
            int r6 = r6 + r4
            int r6 = r6 + (-11)
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.asik.model.request.AsikListKpjMobileRequest.c(byte, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(int r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 31
            int r7 = r7 + 67
            int r9 = r9 * 18
            int r9 = 21 - r9
            int r8 = r8 * 18
            int r8 = 19 - r8
            byte[] r0 = com.bpjstku.data.asik.model.request.AsikListKpjMobileRequest.$$d
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r9
            r4 = r2
            r9 = r8
            goto L2f
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L27:
            int r9 = r9 + 1
            r3 = r0[r9]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L2f:
            int r7 = -r7
            int r9 = r9 + r7
            int r7 = r9 + 6
            r9 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.asik.model.request.AsikListKpjMobileRequest.e(int, int, short, java.lang.Object[]):void");
    }

    public final String getEmail() {
        int i = 2 % 2;
        int i2 = asBinder + 37;
        int i3 = i2 % 128;
        g = i3;
        int i4 = i2 % 2;
        String str = this.email;
        int i5 = i3 + 59;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getIdentityNumber() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 47;
        g = i3 % 128;
        int i4 = i3 % 2;
        String str = this.identityNumber;
        int i5 = i2 + 71;
        g = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getFullName() {
        int i = 2 % 2;
        int i2 = g + 3;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        String str = this.fullName;
        int i5 = i3 + 125;
        g = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getBirthdate() {
        int i = 2 % 2;
        int i2 = g + 15;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        String str = this.birthdate;
        int i5 = i3 + 9;
        g = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public AsikListKpjMobileRequest(String str, String str2, String str3, String str4) {
        this.email = str;
        this.identityNumber = str2;
        this.fullName = str3;
        this.birthdate = str4;
    }

    private static void d(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
        char[] cArr2 = new char[cArr.length - 2];
        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        char[] cArr3 = new char[2];
        while (true) {
            int i3 = 0;
            if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i);
                return;
            }
            cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
            int i4 = 58224;
            int i5 = 0;
            while (i5 < 16) {
                int i6 = $10 + 69;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i8 = (c2 + i4) ^ ((c2 << 4) + ((char) (((long) TuitionPaymentFragmentbindingInflater1) ^ 8611973335120459638L)));
                int i9 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    objArr2[2] = Integer.valueOf(i9);
                    objArr2[1] = Integer.valueOf(i8);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char offsetAfter = (char) (47773 - TextUtils.getOffsetAfter("", i3));
                        int pressedStateDuration = 468 - (ViewConfiguration.getPressedStateDuration() >> 16);
                        int iResolveOpacity = Drawable.resolveOpacity(i3, i3) + 13;
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(offsetAfter, pressedStateDuration, iResolveOpacity, -2007001706, false, "o", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    int i10 = i5;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i4) ^ ((cCharValue << 4) + ((char) (((long) b) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 47773), 468 - View.getDefaultSize(0, 0), '=' - AndroidCharacter.getMirror('0'), -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i4 -= 40503;
                    i5 = i10 + 1;
                    int i11 = $11 + 59;
                    $10 = i11 % 128;
                    int i12 = i11 % 2;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] ^ cArr3[0]);
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr3[1] ^ cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1]);
            Object[] objArr4 = {oncapturesessionend, oncapturesessionend};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                byte b2 = (byte) 0;
                byte b3 = b2;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (Process.myTid() >> 22), 2323 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), ExpandableListView.getPackedPositionGroup(0L) + 44, -1312321721, false, $$g(b2, b3, b3), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x01f2  */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    public final boolean equals(Object p0) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cRed = (char) Color.red(0);
            int gidForName = 875 - Process.getGidForName("");
            int iLastIndexOf = 9 - TextUtils.lastIndexOf("", '0', 0, 0);
            byte[] bArr = $$a;
            byte b2 = bArr[7];
            Object[] objArr2 = new Object[1];
            c(b2, (byte) (b2 | 14), bArr[0], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cRed, gidForName, iLastIndexOf, 252381699, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        d(new char[]{32892, 60071, 14361, 48390, 17599, 20316, 63181, 11836, 63394, 42770, 37759, 13486, 59865, 50480, 30113, 41586, 52482, 40634, 58000, 44319, 32498, 58849, 8768, 28933}, (-16777194) - Color.rgb(0, 0, 0), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        d(new char[]{7533, 19661, 24079, 32229, 39371, 24424, 1926, 10503, 558, 46633, 16388, 46775, 34409, 64677, 24351, 53075, 64833, 19549}, (Process.myTid() >> 22) + 15, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
            int maxKeyCode = 876 - (KeyEvent.getMaxKeyCode() >> 16);
            int i2 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 10;
            byte[] bArr2 = $$a;
            byte b3 = bArr2[0];
            Object[] objArr5 = new Object[1];
            c(b3, bArr2[7], b3, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(pressedStateDuration, maxKeyCode, i2, 2009631821, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char offsetAfter = (char) TextUtils.getOffsetAfter("", 0);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 876;
                int trimmedLength = 10 - TextUtils.getTrimmedLength("");
                byte[] bArr3 = $$a;
                byte b4 = bArr3[7];
                Object[] objArr6 = new Object[1];
                c(b4, bArr3[54], b4, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(offsetAfter, iMakeMeasureSpec, trimmedLength, 256017550, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i3 = ((1747777446 + (((~((-543758358) | iIdentityHashCode)) | (~((-503448129) | iIdentityHashCode))) * 69)) + (((~(iIdentityHashCode | (-521308011))) | ((~((-561618240) | iIdentityHashCode)) | 17859882)) * (-69))) - 108233893;
            int i4 = (i3 << 13) ^ i3;
            int i5 = i4 ^ (i4 >>> 17);
            ((int[]) objArr[1])[0] = i5 ^ (i5 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            d(new char[]{9249, 8510, 19886, 14692, 39866, 56229, 18655, 2433, 27478, 49162, 33205, 44931, 4701, 64003, 14326, 62550, 28807, 33792, 64900, 37047, 26938, 60484, 55284, 7398, 16661, 25608, 47339, 26384}, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 26, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            d(new char[]{37270, 29615, 62284, 12727, 26787, 39972, 39829, 38634, 58230, 43603, 22597, 58149, 47071, 34910, 51670, 50800, 32322, 39147, 42053, 20089}, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 18, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if (!(!(applicationContext instanceof ContextWrapper))) {
                    int i6 = asBinder + 1;
                    g = i6 % 128;
                    int i7 = i6 % 2;
                    if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = applicationContext.getApplicationContext();
                    } else {
                        applicationContext = null;
                    }
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                }
            }
            Object[] objArr10 = new Object[1];
            d(new char[]{26013, 65117, 30503, 41885, 62509, 11095, 23948, 58792, 8825, 48610, 1905, 37046, 50134, 52333, 31847, 4157, 12571, 13254}, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 16, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            d(new char[]{60905, 46729, 43419, 59519, 164, 14206, 43616, 21374, 43517, 41925, 34678, 58988, 47175, 6232, 895, 20042, 33285, 61844}, 17 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i8 = asBinder + 121;
            g = i8 % 128;
            int i9 = i8 % 2;
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 366901467};
                byte[] bArr4 = $$d;
                byte b5 = bArr4[6];
                byte b6 = b5;
                Object[] objArr13 = new Object[1];
                e(b5, b6, (byte) (b6 + 1), objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b7 = bArr4[6];
                byte b8 = (byte) (b7 + 1);
                Object[] objArr14 = new Object[1];
                e(b8, b8, b7, objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (applicationContext != null) {
                    int i10 = g + 117;
                    asBinder = i10 % 128;
                    int i11 = i10 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char c = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        int defaultSize = 876 - View.getDefaultSize(0, 0);
                        int i12 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 10;
                        byte[] bArr5 = $$a;
                        byte b9 = bArr5[7];
                        Object[] objArr16 = new Object[1];
                        c(b9, bArr5[54], b9, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, defaultSize, i12, 256017550, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                    try {
                        Object[] objArr17 = new Object[1];
                        d(new char[]{32892, 60071, 14361, 48390, 17599, 20316, 63181, 11836, 63394, 42770, 37759, 13486, 59865, 50480, 30113, 41586, 52482, 40634, 58000, 44319, 32498, 58849, 8768, 28933}, 22 - TextUtils.indexOf("", "", 0, 0), objArr17);
                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        d(new char[]{7533, 19661, 24079, 32229, 39371, 24424, 1926, 10503, 558, 46633, 16388, 46775, 34409, 64677, 24351, 53075, 64833, 19549}, 15 - (ViewConfiguration.getScrollBarSize() >> 8), objArr18);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char defaultSize2 = (char) View.getDefaultSize(0, 0);
                            int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 876;
                            int tapTimeout = 10 - (ViewConfiguration.getTapTimeout() >> 16);
                            byte[] bArr6 = $$a;
                            byte b10 = bArr6[0];
                            Object[] objArr19 = new Object[1];
                            c(b10, bArr6[7], b10, objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(defaultSize2, absoluteGravity, tapTimeout, 2009631821, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cRed2 = (char) Color.red(0);
                            int size = 876 - View.MeasureSpec.getSize(0);
                            int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 11;
                            byte[] bArr7 = $$a;
                            byte b11 = bArr7[7];
                            Object[] objArr20 = new Object[1];
                            c(b11, (byte) (b11 | 14), bArr7[0], objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cRed2, size, bitsPerPixel, 252381699, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr15;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i13 = ((int[]) objArr[2])[0];
        int i14 = ((int[]) objArr[0])[0];
        if (i14 != i13) {
            throw new RuntimeException(String.valueOf(i14));
        }
        int i15 = ((int[]) objArr[1])[0];
        Object[] objArr21 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i16 = ~iIdentityHashCode2;
        int i17 = ~((-660020895) | i16);
        int i18 = ~(619710665 | iIdentityHashCode2);
        int i19 = i15 + (-1663234392) + ((i17 | i18) * 1150) + (((~((-619710666) | i16)) | i18) * (-575)) + (((~(iIdentityHashCode2 | (-660020895))) | (~(i16 | 660020894))) * 575);
        int i20 = (i19 << 13) ^ i19;
        int i21 = i20 ^ (i20 >>> 17);
        ((int[]) objArr21[1])[0] = i21 ^ (i21 << 5);
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof AsikListKpjMobileRequest)) {
            int i22 = asBinder + 45;
            g = i22 % 128;
            int i23 = i22 % 2;
            return false;
        }
        AsikListKpjMobileRequest asikListKpjMobileRequest = (AsikListKpjMobileRequest) p0;
        if (!Intrinsics.areEqual(this.email, asikListKpjMobileRequest.email)) {
            int i24 = asBinder + 21;
            g = i24 % 128;
            return i24 % 2 != 0;
        }
        if (Intrinsics.areEqual(this.identityNumber, asikListKpjMobileRequest.identityNumber)) {
            if (Intrinsics.areEqual(this.fullName, asikListKpjMobileRequest.fullName)) {
                return Intrinsics.areEqual(this.birthdate, asikListKpjMobileRequest.birthdate);
            }
            int i25 = asBinder + 81;
            g = i25 % 128;
            if (i25 % 2 != 0) {
                int i26 = 70 / 0;
            }
            return false;
        }
        int i27 = ((int[]) objArr21[1])[0];
        int i28 = i27 * i27;
        int i29 = -(954046342 * i27);
        int i30 = ((i28 | i29) << 1) - (i28 ^ i29);
        int i31 = -(i27 * 1287353596);
        int i32 = (i30 & i31) + (i31 | i30);
        int i33 = (i32 & (-1040180095)) + ((-1040180095) | i32);
        int i34 = i33 >> 21;
        int i35 = ((i34 & (-4095)) + (i34 | (-4095))) / 2048;
        int i36 = -(((i33 - (~((i35 & 1) + (i35 | 1)))) - 1) ^ ((((i33 >> 28) - 31) / 16) + 1));
        int i37 = ((i36 | 8) << 1) - (i36 ^ 8);
        int i38 = i37 >> 25;
        int i39 = ((i38 ^ (-255)) + ((i38 & (-255)) << 1)) / 128;
        int i40 = (i39 ^ 1) + ((i39 & 1) << 1);
        return 0 / (((-((i40 & 1) + (i40 | 1))) & i37) * 184);
    }

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        b();
        int i = f379a + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i % 128;
        if (i % 2 != 0) {
            int i2 = 61 / 0;
        }
    }

    public static /* synthetic */ AsikListKpjMobileRequest copy$default(AsikListKpjMobileRequest asikListKpjMobileRequest, String str, String str2, String str3, String str4, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            str = asikListKpjMobileRequest.email;
        }
        if ((i & 2) != 0) {
            int i3 = asBinder + 27;
            g = i3 % 128;
            int i4 = i3 % 2;
            str2 = asikListKpjMobileRequest.identityNumber;
        }
        if ((i & 4) != 0) {
            int i5 = asBinder + 67;
            int i6 = i5 % 128;
            g = i6;
            int i7 = i5 % 2;
            str3 = asikListKpjMobileRequest.fullName;
            int i8 = i6 + 21;
            asBinder = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 5 % 2;
            }
        }
        if ((i & 8) != 0) {
            str4 = asikListKpjMobileRequest.birthdate;
        }
        return asikListKpjMobileRequest.copy(str, str2, str3, str4);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = asBinder + 41;
        int i3 = i2 % 128;
        g = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.email;
        int i4 = i3 + 27;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = asBinder + 93;
        int i3 = i2 % 128;
        g = i3;
        int i4 = i2 % 2;
        String str = this.identityNumber;
        int i5 = i3 + 49;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        String str;
        int i = 2 % 2;
        int i2 = asBinder + 77;
        int i3 = i2 % 128;
        g = i3;
        if (i2 % 2 != 0) {
            str = this.fullName;
            int i4 = 77 / 0;
        } else {
            str = this.fullName;
        }
        int i5 = i3 + 95;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 58 / 0;
        }
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 101;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        String str = this.birthdate;
        int i5 = i2 + 103;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final AsikListKpjMobileRequest copy(String p0, String p1, String p2, String p3) {
        int i = 2 % 2;
        AsikListKpjMobileRequest asikListKpjMobileRequest = new AsikListKpjMobileRequest(p0, p1, p2, p3);
        int i2 = g + 113;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return asikListKpjMobileRequest;
        }
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int i2 = asBinder + 53;
        g = i2 % 128;
        int i3 = i2 % 2;
        String str = this.email;
        int iHashCode3 = 0;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.identityNumber;
        if (str2 == null) {
            int i4 = g + 25;
            int i5 = i4 % 128;
            asBinder = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 35;
            g = i7 % 128;
            int i8 = i7 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str2.hashCode();
        }
        String str3 = this.fullName;
        if (str3 == null) {
            int i9 = asBinder;
            int i10 = i9 + 85;
            g = i10 % 128;
            int i11 = i10 % 2;
            int i12 = i9 + 7;
            g = i12 % 128;
            int i13 = i12 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str3.hashCode();
        }
        String str4 = this.birthdate;
        if (str4 != null) {
            int i14 = g + 113;
            asBinder = i14 % 128;
            int i15 = i14 % 2;
            iHashCode3 = str4.hashCode();
        }
        return (((((iHashCode4 * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode3;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = this.email;
        String str2 = this.identityNumber;
        String str3 = this.fullName;
        String str4 = this.birthdate;
        StringBuilder sb = new StringBuilder("AsikListKpjMobileRequest(email=");
        sb.append(str);
        sb.append(", identityNumber=");
        sb.append(str2);
        sb.append(", fullName=");
        sb.append(str3);
        sb.append(", birthdate=");
        sb.append(str4);
        sb.append(")");
        String string = sb.toString();
        int i2 = asBinder + 29;
        g = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    static void b() {
        b = (char) 13181;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = (char) 20123;
        TuitionPaymentFragmentbindingInflater1 = (char) 63215;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (char) 61628;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r6, short r7, byte r8) {
        /*
            int r8 = r8 * 4
            int r8 = 3 - r8
            byte[] r0 = com.bpjstku.data.asik.model.request.AsikListKpjMobileRequest.$$c
            int r7 = r7 * 3
            int r7 = r7 + 108
            int r6 = r6 * 4
            int r1 = r6 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r8
            r4 = r2
            r8 = r6
            goto L2d
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r8 = r8 + 1
            int r4 = r3 + 1
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L27:
            r3 = r0[r8]
            r5 = r8
            r8 = r7
            r7 = r3
            r3 = r5
        L2d:
            int r7 = -r7
            int r7 = r7 + r8
            r8 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.asik.model.request.AsikListKpjMobileRequest.$$g(short, short, byte):java.lang.String");
    }
}
