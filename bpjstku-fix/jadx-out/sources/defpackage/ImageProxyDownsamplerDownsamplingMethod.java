package defpackage;

import android.content.Context;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.ExistingWorkPolicy;
import androidx.work.ListenableWorker;
import androidx.work.NetworkType;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.internal.data.upload.UploadWorker;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ImageProxyDownsamplerDownsamplingMethod {
    public static final void TuitionPaymentFragmentbindingInflater1(Context context, String str, InternalLogger internalLogger) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(internalLogger, "");
        try {
            WorkManager workManager = WorkManager.getInstance(context);
            Intrinsics.checkNotNullExpressionValue(workManager, "");
            OneTimeWorkRequest.Builder constraints = new OneTimeWorkRequest.Builder((Class<? extends ListenableWorker>) UploadWorker.class).setConstraints(new Constraints.Builder().setRequiredNetworkType(NetworkType.NOT_ROAMING).build());
            StringBuilder sb = new StringBuilder("DatadogBackgroundUpload/");
            sb.append(str);
            OneTimeWorkRequest.Builder initialDelay = constraints.addTag(sb.toString()).setInitialDelay(5000L, TimeUnit.MILLISECONDS);
            Data dataBuild = new Data.Builder().putString("_dd.sdk.instanceName", str).build();
            Intrinsics.checkNotNullExpressionValue(dataBuild, "");
            workManager.enqueueUniqueWork("DatadogUploadWorker", ExistingWorkPolicy.REPLACE, initialDelay.setInputData(dataBuild).build());
            internalLogger.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.INFO, InternalLogger.Target.MAINTAINER, new Function0<String>() { // from class: com.datadog.android.core.internal.utils.WorkManagerUtilsKt$triggerUploadWorker$1
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "UploadWorker was scheduled.";
                }
            }, null, false, null);
        } catch (Exception e2) {
            internalLogger.TuitionPaymentFragmentspecialinlinedviewModeldefault1(InternalLogger.Level.ERROR, CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY}), new Function0<String>() { // from class: com.datadog.android.core.internal.utils.WorkManagerUtilsKt$triggerUploadWorker$2
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "Error while trying to setup the UploadWorker";
                }
            }, e2, false, null);
        }
    }
}
