package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.exifinterface.media.ExifInterface;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.SdkCore;
import com.datadog.android.rum.GlobalRumMonitor;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000 \n2\u00020\u00012\u00020\u0002:\u0001\nB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0005¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\fH\u0005¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\fH\u0017¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0016\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0017\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\fH\u0017¢\u0006\u0004\b\u0018\u0010\u0013J\u0017\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0019\u0010\u0015J\u0017\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u001a\u0010\u0015J\u001f\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u001b2\u0006\u0010\u0010\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010\u001f\u001a\u00020\u00112\b\u0010\u0006\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001f\u0010 J+\u0010\r\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010!2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00028\u00000\"H\u0004¢\u0006\u0004\b\r\u0010$R\u0014\u0010\u001d\u001a\u00020%8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010&R\u0016\u0010\n\u001a\u00020#8\u0005@\u0005X\u0085,¢\u0006\u0006\n\u0004\b'\u0010(R\u001a\u0010\r\u001a\u0004\u0018\u00010\f*\u00020\u00058CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010)"}, d2 = {"LSafeCloseImageReaderProxyExternalSyntheticLambda0;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "LSurfaceOutputEventEventCode;", "<init>", "()V", "Landroid/content/Intent;", "p0", "", "", "", "b", "(Landroid/content/Intent;)Ljava/util/Map;", "Landroid/os/Bundle;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Landroid/os/Bundle;)Ljava/util/Map;", "Landroid/app/Activity;", "p1", "", "onActivityCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivityDestroyed", "(Landroid/app/Activity;)V", "onActivityPaused", "onActivityResumed", "onActivitySaveInstanceState", "onActivityStarted", "onActivityStopped", "Lcom/datadog/android/api/SdkCore;", "Landroid/content/Context;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Lcom/datadog/android/api/SdkCore;Landroid/content/Context;)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Landroid/content/Context;)V", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function1;", "LImageAnalysisBlockingAnalyzer;", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Lcom/datadog/android/api/InternalLogger;", "()Lcom/datadog/android/api/InternalLogger;", "TuitionPaymentFragmentbindingInflater1", "LImageAnalysisBlockingAnalyzer;", "(Landroid/content/Intent;)Landroid/os/Bundle;"}, k = 1, mv = {1, 7, 0}, xi = 48)
public abstract class SafeCloseImageReaderProxyExternalSyntheticLambda0 implements Application.ActivityLifecycleCallbacks, SurfaceOutputEventEventCode {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public ImageAnalysisBlockingAnalyzer b;

    public final InternalLogger b() {
        ImageAnalysisBlockingAnalyzer imageAnalysisBlockingAnalyzer = this.b;
        if (imageAnalysisBlockingAnalyzer != null) {
            if (imageAnalysisBlockingAnalyzer == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                imageAnalysisBlockingAnalyzer = null;
            }
            return imageAnalysisBlockingAnalyzer.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        }
        InternalLogger.Companion companion = InternalLogger.INSTANCE;
        return InternalLogger.Companion.b();
    }

