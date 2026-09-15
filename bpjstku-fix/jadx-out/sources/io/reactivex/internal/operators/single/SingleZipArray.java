package io.reactivex.internal.operators.single;

import defpackage.Api23Impl;
import defpackage.BufferProviderState;
import defpackage.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import defpackage.deriveCodec;
import defpackage.dumpMediaCodecListForFormat;
import defpackage.generateBackupProfile;
import defpackage.getDefaultVideoProfile;
import defpackage.readableMs;
import defpackage.share;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class SingleZipArray<T, R> extends deriveCodec<R> {
    private generateBackupProfile<? extends T>[] TuitionPaymentFragmentbindingInflater1;
    final readableMs<? super Object[], ? extends R> TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    public SingleZipArray(generateBackupProfile<? extends T>[] generatebackupprofileArr, readableMs<? super Object[], ? extends R> readablems) {
        this.TuitionPaymentFragmentbindingInflater1 = generatebackupprofileArr;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = readablems;
    }

    @Override // defpackage.deriveCodec
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(getDefaultVideoProfile<? super R> getdefaultvideoprofile) {
        generateBackupProfile<? extends T>[] generatebackupprofileArr = this.TuitionPaymentFragmentbindingInflater1;
        int length = generatebackupprofileArr.length;
        if (length == 1) {
            generatebackupprofileArr[0].TuitionPaymentFragmentbindingInflater1(new Api23Impl.TuitionPaymentFragmentspecialinlinedviewModeldefault2(getdefaultvideoprofile, new TuitionPaymentFragmentspecialinlinedviewModeldefault2()));
            return;
        }
        ZipCoordinator zipCoordinator = new ZipCoordinator(getdefaultvideoprofile, length, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        getdefaultvideoprofile.onSubscribe(zipCoordinator);
        for (int i = 0; i < length && !zipCoordinator.isDisposed(); i++) {
            generateBackupProfile<? extends T> generatebackupprofile = generatebackupprofileArr[i];
            if (generatebackupprofile == null) {
                NullPointerException nullPointerException = new NullPointerException("One of the sources is null");
                if (zipCoordinator.getAndSet(0) > 0) {
                    zipCoordinator.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i);
                    zipCoordinator.downstream.onError(nullPointerException);
                    return;
                } else {
                    DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(nullPointerException);
                    return;
                }
            }
            generatebackupprofile.TuitionPaymentFragmentbindingInflater1(zipCoordinator.observers[i]);
        }
    }

    public static final class ZipCoordinator<T, R> extends AtomicInteger implements BufferProviderState {
        private static final long serialVersionUID = -5556924161382950569L;
        final getDefaultVideoProfile<? super R> downstream;
        public final ZipSingleObserver<T>[] observers;
        final Object[] values;
        final readableMs<? super Object[], ? extends R> zipper;

        public ZipCoordinator(getDefaultVideoProfile<? super R> getdefaultvideoprofile, int i, readableMs<? super Object[], ? extends R> readablems) {
            super(i);
            this.downstream = getdefaultvideoprofile;
            this.zipper = readablems;
            ZipSingleObserver<T>[] zipSingleObserverArr = new ZipSingleObserver[i];
            for (int i2 = 0; i2 < i; i2++) {
                zipSingleObserverArr[i2] = new ZipSingleObserver<>(this, i2);
            }
            this.observers = zipSingleObserverArr;
            this.values = new Object[i];
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return get() <= 0;
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            if (getAndSet(0) > 0) {
                for (ZipSingleObserver<T> zipSingleObserver : this.observers) {
                    DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(zipSingleObserver);
                }
            }
        }

        final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i) {
            ZipSingleObserver<T>[] zipSingleObserverArr = this.observers;
            int length = zipSingleObserverArr.length;
            for (int i2 = 0; i2 < i; i2++) {
                DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(zipSingleObserverArr[i2]);
            }
            while (true) {
                i++;
                if (i >= length) {
                    return;
                } else {
                    DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(zipSingleObserverArr[i]);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class ZipSingleObserver<T> extends AtomicReference<BufferProviderState> implements getDefaultVideoProfile<T> {
        private static final long serialVersionUID = 3323743579927613702L;
        final int index;
        final ZipCoordinator<T, ?> parent;

        ZipSingleObserver(ZipCoordinator<T, ?> zipCoordinator, int i) {
            this.parent = zipCoordinator;
            this.index = i;
        }

        @Override // defpackage.getDefaultVideoProfile
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            DisposableHelper.TuitionPaymentFragmentbindingInflater1(this, bufferProviderState);
        }

        @Override // defpackage.getDefaultVideoProfile
        public final void b(T t) {
            ZipCoordinator<T, ?> zipCoordinator = this.parent;
            zipCoordinator.values[this.index] = t;
            if (zipCoordinator.decrementAndGet() == 0) {
                try {
                    zipCoordinator.downstream.b(share.b(zipCoordinator.zipper.apply(zipCoordinator.values), "The zipper returned a null value"));
                } catch (Throwable th) {
                    dumpMediaCodecListForFormat.b(th);
                    zipCoordinator.downstream.onError(th);
                }
            }
        }

        @Override // defpackage.getDefaultVideoProfile
        public final void onError(Throwable th) {
            ZipCoordinator<T, ?> zipCoordinator = this.parent;
            int i = this.index;
            if (zipCoordinator.getAndSet(0) > 0) {
                zipCoordinator.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i);
                zipCoordinator.downstream.onError(th);
            } else {
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
            }
        }
    }

    final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements readableMs<T, R> {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        }

        @Override // defpackage.readableMs
        public final R apply(T t) throws Exception {
            return (R) share.b(SingleZipArray.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.apply(new Object[]{t}), "The zipper returned a null value");
        }
    }
}
