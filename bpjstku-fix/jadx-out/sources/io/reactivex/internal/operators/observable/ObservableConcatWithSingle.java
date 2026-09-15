package io.reactivex.internal.operators.observable;

import defpackage.BufferProviderState;
import defpackage.VideoRecordEventStart;
import defpackage.deriveMediaType;
import defpackage.generateBackupProfile;
import defpackage.getDefaultVideoProfile;
import defpackage.notifySuspended;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class ObservableConcatWithSingle<T> extends notifySuspended<T, T> {
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -196901581;
    private generateBackupProfile<? extends T> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public ObservableConcatWithSingle(VideoRecordEventStart<T> videoRecordEventStart, generateBackupProfile<? extends T> generatebackupprofile) {
        super(videoRecordEventStart);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = generatebackupprofile;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super T> derivemediatype) {
        this.TuitionPaymentFragmentbindingInflater1.subscribe(new ConcatWithObserver(derivemediatype, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3));
    }

    static final class ConcatWithObserver<T> extends AtomicReference<BufferProviderState> implements deriveMediaType<T>, getDefaultVideoProfile<T>, BufferProviderState {
        private static final long serialVersionUID = -1953724749712440952L;
        final deriveMediaType<? super T> downstream;
        boolean inSingle;
        generateBackupProfile<? extends T> other;

        ConcatWithObserver(deriveMediaType<? super T> derivemediatype, generateBackupProfile<? extends T> generatebackupprofile) {
            this.downstream = derivemediatype;
            this.other = generatebackupprofile;
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            if (!DisposableHelper.TuitionPaymentFragmentbindingInflater1(this, bufferProviderState) || this.inSingle) {
                return;
            }
            this.downstream.onSubscribe(this);
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(T t) {
            this.downstream.onNext(t);
        }

        @Override // defpackage.getDefaultVideoProfile
        public final void b(T t) {
            this.downstream.onNext(t);
            this.downstream.onComplete();
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            this.inSingle = true;
            DisposableHelper.b((AtomicReference<BufferProviderState>) this, (BufferProviderState) null);
            generateBackupProfile<? extends T> generatebackupprofile = this.other;
            this.other = null;
            generatebackupprofile.TuitionPaymentFragmentbindingInflater1(this);
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this);
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return DisposableHelper.TuitionPaymentFragmentbindingInflater1(get());
        }
    }
}
