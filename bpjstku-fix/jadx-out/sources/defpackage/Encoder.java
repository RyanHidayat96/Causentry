package defpackage;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000 \u0004*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0004"}, d2 = {"LEncoder;", ExifInterface.LONGITUDE_EAST, "LEncoderSurfaceInputOnSurfaceUpdateListener;", "LEncoderSurfaceInput;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface Encoder<E> extends EncoderSurfaceInputOnSurfaceUpdateListener<E>, EncoderSurfaceInput<E> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: Encoder$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public static final class Companion {
        static final /* synthetic */ Companion TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new Companion();
        private static final int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = EncoderImplMediaCodecCallbackExternalSyntheticLambda10.b("kotlinx.coroutines.channels.defaultBuffer", 64, 1, 2147483646);

        private Companion() {
        }

        public static int TuitionPaymentFragmentbindingInflater1() {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
    }
}
