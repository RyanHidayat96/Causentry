package defpackage;

import coil.decode.DataSource;
import java.nio.ByteBuffer;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes.dex */
public final class setDescription implements setMediaId {
    private final ByteBuffer TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final getStarRating TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public setDescription(ByteBuffer byteBuffer, getStarRating getstarrating) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = byteBuffer;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = getstarrating;
    }

    @Override // defpackage.setMediaId
    public final Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Continuation<? super setMediaUri> continuation) {
        try {
            RotationProviderListenerWrapper rotationProviderListenerWrapper = new RotationProviderListenerWrapper();
            rotationProviderListenerWrapper.write(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            return new MediaDescriptionCompatApi21Builder(new MediaBrowserCompatApi26SubscriptionCallbackProxy(rotationProviderListenerWrapper, new MediaDescriptionCompat(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2()), null), null, DataSource.MEMORY);
        } finally {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.position(0);
        }
    }

    public static final class TuitionPaymentFragmentbindingInflater1 implements setMediaId.TuitionPaymentFragmentspecialinlinedviewModeldefault1<ByteBuffer> {
        @Override // setMediaId.TuitionPaymentFragmentspecialinlinedviewModeldefault1
        public final /* synthetic */ setMediaId TuitionPaymentFragmentspecialinlinedviewModeldefault2(ByteBuffer byteBuffer, getStarRating getstarrating) {
            return new setDescription(byteBuffer, getstarrating);
        }
    }
}
