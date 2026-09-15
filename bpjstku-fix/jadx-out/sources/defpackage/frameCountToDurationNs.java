package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class frameCountToDurationNs<R, T> extends notifySuspended<T, R> {
    private isSurfaceProcessingForceEnabled<? extends R, ? super T> b;

    public frameCountToDurationNs(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy, isSurfaceProcessingForceEnabled<? extends R, ? super T> issurfaceprocessingforceenabled) {
        super(autoValue_VideoValidatedEncoderProfilesProxy);
        this.b = issurfaceprocessingforceenabled;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super R> derivemediatype) {
        try {
            deriveMediaType<? super Object> derivemediatypeTuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            StringBuilder sb = new StringBuilder("Operator ");
            sb.append(this.b);
            sb.append(" returned a null Observer");
            this.TuitionPaymentFragmentbindingInflater1.subscribe((deriveMediaType) share.b(derivemediatypeTuitionPaymentFragmentspecialinlinedviewModeldefault3, sb.toString()));
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th) {
            dumpMediaCodecListForFormat.b(th);
            DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }
}
