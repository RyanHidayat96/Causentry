package com.datadog.android.core.internal.data.upload;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.datadog.android.Datadog;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.SdkCore;
import defpackage.ImageAnalysisAbstractAnalyzerExternalSyntheticLambda1;
import defpackage.ImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0;
import defpackage.ImageCapture;
import defpackage.ImageCaptureBuilder;
import defpackage.ImageCaptureFlashType;
import defpackage.ImageCaptureOnImageSavedCallback;
import defpackage.getCaptureMode;
import defpackage.getTakePictureManager;
import defpackage.lambdacreatePipeline3androidxcameracoreImageCapture;
import defpackage.recalculateTransformMatrixAndCropRect;
import defpackage.resizeAveraging;
import defpackage.submitStillCaptureRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u000b2\u00020\u0001:\u0002\u000b\fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/datadog/android/core/internal/data/upload/UploadWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "p0", "Landroidx/work/WorkerParameters;", "p1", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/ListenableWorker$Result;", "doWork", "()Landroidx/work/ListenableWorker$Result;", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault3"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class UploadWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(workerParameters, "");
    }

    @Override // androidx.work.Worker
    public final ListenableWorker.Result doWork() {
        SdkCore sdkCoreTuitionPaymentFragmentspecialinlinedviewModeldefault1 = Datadog.TuitionPaymentFragmentspecialinlinedviewModeldefault1(getInputData().getString("_dd.sdk.instanceName"));
        ImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0 imageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0 = sdkCoreTuitionPaymentFragmentspecialinlinedviewModeldefault1 instanceof ImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0 ? (ImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0) sdkCoreTuitionPaymentFragmentspecialinlinedviewModeldefault1 : null;
        if (imageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0 != null && !(imageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0 instanceof getCaptureMode)) {
            List<ImageAnalysisAbstractAnalyzerExternalSyntheticLambda1> listB = imageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0.b();
            ArrayList arrayList = new ArrayList();
            for (ImageAnalysisAbstractAnalyzerExternalSyntheticLambda1 imageAnalysisAbstractAnalyzerExternalSyntheticLambda1 : listB) {
                getTakePictureManager gettakepicturemanager = imageAnalysisAbstractAnalyzerExternalSyntheticLambda1 instanceof getTakePictureManager ? (getTakePictureManager) imageAnalysisAbstractAnalyzerExternalSyntheticLambda1 : null;
                if (gettakepicturemanager != null) {
                    arrayList.add(gettakepicturemanager);
                }
            }
            List listShuffled = CollectionsKt.shuffled(arrayList);
            LinkedList linkedList = new LinkedList();
            Iterator it = listShuffled.iterator();
            while (it.hasNext()) {
                linkedList.offer(new TuitionPaymentFragmentspecialinlinedviewModeldefault3(linkedList, imageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0, (getTakePictureManager) it.next()));
            }
            while (!linkedList.isEmpty()) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = (TuitionPaymentFragmentspecialinlinedviewModeldefault3) linkedList.poll();
                if (tuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
                    tuitionPaymentFragmentspecialinlinedviewModeldefault3.run();
                }
            }
            ListenableWorker.Result resultSuccess = ListenableWorker.Result.success();
            Intrinsics.checkNotNullExpressionValue(resultSuccess, "");
            return resultSuccess;
        }
        resizeAveraging.b().TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.ERROR, InternalLogger.Target.USER, new Function0<String>() { // from class: com.datadog.android.core.internal.data.upload.UploadWorker.doWork.1
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Datadog has not been initialized.";
            }
        }, null, false, null);
        ListenableWorker.Result resultSuccess2 = ListenableWorker.Result.success();
        Intrinsics.checkNotNullExpressionValue(resultSuccess2, "");
        return resultSuccess2;
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements Runnable {
        private final ImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0 TuitionPaymentFragmentbindingInflater1;
        private final Queue<TuitionPaymentFragmentspecialinlinedviewModeldefault3> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private final getTakePictureManager TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault3(Queue<TuitionPaymentFragmentspecialinlinedviewModeldefault3> queue, ImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0 imageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0, getTakePictureManager gettakepicturemanager) {
            Intrinsics.checkNotNullParameter(queue, "");
            Intrinsics.checkNotNullParameter(imageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0, "");
            Intrinsics.checkNotNullParameter(gettakepicturemanager, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = queue;
            this.TuitionPaymentFragmentbindingInflater1 = imageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = gettakepicturemanager;
        }

        @Override // java.lang.Runnable
        public final void run() {
            recalculateTransformMatrixAndCropRect recalculatetransformmatrixandcroprectAsInterface = this.TuitionPaymentFragmentbindingInflater1.asInterface();
            if (recalculatetransformmatrixandcroprectAsInterface != null) {
                ImageCaptureOnImageSavedCallback imageCaptureOnImageSavedCallback = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.a;
                lambdacreatePipeline3androidxcameracoreImageCapture lambdacreatepipeline3androidxcameracoreimagecapture = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.cancel;
                ImageCaptureFlashType imageCaptureFlashTypeTuitionPaymentFragmentspecialinlinedviewModeldefault3 = imageCaptureOnImageSavedCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                if (imageCaptureFlashTypeTuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
                    List<ImageCapture> list = imageCaptureFlashTypeTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    byte[] bArr = imageCaptureFlashTypeTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1;
                    submitStillCaptureRequest submitstillcapturerequestTuitionPaymentFragmentspecialinlinedviewModeldefault3 = lambdacreatepipeline3androidxcameracoreimagecapture.TuitionPaymentFragmentspecialinlinedviewModeldefault3(recalculatetransformmatrixandcroprectAsInterface, list);
                    imageCaptureOnImageSavedCallback.b(imageCaptureFlashTypeTuitionPaymentFragmentspecialinlinedviewModeldefault3.b, new ImageCaptureBuilder.TuitionPaymentFragmentbindingInflater1(submitstillcapturerequestTuitionPaymentFragmentspecialinlinedviewModeldefault3.b), !submitstillcapturerequestTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    if (submitstillcapturerequestTuitionPaymentFragmentspecialinlinedviewModeldefault3 instanceof submitStillCaptureRequest.g) {
                        Queue<TuitionPaymentFragmentspecialinlinedviewModeldefault3> queue = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        queue.offer(new TuitionPaymentFragmentspecialinlinedviewModeldefault3(queue, this.TuitionPaymentFragmentbindingInflater1, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3));
                    }
                }
            }
        }
    }
}
