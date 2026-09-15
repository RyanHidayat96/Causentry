package defpackage;

import android.content.Context;
import android.graphics.pdf.PdfRenderer;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u001c\u0010\t\u001a\b\u0018\u00010\u0012R\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013"}, d2 = {"LupdateSession;", "", "Landroid/content/Context;", "p0", "<init>", "(Landroid/content/Context;)V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()V", "b", "Landroid/content/Context;", "Landroid/graphics/pdf/PdfRenderer;", "TuitionPaymentFragmentbindingInflater1", "Landroid/graphics/pdf/PdfRenderer;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Landroid/os/ParcelFileDescriptor;", "Landroid/os/ParcelFileDescriptor;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Landroid/graphics/pdf/PdfRenderer$Page;", "Landroid/graphics/pdf/PdfRenderer$Page;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class updateSession {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public PdfRenderer TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private PdfRenderer.Page b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private ParcelFileDescriptor TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Context TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public updateSession(Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = context;
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        try {
            PdfRenderer.Page page = this.b;
            if (page != null) {
                page.close();
            }
            this.b = null;
            PdfRenderer pdfRenderer = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (pdfRenderer != null) {
                pdfRenderer.close();
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
            ParcelFileDescriptor parcelFileDescriptor = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (parcelFileDescriptor != null) {
                parcelFileDescriptor.close();
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }
}
