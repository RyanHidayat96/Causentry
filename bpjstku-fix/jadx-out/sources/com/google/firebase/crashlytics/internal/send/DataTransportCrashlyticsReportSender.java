package com.google.firebase.crashlytics.internal.send;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId;
import com.google.firebase.crashlytics.internal.common.OnDemandCounter;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import defpackage.ProcessingNodeExternalSyntheticLambda7;
import defpackage.ProcessingRequest;
import defpackage.TakePictureManager1;
import defpackage.decrementRetryCounter;
import defpackage.getCaptureFuture;
import defpackage.isInMemoryCapture;
import java.nio.charset.Charset;
import org.apache.commons.codec.binary.Hex;

/* JADX INFO: loaded from: classes6.dex */
public class DataTransportCrashlyticsReportSender {
    private static final String CRASHLYTICS_TRANSPORT_NAME = "FIREBASE_CRASHLYTICS_REPORT";
    private final ReportQueue reportQueue;
    private final ProcessingRequest<CrashlyticsReport, byte[]> transportTransform;
    private static final CrashlyticsReportJsonTransform TRANSFORM = new CrashlyticsReportJsonTransform();
    private static final String CRASHLYTICS_ENDPOINT = mergeStrings("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");
    private static final String CRASHLYTICS_API_KEY = mergeStrings("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");
    private static final ProcessingRequest<CrashlyticsReport, byte[]> DEFAULT_TRANSFORM = new ProcessingRequest() { // from class: com.google.firebase.crashlytics.internal.send.DataTransportCrashlyticsReportSender$$ExternalSyntheticLambda0
        @Override // defpackage.ProcessingRequest
        public final Object apply(Object obj) {
            return DataTransportCrashlyticsReportSender.TRANSFORM.reportToJson((CrashlyticsReport) obj).getBytes(Charset.forName(Hex.DEFAULT_CHARSET_NAME));
        }
    };

    public static DataTransportCrashlyticsReportSender create(Context context, SettingsProvider settingsProvider, OnDemandCounter onDemandCounter) {
        TakePictureManager1.TuitionPaymentFragmentbindingInflater1(context);
        decrementRetryCounter decrementretrycounter = TakePictureManager1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (decrementretrycounter != null) {
            getCaptureFuture getcapturefutureTuitionPaymentFragmentspecialinlinedviewModeldefault2 = decrementretrycounter.TuitionPaymentFragmentspecialinlinedviewModeldefault2().TuitionPaymentFragmentspecialinlinedviewModeldefault2(new isInMemoryCapture(CRASHLYTICS_ENDPOINT, CRASHLYTICS_API_KEY));
            ProcessingNodeExternalSyntheticLambda7 processingNodeExternalSyntheticLambda7 = new ProcessingNodeExternalSyntheticLambda7("json");
            ProcessingRequest<CrashlyticsReport, byte[]> processingRequest = DEFAULT_TRANSFORM;
            return new DataTransportCrashlyticsReportSender(new ReportQueue(getcapturefutureTuitionPaymentFragmentspecialinlinedviewModeldefault2.b(CRASHLYTICS_TRANSPORT_NAME, CrashlyticsReport.class, processingNodeExternalSyntheticLambda7, processingRequest), settingsProvider.getSettingsSync(), onDemandCounter), processingRequest);
        }
        throw new IllegalStateException("Not initialized!");
    }

    DataTransportCrashlyticsReportSender(ReportQueue reportQueue, ProcessingRequest<CrashlyticsReport, byte[]> processingRequest) {
        this.reportQueue = reportQueue;
        this.transportTransform = processingRequest;
    }

    public Task<CrashlyticsReportWithSessionId> enqueueReport(CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, boolean z) {
        return this.reportQueue.enqueueReport(crashlyticsReportWithSessionId, z).getTask();
    }

    private static String mergeStrings(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str.length() + str2.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }
}
