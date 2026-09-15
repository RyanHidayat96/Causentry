package com.bpjstku.presentation.syariah;

import android.graphics.Bitmap;
import android.util.DisplayMetrics;
import android.widget.ImageView;
import com.bpjstku.util.pdf.AndroidPdfRenderer$openPdf$2;
import com.bpjstku.util.pdf.AndroidPdfRenderer$renderPageHighQuality$2;
import com.github.chrisbanes.photoview.PhotoView;
import defpackage.updateSession;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.bpjstku.presentation.syariah.SyariahPrintEakadDetailActivity$showEakad$1", f = "SyariahPrintEakadDetailActivity.kt", i = {0, 1}, l = {229, 237}, m = "invokeSuspend", n = {"tempFile", "tempFile"}, s = {"L$0", "L$0"})
final class SyariahPrintEakadDetailActivity$showEakad$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ InputStream $data;
    Object L$0;
    int label;
    final /* synthetic */ SyariahPrintEakadDetailActivity this$0;

    /* JADX WARN: Code duplicated, block: B:34:0x00c6 A[Catch: Exception -> 0x0114, TryCatch #1 {Exception -> 0x0114, blocks: (B:7:0x0018, B:32:0x00c2, B:34:0x00c6, B:36:0x00fa, B:35:0x00f3, B:12:0x002b, B:22:0x007b, B:24:0x0083, B:26:0x0099, B:28:0x009f, B:37:0x0102, B:15:0x0034, B:17:0x0052, B:19:0x005d, B:20:0x0061, B:45:0x0110, B:46:0x0113, B:16:0x004a, B:42:0x010d), top: B:53:0x000e, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00f3 A[Catch: Exception -> 0x0114, TryCatch #1 {Exception -> 0x0114, blocks: (B:7:0x0018, B:32:0x00c2, B:34:0x00c6, B:36:0x00fa, B:35:0x00f3, B:12:0x002b, B:22:0x007b, B:24:0x0083, B:26:0x0099, B:28:0x009f, B:37:0x0102, B:15:0x0034, B:17:0x0052, B:19:0x005d, B:20:0x0061, B:45:0x0110, B:46:0x0113, B:16:0x004a, B:42:0x010d), top: B:53:0x000e, inners: #0, #2 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        File file;
        Object objTuitionPaymentFragmentbindingInflater1;
        updateSession updatesession;
        Object objTuitionPaymentFragmentbindingInflater2;
        File file2;
        Bitmap bitmap;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i != 0) {
                if (i == 1) {
                    file = (File) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    objTuitionPaymentFragmentbindingInflater1 = obj;
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    file2 = (File) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    objTuitionPaymentFragmentbindingInflater2 = obj;
                }
                bitmap = (Bitmap) objTuitionPaymentFragmentbindingInflater2;
                if (bitmap != null) {
                    SyariahPrintEakadDetailActivity.TuitionPaymentFragmentbindingInflater1(this.this$0).idPdfView.setImageBitmap(bitmap);
                    PhotoView photoView = SyariahPrintEakadDetailActivity.TuitionPaymentFragmentbindingInflater1(this.this$0).idPdfView;
                    photoView.setMinimumScale(0.8f);
                    photoView.setMaximumScale(6.0f);
                    photoView.setZoomable(true);
                    photoView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    photoView.setAllowParentInterceptOnEdge(false);
                    Intrinsics.checkNotNull(photoView);
                } else {
                    SyariahPrintEakadDetailActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.this$0, "Gagal menampilkan PDF");
                }
                Boxing.boxBoolean(file2.delete());
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            file = new File(this.this$0.getCacheDir(), "temp_eakad.pdf");
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                ByteStreamsKt.copyTo$default(this.$data, fileOutputStream, 0, 2, null);
                CloseableKt.closeFinally(fileOutputStream, null);
                updateSession updatesessionD = SyariahPrintEakadDetailActivity.d(this.this$0);
                if (updatesessionD == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    updatesessionD = null;
                }
                this.L$0 = file;
                this.label = 1;
                objTuitionPaymentFragmentbindingInflater1 = BuildersKt.TuitionPaymentFragmentbindingInflater1(Dispatchers.getIO(), new AndroidPdfRenderer$openPdf$2(updatesessionD, file, null), this);
                if (objTuitionPaymentFragmentbindingInflater1 != coroutine_suspended) {
                }
                return coroutine_suspended;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(fileOutputStream, th);
                    throw th2;
                }
            }
            if (((Boolean) objTuitionPaymentFragmentbindingInflater1).booleanValue()) {
                DisplayMetrics displayMetrics = this.this$0.getResources().getDisplayMetrics();
                int i2 = displayMetrics.widthPixels;
                int i3 = displayMetrics.heightPixels;
                updateSession updatesessionD2 = SyariahPrintEakadDetailActivity.d(this.this$0);
                if (updatesessionD2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    updatesession = null;
                } else {
                    updatesession = updatesessionD2;
                }
                this.L$0 = file;
                this.label = 2;
                objTuitionPaymentFragmentbindingInflater2 = BuildersKt.TuitionPaymentFragmentbindingInflater1(Dispatchers.getIO(), new AndroidPdfRenderer$renderPageHighQuality$2(updatesession, 0, i2, 2.5f, i3 - 200, null), this);
                if (objTuitionPaymentFragmentbindingInflater2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                file2 = file;
                bitmap = (Bitmap) objTuitionPaymentFragmentbindingInflater2;
                if (bitmap != null) {
                    SyariahPrintEakadDetailActivity.TuitionPaymentFragmentbindingInflater1(this.this$0).idPdfView.setImageBitmap(bitmap);
                    PhotoView photoView2 = SyariahPrintEakadDetailActivity.TuitionPaymentFragmentbindingInflater1(this.this$0).idPdfView;
                    photoView2.setMinimumScale(0.8f);
                    photoView2.setMaximumScale(6.0f);
                    photoView2.setZoomable(true);
                    photoView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    photoView2.setAllowParentInterceptOnEdge(false);
                    Intrinsics.checkNotNull(photoView2);
                } else {
                    SyariahPrintEakadDetailActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.this$0, "Gagal menampilkan PDF");
                }
                Boxing.boxBoolean(file2.delete());
            } else {
                SyariahPrintEakadDetailActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.this$0, "Gagal membuka PDF");
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            SyariahPrintEakadDetailActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.this$0, "Error menampilkan PDF: ".concat(String.valueOf(e2.getMessage())));
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SyariahPrintEakadDetailActivity$showEakad$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SyariahPrintEakadDetailActivity$showEakad$1(SyariahPrintEakadDetailActivity syariahPrintEakadDetailActivity, InputStream inputStream, Continuation<? super SyariahPrintEakadDetailActivity$showEakad$1> continuation) {
        super(2, continuation);
        this.this$0 = syariahPrintEakadDetailActivity;
        this.$data = inputStream;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SyariahPrintEakadDetailActivity$showEakad$1(this.this$0, this.$data, continuation);
    }
}