    @Override // defpackage.SurfaceOutputEventEventCode
    public void TuitionPaymentFragmentspecialinlinedviewModeldefault3(SdkCore p0, Context p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        if (p1 instanceof Application) {
            ImageAnalysisBlockingAnalyzer imageAnalysisBlockingAnalyzer = (ImageAnalysisBlockingAnalyzer) p0;
            Intrinsics.checkNotNullParameter(imageAnalysisBlockingAnalyzer, "");
            this.b = imageAnalysisBlockingAnalyzer;
            ((Application) p1).registerActivityLifecycleCallbacks(this);
            return;
        }
        ((ImageAnalysisBlockingAnalyzer) p0).TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.ERROR, InternalLogger.Target.USER, new Function0<String>() { // from class: com.datadog.android.rum.tracking.ActivityLifecycleTrackingStrategy$register$1
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "In order to use the RUM automatic tracking feature you will have to use the Application context when initializing the SDK";
            }
        }, null, false, null);
    }

    @Override // defpackage.SurfaceOutputEventEventCode
    public void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context p0) {
        if (p0 instanceof Application) {
            ((Application) p0).unregisterActivityLifecycleCallbacks(this);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity p0, Bundle p1) {
        Bundle extras;
        String str;
        Intrinsics.checkNotNullParameter(p0, "");
        ImageAnalysisBlockingAnalyzer imageAnalysisBlockingAnalyzer = this.b;
        if (imageAnalysisBlockingAnalyzer != null) {
            if (imageAnalysisBlockingAnalyzer == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                imageAnalysisBlockingAnalyzer = null;
            }
            dequeImageProxy dequeimageproxyTuitionPaymentFragmentbindingInflater1 = GlobalRumMonitor.b(imageAnalysisBlockingAnalyzer).TuitionPaymentFragmentbindingInflater1();
            if (dequeimageproxyTuitionPaymentFragmentbindingInflater1 != null) {
                Intent intent = p0.getIntent();
                Intrinsics.checkNotNullExpressionValue(intent, "");
                Intrinsics.checkNotNullParameter(intent, "");
                try {
                    extras = intent.getExtras();
                } catch (Exception unused) {
                    extras = null;
                }
                String string = extras != null ? extras.getString("_dd.synthetics.test_id") : null;
                String string2 = extras != null ? extras.getString("_dd.synthetics.result_id") : null;
                if (dequeimageproxyTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                    return;
                }
                dequeimageproxyTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
                String str2 = string;
                if (str2 == null || StringsKt.isBlank(str2) || (str = string2) == null || StringsKt.isBlank(str)) {
                    return;
                }
                dequeimageproxyTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(string, string2);
            }
        }
    }

    protected final Map<String, Object> b(Intent p0) {
        if (p0 == null) {
            return MapsKt.emptyMap();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String action = p0.getAction();
        if (action != null) {
            linkedHashMap.put("view.intent.action", action);
        }
        String dataString = p0.getDataString();
        if (dataString != null) {
            linkedHashMap.put("view.intent.uri", dataString);
        }
        Bundle bundleTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(p0);
        if (bundleTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
            Set<String> setKeySet = bundleTuitionPaymentFragmentspecialinlinedviewModeldefault2.keySet();
            Intrinsics.checkNotNullExpressionValue(setKeySet, "");
            for (String str : setKeySet) {
                linkedHashMap.put("view.arguments.".concat(String.valueOf(str)), bundleTuitionPaymentFragmentspecialinlinedviewModeldefault2.get(str));
            }
        }
        return linkedHashMap;
    }

    public static Map<String, Object> TuitionPaymentFragmentspecialinlinedviewModeldefault2(Bundle p0) {
        if (p0 == null) {
            return MapsKt.emptyMap();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Set<String> setKeySet = p0.keySet();
        Intrinsics.checkNotNullExpressionValue(setKeySet, "");
        for (String str : setKeySet) {
            linkedHashMap.put("view.arguments.".concat(String.valueOf(str)), p0.get(str));
        }
        return linkedHashMap;
    }

    public final <T> T TuitionPaymentFragmentspecialinlinedviewModeldefault2(Function1<? super ImageAnalysisBlockingAnalyzer, ? extends T> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        ImageAnalysisBlockingAnalyzer imageAnalysisBlockingAnalyzer = this.b;
        if (imageAnalysisBlockingAnalyzer != null) {
            if (imageAnalysisBlockingAnalyzer == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                imageAnalysisBlockingAnalyzer = null;
            }
            return p0.invoke(imageAnalysisBlockingAnalyzer);
        }
        InternalLogger.Companion companion = InternalLogger.INSTANCE;
        InternalLogger.Companion.b().TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.INFO, InternalLogger.Target.USER, new Function0<String>() { // from class: com.datadog.android.rum.tracking.ActivityLifecycleTrackingStrategy$withSdkCore$1
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "RUM feature is not initialized yet, you need to register it with a SDK instance by calling SdkCore#registerFeature method. Cannot provide SDK instance for view tracking.";
            }
        }, null, false, null);
        return null;
    }

    private final Bundle TuitionPaymentFragmentspecialinlinedviewModeldefault2(Intent intent) {
        InternalLogger internalLoggerB;
        try {
            return intent.getExtras();
        } catch (Exception e2) {
            if (this.b == null) {
                InternalLogger.Companion companion = InternalLogger.INSTANCE;
                internalLoggerB = InternalLogger.Companion.b();
            } else {
                ImageAnalysisBlockingAnalyzer imageAnalysisBlockingAnalyzer = this.b;
                if (imageAnalysisBlockingAnalyzer == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    imageAnalysisBlockingAnalyzer = null;
                }
                internalLoggerB = imageAnalysisBlockingAnalyzer.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            }
            internalLoggerB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.ERROR, InternalLogger.Target.USER, new Function0<String>() { // from class: com.datadog.android.rum.tracking.ActivityLifecycleTrackingStrategy$safeExtras$1
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "Error getting Intent extras, ignoring it.";
                }
            }, e2, false, null);
            return null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity p0) {
        Intrinsics.checkNotNullParameter(p0, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity p0) {
        Intrinsics.checkNotNullParameter(p0, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity p0) {
        Intrinsics.checkNotNullParameter(p0, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity p0, Bundle p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity p0) {
        Intrinsics.checkNotNullParameter(p0, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity p0) {
        Intrinsics.checkNotNullParameter(p0, "");
    }
}
