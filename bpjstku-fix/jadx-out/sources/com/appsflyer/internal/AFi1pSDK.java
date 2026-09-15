package com.appsflyer.internal;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.autofill.HintConstants;
import com.android.volley.ExecutorDelivery;
import com.appsflyer.AFLogger;
import defpackage.abortCapture;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H%¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\fH\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH&¢\u0006\u0004\b\u0010\u0010\u0011R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00128\u0005@\u0004X\u0084\f¢\u0006\u0006\n\u0004\b\u0010\u0010\u0013R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015"}, d2 = {"Lcom/appsflyer/internal/AFi1pSDK;", "", "Landroid/content/Context;", "p0", "<init>", "(Landroid/content/Context;)V", "", "getRevenue", "()Ljava/lang/String;", "Lcom/appsflyer/internal/AFi1rSDK;", "getMediationNetwork", "()Lcom/appsflyer/internal/AFi1rSDK;", "Landroid/net/NetworkInfo;", "", "v_", "(Landroid/net/NetworkInfo;)Z", "getMonetizationNetwork", "()Z", "Landroid/net/ConnectivityManager;", "Landroid/net/ConnectivityManager;", "Landroid/telephony/TelephonyManager;", "Landroid/telephony/TelephonyManager;", "getCurrencyIso4217Code", "AFa1uSDK"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class AFi1pSDK {

    /* JADX INFO: renamed from: AFa1uSDK, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: getMonetizationNetwork, reason: from kotlin metadata */
    ConnectivityManager getMediationNetwork;

    /* JADX INFO: renamed from: getRevenue, reason: from kotlin metadata */
    private final TelephonyManager getCurrencyIso4217Code;

    public abstract boolean getMonetizationNetwork();

    protected abstract String getRevenue();

    public AFi1pSDK(Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        Object systemService = context.getSystemService("connectivity");
        this.getMediationNetwork = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        Object systemService2 = context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
        this.getCurrencyIso4217Code = systemService2 instanceof TelephonyManager ? (TelephonyManager) systemService2 : null;
    }

    protected static boolean v_(NetworkInfo p0) {
        if (p0 != null) {
            return p0.isConnectedOrConnecting();
        }
        return false;
    }

    public final AFi1rSDK getMediationNetwork() {
        String simOperatorName;
        String networkOperatorName = null;
        try {
            TelephonyManager telephonyManager = this.getCurrencyIso4217Code;
            if (telephonyManager != null) {
                simOperatorName = telephonyManager.getSimOperatorName();
                try {
                    networkOperatorName = telephonyManager.getNetworkOperatorName();
                    String str = networkOperatorName;
                    if ((str == null || str.length() == 0) && telephonyManager.getPhoneType() == 2) {
                        networkOperatorName = "CDMA";
                    }
                } catch (Throwable th) {
                    th = th;
                    AFLogger.afErrorLog("Exception while collecting network info. ", th);
                }
            } else {
                simOperatorName = null;
            }
        } catch (Throwable th2) {
            th = th2;
            simOperatorName = null;
        }
        return new AFi1rSDK(getRevenue(), networkOperatorName, simOperatorName, getMonetizationNetwork());
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFi1pSDK$AFa1uSDK, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/appsflyer/internal/AFi1pSDK$AFa1uSDK;", "", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private static final byte[] $$c = {21, ByteCompanionObject.MAX_VALUE, 49, -115};
        private static final int $$d = 179;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$a = {113, 29, -123, -97, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
        private static final int $$b = 98;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
        private static long TuitionPaymentFragmentbindingInflater1 = 3103703343899416984L;

        /* JADX WARN: Code duplicated, block: B:10:0x0022  */
        /* JADX WARN: Code duplicated, block: B:8:0x001a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void b(byte r5, byte r6, short r7, java.lang.Object[] r8) {
            /*
                int r5 = r5 * 14
                int r5 = r5 + 84
                byte[] r0 = com.appsflyer.internal.AFi1pSDK.Companion.$$a
                int r1 = r6 + 1
                int r7 = 144 - r7
                byte[] r1 = new byte[r1]
                r2 = 0
                if (r0 != 0) goto L12
                r4 = r6
                r3 = r2
                goto L26
            L12:
                r3 = r2
            L13:
                byte r4 = (byte) r5
                r1[r3] = r4
                int r7 = r7 + 1
                if (r3 != r6) goto L22
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                r8[r2] = r5
                return
            L22:
                int r3 = r3 + 1
                r4 = r0[r7]
            L26:
                int r4 = -r4
                int r5 = r5 + r4
                int r5 = r5 + (-11)
                goto L13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFi1pSDK.Companion.b(byte, byte, short, java.lang.Object[]):void");
        }

        private Companion() {
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            abortCapture abortcapture = new abortCapture();
            char[] cArrB = abortCapture.b(TuitionPaymentFragmentbindingInflater1 ^ (-2687588926731523482L), cArr, i);
            abortcapture.b = 4;
            int i3 = $11 + 69;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            while (abortcapture.b < cArrB.length) {
                int i5 = $11 + 25;
                $10 = i5 % 128;
                int i6 = i5 % 2;
                abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
                int i7 = abortcapture.b;
                try {
                    Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(TuitionPaymentFragmentbindingInflater1)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 64837), View.getDefaultSize(0, 0) + 1356, Drawable.resolveOpacity(0, 0) + 38, 894276454, false, $$e(b, b2, b2), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                    }
                    cArrB[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    try {
                        Object[] objArr3 = {abortcapture, abortcapture};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 47773), ExpandableListView.getPackedPositionGroup(0L) + 468, TextUtils.indexOf((CharSequence) "", '0') + 14, 896083767, false, "n", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
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
            }
            objArr[0] = new String(cArrB, 4, cArrB.length - 4);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:107:0x04a1 A[PHI: r16
  0x04a1: PHI (r16v9 ??) = (r16v8 ??), (r16v11 ??), (r16v12 ??) binds: [B:106:0x049f, B:124:0x04a1, B:95:0x0477] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:110:0x04dc  */
        /* JADX WARN: Code duplicated, block: B:113:0x0544  */
        /* JADX WARN: Code duplicated, block: B:114:0x056b  */
        /* JADX WARN: Code duplicated, block: B:41:0x01e9 A[PHI: r16
  0x01e9: PHI (r16v18 java.lang.String) = (r16v29 java.lang.String), (r16v30 java.lang.String) binds: [B:40:0x01e7, B:34:0x01a0] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:43:0x01f2  */
        /* JADX WARN: Code duplicated, block: B:49:0x024d A[PHI: r16
  0x024d: PHI (r16v7 ??) = (r16v32 ??), (r16v33 ??) binds: [B:47:0x0239, B:45:0x0233] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:53:0x0256  */
        /* JADX WARN: Code duplicated, block: B:55:0x0266 A[Catch: Exception -> 0x049f, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x049f, blocks: (B:50:0x024f, B:55:0x0266, B:72:0x0343, B:62:0x02d1, B:64:0x02d7, B:65:0x02d8, B:66:0x02d9, B:56:0x0278, B:58:0x0285, B:59:0x02c2), top: B:127:0x024f, inners: #0 }] */
        /* JADX WARN: Code duplicated, block: B:58:0x0285 A[Catch: all -> 0x02d0, TryCatch #0 {all -> 0x02d0, blocks: (B:56:0x0278, B:58:0x0285, B:59:0x02c2), top: B:125:0x0278, outer: #1 }] */
        /* JADX WARN: Code duplicated, block: B:66:0x02d9 A[Catch: Exception -> 0x049f, TRY_LEAVE, TryCatch #1 {Exception -> 0x049f, blocks: (B:50:0x024f, B:55:0x0266, B:72:0x0343, B:62:0x02d1, B:64:0x02d7, B:65:0x02d8, B:66:0x02d9, B:56:0x0278, B:58:0x0285, B:59:0x02c2), top: B:127:0x024f, inners: #0 }] */
        /* JADX WARN: Code duplicated, block: B:69:0x02f8 A[Catch: all -> 0x03eb, TryCatch #6 {all -> 0x03eb, blocks: (B:67:0x02eb, B:69:0x02f8, B:70:0x0332), top: B:136:0x02eb, outer: #7 }] */
        /* JADX WARN: Code duplicated, block: B:75:0x03bb  */
        /* JADX WARN: Code duplicated, block: B:77:0x03e3 A[Catch: Exception -> 0x04a1, TRY_LEAVE, TryCatch #7 {Exception -> 0x04a1, blocks: (B:76:0x03bc, B:77:0x03e3, B:79:0x03e7, B:85:0x03ee, B:87:0x03f4, B:88:0x03f5, B:89:0x03f6, B:94:0x0473, B:102:0x0497, B:104:0x049d, B:105:0x049e, B:90:0x0421, B:92:0x042e, B:93:0x046c, B:67:0x02eb, B:69:0x02f8, B:70:0x0332), top: B:138:0x0254, inners: #2, #6 }] */
        /* JADX WARN: Code duplicated, block: B:89:0x03f6 A[Catch: Exception -> 0x04a1, TRY_LEAVE, TryCatch #7 {Exception -> 0x04a1, blocks: (B:76:0x03bc, B:77:0x03e3, B:79:0x03e7, B:85:0x03ee, B:87:0x03f4, B:88:0x03f5, B:89:0x03f6, B:94:0x0473, B:102:0x0497, B:104:0x049d, B:105:0x049e, B:90:0x0421, B:92:0x042e, B:93:0x046c, B:67:0x02eb, B:69:0x02f8, B:70:0x0332), top: B:138:0x0254, inners: #2, #6 }] */
        /* JADX WARN: Code duplicated, block: B:92:0x042e A[Catch: all -> 0x0496, TryCatch #2 {all -> 0x0496, blocks: (B:90:0x0421, B:92:0x042e, B:93:0x046c), top: B:128:0x0421, outer: #7 }] */
        /* JADX WARN: Code duplicated, block: B:96:0x0479  */
        /* JADX WARN: Code duplicated, block: B:98:0x0485  */
        /* JADX WARN: Code duplicated, block: B:99:0x0487  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r16v10 */
        /* JADX WARN: Type inference failed for: r16v11 */
        /* JADX WARN: Type inference failed for: r16v12 */
        /* JADX WARN: Type inference failed for: r16v14 */
        /* JADX WARN: Type inference failed for: r16v16 */
        /* JADX WARN: Type inference failed for: r16v32 */
        /* JADX WARN: Type inference failed for: r16v33 */
        /* JADX WARN: Type inference failed for: r16v34 */
        /* JADX WARN: Type inference failed for: r16v35 */
        /* JADX WARN: Type inference failed for: r16v36 */
        /* JADX WARN: Type inference failed for: r16v37 */
        /* JADX WARN: Type inference failed for: r16v38 */
        /* JADX WARN: Type inference failed for: r16v39 */
        /* JADX WARN: Type inference failed for: r16v5 */
        /* JADX WARN: Type inference failed for: r16v6 */
        /* JADX WARN: Type inference failed for: r16v7 */
        /* JADX WARN: Type inference failed for: r16v8 */
        /* JADX WARN: Type inference failed for: r16v9 */
        /* JADX WARN: Type inference failed for: r3v24 */
        /* JADX WARN: Type inference failed for: r4v7 */
        public static Object[] TuitionPaymentFragmentbindingInflater1(Context context, int i, int i2, int i3) throws Throwable {
            int i4;
            String str;
            String str2;
            int i5;
            ?? r16;
            int i6;
            int i7;
            int i8;
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i9;
            ?? r17;
            int i10;
            ?? r18;
            int i11;
            String str3;
            Object[] objArr;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i12;
            int i13;
            int i14;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
            long jLongValue;
            long j;
            int i15;
            int i16;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
            String str4;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6;
            String str5;
            String str6;
            String str7;
            int i17;
            int i18;
            int i19 = 2 % 2;
            int i20 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i21 = (i20 ^ 91) + ((i20 & 91) << 1);
            int i22 = i21 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i22;
            Object obj = null;
            if (i21 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            if (context != null) {
                int i23 = ((i22 | 11) << 1) - (i22 ^ 11);
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i23 % 128;
                if (i23 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                int i24 = i22 + 91;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i24 % 128;
                int i25 = i24 % 2;
                try {
                    Object[] objArr2 = new Object[1];
                    a(new char[]{33444, 33477, 9764, 23822, 53166, 19763, 5675, 3334, 49146, 7479, 54708, 47766, 17973, 15636, 28600, 60713, 46652, 5158, 60678, 24554, 48391, 58885, 40228, 3976, 36121, 54810, 19766}, ViewConfiguration.getKeyRepeatDelay() >> 16, objArr2);
                    Class<?> cls = Class.forName((String) objArr2[0]);
                    Object[] objArr3 = new Object[1];
                    a(new char[]{57848, 57759, 3061, 7784, 37325, 11888, 15336, 20088, 57837, 32363, 63598, 63968, 27617, 32376, 12789, 36479, 39910, 19062, 44621, 506, 56958, 52191}, ViewConfiguration.getMaximumFlingVelocity() >> 16, objArr3);
                    Object objInvoke = cls.getMethod((String) objArr3[0], null).invoke(context, null);
                    Object[] objArr4 = new Object[1];
                    a(new char[]{33480, 33449, 37537, 64641, 65253, 19807, 41646, 44169, 36529, 7515, 24881, 6937, 62128, 40091, 24307, 60741, 697, 9581, 19593, 28321, 48472, 21122, 15595, 16118, 36192, 25239, 60577, 52950, 23931, 45726, 56481, 40654, 11631, 49817, 35988, 44737, 64878, 4832}, TextUtils.getOffsetBefore("", 0), objArr4);
                    Class<?> cls2 = Class.forName((String) objArr4[0]);
                    Object[] objArr5 = new Object[1];
                    a(new char[]{46510, 46536, 55829, 28806, 58985, 31269, 10631, 38683, 15860}, MotionEvent.axisFromString("") + 1, objArr5);
                    int i26 = cls2.getField((String) objArr5[0]).getInt(objInvoke);
                    int i27 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 23;
                    int i28 = i27 % 128;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i28;
                    if (i27 % 2 != 0) {
                        int i29 = i26 & 3;
                        i17 = (i & (-2)) | ((~i) & 1);
                        int i30 = -i29;
                        int i31 = (i29 & i30) | (i29 ^ i30);
                        i18 = (i31 & (-51)) + (i31 | (-51));
                    } else {
                        int i32 = i26 & 2;
                        i17 = (~(i & 1)) & (i | 1);
                        int i33 = -i32;
                        i18 = ((i32 & i33) | (i32 ^ i33)) >> 31;
                    }
                    int i34 = (~i18) & i;
                    int i35 = i17 & i18;
                    int i36 = (i34 & i35) | (i34 ^ i35);
                    int i37 = (i28 & 63) + (i28 | 63);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i37 % 128;
                    int i38 = i37 % 2;
                    int i39 = (i28 & 13) + (i28 | 13);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i39 % 128;
                    int i40 = i39 % 2;
                    i4 = i36;
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
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1122237249);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char keyRepeatTimeout = (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 16949);
                    int mode = 2739 - View.MeasureSpec.getMode(0);
                    int iMyPid = (Process.myPid() >> 22) + 13;
                    byte b = $$a[7];
                    Object[] objArr6 = new Object[1];
                    b(b, (byte) (b | 52), (short) 141, objArr6);
                    str7 = (String) objArr6[0];
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(keyRepeatTimeout, mode, iMyPid, 1501733736, false, str7, new Class[0]);
                }
                Set set = (Set) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, null);
                int i41 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                int i42 = (i41 ^ 87) + ((i41 & 87) << 1);
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i42 % 128;
                if (i42 % 2 == 0) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-431688923);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        str = str7;
                        char trimmedLength = (char) (16949 - TextUtils.getTrimmedLength(""));
                        int iResolveSizeAndState = 2739 - View.resolveSizeAndState(0, 0, 0);
                        int iBlue = Color.blue(0) + 13;
                        byte b2 = $$a[7];
                        Object[] objArr7 = new Object[1];
                        b(b2, (byte) (b2 | 52), (short) 89, objArr7);
                        String str8 = (String) objArr7[0];
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(trimmedLength, iResolveSizeAndState, iBlue, 47863026, false, str8, null);
                        str = str8;
                    }
                    str = str7;
                    str4 = str;
                    str2 = str;
                    if (!set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).get(null))) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1056710067);
                        str5 = str4;
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char cKeyCodeFromString = (char) (16949 - KeyEvent.keyCodeFromString(""));
                            int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 2739;
                            int i43 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 13;
                            byte b3 = $$a[7];
                            byte b4 = (byte) (b3 | 37);
                            Object[] objArr8 = new Object[1];
                            b(b3, b4, b4, objArr8);
                            str5 = null;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cKeyCodeFromString, maximumDrawingCacheSize, i43, 631063962, false, (String) objArr8[0], null);
                        }
                        r17 = str5;
                        str2 = str5;
                        if (set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null))) {
                            if (Build.VERSION.SDK_INT > 33) {
                                int i44 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                i14 = (i44 ^ 29) + ((i44 & 29) << 1);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i14 % 128;
                                if (i14 % 2 == 0) {
                                    Object[] objArr9 = new Object[1];
                                    a(new char[]{43604, 43643, 50877, 31491, 54651, 25987, 63161, 11025, 42361, 13776, 13606, 40075, 42727, 6923, 30052, 50647, 22180, 3810, 52034, 17764, 38353, 1690, 47906, 5471, 42475, 13969, 27453, 58716, 30177, 59078, 23349, 46411}, TextUtils.indexOf("", "", 1, 0), objArr9);
                                    Object[] objArr10 = {(String) objArr9[0]};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                        char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0'));
                                        int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 993;
                                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 9;
                                        byte[] bArr = $$a;
                                        byte b5 = bArr[5];
                                        byte b6 = bArr[7];
                                        Object[] objArr11 = new Object[1];
                                        b(b5, b6, b6, objArr11);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, keyRepeatDelay, iIndexOf, 410748506, false, (String) objArr11[0], new Class[]{String.class});
                                    }
                                    jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr10)).longValue();
                                } else {
                                    Object[] objArr12 = new Object[1];
                                    a(new char[]{43604, 43643, 50877, 31491, 54651, 25987, 63161, 11025, 42361, 13776, 13606, 40075, 42727, 6923, 30052, 50647, 22180, 3810, 52034, 17764, 38353, 1690, 47906, 5471, 42475, 13969, 27453, 58716, 30177, 59078, 23349, 46411}, TextUtils.indexOf("", "", 0, 0), objArr12);
                                    Object[] objArr13 = {(String) objArr12[0]};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                    r17 = r17;
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                        char c = (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                                        int gidForName = 992 - Process.getGidForName("");
                                        int offsetAfter = 8 - TextUtils.getOffsetAfter("", 0);
                                        byte[] bArr2 = $$a;
                                        byte b7 = bArr2[5];
                                        byte b8 = bArr2[7];
                                        Object[] objArr14 = new Object[1];
                                        b(b7, b8, b8, objArr14);
                                        Class[] clsArr = {String.class};
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, gidForName, offsetAfter, 410748506, false, (String) objArr14[0], clsArr);
                                        r17 = clsArr;
                                    }
                                    jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr13)).longValue();
                                }
                                long j2 = 1230013789;
                                r18 = i4;
                                long j3 = -1;
                                long j4 = j2 ^ j3;
                                long j5 = (int) Runtime.getRuntime().totalMemory();
                                long j6 = (((long) 284) * j2) + (((long) (-282)) * jLongValue) + (((long) (-283)) * (((j4 | jLongValue) ^ j3) | ((j4 | j5) ^ j3)));
                                long j7 = 283;
                                long j8 = jLongValue ^ j3;
                                j = j6 + (((j8 | j2) ^ j3) * j7) + (j7 * (j3 ^ ((j4 | j8) | j5))) + ((long) (-1430932026));
                                int i45 = ~i;
                                i15 = ((int) (j >> 32)) & (1676143434 + (((~(i45 | (-674216794))) | (~((-2111443205) | i45)) | 671748352) * 464) + (((-1439694853) | i) * (-464)) + (((~((-674216794) | i)) | 671748352) * 464));
                                i16 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 65;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i16 % 128;
                                if (i16 % 2 != 0) {
                                    Process.myTid();
                                    throw null;
                                }
                                int i46 = (int) j;
                                int startUptimeMillis = (int) Process.getStartUptimeMillis();
                                int i47 = ~(1879031295 | startUptimeMillis);
                                int i48 = i46 & (1677087393 + ((22349893 | i47) * (-476)) + (i47 * 952) + ((~((~startUptimeMillis) | 1879031295)) * 476));
                                i10 = (i15 & i48) | (i15 ^ i48);
                            } else {
                                r17 = i4;
                                Object[] objArr15 = new Object[1];
                                a(new char[]{6701, 6684, 44746, 32252, 810}, ViewConfiguration.getScrollDefaultDelay() >> 16, objArr15);
                                str3 = (String) objArr15[0];
                                Object[] objArr16 = new Object[1];
                                a(new char[]{10109, 9999, 25164, 29373, 48320, 59616, 21065, 8942, 52427, 47338, 37341, 38255, 594, 4833, 7384, 18672, 26462}, Drawable.resolveOpacity(0, 0), objArr16);
                                objArr = new Object[]{(String) objArr16[0]};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    char defaultSize = (char) (33602 - View.getDefaultSize(0, 0));
                                    int i49 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 3085;
                                    int longPressTimeout = 26 - (ViewConfiguration.getLongPressTimeout() >> 16);
                                    byte[] bArr3 = $$a;
                                    byte b9 = bArr3[5];
                                    byte b10 = bArr3[7];
                                    Object[] objArr17 = new Object[1];
                                    b(b9, b10, b10, objArr17);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(defaultSize, i49, longPressTimeout, 1411172903, false, (String) objArr17[0], new Class[]{String.class});
                                }
                                if (str3.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr))) {
                                    i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 31;
                                    int i50 = i12 % 128;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i50;
                                    if (i12 % 2 != 0) {
                                        i13 = 1;
                                    } else {
                                        i13 = 0;
                                    }
                                    i10 = i13 ^ 1;
                                    int i51 = (i50 ^ 91) + ((i50 & 91) << 1);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i51 % 128;
                                    int i52 = i51 % 2;
                                    r18 = r17;
                                } else {
                                    i10 = 0;
                                    r18 = r17;
                                }
                            }
                            int i53 = (~(i & 10)) & (i | 10);
                            int i54 = -i10;
                            int i55 = ((i10 & i54) | (i10 ^ i54)) >> 31;
                            int i56 = (~i55) & i;
                            int i57 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 77;
                            int i58 = i57 % 128;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i58;
                            int i59 = i57 % 2;
                            int i60 = i55 & i53;
                            int i61 = (i60 & i56) | (i56 ^ i60);
                            int i62 = i2 & 32;
                            int i63 = -i62;
                            int i64 = ((i62 & i63) | (i62 ^ i63)) >> 31;
                            int i65 = i58 + 117;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i65 % 128;
                            i11 = i65 % 2;
                            int i66 = i61 & (~i64);
                            int i67 = i64 & i;
                            i5 = (i66 & i67) | (i66 ^ i67);
                            r16 = r18;
                            if (i11 != 0) {
                                int i68 = 77 / 0;
                                r16 = r18;
                            }
                        }
                    }
                    int i69 = (~((i & r16) == true ? 1 : 0)) & ((i | r16) == true ? 1 : 0);
                    int i70 = -i69;
                    int i71 = ((i69 & i70) | (i69 ^ i70)) >> 31;
                    int i72 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int i73 = (i72 & 63) + (i72 | 63);
                    int i74 = i73 % 128;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i74;
                    int i75 = i73 % 2;
                    int i76 = i5 & (~i71);
                    int i77 = r16 & i71;
                    int i78 = (i76 & i77) | (i76 ^ i77);
                    int i79 = ((i74 | 111) << 1) - (i74 ^ 111);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i79 % 128;
                    int i80 = i79 % 2;
                    int i81 = (~(i & i78)) & (i | i78);
                    int i82 = -i81;
                    i6 = (((i81 & i82) | (i81 ^ i82)) >> 31) & 16;
                    Object[] objArr18 = {new int[]{i}, new int[1], new int[]{i78}, null};
                    i7 = i74 + 55;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
                    if (i7 % 2 != 0) {
                        i8 = ((((-875256932) + (((~i) | 69945368) * 1324)) + (((~(205212092 | i)) | (~(i | (-164901864)))) * (-1324))) - 1497786856) >>> i6;
                        iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        i9 = 989 % i8;
                    } else {
                        int i83 = 1276525265 + (((~(i | (-999755381))) | 1040065609) * 191) + (((~((-999755381) | (~i))) | 966132800) * 191);
                        int i84 = -(-i6);
                        i8 = (i84 | i83) + (i83 & i84);
                        iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        i9 = i8 * 989;
                    }
                    int i85 = (-987) * i3;
                    int i86 = (i9 ^ i85) + ((i9 & i85) << 1);
                    int i87 = ~i3;
                    int i88 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    int i89 = (i88 & i87) | (i87 ^ i88);
                    int i90 = ~((i89 & i8) | (i89 ^ i8));
                    int i91 = i8 | i3;
                    int i92 = ~((i91 & iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (i91 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                    int i93 = (i86 - (~(-(-(((i90 & i92) | (i90 ^ i92)) * 988))))) - 1;
                    int i94 = -(-((i8 | i87) * (-988)));
                    int i95 = ((i93 | i94) << 1) - (i94 ^ i93);
                    int i96 = ~((~i8) | i87);
                    int i97 = ~((i87 & iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (i87 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                    int i98 = (i97 & i96) | (i96 ^ i97);
                    int i99 = ~(i8 | (~iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | i3);
                    int i100 = ((i99 & i98) | (i98 ^ i99)) * 988;
                    int i101 = ((i95 | i100) << 1) - (i100 ^ i95);
                    int i102 = i101 << 13;
                    int i103 = (i102 | i101) & (~(i101 & i102));
                    int i104 = i103 >>> 17;
                    int i105 = ((~i103) & i104) | ((~i104) & i103);
                    int i106 = i105 << 5;
                    ((int[]) objArr18[1])[0] = ((~i105) & i106) | ((~i106) & i105);
                    return objArr18;
                }
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-431688923);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                    str6 = str7;
                    char gidForName2 = (char) (16948 - Process.getGidForName(""));
                    int i107 = 2740 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                    int iRed = Color.red(0) + 13;
                    byte b11 = $$a[7];
                    Object[] objArr19 = new Object[1];
                    b(b11, (byte) (b11 | 52), (short) 89, objArr19);
                    String str9 = (String) objArr19[0];
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(gidForName2, i107, iRed, 47863026, false, str9, null);
                    str6 = str9;
                }
                str6 = str7;
                boolean zContains = set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).get(null));
                int i108 = 73 / 0;
                str4 = str6;
                str2 = str6;
                if (!zContains) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1056710067);
                    str5 = str4;
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cKeyCodeFromString2 = (char) (16949 - KeyEvent.keyCodeFromString(""));
                        int maximumDrawingCacheSize2 = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 2739;
                        int i410 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 13;
                        byte b12 = $$a[7];
                        byte b13 = (byte) (b12 | 37);
                        Object[] objArr20 = new Object[1];
                        b(b12, b13, b13, objArr20);
                        str5 = null;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cKeyCodeFromString2, maximumDrawingCacheSize2, i410, 631063962, false, (String) objArr20[0], null);
                    }
                    r17 = str5;
                    str2 = str5;
                    if (set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null))) {
                        try {
                            try {
                                if (Build.VERSION.SDK_INT > 33) {
                                    int i411 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                    i14 = (i411 ^ 29) + ((i411 & 29) << 1);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i14 % 128;
                                    if (i14 % 2 == 0) {
                                        Object[] objArr21 = new Object[1];
                                        a(new char[]{43604, 43643, 50877, 31491, 54651, 25987, 63161, 11025, 42361, 13776, 13606, 40075, 42727, 6923, 30052, 50647, 22180, 3810, 52034, 17764, 38353, 1690, 47906, 5471, 42475, 13969, 27453, 58716, 30177, 59078, 23349, 46411}, TextUtils.indexOf("", "", 1, 0), objArr21);
                                        try {
                                            Object[] objArr110 = {(String) objArr21[0]};
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                char cIndexOf2 = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0'));
                                                int keyRepeatDelay2 = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 993;
                                                int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0') + 9;
                                                byte[] bArr4 = $$a;
                                                byte b14 = bArr4[5];
                                                byte b15 = bArr4[7];
                                                Object[] objArr111 = new Object[1];
                                                b(b14, b15, b15, objArr111);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf2, keyRepeatDelay2, iIndexOf2, 410748506, false, (String) objArr111[0], new Class[]{String.class});
                                            }
                                            jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr110)).longValue();
                                        } catch (Throwable th2) {
                                            Throwable cause2 = th2.getCause();
                                            if (cause2 != null) {
                                                throw cause2;
                                            }
                                            throw th2;
                                        }
                                    } else {
                                        Object[] objArr112 = new Object[1];
                                        a(new char[]{43604, 43643, 50877, 31491, 54651, 25987, 63161, 11025, 42361, 13776, 13606, 40075, 42727, 6923, 30052, 50647, 22180, 3810, 52034, 17764, 38353, 1690, 47906, 5471, 42475, 13969, 27453, 58716, 30177, 59078, 23349, 46411}, TextUtils.indexOf("", "", 0, 0), objArr112);
                                        try {
                                            Object[] objArr113 = {(String) objArr112[0]};
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                            r17 = r17;
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                char c2 = (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                                                int gidForName3 = 992 - Process.getGidForName("");
                                                int offsetAfter2 = 8 - TextUtils.getOffsetAfter("", 0);
                                                byte[] bArr5 = $$a;
                                                byte b16 = bArr5[5];
                                                byte b17 = bArr5[7];
                                                Object[] objArr114 = new Object[1];
                                                b(b16, b17, b17, objArr114);
                                                Class[] clsArr2 = {String.class};
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c2, gidForName3, offsetAfter2, 410748506, false, (String) objArr114[0], clsArr2);
                                                r17 = clsArr2;
                                            }
                                            jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr113)).longValue();
                                        } catch (Throwable th3) {
                                            Throwable cause3 = th3.getCause();
                                            if (cause3 != null) {
                                                throw cause3;
                                            }
                                            throw th3;
                                        }
                                    }
                                    long j9 = 1230013789;
                                    r18 = i4;
                                    long j10 = -1;
                                    long j11 = j9 ^ j10;
                                    long j12 = (int) Runtime.getRuntime().totalMemory();
                                    long j13 = (((long) 284) * j9) + (((long) (-282)) * jLongValue) + (((long) (-283)) * (((j11 | jLongValue) ^ j10) | ((j11 | j12) ^ j10)));
                                    long j14 = 283;
                                    long j15 = jLongValue ^ j10;
                                    j = j13 + (((j15 | j9) ^ j10) * j14) + (j14 * (j10 ^ ((j11 | j15) | j12))) + ((long) (-1430932026));
                                    int i412 = ~i;
                                    i15 = ((int) (j >> 32)) & (1676143434 + (((~(i412 | (-674216794))) | (~((-2111443205) | i412)) | 671748352) * 464) + (((-1439694853) | i) * (-464)) + (((~((-674216794) | i)) | 671748352) * 464));
                                    i16 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 65;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i16 % 128;
                                    if (i16 % 2 != 0) {
                                        Process.myTid();
                                        throw null;
                                    }
                                    int i413 = (int) j;
                                    int startUptimeMillis2 = (int) Process.getStartUptimeMillis();
                                    int i414 = ~(1879031295 | startUptimeMillis2);
                                    int i415 = i413 & (1677087393 + ((22349893 | i414) * (-476)) + (i414 * 952) + ((~((~startUptimeMillis2) | 1879031295)) * 476));
                                    i10 = (i15 & i415) | (i15 ^ i415);
                                } else {
                                    r17 = i4;
                                    Object[] objArr115 = new Object[1];
                                    a(new char[]{6701, 6684, 44746, 32252, 810}, ViewConfiguration.getScrollDefaultDelay() >> 16, objArr115);
                                    str3 = (String) objArr115[0];
                                    Object[] objArr116 = new Object[1];
                                    a(new char[]{10109, 9999, 25164, 29373, 48320, 59616, 21065, 8942, 52427, 47338, 37341, 38255, 594, 4833, 7384, 18672, 26462}, Drawable.resolveOpacity(0, 0), objArr116);
                                    try {
                                        objArr = new Object[]{(String) objArr116[0]};
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                            char defaultSize2 = (char) (33602 - View.getDefaultSize(0, 0));
                                            int i416 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 3085;
                                            int longPressTimeout2 = 26 - (ViewConfiguration.getLongPressTimeout() >> 16);
                                            byte[] bArr6 = $$a;
                                            byte b18 = bArr6[5];
                                            byte b19 = bArr6[7];
                                            Object[] objArr117 = new Object[1];
                                            b(b18, b19, b19, objArr117);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(defaultSize2, i416, longPressTimeout2, 1411172903, false, (String) objArr117[0], new Class[]{String.class});
                                        }
                                        if (str3.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr))) {
                                            i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 31;
                                            int i510 = i12 % 128;
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i510;
                                            if (i12 % 2 != 0) {
                                                i13 = 1;
                                            } else {
                                                i13 = 0;
                                            }
                                            i10 = i13 ^ 1;
                                            int i511 = (i510 ^ 91) + ((i510 & 91) << 1);
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i511 % 128;
                                            int i512 = i511 % 2;
                                            r18 = r17;
                                        } else {
                                            i10 = 0;
                                            r18 = r17;
                                        }
                                    } catch (Throwable th4) {
                                        Throwable cause4 = th4.getCause();
                                        if (cause4 != null) {
                                            throw cause4;
                                        }
                                        throw th4;
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        } catch (Exception unused2) {
                            r17 = i4;
                            i10 = 0;
                            r18 = r17;
                        }
                        int i513 = (~(i & 10)) & (i | 10);
                        int i514 = -i10;
                        int i515 = ((i10 & i514) | (i10 ^ i514)) >> 31;
                        int i516 = (~i515) & i;
                        int i517 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 77;
                        int i518 = i517 % 128;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i518;
                        int i519 = i517 % 2;
                        int i610 = i515 & i513;
                        int i611 = (i610 & i516) | (i516 ^ i610);
                        int i612 = i2 & 32;
                        int i613 = -i612;
                        int i614 = ((i612 & i613) | (i612 ^ i613)) >> 31;
                        int i615 = i518 + 117;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i615 % 128;
                        i11 = i615 % 2;
                        int i616 = i611 & (~i614);
                        int i617 = i614 & i;
                        i5 = (i616 & i617) | (i616 ^ i617);
                        r16 = r18;
                        if (i11 != 0) {
                            int i618 = 77 / 0;
                            r16 = r18;
                        }
                    }
                }
                int i619 = (~((i & r16) == true ? 1 : 0)) & ((i | r16) == true ? 1 : 0);
                int i710 = -i619;
                int i711 = ((i619 & i710) | (i619 ^ i710)) >> 31;
                int i712 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int i713 = (i712 & 63) + (i712 | 63);
                int i714 = i713 % 128;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i714;
                int i715 = i713 % 2;
                int i716 = i5 & (~i711);
                int i717 = r16 & i711;
                int i718 = (i716 & i717) | (i716 ^ i717);
                int i719 = ((i714 | 111) << 1) - (i714 ^ 111);
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i719 % 128;
                int i810 = i719 % 2;
                int i811 = (~(i & i718)) & (i | i718);
                int i812 = -i811;
                i6 = (((i811 & i812) | (i811 ^ i812)) >> 31) & 16;
                Object[] objArr118 = {new int[]{i}, new int[1], new int[]{i718}, null};
                i7 = i714 + 55;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
                if (i7 % 2 != 0) {
                    i8 = ((((-875256932) + (((~i) | 69945368) * 1324)) + (((~(205212092 | i)) | (~(i | (-164901864)))) * (-1324))) - 1497786856) >>> i6;
                    iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    i9 = 989 % i8;
                } else {
                    int i813 = 1276525265 + (((~(i | (-999755381))) | 1040065609) * 191) + (((~((-999755381) | (~i))) | 966132800) * 191);
                    int i814 = -(-i6);
                    i8 = (i814 | i813) + (i813 & i814);
                    iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    i9 = i8 * 989;
                }
                int i815 = (-987) * i3;
                int i816 = (i9 ^ i815) + ((i9 & i815) << 1);
                int i817 = ~i3;
                int i818 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                int i819 = (i818 & i817) | (i817 ^ i818);
                int i910 = ~((i819 & i8) | (i819 ^ i8));
                int i911 = i8 | i3;
                int i912 = ~((i911 & iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (i911 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                int i913 = (i816 - (~(-(-(((i910 & i912) | (i910 ^ i912)) * 988))))) - 1;
                int i914 = -(-((i8 | i817) * (-988)));
                int i915 = ((i913 | i914) << 1) - (i914 ^ i913);
                int i916 = ~((~i8) | i817);
                int i917 = ~((i817 & iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (i817 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                int i918 = (i917 & i916) | (i916 ^ i917);
                int i919 = ~(i8 | (~iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | i3);
                int i109 = ((i919 & i918) | (i918 ^ i919)) * 988;
                int i1010 = ((i915 | i109) << 1) - (i109 ^ i915);
                int i1011 = i1010 << 13;
                int i1012 = (i1011 | i1010) & (~(i1010 & i1011));
                int i1013 = i1012 >>> 17;
                int i1014 = ((~i1012) & i1013) | ((~i1013) & i1012);
                int i1015 = i1014 << 5;
                ((int[]) objArr118[1])[0] = ((~i1014) & i1015) | ((~i1015) & i1014);
                return objArr118;
                r17 = str2;
                if (Build.VERSION.SDK_INT == 30) {
                    int i110 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    int i111 = (i110 & 121) + (i110 | 121);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i111 % 128;
                    int i112 = i111 % 2;
                    i5 = i;
                    r16 = i4;
                } else {
                    if (Build.VERSION.SDK_INT > 33) {
                        int i417 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        i14 = (i417 ^ 29) + ((i417 & 29) << 1);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i14 % 128;
                        if (i14 % 2 == 0) {
                            Object[] objArr22 = new Object[1];
                            a(new char[]{43604, 43643, 50877, 31491, 54651, 25987, 63161, 11025, 42361, 13776, 13606, 40075, 42727, 6923, 30052, 50647, 22180, 3810, 52034, 17764, 38353, 1690, 47906, 5471, 42475, 13969, 27453, 58716, 30177, 59078, 23349, 46411}, TextUtils.indexOf("", "", 1, 0), objArr22);
                            Object[] objArr119 = {(String) objArr22[0]};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                char cIndexOf3 = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0'));
                                int keyRepeatDelay3 = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 993;
                                int iIndexOf3 = TextUtils.indexOf((CharSequence) "", '0') + 9;
                                byte[] bArr7 = $$a;
                                byte b110 = bArr7[5];
                                byte b111 = bArr7[7];
                                Object[] objArr1110 = new Object[1];
                                b(b110, b111, b111, objArr1110);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf3, keyRepeatDelay3, iIndexOf3, 410748506, false, (String) objArr1110[0], new Class[]{String.class});
                            }
                            jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr119)).longValue();
                        } else {
                            Object[] objArr1111 = new Object[1];
                            a(new char[]{43604, 43643, 50877, 31491, 54651, 25987, 63161, 11025, 42361, 13776, 13606, 40075, 42727, 6923, 30052, 50647, 22180, 3810, 52034, 17764, 38353, 1690, 47906, 5471, 42475, 13969, 27453, 58716, 30177, 59078, 23349, 46411}, TextUtils.indexOf("", "", 0, 0), objArr1111);
                            Object[] objArr1112 = {(String) objArr1111[0]};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                            r17 = r17;
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                char c3 = (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                                int gidForName4 = 992 - Process.getGidForName("");
                                int offsetAfter3 = 8 - TextUtils.getOffsetAfter("", 0);
                                byte[] bArr8 = $$a;
                                byte b112 = bArr8[5];
                                byte b113 = bArr8[7];
                                Object[] objArr1113 = new Object[1];
                                b(b112, b113, b113, objArr1113);
                                Class[] clsArr3 = {String.class};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c3, gidForName4, offsetAfter3, 410748506, false, (String) objArr1113[0], clsArr3);
                                r17 = clsArr3;
                            }
                            jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr1112)).longValue();
                        }
                        long j16 = 1230013789;
                        r18 = i4;
                        long j17 = -1;
                        long j18 = j16 ^ j17;
                        long j19 = (int) Runtime.getRuntime().totalMemory();
                        long j110 = (((long) 284) * j16) + (((long) (-282)) * jLongValue) + (((long) (-283)) * (((j18 | jLongValue) ^ j17) | ((j18 | j19) ^ j17)));
                        long j111 = 283;
                        long j112 = jLongValue ^ j17;
                        j = j110 + (((j112 | j16) ^ j17) * j111) + (j111 * (j17 ^ ((j18 | j112) | j19))) + ((long) (-1430932026));
                        int i418 = ~i;
                        i15 = ((int) (j >> 32)) & (1676143434 + (((~(i418 | (-674216794))) | (~((-2111443205) | i418)) | 671748352) * 464) + (((-1439694853) | i) * (-464)) + (((~((-674216794) | i)) | 671748352) * 464));
                        i16 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 65;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i16 % 128;
                        if (i16 % 2 != 0) {
                            Process.myTid();
                            throw null;
                        }
                        int i419 = (int) j;
                        int startUptimeMillis3 = (int) Process.getStartUptimeMillis();
                        int i4110 = ~(1879031295 | startUptimeMillis3);
                        int i4111 = i419 & (1677087393 + ((22349893 | i4110) * (-476)) + (i4110 * 952) + ((~((~startUptimeMillis3) | 1879031295)) * 476));
                        i10 = (i15 & i4111) | (i15 ^ i4111);
                    } else {
                        r17 = i4;
                        Object[] objArr1114 = new Object[1];
                        a(new char[]{6701, 6684, 44746, 32252, 810}, ViewConfiguration.getScrollDefaultDelay() >> 16, objArr1114);
                        str3 = (String) objArr1114[0];
                        Object[] objArr1115 = new Object[1];
                        a(new char[]{10109, 9999, 25164, 29373, 48320, 59616, 21065, 8942, 52427, 47338, 37341, 38255, 594, 4833, 7384, 18672, 26462}, Drawable.resolveOpacity(0, 0), objArr1115);
                        objArr = new Object[]{(String) objArr1115[0]};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char defaultSize3 = (char) (33602 - View.getDefaultSize(0, 0));
                            int i4112 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 3085;
                            int longPressTimeout3 = 26 - (ViewConfiguration.getLongPressTimeout() >> 16);
                            byte[] bArr9 = $$a;
                            byte b114 = bArr9[5];
                            byte b115 = bArr9[7];
                            Object[] objArr1116 = new Object[1];
                            b(b114, b115, b115, objArr1116);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(defaultSize3, i4112, longPressTimeout3, 1411172903, false, (String) objArr1116[0], new Class[]{String.class});
                        }
                        if (str3.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr))) {
                            i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 31;
                            int i5110 = i12 % 128;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5110;
                            if (i12 % 2 != 0) {
                                i13 = 1;
                            } else {
                                i13 = 0;
                            }
                            i10 = i13 ^ 1;
                            int i5111 = (i5110 ^ 91) + ((i5110 & 91) << 1);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5111 % 128;
                            int i5112 = i5111 % 2;
                            r18 = r17;
                        } else {
                            i10 = 0;
                            r18 = r17;
                        }
                    }
                    int i5113 = (~(i & 10)) & (i | 10);
                    int i5114 = -i10;
                    int i5115 = ((i10 & i5114) | (i10 ^ i5114)) >> 31;
                    int i5116 = (~i5115) & i;
                    int i5117 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 77;
                    int i5118 = i5117 % 128;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5118;
                    int i5119 = i5117 % 2;
                    int i6110 = i5115 & i5113;
                    int i6111 = (i6110 & i5116) | (i5116 ^ i6110);
                    int i6112 = i2 & 32;
                    int i6113 = -i6112;
                    int i6114 = ((i6112 & i6113) | (i6112 ^ i6113)) >> 31;
                    int i6115 = i5118 + 117;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6115 % 128;
                    i11 = i6115 % 2;
                    int i6116 = i6111 & (~i6114);
                    int i6117 = i6114 & i;
                    i5 = (i6116 & i6117) | (i6116 ^ i6117);
                    r16 = r18;
                    if (i11 != 0) {
                        int i6118 = 77 / 0;
                        r16 = r18;
                    }
                }
                int i6119 = (~((i & r16) == true ? 1 : 0)) & ((i | r16) == true ? 1 : 0);
                int i7110 = -i6119;
                int i7111 = ((i6119 & i7110) | (i6119 ^ i7110)) >> 31;
                int i7112 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int i7113 = (i7112 & 63) + (i7112 | 63);
                int i7114 = i7113 % 128;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7114;
                int i7115 = i7113 % 2;
                int i7116 = i5 & (~i7111);
                int i7117 = r16 & i7111;
                int i7118 = (i7116 & i7117) | (i7116 ^ i7117);
                int i7119 = ((i7114 | 111) << 1) - (i7114 ^ 111);
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7119 % 128;
                int i8110 = i7119 % 2;
                int i8111 = (~(i & i7118)) & (i | i7118);
                int i8112 = -i8111;
                i6 = (((i8111 & i8112) | (i8111 ^ i8112)) >> 31) & 16;
                Object[] objArr1117 = {new int[]{i}, new int[1], new int[]{i7118}, null};
                i7 = i7114 + 55;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
                if (i7 % 2 != 0) {
                    i8 = ((((-875256932) + (((~i) | 69945368) * 1324)) + (((~(205212092 | i)) | (~(i | (-164901864)))) * (-1324))) - 1497786856) >>> i6;
                    iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    i9 = 989 % i8;
                } else {
                    int i8113 = 1276525265 + (((~(i | (-999755381))) | 1040065609) * 191) + (((~((-999755381) | (~i))) | 966132800) * 191);
                    int i8114 = -(-i6);
                    i8 = (i8114 | i8113) + (i8113 & i8114);
                    iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    i9 = i8 * 989;
                }
                int i8115 = (-987) * i3;
                int i8116 = (i9 ^ i8115) + ((i9 & i8115) << 1);
                int i8117 = ~i3;
                int i8118 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                int i8119 = (i8118 & i8117) | (i8117 ^ i8118);
                int i9110 = ~((i8119 & i8) | (i8119 ^ i8));
                int i9111 = i8 | i3;
                int i9112 = ~((i9111 & iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (i9111 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                int i9113 = (i8116 - (~(-(-(((i9110 & i9112) | (i9110 ^ i9112)) * 988))))) - 1;
                int i9114 = -(-((i8 | i8117) * (-988)));
                int i9115 = ((i9113 | i9114) << 1) - (i9114 ^ i9113);
                int i9116 = ~((~i8) | i8117);
                int i9117 = ~((i8117 & iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (i8117 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                int i9118 = (i9117 & i9116) | (i9116 ^ i9117);
                int i9119 = ~(i8 | (~iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | i3);
                int i1016 = ((i9119 & i9118) | (i9118 ^ i9119)) * 988;
                int i1017 = ((i9115 | i1016) << 1) - (i1016 ^ i9115);
                int i1018 = i1017 << 13;
                int i1019 = (i1018 | i1017) & (~(i1017 & i1018));
                int i10110 = i1019 >>> 17;
                int i10111 = ((~i1019) & i10110) | ((~i10110) & i1019);
                int i10112 = i10111 << 5;
                ((int[]) objArr1117[1])[0] = ((~i10111) & i10112) | ((~i10112) & i10111);
                return objArr1117;
            } catch (Throwable th5) {
                Throwable cause5 = th5.getCause();
                if (cause5 != null) {
                    throw cause5;
                }
                throw th5;
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0024  */
        /* JADX WARN: Code duplicated, block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$e(byte r7, byte r8, byte r9) {
            /*
                int r8 = r8 * 3
                int r8 = 107 - r8
                int r9 = r9 * 3
                int r9 = 4 - r9
                byte[] r0 = com.appsflyer.internal.AFi1pSDK.Companion.$$c
                int r7 = r7 * 3
                int r7 = r7 + 1
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L16
                r3 = r9
                r4 = r2
                goto L2a
            L16:
                r3 = r2
            L17:
                int r4 = r3 + 1
                byte r5 = (byte) r8
                r1[r3] = r5
                if (r4 != r7) goto L24
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                return r7
            L24:
                r3 = r0[r9]
                r6 = r9
                r9 = r8
                r8 = r3
                r3 = r6
            L2a:
                int r8 = r8 + r9
                int r9 = r3 + 1
                r3 = r4
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFi1pSDK.Companion.$$e(byte, byte, byte):java.lang.String");
        }
    }
}
