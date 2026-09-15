package defpackage;

import com.datadog.android.api.InternalLogger;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u000e\u001a\u00020\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0016R\u0014\u0010\u0011\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0018"}, d2 = {"LgetContentResolver;", "", "LgetFile;", "p0", "", "p1", "Ljava/io/File;", "p2", "Lcom/datadog/android/api/InternalLogger;", "p3", "LgetImageCaptureError;", "p4", "<init>", "(LgetFile;Ljava/lang/String;Ljava/io/File;Lcom/datadog/android/api/InternalLogger;LgetImageCaptureError;)V", "TuitionPaymentFragmentbindingInflater1", "LgetFile;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Ljava/lang/String;", "b", "g", "LgetImageCaptureError;", "Lcom/datadog/android/api/InternalLogger;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Ljava/io/File;"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class getContentResolver {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    final getFile TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    final String b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    final File TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    final InternalLogger TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final getImageCaptureError TuitionPaymentFragmentbindingInflater1;

    public getContentResolver(getFile getfile, String str, File file, InternalLogger internalLogger, getImageCaptureError getimagecaptureerror) {
        Intrinsics.checkNotNullParameter(getfile, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(internalLogger, "");
        Intrinsics.checkNotNullParameter(getimagecaptureerror, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = getfile;
        this.b = str;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = file;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = internalLogger;
        this.TuitionPaymentFragmentbindingInflater1 = getimagecaptureerror;
    }
}
