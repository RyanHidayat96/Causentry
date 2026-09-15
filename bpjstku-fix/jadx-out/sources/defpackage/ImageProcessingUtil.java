package defpackage;

import com.datadog.android.api.InternalLogger;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0003\u001a\u00020\tH\u0017¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"LImageProcessingUtil;", "LImageInfo;", "LonOutputSurface;", "p0", "p1", "Lcom/datadog/android/api/InternalLogger;", "p2", "<init>", "(LonOutputSurface;LImageInfo;Lcom/datadog/android/api/InternalLogger;)V", "Ljava/io/File;", "", "LImageCapture;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Ljava/io/File;)Ljava/util/List;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "LImageInfo;", "LonOutputSurface;", "b", "Lcom/datadog/android/api/InternalLogger;", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class ImageProcessingUtil implements ImageInfo {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final onOutputSurface b;
    private final ImageInfo TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InternalLogger TuitionPaymentFragmentbindingInflater1;

    public ImageProcessingUtil(onOutputSurface onoutputsurface, ImageInfo imageInfo, InternalLogger internalLogger) {
        Intrinsics.checkNotNullParameter(onoutputsurface, "");
        Intrinsics.checkNotNullParameter(imageInfo, "");
        Intrinsics.checkNotNullParameter(internalLogger, "");
        this.b = onoutputsurface;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = imageInfo;
        this.TuitionPaymentFragmentbindingInflater1 = internalLogger;
    }

    @Override // defpackage.ImageCaptureCapabilities
    public final /* bridge */ /* synthetic */ boolean b(File file, ImageCapture imageCapture, boolean z) {
        ImageCapture imageCapture2 = imageCapture;
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(imageCapture2, "");
        onOutputSurface onoutputsurface = this.b;
        byte[] bArr = imageCapture2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        byte[] bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1 = onoutputsurface.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        onOutputSurface onoutputsurface2 = this.b;
        byte[] bArr2 = imageCapture2.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        ImageCapture imageCapture3 = new ImageCapture(bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1, onoutputsurface2.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        if (imageCapture2.TuitionPaymentFragmentspecialinlinedviewModeldefault1.length == 0 || imageCapture3.TuitionPaymentFragmentspecialinlinedviewModeldefault1.length != 0) {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(file, imageCapture3, z);
        }
        this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.ERROR, InternalLogger.Target.USER, new Function0<String>() { // from class: com.datadog.android.core.internal.persistence.file.batch.EncryptedBatchReaderWriter$writeData$1
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Encryption of non-empty data produced empty result, aborting write operation.";
            }
        }, null, false, null);
        return false;
    }

    @Override // defpackage.getTotalCaptureLatencyMillis
    public final List<ImageCapture> TuitionPaymentFragmentspecialinlinedviewModeldefault1(File p0) {
        byte[] bArrTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        byte[] bArrTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        Intrinsics.checkNotNullParameter(p0, "");
        List<ImageCapture> listTuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listTuitionPaymentFragmentspecialinlinedviewModeldefault1, 10));
        for (ImageCapture imageCapture : listTuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            if (imageCapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1.length != 0) {
                onOutputSurface onoutputsurface = this.b;
                byte[] bArr = imageCapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                bArrTuitionPaymentFragmentspecialinlinedviewModeldefault3 = onoutputsurface.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            } else {
                bArrTuitionPaymentFragmentspecialinlinedviewModeldefault3 = imageCapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            }
            if (imageCapture.TuitionPaymentFragmentspecialinlinedviewModeldefault2.length != 0) {
                onOutputSurface onoutputsurface2 = this.b;
                byte[] bArr2 = imageCapture.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                bArrTuitionPaymentFragmentspecialinlinedviewModeldefault4 = onoutputsurface2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            } else {
                bArrTuitionPaymentFragmentspecialinlinedviewModeldefault4 = imageCapture.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            }
            arrayList.add(new ImageCapture(bArrTuitionPaymentFragmentspecialinlinedviewModeldefault3, bArrTuitionPaymentFragmentspecialinlinedviewModeldefault4));
        }
        return arrayList;
    }
}
