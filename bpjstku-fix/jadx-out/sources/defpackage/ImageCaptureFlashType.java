package defpackage;

import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H×\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"LImageCaptureFlashType;", "", "LImageCaptureImageCaptureCapabilitiesImpl;", "p0", "", "LImageCapture;", "p1", "", "p2", "<init>", "(LImageCaptureImageCaptureCapabilitiesImpl;Ljava/util/List;[B)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Ljava/util/List;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "b", "LImageCaptureImageCaptureCapabilitiesImpl;", "TuitionPaymentFragmentbindingInflater1", "[B"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final /* data */ class ImageCaptureFlashType {
    public final byte[] TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public final List<ImageCapture> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final ImageCaptureImageCaptureCapabilitiesImpl b;

    public ImageCaptureFlashType(ImageCaptureImageCaptureCapabilitiesImpl imageCaptureImageCaptureCapabilitiesImpl, List<ImageCapture> list, byte[] bArr) {
        Intrinsics.checkNotNullParameter(imageCaptureImageCaptureCapabilitiesImpl, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.b = imageCaptureImageCaptureCapabilitiesImpl;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = list;
        this.TuitionPaymentFragmentbindingInflater1 = bArr;
    }

    public /* synthetic */ ImageCaptureFlashType(ImageCaptureImageCaptureCapabilitiesImpl imageCaptureImageCaptureCapabilitiesImpl, List list, byte[] bArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(imageCaptureImageCaptureCapabilitiesImpl, list, (i & 4) != 0 ? null : bArr);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!Intrinsics.areEqual(getClass(), p0 != null ? p0.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(p0, "");
        ImageCaptureFlashType imageCaptureFlashType = (ImageCaptureFlashType) p0;
        if (!Intrinsics.areEqual(this.b, imageCaptureFlashType.b) || !Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, imageCaptureFlashType.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
            return false;
        }
        byte[] bArr = this.TuitionPaymentFragmentbindingInflater1;
        if (bArr != null) {
            byte[] bArr2 = imageCaptureFlashType.TuitionPaymentFragmentbindingInflater1;
            if (bArr2 == null || !Arrays.equals(bArr, bArr2)) {
                return false;
            }
        } else if (imageCaptureFlashType.TuitionPaymentFragmentbindingInflater1 != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode();
        int iHashCode2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode();
        byte[] bArr = this.TuitionPaymentFragmentbindingInflater1;
        return (((iHashCode * 31) + iHashCode2) * 31) + (bArr != null ? Arrays.hashCode(bArr) : 0);
    }

    public final String toString() {
        ImageCaptureImageCaptureCapabilitiesImpl imageCaptureImageCaptureCapabilitiesImpl = this.b;
        List<ImageCapture> list = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        String string = Arrays.toString(this.TuitionPaymentFragmentbindingInflater1);
        StringBuilder sb = new StringBuilder("ImageCaptureFlashType(b=");
        sb.append(imageCaptureImageCaptureCapabilitiesImpl);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
        sb.append(list);
        sb.append(", TuitionPaymentFragmentbindingInflater1=");
        sb.append(string);
        sb.append(")");
        return sb.toString();
    }
}
