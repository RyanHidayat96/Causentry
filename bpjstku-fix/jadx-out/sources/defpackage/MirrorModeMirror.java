package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.context.DeviceType;
import com.datadog.android.api.context.NetworkInfo;
import com.datadog.android.api.storage.EventType;
import com.datadog.android.rum.GlobalRumMonitor;
import com.datadog.android.rum.RumErrorSource;
import com.datadog.android.rum.RumResourceKind;
import com.datadog.android.rum.RumResourceMethod;
import com.datadog.android.rum.model.ErrorEvent;
import com.datadog.android.rum.model.ResourceEvent;
import defpackage.AppCompatDelegateImplApi26Impl;
import defpackage.MirrorMode;
import defpackage.MirrorModeMirror;
import defpackage.PreviewBuilder;
import defpackage.getX;
import defpackage.lambdaanalyzeImage1androidxcameracoreImageAnalysisAbstractAnalyzer;
import defpackage.onSurfaceRequested;
import defpackage.recalculateTransformMatrixAndCropRect;
import defpackage.resetMinLogLevel;
import defpackage.setTimeoutInMillis;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000  2\u00020\u0001:\u0001 Bm\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\t0\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001a\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u001c2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\t0\u001dH\u0017¢\u0006\u0004\b\u001a\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\"\u0010#J9\u0010\"\u001a\u0004\u0018\u00010$2\b\u0010\u0002\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\"\u0010%JU\u0010 \u001a\u00020(2\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020&2\b\u0010\u0006\u001a\u0004\u0018\u00010\u000f2\b\u0010\b\u001a\u0004\u0018\u00010\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u00052\b\u0010\f\u001a\u0004\u0018\u00010'2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u001dH\u0002¢\u0006\u0004\b \u0010)JA\u0010+\u001a\u00020(2\u0006\u0010\u0002\u001a\u00020*2\b\u0010\u0004\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\b\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u001dH\u0002¢\u0006\u0004\b+\u0010,R\"\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\t0-8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\"\u001a\u00020\u000f8\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\b+\u00100R\u0014\u0010\u001a\u001a\u00020\u00138\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00105\u001a\u00020\u00118\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010+\u001a\u00020\u00198\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010:\u001a\u00020\t8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010.\u001a\u00020*8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020\u00078\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\b\"\u0010=R\u0014\u0010B\u001a\u00020?8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010E\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u00103\u001a\u00020\u00058\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\b5\u0010FR\u0014\u00101\u001a\u00020\u00158\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\b:\u0010GR\u0014\u0010;\u001a\u00020\u00038\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\b>\u0010HR\u0016\u00108\u001a\u00020\u001f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0018\u00106\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010@\u001a\u00020\u000f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bM\u00100R\u0018\u0010I\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bN\u0010LR\u0016\u0010C\u001a\u00020\u001f8\u0000@\u0000X\u0081\f¢\u0006\u0006\n\u0004\bE\u0010JR\u0018\u0010K\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010M\u001a\u00020\u00058\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\bB\u0010FR\u0016\u0010R\u001a\u00020\u001f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bR\u0010J"}, d2 = {"LMirrorModeMirror;", "LPreview;", "p0", "LImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0;", "p1", "", "p2", "Lcom/datadog/android/rum/RumResourceMethod;", "p3", "", "p4", "Llambdanew0androidxcameracoreMetadataImageReader;", "p5", "", "p6", "", "p7", "LsetJpegQuality;", "p8", "LresetMinLogLevel;", "p9", "", "p10", "<init>", "(LPreview;LImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0;Ljava/lang/String;Lcom/datadog/android/rum/RumResourceMethod;Ljava/lang/Object;Llambdanew0androidxcameracoreMetadataImageReader;Ljava/util/Map;JLsetJpegQuality;LresetMinLogLevel;F)V", "LMetadataImageReaderExternalSyntheticLambda0;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()LMetadataImageReaderExternalSyntheticLambda0;", "LgetPreviewCapabilities;", "LImageAnalysisNonBlockingAnalyzer1;", "(LgetPreviewCapabilities;LImageAnalysisNonBlockingAnalyzer1;)LPreview;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "()Z", "b", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/datadog/android/rum/model/ResourceEvent$INotificationSideChannelStub;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$INotificationSideChannelStub;", "Lcom/datadog/android/rum/RumErrorSource;", "Lcom/datadog/android/rum/model/ErrorEvent$Category;", "", "(Ljava/lang/String;Lcom/datadog/android/rum/RumErrorSource;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lcom/datadog/android/rum/model/ErrorEvent$Category;LImageAnalysisNonBlockingAnalyzer1;)V", "Lcom/datadog/android/rum/RumResourceKind;", "TuitionPaymentFragmentbindingInflater1", "(Lcom/datadog/android/rum/RumResourceKind;Ljava/lang/Long;Ljava/lang/Long;Llambdanew0androidxcameracoreMetadataImageReader;LImageAnalysisNonBlockingAnalyzer1;)V", "", "d", "Ljava/util/Map;", "J", "cancelAll", "LresetMinLogLevel;", "INotificationSideChannel", "LsetJpegQuality;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "notify", "LMetadataImageReaderExternalSyntheticLambda0;", "onTransact", "Ljava/lang/Object;", "g", "cancel", "Lcom/datadog/android/rum/RumResourceKind;", "Lcom/datadog/android/rum/RumResourceMethod;", "asInterface", "Lcom/datadog/android/api/context/NetworkInfo;", "INotificationSideChannelDefault", "Lcom/datadog/android/api/context/NetworkInfo;", "a", "getInterfaceDescriptor", "LPreview;", "asBinder", "Ljava/lang/String;", "F", "LImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0;", "INotificationSideChannelStubProxy", "Z", "RemoteActionCompatParcelizer", "Ljava/lang/Long;", "INotificationSideChannelStub", "read", "LgetX;", "write", "LgetX;", "connect"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class MirrorModeMirror implements Preview {
    private static int IconCompatParcelizer;
    private static char[] MediaBrowserCompat;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
    private final setJpegQuality TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: INotificationSideChannelDefault, reason: from kotlin metadata */
    private final NetworkInfo a;

    /* JADX INFO: renamed from: INotificationSideChannelStub, reason: from kotlin metadata */
    private final long INotificationSideChannelDefault;

    /* JADX INFO: renamed from: INotificationSideChannelStubProxy, reason: from kotlin metadata */
    private boolean onTransact;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private Long notify;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public final long b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public final String INotificationSideChannel;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final String INotificationSideChannelStub;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    public boolean getInterfaceDescriptor;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    public final ImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0 cancel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final RumResourceMethod asInterface;

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    private RumResourceKind d;

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    private final resetMinLogLevel TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private boolean connect;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Map<String, Object> TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final float cancelAll;

    /* JADX INFO: renamed from: getInterfaceDescriptor, reason: from kotlin metadata */
    private final Preview asBinder;

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    private final MetadataImageReaderExternalSyntheticLambda0 TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    private final Object g;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private Long INotificationSideChannelStubProxy;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private getX RemoteActionCompatParcelizer;
    private static final byte[] $$c = {73, 55, 58, 33};
    private static final int $$d = 36;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {29, -5, -24, -13, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
    private static final int $$b = 141;
    private static int getItem = 0;
    private static int disconnect = 1;
    private static int getNotifyChildrenChangedOptions = 1;

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = (~(i7 | i4)) | (~(i7 | i2)) | (~(i4 | i2));
        int i9 = (~(i | i2)) | i4;
        int i10 = (~(i2 | i | i4)) | (~(i7 | (~i4) | (~i2)));
        int i11 = i + i4 + i5 + (862446602 * i3) + (395103901 * i6);
        int i12 = i11 * i11;
        int i13 = (((-1892237052) * i) - 438566912) + ((-683246085) * i4) + (i8 * 402996989) + ((-805993978) * i9) + (402996989 * i10) + ((-1489240064) * i5) + ((-128450560) * i3) + ((-674496512) * i6) + ((-1108934656) * i12);
        int i14 = (i * 1384179468) + 550727958 + (i4 * 1384180977) + (i8 * TypedValues.PositionType.TYPE_PERCENT_WIDTH) + (i9 * (-1006)) + (i10 * TypedValues.PositionType.TYPE_PERCENT_WIDTH) + (i5 * 1384179971) + (i3 * 1640285726) + (i6 * 120803543) + (i12 * 2025127936);
        return i13 + ((i14 * i14) * (-275709952)) != 1 ? TuitionPaymentFragmentbindingInflater1(objArr) : TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
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
    private static void c(short r5, short r6, byte r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 * 14
            int r5 = 98 - r5
            int r0 = 53 - r7
            int r6 = r6 * 52
            int r6 = r6 + 4
            byte[] r1 = defpackage.MirrorModeMirror.$$a
            byte[] r0 = new byte[r0]
            int r7 = 52 - r7
            r2 = 0
            if (r1 != 0) goto L16
            r3 = r6
            r4 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r5
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L26:
            r3 = r1[r6]
        L28:
            int r6 = r6 + 1
            int r5 = r5 + r3
            int r5 = r5 + (-11)
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.MirrorModeMirror.c(short, short, byte, java.lang.Object[]):void");
    }

    public MirrorModeMirror(Preview preview, ImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0 imageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0, String str, RumResourceMethod rumResourceMethod, Object obj, lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader, Map<String, ? extends Object> map, long j, setJpegQuality setjpegquality, resetMinLogLevel resetminloglevel, float f) {
        Intrinsics.checkNotNullParameter(preview, "");
        Intrinsics.checkNotNullParameter(imageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(rumResourceMethod, "");
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(lambdanew0androidxcameracoremetadataimagereader, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(setjpegquality, "");
        Intrinsics.checkNotNullParameter(resetminloglevel, "");
        this.asBinder = preview;
        this.cancel = imageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0;
        this.INotificationSideChannelStub = str;
        this.asInterface = rumResourceMethod;
        this.g = obj;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = setjpegquality;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = resetminloglevel;
        this.cancelAll = f;
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        this.INotificationSideChannel = string;
        Map<String, Object> mutableMap = MapsKt.toMutableMap(map);
        mutableMap.putAll(GlobalRumMonitor.b(imageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0).b());
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = mutableMap;
        this.TuitionPaymentFragmentbindingInflater1 = preview.getA();
        this.b = lambdanew0androidxcameracoremetadataimagereader.b + j;
        this.INotificationSideChannelDefault = lambdanew0androidxcameracoremetadataimagereader.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        this.a = imageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0.INotificationSideChannel();
        this.d = RumResourceKind.UNKNOWN;
    }

    public static final /* synthetic */ long TuitionPaymentFragmentbindingInflater1(final MirrorModeMirror mirrorModeMirror, lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader) {
        int i = 2 % 2;
        int i2 = getItem + 115;
        disconnect = i2 % 128;
        int i3 = i2 % 2;
        long j = lambdanew0androidxcameracoremetadataimagereader.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - mirrorModeMirror.INotificationSideChannelDefault;
        if (j <= 0) {
            mirrorModeMirror.cancel.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.WARN, InternalLogger.Target.USER, new Function0<String>() { // from class: com.datadog.android.rum.internal.domain.scope.RumResourceScope$resolveResourceDuration$1
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    String str = String.format(Locale.US, "The computed duration for your resource: %s was 0 or negative. In order to keep the resource event we forced it to 1ns.", Arrays.copyOf(new Object[]{this.this$0.INotificationSideChannelStub}, 1));
                    Intrinsics.checkNotNullExpressionValue(str, "");
                    return str;
                }

                {
                    super(0);
                }
            }, null, false, null);
            int i4 = getItem + 31;
            disconnect = i4 % 128;
            int i5 = i4 % 2;
            j = 1;
        }
        int i6 = getItem + 93;
        disconnect = i6 % 128;
        int i7 = i6 % 2;
        return j;
    }

    public static final /* synthetic */ ResourceEvent.write TuitionPaymentFragmentbindingInflater1(MirrorModeMirror mirrorModeMirror) {
        int i = 2 % 2;
        int i2 = disconnect + 101;
        getItem = i2 % 128;
        int i3 = i2 % 2;
        if (!mirrorModeMirror.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(mirrorModeMirror.INotificationSideChannelStub)) {
            return null;
        }
        ResourceEvent.write writeVar = new ResourceEvent.write(b(mirrorModeMirror.INotificationSideChannelStub), null, ResourceEvent.ProviderType.FIRST_PARTY, 2, null);
        int i4 = getItem + 95;
        disconnect = i4 % 128;
        if (i4 % 2 != 0) {
            return writeVar;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003c, code lost:
    
        return new com.datadog.android.rum.model.ErrorEvent.IconCompatParcelizer(b(r6.INotificationSideChannelStub), null, com.datadog.android.rum.model.ErrorEvent.ProviderType.FIRST_PARTY, 2, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003d, code lost:
    
        r6 = defpackage.MirrorModeMirror.getItem + 67;
        defpackage.MirrorModeMirror.disconnect = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0047, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001e, code lost:
    
        if (r6.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(r6.INotificationSideChannelStub) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
    
        if (r6.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(r6.INotificationSideChannelStub) != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object TuitionPaymentFragmentbindingInflater1(java.lang.Object[] r6) {
        /*
            r0 = 0
            r6 = r6[r0]
            MirrorModeMirror r6 = (defpackage.MirrorModeMirror) r6
            r1 = 2
            int r2 = r1 % r1
            int r2 = defpackage.MirrorModeMirror.disconnect
            int r2 = r2 + 23
            int r3 = r2 % 128
            defpackage.MirrorModeMirror.getItem = r3
            int r2 = r2 % r1
            if (r2 == 0) goto L21
            setJpegQuality r2 = r6.TuitionPaymentFragmentspecialinlinedviewModeldefault2
            java.lang.String r3 = r6.INotificationSideChannelStub
            boolean r2 = r2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(r3)
            r3 = 34
            int r3 = r3 / r0
            if (r2 == 0) goto L3d
            goto L2b
        L21:
            setJpegQuality r0 = r6.TuitionPaymentFragmentspecialinlinedviewModeldefault2
            java.lang.String r2 = r6.INotificationSideChannelStub
            boolean r0 = r0.TuitionPaymentFragmentspecialinlinedviewModeldefault2(r2)
            if (r0 == 0) goto L3d
        L2b:
            java.lang.String r6 = r6.INotificationSideChannelStub
            java.lang.String r1 = b(r6)
            com.datadog.android.rum.model.ErrorEvent$ProviderType r3 = com.datadog.android.rum.model.ErrorEvent.ProviderType.FIRST_PARTY
            com.datadog.android.rum.model.ErrorEvent$IconCompatParcelizer r6 = new com.datadog.android.rum.model.ErrorEvent$IconCompatParcelizer
            r2 = 0
            r4 = 2
            r5 = 0
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
        L3d:
            int r6 = defpackage.MirrorModeMirror.getItem
            int r6 = r6 + 67
            int r0 = r6 % 128
            defpackage.MirrorModeMirror.disconnect = r0
            int r6 = r6 % r1
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.MirrorModeMirror.TuitionPaymentFragmentbindingInflater1(java.lang.Object[]):java.lang.Object");
    }

    public static final /* synthetic */ NetworkInfo TuitionPaymentFragmentspecialinlinedviewModeldefault1(MirrorModeMirror mirrorModeMirror) {
        int i = 2 % 2;
        int i2 = getItem + 85;
        disconnect = i2 % 128;
        int i3 = i2 % 2;
        NetworkInfo networkInfo = mirrorModeMirror.a;
        if (i3 != 0) {
            return networkInfo;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ resetMinLogLevel TuitionPaymentFragmentspecialinlinedviewModeldefault2(MirrorModeMirror mirrorModeMirror) {
        int i = 2 % 2;
        int i2 = disconnect + 49;
        getItem = i2 % 128;
        int i3 = i2 % 2;
        resetMinLogLevel resetminloglevel = mirrorModeMirror.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (i3 == 0) {
            return resetminloglevel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x009c A[PHI: r3
  0x009c: PHI (r3v8 getPreviewCapabilities$disconnect) = (r3v7 getPreviewCapabilities$disconnect), (r3v10 getPreviewCapabilities$disconnect) binds: [B:25:0x009a, B:22:0x008d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x00c4  */
    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) throws Throwable {
        getPreviewCapabilities.disconnect disconnectVar;
        MirrorModeMirror mirrorModeMirror = (MirrorModeMirror) objArr[0];
        getPreviewCapabilities getpreviewcapabilities = (getPreviewCapabilities) objArr[1];
        ImageAnalysisNonBlockingAnalyzer1<Object> imageAnalysisNonBlockingAnalyzer1 = (ImageAnalysisNonBlockingAnalyzer1) objArr[2];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(getpreviewcapabilities, "");
        Intrinsics.checkNotNullParameter(imageAnalysisNonBlockingAnalyzer1, "");
        Object obj = null;
        if (getpreviewcapabilities instanceof getPreviewCapabilities.search) {
            if (Intrinsics.areEqual(mirrorModeMirror.g, ((getPreviewCapabilities.search) getpreviewcapabilities).TuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
                mirrorModeMirror.connect = true;
            }
        } else if (!(!(getpreviewcapabilities instanceof getPreviewCapabilities.d))) {
            int i2 = disconnect + 47;
            getItem = i2 % 128;
            int i3 = i2 % 2;
            getPreviewCapabilities.d dVar = (getPreviewCapabilities.d) getpreviewcapabilities;
            if (!(!Intrinsics.areEqual(mirrorModeMirror.g, dVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2))) {
                int i4 = getItem + 53;
                disconnect = i4 % 128;
                int i5 = i4 % 2;
                mirrorModeMirror.RemoteActionCompatParcelizer = dVar.b;
                if (!(!mirrorModeMirror.getInterfaceDescriptor) && !mirrorModeMirror.onTransact) {
                    mirrorModeMirror.TuitionPaymentFragmentbindingInflater1(mirrorModeMirror.d, mirrorModeMirror.INotificationSideChannelStubProxy, mirrorModeMirror.notify, dVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1, imageAnalysisNonBlockingAnalyzer1);
                }
            }
        } else if (getpreviewcapabilities instanceof getPreviewCapabilities.disconnect) {
            int i6 = disconnect + 59;
            getItem = i6 % 128;
            if (i6 % 2 != 0) {
                disconnectVar = (getPreviewCapabilities.disconnect) getpreviewcapabilities;
                int i7 = 3 / 0;
                if (Intrinsics.areEqual(mirrorModeMirror.g, disconnectVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
                    int i8 = getItem + 113;
                    disconnect = i8 % 128;
                    int i9 = i8 % 2;
                    mirrorModeMirror.getInterfaceDescriptor = true;
                    mirrorModeMirror.TuitionPaymentFragmentspecialinlinedviewModeldefault1.putAll(disconnectVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    mirrorModeMirror.d = disconnectVar.b;
                    mirrorModeMirror.INotificationSideChannelStubProxy = disconnectVar.d;
                    mirrorModeMirror.notify = disconnectVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    if (mirrorModeMirror.connect || mirrorModeMirror.RemoteActionCompatParcelizer != null) {
                        mirrorModeMirror.TuitionPaymentFragmentbindingInflater1(mirrorModeMirror.d, disconnectVar.d, disconnectVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3, disconnectVar.TuitionPaymentFragmentbindingInflater1, imageAnalysisNonBlockingAnalyzer1);
                        int i10 = disconnect + 117;
                        getItem = i10 % 128;
                        int i11 = i10 % 2;
                    }
                }
            } else {
                disconnectVar = (getPreviewCapabilities.disconnect) getpreviewcapabilities;
                if (Intrinsics.areEqual(mirrorModeMirror.g, disconnectVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
                    int i12 = getItem + 113;
                    disconnect = i12 % 128;
                    int i13 = i12 % 2;
                    mirrorModeMirror.getInterfaceDescriptor = true;
                    mirrorModeMirror.TuitionPaymentFragmentspecialinlinedviewModeldefault1.putAll(disconnectVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    mirrorModeMirror.d = disconnectVar.b;
                    mirrorModeMirror.INotificationSideChannelStubProxy = disconnectVar.d;
                    mirrorModeMirror.notify = disconnectVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    if (mirrorModeMirror.connect) {
                        mirrorModeMirror.TuitionPaymentFragmentbindingInflater1(mirrorModeMirror.d, disconnectVar.d, disconnectVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3, disconnectVar.TuitionPaymentFragmentbindingInflater1, imageAnalysisNonBlockingAnalyzer1);
                        int i14 = disconnect + 117;
                        getItem = i14 % 128;
                        int i15 = i14 % 2;
                    } else {
                        mirrorModeMirror.TuitionPaymentFragmentbindingInflater1(mirrorModeMirror.d, disconnectVar.d, disconnectVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3, disconnectVar.TuitionPaymentFragmentbindingInflater1, imageAnalysisNonBlockingAnalyzer1);
                        int i16 = disconnect + 117;
                        getItem = i16 % 128;
                        int i17 = i16 % 2;
                    }
                }
            }
        } else if (getpreviewcapabilities instanceof getPreviewCapabilities.getExtras) {
            int i18 = disconnect + 25;
            getItem = i18 % 128;
            if (i18 % 2 != 0) {
                Intrinsics.areEqual(mirrorModeMirror.g, ((getPreviewCapabilities.getExtras) getpreviewcapabilities).TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                throw null;
            }
            getPreviewCapabilities.getExtras getextras = (getPreviewCapabilities.getExtras) getpreviewcapabilities;
            if (Intrinsics.areEqual(mirrorModeMirror.g, getextras.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
                mirrorModeMirror.TuitionPaymentFragmentspecialinlinedviewModeldefault1.putAll(getextras.TuitionPaymentFragmentbindingInflater1);
                mirrorModeMirror.TuitionPaymentFragmentspecialinlinedviewModeldefault1(getextras.TuitionPaymentFragmentspecialinlinedviewModeldefault3, getextras.TuitionPaymentFragmentspecialinlinedviewModeldefault2, getextras.g, downsample.TuitionPaymentFragmentspecialinlinedviewModeldefault2(getextras.d), getextras.d.getClass().getCanonicalName(), ErrorEvent.Category.EXCEPTION, imageAnalysisNonBlockingAnalyzer1);
            }
        } else if (getpreviewcapabilities instanceof getPreviewCapabilities.getNotifyChildrenChangedOptions) {
            int i19 = getItem + 57;
            disconnect = i19 % 128;
            int i20 = i19 % 2;
            getPreviewCapabilities.getNotifyChildrenChangedOptions getnotifychildrenchangedoptions = (getPreviewCapabilities.getNotifyChildrenChangedOptions) getpreviewcapabilities;
            if (Intrinsics.areEqual(mirrorModeMirror.g, getnotifychildrenchangedoptions.TuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
                int i21 = getItem + 75;
                disconnect = i21 % 128;
                if (i21 % 2 == 0) {
                    mirrorModeMirror.TuitionPaymentFragmentspecialinlinedviewModeldefault1.putAll(getnotifychildrenchangedoptions.b);
                    getnotifychildrenchangedoptions.asBinder.length();
                    obj.hashCode();
                    throw null;
                }
                mirrorModeMirror.TuitionPaymentFragmentspecialinlinedviewModeldefault1.putAll(getnotifychildrenchangedoptions.b);
                mirrorModeMirror.TuitionPaymentFragmentspecialinlinedviewModeldefault1(getnotifychildrenchangedoptions.TuitionPaymentFragmentspecialinlinedviewModeldefault1, getnotifychildrenchangedoptions.a, getnotifychildrenchangedoptions.d, getnotifychildrenchangedoptions.asBinder, getnotifychildrenchangedoptions.TuitionPaymentFragmentspecialinlinedviewModeldefault3, getnotifychildrenchangedoptions.asBinder.length() > 0 ? ErrorEvent.Category.EXCEPTION : null, imageAnalysisNonBlockingAnalyzer1);
            }
        }
        if (mirrorModeMirror.onTransact) {
            return null;
        }
        return mirrorModeMirror;
    }

    @Override // defpackage.Preview
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3 */
    public final MetadataImageReaderExternalSyntheticLambda0 getA() {
        int i = 2 % 2;
        int i2 = getItem + 9;
        int i3 = i2 % 128;
        disconnect = i3;
        int i4 = i2 % 2;
        MetadataImageReaderExternalSyntheticLambda0 metadataImageReaderExternalSyntheticLambda0 = this.TuitionPaymentFragmentbindingInflater1;
        int i5 = i3 + 123;
        getItem = i5 % 128;
        int i6 = i5 % 2;
        return metadataImageReaderExternalSyntheticLambda0;
    }

    @Override // defpackage.Preview
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = disconnect;
        int i3 = i2 + 51;
        getItem = i3 % 128;
        int i4 = i3 % 2;
        boolean z = !this.getInterfaceDescriptor;
        int i5 = i2 + 43;
        getItem = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    private static void e(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        char[] cArr;
        int i = 2 % 2;
        setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
        int i2 = 0;
        int i3 = iArr[0];
        int i4 = 1;
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr2 = MediaBrowserCompat;
        long j = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = new Object[i4];
                    objArr2[i2] = Integer.valueOf(cArr2[i8]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char c = (char) ((Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)) - 1);
                        int offsetBefore = TextUtils.getOffsetBefore("", i2) + 1270;
                        int iCombineMeasuredStates = View.combineMeasuredStates(i2, i2) + 18;
                        byte b = (byte) 5;
                        byte b2 = (byte) (b - 5);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, offsetBefore, iCombineMeasuredStates, 407021364, false, $$e(b, b2, b2), new Class[]{Integer.TYPE});
                    }
                    cArr3[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i8++;
                    i2 = 0;
                    i4 = 1;
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
        System.arraycopy(cArr2, i3, cArr4, 0, i5);
        if (bArr != null) {
            int i9 = $11 + 77;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                cArr = new char[i5];
                setvideostabilizationmode.b = 1;
            } else {
                cArr = new char[i5];
                setvideostabilizationmode.b = 0;
            }
            char c2 = 0;
            while (setvideostabilizationmode.b < i5) {
                int i10 = $11 + 87;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                if (bArr[setvideostabilizationmode.b] == 1) {
                    int i12 = $10 + 55;
                    $11 = i12 % 128;
                    int i13 = i12 % 2;
                    int i14 = setvideostabilizationmode.b;
                    Object[] objArr3 = {Integer.valueOf(cArr4[setvideostabilizationmode.b]), Integer.valueOf(c2)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b3 = (byte) 0;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), 3224 - TextUtils.indexOf((CharSequence) "", '0'), 13 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 2133916302, false, $$e((byte) 6, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr[i14] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                } else {
                    int i15 = setvideostabilizationmode.b;
                    Object[] objArr4 = {Integer.valueOf(cArr4[setvideostabilizationmode.b]), Integer.valueOf(c2)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cLastIndexOf = (char) (29943 - TextUtils.lastIndexOf("", '0', 0));
                        int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 1755;
                        int deadChar = KeyEvent.getDeadChar(0, 0) + 23;
                        byte length2 = (byte) $$c.length;
                        byte b4 = (byte) (length2 - 4);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cLastIndexOf, edgeSlop, deadChar, 387247676, false, $$e(length2, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr[i15] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                }
                c2 = cArr[setvideostabilizationmode.b];
                Object[] objArr5 = {setvideostabilizationmode, setvideostabilizationmode};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (41240 - MotionEvent.axisFromString("")), 1705 - (ViewConfiguration.getDoubleTapTimeout() >> 16), Process.getGidForName("") + 22, -1434471773, false, $$e(b5, b6, b6), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
            cArr4 = cArr;
        }
        if (i7 > 0) {
            char[] cArr5 = new char[i5];
            System.arraycopy(cArr4, 0, cArr5, 0, i5);
            int i16 = i5 - i7;
            System.arraycopy(cArr5, 0, cArr4, i16, i7);
            System.arraycopy(cArr5, i7, cArr4, 0, i16);
        }
        if (z) {
            int i17 = $10 + 75;
            $11 = i17 % 128;
            int i18 = i17 % 2;
            char[] cArr6 = new char[i5];
            int i19 = 0;
            while (true) {
                setvideostabilizationmode.b = i19;
                if (setvideostabilizationmode.b >= i5) {
                    break;
                }
                cArr6[setvideostabilizationmode.b] = cArr4[(i5 - setvideostabilizationmode.b) - 1];
                i19 = setvideostabilizationmode.b + 1;
            }
            cArr4 = cArr6;
        }
        if (i6 > 0) {
            int i20 = 0;
            while (true) {
                setvideostabilizationmode.b = i20;
                if (setvideostabilizationmode.b >= i5) {
                    break;
                }
                cArr4[setvideostabilizationmode.b] = (char) (cArr4[setvideostabilizationmode.b] - iArr[2]);
                i20 = setvideostabilizationmode.b + 1;
            }
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x008f  */
    private final void TuitionPaymentFragmentbindingInflater1(final RumResourceKind p0, final Long p1, final Long p2, final lambdanew0androidxcameracoreMetadataImageReader p3, ImageAnalysisNonBlockingAnalyzer1<Object> p4) throws Throwable {
        final String string;
        final Number number;
        ResourceEvent.getNotifyChildrenChangedOptions getnotifychildrenchangedoptions;
        ResourceEvent.ResourceEventSessionType resourceEventSessionType;
        String str;
        Map map;
        int i = 2 % 2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.putAll(GlobalRumMonitor.b(this.cancel).b());
        Object objRemove = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.remove("_dd.trace_id");
        final String string2 = objRemove != null ? objRemove.toString() : null;
        Object objRemove2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.remove("_dd.span_id");
        if (objRemove2 != null) {
            int i2 = getItem + 27;
            disconnect = i2 % 128;
            int i3 = i2 % 2;
            string = objRemove2.toString();
        } else {
            string = null;
        }
        Object objRemove3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.remove("_dd.rule_psr");
        if (objRemove3 instanceof Number) {
            int i4 = disconnect + 79;
            getItem = i4 % 128;
            int i5 = i4 % 2;
            number = (Number) objRemove3;
        } else {
            number = null;
        }
        final MetadataImageReaderExternalSyntheticLambda0 metadataImageReaderExternalSyntheticLambda0 = this.TuitionPaymentFragmentbindingInflater1;
        String str2 = metadataImageReaderExternalSyntheticLambda0.asBinder;
        if (str2 == null || StringsKt.isBlank(str2)) {
            getnotifychildrenchangedoptions = null;
        } else {
            int i6 = disconnect + 65;
            getItem = i6 % 128;
            int i7 = i6 % 2;
            String str3 = metadataImageReaderExternalSyntheticLambda0.g;
            if (str3 == null || StringsKt.isBlank(str3)) {
                getnotifychildrenchangedoptions = null;
            } else {
                getnotifychildrenchangedoptions = new ResourceEvent.getNotifyChildrenChangedOptions(metadataImageReaderExternalSyntheticLambda0.asBinder, metadataImageReaderExternalSyntheticLambda0.g, null, 4, null);
            }
        }
        if (getnotifychildrenchangedoptions == null) {
            int i8 = getItem + 87;
            disconnect = i8 % 128;
            if (i8 % 2 == 0) {
                ResourceEvent.ResourceEventSessionType resourceEventSessionType2 = ResourceEvent.ResourceEventSessionType.USER;
                throw null;
            }
            resourceEventSessionType = ResourceEvent.ResourceEventSessionType.USER;
        } else {
            resourceEventSessionType = ResourceEvent.ResourceEventSessionType.SYNTHETICS;
        }
        final ResourceEvent.ResourceEventSessionType resourceEventSessionType3 = resourceEventSessionType;
        getX getxB = this.RemoteActionCompatParcelizer;
        if (getxB == null) {
            int i9 = getItem + 63;
            disconnect = i9 % 128;
            int i10 = i9 % 2;
            Object objRemove4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.remove("_dd.resource_timings");
            if (objRemove4 instanceof Map) {
                map = (Map) objRemove4;
                int i11 = disconnect + 69;
                getItem = i11 % 128;
                int i12 = i11 % 2;
            } else {
                int i13 = disconnect + 67;
                getItem = i13 % 128;
                int i14 = i13 % 2;
                map = null;
            }
            getxB = createPoint.b(map);
        }
        final getX getx = getxB;
        Object objRemove5 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.remove("_dd.graphql.operation_type");
        if (!(!(objRemove5 instanceof String))) {
            int i15 = getItem + 63;
            disconnect = i15 % 128;
            if (i15 % 2 == 0) {
                throw null;
            }
            str = (String) objRemove5;
        } else {
            str = null;
        }
        Object objRemove6 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.remove("_dd.graphql.operation_name");
        String str4 = objRemove6 instanceof String ? (String) objRemove6 : null;
        Object objRemove7 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.remove("_dd.graphql.payload");
        String str5 = objRemove7 instanceof String ? (String) objRemove7 : null;
        Object objRemove8 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.remove("_dd.graphql.variables");
        final ResourceEvent.INotificationSideChannelStub iNotificationSideChannelStubB = b(str, str4, str5, objRemove8 instanceof String ? (String) objRemove8 : null);
        final Map mutableMap = MapsKt.toMutableMap(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        final ResourceEvent.getNotifyChildrenChangedOptions getnotifychildrenchangedoptions2 = getnotifychildrenchangedoptions;
        getStatus getstatusB = getExecutedTimeInMillis.b(this.cancel, p4, EventType.DEFAULT, new Function1<recalculateTransformMatrixAndCropRect, Object>() { // from class: com.datadog.android.rum.internal.domain.scope.RumResourceScope$sendResource$1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
            public final Object invoke(recalculateTransformMatrixAndCropRect recalculatetransformmatrixandcroprect) {
                ResourceEvent.ResourceType resourceType;
                ResourceEvent.Method method;
                ResourceEvent.RemoteActionCompatParcelizer remoteActionCompatParcelizer;
                ResourceEvent.a aVar;
                ResourceEvent.getItem getitem;
                ResourceEvent.INotificationSideChannelDefault iNotificationSideChannelDefault;
                ResourceEvent.getInterfaceDescriptor getinterfacedescriptor;
                ResourceEvent.getExtras getextras;
                ResourceEvent.Status status;
                List listListOf;
                ResourceEvent.DeviceType deviceType;
                ResourceEvent.SessionPrecondition sessionPrecondition;
                Intrinsics.checkNotNullParameter(recalculatetransformmatrixandcroprect, "");
                lambdaanalyzeImage1androidxcameracoreImageAnalysisAbstractAnalyzer lambdaanalyzeimage1androidxcameracoreimageanalysisabstractanalyzer = recalculatetransformmatrixandcroprect.INotificationSideChannel;
                MirrorModeMirror.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.this$0);
                String str6 = metadataImageReaderExternalSyntheticLambda0.d;
                if (str6 == null) {
                    str6 = "";
                }
                boolean zTuitionPaymentFragmentspecialinlinedviewModeldefault1 = resetMinLogLevel.TuitionPaymentFragmentspecialinlinedviewModeldefault1(recalculatetransformmatrixandcroprect, str6);
                long jTuitionPaymentFragmentbindingInflater1 = MirrorModeMirror.TuitionPaymentFragmentbindingInflater1(this.this$0, p3);
                long j = this.this$0.b;
                String str7 = this.this$0.INotificationSideChannel;
                RumResourceKind rumResourceKind = p0;
                Intrinsics.checkNotNullParameter(rumResourceKind, "");
                switch (MirrorMode.WhenMappings.$EnumSwitchMapping$1[rumResourceKind.ordinal()]) {
                    case 1:
                        resourceType = ResourceEvent.ResourceType.BEACON;
                        break;
                    case 2:
                        resourceType = ResourceEvent.ResourceType.FETCH;
                        break;
                    case 3:
                        resourceType = ResourceEvent.ResourceType.XHR;
                        break;
                    case 4:
                        resourceType = ResourceEvent.ResourceType.DOCUMENT;
                        break;
                    case 5:
                        resourceType = ResourceEvent.ResourceType.IMAGE;
                        break;
                    case 6:
                        resourceType = ResourceEvent.ResourceType.JS;
                        break;
                    case 7:
                        resourceType = ResourceEvent.ResourceType.FONT;
                        break;
                    case 8:
                        resourceType = ResourceEvent.ResourceType.CSS;
                        break;
                    case 9:
                        resourceType = ResourceEvent.ResourceType.MEDIA;
                        break;
                    case 10:
                        resourceType = ResourceEvent.ResourceType.NATIVE;
                        break;
                    case 11:
                    case 12:
                        resourceType = ResourceEvent.ResourceType.OTHER;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                ResourceEvent.ResourceType resourceType2 = resourceType;
                String str8 = this.this$0.INotificationSideChannelStub;
                RumResourceMethod rumResourceMethod = this.this$0.asInterface;
                Intrinsics.checkNotNullParameter(rumResourceMethod, "");
                switch (MirrorMode.WhenMappings.$EnumSwitchMapping$0[rumResourceMethod.ordinal()]) {
                    case 1:
                        method = ResourceEvent.Method.GET;
                        break;
                    case 2:
                        method = ResourceEvent.Method.POST;
                        break;
                    case 3:
                        method = ResourceEvent.Method.HEAD;
                        break;
                    case 4:
                        method = ResourceEvent.Method.PUT;
                        break;
                    case 5:
                        method = ResourceEvent.Method.DELETE;
                        break;
                    case 6:
                        method = ResourceEvent.Method.PATCH;
                        break;
                    case 7:
                        method = ResourceEvent.Method.TRACE;
                        break;
                    case 8:
                        method = ResourceEvent.Method.OPTIONS;
                        break;
                    case 9:
                        method = ResourceEvent.Method.CONNECT;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                ResourceEvent.Method method2 = method;
                getX getx2 = getx;
                if (getx2 != null) {
                    Intrinsics.checkNotNullParameter(getx2, "");
                    remoteActionCompatParcelizer = getx2.b > 0 ? new ResourceEvent.RemoteActionCompatParcelizer(getx2.TuitionPaymentFragmentspecialinlinedviewModeldefault3, getx2.b) : null;
                } else {
                    lambdaanalyzeimage1androidxcameracoreimageanalysisabstractanalyzer = lambdaanalyzeimage1androidxcameracoreimageanalysisabstractanalyzer;
                    zTuitionPaymentFragmentspecialinlinedviewModeldefault1 = zTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    remoteActionCompatParcelizer = null;
                }
                getX getx3 = getx;
                if (getx3 != null) {
                    Intrinsics.checkNotNullParameter(getx3, "");
                    aVar = getx3.TuitionPaymentFragmentspecialinlinedviewModeldefault1 > 0 ? new ResourceEvent.a(getx3.TuitionPaymentFragmentspecialinlinedviewModeldefault2, getx3.TuitionPaymentFragmentspecialinlinedviewModeldefault1) : null;
                } else {
                    aVar = null;
                }
                getX getx4 = getx;
                if (getx4 != null) {
                    Intrinsics.checkNotNullParameter(getx4, "");
                    getitem = getx4.a > 0 ? new ResourceEvent.getItem(getx4.asBinder, getx4.a) : null;
                } else {
                    getitem = null;
                }
                getX getx5 = getx;
                if (getx5 != null) {
                    Intrinsics.checkNotNullParameter(getx5, "");
                    iNotificationSideChannelDefault = (getx5.d < 0 || getx5.g <= 0) ? null : new ResourceEvent.INotificationSideChannelDefault(getx5.g, getx5.d);
                } else {
                    iNotificationSideChannelDefault = null;
                }
                getX getx6 = getx;
                if (getx6 != null) {
                    Intrinsics.checkNotNullParameter(getx6, "");
                    getinterfacedescriptor = getx6.asInterface > 0 ? new ResourceEvent.getInterfaceDescriptor(getx6.TuitionPaymentFragmentbindingInflater1, getx6.asInterface) : null;
                } else {
                    getinterfacedescriptor = null;
                }
                ResourceEvent.MediaBrowserCompat mediaBrowserCompat = new ResourceEvent.MediaBrowserCompat(str7, resourceType2, method2, str8, p1, Long.valueOf(jTuitionPaymentFragmentbindingInflater1), p2, null, remoteActionCompatParcelizer, aVar, getitem, iNotificationSideChannelDefault, getinterfacedescriptor, MirrorModeMirror.TuitionPaymentFragmentbindingInflater1(this.this$0), iNotificationSideChannelStubB, 128, null);
                String str9 = metadataImageReaderExternalSyntheticLambda0.b;
                ResourceEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = str9 != null ? new ResourceEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault3(CollectionsKt.listOf(str9)) : null;
                String str10 = metadataImageReaderExternalSyntheticLambda0.d;
                String str11 = str10 == null ? "" : str10;
                String str12 = metadataImageReaderExternalSyntheticLambda0.onTransact;
                String str13 = metadataImageReaderExternalSyntheticLambda0.INotificationSideChannel;
                ResourceEvent.IconCompatParcelizer iconCompatParcelizer = new ResourceEvent.IconCompatParcelizer(str11, null, str13 == null ? "" : str13, str12, 2, null);
                if (setTimeoutInMillis.TuitionPaymentFragmentspecialinlinedviewModeldefault1(lambdaanalyzeimage1androidxcameracoreimageanalysisabstractanalyzer)) {
                    lambdaanalyzeImage1androidxcameracoreImageAnalysisAbstractAnalyzer lambdaanalyzeimage1androidxcameracoreimageanalysisabstractanalyzer2 = lambdaanalyzeimage1androidxcameracoreimageanalysisabstractanalyzer;
                    getextras = new ResourceEvent.getExtras(lambdaanalyzeimage1androidxcameracoreimageanalysisabstractanalyzer2.b, lambdaanalyzeimage1androidxcameracoreimageanalysisabstractanalyzer2.TuitionPaymentFragmentspecialinlinedviewModeldefault2, lambdaanalyzeimage1androidxcameracoreimageanalysisabstractanalyzer2.TuitionPaymentFragmentbindingInflater1, MapsKt.toMutableMap(lambdaanalyzeimage1androidxcameracoreimageanalysisabstractanalyzer2.TuitionPaymentFragmentspecialinlinedviewModeldefault3));
                } else {
                    getextras = null;
                }
                NetworkInfo networkInfoTuitionPaymentFragmentspecialinlinedviewModeldefault1 = MirrorModeMirror.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.this$0);
                Intrinsics.checkNotNullParameter(networkInfoTuitionPaymentFragmentspecialinlinedviewModeldefault1, "");
                Intrinsics.checkNotNullParameter(networkInfoTuitionPaymentFragmentspecialinlinedviewModeldefault1, "");
                if (networkInfoTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1 != NetworkInfo.Connectivity.NETWORK_NOT_CONNECTED) {
                    status = ResourceEvent.Status.CONNECTED;
                } else {
                    status = ResourceEvent.Status.NOT_CONNECTED;
                }
                ResourceEvent.Status status2 = status;
                switch (MirrorMode.WhenMappings.$EnumSwitchMapping$5[networkInfoTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1.ordinal()]) {
                    case 1:
                        listListOf = CollectionsKt.listOf(ResourceEvent.Interface.ETHERNET);
                        break;
                    case 2:
                        listListOf = CollectionsKt.listOf(ResourceEvent.Interface.WIFI);
                        break;
                    case 3:
                        listListOf = CollectionsKt.listOf(ResourceEvent.Interface.WIMAX);
                        break;
                    case 4:
                        listListOf = CollectionsKt.listOf(ResourceEvent.Interface.BLUETOOTH);
                        break;
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                        listListOf = CollectionsKt.listOf(ResourceEvent.Interface.CELLULAR);
                        break;
                    case 11:
                        listListOf = CollectionsKt.listOf(ResourceEvent.Interface.OTHER);
                        break;
                    case 12:
                        listListOf = CollectionsKt.emptyList();
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                ResourceEvent.g gVar = new ResourceEvent.g(status2, listListOf, null, (networkInfoTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == null && networkInfoTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) ? null : new ResourceEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault2(networkInfoTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2, networkInfoTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1), 4, null);
                ResourceEvent.b bVar = new ResourceEvent.b(metadataImageReaderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                ResourceEvent.connect connectVar = new ResourceEvent.connect(metadataImageReaderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1, resourceEventSessionType3, Boolean.valueOf(zTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                ResourceEvent.ResourceEventSource resourceEventSourceB = MirrorMode.b(ResourceEvent.ResourceEventSource.INSTANCE, recalculatetransformmatrixandcroprect.cancelAll, this.this$0.cancel.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
                ResourceEvent.INotificationSideChannelStubProxy iNotificationSideChannelStubProxy = new ResourceEvent.INotificationSideChannelStubProxy(recalculatetransformmatrixandcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault3.f251a, recalculatetransformmatrixandcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault3.d, null, recalculatetransformmatrixandcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault3.g, 4, null);
                DeviceType deviceType2 = recalculatetransformmatrixandcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault3.asInterface;
                Intrinsics.checkNotNullParameter(deviceType2, "");
                int i16 = MirrorMode.WhenMappings.$EnumSwitchMapping$6[deviceType2.ordinal()];
                if (i16 == 1) {
                    deviceType = ResourceEvent.DeviceType.MOBILE;
                } else if (i16 == 2) {
                    deviceType = ResourceEvent.DeviceType.TABLET;
                } else if (i16 == 3) {
                    deviceType = ResourceEvent.DeviceType.TV;
                } else if (i16 == 4) {
                    deviceType = ResourceEvent.DeviceType.DESKTOP;
                } else {
                    deviceType = ResourceEvent.DeviceType.OTHER;
                }
                ResourceEvent.notify notifyVar = new ResourceEvent.notify(deviceType, recalculatetransformmatrixandcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1, recalculatetransformmatrixandcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2, recalculatetransformmatrixandcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1, recalculatetransformmatrixandcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                ResourceEvent.INotificationSideChannel iNotificationSideChannel = new ResourceEvent.INotificationSideChannel(mutableMap);
                RumSessionScope.StartReason startReason = metadataImageReaderExternalSyntheticLambda0.a;
                Intrinsics.checkNotNullParameter(startReason, "");
                switch (MirrorMode.WhenMappings.$EnumSwitchMapping$7[startReason.ordinal()]) {
                    case 1:
                        sessionPrecondition = ResourceEvent.SessionPrecondition.USER_APP_LAUNCH;
                        break;
                    case 2:
                        sessionPrecondition = ResourceEvent.SessionPrecondition.INACTIVITY_TIMEOUT;
                        break;
                    case 3:
                        sessionPrecondition = ResourceEvent.SessionPrecondition.MAX_DURATION;
                        break;
                    case 4:
                        sessionPrecondition = ResourceEvent.SessionPrecondition.EXPLICIT_STOP;
                        break;
                    case 5:
                        sessionPrecondition = ResourceEvent.SessionPrecondition.BACKGROUND_LAUNCH;
                        break;
                    case 6:
                        sessionPrecondition = ResourceEvent.SessionPrecondition.PREWARM;
                        break;
                    case 7:
                        sessionPrecondition = ResourceEvent.SessionPrecondition.FROM_NON_INTERACTIVE_SESSION;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                return new ResourceEvent(j, bVar, recalculatetransformmatrixandcroprect.asInterface, recalculatetransformmatrixandcroprect.getInterfaceDescriptor, null, null, connectVar, resourceEventSourceB, iconCompatParcelizer, getextras, gVar, null, getnotifychildrenchangedoptions2, null, iNotificationSideChannelStubProxy, notifyVar, new ResourceEvent.cancelAll(new ResourceEvent.cancel(null, sessionPrecondition, 1, null), new ResourceEvent.d(Float.valueOf(this.this$0.cancelAll), null, 2, null), null, string, string2, number, null, 68, null), iNotificationSideChannel, tuitionPaymentFragmentspecialinlinedviewModeldefault3, null, mediaBrowserCompat, 534576, null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        });
        Function1<PreviewBuilder, Unit> function1 = new Function1<PreviewBuilder, Unit>() { // from class: com.datadog.android.rum.internal.domain.scope.RumResourceScope$sendResource$2
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(PreviewBuilder previewBuilder) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3(previewBuilder);
                return Unit.INSTANCE;
            }

            public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(PreviewBuilder previewBuilder) {
                Intrinsics.checkNotNullParameter(previewBuilder, "");
                String str6 = metadataImageReaderExternalSyntheticLambda0.d;
                previewBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str6 != null ? str6 : "", onSurfaceRequested.TuitionPaymentFragmentbindingInflater1.INSTANCE);
            }

            {
                super(1);
            }
        };
        Intrinsics.checkNotNullParameter(function1, "");
        getstatusB.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = function1;
        Function1<PreviewBuilder, Unit> function2 = new Function1<PreviewBuilder, Unit>() { // from class: com.datadog.android.rum.internal.domain.scope.RumResourceScope$sendResource$3
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(PreviewBuilder previewBuilder) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault1(previewBuilder);
                return Unit.INSTANCE;
            }

            public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(PreviewBuilder previewBuilder) {
                Intrinsics.checkNotNullParameter(previewBuilder, "");
                String str6 = metadataImageReaderExternalSyntheticLambda0.d;
                previewBuilder.TuitionPaymentFragmentbindingInflater1(str6 != null ? str6 : "", onSurfaceRequested.TuitionPaymentFragmentbindingInflater1.INSTANCE);
            }

            {
                super(1);
            }
        };
        Intrinsics.checkNotNullParameter(function2, "");
        getstatusB.TuitionPaymentFragmentbindingInflater1 = function2;
        getstatusB.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        this.onTransact = true;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0054  */
    /* JADX WARN: Code duplicated, block: B:9:0x0050 A[PHI: r1
  0x0050: PHI (r1v7 java.lang.Object) = (r1v6 java.lang.Object), (r1v24 java.lang.Object) binds: [B:8:0x004e, B:5:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(final String p0, final RumErrorSource p1, final Long p2, final String p3, final String p4, final ErrorEvent.Category p5, ImageAnalysisNonBlockingAnalyzer1<Object> p6) {
        Object objRemove;
        final String str;
        ErrorEvent.ErrorEventSessionType errorEventSessionType;
        String str2;
        int i = 2 % 2;
        int i2 = getItem + 63;
        disconnect = i2 % 128;
        ErrorEvent.MediaBrowserCompat mediaBrowserCompat = null;
        if (i2 % 2 == 0) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.putAll(GlobalRumMonitor.b(this.cancel).b());
            objRemove = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.remove("_dd.error.fingerprint");
            int i3 = 68 / 0;
            if (objRemove instanceof String) {
                str = (String) objRemove;
            } else {
                str = null;
            }
        } else {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.putAll(GlobalRumMonitor.b(this.cancel).b());
            objRemove = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.remove("_dd.error.fingerprint");
            if (!(!(objRemove instanceof String))) {
                str = (String) objRemove;
            } else {
                str = null;
            }
        }
        final MetadataImageReaderExternalSyntheticLambda0 metadataImageReaderExternalSyntheticLambda0 = this.TuitionPaymentFragmentbindingInflater1;
        final Map mutableMap = MapsKt.toMutableMap(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        String str3 = metadataImageReaderExternalSyntheticLambda0.asBinder;
        if (str3 != null && !StringsKt.isBlank(str3) && (str2 = metadataImageReaderExternalSyntheticLambda0.g) != null) {
            int i4 = getItem + 13;
            disconnect = i4 % 128;
            int i5 = i4 % 2;
            if (!StringsKt.isBlank(str2)) {
                mediaBrowserCompat = new ErrorEvent.MediaBrowserCompat(metadataImageReaderExternalSyntheticLambda0.asBinder, metadataImageReaderExternalSyntheticLambda0.g, null, 4, null);
            }
        }
        final ErrorEvent.MediaBrowserCompat mediaBrowserCompat2 = mediaBrowserCompat;
        if (mediaBrowserCompat2 == null) {
            errorEventSessionType = ErrorEvent.ErrorEventSessionType.USER;
        } else {
            errorEventSessionType = ErrorEvent.ErrorEventSessionType.SYNTHETICS;
        }
        final ErrorEvent.ErrorEventSessionType errorEventSessionType2 = errorEventSessionType;
        getStatus getstatusB = getExecutedTimeInMillis.b(this.cancel, p6, EventType.DEFAULT, new Function1<recalculateTransformMatrixAndCropRect, Object>() { // from class: com.datadog.android.rum.internal.domain.scope.RumResourceScope$sendError$1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: merged with bridge method [inline-methods] */
            public final Object invoke(recalculateTransformMatrixAndCropRect recalculatetransformmatrixandcroprect) {
                ErrorEvent.Method method;
                Intrinsics.checkNotNullParameter(recalculatetransformmatrixandcroprect, "");
                lambdaanalyzeImage1androidxcameracoreImageAnalysisAbstractAnalyzer lambdaanalyzeimage1androidxcameracoreimageanalysisabstractanalyzer = recalculatetransformmatrixandcroprect.INotificationSideChannel;
                MirrorModeMirror.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.this$0);
                String str4 = metadataImageReaderExternalSyntheticLambda0.d;
                if (str4 == null) {
                    str4 = "";
                }
                boolean zTuitionPaymentFragmentspecialinlinedviewModeldefault1 = resetMinLogLevel.TuitionPaymentFragmentspecialinlinedviewModeldefault1(recalculatetransformmatrixandcroprect, str4);
                String str5 = recalculatetransformmatrixandcroprect.b;
                long j = this.this$0.b;
                ErrorEvent.ErrorSource errorSourceTuitionPaymentFragmentspecialinlinedviewModeldefault1 = MirrorMode.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p1);
                String str6 = this.this$0.INotificationSideChannelStub;
                RumResourceMethod rumResourceMethod = this.this$0.asInterface;
                Intrinsics.checkNotNullParameter(rumResourceMethod, "");
                switch (MirrorMode.WhenMappings.$EnumSwitchMapping$0[rumResourceMethod.ordinal()]) {
                    case 1:
                        method = ErrorEvent.Method.GET;
                        break;
                    case 2:
                        method = ErrorEvent.Method.POST;
                        break;
                    case 3:
                        method = ErrorEvent.Method.HEAD;
                        break;
                    case 4:
                        method = ErrorEvent.Method.PUT;
                        break;
                    case 5:
                        method = ErrorEvent.Method.DELETE;
                        break;
                    case 6:
                        method = ErrorEvent.Method.PATCH;
                        break;
                    case 7:
                        method = ErrorEvent.Method.TRACE;
                        break;
                    case 8:
                        method = ErrorEvent.Method.OPTIONS;
                        break;
                    case 9:
                        method = ErrorEvent.Method.CONNECT;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                ErrorEvent.Method method2 = method;
                Long l = p2;
                ErrorEvent.read readVar = new ErrorEvent.read(method2, l != null ? l.longValue() : 0L, str6, (ErrorEvent.IconCompatParcelizer) MirrorModeMirror.TuitionPaymentFragmentspecialinlinedviewModeldefault2(1118271240, new Object[]{this.this$0}, AppCompatDelegateImplApi26Impl.TuitionPaymentFragmentbindingInflater1(), AppCompatDelegateImplApi26Impl.TuitionPaymentFragmentbindingInflater1(), -1118271240, AppCompatDelegateImplApi26Impl.TuitionPaymentFragmentbindingInflater1(), AppCompatDelegateImplApi26Impl.TuitionPaymentFragmentbindingInflater1()));
                ErrorEvent.RemoteActionCompatParcelizer remoteActionCompatParcelizer = new ErrorEvent.RemoteActionCompatParcelizer(null, p0, errorSourceTuitionPaymentFragmentspecialinlinedviewModeldefault1, p3, null, Boolean.FALSE, str, p4, p5, null, null, ErrorEvent.SourceType.ANDROID, readVar, null, null, null, null, null, 255505, null);
                String str7 = metadataImageReaderExternalSyntheticLambda0.b;
                ErrorEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = str7 != null ? new ErrorEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault1(CollectionsKt.listOf(str7)) : null;
                String str8 = metadataImageReaderExternalSyntheticLambda0.d;
                String str9 = str8 == null ? "" : str8;
                String str10 = metadataImageReaderExternalSyntheticLambda0.onTransact;
                String str11 = metadataImageReaderExternalSyntheticLambda0.INotificationSideChannel;
                ErrorEvent.INotificationSideChannelStub iNotificationSideChannelStub = new ErrorEvent.INotificationSideChannelStub(str9, null, str11 == null ? "" : str11, str10, null, 18, null);
                ErrorEvent.getItem getitem = setTimeoutInMillis.TuitionPaymentFragmentspecialinlinedviewModeldefault1(lambdaanalyzeimage1androidxcameracoreimageanalysisabstractanalyzer) ? new ErrorEvent.getItem(lambdaanalyzeimage1androidxcameracoreimageanalysisabstractanalyzer.b, lambdaanalyzeimage1androidxcameracoreimageanalysisabstractanalyzer.TuitionPaymentFragmentspecialinlinedviewModeldefault2, lambdaanalyzeimage1androidxcameracoreimageanalysisabstractanalyzer.TuitionPaymentFragmentbindingInflater1, MapsKt.toMutableMap(lambdaanalyzeimage1androidxcameracoreimageanalysisabstractanalyzer.TuitionPaymentFragmentspecialinlinedviewModeldefault3)) : null;
                ErrorEvent.asInterface asinterfaceB = MirrorMode.b(MirrorModeMirror.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.this$0));
                return new ErrorEvent(j, new ErrorEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault3(metadataImageReaderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2), recalculatetransformmatrixandcroprect.asInterface, recalculatetransformmatrixandcroprect.getInterfaceDescriptor, null, str5, new ErrorEvent.INotificationSideChannelDefault(metadataImageReaderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1, errorEventSessionType2, Boolean.valueOf(zTuitionPaymentFragmentspecialinlinedviewModeldefault1)), MirrorMode.TuitionPaymentFragmentbindingInflater1(ErrorEvent.ErrorEventSource.INSTANCE, recalculatetransformmatrixandcroprect.cancelAll, this.this$0.cancel.TuitionPaymentFragmentspecialinlinedviewModeldefault3()), iNotificationSideChannelStub, getitem, asinterfaceB, null, mediaBrowserCompat2, null, new ErrorEvent.write(recalculatetransformmatrixandcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault3.f251a, recalculatetransformmatrixandcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault3.d, null, recalculatetransformmatrixandcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault3.g, 4, null), new ErrorEvent.onTransact(MirrorMode.TuitionPaymentFragmentbindingInflater1(recalculatetransformmatrixandcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault3.asInterface), recalculatetransformmatrixandcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1, recalculatetransformmatrixandcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2, recalculatetransformmatrixandcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1, recalculatetransformmatrixandcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3), new ErrorEvent.INotificationSideChannel(new ErrorEvent.cancel(null, MirrorMode.b(metadataImageReaderExternalSyntheticLambda0.a), 1, null), new ErrorEvent.a(Float.valueOf(this.this$0.cancelAll), null, 2, null), null, 4, null), new ErrorEvent.notify(mutableMap), tuitionPaymentFragmentspecialinlinedviewModeldefault1, null, remoteActionCompatParcelizer, null, 2631696, null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        });
        Function1<PreviewBuilder, Unit> function1 = new Function1<PreviewBuilder, Unit>() { // from class: com.datadog.android.rum.internal.domain.scope.RumResourceScope$sendError$2
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(PreviewBuilder previewBuilder) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3(previewBuilder);
                return Unit.INSTANCE;
            }

            public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(PreviewBuilder previewBuilder) {
                Intrinsics.checkNotNullParameter(previewBuilder, "");
                String str4 = metadataImageReaderExternalSyntheticLambda0.d;
                previewBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str4 != null ? str4 : "", onSurfaceRequested.b.INSTANCE);
            }

            {
                super(1);
            }
        };
        Intrinsics.checkNotNullParameter(function1, "");
        getstatusB.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = function1;
        Function1<PreviewBuilder, Unit> function2 = new Function1<PreviewBuilder, Unit>() { // from class: com.datadog.android.rum.internal.domain.scope.RumResourceScope$sendError$3
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(PreviewBuilder previewBuilder) {
                b(previewBuilder);
                return Unit.INSTANCE;
            }

            public final void b(PreviewBuilder previewBuilder) {
                Intrinsics.checkNotNullParameter(previewBuilder, "");
                String str4 = metadataImageReaderExternalSyntheticLambda0.d;
                previewBuilder.TuitionPaymentFragmentbindingInflater1(str4 != null ? str4 : "", onSurfaceRequested.b.INSTANCE);
            }

            {
                super(1);
            }
        };
        Intrinsics.checkNotNullParameter(function2, "");
        getstatusB.TuitionPaymentFragmentbindingInflater1 = function2;
        getstatusB.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        this.onTransact = true;
    }

    private static String b(String p0) {
        int i = 2 % 2;
        try {
            String host = new URL(p0).getHost();
            Intrinsics.checkNotNullExpressionValue(host, "");
            int i2 = getItem + 81;
            disconnect = i2 % 128;
            int i3 = i2 % 2;
            return host;
        } catch (MalformedURLException unused) {
            return p0;
        }
    }

    /* JADX INFO: renamed from: MirrorModeMirror$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JG\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013"}, d2 = {"LMirrorModeMirror$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "LPreview;", "p0", "LImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0;", "p1", "LgetPreviewCapabilities$write;", "p2", "LsetJpegQuality;", "p3", "", "p4", "LresetMinLogLevel;", "p5", "", "p6", "TuitionPaymentFragmentbindingInflater1", "(LPreview;LImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0;LgetPreviewCapabilities$write;LsetJpegQuality;JLresetMinLogLevel;F)LPreview;"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static Preview TuitionPaymentFragmentbindingInflater1(Preview p0, ImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0 p1, getPreviewCapabilities.write p2, setJpegQuality p3, long p4, resetMinLogLevel p5, float p6) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            Intrinsics.checkNotNullParameter(p2, "");
            Intrinsics.checkNotNullParameter(p3, "");
            Intrinsics.checkNotNullParameter(p5, "");
            return new MirrorModeMirror(p0, p1, p2.b, p2.TuitionPaymentFragmentbindingInflater1, p2.TuitionPaymentFragmentspecialinlinedviewModeldefault1, p2.TuitionPaymentFragmentspecialinlinedviewModeldefault2, p2.TuitionPaymentFragmentspecialinlinedviewModeldefault3, p4, p3, p5, p6);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x04ed A[PHI: r0
  0x04ed: PHI (r0v4 com.datadog.android.rum.model.ResourceEvent$OperationType) = 
  (r0v3 com.datadog.android.rum.model.ResourceEvent$OperationType)
  (r0v10 com.datadog.android.rum.model.ResourceEvent$OperationType)
 binds: [B:51:0x04eb, B:48:0x04de] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x0504  */
    private final ResourceEvent.INotificationSideChannelStub b(String p0, String p1, String p2, String p3) throws Throwable {
        Object[] objArr;
        ResourceEvent.OperationType operationTypeTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i;
        int i2 = 2 % 2;
        int i3 = disconnect + 27;
        getItem = i3 % 128;
        int i4 = i3 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char offsetAfter = (char) TextUtils.getOffsetAfter("", 0);
            int iKeyCodeFromString = 651 - KeyEvent.keyCodeFromString("");
            int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 44;
            byte[] bArr = $$a;
            byte b = bArr[80];
            byte b2 = bArr[7];
            Object[] objArr2 = new Object[1];
            c(b, b2, b2, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(offsetAfter, iKeyCodeFromString, iIndexOf, -459846511, false, (String) objArr2[0], null);
        }
        ResourceEvent.INotificationSideChannelStub iNotificationSideChannelStub = null;
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new int[]{0, 22, 137, 0}, true, new byte[]{0, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new int[]{22, 15, 0, 0}, true, new byte[]{1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char packedPositionChild = (char) ((-1) - ExpandableListView.getPackedPositionChild(0L));
            int iAxisFromString = 650 - MotionEvent.axisFromString("");
            int gidForName = Process.getGidForName("") + 45;
            byte[] bArr2 = $$a;
            Object[] objArr5 = new Object[1];
            c(bArr2[7], bArr2[80], (byte) 52, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(packedPositionChild, iAxisFromString, gidForName, -873460649, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i5 = disconnect + 63;
            getItem = i5 % 128;
            int i6 = i5 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
                int offsetAfter2 = 651 - TextUtils.getOffsetAfter("", 0);
                int iIndexOf2 = TextUtils.indexOf("", "") + 44;
                byte b3 = $$a[80];
                byte b4 = b3;
                Object[] objArr6 = new Object[1];
                c(b3, b4, (byte) (b4 | 14), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(packedPositionGroup, offsetAfter2, iIndexOf2, -1595579076, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i7 = ((int[]) objArr7[2])[0];
            int i8 = ((int[]) objArr7[0])[0];
            int iNextInt = new Random().nextInt();
            int i9 = (~((-465384774) | iNextInt)) | 3482692;
            int i10 = (-1698250455) + (i9 * 992) + ((i9 | (~((~iNextInt) | (-51883)))) * (-496)) + ((iNextInt | (-461953964)) * 496) + 2117751138;
            int i11 = (i10 << 13) ^ i10;
            int i12 = i11 ^ (i11 >>> 17);
            ((int[]) objArr[3])[0] = i12 ^ (i12 << 5);
        } else {
            try {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), KeyEvent.keyCodeFromString("") + 1610, ((byte) KeyEvent.getModifierMetaStateMask()) + 27, 2145681644, false, null, new Class[0]);
                }
                Object[] objArr8 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(null), 2117751138, 0};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    int i13 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 651;
                    int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 44;
                    byte[] bArr3 = $$a;
                    Object[] objArr9 = new Object[1];
                    c(bArr3[7], bArr3[80], (byte) 52, objArr9);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(maximumFlingVelocity, i13, jumpTapTimeout, 2075921419, false, (String) objArr9[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) KeyEvent.normalizeMetaState(0), 695 - Drawable.resolveOpacity(0, 0), TextUtils.getCapsMode("", 0, 0) + 98), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (63406 - (ViewConfiguration.getJumpTapTimeout() >> 16)), AndroidCharacter.getMirror('0') + 745, (ViewConfiguration.getJumpTapTimeout() >> 16) + 83), Integer.TYPE, Integer.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr8);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char packedPositionChild2 = (char) (ExpandableListView.getPackedPositionChild(0L) + 1);
                    int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 651;
                    int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 44;
                    byte b5 = $$a[80];
                    byte b6 = b5;
                    Object[] objArr10 = new Object[1];
                    c(b5, b6, (byte) (b6 | 14), objArr10);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(packedPositionChild2, packedPositionType, fadingEdgeLength, -1595579076, false, (String) objArr10[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr11 = new Object[1];
                    e(new int[]{0, 22, 137, 0}, true, new byte[]{0, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1}, objArr11);
                    Class<?> cls2 = Class.forName((String) objArr11[0]);
                    Object[] objArr12 = new Object[1];
                    e(new int[]{22, 15, 0, 0}, true, new byte[]{1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1}, objArr12);
                    long jLongValue2 = ((Long) cls2.getDeclaredMethod((String) objArr12[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char offsetAfter3 = (char) TextUtils.getOffsetAfter("", 0);
                        int offsetAfter4 = TextUtils.getOffsetAfter("", 0) + 651;
                        int jumpTapTimeout2 = 44 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                        byte[] bArr4 = $$a;
                        Object[] objArr13 = new Object[1];
                        c(bArr4[7], bArr4[80], (byte) 52, objArr13);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(offsetAfter3, offsetAfter4, jumpTapTimeout2, -873460649, false, (String) objArr13[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                        int iKeyCodeFromString2 = KeyEvent.keyCodeFromString("") + 651;
                        int iGreen = 44 - Color.green(0);
                        byte[] bArr5 = $$a;
                        byte b7 = bArr5[80];
                        byte b8 = bArr5[7];
                        Object[] objArr14 = new Object[1];
                        c(b7, b8, b8, objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(pressedStateDuration, iKeyCodeFromString2, iGreen, -459846511, false, (String) objArr14[0], null);
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
        int i14 = ((int[]) objArr[0])[0];
        int i15 = ((int[]) objArr[2])[0];
        if (i15 == i14) {
            Object[] objArr15 = {new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i16 = ((int[]) objArr[3])[0];
            int i17 = ((int[]) objArr[2])[0];
            int i18 = ((int[]) objArr[0])[0];
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i19 = i16 + (-1972715175) + (((~(813241660 | iUptimeMillis)) | 8678082) * 576) + (((~((~iUptimeMillis) | 821919742)) | 807994388) * 576) + 703607936;
            int i20 = (i19 << 13) ^ i19;
            int i21 = i20 ^ (i20 >>> 17);
            ((int[]) objArr15[3])[0] = i21 ^ (i21 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[1];
            if (strArr != null) {
                int i22 = getItem + 87;
                disconnect = i22 % 128;
                int i23 = 2;
                int i24 = i22 % 2;
                int i25 = 0;
                while (i25 < strArr.length) {
                    int i26 = getItem + 67;
                    disconnect = i26 % 128;
                    int i27 = i26 % i23;
                    arrayList.add(strArr[i25]);
                    i25++;
                    i23 = 2;
                }
            }
            Toast.makeText((Context) null, i15 / (((i15 - 1) * i15) % 2), 0).show();
            Object[] objArr16 = {new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i28 = ((int[]) objArr[3])[0];
            int i29 = ((int[]) objArr[2])[0];
            int i30 = ((int[]) objArr[0])[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i31 = ~iIdentityHashCode;
            int i32 = i28 + (-1777159062) + (((~((-978633661) | i31)) | (-975202851)) * 519) + (((~(i31 | (-973095457))) | (~((-2107395) | iIdentityHashCode))) * (-519)) + (((~(iIdentityHashCode | (-975202851))) | 978633660) * 519);
            int i33 = (i32 << 13) ^ i32;
            int i34 = i33 ^ (i33 >>> 17);
            ((int[]) objArr16[3])[0] = i34 ^ (i34 << 5);
        }
        if (p0 != null) {
            int i35 = disconnect + 95;
            getItem = i35 % 128;
            if (i35 % 2 != 0) {
                operationTypeTuitionPaymentFragmentspecialinlinedviewModeldefault2 = MirrorMode.TuitionPaymentFragmentspecialinlinedviewModeldefault2(p0, this.cancel.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
                int i36 = 36 / 0;
                if (operationTypeTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                    iNotificationSideChannelStub = new ResourceEvent.INotificationSideChannelStub(operationTypeTuitionPaymentFragmentspecialinlinedviewModeldefault2, p1, p2, p3);
                    i = getItem + 11;
                    disconnect = i % 128;
                    if (i % 2 == 0) {
                        int i37 = 90 / 0;
                    }
                }
            } else {
                operationTypeTuitionPaymentFragmentspecialinlinedviewModeldefault2 = MirrorMode.TuitionPaymentFragmentspecialinlinedviewModeldefault2(p0, this.cancel.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
                if (operationTypeTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                    iNotificationSideChannelStub = new ResourceEvent.INotificationSideChannelStub(operationTypeTuitionPaymentFragmentspecialinlinedviewModeldefault2, p1, p2, p3);
                    i = getItem + 11;
                    disconnect = i % 128;
                    if (i % 2 == 0) {
                        int i38 = 90 / 0;
                    }
                }
            }
        }
        return iNotificationSideChannelStub;
    }

    static {
        IconCompatParcelizer = 0;
        b();
        INSTANCE = new Companion(null);
        int i = getNotifyChildrenChangedOptions + 45;
        IconCompatParcelizer = i % 128;
        if (i % 2 != 0) {
            int i2 = 68 / 0;
        }
    }

    public static final /* synthetic */ ErrorEvent.IconCompatParcelizer TuitionPaymentFragmentspecialinlinedviewModeldefault3(MirrorModeMirror mirrorModeMirror) {
        return (ErrorEvent.IconCompatParcelizer) TuitionPaymentFragmentspecialinlinedviewModeldefault2(1118271240, new Object[]{mirrorModeMirror}, AppCompatDelegateImplApi26Impl.TuitionPaymentFragmentbindingInflater1(), AppCompatDelegateImplApi26Impl.TuitionPaymentFragmentbindingInflater1(), -1118271240, AppCompatDelegateImplApi26Impl.TuitionPaymentFragmentbindingInflater1(), AppCompatDelegateImplApi26Impl.TuitionPaymentFragmentbindingInflater1());
    }

    @Override // defpackage.Preview
    public final Preview TuitionPaymentFragmentspecialinlinedviewModeldefault3(getPreviewCapabilities p0, ImageAnalysisNonBlockingAnalyzer1<Object> p1) {
        return (Preview) TuitionPaymentFragmentspecialinlinedviewModeldefault2(322466828, new Object[]{this, p0, p1}, AppCompatDelegateImplApi26Impl.TuitionPaymentFragmentbindingInflater1(), AppCompatDelegateImplApi26Impl.TuitionPaymentFragmentbindingInflater1(), -322466827, AppCompatDelegateImplApi26Impl.TuitionPaymentFragmentbindingInflater1(), AppCompatDelegateImplApi26Impl.TuitionPaymentFragmentbindingInflater1());
    }

    static void b() {
        MediaBrowserCompat = new char[]{59761, 59899, 59897, 59901, 59883, 59882, 59897, 59902, 59895, 59892, 59876, 59842, 59858, 59889, 59868, 59865, 59876, 59902, 59890, 59903, 59897, 59899, 59705, 59746, 59744, 59749, 59771, 59757, 59752, 59728, 59728, 59759, 59751, 59770, 59747, 59757, 59747};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0020
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(int r5, int r6, short r7) {
        /*
            int r7 = r7 * 4
            int r0 = r7 + 1
            int r5 = 105 - r5
            byte[] r1 = defpackage.MirrorModeMirror.$$c
            int r6 = r6 * 4
            int r6 = 4 - r6
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L14
            r4 = r7
            r3 = r2
            goto L24
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r5
            r0[r3] = r4
            if (r3 != r7) goto L20
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L20:
            int r3 = r3 + 1
            r4 = r1[r6]
        L24:
            int r4 = -r4
            int r5 = r5 + r4
            int r6 = r6 + 1
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.MirrorModeMirror.$$e(int, int, short):java.lang.String");
    }
}
