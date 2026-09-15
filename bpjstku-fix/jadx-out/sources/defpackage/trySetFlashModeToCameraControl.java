package defpackage;

import android.app.Application;
import android.content.Context;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.context.NetworkInfo;
import com.datadog.android.core.configuration.BatchSize;
import com.datadog.android.core.configuration.Configuration;
import com.datadog.android.core.configuration.UploadFrequency;
import com.datadog.android.core.internal.DatadogCore$1;
import com.datadog.android.core.internal.persistence.file.FileExtKt$writeTextSafe$1;
import com.datadog.android.ndk.internal.NdkCrashHandler;
import com.google.android.material.search.SearchBarAnimationHelper$$ExternalSyntheticLambda0;
import com.google.gson.JsonObject;
import defpackage.ImageAnalysisBlockingAnalyzer;
import defpackage.ImageCaptureExternalSyntheticLambda2;
import java.io.File;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000à\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u0000 #2\u00020\u0001:\u0001#BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0012\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0012\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0003\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001b\u0010 J%\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\"0!2\u0006\u0010\u0003\u001a\u00020\u0004H\u0017¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0016H\u0017¢\u0006\u0004\b%\u0010&J\u0017\u0010\u0017\u001a\u00020'2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0017\u0010(J\u0017\u0010)\u001a\u00020'2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010\u0017\u001a\u00020+2\u0006\u0010\u0003\u001a\u00020+H\u0002¢\u0006\u0004\b\u0017\u0010,J\u0017\u0010.\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020-H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u0010.\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0004H\u0016¢\u0006\u0004\b.\u00100J\u000f\u00101\u001a\u00020\u0011H\u0002¢\u0006\u0004\b1\u0010\u0013J\u001f\u0010.\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u000202H\u0016¢\u0006\u0004\b.\u00103J\u000f\u00104\u001a\u00020\u0011H\u0000¢\u0006\u0004\b4\u0010\u0013J>\u0010#\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00042%\u0010\u0005\u001a!\u0012\u0017\u0012\u0015\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\"05¢\u0006\u0002\b6\u0012\u0004\u0012\u00020\u00110\u0007H\u0016¢\u0006\u0004\b#\u00107J\u0017\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u000208H\u0017¢\u0006\u0004\b\u001b\u00109J\u0017\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020:H\u0017¢\u0006\u0004\b\u0017\u0010;R\u0014\u0010\u001b\u001a\u0002088WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0014\u0010#\u001a\u00020\r8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010.\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010@R\u0016\u0010\u0012\u001a\u0004\u0018\u00010A8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0016\u0010\u0017\u001a\u00020D8\u0001@\u0001X\u0081,¢\u0006\u0006\n\u0004\b\u001b\u0010ER\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010FR \u0010I\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020G058\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b%\u0010HR\u0014\u0010)\u001a\u00020J8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0014\u0010K\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b)\u0010MR\u001a\u0010<\u001a\u00020\t8\u0017X\u0097\u0004¢\u0006\f\n\u0004\bI\u0010N\u001a\u0004\b.\u0010OR\u001c\u0010>\u001a\u00020'8\u0017@QX\u0097\f¢\u0006\f\n\u0004\bK\u0010P\u001a\u0004\b>\u0010QR\u0016\u0010%\u001a\u0004\u0018\u0001088WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010RR\u0016\u0010U\u001a\u0004\u0018\u00010S8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u0010TR\u001a\u0010W\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b<\u0010M\u001a\u0004\b#\u0010VR\u0014\u0010Z\u001a\u00020X8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bW\u0010YR\u0018\u00104\u001a\u0004\u0018\u00010[8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\\R\u0016\u00101\u001a\u00020]8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\bZ\u0010^R\u0014\u0010B\u001a\u00020_8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010`"}, d2 = {"LtrySetFlashModeToCameraControl;", "LImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0;", "Landroid/content/Context;", "p0", "", "p1", "p2", "Lkotlin/Function1;", "LImageAnalysisBlockingAnalyzer;", "Lcom/datadog/android/api/InternalLogger;", "p3", "LImageReaderProxys$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "p4", "LisSupportedRotationDegrees;", "p5", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;LImageReaderProxys$TuitionPaymentFragmentspecialinlinedviewModeldefault3;LisSupportedRotationDegrees;)V", "", "TuitionPaymentFragmentbindingInflater1", "()V", "Ljava/util/concurrent/ScheduledExecutorService;", "(Ljava/lang/String;)Ljava/util/concurrent/ScheduledExecutorService;", "Ljava/util/concurrent/ExecutorService;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Ljava/lang/String;)Ljava/util/concurrent/ExecutorService;", "", "LImageAnalysisAbstractAnalyzerExternalSyntheticLambda1;", "b", "()Ljava/util/List;", "LrecalculateTransformMatrixAndCropRect;", "asInterface", "()LrecalculateTransformMatrixAndCropRect;", "(Ljava/lang/String;)LImageAnalysisAbstractAnalyzerExternalSyntheticLambda1;", "", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Ljava/lang/String;)Ljava/util/Map;", "onTransact", "()Ljava/util/concurrent/ExecutorService;", "", "(Landroid/content/Context;)Z", "a", "(Ljava/lang/String;)Z", "Lcom/datadog/android/core/configuration/Configuration;", "(Lcom/datadog/android/core/configuration/Configuration;)Lcom/datadog/android/core/configuration/Configuration;", "Ldetach;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Ldetach;)V", "(Ljava/lang/String;)V", "INotificationSideChannelDefault", "LsetRelativeRotation;", "(Ljava/lang/String;LsetRelativeRotation;)V", "INotificationSideChannelStub", "", "Lkotlin/ParameterName;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "", "(J)V", "", "([B)V", "asBinder", "()J", "cancelAll", "LisSupportedRotationDegrees;", "Landroid/content/Context;", "LisSessionProcessorEnabledInCurrentCamera;", "RemoteActionCompatParcelizer", "()LisSessionProcessorEnabledInCurrentCamera;", "LlambdasubmitStillCaptureRequest4;", "LlambdasubmitStillCaptureRequest4;", "LImageReaderProxys$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "LgetTakePictureManager;", "Ljava/util/Map;", "g", "LsetJpegQuality;", "d", "()LsetJpegQuality;", "Ljava/lang/String;", "Lcom/datadog/android/api/InternalLogger;", "()Lcom/datadog/android/api/InternalLogger;", "Z", "()Z", "()Ljava/lang/Long;", "Lcom/google/gson/JsonObject;", "()Lcom/google/gson/JsonObject;", "cancel", "()Ljava/lang/String;", "INotificationSideChannel", "Lcom/datadog/android/api/context/NetworkInfo;", "()Lcom/datadog/android/api/context/NetworkInfo;", "notify", "LImageCaptureExternalSyntheticLambda3;", "LImageCaptureExternalSyntheticLambda3;", "Ljava/lang/Thread;", "Ljava/lang/Thread;", "LonValidImageAvailable;", "()LonValidImageAvailable;"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class trySetFlashModeToCameraControl implements ImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0 {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final long TuitionPaymentFragmentspecialinlinedviewModeldefault3 = TimeUnit.SECONDS.toMillis(5);
    private static final long cancel = System.nanoTime();

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public final Context TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public final ImageReaderProxys.TuitionPaymentFragmentspecialinlinedviewModeldefault3 asInterface;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final String d;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    public final String INotificationSideChannel;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    public ImageCaptureExternalSyntheticLambda3 INotificationSideChannelStub;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public lambdasubmitStillCaptureRequest4 TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    private final isSupportedRotationDegrees TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public boolean cancelAll;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final InternalLogger asBinder;

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    public Thread INotificationSideChannelDefault;

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    private final Map<String, getTakePictureManager> g;

    private trySetFlashModeToCameraControl(Context context, String str, String str2, Function1<? super ImageAnalysisBlockingAnalyzer, ? extends InternalLogger> function1, ImageReaderProxys.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3, isSupportedRotationDegrees issupportedrotationdegrees) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(issupportedrotationdegrees, "");
        this.d = str;
        this.INotificationSideChannel = str2;
        this.asInterface = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = issupportedrotationdegrees;
        this.g = new ConcurrentHashMap();
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = applicationContext;
        this.asBinder = function1.invoke(this);
    }

    @Override // com.datadog.android.api.SdkCore
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from getter */
    public final String getINotificationSideChannel() {
        return this.INotificationSideChannel;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ trySetFlashModeToCameraControl(Context context, String str, String str2, DatadogCore$1 datadogCore$1, ImageReaderProxys.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3, isSupportedRotationDegrees issupportedrotationdegrees, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Function1 function1 = (i & 8) != 0 ? new Function1<ImageAnalysisBlockingAnalyzer, ImageCaptureExternalSyntheticLambda2>() { // from class: com.datadog.android.core.internal.DatadogCore$1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
            public final ImageCaptureExternalSyntheticLambda2 invoke(ImageAnalysisBlockingAnalyzer imageAnalysisBlockingAnalyzer) {
                Intrinsics.checkNotNullParameter(imageAnalysisBlockingAnalyzer, "");
                return new ImageCaptureExternalSyntheticLambda2(imageAnalysisBlockingAnalyzer, null, null, 6, null);
            }
        } : datadogCore$1;
        ImageReaderProxys.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault4 = (i & 16) != 0 ? null : tuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if ((i & 32) != 0) {
            isSupportedRotationDegrees.Companion companion = isSupportedRotationDegrees.INSTANCE;
            issupportedrotationdegrees = isSupportedRotationDegrees.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        }
        this(context, str, str2, function1, tuitionPaymentFragmentspecialinlinedviewModeldefault4, issupportedrotationdegrees);
    }

    @Override // defpackage.ImageAnalysisBlockingAnalyzer
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from getter */
    public final InternalLogger getAsBinder() {
        return this.asBinder;
    }

    @Override // defpackage.ImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0
    /* JADX INFO: renamed from: cancelAll, reason: from getter */
    public final boolean getCancelAll() {
        return this.cancelAll;
    }

    @Override // defpackage.ImageAnalysisBlockingAnalyzer
    public final ImageAnalysisAbstractAnalyzerExternalSyntheticLambda1 b(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.g.get(p0);
    }

    @Override // com.datadog.android.api.SdkCore
    public final void TuitionPaymentFragmentbindingInflater1() {
        for (getTakePictureManager gettakepicturemanager : this.g.values()) {
            gettakepicturemanager.a.TuitionPaymentFragmentbindingInflater1();
            gettakepicturemanager.b.b();
        }
        lambdasubmitStillCaptureRequest4 lambdasubmitstillcapturerequest4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        ImageReaderProxys imageReaderProxys = null;
        if (lambdasubmitstillcapturerequest4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            lambdasubmitstillcapturerequest4 = null;
        }
        ImageReaderProxys imageReaderProxys2 = lambdasubmitstillcapturerequest4.getNotifyChildrenChangedOptions;
        if (imageReaderProxys2 != null) {
            imageReaderProxys = imageReaderProxys2;
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        ImageProxyDownsampler.TuitionPaymentFragmentspecialinlinedviewModeldefault3(imageReaderProxys, "Clear all data", this.asBinder, new Runnable() { // from class: getImagePipeline
            @Override // java.lang.Runnable
            public final void run() {
                trySetFlashModeToCameraControl.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b);
            }
        });
    }

    @Override // defpackage.ImageAnalysisBlockingAnalyzer
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(String p0, Function1<? super Map<String, Object>, Unit> p1) {
        isSessionProcessorEnabledInCurrentCamera issessionprocessorenabledincurrentcameraRemoteActionCompatParcelizer;
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        getTakePictureManager gettakepicturemanager = this.g.get(p0);
        if (gettakepicturemanager == null || (issessionprocessorenabledincurrentcameraRemoteActionCompatParcelizer = RemoteActionCompatParcelizer()) == null) {
            return;
        }
        synchronized (gettakepicturemanager) {
            Map<String, ? extends Object> mutableMap = MapsKt.toMutableMap(issessionprocessorenabledincurrentcameraRemoteActionCompatParcelizer.b(p0));
            p1.invoke(mutableMap);
            issessionprocessorenabledincurrentcameraRemoteActionCompatParcelizer.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, mutableMap);
            Map<String, getTakePictureManager> map = this.g;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, getTakePictureManager> entry : map.entrySet()) {
                if (!Intrinsics.areEqual(entry.getKey(), p0)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                getTakePictureManager gettakepicturemanager2 = (getTakePictureManager) ((Map.Entry) it.next()).getValue();
                Map map2 = MapsKt.toMap(mutableMap);
                Intrinsics.checkNotNullParameter(p0, "");
                Intrinsics.checkNotNullParameter(map2, "");
                Set<clearCache> set = gettakepicturemanager2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                Intrinsics.checkNotNullExpressionValue(set, "");
                for (clearCache clearcache : set) {
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // defpackage.ImageAnalysisBlockingAnalyzer
    public final Map<String, Object> TuitionPaymentFragmentspecialinlinedviewModeldefault2(String p0) {
        Map<String, Object> mapB;
        Intrinsics.checkNotNullParameter(p0, "");
        isSessionProcessorEnabledInCurrentCamera issessionprocessorenabledincurrentcameraRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        return (issessionprocessorenabledincurrentcameraRemoteActionCompatParcelizer == null || (mapB = issessionprocessorenabledincurrentcameraRemoteActionCompatParcelizer.b(p0)) == null) ? MapsKt.emptyMap() : mapB;
    }

    @Override // defpackage.ImageAnalysisBlockingAnalyzer
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(final String p0, setRelativeRotation p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        getTakePictureManager gettakepicturemanager = this.g.get(p0);
        if (gettakepicturemanager != null) {
            if (gettakepicturemanager.TuitionPaymentFragmentbindingInflater1.get() != null) {
                this.asBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.WARN, InternalLogger.Target.USER, new Function0<String>() { // from class: com.datadog.android.core.internal.DatadogCore$setEventReceiver$2
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: merged with bridge method [inline-methods] */
                    public final String invoke() {
                        String str = String.format(Locale.US, "Feature \"%s\" already has event receiver registered, overwriting it.", Arrays.copyOf(new Object[]{p0}, 1));
                        Intrinsics.checkNotNullExpressionValue(str, "");
                        return str;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }
                }, null, false, null);
            }
            gettakepicturemanager.TuitionPaymentFragmentbindingInflater1.set(p1);
            return;
        }
        this.asBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.WARN, InternalLogger.Target.USER, new Function0<String>() { // from class: com.datadog.android.core.internal.DatadogCore$setEventReceiver$1
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                String str = String.format(Locale.US, "Cannot add event receiver for feature \"%s\", it is not registered.", Arrays.copyOf(new Object[]{p0}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "");
                return str;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, null, false, null);
    }

    @Override // defpackage.ImageAnalysisBlockingAnalyzer
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(String p0) {
        AtomicReference<setRelativeRotation> atomicReference;
        Intrinsics.checkNotNullParameter(p0, "");
        getTakePictureManager gettakepicturemanager = this.g.get(p0);
        if (gettakepicturemanager == null || (atomicReference = gettakepicturemanager.TuitionPaymentFragmentbindingInflater1) == null) {
            return;
        }
        atomicReference.set(null);
    }

    @Override // defpackage.ImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(byte[] p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b() >= 30 || this.g.containsKey("ndk-crash-reporting")) {
            lambdasubmitStillCaptureRequest4 lambdasubmitstillcapturerequest4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (lambdasubmitstillcapturerequest4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                lambdasubmitstillcapturerequest4 = null;
            }
            Intrinsics.checkNotNullParameter(p0, "");
            ((ImageCaptureCapabilities) lambdasubmitstillcapturerequest4.MediaBrowserCompat.getValue()).b((File) lambdasubmitstillcapturerequest4.INotificationSideChannelStubProxy.getValue(), new ImageCapture(p0, null, 2, null), false);
            return;
        }
        this.asBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.INFO, InternalLogger.Target.MAINTAINER, new Function0<String>() { // from class: com.datadog.android.core.internal.DatadogCore$writeLastViewEvent$1
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "No need to write last RUM view event: NDK crash reports feature is not enabled and API is below 30.";
            }
        }, null, false, null);
    }

    @Override // defpackage.ImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0
    public final List<ImageAnalysisAbstractAnalyzerExternalSyntheticLambda1> b() {
        return CollectionsKt.toList(this.g.values());
    }

    @Override // defpackage.ImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0
    public final recalculateTransformMatrixAndCropRect asInterface() {
        isSessionProcessorEnabledInCurrentCamera issessionprocessorenabledincurrentcameraRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        if (issessionprocessorenabledincurrentcameraRemoteActionCompatParcelizer != null) {
            return issessionprocessorenabledincurrentcameraRemoteActionCompatParcelizer.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        }
        return null;
    }

    public static boolean a(String p0) {
        return new Regex("[a-zA-Z0-9_:./-]{0,195}[a-zA-Z0-9_./-]").matches(p0);
    }

    public static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context p0) {
        return (p0.getApplicationInfo().flags & 2) != 0;
    }

    private final void INotificationSideChannelDefault() {
        if (this.INotificationSideChannelDefault != null) {
            try {
                Runtime runtime = Runtime.getRuntime();
                Thread thread = this.INotificationSideChannelDefault;
                if (thread == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    thread = null;
                }
                runtime.removeShutdownHook(thread);
            } catch (IllegalStateException e2) {
                this.asBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.ERROR, InternalLogger.Target.MAINTAINER, new Function0<String>() { // from class: com.datadog.android.core.internal.DatadogCore$removeShutdownHook$1
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
                    public final String invoke() {
                        return "Unable to remove shutdown hook, Runtime is already shutting down";
                    }
                }, e2, false, null);
            } catch (SecurityException e3) {
                this.asBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.ERROR, InternalLogger.Target.MAINTAINER, new Function0<String>() { // from class: com.datadog.android.core.internal.DatadogCore$removeShutdownHook$2
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
                    public final String invoke() {
                        return "Security Manager denied removing shutdown hook ";
                    }
                }, e3, false, null);
            }
        }
    }

    public void INotificationSideChannelStub() {
        ImageCaptureExternalSyntheticLambda3 imageCaptureExternalSyntheticLambda3;
        Iterator<Map.Entry<String, getTakePictureManager>> it = this.g.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        }
        this.g.clear();
        Context context = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if ((context instanceof Application) && (imageCaptureExternalSyntheticLambda3 = this.INotificationSideChannelStub) != null) {
            ((Application) context).unregisterActivityLifecycleCallbacks(imageCaptureExternalSyntheticLambda3);
        }
        lambdasubmitStillCaptureRequest4 lambdasubmitstillcapturerequest4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (lambdasubmitstillcapturerequest4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            lambdasubmitstillcapturerequest4 = null;
        }
        lambdasubmitstillcapturerequest4.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        this.cancelAll = false;
        INotificationSideChannelDefault();
    }

    /* JADX INFO: renamed from: trySetFlashModeToCameraControl$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\b\u0010\t"}, d2 = {"LtrySetFlashModeToCameraControl$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "J", "cancel", "TuitionPaymentFragmentbindingInflater1", "()J", "TuitionPaymentFragmentspecialinlinedviewModeldefault2"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static long TuitionPaymentFragmentbindingInflater1() {
            return trySetFlashModeToCameraControl.cancel;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static /* synthetic */ void b(trySetFlashModeToCameraControl trysetflashmodetocameracontrol) {
        Intrinsics.checkNotNullParameter(trysetflashmodetocameracontrol, "");
        trysetflashmodetocameracontrol.INotificationSideChannelStub();
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(trySetFlashModeToCameraControl trysetflashmodetocameracontrol, Configuration configuration) {
        Intrinsics.checkNotNullParameter(trysetflashmodetocameracontrol, "");
        Intrinsics.checkNotNullParameter(configuration, "");
        Intrinsics.checkNotNullParameter("rum", "");
        getTakePictureManager gettakepicturemanager = trysetflashmodetocameracontrol.g.get("rum");
        if (gettakepicturemanager != null) {
            gettakepicturemanager.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new LayoutSettings.TuitionPaymentFragmentspecialinlinedviewModeldefault1(configuration.TuitionPaymentFragmentspecialinlinedviewModeldefault1, configuration.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getWindowDurationMs(), configuration.b.INotificationSideChannel.getBaseStepMs(), configuration.b.f685a != null, configuration.b.b != null, configuration.b.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getMaxBatchesPerUploadJob()));
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(trySetFlashModeToCameraControl trysetflashmodetocameracontrol) {
        Intrinsics.checkNotNullParameter(trysetflashmodetocameracontrol, "");
        lambdasubmitStillCaptureRequest4 lambdasubmitstillcapturerequest4 = trysetflashmodetocameracontrol.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        File file = null;
        if (lambdasubmitstillcapturerequest4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            lambdasubmitstillcapturerequest4 = null;
        }
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = SearchBarAnimationHelper$$ExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = SearchBarAnimationHelper$$ExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        lambdasubmitStillCaptureRequest4.TuitionPaymentFragmentspecialinlinedviewModeldefault3(SearchBarAnimationHelper$$ExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -2140535701, new Object[]{lambdasubmitstillcapturerequest4}, 2140535702, SearchBarAnimationHelper$$ExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
        lambdasubmitStillCaptureRequest4 lambdasubmitstillcapturerequest5 = trysetflashmodetocameracontrol.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (lambdasubmitstillcapturerequest5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            lambdasubmitstillcapturerequest5 = null;
        }
        File file2 = lambdasubmitstillcapturerequest5.isConnected;
        if (file2 != null) {
            file = file2;
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        File file3 = new File(file, "last_fatal_anr_sent");
        if (ImageCaptureOutputFileResults.TuitionPaymentFragmentspecialinlinedviewModeldefault2(file3, lambdasubmitstillcapturerequest5.INotificationSideChannelStub)) {
            ImageCaptureOutputFileResults.TuitionPaymentFragmentbindingInflater1(file3, lambdasubmitstillcapturerequest5.INotificationSideChannelStub);
        }
    }

    public static Configuration TuitionPaymentFragmentspecialinlinedviewModeldefault1(Configuration p0) {
        return Configuration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(p0, Configuration.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b(p0.b, false, false, null, BatchSize.SMALL, UploadFrequency.FREQUENT, null, null, null, null, null, null, null, null, 8167));
    }

    @Override // defpackage.ImageAnalysisBlockingAnalyzer
    public final ScheduledExecutorService TuitionPaymentFragmentbindingInflater1(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        lambdasubmitStillCaptureRequest4 lambdasubmitstillcapturerequest4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        lambdanew1androidxcameracoreImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxy lambdanew1androidxcameracoreimageanalysisnonblockinganalyzercacheanalyzingimageproxy = null;
        if (lambdasubmitstillcapturerequest4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            lambdasubmitstillcapturerequest4 = null;
        }
        Intrinsics.checkNotNullParameter(p0, "");
        nativeWriteJpegToSurface nativewritejpegtosurface = lambdasubmitstillcapturerequest4.getItem;
        InternalLogger internalLogger = lambdasubmitstillcapturerequest4.INotificationSideChannelStub;
        lambdanew1androidxcameracoreImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxy lambdanew1androidxcameracoreimageanalysisnonblockinganalyzercacheanalyzingimageproxy2 = lambdasubmitstillcapturerequest4.TuitionPaymentFragmentbindingInflater1;
        if (lambdanew1androidxcameracoreimageanalysisnonblockinganalyzercacheanalyzingimageproxy2 != null) {
            lambdanew1androidxcameracoreimageanalysisnonblockinganalyzercacheanalyzingimageproxy = lambdanew1androidxcameracoreimageanalysisnonblockinganalyzercacheanalyzingimageproxy2;
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return nativewritejpegtosurface.TuitionPaymentFragmentspecialinlinedviewModeldefault3(internalLogger, p0, lambdanew1androidxcameracoreimageanalysisnonblockinganalyzercacheanalyzingimageproxy);
    }

    @Override // defpackage.ImageAnalysisBlockingAnalyzer
    public final ExecutorService TuitionPaymentFragmentspecialinlinedviewModeldefault1(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        lambdasubmitStillCaptureRequest4 lambdasubmitstillcapturerequest4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        lambdanew1androidxcameracoreImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxy lambdanew1androidxcameracoreimageanalysisnonblockinganalyzercacheanalyzingimageproxy = null;
        if (lambdasubmitstillcapturerequest4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            lambdasubmitstillcapturerequest4 = null;
        }
        Intrinsics.checkNotNullParameter(p0, "");
        ImageReaderProxys.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = lambdasubmitstillcapturerequest4.cancel;
        InternalLogger internalLogger = lambdasubmitstillcapturerequest4.INotificationSideChannelStub;
        lambdanew1androidxcameracoreImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxy lambdanew1androidxcameracoreimageanalysisnonblockinganalyzercacheanalyzingimageproxy2 = lambdasubmitstillcapturerequest4.TuitionPaymentFragmentbindingInflater1;
        if (lambdanew1androidxcameracoreimageanalysisnonblockinganalyzercacheanalyzingimageproxy2 != null) {
            lambdanew1androidxcameracoreimageanalysisnonblockinganalyzercacheanalyzingimageproxy = lambdanew1androidxcameracoreimageanalysisnonblockinganalyzercacheanalyzingimageproxy2;
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1(internalLogger, p0, lambdanew1androidxcameracoreimageanalysisnonblockinganalyzercacheanalyzingimageproxy);
    }

    @Override // defpackage.ImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0
    public final long asBinder() {
        lambdasubmitStillCaptureRequest4 lambdasubmitstillcapturerequest4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (lambdasubmitstillcapturerequest4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            lambdasubmitstillcapturerequest4 = null;
        }
        return lambdasubmitstillcapturerequest4.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
    }

    private isSessionProcessorEnabledInCurrentCamera RemoteActionCompatParcelizer() {
        lambdasubmitStillCaptureRequest4 lambdasubmitstillcapturerequest4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        lambdasubmitStillCaptureRequest4 lambdasubmitstillcapturerequest5 = null;
        if (lambdasubmitstillcapturerequest4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            lambdasubmitstillcapturerequest4 = null;
        }
        if (!lambdasubmitstillcapturerequest4.onTransact.get()) {
            return null;
        }
        lambdasubmitStillCaptureRequest4 lambdasubmitstillcapturerequest6 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (lambdasubmitstillcapturerequest6 != null) {
            lambdasubmitstillcapturerequest5 = lambdasubmitstillcapturerequest6;
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return lambdasubmitstillcapturerequest5.asInterface;
    }

    @Override // defpackage.ImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0
    public final setJpegQuality d() {
        lambdasubmitStillCaptureRequest4 lambdasubmitstillcapturerequest4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (lambdasubmitstillcapturerequest4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            lambdasubmitstillcapturerequest4 = null;
        }
        return lambdasubmitstillcapturerequest4.cancelAll;
    }

    @Override // defpackage.ImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0
    public final Long a() {
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        lambdasubmitStillCaptureRequest4 lambdasubmitstillcapturerequest4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (lambdasubmitstillcapturerequest4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            lambdasubmitstillcapturerequest4 = null;
        }
        File file = lambdasubmitstillcapturerequest4.isConnected;
        if (file == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            file = null;
        }
        File file2 = new File(file, "last_fatal_anr_sent");
        if (!ImageCaptureOutputFileResults.TuitionPaymentFragmentspecialinlinedviewModeldefault2(file2, lambdasubmitstillcapturerequest4.INotificationSideChannelStub) || (strTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ImageCaptureOutputFileResults.TuitionPaymentFragmentspecialinlinedviewModeldefault2(file2, Charsets.UTF_8, lambdasubmitstillcapturerequest4.INotificationSideChannelStub)) == null) {
            return null;
        }
        return StringsKt.toLongOrNull(strTuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    @Override // defpackage.ImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0
    public final JsonObject g() {
        lambdasubmitStillCaptureRequest4 lambdasubmitstillcapturerequest4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (lambdasubmitstillcapturerequest4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            lambdasubmitstillcapturerequest4 = null;
        }
        return (JsonObject) lambdasubmitstillcapturerequest4.getInterfaceDescriptor.getValue();
    }

    @Override // defpackage.ImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0
    public final NetworkInfo INotificationSideChannel() {
        lambdasubmitStillCaptureRequest4 lambdasubmitstillcapturerequest4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (lambdasubmitstillcapturerequest4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            lambdasubmitstillcapturerequest4 = null;
        }
        return lambdasubmitstillcapturerequest4.read.getTuitionPaymentFragmentspecialinlinedviewModeldefault2();
    }

    @Override // defpackage.ImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0
    public final ExecutorService onTransact() {
        lambdasubmitStillCaptureRequest4 lambdasubmitstillcapturerequest4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        ImageReaderProxys imageReaderProxys = null;
        if (lambdasubmitstillcapturerequest4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            lambdasubmitstillcapturerequest4 = null;
        }
        ImageReaderProxys imageReaderProxys2 = lambdasubmitstillcapturerequest4.getNotifyChildrenChangedOptions;
        if (imageReaderProxys2 != null) {
            imageReaderProxys = imageReaderProxys2;
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return imageReaderProxys;
    }

    @Override // com.datadog.android.api.SdkCore
    public final onValidImageAvailable TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        lambdasubmitStillCaptureRequest4 lambdasubmitstillcapturerequest4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (lambdasubmitstillcapturerequest4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            lambdasubmitstillcapturerequest4 = null;
        }
        getInputImage getinputimage = lambdasubmitstillcapturerequest4.MediaBrowserCompatCallbackHandler;
        long jTuitionPaymentFragmentspecialinlinedviewModeldefault1 = getinputimage.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        long jB = getinputimage.b();
        long j = jB - jTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        return new onValidImageAvailable(TimeUnit.MILLISECONDS.toNanos(jTuitionPaymentFragmentspecialinlinedviewModeldefault1), TimeUnit.MILLISECONDS.toNanos(jB), TimeUnit.MILLISECONDS.toNanos(j), j);
    }

    @Override // defpackage.ImageAnalysisBlockingAnalyzer
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(detach p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        lambdasubmitStillCaptureRequest4 lambdasubmitstillcapturerequest4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        lambdasubmitStillCaptureRequest4 lambdasubmitstillcapturerequest5 = null;
        if (lambdasubmitstillcapturerequest4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            lambdasubmitstillcapturerequest4 = null;
        }
        getTakePictureManager gettakepicturemanager = new getTakePictureManager(lambdasubmitstillcapturerequest4, p0, this.asBinder);
        this.g.put(p0.getB(), gettakepicturemanager);
        gettakepicturemanager.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, this.d);
        String b = p0.getB();
        if (!Intrinsics.areEqual(b, "logs")) {
            if (Intrinsics.areEqual(b, "rum")) {
                lambdasubmitStillCaptureRequest4 lambdasubmitstillcapturerequest6 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (lambdasubmitstillcapturerequest6 != null) {
                    lambdasubmitstillcapturerequest5 = lambdasubmitstillcapturerequest6;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                lambdasubmitstillcapturerequest5.IconCompatParcelizer.TuitionPaymentFragmentbindingInflater1(this, NdkCrashHandler.ReportTarget.RUM);
                return;
            }
            return;
        }
        lambdasubmitStillCaptureRequest4 lambdasubmitstillcapturerequest7 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (lambdasubmitstillcapturerequest7 != null) {
            lambdasubmitstillcapturerequest5 = lambdasubmitstillcapturerequest7;
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        lambdasubmitstillcapturerequest5.IconCompatParcelizer.TuitionPaymentFragmentbindingInflater1(this, NdkCrashHandler.ReportTarget.LOGS);
    }

    @Override // defpackage.ImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0
    public final void b(long p0) {
        lambdasubmitStillCaptureRequest4 lambdasubmitstillcapturerequest4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (lambdasubmitstillcapturerequest4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            lambdasubmitstillcapturerequest4 = null;
        }
        File file = lambdasubmitstillcapturerequest4.isConnected;
        if (file == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            file = null;
        }
        File file2 = new File(file, "last_fatal_anr_sent");
        String strValueOf = String.valueOf(p0);
        Charset charset = Charsets.UTF_8;
        InternalLogger internalLogger = lambdasubmitstillcapturerequest4.INotificationSideChannelStub;
        Intrinsics.checkNotNullParameter(file2, "");
        Intrinsics.checkNotNullParameter(strValueOf, "");
        Intrinsics.checkNotNullParameter(charset, "");
        Intrinsics.checkNotNullParameter(internalLogger, "");
        if (ImageCaptureOutputFileResults.TuitionPaymentFragmentspecialinlinedviewModeldefault2(file2, internalLogger) && ImageCaptureOutputFileResults.TuitionPaymentFragmentspecialinlinedviewModeldefault3(file2, internalLogger)) {
            ImageCaptureOutputFileResults.TuitionPaymentFragmentspecialinlinedviewModeldefault2(file2, null, internalLogger, new FileExtKt$writeTextSafe$1(strValueOf, charset));
        }
    }
}
