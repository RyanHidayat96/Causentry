package defpackage;

import com.datadog.android.api.InternalLogger;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"LImageCaptureOutputFileOptions;", "LgetImageCaptureError;", "LonOutputSurface;", "p0", "p1", "Lcom/datadog/android/api/InternalLogger;", "p2", "<init>", "(LonOutputSurface;LgetImageCaptureError;Lcom/datadog/android/api/InternalLogger;)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "LgetImageCaptureError;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "b", "LonOutputSurface;", "TuitionPaymentFragmentbindingInflater1", "Lcom/datadog/android/api/InternalLogger;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class ImageCaptureOutputFileOptions implements getImageCaptureError {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final InternalLogger TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final getImageCaptureError TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final onOutputSurface b;

    public ImageCaptureOutputFileOptions(onOutputSurface onoutputsurface, getImageCaptureError getimagecaptureerror, InternalLogger internalLogger) {
        Intrinsics.checkNotNullParameter(onoutputsurface, "");
        Intrinsics.checkNotNullParameter(getimagecaptureerror, "");
        Intrinsics.checkNotNullParameter(internalLogger, "");
        this.b = onoutputsurface;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = getimagecaptureerror;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = internalLogger;
    }

    @Override // defpackage.ImageCaptureOutputFormat
    public final /* bridge */ /* synthetic */ byte[] b(File file) {
        Intrinsics.checkNotNullParameter(file, "");
        onOutputSurface onoutputsurface = this.b;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b(file);
        return onoutputsurface.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
    }

    @Override // defpackage.ImageCaptureCapabilities
    public final /* bridge */ /* synthetic */ boolean b(File file, byte[] bArr, boolean z) {
        byte[] bArr2 = bArr;
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(bArr2, "");
        if (!z) {
            byte[] bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            if (bArr2.length == 0 || bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1.length != 0) {
                return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b(file, bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1, z);
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.ERROR, InternalLogger.Target.USER, new Function0<String>() { // from class: com.datadog.android.core.internal.persistence.file.EncryptedFileReaderWriter$writeData$2
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "Encryption of non-empty data produced empty result, aborting write operation.";
                }
            }, null, false, null);
            return false;
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.ERROR, InternalLogger.Target.MAINTAINER, new Function0<String>() { // from class: com.datadog.android.core.internal.persistence.file.EncryptedFileReaderWriter$writeData$1
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Append mode is not supported, use EncryptedBatchFileReaderWriter instead.";
            }
        }, null, false, null);
        return false;
    }
}
