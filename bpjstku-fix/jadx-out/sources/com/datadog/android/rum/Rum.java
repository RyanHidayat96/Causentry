package com.datadog.android.rum;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.datadog.android.Datadog;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.SdkCore;
import com.datadog.android.telemetry.internal.TelemetryEventHandler;
import defpackage.ImageAnalysisBlockingAnalyzer;
import defpackage.ImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0;
import defpackage.ImageProxyDownsampler;
import defpackage.PreviewExternalSyntheticLambda2;
import defpackage.PreviewSurfaceProvider;
import defpackage.createIsolatedReader;
import defpackage.getPreviewCapabilities;
import defpackage.removeStaleData;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/datadog/android/rum/Rum;", "", "<init>", "()V"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class Rum {
    public static final Rum INSTANCE = new Rum();

    private Rum() {
    }

    @JvmStatic
    public static final void enable(RumConfiguration rumConfiguration) {
        PreviewSurfaceProvider previewSurfaceProvider;
        final ApplicationExitInfo applicationExitInfo;
        Object next;
        InternalLogger internalLoggerB;
        Intrinsics.checkNotNullParameter(rumConfiguration, "");
        SdkCore sdkCoreTuitionPaymentFragmentspecialinlinedviewModeldefault1 = Datadog.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null);
        Intrinsics.checkNotNullParameter(rumConfiguration, "");
        Intrinsics.checkNotNullParameter(sdkCoreTuitionPaymentFragmentspecialinlinedviewModeldefault1, "");
        if (!(sdkCoreTuitionPaymentFragmentspecialinlinedviewModeldefault1 instanceof ImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0)) {
            ImageAnalysisBlockingAnalyzer imageAnalysisBlockingAnalyzer = sdkCoreTuitionPaymentFragmentspecialinlinedviewModeldefault1 instanceof ImageAnalysisBlockingAnalyzer ? (ImageAnalysisBlockingAnalyzer) sdkCoreTuitionPaymentFragmentspecialinlinedviewModeldefault1 : null;
            if (imageAnalysisBlockingAnalyzer == null || (internalLoggerB = imageAnalysisBlockingAnalyzer.getAsBinder()) == null) {
                InternalLogger.Companion companion = InternalLogger.INSTANCE;
                internalLoggerB = InternalLogger.Companion.b();
            }
            internalLoggerB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.ERROR, InternalLogger.Target.USER, AnonymousClass1.TuitionPaymentFragmentbindingInflater1, null, false, null);
            return;
        }
        if (StringsKt.isBlank(rumConfiguration.b)) {
            ((ImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0) sdkCoreTuitionPaymentFragmentspecialinlinedviewModeldefault1).getAsBinder().TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.ERROR, InternalLogger.Target.USER, new Function0<String>() { // from class: com.datadog.android.rum.Rum.enable.2
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "You're trying to create a RumMonitor instance, but the RUM application id was empty. No RUM data will be sent.";
                }
            }, null, false, null);
            return;
        }
        ImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0 imageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0 = (ImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0) sdkCoreTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (imageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0.b("rum") != null) {
            imageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0.getAsBinder().TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.WARN, InternalLogger.Target.USER, new Function0<String>() { // from class: com.datadog.android.rum.Rum.enable.3
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "RUM Feature is already enabled in this SDK core, ignoring the call to enable it.";
                }
            }, null, false, null);
            return;
        }
        final removeStaleData removestaledata = new removeStaleData((ImageAnalysisBlockingAnalyzer) sdkCoreTuitionPaymentFragmentspecialinlinedviewModeldefault1, rumConfiguration.b, rumConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault1, null, 8, null);
        imageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(removestaledata);
        PreviewExternalSyntheticLambda2 previewExternalSyntheticLambda2 = new PreviewExternalSyntheticLambda2(imageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0.getAsBinder());
        PreviewSurfaceProvider previewSurfaceProvider2 = new PreviewSurfaceProvider(removestaledata.TuitionPaymentFragmentspecialinlinedviewModeldefault1, imageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0, removestaledata.getInterfaceDescriptor, removestaledata.a, removestaledata.getExtras, removestaledata.asInterface, new Handler(Looper.getMainLooper()), new TelemetryEventHandler(imageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0, new createIsolatedReader(removestaledata.MediaBrowserCompat), new createIsolatedReader(removestaledata.write), previewExternalSyntheticLambda2, 0, 16, null), previewExternalSyntheticLambda2, imageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0.d(), removestaledata.asBinder, removestaledata.RemoteActionCompatParcelizer, removestaledata.INotificationSideChannel, removestaledata.read, imageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1("rum-pipeline"));
        if (Build.VERSION.SDK_INT >= 30) {
            previewSurfaceProvider = previewSurfaceProvider2;
            ExecutorService executorService = previewSurfaceProvider.TuitionPaymentFragmentbindingInflater1;
            Intrinsics.checkNotNullParameter(executorService, "");
            Context context = removestaledata.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                context = null;
            }
            Object systemService = context.getSystemService("activity");
            Intrinsics.checkNotNull(systemService, "");
            try {
                List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) systemService).getHistoricalProcessExitReasons(null, 0, 0);
                Intrinsics.checkNotNullExpressionValue(historicalProcessExitReasons, "");
                Iterator<T> it = historicalProcessExitReasons.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((ApplicationExitInfo) next).getReason() != 6);
                applicationExitInfo = (ApplicationExitInfo) next;
            } catch (RuntimeException e2) {
                removestaledata.IconCompatParcelizer.getAsBinder().TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.ERROR, InternalLogger.Target.MAINTAINER, new Function0<String>() { // from class: com.datadog.android.rum.internal.RumFeature$consumeLastFatalAnr$lastKnownAnr$2
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final String invoke() {
                        return "Couldn't get historical exit reasons";
                    }
                }, e2, false, null);
                applicationExitInfo = null;
            }
            if (applicationExitInfo != null) {
                ImageProxyDownsampler.TuitionPaymentFragmentspecialinlinedviewModeldefault3(executorService, "Send fatal ANR", removestaledata.IconCompatParcelizer.getAsBinder(), new Runnable() { // from class: matchImages
                    @Override // java.lang.Runnable
                    public final void run() {
                        removeStaleData.E_(removestaledata, applicationExitInfo);
                    }
                });
            }
        } else {
            previewSurfaceProvider = previewSurfaceProvider2;
        }
        GlobalRumMonitor globalRumMonitor = GlobalRumMonitor.INSTANCE;
        GlobalRumMonitor.b(previewSurfaceProvider, sdkCoreTuitionPaymentFragmentspecialinlinedviewModeldefault1);
        previewSurfaceProvider.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new getPreviewCapabilities.getInterfaceDescriptor(DdRumContentProvider.INSTANCE.getProcessImportance$dd_sdk_android_rum_release() == 100, null, 2, null));
    }
}
