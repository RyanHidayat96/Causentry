package com.appsflyer.internal;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.appsflyer.AFLogger;
import defpackage.deInitSession;
import defpackage.initSession;
import defpackage.setVideoStabilizationMode;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0015\u0010\u000b\u001a\u00020\b8BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0015\u0010\r\u001a\u00020\b8BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0011\u0010\u000e\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0010\u001a\u00020\u00128G¢\u0006\u0006\u001a\u0004\b\f\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0014R\u0011\u0010\u0016\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000f"}, d2 = {"Lcom/appsflyer/internal/AFe1zSDK;", "", "Lcom/appsflyer/internal/AFc1pSDK;", "p0", "Lcom/appsflyer/internal/AFc1qSDK;", "p1", "<init>", "(Lcom/appsflyer/internal/AFc1pSDK;Lcom/appsflyer/internal/AFc1qSDK;)V", "", "areAllFieldsValid", "Lkotlin/Lazy;", "getRevenue", "AFAdRevenueData", "getMonetizationNetwork", "getMediationNetwork", "()Ljava/lang/String;", "getCurrencyIso4217Code", "Lcom/appsflyer/internal/AFc1pSDK;", "", "()Z", "Lcom/appsflyer/internal/AFc1qSDK;", "component4", "component3", "AFa1ySDK"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AFe1zSDK {
    private static AFe1vSDK component3;

    /* JADX INFO: renamed from: AFAdRevenueData, reason: from kotlin metadata */
    public final Lazy getMonetizationNetwork;

    /* JADX INFO: renamed from: areAllFieldsValid, reason: from kotlin metadata */
    private final Lazy getRevenue;

    /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: from kotlin metadata */
    private final AFc1pSDK AFAdRevenueData;

    /* JADX INFO: renamed from: getMonetizationNetwork, reason: from kotlin metadata */
    private final AFc1qSDK component4;

    /* JADX INFO: renamed from: AFa1ySDK, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static String getMediationNetwork = "https://%scdn-%ssettings.%s/android/v1/%s/settings";
    public static String getRevenue = "https://%scdn-%stestsettings.%s/android/v1/%s/settings";
    private static final List<String> component1 = CollectionsKt.listOf((Object[]) new String[]{"googleplay", "playstore", "googleplaystore"});

    public AFe1zSDK(AFc1pSDK aFc1pSDK, AFc1qSDK aFc1qSDK) {
        Intrinsics.checkNotNullParameter(aFc1pSDK, "");
        Intrinsics.checkNotNullParameter(aFc1qSDK, "");
        this.AFAdRevenueData = aFc1pSDK;
        this.component4 = aFc1qSDK;
        this.getRevenue = LazyKt.lazy(new Function0<String>() { // from class: com.appsflyer.internal.AFe1zSDK.5
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                String monetizationNetwork = AFa1tSDK.getMonetizationNetwork(AFe1zSDK.this.component4, AFe1zSDK.this.AFAdRevenueData.component2());
                String str = monetizationNetwork;
                if (str != null && !StringsKt.isBlank(str)) {
                    String string = StringsKt.trim((CharSequence) str).toString();
                    Companion companion = AFe1zSDK.INSTANCE;
                    List<String> revenue = Companion.getRevenue();
                    Locale locale = Locale.getDefault();
                    Intrinsics.checkNotNullExpressionValue(locale, "");
                    String lowerCase = string.toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                    if (!revenue.contains(lowerCase)) {
                        monetizationNetwork = "-".concat(String.valueOf(string));
                    } else {
                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                        String str2 = String.format("AF detected using redundant Google-Play channel for attribution - %s. Using without channel postfix.", Arrays.copyOf(new Object[]{string}, 1));
                        Intrinsics.checkNotNullExpressionValue(str2, "");
                        AFLogger.afWarnLog(str2);
                        monetizationNetwork = "";
                    }
                }
                return StringsKt.trim((CharSequence) (monetizationNetwork != null ? monetizationNetwork : "")).toString();
            }

            {
                super(0);
            }
        });
        this.getMonetizationNetwork = LazyKt.lazy(new Function0<String>() { // from class: com.appsflyer.internal.AFe1zSDK.4
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                String packageName = AFe1zSDK.this.AFAdRevenueData.getRevenue.getMonetizationNetwork.getPackageName();
                Intrinsics.checkNotNullExpressionValue(packageName, "");
                return AFe1zSDK.getMonetizationNetwork(packageName, AFe1zSDK.getCurrencyIso4217Code(AFe1zSDK.this));
            }

            {
                super(0);
            }
        });
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFe1zSDK$AFa1ySDK, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0016\u0010\r\u001a\u00020\u00058\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\b\u0010\fR\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u000e8\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b\u000f\u0010\u0010\"\u0004\b\u000b\u0010\u0011"}, d2 = {"Lcom/appsflyer/internal/AFe1zSDK$AFa1ySDK;", "", "<init>", "()V", "", "", "component1", "Ljava/util/List;", "getRevenue", "()Ljava/util/List;", "AFAdRevenueData", "getMediationNetwork", "Ljava/lang/String;", "getCurrencyIso4217Code", "Lcom/appsflyer/internal/AFe1vSDK;", "component3", "Lcom/appsflyer/internal/AFe1vSDK;", "(Lcom/appsflyer/internal/AFe1vSDK;)V", "getMonetizationNetwork"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private static final byte[] $$c = {97, 58, 103, -72};
        private static final int $$f = 204;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {51, -99, -8, -59, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
        private static final int $$e = 158;
        private static final byte[] $$a = {55, -47, -47, 67, -6, 24, -18, -48, 72, -11, 1, 21, 0, -6, 14, 8, -72, 56, 5, 16, 5, -67, 45, -32, -2, 12, 13, 37, 16, 5, -8, 0, 6, -3, 1, 22, -12, 1, 18, -44, 54, -1, -12, 12, 8, -7, 9, 2, -21, 14, 14, 12, -13};
        private static final int $$b = 255;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        private static int TuitionPaymentFragmentbindingInflater1 = 1;
        private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = {57186, 60090, 60105, 60055, 57196, 60035, 60089, 60061, 57199, 60095, 57190, 60079, 60063, 60117, 60051, 60145, 57195, 60044, 60075, 60083, 60073, 57187, 57188, 60060, 60053, 60123, 60040, 60110, 57193, 60045, 60088, 60049, 60052, 60082, 60097, 60047, 60114, 60050, 57191, 60056, 60080, 60034, 60046, 57197, 60094, 60062, 57184, 60087, 60093, 60048, 57189, 60043, 60078, 60058, 57194, 60072, 60099, 57192, 60109, 60041, 60118, 60084, 60054, 60086};
        private static char b = 57193;
        private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {59710, 59710, 59758, 59744, 59744, 59724, 59738, 59775, 59749, 59745, 59718, 59722, 59742, 59716, 59725, 59709, 59754, 59742, 59716, 59725, 59728, 59746, 59756, 59746, 59746, 59709, 59750, 59747, 59753, 59741, 59847, 59844, 59835, 59813, 59847, 59887, 59860, 59884, 59682, 59754, 59745, 59759, 59757, 59758, 59744, 59744, 59724, 59739, 59751, 59759, 59751, 59768, 59750, 59749, 59773, 59736, 59739, 59770, 59745, 59759, 59715, 59698, 59727, 59726, 59741, 59746, 59732, 59731, 59746, 59746, 59756, 59746, 59751, 59751, 59744, 59689, 59727, 59777, 59416, 59423, 59398, 59399, 59397, 59399, 59399, 59890, 59892, 59419, 59395, 59888, 59404, 59417, 59888, 59860, 59901, 59410, 59418, 59419, 59421, 59396, 59404, 59396, 59896, 59873, 59397, 59397, 59395, 59720, 59785, 59787, 59764, 59802, 59698, 59750, 59749, 59773, 59736, 59715, 59759, 59744, 59768, 59738, 59699, 59743, 59744, 59768, 59749, 59756, 59756, 59757, 59753, 59745, 59751, 59742, 59736, 59753, 59744, 59770, 59771, 59774, 59770, 59758, 59744, 59744, 59724, 59739, 59751, 59759, 59751, 59801, 59431, 59425, 59433, 59437, 59436, 59436, 59429, 59448, 59424, 59423, 59423, 59431, 59425, 59426, 59424, 59426, 59426, 59437, 59732, 59831, 59836, 59836, 59836, 59827, 59827, 59824, 59830, 59826, 59826, 59826, 59836, 59836, 59836, 59826, 59826, 59836, 59836, 59825, 59825, 59827, 59827, 59836, 59742, 59823, 59818, 59818, 59819, 59720, 59790, 59776, 59783, 59413, 59433, 59399, 59404, 59412, 59421, 59423, 59439, 59413, 59415, 59741, 59765, 59903, 59877, 59897, 59889, 59401, 59889, 59877, 59756, 59871, 59863, 59862, 59864, 59867, 59864, 59866, 59852, 59810, 59837, 59868, 59827, 59825, 59857, 59865, 59870, 59857, 59868, 59865, 59834, 59833, 59844, 59870, 59858, 59871, 59865, 59867, 59791, 59894, 59890, 59401, 59874, 59880, 59895, 59405, 59878, 59875, 59402, 59800, 59438, 59411, 59421, 59437, 59427, 59438, 59438, 59424, 59434, 59420, 59434, 59437, 59438, 59778, 59418, 59420, 59398, 59400, 59398, 59417, 59418, 59396, 59418, 59407, 59401, 59417, 59417, 59396, 59418, 59421, 59748, 59874, 59874, 59880, 59886, 59884, 59874, 59879, 59873, 59868, 59824, 59844, 59874, 59881, 59885, 59884, 59880, 59874, 59845, 59843, 59875, 59886, 59887, 59840, 59698, 59770, 59772, 59744, 59746, 59775, 59770, 59769, 59769, 59769, 59773, 59766, 59673, 59795, 59759, 59676, 59724, 59744, 59744, 59758, 59749, 59744, 59756, 59756, 59756, 59757, 59746, 59733, 59702, 59738, 59744, 59759, 59747, 59746, 59758, 59744, 59739, 59713, 59745, 59756, 59757, 59742, 59833, 59839, 59832, 59812, 59799, 59822, 59832, 59724, 59800, 59792, 59760, 59762, 59795, 59772, 59746, 59785, 59783, 59802, 59803, 59781, 59803, 59786, 59790, 59807, 59807, 59801, 59802, 59800, 59806, 59793, 59805, 59803, 59768, 59769, 59800, 59795, 59792, 59698, 59751, 59744, 59768, 59775, 59745, 59756, 59745, 59747, 59749, 59741, 59808, 59823, 59797, 59819, 59797, 59707, 59744, 59744, 59742, 59770, 59401, 59408, 59415, 59412, 59892, 59901, 59416, 59433, 59438, 59427, 59434, 59421, 59415, 59414, 59415, 59409, 59435, 59435, 59706, 59753, 59745, 59752, 59752, 59770, 59744, 59750, 59770, 59745, 59759, 59753, 59746, 59752, 59732, 59705, 59751, 59728, 59737, 59744, 59775, 59751, 59757, 59686, 59756, 59748, 59775, 59761, 59771, 59745, 59770, 59769, 59745, 59715, 59715, 59770, 59763, 59773, 59773, 59716, 59714, 59744, 59769, 59770, 59744, 59749, 59770, 59771, 59714, 59716, 59762, 59771, 59747, 59750, 59712, 59739, 59762, 59748, 59747, 59745, 59715, 59713, 59770, 59771, 59771, 59773, 59774, 59750, 59771, 59775, 59769, 59775, 59729, 59704, 59681};

        /* JADX WARN: Code duplicated, block: B:10:0x0021  */
        /* JADX WARN: Code duplicated, block: B:8:0x0019  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0027). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void d(byte r7, short r8, int r9, java.lang.Object[] r10) {
            /*
                int r7 = 53 - r7
                int r8 = 103 - r8
                byte[] r0 = com.appsflyer.internal.AFe1zSDK.Companion.$$d
                int r9 = 93 - r9
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L11
                r3 = r9
                r4 = r2
                r9 = r7
                goto L27
            L11:
                r3 = r2
            L12:
                int r4 = r3 + 1
                byte r5 = (byte) r8
                r1[r3] = r5
                if (r4 != r7) goto L21
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L21:
                r3 = r0[r9]
                r6 = r9
                r9 = r8
                r8 = r3
                r3 = r6
            L27:
                int r3 = r3 + 1
                int r8 = -r8
                int r9 = r9 + r8
                int r8 = r9 + (-11)
                r9 = r3
                r3 = r4
                goto L12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFe1zSDK.Companion.d(byte, short, int, java.lang.Object[]):void");
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
        private static void e(short r6, byte r7, byte r8, java.lang.Object[] r9) {
            /*
                int r6 = r6 * 17
                int r6 = 34 - r6
                byte[] r0 = com.appsflyer.internal.AFe1zSDK.Companion.$$a
                int r7 = r7 * 3
                int r7 = r7 + 103
                int r8 = r8 * 33
                int r8 = 37 - r8
                byte[] r1 = new byte[r6]
                r2 = 0
                if (r0 != 0) goto L16
                r3 = r6
                r4 = r2
                goto L28
            L16:
                r3 = r2
            L17:
                int r4 = r3 + 1
                byte r5 = (byte) r7
                r1[r3] = r5
                if (r4 != r6) goto L26
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L26:
                r3 = r0[r8]
            L28:
                int r7 = r7 + r3
                int r7 = r7 + (-3)
                int r8 = r8 + 1
                r3 = r4
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFe1zSDK.Companion.e(short, byte, byte, java.lang.Object[]):void");
        }

        private Companion() {
        }

        public static List<String> getRevenue() {
            List<String> list;
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentbindingInflater1 + 9;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            if (i2 % 2 != 0) {
                list = AFe1zSDK.component1;
                int i3 = 89 / 0;
            } else {
                list = AFe1zSDK.component1;
            }
            int i4 = TuitionPaymentFragmentbindingInflater1 + 31;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            if (i4 % 2 == 0) {
                return list;
            }
            throw null;
        }

        public static void getMediationNetwork(AFe1vSDK aFe1vSDK) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentbindingInflater1 + 1;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            int i3 = i2 % 2;
            AFe1zSDK.component3 = aFe1vSDK;
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 75;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 5 / 0;
            }
        }

        private static void c(byte[] bArr, int[] iArr, boolean z, Object[] objArr) throws Throwable {
            char[] cArr;
            int i = 2;
            int i2 = 2 % 2;
            setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
            int i3 = 0;
            int i4 = iArr[0];
            int i5 = iArr[1];
            int i6 = iArr[2];
            int i7 = iArr[3];
            char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            long j = 0;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i8 = 0;
                while (i8 < length) {
                    int i9 = $10 + 27;
                    $11 = i9 % 128;
                    int i10 = i9 % i;
                    try {
                        Object[] objArr2 = new Object[1];
                        objArr2[i3] = Integer.valueOf(cArr2[i8]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b2 = (byte) i3;
                            byte b3 = b2;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 1271 - (Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 18, 407021364, false, $$g(b2, b3, (byte) (b3 | 16)), new Class[]{Integer.TYPE});
                        }
                        cArr3[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        i8++;
                        i = 2;
                        i3 = 0;
                        j = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr2 = cArr3;
            }
            char[] cArr4 = new char[i5];
            System.arraycopy(cArr2, i4, cArr4, 0, i5);
            if (bArr != null) {
                int i11 = $11 + 107;
                $10 = i11 % 128;
                int i12 = i11 % 2;
                char[] cArr5 = new char[i5];
                setvideostabilizationmode.b = 0;
                char c = 0;
                while (setvideostabilizationmode.b < i5) {
                    int i13 = $10 + 31;
                    $11 = i13 % 128;
                    int i14 = i13 % 2;
                    if (bArr[setvideostabilizationmode.b] == 1) {
                        int i15 = setvideostabilizationmode.b;
                        Object[] objArr3 = {Integer.valueOf(cArr4[setvideostabilizationmode.b]), Integer.valueOf(c)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 3226 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), KeyEvent.getDeadChar(0, 0) + 13, 2133916302, false, $$g(b4, b5, (byte) (b5 | 17)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr5[i15] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    } else {
                        int i16 = setvideostabilizationmode.b;
                        Object[] objArr4 = {Integer.valueOf(cArr4[setvideostabilizationmode.b]), Integer.valueOf(c)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = b6;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 29943), 1754 - TextUtils.lastIndexOf("", '0', 0), KeyEvent.getDeadChar(0, 0) + 23, 387247676, false, $$g(b6, b7, (byte) (b7 | 15)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr5[i16] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                    }
                    c = cArr5[setvideostabilizationmode.b];
                    Object[] objArr5 = {setvideostabilizationmode, setvideostabilizationmode};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b8 = (byte) 0;
                        byte b9 = b8;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TextUtils.getOffsetBefore("", 0) + 41241), 1704 - MotionEvent.axisFromString(""), View.MeasureSpec.getMode(0) + 21, -1434471773, false, $$g(b8, b9, (byte) (b9 | 11)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                }
                cArr4 = cArr5;
            }
            if (i7 > 0) {
                char[] cArr6 = new char[i5];
                System.arraycopy(cArr4, 0, cArr6, 0, i5);
                int i17 = i5 - i7;
                System.arraycopy(cArr6, 0, cArr4, i17, i7);
                System.arraycopy(cArr6, i7, cArr4, 0, i17);
            }
            if (z) {
                int i18 = $10 + 51;
                $11 = i18 % 128;
                if (i18 % 2 == 0) {
                    cArr = new char[i5];
                    setvideostabilizationmode.b = 0;
                } else {
                    cArr = new char[i5];
                    setvideostabilizationmode.b = 0;
                }
                while (setvideostabilizationmode.b < i5) {
                    cArr[setvideostabilizationmode.b] = cArr4[(i5 - setvideostabilizationmode.b) - 1];
                    setvideostabilizationmode.b++;
                    int i19 = $11 + 115;
                    $10 = i19 % 128;
                    int i20 = i19 % 2;
                }
                cArr4 = cArr;
            }
            if (i6 > 0) {
                int i21 = $10 + 61;
                $11 = i21 % 128;
                if (i21 % 2 == 0) {
                    setvideostabilizationmode.b = 0;
                } else {
                    setvideostabilizationmode.b = 0;
                }
                while (setvideostabilizationmode.b < i5) {
                    cArr4[setvideostabilizationmode.b] = (char) (cArr4[setvideostabilizationmode.b] - iArr[2]);
                    setvideostabilizationmode.b++;
                }
            }
            objArr[0] = new String(cArr4);
        }

        private static void a(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
            int i2;
            Object obj;
            int length;
            char[] cArr2;
            int i3 = 2 % 2;
            deInitSession deinitsession = new deInitSession();
            char[] cArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            long j = 0;
            Object obj2 = null;
            if (cArr3 != null) {
                int i4 = $10 + 1;
                $11 = i4 % 128;
                if (i4 % 2 == 0) {
                    length = cArr3.length;
                    cArr2 = new char[length];
                } else {
                    length = cArr3.length;
                    cArr2 = new char[length];
                }
                int i5 = 0;
                while (i5 < length) {
                    int i6 = $11 + 47;
                    $10 = i6 % 128;
                    int i7 = i6 % 2;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr3[i5])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)), ExpandableListView.getPackedPositionChild(j) + 2268, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 32, -1927765101, false, $$g(b3, b4, (byte) (b4 + 3)), new Class[]{Integer.TYPE});
                        }
                        cArr2[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        i5++;
                        j = 0;
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
            Object[] objArr3 = {Integer.valueOf(b)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                byte b5 = (byte) 0;
                byte b6 = b5;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 2267 - View.MeasureSpec.getMode(0), 33 - ((Process.getThreadPriority(0) + 20) >> 6), -1927765101, false, $$g(b5, b6, (byte) (b6 + 3)), new Class[]{Integer.TYPE});
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
                int i8 = $11 + 45;
                $10 = i8 % 128;
                if (i8 % 2 != 0) {
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                } else {
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                }
                while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                    deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                    if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                        obj = obj2;
                    } else {
                        Object[] objArr4 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b7 = (byte) 0;
                            byte b8 = b7;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (49267 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), 3261 - KeyEvent.normalizeMetaState(0), Color.rgb(0, 0, 0) + 16777246, -127612708, false, $$g(b7, b8, (byte) (b8 + 2)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                            Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                byte b9 = (byte) 0;
                                byte b10 = b9;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 22877), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 594, 17 - View.MeasureSpec.getSize(0), 1570859318, false, $$g(b9, b10, b10), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                            int i9 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[iIntValue];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i9];
                        } else {
                            obj = null;
                            if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                int i10 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                int i11 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[i10];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i11];
                                int i12 = $10 + 3;
                                $11 = i12 % 128;
                                int i13 = i12 % 2;
                            } else {
                                int i14 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                int i15 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[i14];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i15];
                            }
                        }
                    }
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                    obj2 = obj;
                }
            }
            for (int i16 = 0; i16 < i; i16++) {
                cArr4[i16] = (char) (cArr4[i16] ^ 13722);
            }
            objArr[0] = new String(cArr4);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /*  JADX ERROR: Type inference failed
            jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 267481. Try increasing type updates limit count.
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
            */
        public static java.lang.Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault1(android.content.Context r65, java.lang.String[] r66, int r67, int r68, int r69) {
            /*
                Method dump skipped, instruction units count: 26748
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFe1zSDK.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(android.content.Context, java.lang.String[], int, int, int):java.lang.Object[]");
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
        private static java.lang.String $$g(byte r7, short r8, byte r9) {
            /*
                byte[] r0 = com.appsflyer.internal.AFe1zSDK.Companion.$$c
                int r9 = 116 - r9
                int r8 = r8 * 4
                int r8 = r8 + 4
                int r7 = r7 * 4
                int r7 = r7 + 1
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L15
                r3 = r7
                r9 = r8
                r5 = r2
                goto L28
            L15:
                r3 = r2
            L16:
                byte r4 = (byte) r9
                int r5 = r3 + 1
                r1[r3] = r4
                if (r5 != r7) goto L23
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                return r7
            L23:
                r3 = r0[r8]
                r6 = r9
                r9 = r8
                r8 = r6
            L28:
                int r8 = r8 + r3
                int r9 = r9 + 1
                r3 = r5
                r6 = r9
                r9 = r8
                r8 = r6
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFe1zSDK.Companion.$$g(byte, short, byte):java.lang.String");
        }
    }

    public static boolean AFAdRevenueData() {
        return component3 == null;
    }

    public final String getCurrencyIso4217Code() {
        AFe1wSDK aFe1wSDK;
        if (AFAdRevenueData()) {
            aFe1wSDK = AFe1wSDK.DEFAULT;
        } else {
            aFe1wSDK = AFe1wSDK.API;
        }
        int i = AFa1uSDK.getCurrencyIso4217Code[aFe1wSDK.ordinal()];
        if (i == 1) {
            return (String) this.getMonetizationNetwork.getValue();
        }
        if (i != 2) {
            if (i == 3) {
                return "";
            }
            throw new NoWhenBranchMatchedException();
        }
        AFe1vSDK aFe1vSDK = component3;
        String str = aFe1vSDK != null ? aFe1vSDK.AFAdRevenueData : null;
        return str == null ? "" : str;
    }

    public final String getMediationNetwork() {
        AFe1wSDK aFe1wSDK;
        if (AFAdRevenueData()) {
            aFe1wSDK = AFe1wSDK.DEFAULT;
        } else {
            aFe1wSDK = AFe1wSDK.API;
        }
        int i = AFa1uSDK.getCurrencyIso4217Code[aFe1wSDK.ordinal()];
        if (i == 1) {
            return "appsflyersdk.com";
        }
        if (i != 2) {
            if (i == 3) {
                return "";
            }
            throw new NoWhenBranchMatchedException();
        }
        AFe1vSDK aFe1vSDK = component3;
        String str = aFe1vSDK != null ? aFe1vSDK.getMediationNetwork : null;
        return str == null ? "" : str;
    }

    public static final /* synthetic */ String getMonetizationNetwork(String str, String str2) throws NoSuchAlgorithmException {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        String string = sb.toString();
        Intrinsics.checkNotNullParameter(string, "");
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = string.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        byte[] bArrDigest = messageDigest.digest(bytes);
        Intrinsics.checkNotNullExpressionValue(bArrDigest, "");
        String strEncodeToString = Base64.encodeToString(bArrDigest, 2);
        Intrinsics.checkNotNullExpressionValue(strEncodeToString, "");
        String lowerCase = strEncodeToString.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        String strSubstring = new Regex("[^\\w]+").replace(lowerCase, "").substring(0, 6);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(strSubstring);
        sb2.append(".");
        return sb2.toString();
    }

    public static final /* synthetic */ String getCurrencyIso4217Code(AFe1zSDK aFe1zSDK) {
        return (String) aFe1zSDK.getRevenue.getValue();
    }

    public final /* synthetic */ class AFa1uSDK {
        public static final /* synthetic */ int[] getCurrencyIso4217Code;

        static {
            int[] iArr = new int[AFe1wSDK.values().length];
            try {
                iArr[AFe1wSDK.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFe1wSDK.API.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AFe1wSDK.RC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            getCurrencyIso4217Code = iArr;
        }
    }

    public static final void getMediationNetwork(AFe1vSDK aFe1vSDK) {
        Companion.getMediationNetwork(aFe1vSDK);
    }
}
