package com.bpjstku.data.user.model.request;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bpjstku.data.lib.model.BaseRequest;
import com.google.gson.annotations.SerializedName;
import defpackage.SessionProcessor;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0013\u0010\bR\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015"}, d2 = {"Lcom/bpjstku/data/user/model/request/UpdateFCMRequest;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "", "p0", "p1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/user/model/request/UpdateFCMRequest;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "email", "Ljava/lang/String;", "fcmToken"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class UpdateFCMRequest extends BaseRequest {
    public static final int $stable = 0;
    private static int TuitionPaymentFragmentbindingInflater1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static char b;

    @SerializedName("email")
    private final String email;

    @SerializedName("registerId")
    private final String fcmToken;
    private static final byte[] $$c = {49, 89, 41, 48};
    private static final int $$d = 156;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {33, -59, 107, -108, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$b = 39;
    private static int d = 0;
    private static int asInterface = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r7, short r8, short r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 2
            int r7 = 53 - r7
            byte[] r0 = com.bpjstku.data.user.model.request.UpdateFCMRequest.$$a
            int r8 = r8 * 2
            int r8 = r8 + 4
            int r9 = r9 * 3
            int r9 = 84 - r9
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r7
            r9 = r8
            r4 = r2
            goto L2c
        L17:
            r3 = r2
            r6 = r9
            r9 = r8
            r8 = r6
        L1b:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L2a
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L2a:
            r3 = r0[r9]
        L2c:
            int r3 = -r3
            int r8 = r8 + r3
            int r8 = r8 + (-11)
            int r9 = r9 + 1
            r3 = r4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.user.model.request.UpdateFCMRequest.c(int, short, short, java.lang.Object[]):void");
    }

    public UpdateFCMRequest(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.email = str;
        this.fcmToken = str2;
    }

    public final UpdateFCMRequest copy(String p0, String p1) throws Throwable {
        int i;
        int i2;
        String str;
        int i3 = 2;
        int i4 = 2 % 2;
        String str2 = "";
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1552861273);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 46400), View.MeasureSpec.getSize(0) + 40, Color.rgb(0, 0, 0) + 16777235, -1206882418, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
        }
        int i5 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
        Object[] objArr = new Object[1];
        a(new char[]{0, 0, 0, 0}, new char[]{33929, 19099, 33572, 10582}, (char) (ViewConfiguration.getTouchSlop() >> 8), ImageFormat.getBitsPerPixel(0) + 1, new char[]{65373, 1958, 50858, 53841, 47357, 63656, 37284, 51395, 14383, 54819, 52311, 37058, 49684, 49412, 60600, 6025, 28649, 49522, 35455, 55143, 9897, 39619}, objArr);
        Class<?> cls = Class.forName((String) objArr[0]);
        Object[] objArr2 = new Object[1];
        a(new char[]{0, 0, 0, 0}, new char[]{33486, 46253, 6886, 53067}, (char) (ExpandableListView.getPackedPositionChild(0L) + 19227), TextUtils.lastIndexOf("", '0', 0, 0) - 424366717, new char[]{34540, 55263, 4464, 46707, 48692, 27740, 51683, 10184, 9181, 47172, 33769, 37561, 10707, 62674, 25426}, objArr2);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
        int iMyTid = Process.myTid();
        long j = TypedValues.CycleType.TYPE_EASING;
        long j2 = iMyTid;
        long j3 = -1;
        long j4 = j3 ^ 3324637624094476148L;
        long j5 = (((long) (-419)) * 3324637624094476148L) + (((long) 421) * (-1227380449352517161L)) + (((j2 | (-1227380449352517161L)) ^ j3) * j) + (((long) (-420)) * (j4 | (-1227380449352517161L))) + (j * ((j3 ^ ((j2 ^ j3) | (-1227380449352517161L))) | ((j4 | (j3 ^ (-1227380449352517161L))) ^ j3)));
        long j6 = jLongValue;
        int i6 = 0;
        while (true) {
            if (i6 == 10) {
                String str3 = str2;
                int length = p0 != null ? p0.length() : 0;
                try {
                    Object[] objArr3 = {-1519471775};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (46038 - Color.red(0)), 1134 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), View.MeasureSpec.getMode(0) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
                    }
                    Object[] objArr4 = {Integer.valueOf(length), 0, 669178125, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr3), false};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cAlpha = (char) Color.alpha(0);
                        int doubleTapTimeout = 1031 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                        int iResolveSize = View.resolveSize(0, 0) + 15;
                        byte b2 = $$a[7];
                        byte b3 = b2;
                        Object[] objArr5 = new Object[1];
                        c(b2, b3, b3, objArr5);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cAlpha, doubleTapTimeout, iResolveSize, 1298546779, false, (String) objArr5[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), 1117 - KeyEvent.keyCodeFromString(str3), Gravity.getAbsoluteGravity(0, 0) + 17), Boolean.TYPE});
                    }
                    Object[] objArr6 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    int i7 = ((int[]) objArr6[1])[0];
                    int i8 = ((int[]) objArr6[3])[0];
                    if (i8 == i7) {
                        break;
                    }
                    ArrayList arrayList = new ArrayList();
                    String[] strArr = (String[]) objArr6[0];
                    if (strArr != null) {
                        int i9 = asInterface + 75;
                        d = i9 % 128;
                        int i10 = i9 % 2;
                        for (String str4 : strArr) {
                            arrayList.add(str4);
                        }
                    }
                    int[] iArr = new int[i8];
                    int i11 = i8 - 1;
                    iArr[i11] = 1;
                    Toast.makeText((Context) null, iArr[((i8 * i11) % 2) - 1], 1).show();
                    break;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            int i12 = d + 5;
            asInterface = i12 % 128;
            if (i12 % i3 == 0) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-638037654);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (37836 - (ViewConfiguration.getTouchSlop() >> 8)), 59 - KeyEvent.keyCodeFromString(str2), 18 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 1030158013, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
                }
                i = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).getInt(null);
                i2 = 1;
            } else {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-638037654);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (37836 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), 59 - KeyEvent.normalizeMetaState(0), 19 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 1030158013, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
                }
                i = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).getInt(null);
                i2 = 0;
            }
            while (true) {
                int i13 = 0;
                while (i13 != 8) {
                    i = (((((int) (j6 >> i13)) & 255) + (i << 6)) + (i << 16)) - i;
                    i13++;
                    str2 = str2;
                }
                str = str2;
                if (i2 != 0) {
                    break;
                }
                int i14 = asInterface + 123;
                d = i14 % 128;
                int i15 = i14 % 2;
                i2++;
                j6 = j5;
                str2 = str;
            }
            if (i == i5) {
                break;
            }
            j6 -= 1024;
            i6++;
            int i16 = asInterface + 39;
            d = i16 % 128;
            int i17 = i16 % 2;
            str2 = str;
            i3 = 2;
        }
        UpdateFCMRequest updateFCMRequest = new UpdateFCMRequest(p0, p1);
        int i18 = d + 35;
        asInterface = i18 % 128;
        if (i18 % 2 == 0) {
            int i19 = 90 / 0;
        }
        return updateFCMRequest;
    }

    private static void a(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        SessionProcessor sessionProcessor = new SessionProcessor();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr3.length;
        char[] cArr6 = new char[length3];
        sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
            int i4 = $11 + 15;
            $10 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = (byte) (b2 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((Process.myPid() >> 22) + 8328), 1235 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 34 - MotionEvent.axisFromString(""), -653973969, false, $$e(b2, b3, (byte) (b3 + 1)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), Drawable.resolveOpacity(0, 0) + 2764, TextUtils.indexOf((CharSequence) "", '0') + 15, 1504416861, false, $$e(b4, b5, (byte) (b5 + 3)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 43325), (ViewConfiguration.getPressedStateDuration() >> 16) + 253, 22 - (ViewConfiguration.getScrollBarSize() >> 8), -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = (byte) (b6 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((KeyEvent.getMaxKeyCode() >> 16) + 65200), 2891 - Color.blue(0), 18 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 2012627446, false, $$e(b6, b7, (byte) (-b7)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = sessionProcessor.b;
                cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] ^ cArr4[iIntValue2])) ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) b) ^ (-6377398940819159759L)))));
                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                int i6 = $10 + 37;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                i2 = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 55;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private final String component1() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 83;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.email;
        int i4 = i2 + 23;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    private final String component2() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 125;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.fcmToken;
        int i4 = i2 + 73;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public static /* synthetic */ UpdateFCMRequest copy$default(UpdateFCMRequest updateFCMRequest, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = d + 107;
            asInterface = i3 % 128;
            if (i3 % 2 == 0) {
                String str3 = updateFCMRequest.email;
                throw null;
            }
            str = updateFCMRequest.email;
        }
        if ((i & 2) != 0) {
            str2 = updateFCMRequest.fcmToken;
            int i4 = d + 109;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
        }
        return updateFCMRequest.copy(str, str2);
    }

    public final boolean equals(Object p0) {
        int i = 2 % 2;
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof UpdateFCMRequest)) {
            int i2 = asInterface + 61;
            int i3 = i2 % 128;
            d = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 87;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        UpdateFCMRequest updateFCMRequest = (UpdateFCMRequest) p0;
        if (!Intrinsics.areEqual(this.email, updateFCMRequest.email) || !Intrinsics.areEqual(this.fcmToken, updateFCMRequest.fcmToken)) {
            return false;
        }
        int i7 = asInterface + 93;
        d = i7 % 128;
        if (i7 % 2 == 0) {
            return true;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = asInterface + 11;
        d = i2 % 128;
        int iHashCode = i2 % 2 != 0 ? this.email.hashCode() % this.fcmToken.hashCode() : (this.email.hashCode() * 31) + this.fcmToken.hashCode();
        int i3 = d + 3;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 73 / 0;
        }
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = this.email;
        String str2 = this.fcmToken;
        StringBuilder sb = new StringBuilder("UpdateFCMRequest(email=");
        sb.append(str);
        sb.append(", fcmToken=");
        sb.append(str2);
        sb.append(")");
        String string = sb.toString();
        int i2 = asInterface + 121;
        d = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -6377398940819159759L;
        TuitionPaymentFragmentbindingInflater1 = -981105359;
        b = (char) 42341;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(short r7, byte r8, int r9) {
        /*
            int r9 = r9 + 102
            int r8 = r8 + 4
            byte[] r0 = com.bpjstku.data.user.model.request.UpdateFCMRequest.$$c
            int r7 = r7 * 2
            int r7 = r7 + 1
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r9
            r4 = r2
            r9 = r8
            goto L28
        L13:
            r3 = r2
        L14:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            int r8 = r8 + 1
            if (r4 != r7) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L23:
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r6
        L28:
            int r3 = -r3
            int r8 = r8 + r3
            r3 = r4
            r6 = r9
            r9 = r8
            r8 = r6
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.user.model.request.UpdateFCMRequest.$$e(short, byte, int):java.lang.String");
    }
}
