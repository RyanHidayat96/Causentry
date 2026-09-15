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
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.datadog.android.api.context.NetworkInfo;
import com.datadog.android.api.storage.EventType;
import com.datadog.android.rum.GlobalRumMonitor;
import com.datadog.android.rum.RumActionType;
import com.datadog.android.rum.model.ActionEvent;
import com.google.android.material.internal.ViewUtils;
import defpackage.MirrorMode;
import defpackage.PreviewBuilder;
import defpackage.ZExternalSyntheticLambda1;
import defpackage.abortCapture;
import defpackage.initSession;
import defpackage.lambdaanalyzeImage1androidxcameracoreImageAnalysisAbstractAnalyzer;
import defpackage.recalculateTransformMatrixAndCropRect;
import defpackage.resetMinLogLevel;
import defpackage.setOrVerifyExpectFrameRateRange;
import defpackage.setTimeoutInMillis;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u0000 %2\u00020\u0001:\u0001%B\u0083\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0005\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010\u001c\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u001e2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001fH\u0017¢\u0006\u0004\b\u001c\u0010 J\u000f\u0010!\u001a\u00020\u0005H\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010\u001c\u001a\u00020#2\u0006\u0010\u0002\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001c\u0010$J%\u0010%\u001a\u00020#2\u0006\u0010\u0002\u001a\u00020\u00102\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001fH\u0002¢\u0006\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020\u000b8\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\b!\u0010'R\"\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000e0)8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010%\u001a\u00020\u00108\u0000@\u0000X\u0081\f¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010\u001c\u001a\u00020\u00108\u0000@\u0000X\u0081\f¢\u0006\u0006\n\u0004\b(\u0010-R\u0014\u0010,\u001a\u00020\u00108\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\b.\u0010-R\u0014\u00101\u001a\u00020\u00148\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00103\u001a\u00020\u00108\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b2\u0010-R\u0016\u0010.\u001a\u00020\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b4\u0010-R\u0016\u00105\u001a\u00020\u00108\u0000@\u0000X\u0081\f¢\u0006\u0006\n\u0004\b5\u0010-R\u0014\u00107\u001a\u00020\u00108\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b6\u0010-R\u0016\u0010/\u001a\u00020\u000b8\u0000@\u0000X\u0081\f¢\u0006\u0006\n\u0004\b3\u0010'R\u0014\u00102\u001a\u0002088\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b9\u0010:R \u0010?\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0<0;8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010B\u001a\u00020\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010*\u001a\u00020\u00108\u0000@\u0000X\u0081\f¢\u0006\u0006\n\u0004\b7\u0010-R\u0014\u0010=\u001a\u00020\u00178\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\b1\u0010CR\u0014\u0010@\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u00104\u001a\u00020\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u00106\u001a\u00020\u00108\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bH\u0010-R\u0016\u00109\u001a\u00020\u00058\u0000@\u0000X\u0081\f¢\u0006\u0006\n\u0004\b?\u0010GR\u0014\u0010J\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bI\u0010GR\u0016\u0010H\u001a\u00020\t8\u0000@\u0000X\u0081\f¢\u0006\u0006\n\u0004\bB\u0010KR\u0014\u0010I\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bJ\u0010G"}, d2 = {"LgetDefaultPointSize;", "LPreview;", "p0", "LImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0;", "p1", "", "p2", "Llambdanew0androidxcameracoreMetadataImageReader;", "p3", "Lcom/datadog/android/rum/RumActionType;", "p4", "", "p5", "", "", "p6", "", "p7", "p8", "p9", "LresetMinLogLevel;", "p10", "p11", "", "p12", "<init>", "(LPreview;LImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0;ZLlambdanew0androidxcameracoreMetadataImageReader;Lcom/datadog/android/rum/RumActionType;Ljava/lang/String;Ljava/util/Map;JJJLresetMinLogLevel;ZF)V", "LMetadataImageReaderExternalSyntheticLambda0;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()LMetadataImageReaderExternalSyntheticLambda0;", "LgetPreviewCapabilities;", "LImageAnalysisNonBlockingAnalyzer1;", "(LgetPreviewCapabilities;LImageAnalysisNonBlockingAnalyzer1;)LPreview;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "()Z", "", "(Ljava/lang/Object;J)V", "b", "(JLImageAnalysisNonBlockingAnalyzer1;)V", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "", "INotificationSideChannel", "Ljava/util/Map;", "TuitionPaymentFragmentbindingInflater1", "J", "asInterface", "onTransact", "LresetMinLogLevel;", "g", "cancel", "d", "INotificationSideChannelStub", "asBinder", "RemoteActionCompatParcelizer", "a", "Lcom/datadog/android/api/context/NetworkInfo;", "getInterfaceDescriptor", "Lcom/datadog/android/api/context/NetworkInfo;", "", "Ljava/lang/ref/WeakReference;", "INotificationSideChannelStubProxy", "Ljava/util/List;", "cancelAll", "INotificationSideChannelDefault", "LPreview;", "notify", "F", "read", "LImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0;", "write", "Z", "connect", "IconCompatParcelizer", "MediaBrowserCompat", "Lcom/datadog/android/rum/RumActionType;"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class getDefaultPointSize implements Preview {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
    private final Map<String, Object> TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: INotificationSideChannelDefault, reason: from kotlin metadata */
    private final Preview notify;

    /* JADX INFO: renamed from: INotificationSideChannelStub, reason: from kotlin metadata */
    private long asInterface;

    /* JADX INFO: renamed from: INotificationSideChannelStubProxy, reason: from kotlin metadata */
    private final List<WeakReference<Object>> cancelAll;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final boolean MediaBrowserCompat;

    /* JADX INFO: renamed from: MediaBrowserCompat, reason: from kotlin metadata */
    private final boolean IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final long a;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public long b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public long TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public long INotificationSideChannel;
    public long asBinder;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    public final long TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    private final long d;

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    public boolean getInterfaceDescriptor;

    /* JADX INFO: renamed from: connect, reason: from kotlin metadata */
    private final long RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public String onTransact;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final float INotificationSideChannelStubProxy;

    /* JADX INFO: renamed from: getInterfaceDescriptor, reason: from kotlin metadata */
    private final NetworkInfo cancel;

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    public RumActionType connect;

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    private final resetMinLogLevel g;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final ImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0 INotificationSideChannelDefault;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private boolean INotificationSideChannelStub;

    private getDefaultPointSize(Preview preview, ImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0 imageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0, boolean z, lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader, RumActionType rumActionType, String str, Map<String, ? extends Object> map, long j, long j2, long j3, resetMinLogLevel resetminloglevel, boolean z2, float f) {
        Intrinsics.checkNotNullParameter(preview, "");
        Intrinsics.checkNotNullParameter(imageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(lambdanew0androidxcameracoremetadataimagereader, "");
        Intrinsics.checkNotNullParameter(rumActionType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(resetminloglevel, "");
        this.notify = preview;
        this.INotificationSideChannelDefault = imageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0;
        this.IconCompatParcelizer = z;
        this.g = resetminloglevel;
        this.MediaBrowserCompat = z2;
        this.INotificationSideChannelStubProxy = f;
        this.d = TimeUnit.MILLISECONDS.toNanos(j2);
        this.a = TimeUnit.MILLISECONDS.toNanos(j3);
        this.TuitionPaymentFragmentbindingInflater1 = lambdanew0androidxcameracoremetadataimagereader.b + j;
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = string;
        this.connect = rumActionType;
        this.onTransact = str;
        long j4 = lambdanew0androidxcameracoremetadataimagereader.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        this.RemoteActionCompatParcelizer = j4;
        this.asInterface = j4;
        this.cancel = imageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0.INotificationSideChannel();
        Map<String, Object> mutableMap = MapsKt.toMutableMap(map);
        mutableMap.putAll(GlobalRumMonitor.b(imageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0).b());
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = mutableMap;
        this.cancelAll = new ArrayList();
    }

    public /* synthetic */ getDefaultPointSize(Preview preview, ImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0 imageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0, boolean z, lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader, RumActionType rumActionType, String str, Map map, long j, long j2, long j3, resetMinLogLevel resetminloglevel, boolean z2, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(preview, imageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0, z, lambdanew0androidxcameracoremetadataimagereader, rumActionType, str, map, j, (i & 256) != 0 ? 100L : j2, (i & 512) != 0 ? 5000L : j3, (i & 1024) != 0 ? new resetMinLogLevel() : resetminloglevel, z2, f);
    }

    @Override // defpackage.Preview
    public final Preview TuitionPaymentFragmentspecialinlinedviewModeldefault3(getPreviewCapabilities p0, ImageAnalysisNonBlockingAnalyzer1<Object> p1) {
        Object next;
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        long j = p0.getTuitionPaymentFragmentspecialinlinedviewModeldefault2().TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        boolean z = false;
        boolean z2 = j - this.asInterface > this.d;
        boolean z3 = j - this.RemoteActionCompatParcelizer > this.a;
        CollectionsKt.removeAll((List) this.cancelAll, (Function1) new Function1<WeakReference<Object>, Boolean>() { // from class: com.datadog.android.rum.internal.domain.scope.RumActionScope$handleEvent$1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(WeakReference<Object> weakReference) {
                Intrinsics.checkNotNullParameter(weakReference, "");
                return Boolean.valueOf(weakReference.get() == null);
            }
        });
        if (this.IconCompatParcelizer && !this.getInterfaceDescriptor) {
            z = true;
        }
        if (z2 && this.cancelAll.isEmpty() && !z) {
            b(this.asInterface, p1);
        } else if (z3) {
            b(j, p1);
        } else if (p0 instanceof getPreviewCapabilities.INotificationSideChannelDefault) {
            b(this.asInterface, p1);
        } else if (!(p0 instanceof getPreviewCapabilities.read) && !(p0 instanceof getPreviewCapabilities.getItem) && !(p0 instanceof getPreviewCapabilities.getRoot)) {
            if (!(p0 instanceof getPreviewCapabilities.IconCompatParcelizer)) {
                if (!(p0 instanceof getPreviewCapabilities.write)) {
                    if (!(p0 instanceof getPreviewCapabilities.disconnect)) {
                        if (!(p0 instanceof getPreviewCapabilities.TuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
                            if (p0 instanceof getPreviewCapabilities.getExtras) {
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3(((getPreviewCapabilities.getExtras) p0).TuitionPaymentFragmentspecialinlinedviewModeldefault1, j);
                            } else if (p0 instanceof getPreviewCapabilities.getNotifyChildrenChangedOptions) {
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3(((getPreviewCapabilities.getNotifyChildrenChangedOptions) p0).TuitionPaymentFragmentspecialinlinedviewModeldefault2, j);
                            } else if (p0 instanceof getPreviewCapabilities.g) {
                                this.asInterface = j;
                                this.asBinder++;
                            }
                        } else {
                            this.asInterface = j;
                            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                            if (((getPreviewCapabilities.TuitionPaymentFragmentspecialinlinedviewModeldefault2) p0).TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                                this.b++;
                                b(j, p1);
                            }
                        }
                    } else {
                        getPreviewCapabilities.disconnect disconnectVar = (getPreviewCapabilities.disconnect) p0;
                        Iterator<T> it = this.cancelAll.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (!Intrinsics.areEqual(((WeakReference) next).get(), disconnectVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2));
                        WeakReference weakReference = (WeakReference) next;
                        if (weakReference != null) {
                            this.cancelAll.remove(weakReference);
                            this.asInterface = j;
                        }
                    }
                } else {
                    this.asInterface = j;
                    this.INotificationSideChannel++;
                    this.cancelAll.add(new WeakReference<>(((getPreviewCapabilities.write) p0).TuitionPaymentFragmentspecialinlinedviewModeldefault1));
                }
            } else {
                getPreviewCapabilities.IconCompatParcelizer iconCompatParcelizer = (getPreviewCapabilities.IconCompatParcelizer) p0;
                RumActionType rumActionType = iconCompatParcelizer.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (rumActionType != null) {
                    this.connect = rumActionType;
                }
                String str = iconCompatParcelizer.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                if (str != null) {
                    this.onTransact = str;
                }
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.putAll(iconCompatParcelizer.TuitionPaymentFragmentbindingInflater1);
                this.getInterfaceDescriptor = true;
                this.asInterface = j;
            }
        } else {
            this.cancelAll.clear();
            b(j, p1);
        }
        if (this.INotificationSideChannelStub) {
            return null;
        }
        return this;
    }

    @Override // defpackage.Preview
    public final MetadataImageReaderExternalSyntheticLambda0 TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return this.notify.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
    }

    @Override // defpackage.Preview
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return !this.getInterfaceDescriptor;
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object p0, long p1) {
        Object next;
        Iterator<T> it = this.cancelAll.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((WeakReference) next).get(), p0));
        WeakReference weakReference = (WeakReference) next;
        if (weakReference != null) {
            this.cancelAll.remove(weakReference);
            this.asInterface = p1;
            this.INotificationSideChannel--;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
        }
    }

    private final void b(final long p0, ImageAnalysisNonBlockingAnalyzer1<Object> p1) {
        ActionEvent.ActionEventSessionType actionEventSessionType;
        String str;
        if (this.INotificationSideChannelStub) {
            return;
        }
        final RumActionType rumActionType = this.connect;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.putAll(GlobalRumMonitor.b(this.INotificationSideChannelDefault).b());
        final Map mutableMap = MapsKt.toMutableMap(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        final MetadataImageReaderExternalSyntheticLambda0 metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.notify.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        final String str2 = this.onTransact;
        final long j = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        final long j2 = this.b;
        final long j3 = this.asBinder;
        final long j4 = this.INotificationSideChannel;
        String str3 = metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault3.asBinder;
        final ActionEvent.getNotifyChildrenChangedOptions getnotifychildrenchangedoptions = (str3 == null || StringsKt.isBlank(str3) || (str = metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault3.g) == null || StringsKt.isBlank(str)) ? null : new ActionEvent.getNotifyChildrenChangedOptions(metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault3.asBinder, metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault3.g, null, 4, null);
        if (getnotifychildrenchangedoptions == null) {
            actionEventSessionType = ActionEvent.ActionEventSessionType.USER;
        } else {
            actionEventSessionType = ActionEvent.ActionEventSessionType.SYNTHETICS;
        }
        final ActionEvent.ActionEventSessionType actionEventSessionType2 = actionEventSessionType;
        final ArrayList arrayList = new ArrayList();
        if (this.MediaBrowserCompat && j > 0 && rumActionType == RumActionType.TAP) {
            arrayList.add(ActionEvent.Type.ERROR_TAP);
        }
        getStatus getstatusB = getExecutedTimeInMillis.b(this.INotificationSideChannelDefault, p1, EventType.DEFAULT, new Function1<recalculateTransformMatrixAndCropRect, Object>() { // from class: com.datadog.android.rum.internal.domain.scope.RumActionScope$sendAction$1
            private static final byte[] $$c = {22, 102, 43, -6};
            private static final int $$f = 153;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$d = {22, 102, 43, -6, 26, -2, 7, 30, -4, -17, 47, -1, 17, 9, -4, 30, 7, 29, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
            private static final int $$e = 73;
            private static final byte[] $$a = {92, 126, -38, -95, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
            private static final int $$b = 160;
            private static int $TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            private static int $b = 1;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -83722401;

            /* JADX WARN: Code duplicated, block: B:10:0x0028  */
            /* JADX WARN: Code duplicated, block: B:8:0x0020  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void a(short r7, int r8, byte r9, java.lang.Object[] r10) {
                /*
                    int r7 = r7 * 15
                    int r7 = r7 + 38
                    int r8 = r8 + 4
                    byte[] r0 = com.datadog.android.rum.internal.domain.scope.RumActionScope$sendAction$1.$$a
                    int r9 = r9 * 4
                    int r9 = r9 + 84
                    byte[] r1 = new byte[r7]
                    r2 = 0
                    if (r0 != 0) goto L15
                    r3 = r9
                    r4 = r2
                    r9 = r8
                    goto L2a
                L15:
                    r3 = r2
                    r6 = r9
                    r9 = r8
                    r8 = r6
                L19:
                    int r4 = r3 + 1
                    byte r5 = (byte) r8
                    r1[r3] = r5
                    if (r4 != r7) goto L28
                    java.lang.String r7 = new java.lang.String
                    r7.<init>(r1, r2)
                    r10[r2] = r7
                    return
                L28:
                    r3 = r0[r9]
                L2a:
                    int r3 = -r3
                    int r8 = r8 + r3
                    int r8 = r8 + (-11)
                    int r9 = r9 + 1
                    r3 = r4
                    goto L19
                */
                throw new UnsupportedOperationException("Method not decompiled: com.datadog.android.rum.internal.domain.scope.RumActionScope$sendAction$1.a(short, int, byte, java.lang.Object[]):void");
            }

            private static void c(short s, byte b, byte b2, Object[] objArr) {
                int i = 99 - (b * 15);
                int i2 = b2 * 38;
                int i3 = s + 4;
                byte[] bArr = $$d;
                byte[] bArr2 = new byte[i2 + 15];
                int i4 = i2 + 14;
                int i5 = -1;
                if (bArr == null) {
                    i = (i + i4) - 11;
                }
                while (true) {
                    i5++;
                    bArr2[i5] = (byte) i;
                    if (i5 == i4) {
                        objArr[0] = new String(bArr2, 0);
                        return;
                    } else {
                        i3++;
                        i = (i + bArr[i3]) - 11;
                    }
                }
            }

            /* JADX WARN: Code duplicated, block: B:35:0x0183  */
            /* JADX WARN: Code duplicated, block: B:36:0x0184  */
            private static void b(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
                int i4;
                char[] cArr2;
                Throwable cause;
                int i5 = 2 % 2;
                setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
                char[] cArr3 = new char[i2];
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                while (true) {
                    i4 = 29209604;
                    if (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= i2) {
                        break;
                    }
                    int i6 = $10 + 81;
                    $11 = i6 % 128;
                    int i7 = i6 % 2;
                    setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    cArr3[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    int i8 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr3[i8]), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char c = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1);
                            int i9 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 3290;
                            int trimmedLength = 31 - TextUtils.getTrimmedLength("");
                            byte b = (byte) ($$f & 7);
                            byte b2 = (byte) (b - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, i9, trimmedLength, 1199271174, false, $$g(b, b2, b2), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr3[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 650, (ViewConfiguration.getEdgeSlop() >> 16) + 44, -450685997, false, $$g(b3, b4, b4), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
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
                if (i3 > 0) {
                    setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
                    char[] cArr4 = new char[i2];
                    System.arraycopy(cArr3, 0, cArr4, 0, i2);
                    System.arraycopy(cArr4, 0, cArr3, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
                    System.arraycopy(cArr4, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr3, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
                    int i10 = $11 + 7;
                    $10 = i10 % 128;
                    int i11 = i10 % 2;
                }
                if (z) {
                    int i12 = $11 + 71;
                    $10 = i12 % 128;
                    if (i12 % 2 != 0) {
                        cArr2 = new char[i2];
                        setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                    } else {
                        cArr2 = new char[i2];
                        setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                    }
                    while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                        cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                        Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b5 = (byte) 0;
                            byte b6 = b5;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 651, 44 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), -450685997, false, $$g(b5, b6, b6), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                        i4 = 29209604;
                    }
                    cArr3 = cArr2;
                }
                objArr[0] = new String(cArr3);
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Object invoke(recalculateTransformMatrixAndCropRect recalculatetransformmatrixandcroprect) throws Throwable {
                int i = 2 % 2;
                int i2 = $b + 63;
                $TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
                int i3 = i2 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(recalculatetransformmatrixandcroprect);
                if (i3 != 0) {
                    int i4 = 22 / 0;
                }
                int i5 = $TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 83;
                $b = i5 % 128;
                int i6 = i5 % 2;
                return objTuitionPaymentFragmentspecialinlinedviewModeldefault1;
            }

            /* JADX WARN: Code duplicated, block: B:50:0x036b  */
            public final Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(recalculateTransformMatrixAndCropRect recalculatetransformmatrixandcroprect) throws Throwable {
                ActionEvent.ActionEventActionType actionEventActionType;
                String str4;
                Object[] objArr;
                Object[] objArr2;
                ActionEvent.getRoot getroot;
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(recalculatetransformmatrixandcroprect, "");
                lambdaanalyzeImage1androidxcameracoreImageAnalysisAbstractAnalyzer lambdaanalyzeimage1androidxcameracoreimageanalysisabstractanalyzer = recalculatetransformmatrixandcroprect.INotificationSideChannel;
                resetMinLogLevel unused = this.this$0.g;
                String str5 = metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault3.d;
                if (str5 == null) {
                    str5 = "";
                }
                boolean zTuitionPaymentFragmentspecialinlinedviewModeldefault1 = resetMinLogLevel.TuitionPaymentFragmentspecialinlinedviewModeldefault1(recalculatetransformmatrixandcroprect, str5);
                long j5 = this.this$0.TuitionPaymentFragmentbindingInflater1;
                RumActionType rumActionType2 = rumActionType;
                Intrinsics.checkNotNullParameter(rumActionType2, "");
                switch (MirrorMode.WhenMappings.$EnumSwitchMapping$4[rumActionType2.ordinal()]) {
                    case 1:
                        actionEventActionType = ActionEvent.ActionEventActionType.TAP;
                        break;
                    case 2:
                        actionEventActionType = ActionEvent.ActionEventActionType.SCROLL;
                        break;
                    case 3:
                        actionEventActionType = ActionEvent.ActionEventActionType.SWIPE;
                        break;
                    case 4:
                        actionEventActionType = ActionEvent.ActionEventActionType.CLICK;
                        break;
                    case 5:
                        actionEventActionType = ActionEvent.ActionEventActionType.BACK;
                        break;
                    case 6:
                        actionEventActionType = ActionEvent.ActionEventActionType.CUSTOM;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                ActionEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = new ActionEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault2(actionEventActionType, this.this$0.TuitionPaymentFragmentspecialinlinedviewModeldefault2, Long.valueOf(Math.max(p0 - this.this$0.RemoteActionCompatParcelizer, 1L)), new ActionEvent.TuitionPaymentFragmentbindingInflater1(str2), !arrayList.isEmpty() ? new ActionEvent.read(arrayList) : null, new ActionEvent.IconCompatParcelizer(j), new ActionEvent.cancel(j2), new ActionEvent.connect(j3), new ActionEvent.disconnect(j4));
                String str6 = metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault3.d;
                if (str6 == null) {
                    int i2 = $TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 77;
                    $b = i2 % 128;
                    int i3 = i2 % 2;
                    str4 = "";
                } else {
                    str4 = str6;
                }
                String str7 = metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault3.onTransact;
                String str8 = metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault3.INotificationSideChannel;
                ActionEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = new ActionEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault3(str4, null, str8 == null ? "" : str8, str7, null, 18, null);
                ActionEvent.b bVar = new ActionEvent.b(metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                ActionEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = new ActionEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault1(metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1, actionEventSessionType2, Boolean.valueOf(zTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                ActionEvent.ActionEventSource.Companion companion = ActionEvent.ActionEventSource.INSTANCE;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                    int iArgb = Color.argb(0, 0, 0, 0) + 876;
                    int threadPriority = 10 - ((Process.getThreadPriority(0) + 20) >> 6);
                    byte b = $$a[7];
                    byte b2 = b;
                    Object[] objArr3 = new Object[1];
                    a(b, b2, b2, objArr3);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(keyRepeatDelay, iArgb, threadPriority, -1650998592, false, (String) objArr3[0], null);
                }
                long j6 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                Object[] objArr4 = new Object[1];
                b(true, (ViewConfiguration.getWindowTouchSlop() >> 8) + 160, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 22, 13 - ((Process.getThreadPriority(0) + 20) >> 6), new char[]{22, 65520, 65483, 16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534, '\b', 0, '\f', '\t', 65504, '\n', 2, 17, 16}, objArr4);
                Class<?> cls = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                b(true, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 164, 15 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 7 - ((Process.getThreadPriority(0) + 20) >> 6), new char[]{65533, 65534, '\f', '\t', 65530, 5, 65534, 65534, 6, 2, '\r', 5, 65530, 65534, 65515}, objArr5);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                    int longPressTimeout = 876 - (ViewConfiguration.getLongPressTimeout() >> 16);
                    int windowTouchSlop = 10 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                    byte[] bArr = $$a;
                    byte b3 = bArr[5];
                    Object[] objArr6 = new Object[1];
                    a(b3, (byte) (b3 | 36), bArr[7], objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(scrollBarSize, longPressTimeout, windowTouchSlop, 2012020043, false, (String) objArr6[0], null);
                }
                if (j6 == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                    int i4 = $TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 89;
                    $b = i4 % 128;
                    int i5 = i4 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char scrollBarSize2 = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                        int keyRepeatTimeout = 876 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 10;
                        byte[] bArr2 = $$a;
                        byte b4 = bArr2[5];
                        Object[] objArr7 = new Object[1];
                        a(b4, (byte) (b4 | 88), bArr2[7], objArr7);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(scrollBarSize2, keyRepeatTimeout, minimumFlingVelocity, 2012931276, false, (String) objArr7[0], null);
                    }
                    Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                    objArr = new Object[]{new int[]{((int[]) objArr8[0])[0]}, new int[1], new int[]{((int[]) objArr8[2])[0]}, (String[]) objArr8[3]};
                    int iIdentityHashCode = System.identityHashCode(this);
                    int i6 = 1584883602 + ((~((~iIdentityHashCode) | (-268566787))) * 433) + (((~(379784582 | iIdentityHashCode)) | (-420094812)) * (-433)) + (((~(iIdentityHashCode | (-420094812))) | 111217796) * 433) + 827547278;
                    int i7 = (i6 << 13) ^ i6;
                    int i8 = i7 ^ (i7 >>> 17);
                    ((int[]) objArr[1])[0] = i8 ^ (i8 << 5);
                } else {
                    Object[] objArr9 = new Object[1];
                    b(false, KeyEvent.getDeadChar(0, 0) + 160, 25 - MotionEvent.axisFromString(""), AndroidCharacter.getMirror('0') - '\"', new char[]{65502, 0, 17, 6, 19, 6, 17, 22, 65521, 5, 15, 2, 65534, 1, 65534, 11, 1, 15, '\f', 6, 1, 65483, 65534, '\r', '\r', 65483}, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    b(false, 167 - ((Process.getThreadPriority(0) + 20) >> 6), 18 - Color.red(0), 10 - Color.argb(0, 0, 0, 0), new char[]{6, 6, 2, 65535, 65529, 65527, '\n', 65535, 5, 4, 65529, 11, '\b', '\b', 65531, 4, '\n', 65495}, objArr10);
                    Context applicationContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
                    if (applicationContext != null) {
                        int i9 = $TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 83;
                        int i10 = i9 % 128;
                        $b = i10;
                        if (i9 % 2 == 0) {
                            boolean z = applicationContext instanceof ContextWrapper;
                            throw null;
                        }
                        if (applicationContext instanceof ContextWrapper) {
                            int i11 = i10 + 81;
                            $TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i11 % 128;
                            int i12 = i11 % 2;
                            if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                                applicationContext = applicationContext.getApplicationContext();
                            } else {
                                applicationContext = null;
                            }
                        } else {
                            applicationContext = applicationContext.getApplicationContext();
                        }
                    }
                    Object[] objArr11 = new Object[1];
                    b(true, 159 - Color.blue(0), 16 - TextUtils.getCapsMode("", 0, 0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 10, new char[]{65521, 65484, 5, '\f', 65535, '\n', 65484, 65535, 20, 65535, '\b', 11, 3, 18, 17, 23}, objArr11);
                    Class<?> cls3 = Class.forName((String) objArr11[0]);
                    Object[] objArr12 = new Object[1];
                    b(false, 163 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), AndroidCharacter.getMirror('0') - ' ', ExpandableListView.getPackedPositionChild(0L) + 11, new char[]{14, 19, 65506, 65531, '\r', 2, 65501, '\t', 65534, 65535, 3, 65534, 65535, '\b', 14, 3}, objArr12);
                    try {
                        Object[] objArr13 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr12[0], Object.class).invoke(null, this)).intValue()), 0, 827547278};
                        byte[] bArr3 = $$d;
                        byte b5 = bArr3[11];
                        byte b6 = bArr3[21];
                        Object[] objArr14 = new Object[1];
                        c(b5, b6, b6, objArr14);
                        Class<?> cls4 = Class.forName((String) objArr14[0]);
                        byte b7 = (byte) (bArr3[60] + 1);
                        byte b8 = (byte) (-bArr3[11]);
                        Object[] objArr15 = new Object[1];
                        c(b7, b8, b8, objArr15);
                        Object[] objArr16 = (Object[]) cls4.getMethod((String) objArr15[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr13);
                        if (applicationContext != null) {
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                char cMyTid = (char) (Process.myTid() >> 22);
                                int minimumFlingVelocity2 = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 876;
                                int packedPositionGroup = 10 - ExpandableListView.getPackedPositionGroup(0L);
                                byte[] bArr4 = $$a;
                                byte b9 = bArr4[5];
                                Object[] objArr17 = new Object[1];
                                a(b9, (byte) (b9 | 88), bArr4[7], objArr17);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cMyTid, minimumFlingVelocity2, packedPositionGroup, 2012931276, false, (String) objArr17[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr16);
                            try {
                                Object[] objArr18 = new Object[1];
                                b(true, 160 - View.resolveSize(0, 0), ExpandableListView.getPackedPositionType(0L) + 22, 13 - (ViewConfiguration.getDoubleTapTimeout() >> 16), new char[]{22, 65520, 65483, 16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534, '\b', 0, '\f', '\t', 65504, '\n', 2, 17, 16}, objArr18);
                                Class<?> cls5 = Class.forName((String) objArr18[0]);
                                Object[] objArr19 = new Object[1];
                                b(true, 164 - (ViewConfiguration.getTouchSlop() >> 8), 15 - TextUtils.indexOf("", "", 0, 0), TextUtils.getTrimmedLength("") + 7, new char[]{65533, 65534, '\f', '\t', 65530, 5, 65534, 65534, 6, 2, '\r', 5, 65530, 65534, 65515}, objArr19);
                                long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr19[0], new Class[0]).invoke(null, new Object[0])).longValue();
                                Long lValueOf = Long.valueOf(jLongValue2);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                    char cMyTid2 = (char) (Process.myTid() >> 22);
                                    int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 876;
                                    int modifierMetaStateMask = 9 - ((byte) KeyEvent.getModifierMetaStateMask());
                                    byte[] bArr5 = $$a;
                                    byte b10 = bArr5[5];
                                    Object[] objArr20 = new Object[1];
                                    a(b10, (byte) (b10 | 36), bArr5[7], objArr20);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cMyTid2, jumpTapTimeout, modifierMetaStateMask, 2012020043, false, (String) objArr20[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                                Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                    char c = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                    int iResolveOpacity = 876 - Drawable.resolveOpacity(0, 0);
                                    int maxKeyCode = 10 - (KeyEvent.getMaxKeyCode() >> 16);
                                    byte b11 = $$a[7];
                                    byte b12 = b11;
                                    Object[] objArr21 = new Object[1];
                                    a(b11, b12, b12, objArr21);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c, iResolveOpacity, maxKeyCode, -1650998592, false, (String) objArr21[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                            } catch (Exception unused2) {
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
                int i13 = ((int[]) objArr[2])[0];
                int i14 = ((int[]) objArr[0])[0];
                if (i14 == i13) {
                    int i15 = ((int[]) objArr[1])[0];
                    objArr2 = new Object[]{new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                    int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                    int i16 = ~iMaxMemory;
                    int i17 = i15 + 1854270488 + (((~(891577756 | i16)) | 931887985) * (-90)) + (((~(891577756 | iMaxMemory)) | 2360460) * (-45)) + (((~(iMaxMemory | (-931887986))) | 891577756 | (~(i16 | 931887985))) * 45);
                    int i18 = (i17 << 13) ^ i17;
                    int i19 = i18 ^ (i18 >>> 17);
                    ((int[]) objArr2[1])[0] = i19 ^ (i19 << 5);
                } else {
                    Toast.makeText((Context) null, i14 / (((i14 - 1) * i14) % 2), 0).show();
                    int i20 = ((int[]) objArr[1])[0];
                    Object[] objArr22 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                    int iNextInt = new Random().nextInt();
                    int i21 = ~iNextInt;
                    int i22 = ~((-1061501050) | i21);
                    int i23 = ~(1021190820 | iNextInt);
                    int i24 = i20 + (-1663234392) + ((i22 | i23) * 1150) + (((~((-1021190821) | i21)) | i23) * (-575)) + (((~(iNextInt | (-1061501050))) | (~(i21 | 1061501049))) * 575);
                    int i25 = (i24 << 13) ^ i24;
                    int i26 = i25 ^ (i25 >>> 17);
                    ((int[]) objArr22[1])[0] = i26 ^ (i26 << 5);
                    objArr2 = objArr22;
                }
                ActionEvent.ActionEventSource actionEventSourceTuitionPaymentFragmentspecialinlinedviewModeldefault2 = MirrorMode.TuitionPaymentFragmentspecialinlinedviewModeldefault2(companion, recalculatetransformmatrixandcroprect.cancelAll, this.this$0.INotificationSideChannelDefault.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
                if (setTimeoutInMillis.TuitionPaymentFragmentspecialinlinedviewModeldefault1(lambdaanalyzeimage1androidxcameracoreimageanalysisabstractanalyzer)) {
                    getroot = new ActionEvent.getRoot(lambdaanalyzeimage1androidxcameracoreimageanalysisabstractanalyzer.b, lambdaanalyzeimage1androidxcameracoreimageanalysisabstractanalyzer.TuitionPaymentFragmentspecialinlinedviewModeldefault2, lambdaanalyzeimage1androidxcameracoreimageanalysisabstractanalyzer.TuitionPaymentFragmentbindingInflater1, MapsKt.toMutableMap(lambdaanalyzeimage1androidxcameracoreimageanalysisabstractanalyzer.TuitionPaymentFragmentspecialinlinedviewModeldefault3));
                } else {
                    int i27 = $b + 115;
                    $TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i27 % 128;
                    if (i27 % 2 != 0) {
                        int i28 = 3 / 5;
                    }
                    getroot = null;
                }
                String str9 = recalculatetransformmatrixandcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault3.f251a;
                String str10 = recalculatetransformmatrixandcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault3.d;
                String str11 = recalculatetransformmatrixandcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault3.g;
                int i29 = ((int[]) objArr2[1])[0];
                int i30 = i29 * i29;
                int i31 = -(1299282889 * i29);
                int i32 = ((i30 | i31) << 1) - (i30 ^ i31);
                int i33 = -(i29 * (-1623880025));
                int i34 = (i32 & i33) + (i33 | i32);
                int i35 = (i34 & 1201880128) + (1201880128 | i34);
                int i36 = i35 >> 19;
                int i37 = (i35 - (~(((((i36 | (-16383)) << 1) - (i36 ^ (-16383))) / 8192) + 1))) - 1;
                int i38 = i35 >> 28;
                int i39 = (((i38 | (-31)) << 1) - (i38 ^ (-31))) / 16;
                int i40 = (-(i37 ^ (((i39 | 1) << 1) - (i39 ^ 1)))) + 8;
                int i41 = (((i40 >> 29) - 15) / 8) + 1;
                return new ActionEvent(j5, bVar, recalculatetransformmatrixandcroprect.asInterface, recalculatetransformmatrixandcroprect.getInterfaceDescriptor, null, null, tuitionPaymentFragmentspecialinlinedviewModeldefault1, actionEventSourceTuitionPaymentFragmentspecialinlinedviewModeldefault2, tuitionPaymentFragmentspecialinlinedviewModeldefault3, getroot, MirrorMode.TuitionPaymentFragmentbindingInflater1(this.this$0.cancel), null, getnotifychildrenchangedoptions, null, new ActionEvent.write(str9, str10, null, str11, 43392 / ((i40 & (-((i41 & 1) + (i41 | 1)))) * 1356), null), new ActionEvent.getInterfaceDescriptor(MirrorMode.TuitionPaymentFragmentspecialinlinedviewModeldefault2(recalculatetransformmatrixandcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault3.asInterface), recalculatetransformmatrixandcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1, recalculatetransformmatrixandcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2, recalculatetransformmatrixandcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1, recalculatetransformmatrixandcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3), new ActionEvent.cancelAll(new ActionEvent.RemoteActionCompatParcelizer(null, MirrorMode.TuitionPaymentFragmentspecialinlinedviewModeldefault2(metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault3.a), 1, null), new ActionEvent.g(Float.valueOf(this.this$0.INotificationSideChannelStubProxy), null, 2, null), null, null, 12, null), new ActionEvent.onTransact(mutableMap), null, tuitionPaymentFragmentspecialinlinedviewModeldefault2, 272432, null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0024  */
            /* JADX WARN: Code duplicated, block: B:8:0x001e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$g(short r6, short r7, byte r8) {
                /*
                    byte[] r0 = com.datadog.android.rum.internal.domain.scope.RumActionScope$sendAction$1.$$c
                    int r6 = r6 + 119
                    int r8 = r8 * 4
                    int r8 = 3 - r8
                    int r7 = r7 * 4
                    int r7 = r7 + 1
                    byte[] r1 = new byte[r7]
                    r2 = 0
                    if (r0 != 0) goto L14
                    r3 = r7
                    r4 = r2
                    goto L26
                L14:
                    r3 = r2
                L15:
                    int r8 = r8 + 1
                    int r4 = r3 + 1
                    byte r5 = (byte) r6
                    r1[r3] = r5
                    if (r4 != r7) goto L24
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    return r6
                L24:
                    r3 = r0[r8]
                L26:
                    int r6 = r6 + r3
                    r3 = r4
                    goto L15
                */
                throw new UnsupportedOperationException("Method not decompiled: com.datadog.android.rum.internal.domain.scope.RumActionScope$sendAction$1.$$g(short, short, byte):java.lang.String");
            }
        });
        final onSurfaceRequested.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = new onSurfaceRequested.TuitionPaymentFragmentspecialinlinedviewModeldefault3(arrayList.size());
        Function1<PreviewBuilder, Unit> function1 = new Function1<PreviewBuilder, Unit>() { // from class: com.datadog.android.rum.internal.domain.scope.RumActionScope$sendAction$2$1
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(PreviewBuilder previewBuilder) {
                b(previewBuilder);
                return Unit.INSTANCE;
            }

            public final void b(PreviewBuilder previewBuilder) {
                Intrinsics.checkNotNullParameter(previewBuilder, "");
                String str4 = metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault3.d;
                previewBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str4 != null ? str4 : "", tuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        };
        Intrinsics.checkNotNullParameter(function1, "");
        getstatusB.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = function1;
        Function1<PreviewBuilder, Unit> function2 = new Function1<PreviewBuilder, Unit>() { // from class: com.datadog.android.rum.internal.domain.scope.RumActionScope$sendAction$2$2
            private static final byte[] $$c = {8, -36, 87, -65};
            private static final int $$d = 125;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {107, 48, 57, 107, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
            private static final int $$b = 20;
            private static int $TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            private static int $TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
            private static long TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1393869846226036188L;

            /* JADX WARN: Code duplicated, block: B:10:0x0029  */
            /* JADX WARN: Code duplicated, block: B:8:0x0020  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002b). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void c(int r5, byte r6, int r7, java.lang.Object[] r8) {
                /*
                    byte[] r0 = com.datadog.android.rum.internal.domain.scope.RumActionScope$sendAction$2$2.$$a
                    int r7 = r7 * 2
                    int r7 = r7 + 4
                    int r5 = r5 * 14
                    int r5 = r5 + 84
                    int r6 = r6 * 52
                    int r1 = r6 + 1
                    byte[] r1 = new byte[r1]
                    r2 = -1
                    if (r0 != 0) goto L16
                    r3 = r6
                    r5 = r7
                    goto L2b
                L16:
                    r4 = r7
                    r7 = r5
                    r5 = r4
                L19:
                    int r2 = r2 + 1
                    byte r3 = (byte) r7
                    r1[r2] = r3
                    if (r2 != r6) goto L29
                    java.lang.String r5 = new java.lang.String
                    r6 = 0
                    r5.<init>(r1, r6)
                    r8[r6] = r5
                    return
                L29:
                    r3 = r0[r5]
                L2b:
                    int r7 = r7 + r3
                    int r7 = r7 + (-11)
                    int r5 = r5 + 1
                    goto L19
                */
                throw new UnsupportedOperationException("Method not decompiled: com.datadog.android.rum.internal.domain.scope.RumActionScope$sendAction$2$2.c(int, byte, int, java.lang.Object[]):void");
            }

            private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
                int i2 = 2 % 2;
                abortCapture abortcapture = new abortCapture();
                char[] cArrB = abortCapture.b(TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ (-2687588926731523482L), cArr, i);
                int i3 = 4;
                abortcapture.b = 4;
                int i4 = $11 + 105;
                $10 = i4 % 128;
                int i5 = i4 % 2;
                while (abortcapture.b < cArrB.length) {
                    int i6 = $10 + 49;
                    $11 = i6 % 128;
                    int i7 = i6 % 2;
                    abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - i3;
                    int i8 = abortcapture.b;
                    try {
                        Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % i3]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b = (byte) 0;
                            byte b2 = b;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (((Process.getThreadPriority(0) + 20) >> 6) + 64838), ExpandableListView.getPackedPositionChild(0L) + 1357, 38 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 894276454, false, $$e(b, b2, b2), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                        }
                        cArrB[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        Object[] objArr3 = {abortcapture, abortcapture};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.getCapsMode("", 0, 0) + 47773), 468 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 12 - TextUtils.indexOf((CharSequence) "", '0'), 896083767, false, "n", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                        i3 = 4;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                objArr[0] = new String(cArrB, 4, cArrB.length - 4);
                int i9 = $10 + 85;
                $11 = i9 % 128;
                if (i9 % 2 == 0) {
                    throw null;
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(PreviewBuilder previewBuilder) {
                int i = 2 % 2;
                int i2 = $TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 65;
                $TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
                int i3 = i2 % 2;
                b(previewBuilder);
                Unit unit = Unit.INSTANCE;
                if (i3 != 0) {
                    int i4 = 68 / 0;
                }
                return unit;
            }

            public final void b(PreviewBuilder previewBuilder) {
                int i = 2 % 2;
                String str4 = "";
                Intrinsics.checkNotNullParameter(previewBuilder, "");
                String str5 = metadataImageReaderExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault3.d;
                if (str5 == null) {
                    int i2 = $TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 101;
                    $TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
                    if (i2 % 2 == 0) {
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                } else {
                    str4 = str5;
                }
                previewBuilder.TuitionPaymentFragmentbindingInflater1(str4, tuitionPaymentFragmentspecialinlinedviewModeldefault3);
                int i3 = $TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 49;
                $TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
                int i4 = i3 % 2;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Code duplicated, block: B:101:0x0778  */
            /* JADX WARN: Code duplicated, block: B:102:0x077b  */
            /* JADX WARN: Code duplicated, block: B:105:0x0792  */
            /* JADX WARN: Code duplicated, block: B:106:0x079c  */
            /* JADX WARN: Code duplicated, block: B:109:0x083f  */
            /* JADX WARN: Code duplicated, block: B:110:0x085c  */
            public static Object[] TuitionPaymentFragmentbindingInflater1(Class cls, int i, int i2, int i3) throws Throwable {
                String string;
                int i4;
                Method method;
                Field declaredField;
                int i5;
                int i6;
                int i7;
                int i8;
                Object[] objArr;
                int i9;
                int i10;
                int i11;
                int i12;
                int i13;
                int i14;
                int i15;
                int i16;
                int i17;
                int i18;
                int i19 = 2 % 2;
                int i20 = $TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                int i21 = (i20 & 89) + (i20 | 89);
                $TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i21 % 128;
                if (i21 % 2 != 0 ? (i2 & 2) != 0 : (i2 & 2) != 0) {
                    String[][] strArr = new String[1][];
                    try {
                        char[] cArr = {47175, 47139, 43961, 9318, 62979, 2040, 59663, 34510, 25976, 46907, 18150, 43157};
                        int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L);
                        int i22 = $TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 15;
                        $TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i22 % 128;
                        if (i22 % 2 != 0) {
                            Object[] objArr2 = new Object[1];
                            a(cArr, packedPositionGroup, objArr2);
                            declaredField = Class.class.getDeclaredField((String) objArr2[0]);
                        } else {
                            Object[] objArr3 = new Object[1];
                            a(cArr, packedPositionGroup, objArr3);
                            declaredField = Class.class.getDeclaredField((String) objArr3[0]);
                        }
                        declaredField.setAccessible(true);
                        try {
                            Object obj = declaredField.get(cls);
                            Class<?> cls2 = obj.getClass();
                            Object[] objArr4 = new Object[1];
                            a(new char[]{23253, 23217, 30397, 63842, 1382, 23381, 6762, 25684, 47219, 17491, 62525}, Process.myTid() >> 22, objArr4);
                            Field declaredField2 = cls2.getDeclaredField((String) objArr4[0]);
                            declaredField2.setAccessible(true);
                            Number number = (Number) declaredField2.get(obj);
                            int i23 = $TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 73;
                            $TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i23 % 128;
                            int i24 = i23 % 2;
                            try {
                                Object[] objArr5 = {Long.valueOf(number.longValue() & 281474976710655L), strArr};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486768121);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    char cResolveOpacity = (char) (Drawable.resolveOpacity(0, 0) + 41241);
                                    int trimmedLength = 1705 - TextUtils.getTrimmedLength("");
                                    int iResolveSizeAndState = 21 - View.resolveSizeAndState(0, 0, 0);
                                    byte[] bArr = $$a;
                                    byte b = (byte) (-bArr[5]);
                                    byte b2 = bArr[7];
                                    Object[] objArr6 = new Object[1];
                                    c(b, b2, b2, objArr6);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cResolveOpacity, trimmedLength, iResolveSizeAndState, -107095506, false, (String) objArr6[0], new Class[]{Long.TYPE, String[][].class});
                                }
                                long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr5)).longValue();
                                long j5 = -251760340;
                                long j6 = -1;
                                long j7 = jLongValue ^ j6;
                                long j8 = ((long) i) ^ j6;
                                long j9 = 933;
                                long j10 = (((long) 934) * j5) + (((long) (-932)) * jLongValue) + (((long) (-933)) * (j7 | (((j5 ^ j6) | j8) ^ j6))) + ((((j7 | j8) ^ j6) | ((j7 | j5) ^ j6)) * j9) + (j9 * ((j5 | jLongValue) ^ j6)) + ((long) (-1854256721));
                                int i25 = ~i;
                                int i26 = ((int) (j10 >> 32)) & (1775376304 + (((-1176175538) | i) * (-859)) + (((~((-1176175538) | i25)) | (~(1715185587 | i))) * 859) + (((~(1681565347 | i25)) | 33620240) * 859));
                                int i27 = (int) j10;
                                int iMyPid = Process.myPid();
                                int i28 = i27 & ((-1587633331) + (((~((-1440022957) | iMyPid)) | 1440022956 | (~(2796546 | iMyPid))) * (-744)) + (((~iMyPid) | 2796546) * 744) + ((iMyPid | (-1440022957)) * 744));
                                int i29 = (i26 & i28) | (i26 ^ i28);
                                if (i29 != 0) {
                                    int i30 = ((~i29) & i) | (i29 & i25);
                                    String[] strArr2 = strArr[0];
                                    String[] strArr3 = {cls.getName(), strArr2[0], strArr2[1], strArr2[2]};
                                    Object[] objArr7 = new Object[4];
                                    objArr7[0] = new int[1];
                                    int[] iArr = new int[1];
                                    objArr7[1] = iArr;
                                    int i31 = $TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                    int i32 = i31 + 63;
                                    $TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i32 % 128;
                                    int i33 = i32 % 2;
                                    int[] iArr2 = new int[1];
                                    objArr7[2] = iArr2;
                                    int i34 = i31 + 13;
                                    $TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i34 % 128;
                                    int i35 = i34 % 2;
                                    iArr2[0] = i;
                                    iArr[0] = i30;
                                    int i36 = ~((int) Runtime.getRuntime().freeMemory());
                                    int i37 = (((~((-1033248912) | i36)) | 671219843) * (-241)) + 124644709 + (((~(i36 | (-362029069))) | 562704) * 241);
                                    int i38 = $TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                    int i39 = i38 + 3;
                                    $TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i39 % 128;
                                    int i40 = i39 % 2;
                                    int i41 = (i37 ^ 16) + ((i37 & 16) << 1);
                                    int i42 = i41 * (-563);
                                    int i43 = -(-(i3 * 565));
                                    int i44 = ((i42 | i43) << 1) - (i42 ^ i43);
                                    int i45 = ~i41;
                                    int i46 = i44 + (((~((~i3) | i25)) | i45 | (~((i3 ^ i) | (i3 & i)))) * (-564));
                                    int i47 = ~i41;
                                    int i48 = (i47 & i3) | (i47 ^ i3);
                                    int i49 = i38 + 77;
                                    $TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i49 % 128;
                                    int i50 = i49 % 2;
                                    int i51 = 1128 * (~((i48 ^ i) | (i48 & i)));
                                    int i52 = ((i46 | i51) << 1) - (i51 ^ i46);
                                    int i53 = ~((i45 & i25) | (i45 ^ i25));
                                    int i54 = ~((i41 ^ i3) | (i41 & i3));
                                    int i55 = ((i53 & i54) | (i53 ^ i54)) * 564;
                                    int i56 = (i52 & i55) + (i52 | i55);
                                    int i57 = i56 << 13;
                                    int i58 = (i57 & (~i56)) | ((~i57) & i56);
                                    int i59 = i58 >>> 17;
                                    int i60 = (i58 | i59) & (~(i58 & i59));
                                    int i61 = i60 << 5;
                                    ((int[]) objArr7[0])[0] = (i60 | i61) & (~(i60 & i61));
                                    objArr7[3] = strArr3;
                                    return objArr7;
                                }
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause != null) {
                                    throw cause;
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                StringWriter stringWriter = new StringWriter();
                                try {
                                    Object[] objArr8 = {new PrintWriter(stringWriter)};
                                    Object[] objArr9 = new Object[1];
                                    a(new char[]{51971, 52073, 3551, 33284, 7397, 6576, 999, 62917, 49937, 24026, 22663, 46772, 46847, '{', 40695, 39529, 30665, 16834, 57276, 56696, 12481, 34537, 6294}, Color.alpha(0), objArr9);
                                    Class<?> cls3 = Class.forName((String) objArr9[0]);
                                    char[] cArr2 = {21298, 21314, 14562, 46890, 51787, 7688, 54614, 28078, 62995, 35710, 24383, 11905, 45384, 13571, 18502, 40388, 61419, 29939, 2335};
                                    int i62 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ZExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                    int i63 = $TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                    int i64 = (i63 & 65) + (i63 | 65);
                                    $TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i64 % 128;
                                    if (i64 % 2 != 0) {
                                        i4 = (989 >>> i62) % Integer.MIN_VALUE;
                                    } else {
                                        int i65 = i62 * 989;
                                        i4 = ((i65 | 987) << 1) - (i65 ^ 987);
                                    }
                                    int i66 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                    int i67 = 988 * (~((i66 & i62) | (i66 ^ i62)));
                                    int i68 = (i4 ^ i67) + ((i4 & i67) << 1);
                                    int i69 = -(-(i62 * (-988)));
                                    int i70 = ((i68 | i69) << 1) - (i69 ^ i68);
                                    int i71 = ~(~i62);
                                    int i72 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                    int i73 = (i71 & i72) | (i71 ^ i72);
                                    int i74 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                    int i75 = (i62 & i74) | (i74 ^ i62);
                                    int i76 = ((i63 | 75) << 1) - (i63 ^ 75);
                                    $TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i76 % 128;
                                    if (i76 % 2 != 0) {
                                        int i77 = ~(i75 | (~i75));
                                        int i78 = (i77 & i73) | (i73 ^ i77);
                                        int i79 = -(-((i78 & 988) + (i78 | 988)));
                                        int i80 = (i70 ^ i79) + ((i79 & i70) << 1);
                                        Object[] objArr10 = new Object[1];
                                        a(cArr2, i80, objArr10);
                                        String str4 = (String) objArr10[0];
                                        Class<?>[] clsArr = new Class[0];
                                        clsArr[0] = PrintWriter.class;
                                        method = cls3.getMethod(str4, clsArr);
                                    } else {
                                        int i81 = -(-(i73 * 988));
                                        Object[] objArr11 = new Object[1];
                                        a(cArr2, (i70 & i81) + (i81 | i70), objArr11);
                                        method = cls3.getMethod((String) objArr11[0], PrintWriter.class);
                                    }
                                    method.invoke(th, objArr8);
                                    string = stringWriter.toString();
                                    int i82 = (i & (-32)) | ((~i) & 31);
                                    String[] strArr4 = {cls.getName(), string};
                                    Object[] objArr12 = new Object[4];
                                    int i83 = $TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                    int i84 = (i83 & 93) + (i83 | 93);
                                    $TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i84 % 128;
                                    int i85 = i84 % 2;
                                    objArr12[0] = new int[1];
                                    objArr12[1] = new int[]{i82};
                                    objArr12[2] = new int[]{i};
                                    int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                                    int i86 = ~elapsedCpuTime;
                                    int i87 = (-1470961484) + (((~((-1608822932) | i86)) | (~((-96208528) | elapsedCpuTime))) * 210) + (((~(elapsedCpuTime | (-1514188817))) | (~(i86 | (-1574413)))) * 210);
                                    int i88 = (i87 & 16) + (16 | i87);
                                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ZExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                    int i89 = $TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                    int i90 = ((i89 | 91) << 1) - (i89 ^ 91);
                                    $TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i90 % 128;
                                    int i91 = i90 % 2 != 0 ? ((-433) << i88) % ((-216) >> i3) : (i88 * (-433)) + (i3 * (-216));
                                    int i92 = ~i88;
                                    int i93 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                    int i94 = -(-(((~((i92 & i93) | (i92 ^ i93))) | (~((~i3) | iTuitionPaymentFragmentspecialinlinedviewModeldefault2))) * 217));
                                    int i95 = ((i91 | i94) << 1) - (i91 ^ i94);
                                    int i96 = ~i88;
                                    int i97 = ~i3;
                                    int i98 = i95 + (((~(i96 | i97)) | (~((~i88) | iTuitionPaymentFragmentspecialinlinedviewModeldefault2))) * 217);
                                    int i99 = ~(i97 | (~iTuitionPaymentFragmentspecialinlinedviewModeldefault2));
                                    int i100 = ((i88 & i99) | (i88 ^ i99)) * 217;
                                    int i101 = (i98 & i100) + (i100 | i98);
                                    int i102 = (i101 << 13) ^ i101;
                                    int i103 = i102 >>> 17;
                                    int i104 = ((~i102) & i103) | ((~i103) & i102);
                                    int i105 = (i89 ^ 9) + ((i89 & 9) << 1);
                                    $TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i105 % 128;
                                    if (i105 % 2 != 0) {
                                        int i106 = i104 >>> 2;
                                        ((int[]) objArr12[1])[0] = (i104 | i106) & (~(i104 & i106));
                                        objArr12[5] = strArr4;
                                    } else {
                                        int i107 = i104 << 5;
                                        ((int[]) objArr12[0])[0] = (i104 | i107) & (~(i104 & i107));
                                        objArr12[3] = strArr4;
                                    }
                                    return objArr12;
                                } catch (Throwable th3) {
                                    Throwable cause2 = th3.getCause();
                                    if (cause2 != null) {
                                        throw cause2;
                                    }
                                    throw th3;
                                }
                            } catch (Throwable unused) {
                                Object[] objArr13 = new Object[1];
                                a(new char[]{56277, 56315, 62389, 20496, 46273}, ViewConfiguration.getKeyRepeatTimeout() >> 16, objArr13);
                                string = (String) objArr13[0];
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                }
                int[] iArr3 = {-1844476378, 1276062274, -797088743, 965014536, -30564408, 800164665, 427080095, -63109426, -2128711273, 443823261, -421827424, -1596256068, -554832609, -49350782, -437871410, 1291703475, -587285223, 1359539528, -706062319, 1866472215};
                String[][] strArr5 = new String[1][];
                int iCurrentTimeMillis = (int) System.currentTimeMillis();
                int i108 = ((~iCurrentTimeMillis) & 343337308) | ((-343337309) & iCurrentTimeMillis);
                try {
                    Object[] objArr14 = {Integer.valueOf((~(i & i108)) & (i | i108)), iArr3, Integer.valueOf(i2), strArr5};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-561316232);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        char c = (char) (43042 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                        int i109 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 3111;
                        int keyRepeatTimeout = 22 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        byte[] bArr2 = $$a;
                        byte b3 = (byte) (-bArr2[5]);
                        byte b4 = bArr2[7];
                        Object[] objArr15 = new Object[1];
                        c(b3, b4, b4, objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, i109, keyRepeatTimeout, 974412207, false, (String) objArr15[0], new Class[]{Integer.TYPE, int[].class, Integer.TYPE, String[][].class});
                    }
                    long jLongValue2 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr14)).longValue();
                    long j11 = -166189692;
                    long j12 = -949;
                    long j13 = -1;
                    long j14 = i;
                    long j15 = j14 ^ j13;
                    long j16 = (j12 * j11) + (j12 * jLongValue2) + (((long) 1900) * ((((jLongValue2 ^ j13) | j15) ^ j13) | (((j11 ^ j13) | j14) ^ j13))) + (((long) (-950)) * (((j15 | j11) ^ j13) | ((jLongValue2 | j14) ^ j13))) + (((long) 950) * (((j15 | jLongValue2) ^ j13) | ((j11 | j14) ^ j13))) + ((long) 269923757);
                    int i110 = $TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 27;
                    $TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i110 % 128;
                    int i111 = i110 % 2;
                    int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                    int i112 = ((int) (j16 >> 32)) & (1663529106 + (((~(43040147 | startElapsedRealtime)) | 1480266558) * (-366)) + (((~(startElapsedRealtime | 1522253759)) | 1052946) * 366));
                    int i113 = (int) j16;
                    int i114 = ~i;
                    int i115 = i113 & (1277381896 + ((1232085038 | i114) * (-757)) + ((~((-545622530) | i)) * 1514) + (((~((-1625655848) | i114)) | 1080033318 | (~(1777707567 | i))) * 757));
                    int i116 = (i112 & i115) | (i112 ^ i115);
                    int i117 = ((~i116) & i108) | ((~i108) & i116);
                    if (i117 != i) {
                        String[] strArr6 = strArr5[0];
                        Object[] objArr16 = new Object[4];
                        objArr16[0] = new int[1];
                        objArr16[1] = new int[]{i117};
                        int i118 = $TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        int i119 = i118 + 61;
                        $TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i119 % 128;
                        int i120 = i119 % 2;
                        objArr16[2] = new int[]{i};
                        int i121 = (i118 ^ 87) + ((i118 & 87) << 1);
                        int i122 = i121 % 128;
                        $TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i122;
                        int i123 = i121 % 2;
                        int i124 = i122 + 75;
                        $TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i124 % 128;
                        int i125 = i124 % 2;
                        int i126 = (((~((-1062093480) | i)) | 420217476) * (-283)) + 367492878 + ((~(i | (-641876004))) * 283) + 16;
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ZExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        int i127 = i126 * 69;
                        int i128 = $TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        int i129 = (i128 ^ 27) + ((i128 & 27) << 1);
                        int i130 = i129 % 128;
                        $TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i130;
                        int i131 = i129 % 2;
                        int i132 = i3 * (-67);
                        int i133 = (i127 & i132) + (i127 | i132);
                        int i134 = ~i126;
                        int i135 = ~i3;
                        int i136 = (i135 & i134) | (i134 ^ i135);
                        int i137 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        int i138 = ~((i136 & i137) | (i136 ^ i137));
                        int i139 = (i130 & 11) + (i130 | 11);
                        int i140 = i139 % 128;
                        $TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i140;
                        int i141 = i139 % 2;
                        int i142 = ~((i126 ^ i3) | (i126 & i3));
                        int i143 = (i138 & i142) | (i138 ^ i142);
                        int i144 = ~(i3 | iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                        int i145 = ~i126;
                        int i146 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        int i147 = (i145 & i146) | (i145 ^ i146);
                        int i148 = (~((i147 & i3) | (i147 ^ i3))) * (-68);
                        int i149 = (i140 & 121) + (i140 | 121);
                        int i150 = i149 % 128;
                        $TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i150;
                        int i151 = i149 % 2;
                        int i152 = i133 + ((-68) * ((i143 & i144) | (i143 ^ i144))) + i148;
                        int i153 = ~i3;
                        int i154 = i152 + (((~((i153 & i137) | (i153 ^ i137))) | i134) * 68);
                        int i155 = i154 << 13;
                        int i156 = (i155 & (~i154)) | ((~i155) & i154);
                        int i157 = i156 >>> 17;
                        int i158 = i150 + 79;
                        $TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i158 % 128;
                        if (i158 % 2 != 0) {
                            int i159 = i156 ^ i157;
                            ((int[]) objArr16[0])[0] = i159 ^ (i159 << 5);
                            objArr16[3] = strArr6;
                            return objArr16;
                        }
                        int i160 = i156 ^ i157;
                        int i161 = i160 >> 4;
                        ((int[]) objArr16[0])[0] = (i160 | i161) & (~(i160 & i161));
                        objArr16[2] = strArr6;
                        return objArr16;
                    }
                    try {
                        Object[] objArr17 = new Object[1];
                        a(new char[]{37146, 37243, 62549, 31617, 39141, 34003, 34805, 44957, 15006, 55757, 50615, 60587, 11151, 63919, 6849, 1887, 11747, 47172, 23469, 16384, 27340, 32614, 40085, 33080, 43974, 15999, 56955, 49756, 59403, 64795}, KeyEvent.getDeadChar(0, 0), objArr17);
                        Class<?> cls4 = Class.forName((String) objArr17[0]);
                        int i162 = -(-ExpandableListView.getPackedPositionChild(0L));
                        int i163 = (i162 & 1) + (i162 | 1);
                        Object[] objArr18 = new Object[1];
                        a(new char[]{32268, 32367, 19836, 49843, 52686, 31152, 53960, 16513, 33712, 36064, 14523, 940, 55020, 16518, 20448, 64123, 49879, 367, 3728, 48483, 34243, 50760}, i163, objArr18);
                        if (cls4.getMethod((String) objArr18[0], new Class[0]).invoke(null, null) != null) {
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1289074282);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                i5 = 16;
                                char longPressTimeout = (char) (22878 - (ViewConfiguration.getLongPressTimeout() >> 16));
                                int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 594;
                                int iRed = 17 - Color.red(0);
                                byte[] bArr3 = $$a;
                                byte b5 = bArr3[7];
                                Object[] objArr19 = new Object[1];
                                c(b5, (byte) (-bArr3[5]), b5, objArr19);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(longPressTimeout, iKeyCodeFromString, iRed, -1471475267, false, (String) objArr19[0], null);
                            } else {
                                i5 = 16;
                            }
                            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).getInt(null) != 0) {
                                i6 = (i & (-10)) | (i114 & 9);
                            }
                            if (i6 != i) {
                                i8 = i5;
                                i7 = 0;
                            } else {
                                i7 = 0;
                                i8 = 0;
                            }
                            String[] strArr7 = new String[i7];
                            objArr = new Object[4];
                            objArr[i7] = new int[1];
                            i9 = $TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 1;
                            $TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i9 % 128;
                            if (i9 % 2 != 0) {
                                objArr[i7] = new int[i7];
                                objArr[5] = new int[1];
                            } else {
                                objArr[1] = new int[1];
                                objArr[2] = new int[1];
                            }
                            ((int[]) objArr[2])[i7] = i;
                            ((int[]) objArr[1])[i7] = i6;
                            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                            int i164 = ~iMaxMemory;
                            i10 = (-498553052) + ((1702866943 | i164) * (-369)) + (((~((-540092264) | i164)) | 1164939195) * (-369)) + (((~(iMaxMemory | 540092263)) | 1162774680 | (~(i164 | (-537927749)))) * 369);
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = ZExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            int i165 = ((i8 * 399) - (~(i10 * 399))) - 1;
                            i11 = ~i8;
                            int i166 = ~((i11 ^ i10) | (i11 & i10));
                            int i167 = ~i10;
                            i12 = (i167 ^ i8) | (i167 & i8);
                            i13 = ~i12;
                            int i168 = $TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            int i169 = i168 + 41;
                            $TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i169 % 128;
                            int i170 = i169 % 2;
                            int i171 = (i166 & i13) | (i166 ^ i13);
                            int i172 = ~i10;
                            int i173 = ~((i172 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i172 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                            int i174 = -(-(398 * ((i171 & i173) | (i171 ^ i173))));
                            int i175 = (i165 & i174) + (i165 | i174);
                            int i176 = -(-(((i8 ^ i10) | (i8 & i10)) * (-1194)));
                            i14 = (i175 ^ i176) + ((i176 & i175) << 1);
                            int i177 = ((i168 | 29) << 1) - (i168 ^ 29);
                            $TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i177 % 128;
                            i15 = i177 % 2;
                            i16 = ~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | i167);
                            if (i15 != 0) {
                                int i178 = ~i8;
                                int i179 = ~((i178 & i10) | (i178 ^ i10));
                                int i180 = (i16 & i179) | (i16 ^ i179);
                                int i181 = ~i12;
                                int i182 = -(398 >>> ((i180 & i181) | (i180 ^ i181)));
                                i17 = i3 / ((i14 ^ i182) + ((i182 & i14) << 1));
                                i18 = 53;
                            } else {
                                int i183 = ~((i11 ^ i10) | (i11 & i10));
                                int i184 = (i16 & i183) | (i16 ^ i183);
                                int i185 = -(-(((i184 & i13) | (i184 ^ i13)) * 398));
                                int i186 = -(-((i14 & i185) + (i185 | i14)));
                                i17 = ((i3 | i186) << 1) - (i186 ^ i3);
                                i18 = 13;
                            }
                            int i187 = i17 ^ (i17 << i18);
                            int i188 = i187 >>> 17;
                            int i189 = (i187 | i188) & (~(i187 & i188));
                            ((int[]) objArr[0])[0] = i189 ^ (i189 << 5);
                            objArr[3] = strArr7;
                            int i190 = (i168 & 31) + (i168 | 31);
                            $TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i190 % 128;
                            int i191 = i190 % 2;
                            return objArr;
                        }
                        int i192 = $TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        int i193 = (i192 & 39) + (i192 | 39);
                        $TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i193 % 128;
                        int i194 = i193 % 2;
                        i5 = 16;
                    } catch (Exception unused2) {
                    }
                    i6 = i;
                    if (i6 != i) {
                        i8 = i5;
                        i7 = 0;
                    } else {
                        i7 = 0;
                        i8 = 0;
                    }
                    String[] strArr8 = new String[i7];
                    objArr = new Object[4];
                    objArr[i7] = new int[1];
                    i9 = $TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 1;
                    $TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i9 % 128;
                    if (i9 % 2 != 0) {
                        objArr[i7] = new int[i7];
                        objArr[5] = new int[1];
                    } else {
                        objArr[1] = new int[1];
                        objArr[2] = new int[1];
                    }
                    ((int[]) objArr[2])[i7] = i;
                    ((int[]) objArr[1])[i7] = i6;
                    int iMaxMemory2 = (int) Runtime.getRuntime().maxMemory();
                    int i1610 = ~iMaxMemory2;
                    i10 = (-498553052) + ((1702866943 | i1610) * (-369)) + (((~((-540092264) | i1610)) | 1164939195) * (-369)) + (((~(iMaxMemory2 | 540092263)) | 1162774680 | (~(i1610 | (-537927749)))) * 369);
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = ZExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    int i1611 = ((i8 * 399) - (~(i10 * 399))) - 1;
                    i11 = ~i8;
                    int i1612 = ~((i11 ^ i10) | (i11 & i10));
                    int i1613 = ~i10;
                    i12 = (i1613 ^ i8) | (i1613 & i8);
                    i13 = ~i12;
                    int i1614 = $TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    int i1615 = i1614 + 41;
                    $TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i1615 % 128;
                    int i1710 = i1615 % 2;
                    int i1711 = (i1612 & i13) | (i1612 ^ i13);
                    int i1712 = ~i10;
                    int i1713 = ~((i1712 & iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (i1712 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5));
                    int i1714 = -(-(398 * ((i1711 & i1713) | (i1711 ^ i1713))));
                    int i1715 = (i1611 & i1714) + (i1611 | i1714);
                    int i1716 = -(-(((i8 ^ i10) | (i8 & i10)) * (-1194)));
                    i14 = (i1715 ^ i1716) + ((i1716 & i1715) << 1);
                    int i1717 = ((i1614 | 29) << 1) - (i1614 ^ 29);
                    $TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i1717 % 128;
                    i15 = i1717 % 2;
                    i16 = ~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | i1613);
                    if (i15 != 0) {
                        int i1718 = ~i8;
                        int i1719 = ~((i1718 & i10) | (i1718 ^ i10));
                        int i1810 = (i16 & i1719) | (i16 ^ i1719);
                        int i1811 = ~i12;
                        int i1812 = -(398 >>> ((i1810 & i1811) | (i1810 ^ i1811)));
                        i17 = i3 / ((i14 ^ i1812) + ((i1812 & i14) << 1));
                        i18 = 53;
                    } else {
                        int i1813 = ~((i11 ^ i10) | (i11 & i10));
                        int i1814 = (i16 & i1813) | (i16 ^ i1813);
                        int i1815 = -(-(((i1814 & i13) | (i1814 ^ i13)) * 398));
                        int i1816 = -(-((i14 & i1815) + (i1815 | i14)));
                        i17 = ((i3 | i1816) << 1) - (i1816 ^ i3);
                        i18 = 13;
                    }
                    int i1817 = i17 ^ (i17 << i18);
                    int i1818 = i1817 >>> 17;
                    int i1819 = (i1817 | i1818) & (~(i1817 & i1818));
                    ((int[]) objArr[0])[0] = i1819 ^ (i1819 << 5);
                    objArr[3] = strArr8;
                    int i195 = (i1614 & 31) + (i1614 | 31);
                    $TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i195 % 128;
                    int i196 = i195 % 2;
                    return objArr;
                } catch (Throwable th5) {
                    Throwable cause3 = th5.getCause();
                    if (cause3 != null) {
                        throw cause3;
                    }
                    throw th5;
                }
            }

            private static String $$e(short s, byte b, byte b2) {
                int i = b * 3;
                int i2 = 107 - (s * 4);
                byte[] bArr = $$c;
                int i3 = 3 - (b2 * 2);
                byte[] bArr2 = new byte[1 - i];
                int i4 = 0 - i;
                int i5 = -1;
                if (bArr == null) {
                    i2 = i4 + (-i3);
                    i3 = i3;
                    i5 = -1;
                }
                while (true) {
                    int i6 = i5 + 1;
                    bArr2[i6] = (byte) i2;
                    if (i6 == i4) {
                        return new String(bArr2, 0);
                    }
                    int i7 = i3 + 1;
                    i2 += -bArr[i7];
                    i3 = i7;
                    i5 = i6;
                }
            }
        };
        Intrinsics.checkNotNullParameter(function2, "");
        getstatusB.TuitionPaymentFragmentbindingInflater1 = function2;
        getstatusB.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        this.INotificationSideChannelStub = true;
    }

    /* JADX INFO: renamed from: getDefaultPointSize$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JG\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013"}, d2 = {"LgetDefaultPointSize$b;", "", "<init>", "()V", "LPreview;", "p0", "LImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0;", "p1", "LgetPreviewCapabilities$connect;", "p2", "", "p3", "LresetMinLogLevel;", "p4", "", "p5", "", "p6", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(LPreview;LImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0;LgetPreviewCapabilities$connect;JLresetMinLogLevel;ZF)LPreview;"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static Preview TuitionPaymentFragmentspecialinlinedviewModeldefault1(Preview p0, ImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0 p1, getPreviewCapabilities.connect p2, long p3, resetMinLogLevel p4, boolean p5, float p6) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            Intrinsics.checkNotNullParameter(p2, "");
            Intrinsics.checkNotNullParameter(p4, "");
            return new getDefaultPointSize(p0, p1, p2.TuitionPaymentFragmentspecialinlinedviewModeldefault2, p2.TuitionPaymentFragmentspecialinlinedviewModeldefault3, p2.b, p2.TuitionPaymentFragmentspecialinlinedviewModeldefault1, p2.TuitionPaymentFragmentbindingInflater1, p3, 0L, 0L, p4, p5, p6, ViewUtils.EDGE_TO_EDGE_FLAGS, null);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
