package com.bpjstku.util.pdf;

import android.graphics.pdf.PdfRenderer;
import android.os.ParcelFileDescriptor;
import defpackage.updateSession;
import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.bpjstku.util.pdf.AndroidPdfRenderer$openPdf$2", f = "AndroidPdfRenderer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AndroidPdfRenderer$openPdf$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ File $file;
    int label;
    final /* synthetic */ updateSession this$0;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        try {
            this.this$0.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            this.this$0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = ParcelFileDescriptor.open(this.$file, 268435456);
            updateSession updatesession = this.this$0;
            ParcelFileDescriptor parcelFileDescriptor = this.this$0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            Intrinsics.checkNotNull(parcelFileDescriptor);
            updatesession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new PdfRenderer(parcelFileDescriptor);
            z = true;
        } catch (IOException e2) {
            e2.printStackTrace();
            z = false;
        }
        return Boxing.boxBoolean(z);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((AndroidPdfRenderer$openPdf$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidPdfRenderer$openPdf$2(updateSession updatesession, File file, Continuation<? super AndroidPdfRenderer$openPdf$2> continuation) {
        super(2, continuation);
        this.this$0 = updatesession;
        this.$file = file;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AndroidPdfRenderer$openPdf$2(this.this$0, this.$file, continuation);
    }
}
