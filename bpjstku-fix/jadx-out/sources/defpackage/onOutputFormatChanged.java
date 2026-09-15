package defpackage;

import androidx.exifinterface.media.ExifInterface;
import defpackage.EncoderImplMediaCodecCallbackExternalSyntheticLambda1;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0081@\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0003B\u0013\b\u0007\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0011\u0010\u0013\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\tR\u0011\u0010\u0015\u001a\u00028\u00008G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0014\u0088\u0001\u0016\u0092\u0001\u0004\u0018\u00010\u0003"}, d2 = {"LonOutputFormatChanged;", "LEncoderImplMediaCodecCallbackExternalSyntheticLambda1;", ExifInterface.LATITUDE_SOUTH, "", "p0", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "TuitionPaymentFragmentbindingInflater1", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Ljava/lang/Object;)LEncoderImplMediaCodecCallbackExternalSyntheticLambda1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "value"}, k = 1, mv = {2, 0, 0}, xi = 48)
@JvmInline
public final class onOutputFormatChanged<S extends EncoderImplMediaCodecCallbackExternalSyntheticLambda1<S>> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Object TuitionPaymentFragmentbindingInflater1;

    public static <S extends EncoderImplMediaCodecCallbackExternalSyntheticLambda1<S>> Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object obj) {
        return obj;
    }

    public static final boolean b(Object obj) {
        return obj == lambdaacquireBuffer2androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    public static final S TuitionPaymentFragmentbindingInflater1(Object obj) {
        if (obj == lambdaacquireBuffer2androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            throw new IllegalStateException("Does not contain segment".toString());
        }
        Intrinsics.checkNotNull(obj, "");
        return (S) obj;
    }

    public final boolean equals(Object p0) {
        return (p0 instanceof onOutputFormatChanged) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, ((onOutputFormatChanged) p0).TuitionPaymentFragmentbindingInflater1);
    }

    public final int hashCode() {
        Object obj = this.TuitionPaymentFragmentbindingInflater1;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.TuitionPaymentFragmentbindingInflater1;
        StringBuilder sb = new StringBuilder("onOutputFormatChanged(TuitionPaymentFragmentbindingInflater1=");
        sb.append(obj);
        sb.append(')');
        return sb.toString();
    }
}
