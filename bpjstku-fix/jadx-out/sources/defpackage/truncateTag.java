package defpackage;

import android.app.ApplicationExitInfo;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.storage.EventType;
import com.datadog.android.rum.internal.anr.ANRException;
import com.datadog.android.rum.model.ErrorEvent;
import com.datadog.android.rum.model.ViewEvent;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import defpackage.ImageAnalysisNonBlockingAnalyzer;
import defpackage.isImageFormatSupported;
import defpackage.recalculateTransformMatrixAndCropRect;
import defpackage.truncateTag;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\rH\u0017¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0012\u001a\u00020\u000e2\u000e\u0010\u0003\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00112\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0017\u001a\u00020\u0016*\u00020\u00142\b\u0010\u0003\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0017\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001c"}, d2 = {"LtruncateTag;", "LgetCameraCaptureCallback;", "LImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0;", "p0", "LisReversedVertical;", "Lcom/google/gson/JsonObject;", "", "p1", "LMetadataImageReaderExternalSyntheticLambda1;", "p2", "<init>", "(LImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0;LisReversedVertical;LMetadataImageReaderExternalSyntheticLambda1;)V", "Landroid/app/ApplicationExitInfo;", "LImageAnalysisNonBlockingAnalyzer1;", "", "D_", "(Landroid/app/ApplicationExitInfo;Lcom/google/gson/JsonObject;LImageAnalysisNonBlockingAnalyzer1;)V", "", "TuitionPaymentFragmentbindingInflater1", "(Ljava/util/Map;LImageAnalysisNonBlockingAnalyzer1;)V", "Lcom/datadog/android/rum/model/ErrorEvent$SourceType$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "Lcom/datadog/android/rum/model/ErrorEvent$SourceType;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ErrorEvent$SourceType;", "b", "LMetadataImageReaderExternalSyntheticLambda1;", "LisReversedVertical;", "LImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class truncateTag implements getCameraCaptureCallback {
    private static final long TuitionPaymentFragmentspecialinlinedviewModeldefault3 = TimeUnit.HOURS.toMillis(4);

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final ImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0 TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final isReversedVertical<JsonObject, Object> b;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final MetadataImageReaderExternalSyntheticLambda1 TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    private truncateTag(ImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0 imageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0, isReversedVertical<JsonObject, Object> isreversedvertical, MetadataImageReaderExternalSyntheticLambda1 metadataImageReaderExternalSyntheticLambda1) {
        Intrinsics.checkNotNullParameter(imageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(isreversedvertical, "");
        Intrinsics.checkNotNullParameter(metadataImageReaderExternalSyntheticLambda1, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = imageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0;
        this.b = isreversedvertical;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = metadataImageReaderExternalSyntheticLambda1;
    }

    public /* synthetic */ truncateTag(ImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0 imageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0, MetadataImageReader1 metadataImageReader1, MetadataImageReaderExternalSyntheticLambda1 metadataImageReaderExternalSyntheticLambda1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(imageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0, (i & 2) != 0 ? new MetadataImageReader1(imageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3()) : metadataImageReader1, (i & 4) != 0 ? new MetadataImageReaderExternalSyntheticLambda1(imageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3()) : metadataImageReaderExternalSyntheticLambda1);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00a5  */
    @Override // defpackage.getCameraCaptureCallback
    public final void TuitionPaymentFragmentbindingInflater1(Map<?, ?> p0, final ImageAnalysisNonBlockingAnalyzer1<Object> p1) {
        ViewEvent viewEvent;
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        ImageAnalysisAbstractAnalyzerExternalSyntheticLambda1 imageAnalysisAbstractAnalyzerExternalSyntheticLambda1B = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b("rum");
        if (imageAnalysisAbstractAnalyzerExternalSyntheticLambda1B != null) {
            Object obj = p0.get("sourceType");
            final String str = obj instanceof String ? (String) obj : null;
            Object obj2 = p0.get("timestamp");
            final Long l = obj2 instanceof Long ? (Long) obj2 : null;
            Object obj3 = p0.get("timeSinceAppStartMs");
            final Long l2 = obj3 instanceof Long ? (Long) obj3 : null;
            Object obj4 = p0.get("signalName");
            final String str2 = obj4 instanceof String ? (String) obj4 : null;
            Object obj5 = p0.get("stacktrace");
            final String str3 = obj5 instanceof String ? (String) obj5 : null;
            Object obj6 = p0.get("message");
            String str4 = obj6 instanceof String ? (String) obj6 : null;
            Object obj7 = p0.get("lastViewEvent");
            JsonObject jsonObject = obj7 instanceof JsonObject ? (JsonObject) obj7 : null;
            if (jsonObject != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault1(jsonObject);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault1 instanceof ViewEvent) {
                    viewEvent = (ViewEvent) objTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                } else {
                    viewEvent = null;
                }
            } else {
                viewEvent = null;
            }
            if (l != null && str2 != null && str3 != null && str4 != null && viewEvent != null) {
                final String str5 = str4;
                final ViewEvent viewEvent2 = viewEvent;
                imageAnalysisAbstractAnalyzerExternalSyntheticLambda1B.TuitionPaymentFragmentspecialinlinedviewModeldefault1(false, new Function2<recalculateTransformMatrixAndCropRect, ImageAnalysisNonBlockingAnalyzer, Unit>() { // from class: com.datadog.android.rum.internal.DatadogLateCrashReporter$handleNdkCrashEvent$3
                    @Override // kotlin.jvm.functions.Function2
                    public final /* synthetic */ Unit invoke(recalculateTransformMatrixAndCropRect recalculatetransformmatrixandcroprect, ImageAnalysisNonBlockingAnalyzer imageAnalysisNonBlockingAnalyzer) {
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2(recalculatetransformmatrixandcroprect, imageAnalysisNonBlockingAnalyzer);
                        return Unit.INSTANCE;
                    }

                    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(recalculateTransformMatrixAndCropRect recalculatetransformmatrixandcroprect, ImageAnalysisNonBlockingAnalyzer imageAnalysisNonBlockingAnalyzer) {
                        Intrinsics.checkNotNullParameter(recalculatetransformmatrixandcroprect, "");
                        Intrinsics.checkNotNullParameter(imageAnalysisNonBlockingAnalyzer, "");
                        truncateTag truncatetag = this.this$0;
                        ErrorEvent.SourceType.Companion companion = ErrorEvent.SourceType.INSTANCE;
                        p1.b(imageAnalysisNonBlockingAnalyzer, truncateTag.TuitionPaymentFragmentspecialinlinedviewModeldefault1(truncatetag, recalculatetransformmatrixandcroprect, truncatetag.TuitionPaymentFragmentspecialinlinedviewModeldefault2(str), ErrorEvent.Category.EXCEPTION, str5, l.longValue(), l2, str3, str2, null, viewEvent2), EventType.CRASH);
                        if (truncateTag.TuitionPaymentFragmentspecialinlinedviewModeldefault2(viewEvent2)) {
                            p1.b(imageAnalysisNonBlockingAnalyzer, truncateTag.TuitionPaymentFragmentspecialinlinedviewModeldefault3(viewEvent2), EventType.CRASH);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }
                });
                return;
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.WARN, InternalLogger.Target.USER, new Function0<String>() { // from class: com.datadog.android.rum.internal.DatadogLateCrashReporter$handleNdkCrashEvent$2
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "RUM feature received a NDK crash event where one or more mandatory (timestamp, signalName, stacktrace, message, lastViewEvent) fields are either missing or have wrong type.";
                }
            }, null, false, null);
            return;
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.INFO, InternalLogger.Target.USER, new Function0<String>() { // from class: com.datadog.android.rum.internal.DatadogLateCrashReporter$handleNdkCrashEvent$1
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "RUM feature is not registered, won't report NDK crash info as RUM error.";
            }
        }, null, false, null);
    }

    @Override // defpackage.getCameraCaptureCallback
    public final void D_(final ApplicationExitInfo p0, JsonObject p1, final ImageAnalysisNonBlockingAnalyzer1<Object> p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p1);
        final ViewEvent viewEvent = objTuitionPaymentFragmentspecialinlinedviewModeldefault1 instanceof ViewEvent ? (ViewEvent) objTuitionPaymentFragmentspecialinlinedviewModeldefault1 : null;
        if (viewEvent != null) {
            if (p0.getTimestamp() > viewEvent.asInterface) {
                ImageAnalysisAbstractAnalyzerExternalSyntheticLambda1 imageAnalysisAbstractAnalyzerExternalSyntheticLambda1B = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b("rum");
                if (imageAnalysisAbstractAnalyzerExternalSyntheticLambda1B != null) {
                    imageAnalysisAbstractAnalyzerExternalSyntheticLambda1B.TuitionPaymentFragmentspecialinlinedviewModeldefault1(false, new Function2<recalculateTransformMatrixAndCropRect, ImageAnalysisNonBlockingAnalyzer, Unit>() { // from class: com.datadog.android.rum.internal.DatadogLateCrashReporter$handleAnrCrash$2
                        @Override // kotlin.jvm.functions.Function2
                        public final /* synthetic */ Unit invoke(recalculateTransformMatrixAndCropRect recalculatetransformmatrixandcroprect, ImageAnalysisNonBlockingAnalyzer imageAnalysisNonBlockingAnalyzer) throws IOException {
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3(recalculatetransformmatrixandcroprect, imageAnalysisNonBlockingAnalyzer);
                            return Unit.INSTANCE;
                        }

                        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(recalculateTransformMatrixAndCropRect recalculatetransformmatrixandcroprect, ImageAnalysisNonBlockingAnalyzer imageAnalysisNonBlockingAnalyzer) throws IOException {
                            Intrinsics.checkNotNullParameter(recalculatetransformmatrixandcroprect, "");
                            Intrinsics.checkNotNullParameter(imageAnalysisNonBlockingAnalyzer, "");
                            if (Intrinsics.areEqual(viewEvent.INotificationSideChannelStub.TuitionPaymentFragmentspecialinlinedviewModeldefault3, truncateTag.TuitionPaymentFragmentspecialinlinedviewModeldefault2(recalculatetransformmatrixandcroprect))) {
                                return;
                            }
                            Long lA = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.a();
                            long timestamp = p0.getTimestamp();
                            if (lA == null || timestamp != lA.longValue()) {
                                List listB_ = truncateTag.B_(this, p0);
                                if (listB_.isEmpty()) {
                                    return;
                                }
                                truncateTag truncatetag = this;
                                ErrorEvent.SourceType sourceType = ErrorEvent.SourceType.ANDROID;
                                ErrorEvent.Category category = ErrorEvent.Category.ANR;
                                long timestamp2 = p0.getTimestamp();
                                isImageFormatSupported isimageformatsupportedTuitionPaymentFragmentspecialinlinedviewModeldefault2 = truncateTag.TuitionPaymentFragmentspecialinlinedviewModeldefault2(listB_);
                                String str = isimageformatsupportedTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null ? isimageformatsupportedTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1 : null;
                                String str2 = str == null ? "" : str;
                                String canonicalName = ANRException.class.getCanonicalName();
                                p2.b(imageAnalysisNonBlockingAnalyzer, truncateTag.TuitionPaymentFragmentspecialinlinedviewModeldefault1(truncatetag, recalculatetransformmatrixandcroprect, sourceType, category, "Application Not Responding", timestamp2, null, str2, canonicalName == null ? "" : canonicalName, listB_, viewEvent), EventType.CRASH);
                                if (truncateTag.TuitionPaymentFragmentspecialinlinedviewModeldefault2(viewEvent)) {
                                    p2.b(imageAnalysisNonBlockingAnalyzer, truncateTag.TuitionPaymentFragmentspecialinlinedviewModeldefault3(viewEvent), EventType.CRASH);
                                }
                                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b(p0.getTimestamp());
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }
                    });
                } else {
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.WARN, InternalLogger.Target.USER, new Function0<String>() { // from class: com.datadog.android.rum.internal.DatadogLateCrashReporter$handleAnrCrash$1
                        @Override // kotlin.jvm.functions.Function0
                        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                        public final String invoke() {
                            return "RUM feature is not registered, won't report NDK crash info as RUM error.";
                        }
                    }, null, false, null);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ErrorEvent.SourceType TuitionPaymentFragmentspecialinlinedviewModeldefault2(final String p0) {
        if (p0 != null) {
            try {
                ErrorEvent.SourceType.Companion companion = ErrorEvent.SourceType.INSTANCE;
                return ErrorEvent.SourceType.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
            } catch (NoSuchElementException e2) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.ERROR, InternalLogger.Target.TELEMETRY, new Function0<String>() { // from class: com.datadog.android.rum.internal.DatadogLateCrashReporter$tryFromSource$1
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: merged with bridge method [inline-methods] */
                    public final String invoke() {
                        return "Error parsing source type from NDK crash event: ".concat(String.valueOf(p0));
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }
                }, e2, false, null);
                return ErrorEvent.SourceType.NDK;
            }
        }
        return ErrorEvent.SourceType.NDK;
    }

    public static final /* synthetic */ isImageFormatSupported TuitionPaymentFragmentspecialinlinedviewModeldefault2(List list) {
        Object next;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (Intrinsics.areEqual(((isImageFormatSupported) next).TuitionPaymentFragmentspecialinlinedviewModeldefault3, "main")) {
                return (isImageFormatSupported) next;
            }
        }
        next = null;
        return (isImageFormatSupported) next;
    }

    public static final /* synthetic */ String TuitionPaymentFragmentspecialinlinedviewModeldefault2(recalculateTransformMatrixAndCropRect recalculatetransformmatrixandcroprect) {
        Map<String, Object> mapEmptyMap = recalculatetransformmatrixandcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get("rum");
        if (mapEmptyMap == null) {
            mapEmptyMap = MapsKt.emptyMap();
        }
        Object obj = mapEmptyMap.get("session_id");
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public static final /* synthetic */ boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(ViewEvent viewEvent) {
        return System.currentTimeMillis() - viewEvent.asInterface < TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    public static final /* synthetic */ List B_(truncateTag truncatetag, ApplicationExitInfo applicationExitInfo) throws IOException {
        List<String> groupValues;
        InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
        if (traceInputStream != null) {
            MetadataImageReaderExternalSyntheticLambda1 metadataImageReaderExternalSyntheticLambda1 = truncatetag.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            Intrinsics.checkNotNullParameter(traceInputStream, "");
            String strTuitionPaymentFragmentspecialinlinedviewModeldefault2 = metadataImageReaderExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(traceInputStream);
            if (StringsKt.isBlank(strTuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
                return CollectionsKt.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Iterator<String> it = StringsKt.lines(strTuitionPaymentFragmentspecialinlinedviewModeldefault2).iterator();
            String str = null;
            String str2 = null;
            loop0: while (true) {
                boolean z = false;
                while (true) {
                    if (!it.hasNext()) {
                        break loop0;
                    }
                    String next = it.next();
                    String str3 = next;
                    if (!StringsKt.isBlank(str3) || !z) {
                        if (StringsKt.contains$default((CharSequence) str3, (CharSequence) " prio=", false, 2, (Object) null) && StringsKt.contains$default((CharSequence) str3, (CharSequence) " tid=", false, 2, (Object) null)) {
                            str2 = (String) CollectionsKt.lastOrNull(StringsKt.split$default((CharSequence) str3, new String[]{" "}, false, 0, 6, (Object) null));
                            MatchResult matchResultMatchEntire = MetadataImageReaderExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.matchEntire(str3);
                            str = (matchResultMatchEntire == null || (groupValues = matchResultMatchEntire.getGroupValues()) == null) ? null : (String) CollectionsKt.getOrNull(groupValues, 1);
                            z = true;
                        } else if (z) {
                            String string = StringsKt.trimStart((CharSequence) str3).toString();
                            if (StringsKt.startsWith$default(string, "at ", false, 2, (Object) null) || StringsKt.startsWith$default(string, "native: ", false, 2, (Object) null)) {
                                arrayList2.add(next);
                            }
                        }
                    }
                }
                if (!arrayList2.isEmpty() && str != null) {
                    arrayList.add(new isImageFormatSupported(str, MetadataImageReaderExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str2 == null ? "" : str2), CollectionsKt.joinToString$default(arrayList2, "\n", null, null, 0, null, null, 62, null), Intrinsics.areEqual(str, "main")));
                }
                arrayList2.clear();
            }
            if (arrayList.isEmpty()) {
                metadataImageReaderExternalSyntheticLambda1.b.TuitionPaymentFragmentspecialinlinedviewModeldefault1(InternalLogger.Level.ERROR, CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY}), new Function0<String>() { // from class: com.datadog.android.rum.internal.anr.AndroidTraceParser$parse$2
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: merged with bridge method [inline-methods] */
                    public final String invoke() {
                        return "Parsing tracing information for the exit reason wasn't successful, no thread dumps were parsed.";
                    }
                }, null, false, null);
            }
            return arrayList;
        }
        truncatetag.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.WARN, InternalLogger.Target.USER, new Function0<String>() { // from class: com.datadog.android.rum.internal.DatadogLateCrashReporter$readThreadsDump$1
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Last known exit reason has no trace information attached, cannot report fatal ANR.";
            }
        }, null, false, null);
        return CollectionsKt.emptyList();
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00aa  */
    public static final /* synthetic */ ErrorEvent TuitionPaymentFragmentspecialinlinedviewModeldefault1(truncateTag truncatetag, recalculateTransformMatrixAndCropRect recalculatetransformmatrixandcroprect, ErrorEvent.SourceType sourceType, ErrorEvent.Category category, String str, long j, Long l, String str2, String str3, List list, ViewEvent viewEvent) {
        ErrorEvent.asInterface asinterface;
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        boolean z;
        ErrorEvent.getItem getitem;
        Number number;
        String asString;
        ArrayList arrayList;
        ViewEvent.g gVar = viewEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        ArrayList arrayList2 = null;
        if (gVar != null) {
            ErrorEvent.Status statusValueOf = ErrorEvent.Status.valueOf(gVar.TuitionPaymentFragmentbindingInflater1.name());
            List<ViewEvent.Interface> list2 = gVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (list2 != null) {
                List<ViewEvent.Interface> list3 = list2;
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                Iterator<T> it = list3.iterator();
                while (it.hasNext()) {
                    arrayList3.add(ErrorEvent.Interface.valueOf(((ViewEvent.Interface) it.next()).name()));
                }
                arrayList = arrayList3;
            } else {
                arrayList = null;
            }
            ViewEvent.b bVar = gVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            String str4 = bVar != null ? bVar.b : null;
            ViewEvent.b bVar2 = gVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            asinterface = new ErrorEvent.asInterface(statusValueOf, arrayList, null, new ErrorEvent.b(str4, bVar2 != null ? bVar2.TuitionPaymentFragmentbindingInflater1 : null), 4, null);
        } else {
            asinterface = null;
        }
        ViewEvent.a aVar = viewEvent.g;
        if (aVar == null || (linkedHashMap = aVar.b) == null) {
            linkedHashMap = new LinkedHashMap();
        }
        ViewEvent.getItem getitem2 = viewEvent.getInterfaceDescriptor;
        if (getitem2 == null || (linkedHashMap2 = getitem2.TuitionPaymentFragmentspecialinlinedviewModeldefault1) == null) {
            linkedHashMap2 = new LinkedHashMap();
        }
        ViewEvent.getItem getitem3 = viewEvent.getInterfaceDescriptor;
        if ((getitem3 != null ? getitem3.b : null) != null) {
            z = true;
        } else if ((getitem3 != null ? getitem3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 : null) != null) {
            z = true;
        } else if ((getitem3 != null ? getitem3.TuitionPaymentFragmentbindingInflater1 : null) == null && linkedHashMap2.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        acquireImage acquireimage = recalculatetransformmatrixandcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        long j2 = recalculatetransformmatrixandcroprect.onTransact.b;
        String str5 = recalculatetransformmatrixandcroprect.b;
        ErrorEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = new ErrorEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault3(viewEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        String str6 = viewEvent.notify;
        ErrorEvent.INotificationSideChannelDefault iNotificationSideChannelDefault = new ErrorEvent.INotificationSideChannelDefault(viewEvent.INotificationSideChannelStub.TuitionPaymentFragmentspecialinlinedviewModeldefault3, ErrorEvent.ErrorEventSessionType.USER, null, 4, null);
        ViewEvent.ViewEventSource viewEventSource = viewEvent.RemoteActionCompatParcelizer;
        ErrorEvent.ErrorEventSource errorEventSourceTuitionPaymentFragmentbindingInflater1 = (viewEventSource == null || (asString = new JsonPrimitive(viewEventSource.jsonValue).getAsString()) == null) ? null : MirrorMode.TuitionPaymentFragmentbindingInflater1(ErrorEvent.ErrorEventSource.INSTANCE, asString, truncatetag.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        ErrorEvent.INotificationSideChannelStub iNotificationSideChannelStub = new ErrorEvent.INotificationSideChannelStub(viewEvent.connect.connect, viewEvent.connect.unsubscribe, viewEvent.connect.onConnectionSuspended, viewEvent.connect.MediaBrowserCompatCallbackHandler, null, 16, null);
        if (z) {
            getitem = new ErrorEvent.getItem(getitem3 != null ? getitem3.b : null, getitem3 != null ? getitem3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 : null, getitem3 != null ? getitem3.TuitionPaymentFragmentbindingInflater1 : null, linkedHashMap2);
        } else {
            getitem = null;
        }
        ErrorEvent.write writeVar = new ErrorEvent.write(acquireimage.f251a, acquireimage.d, null, acquireimage.g, 4, null);
        ErrorEvent.onTransact ontransact = new ErrorEvent.onTransact(MirrorMode.TuitionPaymentFragmentbindingInflater1(acquireimage.asInterface), acquireimage.TuitionPaymentFragmentbindingInflater1, acquireimage.TuitionPaymentFragmentspecialinlinedviewModeldefault2, acquireimage.TuitionPaymentFragmentspecialinlinedviewModeldefault1, acquireimage.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        ErrorEvent.cancel cancelVar = new ErrorEvent.cancel(null, null, 3, null);
        ViewEvent.d dVar = viewEvent.a.b;
        ErrorEvent.INotificationSideChannel iNotificationSideChannel = new ErrorEvent.INotificationSideChannel(cancelVar, new ErrorEvent.a(Float.valueOf((dVar == null || (number = dVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2) == null) ? 0.0f : number.floatValue()), null, 2, null), null, 4, null);
        ErrorEvent.notify notifyVar = new ErrorEvent.notify(linkedHashMap);
        ErrorEvent.ErrorSource errorSource = ErrorEvent.ErrorSource.SOURCE;
        if (list != null) {
            List<isImageFormatSupported> list4 = list;
            ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
            for (isImageFormatSupported isimageformatsupported : list4) {
                arrayList4.add(new ErrorEvent.connect(isimageformatsupported.TuitionPaymentFragmentspecialinlinedviewModeldefault3, isimageformatsupported.b, isimageformatsupported.TuitionPaymentFragmentbindingInflater1, isimageformatsupported.TuitionPaymentFragmentspecialinlinedviewModeldefault2));
            }
            arrayList2 = arrayList4;
        }
        return new ErrorEvent(j + j2, tuitionPaymentFragmentspecialinlinedviewModeldefault3, str6, viewEvent.read, null, str5, iNotificationSideChannelDefault, errorEventSourceTuitionPaymentFragmentbindingInflater1, iNotificationSideChannelStub, getitem, asinterface, null, null, null, writeVar, ontransact, iNotificationSideChannel, notifyVar, null, null, new ErrorEvent.RemoteActionCompatParcelizer(null, str, errorSource, str2, null, Boolean.TRUE, null, str3, category, null, null, sourceType, null, arrayList2, null, null, null, l, 120401, null), null, 2897936, null);
    }

    public static final /* synthetic */ ViewEvent TuitionPaymentFragmentspecialinlinedviewModeldefault3(ViewEvent viewEvent) {
        ViewEvent.cancelAll cancelall = viewEvent.connect.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        return ViewEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault2(viewEvent, 0L, null, null, null, null, null, null, null, ViewEvent.search.TuitionPaymentFragmentspecialinlinedviewModeldefault3(viewEvent.connect, null, null, null, null, null, null, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Boolean.FALSE, null, null, null, cancelall != null ? ViewEvent.cancelAll.TuitionPaymentFragmentspecialinlinedviewModeldefault3(cancelall.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 1) : new ViewEvent.cancelAll(1L), null, null, null, null, -142606337), null, null, null, null, null, null, null, ViewEvent.notify.TuitionPaymentFragmentspecialinlinedviewModeldefault3(viewEvent.a, viewEvent.a.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 1), null, null, null, null, 2031359);
    }
}
