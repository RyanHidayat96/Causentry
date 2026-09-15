package androidx.camera.core;

import android.graphics.Bitmap;
import androidx.camera.core.imagecapture.RequestWithCallback;
import androidx.camera.core.imagecapture.TakePictureRequest;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import defpackage.MediaFormatMustNotUseFrameRateToFindEncoderQuirk;
import defpackage.MimeInfo;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001aV\u0010\r\u001a\u00020\f*\u00020\u00002\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00072\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007H\u0086@¢\u0006\u0004\b\r\u0010\u000e\u001a^\u0010\r\u001a\u00020\u0011*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u000f2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00072\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007H\u0086@¢\u0006\u0004\b\r\u0010\u0012"}, d2 = {"Landroidx/camera/core/ImageCapture;", "Landroidx/camera/core/imagecapture/TakePictureRequest;", "getTakePictureRequest", "(Landroidx/camera/core/ImageCapture;)Landroidx/camera/core/imagecapture/TakePictureRequest;", "Lkotlin/Function0;", "", "p0", "Lkotlin/Function1;", "", "p1", "Landroid/graphics/Bitmap;", "p2", "Landroidx/camera/core/ImageProxy;", "takePicture", "(Landroidx/camera/core/ImageCapture;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/camera/core/ImageCapture$OutputFileOptions;", "p3", "Landroidx/camera/core/ImageCapture$OutputFileResults;", "(Landroidx/camera/core/ImageCapture;Landroidx/camera/core/ImageCapture$OutputFileOptions;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ImageCaptureExtKt {
    public static /* synthetic */ Object takePicture$default(ImageCapture imageCapture, Function0 function0, Function1 function1, Function1 function2, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            function0 = null;
        }
        if ((i & 2) != 0) {
            function1 = null;
        }
        if ((i & 4) != 0) {
            function2 = null;
        }
        return takePicture(imageCapture, function0, function1, function2, continuation);
    }

    public static final TakePictureRequest getTakePictureRequest(ImageCapture imageCapture) {
        Intrinsics.checkNotNullParameter(imageCapture, "");
        RequestWithCallback capturingRequest = imageCapture.getTakePictureManager().getCapturingRequest();
        if (capturingRequest != null) {
            return capturingRequest.getTakePictureRequest();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [T, androidx.camera.core.DelegatingImageCapturedCallback] */
    public static final Object takePicture(ImageCapture imageCapture, final Function0<Unit> function0, final Function1<? super Integer, Unit> function1, final Function1<? super Bitmap, Unit> function2, Continuation<? super ImageProxy> continuation) {
        Executor executorDirectExecutor;
        CoroutineContext.Element element = continuation.get$context().get(ContinuationInterceptor.INSTANCE);
        DelegatingImageCapturedCallback delegatingImageCapturedCallback = null;
        CoroutineDispatcher coroutineDispatcher = element instanceof CoroutineDispatcher ? (CoroutineDispatcher) element : null;
        if (coroutineDispatcher == null || (executorDirectExecutor = MimeInfo.b(coroutineDispatcher)) == null) {
            executorDirectExecutor = CameraXExecutors.directExecutor();
            Intrinsics.checkNotNullExpressionValue(executorDirectExecutor, "");
        }
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new DelegatingImageCapturedCallback(new ImageCapture.OnImageCapturedCallback() { // from class: androidx.camera.core.ImageCaptureExtKt$takePicture$2$1
            @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
            public final void onCaptureStarted() {
                Function0<Unit> function3 = function0;
                if (function3 != null) {
                    function3.invoke();
                }
            }

            @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
            public final void onCaptureProcessProgressed(int p0) {
                Function1<Integer, Unit> function3 = function1;
                if (function3 != null) {
                    function3.invoke(Integer.valueOf(p0));
                }
            }

            @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
            public final void onPostviewBitmapAvailable(Bitmap p0) {
                Intrinsics.checkNotNullParameter(p0, "");
                Function1<Bitmap, Unit> function3 = function2;
                if (function3 != null) {
                    function3.invoke(p0);
                }
            }

            @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
            public final void onCaptureSuccess(ImageProxy p0) {
                DelegatingImageCapturedCallback delegatingImageCapturedCallback2;
                Intrinsics.checkNotNullParameter(p0, "");
                if (objectRef.element == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    delegatingImageCapturedCallback2 = null;
                } else {
                    delegatingImageCapturedCallback2 = objectRef.element;
                }
                delegatingImageCapturedCallback2.dispose();
                MediaFormatMustNotUseFrameRateToFindEncoderQuirk<ImageProxy> mediaFormatMustNotUseFrameRateToFindEncoderQuirk = cancellableContinuationImpl2;
                Result.Companion companion = Result.INSTANCE;
                mediaFormatMustNotUseFrameRateToFindEncoderQuirk.resumeWith(Result.m8024constructorimpl(p0));
            }

            @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
            public final void onError(ImageCaptureException p0) {
                DelegatingImageCapturedCallback delegatingImageCapturedCallback2;
                Intrinsics.checkNotNullParameter(p0, "");
                if (objectRef.element == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    delegatingImageCapturedCallback2 = null;
                } else {
                    delegatingImageCapturedCallback2 = objectRef.element;
                }
                delegatingImageCapturedCallback2.dispose();
                MediaFormatMustNotUseFrameRateToFindEncoderQuirk<ImageProxy> mediaFormatMustNotUseFrameRateToFindEncoderQuirk = cancellableContinuationImpl2;
                Result.Companion companion = Result.INSTANCE;
                mediaFormatMustNotUseFrameRateToFindEncoderQuirk.resumeWith(Result.m8024constructorimpl(ResultKt.createFailure(p0)));
            }
        });
        cancellableContinuationImpl2.b((Function1<? super Throwable, Unit>) new Function1<Throwable, Unit>() { // from class: androidx.camera.core.ImageCaptureExtKt$takePicture$2$2
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                DelegatingImageCapturedCallback delegatingImageCapturedCallback2;
                if (objectRef.element == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    delegatingImageCapturedCallback2 = null;
                } else {
                    delegatingImageCapturedCallback2 = objectRef.element;
                }
                delegatingImageCapturedCallback2.dispose();
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        });
        if (objectRef.element == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            delegatingImageCapturedCallback = (DelegatingImageCapturedCallback) objectRef.element;
        }
        imageCapture.m162lambda$takePicture$1$androidxcameracoreImageCapture(executorDirectExecutor, delegatingImageCapturedCallback);
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [T, androidx.camera.core.DelegatingImageSavedCallback] */
    public static final Object takePicture(ImageCapture imageCapture, ImageCapture.OutputFileOptions outputFileOptions, final Function0<Unit> function0, final Function1<? super Integer, Unit> function1, final Function1<? super Bitmap, Unit> function2, Continuation<? super ImageCapture.OutputFileResults> continuation) {
        Executor executorDirectExecutor;
        CoroutineContext.Element element = continuation.get$context().get(ContinuationInterceptor.INSTANCE);
        DelegatingImageSavedCallback delegatingImageSavedCallback = null;
        CoroutineDispatcher coroutineDispatcher = element instanceof CoroutineDispatcher ? (CoroutineDispatcher) element : null;
        if (coroutineDispatcher == null || (executorDirectExecutor = MimeInfo.b(coroutineDispatcher)) == null) {
            executorDirectExecutor = CameraXExecutors.directExecutor();
            Intrinsics.checkNotNullExpressionValue(executorDirectExecutor, "");
        }
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new DelegatingImageSavedCallback(new ImageCapture.OnImageSavedCallback() { // from class: androidx.camera.core.ImageCaptureExtKt$takePicture$4$1
            @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
            public final void onCaptureStarted() {
                Function0<Unit> function3 = function0;
                if (function3 != null) {
                    function3.invoke();
                }
            }

            @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
            public final void onCaptureProcessProgressed(int p0) {
                Function1<Integer, Unit> function3 = function1;
                if (function3 != null) {
                    function3.invoke(Integer.valueOf(p0));
                }
            }

            @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
            public final void onPostviewBitmapAvailable(Bitmap p0) {
                Intrinsics.checkNotNullParameter(p0, "");
                Function1<Bitmap, Unit> function3 = function2;
                if (function3 != null) {
                    function3.invoke(p0);
                }
            }

            @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
            public final void onImageSaved(ImageCapture.OutputFileResults p0) {
                DelegatingImageSavedCallback delegatingImageSavedCallback2;
                Intrinsics.checkNotNullParameter(p0, "");
                if (objectRef.element == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    delegatingImageSavedCallback2 = null;
                } else {
                    delegatingImageSavedCallback2 = objectRef.element;
                }
                delegatingImageSavedCallback2.dispose();
                MediaFormatMustNotUseFrameRateToFindEncoderQuirk<ImageCapture.OutputFileResults> mediaFormatMustNotUseFrameRateToFindEncoderQuirk = cancellableContinuationImpl2;
                Result.Companion companion = Result.INSTANCE;
                mediaFormatMustNotUseFrameRateToFindEncoderQuirk.resumeWith(Result.m8024constructorimpl(p0));
            }

            @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
            public final void onError(ImageCaptureException p0) {
                DelegatingImageSavedCallback delegatingImageSavedCallback2;
                Intrinsics.checkNotNullParameter(p0, "");
                if (objectRef.element == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    delegatingImageSavedCallback2 = null;
                } else {
                    delegatingImageSavedCallback2 = objectRef.element;
                }
                delegatingImageSavedCallback2.dispose();
                MediaFormatMustNotUseFrameRateToFindEncoderQuirk<ImageCapture.OutputFileResults> mediaFormatMustNotUseFrameRateToFindEncoderQuirk = cancellableContinuationImpl2;
                Result.Companion companion = Result.INSTANCE;
                mediaFormatMustNotUseFrameRateToFindEncoderQuirk.resumeWith(Result.m8024constructorimpl(ResultKt.createFailure(p0)));
            }
        });
        cancellableContinuationImpl2.b((Function1<? super Throwable, Unit>) new Function1<Throwable, Unit>() { // from class: androidx.camera.core.ImageCaptureExtKt$takePicture$4$2
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                DelegatingImageSavedCallback delegatingImageSavedCallback2;
                if (objectRef.element == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    delegatingImageSavedCallback2 = null;
                } else {
                    delegatingImageSavedCallback2 = objectRef.element;
                }
                delegatingImageSavedCallback2.dispose();
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        });
        if (objectRef.element == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            delegatingImageSavedCallback = (DelegatingImageSavedCallback) objectRef.element;
        }
        imageCapture.m163lambda$takePicture$2$androidxcameracoreImageCapture(outputFileOptions, executorDirectExecutor, delegatingImageSavedCallback);
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
