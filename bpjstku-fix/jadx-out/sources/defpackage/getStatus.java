package defpackage;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.storage.EventType;
import com.datadog.android.rum.GlobalRumMonitor;
import com.datadog.android.rum.RumMonitor;
import defpackage.ImageAnalysisNonBlockingAnalyzer;
import defpackage.ImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxy;
import defpackage.PreviewBuilder;
import defpackage.recalculateTransformMatrixAndCropRect;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\u0010\u000bJ\u001a\u0010\u0015\u001a\u00020\u00122\u0010\b\u0002\u0010\u0016\u001a\n\u0018\u00010\u0017j\u0004\u0018\u0001`\u0018H\u0002J-\u0010\u000e\u001a\u00020\u00002%\u0010\u0019\u001a!\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\tj\u0002`\u0013J-\u0010\u0014\u001a\u00020\u00002%\u0010\u0019\u001a!\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\tj\u0002`\u0013J\u0006\u0010\u001a\u001a\u00020\u0012R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R-\u0010\u000e\u001a!\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\tj\u0002`\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R-\u0010\u0014\u001a!\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\tj\u0002`\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/datadog/android/rum/internal/utils/WriteOperation;", "", "sdkCore", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "rumDataWriter", "Lcom/datadog/android/api/storage/DataWriter;", "eventType", "Lcom/datadog/android/api/storage/EventType;", "eventSource", "Lkotlin/Function1;", "Lcom/datadog/android/api/context/DatadogContext;", "(Lcom/datadog/android/api/feature/FeatureSdkCore;Lcom/datadog/android/api/storage/DataWriter;Lcom/datadog/android/api/storage/EventType;Lkotlin/jvm/functions/Function1;)V", "advancedRumMonitor", "Lcom/datadog/android/rum/internal/monitor/AdvancedRumMonitor;", "onError", "Lkotlin/ParameterName;", "name", "rumMonitor", "", "Lcom/datadog/android/rum/internal/utils/EventOutcomeAction;", "onSuccess", "notifyEventWriteFailure", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "action", "submit", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class getStatus {
    public static final TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new TuitionPaymentFragmentbindingInflater1(null);
    private static final Function1<PreviewBuilder, Unit> b = new Function1<PreviewBuilder, Unit>() { // from class: com.datadog.android.rum.internal.utils.WriteOperation$Companion$NO_OP_EVENT_OUTCOME_ACTION$1
        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(PreviewBuilder previewBuilder) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault2(previewBuilder);
            return Unit.INSTANCE;
        }

        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(PreviewBuilder previewBuilder) {
            Intrinsics.checkNotNullParameter(previewBuilder, "");
        }
    };
    public Function1<? super PreviewBuilder, Unit> TuitionPaymentFragmentbindingInflater1;
    public Function1<? super PreviewBuilder, Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final PreviewBuilder TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ImageAnalysisNonBlockingAnalyzer1<Object> f987a;
    private final Function1<recalculateTransformMatrixAndCropRect, Object> asBinder;
    private final ImageAnalysisBlockingAnalyzer asInterface;
    private final EventType d;

    /* JADX WARN: Multi-variable type inference failed */
    public getStatus(ImageAnalysisBlockingAnalyzer imageAnalysisBlockingAnalyzer, ImageAnalysisNonBlockingAnalyzer1<Object> imageAnalysisNonBlockingAnalyzer1, EventType eventType, Function1<? super recalculateTransformMatrixAndCropRect, ? extends Object> function1) {
        Intrinsics.checkNotNullParameter(imageAnalysisBlockingAnalyzer, "");
        Intrinsics.checkNotNullParameter(imageAnalysisNonBlockingAnalyzer1, "");
        Intrinsics.checkNotNullParameter(eventType, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.asInterface = imageAnalysisBlockingAnalyzer;
        this.f987a = imageAnalysisNonBlockingAnalyzer1;
        this.d = eventType;
        this.asBinder = function1;
        RumMonitor rumMonitorB = GlobalRumMonitor.b(imageAnalysisBlockingAnalyzer);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = rumMonitorB instanceof PreviewBuilder ? (PreviewBuilder) rumMonitorB : null;
        Function1<PreviewBuilder, Unit> function2 = b;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = function2;
        this.TuitionPaymentFragmentbindingInflater1 = function2;
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        ImageAnalysisAbstractAnalyzerExternalSyntheticLambda1 imageAnalysisAbstractAnalyzerExternalSyntheticLambda1B = this.asInterface.b("rum");
        if (imageAnalysisAbstractAnalyzerExternalSyntheticLambda1B != null) {
            imageAnalysisAbstractAnalyzerExternalSyntheticLambda1B.TuitionPaymentFragmentspecialinlinedviewModeldefault1(false, new Function2<recalculateTransformMatrixAndCropRect, ImageAnalysisNonBlockingAnalyzer, Unit>() { // from class: com.datadog.android.rum.internal.utils.WriteOperation$submit$1
                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ Unit invoke(recalculateTransformMatrixAndCropRect recalculatetransformmatrixandcroprect, ImageAnalysisNonBlockingAnalyzer imageAnalysisNonBlockingAnalyzer) {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2(recalculatetransformmatrixandcroprect, imageAnalysisNonBlockingAnalyzer);
                    return Unit.INSTANCE;
                }

                public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(recalculateTransformMatrixAndCropRect recalculatetransformmatrixandcroprect, ImageAnalysisNonBlockingAnalyzer imageAnalysisNonBlockingAnalyzer) {
                    Intrinsics.checkNotNullParameter(recalculatetransformmatrixandcroprect, "");
                    Intrinsics.checkNotNullParameter(imageAnalysisNonBlockingAnalyzer, "");
                    if (!(this.this$0.f987a instanceof ImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxy)) {
                        try {
                            if (this.this$0.f987a.b(imageAnalysisNonBlockingAnalyzer, this.this$0.asBinder.invoke(recalculatetransformmatrixandcroprect), this.this$0.d)) {
                                PreviewBuilder previewBuilder = this.this$0.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                if (previewBuilder != null) {
                                    this.this$0.TuitionPaymentFragmentbindingInflater1.invoke(previewBuilder);
                                    return;
                                }
                                return;
                            }
                            this.this$0.TuitionPaymentFragmentspecialinlinedviewModeldefault1((Exception) null);
                            return;
                        } catch (Exception e2) {
                            this.this$0.TuitionPaymentFragmentspecialinlinedviewModeldefault1(e2);
                            return;
                        }
                    }
                    this.this$0.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.INFO, InternalLogger.Target.USER, new Function0<String>() { // from class: com.datadog.android.rum.internal.utils.WriteOperation$submit$1.1
                        @Override // kotlin.jvm.functions.Function0
                        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
                        public final String invoke() {
                            return "Write operation ignored, session is expired or RUM feature is disabled.";
                        }
                    }, null, false, null);
                    PreviewBuilder previewBuilder2 = this.this$0.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    if (previewBuilder2 != null) {
                        this.this$0.TuitionPaymentFragmentspecialinlinedviewModeldefault1.invoke(previewBuilder2);
                    }
                }

                {
                    super(2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Exception exc) {
        List<? extends InternalLogger.Target> listMutableListOf = CollectionsKt.mutableListOf(InternalLogger.Target.USER);
        if (exc != null) {
            listMutableListOf.add(InternalLogger.Target.TELEMETRY);
        }
        this.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault1(InternalLogger.Level.ERROR, listMutableListOf, new Function0<String>() { // from class: com.datadog.android.rum.internal.utils.WriteOperation$notifyEventWriteFailure$1
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Write operation failed.";
            }
        }, exc, false, null);
        PreviewBuilder previewBuilder = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (previewBuilder != null) {
            if (Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, b)) {
                this.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.WARN, InternalLogger.Target.MAINTAINER, new Function0<String>() { // from class: com.datadog.android.rum.internal.utils.WriteOperation$notifyEventWriteFailure$2$1
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final String invoke() {
                        return "Write operation failed, but no onError callback was provided.";
                    }
                }, null, false, null);
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.invoke(previewBuilder);
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R0\u0010\u0005\u001a!\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0006j\u0002`\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/datadog/android/rum/internal/utils/WriteOperation$Companion;", "", "()V", "NO_ERROR_CALLBACK_PROVIDED_WARNING", "", "NO_OP_EVENT_OUTCOME_ACTION", "Lkotlin/Function1;", "Lcom/datadog/android/rum/internal/monitor/AdvancedRumMonitor;", "Lkotlin/ParameterName;", "name", "rumMonitor", "", "Lcom/datadog/android/rum/internal/utils/EventOutcomeAction;", "getNO_OP_EVENT_OUTCOME_ACTION", "()Lkotlin/jvm/functions/Function1;", "WRITE_OPERATION_FAILED_ERROR", "WRITE_OPERATION_IGNORED", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class TuitionPaymentFragmentbindingInflater1 {
        private TuitionPaymentFragmentbindingInflater1() {
        }

        public /* synthetic */ TuitionPaymentFragmentbindingInflater1(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
