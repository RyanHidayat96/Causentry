package defpackage;

import androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.queue.MpscLinkedQueue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class AudioSourceExternalSyntheticLambda0<T, U extends Collection<? super T>> extends notifySuspended<T, U> {
    private appendBackupVideoProfile TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private Callable<U> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f70a;
    private int b;
    private TimeUnit d;
    private long g;

    public AudioSourceExternalSyntheticLambda0(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy, long j, long j2, TimeUnit timeUnit, appendBackupVideoProfile appendbackupvideoprofile, Callable<U> callable, int i, boolean z) {
        super(autoValue_VideoValidatedEncoderProfilesProxy);
        this.g = j;
        this.f70a = j2;
        this.d = timeUnit;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = appendbackupvideoprofile;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = callable;
        this.b = i;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = z;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super U> derivemediatype) {
        if (this.g == this.f70a && this.b == Integer.MAX_VALUE) {
            this.TuitionPaymentFragmentbindingInflater1.subscribe(new TuitionPaymentFragmentspecialinlinedviewModeldefault2(new ExcludeStretchedVideoQualityQuirk(derivemediatype), this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, this.g, this.d, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
            return;
        }
        appendBackupVideoProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        if (this.g == this.f70a) {
            this.TuitionPaymentFragmentbindingInflater1.subscribe(new TuitionPaymentFragmentspecialinlinedviewModeldefault1(new ExcludeStretchedVideoQualityQuirk(derivemediatype), this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, this.g, this.d, this.b, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault2));
        } else {
            this.TuitionPaymentFragmentbindingInflater1.subscribe(new TuitionPaymentFragmentspecialinlinedviewModeldefault3(new ExcludeStretchedVideoQualityQuirk(derivemediatype), this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, this.g, this.f70a, this.d, tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault2));
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2<T, U extends Collection<? super T>> extends stopSendingAudio<T, U, U> implements Runnable, BufferProviderState {
        private TimeUnit INotificationSideChannel;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private AtomicReference<BufferProviderState> f72a;
        private U asBinder;
        private Callable<U> asInterface;
        private appendBackupVideoProfile d;
        private long notify;
        private BufferProviderState onTransact;

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // defpackage.stopSendingAudio, defpackage.isMotoC
        public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(deriveMediaType derivemediatype, Object obj) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onNext((Collection) obj);
        }

        TuitionPaymentFragmentspecialinlinedviewModeldefault2(deriveMediaType<? super U> derivemediatype, Callable<U> callable, long j, TimeUnit timeUnit, appendBackupVideoProfile appendbackupvideoprofile) {
            super(derivemediatype, new MpscLinkedQueue());
            this.f72a = new AtomicReference<>();
            this.asInterface = callable;
            this.notify = j;
            this.INotificationSideChannel = timeUnit;
            this.d = appendbackupvideoprofile;
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            if (DisposableHelper.b(this.onTransact, bufferProviderState)) {
                this.onTransact = bufferProviderState;
                try {
                    this.asBinder = (U) share.b(this.asInterface.call(), "The buffer supplied is null");
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onSubscribe(this);
                    if (this.TuitionPaymentFragmentbindingInflater1) {
                        return;
                    }
                    appendBackupVideoProfile appendbackupvideoprofile = this.d;
                    long j = this.notify;
                    BufferProviderState bufferProviderStateTuitionPaymentFragmentbindingInflater1 = appendbackupvideoprofile.TuitionPaymentFragmentbindingInflater1(this, j, j, this.INotificationSideChannel);
                    if (PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.f72a, null, bufferProviderStateTuitionPaymentFragmentbindingInflater1)) {
                        return;
                    }
                    bufferProviderStateTuitionPaymentFragmentbindingInflater1.dispose();
                } catch (Throwable th) {
                    dumpMediaCodecListForFormat.b(th);
                    dispose();
                    EmptyDisposable.b(th, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                }
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(T t) {
            synchronized (this) {
                U u = this.asBinder;
                if (u == null) {
                    return;
                }
                u.add(t);
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            synchronized (this) {
                this.asBinder = null;
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onError(th);
            DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.f72a);
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            U u;
            synchronized (this) {
                u = this.asBinder;
                this.asBinder = null;
            }
            if (u != null) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1(u);
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
                if (this.g.getAndIncrement() == 0) {
                    isAffectedSamsungDevice.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, false, null, this);
                }
            }
            DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.f72a);
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.f72a);
            this.onTransact.dispose();
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return this.f72a.get() == DisposableHelper.DISPOSED;
        }

        @Override // java.lang.Runnable
        public final void run() {
            U u;
            try {
                U u2 = (U) share.b(this.asInterface.call(), "The bufferSupplier returned a null buffer");
                synchronized (this) {
                    u = this.asBinder;
                    if (u != null) {
                        this.asBinder = u2;
                    }
                }
                if (u == null) {
                    DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.f72a);
                } else {
                    b(u, this);
                }
            } catch (Throwable th) {
                dumpMediaCodecListForFormat.b(th);
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onError(th);
                dispose();
            }
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3<T, U extends Collection<? super T>> extends stopSendingAudio<T, U, U> implements Runnable, BufferProviderState {
        private BufferProviderState INotificationSideChannel;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f73a;
        private Callable<U> asBinder;
        final appendBackupVideoProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault3 asInterface;
        private TimeUnit cancel;
        private long cancelAll;
        final List<U> d;

        @Override // defpackage.stopSendingAudio, defpackage.isMotoC
        public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(deriveMediaType derivemediatype, Object obj) {
            derivemediatype.onNext((Collection) obj);
        }

        TuitionPaymentFragmentspecialinlinedviewModeldefault3(deriveMediaType<? super U> derivemediatype, Callable<U> callable, long j, long j2, TimeUnit timeUnit, appendBackupVideoProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            super(derivemediatype, new MpscLinkedQueue());
            this.asBinder = callable;
            this.cancelAll = j;
            this.f73a = j2;
            this.cancel = timeUnit;
            this.asInterface = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
            this.d = new LinkedList();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            if (DisposableHelper.b(this.INotificationSideChannel, bufferProviderState)) {
                this.INotificationSideChannel = bufferProviderState;
                try {
                    Collection collection = (Collection) share.b(this.asBinder.call(), "The buffer supplied is null");
                    this.d.add((U) collection);
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onSubscribe(this);
                    appendBackupVideoProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.asInterface;
                    long j = this.f73a;
                    tuitionPaymentFragmentspecialinlinedviewModeldefault3.b(this, j, j, this.cancel);
                    this.asInterface.TuitionPaymentFragmentbindingInflater1(new b(collection), this.cancelAll, this.cancel);
                } catch (Throwable th) {
                    dumpMediaCodecListForFormat.b(th);
                    bufferProviderState.dispose();
                    EmptyDisposable.b(th, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    this.asInterface.dispose();
                }
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(T t) {
            synchronized (this) {
                Iterator<U> it = this.d.iterator();
                while (it.hasNext()) {
                    it.next().add(t);
                }
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
            synchronized (this) {
                this.d.clear();
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onError(th);
            this.asInterface.dispose();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            ArrayList arrayList;
            synchronized (this) {
                arrayList = new ArrayList(this.d);
                this.d.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1((U) ((Collection) it.next()));
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
            if (this.g.getAndIncrement() == 0) {
                isAffectedSamsungDevice.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, false, this.asInterface, this);
            }
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            if (this.TuitionPaymentFragmentbindingInflater1) {
                return;
            }
            this.TuitionPaymentFragmentbindingInflater1 = true;
            synchronized (this) {
                this.d.clear();
            }
            this.INotificationSideChannel.dispose();
            this.asInterface.dispose();
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return this.TuitionPaymentFragmentbindingInflater1;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // java.lang.Runnable
        public final void run() {
            if (this.TuitionPaymentFragmentbindingInflater1) {
                return;
            }
            try {
                Collection collection = (Collection) share.b(this.asBinder.call(), "The bufferSupplier returned a null buffer");
                synchronized (this) {
                    if (this.TuitionPaymentFragmentbindingInflater1) {
                        return;
                    }
                    this.d.add((U) collection);
                    this.asInterface.TuitionPaymentFragmentbindingInflater1(new TuitionPaymentFragmentspecialinlinedviewModeldefault2(collection), this.cancelAll, this.cancel);
                }
            } catch (Throwable th) {
                dumpMediaCodecListForFormat.b(th);
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onError(th);
                dispose();
            }
        }

        final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements Runnable {
            private final U TuitionPaymentFragmentspecialinlinedviewModeldefault2;

            TuitionPaymentFragmentspecialinlinedviewModeldefault2(U u) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = u;
            }

            @Override // java.lang.Runnable
            public final void run() {
                synchronized (TuitionPaymentFragmentspecialinlinedviewModeldefault3.this) {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3.this.d.remove(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                }
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3.this;
                tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, false, tuitionPaymentFragmentspecialinlinedviewModeldefault3.asInterface);
            }
        }

        final class b implements Runnable {
            private final U b;

            b(U u) {
                this.b = u;
            }

            @Override // java.lang.Runnable
            public final void run() {
                synchronized (TuitionPaymentFragmentspecialinlinedviewModeldefault3.this) {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3.this.d.remove(this.b);
                }
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3.this;
                tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b, false, tuitionPaymentFragmentspecialinlinedviewModeldefault3.asInterface);
            }
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1<T, U extends Collection<? super T>> extends stopSendingAudio<T, U, U> implements Runnable, BufferProviderState {
        private BufferProviderState INotificationSideChannel;
        private appendBackupVideoProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault3 INotificationSideChannelStubProxy;
        private BufferProviderState RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f71a;
        private Callable<U> asBinder;
        private U asInterface;
        private long cancel;
        private boolean cancelAll;
        private long d;
        private TimeUnit notify;
        private long onTransact;

        @Override // defpackage.stopSendingAudio, defpackage.isMotoC
        public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(deriveMediaType derivemediatype, Object obj) {
            derivemediatype.onNext((Collection) obj);
        }

        TuitionPaymentFragmentspecialinlinedviewModeldefault1(deriveMediaType<? super U> derivemediatype, Callable<U> callable, long j, TimeUnit timeUnit, int i, boolean z, appendBackupVideoProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            super(derivemediatype, new MpscLinkedQueue());
            this.asBinder = callable;
            this.onTransact = j;
            this.notify = timeUnit;
            this.f71a = i;
            this.cancelAll = z;
            this.INotificationSideChannelStubProxy = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            if (DisposableHelper.b(this.RemoteActionCompatParcelizer, bufferProviderState)) {
                this.RemoteActionCompatParcelizer = bufferProviderState;
                try {
                    this.asInterface = (U) share.b(this.asBinder.call(), "The buffer supplied is null");
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onSubscribe(this);
                    appendBackupVideoProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.INotificationSideChannelStubProxy;
                    long j = this.onTransact;
                    this.INotificationSideChannel = tuitionPaymentFragmentspecialinlinedviewModeldefault3.b(this, j, j, this.notify);
                } catch (Throwable th) {
                    dumpMediaCodecListForFormat.b(th);
                    bufferProviderState.dispose();
                    EmptyDisposable.b(th, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    this.INotificationSideChannelStubProxy.dispose();
                }
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(T t) {
            synchronized (this) {
                U u = this.asInterface;
                if (u == null) {
                    return;
                }
                u.add(t);
                if (u.size() < this.f71a) {
                    return;
                }
                this.asInterface = null;
                this.cancel++;
                if (this.cancelAll) {
                    this.INotificationSideChannel.dispose();
                }
                TuitionPaymentFragmentspecialinlinedviewModeldefault3(u, false, this);
                try {
                    U u2 = (U) share.b(this.asBinder.call(), "The buffer supplied is null");
                    synchronized (this) {
                        this.asInterface = u2;
                        this.d++;
                    }
                    if (this.cancelAll) {
                        appendBackupVideoProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.INotificationSideChannelStubProxy;
                        long j = this.onTransact;
                        this.INotificationSideChannel = tuitionPaymentFragmentspecialinlinedviewModeldefault3.b(this, j, j, this.notify);
                    }
                } catch (Throwable th) {
                    dumpMediaCodecListForFormat.b(th);
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onError(th);
                    dispose();
                }
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            synchronized (this) {
                this.asInterface = null;
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onError(th);
            this.INotificationSideChannelStubProxy.dispose();
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            U u;
            this.INotificationSideChannelStubProxy.dispose();
            synchronized (this) {
                u = this.asInterface;
                this.asInterface = null;
            }
            if (u != null) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1(u);
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
                if (this.g.getAndIncrement() == 0) {
                    isAffectedSamsungDevice.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, false, this, this);
                }
            }
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            if (this.TuitionPaymentFragmentbindingInflater1) {
                return;
            }
            this.TuitionPaymentFragmentbindingInflater1 = true;
            this.RemoteActionCompatParcelizer.dispose();
            this.INotificationSideChannelStubProxy.dispose();
            synchronized (this) {
                this.asInterface = null;
            }
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return this.TuitionPaymentFragmentbindingInflater1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                U u = (U) share.b(this.asBinder.call(), "The bufferSupplier returned a null buffer");
                synchronized (this) {
                    U u2 = this.asInterface;
                    if (u2 != null && this.cancel == this.d) {
                        this.asInterface = u;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3(u2, false, this);
                    }
                }
            } catch (Throwable th) {
                dumpMediaCodecListForFormat.b(th);
                dispose();
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onError(th);
            }
        }
    }
}
