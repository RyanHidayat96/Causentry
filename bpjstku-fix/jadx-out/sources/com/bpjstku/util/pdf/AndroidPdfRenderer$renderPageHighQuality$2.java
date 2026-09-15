package com.bpjstku.util.pdf;

import android.graphics.Bitmap;
import android.graphics.pdf.PdfRenderer;
import defpackage.updateSession;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
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
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Landroid/graphics/Bitmap;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.bpjstku.util.pdf.AndroidPdfRenderer$renderPageHighQuality$2", f = "AndroidPdfRenderer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AndroidPdfRenderer$renderPageHighQuality$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Bitmap>, Object> {
    final /* synthetic */ int $maxHeight;
    final /* synthetic */ int $maxWidth;
    final /* synthetic */ int $pageIndex;
    final /* synthetic */ float $quality;
    int label;
    final /* synthetic */ updateSession this$0;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i;
        Pair pair;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                PdfRenderer pdfRenderer = this.this$0.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (pdfRenderer != null && (i = this.$pageIndex) >= 0 && i < pdfRenderer.getPageCount()) {
                    PdfRenderer.Page page = this.this$0.b;
                    if (page != null) {
                        page.close();
                    }
                    this.this$0.b = pdfRenderer.openPage(this.$pageIndex);
                    PdfRenderer.Page page2 = this.this$0.b;
                    if (page2 == null) {
                        return null;
                    }
                    float width = page2.getWidth() / page2.getHeight();
                    if (width > 1.0f) {
                        int iMin = Math.min((int) (this.$maxWidth * this.$quality), 4096);
                        pair = TuplesKt.to(Boxing.boxInt(iMin), Boxing.boxInt(Math.min((int) (iMin / width), 4096)));
                    } else {
                        int iMin2 = Math.min((int) (this.$maxHeight * this.$quality), 4096);
                        pair = TuplesKt.to(Boxing.boxInt(Math.min((int) (iMin2 * width), 4096)), Boxing.boxInt(iMin2));
                    }
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((Number) pair.component1()).intValue(), ((Number) pair.component2()).intValue(), Bitmap.Config.ARGB_8888);
                    Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "");
                    bitmapCreateBitmap.eraseColor(-1);
                    page2.render(bitmapCreateBitmap, null, null, 1);
                    return bitmapCreateBitmap;
                }
                return null;
            } catch (Exception e2) {
                e2.printStackTrace();
                return null;
            }
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Bitmap> continuation) {
        return ((AndroidPdfRenderer$renderPageHighQuality$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidPdfRenderer$renderPageHighQuality$2(updateSession updatesession, int i, int i2, float f, int i3, Continuation<? super AndroidPdfRenderer$renderPageHighQuality$2> continuation) {
        super(2, continuation);
        this.this$0 = updatesession;
        this.$pageIndex = i;
        this.$maxWidth = i2;
        this.$quality = f;
        this.$maxHeight = i3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AndroidPdfRenderer$renderPageHighQuality$2(this.this$0, this.$pageIndex, this.$maxWidth, this.$quality, this.$maxHeight, continuation);
    }
}
