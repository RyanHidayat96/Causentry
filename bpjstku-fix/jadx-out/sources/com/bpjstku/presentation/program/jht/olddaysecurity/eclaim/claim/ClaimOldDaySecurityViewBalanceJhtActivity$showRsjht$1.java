package com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim;

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
@DebugMetadata(c = "com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDaySecurityViewBalanceJhtActivity$showRsjht$1", f = "ClaimOldDaySecurityViewBalanceJhtActivity.kt", i = {0, 1}, l = {115, 123}, m = "invokeSuspend", n = {"tempFile", "tempFile"}, s = {"L$1", "L$1"})
final class ClaimOldDaySecurityViewBalanceJhtActivity$showRsjht$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ ClaimOldDaySecurityViewBalanceJhtActivity this$0;

    /* JADX WARN: Code duplicated, block: B:38:0x00d1 A[Catch: Exception -> 0x003a, TryCatch #0 {Exception -> 0x003a, blocks: (B:7:0x001b, B:36:0x00cd, B:38:0x00d1, B:40:0x00fb, B:39:0x00f6, B:12:0x0033, B:26:0x008b, B:28:0x0093, B:30:0x00a5, B:32:0x00ab, B:41:0x0103, B:17:0x0040, B:19:0x0048, B:21:0x0065, B:23:0x006e, B:24:0x0072, B:49:0x010f, B:50:0x0112, B:20:0x005c, B:46:0x010c), top: B:54:0x000d, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00f6 A[Catch: Exception -> 0x003a, TryCatch #0 {Exception -> 0x003a, blocks: (B:7:0x001b, B:36:0x00cd, B:38:0x00d1, B:40:0x00fb, B:39:0x00f6, B:12:0x0033, B:26:0x008b, B:28:0x0093, B:30:0x00a5, B:32:0x00ab, B:41:0x0103, B:17:0x0040, B:19:0x0048, B:21:0x0065, B:23:0x006e, B:24:0x0072, B:49:0x010f, B:50:0x0112, B:20:0x005c, B:46:0x010c), top: B:54:0x000d, inners: #1, #2 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ClaimOldDaySecurityViewBalanceJhtActivity claimOldDaySecurityViewBalanceJhtActivity;
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
                    File file3 = (File) this.L$1;
                    claimOldDaySecurityViewBalanceJhtActivity = (ClaimOldDaySecurityViewBalanceJhtActivity) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    file = file3;
                    objTuitionPaymentFragmentbindingInflater1 = obj;
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    file2 = (File) this.L$1;
                    ClaimOldDaySecurityViewBalanceJhtActivity claimOldDaySecurityViewBalanceJhtActivity2 = (ClaimOldDaySecurityViewBalanceJhtActivity) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    claimOldDaySecurityViewBalanceJhtActivity = claimOldDaySecurityViewBalanceJhtActivity2;
                    objTuitionPaymentFragmentbindingInflater2 = obj;
                }
                bitmap = (Bitmap) objTuitionPaymentFragmentbindingInflater2;
                if (bitmap != null) {
                    ClaimOldDaySecurityViewBalanceJhtActivity.TuitionPaymentFragmentbindingInflater1(claimOldDaySecurityViewBalanceJhtActivity).idPdfView.setImageBitmap(bitmap);
                    PhotoView photoView = ClaimOldDaySecurityViewBalanceJhtActivity.TuitionPaymentFragmentbindingInflater1(claimOldDaySecurityViewBalanceJhtActivity).idPdfView;
                    photoView.setMinimumScale(1.0f);
                    photoView.setMaximumScale(5.0f);
                    photoView.setZoomable(true);
                    photoView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    Intrinsics.checkNotNull(photoView);
                } else {
                    ClaimOldDaySecurityViewBalanceJhtActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(claimOldDaySecurityViewBalanceJhtActivity, "Gagal menampilkan PDF");
                }
                Boxing.boxBoolean(file2.delete());
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            InputStream inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ClaimOldDaySecurityViewBalanceJhtActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.this$0);
            if (inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault1 != null) {
                claimOldDaySecurityViewBalanceJhtActivity = this.this$0;
                file = new File(claimOldDaySecurityViewBalanceJhtActivity.getCacheDir(), "temp_rsjht.pdf");
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    ByteStreamsKt.copyTo$default(inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault1, fileOutputStream, 0, 2, null);
                    CloseableKt.closeFinally(fileOutputStream, null);
                    updateSession updatesessionTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ClaimOldDaySecurityViewBalanceJhtActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(claimOldDaySecurityViewBalanceJhtActivity);
                    if (updatesessionTuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        updatesessionTuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
                    }
                    this.L$0 = claimOldDaySecurityViewBalanceJhtActivity;
                    this.L$1 = file;
                    this.label = 1;
                    objTuitionPaymentFragmentbindingInflater1 = BuildersKt.TuitionPaymentFragmentbindingInflater1(Dispatchers.getIO(), new AndroidPdfRenderer$openPdf$2(updatesessionTuitionPaymentFragmentspecialinlinedviewModeldefault2, file, null), this);
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
            }
            return Unit.INSTANCE;
            if (((Boolean) objTuitionPaymentFragmentbindingInflater1).booleanValue()) {
                DisplayMetrics displayMetrics = claimOldDaySecurityViewBalanceJhtActivity.getResources().getDisplayMetrics();
                int i2 = displayMetrics.widthPixels;
                int i3 = displayMetrics.heightPixels;
                updateSession updatesessionTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ClaimOldDaySecurityViewBalanceJhtActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(claimOldDaySecurityViewBalanceJhtActivity);
                if (updatesessionTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    updatesession = null;
                } else {
                    updatesession = updatesessionTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                }
                this.L$0 = claimOldDaySecurityViewBalanceJhtActivity;
                this.L$1 = file;
                this.label = 2;
                objTuitionPaymentFragmentbindingInflater2 = BuildersKt.TuitionPaymentFragmentbindingInflater1(Dispatchers.getIO(), new AndroidPdfRenderer$renderPageHighQuality$2(updatesession, 0, i2, 2.5f, i3 - 200, null), this);
                if (objTuitionPaymentFragmentbindingInflater2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                file2 = file;
                bitmap = (Bitmap) objTuitionPaymentFragmentbindingInflater2;
                if (bitmap != null) {
                    ClaimOldDaySecurityViewBalanceJhtActivity.TuitionPaymentFragmentbindingInflater1(claimOldDaySecurityViewBalanceJhtActivity).idPdfView.setImageBitmap(bitmap);
                    PhotoView photoView2 = ClaimOldDaySecurityViewBalanceJhtActivity.TuitionPaymentFragmentbindingInflater1(claimOldDaySecurityViewBalanceJhtActivity).idPdfView;
                    photoView2.setMinimumScale(1.0f);
                    photoView2.setMaximumScale(5.0f);
                    photoView2.setZoomable(true);
                    photoView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    Intrinsics.checkNotNull(photoView2);
                } else {
                    ClaimOldDaySecurityViewBalanceJhtActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(claimOldDaySecurityViewBalanceJhtActivity, "Gagal menampilkan PDF");
                }
                Boxing.boxBoolean(file2.delete());
            } else {
                ClaimOldDaySecurityViewBalanceJhtActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(claimOldDaySecurityViewBalanceJhtActivity, "Gagal membuka PDF");
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            ClaimOldDaySecurityViewBalanceJhtActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.this$0, "Error menampilkan PDF: ".concat(String.valueOf(e2.getMessage())));
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ClaimOldDaySecurityViewBalanceJhtActivity$showRsjht$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ClaimOldDaySecurityViewBalanceJhtActivity$showRsjht$1(ClaimOldDaySecurityViewBalanceJhtActivity claimOldDaySecurityViewBalanceJhtActivity, Continuation<? super ClaimOldDaySecurityViewBalanceJhtActivity$showRsjht$1> continuation) {
        super(2, continuation);
        this.this$0 = claimOldDaySecurityViewBalanceJhtActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ClaimOldDaySecurityViewBalanceJhtActivity$showRsjht$1(this.this$0, continuation);
    }
}
