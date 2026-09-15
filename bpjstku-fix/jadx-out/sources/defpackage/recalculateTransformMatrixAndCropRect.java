package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.datadog.android.DatadogSite;
import com.datadog.android.api.context.NetworkInfo;
import com.datadog.android.privacy.TrackingConsent;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001f\b\u0086\b\u0018\u00002\u00020\u0001B£\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004\u0012 \u0010\u001a\u001a\u001c\u0012\u0004\u0012\u00020\u0004\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00190\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b#\u0010$R\u0013\u0010'\u001a\u0004\u0018\u00010\u00048\u0007¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b'\u0010&R\u0014\u0010)\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b+\u0010&R.\u0010%\u001a\u001c\u0012\u0004\u0012\u00020\u0004\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00190\u00198\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b(\u0010,R\u0014\u0010/\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00102\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b3\u0010&R\u0014\u00104\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b4\u0010&R\u001a\u0010-\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b%\u00107R\u0014\u00108\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b/\u0010&R\u0014\u0010:\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b2\u00109R\u0014\u00100\u001a\u00020\u00168\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010;\u001a\u00020\u00148\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010=\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b:\u0010&R\u0014\u0010?\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b8\u0010&"}, d2 = {"LrecalculateTransformMatrixAndCropRect;", "", "Lcom/datadog/android/DatadogSite;", "p0", "", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "LonValidImageAvailable;", "p8", "LlambdaanalyzeImage0androidxcameracoreImageAnalysisAbstractAnalyzer;", "p9", "Lcom/datadog/android/api/context/NetworkInfo;", "p10", "LacquireImage;", "p11", "LlambdaanalyzeImage1androidxcameracoreImageAnalysisAbstractAnalyzer;", "p12", "Lcom/datadog/android/privacy/TrackingConsent;", "p13", "p14", "", "p15", "<init>", "(Lcom/datadog/android/DatadogSite;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LonValidImageAvailable;LlambdaanalyzeImage0androidxcameracoreImageAnalysisAbstractAnalyzer;Lcom/datadog/android/api/context/NetworkInfo;LacquireImage;LlambdaanalyzeImage1androidxcameracoreImageAnalysisAbstractAnalyzer;Lcom/datadog/android/privacy/TrackingConsent;Ljava/lang/String;Ljava/util/Map;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Ljava/lang/String;", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "LacquireImage;", "TuitionPaymentFragmentbindingInflater1", "Ljava/util/Map;", "g", "Lcom/datadog/android/api/context/NetworkInfo;", "asBinder", "notify", "LlambdaanalyzeImage0androidxcameracoreImageAnalysisAbstractAnalyzer;", "a", "d", "asInterface", "INotificationSideChannelStub", "Lcom/datadog/android/DatadogSite;", "()Lcom/datadog/android/DatadogSite;", "cancelAll", "LonValidImageAvailable;", "onTransact", "INotificationSideChannel", "Lcom/datadog/android/privacy/TrackingConsent;", "cancel", "LlambdaanalyzeImage1androidxcameracoreImageAnalysisAbstractAnalyzer;", "getInterfaceDescriptor"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final /* data */ class recalculateTransformMatrixAndCropRect {

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
    public final TrackingConsent notify;

    /* JADX INFO: renamed from: INotificationSideChannelStub, reason: from kotlin metadata */
    private final DatadogSite g;
    public final String TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public final Map<String, Map<String, Object>> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public final String b;
    public final acquireImage TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final onValidImageAvailable onTransact;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    public final String cancelAll;
    public final String asInterface;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    public final lambdaanalyzeImage1androidxcameracoreImageAnalysisAbstractAnalyzer INotificationSideChannel;

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    public final String getInterfaceDescriptor;
    public final String d;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final NetworkInfo asBinder;

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    private final lambdaanalyzeImage0androidxcameracoreImageAnalysisAbstractAnalyzer a;

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    public final String cancel;
    private static final byte[] $$c = {104, 27, -72, 120};
    private static final int $$f = 233;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {21, ByteCompanionObject.MAX_VALUE, 49, -115, 41, 9, 7, 21, 8, -9, 9, 18, 1, -10, 42, 5, -4, 3, 10, 10, 22, -38, 59, 4, -7, 21, 4, -5, 19, -17, 46, -3, 14, -4, 5, 23, -3, 2, -15, 29, 20, -3, 10, 5, -41, 41, -4, 19, -3, 14, 7, -22, 25, 32, -4, 0, 17, 14, -38, 52, -9, 14, 14, 0, 17, 14, 7, 5, -3, 6, 14, 0, 19, 5, 13, 6, 5, 13, -1, 7, 26, -5, 4, 26, -34, 42, -3, 9, 15, 0, 9, 9, 3, 28, -1, 16, -59};
    private static final int $$e = 169;
    private static final byte[] $$a = {63, 56, -36, -117, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
    private static final int $$b = 200;
    private static int RemoteActionCompatParcelizer = 0;
    private static int INotificationSideChannelDefault = 1;
    private static char[] getInterfaceDescriptor = {2476, 2196, 3015, 2586, 3454, 4023, 3811, 354, 26, 849, 1477, 1219, 1824, 1653, 6331, 7057, 6864, 7465, 7295, 7863, 4578, 4133, 45561, 45255, 45971, 45641, 46387, 47082, 46770, 47439, 47169, 47890, 48598, 48309, 48993, 48698, 41211, 48533, 48301, 49150, 48675, 47431, 48014, 47834, 46427, 46125, 46955, 45474, 45191, 45857, 45660, 44162, 44964, 44786, 43322, 43102, 43672, 42476, 42015, 42812, 42592, 41149, 41935, 55156, 54869, 54539, 54464, 54190, 53610, 53289, 57303, 57055, 56712, 56157, 55843, 55776, 55485, 50785, 50503, 50184, 50142, 54054, 53786, 53588, 53384, 55230, 54579, 54375, 56227, 55955, 55693, 57145, 56936, 56747, 56563, 49707, 49432, 45557, 45263, 45975, 45655, 46388, 47078, 46754, 47460, 47212, 47890, 48585, 48297, 48971, 48696, 41210, 41920};
    private static long INotificationSideChannelStubProxy = -7307487835410943829L;

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = defpackage.recalculateTransformMatrixAndCropRect.$$a
            int r1 = 53 - r7
            int r6 = r6 + 4
            int r8 = r8 * 14
            int r8 = r8 + 84
            byte[] r1 = new byte[r1]
            int r7 = 52 - r7
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r4 = r2
            r8 = r6
            goto L2e
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r6 = r6 + 1
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
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
            int r3 = r3 + r6
            int r6 = r3 + (-10)
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.recalculateTransformMatrixAndCropRect.c(byte, short, byte, java.lang.Object[]):void");
    }

    private static void f(byte b, byte b2, short s, Object[] objArr) {
        int i = b * 11;
        int i2 = 84 - (b2 * 16);
        byte[] bArr = $$d;
        int i3 = 45 - (s * 41);
        byte[] bArr2 = new byte[53 - i];
        int i4 = 52 - i;
        int i5 = -1;
        if (bArr == null) {
            i3++;
            i2 = (i2 + i4) - 8;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i2;
            if (i5 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                byte b3 = bArr[i3];
                i3++;
                i2 = (i2 + b3) - 8;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public recalculateTransformMatrixAndCropRect(DatadogSite datadogSite, String str, String str2, String str3, String str4, String str5, String str6, String str7, onValidImageAvailable onvalidimageavailable, lambdaanalyzeImage0androidxcameracoreImageAnalysisAbstractAnalyzer lambdaanalyzeimage0androidxcameracoreimageanalysisabstractanalyzer, NetworkInfo networkInfo, acquireImage acquireimage, lambdaanalyzeImage1androidxcameracoreImageAnalysisAbstractAnalyzer lambdaanalyzeimage1androidxcameracoreimageanalysisabstractanalyzer, TrackingConsent trackingConsent, String str8, Map<String, ? extends Map<String, ? extends Object>> map) {
        Intrinsics.checkNotNullParameter(datadogSite, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(onvalidimageavailable, "");
        Intrinsics.checkNotNullParameter(lambdaanalyzeimage0androidxcameracoreimageanalysisabstractanalyzer, "");
        Intrinsics.checkNotNullParameter(networkInfo, "");
        Intrinsics.checkNotNullParameter(acquireimage, "");
        Intrinsics.checkNotNullParameter(lambdaanalyzeimage1androidxcameracoreimageanalysisabstractanalyzer, "");
        Intrinsics.checkNotNullParameter(trackingConsent, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.g = datadogSite;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str;
        this.asInterface = str2;
        this.TuitionPaymentFragmentbindingInflater1 = str3;
        this.getInterfaceDescriptor = str4;
        this.cancel = str5;
        this.cancelAll = str6;
        this.d = str7;
        this.onTransact = onvalidimageavailable;
        this.a = lambdaanalyzeimage0androidxcameracoreimageanalysisabstractanalyzer;
        this.asBinder = networkInfo;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = acquireimage;
        this.INotificationSideChannel = lambdaanalyzeimage1androidxcameracoreimageanalysisabstractanalyzer;
        this.notify = trackingConsent;
        this.b = str8;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = map;
    }

    private static void e(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        int i4 = $11 + 117;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i6 = $11 + 33;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                try {
                    Object[] objArr2 = {Integer.valueOf(getInterfaceDescriptor[i - i7])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b = (byte) 2;
                        byte b2 = (byte) (b - 2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (KeyEvent.getMaxKeyCode() >> 16), Color.alpha(0) + 2187, 40 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 841711447, false, $$g(b, b2, b2), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i7), Long.valueOf(INotificationSideChannelStubProxy), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (33017 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), ((byte) KeyEvent.getModifierMetaStateMask()) + 3012, 26 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 321985076, false, $$g(b3, b4, b4), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i7] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cMyTid = (char) (36505 - (Process.myTid() >> 22));
                        int mirror = 3424 - AndroidCharacter.getMirror('0');
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 18;
                        byte b5 = (byte) ($$f & 7);
                        byte b6 = (byte) (b5 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cMyTid, mirror, iLastIndexOf, -968507904, false, $$g(b5, b6, b6), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i8 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                Object[] objArr5 = {Integer.valueOf(getInterfaceDescriptor[i + i8])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b7 = (byte) 2;
                    byte b8 = (byte) (b7 - 2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 2186, 41 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 841711447, false, $$g(b7, b8, b8), new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).longValue()), Long.valueOf(i8), Long.valueOf(INotificationSideChannelStubProxy), Integer.valueOf(c)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    byte b9 = (byte) 0;
                    byte b10 = b9;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (33017 - (Process.myTid() >> 22)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 3010, 26 - TextUtils.indexOf("", "", 0), 321985076, false, $$g(b9, b10, b10), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i8] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char cCombineMeasuredStates = (char) (36505 - View.combineMeasuredStates(0, 0));
                    int iKeyCodeFromString = 3376 - KeyEvent.keyCodeFromString("");
                    int i9 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 16;
                    byte b11 = (byte) ($$f & 7);
                    byte b12 = (byte) (b11 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cCombineMeasuredStates, iKeyCodeFromString, i9, -968507904, false, $$g(b11, b12, b12), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7);
            }
        }
        char[] cArr = new char[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        int i10 = $10 + 85;
        $11 = i10 % 128;
        int i11 = i10 % 2;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
            Object[] objArr8 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                char c2 = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 36504);
                int maximumDrawingCacheSize = 3376 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                int iBlue = Color.blue(0) + 17;
                byte b13 = (byte) ($$f & 7);
                byte b14 = (byte) (b13 - 1);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c2, maximumDrawingCacheSize, iBlue, -968507904, false, $$g(b13, b14, b14), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr8);
        }
        objArr[0] = new String(cArr);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x024b  */
    public final DatadogSite TuitionPaymentFragmentspecialinlinedviewModeldefault2() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 31533);
            int trimmedLength = TextUtils.getTrimmedLength("") + 921;
            int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 28;
            byte[] bArr = $$a;
            byte b = bArr[37];
            Object[] objArr2 = new Object[1];
            c(b, (byte) (b & 52), bArr[7], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, trimmedLength, edgeSlop, -1048449946, false, (String) objArr2[0], null);
        }
        Object obj = null;
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1, 'F' - AndroidCharacter.getMirror('0'), (char) (View.MeasureSpec.getSize(0) + 47185), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 21, (Process.myPid() >> 22) + 15, (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char keyRepeatTimeout = (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 31533);
            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 922;
            int iLastIndexOf2 = 27 - TextUtils.lastIndexOf("", '0', 0, 0);
            byte[] bArr2 = $$a;
            byte b2 = bArr2[37];
            byte b3 = bArr2[80];
            Object[] objArr5 = new Object[1];
            c(b2, b3, b3, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(keyRepeatTimeout, iLastIndexOf, iLastIndexOf2, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char maximumDrawingCacheSize = (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 31533);
                int minimumFlingVelocity = 921 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 28;
                byte[] bArr3 = $$a;
                Object[] objArr6 = new Object[1];
                c((byte) 51, (byte) (-bArr3[33]), bArr3[80], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(maximumDrawingCacheSize, minimumFlingVelocity, iResolveOpacity, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i2 = ~startUptimeMillis;
            int i3 = (((1410948917 + ((((~((-704667713) | i2)) | (~((-295209476) | startUptimeMillis))) | (~((-69534745) | startUptimeMillis))) * 765)) + (((~((-999877188) | i2)) | 704667712) * 1530)) + (((~(startUptimeMillis | (-999877188))) | (~(i2 | (-69534745)))) * 765)) - 1749546510;
            int i4 = (i3 << 13) ^ i3;
            int i5 = i4 ^ (i4 >>> 17);
            ((int[]) objArr[0])[0] = i5 ^ (i5 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(37 - View.resolveSize(0, 0), 26 - ExpandableListView.getPackedPositionGroup(0L), (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 3176), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e((ViewConfiguration.getFadingEdgeLength() >> 16) + 63, 18 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (26299 - AndroidCharacter.getMirror('0')), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i6 = RemoteActionCompatParcelizer + 13;
                int i7 = i6 % 128;
                INotificationSideChannelDefault = i7;
                int i8 = i6 % 2;
                if (applicationContext instanceof ContextWrapper) {
                    int i9 = i7 + 91;
                    RemoteActionCompatParcelizer = i9 % 128;
                    if (i9 % 2 != 0) {
                        ((ContextWrapper) applicationContext).getBaseContext();
                        throw null;
                    }
                    if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = applicationContext.getApplicationContext();
                    } else {
                        int i10 = INotificationSideChannelDefault + 15;
                        RemoteActionCompatParcelizer = i10 % 128;
                        int i11 = i10 % 2;
                        applicationContext = null;
                    }
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                }
            }
            Object[] objArr10 = new Object[1];
            e(View.getDefaultSize(0, 0) + 81, 15 - TextUtils.indexOf((CharSequence) "", '0'), (char) (TextUtils.indexOf("", "") + 25296), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            e(97 - KeyEvent.getDeadChar(0, 0), 16 - View.resolveSize(0, 0), (char) TextUtils.indexOf("", "", 0, 0), objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i12 = RemoteActionCompatParcelizer + 121;
            INotificationSideChannelDefault = i12 % 128;
            int i13 = i12 % 2;
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, -1749546510};
                byte[] bArr4 = $$d;
                byte b4 = bArr4[12];
                byte b5 = b4;
                Object[] objArr13 = new Object[1];
                f(b4, b5, b5, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b6 = bArr4[55];
                byte b7 = b6;
                Object[] objArr14 = new Object[1];
                f(b6, b7, b7, objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c2 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 31532);
                    int iResolveOpacity2 = Drawable.resolveOpacity(0, 0) + 921;
                    int packedPositionGroup = 28 - ExpandableListView.getPackedPositionGroup(0L);
                    byte[] bArr5 = $$a;
                    Object[] objArr16 = new Object[1];
                    c((byte) 51, (byte) (-bArr5[33]), bArr5[80], objArr16);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, iResolveOpacity2, packedPositionGroup, -1142834547, false, (String) objArr16[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                try {
                    Object[] objArr17 = new Object[1];
                    e(Process.myPid() >> 22, 22 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (47185 - View.combineMeasuredStates(0, 0)), objArr17);
                    Class<?> cls5 = Class.forName((String) objArr17[0]);
                    Object[] objArr18 = new Object[1];
                    e((-16777194) - Color.rgb(0, 0, 0), 15 - (KeyEvent.getMaxKeyCode() >> 16), (char) ((-1) - TextUtils.lastIndexOf("", '0')), objArr18);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char c3 = (char) (31534 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                        int packedPositionGroup2 = 921 - ExpandableListView.getPackedPositionGroup(0L);
                        int iAlpha = 28 - Color.alpha(0);
                        byte[] bArr6 = $$a;
                        byte b8 = bArr6[37];
                        byte b9 = bArr6[80];
                        Object[] objArr19 = new Object[1];
                        c(b8, b9, b9, objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c3, packedPositionGroup2, iAlpha, -778300370, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cIndexOf = (char) (31532 - TextUtils.indexOf((CharSequence) "", '0'));
                        int i14 = 922 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                        int offsetAfter = 28 - TextUtils.getOffsetAfter("", 0);
                        byte[] bArr7 = $$a;
                        byte b10 = bArr7[37];
                        Object[] objArr20 = new Object[1];
                        c(b10, (byte) (b10 & 52), bArr7[7], objArr20);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf, i14, offsetAfter, -1048449946, false, (String) objArr20[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArr15;
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
        if (((int[]) objArr[3])[0] != ((int[]) objArr[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr == null) {
                throw null;
            }
            int i15 = RemoteActionCompatParcelizer + 81;
            INotificationSideChannelDefault = i15 % 128;
            int i16 = i15 % 2;
            for (String str : strArr) {
                arrayList.add(str);
            }
            throw null;
        }
        int i17 = ((int[]) objArr[0])[0];
        Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
        int iMyUid = Process.myUid();
        int i18 = i17 + (-1421106700) + ((~(1769819775 | iMyUid)) * (-301)) + (((~((-1766409853) | iMyUid)) | (~((~iMyUid) | 7669791))) * (-301)) + (((~(iMyUid | (-7669792))) | (-1766409853)) * 301);
        int i19 = (i18 << 13) ^ i18;
        int i20 = i19 ^ (i19 >>> 17);
        ((int[]) objArr21[0])[0] = i20 ^ (i20 << 5);
        int i21 = RemoteActionCompatParcelizer + 87;
        INotificationSideChannelDefault = i21 % 128;
        if (i21 % 2 != 0) {
            return this.g;
        }
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object p0) {
        int i = 2 % 2;
        if (this == p0) {
            int i2 = RemoteActionCompatParcelizer + 11;
            INotificationSideChannelDefault = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(p0 instanceof recalculateTransformMatrixAndCropRect)) {
            return false;
        }
        recalculateTransformMatrixAndCropRect recalculatetransformmatrixandcroprect = (recalculateTransformMatrixAndCropRect) p0;
        if (this.g != recalculatetransformmatrixandcroprect.g) {
            int i4 = RemoteActionCompatParcelizer + 9;
            INotificationSideChannelDefault = i4 % 128;
            return i4 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, recalculatetransformmatrixandcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
            int i5 = RemoteActionCompatParcelizer + 23;
            INotificationSideChannelDefault = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.asInterface, recalculatetransformmatrixandcroprect.asInterface)) {
            int i7 = RemoteActionCompatParcelizer + 85;
            INotificationSideChannelDefault = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, recalculatetransformmatrixandcroprect.TuitionPaymentFragmentbindingInflater1) || !Intrinsics.areEqual(this.getInterfaceDescriptor, recalculatetransformmatrixandcroprect.getInterfaceDescriptor) || !Intrinsics.areEqual(this.cancel, recalculatetransformmatrixandcroprect.cancel) || !Intrinsics.areEqual(this.cancelAll, recalculatetransformmatrixandcroprect.cancelAll) || !Intrinsics.areEqual(this.d, recalculatetransformmatrixandcroprect.d) || !Intrinsics.areEqual(this.onTransact, recalculatetransformmatrixandcroprect.onTransact) || !Intrinsics.areEqual(this.a, recalculatetransformmatrixandcroprect.a) || !Intrinsics.areEqual(this.asBinder, recalculatetransformmatrixandcroprect.asBinder)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, recalculatetransformmatrixandcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault3)) {
            int i9 = INotificationSideChannelDefault + 81;
            RemoteActionCompatParcelizer = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.INotificationSideChannel, recalculatetransformmatrixandcroprect.INotificationSideChannel)) {
            int i11 = RemoteActionCompatParcelizer + 117;
            INotificationSideChannelDefault = i11 % 128;
            return i11 % 2 == 0;
        }
        if (this.notify != recalculatetransformmatrixandcroprect.notify || !Intrinsics.areEqual(this.b, recalculatetransformmatrixandcroprect.b)) {
            return false;
        }
        if (Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, recalculatetransformmatrixandcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
            return true;
        }
        int i12 = RemoteActionCompatParcelizer + 19;
        INotificationSideChannelDefault = i12 % 128;
        int i13 = i12 % 2;
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = 2 % 2;
        int iHashCode = this.g.hashCode();
        int iHashCode2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode();
        int iHashCode3 = this.asInterface.hashCode();
        int iHashCode4 = this.TuitionPaymentFragmentbindingInflater1.hashCode();
        int iHashCode5 = this.getInterfaceDescriptor.hashCode();
        int iHashCode6 = this.cancel.hashCode();
        int iHashCode7 = this.cancelAll.hashCode();
        int iHashCode8 = this.d.hashCode();
        int iHashCode9 = this.onTransact.hashCode();
        int iHashCode10 = this.a.hashCode();
        int iHashCode11 = this.asBinder.hashCode();
        int iHashCode12 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode();
        int iHashCode13 = this.INotificationSideChannel.hashCode();
        int iHashCode14 = this.notify.hashCode();
        String str = this.b;
        if (str == null) {
            int i3 = INotificationSideChannelDefault + 39;
            RemoteActionCompatParcelizer = i3 % 128;
            i = i3 % 2 != 0 ? 1 : 0;
        } else {
            int iHashCode15 = str.hashCode();
            int i4 = INotificationSideChannelDefault + 65;
            RemoteActionCompatParcelizer = i4 % 128;
            int i5 = i4 % 2;
            i = iHashCode15;
        }
        return (((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + i) * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode();
    }

    public final String toString() {
        int i = 2 % 2;
        DatadogSite datadogSite = this.g;
        String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        String str2 = this.asInterface;
        String str3 = this.TuitionPaymentFragmentbindingInflater1;
        String str4 = this.getInterfaceDescriptor;
        String str5 = this.cancel;
        String str6 = this.cancelAll;
        String str7 = this.d;
        onValidImageAvailable onvalidimageavailable = this.onTransact;
        lambdaanalyzeImage0androidxcameracoreImageAnalysisAbstractAnalyzer lambdaanalyzeimage0androidxcameracoreimageanalysisabstractanalyzer = this.a;
        NetworkInfo networkInfo = this.asBinder;
        acquireImage acquireimage = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        lambdaanalyzeImage1androidxcameracoreImageAnalysisAbstractAnalyzer lambdaanalyzeimage1androidxcameracoreimageanalysisabstractanalyzer = this.INotificationSideChannel;
        TrackingConsent trackingConsent = this.notify;
        String str8 = this.b;
        Map<String, Map<String, Object>> map = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        StringBuilder sb = new StringBuilder("recalculateTransformMatrixAndCropRect(g=");
        sb.append(datadogSite);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
        sb.append(str);
        sb.append(", asInterface=");
        sb.append(str2);
        sb.append(", TuitionPaymentFragmentbindingInflater1=");
        sb.append(str3);
        sb.append(", getInterfaceDescriptor=");
        sb.append(str4);
        sb.append(", cancel=");
        sb.append(str5);
        sb.append(", cancelAll=");
        sb.append(str6);
        sb.append(", d=");
        sb.append(str7);
        sb.append(", onTransact=");
        sb.append(onvalidimageavailable);
        sb.append(", a=");
        sb.append(lambdaanalyzeimage0androidxcameracoreimageanalysisabstractanalyzer);
        sb.append(", asBinder=");
        sb.append(networkInfo);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
        sb.append(acquireimage);
        sb.append(", INotificationSideChannel=");
        sb.append(lambdaanalyzeimage1androidxcameracoreimageanalysisabstractanalyzer);
        sb.append(", notify=");
        sb.append(trackingConsent);
        sb.append(", b=");
        sb.append(str8);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
        sb.append(map);
        sb.append(")");
        String string = sb.toString();
        int i2 = INotificationSideChannelDefault + 59;
        RemoteActionCompatParcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 48 / 0;
        }
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r7, byte r8, byte r9) {
        /*
            int r8 = r8 * 2
            int r8 = r8 + 1
            byte[] r0 = defpackage.recalculateTransformMatrixAndCropRect.$$c
            int r9 = r9 * 3
            int r9 = 3 - r9
            int r7 = r7 * 3
            int r7 = 115 - r7
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r8
            r7 = r9
            r5 = r2
            goto L2c
        L17:
            r3 = r2
            r6 = r9
            r9 = r7
            r7 = r6
        L1b:
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            int r7 = r7 + 1
            if (r5 != r8) goto L2a
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L2a:
            r3 = r0[r7]
        L2c:
            int r3 = -r3
            int r9 = r9 + r3
            r3 = r5
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.recalculateTransformMatrixAndCropRect.$$g(byte, byte, byte):java.lang.String");
    }
}
