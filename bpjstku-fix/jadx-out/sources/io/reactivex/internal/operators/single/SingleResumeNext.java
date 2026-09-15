package io.reactivex.internal.operators.single;

import defpackage.BufferProviderState;
import defpackage.deriveCodec;
import defpackage.dumpMediaCodecListForFormat;
import defpackage.generateBackupProfile;
import defpackage.getDefaultVideoProfile;
import defpackage.lambdamute7androidxcameravideointernalaudioAudioSource;
import defpackage.readableMs;
import defpackage.share;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class SingleResumeNext<T> extends deriveCodec<T> {
    private readableMs<? super Throwable, ? extends generateBackupProfile<? extends T>> TuitionPaymentFragmentbindingInflater1;
    private generateBackupProfile<? extends T> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public SingleResumeNext(generateBackupProfile<? extends T> generatebackupprofile, readableMs<? super Throwable, ? extends generateBackupProfile<? extends T>> readablems) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = generatebackupprofile;
        this.TuitionPaymentFragmentbindingInflater1 = readablems;
    }

    @Override // defpackage.deriveCodec
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(getDefaultVideoProfile<? super T> getdefaultvideoprofile) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1(new ResumeMainSingleObserver(getdefaultvideoprofile, this.TuitionPaymentFragmentbindingInflater1));
    }

    static final class ResumeMainSingleObserver<T> extends AtomicReference<BufferProviderState> implements getDefaultVideoProfile<T>, BufferProviderState {
        private static final long serialVersionUID = -5314538511045349925L;
        final getDefaultVideoProfile<? super T> downstream;
        final readableMs<? super Throwable, ? extends generateBackupProfile<? extends T>> nextFunction;

        ResumeMainSingleObserver(getDefaultVideoProfile<? super T> getdefaultvideoprofile, readableMs<? super Throwable, ? extends generateBackupProfile<? extends T>> readablems) {
            this.downstream = getdefaultvideoprofile;
            this.nextFunction = readablems;
        }

        @Override // defpackage.getDefaultVideoProfile
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            if (DisposableHelper.TuitionPaymentFragmentbindingInflater1(this, bufferProviderState)) {
                this.downstream.onSubscribe(this);
            }
        }

        @Override // defpackage.getDefaultVideoProfile
        public final void b(T t) {
            this.downstream.b(t);
        }

        @Override // defpackage.getDefaultVideoProfile
        public final void onError(Throwable th) {
            try {
                ((generateBackupProfile) share.b(this.nextFunction.apply(th), "The nextFunction returned a null SingleSource.")).TuitionPaymentFragmentbindingInflater1(new lambdamute7androidxcameravideointernalaudioAudioSource(this, this.downstream));
            } catch (Throwable th2) {
                dumpMediaCodecListForFormat.b(th2);
                this.downstream.onError(new CompositeException(th, th2));
            }
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
