package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.exifinterface.media.ExifInterface;
import defpackage.addSignalEosTimeoutIfNeeded;
import defpackage.clampVideoBitrateIfNotSupported;
import defpackage.lambdamatchAcquisitionsAndFreeBufferIndexes15androidxcameravideointernalencoderEncoderImpl;
import defpackage.setMediaCodecPaused;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.b;
import kotlinx.coroutines.channels.BufferOverflow;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\fJ+\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00130\u00122\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0011H\u0007¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001e\u001a\u0006*\u00020\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010'\u001a\u00020&8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010*\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b*\u0010+R \u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00130,8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b6\u00107"}, d2 = {"Landroidx/room/MultiInstanceInvalidationClient;", "", "Landroid/content/Context;", "p0", "", "p1", "Landroidx/room/InvalidationTracker;", "p2", "<init>", "(Landroid/content/Context;Ljava/lang/String;Landroidx/room/InvalidationTracker;)V", "", "registerCallback", "()V", "Landroid/content/Intent;", "start", "(Landroid/content/Intent;)V", "stop", "", "LclampVideoBitrateIfNotSupported;", "", "createFlow", "([Ljava/lang/String;)LclampVideoBitrateIfNotSupported;", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "invalidationTracker", "Landroidx/room/InvalidationTracker;", "getInvalidationTracker", "()Landroidx/room/InvalidationTracker;", "appContext", "Landroid/content/Context;", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "stopped", "Ljava/util/concurrent/atomic/AtomicBoolean;", "", "clientId", "I", "Landroidx/room/IMultiInstanceInvalidationService;", "invalidationService", "Landroidx/room/IMultiInstanceInvalidationService;", "LlambdamatchAcquisitionsAndFreeBufferIndexes15androidxcameravideointernalencoderEncoderImpl;", "invalidatedTables", "LlambdamatchAcquisitionsAndFreeBufferIndexes15androidxcameravideointernalencoderEncoderImpl;", "Landroidx/room/MultiInstanceInvalidationClient$observer$1;", "observer", "Landroidx/room/MultiInstanceInvalidationClient$observer$1;", "Landroidx/room/IMultiInstanceInvalidationCallback;", "invalidationCallback", "Landroidx/room/IMultiInstanceInvalidationCallback;", "Landroid/content/ServiceConnection;", "serviceConnection", "Landroid/content/ServiceConnection;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MultiInstanceInvalidationClient {
    private final Context appContext;
    private int clientId;
    private final CoroutineScope coroutineScope;
    private final lambdamatchAcquisitionsAndFreeBufferIndexes15androidxcameravideointernalencoderEncoderImpl<Set<String>> invalidatedTables;
    private final IMultiInstanceInvalidationCallback invalidationCallback;
    private IMultiInstanceInvalidationService invalidationService;
    private final InvalidationTracker invalidationTracker;
    private final String name;
    private final MultiInstanceInvalidationClient$observer$1 observer;
    private final ServiceConnection serviceConnection;
    private final AtomicBoolean stopped;

    /* JADX WARN: Type inference failed for: r2v7, types: [androidx.room.MultiInstanceInvalidationClient$observer$1] */
    public MultiInstanceInvalidationClient(Context context, String str, InvalidationTracker invalidationTracker) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(invalidationTracker, "");
        this.name = str;
        this.invalidationTracker = invalidationTracker;
        this.appContext = context.getApplicationContext();
        this.coroutineScope = invalidationTracker.getDatabase().getCoroutineScope();
        this.stopped = new AtomicBoolean(true);
        this.invalidatedTables = setMediaCodecPaused.TuitionPaymentFragmentspecialinlinedviewModeldefault3(0, 0, BufferOverflow.SUSPEND);
        final String[] tableNames$room_runtime_release = invalidationTracker.getTableNames();
        this.observer = new InvalidationTracker.Observer(tableNames$room_runtime_release) { // from class: androidx.room.MultiInstanceInvalidationClient$observer$1
            @Override // androidx.room.InvalidationTracker.Observer
            public final boolean isRemote$room_runtime_release() {
                return true;
            }

            @Override // androidx.room.InvalidationTracker.Observer
            public final void onInvalidated(Set<String> p0) {
                Intrinsics.checkNotNullParameter(p0, "");
                if (this.this$0.stopped.get()) {
                    return;
                }
                try {
                    IMultiInstanceInvalidationService iMultiInstanceInvalidationService = this.this$0.invalidationService;
                    if (iMultiInstanceInvalidationService != null) {
                        iMultiInstanceInvalidationService.broadcastInvalidation(this.this$0.clientId, (String[]) p0.toArray(new String[0]));
                    }
                } catch (RemoteException e2) {
                }
            }
        };
        this.invalidationCallback = new IMultiInstanceInvalidationCallback.Stub() { // from class: androidx.room.MultiInstanceInvalidationClient$invalidationCallback$1
            @Override // androidx.room.IMultiInstanceInvalidationCallback
            public final void onInvalidation(String[] p0) {
                Intrinsics.checkNotNullParameter(p0, "");
                b.TuitionPaymentFragmentbindingInflater1(this.this$0.coroutineScope, null, null, new MultiInstanceInvalidationClient$invalidationCallback$1$onInvalidation$1(p0, this.this$0, null), 3, null);
            }
        };
        this.serviceConnection = new ServiceConnection() { // from class: androidx.room.MultiInstanceInvalidationClient$serviceConnection$1
            @Override // android.content.ServiceConnection
            public final void onServiceConnected(ComponentName p0, IBinder p1) {
                Intrinsics.checkNotNullParameter(p0, "");
                Intrinsics.checkNotNullParameter(p1, "");
                this.this$0.invalidationService = IMultiInstanceInvalidationService.Stub.asInterface(p1);
                this.this$0.registerCallback();
            }

            @Override // android.content.ServiceConnection
            public final void onServiceDisconnected(ComponentName p0) {
                Intrinsics.checkNotNullParameter(p0, "");
                this.this$0.invalidationService = null;
            }
        };
    }

    public final String getName() {
        return this.name;
    }

    public final InvalidationTracker getInvalidationTracker() {
        return this.invalidationTracker;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void registerCallback() {
        try {
            IMultiInstanceInvalidationService iMultiInstanceInvalidationService = this.invalidationService;
            if (iMultiInstanceInvalidationService != null) {
                this.clientId = iMultiInstanceInvalidationService.registerCallback(this.invalidationCallback, this.name);
            }
        } catch (RemoteException e2) {
        }
    }

    public final void start(Intent p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        if (this.stopped.compareAndSet(true, false)) {
            this.appContext.bindService(p0, this.serviceConnection, 1);
            this.invalidationTracker.addRemoteObserver$room_runtime_release(this.observer);
        }
    }

    public final void stop() {
        if (this.stopped.compareAndSet(false, true)) {
            this.invalidationTracker.removeObserver(this.observer);
            try {
                IMultiInstanceInvalidationService iMultiInstanceInvalidationService = this.invalidationService;
                if (iMultiInstanceInvalidationService != null) {
                    iMultiInstanceInvalidationService.unregisterCallback(this.invalidationCallback, this.clientId);
                }
            } catch (RemoteException e2) {
            }
            this.appContext.unbindService(this.serviceConnection);
        }
    }

    public final clampVideoBitrateIfNotSupported<Set<String>> createFlow(final String[] p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        final lambdamatchAcquisitionsAndFreeBufferIndexes15androidxcameravideointernalencoderEncoderImpl<Set<String>> lambdamatchacquisitionsandfreebufferindexes15androidxcameravideointernalencoderencoderimpl = this.invalidatedTables;
        return (clampVideoBitrateIfNotSupported) new clampVideoBitrateIfNotSupported<Set<? extends String>>() { // from class: androidx.room.MultiInstanceInvalidationClient$createFlow$$inlined$mapNotNull$1

            /* JADX INFO: renamed from: androidx.room.MultiInstanceInvalidationClient$createFlow$$inlined$mapNotNull$1$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "R", "p0", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class AnonymousClass2<T> implements addSignalEosTimeoutIfNeeded {
                final /* synthetic */ String[] $resolvedTableNames$inlined;
                final /* synthetic */ addSignalEosTimeoutIfNeeded $this_unsafeFlow;

                /* JADX INFO: renamed from: androidx.room.MultiInstanceInvalidationClient$createFlow$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "androidx.room.MultiInstanceInvalidationClient$createFlow$$inlined$mapNotNull$1$2", f = "MultiInstanceInvalidationClient.android.kt", i = {}, l = {239}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0014  */
                @Override // defpackage.addSignalEosTimeoutIfNeeded
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = anonymousClass1.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj2);
                        addSignalEosTimeoutIfNeeded addsignaleostimeoutifneeded = this.$this_unsafeFlow;
                        Set set = (Set) obj;
                        Set setCreateSetBuilder = SetsKt.createSetBuilder();
                        for (String str : this.$resolvedTableNames$inlined) {
                            Iterator<T> it = set.iterator();
                            while (it.hasNext()) {
                                if (StringsKt.equals(str, (String) it.next(), true)) {
                                    setCreateSetBuilder.add(str);
                                }
                            }
                        }
                        Set setBuild = SetsKt.build(setCreateSetBuilder);
                        if (setBuild.isEmpty()) {
                            setBuild = null;
                        }
                        if (setBuild != null) {
                            anonymousClass1.label = 1;
                            if (addsignaleostimeoutifneeded.emit(setBuild, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }

                public AnonymousClass2(addSignalEosTimeoutIfNeeded addsignaleostimeoutifneeded, String[] strArr) {
                    this.$this_unsafeFlow = addsignaleostimeoutifneeded;
                    this.$resolvedTableNames$inlined = strArr;
                }
            }

            @Override // defpackage.clampVideoBitrateIfNotSupported
            public final Object collect(addSignalEosTimeoutIfNeeded<? super Set<? extends String>> addsignaleostimeoutifneeded, Continuation continuation) {
                Object objCollect = lambdamatchacquisitionsandfreebufferindexes15androidxcameravideointernalencoderencoderimpl.collect(new AnonymousClass2(addsignaleostimeoutifneeded, p0), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }
}
