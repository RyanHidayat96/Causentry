package defpackage;

import android.util.Log;
import com.datadog.android.Datadog;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.internal.logger.SdkInternalLogger$1;
import com.datadog.android.core.internal.logger.SdkInternalLogger$2;
import com.datadog.android.core.metrics.TelemetryMetricType;
import defpackage.ImageCaptureExternalSyntheticLambda4;
import defpackage.analyzeImage;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0001\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B3\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\u0004\b\b\u0010\tJW\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u000b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0016\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J]\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\n2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00172\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0016\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ;\u0010\u0015\u001a\u00020\u00142\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00112\u0006\u0010\u0007\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u0015\u0010\u001eJM\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\n2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u001fH\u0002¢\u0006\u0004\b\u0018\u0010 J1\u0010\u0015\u001a\u0004\u0018\u00010\"2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020!2\u0006\u0010\u0007\u001a\u00020\u001b2\u0006\u0010\u000e\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0015\u0010#J\u0013\u0010\u001c\u001a\u00020$*\u00020\nH\u0002¢\u0006\u0004\b\u001c\u0010%R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u001f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010(R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\f0\u001f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010(R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\f0\u001f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b)\u0010(R\u0016\u0010,\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020\u00058\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b-\u0010'"}, d2 = {"LImageCaptureExternalSyntheticLambda2;", "Lcom/datadog/android/api/InternalLogger;", "LImageAnalysisBlockingAnalyzer;", "p0", "Lkotlin/Function0;", "LImageCaptureExternalSyntheticLambda4;", "p1", "p2", "<init>", "(LImageAnalysisBlockingAnalyzer;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "Lcom/datadog/android/api/InternalLogger$Level;", "Lcom/datadog/android/api/InternalLogger$Target;", "", "", "p3", "", "p4", "", "", "p5", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Lcom/datadog/android/api/InternalLogger$Level;Lcom/datadog/android/api/InternalLogger$Target;Lkotlin/jvm/functions/Function0;Ljava/lang/Throwable;ZLjava/util/Map;)V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Lcom/datadog/android/api/InternalLogger$Level;Ljava/util/List;Lkotlin/jvm/functions/Function0;Ljava/lang/Throwable;ZLjava/util/Map;)V", "LLayoutSettings$b;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(LLayoutSettings$b;F)V", "(Lkotlin/jvm/functions/Function0;Ljava/util/Map;F)V", "", "(LImageCaptureExternalSyntheticLambda4;Lcom/datadog/android/api/InternalLogger$Level;Lkotlin/jvm/functions/Function0;Ljava/lang/Throwable;ZLjava/util/Set;)V", "Lcom/datadog/android/core/metrics/TelemetryMetricType;", "LImageReaderFormatRecommenderFormatCombo;", "(Ljava/lang/String;Lcom/datadog/android/core/metrics/TelemetryMetricType;FLjava/lang/String;)LImageReaderFormatRecommenderFormatCombo;", "", "(Lcom/datadog/android/api/InternalLogger$Level;)I", "TuitionPaymentFragmentbindingInflater1", "LImageCaptureExternalSyntheticLambda4;", "Ljava/util/Set;", "a", "asInterface", "LImageAnalysisBlockingAnalyzer;", "b", "g", "asBinder"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class ImageCaptureExternalSyntheticLambda2 implements InternalLogger {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final ImageCaptureExternalSyntheticLambda4 TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final Set<String> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final Set<String> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Set<String> TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final ImageAnalysisBlockingAnalyzer b;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final ImageCaptureExternalSyntheticLambda4 asBinder;

    private ImageCaptureExternalSyntheticLambda2(ImageAnalysisBlockingAnalyzer imageAnalysisBlockingAnalyzer, Function0<ImageCaptureExternalSyntheticLambda4> function0, Function0<ImageCaptureExternalSyntheticLambda4> function1) {
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.b = imageAnalysisBlockingAnalyzer;
        this.asBinder = function0.invoke();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = function1.invoke();
        this.TuitionPaymentFragmentbindingInflater1 = new LinkedHashSet();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new LinkedHashSet();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new LinkedHashSet();
    }

    public /* synthetic */ ImageCaptureExternalSyntheticLambda2(ImageAnalysisBlockingAnalyzer imageAnalysisBlockingAnalyzer, SdkInternalLogger$1 sdkInternalLogger$1, SdkInternalLogger$2 sdkInternalLogger$2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(imageAnalysisBlockingAnalyzer, (i & 2) != 0 ? new Function0<ImageCaptureExternalSyntheticLambda4>() { // from class: com.datadog.android.core.internal.logger.SdkInternalLogger$1
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ImageCaptureExternalSyntheticLambda4 invoke() {
                return new ImageCaptureExternalSyntheticLambda4("Datadog", new Function1<Integer, Boolean>() { // from class: com.datadog.android.core.internal.logger.SdkInternalLogger$1.1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* synthetic */ Boolean invoke(Integer num) {
                        return TuitionPaymentFragmentbindingInflater1(num.intValue());
                    }

                    public final Boolean TuitionPaymentFragmentbindingInflater1(int i2) {
                        return Boolean.valueOf(i2 >= Datadog.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
                    }
                });
            }
        } : sdkInternalLogger$1, (i & 4) != 0 ? new Function0<ImageCaptureExternalSyntheticLambda4>() { // from class: com.datadog.android.core.internal.logger.SdkInternalLogger$2
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ImageCaptureExternalSyntheticLambda4 invoke() {
                Boolean bool = analyzeImage.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                Intrinsics.checkNotNullExpressionValue(bool, "");
                if (bool.booleanValue()) {
                    return new ImageCaptureExternalSyntheticLambda4("DD_LOG", null, 2, null);
                }
                return null;
            }
        } : sdkInternalLogger$2);
    }

    @Override // com.datadog.android.api.InternalLogger
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level p0, InternalLogger.Target p1, Function0<String> p2, Throwable p3, boolean p4, Map<String, ? extends Object> p5) {
        ImageAnalysisBlockingAnalyzer imageAnalysisBlockingAnalyzer;
        ImageAnalysisAbstractAnalyzerExternalSyntheticLambda1 imageAnalysisAbstractAnalyzerExternalSyntheticLambda1B;
        LayoutSettings.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1;
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        int i = ImageCaptureExternalSyntheticLambda2$TuitionPaymentFragmentbindingInflater1$WhenMappings.$EnumSwitchMapping$0[p1.ordinal()];
        if (i == 1) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.asBinder, p0, p2, p3, p4, this.TuitionPaymentFragmentbindingInflater1);
            return;
        }
        if (i == 2) {
            ImageCaptureExternalSyntheticLambda4 imageCaptureExternalSyntheticLambda4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (imageCaptureExternalSyntheticLambda4 != null) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault1(imageCaptureExternalSyntheticLambda4, p0, p2, p3, p4, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                return;
            }
            return;
        }
        if (i != 3 || (imageAnalysisBlockingAnalyzer = this.b) == null || (imageAnalysisAbstractAnalyzerExternalSyntheticLambda1B = imageAnalysisBlockingAnalyzer.b("rum")) == null) {
            return;
        }
        String strInvoke = p2.invoke();
        if (p4) {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.contains(strInvoke)) {
                return;
            } else {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(strInvoke);
            }
        }
        if (p0 == InternalLogger.Level.ERROR || p0 == InternalLogger.Level.WARN || p3 != null) {
            tuitionPaymentFragmentbindingInflater1 = new LayoutSettings.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1(strInvoke, p5, p3, null, null, 24, null);
        } else {
            tuitionPaymentFragmentbindingInflater1 = new LayoutSettings.TuitionPaymentFragmentspecialinlinedviewModeldefault2.C0002TuitionPaymentFragmentspecialinlinedviewModeldefault2(strInvoke, p5);
        }
        imageAnalysisAbstractAnalyzerExternalSyntheticLambda1B.TuitionPaymentFragmentspecialinlinedviewModeldefault3(tuitionPaymentFragmentbindingInflater1);
    }

    @Override // com.datadog.android.api.InternalLogger
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(InternalLogger.Level p0, List<? extends InternalLogger.Target> p1, Function0<String> p2, Throwable p3, boolean p4, Map<String, ? extends Object> p5) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Iterator<T> it = p1.iterator();
        while (it.hasNext()) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0, (InternalLogger.Target) it.next(), p2, p3, false, p5);
        }
    }

    @Override // com.datadog.android.api.InternalLogger
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Function0<String> p0, Map<String, ? extends Object> p1, float p2) {
        ImageAnalysisBlockingAnalyzer imageAnalysisBlockingAnalyzer;
        ImageAnalysisAbstractAnalyzerExternalSyntheticLambda1 imageAnalysisAbstractAnalyzerExternalSyntheticLambda1B;
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        if (!new createIsolatedReader(p2).TuitionPaymentFragmentspecialinlinedviewModeldefault2() || (imageAnalysisBlockingAnalyzer = this.b) == null || (imageAnalysisAbstractAnalyzerExternalSyntheticLambda1B = imageAnalysisBlockingAnalyzer.b("rum")) == null) {
            return;
        }
        imageAnalysisAbstractAnalyzerExternalSyntheticLambda1B.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new LayoutSettings.TuitionPaymentFragmentbindingInflater1(p0.invoke(), p1));
    }

    @Override // com.datadog.android.api.InternalLogger
    public final ImageReaderFormatRecommenderFormatCombo TuitionPaymentFragmentspecialinlinedviewModeldefault3(String p0, TelemetryMetricType p1, float p2, String p3) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p3, "");
        if (!new createIsolatedReader(p2).TuitionPaymentFragmentspecialinlinedviewModeldefault2()) {
            return null;
        }
        if (ImageCaptureExternalSyntheticLambda2$TuitionPaymentFragmentbindingInflater1$WhenMappings.$EnumSwitchMapping$1[p1.ordinal()] == 1) {
            return new setCaptureMode(this, p3, p0, 0L, 8, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.datadog.android.api.InternalLogger
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(LayoutSettings.b p0, float p1) {
        ImageAnalysisBlockingAnalyzer imageAnalysisBlockingAnalyzer;
        ImageAnalysisAbstractAnalyzerExternalSyntheticLambda1 imageAnalysisAbstractAnalyzerExternalSyntheticLambda1B;
        Intrinsics.checkNotNullParameter(p0, "");
        if (!new createIsolatedReader(15.0f).TuitionPaymentFragmentspecialinlinedviewModeldefault2() || (imageAnalysisBlockingAnalyzer = this.b) == null || (imageAnalysisAbstractAnalyzerExternalSyntheticLambda1B = imageAnalysisBlockingAnalyzer.b("rum")) == null) {
            return;
        }
        imageAnalysisAbstractAnalyzerExternalSyntheticLambda1B.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(ImageCaptureExternalSyntheticLambda4 p0, InternalLogger.Level p1, Function0<String> p2, Throwable p3, boolean p4, Set<String> p5) {
        if (p0.TuitionPaymentFragmentspecialinlinedviewModeldefault1.invoke(Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2(p1))).booleanValue()) {
            String strInvoke = p2.invoke();
            ImageAnalysisBlockingAnalyzer imageAnalysisBlockingAnalyzer = this.b;
            String strTuitionPaymentFragmentspecialinlinedviewModeldefault2 = imageAnalysisBlockingAnalyzer != null ? imageAnalysisBlockingAnalyzer.TuitionPaymentFragmentspecialinlinedviewModeldefault2() : null;
            if (strTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                StringBuilder sb = new StringBuilder("[");
                sb.append(strTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                sb.append("]: ");
                sb.append(strInvoke);
                strInvoke = sb.toString();
            }
            if (p4) {
                if (p5.contains(strInvoke)) {
                    return;
                } else {
                    p5.add(strInvoke);
                }
            }
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(p1);
            Intrinsics.checkNotNullParameter(strInvoke, "");
            if (p0.TuitionPaymentFragmentspecialinlinedviewModeldefault1.invoke(Integer.valueOf(iTuitionPaymentFragmentspecialinlinedviewModeldefault2)).booleanValue()) {
                String str = p0.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                String str2 = p0.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                Log.println(iTuitionPaymentFragmentspecialinlinedviewModeldefault2, str2, strInvoke);
                if (p3 != null) {
                    Log.println(iTuitionPaymentFragmentspecialinlinedviewModeldefault2, str2, Log.getStackTraceString(p3));
                }
            }
        }
    }

    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2(InternalLogger.Level level) {
        int i = ImageCaptureExternalSyntheticLambda2$TuitionPaymentFragmentbindingInflater1$WhenMappings.$EnumSwitchMapping$2[level.ordinal()];
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i == 4) {
            return 5;
        }
        if (i == 5) {
            return 6;
        }
        throw new NoWhenBranchMatchedException();
    }
}
