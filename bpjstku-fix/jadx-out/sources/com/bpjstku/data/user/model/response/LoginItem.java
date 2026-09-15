package com.bpjstku.data.user.model.response;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.bpjstku.data.lib.model.BaseItem;
import com.google.gson.annotations.SerializedName;
import defpackage.initSession;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000b\u0010\tJ2\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0015\u0010\tR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u001b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\t"}, d2 = {"Lcom/bpjstku/data/user/model/response/LoginItem;", "Lcom/bpjstku/data/lib/model/BaseItem;", "", "p0", "p1", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/user/model/response/LoginItem;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "accessToken", "Ljava/lang/String;", "getAccessToken", "refreshToken", "getRefreshToken", "activationChecksum", "getActivationChecksum"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class LoginItem extends BaseItem {
    public static final int $stable = 0;
    private static char[] TuitionPaymentFragmentbindingInflater1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    @SerializedName("accessToken")
    private final String accessToken;

    @SerializedName("activationChecksum")
    private final String activationChecksum;

    @SerializedName("refreshToken")
    private final String refreshToken;
    private static final byte[] $$c = {49, 89, 41, 48};
    private static final int $$f = 152;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {31, -3, -46, 11, 10, -61, 72, -9, 0, 6, 21, -7, 17, -13, 23, -70, 63, 9, 10, -11, 17, 0, -9, 15, -58, 69, 5, -7, 17, -13, 23, -1, 7, 5, -65, 69, -9, 21, -10, 17, 8, -17, 5, 14, -3, -51, 37, 23, 21, -10, 17, 8, -17, 5, 14, -3, -30, 48, 3, -7, 2, 23, -35, 24, 19, -72, 51, 32, 10, 1, -11, 6, -18, 23, 21, -10, 17, 8, -13, 17};
    private static final int $$e = 148;
    private static final byte[] $$a = {ByteCompanionObject.MAX_VALUE, 43, -39, -37, 23, -37, 42, 11, -10, 18, -7, 0, 7, 7, 23, -44, 44, 10, -5, 6, 18};
    private static final int $$b = 200;
    private static int b = 0;
    private static int g = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r7, short r8, int r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 10
            int r7 = 13 - r7
            int r8 = r8 + 1
            int r9 = r9 * 3
            int r9 = 100 - r9
            byte[] r0 = com.bpjstku.data.user.model.response.LoginItem.$$a
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r9 = r7
            r3 = r8
            r5 = r2
            goto L2d
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            int r7 = r7 + 1
            if (r5 != r8) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L27:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L2d:
            int r3 = r3 + r7
            int r7 = r3 + (-5)
            r3 = r5
            r6 = r9
            r9 = r7
            r7 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.user.model.response.LoginItem.a(short, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(int r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 76
            int r7 = 79 - r7
            int r8 = r8 * 76
            int r0 = 77 - r8
            int r6 = r6 * 7
            int r6 = r6 + 98
            byte[] r1 = com.bpjstku.data.user.model.response.LoginItem.$$d
            byte[] r0 = new byte[r0]
            int r8 = 76 - r8
            r2 = 0
            if (r1 != 0) goto L18
            r3 = r7
            r4 = r2
            goto L2f
        L18:
            r3 = r2
        L19:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L2a:
            r3 = r1[r7]
            r5 = r3
            r3 = r7
            r7 = r5
        L2f:
            int r6 = r6 + r7
            int r6 = r6 + (-4)
            r7 = r3
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.user.model.response.LoginItem.d(int, byte, byte, java.lang.Object[]):void");
    }

    public final String getAccessToken() {
        int i = 2 % 2;
        int i2 = b + 85;
        int i3 = i2 % 128;
        g = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.accessToken;
        int i4 = i3 + 9;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String getRefreshToken() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 117;
        g = i3 % 128;
        int i4 = i3 % 2;
        String str = this.refreshToken;
        int i5 = i2 + 11;
        g = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getActivationChecksum() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 67;
        b = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.activationChecksum;
        int i4 = i2 + 85;
        b = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public LoginItem(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str3, "");
        this.accessToken = str;
        this.refreshToken = str2;
        this.activationChecksum = str3;
    }

    private static void c(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        int i4 = $11 + 103;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i6 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            try {
                Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentbindingInflater1[i + i6])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), ((byte) KeyEvent.getModifierMetaStateMask()) + 2188, 40 - (Process.myPid() >> 22), 841711447, false, $$g(b2, b3, (byte) (b3 + 2)), new Class[]{Integer.TYPE});
                }
                try {
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 33018), KeyEvent.getDeadChar(0, 0) + 3011, 26 - View.resolveSize(0, 0), 321985076, false, $$g(b4, b5, b5), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i6] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                    try {
                        Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = b6;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 36505), 3376 - Gravity.getAbsoluteGravity(0, 0), 17 - KeyEvent.getDeadChar(0, 0), -968507904, false, $$g(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
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
        }
        char[] cArr = new char[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
            Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                byte b8 = (byte) 0;
                byte b9 = b8;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (36505 - View.resolveSizeAndState(0, 0, 0)), 3376 - (ViewConfiguration.getJumpTapTimeout() >> 16), 17 - View.resolveSizeAndState(0, 0, 0), -968507904, false, $$g(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            int i7 = $11 + 45;
            $10 = i7 % 128;
            int i8 = i7 % 2;
        }
        objArr[0] = new String(cArr);
        int i9 = $11 + 111;
        $10 = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 35 / 0;
        }
    }

    public final String component2() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            int i2 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 876;
            int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 10;
            byte[] bArr = $$a;
            byte b2 = bArr[11];
            Object[] objArr2 = new Object[1];
            a((byte) (b2 + 1), bArr[17], (byte) (b2 + 1), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, i2, minimumFlingVelocity, -1199417970, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1, 22 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) (View.resolveSize(0, 0) + 43322), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(22 - (ViewConfiguration.getKeyRepeatDelay() >> 16), ExpandableListView.getPackedPositionType(0L) + 15, (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c2 = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1);
            int minimumFlingVelocity2 = 876 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
            int iArgb = Color.argb(0, 0, 0, 0) + 10;
            byte b3 = $$a[11];
            byte b4 = b3;
            Object[] objArr5 = new Object[1];
            a(b3, b4, b4, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c2, minimumFlingVelocity2, iArgb, 254769921, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i3 = g + 23;
            b = i3 % 128;
            int i4 = i3 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c3 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                int defaultSize = View.getDefaultSize(0, 0) + 876;
                int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 10;
                byte[] bArr2 = $$a;
                byte b5 = bArr2[11];
                byte b6 = bArr2[12];
                Object[] objArr6 = new Object[1];
                a(b5, b6, (byte) (b6 >>> 2), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c3, defaultSize, iKeyCodeFromString, 1324201839, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i5 = ((((-1879649100) + (((~((~elapsedCpuTime) | (-536887825))) | (~((-93978638) | elapsedCpuTime))) * (-302))) + ((~((-536887825) | elapsedCpuTime)) * (-604))) + (((~(elapsedCpuTime | (-630866462))) | (-765155328)) * 302)) - 1903702344;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArr[1])[0] = i7 ^ (i7 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c(38 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), View.MeasureSpec.getMode(0) + 16, (char) (View.resolveSize(0, 0) + 40020), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 52, TextUtils.getOffsetAfter("", 0) + 16, (char) (19981 - ExpandableListView.getPackedPositionChild(0L)), objArr9);
            try {
                Object[] objArr10 = {Integer.valueOf(((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue()), -1903702344};
                byte[] bArr3 = $$d;
                byte b7 = bArr3[69];
                Object[] objArr11 = new Object[1];
                d(b7, b7, bArr3[8], objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                byte b8 = bArr3[8];
                Object[] objArr12 = new Object[1];
                d(b8, b8, bArr3[69], objArr12);
                objArr = (Object[]) cls3.getMethod((String) objArr12[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cBlue = (char) Color.blue(0);
                    int i8 = 877 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                    int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 10;
                    byte[] bArr4 = $$a;
                    byte b9 = bArr4[11];
                    byte b10 = bArr4[12];
                    Object[] objArr13 = new Object[1];
                    a(b9, b10, (byte) (b10 >>> 2), objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cBlue, i8, scrollDefaultDelay, 1324201839, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    c(KeyEvent.normalizeMetaState(0), 22 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 43322), objArr14);
                    Class<?> cls4 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    c(Gravity.getAbsoluteGravity(0, 0) + 22, 15 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) TextUtils.indexOf("", "", 0), objArr15);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char gidForName = (char) ((-1) - Process.getGidForName(""));
                        int jumpTapTimeout = 876 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 11;
                        byte b11 = $$a[11];
                        byte b12 = b11;
                        Object[] objArr16 = new Object[1];
                        a(b11, b12, b12, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(gidForName, jumpTapTimeout, iLastIndexOf, 254769921, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cGreen = (char) Color.green(0);
                        int maxKeyCode = 876 - (KeyEvent.getMaxKeyCode() >> 16);
                        int absoluteGravity = 10 - Gravity.getAbsoluteGravity(0, 0);
                        byte[] bArr5 = $$a;
                        byte b13 = bArr5[11];
                        Object[] objArr17 = new Object[1];
                        a((byte) (b13 + 1), bArr5[17], (byte) (b13 + 1), objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cGreen, maxKeyCode, absoluteGravity, -1199417970, false, (String) objArr17[0], null);
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
        int i9 = ((int[]) objArr[2])[0];
        int i10 = ((int[]) objArr[0])[0];
        if (i10 == i9) {
            int i11 = ((int[]) objArr[1])[0];
            Object[] objArr18 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i12 = 1427876132 + ((~(iIdentityHashCode | 440933337)) * 216);
            int i13 = ~iIdentityHashCode;
            int i14 = i11 + i12 + ((535371741 | i13) * (-216)) + (((~(i13 | 440933337)) | (-400623109)) * 216);
            int i15 = (i14 << 13) ^ i14;
            int i16 = i15 ^ (i15 >>> 17);
            ((int[]) objArr18[1])[0] = i16 ^ (i16 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[3];
            if (strArr != null) {
                int i17 = g + 113;
                b = i17 % 128;
                int i18 = i17 % 2 != 0 ? 1 : 0;
                while (i18 < strArr.length) {
                    arrayList.add(strArr[i18]);
                    i18++;
                    int i19 = g + 73;
                    b = i19 % 128;
                    int i20 = i19 % 2;
                }
            }
            int[] iArr = new int[i10];
            int i21 = i10 - 1;
            iArr[i21] = 1;
            Toast.makeText((Context) null, iArr[((i10 * i21) % 2) - 1], 1).show();
            int i22 = ((int[]) objArr[1])[0];
            Object[] objArr19 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iMyPid = Process.myPid();
            int i23 = ~iMyPid;
            int i24 = i22 + (-219778240) + (((~(483668405 | i23)) | 523978634) * 226) + (((~(i23 | 536836031)) | (~((-523978635) | iMyPid)) | 470811008) * (-113)) + ((~(iMyPid | 483668405)) * 113);
            int i25 = (i24 << 13) ^ i24;
            int i26 = i25 ^ (i25 >>> 17);
            ((int[]) objArr19[1])[0] = i26 ^ (i26 << 5);
        }
        return this.refreshToken;
    }

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        TuitionPaymentFragmentbindingInflater1();
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ LoginItem copy$default(LoginItem loginItem, String str, String str2, String str3, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = b + 85;
            g = i3 % 128;
            int i4 = i3 % 2;
            str = loginItem.accessToken;
        }
        if ((i & 2) != 0) {
            str2 = loginItem.refreshToken;
        }
        if ((i & 4) != 0) {
            int i5 = g + 83;
            int i6 = i5 % 128;
            b = i6;
            int i7 = i5 % 2;
            str3 = loginItem.activationChecksum;
            int i8 = i6 + 77;
            g = i8 % 128;
            int i9 = i8 % 2;
        }
        LoginItem loginItemCopy = loginItem.copy(str, str2, str3);
        int i10 = b + 115;
        g = i10 % 128;
        int i11 = i10 % 2;
        return loginItemCopy;
    }

    public final String component1() {
        String str;
        int i = 2 % 2;
        int i2 = b + 63;
        int i3 = i2 % 128;
        g = i3;
        if (i2 % 2 == 0) {
            str = this.accessToken;
            int i4 = 50 / 0;
        } else {
            str = this.accessToken;
        }
        int i5 = i3 + 11;
        b = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = b + 81;
        int i3 = i2 % 128;
        g = i3;
        int i4 = i2 % 2;
        String str = this.activationChecksum;
        int i5 = i3 + 119;
        b = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final LoginItem copy(String p0, String p1, String p2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p2, "");
        LoginItem loginItem = new LoginItem(p0, p1, p2);
        int i2 = b + 121;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            return loginItem;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object p0) {
        int i = 2 % 2;
        if (this == p0) {
            int i2 = b + 93;
            g = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!(p0 instanceof LoginItem)) {
            return false;
        }
        LoginItem loginItem = (LoginItem) p0;
        if (Intrinsics.areEqual(this.accessToken, loginItem.accessToken)) {
            if (!Intrinsics.areEqual(this.refreshToken, loginItem.refreshToken)) {
                int i3 = g + 9;
                b = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.activationChecksum, loginItem.activationChecksum)) {
                return true;
            }
            int i5 = g + 119;
            b = i5 % 128;
            return i5 % 2 != 0;
        }
        int i6 = g;
        int i7 = i6 + 65;
        b = i7 % 128;
        int i8 = i7 % 2;
        int i9 = i6 + 41;
        b = i9 % 128;
        if (i9 % 2 == 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        String str;
        int iHashCode;
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 11;
        b = i3 % 128;
        int iHashCode2 = 0;
        if (i3 % 2 != 0) {
            str = this.accessToken;
            iHashCode = 1;
            if (str == null) {
                int i4 = i2 + 61;
                b = i4 % 128;
                int i5 = i4 % 2;
            } else {
                iHashCode2 = 1;
                iHashCode = iHashCode2;
                iHashCode2 = str.hashCode();
            }
        } else {
            str = this.accessToken;
            if (str == null) {
                iHashCode = 0;
                int i6 = i2 + 61;
                b = i6 % 128;
                int i7 = i6 % 2;
            } else {
                iHashCode = iHashCode2;
                iHashCode2 = str.hashCode();
            }
        }
        String str2 = this.refreshToken;
        if (str2 != null) {
            iHashCode = str2.hashCode();
        }
        return (((iHashCode2 * 31) + iHashCode) * 31) + this.activationChecksum.hashCode();
    }

    public final String toString() {
        int i = 2 % 2;
        String str = this.accessToken;
        String str2 = this.refreshToken;
        String str3 = this.activationChecksum;
        StringBuilder sb = new StringBuilder("LoginItem(accessToken=");
        sb.append(str);
        sb.append(", refreshToken=");
        sb.append(str2);
        sb.append(", activationChecksum=");
        sb.append(str3);
        sb.append(")");
        String string = sb.toString();
        int i2 = b + 23;
        g = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    static void TuitionPaymentFragmentbindingInflater1() {
        TuitionPaymentFragmentbindingInflater1 = new char[]{6343, 14132, 18234, 38688, 42809, 63267, 1834, 22380, 26409, 46857, 51024, 5921, 9999, 30489, 34586, 55047, 59147, 14169, 18290, 38781, 42869, 63329, 45561, 40460, 60933, 15896, 3615, 24085, 44560, 65066, 52761, 7713, 28200, 48700, 36389, 56893, 11825, 11682, 597, 29254, 41565, 37398, 49736, 12865, 25154, 21071, 33338, 62019, Typography.greaterOrEqual, 4715, 17008, 45669, 57953, 65531, 53258, 40975, 28680, 16406, 4119, 57358, 45071, 32826, 20527, 8249, 61486, 49153, 36913, 24638, 12339};
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2428447297470635616L;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r6, short r7, short r8) {
        /*
            byte[] r0 = com.bpjstku.data.user.model.response.LoginItem.$$c
            int r8 = r8 * 3
            int r8 = 115 - r8
            int r7 = r7 * 4
            int r1 = 1 - r7
            int r6 = r6 * 2
            int r6 = 4 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            int r7 = 0 - r7
            if (r0 != 0) goto L19
            r8 = r6
            r3 = r7
            r4 = r2
            goto L2e
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r6 = -r6
            int r6 = r6 + r3
            int r8 = r8 + 1
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.user.model.response.LoginItem.$$g(int, short, short):java.lang.String");
    }
}
