package defpackage;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.privacy.TrackingConsent;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ImageCaptureScreenFlashListener implements ImageCaptureExtKttakePicture21<TrackingConsent> {
    private final getSavedUri TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final InternalLogger b;

    public ImageCaptureScreenFlashListener(getSavedUri getsaveduri, InternalLogger internalLogger) {
        Intrinsics.checkNotNullParameter(getsaveduri, "");
        Intrinsics.checkNotNullParameter(internalLogger, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = getsaveduri;
        this.b = internalLogger;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00f0  */
    @Override // defpackage.ImageCaptureExtKttakePicture21
    public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(TrackingConsent trackingConsent, ImageCaptureOutputFileOptionsBuilder imageCaptureOutputFileOptionsBuilder, TrackingConsent trackingConsent2, ImageCaptureOutputFileOptionsBuilder imageCaptureOutputFileOptionsBuilder2) {
        ImageCaptureExtKttakePicture42 imageCaptureExtKttakePicture42;
        final TrackingConsent trackingConsent3 = trackingConsent;
        final TrackingConsent trackingConsent4 = trackingConsent2;
        Intrinsics.checkNotNullParameter(imageCaptureOutputFileOptionsBuilder, "");
        Intrinsics.checkNotNullParameter(trackingConsent4, "");
        Intrinsics.checkNotNullParameter(imageCaptureOutputFileOptionsBuilder2, "");
        Pair pair = TuplesKt.to(trackingConsent3, trackingConsent4);
        if (Intrinsics.areEqual(pair, TuplesKt.to(null, TrackingConsent.PENDING)) || Intrinsics.areEqual(pair, TuplesKt.to(null, TrackingConsent.GRANTED)) || Intrinsics.areEqual(pair, TuplesKt.to(null, TrackingConsent.NOT_GRANTED)) || Intrinsics.areEqual(pair, TuplesKt.to(TrackingConsent.PENDING, TrackingConsent.NOT_GRANTED))) {
            imageCaptureExtKttakePicture42 = new ImageCaptureExtKttakePicture42(imageCaptureOutputFileOptionsBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, this.b);
        } else if (Intrinsics.areEqual(pair, TuplesKt.to(TrackingConsent.GRANTED, TrackingConsent.PENDING)) || Intrinsics.areEqual(pair, TuplesKt.to(TrackingConsent.NOT_GRANTED, TrackingConsent.PENDING))) {
            imageCaptureExtKttakePicture42 = new ImageCaptureExtKttakePicture42(imageCaptureOutputFileOptionsBuilder2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, this.b);
        } else if (Intrinsics.areEqual(pair, TuplesKt.to(TrackingConsent.PENDING, TrackingConsent.GRANTED))) {
            imageCaptureExtKttakePicture42 = new ImageCaptureLatencyEstimate(imageCaptureOutputFileOptionsBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), imageCaptureOutputFileOptionsBuilder2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, this.b);
        } else {
            TrackingConsent trackingConsent5 = TrackingConsent.PENDING;
            if (!Intrinsics.areEqual(pair, TuplesKt.to(trackingConsent5, trackingConsent5))) {
                TrackingConsent trackingConsent6 = TrackingConsent.GRANTED;
                if (!Intrinsics.areEqual(pair, TuplesKt.to(trackingConsent6, trackingConsent6)) && !Intrinsics.areEqual(pair, TuplesKt.to(TrackingConsent.GRANTED, TrackingConsent.NOT_GRANTED))) {
                    TrackingConsent trackingConsent7 = TrackingConsent.NOT_GRANTED;
                    if (Intrinsics.areEqual(pair, TuplesKt.to(trackingConsent7, trackingConsent7)) || Intrinsics.areEqual(pair, TuplesKt.to(TrackingConsent.NOT_GRANTED, TrackingConsent.GRANTED))) {
                        imageCaptureExtKttakePicture42 = new computeTotalCaptureLatencyMillis();
                    } else {
                        this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault1(InternalLogger.Level.WARN, CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY}), new Function0<String>() { // from class: com.datadog.android.core.internal.persistence.file.advanced.ConsentAwareFileMigrator$resolveMigrationOperation$1
                            @Override // kotlin.jvm.functions.Function0
                            /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: merged with bridge method [inline-methods] */
                            public final String invoke() {
                                TrackingConsent trackingConsent8 = trackingConsent3;
                                TrackingConsent trackingConsent9 = trackingConsent4;
                                StringBuilder sb = new StringBuilder("Unexpected consent migration from ");
                                sb.append(trackingConsent8);
                                sb.append(" to ");
                                sb.append(trackingConsent9);
                                return sb.toString();
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }
                        }, null, false, null);
                        imageCaptureExtKttakePicture42 = new computeTotalCaptureLatencyMillis();
                    }
                } else {
                    imageCaptureExtKttakePicture42 = new computeTotalCaptureLatencyMillis();
                }
            } else {
                imageCaptureExtKttakePicture42 = new computeTotalCaptureLatencyMillis();
            }
        }
        imageCaptureExtKttakePicture42.run();
    }
}
