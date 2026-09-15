package com.bpjstku.data.setting.model.request;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.bpjstku.data.lib.model.BaseRequest;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.gson.annotations.SerializedName;
import defpackage.getRealtimeCaptureLatency;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\rJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\rJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\rJd\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0003\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001d\u0010\rR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\rR\u001c\u0010!\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010\rR\u001c\u0010#\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b$\u0010\rR\u001c\u0010%\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u001f\u001a\u0004\b&\u0010\rR\u001c\u0010'\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u001f\u001a\u0004\b(\u0010\rR\u001c\u0010)\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\u001f\u001a\u0004\b*\u0010\rR\u001c\u0010+\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010\u001f\u001a\u0004\b,\u0010\r"}, d2 = {"Lcom/bpjstku/data/setting/model/request/ChangeEmailRequest;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/setting/model/request/ChangeEmailRequest;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "newEmail", "Ljava/lang/String;", "getNewEmail", "oldEmail", "getOldEmail", "otp", "getOtp", "checkSum", "getCheckSum", "latitude", "getLatitude", "longitude", "getLongitude", PlaceTypes.LOCALITY, "getLocality"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ChangeEmailRequest extends BaseRequest {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable = 0;
    private static int TuitionPaymentFragmentbindingInflater1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    @SerializedName("checkSum")
    private final String checkSum;

    @SerializedName("latitude")
    private final String latitude;

    @SerializedName(PlaceTypes.LOCALITY)
    private final String locality;

    @SerializedName("longitude")
    private final String longitude;

    @SerializedName("emailBaru")
    private final String newEmail;

    @SerializedName("emailLama")
    private final String oldEmail;

    @SerializedName("otp")
    private final String otp;
    private static final byte[] $$a = {43, 23, 22, -14, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
    private static final int $$b = ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION;
    private static int b = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 4
            byte[] r0 = com.bpjstku.data.setting.model.request.ChangeEmailRequest.$$a
            int r1 = r6 + 1
            int r8 = r8 * 14
            int r8 = 98 - r8
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r6
            r4 = r2
            goto L2a
        L12:
            r3 = r2
        L13:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L22:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2a:
            int r8 = -r8
            int r3 = r3 + r8
            int r8 = r3 + (-11)
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.setting.model.request.ChangeEmailRequest.a(int, short, int, java.lang.Object[]):void");
    }

    public final String getNewEmail() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.newEmail;
        int i5 = i2 + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getOldEmail() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 79;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            return this.oldEmail;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getOtp() {
        String str;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 29;
        b = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.otp;
            int i4 = 46 / 0;
        } else {
            str = this.otp;
        }
        int i5 = i2 + 83;
        b = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getCheckSum() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 103;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        String str = this.checkSum;
        int i5 = i3 + 113;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getLatitude() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 59;
        b = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.latitude;
        int i4 = i2 + 21;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String getLongitude() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.longitude;
        int i5 = i2 + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getLocality() {
        int i = 2 % 2;
        int i2 = b + 67;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        int i4 = i2 % 2;
        String str = this.locality;
        int i5 = i3 + 15;
        b = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public ChangeEmailRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.newEmail = str;
        this.oldEmail = str2;
        this.otp = str3;
        this.checkSum = str4;
        this.latitude = str5;
        this.longitude = str6;
        this.locality = str7;
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i3 = $10 + 91;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = getrealtimecapturelatency.b;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (((Process.getThreadPriority(0) + 20) >> 6) + 19472), TextUtils.getOffsetAfter("", 0) + 2624, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 12, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i4] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() / (TuitionPaymentFragmentspecialinlinedviewModeldefault2 * 9053247990562531611L);
                    Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.indexOf("", "", 0, 0) + 39422), 481 - Color.blue(0), 37 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i5 = getrealtimecapturelatency.b;
                Object[] objArr4 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (19471 - ExpandableListView.getPackedPositionChild(0L)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 2624, 14 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).longValue() ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault2 ^ 9053247990562531611L);
                Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (39422 - (ViewConfiguration.getTouchSlop() >> 8)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 481, (ViewConfiguration.getTapTimeout() >> 16) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
        }
        char[] cArr2 = new char[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i6 = $11 + 105;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            Object[] objArr6 = {getrealtimecapturelatency, getrealtimecapturelatency};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (39422 - Color.red(0)), ExpandableListView.getPackedPositionType(0L) + 481, (ViewConfiguration.getJumpTapTimeout() >> 16) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2);
    }

    public final String component2() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 105;
        b = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
        int i4 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
            int trimmedLength = 651 - TextUtils.getTrimmedLength("");
            int offsetAfter = 44 - TextUtils.getOffsetAfter("", 0);
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            a((byte) 52, bArr[80], bArr[5], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cCombineMeasuredStates, trimmedLength, offsetAfter, -459846511, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{21569, 45119, 40102, 63745, 50571, 8828, 3810, 27417, 30663, 21418, 47204, 33960, 57621, 52718, 10874, 14042, 4957, 32738, 23486, 41004, 35991, 59662}, 58481 - TextUtils.getCapsMode("", 0, 0), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{21573, 11595, 42575, 16197, 45135, 2406, 33390, 6979, 40061, 5502, 60938, 26393, 63517, 28950, 51751}, TextUtils.getCapsMode("", 0, 0) + 30983, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char trimmedLength2 = (char) TextUtils.getTrimmedLength("");
            int threadPriority = 651 - ((Process.getThreadPriority(0) + 20) >> 6);
            int mirror = '\\' - AndroidCharacter.getMirror('0');
            byte b2 = $$a[7];
            byte b3 = b2;
            Object[] objArr5 = new Object[1];
            a(b3, (byte) (b3 | 51), b2, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(trimmedLength2, threadPriority, mirror, -873460649, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 85;
            b = i5 % 128;
            int i6 = i5 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char mode = (char) View.MeasureSpec.getMode(0);
                int iResolveOpacity = 651 - Drawable.resolveOpacity(0, 0);
                int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 44;
                Object[] objArr6 = new Object[1];
                a((byte) 37, (byte) 51, $$a[5], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(mode, iResolveOpacity, absoluteGravity, -1595579076, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i7 = ((int[]) objArr7[2])[0];
            int i8 = ((int[]) objArr7[0])[0];
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i9 = 750604467 + (((~((-8421539) | iUptimeMillis)) | (~((~iUptimeMillis) | (-4990729)))) * (-318)) + (((~(547541155 | iUptimeMillis)) | (-552531884)) * (-318)) + (((~(iUptimeMillis | (-547541156))) | 544110345) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + 1860693639;
            int i10 = (i9 << 13) ^ i9;
            int i11 = i10 ^ (i10 >>> 17);
            ((int[]) objArr[3])[0] = i11 ^ (i11 << 5);
            int i12 = b + 19;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 4 / 3;
            }
        } else {
            try {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) View.getDefaultSize(0, 0), TextUtils.indexOf("", "", 0, 0) + 1610, 26 - KeyEvent.getDeadChar(0, 0), 2145681644, false, null, new Class[0]);
                }
                Object[] objArr8 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(null), 1860693639, 0};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                    int iResolveSize = View.resolveSize(0, 0) + 651;
                    int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 44;
                    byte b4 = $$a[7];
                    byte b5 = b4;
                    Object[] objArr9 = new Object[1];
                    a(b5, (byte) (b5 | 51), b4, objArr9);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cResolveSizeAndState, iResolveSize, doubleTapTimeout, 2075921419, false, (String) objArr9[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 695 - View.getDefaultSize(0, 0), KeyEvent.getDeadChar(0, 0) + 98), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (MotionEvent.axisFromString("") + 63407), 793 - View.MeasureSpec.makeMeasureSpec(0, 0), 83 - ExpandableListView.getPackedPositionGroup(0L)), Integer.TYPE, Integer.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr8);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char c = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int offsetBefore = 651 - TextUtils.getOffsetBefore("", 0);
                    int iIndexOf = 43 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                    Object[] objArr10 = new Object[1];
                    a((byte) 37, (byte) 51, $$a[5], objArr10);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c, offsetBefore, iIndexOf, -1595579076, false, (String) objArr10[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr11 = new Object[1];
                    c(new char[]{21569, 45119, 40102, 63745, 50571, 8828, 3810, 27417, 30663, 21418, 47204, 33960, 57621, 52718, 10874, 14042, 4957, 32738, 23486, 41004, 35991, 59662}, 58481 - ExpandableListView.getPackedPositionType(0L), objArr11);
                    Class<?> cls2 = Class.forName((String) objArr11[0]);
                    Object[] objArr12 = new Object[1];
                    c(new char[]{21573, 11595, 42575, 16197, 45135, 2406, 33390, 6979, 40061, 5502, 60938, 26393, 63517, 28950, 51751}, 30982 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr12);
                    long jLongValue2 = ((Long) cls2.getDeclaredMethod((String) objArr12[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        int iMyTid = (Process.myTid() >> 22) + 651;
                        int packedPositionGroup = 44 - ExpandableListView.getPackedPositionGroup(0L);
                        byte b6 = $$a[7];
                        byte b7 = b6;
                        Object[] objArr13 = new Object[1];
                        a(b7, (byte) (b7 | 51), b6, objArr13);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(scrollBarFadeDuration, iMyTid, packedPositionGroup, -873460649, false, (String) objArr13[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char offsetAfter2 = (char) TextUtils.getOffsetAfter("", 0);
                        int offsetAfter3 = TextUtils.getOffsetAfter("", 0) + 651;
                        int iResolveOpacity2 = Drawable.resolveOpacity(0, 0) + 44;
                        byte[] bArr2 = $$a;
                        Object[] objArr14 = new Object[1];
                        a((byte) 52, bArr2[80], bArr2[5], objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(offsetAfter2, offsetAfter3, iResolveOpacity2, -459846511, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
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
            if (strArr != null) {
                while (i4 < strArr.length) {
                    int i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 115;
                    b = i14 % 128;
                    if (i14 % 2 != 0) {
                        arrayList.add(strArr[i4]);
                        i4 += 53;
                    } else {
                        arrayList.add(strArr[i4]);
                        i4++;
                    }
                }
            }
            throw null;
        }
        int i15 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 65;
        b = i15 % 128;
        int i16 = i15 % 2;
        Object[] objArr15 = {new int[]{i}, new String[0], new int[]{i}, new int[1]};
        int i17 = ((int[]) objArr[3])[0];
        int i18 = ((int[]) objArr[2])[0];
        int i19 = ((int[]) objArr[0])[0];
        int iIdentityHashCode = System.identityHashCode(this);
        int i20 = ~iIdentityHashCode;
        int i21 = i17 + (-892796582) + (((~(577108903 | i20)) | (-587202536)) * 98) + (((~(i20 | (-580539714))) | 577108903 | (~(580539713 | iIdentityHashCode))) * (-49)) + (((~(iIdentityHashCode | 577108903)) | 6662822) * 49);
        int i22 = (i21 << 13) ^ i21;
        int i23 = i22 ^ (i22 >>> 17);
        ((int[]) objArr15[3])[0] = i23 ^ (i23 << 5);
        return this.oldEmail;
    }

    static {
        TuitionPaymentFragmentbindingInflater1 = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 81;
        TuitionPaymentFragmentbindingInflater1 = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ ChangeEmailRequest copy$default(ChangeEmailRequest changeEmailRequest, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i4 = i3 + 111;
        b = i4 % 128;
        String str14 = (i4 % 2 == 0 ? (i & 1) == 0 : (i & 1) == 0) ? str : changeEmailRequest.newEmail;
        if ((i & 2) != 0) {
            int i5 = i3 + 11;
            int i6 = i5 % 128;
            b = i6;
            int i7 = i5 % 2;
            str8 = changeEmailRequest.oldEmail;
            int i8 = i6 + 33;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i8 % 128;
            int i9 = i8 % 2;
        } else {
            str8 = str2;
        }
        Object obj2 = null;
        if ((i & 4) != 0) {
            int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 119;
            b = i10 % 128;
            if (i10 % 2 != 0) {
                String str15 = changeEmailRequest.otp;
                obj2.hashCode();
                throw null;
            }
            str9 = changeEmailRequest.otp;
        } else {
            str9 = str3;
        }
        if ((i & 8) != 0) {
            int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 123;
            b = i11 % 128;
            int i12 = i11 % 2;
            str10 = changeEmailRequest.checkSum;
        } else {
            str10 = str4;
        }
        if ((i & 16) != 0) {
            int i13 = b + 5;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i13 % 128;
            if (i13 % 2 == 0) {
                String str16 = changeEmailRequest.latitude;
                obj2.hashCode();
                throw null;
            }
            str11 = changeEmailRequest.latitude;
        } else {
            str11 = str5;
        }
        if ((i & 32) != 0) {
            str12 = changeEmailRequest.longitude;
            int i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1;
            b = i14 % 128;
            int i15 = i14 % 2;
        } else {
            str12 = str6;
        }
        if ((i & 64) != 0) {
            int i16 = b + 45;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i16 % 128;
            int i17 = i16 % 2;
            str13 = changeEmailRequest.locality;
            if (i17 == 0) {
                int i18 = 70 / 0;
            }
        } else {
            str13 = str7;
        }
        return changeEmailRequest.copy(str14, str8, str9, str10, str11, str12, str13);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = b + 21;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.newEmail;
        int i4 = i3 + 57;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 103;
        b = i3 % 128;
        int i4 = i3 % 2;
        String str = this.otp;
        int i5 = i2 + 63;
        b = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 119;
        b = i3 % 128;
        int i4 = i3 % 2;
        String str = this.checkSum;
        int i5 = i2 + 115;
        b = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 87;
        b = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.latitude;
        int i4 = i2 + 21;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 21;
        b = i2 % 128;
        int i3 = i2 % 2;
        String str = this.longitude;
        if (i3 != 0) {
            int i4 = 81 / 0;
        }
        return str;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 67;
        int i3 = i2 % 128;
        b = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.locality;
        int i4 = i3 + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final ChangeEmailRequest copy(String p0, String p1, String p2, String p3, String p4, String p5, String p6) {
        int i = 2 % 2;
        ChangeEmailRequest changeEmailRequest = new ChangeEmailRequest(p0, p1, p2, p3, p4, p5, p6);
        int i2 = b + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        return changeEmailRequest;
    }

    public final boolean equals(Object p0) {
        int i = 2 % 2;
        int i2 = b + 51;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ChangeEmailRequest)) {
            return false;
        }
        ChangeEmailRequest changeEmailRequest = (ChangeEmailRequest) p0;
        if (!Intrinsics.areEqual(this.newEmail, changeEmailRequest.newEmail)) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1;
            b = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.oldEmail, changeEmailRequest.oldEmail) || !Intrinsics.areEqual(this.otp, changeEmailRequest.otp) || !Intrinsics.areEqual(this.checkSum, changeEmailRequest.checkSum)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.latitude, changeEmailRequest.latitude)) {
            int i5 = b + 75;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.longitude, changeEmailRequest.longitude)) {
            int i7 = b;
            int i8 = i7 + 51;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i8 % 128;
            int i9 = i8 % 2;
            int i10 = i7 + 77;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i10 % 128;
            if (i10 % 2 != 0) {
                return false;
            }
            throw null;
        }
        if (Intrinsics.areEqual(this.locality, changeEmailRequest.locality)) {
            return true;
        }
        int i11 = b + 123;
        int i12 = i11 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i12;
        int i13 = i11 % 2;
        int i14 = i12 + 39;
        b = i14 % 128;
        int i15 = i14 % 2;
        return false;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        String str = this.newEmail;
        int iHashCode4 = 0;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        String str2 = this.oldEmail;
        if (str2 == null) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 43;
            b = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str2.hashCode();
        }
        String str3 = this.otp;
        if (str3 == null) {
            int i4 = b + 75;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
            iHashCode2 = i4 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode2 = str3.hashCode();
        }
        String str4 = this.checkSum;
        int iHashCode6 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.latitude;
        if (str5 == null) {
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 21;
            b = i5 % 128;
            int i6 = i5 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str5.hashCode();
        }
        String str6 = this.longitude;
        int iHashCode7 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.locality;
        if (str7 != null) {
            iHashCode4 = str7.hashCode();
            int i7 = b + 81;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7 % 128;
            int i8 = i7 % 2;
        }
        int i9 = (((((((((((iHashCode5 * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode6) * 31) + iHashCode3) * 31) + iHashCode7) * 31) + iHashCode4;
        int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 117;
        b = i10 % 128;
        int i11 = i10 % 2;
        return i9;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = this.newEmail;
        String str2 = this.oldEmail;
        String str3 = this.otp;
        String str4 = this.checkSum;
        String str5 = this.latitude;
        String str6 = this.longitude;
        String str7 = this.locality;
        StringBuilder sb = new StringBuilder("ChangeEmailRequest(newEmail=");
        sb.append(str);
        sb.append(", oldEmail=");
        sb.append(str2);
        sb.append(", otp=");
        sb.append(str3);
        sb.append(", checkSum=");
        sb.append(str4);
        sb.append(", latitude=");
        sb.append(str5);
        sb.append(", longitude=");
        sb.append(str6);
        sb.append(", locality=");
        sb.append(str7);
        sb.append(")");
        String string = sb.toString();
        int i2 = b + 113;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1048954989959249211L;
    }
}
