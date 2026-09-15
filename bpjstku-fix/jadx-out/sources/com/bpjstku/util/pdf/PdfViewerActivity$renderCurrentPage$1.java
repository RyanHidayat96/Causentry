package com.bpjstku.util.pdf;

import android.graphics.Bitmap;
import android.util.DisplayMetrics;
import android.widget.ImageView;
import android.widget.Toast;
import com.bpjstku.databinding.ActivityPdfViewerBinding;
import defpackage.getTextOn;
import defpackage.updateSession;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.bpjstku.util.pdf.PdfViewerActivity$renderCurrentPage$1", f = "PdfViewerActivity.kt", i = {0}, l = {88}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
final class PdfViewerActivity$renderCurrentPage$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PdfViewerActivity this$0;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ActivityPdfViewerBinding activityPdfViewerBinding;
        updateSession updatesession;
        Object objTuitionPaymentFragmentbindingInflater1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                ActivityPdfViewerBinding activityPdfViewerBindingTuitionPaymentFragmentspecialinlinedviewModeldefault3 = PdfViewerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.this$0);
                if (activityPdfViewerBindingTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    activityPdfViewerBindingTuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
                }
                activityPdfViewerBindingTuitionPaymentFragmentspecialinlinedviewModeldefault3.progressBar.setVisibility(0);
                DisplayMetrics displayMetrics = this.this$0.getResources().getDisplayMetrics();
                int i2 = displayMetrics.widthPixels;
                int i3 = displayMetrics.heightPixels;
                updateSession updatesessionTuitionPaymentFragmentbindingInflater1 = PdfViewerActivity.TuitionPaymentFragmentbindingInflater1(this.this$0);
                if (updatesessionTuitionPaymentFragmentbindingInflater1 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    updatesession = null;
                } else {
                    updatesession = updatesessionTuitionPaymentFragmentbindingInflater1;
                }
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = PdfViewerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.this$0);
                this.L$0 = coroutineScope;
                this.label = 1;
                objTuitionPaymentFragmentbindingInflater1 = BuildersKt.TuitionPaymentFragmentbindingInflater1(Dispatchers.getIO(), new AndroidPdfRenderer$renderPageHighQuality$2(updatesession, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, i2, 2.5f, i3 - 200, null), this);
                if (objTuitionPaymentFragmentbindingInflater1 == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objTuitionPaymentFragmentbindingInflater1 = obj;
            }
            Bitmap bitmap = (Bitmap) objTuitionPaymentFragmentbindingInflater1;
            ActivityPdfViewerBinding activityPdfViewerBindingTuitionPaymentFragmentspecialinlinedviewModeldefault4 = PdfViewerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.this$0);
            if (activityPdfViewerBindingTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                activityPdfViewerBindingTuitionPaymentFragmentspecialinlinedviewModeldefault4 = null;
            }
            activityPdfViewerBindingTuitionPaymentFragmentspecialinlinedviewModeldefault4.progressBar.setVisibility(8);
            if (bitmap != null) {
                PdfViewerActivity pdfViewerActivity = this.this$0;
                ActivityPdfViewerBinding activityPdfViewerBindingTuitionPaymentFragmentspecialinlinedviewModeldefault5 = PdfViewerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(pdfViewerActivity);
                if (activityPdfViewerBindingTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    activityPdfViewerBindingTuitionPaymentFragmentspecialinlinedviewModeldefault5 = null;
                }
                activityPdfViewerBindingTuitionPaymentFragmentspecialinlinedviewModeldefault5.imageViewPdf.setImageBitmap(bitmap);
                ActivityPdfViewerBinding activityPdfViewerBindingTuitionPaymentFragmentspecialinlinedviewModeldefault6 = PdfViewerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(pdfViewerActivity);
                if (activityPdfViewerBindingTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    activityPdfViewerBindingTuitionPaymentFragmentspecialinlinedviewModeldefault6 = null;
                }
                activityPdfViewerBindingTuitionPaymentFragmentspecialinlinedviewModeldefault6.imageViewPdf.setScaleType(ImageView.ScaleType.FIT_CENTER);
                int iTuitionPaymentFragmentbindingInflater1 = getTextOn.TuitionPaymentFragmentbindingInflater1();
                PdfViewerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(getTextOn.TuitionPaymentFragmentbindingInflater1(), getTextOn.TuitionPaymentFragmentbindingInflater1(), new Object[]{pdfViewerActivity}, -1487426480, iTuitionPaymentFragmentbindingInflater1, 1487426482, getTextOn.TuitionPaymentFragmentbindingInflater1());
                int iTuitionPaymentFragmentbindingInflater2 = getTextOn.TuitionPaymentFragmentbindingInflater1();
                PdfViewerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(getTextOn.TuitionPaymentFragmentbindingInflater1(), getTextOn.TuitionPaymentFragmentbindingInflater1(), new Object[]{pdfViewerActivity}, -1150345456, iTuitionPaymentFragmentbindingInflater2, 1150345456, getTextOn.TuitionPaymentFragmentbindingInflater1());
            } else {
                Toast.makeText(this.this$0, "Failed to render page", 0).show();
            }
        } catch (Exception e2) {
            ActivityPdfViewerBinding activityPdfViewerBindingTuitionPaymentFragmentspecialinlinedviewModeldefault7 = PdfViewerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.this$0);
            if (activityPdfViewerBindingTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                activityPdfViewerBinding = null;
            } else {
                activityPdfViewerBinding = activityPdfViewerBindingTuitionPaymentFragmentspecialinlinedviewModeldefault7;
            }
            activityPdfViewerBinding.progressBar.setVisibility(8);
            Toast.makeText(this.this$0, "Error rendering PDF: ".concat(String.valueOf(e2.getMessage())), 0).show();
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PdfViewerActivity$renderCurrentPage$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PdfViewerActivity$renderCurrentPage$1(PdfViewerActivity pdfViewerActivity, Continuation<? super PdfViewerActivity$renderCurrentPage$1> continuation) {
        super(2, continuation);
        this.this$0 = pdfViewerActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PdfViewerActivity$renderCurrentPage$1 pdfViewerActivity$renderCurrentPage$1 = new PdfViewerActivity$renderCurrentPage$1(this.this$0, continuation);
        pdfViewerActivity$renderCurrentPage$1.L$0 = obj;
        return pdfViewerActivity$renderCurrentPage$1;
    }
}
