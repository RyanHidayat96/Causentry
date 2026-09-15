package com.datadog.android.rum;

import com.datadog.android.Datadog;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.SdkCore;
import defpackage.ImageAnalysisBlockingAnalyzer;
import defpackage.PreviewDefaults;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u0007\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u000f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/datadog/android/rum/GlobalRumMonitor;", "", "<init>", "()V", "Lcom/datadog/android/api/SdkCore;", "p0", "Lcom/datadog/android/rum/RumMonitor;", "b", "(Lcom/datadog/android/api/SdkCore;)Lcom/datadog/android/rum/RumMonitor;", "p1", "", "(Lcom/datadog/android/rum/RumMonitor;Lcom/datadog/android/api/SdkCore;)Z", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Lcom/datadog/android/api/SdkCore;)V", "", "TuitionPaymentFragmentbindingInflater1", "Ljava/util/Map;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class GlobalRumMonitor {
    public static final GlobalRumMonitor INSTANCE = new GlobalRumMonitor();

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private static final Map<SdkCore, RumMonitor> TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new LinkedHashMap();

    private GlobalRumMonitor() {
    }

    @JvmStatic
    public static final RumMonitor b(final SdkCore p0) {
        PreviewDefaults previewDefaults;
        InternalLogger internalLoggerTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Intrinsics.checkNotNullParameter(p0, "");
        Map<SdkCore, RumMonitor> map = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        synchronized (map) {
            previewDefaults = map.get(p0);
            if (previewDefaults == null) {
                ImageAnalysisBlockingAnalyzer imageAnalysisBlockingAnalyzer = p0 instanceof ImageAnalysisBlockingAnalyzer ? (ImageAnalysisBlockingAnalyzer) p0 : null;
                if (imageAnalysisBlockingAnalyzer != null && (internalLoggerTuitionPaymentFragmentspecialinlinedviewModeldefault3 = imageAnalysisBlockingAnalyzer.TuitionPaymentFragmentspecialinlinedviewModeldefault3()) != null) {
                    internalLoggerTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.WARN, InternalLogger.Target.USER, new Function0<String>() { // from class: com.datadog.android.rum.GlobalRumMonitor$get$1$1
                        @Override // kotlin.jvm.functions.Function0
                        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                        public final String invoke() {
                            String str = String.format(Locale.US, "No RumMonitor for the SDK instance with name %s found, returning no-op implementation.", Arrays.copyOf(new Object[]{p0.TuitionPaymentFragmentspecialinlinedviewModeldefault2()}, 1));
                            Intrinsics.checkNotNullExpressionValue(str, "");
                            return str;
                        }

                        {
                            super(0);
                        }
                    }, null, false, null);
                }
                previewDefaults = new PreviewDefaults();
            }
        }
        return previewDefaults;
    }

    public static boolean b(RumMonitor p0, SdkCore p1) {
        boolean z;
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Map<SdkCore, RumMonitor> map = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        synchronized (map) {
            if (!map.containsKey(p1)) {
                map.put(p1, p0);
                z = true;
            } else {
                ((ImageAnalysisBlockingAnalyzer) p1).TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.WARN, InternalLogger.Target.USER, new Function0<String>() { // from class: com.datadog.android.rum.GlobalRumMonitor$registerIfAbsent$1$1
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
                    public final String invoke() {
                        return "A RumMonitor has already been registered for this SDK instance";
                    }
                }, null, false, null);
                z = false;
            }
        }
        return z;
    }

    public static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(SdkCore p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        Map<SdkCore, RumMonitor> map = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        synchronized (map) {
            map.remove(p0);
        }
    }

    @JvmStatic
    public static final RumMonitor get() {
        return b(Datadog.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null));
    }
}
