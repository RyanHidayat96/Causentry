package defpackage;

import com.datadog.android.api.InternalLogger;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0012\u001a\u00020\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"LgetContentValues;", "", "LgetFile;", "p0", "", "p1", "Ljava/io/File;", "p2", "Lcom/datadog/android/api/InternalLogger;", "p3", "LconvertYUVToRGB;", "p4", "<init>", "(LgetFile;Ljava/lang/String;Ljava/io/File;Lcom/datadog/android/api/InternalLogger;LconvertYUVToRGB;)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "LgetFile;", "TuitionPaymentFragmentbindingInflater1", "Ljava/lang/String;", "b", "Lcom/datadog/android/api/InternalLogger;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Ljava/io/File;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "asBinder", "LconvertYUVToRGB;"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class getContentValues {
    private final String TuitionPaymentFragmentbindingInflater1;
    private final getFile TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final File TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private final convertYUVToRGB b;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InternalLogger TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public getContentValues(getFile getfile, String str, File file, InternalLogger internalLogger, convertYUVToRGB convertyuvtorgb) {
        Intrinsics.checkNotNullParameter(getfile, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(internalLogger, "");
        Intrinsics.checkNotNullParameter(convertyuvtorgb, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = getfile;
        this.TuitionPaymentFragmentbindingInflater1 = str;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = file;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = internalLogger;
        this.b = convertyuvtorgb;
    }
}
