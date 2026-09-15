package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
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
import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.metrics.MethodCallSamplingRate;
import com.datadog.android.rum.DdRumContentProvider;
import com.datadog.android.rum.internal.anr.ANRException;
import com.datadog.android.rum.internal.domain.scope.RumViewScope;
import com.datadog.android.rum.internal.metric.SessionEndedMetric;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u0000 !2\u00020\u0001:\u0001!Bi\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u0018\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u001a2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0017¢\u0006\u0004\b\u0018\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0016\u0010!\u001a\u00020\u00078\u0000@\u0000X\u0080\f¢\u0006\u0006\n\u0004\b\u001e\u0010 R\u0014\u0010\u0018\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010 R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00010#8\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020\u000e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010+\u001a\u00020\f8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010-\u001a\u00020\u000e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b,\u0010'R\u0018\u0010$\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u00020\u000e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b1\u0010'R\u0014\u0010\"\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010&\u001a\u00020\u00138\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010)\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u00101\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010,\u001a\u00020\u00078\u0000@\u0000X\u0081\f¢\u0006\u0006\n\u0004\b(\u0010 R\u0014\u00103\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b;\u0010 R\u0016\u0010/\u001a\u0004\u0018\u00010\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b<\u0010="}, d2 = {"LsendTransformationInfoIfReady;", "LPreview;", "p0", "LImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0;", "p1", "LPreviewExternalSyntheticLambda3;", "p2", "", "p3", "p4", "LshouldMirror;", "p5", "LsetJpegQuality;", "p6", "LSafeCloseImageReaderProxy;", "p7", "p8", "p9", "p10", "", "p11", "<init>", "(LPreview;LImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0;LPreviewExternalSyntheticLambda3;ZZLshouldMirror;LsetJpegQuality;LSafeCloseImageReaderProxy;LSafeCloseImageReaderProxy;LSafeCloseImageReaderProxy;ZF)V", "LMetadataImageReaderExternalSyntheticLambda0;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()LMetadataImageReaderExternalSyntheticLambda0;", "LgetPreviewCapabilities;", "LImageAnalysisNonBlockingAnalyzer1;", "", "(LgetPreviewCapabilities;LImageAnalysisNonBlockingAnalyzer1;)LPreview;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "()Z", "Z", "b", "a", "", "d", "Ljava/util/List;", "asInterface", "LSafeCloseImageReaderProxy;", "TuitionPaymentFragmentbindingInflater1", "cancelAll", "LsetJpegQuality;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "notify", "g", "Llambdanew0androidxcameracoreMetadataImageReader;", "INotificationSideChannel", "Llambdanew0androidxcameracoreMetadataImageReader;", "cancel", "asBinder", "onTransact", "LPreview;", "getInterfaceDescriptor", "F", "INotificationSideChannelDefault", "LImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0;", "INotificationSideChannelStubProxy", "LPreviewExternalSyntheticLambda3;", "RemoteActionCompatParcelizer", "INotificationSideChannelStub", "LshouldMirror;"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class sendTransformationInfoIfReady implements Preview {
    private static char IconCompatParcelizer;
    private static final long TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static final Class<?>[] asBinder;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static char connect;
    private static final Class<?>[] g;
    private static int getExtras;
    private static char read;
    private static char write;

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
    private lambdanew0androidxcameracoreMetadataImageReader d;

    /* JADX INFO: renamed from: INotificationSideChannelDefault, reason: from kotlin metadata */
    private final ImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0 cancelAll;

    /* JADX INFO: renamed from: INotificationSideChannelStub, reason: from kotlin metadata */
    private final shouldMirror INotificationSideChannel;

    /* JADX INFO: renamed from: INotificationSideChannelStubProxy, reason: from kotlin metadata */
    private final PreviewExternalSyntheticLambda3 cancel;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final boolean onTransact;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public boolean notify;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public boolean b;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final SafeCloseImageReaderProxy TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    private final SafeCloseImageReaderProxy asBinder;

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    private final setJpegQuality TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List<Preview> TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: getInterfaceDescriptor, reason: from kotlin metadata */
    private final float asInterface;

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    private final SafeCloseImageReaderProxy g;

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    private final Preview a;
    private static final byte[] $$c = {118, 35, -100, -35};
    private static final int $$f = 242;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {6, -86, -9, -124, 9, -62, 71, -10, -1, 5, 20, -8, 16, -14, 22, -71, 62, 8, 9, -12, 16, -1, -10, 14, -59, 68, 4, -8, 16, -14, 22, -2, 6, 4, -66, 68, -10, 20, -11, 16, 7, -18, 4, 13, -4, -52, 36, 22, 20, -11, 16, 7, -18, 4, 13, -4, -31, 33, 5, 8, 0, -62, 34, 33, 5, 8, 0, -30, 40, 13, 0, 2, 7, -15, 4, 13, -4, 36, -9, 14, -8, 9, 2, -27, 20, 27, -9, -5, 12, 9, -43, 47, -14, 9, 9, -5, 12, 9, -15, 10, 8, -7, 8, 8, -4, -27, 40, -5, 9, -8, 22, -12, 16, -62};
    private static final int $$e = 239;
    private static final byte[] $$a = {5, 11, -122, -94, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54};
    private static final int $$b = 113;
    private static int getRoot = 0;
    private static int disconnect = 1;
    private static int MediaBrowserCompat = 0;

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(int r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 15
            int r7 = r7 + 38
            int r6 = 92 - r6
            byte[] r0 = defpackage.sendTransformationInfoIfReady.$$a
            int r8 = r8 * 4
            int r8 = 84 - r8
            byte[] r1 = new byte[r7]
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
            int r3 = r3 + 1
            int r6 = r6 + 1
            if (r3 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            r4 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r6 = -r6
            int r3 = r3 + r6
            int r6 = r3 + (-11)
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sendTransformationInfoIfReady.e(int, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(short r5, short r6, byte r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = defpackage.sendTransformationInfoIfReady.$$d
            int r7 = r7 * 21
            int r7 = r7 + 84
            int r6 = r6 * 36
            int r1 = 74 - r6
            int r5 = r5 * 73
            int r5 = r5 + 4
            byte[] r1 = new byte[r1]
            int r6 = 73 - r6
            r2 = 0
            if (r0 != 0) goto L18
            r4 = r5
            r3 = r2
            goto L2a
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L26:
            r4 = r0[r5]
            int r3 = r3 + 1
        L2a:
            int r5 = r5 + 1
            int r7 = r7 + r4
            int r7 = r7 + (-3)
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sendTransformationInfoIfReady.f(short, short, byte, java.lang.Object[]):void");
    }

    public sendTransformationInfoIfReady(Preview preview, ImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0 imageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0, PreviewExternalSyntheticLambda3 previewExternalSyntheticLambda3, boolean z, boolean z2, shouldMirror shouldmirror, setJpegQuality setjpegquality, SafeCloseImageReaderProxy safeCloseImageReaderProxy, SafeCloseImageReaderProxy safeCloseImageReaderProxy2, SafeCloseImageReaderProxy safeCloseImageReaderProxy3, boolean z3, float f) {
        Intrinsics.checkNotNullParameter(preview, "");
        Intrinsics.checkNotNullParameter(imageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(previewExternalSyntheticLambda3, "");
        Intrinsics.checkNotNullParameter(setjpegquality, "");
        Intrinsics.checkNotNullParameter(safeCloseImageReaderProxy, "");
        Intrinsics.checkNotNullParameter(safeCloseImageReaderProxy2, "");
        Intrinsics.checkNotNullParameter(safeCloseImageReaderProxy3, "");
        this.a = preview;
        this.cancelAll = imageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0;
        this.cancel = previewExternalSyntheticLambda3;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = z;
        this.onTransact = z2;
        this.INotificationSideChannel = shouldmirror;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = setjpegquality;
        this.TuitionPaymentFragmentbindingInflater1 = safeCloseImageReaderProxy;
        this.asBinder = safeCloseImageReaderProxy2;
        this.g = safeCloseImageReaderProxy3;
        this.b = z3;
        this.asInterface = f;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new ArrayList();
    }

    public static final /* synthetic */ Class[] TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = getRoot + 25;
        int i3 = i2 % 128;
        disconnect = i3;
        int i4 = i2 % 2;
        Class<?>[] clsArr = g;
        int i5 = i3 + 81;
        getRoot = i5 % 128;
        if (i5 % 2 == 0) {
            return clsArr;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:103:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:107:0x041f A[LOOP:3: B:106:0x041d->B:107:0x041f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:109:0x0433 A[LOOP:2: B:105:0x041c->B:109:0x0433, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:111:0x043c A[LOOP:1: B:99:0x03d5->B:111:0x043c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:115:0x04ad A[Catch: all -> 0x0611, TryCatch #0 {all -> 0x0611, blocks: (B:113:0x0499, B:115:0x04ad, B:116:0x04d8, B:118:0x050b, B:119:0x057c), top: B:167:0x0499 }] */
    /* JADX WARN: Code duplicated, block: B:118:0x050b A[Catch: all -> 0x0611, TryCatch #0 {all -> 0x0611, blocks: (B:113:0x0499, B:115:0x04ad, B:116:0x04d8, B:118:0x050b, B:119:0x057c), top: B:167:0x0499 }] */
    /* JADX WARN: Code duplicated, block: B:122:0x0594  */
    /* JADX WARN: Code duplicated, block: B:124:0x059f  */
    /* JADX WARN: Code duplicated, block: B:127:0x05ac  */
    /* JADX WARN: Code duplicated, block: B:130:0x05b0 A[LOOP:4: B:128:0x05ad->B:130:0x05b0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:138:0x05cd  */
    /* JADX WARN: Code duplicated, block: B:141:0x05d4  */
    /* JADX WARN: Code duplicated, block: B:142:0x05d7  */
    /* JADX WARN: Code duplicated, block: B:144:0x05db  */
    /* JADX WARN: Code duplicated, block: B:145:0x05de  */
    /* JADX WARN: Code duplicated, block: B:147:0x05e2  */
    /* JADX WARN: Code duplicated, block: B:148:0x05e5  */
    /* JADX WARN: Code duplicated, block: B:150:0x05e8  */
    /* JADX WARN: Code duplicated, block: B:151:0x05f8  */
    /* JADX WARN: Code duplicated, block: B:153:0x05fb  */
    /* JADX WARN: Code duplicated, block: B:174:0x044e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:175:0x05c4 A[EDGE_INSN: B:175:0x05c4->B:133:0x05c4 BREAK  A[LOOP:1: B:99:0x03d5->B:111:0x043c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:176:0x043a A[EDGE_INSN: B:176:0x043a->B:110:0x043a BREAK  A[LOOP:2: B:105:0x041c->B:109:0x0433], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x0182  */
    /* JADX WARN: Code duplicated, block: B:51:0x0188  */
    /* JADX WARN: Code duplicated, block: B:70:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:72:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:73:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:76:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:77:0x0228  */
    /* JADX WARN: Code duplicated, block: B:79:0x022c  */
    /* JADX WARN: Code duplicated, block: B:81:0x0238  */
    /* JADX WARN: Code duplicated, block: B:83:0x0244  */
    /* JADX WARN: Code duplicated, block: B:84:0x025b  */
    /* JADX WARN: Code duplicated, block: B:86:0x025f  */
    /* JADX WARN: Code duplicated, block: B:88:0x0268  */
    /* JADX WARN: Code duplicated, block: B:90:0x027e  */
    /* JADX WARN: Code duplicated, block: B:93:0x02e8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:97:0x0319  */
    @Override // defpackage.Preview
    public final Preview TuitionPaymentFragmentspecialinlinedviewModeldefault3(getPreviewCapabilities p0, ImageAnalysisNonBlockingAnalyzer1<Object> p1) throws Throwable {
        boolean z;
        boolean zContains;
        boolean zContains2;
        SessionEndedMetric.MissedEventType.Companion bVar;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i;
        int i2;
        long j;
        int i3;
        long j2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        Object[] objArr;
        ArrayList arrayList;
        String[] strArr;
        int i4;
        int i5;
        SessionEndedMetric.MissedEventType missedEventType;
        Unit unit;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6;
        int i6;
        int i7;
        long j3;
        int i8;
        onAppEdgeInvalidated onappedgeinvalidated;
        int i9 = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        if ((p0 instanceof getPreviewCapabilities.a) && !this.b) {
            int i10 = getRoot + 27;
            disconnect = i10 % 128;
            int i11 = i10 % 2;
            if (!this.notify) {
                getPreviewCapabilities.a aVar = (getPreviewCapabilities.a) p0;
                sendTransformationInfoIfReady sendtransformationinfoifready = this;
                RumViewScope rumViewScope = new RumViewScope(sendtransformationinfoifready, this.cancelAll, this.cancel, new onAppEdgeInvalidated("com.datadog.application-launch.view", "com/datadog/application-launch/view", "ApplicationLaunch"), aVar.TuitionPaymentFragmentbindingInflater1, MapsKt.emptyMap(), this.INotificationSideChannel, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, new shouldCompleteWithoutFailure(), new shouldCompleteWithoutFailure(), new shouldCompleteWithoutFailure(), null, RumViewScope.RumViewType.APPLICATION_LAUNCH, this.onTransact, this.asInterface, 2048, null);
                this.b = true;
                rumViewScope.TuitionPaymentFragmentspecialinlinedviewModeldefault3(aVar, p1);
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(rumViewScope);
                return sendtransformationinfoifready;
            }
        }
        Iterator<Preview> it = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.iterator();
        while (true) {
            String str = null;
            if (!it.hasNext()) {
                break;
            }
            int i12 = getRoot + 87;
            disconnect = i12 % 128;
            int i13 = i12 % 2;
            Preview next = it.next();
            if ((p0 instanceof getPreviewCapabilities.getItem) && next.TuitionPaymentFragmentspecialinlinedviewModeldefault1()) {
                RumViewScope rumViewScope2 = next instanceof RumViewScope ? (RumViewScope) next : null;
                if (rumViewScope2 != null && (onappedgeinvalidated = rumViewScope2.RemoteActionCompatParcelizer) != null) {
                    int i14 = disconnect + 111;
                    getRoot = i14 % 128;
                    int i15 = i14 % 2;
                    str = onappedgeinvalidated.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                }
                if (Intrinsics.areEqual(str, ((getPreviewCapabilities.getItem) p0).TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
                    this.d = p0.getTuitionPaymentFragmentspecialinlinedviewModeldefault2();
                }
            }
            if (next.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0, p1) == null) {
                it.remove();
            }
        }
        if ((p0 instanceof getPreviewCapabilities.read) && !this.notify) {
            getPreviewCapabilities.read readVar = (getPreviewCapabilities.read) p0;
            RumViewScope.Companion companion = RumViewScope.INSTANCE;
            RumViewScope rumViewScopeTuitionPaymentFragmentspecialinlinedviewModeldefault2 = RumViewScope.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, this.cancel, this.cancelAll, readVar, this.INotificationSideChannel, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.TuitionPaymentFragmentbindingInflater1, this.asBinder, this.g, this.onTransact, this.asInterface);
            this.b = true;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(rumViewScopeTuitionPaymentFragmentspecialinlinedviewModeldefault2);
            rumViewScopeTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new getPreviewCapabilities.cancelAll(null, 1, null), p1);
            shouldMirror shouldmirror = this.INotificationSideChannel;
            if (shouldmirror != null) {
                shouldmirror.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new lambdasendSurfaceRequest2(readVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2, readVar.b, true));
            }
            lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader = this.d;
            if (lambdanew0androidxcameracoremetadataimagereader != null) {
                final long j4 = p0.getTuitionPaymentFragmentspecialinlinedviewModeldefault2().TuitionPaymentFragmentspecialinlinedviewModeldefault2 - lambdanew0androidxcameracoremetadataimagereader.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (1 <= j4) {
                    int i16 = disconnect + 17;
                    getRoot = i16 % 128;
                    if (i16 % 2 != 0) {
                        throw null;
                    }
                    if (j4 < TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        this.cancelAll.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Function0<String>() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewManagerScope$handleEvent$1$1
                            @Override // kotlin.jvm.functions.Function0
                            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                            public final String invoke() {
                                String str2 = String.format(Locale.US, "[Mobile Metric] Gap between views", Arrays.copyOf(new Object[]{Long.valueOf(j4)}, 1));
                                Intrinsics.checkNotNullExpressionValue(str2, "");
                                return str2;
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }
                        }, MapsKt.mapOf(TuplesKt.to("view_gap", Long.valueOf(j4))), MethodCallSamplingRate.MEDIUM.getRate());
                    } else if (j4 < 0) {
                        this.cancelAll.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Function0<String>() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewManagerScope$handleEvent$1$2
                            @Override // kotlin.jvm.functions.Function0
                            /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
                            public final String invoke() {
                                String str2 = String.format(Locale.US, "[Mobile Metric] Negative gap between views", Arrays.copyOf(new Object[]{Long.valueOf(j4)}, 1));
                                Intrinsics.checkNotNullExpressionValue(str2, "");
                                return str2;
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }
                        }, MapsKt.mapOf(TuplesKt.to("view_gap", Long.valueOf(j4))), MethodCallSamplingRate.MEDIUM.getRate());
                    }
                } else if (j4 < 0) {
                    this.cancelAll.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Function0<String>() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewManagerScope$handleEvent$1$2
                        @Override // kotlin.jvm.functions.Function0
                        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
                        public final String invoke() {
                            String str2 = String.format(Locale.US, "[Mobile Metric] Negative gap between views", Arrays.copyOf(new Object[]{Long.valueOf(j4)}, 1));
                            Intrinsics.checkNotNullExpressionValue(str2, "");
                            return str2;
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }
                    }, MapsKt.mapOf(TuplesKt.to("view_gap", Long.valueOf(j4))), MethodCallSamplingRate.MEDIUM.getRate());
                }
            }
            this.d = null;
        } else if (p0 instanceof getPreviewCapabilities.getRoot) {
            this.notify = true;
        } else {
            List<Preview> list = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if ((list instanceof Collection) && list.isEmpty()) {
                if (DdRumContentProvider.INSTANCE.getProcessImportance$dd_sdk_android_rum_release() == 100) {
                    z = true;
                } else {
                    z = false;
                }
                if (p0 instanceof getPreviewCapabilities.asInterface) {
                    InternalLogger internalLoggerTuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.cancelAll.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                    internalLoggerTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.WARN, InternalLogger.Target.USER, new Function0<String>() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewManagerScope$handleOrphanEvent$1
                        @Override // kotlin.jvm.functions.Function0
                        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                        public final String invoke() {
                            return "A RUM event was detected, but no view is active. To track views automatically, try calling the RumConfiguration.Builder.useViewTrackingStrategy() method.\nYou can also track views manually using the RumMonitor.startView() and RumMonitor.stopView() methods.";
                        }
                    }, null, false, null);
                    internalLoggerTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new LayoutSettings.b.TuitionPaymentFragmentbindingInflater1(((getPreviewCapabilities.asInterface) p0).TuitionPaymentFragmentbindingInflater1, true, false, null, 8, null), 15.0f);
                } else {
                    if (!this.b) {
                        int i17 = disconnect + 41;
                        getRoot = i17 % 128;
                        int i18 = i17 % 2;
                        if (z) {
                            if (!ArraysKt.contains(asBinder, p0.getClass())) {
                                this.cancelAll.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.WARN, InternalLogger.Target.USER, new Function0<String>() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewManagerScope$handleOrphanEvent$2
                                    @Override // kotlin.jvm.functions.Function0
                                    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: merged with bridge method [inline-methods] */
                                    public final String invoke() {
                                        return "A RUM event was detected, but no view is active. To track views automatically, try calling the RumConfiguration.Builder.useViewTrackingStrategy() method.\nYou can also track views manually using the RumMonitor.startView() and RumMonitor.stopView() methods.";
                                    }
                                }, null, false, null);
                            }
                        } else if (p0 instanceof getPreviewCapabilities.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                            zContains = ArraysKt.contains(g, p0.getClass());
                            zContains2 = ArraysKt.contains(asBinder, p0.getClass());
                            if (!zContains) {
                                if (!zContains2) {
                                    int i19 = disconnect + 43;
                                    getRoot = i19 % 128;
                                    int i20 = i19 % 2;
                                    this.cancelAll.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.WARN, InternalLogger.Target.USER, new Function0<String>() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewManagerScope$handleBackgroundEvent$1
                                        @Override // kotlin.jvm.functions.Function0
                                        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
                                        public final String invoke() {
                                            return "A RUM event was detected, but no view is active. To track views automatically, try calling the RumConfiguration.Builder.useViewTrackingStrategy() method.\nYou can also track views manually using the RumMonitor.startView() and RumMonitor.stopView() methods.";
                                        }
                                    }, null, false, null);
                                }
                            } else if (!zContains2) {
                                int i110 = disconnect + 43;
                                getRoot = i110 % 128;
                                int i21 = i110 % 2;
                                this.cancelAll.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.WARN, InternalLogger.Target.USER, new Function0<String>() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewManagerScope$handleBackgroundEvent$1
                                    @Override // kotlin.jvm.functions.Function0
                                    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
                                    public final String invoke() {
                                        return "A RUM event was detected, but no view is active. To track views automatically, try calling the RumConfiguration.Builder.useViewTrackingStrategy() method.\nYou can also track views manually using the RumMonitor.startView() and RumMonitor.stopView() methods.";
                                    }
                                }, null, false, null);
                            }
                        } else {
                            zContains = ArraysKt.contains(g, p0.getClass());
                            zContains2 = ArraysKt.contains(asBinder, p0.getClass());
                            if (!zContains) {
                                if (!zContains2) {
                                    int i111 = disconnect + 43;
                                    getRoot = i111 % 128;
                                    int i22 = i111 % 2;
                                    this.cancelAll.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.WARN, InternalLogger.Target.USER, new Function0<String>() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewManagerScope$handleBackgroundEvent$1
                                        @Override // kotlin.jvm.functions.Function0
                                        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
                                        public final String invoke() {
                                            return "A RUM event was detected, but no view is active. To track views automatically, try calling the RumConfiguration.Builder.useViewTrackingStrategy() method.\nYou can also track views manually using the RumMonitor.startView() and RumMonitor.stopView() methods.";
                                        }
                                    }, null, false, null);
                                }
                            } else if (!zContains2) {
                                int i112 = disconnect + 43;
                                getRoot = i112 % 128;
                                int i23 = i112 % 2;
                                this.cancelAll.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.WARN, InternalLogger.Target.USER, new Function0<String>() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewManagerScope$handleBackgroundEvent$1
                                    @Override // kotlin.jvm.functions.Function0
                                    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
                                    public final String invoke() {
                                        return "A RUM event was detected, but no view is active. To track views automatically, try calling the RumConfiguration.Builder.useViewTrackingStrategy() method.\nYou can also track views manually using the RumMonitor.startView() and RumMonitor.stopView() methods.";
                                    }
                                }, null, false, null);
                            }
                        }
                    } else if (p0 instanceof getPreviewCapabilities.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        zContains = ArraysKt.contains(g, p0.getClass());
                        zContains2 = ArraysKt.contains(asBinder, p0.getClass());
                        if (!zContains) {
                            if (!zContains2) {
                                int i113 = disconnect + 43;
                                getRoot = i113 % 128;
                                int i24 = i113 % 2;
                                this.cancelAll.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.WARN, InternalLogger.Target.USER, new Function0<String>() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewManagerScope$handleBackgroundEvent$1
                                    @Override // kotlin.jvm.functions.Function0
                                    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
                                    public final String invoke() {
                                        return "A RUM event was detected, but no view is active. To track views automatically, try calling the RumConfiguration.Builder.useViewTrackingStrategy() method.\nYou can also track views manually using the RumMonitor.startView() and RumMonitor.stopView() methods.";
                                    }
                                }, null, false, null);
                            }
                        } else if (!zContains2) {
                            int i114 = disconnect + 43;
                            getRoot = i114 % 128;
                            int i25 = i114 % 2;
                            this.cancelAll.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.WARN, InternalLogger.Target.USER, new Function0<String>() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewManagerScope$handleBackgroundEvent$1
                                @Override // kotlin.jvm.functions.Function0
                                /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
                                public final String invoke() {
                                    return "A RUM event was detected, but no view is active. To track views automatically, try calling the RumConfiguration.Builder.useViewTrackingStrategy() method.\nYou can also track views manually using the RumMonitor.startView() and RumMonitor.stopView() methods.";
                                }
                            }, null, false, null);
                        }
                    } else {
                        zContains = ArraysKt.contains(g, p0.getClass());
                        zContains2 = ArraysKt.contains(asBinder, p0.getClass());
                        if (!zContains) {
                            if (!zContains2) {
                                int i115 = disconnect + 43;
                                getRoot = i115 % 128;
                                int i26 = i115 % 2;
                                this.cancelAll.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.WARN, InternalLogger.Target.USER, new Function0<String>() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewManagerScope$handleBackgroundEvent$1
                                    @Override // kotlin.jvm.functions.Function0
                                    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
                                    public final String invoke() {
                                        return "A RUM event was detected, but no view is active. To track views automatically, try calling the RumConfiguration.Builder.useViewTrackingStrategy() method.\nYou can also track views manually using the RumMonitor.startView() and RumMonitor.stopView() methods.";
                                    }
                                }, null, false, null);
                            }
                        } else if (!zContains2) {
                            int i116 = disconnect + 43;
                            getRoot = i116 % 128;
                            int i27 = i116 % 2;
                            this.cancelAll.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.WARN, InternalLogger.Target.USER, new Function0<String>() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewManagerScope$handleBackgroundEvent$1
                                @Override // kotlin.jvm.functions.Function0
                                /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
                                public final String invoke() {
                                    return "A RUM event was detected, but no view is active. To track views automatically, try calling the RumConfiguration.Builder.useViewTrackingStrategy() method.\nYou can also track views manually using the RumMonitor.startView() and RumMonitor.stopView() methods.";
                                }
                            }, null, false, null);
                        }
                    }
                    bVar = SessionEndedMetric.MissedEventType.INSTANCE;
                    Intrinsics.checkNotNullParameter(p0, "");
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1552861273);
                    i = 8;
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((KeyEvent.getMaxKeyCode() >> 16) + 46400), (ViewConfiguration.getScrollBarSize() >> 8) + 40, Color.rgb(0, 0, 0) + 16777235, -1206882418, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
                    }
                    i2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
                    Object[] objArr2 = new Object[1];
                    c(new char[]{9255, 6926, 62489, 26641, 22258, 65512, 14826, 15248, 35620, 26106, 63808, 11167, 31668, 28962, 54199, 28391, 46337, 55012, 20732, 24580, 53438, 9339, 44560, 61692}, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 22, objArr2);
                    Class<?> cls = Class.forName((String) objArr2[0]);
                    Object[] objArr3 = new Object[1];
                    c(new char[]{25877, 48585, 43854, 26921, 28001, 32611, 42161, 9237, 32757, 48573, 5938, 33172, 64510, 43791, 39605, 8941, 29121, 16090}, 15 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr3);
                    long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
                    long j5 = -445;
                    long j6 = (j5 * 2973495244884943104L) + (j5 * (-876238070142984117L));
                    long j7 = 446;
                    long j8 = -1;
                    long j9 = j8 ^ 2973495244884943104L;
                    long j10 = j8 ^ (-876238070142984117L);
                    long j11 = (j9 | j10) ^ j8;
                    long elapsedCpuTime = (int) Process.getElapsedCpuTime();
                    j = j6 + ((j11 | ((j10 | (elapsedCpuTime ^ j8)) ^ j8)) * j7) + ((((j9 | (-876238070142984117L)) ^ j8) | ((elapsedCpuTime | (j10 | 2973495244884943104L)) ^ j8)) * j7) + (j7 * j11);
                    i3 = 0;
                    j2 = jLongValue;
                    while (true) {
                        if (i3 != 10) {
                            Object[] objArr4 = new Object[1];
                            c(new char[]{39489, 2137, 50401, 6542, 6241, 35583, 23947, 50619, 43496, 27576, 63600, 11873, 20089, 32418, 61543, 33063, 11957, 49225}, Process.getGidForName("") + 17, objArr4);
                            Class<?> cls2 = Class.forName((String) objArr4[0]);
                            Object[] objArr5 = new Object[1];
                            c(new char[]{15842, 6379, 21712, 21867, 32404, 33128, 36937, 26415, 44488, 61301, 41043, 22983, 893, 6102, 17162, 52380, 50433, 17058}, (KeyEvent.getMaxKeyCode() >> 16) + 16, objArr5);
                            int iIntValue = ((Integer) cls2.getMethod((String) objArr5[0], Object.class).invoke(null, bVar)).intValue();
                            Object[] objArr6 = {-477065234};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (46038 - View.resolveSizeAndState(0, 0, 0)), (ViewConfiguration.getEdgeSlop() >> 16) + 1134, 18 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 807763283, false, null, new Class[]{Integer.TYPE});
                            }
                            Object[] objArr7 = {Integer.valueOf(iIntValue), 0, 1162755801, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr6), false};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                char edgeSlop = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                                int i28 = 1031 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 15;
                                byte[] bArr = $$a;
                                Object[] objArr8 = new Object[1];
                                e((byte) 89, bArr[5], bArr[7], objArr8);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(edgeSlop, i28, fadingEdgeLength, 1298546779, false, (String) objArr8[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - View.MeasureSpec.makeMeasureSpec(0, 0)), Drawable.resolveOpacity(0, 0) + 1117, ((Process.getThreadPriority(0) + 20) >> 6) + 17), Boolean.TYPE});
                            }
                            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr7);
                            if (((int[]) objArr[3])[0] != ((int[]) objArr[1])[0]) {
                                break;
                            }
                            arrayList = new ArrayList();
                            strArr = (String[]) objArr[0];
                            if (strArr != null) {
                                i4 = getRoot + 63;
                                disconnect = i4 % 128;
                                if (i4 % 2 != 0) {
                                }
                                for (i5 = i4 % 2 != 0 ? 0 : 1; i5 < strArr.length; i5++) {
                                    int i29 = getRoot + 23;
                                    disconnect = i29 % 128;
                                    int i30 = i29 % 2;
                                    arrayList.add(strArr[i5]);
                                }
                            }
                            throw null;
                        }
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-638037654);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((-16739380) - Color.rgb(0, 0, 0)), 59 - TextUtils.getCapsMode("", 0, 0), 18 - (ViewConfiguration.getWindowTouchSlop() >> i), 1030158013, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
                        }
                        i6 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).getInt(null);
                        int i31 = disconnect + 105;
                        getRoot = i31 % 128;
                        int i32 = i31 % 2;
                        i7 = 0;
                        j3 = j2;
                        while (true) {
                            i8 = 0;
                            while (i8 != i) {
                                i6 = (((((int) (j3 >> i8)) & 255) + (i6 << 6)) + (i6 << 16)) - i6;
                                i8++;
                                i = 8;
                            }
                            if (i7 == 0) {
                                break;
                                break;
                            }
                            i7++;
                            j3 = j;
                            i = 8;
                        }
                        if (i6 != i2) {
                            break;
                            break;
                        }
                        int i33 = disconnect + 79;
                        getRoot = i33 % 128;
                        int i34 = i33 % 2;
                        j2 -= 1024;
                        i3++;
                        i = 8;
                    }
                    if (!(p0 instanceof getPreviewCapabilities.TuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
                        missedEventType = SessionEndedMetric.MissedEventType.ERROR;
                    } else if (p0 instanceof getPreviewCapabilities.connect) {
                        missedEventType = SessionEndedMetric.MissedEventType.ACTION;
                    } else if (p0 instanceof getPreviewCapabilities.write) {
                        missedEventType = SessionEndedMetric.MissedEventType.RESOURCE;
                    } else if (p0 instanceof getPreviewCapabilities.g) {
                        missedEventType = SessionEndedMetric.MissedEventType.LONG_TASK;
                    } else {
                        missedEventType = null;
                    }
                    if (missedEventType != null) {
                        this.cancel.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.a.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault1, missedEventType);
                        unit = Unit.INSTANCE;
                    } else {
                        unit = null;
                    }
                    if (unit == null) {
                        this.cancelAll.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.INFO, InternalLogger.Target.MAINTAINER, new Function0<String>() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewManagerScope$handleOrphanEvent$4
                            @Override // kotlin.jvm.functions.Function0
                            /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: merged with bridge method [inline-methods] */
                            public final String invoke() {
                                return "An RUM event was detected, but no view is active, its missed type is unknown";
                            }
                        }, null, false, null);
                    }
                }
            } else {
                Iterator<T> it2 = list.iterator();
                int i35 = 0;
                while (it2.hasNext()) {
                    if (((Preview) it2.next()).TuitionPaymentFragmentspecialinlinedviewModeldefault1() && (i35 = i35 + 1) < 0) {
                        CollectionsKt.throwCountOverflow();
                    }
                }
                if (i35 == 0) {
                    if (DdRumContentProvider.INSTANCE.getProcessImportance$dd_sdk_android_rum_release() == 100) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (p0 instanceof getPreviewCapabilities.asInterface) {
                        InternalLogger internalLoggerTuitionPaymentFragmentspecialinlinedviewModeldefault4 = this.cancelAll.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        internalLoggerTuitionPaymentFragmentspecialinlinedviewModeldefault4.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.WARN, InternalLogger.Target.USER, new Function0<String>() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewManagerScope$handleOrphanEvent$1
                            @Override // kotlin.jvm.functions.Function0
                            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                            public final String invoke() {
                                return "A RUM event was detected, but no view is active. To track views automatically, try calling the RumConfiguration.Builder.useViewTrackingStrategy() method.\nYou can also track views manually using the RumMonitor.startView() and RumMonitor.stopView() methods.";
                            }
                        }, null, false, null);
                        internalLoggerTuitionPaymentFragmentspecialinlinedviewModeldefault4.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new LayoutSettings.b.TuitionPaymentFragmentbindingInflater1(((getPreviewCapabilities.asInterface) p0).TuitionPaymentFragmentbindingInflater1, true, false, null, 8, null), 15.0f);
                    } else {
                        if (!this.b) {
                            int i117 = disconnect + 41;
                            getRoot = i117 % 128;
                            int i118 = i117 % 2;
                            if (z) {
                                if (!ArraysKt.contains(asBinder, p0.getClass())) {
                                    this.cancelAll.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.WARN, InternalLogger.Target.USER, new Function0<String>() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewManagerScope$handleOrphanEvent$2
                                        @Override // kotlin.jvm.functions.Function0
                                        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: merged with bridge method [inline-methods] */
                                        public final String invoke() {
                                            return "A RUM event was detected, but no view is active. To track views automatically, try calling the RumConfiguration.Builder.useViewTrackingStrategy() method.\nYou can also track views manually using the RumMonitor.startView() and RumMonitor.stopView() methods.";
                                        }
                                    }, null, false, null);
                                }
                            } else if ((p0 instanceof getPreviewCapabilities.TuitionPaymentFragmentspecialinlinedviewModeldefault2) || !(((getPreviewCapabilities.TuitionPaymentFragmentspecialinlinedviewModeldefault2) p0).asBinder instanceof ANRException)) {
                                zContains = ArraysKt.contains(g, p0.getClass());
                                zContains2 = ArraysKt.contains(asBinder, p0.getClass());
                                if (!zContains && this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                                    RumViewScope rumViewScope3 = new RumViewScope(this, this.cancelAll, this.cancel, new onAppEdgeInvalidated("com.datadog.background.view", "com/datadog/background/view", "Background"), p0.getTuitionPaymentFragmentspecialinlinedviewModeldefault2(), MapsKt.emptyMap(), this.INotificationSideChannel, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, new shouldCompleteWithoutFailure(), new shouldCompleteWithoutFailure(), new shouldCompleteWithoutFailure(), null, RumViewScope.RumViewType.BACKGROUND, this.onTransact, this.asInterface, 2048, null);
                                    rumViewScope3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0, p1);
                                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(rumViewScope3);
                                    this.d = null;
                                } else if (!zContains2) {
                                    int i119 = disconnect + 43;
                                    getRoot = i119 % 128;
                                    int i210 = i119 % 2;
                                    this.cancelAll.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.WARN, InternalLogger.Target.USER, new Function0<String>() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewManagerScope$handleBackgroundEvent$1
                                        @Override // kotlin.jvm.functions.Function0
                                        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
                                        public final String invoke() {
                                            return "A RUM event was detected, but no view is active. To track views automatically, try calling the RumConfiguration.Builder.useViewTrackingStrategy() method.\nYou can also track views manually using the RumMonitor.startView() and RumMonitor.stopView() methods.";
                                        }
                                    }, null, false, null);
                                }
                            }
                        } else if (p0 instanceof getPreviewCapabilities.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                            zContains = ArraysKt.contains(g, p0.getClass());
                            zContains2 = ArraysKt.contains(asBinder, p0.getClass());
                            if (!zContains) {
                                if (!zContains2) {
                                    int i1110 = disconnect + 43;
                                    getRoot = i1110 % 128;
                                    int i211 = i1110 % 2;
                                    this.cancelAll.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.WARN, InternalLogger.Target.USER, new Function0<String>() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewManagerScope$handleBackgroundEvent$1
                                        @Override // kotlin.jvm.functions.Function0
                                        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
                                        public final String invoke() {
                                            return "A RUM event was detected, but no view is active. To track views automatically, try calling the RumConfiguration.Builder.useViewTrackingStrategy() method.\nYou can also track views manually using the RumMonitor.startView() and RumMonitor.stopView() methods.";
                                        }
                                    }, null, false, null);
                                }
                            } else if (!zContains2) {
                                int i1111 = disconnect + 43;
                                getRoot = i1111 % 128;
                                int i212 = i1111 % 2;
                                this.cancelAll.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.WARN, InternalLogger.Target.USER, new Function0<String>() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewManagerScope$handleBackgroundEvent$1
                                    @Override // kotlin.jvm.functions.Function0
                                    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
                                    public final String invoke() {
                                        return "A RUM event was detected, but no view is active. To track views automatically, try calling the RumConfiguration.Builder.useViewTrackingStrategy() method.\nYou can also track views manually using the RumMonitor.startView() and RumMonitor.stopView() methods.";
                                    }
                                }, null, false, null);
                            }
                        } else {
                            zContains = ArraysKt.contains(g, p0.getClass());
                            zContains2 = ArraysKt.contains(asBinder, p0.getClass());
                            if (!zContains) {
                                if (!zContains2) {
                                    int i1112 = disconnect + 43;
                                    getRoot = i1112 % 128;
                                    int i213 = i1112 % 2;
                                    this.cancelAll.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.WARN, InternalLogger.Target.USER, new Function0<String>() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewManagerScope$handleBackgroundEvent$1
                                        @Override // kotlin.jvm.functions.Function0
                                        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
                                        public final String invoke() {
                                            return "A RUM event was detected, but no view is active. To track views automatically, try calling the RumConfiguration.Builder.useViewTrackingStrategy() method.\nYou can also track views manually using the RumMonitor.startView() and RumMonitor.stopView() methods.";
                                        }
                                    }, null, false, null);
                                }
                            } else if (!zContains2) {
                                int i1113 = disconnect + 43;
                                getRoot = i1113 % 128;
                                int i214 = i1113 % 2;
                                this.cancelAll.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.WARN, InternalLogger.Target.USER, new Function0<String>() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewManagerScope$handleBackgroundEvent$1
                                    @Override // kotlin.jvm.functions.Function0
                                    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
                                    public final String invoke() {
                                        return "A RUM event was detected, but no view is active. To track views automatically, try calling the RumConfiguration.Builder.useViewTrackingStrategy() method.\nYou can also track views manually using the RumMonitor.startView() and RumMonitor.stopView() methods.";
                                    }
                                }, null, false, null);
                            }
                        }
                        bVar = SessionEndedMetric.MissedEventType.INSTANCE;
                        Intrinsics.checkNotNullParameter(p0, "");
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1552861273);
                        i = 8;
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((KeyEvent.getMaxKeyCode() >> 16) + 46400), (ViewConfiguration.getScrollBarSize() >> 8) + 40, Color.rgb(0, 0, 0) + 16777235, -1206882418, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
                        }
                        i2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
                        Object[] objArr9 = new Object[1];
                        c(new char[]{9255, 6926, 62489, 26641, 22258, 65512, 14826, 15248, 35620, 26106, 63808, 11167, 31668, 28962, 54199, 28391, 46337, 55012, 20732, 24580, 53438, 9339, 44560, 61692}, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 22, objArr9);
                        Class<?> cls3 = Class.forName((String) objArr9[0]);
                        Object[] objArr10 = new Object[1];
                        c(new char[]{25877, 48585, 43854, 26921, 28001, 32611, 42161, 9237, 32757, 48573, 5938, 33172, 64510, 43791, 39605, 8941, 29121, 16090}, 15 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr10);
                        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
                        long j12 = -445;
                        long j13 = (j12 * 2973495244884943104L) + (j12 * (-876238070142984117L));
                        long j14 = 446;
                        long j15 = -1;
                        long j16 = j15 ^ 2973495244884943104L;
                        long j17 = j15 ^ (-876238070142984117L);
                        long j18 = (j16 | j17) ^ j15;
                        long elapsedCpuTime2 = (int) Process.getElapsedCpuTime();
                        j = j13 + ((j18 | ((j17 | (elapsedCpuTime2 ^ j15)) ^ j15)) * j14) + ((((j16 | (-876238070142984117L)) ^ j15) | ((elapsedCpuTime2 | (j17 | 2973495244884943104L)) ^ j15)) * j14) + (j14 * j18);
                        i3 = 0;
                        j2 = jLongValue2;
                        while (true) {
                            if (i3 != 10) {
                                Object[] objArr11 = new Object[1];
                                c(new char[]{39489, 2137, 50401, 6542, 6241, 35583, 23947, 50619, 43496, 27576, 63600, 11873, 20089, 32418, 61543, 33063, 11957, 49225}, Process.getGidForName("") + 17, objArr11);
                                Class<?> cls4 = Class.forName((String) objArr11[0]);
                                Object[] objArr12 = new Object[1];
                                c(new char[]{15842, 6379, 21712, 21867, 32404, 33128, 36937, 26415, 44488, 61301, 41043, 22983, 893, 6102, 17162, 52380, 50433, 17058}, (KeyEvent.getMaxKeyCode() >> 16) + 16, objArr12);
                                int iIntValue2 = ((Integer) cls4.getMethod((String) objArr12[0], Object.class).invoke(null, bVar)).intValue();
                                try {
                                    Object[] objArr13 = {-477065234};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (46038 - View.resolveSizeAndState(0, 0, 0)), (ViewConfiguration.getEdgeSlop() >> 16) + 1134, 18 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 807763283, false, null, new Class[]{Integer.TYPE});
                                    }
                                    Object[] objArr14 = {Integer.valueOf(iIntValue2), 0, 1162755801, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr13), false};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                        char edgeSlop2 = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                                        int i215 = 1031 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                        int fadingEdgeLength2 = (ViewConfiguration.getFadingEdgeLength() >> 16) + 15;
                                        byte[] bArr2 = $$a;
                                        Object[] objArr15 = new Object[1];
                                        e((byte) 89, bArr2[5], bArr2[7], objArr15);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(edgeSlop2, i215, fadingEdgeLength2, 1298546779, false, (String) objArr15[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - View.MeasureSpec.makeMeasureSpec(0, 0)), Drawable.resolveOpacity(0, 0) + 1117, ((Process.getThreadPriority(0) + 20) >> 6) + 17), Boolean.TYPE});
                                    }
                                    objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr14);
                                    if (((int[]) objArr[3])[0] != ((int[]) objArr[1])[0]) {
                                        break;
                                    }
                                    arrayList = new ArrayList();
                                    strArr = (String[]) objArr[0];
                                    if (strArr != null) {
                                        i4 = getRoot + 63;
                                        disconnect = i4 % 128;
                                        while (i5 < strArr.length) {
                                            int i216 = getRoot + 23;
                                            disconnect = i216 % 128;
                                            int i36 = i216 % 2;
                                            arrayList.add(strArr[i5]);
                                        }
                                    }
                                    throw null;
                                } catch (Throwable th) {
                                    Throwable cause = th.getCause();
                                    if (cause != null) {
                                        throw cause;
                                    }
                                    throw th;
                                }
                            }
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-638037654);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((-16739380) - Color.rgb(0, 0, 0)), 59 - TextUtils.getCapsMode("", 0, 0), 18 - (ViewConfiguration.getWindowTouchSlop() >> i), 1030158013, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
                            }
                            i6 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).getInt(null);
                            int i37 = disconnect + 105;
                            getRoot = i37 % 128;
                            int i38 = i37 % 2;
                            i7 = 0;
                            j3 = j2;
                            while (true) {
                                i8 = 0;
                                while (i8 != i) {
                                    i6 = (((((int) (j3 >> i8)) & 255) + (i6 << 6)) + (i6 << 16)) - i6;
                                    i8++;
                                    i = 8;
                                }
                                if (i7 == 0) {
                                    break;
                                }
                                i7++;
                                j3 = j;
                                i = 8;
                            }
                            if (i6 != i2) {
                                break;
                            }
                            int i39 = disconnect + 79;
                            getRoot = i39 % 128;
                            int i310 = i39 % 2;
                            j2 -= 1024;
                            i3++;
                            i = 8;
                        }
                        if (!(p0 instanceof getPreviewCapabilities.TuitionPaymentFragmentspecialinlinedviewModeldefault2) || (p0 instanceof getPreviewCapabilities.getExtras)) {
                            missedEventType = SessionEndedMetric.MissedEventType.ERROR;
                        } else if (p0 instanceof getPreviewCapabilities.connect) {
                            missedEventType = SessionEndedMetric.MissedEventType.ACTION;
                        } else if (p0 instanceof getPreviewCapabilities.write) {
                            missedEventType = SessionEndedMetric.MissedEventType.RESOURCE;
                        } else if (p0 instanceof getPreviewCapabilities.g) {
                            missedEventType = SessionEndedMetric.MissedEventType.LONG_TASK;
                        } else {
                            missedEventType = null;
                        }
                        if (missedEventType != null) {
                            this.cancel.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.a.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault1, missedEventType);
                            unit = Unit.INSTANCE;
                        } else {
                            unit = null;
                        }
                        if (unit == null) {
                            this.cancelAll.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.INFO, InternalLogger.Target.MAINTAINER, new Function0<String>() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewManagerScope$handleOrphanEvent$4
                                @Override // kotlin.jvm.functions.Function0
                                /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: merged with bridge method [inline-methods] */
                                public final String invoke() {
                                    return "An RUM event was detected, but no view is active, its missed type is unknown";
                                }
                            }, null, false, null);
                        }
                    }
                }
            }
        }
        if (this.notify && this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.isEmpty()) {
            return null;
        }
        return this;
    }

    @Override // defpackage.Preview
    public final MetadataImageReaderExternalSyntheticLambda0 TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = disconnect + 9;
        getRoot = i2 % 128;
        int i3 = i2 % 2;
        MetadataImageReaderExternalSyntheticLambda0 metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.a.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int i4 = disconnect + 39;
        getRoot = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 79 / 0;
        }
        return metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
        char[] cArr2 = new char[cArr.length - 2];
        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        char[] cArr3 = new char[2];
        while (true) {
            int i5 = 0;
            if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i);
                return;
            }
            int i6 = $11 + 25;
            $10 = i6 % 128;
            int i7 = 58224;
            if (i6 % i3 != 0) {
                cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            } else {
                cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
            }
            int i8 = 0;
            while (i8 < 16) {
                int i9 = $10 + 77;
                $11 = i9 % 128;
                int i10 = i9 % i3;
                char c = cArr3[1];
                char c2 = cArr3[i5];
                int i11 = (c2 + i7) ^ ((c2 << 4) + ((char) (((long) connect) ^ 8611973335120459638L)));
                int i12 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(read);
                    objArr2[i3] = Integer.valueOf(i12);
                    objArr2[1] = Integer.valueOf(i11);
                    objArr2[i5] = Integer.valueOf(c);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char capsMode = (char) (47773 - TextUtils.getCapsMode("", i5, i5));
                        int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 468;
                        int i13 = 14 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                        Class[] clsArr = new Class[4];
                        clsArr[i5] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[i3] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(capsMode, maximumDrawingCacheSize, i13, -2007001706, false, "o", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    onCaptureSessionEnd oncapturesessionend2 = oncapturesessionend;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i5]), Integer.valueOf((cCharValue + i7) ^ ((cCharValue << 4) + ((char) (((long) write) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(IconCompatParcelizer)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47773 - (ViewConfiguration.getTapTimeout() >> 16)), KeyEvent.keyCodeFromString("") + 468, 13 - TextUtils.getTrimmedLength(""), -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i7 -= 40503;
                    i8++;
                    oncapturesessionend = oncapturesessionend2;
                    i3 = 2;
                    i5 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            onCaptureSessionEnd oncapturesessionend3 = oncapturesessionend;
            cArr2[oncapturesessionend3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr[oncapturesessionend3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] ^ cArr3[0]);
            cArr2[oncapturesessionend3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr3[1] ^ cArr[oncapturesessionend3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1]);
            Object[] objArr4 = {oncapturesessionend3, oncapturesessionend3};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                int packedPositionGroup = 2323 - ExpandableListView.getPackedPositionGroup(0L);
                int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 44;
                byte b = (byte) 0;
                byte b2 = b;
                String str$$g = $$g(b, b2, b2);
                i2 = 2;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(minimumFlingVelocity, packedPositionGroup, scrollBarFadeDuration, -1312321721, false, str$$g, new Class[]{Object.class, Object.class});
            } else {
                i2 = 2;
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            oncapturesessionend = oncapturesessionend3;
            i3 = i2;
        }
    }

    /* JADX INFO: renamed from: sendTransformationInfoIfReady$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001e\u0010\u000b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u00078\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR$\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u00078\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\f\u0010\n\u001a\u0004\b\r\u0010\u000e"}, d2 = {"LsendTransformationInfoIfReady$b;", "", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "J", "", "Ljava/lang/Class;", "asBinder", "[Ljava/lang/Class;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "g", "TuitionPaymentFragmentbindingInflater1", "()[Ljava/lang/Class;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static Class<?>[] TuitionPaymentFragmentbindingInflater1() {
            return sendTransformationInfoIfReady.TuitionPaymentFragmentbindingInflater1();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            FuturesExternalSyntheticLambda7.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0] = FuturesExternalSyntheticLambda8.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0];
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x020d  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.Preview
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1() throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        int i = 2 % 2;
        int i2 = getRoot + 33;
        disconnect = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char keyRepeatTimeout = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
            int scrollDefaultDelay = 876 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
            int iResolveSize = View.resolveSize(0, 0) + 10;
            byte b = $$a[7];
            Object[] objArr3 = new Object[1];
            e((byte) 37, b, b, objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(keyRepeatTimeout, scrollDefaultDelay, iResolveSize, -1650998592, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        c(new char[]{9255, 6926, 62489, 26641, 22258, 65512, 14826, 15248, 35620, 26106, 63808, 11167, 31668, 28962, 54199, 28391, 46337, 55012, 20732, 24580, 53438, 9339, 44560, 61692}, 22 - TextUtils.getCapsMode("", 0, 0), objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        c(new char[]{25877, 48585, 43854, 26921, 28001, 32611, 42161, 9237, 32757, 48573, 5938, 33172, 64510, 43791, 39605, 8941, 29121, 16090}, ExpandableListView.getPackedPositionChild(0L) + 16, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char defaultSize = (char) View.getDefaultSize(0, 0);
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 876;
            int iAxisFromString = MotionEvent.axisFromString("") + 11;
            byte[] bArr = $$a;
            byte b2 = bArr[7];
            Object[] objArr6 = new Object[1];
            e(b2, bArr[5], b2, objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(defaultSize, iMakeMeasureSpec, iAxisFromString, 2012020043, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1);
                int offsetBefore = TextUtils.getOffsetBefore("", 0) + 876;
                int offsetBefore2 = 10 - TextUtils.getOffsetBefore("", 0);
                byte[] bArr2 = $$a;
                byte b3 = bArr2[5];
                byte b4 = bArr2[7];
                Object[] objArr7 = new Object[1];
                e((byte) 89, b3, b4, objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, offsetBefore, offsetBefore2, 2012931276, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr8[0])[0]}, new int[1], new int[]{((int[]) objArr8[2])[0]}, (String[]) objArr8[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i4 = 1001096684 + (((~iIdentityHashCode) | 44505717) * 1444) + (((~(iIdentityHashCode | (-942179281))) | (~(982489509 | iIdentityHashCode)) | 2097744) * (-1444)) + 228367427;
            int i5 = (i4 << 13) ^ i4;
            int i6 = i5 ^ (i5 >>> 17);
            ((int[]) objArr[1])[0] = i6 ^ (i6 << 5);
        } else {
            Object[] objArr9 = new Object[1];
            c(new char[]{40054, 22752, 10986, 56084, 42817, 24391, 46505, 34645, 458, 19714, 10745, 58689, 57452, 46202, 56448, 26948, 25159, 63707, 45790, 40602, 62574, 27284, 4438, 55691, 17390, 58504, 30611, 22729}, 26 - (ViewConfiguration.getTapTimeout() >> 16), objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            c(new char[]{56044, 16254, 40317, 40721, 53961, 19567, 43575, 51669, 41144, 10538, 61211, 25339, 50489, 49049, 63035, 38486, 29721, 19192, 47936, 53390}, TextUtils.lastIndexOf("", '0', 0, 0) + 19, objArr10);
            Context applicationContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i7 = disconnect + 121;
                int i8 = i7 % 128;
                getRoot = i8;
                int i9 = i7 % 2;
                if (applicationContext instanceof ContextWrapper) {
                    int i10 = i8 + 35;
                    disconnect = i10 % 128;
                    if (i10 % 2 == 0) {
                        ((ContextWrapper) applicationContext).getBaseContext();
                        throw null;
                    }
                    if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = applicationContext.getApplicationContext();
                    } else {
                        int i11 = disconnect + 83;
                        getRoot = i11 % 128;
                        if (i11 % 2 != 0) {
                            int i12 = 2 % 4;
                        }
                        applicationContext = null;
                    }
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                }
            }
            Object[] objArr11 = new Object[1];
            c(new char[]{39489, 2137, 50401, 6542, 6241, 35583, 23947, 50619, 43496, 27576, 63600, 11873, 20089, 32418, 61543, 33063, 11957, 49225}, Gravity.getAbsoluteGravity(0, 0) + 16, objArr11);
            Class<?> cls3 = Class.forName((String) objArr11[0]);
            Object[] objArr12 = new Object[1];
            c(new char[]{15842, 6379, 21712, 21867, 32404, 33128, 36937, 26415, 44488, 61301, 41043, 22983, 893, 6102, 17162, 52380, 50433, 17058}, Gravity.getAbsoluteGravity(0, 0) + 16, objArr12);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr12[0], Object.class).invoke(null, this)).intValue();
            int i13 = getRoot + 9;
            disconnect = i13 % 128;
            int i14 = i13 % 2;
            try {
                Object[] objArr13 = {applicationContext, Integer.valueOf(iIntValue), 0, -1998242545};
                byte[] bArr3 = $$d;
                byte b5 = bArr3[60];
                Object[] objArr14 = new Object[1];
                f(b5, b5, (byte) (-bArr3[8]), objArr14);
                Class<?> cls4 = Class.forName((String) objArr14[0]);
                byte b6 = (byte) (-bArr3[8]);
                Object[] objArr15 = new Object[1];
                f(b6, b6, bArr3[60], objArr15);
                Object[] objArr16 = (Object[]) cls4.getMethod((String) objArr15[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr13);
                if (applicationContext != null) {
                    int i15 = disconnect + 23;
                    getRoot = i15 % 128;
                    int i16 = i15 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                        int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 876;
                        int capsMode = TextUtils.getCapsMode("", 0, 0) + 10;
                        byte[] bArr4 = $$a;
                        Object[] objArr17 = new Object[1];
                        e((byte) 89, bArr4[5], bArr4[7], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(packedPositionType, tapTimeout, capsMode, 2012931276, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr16);
                    try {
                        Object[] objArr18 = new Object[1];
                        c(new char[]{9255, 6926, 62489, 26641, 22258, 65512, 14826, 15248, 35620, 26106, 63808, 11167, 31668, 28962, 54199, 28391, 46337, 55012, 20732, 24580, 53438, 9339, 44560, 61692}, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 22, objArr18);
                        Class<?> cls5 = Class.forName((String) objArr18[0]);
                        Object[] objArr19 = new Object[1];
                        c(new char[]{25877, 48585, 43854, 26921, 28001, 32611, 42161, 9237, 32757, 48573, 5938, 33172, 64510, 43791, 39605, 8941, 29121, 16090}, ((byte) KeyEvent.getModifierMetaStateMask()) + 16, objArr19);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr19[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char touchSlop = (char) (ViewConfiguration.getTouchSlop() >> 8);
                            int edgeSlop = 876 - (ViewConfiguration.getEdgeSlop() >> 16);
                            int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 10;
                            byte[] bArr5 = $$a;
                            byte b7 = bArr5[7];
                            Object[] objArr20 = new Object[1];
                            e(b7, bArr5[5], b7, objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(touchSlop, edgeSlop, threadPriority, 2012020043, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char c2 = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1);
                            int iIndexOf = 875 - TextUtils.indexOf((CharSequence) "", '0');
                            int i17 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 9;
                            byte b8 = $$a[7];
                            Object[] objArr21 = new Object[1];
                            e((byte) 37, b8, b8, objArr21);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, iIndexOf, i17, -1650998592, false, (String) objArr21[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr16;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i18 = ((int[]) objArr[2])[0];
        int i19 = ((int[]) objArr[0])[0];
        if (i19 == i18) {
            int i20 = ((int[]) objArr[1])[0];
            objArr2 = new Object[]{new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i21 = i20 + 956152178 + ((~(1050635199 | iIdentityHashCode2)) * 623) + (((~iIdentityHashCode2) | 805323138) * (-623)) + (((~(iIdentityHashCode2 | 948134283)) | (~(907824054 | iIdentityHashCode2)) | (-1050635200)) * 623);
            int i22 = (i21 << 13) ^ i21;
            int i23 = i22 ^ (i22 >>> 17);
            ((int[]) objArr2[1])[0] = i23 ^ (i23 << 5);
        } else {
            int[] iArr = new int[i19];
            int i24 = i19 - 1;
            iArr[i24] = 1;
            Toast.makeText((Context) null, iArr[((i19 * i24) % 2) - 1], 1).show();
            int i25 = ((int[]) objArr[1])[0];
            objArr2 = new Object[]{new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iIdentityHashCode3 = System.identityHashCode(this);
            int i26 = ~iIdentityHashCode3;
            int i27 = i25 + 1149365731 + (((~((-224854662) | i26)) | (~(iIdentityHashCode3 | (-184544433)))) * 333) + (((~(iIdentityHashCode3 | (-224854662))) | (~(i26 | (-184544433)))) * 333);
            int i28 = (i27 << 13) ^ i27;
            int i29 = i28 ^ (i28 >>> 17);
            ((int[]) objArr2[1])[0] = i29 ^ (i29 << 5);
        }
        boolean z = this.notify;
        int i30 = ((int[]) objArr2[1])[0];
        int i31 = i30 * i30;
        int i32 = -(1418495727 * i30);
        int i33 = (i31 ^ i32) + ((i31 & i32) << 1);
        int i34 = -(i30 * (-2118701463));
        int i35 = (i33 ^ i34) + ((i34 & i33) << 1);
        int i36 = (i35 ^ (-484351088)) + (((-484351088) & i35) << 1);
        int i37 = i36 >> 15;
        int i38 = ((i36 >> 29) - 15) / 8;
        int i39 = (-(((i36 - (~(((((-262143) & i37) + (i37 | (-262143))) / 131072) + 1))) - 1) ^ (((i38 | 1) << 1) - (i38 ^ 1)))) + 3;
        return (z ? 1 : 0) ^ (1470 / ((i39 & (-((((i39 >> 19) - 16383) / 8192) + 2))) * 490));
    }

    static {
        getExtras = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        INSTANCE = new Companion(null);
        g = new Class[]{getPreviewCapabilities.TuitionPaymentFragmentspecialinlinedviewModeldefault2.class, getPreviewCapabilities.connect.class, getPreviewCapabilities.write.class};
        asBinder = new Class[]{getPreviewCapabilities.a.class, getPreviewCapabilities.cancelAll.class, getPreviewCapabilities.RemoteActionCompatParcelizer.class, getPreviewCapabilities.getItem.class, getPreviewCapabilities.TuitionPaymentFragmentspecialinlinedviewModeldefault3.class, getPreviewCapabilities.TuitionPaymentFragmentbindingInflater1.class, getPreviewCapabilities.notify.class, getPreviewCapabilities.onTransact.class, getPreviewCapabilities.INotificationSideChannel.class, getPreviewCapabilities.cancel.class, getPreviewCapabilities.INotificationSideChannelStub.class, getPreviewCapabilities.INotificationSideChannelStubProxy.class};
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = TimeUnit.SECONDS.toNanos(3L);
        int i = MediaBrowserCompat + 71;
        getExtras = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        write = (char) 53063;
        IconCompatParcelizer = (char) 43221;
        connect = (char) 61600;
        read = (char) 41293;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r6, short r7, int r8) {
        /*
            byte[] r0 = defpackage.sendTransformationInfoIfReady.$$c
            int r7 = r7 * 3
            int r7 = 1 - r7
            int r8 = r8 * 3
            int r8 = 3 - r8
            int r6 = r6 * 3
            int r6 = r6 + 108
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            int r4 = r3 + 1
            byte r5 = (byte) r6
            r1[r3] = r5
            if (r4 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            int r8 = r8 + 1
            r3 = r0[r8]
        L28:
            int r6 = r6 + r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sendTransformationInfoIfReady.$$g(byte, short, int):java.lang.String");
    }
}
