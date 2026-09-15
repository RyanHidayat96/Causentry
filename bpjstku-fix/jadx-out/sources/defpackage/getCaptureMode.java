package defpackage;

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
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.context.NetworkInfo;
import com.google.gson.JsonObject;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001:\u0003\u0017\u001c\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\u0005\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0005\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0014J%\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00152\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\nH\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001c\u0010\u001eJ\u001f\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b\u001c\u0010!J9\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062 \u0010 \u001a\u001c\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00160#\u0012\u0004\u0012\u00020\u00040\"H\u0016¢\u0006\u0004\b\u0017\u0010$J\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020%H\u0016¢\u0006\u0004\b\u000f\u0010&J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020'H\u0016¢\u0006\u0004\b\u000b\u0010(R\u0014\u0010\u001c\u001a\u00020%8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010\u000b\u001a\u00020+8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0014\u0010\u0017\u001a\u00020.8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010/R\u0014\u0010\u000f\u001a\u0002008WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0016\u0010\u0005\u001a\u0004\u0018\u00010%8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0016\u0010)\u001a\u0004\u0018\u0001058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u001a\u0010,\u001a\u00020\u00068\u0017X\u0097D¢\u0006\f\n\u0004\b\u000b\u00108\u001a\u0004\b\u0017\u00109R\u0014\u00106\u001a\u00020:8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u001a\u00103\u001a\u00020=8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010>\u001a\u0004\b\u000b\u0010?"}, d2 = {"LgetCaptureMode;", "LImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0;", "<init>", "()V", "", "TuitionPaymentFragmentbindingInflater1", "", "p0", "Ljava/util/concurrent/ScheduledExecutorService;", "(Ljava/lang/String;)Ljava/util/concurrent/ScheduledExecutorService;", "Ljava/util/concurrent/ExecutorService;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Ljava/lang/String;)Ljava/util/concurrent/ExecutorService;", "", "LImageAnalysisAbstractAnalyzerExternalSyntheticLambda1;", "b", "()Ljava/util/List;", "LrecalculateTransformMatrixAndCropRect;", "asInterface", "()LrecalculateTransformMatrixAndCropRect;", "(Ljava/lang/String;)LImageAnalysisAbstractAnalyzerExternalSyntheticLambda1;", "", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Ljava/lang/String;)Ljava/util/Map;", "onTransact", "()Ljava/util/concurrent/ExecutorService;", "Ldetach;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Ldetach;)V", "(Ljava/lang/String;)V", "LsetRelativeRotation;", "p1", "(Ljava/lang/String;LsetRelativeRotation;)V", "Lkotlin/Function1;", "", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "", "(J)V", "", "([B)V", "asBinder", "()J", "LsetJpegQuality;", "d", "()LsetJpegQuality;", "Lcom/datadog/android/api/InternalLogger;", "()Lcom/datadog/android/api/InternalLogger;", "", "cancelAll", "()Z", "a", "()Ljava/lang/Long;", "Lcom/google/gson/JsonObject;", "g", "()Lcom/google/gson/JsonObject;", "Ljava/lang/String;", "()Ljava/lang/String;", "Lcom/datadog/android/api/context/NetworkInfo;", "INotificationSideChannel", "()Lcom/datadog/android/api/context/NetworkInfo;", "LonValidImageAvailable;", "LonValidImageAvailable;", "()LonValidImageAvailable;"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class getCaptureMode implements ImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0 {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private static final onValidImageAvailable a;
    public static final getCaptureMode INSTANCE = new getCaptureMode();

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private static final String d = "no-op";

    @Override // com.datadog.android.api.SdkCore
    public final void TuitionPaymentFragmentbindingInflater1() {
    }

    @Override // defpackage.ImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0
    public final Long a() {
        return null;
    }

    @Override // defpackage.ImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0
    public final long asBinder() {
        return 0L;
    }

    @Override // defpackage.ImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0
    public final recalculateTransformMatrixAndCropRect asInterface() {
        return null;
    }

    @Override // defpackage.ImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0
    public final void b(long p0) {
    }

    @Override // defpackage.ImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0
    public final boolean cancelAll() {
        return false;
    }

    @Override // defpackage.ImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0
    public final JsonObject g() {
        return null;
    }

    private getCaptureMode() {
    }

    static {
        long jCurrentTimeMillis = System.currentTimeMillis();
        a = new onValidImageAvailable(TimeUnit.MILLISECONDS.toNanos(jCurrentTimeMillis), TimeUnit.MILLISECONDS.toNanos(jCurrentTimeMillis), 0L, 0L);
    }

    @Override // com.datadog.android.api.SdkCore
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return d;
    }

    @Override // com.datadog.android.api.SdkCore
    public final onValidImageAvailable TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return a;
    }

    @Override // defpackage.ImageAnalysisBlockingAnalyzer
    public final InternalLogger TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return new ImageCaptureExternalSyntheticLambda2(this, null, null, 6, null);
    }

    @Override // defpackage.ImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0
    public final NetworkInfo INotificationSideChannel() {
        return new NetworkInfo(NetworkInfo.Connectivity.NETWORK_OTHER, null, null, null, null, null, null, 126, null);
    }

    @Override // defpackage.ImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0
    public final setJpegQuality d() {
        return new setIoExecutor(MapsKt.emptyMap());
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class TuitionPaymentFragmentbindingInflater1<O> implements ScheduledFuture<O> {
        private static final byte[] $$c = {83, -4, -55, -17};
        private static final int $$f = 69;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {46, 126, -84, 108, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55};
        private static final int $$e = 46;
        private static final byte[] $$a = {8, -36, 87, -65, -15, 8, -16, 1, 4, 3, 52, -55, -14, -1, -8, 13, -11, -8, 68, -68, 1, Base64.padSymbol, -21, -49, -2, 2, 1, 4, 0, -21, 9, -8, -1, 35, -39, 6, -11, 1, -21, 17, 27, -39, -11, 7, -23, 19, 49, -64, 9, -15, 5, 55, -40, -22, -12, 11, 2, -5, -3, 17, -19, -4, 5, 5, -2, -13, -7, 4, -7};
        private static final int $$b = 203;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        private static int TuitionPaymentFragmentbindingInflater1 = 1;
        private static long b = -8318026458047813771L;
        private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {59697, 59729, 59731, 59771, 59749, 59745, 59757, 59753, 59745, 59749, 59751, 59749, 59728, 59728, 59745, 59745, 59744, 59757, 59676, 59671, 59725, 59743, 59718, 59698, 59754, 59840, 59846, 59840, 59799, 59712, 59834, 59845, 59871, 59859, 59864, 59866, 59844, 59812, 59838, 59869, 59866, 59837, 59836, 59845, 59847, 59845, 59844, 59841, 59867, 59792, 59455, 59428, 59428, 59431, 59421, 59420, 59450, 59448, 59449, 59428, 59421, 59413, 59451, 59425, 59707, 59756, 59746, 59744, 59771, 59751, 59757, 59714, 59715, 59746, 59749, 59770, 59751, 59746, 59770, 59738, 59699, 59730, 59749, 59749, 59748, 59749, 59746, 59746, 59770, 59754, 59740, 59756, 59746, 59698, 59754, 59754, 59749, 59751, 59771, 59731, 59730, 59744, 59746, 59769, 59752, 59729, 59747, 59745, 59756, 59745, 59771, 59856, 59856, 59847, 59828, 59849, 59865, 59887, 59862, 59861, 59860, 59831, 59705, 59759, 59753, 59747, 59770, 59746, 59753, 59746, 59749, 59744, 59751, 59768, 59737, 59717, 59746, 59751, 59768, 59773, 59773, 59738, 59676, 59714, 59753, 59745, 59745, 59715, 59714, 59753, 59745, 59745, 59715, 59714, 59746, 59749, 59718, 59713, 59759, 59747, 59768, 59736, 59724, 59756, 59746, 59744, 59771, 59751, 59757, 59714, 59737, 59749, 59751, 59746, 59754, 59753, 59745, 59745, 59702, 59797, 59824, 59824, 59836, 59839, 59792, 59798, 59825, 59795, 59804, 59826, 59827, 59805, 59794, 59827, 59827, 59824};

        /* JADX WARN: Code duplicated, block: B:10:0x0022  */
        /* JADX WARN: Code duplicated, block: B:8:0x001a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void d(byte r6, int r7, short r8, java.lang.Object[] r9) {
            /*
                byte[] r0 = getCaptureMode.TuitionPaymentFragmentbindingInflater1.$$a
                int r8 = r8 * 3
                int r8 = 115 - r8
                int r6 = 66 - r6
                int r7 = r7 + 4
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L12
                r3 = r7
                r5 = r2
                goto L24
            L12:
                r3 = r2
            L13:
                byte r4 = (byte) r8
                int r5 = r3 + 1
                r1[r3] = r4
                if (r5 != r7) goto L22
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L22:
                r3 = r0[r6]
            L24:
                int r3 = -r3
                int r8 = r8 + r3
                int r6 = r6 + 1
                int r8 = r8 + (-2)
                r3 = r5
                goto L13
            */
            throw new UnsupportedOperationException("Method not decompiled: getCaptureMode.TuitionPaymentFragmentbindingInflater1.d(byte, int, short, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0026  */
        /* JADX WARN: Code duplicated, block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002d). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void e(int r6, byte r7, byte r8, java.lang.Object[] r9) {
            /*
                int r6 = r6 * 52
                int r6 = r6 + 4
                byte[] r0 = getCaptureMode.TuitionPaymentFragmentbindingInflater1.$$d
                int r8 = r8 + 84
                int r7 = r7 * 52
                int r1 = r7 + 1
                byte[] r1 = new byte[r1]
                r2 = 0
                if (r0 != 0) goto L15
                r8 = r6
                r4 = r7
                r3 = r2
                goto L2d
            L15:
                r3 = r2
            L16:
                r5 = r8
                r8 = r6
                r6 = r5
                byte r4 = (byte) r6
                r1[r3] = r4
                if (r3 != r7) goto L26
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L26:
                int r3 = r3 + 1
                r4 = r0[r8]
                r5 = r8
                r8 = r6
                r6 = r5
            L2d:
                int r6 = r6 + 1
                int r4 = -r4
                int r8 = r8 + r4
                int r8 = r8 + (-10)
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: getCaptureMode.TuitionPaymentFragmentbindingInflater1.e(int, byte, byte, java.lang.Object[]):void");
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
            getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
            int length = cArr.length;
            long[] jArr = new long[length];
            getrealtimecapturelatency.b = 0;
            while (getrealtimecapturelatency.b < cArr.length) {
                int i3 = getrealtimecapturelatency.b;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 19473), ImageFormat.getBitsPerPixel(0) + 2625, 13 - ExpandableListView.getPackedPositionType(0L), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i3] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (b ^ 9053247990562531611L);
                    try {
                        Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (39422 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), KeyEvent.keyCodeFromString("") + 481, 36 - TextUtils.indexOf((CharSequence) "", '0', 0), 1781041463, false, "I", new Class[]{Object.class, Object.class});
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
            char[] cArr2 = new char[length];
            getrealtimecapturelatency.b = 0;
            while (getrealtimecapturelatency.b < cArr.length) {
                int i4 = $11 + 69;
                $10 = i4 % 128;
                if (i4 % 2 != 0) {
                    cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                    try {
                        Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (39422 - ((Process.getThreadPriority(0) + 20) >> 6)), 481 - (ViewConfiguration.getLongPressTimeout() >> 16), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                        int i5 = 32 / 0;
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                } else {
                    cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                    Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (39422 - Color.green(0)), 482 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), View.MeasureSpec.makeMeasureSpec(0, 0) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                }
            }
            objArr[0] = new String(cArr2);
            int i6 = $10 + 49;
            $11 = i6 % 128;
            int i7 = i6 % 2;
        }

        private static void c(byte[] bArr, int[] iArr, boolean z, Object[] objArr) throws Throwable {
            int length;
            char[] cArr;
            int i = 2 % 2;
            setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
            int i2 = 0;
            int i3 = iArr[0];
            int i4 = iArr[1];
            int i5 = iArr[2];
            int i6 = iArr[3];
            char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            float f = 0.0f;
            if (cArr2 != null) {
                int i7 = $11 + 67;
                $10 = i7 % 128;
                if (i7 % 2 != 0) {
                    length = cArr2.length;
                    cArr = new char[length];
                } else {
                    length = cArr2.length;
                    cArr = new char[length];
                }
                int i8 = 0;
                while (i8 < length) {
                    try {
                        Object[] objArr2 = new Object[1];
                        objArr2[i2] = Integer.valueOf(cArr2[i8]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char deadChar = (char) KeyEvent.getDeadChar(i2, i2);
                            int i9 = (AudioTrack.getMaxVolume() > f ? 1 : (AudioTrack.getMaxVolume() == f ? 0 : -1)) + 1269;
                            int i10 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 17;
                            byte b2 = (byte) ($$f & 31);
                            byte b3 = (byte) (b2 - 5);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(deadChar, i9, i10, 407021364, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        cArr[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        i8++;
                        i2 = 0;
                        f = 0.0f;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr2 = cArr;
            }
            char[] cArr3 = new char[i4];
            System.arraycopy(cArr2, i3, cArr3, 0, i4);
            if (bArr != null) {
                char[] cArr4 = new char[i4];
                setvideostabilizationmode.b = 0;
                char c = 0;
                while (setvideostabilizationmode.b < i4) {
                    if (bArr[setvideostabilizationmode.b] == 1) {
                        int i11 = setvideostabilizationmode.b;
                        Object[] objArr3 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b4 = (byte) 0;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ImageFormat.getBitsPerPixel(0) + 1), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 3225, View.resolveSizeAndState(0, 0, 0) + 13, 2133916302, false, $$g((byte) 6, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i11] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    } else {
                        int i12 = setvideostabilizationmode.b;
                        Object[] objArr4 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            char scrollBarSize = (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 29944);
                            int iArgb = 1755 - Color.argb(0, 0, 0, 0);
                            int doubleTapTimeout = 23 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                            byte length2 = (byte) $$c.length;
                            byte b5 = (byte) (length2 - 4);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(scrollBarSize, iArgb, doubleTapTimeout, 387247676, false, $$g(length2, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i12] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                    }
                    c = cArr4[setvideostabilizationmode.b];
                    Object[] objArr5 = {setvideostabilizationmode, setvideostabilizationmode};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (KeyEvent.normalizeMetaState(0) + 41241), 1705 - (KeyEvent.getMaxKeyCode() >> 16), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 21, -1434471773, false, $$g(b6, b7, b7), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                }
                cArr3 = cArr4;
            }
            if (i6 > 0) {
                char[] cArr5 = new char[i4];
                System.arraycopy(cArr3, 0, cArr5, 0, i4);
                int i13 = i4 - i6;
                System.arraycopy(cArr5, 0, cArr3, i13, i6);
                System.arraycopy(cArr5, i6, cArr3, 0, i13);
            }
            if (z) {
                int i14 = $11 + 41;
                $10 = i14 % 128;
                int i15 = i14 % 2;
                char[] cArr6 = new char[i4];
                int i16 = 0;
                while (true) {
                    setvideostabilizationmode.b = i16;
                    if (setvideostabilizationmode.b >= i4) {
                        break;
                    }
                    cArr6[setvideostabilizationmode.b] = cArr3[(i4 - setvideostabilizationmode.b) - 1];
                    i16 = setvideostabilizationmode.b + 1;
                }
                cArr3 = cArr6;
            }
            if (i5 > 0) {
                int i17 = $11 + 117;
                $10 = i17 % 128;
                if (i17 % 2 != 0) {
                    setvideostabilizationmode.b = 0;
                } else {
                    setvideostabilizationmode.b = 0;
                }
                while (setvideostabilizationmode.b < i4) {
                    int i18 = $11 + 81;
                    $10 = i18 % 128;
                    int i19 = i18 % 2;
                    cArr3[setvideostabilizationmode.b] = (char) (cArr3[setvideostabilizationmode.b] - iArr[2]);
                    setvideostabilizationmode.b++;
                }
            }
            objArr[0] = new String(cArr3);
        }

        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(Delayed delayed) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentbindingInflater1 + 47;
            int i3 = i2 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
            int i4 = i2 % 2 != 0 ? 1 : 0;
            int i5 = i3 + 69;
            TuitionPaymentFragmentbindingInflater1 = i5 % 128;
            int i6 = i5 % 2;
            return i4;
        }

        @Override // java.util.concurrent.Future
        public final O get() throws ExecutionException {
            int i = 2 % 2;
            throw new ExecutionException("Unsupported", new UnsupportedOperationException());
        }

        @Override // java.util.concurrent.Future
        public final O get(long j, TimeUnit timeUnit) throws ExecutionException {
            int i = 2 % 2;
            throw new ExecutionException("Unsupported", new UnsupportedOperationException());
        }

        @Override // java.util.concurrent.Future
        public final boolean cancel(boolean z) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i3 = i2 + 107;
            TuitionPaymentFragmentbindingInflater1 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 57;
            TuitionPaymentFragmentbindingInflater1 = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }

        @Override // java.util.concurrent.Delayed
        public final long getDelay(TimeUnit timeUnit) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i3 = i2 + 105;
            TuitionPaymentFragmentbindingInflater1 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 39;
            TuitionPaymentFragmentbindingInflater1 = i5 % 128;
            int i6 = i5 % 2;
            return 0L;
        }

        @Override // java.util.concurrent.Future
        public final boolean isCancelled() {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 55;
            int i3 = i2 % 128;
            TuitionPaymentFragmentbindingInflater1 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 101;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }

        @Override // java.util.concurrent.Future
        public final boolean isDone() {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i3 = i2 + 3;
            TuitionPaymentFragmentbindingInflater1 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 57;
            TuitionPaymentFragmentbindingInflater1 = i5 % 128;
            if (i5 % 2 != 0) {
                return false;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Code duplicated, block: B:100:0x09f0 A[Catch: Exception -> 0x0bd3, all -> 0x0c5d, IOException -> 0x0c6a, TryCatch #17 {Exception -> 0x0bd3, blocks: (B:70:0x0785, B:95:0x0989, B:97:0x0997, B:98:0x09da, B:100:0x09f0, B:101:0x0a2e, B:137:0x0b64, B:139:0x0b66, B:141:0x0b6d, B:142:0x0b6e, B:151:0x0b82, B:153:0x0b89, B:154:0x0b8a, B:156:0x0b8c, B:158:0x0b99, B:159:0x0b9a, B:161:0x0b9c, B:163:0x0ba9, B:164:0x0baa), top: B:295:0x0785 }] */
        /* JADX WARN: Code duplicated, block: B:105:0x0a61 A[Catch: all -> 0x0c5d, IOException -> 0x0c6a, TryCatch #19 {IOException -> 0x0c6a, blocks: (B:70:0x0785, B:94:0x0986, B:95:0x0989, B:97:0x0997, B:98:0x09da, B:100:0x09f0, B:101:0x0a2e, B:103:0x0a40, B:105:0x0a61, B:107:0x0ab2, B:109:0x0ad2, B:111:0x0af3, B:113:0x0b14, B:136:0x0b61, B:137:0x0b64, B:172:0x0bd3, B:173:0x0c5c, B:139:0x0b66, B:141:0x0b6d, B:142:0x0b6e, B:151:0x0b82, B:153:0x0b89, B:154:0x0b8a, B:156:0x0b8c, B:158:0x0b99, B:159:0x0b9a, B:161:0x0b9c, B:163:0x0ba9, B:164:0x0baa), top: B:295:0x0785 }] */
        /* JADX WARN: Code duplicated, block: B:107:0x0ab2 A[Catch: all -> 0x0c5d, IOException -> 0x0c6a, TryCatch #19 {IOException -> 0x0c6a, blocks: (B:70:0x0785, B:94:0x0986, B:95:0x0989, B:97:0x0997, B:98:0x09da, B:100:0x09f0, B:101:0x0a2e, B:103:0x0a40, B:105:0x0a61, B:107:0x0ab2, B:109:0x0ad2, B:111:0x0af3, B:113:0x0b14, B:136:0x0b61, B:137:0x0b64, B:172:0x0bd3, B:173:0x0c5c, B:139:0x0b66, B:141:0x0b6d, B:142:0x0b6e, B:151:0x0b82, B:153:0x0b89, B:154:0x0b8a, B:156:0x0b8c, B:158:0x0b99, B:159:0x0b9a, B:161:0x0b9c, B:163:0x0ba9, B:164:0x0baa), top: B:295:0x0785 }] */
        /* JADX WARN: Code duplicated, block: B:109:0x0ad2 A[Catch: all -> 0x0c5d, IOException -> 0x0c6a, TryCatch #19 {IOException -> 0x0c6a, blocks: (B:70:0x0785, B:94:0x0986, B:95:0x0989, B:97:0x0997, B:98:0x09da, B:100:0x09f0, B:101:0x0a2e, B:103:0x0a40, B:105:0x0a61, B:107:0x0ab2, B:109:0x0ad2, B:111:0x0af3, B:113:0x0b14, B:136:0x0b61, B:137:0x0b64, B:172:0x0bd3, B:173:0x0c5c, B:139:0x0b66, B:141:0x0b6d, B:142:0x0b6e, B:151:0x0b82, B:153:0x0b89, B:154:0x0b8a, B:156:0x0b8c, B:158:0x0b99, B:159:0x0b9a, B:161:0x0b9c, B:163:0x0ba9, B:164:0x0baa), top: B:295:0x0785 }] */
        /* JADX WARN: Code duplicated, block: B:111:0x0af3 A[Catch: all -> 0x0c5d, IOException -> 0x0c6a, TryCatch #19 {IOException -> 0x0c6a, blocks: (B:70:0x0785, B:94:0x0986, B:95:0x0989, B:97:0x0997, B:98:0x09da, B:100:0x09f0, B:101:0x0a2e, B:103:0x0a40, B:105:0x0a61, B:107:0x0ab2, B:109:0x0ad2, B:111:0x0af3, B:113:0x0b14, B:136:0x0b61, B:137:0x0b64, B:172:0x0bd3, B:173:0x0c5c, B:139:0x0b66, B:141:0x0b6d, B:142:0x0b6e, B:151:0x0b82, B:153:0x0b89, B:154:0x0b8a, B:156:0x0b8c, B:158:0x0b99, B:159:0x0b9a, B:161:0x0b9c, B:163:0x0ba9, B:164:0x0baa), top: B:295:0x0785 }] */
        /* JADX WARN: Code duplicated, block: B:113:0x0b14 A[Catch: all -> 0x0c5d, IOException -> 0x0c6a, TRY_LEAVE, TryCatch #19 {IOException -> 0x0c6a, blocks: (B:70:0x0785, B:94:0x0986, B:95:0x0989, B:97:0x0997, B:98:0x09da, B:100:0x09f0, B:101:0x0a2e, B:103:0x0a40, B:105:0x0a61, B:107:0x0ab2, B:109:0x0ad2, B:111:0x0af3, B:113:0x0b14, B:136:0x0b61, B:137:0x0b64, B:172:0x0bd3, B:173:0x0c5c, B:139:0x0b66, B:141:0x0b6d, B:142:0x0b6e, B:151:0x0b82, B:153:0x0b89, B:154:0x0b8a, B:156:0x0b8c, B:158:0x0b99, B:159:0x0b9a, B:161:0x0b9c, B:163:0x0ba9, B:164:0x0baa), top: B:295:0x0785 }] */
        /* JADX WARN: Code duplicated, block: B:117:0x0b34  */
        /* JADX WARN: Code duplicated, block: B:181:0x0c6c  */
        /* JADX WARN: Code duplicated, block: B:214:0x1109 A[EDGE_INSN: B:214:0x1109->B:215:0x110d BREAK  A[LOOP:5: B:194:0x0e06->B:213:0x10f5], PHI: r1 r2
  0x1109: PHI (r1v73 int) = (r1v71 int), (r1v71 int), (r1v79 int) binds: [B:190:0x0d76, B:192:0x0e00, B:321:0x1109] A[DONT_GENERATE, DONT_INLINE]
  0x1109: PHI (r2v100 java.lang.String[]) = (r2v98 java.lang.String[]), (r2v98 java.lang.String[]), (r2v108 java.lang.String[]) binds: [B:190:0x0d76, B:192:0x0e00, B:321:0x1109] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:25:0x03a0  */
        /* JADX WARN: Code duplicated, block: B:27:0x03a3  */
        /* JADX WARN: Code duplicated, block: B:30:0x03c6 A[Catch: all -> 0x185f, TryCatch #26 {all -> 0x185f, blocks: (B:13:0x01c1, B:15:0x01d7, B:17:0x0230, B:28:0x03af, B:30:0x03c6, B:32:0x0417, B:204:0x0fa6, B:206:0x0fbe, B:208:0x1012, B:229:0x1159, B:231:0x1166, B:232:0x11a6, B:234:0x1293, B:236:0x12a0, B:238:0x12f7, B:240:0x13e8, B:242:0x13f5, B:243:0x1439, B:245:0x1522, B:247:0x152f, B:248:0x1574, B:250:0x1657, B:252:0x1664, B:253:0x16aa), top: B:305:0x01c1 }] */
        /* JADX WARN: Code duplicated, block: B:311:0x04af A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:312:0x04c2 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:317:0x0c6a A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:318:0x0b1e A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:31:0x0413  */
        /* JADX WARN: Code duplicated, block: B:320:0x0b36 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:36:0x04b1 A[LOOP:1: B:26:0x03a1->B:36:0x04b1, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:37:0x04c2 A[EDGE_INSN: B:37:0x04c2->B:38:0x04cb BREAK  A[LOOP:1: B:26:0x03a1->B:36:0x04b1], PHI: r1 r2 r4 r5 r6
  0x04c2: PHI (r1v107 int) = (r1v106 int), (r1v179 int) binds: [B:24:0x039e, B:312:0x04c2] A[DONT_GENERATE, DONT_INLINE]
  0x04c2: PHI (r2v131 int) = (r2v130 int), (r2v230 int) binds: [B:24:0x039e, B:312:0x04c2] A[DONT_GENERATE, DONT_INLINE]
  0x04c2: PHI (r4v129 int) = (r4v128 int), (r4v185 int) binds: [B:24:0x039e, B:312:0x04c2] A[DONT_GENERATE, DONT_INLINE]
  0x04c2: PHI (r5v178 java.lang.Object) = (r5v177 java.lang.Object), (r5v248 java.lang.Object) binds: [B:24:0x039e, B:312:0x04c2] A[DONT_GENERATE, DONT_INLINE]
  0x04c2: PHI (r6v160 byte) = (r6v159 byte), (r6v233 byte) binds: [B:24:0x039e, B:312:0x04c2] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:40:0x055c  */
        /* JADX WARN: Code duplicated, block: B:42:0x0585  */
        /* JADX WARN: Code duplicated, block: B:44:0x05a1  */
        /* JADX WARN: Code duplicated, block: B:53:0x0678 A[Catch: all -> 0x0b9b, TryCatch #22 {all -> 0x0b9b, blocks: (B:51:0x066b, B:53:0x0678, B:54:0x06a8), top: B:300:0x066b }] */
        /* JADX WARN: Code duplicated, block: B:58:0x06bf A[Catch: all -> 0x0b8b, TryCatch #15 {all -> 0x0b8b, blocks: (B:56:0x06b2, B:58:0x06bf, B:59:0x06f2), top: B:291:0x06b2 }] */
        /* JADX WARN: Code duplicated, block: B:97:0x0997 A[Catch: Exception -> 0x0bd3, all -> 0x0c5d, IOException -> 0x0c6a, TryCatch #17 {Exception -> 0x0bd3, blocks: (B:70:0x0785, B:95:0x0989, B:97:0x0997, B:98:0x09da, B:100:0x09f0, B:101:0x0a2e, B:137:0x0b64, B:139:0x0b66, B:141:0x0b6d, B:142:0x0b6e, B:151:0x0b82, B:153:0x0b89, B:154:0x0b8a, B:156:0x0b8c, B:158:0x0b99, B:159:0x0b9a, B:161:0x0b9c, B:163:0x0ba9, B:164:0x0baa), top: B:295:0x0785 }] */
        /* JADX WARN: Multi-variable type inference failed */
        public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context context, int i, int i2, int i3) throws Throwable {
            int i4;
            int i5;
            String[] strArr;
            byte b2;
            Object obj;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            byte b3;
            Object obj2;
            int i11;
            int i12;
            int i13;
            int i14;
            byte b4;
            Object obj3;
            String str;
            int i15;
            int i16;
            int i17;
            Object obj4;
            byte b5;
            int i18;
            int i19;
            byte b6;
            Object obj5;
            String[] strArrSplit;
            int length;
            int i20;
            String str2;
            Object[] objArr;
            String[] strArr2;
            Object obj6;
            byte b7;
            int i21;
            int i22;
            int i23;
            Process processExec;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6;
            String[] strArrSplit2;
            int length2;
            int i24;
            String str3;
            Object[] objArr2;
            String str4;
            Object[] objArr3;
            Object[] objArr4;
            String[] strArrSplit3;
            int i25;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7;
            int i26;
            long j;
            int i27;
            int elapsedCpuTime;
            int i28 = i;
            int i29 = 0;
            int i30 = 1;
            if (context != null) {
                try {
                    int i31 = -(-TextUtils.indexOf("", "", 0));
                    Object[] objArr5 = new Object[1];
                    a(new char[]{52751, 29295, 46804, 64337, 16317, 24620, 42128, 59721, 11637, 20966, 37462, 55007, 6975, 24483, 32776, 50369, 2269, 19806, 61902, 12839, 30375, 47885, 65424}, (i31 ^ 48239) + ((i31 & 48239) << 1), objArr5);
                    Class<?> cls = Class.forName((String) objArr5[0]);
                    int i32 = -TextUtils.getTrimmedLength("");
                    int i33 = i32 * 165;
                    int i34 = ((i33 | (-7838833)) << 1) - (i33 ^ (-7838833));
                    int i35 = ~i28;
                    int i36 = ~((i35 ^ 48091) | (i35 & 48091));
                    int i37 = -(-(((i32 ^ i36) | (i36 & i32)) * (-328)));
                    int i38 = (i34 & i37) + (i34 | i37);
                    int i39 = -(-(((i32 ^ i28) | (i32 & i28)) * 164));
                    int i40 = (i38 & i39) + (i38 | i39);
                    int i41 = ~i32;
                    int i42 = ~((i41 ^ (-48092)) | (i41 & (-48092)));
                    int i43 = ~(((-48092) ^ i28) | ((-48092) & i28));
                    int i44 = ((i42 ^ i43) | (i43 & i42) | (~(i32 | i35 | 48091))) * 164;
                    int i45 = (i40 & i44) + (i40 | i44);
                    Object[] objArr6 = new Object[1];
                    a(new char[]{52745, 30160, 47532, 64943, 8547, 25930, 43303, 60658, 4305, 21688, 39086, 56422, 'G', 17428}, i45, objArr6);
                    String str5 = (String) cls.getMethod((String) objArr6[0], null).invoke(context, null);
                    int iResolveSize = View.resolveSize(0, 0);
                    int i46 = (iResolveSize & 48239) + (iResolveSize | 48239);
                    Object[] objArr7 = new Object[1];
                    a(new char[]{52751, 29295, 46804, 64337, 16317, 24620, 42128, 59721, 11637, 20966, 37462, 55007, 6975, 24483, 32776, 50369, 2269, 19806, 61902, 12839, 30375, 47885, 65424}, i46, objArr7);
                    Class<?> cls2 = Class.forName((String) objArr7[0]);
                    Object[] objArr8 = new Object[1];
                    c(new byte[]{0, 1, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 0, 0}, new int[]{0, 18, 0, 16}, false, objArr8);
                    Object objInvoke = cls2.getMethod((String) objArr8[0], null).invoke(context, null);
                    byte[] bArr = $$a;
                    byte b8 = (byte) (bArr[21] + 1);
                    Object[] objArr9 = new Object[1];
                    d(b8, (byte) (b8 & 95), bArr[35], objArr9);
                    Class<?> cls3 = Class.forName((String) objArr9[0]);
                    byte b9 = (byte) 29;
                    Object[] objArr10 = new Object[1];
                    d(b9, bArr[9], bArr[50], objArr10);
                    int iIndexOf = ((String) cls3.getField((String) objArr10[0]).get(objInvoke)).indexOf(str5);
                    if (iIndexOf > 0) {
                        byte b10 = (byte) (bArr[21] + 1);
                        Object[] objArr11 = new Object[1];
                        d(b10, (byte) (b10 & 95), bArr[35], objArr11);
                        Class<?> cls4 = Class.forName((String) objArr11[0]);
                        Object[] objArr12 = new Object[1];
                        d(b9, bArr[9], bArr[50], objArr12);
                        String str6 = (String) cls4.getField((String) objArr12[0]).get(objInvoke);
                        int length3 = str6.length();
                        int i47 = length3 * 881;
                        int i48 = ((-14096) ^ i47) + ((i47 & (-14096)) << 1);
                        int i49 = ~length3;
                        int i50 = ~((15 ^ i49) | (15 & i49));
                        int i51 = ~((15 ^ i28) | (15 & i28));
                        int i52 = (i50 ^ i51) | (i50 & i51);
                        int i53 = ~((i49 & i28) | (i49 ^ i28));
                        int i54 = i48 + (((i52 & i53) | (i52 ^ i53)) * (-880));
                        int i55 = (~((15 ^ i35) | (15 & i35))) | length3;
                        int i56 = ~(((-16) & i28) | ((-16) ^ i28));
                        int i57 = i54 + (((i55 & i56) | (i55 ^ i56)) * (-880));
                        int i58 = -(-(i56 * 880));
                        int i59 = ((i57 | i58) << 1) - (i58 ^ i57);
                        if (i59 >= 0) {
                            int i60 = 0;
                            while (true) {
                                if (i60 > i59) {
                                    i10 = iIndexOf;
                                    b3 = b9;
                                    obj2 = objInvoke;
                                    i11 = 0;
                                    break;
                                }
                                String strSubstring = str6.substring(i60, i60 + 16);
                                try {
                                    Object[] objArr13 = new Object[2];
                                    objArr13[i30] = 931995;
                                    objArr13[i29] = strSubstring;
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                        char offsetBefore = (char) TextUtils.getOffsetBefore("", i29);
                                        int i61 = 3393 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                        int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 9;
                                        byte b11 = (byte) ($$d[7] - 1);
                                        byte b12 = b11;
                                        Object[] objArr14 = new Object[1];
                                        e(b11, b12, (byte) (b12 | 14), objArr14);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(offsetBefore, i61, longPressTimeout, 1203525406, false, (String) objArr14[0], new Class[]{String.class, Integer.TYPE});
                                    }
                                    long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr13)).longValue();
                                    long j2 = 1163114026;
                                    i10 = iIndexOf;
                                    b3 = b9;
                                    long j3 = i28;
                                    obj2 = objInvoke;
                                    long j4 = -1;
                                    long j5 = j3 ^ j4;
                                    long j6 = jLongValue ^ j4;
                                    long j7 = (((long) 758) * j2) + (((long) (-756)) * jLongValue) + (((long) (-757)) * (j2 | j5)) + (((long) 1514) * (((j6 | j2) | j3) ^ j4)) + (((long) 757) * ((((j2 ^ j4) | j6) ^ j4) | ((j6 | j5) ^ j4) | (j4 ^ (j3 | (jLongValue | j2))))) + ((long) (-1165183903));
                                    int iMyPid = Process.myPid();
                                    int i62 = ~iMyPid;
                                    int i63 = ((int) (j7 >> 32)) & (1871737038 + (((~(596255173 | i62)) | (~((-2033481585) | iMyPid))) * 1900) + (((~(i62 | 2033481584)) | (~((-596255174) | iMyPid))) * (-950)) + (((~(iMyPid | 2033481584)) | (~(i62 | (-596255174)))) * 950));
                                    int i64 = (int) j7;
                                    int iUptimeMillis = (int) SystemClock.uptimeMillis();
                                    int i65 = i64 & (2005432269 + (((~(1173007285 | iUptimeMillis)) | (-1342155766)) * 104) + ((~((~iUptimeMillis) | (-95070645))) * (-104)) + ((iUptimeMillis | (-264219125)) * 104));
                                    if (((i63 & i65) | (i63 ^ i65)) == -725904754) {
                                        i11 = 1;
                                        break;
                                    }
                                    i60++;
                                    i28 = i;
                                    b9 = b3;
                                    iIndexOf = i10;
                                    objInvoke = obj2;
                                    str6 = str6;
                                    i59 = i59;
                                    i30 = 1;
                                    i29 = 0;
                                } catch (Throwable th) {
                                    Throwable cause = th.getCause();
                                    if (cause != null) {
                                        throw cause;
                                    }
                                    throw th;
                                }
                            }
                            i12 = i;
                            i13 = ~i12;
                            int i66 = -i11;
                            int i67 = ((i11 & i66) | (i11 ^ i66)) >> 31;
                            i14 = (i67 & ((i12 & (-21)) | (i13 & 20))) | ((~i67) & i12);
                            byte[] bArr2 = $$a;
                            byte b13 = (byte) (bArr2[21] + 1);
                            Object[] objArr15 = new Object[1];
                            d(b13, (byte) (b13 & 95), bArr2[35], objArr15);
                            Class<?> cls5 = Class.forName((String) objArr15[0]);
                            Object[] objArr16 = new Object[1];
                            b4 = b3;
                            d(b4, bArr2[9], bArr2[50], objArr16);
                            obj3 = obj2;
                            str = (String) cls5.getField((String) objArr16[0]).get(obj3);
                            int length4 = str.length();
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            int i68 = 11790 + (length4 * 984);
                            int i69 = ~length4;
                            int i70 = (((-6) & i69) | ((-6) ^ i69)) * 983;
                            int i71 = ((i68 | i70) << 1) - (i68 ^ i70);
                            int i72 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            int i73 = ~(i69 | i72);
                            int i74 = ((i73 & 5) | (5 ^ i73)) * (-983);
                            int i75 = (i71 ^ i74) + ((i74 & i71) << 1);
                            int i76 = ~((i72 & 5) | (5 ^ i72));
                            int i77 = ~((length4 & 5) | (5 ^ length4));
                            int i78 = -(-(((i77 & i76) | (i76 ^ i77)) * 983));
                            i15 = (i75 & i78) + (i78 | i75);
                            if (i15 >= 0) {
                                i16 = i14;
                                i4 = i12;
                                i17 = i13;
                                obj4 = obj3;
                                b5 = b4;
                                i18 = 0;
                                break;
                            }
                            i25 = 0;
                            while (true) {
                                if (i25 <= i15) {
                                    i16 = i14;
                                    i4 = i12;
                                    i17 = i13;
                                    obj4 = obj3;
                                    b5 = b4;
                                    i18 = 0;
                                    break;
                                }
                                Object[] objArr17 = {str.substring(i25, ((i25 | 6) << 1) - (i25 ^ 6)), 931995};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                    char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                                    int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 3394;
                                    int mirror = '9' - AndroidCharacter.getMirror('0');
                                    byte b14 = (byte) ($$d[7] - 1);
                                    byte b15 = b14;
                                    Object[] objArr18 = new Object[1];
                                    e(b14, b15, (byte) (b15 | 14), objArr18);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(scrollBarSize, bitsPerPixel, mirror, 1203525406, false, (String) objArr18[0], new Class[]{String.class, Integer.TYPE});
                                }
                                long jLongValue2 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr17)).longValue();
                                long j8 = 2051509134;
                                i17 = i13;
                                obj4 = obj3;
                                long j9 = (((long) 960) * j8) + (((long) (-1917)) * jLongValue2);
                                long j10 = 959;
                                b5 = b4;
                                i26 = i25;
                                long j11 = -1;
                                long j12 = jLongValue2 ^ j11;
                                i16 = i14;
                                long jUptimeMillis = (int) SystemClock.uptimeMillis();
                                long j13 = jUptimeMillis ^ j11;
                                j = j9 + ((((j12 | j13) ^ j11) | ((j8 | jUptimeMillis) ^ j11)) * j10) + (((long) (-959)) * j12) + (j10 * (((jUptimeMillis | j12) ^ j11) | ((j13 | j8) ^ j11))) + ((long) (-2053579011));
                                i4 = i;
                                int i79 = ~((-1127185530) | i4);
                                i27 = ((int) (j >> 32)) & ((-911569466) + ((1730555355 | i79) * (-220)) + ((i79 | 1126575193) * 220) + 2080445340);
                                elapsedCpuTime = (int) Process.getElapsedCpuTime();
                                if ((i27 | (((int) j) & ((-650920367) + (((~((-168059403) | elapsedCpuTime)) | (-1269167008)) * (-756)) + (((~elapsedCpuTime) | (-168059403)) * 756)))) == -2096167706) {
                                    i18 = 1;
                                    break;
                                }
                                i25 = i26 + 1;
                                i12 = i4;
                                i14 = i16;
                                str = str;
                                i15 = i15;
                                i13 = i17;
                                obj3 = obj4;
                                b4 = b5;
                            }
                            i19 = (~(i4 & 20)) & (i4 | 20);
                            int i80 = -i18;
                            int i81 = ((i18 & i80) | (i18 ^ i80)) >> 31;
                            int i82 = (~i81) & i4;
                            int i83 = i81 & i19;
                            int i84 = (i83 & i82) | (i82 ^ i83);
                            int i85 = (~(i4 & i16)) & (i4 | i16);
                            int i86 = (i85 | (-i85)) >> 31;
                            int i87 = i84 & (~i86);
                            int i88 = i86 & i16;
                            i7 = (i87 & i88) | (i87 ^ i88);
                            byte[] bArr3 = $$a;
                            byte b16 = (byte) (bArr3[21] + 1);
                            Object[] objArr19 = new Object[1];
                            d(b16, (byte) (b16 & 95), bArr3[35], objArr19);
                            Class<?> cls6 = Class.forName((String) objArr19[0]);
                            Object[] objArr20 = new Object[1];
                            b6 = b5;
                            d(b6, bArr3[9], bArr3[50], objArr20);
                            obj5 = obj4;
                            String str7 = (String) cls6.getField((String) objArr20[0]).get(obj5);
                            int i89 = i10;
                            int i90 = ~i89;
                            int i91 = -i90;
                            String strSubstring2 = str7.substring(0, i89 & (((i90 & i91) | (i90 ^ i91)) >> 31));
                            Object[] objArr21 = new Object[1];
                            c(new byte[]{1}, new int[]{18, 1, 0, 0}, true, objArr21);
                            strArrSplit = strSubstring2.split((String) objArr21[0]);
                            length = strArrSplit.length;
                            i20 = 0;
                            while (i20 < length) {
                                str2 = strArrSplit[i20];
                                int i92 = -(ViewConfiguration.getDoubleTapTimeout() >> 16);
                                objArr = new Object[1];
                                a(new char[]{52789, 19273, 50209}, (i92 & 34057) + (i92 | 34057), objArr);
                                if (str2.split((String) objArr[0]).length > 1) {
                                    synchronized (((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) Color.red(0), Color.rgb(0, 0, 0) + 16779483, 33 - (Process.myTid() >> 22)))) {
                                        try {
                                            char[] cArr = {52766, 17748, 55520, 27655, 58203, 30382, 35344, 303, 38054, 10240, 49003, 12984, 17947, 56674, 20681, 58372};
                                            int i93 = -(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                            strArr2 = strArrSplit;
                                            int i94 = ((i93 | 35672) << 1) - (i93 ^ 35672);
                                            try {
                                                Object[] objArr22 = new Object[1];
                                                a(cArr, i94, objArr22);
                                                String str8 = (String) objArr22[0];
                                                try {
                                                    Runtime runtime = Runtime.getRuntime();
                                                    char[] cArr2 = {52765, 5021};
                                                    int i95 = -(ViewConfiguration.getEdgeSlop() >> 16);
                                                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                    i21 = length;
                                                    int i96 = i95 * 615;
                                                    int i97 = ((i96 | (-34776103)) << 1) - (i96 ^ (-34776103));
                                                    int i98 = ~i95;
                                                    obj6 = obj5;
                                                    int i99 = (~((i98 ^ 56731) | (i98 & 56731))) | iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                                    b7 = b6;
                                                    int i100 = ~(((-56732) ^ i95) | ((-56732) & i95));
                                                    int i101 = ((i99 ^ i100) | (i99 & i100)) * 614;
                                                    int i102 = (i97 & i101) + (i97 | i101);
                                                    int i103 = ~i95;
                                                    i22 = i20;
                                                    int i104 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                                    int i105 = ~((i103 ^ i104) | (i104 & i103));
                                                    int i106 = ~(i98 | 56731);
                                                    int i107 = (i105 ^ i106) | (i106 & i105);
                                                    int i108 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                                    int i109 = ~((i108 ^ 56731) | (i108 & 56731));
                                                    int i110 = ((i107 ^ i109) | (i107 & i109)) * (-1228);
                                                    int i111 = (i102 ^ i110) + ((i102 & i110) << 1);
                                                    int i112 = ~((i103 & (-56732)) | (i103 ^ (-56732)) | i108);
                                                    int i113 = (i108 ^ i95) | (i108 & i95);
                                                    int i114 = ~((i113 & 56731) | (i113 ^ 56731));
                                                    int i115 = ((i112 & i114) | (i112 ^ i114)) * 614;
                                                    int i116 = ((i111 | i115) << 1) - (i115 ^ i111);
                                                    try {
                                                        Object[] objArr23 = new Object[1];
                                                        a(cArr2, i116, objArr23);
                                                        processExec = runtime.exec((String) objArr23[0], (String[]) null, (File) null);
                                                        try {
                                                            Object[] objArr24 = {processExec.getInputStream()};
                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(666339120);
                                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getEdgeSlop() >> 16), KeyEvent.keyCodeFromString("") + 2142, 45 - (ViewConfiguration.getScrollDefaultDelay() >> 16), -1020714777, false, null, new Class[]{InputStream.class});
                                                            }
                                                            Object objNewInstance = ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr24);
                                                            try {
                                                                Object[] objArr25 = {processExec.getErrorStream()};
                                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(666339120);
                                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) TextUtils.indexOf("", "", 0, 0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 2142, (ViewConfiguration.getLongPressTimeout() >> 16) + 45, -1020714777, false, null, new Class[]{InputStream.class});
                                                                }
                                                                Object objNewInstance2 = ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr25);
                                                                DataOutputStream dataOutputStream = new DataOutputStream(processExec.getOutputStream());
                                                                try {
                                                                    byte[] bArr4 = $$a;
                                                                    i23 = i35;
                                                                    try {
                                                                        i19 = i19;
                                                                        try {
                                                                            Object[] objArr26 = new Object[1];
                                                                            d((byte) (-bArr4[44]), (byte) (-bArr4[54]), bArr4[9], objArr26);
                                                                            Class<?> cls7 = Class.forName((String) objArr26[0]);
                                                                            i7 = i7;
                                                                            try {
                                                                                Object[] objArr27 = new Object[1];
                                                                                d(bArr4[0], bArr4[7], bArr4[28], objArr27);
                                                                                cls7.getMethod((String) objArr27[0], null).invoke(objNewInstance, null);
                                                                                try {
                                                                                    Object[] objArr28 = new Object[1];
                                                                                    d((byte) (-bArr4[44]), (byte) (-bArr4[54]), bArr4[9], objArr28);
                                                                                    Class<?> cls8 = Class.forName((String) objArr28[0]);
                                                                                    Object[] objArr29 = new Object[1];
                                                                                    d(bArr4[0], bArr4[7], bArr4[28], objArr29);
                                                                                    cls8.getMethod((String) objArr29[0], null).invoke(objNewInstance2, null);
                                                                                    try {
                                                                                        try {
                                                                                            StringBuilder sb = new StringBuilder();
                                                                                            sb.append(str8);
                                                                                            int i117 = -((byte) KeyEvent.getModifierMetaStateMask());
                                                                                            int i118 = i117 * 284;
                                                                                            int i119 = ((i118 | (-11790984)) << 1) - (i118 ^ (-11790984));
                                                                                            int i120 = ~i117;
                                                                                            int i121 = ~((41812 & i120) | (i120 ^ 41812));
                                                                                            int i122 = ~((i120 ^ i4) | (i120 & i4));
                                                                                            int i123 = i119 + (((i121 & i122) | (i121 ^ i122)) * (-283));
                                                                                            int i124 = (~((i117 & (-41813)) | ((-41813) ^ i117))) * 283;
                                                                                            int i125 = (i123 & i124) + (i124 | i123);
                                                                                            int i126 = i120 | (-41813);
                                                                                            int i127 = -(-((~((i126 & i4) | (i126 ^ i4))) * 283));
                                                                                            int i128 = ((i125 | i127) << 1) - (i127 ^ i125);
                                                                                            Object[] objArr30 = new Object[1];
                                                                                            a(new char[]{52836}, i128, objArr30);
                                                                                            sb.append((String) objArr30[0]);
                                                                                            String string = sb.toString();
                                                                                            Object[] objArr31 = new Object[1];
                                                                                            c(new byte[]{0, 1, 1, 0, 1}, new int[]{19, 5, 0, 1}, false, objArr31);
                                                                                            dataOutputStream.write(string.getBytes((String) objArr31[0]));
                                                                                            dataOutputStream.flush();
                                                                                            Object[] objArr32 = new Object[1];
                                                                                            c(new byte[]{0, 1, 1, 1, 0}, new int[]{24, 5, 93, 5}, false, objArr32);
                                                                                            String str9 = (String) objArr32[0];
                                                                                            Object[] objArr33 = new Object[1];
                                                                                            c(new byte[]{0, 1, 1, 0, 1}, new int[]{19, 5, 0, 1}, false, objArr33);
                                                                                            dataOutputStream.write(str9.getBytes((String) objArr33[0]));
                                                                                            dataOutputStream.flush();
                                                                                            try {
                                                                                                try {
                                                                                                    long jNanoTime = System.nanoTime();
                                                                                                    long nanos = TimeUnit.MILLISECONDS.toNanos(2000L);
                                                                                                    while (true) {
                                                                                                        try {
                                                                                                            processExec.exitValue();
                                                                                                            str2 = str2;
                                                                                                            break;
                                                                                                        } catch (IllegalThreadStateException unused) {
                                                                                                            if (nanos > 0) {
                                                                                                                try {
                                                                                                                    Object[] objArr34 = {Long.valueOf(Math.min(TimeUnit.NANOSECONDS.toMillis(nanos) + 1, 3L))};
                                                                                                                    byte[] bArr5 = $$a;
                                                                                                                    Object[] objArr35 = new Object[1];
                                                                                                                    d((byte) (-bArr5[44]), (byte) (-bArr5[54]), bArr5[9], objArr35);
                                                                                                                    Class<?> cls9 = Class.forName((String) objArr35[0]);
                                                                                                                    Object[] objArr36 = new Object[1];
                                                                                                                    d(bArr5[8], bArr5[7], bArr5[28], objArr36);
                                                                                                                    cls9.getMethod((String) objArr36[0], Long.TYPE).invoke(null, objArr34);
                                                                                                                } catch (Throwable th2) {
                                                                                                                    Throwable cause2 = th2.getCause();
                                                                                                                    if (cause2 != null) {
                                                                                                                        throw cause2;
                                                                                                                    }
                                                                                                                    throw th2;
                                                                                                                }
                                                                                                            }
                                                                                                            nanos = TimeUnit.MILLISECONDS.toNanos(2000L) - (System.nanoTime() - jNanoTime);
                                                                                                            if (nanos <= 0) {
                                                                                                                break;
                                                                                                            }
                                                                                                            str2 = str2;
                                                                                                        }
                                                                                                    }
                                                                                                    try {
                                                                                                        try {
                                                                                                            try {
                                                                                                                try {
                                                                                                                    dataOutputStream.close();
                                                                                                                    while (true) {
                                                                                                                        if (i24 < length2) {
                                                                                                                            str3 = strArrSplit2[i24];
                                                                                                                            int i129 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                                                                                                            int i130 = i129 * (-381);
                                                                                                                            int i131 = (i130 ^ 9782592) + ((i130 & 9782592) << 1);
                                                                                                                            int i132 = ~i129;
                                                                                                                            int i133 = i131 + (i132 * (-191)) + ((i129 | (~((i4 ^ 50951) | (i4 & 50951)))) * 191);
                                                                                                                            int i134 = -(-(((~((i132 ^ 50951) | (i132 & 50951))) | (~(i17 | 50951))) * 191));
                                                                                                                            int i135 = ((i133 | i134) << 1) - (i134 ^ i133);
                                                                                                                            objArr2 = new Object[1];
                                                                                                                            a(new char[]{52766, 2312, 16387, 39696, 53779, 11562, 25633, 48997, 63029, 12606, 2117, 17165, 39517, 54618, 11363, 26464, 48754, 63868, 12350}, i135, objArr2);
                                                                                                                            if (str3.startsWith((String) objArr2[0])) {
                                                                                                                                str4 = str2;
                                                                                                                            } else {
                                                                                                                                objArr3 = new Object[1];
                                                                                                                                c(new byte[]{0, 0, 1, 0, 1, 0, 0, 1, 1, 1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 1}, new int[]{29, 20, 104, 0}, true, objArr3);
                                                                                                                                if (str3.startsWith((String) objArr3[0])) {
                                                                                                                                    str4 = str2;
                                                                                                                                } else {
                                                                                                                                    objArr4 = new Object[1];
                                                                                                                                    a(new char[]{52766, 64680, 43843, 23024, 1171, 13130, 57825, 44229}, 12965 - (~(-((byte) KeyEvent.getModifierMetaStateMask()))), objArr4);
                                                                                                                                    if (str3.startsWith((String) objArr4[0])) {
                                                                                                                                        Object[] objArr37 = new Object[1];
                                                                                                                                        a(new char[]{52820}, 4493 - (ViewConfiguration.getScrollBarSize() >> 8), objArr37);
                                                                                                                                        strArrSplit3 = str3.split((String) objArr37[0]);
                                                                                                                                        if (strArrSplit3.length > 1) {
                                                                                                                                            str4 = str2;
                                                                                                                                            if (strArrSplit3[1].equalsIgnoreCase(str4)) {
                                                                                                                                                int i136 = (~(i4 & i7)) & (i4 | i7);
                                                                                                                                                int i137 = (i136 | (-i136)) >> 31;
                                                                                                                                                int i138 = i19 & (~i137);
                                                                                                                                                int i139 = i7 & i137;
                                                                                                                                                i7 = (i139 & i138) | (i138 ^ i139);
                                                                                                                                            }
                                                                                                                                        } else {
                                                                                                                                            str4 = str2;
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        str4 = str2;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                            i24 = ((i24 | 1) << 1) - (i24 ^ 1);
                                                                                                                            str2 = str4;
                                                                                                                        }
                                                                                                                    }
                                                                                                                } catch (IOException unused2) {
                                                                                                                }
                                                                                                                processExec.destroy();
                                                                                                            } catch (Exception unused3) {
                                                                                                            }
                                                                                                            Object[] objArr38 = new Object[1];
                                                                                                            d((byte) (-bArr[44]), (byte) (-bArr[54]), bArr[9], objArr38);
                                                                                                            Class<?> cls10 = Class.forName((String) objArr38[0]);
                                                                                                            byte b17 = bArr[28];
                                                                                                            Object[] objArr39 = new Object[1];
                                                                                                            d(b17, b17, bArr[9], objArr39);
                                                                                                            cls10.getMethod((String) objArr39[0], Long.TYPE).invoke(objNewInstance2, 10L);
                                                                                                            StringBuilder sb2 = new StringBuilder();
                                                                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-212805804);
                                                                                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                                                                                char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0'));
                                                                                                                int iMyTid = (Process.myTid() >> 22) + 2142;
                                                                                                                int trimmedLength = 45 - TextUtils.getTrimmedLength("");
                                                                                                                byte b18 = $$d[7];
                                                                                                                byte b19 = (byte) (b18 - 1);
                                                                                                                byte b20 = b18;
                                                                                                                Object[] objArr40 = new Object[1];
                                                                                                                e(b19, b20, (byte) (b20 - 1), objArr40);
                                                                                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cLastIndexOf, iMyTid, trimmedLength, 399405187, false, (String) objArr40[0], null);
                                                                                                            }
                                                                                                            sb2.append(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(objNewInstance).toString());
                                                                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-212805804);
                                                                                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                                                                                                char maxKeyCode = (char) (KeyEvent.getMaxKeyCode() >> 16);
                                                                                                                int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 2142;
                                                                                                                int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 46;
                                                                                                                byte b21 = $$d[7];
                                                                                                                byte b22 = (byte) (b21 - 1);
                                                                                                                byte b23 = b21;
                                                                                                                Object[] objArr41 = new Object[1];
                                                                                                                e(b22, b23, (byte) (b23 - 1), objArr41);
                                                                                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(maxKeyCode, absoluteGravity, packedPositionChild, 399405187, false, (String) objArr41[0], null);
                                                                                                            }
                                                                                                            sb2.append(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(objNewInstance2).toString());
                                                                                                            String string2 = sb2.toString();
                                                                                                            Object[] objArr42 = new Object[1];
                                                                                                            a(new char[]{52836}, 41813 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr42);
                                                                                                            strArrSplit2 = string2.split((String) objArr42[0]);
                                                                                                            length2 = strArrSplit2.length;
                                                                                                            i24 = 0;
                                                                                                        } catch (Throwable th3) {
                                                                                                            Throwable cause3 = th3.getCause();
                                                                                                            if (cause3 != null) {
                                                                                                                throw cause3;
                                                                                                            }
                                                                                                            throw th3;
                                                                                                        }
                                                                                                        byte[] bArr6 = $$a;
                                                                                                        Object[] objArr43 = new Object[1];
                                                                                                        d((byte) (-bArr6[44]), (byte) (-bArr6[54]), bArr6[9], objArr43);
                                                                                                        Class<?> cls11 = Class.forName((String) objArr43[0]);
                                                                                                        byte b24 = bArr6[28];
                                                                                                        Object[] objArr44 = new Object[1];
                                                                                                        d(b24, b24, bArr6[9], objArr44);
                                                                                                        cls11.getMethod((String) objArr44[0], Long.TYPE).invoke(objNewInstance, 100L);
                                                                                                    } catch (Throwable th4) {
                                                                                                        Throwable cause4 = th4.getCause();
                                                                                                        if (cause4 != null) {
                                                                                                            throw cause4;
                                                                                                        }
                                                                                                        throw th4;
                                                                                                    }
                                                                                                } catch (InterruptedException e2) {
                                                                                                    throw e2;
                                                                                                }
                                                                                            } catch (Throwable th5) {
                                                                                                try {
                                                                                                    processExec.destroy();
                                                                                                    throw th5;
                                                                                                } catch (Exception unused4) {
                                                                                                    throw th5;
                                                                                                }
                                                                                            }
                                                                                        } catch (Exception unused5) {
                                                                                            int i140 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                                                                            int i141 = i140 * (-589);
                                                                                            int i142 = ((i141 | 21352830) << 1) - (i141 ^ 21352830);
                                                                                            int i143 = ~(((-36131) ^ i17) | ((-36131) & i17));
                                                                                            int i144 = ~(((-36131) & i140) | ((-36131) ^ i140));
                                                                                            int i145 = (i143 & i144) | (i143 ^ i144);
                                                                                            int i146 = (i23 ^ i140) | (i23 & i140);
                                                                                            int i147 = i145 | (~i146);
                                                                                            int i148 = (~i140) | 36130;
                                                                                            int i149 = ~((i148 & i4) | (i148 ^ i4));
                                                                                            int i150 = ((i147 & i149) | (i147 ^ i149)) * 590;
                                                                                            int i151 = (i142 ^ i150) + ((i150 & i142) << 1);
                                                                                            int i152 = ~(((-36131) ^ i17) | ((-36131) & i17));
                                                                                            int i153 = ~(((-36131) & i140) | ((-36131) ^ i140));
                                                                                            int i154 = (i153 & i152) | (i152 ^ i153);
                                                                                            int i155 = ~i146;
                                                                                            int i156 = ((i154 & i155) | (i154 ^ i155)) * (-1180);
                                                                                            int i157 = (i151 & i156) + (i156 | i151);
                                                                                            int i158 = ~i140;
                                                                                            int i159 = ~((i158 & i17) | (i158 ^ i17));
                                                                                            int i160 = ~(i23 | 36130);
                                                                                            int i161 = (i157 - (~(((i159 & i160) | (i159 ^ i160)) * 590))) - 1;
                                                                                            Object[] objArr45 = new Object[1];
                                                                                            a(new char[]{52776, 17196, 54337, 26987, 64135, 4005, 32924, 5615, 42777, 14453, 19795, 56989, 21423, 58568, 31216, 35590, 7294, 37212, 8760, 46983, 51360, 24030, 61199, 24622, 62805, 1654, 39886}, i161, objArr45);
                                                                                            throw new IOException((String) objArr45[0]);
                                                                                        }
                                                                                    } catch (IOException unused6) {
                                                                                    }
                                                                                } catch (Throwable th6) {
                                                                                    Throwable cause5 = th6.getCause();
                                                                                    if (cause5 != null) {
                                                                                        throw cause5;
                                                                                    }
                                                                                    throw th6;
                                                                                }
                                                                            } catch (Throwable th7) {
                                                                                th = th7;
                                                                                Throwable th8 = th;
                                                                                Throwable cause6 = th8.getCause();
                                                                                if (cause6 != null) {
                                                                                    throw cause6;
                                                                                }
                                                                                throw th8;
                                                                            }
                                                                        } catch (Throwable th9) {
                                                                            th = th9;
                                                                        }
                                                                    } catch (Throwable th10) {
                                                                        th = th10;
                                                                    }
                                                                } catch (Throwable th11) {
                                                                    th = th11;
                                                                }
                                                            } catch (Throwable th12) {
                                                                Throwable cause7 = th12.getCause();
                                                                if (cause7 != null) {
                                                                    throw cause7;
                                                                }
                                                                throw th12;
                                                            }
                                                        } catch (Throwable th13) {
                                                            Throwable cause8 = th13.getCause();
                                                            if (cause8 != null) {
                                                                throw cause8;
                                                            }
                                                            throw th13;
                                                        }
                                                    } catch (IOException unused7) {
                                                        i7 = i7;
                                                        i19 = i19;
                                                        i23 = i35;
                                                    } catch (Exception unused8) {
                                                        i23 = i35;
                                                        int i1410 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                                        int i1411 = i1410 * (-589);
                                                        int i1412 = ((i1411 | 21352830) << 1) - (i1411 ^ 21352830);
                                                        int i1413 = ~(((-36131) ^ i17) | ((-36131) & i17));
                                                        int i1414 = ~(((-36131) & i1410) | ((-36131) ^ i1410));
                                                        int i1415 = (i1413 & i1414) | (i1413 ^ i1414);
                                                        int i1416 = (i23 ^ i1410) | (i23 & i1410);
                                                        int i1417 = i1415 | (~i1416);
                                                        int i1418 = (~i1410) | 36130;
                                                        int i1419 = ~((i1418 & i4) | (i1418 ^ i4));
                                                        int i1510 = ((i1417 & i1419) | (i1417 ^ i1419)) * 590;
                                                        int i1511 = (i1412 ^ i1510) + ((i1510 & i1412) << 1);
                                                        int i1512 = ~(((-36131) ^ i17) | ((-36131) & i17));
                                                        int i1513 = ~(((-36131) & i1410) | ((-36131) ^ i1410));
                                                        int i1514 = (i1513 & i1512) | (i1512 ^ i1513);
                                                        int i1515 = ~i1416;
                                                        int i1516 = ((i1514 & i1515) | (i1514 ^ i1515)) * (-1180);
                                                        int i1517 = (i1511 & i1516) + (i1516 | i1511);
                                                        int i1518 = ~i1410;
                                                        int i1519 = ~((i1518 & i17) | (i1518 ^ i17));
                                                        int i162 = ~(i23 | 36130);
                                                        int i163 = (i1517 - (~(((i1519 & i162) | (i1519 ^ i162)) * 590))) - 1;
                                                        Object[] objArr46 = new Object[1];
                                                        a(new char[]{52776, 17196, 54337, 26987, 64135, 4005, 32924, 5615, 42777, 14453, 19795, 56989, 21423, 58568, 31216, 35590, 7294, 37212, 8760, 46983, 51360, 24030, 61199, 24622, 62805, 1654, 39886}, i163, objArr46);
                                                        throw new IOException((String) objArr46[0]);
                                                    }
                                                } catch (Exception unused9) {
                                                }
                                            } catch (IOException unused10) {
                                                obj6 = obj5;
                                                b7 = b6;
                                                i21 = length;
                                                i22 = i20;
                                                i23 = i35;
                                                i7 = i7;
                                                i20 = (i22 ^ 1) + ((i22 & 1) << 1);
                                                strArrSplit = strArr2;
                                                length = i21;
                                                i35 = i23;
                                                i19 = i19;
                                                obj5 = obj6;
                                                b6 = b7;
                                            }
                                        } catch (IOException unused11) {
                                            strArr2 = strArrSplit;
                                        }
                                    }
                                    i20 = (i22 ^ 1) + ((i22 & 1) << 1);
                                    strArrSplit = strArr2;
                                    length = i21;
                                    i35 = i23;
                                    i19 = i19;
                                    obj5 = obj6;
                                    b6 = b7;
                                } else {
                                    i7 = i7;
                                    i19 = i19;
                                    strArr2 = strArrSplit;
                                    obj6 = obj5;
                                    b7 = b6;
                                    i21 = length;
                                    i22 = i20;
                                    i23 = i35;
                                }
                                i7 = i7;
                                i20 = (i22 ^ 1) + ((i22 & 1) << 1);
                                strArrSplit = strArr2;
                                length = i21;
                                i35 = i23;
                                i19 = i19;
                                obj5 = obj6;
                                b6 = b7;
                            }
                            obj = obj5;
                            b2 = b6;
                            i6 = i35;
                            i30 = 1;
                        } else {
                            i10 = iIndexOf;
                            b3 = b9;
                            obj2 = objInvoke;
                            i11 = 0;
                            i12 = i;
                            i13 = ~i12;
                            int i610 = -i11;
                            int i611 = ((i11 & i610) | (i11 ^ i610)) >> 31;
                            i14 = (i611 & ((i12 & (-21)) | (i13 & 20))) | ((~i611) & i12);
                            byte[] bArr7 = $$a;
                            byte b110 = (byte) (bArr7[21] + 1);
                            Object[] objArr110 = new Object[1];
                            d(b110, (byte) (b110 & 95), bArr7[35], objArr110);
                            Class<?> cls12 = Class.forName((String) objArr110[0]);
                            Object[] objArr111 = new Object[1];
                            b4 = b3;
                            d(b4, bArr7[9], bArr7[50], objArr111);
                            obj3 = obj2;
                            str = (String) cls12.getField((String) objArr111[0]).get(obj3);
                            int length5 = str.length();
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            int i612 = 11790 + (length5 * 984);
                            int i613 = ~length5;
                            int i710 = (((-6) & i613) | ((-6) ^ i613)) * 983;
                            int i711 = ((i612 | i710) << 1) - (i612 ^ i710);
                            int i712 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            int i713 = ~(i613 | i712);
                            int i714 = ((i713 & 5) | (5 ^ i713)) * (-983);
                            int i715 = (i711 ^ i714) + ((i714 & i711) << 1);
                            int i716 = ~((i712 & 5) | (5 ^ i712));
                            int i717 = ~((length5 & 5) | (5 ^ length5));
                            int i718 = -(-(((i717 & i716) | (i716 ^ i717)) * 983));
                            i15 = (i715 & i718) + (i718 | i715);
                            if (i15 >= 0) {
                                i16 = i14;
                                i4 = i12;
                                i17 = i13;
                                obj4 = obj3;
                                b5 = b4;
                                i18 = 0;
                                break;
                            }
                            i25 = 0;
                            while (true) {
                                if (i25 <= i15) {
                                    i16 = i14;
                                    i4 = i12;
                                    i17 = i13;
                                    obj4 = obj3;
                                    b5 = b4;
                                    i18 = 0;
                                    break;
                                }
                                Object[] objArr112 = {str.substring(i25, ((i25 | 6) << 1) - (i25 ^ 6)), 931995};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                    char scrollBarSize2 = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                                    int bitsPerPixel2 = ImageFormat.getBitsPerPixel(0) + 3394;
                                    int mirror2 = '9' - AndroidCharacter.getMirror('0');
                                    byte b111 = (byte) ($$d[7] - 1);
                                    byte b112 = b111;
                                    Object[] objArr113 = new Object[1];
                                    e(b111, b112, (byte) (b112 | 14), objArr113);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(scrollBarSize2, bitsPerPixel2, mirror2, 1203525406, false, (String) objArr113[0], new Class[]{String.class, Integer.TYPE});
                                }
                                long jLongValue3 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr112)).longValue();
                                long j14 = 2051509134;
                                i17 = i13;
                                obj4 = obj3;
                                long j15 = (((long) 960) * j14) + (((long) (-1917)) * jLongValue3);
                                long j16 = 959;
                                b5 = b4;
                                i26 = i25;
                                long j17 = -1;
                                long j18 = jLongValue3 ^ j17;
                                i16 = i14;
                                long jUptimeMillis2 = (int) SystemClock.uptimeMillis();
                                long j19 = jUptimeMillis2 ^ j17;
                                j = j15 + ((((j18 | j19) ^ j17) | ((j14 | jUptimeMillis2) ^ j17)) * j16) + (((long) (-959)) * j18) + (j16 * (((jUptimeMillis2 | j18) ^ j17) | ((j19 | j14) ^ j17))) + ((long) (-2053579011));
                                i4 = i;
                                int i719 = ~((-1127185530) | i4);
                                i27 = ((int) (j >> 32)) & ((-911569466) + ((1730555355 | i719) * (-220)) + ((i719 | 1126575193) * 220) + 2080445340);
                                elapsedCpuTime = (int) Process.getElapsedCpuTime();
                                if ((i27 | (((int) j) & ((-650920367) + (((~((-168059403) | elapsedCpuTime)) | (-1269167008)) * (-756)) + (((~elapsedCpuTime) | (-168059403)) * 756)))) == -2096167706) {
                                    i18 = 1;
                                    break;
                                }
                                i25 = i26 + 1;
                                i12 = i4;
                                i14 = i16;
                                str = str;
                                i15 = i15;
                                i13 = i17;
                                obj3 = obj4;
                                b4 = b5;
                            }
                            i19 = (~(i4 & 20)) & (i4 | 20);
                            int i810 = -i18;
                            int i811 = ((i18 & i810) | (i18 ^ i810)) >> 31;
                            int i812 = (~i811) & i4;
                            int i813 = i811 & i19;
                            int i814 = (i813 & i812) | (i812 ^ i813);
                            int i815 = (~(i4 & i16)) & (i4 | i16);
                            int i816 = (i815 | (-i815)) >> 31;
                            int i817 = i814 & (~i816);
                            int i818 = i816 & i16;
                            i7 = (i817 & i818) | (i817 ^ i818);
                            byte[] bArr8 = $$a;
                            byte b113 = (byte) (bArr8[21] + 1);
                            Object[] objArr114 = new Object[1];
                            d(b113, (byte) (b113 & 95), bArr8[35], objArr114);
                            Class<?> cls13 = Class.forName((String) objArr114[0]);
                            Object[] objArr210 = new Object[1];
                            b6 = b5;
                            d(b6, bArr8[9], bArr8[50], objArr210);
                            obj5 = obj4;
                            String str10 = (String) cls13.getField((String) objArr210[0]).get(obj5);
                            int i819 = i10;
                            int i910 = ~i819;
                            int i911 = -i910;
                            String strSubstring3 = str10.substring(0, i819 & (((i910 & i911) | (i910 ^ i911)) >> 31));
                            Object[] objArr211 = new Object[1];
                            c(new byte[]{1}, new int[]{18, 1, 0, 0}, true, objArr211);
                            strArrSplit = strSubstring3.split((String) objArr211[0]);
                            length = strArrSplit.length;
                            i20 = 0;
                            while (i20 < length) {
                                str2 = strArrSplit[i20];
                                int i912 = -(ViewConfiguration.getDoubleTapTimeout() >> 16);
                                objArr = new Object[1];
                                a(new char[]{52789, 19273, 50209}, (i912 & 34057) + (i912 | 34057), objArr);
                                if (str2.split((String) objArr[0]).length > 1) {
                                    synchronized (((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) Color.red(0), Color.rgb(0, 0, 0) + 16779483, 33 - (Process.myTid() >> 22)))) {
                                        char[] cArr3 = {52766, 17748, 55520, 27655, 58203, 30382, 35344, 303, 38054, 10240, 49003, 12984, 17947, 56674, 20681, 58372};
                                        int i913 = -(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                        strArr2 = strArrSplit;
                                        int i914 = ((i913 | 35672) << 1) - (i913 ^ 35672);
                                        Object[] objArr212 = new Object[1];
                                        a(cArr3, i914, objArr212);
                                        String str11 = (String) objArr212[0];
                                        Runtime runtime2 = Runtime.getRuntime();
                                        char[] cArr4 = {52765, 5021};
                                        int i915 = -(ViewConfiguration.getEdgeSlop() >> 16);
                                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                        i21 = length;
                                        int i916 = i915 * 615;
                                        int i917 = ((i916 | (-34776103)) << 1) - (i916 ^ (-34776103));
                                        int i918 = ~i915;
                                        obj6 = obj5;
                                        int i919 = (~((i918 ^ 56731) | (i918 & 56731))) | iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                                        b7 = b6;
                                        int i1010 = ~(((-56732) ^ i915) | ((-56732) & i915));
                                        int i1011 = ((i919 ^ i1010) | (i919 & i1010)) * 614;
                                        int i1012 = (i917 & i1011) + (i917 | i1011);
                                        int i1013 = ~i915;
                                        i22 = i20;
                                        int i1014 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                                        int i1015 = ~((i1013 ^ i1014) | (i1014 & i1013));
                                        int i1016 = ~(i918 | 56731);
                                        int i1017 = (i1015 ^ i1016) | (i1016 & i1015);
                                        int i1018 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                                        int i1019 = ~((i1018 ^ 56731) | (i1018 & 56731));
                                        int i1110 = ((i1017 ^ i1019) | (i1017 & i1019)) * (-1228);
                                        int i1111 = (i1012 ^ i1110) + ((i1012 & i1110) << 1);
                                        int i1112 = ~((i1013 & (-56732)) | (i1013 ^ (-56732)) | i1018);
                                        int i1113 = (i1018 ^ i915) | (i1018 & i915);
                                        int i1114 = ~((i1113 & 56731) | (i1113 ^ 56731));
                                        int i1115 = ((i1112 & i1114) | (i1112 ^ i1114)) * 614;
                                        int i1116 = ((i1111 | i1115) << 1) - (i1115 ^ i1111);
                                        Object[] objArr213 = new Object[1];
                                        a(cArr4, i1116, objArr213);
                                        processExec = runtime2.exec((String) objArr213[0], (String[]) null, (File) null);
                                        Object[] objArr214 = {processExec.getInputStream()};
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(666339120);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getEdgeSlop() >> 16), KeyEvent.keyCodeFromString("") + 2142, 45 - (ViewConfiguration.getScrollDefaultDelay() >> 16), -1020714777, false, null, new Class[]{InputStream.class});
                                        }
                                        Object objNewInstance3 = ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr214);
                                        Object[] objArr215 = {processExec.getErrorStream()};
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(666339120);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) TextUtils.indexOf("", "", 0, 0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 2142, (ViewConfiguration.getLongPressTimeout() >> 16) + 45, -1020714777, false, null, new Class[]{InputStream.class});
                                        }
                                        Object objNewInstance4 = ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr215);
                                        DataOutputStream dataOutputStream2 = new DataOutputStream(processExec.getOutputStream());
                                        byte[] bArr9 = $$a;
                                        i23 = i35;
                                        i19 = i19;
                                        Object[] objArr216 = new Object[1];
                                        d((byte) (-bArr9[44]), (byte) (-bArr9[54]), bArr9[9], objArr216);
                                        Class<?> cls14 = Class.forName((String) objArr216[0]);
                                        i7 = i7;
                                        Object[] objArr217 = new Object[1];
                                        d(bArr9[0], bArr9[7], bArr9[28], objArr217);
                                        cls14.getMethod((String) objArr217[0], null).invoke(objNewInstance3, null);
                                        Object[] objArr218 = new Object[1];
                                        d((byte) (-bArr9[44]), (byte) (-bArr9[54]), bArr9[9], objArr218);
                                        Class<?> cls15 = Class.forName((String) objArr218[0]);
                                        Object[] objArr219 = new Object[1];
                                        d(bArr9[0], bArr9[7], bArr9[28], objArr219);
                                        cls15.getMethod((String) objArr219[0], null).invoke(objNewInstance4, null);
                                        StringBuilder sb3 = new StringBuilder();
                                        sb3.append(str11);
                                        int i1117 = -((byte) KeyEvent.getModifierMetaStateMask());
                                        int i1118 = i1117 * 284;
                                        int i1119 = ((i1118 | (-11790984)) << 1) - (i1118 ^ (-11790984));
                                        int i1210 = ~i1117;
                                        int i1211 = ~((41812 & i1210) | (i1210 ^ 41812));
                                        int i1212 = ~((i1210 ^ i4) | (i1210 & i4));
                                        int i1213 = i1119 + (((i1211 & i1212) | (i1211 ^ i1212)) * (-283));
                                        int i1214 = (~((i1117 & (-41813)) | ((-41813) ^ i1117))) * 283;
                                        int i1215 = (i1213 & i1214) + (i1214 | i1213);
                                        int i1216 = i1210 | (-41813);
                                        int i1217 = -(-((~((i1216 & i4) | (i1216 ^ i4))) * 283));
                                        int i1218 = ((i1215 | i1217) << 1) - (i1217 ^ i1215);
                                        Object[] objArr310 = new Object[1];
                                        a(new char[]{52836}, i1218, objArr310);
                                        sb3.append((String) objArr310[0]);
                                        String string3 = sb3.toString();
                                        Object[] objArr311 = new Object[1];
                                        c(new byte[]{0, 1, 1, 0, 1}, new int[]{19, 5, 0, 1}, false, objArr311);
                                        dataOutputStream2.write(string3.getBytes((String) objArr311[0]));
                                        dataOutputStream2.flush();
                                        Object[] objArr312 = new Object[1];
                                        c(new byte[]{0, 1, 1, 1, 0}, new int[]{24, 5, 93, 5}, false, objArr312);
                                        String str12 = (String) objArr312[0];
                                        Object[] objArr313 = new Object[1];
                                        c(new byte[]{0, 1, 1, 0, 1}, new int[]{19, 5, 0, 1}, false, objArr313);
                                        dataOutputStream2.write(str12.getBytes((String) objArr313[0]));
                                        dataOutputStream2.flush();
                                        long jNanoTime2 = System.nanoTime();
                                        long nanos2 = TimeUnit.MILLISECONDS.toNanos(2000L);
                                        while (true) {
                                            processExec.exitValue();
                                            str2 = str2;
                                            break;
                                        }
                                        dataOutputStream2.close();
                                        byte[] bArr10 = $$a;
                                        Object[] objArr47 = new Object[1];
                                        d((byte) (-bArr10[44]), (byte) (-bArr10[54]), bArr10[9], objArr47);
                                        Class<?> cls16 = Class.forName((String) objArr47[0]);
                                        byte b25 = bArr10[28];
                                        Object[] objArr48 = new Object[1];
                                        d(b25, b25, bArr10[9], objArr48);
                                        cls16.getMethod((String) objArr48[0], Long.TYPE).invoke(objNewInstance3, 100L);
                                        Object[] objArr314 = new Object[1];
                                        d((byte) (-bArr10[44]), (byte) (-bArr10[54]), bArr10[9], objArr314);
                                        Class<?> cls17 = Class.forName((String) objArr314[0]);
                                        byte b114 = bArr10[28];
                                        Object[] objArr315 = new Object[1];
                                        d(b114, b114, bArr10[9], objArr315);
                                        cls17.getMethod((String) objArr315[0], Long.TYPE).invoke(objNewInstance4, 10L);
                                        processExec.destroy();
                                        StringBuilder sb4 = new StringBuilder();
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-212805804);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                            char cLastIndexOf2 = (char) ((-1) - TextUtils.lastIndexOf("", '0'));
                                            int iMyTid2 = (Process.myTid() >> 22) + 2142;
                                            int trimmedLength2 = 45 - TextUtils.getTrimmedLength("");
                                            byte b115 = $$d[7];
                                            byte b116 = (byte) (b115 - 1);
                                            byte b26 = b115;
                                            Object[] objArr49 = new Object[1];
                                            e(b116, b26, (byte) (b26 - 1), objArr49);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cLastIndexOf2, iMyTid2, trimmedLength2, 399405187, false, (String) objArr49[0], null);
                                        }
                                        sb4.append(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(objNewInstance3).toString());
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-212805804);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                            char maxKeyCode2 = (char) (KeyEvent.getMaxKeyCode() >> 16);
                                            int absoluteGravity2 = Gravity.getAbsoluteGravity(0, 0) + 2142;
                                            int packedPositionChild2 = ExpandableListView.getPackedPositionChild(0L) + 46;
                                            byte b27 = $$d[7];
                                            byte b28 = (byte) (b27 - 1);
                                            byte b29 = b27;
                                            Object[] objArr410 = new Object[1];
                                            e(b28, b29, (byte) (b29 - 1), objArr410);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(maxKeyCode2, absoluteGravity2, packedPositionChild2, 399405187, false, (String) objArr410[0], null);
                                        }
                                        sb4.append(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(objNewInstance4).toString());
                                        String string4 = sb4.toString();
                                        Object[] objArr411 = new Object[1];
                                        a(new char[]{52836}, 41813 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr411);
                                        strArrSplit2 = string4.split((String) objArr411[0]);
                                        length2 = strArrSplit2.length;
                                        i24 = 0;
                                        while (true) {
                                            if (i24 < length2) {
                                                str3 = strArrSplit2[i24];
                                                int i1219 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                                int i1310 = i1219 * (-381);
                                                int i1311 = (i1310 ^ 9782592) + ((i1310 & 9782592) << 1);
                                                int i1312 = ~i1219;
                                                int i1313 = i1311 + (i1312 * (-191)) + ((i1219 | (~((i4 ^ 50951) | (i4 & 50951)))) * 191);
                                                int i1314 = -(-(((~((i1312 ^ 50951) | (i1312 & 50951))) | (~(i17 | 50951))) * 191));
                                                int i1315 = ((i1313 | i1314) << 1) - (i1314 ^ i1313);
                                                objArr2 = new Object[1];
                                                a(new char[]{52766, 2312, 16387, 39696, 53779, 11562, 25633, 48997, 63029, 12606, 2117, 17165, 39517, 54618, 11363, 26464, 48754, 63868, 12350}, i1315, objArr2);
                                                if (str3.startsWith((String) objArr2[0])) {
                                                    objArr3 = new Object[1];
                                                    c(new byte[]{0, 0, 1, 0, 1, 0, 0, 1, 1, 1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 1}, new int[]{29, 20, 104, 0}, true, objArr3);
                                                    if (str3.startsWith((String) objArr3[0])) {
                                                        objArr4 = new Object[1];
                                                        a(new char[]{52766, 64680, 43843, 23024, 1171, 13130, 57825, 44229}, 12965 - (~(-((byte) KeyEvent.getModifierMetaStateMask()))), objArr4);
                                                        if (str3.startsWith((String) objArr4[0])) {
                                                            Object[] objArr316 = new Object[1];
                                                            a(new char[]{52820}, 4493 - (ViewConfiguration.getScrollBarSize() >> 8), objArr316);
                                                            strArrSplit3 = str3.split((String) objArr316[0]);
                                                            if (strArrSplit3.length > 1) {
                                                                str4 = str2;
                                                                if (strArrSplit3[1].equalsIgnoreCase(str4)) {
                                                                    int i1316 = (~(i4 & i7)) & (i4 | i7);
                                                                    int i1317 = (i1316 | (-i1316)) >> 31;
                                                                    int i1318 = i19 & (~i1317);
                                                                    int i1319 = i7 & i1317;
                                                                    i7 = (i1319 & i1318) | (i1318 ^ i1319);
                                                                }
                                                            } else {
                                                                str4 = str2;
                                                            }
                                                        } else {
                                                            str4 = str2;
                                                        }
                                                    } else {
                                                        str4 = str2;
                                                    }
                                                } else {
                                                    str4 = str2;
                                                }
                                                i24 = ((i24 | 1) << 1) - (i24 ^ 1);
                                                str2 = str4;
                                            }
                                            i20 = (i22 ^ 1) + ((i22 & 1) << 1);
                                            strArrSplit = strArr2;
                                            length = i21;
                                            i35 = i23;
                                            i19 = i19;
                                            obj5 = obj6;
                                            b6 = b7;
                                        }
                                    }
                                } else {
                                    i7 = i7;
                                    i19 = i19;
                                    strArr2 = strArrSplit;
                                    obj6 = obj5;
                                    b7 = b6;
                                    i21 = length;
                                    i22 = i20;
                                    i23 = i35;
                                }
                                i7 = i7;
                                i20 = (i22 ^ 1) + ((i22 & 1) << 1);
                                strArrSplit = strArr2;
                                length = i21;
                                i35 = i23;
                                i19 = i19;
                                obj5 = obj6;
                                b6 = b7;
                            }
                            obj = obj5;
                            b2 = b6;
                            i6 = i35;
                            i30 = 1;
                        }
                    } else {
                        i4 = i28;
                        b2 = b9;
                        obj = objInvoke;
                        i6 = i35;
                        i7 = i4;
                    }
                    Object[] objArr50 = new Object[2];
                    objArr50[0] = new int[i30];
                    String[] strArr3 = new String[i30];
                    byte[] bArr11 = $$a;
                    byte b30 = (byte) (bArr11[21] + i30);
                    Object[] objArr51 = new Object[i30];
                    d(b30, (byte) (b30 & 95), bArr11[35], objArr51);
                    Class<?> cls18 = Class.forName((String) objArr51[0]);
                    Object[] objArr52 = new Object[i30];
                    d(b2, bArr11[9], bArr11[50], objArr52);
                    strArr3[0] = cls18.getField((String) objArr52[0]).get(obj);
                    Object obj7 = objArr50[0];
                    ((int[]) obj7)[0] = i7;
                    objArr50[i30] = strArr3;
                    i5 = ((int[]) obj7)[0];
                    strArr = strArr3;
                    if ((i2 & 1) == 0) {
                        int i164 = -TextUtils.getOffsetBefore("", 0);
                        Object[] objArr53 = new Object[1];
                        a(new char[]{52746, 60954, 36410, 44596, 20041, 28254, 3671, 11881, 52873, 61083, 36525, 44726, 20187}, (i164 & 8209) + (i164 | 8209), objArr53);
                        try {
                            Object[] objArr54 = {(String) objArr53[0]};
                            int i165 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
                            Object[] objArr55 = new Object[1];
                            a(new char[]{52751, 29295, 46804, 64337, 16317, 24620, 42128, 59721, 11637, 20966, 37462, 55007, 6975, 24483, 32776, 50369, 2269, 19806, 61902, 12839, 30375, 47885, 65424}, (i165 & 48239) + (i165 | 48239), objArr55);
                            Class<?> cls19 = Class.forName((String) objArr55[0]);
                            int i166 = -(-View.MeasureSpec.getSize(0));
                            int i167 = (i166 ^ 17117) + ((i166 & 17117) << 1);
                            Object[] objArr56 = new Object[1];
                            a(new char[]{52745, 36054, 19360, 1706, 50531, 32844, 24372, 6656, 55531, 38904, 21161, 4451, 60484, 43838, 26139, 9464}, i167, objArr56);
                            Object objInvoke2 = cls19.getMethod((String) objArr56[0], String.class).invoke(context, objArr54);
                            if (objInvoke2 == null) {
                                i8 = i5;
                                strArr = strArr;
                                i9 = i4;
                                break;
                            }
                            int i168 = -Gravity.getAbsoluteGravity(0, 0);
                            int i169 = ~i168;
                            int i170 = ~((i169 ^ i6) | (i169 & i6));
                            int i171 = ((i168 * 302) - (-13535541)) + (((i170 & 22447) | (i170 ^ 22447)) * (-602));
                            int i172 = ~((i169 & (-22448)) | (i169 ^ (-22448)));
                            int i173 = ~((~i168) | i4);
                            int i174 = (i172 & i173) | (i172 ^ i173);
                            int i175 = ~i4;
                            int i176 = (i168 & i175) | (i175 ^ i168);
                            int i177 = ~((i176 & 22447) | (i176 ^ 22447));
                            int i178 = -(-(((i177 & i174) | (i174 ^ i177)) * (-301)));
                            int i179 = ((i171 | i178) << 1) - (i178 ^ i171);
                            int i180 = (~((i175 ^ 22447) | (i175 & 22447))) * 301;
                            int i181 = (i179 & i180) + (i180 | i179);
                            Object[] objArr57 = new Object[1];
                            a(new char[]{52751, 39343, 24916, 51473, 37053, 30828, 49168, 43913, 29559, 56121, 41672, 2757, 53819, 48617, 1425, 60742, 46320, 7391, 58468, 20470, 6068, 65372, 18183, 11954, 63062, 24086, 10692, 61810, 22825, 8388, 34977, 20542, 15328, 33664, 27447, 13030, 39552}, i181, objArr57);
                            Class<?> cls20 = Class.forName((String) objArr57[0]);
                            Object[] objArr58 = new Object[1];
                            c(new byte[]{1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 0}, new int[]{49, 15, 196, 0}, true, objArr58);
                            List list = (List) cls20.getMethod((String) objArr58[0], null).invoke(objInvoke2, null);
                            if (list == null) {
                                i8 = i5;
                                strArr = strArr;
                                i9 = i4;
                                break;
                            }
                            Iterator it = list.iterator();
                            loop5: while (true) {
                                if (!it.hasNext()) {
                                    i8 = i5;
                                    strArr = strArr;
                                    i9 = i4;
                                    break;
                                }
                                Object next = it.next();
                                Object[] objArr59 = new Object[1];
                                c(new byte[]{1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0}, new int[]{64, 29, 0, 0}, false, objArr59);
                                Class<?> cls21 = Class.forName((String) objArr59[0]);
                                int i182 = -TextUtils.getTrimmedLength("");
                                int i183 = (i182 ^ 48091) + ((i182 & 48091) << 1);
                                Object[] objArr60 = new Object[1];
                                a(new char[]{52745, 30160, 47532, 64943, 8547, 25930, 43303, 60658, 4305, 21688, 39086, 56422, 'G', 17428}, i183, objArr60);
                                String str13 = (String) cls21.getMethod((String) objArr60[0], null).invoke(next, null);
                                int iRgb = Color.rgb(0, 0, 0);
                                int i184 = iRgb * (-501);
                                int i185 = (i184 & (-139704103)) + (i184 | (-139704103));
                                int i186 = ~(((-16799664) ^ i4) | ((-16799664) & i4));
                                int i187 = ~((iRgb ^ 16799663) | (16799663 & iRgb));
                                int i188 = ((i186 ^ i187) | (i186 & i187)) * (-502);
                                int i189 = ((-16799664) & i175) | ((-16799664) ^ i175);
                                int i190 = (((i185 & i188) + (i188 | i185)) - (~(-(-((~((i189 & iRgb) | (i189 ^ iRgb))) * (-502)))))) - 1;
                                int i191 = ~((~iRgb) | i4);
                                Object[] objArr61 = new Object[1];
                                a(new char[]{52751, 39343, 24916, 51473, 37053, 30828, 49168, 43913, 29559, 56121, 41672, 2757, 53819, 48617, 1425, 60742, 46320, 7391, 58468, 20470, 6068, 65372, 18183, 11954, 63062, 24086, 10692, 61810, 22825, 8388, 34977, 20542, 15328, 33664, 27447, 13030, 39552}, (i190 - (~(-(-(((i191 & (-16799664)) | ((-16799664) ^ i191)) * TypedValues.PositionType.TYPE_DRAWPATH))))) - 1, objArr61);
                                Class<?> cls22 = Class.forName((String) objArr61[0]);
                                Object[] objArr62 = new Object[1];
                                c(new byte[]{0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1}, new int[]{93, 17, 0, 4}, true, objArr62);
                                if (((Boolean) cls22.getMethod((String) objArr62[0], String.class).invoke(objInvoke2, str13)).booleanValue()) {
                                    int length6 = str13.length();
                                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                    int i192 = -(-(length6 * TypedValues.PositionType.TYPE_PERCENT_WIDTH));
                                    int i193 = (((-10060) | i192) << 1) - (i192 ^ (-10060));
                                    int i194 = ((-20) & length6) | ((-20) ^ length6);
                                    int i195 = i194 * (-502);
                                    int i196 = (i193 & i195) + (i195 | i193);
                                    int i197 = ~length6;
                                    int i198 = ~((i197 & 19) | (19 ^ i197));
                                    int i199 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                                    int i200 = (19 ^ i199) | (i199 & 19);
                                    int i201 = ~i200;
                                    int i202 = (i198 ^ i201) | (i198 & i201);
                                    int i203 = (iTuitionPaymentFragmentspecialinlinedviewModeldefault5 & i194) | (i194 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5);
                                    int i204 = ~i203;
                                    int i205 = (i196 - (~(-(-(((i204 & i202) | (i202 ^ i204)) * (-502)))))) - 1;
                                    int i206 = ~((length6 & i200) | (i200 ^ length6));
                                    int i207 = ~i203;
                                    int i208 = i205 - (~(-(-(((i206 & i207) | (i206 ^ i207)) * TypedValues.PositionType.TYPE_DRAWPATH))));
                                    int i209 = 1;
                                    int i210 = i208 - 1;
                                    if (i210 >= 0) {
                                        int i211 = 0;
                                        while (i211 <= i210) {
                                            int i212 = i211 * 263;
                                            int i213 = (((-10460) | i212) << i209) - ((-10460) ^ i212);
                                            int i214 = ~(((-21) & i211) | ((-21) ^ i211));
                                            int i215 = ~i211;
                                            int i216 = ~((i215 ^ 20) | (i215 & 20));
                                            int i217 = (i214 & i216) | (i214 ^ i216);
                                            int i218 = ~(i215 | i4);
                                            int i219 = i213 + (((i217 & i218) | (i217 ^ i218)) * 262);
                                            int i220 = ~i211;
                                            int i221 = (i220 ^ 20) | (i220 & 20);
                                            int i222 = (i219 - (~(-(-((~i221) * (-786)))))) - 1;
                                            int i223 = ~((i220 & i175) | (i220 ^ i175));
                                            int i224 = ~(((-21) & i211) | ((-21) ^ i211));
                                            int i225 = (i223 & i224) | (i223 ^ i224);
                                            int i226 = ~i221;
                                            int i227 = ((i225 & i226) | (i225 ^ i226)) * 262;
                                            Object[] objArr63 = {str13.substring(i211, (i222 & i227) + (i227 | i222)), 931995};
                                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                                                char cGreen = (char) Color.green(0);
                                                int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 3393;
                                                int touchSlop = 9 - (ViewConfiguration.getTouchSlop() >> 8);
                                                byte b31 = (byte) ($$d[7] - 1);
                                                byte b32 = b31;
                                                Object[] objArr64 = new Object[1];
                                                e(b31, b32, (byte) (b32 | 14), objArr64);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cGreen, jumpTapTimeout, touchSlop, 1203525406, false, (String) objArr64[0], new Class[]{String.class, Integer.TYPE});
                                            }
                                            long jLongValue4 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr63)).longValue();
                                            long j20 = 994829682;
                                            Iterator it2 = it;
                                            int i228 = i210;
                                            long j21 = (((long) (-520)) * j20) + (((long) 522) * jLongValue4);
                                            long j22 = 521;
                                            String str14 = str13;
                                            int i229 = i175;
                                            int i230 = i211;
                                            long j23 = -1;
                                            long j24 = j20 ^ j23;
                                            i8 = i5;
                                            long jUptimeMillis3 = (int) SystemClock.uptimeMillis();
                                            long j25 = ((jLongValue4 ^ j23) | j20) ^ j23;
                                            long j26 = j21 + ((((j24 | jLongValue4) | jUptimeMillis3) ^ j23) * j22) + (((long) (-1042)) * j25) + (j22 * ((((j24 | (jUptimeMillis3 ^ j23)) | jLongValue4) ^ j23) | j25)) + ((long) (-996899559));
                                            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                                            int i231 = ~(1754509870 | iMaxMemory);
                                            int i232 = ((int) (j26 >> 32)) & ((-1090014838) + (((-2063335088) | i231) * (-814)) + ((i231 | (~((~iMaxMemory) | 317283459)) | 8458242) * 407) + (((~(iMaxMemory | (-317283460))) | (~((-1754509871) | iMaxMemory)) | 8458242) * 407));
                                            int i233 = ((int) j26) & (1051788847 + (((~((-750721573) | i4)) | (-2107019314)) * (-318)) + (((~((-2107019314) | i4)) | (~(i229 | 2109708853))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + (((~(i229 | (-1358987282))) | (~(2109708853 | i4))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET));
                                            if (((i232 & i233) | (i232 ^ i233)) == 1245577864) {
                                                i9 = (~(i4 & 70)) & (i4 | 70);
                                                break loop5;
                                            }
                                            i211 = i230 + 1;
                                            objInvoke2 = objInvoke2;
                                            it = it2;
                                            i5 = i8;
                                            strArr = strArr;
                                            str13 = str14;
                                            i175 = i229;
                                            i210 = i228;
                                            i209 = 1;
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                                objInvoke2 = objInvoke2;
                                it = it;
                                i5 = i5;
                                strArr = strArr;
                                i175 = i175;
                            }
                            int i234 = ((~i8) & i4) | ((~i4) & i8);
                            int i235 = -i234;
                            int i236 = ((i234 & i235) | (i234 ^ i235)) >> 31;
                            int i237 = i9 & (~i236);
                            int i238 = i236 & i8;
                            i5 = (i237 & i238) | (i237 ^ i238);
                        } catch (Throwable th14) {
                            Throwable cause9 = th14.getCause();
                            if (cause9 != null) {
                                throw cause9;
                            }
                            throw th14;
                        }
                    } else {
                        strArr = strArr;
                    }
                } catch (Throwable th15) {
                    Throwable cause10 = th15.getCause();
                    if (cause10 != null) {
                        throw cause10;
                    }
                    throw th15;
                }
            } else {
                i4 = i28;
                i5 = i4;
                strArr = null;
            }
            Object[] objArr65 = new Object[1];
            c(new byte[]{0, 1, 0, 1, 0, 0, 1, 1, 0, 0, 0, 0}, new int[]{110, 12, 113, 0}, true, objArr65);
            Object[] objArr66 = {(String) objArr65[0]};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1004662034);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
                int scrollBarSize3 = 993 - (ViewConfiguration.getScrollBarSize() >> 8);
                int iIndexOf2 = 7 - TextUtils.indexOf((CharSequence) "", '0', 0);
                byte[] bArr12 = $$d;
                byte b33 = bArr12[7];
                Object[] objArr67 = new Object[1];
                e(b33, (byte) (b33 - 1), (byte) (-bArr12[15]), objArr67);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cResolveOpacity, scrollBarSize3, iIndexOf2, -545305915, false, (String) objArr67[0], new Class[]{String.class});
            }
            long jLongValue5 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).invoke(null, objArr66)).longValue();
            long j27 = -990752503;
            long j28 = -502;
            long j29 = -1;
            long j30 = jLongValue5 ^ j29;
            int i239 = i5;
            long j31 = i4;
            long j32 = (((long) (-501)) * j27) + (((long) TypedValues.PositionType.TYPE_PERCENT_WIDTH) * jLongValue5) + ((((j30 | j31) ^ j29) | ((jLongValue5 | j27) ^ j29)) * j28);
            long j33 = j31 ^ j29;
            long j34 = j32 + (j28 * (((j30 | j33) | j27) ^ j29)) + (((long) TypedValues.PositionType.TYPE_DRAWPATH) * ((((j27 ^ j29) | j31) ^ j29) | j30)) + ((long) 1611211787);
            int i240 = ~i4;
            int i241 = (~(686237840 | i240)) | (-2130149052) | (~(2123464251 | i240));
            int i242 = ((int) (j34 >> 32)) & (1570368386 + (((~((-679553041) | i4)) | i241) * 590) + (i241 * (-1180)) + (((~((-2123464252) | i240)) | (~((-686237841) | i240))) * 590));
            int i243 = ~((int) Process.getStartUptimeMillis());
            int i244 = ((int) j34) & (1019428157 + (((~(i243 | (-708870186))) | (~((-66561) | i243))) * (-184)) + ((1074402070 | (~((-1074468631) | i243)) | (~((-1783272256) | i243))) * 184) + 1716827464);
            int i245 = (i242 & i244) | (i242 ^ i244);
            int i246 = -i245;
            int i247 = ((i245 & i246) | (i245 ^ i246)) >> 31;
            int i248 = (~i247) & i4;
            int i249 = i247 & ((i4 & (-51)) | (i240 & 50));
            int i250 = (i249 & i248) | (i248 ^ i249);
            int i251 = ((~i239) & i4) | (i239 & i240);
            int i252 = -i251;
            int i253 = ((i251 & i252) | (i251 ^ i252)) >> 31;
            int i254 = i250 & (~i253);
            int i255 = i239 & i253;
            int i256 = (i254 & i255) | (i254 ^ i255);
            Object[] objArr68 = new Object[1];
            c(new byte[]{1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 0, 0, 1, 1, 0, 0, 0}, new int[]{122, 20, 0, 0}, true, objArr68);
            Object[] objArr69 = {(String) objArr68[0]};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1004662034);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0));
                int i257 = 994 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                int threadPriority = 8 - ((Process.getThreadPriority(0) + 20) >> 6);
                byte[] bArr13 = $$d;
                byte b34 = bArr13[7];
                Object[] objArr70 = new Object[1];
                e(b34, (byte) (b34 - 1), (byte) (-bArr13[15]), objArr70);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cIndexOf, i257, threadPriority, -545305915, false, (String) objArr70[0], new Class[]{String.class});
            }
            long jLongValue6 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).invoke(null, objArr69)).longValue();
            long j35 = -1376051377;
            long j36 = 881;
            long j37 = (j36 * j35) + (j36 * jLongValue6);
            long j38 = -880;
            long j39 = j35 ^ j29;
            long j40 = jLongValue6 ^ j29;
            long jNextInt = new Random().nextInt(1346213939);
            long j41 = (j35 | jNextInt) ^ j29;
            long j42 = j37 + ((((j39 | j40) ^ j29) | ((j39 | jNextInt) ^ j29) | ((j40 | jNextInt) ^ j29)) * j38) + (j38 * (jLongValue6 | ((j39 | (jNextInt ^ j29)) ^ j29) | j41)) + (((long) 880) * j41) + ((long) 1996510661);
            int i258 = (~(1772768082 | i240)) | 70656;
            int i259 = ~((-687865937) | i4);
            int i260 = ((int) (j42 >> 32)) & (665463514 + ((i258 | i259) * (-713)) + (i259 * 1426) + ((~(1084972802 | i240)) * 713));
            int i261 = ((int) j42) & ((-1871736089) + (((~(419703300 | i240)) | (~(1017523109 | i4))) * 1900) + (((~(i240 | (-1017523110))) | (~((-419703301) | i4))) * (-950)) + (((~((-1017523110) | i4)) | (~(i240 | (-419703301)))) * 950));
            int i262 = (i261 & i260) | (i260 ^ i261);
            int i263 = -i262;
            int i264 = ((i262 & i263) | (i262 ^ i263)) >> 31;
            int i265 = (~i264) & i4;
            int i266 = i264 & ((i4 & (-61)) | (i240 & 60));
            int i267 = (i266 & i265) | (i265 ^ i266);
            int i268 = ((~i256) & i4) | (i256 & i240);
            int i269 = -i268;
            int i270 = ((i268 & i269) | (i268 ^ i269)) >> 31;
            int i271 = i267 & (~i270);
            int i272 = i270 & i256;
            int i273 = (i271 & i272) | (i271 ^ i272);
            Object[] objArr71 = new Object[1];
            c(new byte[]{1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1}, new int[]{142, 36, 0, 0}, false, objArr71);
            Object[] objArr72 = {(String) objArr71[0]};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char defaultSize = (char) View.getDefaultSize(0, 0);
                int iMakeMeasureSpec = 993 - View.MeasureSpec.makeMeasureSpec(0, 0);
                int iIndexOf3 = TextUtils.indexOf("", "") + 8;
                byte b35 = $$d[7];
                byte b36 = (byte) (b35 - 1);
                Object[] objArr73 = new Object[1];
                e(b35, b36, (byte) (b36 | 13), objArr73);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(defaultSize, iMakeMeasureSpec, iIndexOf3, 349342683, false, (String) objArr73[0], new Class[]{String.class});
            }
            long jLongValue7 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).invoke(null, objArr72)).longValue();
            long j43 = 403817831;
            long j44 = (((long) 960) * j43) + (((long) (-1917)) * jLongValue7);
            long j45 = 959;
            long j46 = jLongValue7 ^ j29;
            long jNextInt2 = new Random().nextInt();
            long j47 = jNextInt2 ^ j29;
            long j48 = j44 + ((((j46 | j47) ^ j29) | ((j43 | jNextInt2) ^ j29)) * j45) + (((long) (-959)) * j46) + (j45 * (((j46 | jNextInt2) ^ j29) | ((j47 | j43) ^ j29))) + ((long) (-1250896436));
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i274 = ~startUptimeMillis;
            int i275 = ((int) (j48 >> 32)) & (2119721882 + (((~(startUptimeMillis | 2039981815)) | (~((-1477617332) | i274)) | 40390920) * (-68)) + ((~(2080372735 | i274)) * (-68)) + (((~((-2039981816) | i274)) | 602755404) * 68));
            int i276 = ((int) j48) & (314903923 + (((~((-1141274533) | i)) | (-295951878)) * 191) + (((~((-1141274533) | i240)) | 1141121440) * 191));
            int i277 = (i275 & i276) | (i275 ^ i276);
            int i278 = -i277;
            int i279 = ((i277 & i278) | (i277 ^ i278)) >> 31;
            int i280 = (~i279) & i;
            int i281 = i279 & ((i & (-81)) | (i240 & 80));
            int i282 = (i281 & i280) | (i280 ^ i281);
            int i283 = (~(i & i273)) & (i | i273);
            int i284 = -i283;
            int i285 = ((i283 & i284) | (i283 ^ i284)) >> 31;
            int i286 = i282 & (~i285);
            int i287 = i273 & i285;
            int i288 = (i286 & i287) | (i286 ^ i287);
            Object[] objArr74 = new Object[1];
            a(new char[]{52801, 61619, 45949, 29233, 13547, 63452, 46684, 30976, 15314, 64142, 48507, 32766, 16045, 57702, 41054, 25306, 9618, 58440, 42754, 27056, 10292, 60194, 44518, 27797, 12100, 60944, 37069, 21385, 4732, 54527, 38837, 22120, 6434, 56217, 39567, 23893, 7179, 57008, 33149, 16494, 752, 50594}, 16056 - (~(-ExpandableListView.getPackedPositionType(0L))), objArr74);
            Object[] objArr75 = {(String) objArr74[0]};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char size = (char) View.MeasureSpec.getSize(0);
                int iAxisFromString = MotionEvent.axisFromString("") + 994;
                int jumpTapTimeout2 = 8 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                byte b37 = $$d[7];
                byte b38 = (byte) (b37 - 1);
                Object[] objArr76 = new Object[1];
                e(b37, b38, (byte) (b38 | 13), objArr76);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(size, iAxisFromString, jumpTapTimeout2, 349342683, false, (String) objArr76[0], new Class[]{String.class});
            }
            long jLongValue8 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr75)).longValue();
            long j49 = 674872710;
            long j50 = j49 ^ j29;
            long j51 = jLongValue8 ^ j29;
            long j52 = j50 | (((long) ((int) Runtime.getRuntime().totalMemory())) ^ j29);
            long j53 = (((long) 483) * j49) + (((long) 242) * jLongValue8) + (((long) (-241)) * (((j50 | j51) ^ j29) | (j52 ^ j29))) + (((long) (-482)) * (j49 | jLongValue8)) + (((long) 241) * (((jLongValue8 | j52) ^ j29) | ((j51 | j49) ^ j29))) + ((long) (-1521951315));
            int iMyTid3 = Process.myTid();
            int i289 = ~iMyTid3;
            int i290 = ((int) (j53 >> 32)) & ((((~(602033760 | i289)) | (~((-2039260172) | iMyTid3)) | (~(i289 | 2039260171))) * 959) + 2120142900 + (((~(iMyTid3 | 2039260171)) | (~(i289 | (-2039260172))) | (~(602033760 | iMyTid3))) * 959));
            int i291 = ~((int) Process.getElapsedCpuTime());
            int i292 = ((int) j53) & ((-499703659) + (((~(i291 | (-924032200))) | 370317506) * (-160)) + (((~(i291 | 513194210)) | (-924032200)) * 160));
            int i293 = (i290 & i292) | (i290 ^ i292);
            int i294 = -i293;
            int i295 = ((i293 & i294) | (i293 ^ i294)) >> 31;
            int i296 = (~i295) & i;
            int i297 = i295 & ((i & (-91)) | (i240 & 90));
            int i298 = (i297 & i296) | (i296 ^ i297);
            int i299 = i ^ i288;
            int i300 = -i299;
            int i301 = ((i299 & i300) | (i299 ^ i300)) >> 31;
            int i302 = (i288 & i301) | (i298 & (~i301));
            Object[] objArr77 = new Object[1];
            c(new byte[]{1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 0, 0, 1, 1, 1}, new int[]{178, 18, 77, 9}, false, objArr77);
            Object[] objArr78 = {(String) objArr77[0]};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cGreen2 = (char) Color.green(0);
                int iIndexOf4 = TextUtils.indexOf((CharSequence) "", '0', 0) + 994;
                int i303 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 7;
                byte b39 = $$d[7];
                byte b40 = (byte) (b39 - 1);
                Object[] objArr79 = new Object[1];
                e(b39, b40, (byte) (b40 | 13), objArr79);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cGreen2, iIndexOf4, i303, 349342683, false, (String) objArr79[0], new Class[]{String.class});
            }
            long jLongValue9 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).invoke(null, objArr78)).longValue();
            long j54 = 189505532;
            long j55 = (((long) 477) * j54) + (((long) (-475)) * jLongValue9);
            long j56 = ((j54 ^ j29) | jLongValue9) ^ j29;
            long j57 = jLongValue9 ^ j29;
            long j58 = ((j57 | j54) | j31) ^ j29;
            long j59 = j55 + (((long) (-476)) * (j56 | j58)) + (((long) 952) * j58) + (((long) 476) * (((j57 | j33) | j54) ^ j29)) + ((long) (-1036584137));
            int i304 = ((int) (j59 >> 32)) & (2142470402 + (((~(1058908499 | i240)) | 1798832385 | (~((-1058908500) | i))) * (-564)) + ((~((-335915091) | i)) * 1128) + (((~(1798832385 | i240)) | 722993409) * 564));
            int i305 = ((int) j59) & (((((~(766438169 | i)) | 2091302716) * 56) - 438289075) + ((766438169 | (~(2091302716 | i240))) * 56));
            int i306 = (i304 & i305) | (i304 ^ i305);
            int i307 = -i306;
            int i308 = ((i306 & i307) | (i306 ^ i307)) >> 31;
            int i309 = (~i308) & i;
            int i310 = i308 & (i ^ 100);
            int i311 = (i310 & i309) | (i309 ^ i310);
            int i312 = ((~i302) & i) | (i302 & i240);
            int i313 = -i312;
            int i314 = ((i312 & i313) | (i312 ^ i313)) >> 31;
            int i315 = i311 & (~i314);
            int i316 = i302 & i314;
            int i317 = (i316 & i315) | (i315 ^ i316);
            Object[] objArr80 = {new int[]{i}, strArr, new int[1], new int[]{i317}};
            int i318 = i ^ i317;
            int i319 = -i318;
            int i320 = (((i318 & i319) | (i318 ^ i319)) >> 31) & 16;
            int iNextInt = new Random().nextInt(2067207582);
            int i321 = ~iNextInt;
            int i322 = (-1145300513) + (((~((-284588928) | i321)) | (-524124389) | (~(284588927 | iNextInt))) * (-564)) + ((~(iNextInt | (-252280961))) * 1128) + (((~((-524124389) | i321)) | (-536869888)) * 564);
            int i323 = i320 * (-1529);
            int i324 = i322 * (-764);
            int i325 = (i323 & i324) + (i323 | i324);
            int i326 = ~i320;
            int i327 = ~i322;
            int i328 = (i326 ^ i327) | (i326 & i327);
            int i329 = ~((i328 & i240) | (i328 ^ i240));
            int i330 = (i326 ^ i322) | (i326 & i322);
            int i331 = ~((i330 & i) | (i330 ^ i));
            int i332 = (i329 & i331) | (i329 ^ i331);
            int i333 = ~i322;
            int i334 = i333 | i320;
            int i335 = ~((i334 & i) | (i334 ^ i));
            int i336 = i325 + (((i332 & i335) | (i332 ^ i335)) * 765);
            int i337 = ~(i327 | (~i320));
            int i338 = ~i;
            int i339 = (i336 - (~((i337 | (~((i326 ^ i338) | (i326 & i338)))) * 1530))) - 1;
            int i340 = ~((i326 & i) | (i326 ^ i));
            int i341 = i333 | i338;
            int i342 = ~((i320 & i341) | (i341 ^ i320));
            int i343 = i339 + (((i340 & i342) | (i340 ^ i342)) * 765);
            int i344 = -(-(i343 * (-963)));
            int i345 = ((i344 | (-964)) << 1) - (i344 ^ (-964));
            int i346 = -(-(i3 * 965));
            int i347 = (i345 ^ i346) + ((i345 & i346) << 1);
            int i348 = ~i343;
            int i349 = ~i3;
            int i350 = ~((i & i349) | (i349 ^ i));
            int i351 = ((i348 & i350) | (i348 ^ i350)) * (-964);
            int i352 = (i347 ^ i351) + ((i351 & i347) << 1);
            int i353 = ~((i349 ^ i240) | (i349 & i240));
            int i354 = ~i3;
            int i355 = ~((i354 & i343) | (i354 ^ i343));
            int i356 = i352 + (((i355 & i353) | (i353 ^ i355)) * (-964));
            int i357 = i356 << 13;
            int i358 = (i357 & (~i356)) | ((~i357) & i356);
            int i359 = i358 ^ (i358 >>> 17);
            int i360 = i359 << 5;
            ((int[]) objArr80[2])[0] = (i359 | i360) & (~(i359 & i360));
            return objArr80;
        }

        private static String $$g(byte b2, byte b3, int i) {
            int i2 = 3 - (i * 4);
            int i3 = 105 - b2;
            int i4 = b3 * 4;
            byte[] bArr = $$c;
            byte[] bArr2 = new byte[i4 + 1];
            int i5 = -1;
            if (bArr == null) {
                i3 += -i2;
                i2 = i2;
                i5 = -1;
            }
            while (true) {
                int i6 = i5 + 1;
                int i7 = i2 + 1;
                bArr2[i6] = (byte) i3;
                if (i6 == i4) {
                    return new String(bArr2, 0);
                }
                i3 += -bArr[i7];
                i2 = i7;
                i5 = i6;
            }
        }
    }

    @Override // defpackage.ImageAnalysisBlockingAnalyzer
    public final Map<String, Object> TuitionPaymentFragmentspecialinlinedviewModeldefault2(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return MapsKt.emptyMap();
    }

    @Override // defpackage.ImageAnalysisBlockingAnalyzer
    public final ExecutorService TuitionPaymentFragmentspecialinlinedviewModeldefault1(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return new TuitionPaymentFragmentspecialinlinedviewModeldefault2();
    }

    @Override // defpackage.ImageAnalysisBlockingAnalyzer
    public final ScheduledExecutorService TuitionPaymentFragmentbindingInflater1(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return new TuitionPaymentFragmentspecialinlinedviewModeldefault3();
    }

    @Override // defpackage.ImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0
    public final ExecutorService onTransact() {
        return new TuitionPaymentFragmentspecialinlinedviewModeldefault2();
    }

    @Override // defpackage.ImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0
    public final List<ImageAnalysisAbstractAnalyzerExternalSyntheticLambda1> b() {
        return CollectionsKt.emptyList();
    }

    @Override // defpackage.ImageAnalysisBlockingAnalyzer
    public final ImageAnalysisAbstractAnalyzerExternalSyntheticLambda1 b(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return null;
    }

    @Override // defpackage.ImageAnalysisBlockingAnalyzer
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(detach p0) {
        Intrinsics.checkNotNullParameter(p0, "");
    }

    @Override // defpackage.ImageAnalysisBlockingAnalyzer
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements ExecutorService {
        private static final byte[] $$c = {83, ByteCompanionObject.MIN_VALUE, -37, -48};
        private static final int $$f = 51;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {25, -93, -120, -48, -9, 20, -28, 27, 10, -2, 10, -2, -14, 24, 16, -6, 1, 24, -6, 10, -2, -16, 24, 17, 9, -11, 19, 6};
        private static final int $$e = 223;
        private static final byte[] $$a = {30, 17, -35, 104, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
        private static final int $$b = 100;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
        private static char[] TuitionPaymentFragmentbindingInflater1 = {59707, 59756, 59746, 59744, 59771, 59751, 59757, 59714, 59717, 59770, 59739, 59723, 59757, 59773, 59768, 59751, 59746, 59731, 59740, 59750, 59746, 59756, 59732, 59850, 59828, 59850, 59841, 59854, 59830, 59839, 59839, 59831, 59828, 59842, 59852, 59855, 59849, 59767, 59888, 59872, 59880, 59897, 59899, 59875, 59884, 59884, 59879, 59877, 59899, 59902, 59898, 59872, 59845, 59847, 59878, 59902, 59871, 59831, 59868, 59899, 59896, 59903, 59903, 59708, 59749, 59751, 59749, 59745, 59753, 59757, 59745, 59749, 59771, 59731, 59729, 59770, 59746, 59744, 59769, 59768, 59751, 59801, 59434, 59439, 59424, 59429, 59413, 59891, 59401, 59433, 59412, 59413, 59406, 59892, 59432, 59432, 59414, 59705, 59759, 59746, 59730, 59742, 59750, 59745, 59743, 59755, 59773, 59749, 59749, 59770, 59746, 59759, 59757};

        public static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
            int i7 = ~i2;
            int i8 = i5 | i7;
            int i9 = ~i6;
            int i10 = ~((~i5) | i7);
            int i11 = i2 + i6 + i4 + (1977613057 * i3) + (454551927 * i);
            int i12 = i11 * i11;
            int i13 = (1378041352 * i2) + 473956352 + (953991674 * i6) + (212024839 * i8) + (i9 * (-212024839)) + ((-212024839) * i10) + (1166016512 * i4) + ((-981467136) * i3) + ((-830472192) * i) + ((-499122176) * i12);
            int i14 = (i2 * (-1131120504)) + 246467939 + (i6 * (-1131119078)) + (i8 * (-713)) + (i9 * 713) + (i10 * 713) + (i4 * (-1131119791)) + (i3 * (-1039407535)) + (i * 1820920743) + (i12 * 1447034880);
            if (i13 + (i14 * i14 * 1170210816) != 1) {
                return b(objArr);
            }
            int i15 = 2 % 2;
            int i16 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 45;
            int i17 = i16 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i17;
            int i18 = i16 % 2;
            int i19 = i17 + 117;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i19 % 128;
            int i20 = i19 % 2;
            return true;
        }

        private static void a(short s, byte b, short s2, Object[] objArr) {
            int i = (b * 14) + 84;
            int i2 = s2 + 4;
            byte[] bArr = $$a;
            byte[] bArr2 = new byte[s + 1];
            int i3 = -1;
            if (bArr == null) {
                i = (i + (-s)) - 10;
            }
            while (true) {
                i3++;
                bArr2[i3] = (byte) i;
                i2++;
                if (i3 == s) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                i = (i + (-bArr[i2])) - 10;
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x002a  */
        /* JADX WARN: Code duplicated, block: B:8:0x0022  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002e). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void d(int r6, byte r7, byte r8, java.lang.Object[] r9) {
            /*
                byte[] r0 = getCaptureMode.TuitionPaymentFragmentspecialinlinedviewModeldefault2.$$d
                int r8 = r8 * 24
                int r8 = r8 + 4
                int r6 = r6 * 24
                int r1 = 25 - r6
                int r7 = r7 * 17
                int r7 = r7 + 98
                byte[] r1 = new byte[r1]
                int r6 = 24 - r6
                r2 = 0
                if (r0 != 0) goto L19
                r4 = r6
                r7 = r8
                r3 = r2
                goto L2e
            L19:
                r3 = r2
                r5 = r8
                r8 = r7
                r7 = r5
            L1d:
                byte r4 = (byte) r8
                r1[r3] = r4
                if (r3 != r6) goto L2a
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L2a:
                r4 = r0[r7]
                int r3 = r3 + 1
            L2e:
                int r8 = r8 + r4
                int r8 = r8 + (-5)
                int r7 = r7 + 1
                goto L1d
            */
            throw new UnsupportedOperationException("Method not decompiled: getCaptureMode.TuitionPaymentFragmentspecialinlinedviewModeldefault2.d(int, byte, byte, java.lang.Object[]):void");
        }

        @Override // java.util.concurrent.ExecutorService
        public final List<Runnable> shutdownNow() {
            int i = 2 % 2;
            ArrayList arrayList = new ArrayList();
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 5;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            int i3 = i2 % 2;
            return arrayList;
        }

        @Override // java.util.concurrent.ExecutorService
        public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
            int i = 2 % 2;
            ArrayList arrayList = new ArrayList();
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 117;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            if (i2 % 2 == 0) {
                return arrayList;
            }
            throw null;
        }

        private static void c(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
            int i;
            byte b;
            char[] cArr;
            char c;
            int i2 = 2;
            int i3 = 2 % 2;
            setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
            int i4 = 0;
            int i5 = iArr[0];
            int i6 = 1;
            int i7 = iArr[1];
            int i8 = iArr[2];
            int i9 = iArr[3];
            char[] cArr2 = TuitionPaymentFragmentbindingInflater1;
            char c2 = '0';
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i10 = 0;
                while (i10 < length) {
                    int i11 = $11 + 105;
                    $10 = i11 % 128;
                    if (i11 % i2 != 0) {
                        try {
                            Object[] objArr2 = new Object[i6];
                            objArr2[i4] = Integer.valueOf(cArr2[i10]);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                char cIndexOf = (char) (TextUtils.indexOf("", c2, i4) + i6);
                                int iKeyCodeFromString = 1270 - KeyEvent.keyCodeFromString("");
                                int iLastIndexOf = TextUtils.lastIndexOf("", c2, i4, i4) + 19;
                                byte b2 = (byte) i4;
                                byte b3 = b2;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, iKeyCodeFromString, iLastIndexOf, 407021364, false, $$g(b2, b3, (byte) (b3 + 5)), new Class[]{Integer.TYPE});
                            }
                            cArr3[i10] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                            i10 >>>= 1;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        Object[] objArr3 = {Integer.valueOf(cArr2[i10])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 1271 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), Color.argb(0, 0, 0, 0) + 18, 407021364, false, $$g(b4, b5, (byte) (b5 + 5)), new Class[]{Integer.TYPE});
                        }
                        cArr3[i10] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                        i10++;
                    }
                    i2 = 2;
                    i4 = 0;
                    i6 = 1;
                    c2 = '0';
                }
                cArr2 = cArr3;
            }
            char[] cArr4 = new char[i7];
            System.arraycopy(cArr2, i5, cArr4, 0, i7);
            if (bArr != null) {
                int i12 = $11 + 91;
                $10 = i12 % 128;
                if (i12 % 2 != 0) {
                    cArr = new char[i7];
                    b = 1;
                    setvideostabilizationmode.b = 1;
                    c = 1;
                } else {
                    b = 1;
                    cArr = new char[i7];
                    setvideostabilizationmode.b = 0;
                    c = 0;
                }
                while (setvideostabilizationmode.b < i7) {
                    if (bArr[setvideostabilizationmode.b] == b) {
                        int i13 = $11 + 5;
                        $10 = i13 % 128;
                        int i14 = i13 % 2;
                        int i15 = setvideostabilizationmode.b;
                        Object[] objArr4 = {Integer.valueOf(cArr4[setvideostabilizationmode.b]), Integer.valueOf(c)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = b6;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 3224 - ((byte) KeyEvent.getModifierMetaStateMask()), 14 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 2133916302, false, $$g(b6, b7, (byte) (b7 | 6)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr[i15] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                    } else {
                        int i16 = setvideostabilizationmode.b;
                        Object[] objArr5 = {Integer.valueOf(cArr4[setvideostabilizationmode.b]), Integer.valueOf(c)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b8 = (byte) 0;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (29944 - Color.alpha(0)), 1754 - Process.getGidForName(""), View.MeasureSpec.makeMeasureSpec(0, 0) + 23, 387247676, false, $$g(b8, b8, (byte) $$c.length), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr[i16] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                    }
                    c = cArr[setvideostabilizationmode.b];
                    Object[] objArr6 = {setvideostabilizationmode, setvideostabilizationmode};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        byte b9 = (byte) 0;
                        byte b10 = b9;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (41241 - View.resolveSizeAndState(0, 0, 0)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1704, 20 - TextUtils.lastIndexOf("", '0', 0, 0), -1434471773, false, $$g(b9, b10, b10), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
                    b = 1;
                }
                cArr4 = cArr;
            }
            if (i9 > 0) {
                char[] cArr5 = new char[i7];
                i = 0;
                System.arraycopy(cArr4, 0, cArr5, 0, i7);
                int i17 = i7 - i9;
                System.arraycopy(cArr5, 0, cArr4, i17, i9);
                System.arraycopy(cArr5, i9, cArr4, 0, i17);
            } else {
                i = 0;
            }
            if (z) {
                char[] cArr6 = new char[i7];
                while (true) {
                    setvideostabilizationmode.b = i;
                    if (setvideostabilizationmode.b >= i7) {
                        break;
                    }
                    cArr6[setvideostabilizationmode.b] = cArr4[(i7 - setvideostabilizationmode.b) - 1];
                    i = setvideostabilizationmode.b + 1;
                }
                cArr4 = cArr6;
            }
            if (i8 > 0) {
                int i18 = $10 + 23;
                $11 = i18 % 128;
                int i19 = i18 % 2;
                int i20 = 0;
                while (true) {
                    setvideostabilizationmode.b = i20;
                    if (setvideostabilizationmode.b >= i7) {
                        break;
                    }
                    cArr4[setvideostabilizationmode.b] = (char) (cArr4[setvideostabilizationmode.b] - iArr[2]);
                    i20 = setvideostabilizationmode.b + 1;
                }
            }
            objArr[0] = new String(cArr4);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0200  */
        @Override // java.util.concurrent.ExecutorService
        public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws Throwable {
            Object[] objArr;
            int i = 2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char touchSlop = (char) (31533 - (ViewConfiguration.getTouchSlop() >> 8));
                int trimmedLength = 921 - TextUtils.getTrimmedLength("");
                int i2 = 28 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                byte[] bArr = $$a;
                Object[] objArr2 = new Object[1];
                a(bArr[80], bArr[7], bArr[37], objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(touchSlop, trimmedLength, i2, -1048449946, false, (String) objArr2[0], null);
            }
            long j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            c(new int[]{0, 22, 0, 0}, false, new byte[]{1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c(new int[]{22, 15, 89, 0}, false, new byte[]{0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0}, objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cArgb = (char) (Color.argb(0, 0, 0, 0) + 31533);
                int iLastIndexOf = 920 - TextUtils.lastIndexOf("", '0', 0, 0);
                int mirror = 'L' - AndroidCharacter.getMirror('0');
                byte[] bArr2 = $$a;
                Object[] objArr5 = new Object[1];
                a((byte) 52, bArr2[80], bArr2[37], objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cArgb, iLastIndexOf, mirror, -778300370, false, (String) objArr5[0], null);
            }
            if (j2 == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 5;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
                int i4 = i3 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char edgeSlop = (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 31533);
                    int iGreen = 921 - Color.green(0);
                    int scrollDefaultDelay = 28 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                    byte[] bArr3 = $$a;
                    byte b = (byte) (bArr3[17] + 1);
                    byte b2 = bArr3[80];
                    Object[] objArr6 = new Object[1];
                    a(b, b2, (byte) (b2 | 51), objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(edgeSlop, iGreen, scrollDefaultDelay, -1142834547, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
                int iMyTid = Process.myTid();
                int i5 = ((1702492072 + (((~(iMyTid | 294059358)) | (-1505230208)) * 305)) + (((~((~iMyTid) | 294059358)) | (-1480020286)) * 305)) - 922975843;
                int i6 = (i5 << 13) ^ i5;
                int i7 = i6 ^ (i6 >>> 17);
                ((int[]) objArr[0])[0] = i7 ^ (i7 << 5);
            } else {
                Object[] objArr8 = new Object[1];
                c(new int[]{37, 26, 133, 8}, false, new byte[]{1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1}, objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                c(new int[]{63, 18, 0, 0}, true, new byte[]{0, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0}, objArr9);
                Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                if (applicationContext != null) {
                    if (applicationContext instanceof ContextWrapper) {
                        int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 95;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i8 % 128;
                        int i9 = i8 % 2;
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
                c(new int[]{81, 16, 184, 0}, true, new byte[]{1, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1}, objArr10);
                Class<?> cls3 = Class.forName((String) objArr10[0]);
                Object[] objArr11 = new Object[1];
                c(new int[]{97, 16, 0, 0}, true, new byte[]{1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1}, objArr11);
                try {
                    Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, -922975843};
                    byte[] bArr4 = $$d;
                    byte b3 = bArr4[16];
                    byte b4 = (byte) (b3 - 1);
                    byte b5 = b3;
                    Object[] objArr13 = new Object[1];
                    d(b4, b5, (byte) (b5 - 1), objArr13);
                    Class<?> cls4 = Class.forName((String) objArr13[0]);
                    byte b6 = bArr4[16];
                    byte b7 = b6;
                    Object[] objArr14 = new Object[1];
                    d(b7, (byte) (b7 - 1), b6, objArr14);
                    objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cMakeMeasureSpec = (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 31533);
                        int iResolveSize = 921 - View.resolveSize(0, 0);
                        int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 28;
                        byte[] bArr5 = $$a;
                        byte b8 = (byte) (bArr5[17] + 1);
                        byte b9 = bArr5[80];
                        Object[] objArr15 = new Object[1];
                        a(b8, b9, (byte) (b9 | 51), objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cMakeMeasureSpec, iResolveSize, windowTouchSlop, -1142834547, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr16 = new Object[1];
                        c(new int[]{0, 22, 0, 0}, false, new byte[]{1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, objArr16);
                        Class<?> cls5 = Class.forName((String) objArr16[0]);
                        Object[] objArr17 = new Object[1];
                        c(new int[]{22, 15, 89, 0}, false, new byte[]{0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0}, objArr17);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cIndexOf = (char) (TextUtils.indexOf("", "") + 31533);
                            int i10 = 922 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                            int maximumDrawingCacheSize = 28 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                            byte[] bArr6 = $$a;
                            Object[] objArr18 = new Object[1];
                            a((byte) 52, bArr6[80], bArr6[37], objArr18);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf, i10, maximumDrawingCacheSize, -778300370, false, (String) objArr18[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cKeyCodeFromString = (char) (31533 - KeyEvent.keyCodeFromString(""));
                            int minimumFlingVelocity = 921 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                            int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 28;
                            byte[] bArr7 = $$a;
                            Object[] objArr19 = new Object[1];
                            a(bArr7[80], bArr7[7], bArr7[37], objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cKeyCodeFromString, minimumFlingVelocity, maximumFlingVelocity, -1048449946, false, (String) objArr19[0], null);
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
            int i11 = ((int[]) objArr[1])[0];
            int i12 = ((int[]) objArr[3])[0];
            if (i12 != i11) {
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) objArr[4];
                if (strArr != null) {
                    for (String str : strArr) {
                        arrayList.add(str);
                    }
                }
                throw new RuntimeException(String.valueOf(i12));
            }
            int i13 = ((int[]) objArr[0])[0];
            Object[] objArr20 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i14 = ~iIdentityHashCode;
            int i15 = i13 + (((((~((-1319704784) | i14)) | (~((-454374861) | iIdentityHashCode))) | (~(i14 | 454374860))) * 959) - 272603610) + (((~(iIdentityHashCode | 454374860)) | (~(i14 | (-454374861))) | (~((-1319704784) | iIdentityHashCode))) * 959);
            int i16 = (i15 << 13) ^ i15;
            int i17 = i16 ^ (i16 >>> 17);
            ((int[]) objArr20[0])[0] = i17 ^ (i17 << 5);
            ArrayList arrayList2 = new ArrayList();
            int i18 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 119;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i18 % 128;
            int i19 = i18 % 2;
            return arrayList2;
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean awaitTermination(long j, TimeUnit timeUnit) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i3 = i2 + 55;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 19;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 125;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 11 / 0;
            }
        }

        @Override // java.util.concurrent.ExecutorService
        public final <T> T invokeAny(Collection<? extends Callable<T>> collection) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i3 = i2 + 5;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 85;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
            int i6 = i5 % 2;
            return null;
        }

        @Override // java.util.concurrent.ExecutorService
        public final <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 75;
            int i3 = i2 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 79;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
            int i6 = i5 % 2;
            return null;
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isShutdown() {
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = setBackpressureStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = setBackpressureStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = setBackpressureStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            return ((Boolean) TuitionPaymentFragmentbindingInflater1(setBackpressureStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), new Object[]{this}, -1245626488, iTuitionPaymentFragmentspecialinlinedviewModeldefault4, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, 1245626488)).booleanValue();
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isTerminated() {
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = setBackpressureStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = setBackpressureStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = setBackpressureStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            return ((Boolean) TuitionPaymentFragmentbindingInflater1(setBackpressureStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), new Object[]{this}, -132314139, iTuitionPaymentFragmentspecialinlinedviewModeldefault4, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, 132314140)).booleanValue();
        }

        @Override // java.util.concurrent.ExecutorService
        public final void shutdown() {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 95;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            if (i2 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // java.util.concurrent.ExecutorService
        public final Future<?> submit(Runnable runnable) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 85;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            if (i2 % 2 != 0) {
                return null;
            }
            throw null;
        }

        @Override // java.util.concurrent.ExecutorService
        public final <T> Future<T> submit(Runnable runnable, T t) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 29;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            if (i2 % 2 == 0) {
                return null;
            }
            throw null;
        }

        @Override // java.util.concurrent.ExecutorService
        public final <T> Future<T> submit(Callable<T> callable) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 45;
            int i3 = i2 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
            if (i2 % 2 == 0) {
                int i4 = 60 / 0;
            }
            int i5 = i3 + 117;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
            Object obj = null;
            if (i5 % 2 == 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }

        private static /* synthetic */ Object b(Object[] objArr) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int i3 = i2 + 85;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 89;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0023  */
        /* JADX WARN: Code duplicated, block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$g(short r7, byte r8, int r9) {
            /*
                int r8 = r8 * 2
                int r8 = r8 + 1
                byte[] r0 = getCaptureMode.TuitionPaymentFragmentspecialinlinedviewModeldefault2.$$c
                int r9 = 105 - r9
                int r7 = r7 * 2
                int r7 = 3 - r7
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L15
                r3 = r9
                r5 = r2
                r9 = r7
                goto L2a
            L15:
                r3 = r2
            L16:
                byte r4 = (byte) r9
                int r5 = r3 + 1
                r1[r3] = r4
                if (r5 != r8) goto L23
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                return r7
            L23:
                int r7 = r7 + 1
                r3 = r0[r7]
                r6 = r9
                r9 = r7
                r7 = r6
            L2a:
                int r3 = -r3
                int r7 = r7 + r3
                r3 = r5
                r6 = r9
                r9 = r7
                r7 = r6
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: getCaptureMode.TuitionPaymentFragmentspecialinlinedviewModeldefault2.$$g(short, byte, int):java.lang.String");
        }
    }

    @Override // defpackage.ImageAnalysisBlockingAnalyzer
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(String p0, setRelativeRotation p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
    }

    @Override // defpackage.ImageAnalysisBlockingAnalyzer
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(String p0, Function1<? super Map<String, Object>, Unit> p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
    }

    @Override // defpackage.ImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(byte[] p0) {
        Intrinsics.checkNotNullParameter(p0, "");
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements ScheduledExecutorService {
        @Override // java.util.concurrent.ExecutorService
        public final boolean awaitTermination(long j, TimeUnit timeUnit) {
            return true;
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
        }

        @Override // java.util.concurrent.ExecutorService
        public final <T> T invokeAny(Collection<? extends Callable<T>> collection) {
            return null;
        }

        @Override // java.util.concurrent.ExecutorService
        public final <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) {
            return null;
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isShutdown() {
            return true;
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isTerminated() {
            return true;
        }

        @Override // java.util.concurrent.ExecutorService
        public final void shutdown() {
        }

        @Override // java.util.concurrent.ExecutorService
        public final Future<?> submit(Runnable runnable) {
            return null;
        }

        @Override // java.util.concurrent.ExecutorService
        public final <T> Future<T> submit(Runnable runnable, T t) {
            return null;
        }

        @Override // java.util.concurrent.ExecutorService
        public final <T> Future<T> submit(Callable<T> callable) {
            return null;
        }

        @Override // java.util.concurrent.ExecutorService
        public final List<Runnable> shutdownNow() {
            return new ArrayList();
        }

        @Override // java.util.concurrent.ExecutorService
        public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
            return new ArrayList();
        }

        @Override // java.util.concurrent.ExecutorService
        public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) {
            return new ArrayList();
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public final <V> ScheduledFuture<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
            return new TuitionPaymentFragmentbindingInflater1();
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public final ScheduledFuture<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
            return new TuitionPaymentFragmentbindingInflater1();
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public final ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            return new TuitionPaymentFragmentbindingInflater1();
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public final ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            return new TuitionPaymentFragmentbindingInflater1();
        }
    }
}
