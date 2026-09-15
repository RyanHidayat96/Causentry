package defpackage;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.subjects.UnicastSubject;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class BufferedAudioStreamExternalSyntheticLambda5<T> extends notifySuspended<T, VideoRecordEventStart<T>> {
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private long TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private appendBackupVideoProfile TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f95a;
    private long asInterface;
    private boolean b;
    private TimeUnit g;

    public BufferedAudioStreamExternalSyntheticLambda5(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy, long j, long j2, TimeUnit timeUnit, appendBackupVideoProfile appendbackupvideoprofile, long j3, int i, boolean z) {
        super(autoValue_VideoValidatedEncoderProfilesProxy);
        this.asInterface = j;
        this.f95a = j2;
        this.g = timeUnit;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = appendbackupvideoprofile;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = j3;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        this.b = z;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super VideoRecordEventStart<T>> derivemediatype) {
        ExcludeStretchedVideoQualityQuirk excludeStretchedVideoQualityQuirk = new ExcludeStretchedVideoQualityQuirk(derivemediatype);
        if (this.asInterface != this.f95a) {
            this.TuitionPaymentFragmentbindingInflater1.subscribe(new TuitionPaymentFragmentspecialinlinedviewModeldefault3(excludeStretchedVideoQualityQuirk, this.asInterface, this.f95a, this.g, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), this.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
        } else if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == Long.MAX_VALUE) {
            this.TuitionPaymentFragmentbindingInflater1.subscribe(new TuitionPaymentFragmentspecialinlinedviewModeldefault2(excludeStretchedVideoQualityQuirk, this.asInterface, this.g, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
        } else {
            this.TuitionPaymentFragmentbindingInflater1.subscribe(new TuitionPaymentFragmentbindingInflater1(excludeStretchedVideoQualityQuirk, this.asInterface, this.g, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.b));
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2<T> extends stopSendingAudio<T, Object, VideoRecordEventStart<T>> implements BufferProviderState, Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static Object f97a = new Object();
        private SequentialDisposable INotificationSideChannel;
        private appendBackupVideoProfile asBinder;
        private int asInterface;
        private UnicastSubject<T> cancel;
        private BufferProviderState cancelAll;
        private volatile boolean d;
        private long notify;
        private TimeUnit onTransact;

        TuitionPaymentFragmentspecialinlinedviewModeldefault2(deriveMediaType<? super VideoRecordEventStart<T>> derivemediatype, long j, TimeUnit timeUnit, appendBackupVideoProfile appendbackupvideoprofile, int i) {
            super(derivemediatype, new MpscLinkedQueue());
            this.INotificationSideChannel = new SequentialDisposable();
            this.notify = j;
            this.onTransact = timeUnit;
            this.asBinder = appendbackupvideoprofile;
            this.asInterface = i;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            if (DisposableHelper.b(this.cancelAll, bufferProviderState)) {
                this.cancelAll = bufferProviderState;
                this.cancel = UnicastSubject.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.asInterface);
                deriveMediaType<? super V> derivemediatype = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                derivemediatype.onSubscribe(this);
                derivemediatype.onNext(this.cancel);
                if (this.TuitionPaymentFragmentbindingInflater1) {
                    return;
                }
                appendBackupVideoProfile appendbackupvideoprofile = this.asBinder;
                long j = this.notify;
                DisposableHelper.b((AtomicReference<BufferProviderState>) this.INotificationSideChannel, appendbackupvideoprofile.TuitionPaymentFragmentbindingInflater1(this, j, j, this.onTransact));
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // defpackage.deriveMediaType
        public final void onNext(T t) {
            if (this.d) {
                return;
            }
            if (this.g.get() == 0 && this.g.compareAndSet(0, 1)) {
                this.cancel.onNext(t);
                if (this.g.addAndGet(-1) == 0) {
                    return;
                }
            } else {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1((U) NotificationLite.TuitionPaymentFragmentbindingInflater1(t));
                if (this.g.getAndIncrement() != 0) {
                    return;
                }
            }
            TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            this.b = th;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
            if (this.g.getAndIncrement() == 0) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onError(th);
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
            if (this.g.getAndIncrement() == 0) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onComplete();
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            this.TuitionPaymentFragmentbindingInflater1 = true;
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return this.TuitionPaymentFragmentbindingInflater1;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // java.lang.Runnable
        public final void run() {
            if (this.TuitionPaymentFragmentbindingInflater1) {
                this.d = true;
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1((U) f97a);
            if (this.g.getAndIncrement() == 0) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [io.reactivex.subjects.UnicastSubject<T>] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        private void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            MpscLinkedQueue mpscLinkedQueue = (MpscLinkedQueue) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            deriveMediaType<? super V> derivemediatype = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            UnicastSubject<T> unicastSubject = this.cancel;
            int iAddAndGet = 1;
            while (true) {
                boolean z = this.d;
                boolean z2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault2 = mpscLinkedQueue.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                if (z2 && (objTuitionPaymentFragmentspecialinlinedviewModeldefault2 == null || objTuitionPaymentFragmentspecialinlinedviewModeldefault2 == f97a)) {
                    break;
                }
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault2 == f97a) {
                        unicastSubject.onComplete();
                        if (!z) {
                            unicastSubject = (UnicastSubject<T>) UnicastSubject.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.asInterface);
                            this.cancel = unicastSubject;
                            derivemediatype.onNext(unicastSubject);
                        } else {
                            this.cancelAll.dispose();
                        }
                    } else {
                        unicastSubject.onNext(NotificationLite.TuitionPaymentFragmentspecialinlinedviewModeldefault3(objTuitionPaymentFragmentspecialinlinedviewModeldefault2));
                    }
                } else {
                    iAddAndGet = this.g.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
            this.cancel = null;
            mpscLinkedQueue.TuitionPaymentFragmentbindingInflater1();
            Throwable th = this.b;
            if (th != null) {
                unicastSubject.onError(th);
            } else {
                unicastSubject.onComplete();
            }
            this.INotificationSideChannel.dispose();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class TuitionPaymentFragmentbindingInflater1<T> extends stopSendingAudio<T, Object, VideoRecordEventStart<T>> implements BufferProviderState {
        private appendBackupVideoProfile INotificationSideChannel;
        private UnicastSubject<T> INotificationSideChannelDefault;
        private appendBackupVideoProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault3 INotificationSideChannelStub;
        private BufferProviderState RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        volatile boolean f96a;
        private long asBinder;
        private int asInterface;
        private SequentialDisposable cancel;
        private long cancelAll;
        private long d;
        private TimeUnit getInterfaceDescriptor;
        private boolean notify;
        private long onTransact;

        TuitionPaymentFragmentbindingInflater1(deriveMediaType<? super VideoRecordEventStart<T>> derivemediatype, long j, TimeUnit timeUnit, appendBackupVideoProfile appendbackupvideoprofile, int i, long j2, boolean z) {
            super(derivemediatype, new MpscLinkedQueue());
            this.cancel = new SequentialDisposable();
            this.cancelAll = j;
            this.getInterfaceDescriptor = timeUnit;
            this.INotificationSideChannel = appendbackupvideoprofile;
            this.asInterface = i;
            this.asBinder = j2;
            this.notify = z;
            if (z) {
                this.INotificationSideChannelStub = appendbackupvideoprofile.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            } else {
                this.INotificationSideChannelStub = null;
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            BufferProviderState bufferProviderStateTuitionPaymentFragmentbindingInflater1;
            if (DisposableHelper.b(this.RemoteActionCompatParcelizer, bufferProviderState)) {
                this.RemoteActionCompatParcelizer = bufferProviderState;
                deriveMediaType<? super V> derivemediatype = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                derivemediatype.onSubscribe(this);
                if (this.TuitionPaymentFragmentbindingInflater1) {
                    return;
                }
                UnicastSubject<T> unicastSubjectTuitionPaymentFragmentspecialinlinedviewModeldefault3 = UnicastSubject.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.asInterface);
                this.INotificationSideChannelDefault = unicastSubjectTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                derivemediatype.onNext(unicastSubjectTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                b bVar = new b(this.onTransact, this);
                if (this.notify) {
                    appendBackupVideoProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.INotificationSideChannelStub;
                    long j = this.cancelAll;
                    bufferProviderStateTuitionPaymentFragmentbindingInflater1 = tuitionPaymentFragmentspecialinlinedviewModeldefault3.b(bVar, j, j, this.getInterfaceDescriptor);
                } else {
                    appendBackupVideoProfile appendbackupvideoprofile = this.INotificationSideChannel;
                    long j2 = this.cancelAll;
                    bufferProviderStateTuitionPaymentFragmentbindingInflater1 = appendbackupvideoprofile.TuitionPaymentFragmentbindingInflater1(bVar, j2, j2, this.getInterfaceDescriptor);
                }
                DisposableHelper.b((AtomicReference<BufferProviderState>) this.cancel, bufferProviderStateTuitionPaymentFragmentbindingInflater1);
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // defpackage.deriveMediaType
        public final void onNext(T t) {
            if (this.f96a) {
                return;
            }
            if (this.g.get() == 0 && this.g.compareAndSet(0, 1)) {
                UnicastSubject<T> unicastSubject = this.INotificationSideChannelDefault;
                unicastSubject.onNext(t);
                long j = this.d + 1;
                if (j >= this.asBinder) {
                    this.onTransact++;
                    this.d = 0L;
                    unicastSubject.onComplete();
                    UnicastSubject<T> unicastSubjectTuitionPaymentFragmentspecialinlinedviewModeldefault3 = UnicastSubject.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.asInterface);
                    this.INotificationSideChannelDefault = unicastSubjectTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onNext(unicastSubjectTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    if (this.notify) {
                        this.cancel.get().dispose();
                        appendBackupVideoProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.INotificationSideChannelStub;
                        b bVar = new b(this.onTransact, this);
                        long j2 = this.cancelAll;
                        DisposableHelper.b((AtomicReference<BufferProviderState>) this.cancel, tuitionPaymentFragmentspecialinlinedviewModeldefault3.b(bVar, j2, j2, this.getInterfaceDescriptor));
                    }
                } else {
                    this.d = j;
                }
                if (this.g.addAndGet(-1) == 0) {
                    return;
                }
            } else {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1((U) NotificationLite.TuitionPaymentFragmentbindingInflater1(t));
                if (this.g.getAndIncrement() != 0) {
                    return;
                }
            }
            TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            this.b = th;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
            if (this.g.getAndIncrement() == 0) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onError(th);
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
            if (this.g.getAndIncrement() == 0) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onComplete();
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            this.TuitionPaymentFragmentbindingInflater1 = true;
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return this.TuitionPaymentFragmentbindingInflater1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [io.reactivex.subjects.UnicastSubject<T>] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            MpscLinkedQueue mpscLinkedQueue = (MpscLinkedQueue) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            deriveMediaType<? super V> derivemediatype = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            UnicastSubject<T> unicastSubject = this.INotificationSideChannelDefault;
            int iAddAndGet = 1;
            while (!this.f96a) {
                boolean z = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault2 = mpscLinkedQueue.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                boolean z2 = objTuitionPaymentFragmentspecialinlinedviewModeldefault2 == null;
                boolean z3 = objTuitionPaymentFragmentspecialinlinedviewModeldefault2 instanceof b;
                if (z && (z2 || z3)) {
                    this.INotificationSideChannelDefault = null;
                    mpscLinkedQueue.TuitionPaymentFragmentbindingInflater1();
                    Throwable th = this.b;
                    if (th != null) {
                        unicastSubject.onError(th);
                    } else {
                        unicastSubject.onComplete();
                    }
                    DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.cancel);
                    appendBackupVideoProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.INotificationSideChannelStub;
                    if (tuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
                        tuitionPaymentFragmentspecialinlinedviewModeldefault3.dispose();
                        return;
                    }
                    return;
                }
                if (z2) {
                    iAddAndGet = this.g.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else if (z3) {
                    b bVar = (b) objTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    if (!this.notify || this.onTransact == bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                        unicastSubject.onComplete();
                        this.d = 0L;
                        unicastSubject = (UnicastSubject<T>) UnicastSubject.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.asInterface);
                        this.INotificationSideChannelDefault = unicastSubject;
                        derivemediatype.onNext(unicastSubject);
                    }
                } else {
                    unicastSubject.onNext(NotificationLite.TuitionPaymentFragmentspecialinlinedviewModeldefault3(objTuitionPaymentFragmentspecialinlinedviewModeldefault2));
                    long j = this.d + 1;
                    if (j >= this.asBinder) {
                        this.onTransact++;
                        this.d = 0L;
                        unicastSubject.onComplete();
                        unicastSubject = (UnicastSubject<T>) UnicastSubject.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.asInterface);
                        this.INotificationSideChannelDefault = unicastSubject;
                        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onNext(unicastSubject);
                        if (this.notify) {
                            BufferProviderState bufferProviderState = this.cancel.get();
                            bufferProviderState.dispose();
                            appendBackupVideoProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault4 = this.INotificationSideChannelStub;
                            b bVar2 = new b(this.onTransact, this);
                            long j2 = this.cancelAll;
                            BufferProviderState bufferProviderStateB = tuitionPaymentFragmentspecialinlinedviewModeldefault4.b(bVar2, j2, j2, this.getInterfaceDescriptor);
                            if (!this.cancel.compareAndSet(bufferProviderState, bufferProviderStateB)) {
                                bufferProviderStateB.dispose();
                            }
                        }
                    } else {
                        this.d = j;
                    }
                }
            }
            this.RemoteActionCompatParcelizer.dispose();
            mpscLinkedQueue.TuitionPaymentFragmentbindingInflater1();
            DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.cancel);
            appendBackupVideoProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault5 = this.INotificationSideChannelStub;
            if (tuitionPaymentFragmentspecialinlinedviewModeldefault5 != null) {
                tuitionPaymentFragmentspecialinlinedviewModeldefault5.dispose();
            }
        }

        static final class b implements Runnable {
            final long TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            private TuitionPaymentFragmentbindingInflater1<?> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

            b(long j, TuitionPaymentFragmentbindingInflater1<?> tuitionPaymentFragmentbindingInflater1) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = j;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = tuitionPaymentFragmentbindingInflater1;
            }

            @Override // java.lang.Runnable
            public final void run() {
                TuitionPaymentFragmentbindingInflater1<?> tuitionPaymentFragmentbindingInflater1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (!tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1) {
                    tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1(this);
                } else {
                    tuitionPaymentFragmentbindingInflater1.f96a = true;
                }
                if (tuitionPaymentFragmentbindingInflater1.g.getAndIncrement() == 0) {
                    tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                }
            }
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3<T> extends stopSendingAudio<T, Object, VideoRecordEventStart<T>> implements BufferProviderState, Runnable {
        private List<UnicastSubject<T>> INotificationSideChannel;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f98a;
        private volatile boolean asBinder;
        private long asInterface;
        private TimeUnit cancel;
        private int d;
        private appendBackupVideoProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault3 notify;
        private BufferProviderState onTransact;

        TuitionPaymentFragmentspecialinlinedviewModeldefault3(deriveMediaType<? super VideoRecordEventStart<T>> derivemediatype, long j, long j2, TimeUnit timeUnit, appendBackupVideoProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3, int i) {
            super(derivemediatype, new MpscLinkedQueue());
            this.asInterface = j;
            this.f98a = j2;
            this.cancel = timeUnit;
            this.notify = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
            this.d = i;
            this.INotificationSideChannel = new LinkedList();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            if (DisposableHelper.b(this.onTransact, bufferProviderState)) {
                this.onTransact = bufferProviderState;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onSubscribe(this);
                if (this.TuitionPaymentFragmentbindingInflater1) {
                    return;
                }
                UnicastSubject<T> unicastSubjectTuitionPaymentFragmentspecialinlinedviewModeldefault3 = UnicastSubject.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.d);
                this.INotificationSideChannel.add(unicastSubjectTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onNext(unicastSubjectTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                this.notify.TuitionPaymentFragmentbindingInflater1(new TuitionPaymentFragmentspecialinlinedviewModeldefault2(unicastSubjectTuitionPaymentFragmentspecialinlinedviewModeldefault3), this.asInterface, this.cancel);
                appendBackupVideoProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.notify;
                long j = this.f98a;
                tuitionPaymentFragmentspecialinlinedviewModeldefault3.b(this, j, j, this.cancel);
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            this.b = th;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
            if (this.g.getAndIncrement() == 0) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onError(th);
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
            if (this.g.getAndIncrement() == 0) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onComplete();
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            this.TuitionPaymentFragmentbindingInflater1 = true;
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return this.TuitionPaymentFragmentbindingInflater1;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(UnicastSubject<T> unicastSubject) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1((U) new TuitionPaymentFragmentspecialinlinedviewModeldefault1(unicastSubject, false));
            if (this.g.getAndIncrement() == 0) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        private void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            MpscLinkedQueue mpscLinkedQueue = (MpscLinkedQueue) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            deriveMediaType<? super V> derivemediatype = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            List<UnicastSubject<T>> list = this.INotificationSideChannel;
            int iAddAndGet = 1;
            while (!this.asBinder) {
                boolean z = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault2 = mpscLinkedQueue.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                boolean z2 = objTuitionPaymentFragmentspecialinlinedviewModeldefault2 == null;
                boolean z3 = objTuitionPaymentFragmentspecialinlinedviewModeldefault2 instanceof TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (z && (z2 || z3)) {
                    mpscLinkedQueue.TuitionPaymentFragmentbindingInflater1();
                    Throwable th = this.b;
                    if (th != null) {
                        Iterator<UnicastSubject<T>> it = list.iterator();
                        while (it.hasNext()) {
                            it.next().onError(th);
                        }
                    } else {
                        Iterator<UnicastSubject<T>> it2 = list.iterator();
                        while (it2.hasNext()) {
                            it2.next().onComplete();
                        }
                    }
                    list.clear();
                    this.notify.dispose();
                    return;
                }
                if (z2) {
                    iAddAndGet = this.g.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else if (z3) {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = (TuitionPaymentFragmentspecialinlinedviewModeldefault1) objTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    if (tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        if (!this.TuitionPaymentFragmentbindingInflater1) {
                            UnicastSubject<T> unicastSubjectTuitionPaymentFragmentspecialinlinedviewModeldefault3 = UnicastSubject.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.d);
                            list.add(unicastSubjectTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                            derivemediatype.onNext(unicastSubjectTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                            this.notify.TuitionPaymentFragmentbindingInflater1(new TuitionPaymentFragmentspecialinlinedviewModeldefault2(unicastSubjectTuitionPaymentFragmentspecialinlinedviewModeldefault3), this.asInterface, this.cancel);
                        }
                    } else {
                        list.remove(tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1);
                        tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1.onComplete();
                        if (list.isEmpty() && this.TuitionPaymentFragmentbindingInflater1) {
                            this.asBinder = true;
                        }
                    }
                } else {
                    Iterator<UnicastSubject<T>> it3 = list.iterator();
                    while (it3.hasNext()) {
                        it3.next().onNext(objTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    }
                }
            }
            this.onTransact.dispose();
            mpscLinkedQueue.TuitionPaymentFragmentbindingInflater1();
            list.clear();
            this.notify.dispose();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // java.lang.Runnable
        public final void run() {
            Object tuitionPaymentFragmentspecialinlinedviewModeldefault1 = new TuitionPaymentFragmentspecialinlinedviewModeldefault1(UnicastSubject.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.d), true);
            if (!this.TuitionPaymentFragmentbindingInflater1) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1((U) tuitionPaymentFragmentspecialinlinedviewModeldefault1);
            }
            if (this.g.getAndIncrement() == 0) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            }
        }

        static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1<T> {
            final UnicastSubject<T> TuitionPaymentFragmentbindingInflater1;
            final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;

            TuitionPaymentFragmentspecialinlinedviewModeldefault1(UnicastSubject<T> unicastSubject, boolean z) {
                this.TuitionPaymentFragmentbindingInflater1 = unicastSubject;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = z;
            }
        }

        final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements Runnable {
            private final UnicastSubject<T> TuitionPaymentFragmentspecialinlinedviewModeldefault1;

            TuitionPaymentFragmentspecialinlinedviewModeldefault2(UnicastSubject<T> unicastSubject) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = unicastSubject;
            }

            @Override // java.lang.Runnable
            public final void run() {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // defpackage.deriveMediaType
        public final void onNext(T t) {
            if (this.g.get() == 0 && this.g.compareAndSet(0, 1)) {
                Iterator<UnicastSubject<T>> it = this.INotificationSideChannel.iterator();
                while (it.hasNext()) {
                    it.next().onNext(t);
                }
                if (this.g.addAndGet(-1) == 0) {
                    return;
                }
            } else {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1((U) t);
                if (this.g.getAndIncrement() != 0) {
                    return;
                }
            }
            TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        }
    }
}
