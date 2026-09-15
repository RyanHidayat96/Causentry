package defpackage;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.ViewCompat;
import com.datadog.android.api.InternalLogger;
import com.google.android.gms.measurement.internal.zznf;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ1\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0003\u001a\u00020\n2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u000f\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"LResolutionInfo;", "LImageAnalysisBlockingAnalyzer1;", "", "p0", "LgetY;", "p1", "Lcom/datadog/android/api/InternalLogger;", "p2", "<init>", "(Ljava/lang/String;LgetY;Lcom/datadog/android/api/InternalLogger;)V", "LrecalculateTransformMatrixAndCropRect;", "", "LImageCapture;", "", "LsetProcessedImageReaderProxy;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(LrecalculateTransformMatrixAndCropRect;Ljava/util/List;)LsetProcessedImageReaderProxy;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "b", "Lcom/datadog/android/api/InternalLogger;", "g", "LgetY;"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class ResolutionInfo implements ImageAnalysisBlockingAnalyzer1 {
    private static final byte[] TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final String TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InternalLogger TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final getY TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public ResolutionInfo(String str, getY gety, InternalLogger internalLogger) {
        Intrinsics.checkNotNullParameter(gety, "");
        Intrinsics.checkNotNullParameter(internalLogger, "");
        this.TuitionPaymentFragmentbindingInflater1 = str;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = gety;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = internalLogger;
    }

    @Override // defpackage.ImageAnalysisBlockingAnalyzer1
    public final setProcessedImageReaderProxy TuitionPaymentFragmentspecialinlinedviewModeldefault2(recalculateTransformMatrixAndCropRect recalculatetransformmatrixandcroprect, List<ImageCapture> list) {
        Intrinsics.checkNotNullParameter(recalculatetransformmatrixandcroprect, "");
        Intrinsics.checkNotNullParameter(list, "");
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        Pair[] pairArr = new Pair[2];
        pairArr[0] = TuplesKt.to("ddsource", recalculatetransformmatrixandcroprect.cancelAll);
        String str = recalculatetransformmatrixandcroprect.asInterface;
        String str2 = recalculatetransformmatrixandcroprect.getInterfaceDescriptor;
        String str3 = recalculatetransformmatrixandcroprect.d;
        String str4 = recalculatetransformmatrixandcroprect.TuitionPaymentFragmentbindingInflater1;
        String str5 = recalculatetransformmatrixandcroprect.cancel;
        List listMutableListOf = CollectionsKt.mutableListOf("service:".concat(String.valueOf(str)), "version:".concat(String.valueOf(str2)), "sdk_version:".concat(String.valueOf(str3)), "env:".concat(String.valueOf(str4)));
        if (str5.length() > 0) {
            listMutableListOf.add("variant:".concat(String.valueOf(str5)));
        }
        pairArr[1] = TuplesKt.to("ddtags", CollectionsKt.joinToString$default(listMutableListOf, ",", null, null, 0, null, null, 62, null));
        Map mapMapOf = MapsKt.mapOf(pairArr);
        Locale locale = Locale.US;
        String intakeEndpoint = this.TuitionPaymentFragmentbindingInflater1;
        if (intakeEndpoint == null) {
            intakeEndpoint = recalculatetransformmatrixandcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault2().getIntakeEndpoint();
        }
        String str6 = String.format(locale, "%s/api/v2/rum", Arrays.copyOf(new Object[]{intakeEndpoint}, 1));
        Intrinsics.checkNotNullExpressionValue(str6, "");
        ArrayList arrayList = new ArrayList(mapMapOf.size());
        for (Map.Entry entry : mapMapOf.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            StringBuilder sb = new StringBuilder();
            sb.append(key);
            sb.append("=");
            sb.append(value);
            arrayList.add(sb.toString());
        }
        String strJoinToString$default = CollectionsKt.joinToString$default(arrayList, "&", "?", null, 0, null, null, 60, null);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str6);
        sb2.append(strJoinToString$default);
        String string2 = sb2.toString();
        Map mapMapOf2 = MapsKt.mapOf(TuplesKt.to("DD-API-KEY", recalculatetransformmatrixandcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault1), TuplesKt.to("DD-EVP-ORIGIN", recalculatetransformmatrixandcroprect.cancelAll), TuplesKt.to("DD-EVP-ORIGIN-VERSION", recalculatetransformmatrixandcroprect.d), TuplesKt.to("DD-REQUEST-ID", string));
        getY gety = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Intrinsics.checkNotNullParameter(list, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        List<ImageCapture> list2 = list;
        for (ImageCapture imageCapture : list2) {
            getSize getsizeTuitionPaymentFragmentspecialinlinedviewModeldefault1 = gety.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(imageCapture.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            if (getsizeTuitionPaymentFragmentspecialinlinedviewModeldefault1 instanceof getSize.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                Pair pair = TuplesKt.to(imageCapture, getsizeTuitionPaymentFragmentspecialinlinedviewModeldefault1);
                linkedHashMap2.put(pair.getFirst(), pair.getSecond());
                getSize.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = (getSize.TuitionPaymentFragmentspecialinlinedviewModeldefault2) getsizeTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                String str7 = tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                long j = tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                Long l = (Long) linkedHashMap.get(str7);
                if (l == null) {
                    linkedHashMap.put(str7, Long.valueOf(j));
                } else {
                    linkedHashMap.put(str7, Long.valueOf(Math.max(j, l.longValue())));
                    string2 = string2;
                }
            }
        }
        String str8 = string2;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list2) {
            ImageCapture imageCapture2 = (ImageCapture) obj;
            if (linkedHashMap2.containsKey(imageCapture2)) {
                getSize.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = (getSize.TuitionPaymentFragmentspecialinlinedviewModeldefault2) MapsKt.getValue(linkedHashMap2, imageCapture2);
                if (tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == ((Number) MapsKt.getValue(linkedHashMap, tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3)).longValue()) {
                }
            }
            arrayList2.add(obj);
        }
        ArrayList arrayList3 = arrayList2;
        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            arrayList4.add(((ImageCapture) it.next()).TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
        ArrayList arrayList5 = arrayList4;
        byte[] bArr = TuitionPaymentFragmentbindingInflater1;
        InternalLogger internalLogger = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        byte[] bArr2 = new byte[0];
        byte[] bArr3 = new byte[0];
        Intrinsics.checkNotNullParameter(arrayList5, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(bArr2, "");
        Intrinsics.checkNotNullParameter(bArr3, "");
        Intrinsics.checkNotNullParameter(internalLogger, "");
        ArrayList arrayList6 = arrayList5;
        Iterator it2 = arrayList6.iterator();
        int length = 0;
        while (it2.hasNext()) {
            length += ((byte[]) it2.next()).length;
        }
        byte[] bArr4 = new byte[length + (!arrayList5.isEmpty() ? (arrayList5.size() - 1) * bArr.length : 0)];
        ImageProxy.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bArr2, bArr4, 0, 0, internalLogger);
        int length2 = 0;
        for (IndexedValue indexedValue : CollectionsKt.withIndex(arrayList6)) {
            ImageProxy.TuitionPaymentFragmentspecialinlinedviewModeldefault3((byte[]) indexedValue.getValue(), bArr4, length2, ((byte[]) indexedValue.getValue()).length, internalLogger);
            length2 += ((byte[]) indexedValue.getValue()).length;
            if (indexedValue.getIndex() != arrayList5.size() - 1) {
                ImageProxy.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bArr, bArr4, length2, bArr.length, internalLogger);
                length2 += bArr.length;
            }
        }
        ImageProxy.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bArr3, bArr4, length2, 0, internalLogger);
        return new setProcessedImageReaderProxy(string, "RUM Request", str8, mapMapOf2, bArr4, "text/plain;charset=UTF-8");
    }

    /* JADX INFO: renamed from: ResolutionInfo$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"LResolutionInfo$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "", "TuitionPaymentFragmentbindingInflater1", "[B", "TuitionPaymentFragmentspecialinlinedviewModeldefault3"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {97, 58, 103, -72, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
        private static final int $$e = 173;
        private static final byte[] $$a = {51, -99, -8, -59, 15, -8, 16, -1, -4, -3, -52, 55, 14, 1, 8, -13, 11, 8, -68, 68, -1, -61, 36, 19, 4, 10, -8, 8, 0, -22, 22, 15, -11, 8, 0, 15, 0, 17, -34, 19, 4, 10, -8, 8, 0, -26, 39, -6, 11};
        private static final int $$b = 242;
        private static int b = 0;
        private static int TuitionPaymentFragmentbindingInflater1 = 1;
        private static long TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 499609660085318500L;

        /* JADX WARN: Code duplicated, block: B:10:0x0028  */
        /* JADX WARN: Code duplicated, block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002c). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(byte r5, short r6, int r7, java.lang.Object[] r8) {
            /*
                byte[] r0 = defpackage.ResolutionInfo.Companion.$$a
                int r6 = r6 * 19
                int r1 = 33 - r6
                int r7 = r7 * 32
                int r7 = 35 - r7
                int r5 = r5 * 6
                int r5 = r5 + 97
                byte[] r1 = new byte[r1]
                int r6 = 32 - r6
                r2 = 0
                if (r0 != 0) goto L18
                r4 = r6
                r3 = r2
                goto L2c
            L18:
                r3 = r2
            L19:
                byte r4 = (byte) r5
                int r7 = r7 + 1
                r1[r3] = r4
                if (r3 != r6) goto L28
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                r8[r2] = r5
                return
            L28:
                r4 = r0[r7]
                int r3 = r3 + 1
            L2c:
                int r5 = r5 + r4
                int r5 = r5 + (-2)
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ResolutionInfo.Companion.a(byte, short, int, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0023  */
        /* JADX WARN: Code duplicated, block: B:8:0x001b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(byte r6, int r7, short r8, java.lang.Object[] r9) {
            /*
                int r6 = r6 + 84
                int r7 = r7 + 4
                int r8 = r8 * 52
                int r0 = r8 + 1
                byte[] r1 = defpackage.ResolutionInfo.Companion.$$d
                byte[] r0 = new byte[r0]
                r2 = 0
                if (r1 != 0) goto L13
                r6 = r7
                r4 = r8
                r3 = r2
                goto L2a
            L13:
                r3 = r2
            L14:
                int r7 = r7 + 1
                byte r4 = (byte) r6
                r0[r3] = r4
                if (r3 != r8) goto L23
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L23:
                r4 = r1[r7]
                int r3 = r3 + 1
                r5 = r7
                r7 = r6
                r6 = r5
            L2a:
                int r7 = r7 + r4
                int r7 = r7 + (-11)
                r5 = r7
                r7 = r6
                r6 = r5
                goto L14
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ResolutionInfo.Companion.c(byte, int, short, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:48:0x01f7  */
        /* JADX WARN: Code duplicated, block: B:49:0x01f8  */
        private static void d(char[] cArr, int i, Object[] objArr) throws Throwable {
            Object obj;
            Throwable cause;
            int i2 = 2 % 2;
            getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
            getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
            int length = cArr.length;
            long[] jArr = new long[length];
            getrealtimecapturelatency.b = 0;
            while (true) {
                obj = null;
                if (getrealtimecapturelatency.b >= cArr.length) {
                    break;
                }
                int i3 = $11 + 89;
                $10 = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = getrealtimecapturelatency.b;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (Gravity.getAbsoluteGravity(0, 0) + 19472), MotionEvent.axisFromString("") + 2625, 12 - ImageFormat.getBitsPerPixel(0), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                        }
                        jArr[i4] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ 9053247990562531611L);
                        Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (39421 - TextUtils.indexOf((CharSequence) "", '0')), 480 - ExpandableListView.getPackedPositionChild(0L), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                    } catch (Throwable th) {
                        cause = th.getCause();
                        if (cause != null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    int i5 = getrealtimecapturelatency.b;
                    try {
                        Object[] objArr4 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 19472), View.MeasureSpec.makeMeasureSpec(0, 0) + 2624, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 12, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                        }
                        jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).longValue() ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ 9053247990562531611L);
                        Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (39422 - View.resolveSizeAndState(0, 0, 0)), 481 - TextUtils.indexOf("", "", 0, 0), Process.getGidForName("") + 38, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                cause = th.getCause();
                if (cause != null) {
                    throw th;
                }
                throw cause;
            }
            char[] cArr2 = new char[length];
            getrealtimecapturelatency.b = 0;
            int i6 = $11 + 39;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            while (getrealtimecapturelatency.b < cArr.length) {
                int i8 = $11 + 103;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                Object[] objArr6 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (TextUtils.getOffsetBefore("", 0) + 39422), 481 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 37 - View.resolveSizeAndState(0, 0, 0), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
            }
            objArr[0] = new String(cArr2);
            int i10 = $11 + 33;
            $10 = i10 % 128;
            if (i10 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:103:0x0870  */
        public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3(List list) throws Throwable {
            Method[] methodArr;
            Class<?> cls;
            String str;
            Class<?>[] clsArr;
            char c;
            Class<?> cls2;
            String str2;
            Class<?>[] clsArr2;
            char c2;
            char c3;
            boolean z;
            int i;
            String string;
            int i2;
            int i3;
            Method method;
            Object obj;
            Long l;
            int i4 = 2;
            int i5 = 2 % 2;
            int i6 = b + 109;
            TuitionPaymentFragmentbindingInflater1 = i6 % 128;
            int i7 = 0;
            if (i6 % 2 == 0) {
                methodArr = new Method[4];
                byte[] bArr = $$a;
                byte b2 = bArr[28];
                Object[] objArr = new Object[1];
                a(b2, b2, bArr[13], objArr);
                cls = Class.forName((String) objArr[0]);
                byte b3 = bArr[13];
                Object[] objArr2 = new Object[1];
                a(b3, b3, bArr[28], objArr2);
                str = (String) objArr2[0];
                clsArr = new Class[5];
                c = 1;
            } else {
                methodArr = new Method[2];
                byte[] bArr2 = $$a;
                byte b4 = bArr2[28];
                Object[] objArr3 = new Object[1];
                a(b4, b4, bArr2[13], objArr3);
                cls = Class.forName((String) objArr3[0]);
                byte b5 = bArr2[13];
                Object[] objArr4 = new Object[1];
                a(b5, b5, bArr2[28], objArr4);
                str = (String) objArr4[0];
                clsArr = new Class[2];
                c = 0;
            }
            clsArr[0] = String.class;
            clsArr[1] = Integer.TYPE;
            methodArr[c] = cls.getMethod(str, clsArr);
            int i8 = b + 105;
            TuitionPaymentFragmentbindingInflater1 = i8 % 128;
            if (i8 % 2 == 0) {
                cls2 = Class.forName("android.app.ApplicationPackageManager");
                byte[] bArr3 = $$a;
                byte b6 = bArr3[13];
                byte b7 = bArr3[28];
                Object[] objArr5 = new Object[1];
                a(b6, b6, b7, objArr5);
                str2 = (String) objArr5[0];
                clsArr2 = new Class[3];
                c3 = 1;
                c2 = 0;
            } else {
                cls2 = Class.forName("android.app.ApplicationPackageManager");
                byte[] bArr4 = $$a;
                byte b8 = bArr4[13];
                byte b9 = bArr4[28];
                Object[] objArr6 = new Object[1];
                a(b8, b8, b9, objArr6);
                str2 = (String) objArr6[0];
                clsArr2 = new Class[2];
                c2 = 1;
                c3 = 0;
            }
            clsArr2[c3] = String.class;
            clsArr2[1] = Integer.TYPE;
            methodArr[c2] = cls2.getMethod(str2, clsArr2);
            int i9 = b;
            int i10 = ((i9 | 39) << 1) - (i9 ^ 39);
            TuitionPaymentFragmentbindingInflater1 = i10 % 128;
            int i11 = i10 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
            long j = 0;
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 2824;
                int i12 = 23 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                byte[] bArr5 = $$d;
                byte b10 = bArr5[7];
                byte b11 = bArr5[5];
                Object[] objArr7 = new Object[1];
                c(b10, b11, (byte) (-b11), objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(keyRepeatDelay, iIndexOf, i12, 1814927978, false, (String) objArr7[0], null);
            }
            Class<?>[] clsArr3 = null;
            try {
                if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null) == null) {
                    int i13 = b;
                    int i14 = (i13 ^ 33) + ((i13 & 33) << 1);
                    TuitionPaymentFragmentbindingInflater1 = i14 % 128;
                    int i15 = i14 % 2;
                    Method[] declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) Color.alpha(0), 2822 - ExpandableListView.getPackedPositionChild(0L), 22 - View.MeasureSpec.makeMeasureSpec(0, 0))).getDeclaredMethods();
                    int length = declaredMethods.length;
                    int i16 = b + 53;
                    TuitionPaymentFragmentbindingInflater1 = i16 % 128;
                    int i17 = i16 % 2;
                    int i18 = 0;
                    while (i18 < length) {
                        Method method2 = declaredMethods[i18];
                        int i19 = TuitionPaymentFragmentbindingInflater1;
                        int i20 = ((i19 | 97) << 1) - (i19 ^ 97);
                        b = i20 % 128;
                        int i21 = i20 % i4;
                        try {
                            Object[] objArr8 = new Object[1];
                            d(new char[]{39445, 13423, 50923, 37197, 9109, 61990, 36024, 24326, 59792, 48040, 19047, 58561, 46933, 16814, 4148, 41603, 32027, 4048, 55744, 26745, 15071, 54610, 26534, 13884}, (ExpandableListView.getPackedPositionForChild(i7, i7) > j ? 1 : (ExpandableListView.getPackedPositionForChild(i7, i7) == j ? 0 : -1)) + 44658, objArr8);
                            Class<?> cls3 = Class.forName((String) objArr8[i7]);
                            Object[] objArr9 = new Object[1];
                            d(new char[]{39448, 58009, 27405, 62395, 30748, 49300, 18692, 53644, 24078, 42625, 12051, 47021}, 30850 - (~(ViewConfiguration.getKeyRepeatDelay() >> 16)), objArr9);
                            int iIntValue = ((Integer) cls3.getMethod((String) objArr9[i7], clsArr3).invoke(method2, clsArr3)).intValue();
                            Object[] objArr10 = new Object[1];
                            objArr10[i7] = Integer.valueOf(iIntValue);
                            int i22 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                            int i23 = (i22 * 46) - (-1827074);
                            int i24 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            int i25 = ~(((-39720) ^ i24) | ((-39720) & i24));
                            int i26 = ((i22 ^ i25) | (i25 & i22)) * (-90);
                            int i27 = ((i23 | i26) << 1) - (i23 ^ i26);
                            int i28 = ~((-39720) | iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                            int i29 = ~((i22 ^ 39719) | (i22 & 39719));
                            int i30 = i27 + (((i28 ^ i29) | (i28 & i29)) * (-45));
                            int i31 = ~i22;
                            int i32 = ~((i31 & iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | (i31 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2));
                            int i33 = (i32 & (-39720)) | ((-39720) ^ i32);
                            int i34 = ~((i22 & i24) | (i24 ^ i22));
                            int i35 = -(-(((i34 & i33) | (i33 ^ i34)) * 45));
                            int i36 = (i30 & i35) + (i30 | i35);
                            Object[] objArr11 = new Object[1];
                            d(new char[]{39445, 313, 44103, 19307, 63181, 40400, 14580, 41984, 17184, 60942, 38283, 12471, 57293, 31464, 58936, 36181, 10363, 55238, 29324, 6645, 34071, 8229, 53059, 27287, 4530, 48322}, i36, objArr11);
                            Class<?> cls4 = Class.forName((String) objArr11[i7]);
                            int scrollBarSize = ViewConfiguration.getScrollBarSize() >> 8;
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                            int i37 = ~scrollBarSize;
                            int i38 = (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ 8317) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 & 8317);
                            int i39 = ~i38;
                            int i40 = (((scrollBarSize * (-109)) - (-923187)) - (~(((i37 ^ i39) | (i39 & i37)) * (-220)))) - 1;
                            int i41 = ~((scrollBarSize & 8317) | (scrollBarSize ^ 8317));
                            int i42 = ~i38;
                            int i43 = (((i40 - (~(-(-(((i42 & i41) | (i41 ^ i42)) * 220))))) - 1) - (~(((~((i37 ^ 8317) | (i37 & 8317))) | (~(((-8318) & scrollBarSize) | ((-8318) ^ scrollBarSize)))) * 110))) - 1;
                            Object[] objArr12 = new Object[1];
                            d(new char[]{39446, 47729, 56011, 64361, 7167, 14439, 22759, 31089}, i43, objArr12);
                            if (((Boolean) cls4.getMethod((String) objArr12[0], Integer.TYPE).invoke(null, objArr10)).booleanValue()) {
                                Class cls5 = Long.TYPE;
                                int i44 = -(-(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                                int i45 = (i44 & 44656) + (i44 | 44656);
                                Object[] objArr13 = new Object[1];
                                d(new char[]{39445, 13423, 50923, 37197, 9109, 61990, 36024, 24326, 59792, 48040, 19047, 58561, 46933, 16814, 4148, 41603, 32027, 4048, 55744, 26745, 15071, 54610, 26534, 13884}, i45, objArr13);
                                Class<?> cls6 = Class.forName((String) objArr13[0]);
                                int i46 = -(-KeyEvent.getDeadChar(0, 0));
                                int i47 = (i46 & 56473) + (i46 | 56473);
                                Object[] objArr14 = new Object[1];
                                d(new char[]{39448, 18051, 9017, 4070, 59518, 54518, 45468, 37410, 32473, 23370, 2044, 57500, 52534}, i47, objArr14);
                                if (cls5.equals(cls6.getMethod((String) objArr14[0], null).invoke(method2, null))) {
                                    int i48 = b;
                                    int i49 = (i48 ^ 99) + ((i48 & 99) << 1);
                                    TuitionPaymentFragmentbindingInflater1 = i49 % 128;
                                    int i50 = i49 % 2;
                                    char[] cArr = {39445, 13423, 50923, 37197, 9109, 61990, 36024, 24326, 59792, 48040, 19047, 58561, 46933, 16814, 4148, 41603, 32027, 4048, 55744, 26745, 15071, 54610, 26534, 13884};
                                    int scrollBarSize2 = ViewConfiguration.getScrollBarSize() >> 8;
                                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                    int i51 = (scrollBarSize2 * (-520)) + 23310954;
                                    int i52 = ~scrollBarSize2;
                                    int i53 = (i52 & 44657) | (i52 ^ 44657);
                                    int i54 = (~((i53 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i53 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4))) * 521;
                                    int i55 = (i51 ^ i54) + ((i51 & i54) << 1);
                                    int i56 = (~((-44658) | scrollBarSize2)) * (-1042);
                                    int i57 = (i55 ^ i56) + ((i56 & i55) << 1);
                                    int i58 = ~(((-44658) & scrollBarSize2) | ((-44658) ^ scrollBarSize2));
                                    int i59 = ~scrollBarSize2;
                                    int i60 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                                    int i61 = (i59 & i60) | (i59 ^ i60);
                                    int i62 = TuitionPaymentFragmentbindingInflater1 + 33;
                                    b = i62 % 128;
                                    int i63 = i62 % 2;
                                    int i64 = ~((i61 & 44657) | (i61 ^ 44657));
                                    int i65 = (i57 - (~(521 * ((i64 & i58) | (i58 ^ i64))))) - 1;
                                    Object[] objArr15 = new Object[1];
                                    d(cArr, i65, objArr15);
                                    Class<?> cls7 = Class.forName((String) objArr15[0]);
                                    char[] cArr2 = {39448, 50805, 8917, 36706, 60322, 21542, 45188, 7451, 31074, 42476, 1612, 25288, 53023, 11173, 37917, 61595, 23804};
                                    int i66 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                    int i67 = i66 * (-1975);
                                    int i68 = ((i67 | 23402707) << 1) - (i67 ^ 23402707);
                                    int i69 = ~i66;
                                    int i70 = TuitionPaymentFragmentbindingInflater1;
                                    int i71 = ((i70 | 7) << 1) - (i70 ^ 7);
                                    b = i71 % 128;
                                    int i72 = i71 % 2;
                                    int i73 = ~((i69 & 23663) | (i69 ^ 23663));
                                    int i74 = i68 + (988 * ((i73 & iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault5 ^ i73)));
                                    int i75 = ~(((-23664) ^ i66) | ((-23664) & i66));
                                    int i76 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                                    int i77 = ~((i76 ^ i66) | (i66 & i76));
                                    int i78 = -(-(((i75 ^ i77) | (i75 & i77)) * (-1976)));
                                    int i79 = (i74 ^ i78) + ((i78 & i74) << 1);
                                    int i80 = ~((i69 ^ 23663) | (i69 & 23663));
                                    int i81 = ~(((-23664) & iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | ((-23664) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5));
                                    int i82 = i79 + (((i81 & i80) | (i80 ^ i81) | (~((i76 ^ 23663) | (i76 & 23663)))) * 988);
                                    Object[] objArr16 = new Object[1];
                                    d(cArr2, i82, objArr16);
                                    Object[] objArr17 = (Object[]) cls7.getMethod((String) objArr16[0], null).invoke(method2, null);
                                    if (objArr17.length == 2 && Long.TYPE.equals(objArr17[0])) {
                                        int i83 = TuitionPaymentFragmentbindingInflater1;
                                        int i84 = (i83 ^ 123) + ((i83 & 123) << 1);
                                        b = i84 % 128;
                                        int i85 = i84 % 2;
                                        char[] cArr3 = {39445, 13423, 50923, 37197, 9109, 61990, 36024, 24326, 59792, 48040, 19047, 58561, 46933, 16814, 4148, 41603, 32027, 4048, 55744, 26745, 15071, 54610, 26534, 13884};
                                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                                        if (i85 != 0) {
                                            int i86 = 44656 >> (jElapsedRealtime > 1L ? 1 : (jElapsedRealtime == 1L ? 0 : -1));
                                            Object[] objArr18 = new Object[1];
                                            d(cArr3, i86, objArr18);
                                            obj = objArr18[0];
                                        } else {
                                            Object[] objArr19 = new Object[1];
                                            d(cArr3, 44655 - (~(-(-(jElapsedRealtime > 0L ? 1 : (jElapsedRealtime == 0L ? 0 : -1))))), objArr19);
                                            obj = objArr19[0];
                                        }
                                        if (Class.forName((String) obj).equals(objArr17[1])) {
                                            int i87 = TuitionPaymentFragmentbindingInflater1 + 99;
                                            b = i87 % 128;
                                            if (i87 % 2 != 0) {
                                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                    char packedPositionChild = (char) ((-1) - ExpandableListView.getPackedPositionChild(0L));
                                                    int iIndexOf2 = 2822 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                                                    int i88 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22;
                                                    byte[] bArr6 = $$d;
                                                    byte b12 = bArr6[7];
                                                    byte b13 = bArr6[5];
                                                    Object[] objArr20 = new Object[1];
                                                    c(b12, b13, (byte) (-b13), objArr20);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(packedPositionChild, iIndexOf2, i88, 1814927978, false, (String) objArr20[0], null);
                                                }
                                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).set(null, method2);
                                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                    char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                                                    int i89 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 2823;
                                                    int trimmedLength = TextUtils.getTrimmedLength("") + 22;
                                                    byte[] bArr7 = $$d;
                                                    byte b14 = bArr7[7];
                                                    byte b15 = bArr7[5];
                                                    Object[] objArr21 = new Object[1];
                                                    c(b14, b15, (byte) (-b15), objArr21);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(jumpTapTimeout, i89, trimmedLength, 1814927978, false, (String) objArr21[0], null);
                                                }
                                                Object[] objArr22 = {1L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null)};
                                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                                    char deadChar = (char) KeyEvent.getDeadChar(0, 0);
                                                    int packedPositionChild2 = 2822 - ExpandableListView.getPackedPositionChild(0L);
                                                    int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 23;
                                                    byte[] bArr8 = $$d;
                                                    byte b16 = bArr8[54];
                                                    Object[] objArr23 = new Object[1];
                                                    c(b16, (byte) (b16 | 32), bArr8[7], objArr23);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(deadChar, packedPositionChild2, bitsPerPixel, -2137287382, false, (String) objArr23[0], new Class[]{Long.TYPE, Method.class});
                                                }
                                                l = (Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr22);
                                            } else {
                                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                                    char cArgb = (char) Color.argb(0, 0, 0, 0);
                                                    int i90 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 2822;
                                                    int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 22;
                                                    byte[] bArr9 = $$d;
                                                    byte b17 = bArr9[7];
                                                    byte b18 = bArr9[5];
                                                    Object[] objArr24 = new Object[1];
                                                    c(b17, b18, (byte) (-b18), objArr24);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cArgb, i90, maxKeyCode, 1814927978, false, (String) objArr24[0], null);
                                                }
                                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, method2);
                                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                                    char bitsPerPixel2 = (char) ((-1) - ImageFormat.getBitsPerPixel(0));
                                                    int keyRepeatDelay2 = 2823 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                                                    int absoluteGravity = 22 - Gravity.getAbsoluteGravity(0, 0);
                                                    byte[] bArr10 = $$d;
                                                    byte b19 = bArr10[7];
                                                    byte b20 = bArr10[5];
                                                    Object[] objArr25 = new Object[1];
                                                    c(b19, b20, (byte) (-b20), objArr25);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(bitsPerPixel2, keyRepeatDelay2, absoluteGravity, 1814927978, false, (String) objArr25[0], null);
                                                }
                                                Object[] objArr26 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).get(null)};
                                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                                                    char keyRepeatDelay3 = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                                                    int packedPositionChild3 = ExpandableListView.getPackedPositionChild(0L) + 2824;
                                                    int iAxisFromString = 21 - MotionEvent.axisFromString("");
                                                    byte[] bArr11 = $$d;
                                                    byte b21 = bArr11[54];
                                                    Object[] objArr27 = new Object[1];
                                                    c(b21, (byte) (b21 | 32), bArr11[7], objArr27);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(keyRepeatDelay3, packedPositionChild3, iAxisFromString, -2137287382, false, (String) objArr27[0], new Class[]{Long.TYPE, Method.class});
                                                }
                                                l = (Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr26);
                                            }
                                            l.longValue();
                                            break;
                                        }
                                    }
                                } else {
                                    continue;
                                }
                            }
                            i18 = (((i18 | 74) << 1) - (i18 ^ 74)) - 73;
                            i4 = 2;
                            clsArr3 = null;
                            i7 = 0;
                            j = 0;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th;
                        }
                    }
                }
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                    char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                    int iIndexOf3 = 2822 - TextUtils.indexOf((CharSequence) "", '0');
                    int i91 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 21;
                    byte[] bArr12 = $$d;
                    byte b22 = bArr12[7];
                    byte b23 = bArr12[5];
                    Object[] objArr28 = new Object[1];
                    c(b22, b23, (byte) (-b23), objArr28);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cIndexOf, iIndexOf3, i91, 1814927978, false, (String) objArr28[0], null);
                }
                Object[] objArr29 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).get(null)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                    char edgeSlop = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                    int edgeSlop2 = (ViewConfiguration.getEdgeSlop() >> 16) + 2823;
                    int iMakeMeasureSpec = 22 - View.MeasureSpec.makeMeasureSpec(0, 0);
                    Object[] objArr30 = new Object[1];
                    c((byte) 14, (byte) 51, $$d[7], objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(edgeSlop, edgeSlop2, iMakeMeasureSpec, 1025296417, false, (String) objArr30[0], new Class[]{Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).invoke(null, objArr29);
                Object[] objArr31 = {0, methodArr, null};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                    char scrollBarSize3 = (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 37657);
                    int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 2720;
                    int i92 = 20 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                    Object[] objArr32 = new Object[1];
                    c((byte) 14, (byte) 51, $$d[7], objArr32);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(scrollBarSize3, touchSlop, i92, -1568796068, false, (String) objArr32[0], new Class[]{Integer.TYPE, Method[].class, List.class});
                }
                long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).invoke(null, objArr31)).longValue();
                long j2 = -1498965220;
                long j3 = -964;
                long j4 = (((long) (-963)) * j2) + j3 + (((long) 965) * jLongValue);
                long j5 = -1;
                long j6 = jLongValue ^ j5;
                long jFreeMemory = (int) Runtime.getRuntime().freeMemory();
                long j7 = j4 + (((j2 ^ j5) | ((j6 | jFreeMemory) ^ j5)) * j3) + (j3 * ((((jFreeMemory ^ j5) | j6) ^ j5) | ((j6 | j2) ^ j5))) + ((long) (-311440625));
                int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                int i93 = (-1171996230) + ((~(2024924456 | iElapsedRealtime)) * 216);
                int i94 = ~iElapsedRealtime;
                int i95 = ((int) (j7 >> 32)) & (i93 + ((2075651965 | i94) * (-216)) + (((~(i94 | 2024924456)) | (-587698046)) * 216));
                int i96 = (int) Runtime.getRuntime().totalMemory();
                int i97 = ~i96;
                int i98 = 1732915022 + ((~(1632748310 | i97)) * 979) + ((195521900 | i96) * (-979)) + (((~(i96 | 1632748310)) | (~(i97 | 195521900))) * 979);
                int i99 = TuitionPaymentFragmentbindingInflater1 + 45;
                int i100 = i99 % 128;
                b = i100;
                int i101 = i99 % 2;
                int i102 = i95 | (((int) j7) & i98);
                int i103 = i102 >>> 24;
                int i104 = i102 & ViewCompat.MEASURED_SIZE_MASK;
                if (i103 != 0) {
                    int i105 = (i100 ^ 29) + ((i100 & 29) << 1);
                    int i106 = i105 % 128;
                    TuitionPaymentFragmentbindingInflater1 = i106;
                    int i107 = i105 % 2;
                    int i108 = i106 + 5;
                    b = i108 % 128;
                    int i109 = i108 % 2;
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    int i110 = b;
                    int i111 = ((i110 | 25) << 1) - (i110 ^ 25);
                    TuitionPaymentFragmentbindingInflater1 = i111 % 128;
                    int i112 = i111 % 2;
                    i = 0;
                } else {
                    i = 1;
                }
                if (z) {
                    int i113 = TuitionPaymentFragmentbindingInflater1;
                    int i114 = (i113 & 123) + (i113 | 123);
                    int i115 = i114 % 128;
                    b = i115;
                    int i116 = i114 % 2;
                    if (i104 >= methodArr.length || (method = methodArr[i104]) == null) {
                        string = null;
                    } else {
                        int i117 = i115 + 105;
                        TuitionPaymentFragmentbindingInflater1 = i117 % 128;
                        if (i117 % 2 == 0) {
                            method.toString();
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                        string = method.toString();
                    }
                } else {
                    string = null;
                }
                list.add(string);
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                int i118 = TuitionPaymentFragmentbindingInflater1 + 11;
                int i119 = i118 % 128;
                b = i119;
                if (i118 % 2 != 0) {
                    int i120 = -i103;
                    i2 = (-1002) / ((i120 & (-167)) + (i120 | (-167)));
                } else {
                    int i121 = i103 * (-167);
                    i2 = ((-1002) & i121) + (i121 | (-1002));
                }
                int i122 = ~((i103 ^ (-1)) | (-7));
                int i123 = ~i103;
                int i124 = ~((i123 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | (i123 & iTuitionPaymentFragmentspecialinlinedviewModeldefault6));
                int i125 = (i2 - (~(-(-(336 * ((i122 & i124) | (i122 ^ i124))))))) - 1;
                int i126 = ~((i103 ^ 6) | (i103 & 6));
                int i127 = i119 + 53;
                TuitionPaymentFragmentbindingInflater1 = i127 % 128;
                int i128 = i127 % 2;
                int i129 = (-168) * (i126 | (~(6 | iTuitionPaymentFragmentspecialinlinedviewModeldefault6)));
                int i130 = ((i125 | i129) << 1) - (i125 ^ i129);
                int i131 = (i119 & 1) + (i119 | 1);
                TuitionPaymentFragmentbindingInflater1 = i131 % 128;
                if (i131 % 2 == 0) {
                    int i132 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                    int i133 = ~((i132 & 6) | (i132 ^ 6));
                    i3 = i130 >> (((i133 & i123) | (i123 ^ i133)) * 168);
                } else {
                    int i134 = ~i103;
                    int i135 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                    int i136 = ~((i135 & 6) | (i135 ^ 6));
                    i3 = (i130 - (~(-(-(((i136 & i134) | (i134 ^ i136)) * 168))))) - 1;
                }
                return i3 * i;
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th2;
            }
        }
    }

    static {
        byte[] bytes = "\n".getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        TuitionPaymentFragmentbindingInflater1 = bytes;
    }
}
