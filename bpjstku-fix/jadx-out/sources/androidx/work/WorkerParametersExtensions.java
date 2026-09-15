package androidx.work;

import android.content.ComponentName;
import androidx.exifinterface.media.ExifInterface;
import androidx.work.impl.utils.EnqueueUtilsKt;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\t\u001a\u00020\b*\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u0011\u0010\t\u001a\u00020\b*\u00020\u000b¢\u0006\u0004\b\t\u0010\f\u001a(\u0010\u000f\u001a\u00020\u000b\"\n\b\u0000\u0010\u000e\u0018\u0001*\u00020\r*\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u0002H\u0086\b¢\u0006\u0004\b\u000f\u0010\u0010\u001a#\u0010\u000f\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u000f\u0010\u0011"}, d2 = {"", "p0", "Landroid/content/ComponentName;", "p1", "Landroidx/work/Data;", "p2", "buildDelegatedRemoteRequestData", "(Ljava/lang/String;Landroid/content/ComponentName;Landroidx/work/Data;)Landroidx/work/Data;", "", "isRemoteWorkRequest", "(Landroidx/work/Data;)Z", "Landroidx/work/WorkerParameters;", "(Landroidx/work/WorkerParameters;)Z", "Landroidx/work/ListenableWorker;", ExifInterface.GPS_DIRECTION_TRUE, "usingRemoteService", "(Landroidx/work/WorkerParameters;Landroid/content/ComponentName;)Landroidx/work/WorkerParameters;", "(Landroidx/work/WorkerParameters;Ljava/lang/String;Landroid/content/ComponentName;)Landroidx/work/WorkerParameters;"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class WorkerParametersExtensions {
    public static final boolean isRemoteWorkRequest(WorkerParameters workerParameters) {
        Intrinsics.checkNotNullParameter(workerParameters, "");
        Data inputData = workerParameters.getInputData();
        Intrinsics.checkNotNullExpressionValue(inputData, "");
        return isRemoteWorkRequest(inputData);
    }

    public static final /* synthetic */ <T extends ListenableWorker> WorkerParameters usingRemoteService(WorkerParameters workerParameters, ComponentName componentName) {
        Intrinsics.checkNotNullParameter(workerParameters, "");
        Intrinsics.checkNotNullParameter(componentName, "");
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        String name = ListenableWorker.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "");
        return usingRemoteService(workerParameters, name, componentName);
    }

    public static final WorkerParameters usingRemoteService(WorkerParameters workerParameters, String str, ComponentName componentName) {
        Intrinsics.checkNotNullParameter(workerParameters, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(componentName, "");
        UUID id2 = workerParameters.getId();
        Data inputData = workerParameters.getInputData();
        Intrinsics.checkNotNullExpressionValue(inputData, "");
        return new WorkerParameters(id2, buildDelegatedRemoteRequestData(str, componentName, inputData), workerParameters.getTags(), workerParameters.getRuntimeExtras(), workerParameters.getRunAttemptCount(), workerParameters.getGeneration(), workerParameters.getBackgroundExecutor(), workerParameters.getWorkerContext(), workerParameters.getTaskExecutor(), workerParameters.getWorkerFactory(), workerParameters.getProgressUpdater(), workerParameters.getForegroundUpdater());
    }

    public static final Data buildDelegatedRemoteRequestData(String str, ComponentName componentName, Data data) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(componentName, "");
        Intrinsics.checkNotNullParameter(data, "");
        Data.Builder builder = new Data.Builder();
        builder.putAll(data).putString(EnqueueUtilsKt.ARGUMENT_SERVICE_PACKAGE_NAME, componentName.getPackageName()).putString(EnqueueUtilsKt.ARGUMENT_SERVICE_CLASS_NAME, componentName.getClassName()).putString(EnqueueUtilsKt.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME, str);
        return builder.build();
    }

    public static final boolean isRemoteWorkRequest(Data data) {
        Intrinsics.checkNotNullParameter(data, "");
        return data.hasKeyWithValueOfType(EnqueueUtilsKt.ARGUMENT_SERVICE_PACKAGE_NAME, String.class) && data.hasKeyWithValueOfType(EnqueueUtilsKt.ARGUMENT_SERVICE_CLASS_NAME, String.class) && data.hasKeyWithValueOfType(EnqueueUtilsKt.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME, String.class);
    }
}
