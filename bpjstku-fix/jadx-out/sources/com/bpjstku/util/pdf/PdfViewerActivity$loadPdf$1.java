package com.bpjstku.util.pdf;

import android.graphics.pdf.PdfRenderer;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import com.bpjstku.databinding.ActivityPdfViewerBinding;
import defpackage.getTextOn;
import defpackage.updateSession;
import java.io.File;
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
@DebugMetadata(c = "com.bpjstku.util.pdf.PdfViewerActivity$loadPdf$1", f = "PdfViewerActivity.kt", i = {}, l = {65}, m = "invokeSuspend", n = {}, s = {})
final class PdfViewerActivity$loadPdf$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ File $file;
    int label;
    final /* synthetic */ PdfViewerActivity this$0;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        ActivityPdfViewerBinding activityPdfViewerBinding = null;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            updateSession updatesessionTuitionPaymentFragmentbindingInflater1 = PdfViewerActivity.TuitionPaymentFragmentbindingInflater1(this.this$0);
            if (updatesessionTuitionPaymentFragmentbindingInflater1 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                updatesessionTuitionPaymentFragmentbindingInflater1 = null;
            }
            File file = this.$file;
            this.label = 1;
            obj = BuildersKt.TuitionPaymentFragmentbindingInflater1(Dispatchers.getIO(), new AndroidPdfRenderer$openPdf$2(updatesessionTuitionPaymentFragmentbindingInflater1, file, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            PdfViewerActivity pdfViewerActivity = this.this$0;
            updateSession updatesessionTuitionPaymentFragmentbindingInflater2 = PdfViewerActivity.TuitionPaymentFragmentbindingInflater1(pdfViewerActivity);
            if (updatesessionTuitionPaymentFragmentbindingInflater2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                updatesessionTuitionPaymentFragmentbindingInflater2 = null;
            }
            PdfRenderer pdfRenderer = updatesessionTuitionPaymentFragmentbindingInflater2.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            PdfViewerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(pdfViewerActivity, pdfRenderer != null ? pdfRenderer.getPageCount() : 0);
            ActivityPdfViewerBinding activityPdfViewerBindingTuitionPaymentFragmentspecialinlinedviewModeldefault3 = PdfViewerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.this$0);
            if (activityPdfViewerBindingTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                activityPdfViewerBinding = activityPdfViewerBindingTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            }
            Toolbar toolbar = activityPdfViewerBinding.toolbar;
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = PdfViewerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.this$0);
            StringBuilder sb = new StringBuilder("PDF Viewer (");
            sb.append(iTuitionPaymentFragmentspecialinlinedviewModeldefault1);
            sb.append(" pages)");
            toolbar.setTitle(sb.toString());
            PdfViewerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(getTextOn.TuitionPaymentFragmentbindingInflater1(), getTextOn.TuitionPaymentFragmentbindingInflater1(), new Object[]{this.this$0}, -1487426480, getTextOn.TuitionPaymentFragmentbindingInflater1(), 1487426482, getTextOn.TuitionPaymentFragmentbindingInflater1());
            PdfViewerActivity.b(this.this$0);
        } else {
            Toast.makeText(this.this$0, "Failed to open PDF", 0).show();
            this.this$0.finish();
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PdfViewerActivity$loadPdf$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PdfViewerActivity$loadPdf$1(PdfViewerActivity pdfViewerActivity, File file, Continuation<? super PdfViewerActivity$loadPdf$1> continuation) {
        super(2, continuation);
        this.this$0 = pdfViewerActivity;
        this.$file = file;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PdfViewerActivity$loadPdf$1(this.this$0, this.$file, continuation);
    }
}
