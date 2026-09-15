package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0003\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\f"}, d2 = {"LisTransportControlEnabled;", "LisCaptioningEnabled;", "LgetVolumeAttributes;", "p0", "<init>", "(LgetVolumeAttributes;)V", "LonQueueTitleChanged;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(LonQueueTitleChanged;)Z", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "()Z", "LgetVolumeAttributes;", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault3"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class isTransportControlEnabled implements isCaptioningEnabled {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final getVolumeAttributes b;

    public isTransportControlEnabled(getVolumeAttributes getvolumeattributes) {
        this.b = getvolumeattributes;
    }

    @Override // defpackage.isCaptioningEnabled
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(onQueueTitleChanged p0) {
        onEvent tuitionPaymentFragmentspecialinlinedviewModeldefault1 = p0.getTuitionPaymentFragmentspecialinlinedviewModeldefault1();
        if ((tuitionPaymentFragmentspecialinlinedviewModeldefault1 instanceof onEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && ((onEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault3) tuitionPaymentFragmentspecialinlinedviewModeldefault1).b <= 100) {
            return false;
        }
        onEvent tuitionPaymentFragmentspecialinlinedviewModeldefault3 = p0.getTuitionPaymentFragmentspecialinlinedviewModeldefault3();
        return !(tuitionPaymentFragmentspecialinlinedviewModeldefault3 instanceof onEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault3) || ((onEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault3) tuitionPaymentFragmentspecialinlinedviewModeldefault3).b > 100;
    }

    @Override // defpackage.isCaptioningEnabled
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return getTag.INSTANCE.TuitionPaymentFragmentbindingInflater1(this.b);
    }
}
