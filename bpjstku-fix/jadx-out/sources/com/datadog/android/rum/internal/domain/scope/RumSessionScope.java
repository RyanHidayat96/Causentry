package com.datadog.android.rum.internal.domain.scope;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import defpackage.ImageAnalysisAbstractAnalyzerExternalSyntheticLambda1;
import defpackage.ImageAnalysisNonBlockingAnalyzer1;
import defpackage.ImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxy;
import defpackage.ImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0;
import defpackage.MetadataImageReader;
import defpackage.MetadataImageReaderExternalSyntheticLambda0;
import defpackage.Preview;
import defpackage.PreviewExternalSyntheticLambda3;
import defpackage.SafeCloseImageReaderProxy;
import defpackage.getPreviewCapabilities;
import defpackage.initSession;
import defpackage.isMirrored;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
import defpackage.rectToSize;
import defpackage.sendTransformationInfoIfReady;
import defpackage.setJpegQuality;
import defpackage.shouldMirror;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.MapsKt;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 O2\u00020\u0001:\u0003OPQB\u0087\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0016\u001a\u00020\t\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010\u001d\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u001f2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020!0 H\u0017¢\u0006\u0004\b\u001d\u0010\"J\u000f\u0010#\u001a\u00020\tH\u0016¢\u0006\u0004\b#\u0010$J\u001f\u0010'\u001a\u00020&2\u0006\u0010\u0002\u001a\u00020\u00172\u0006\u0010\u0004\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(R\u0014\u0010\u001d\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010,\u001a\u0004\u0018\u00010\u00018\u0001@\u0000X\u0080\f¢\u0006\u0006\n\u0004\b#\u0010+R\u0014\u0010/\u001a\u00020\u000e8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010'\u001a\u00020\t8\u0000@\u0000X\u0081\f¢\u0006\u0006\n\u0004\b,\u0010*R\u0014\u0010#\u001a\u0002008\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020!038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00108\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b7\u0010+R\u0014\u00101\u001a\u0002098\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010-\u001a\u00020\u00078\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010)\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u00104\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010<\u001a\u00020B8\u0000@\u0000X\u0081\f¢\u0006\u0006\n\u0004\b/\u0010CR\u0014\u0010:\u001a\u00020\u00178\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u00107\u001a\u0004\u0018\u00010\u00148\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010>\u001a\u00020\u00178\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bH\u0010ER\u0014\u0010D\u001a\u0002008\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bI\u00102R\u0016\u0010@\u001a\u00020J8\u0000@\u0000X\u0081\f¢\u0006\u0006\n\u0004\b'\u0010KR\u0016\u0010F\u001a\u00020%8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010I\u001a\u00020\t8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\bN\u0010*"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope;", "LPreview;", "p0", "LImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0;", "p1", "LPreviewExternalSyntheticLambda3;", "p2", "", "p3", "", "p4", "p5", "LshouldMirror;", "p6", "LsetJpegQuality;", "p7", "LSafeCloseImageReaderProxy;", "p8", "p9", "p10", "LMetadataImageReader;", "p11", "p12", "", "p13", "p14", "<init>", "(LPreview;LImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0;LPreviewExternalSyntheticLambda3;FZZLshouldMirror;LsetJpegQuality;LSafeCloseImageReaderProxy;LSafeCloseImageReaderProxy;LSafeCloseImageReaderProxy;LMetadataImageReader;ZJJ)V", "LMetadataImageReaderExternalSyntheticLambda0;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()LMetadataImageReaderExternalSyntheticLambda0;", "LgetPreviewCapabilities;", "LImageAnalysisNonBlockingAnalyzer1;", "", "(LgetPreviewCapabilities;LImageAnalysisNonBlockingAnalyzer1;)LPreview;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "()Z", "Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$StartReason;", "", "TuitionPaymentFragmentbindingInflater1", "(JLcom/datadog/android/rum/internal/domain/scope/RumSessionScope$StartReason;)V", "a", "Z", "LPreview;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "asInterface", "LsetJpegQuality;", "b", "Ljava/util/concurrent/atomic/AtomicLong;", "d", "Ljava/util/concurrent/atomic/AtomicLong;", "LImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxy;", "cancelAll", "LImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxy;", "asBinder", "onTransact", "g", "Ljava/security/SecureRandom;", "cancel", "Ljava/security/SecureRandom;", "notify", "F", "INotificationSideChannel", "LImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0;", "INotificationSideChannelDefault", "LPreviewExternalSyntheticLambda3;", "", "Ljava/lang/String;", "RemoteActionCompatParcelizer", "J", "INotificationSideChannelStub", "LMetadataImageReader;", "INotificationSideChannelStubProxy", "getInterfaceDescriptor", "Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$State;", "Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$State;", "IconCompatParcelizer", "Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$StartReason;", "write", "TuitionPaymentFragmentspecialinlinedviewModeldefault3_", "StartReason", "State"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class RumSessionScope implements Preview {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3_, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final long asBinder;
    private static char[] connect;
    private static final long g;
    private static int getItem;
    private static long read;

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
    private final ImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0 a;

    /* JADX INFO: renamed from: INotificationSideChannelDefault, reason: from kotlin metadata */
    private final PreviewExternalSyntheticLambda3 cancelAll;

    /* JADX INFO: renamed from: INotificationSideChannelStub, reason: from kotlin metadata */
    private final MetadataImageReader onTransact;

    /* JADX INFO: renamed from: INotificationSideChannelStubProxy, reason: from kotlin metadata */
    private final long INotificationSideChannel;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private StartReason INotificationSideChannelStub;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final long cancel;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public State INotificationSideChannelDefault;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public Preview TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public boolean TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final setJpegQuality b;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public String notify;

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    private final SecureRandom d;

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    private final ImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxy<Object> asBinder;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final AtomicLong TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: getInterfaceDescriptor, reason: from kotlin metadata */
    private final AtomicLong RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    private final float asInterface;

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    private final Preview g;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final boolean getInterfaceDescriptor;
    private static final byte[] $$c = {55, -64, 35, -71};
    private static final int $$f = 218;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {57, -56, 23, -36, -14, 0, Base64.padSymbol, -56, 1, -21, 17, -5, -13, 6, 55, -53, -15, 8, -16, 1, 4, 3, 52, -70, -5, 6, Base64.padSymbol, -65, -4, 9, -3, -9, 60, -32, -37, -1, 5, 17, -15, -20, 6, 36, -51, 15, -11, -8, 78, -77, -1, 24, -32, 15, -15, -7, 16, -4, -19, 78, -64};
    private static final int $$e = 244;
    private static final byte[] $$a = {30, 17, -35, 104, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
    private static final int $$b = 117;
    private static int getNotifyChildrenChangedOptions = 0;
    private static int disconnect = 1;
    private static int MediaBrowserCompat = 0;

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 14
            int r7 = r7 + 84
            byte[] r0 = com.datadog.android.rum.internal.domain.scope.RumSessionScope.$$a
            int r6 = r6 * 52
            int r6 = 55 - r6
            int r1 = r8 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L15
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2c
        L15:
            r3 = r2
        L16:
            int r6 = r6 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            r3 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r5
        L2c:
            int r3 = -r3
            int r6 = r6 + r3
            int r6 = r6 + (-10)
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.datadog.android.rum.internal.domain.scope.RumSessionScope.c(byte, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(short r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 55
            int r0 = 56 - r7
            int r8 = r8 + 98
            byte[] r1 = com.datadog.android.rum.internal.domain.scope.RumSessionScope.$$d
            int r6 = r6 + 4
            byte[] r0 = new byte[r0]
            int r7 = 55 - r7
            r2 = 0
            if (r1 != 0) goto L15
            r3 = r8
            r4 = r2
            r8 = r6
            goto L2c
        L15:
            r3 = r2
        L16:
            int r6 = r6 + 1
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L27:
            r3 = r1[r6]
            r5 = r8
            r8 = r6
            r6 = r5
        L2c:
            int r3 = -r3
            int r6 = r6 + r3
            int r6 = r6 + (-2)
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.datadog.android.rum.internal.domain.scope.RumSessionScope.f(short, short, int, java.lang.Object[]):void");
    }

    private RumSessionScope(Preview preview, ImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0 imageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0, PreviewExternalSyntheticLambda3 previewExternalSyntheticLambda3, float f, boolean z, boolean z2, shouldMirror shouldmirror, setJpegQuality setjpegquality, SafeCloseImageReaderProxy safeCloseImageReaderProxy, SafeCloseImageReaderProxy safeCloseImageReaderProxy2, SafeCloseImageReaderProxy safeCloseImageReaderProxy3, MetadataImageReader metadataImageReader, boolean z3, long j, long j2) {
        Intrinsics.checkNotNullParameter(preview, "");
        Intrinsics.checkNotNullParameter(imageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(previewExternalSyntheticLambda3, "");
        Intrinsics.checkNotNullParameter(setjpegquality, "");
        Intrinsics.checkNotNullParameter(safeCloseImageReaderProxy, "");
        Intrinsics.checkNotNullParameter(safeCloseImageReaderProxy2, "");
        Intrinsics.checkNotNullParameter(safeCloseImageReaderProxy3, "");
        this.g = preview;
        this.a = imageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0;
        this.cancelAll = previewExternalSyntheticLambda3;
        this.asInterface = f;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = z;
        this.getInterfaceDescriptor = z2;
        this.b = setjpegquality;
        this.onTransact = metadataImageReader;
        this.cancel = j;
        this.INotificationSideChannel = j2;
        MetadataImageReaderExternalSyntheticLambda0.Companion companion = MetadataImageReaderExternalSyntheticLambda0.INSTANCE;
        this.notify = MetadataImageReaderExternalSyntheticLambda0.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        this.INotificationSideChannelDefault = State.NOT_TRACKED;
        this.INotificationSideChannelStub = StartReason.USER_APP_LAUNCH;
        this.TuitionPaymentFragmentbindingInflater1 = true;
        this.RemoteActionCompatParcelizer = new AtomicLong(System.nanoTime());
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new AtomicLong(0L);
        this.d = new SecureRandom();
        this.asBinder = new ImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxy<>();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new sendTransformationInfoIfReady(this, imageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0, previewExternalSyntheticLambda3, z, z2, shouldmirror, setjpegquality, safeCloseImageReaderProxy, safeCloseImageReaderProxy2, safeCloseImageReaderProxy3, z3, f);
        imageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2("rum", new Function1<Map<String, Object>, Unit>() { // from class: com.datadog.android.rum.internal.domain.scope.RumSessionScope.1
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(Map<String, Object> map) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault1(map);
                return Unit.INSTANCE;
            }

            public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Map<String, Object> map) {
                Intrinsics.checkNotNullParameter(map, "");
                map.putAll(RumSessionScope.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault2());
            }

            {
                super(1);
            }
        });
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ RumSessionScope(Preview preview, ImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0 imageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0, PreviewExternalSyntheticLambda3 previewExternalSyntheticLambda3, float f, boolean z, boolean z2, shouldMirror shouldmirror, setJpegQuality setjpegquality, SafeCloseImageReaderProxy safeCloseImageReaderProxy, SafeCloseImageReaderProxy safeCloseImageReaderProxy2, SafeCloseImageReaderProxy safeCloseImageReaderProxy3, MetadataImageReader metadataImageReader, boolean z3, long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        long j3;
        long j4;
        long j5;
        if ((i & 8192) != 0) {
            int i2 = getNotifyChildrenChangedOptions + 121;
            disconnect = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            j3 = asBinder;
        } else {
            j3 = j;
        }
        if ((i & 16384) != 0) {
            int i5 = getNotifyChildrenChangedOptions + 57;
            disconnect = i5 % 128;
            if (i5 % 2 == 0) {
                j5 = g;
                int i6 = 69 / 0;
            } else {
                j5 = g;
            }
            j4 = j5;
        } else {
            j4 = j2;
        }
        this(preview, imageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0, previewExternalSyntheticLambda3, f, z, z2, shouldmirror, setjpegquality, safeCloseImageReaderProxy, safeCloseImageReaderProxy2, safeCloseImageReaderProxy3, metadataImageReader, z3, j3, j4);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\r"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$State;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "asString", "Ljava/lang/String;", "getAsString", "()Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentspecialinlinedviewModeldefault2"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum State {
        NOT_TRACKED("NOT_TRACKED"),
        TRACKED("TRACKED"),
        EXPIRED("EXPIRED");


        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String asString;

        State(String str) {
            this.asString = str;
        }

        public final String getAsString() {
            return this.asString;
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.internal.domain.scope.RumSessionScope$State$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$State$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "", "p0", "Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$State;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Ljava/lang/String;)Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$State;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public static State TuitionPaymentFragmentspecialinlinedviewModeldefault3(String p0) {
                for (State state : State.values()) {
                    if (Intrinsics.areEqual(state.getAsString(), p0)) {
                        return state;
                    }
                }
                return null;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$StartReason;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "asString", "Ljava/lang/String;", "getAsString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "a", "b", "d", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "asInterface", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum StartReason {
        USER_APP_LAUNCH("user_app_launch"),
        INACTIVITY_TIMEOUT("inactivity_timeout"),
        MAX_DURATION("max_duration"),
        BACKGROUND_LAUNCH("background_launch"),
        PREWARM("prewarm"),
        FROM_NON_INTERACTIVE_SESSION("from_non_interactive_session"),
        EXPLICIT_STOP("explicit_stop");


        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String asString;

        StartReason(String str) {
            this.asString = str;
        }

        public final String getAsString() {
            return this.asString;
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.internal.domain.scope.RumSessionScope$StartReason$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$StartReason$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "", "p0", "Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$StartReason;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Ljava/lang/String;)Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$StartReason;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public static StartReason TuitionPaymentFragmentspecialinlinedviewModeldefault2(String p0) {
                for (StartReason startReason : StartReason.values()) {
                    if (Intrinsics.areEqual(startReason.getAsString(), p0)) {
                        return startReason;
                    }
                }
                return null;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0225  */
    /* JADX WARN: Code duplicated, block: B:50:0x0226  */
    private static void e(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3;
        char c2;
        Throwable cause;
        int i4 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (true) {
            i3 = 584784343;
            c2 = '0';
            if (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >= i2) {
                break;
            }
            int i5 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            try {
                Object[] objArr2 = {Integer.valueOf(connect[i + i5])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), 2188 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (ViewConfiguration.getScrollBarSize() >> 8) + 40, 841711447, false, $$g(b, b2, (byte) (b2 + 1)), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(read), Integer.valueOf(c)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = (byte) (b3 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.indexOf("", "") + 33017), 3011 - (ViewConfiguration.getFadingEdgeLength() >> 16), 26 - TextUtils.indexOf("", "", 0, 0), 321985076, false, $$g(b3, b4, (byte) (b4 + 3)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = (byte) (b5 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 36505), KeyEvent.normalizeMetaState(0) + 3376, 17 - Color.green(0), -968507904, false, $$g(b5, b6, (byte) (-b6)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                int i6 = $11 + 125;
                $10 = i6 % 128;
                int i7 = i6 % 2;
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                    throw th;
                }
                throw cause;
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr = new char[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        int i8 = $11 + 113;
        $10 = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 2 / 5;
        }
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i10 = $10 + 49;
            $11 = i10 % 128;
            if (i10 % 2 == 0) {
                cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                try {
                    Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i3);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = (byte) (b7 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (AndroidCharacter.getMirror(c2) + 36457), (ViewConfiguration.getScrollBarSize() >> 8) + 3376, 17 - TextUtils.getOffsetBefore("", 0), -968507904, false, $$g(b7, b8, (byte) (-b8)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                    int i11 = 38 / 0;
                    i3 = 584784343;
                    c2 = '0';
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            } else {
                cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                Object[] objArr6 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    byte b9 = (byte) 0;
                    byte b10 = (byte) (b9 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (Color.alpha(0) + 36505), 3376 - (ViewConfiguration.getScrollBarSize() >> 8), TextUtils.lastIndexOf("", '0', 0) + 18, -968507904, false, $$g(b9, b10, (byte) (-b10)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
                c2 = '0';
                i3 = 584784343;
            }
        }
        objArr[0] = new String(cArr);
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.domain.scope.RumSessionScope$TuitionPaymentFragmentspecialinlinedviewModeldefault3_, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$TuitionPaymentFragmentspecialinlinedviewModeldefault3_;", "", "<init>", "()V", "", "asBinder", "J", "TuitionPaymentFragmentbindingInflater1", "g", "TuitionPaymentFragmentspecialinlinedviewModeldefault3"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            isMirrored.b[0] = rectToSize.TuitionPaymentFragmentbindingInflater1[0];
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0059  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:62:0x010b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x010d  */
    /* JADX WARN: Code duplicated, block: B:65:0x0119  */
    /* JADX WARN: Code duplicated, block: B:68:0x011e  */
    /* JADX WARN: Code duplicated, block: B:70:0x0122 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x0124  */
    /* JADX WARN: Code duplicated, block: B:72:0x0131  */
    /* JADX WARN: Code duplicated, block: B:74:0x0134  */
    /* JADX WARN: Code duplicated, block: B:75:0x0137  */
    @Override // defpackage.Preview
    public final Preview TuitionPaymentFragmentspecialinlinedviewModeldefault3(getPreviewCapabilities p0, ImageAnalysisNonBlockingAnalyzer1<Object> p1) throws Throwable {
        boolean z;
        StartReason startReason;
        int i;
        CharSequence charSequence;
        Object[] objArr;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        if (p0 instanceof getPreviewCapabilities.RemoteActionCompatParcelizer) {
            TuitionPaymentFragmentbindingInflater1(System.nanoTime(), StartReason.EXPLICIT_STOP);
        } else if (p0 instanceof getPreviewCapabilities.getRoot) {
            this.TuitionPaymentFragmentbindingInflater1 = false;
            this.cancelAll.b(this.notify);
        }
        long jNanoTime = System.nanoTime();
        String str = this.notify;
        MetadataImageReaderExternalSyntheticLambda0.Companion companion = MetadataImageReaderExternalSyntheticLambda0.INSTANCE;
        boolean zAreEqual = Intrinsics.areEqual(str, MetadataImageReaderExternalSyntheticLambda0.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        if (jNanoTime - this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get() >= this.cancel) {
            int i3 = disconnect + 29;
            getNotifyChildrenChangedOptions = i3 % 128;
            if (i3 % 2 != 0) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        boolean z2 = jNanoTime - this.RemoteActionCompatParcelizer.get() >= this.INotificationSideChannel;
        boolean z3 = (p0 instanceof getPreviewCapabilities.read) || (p0 instanceof getPreviewCapabilities.connect);
        sendTransformationInfoIfReady.Companion companion2 = sendTransformationInfoIfReady.INSTANCE;
        boolean zContains = ArraysKt.contains(sendTransformationInfoIfReady.Companion.TuitionPaymentFragmentbindingInflater1(), p0.getClass());
        boolean z4 = p0 instanceof getPreviewCapabilities.getInterfaceDescriptor;
        boolean z5 = z4 && ((getPreviewCapabilities.getInterfaceDescriptor) p0).b;
        boolean z6 = z4 && !((getPreviewCapabilities.getInterfaceDescriptor) p0).b;
        if (z || z2) {
            this.cancelAll.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.notify, this.a.TuitionPaymentFragmentspecialinlinedviewModeldefault1().b);
        } else {
            int i4 = disconnect + 105;
            getNotifyChildrenChangedOptions = i4 % 128;
            int i5 = i4 % 2;
            if (!this.TuitionPaymentFragmentbindingInflater1) {
                this.cancelAll.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.notify, this.a.TuitionPaymentFragmentspecialinlinedviewModeldefault1().b);
            }
        }
        Object obj = null;
        if (z3) {
            if (zAreEqual) {
                if (zAreEqual) {
                    int i6 = getNotifyChildrenChangedOptions + 109;
                    disconnect = i6 % 128;
                    int i7 = i6 % 2;
                    startReason = StartReason.USER_APP_LAUNCH;
                } else if (!z) {
                    startReason = StartReason.MAX_DURATION;
                } else {
                    startReason = StartReason.INACTIVITY_TIMEOUT;
                }
                TuitionPaymentFragmentbindingInflater1(jNanoTime, startReason);
            } else {
                i = disconnect + 117;
                getNotifyChildrenChangedOptions = i % 128;
                if (i % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                if (z) {
                    if (zAreEqual) {
                        int i8 = getNotifyChildrenChangedOptions + 109;
                        disconnect = i8 % 128;
                        int i9 = i8 % 2;
                        startReason = StartReason.USER_APP_LAUNCH;
                    } else if (!z) {
                        startReason = StartReason.MAX_DURATION;
                    } else {
                        startReason = StartReason.INACTIVITY_TIMEOUT;
                    }
                    TuitionPaymentFragmentbindingInflater1(jNanoTime, startReason);
                } else {
                    if (zAreEqual) {
                        int i10 = getNotifyChildrenChangedOptions + 109;
                        disconnect = i10 % 128;
                        int i11 = i10 % 2;
                        startReason = StartReason.USER_APP_LAUNCH;
                    } else if (!z) {
                        startReason = StartReason.MAX_DURATION;
                    } else {
                        startReason = StartReason.INACTIVITY_TIMEOUT;
                    }
                    TuitionPaymentFragmentbindingInflater1(jNanoTime, startReason);
                }
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.set(jNanoTime);
        } else {
            int i12 = disconnect;
            int i13 = i12 + 105;
            getNotifyChildrenChangedOptions = i13 % 128;
            int i14 = i13 % 2;
            if (!z5) {
                int i15 = i12 + 23;
                int i16 = i15 % 128;
                getNotifyChildrenChangedOptions = i16;
                int i17 = i15 % 2;
                if (z) {
                    if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                        if (!zContains) {
                            int i18 = i16 + 97;
                            disconnect = i18 % 128;
                            if (i18 % 2 == 0) {
                                throw null;
                            }
                            if (z6) {
                            }
                        }
                        TuitionPaymentFragmentbindingInflater1(jNanoTime, StartReason.INACTIVITY_TIMEOUT);
                    }
                    this.INotificationSideChannelDefault = State.EXPIRED;
                } else if (z2) {
                    int i19 = i16 + 19;
                    disconnect = i19 % 128;
                    int i20 = i19 % 2;
                    TuitionPaymentFragmentbindingInflater1(jNanoTime, StartReason.MAX_DURATION);
                }
            } else if (zAreEqual) {
                i = disconnect + 117;
                getNotifyChildrenChangedOptions = i % 128;
                if (i % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                if (z || z2) {
                    if (zAreEqual) {
                        int i110 = getNotifyChildrenChangedOptions + 109;
                        disconnect = i110 % 128;
                        int i111 = i110 % 2;
                        startReason = StartReason.USER_APP_LAUNCH;
                    } else if (!z) {
                        startReason = StartReason.MAX_DURATION;
                    } else {
                        startReason = StartReason.INACTIVITY_TIMEOUT;
                    }
                    TuitionPaymentFragmentbindingInflater1(jNanoTime, startReason);
                }
            } else {
                if (zAreEqual) {
                    int i112 = getNotifyChildrenChangedOptions + 109;
                    disconnect = i112 % 128;
                    int i113 = i112 % 2;
                    startReason = StartReason.USER_APP_LAUNCH;
                } else if (!z) {
                    startReason = StartReason.MAX_DURATION;
                } else {
                    startReason = StartReason.INACTIVITY_TIMEOUT;
                }
                TuitionPaymentFragmentbindingInflater1(jNanoTime, startReason);
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.set(jNanoTime);
        }
        State state = this.INotificationSideChannelDefault;
        String str2 = this.notify;
        boolean z7 = state == State.TRACKED;
        ImageAnalysisAbstractAnalyzerExternalSyntheticLambda1 imageAnalysisAbstractAnalyzerExternalSyntheticLambda1B = this.a.b("session-replay");
        if (imageAnalysisAbstractAnalyzerExternalSyntheticLambda1B != null) {
            imageAnalysisAbstractAnalyzerExternalSyntheticLambda1B.TuitionPaymentFragmentspecialinlinedviewModeldefault3(MapsKt.mapOf(TuplesKt.to("type", "rum_session_renewed"), TuplesKt.to("keepSession", Boolean.valueOf(z7)), TuplesKt.to("sessionId", str2)));
        }
        ImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxy<Object> imageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxy = this.INotificationSideChannelDefault != State.TRACKED ? this.asBinder : p1;
        if (!z4) {
            int i21 = disconnect + 103;
            getNotifyChildrenChangedOptions = i21 % 128;
            int i22 = i21 % 2;
            Preview preview = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = preview != null ? preview.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0, imageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxy) : null;
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            charSequence = "";
            char cIndexOf = (char) (31533 - TextUtils.indexOf(charSequence, charSequence, 0));
            int trimmedLength = 921 - TextUtils.getTrimmedLength(charSequence);
            int iLastIndexOf = 27 - TextUtils.lastIndexOf(charSequence, '0', 0);
            byte[] bArr = $$a;
            byte b = bArr[7];
            Object[] objArr2 = new Object[1];
            c(b, b, bArr[80], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, trimmedLength, iLastIndexOf, -1048449946, false, (String) objArr2[0], null);
        } else {
            charSequence = r3;
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e((-1) - TextUtils.lastIndexOf(charSequence, '0', 0, 0), 22 - View.getDefaultSize(0, 0), (char) (TextUtils.getOffsetBefore(charSequence, 0) + 38918), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(22 - ExpandableListView.getPackedPositionGroup(0L), 15 - Color.green(0), (char) Color.alpha(0), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char absoluteGravity = (char) (31533 - Gravity.getAbsoluteGravity(0, 0));
            int i23 = 922 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
            int keyRepeatDelay = 28 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
            byte[] bArr2 = $$a;
            byte b2 = bArr2[7];
            byte b3 = bArr2[80];
            Object[] objArr5 = new Object[1];
            c(b2, b3, (byte) (b3 | 52), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(absoluteGravity, i23, keyRepeatDelay, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c = (char) (31534 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                int offsetBefore = 921 - TextUtils.getOffsetBefore(charSequence, 0);
                int iMyPid = 28 - (Process.myPid() >> 22);
                byte b4 = $$a[80];
                byte b5 = b4;
                Object[] objArr6 = new Object[1];
                c(b4, b5, (byte) (b5 | 37), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, offsetBefore, iMyPid, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int i24 = ~((~System.identityHashCode(this)) | 1247805914);
            int i25 = (((1075839258 | i24) * (-970)) - 1937792097) + ((i24 | 171966656) * 970) + 2109022050;
            int i26 = (i25 << 13) ^ i25;
            int i27 = i26 ^ (i26 >>> 17);
            ((int[]) objArr[0])[0] = i27 ^ (i27 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(View.resolveSize(0, 0) + 37, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 25, (char) (View.resolveSizeAndState(0, 0, 0) + 16311), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 62, 17 - TextUtils.indexOf(charSequence, '0', 0), (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 19247), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            e(View.MeasureSpec.makeMeasureSpec(0, 0) + 81, (ViewConfiguration.getWindowTouchSlop() >> 8) + 16, (char) (52828 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            e(TextUtils.getTrimmedLength(charSequence) + 97, 15 - TextUtils.indexOf(charSequence, '0', 0), (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr11);
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, 2109022050};
                byte[] bArr3 = $$d;
                Object[] objArr13 = new Object[1];
                f(bArr3[35], bArr3[5], bArr3[8], objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                Object[] objArr14 = new Object[1];
                f((byte) (bArr3[14] - 1), bArr3[8], bArr3[5], objArr14);
                objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c2 = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 31532);
                    int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 921;
                    int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 28;
                    byte b6 = $$a[80];
                    byte b7 = b6;
                    Object[] objArr15 = new Object[1];
                    c(b6, b7, (byte) (b7 | 37), objArr15);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, maxKeyCode, windowTouchSlop, -1142834547, false, (String) objArr15[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr16 = new Object[1];
                    e(1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22, (char) (TextUtils.getCapsMode(charSequence, 0, 0) + 38918), objArr16);
                    Class<?> cls5 = Class.forName((String) objArr16[0]);
                    Object[] objArr17 = new Object[1];
                    e(Color.red(0) + 22, 15 - View.resolveSize(0, 0), (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), objArr17);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cLastIndexOf = (char) (31532 - TextUtils.lastIndexOf(charSequence, '0', 0, 0));
                        int capsMode = 921 - TextUtils.getCapsMode(charSequence, 0, 0);
                        int threadPriority = 28 - ((Process.getThreadPriority(0) + 20) >> 6);
                        byte[] bArr4 = $$a;
                        byte b8 = bArr4[7];
                        byte b9 = bArr4[80];
                        Object[] objArr18 = new Object[1];
                        c(b8, b9, (byte) (b9 | 52), objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cLastIndexOf, capsMode, threadPriority, -778300370, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c3 = (char) (31534 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                        int maximumFlingVelocity = 921 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                        int iLastIndexOf2 = TextUtils.lastIndexOf(charSequence, '0', 0) + 29;
                        byte[] bArr5 = $$a;
                        byte b10 = bArr5[7];
                        Object[] objArr19 = new Object[1];
                        c(b10, b10, bArr5[80], objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c3, maximumFlingVelocity, iLastIndexOf2, -1048449946, false, (String) objArr19[0], null);
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
        int i28 = ((int[]) objArr[1])[0];
        int i29 = ((int[]) objArr[3])[0];
        if (i29 != i28) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                for (String str3 : strArr) {
                    arrayList.add(str3);
                }
            }
            throw new RuntimeException(String.valueOf(i29));
        }
        int i30 = disconnect + 47;
        getNotifyChildrenChangedOptions = i30 % 128;
        int i31 = i30 % 2;
        int i32 = ((int[]) objArr[0])[0];
        Object[] objArr20 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
        int i33 = ~Process.myPid();
        int i34 = i32 + 1261592435 + (((-18459674) | i33) * 184) + (((~(i33 | 878858626)) | (-20556956)) * 184);
        int i35 = (i34 << 13) ^ i34;
        int i36 = i35 ^ (i35 >>> 17);
        ((int[]) objArr20[0])[0] = i36 ^ (i36 << 5);
        if (this.TuitionPaymentFragmentbindingInflater1 || this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
            return this;
        }
        return null;
    }

    @Override // defpackage.Preview
    public final MetadataImageReaderExternalSyntheticLambda0 TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions + 87;
        disconnect = i2 % 128;
        int i3 = i2 % 2;
        MetadataImageReaderExternalSyntheticLambda0 metadataImageReaderExternalSyntheticLambda0B = MetadataImageReaderExternalSyntheticLambda0.b(this.g.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), null, this.notify, this.TuitionPaymentFragmentbindingInflater1, null, null, null, null, this.INotificationSideChannelDefault, this.INotificationSideChannelStub, null, null, null, 0L, 0L, false, 32377);
        int i4 = disconnect + 35;
        getNotifyChildrenChangedOptions = i4 % 128;
        if (i4 % 2 == 0) {
            return metadataImageReaderExternalSyntheticLambda0B;
        }
        throw null;
    }

    @Override // defpackage.Preview
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions + 25;
        disconnect = i2 % 128;
        if (i2 % 2 != 0) {
            return this.TuitionPaymentFragmentbindingInflater1;
        }
        throw null;
    }

    private final void TuitionPaymentFragmentbindingInflater1(long p0, StartReason p1) {
        int i = 2 % 2;
        boolean z = ((double) this.d.nextFloat()) < ((double) this.asInterface) / 100.0d;
        this.INotificationSideChannelStub = p1;
        this.INotificationSideChannelDefault = z ? State.TRACKED : State.NOT_TRACKED;
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        this.notify = string;
        this.RemoteActionCompatParcelizer.set(p0);
        if (!(!z)) {
            int i2 = getNotifyChildrenChangedOptions + 75;
            disconnect = i2 % 128;
            if (i2 % 2 == 0) {
                this.cancelAll.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.notify, p1, this.a.TuitionPaymentFragmentspecialinlinedviewModeldefault1().b, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                int i3 = 50 / 0;
            } else {
                this.cancelAll.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.notify, p1, this.a.TuitionPaymentFragmentspecialinlinedviewModeldefault1().b, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        }
        MetadataImageReader metadataImageReader = this.onTransact;
        if (metadataImageReader != null) {
            int i4 = getNotifyChildrenChangedOptions + 9;
            disconnect = i4 % 128;
            int i5 = i4 % 2;
            metadataImageReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.notify, !z);
        }
    }

    static {
        getItem = 1;
        TuitionPaymentFragmentbindingInflater1();
        INSTANCE = new Companion(null);
        asBinder = TimeUnit.MINUTES.toNanos(15L);
        g = TimeUnit.HOURS.toNanos(4L);
        int i = MediaBrowserCompat + 19;
        getItem = i % 128;
        int i2 = i % 2;
    }

    static void TuitionPaymentFragmentbindingInflater1() {
        connect = new char[]{10747, 37700, 23710, 6648, 49973, 35971, 18910, 13156, 64629, 47577, 25428, 11353, 59811, 21273, 7246, 55727, 33527, 19561, 2454, 62181, 48185, 31105, 45561, 2880, 50333, 33276, 23343, 5257, 53720, 43806, 25721, 8653, 64272, 46200, 29109, 51969, 33881, 36426, 13557, 64303, 48713, 25732, 11058, 61039, 38101, 23498, 7787, 50363, 35733, 20010, 62648, 48127, 32274, 9565, 60402, 44607, 21826, 7103, 56883, 34169, 19358, 3786, 46463, 64208, 16502, 36769, 51921, 4118, 24493, 39655, 57378, 12099, 27379, 45119, 65354, 14992, 32802, 53095, 2698, 20956, 40813, 32682, 50449, 2774, 20401, 38190, 56028, 8065, 25982, 43559, 61406, 13683, 31273, 49139, 1348, 18949, 36861, 45557, 2888, 50329, 33250, 23336, 5253, 53704, 43829, 25684, 8653, 64271, 46180, 29087, 51971, 33880, 16809};
        read = -8607766610503660756L;
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
    private static java.lang.String $$g(int r6, byte r7, short r8) {
        /*
            int r7 = r7 + 4
            int r6 = r6 * 4
            int r0 = 1 - r6
            byte[] r1 = com.datadog.android.rum.internal.domain.scope.RumSessionScope.$$c
            int r8 = r8 * 3
            int r8 = r8 + 109
            byte[] r0 = new byte[r0]
            r2 = 0
            int r6 = 0 - r6
            if (r1 != 0) goto L17
            r3 = r6
            r8 = r7
            r4 = r2
            goto L2e
        L17:
            r3 = r2
        L18:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L25:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r7 = -r7
            int r7 = r7 + r3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.datadog.android.rum.internal.domain.scope.RumSessionScope.$$g(int, byte, short):java.lang.String");
    }
}
