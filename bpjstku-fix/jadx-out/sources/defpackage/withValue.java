package defpackage;

import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0;
import com.google.common.util.concurrent.DirectExecutor;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes4.dex */
public abstract class withValue<V> extends incrementAll implements ListenableFuture<V> {
    private static final TuitionPaymentFragmentspecialinlinedviewModeldefault2 ATOMIC_HELPER;
    static final boolean GENERATE_CANCELLATION_CAUSES;
    private static final Object NULL;
    private static final long SPIN_THRESHOLD_NANOS = 1000;
    static final getPrescribedStreamFormat log;
    volatile TuitionPaymentFragmentbindingInflater1 listeners;
    volatile Object value;
    volatile notify waiters;

    interface d<V> extends ListenableFuture<V> {
    }

    public void afterDone() {
    }

    protected void interruptTask() {
    }

    static {
        boolean z;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 aVar;
        byte b2 = 0;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        GENERATE_CANCELLATION_CAUSES = z;
        log = new getPrescribedStreamFormat(withValue.class);
        Throwable e2 = null;
        try {
            aVar = new g(b2);
            e = null;
        } catch (Error | Exception e3) {
            e = e3;
            try {
                aVar = new TuitionPaymentFragmentspecialinlinedviewModeldefault1(AtomicReferenceFieldUpdater.newUpdater(notify.class, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(notify.class, notify.class, "next"), AtomicReferenceFieldUpdater.newUpdater(withValue.class, notify.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(withValue.class, TuitionPaymentFragmentbindingInflater1.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(withValue.class, Object.class, "value"));
            } catch (Error | Exception e4) {
                e2 = e4;
                aVar = new a(b2);
            }
        }
        ATOMIC_HELPER = aVar;
        if (e2 != null) {
            getPrescribedStreamFormat getprescribedstreamformat = log;
            getprescribedstreamformat.TuitionPaymentFragmentspecialinlinedviewModeldefault2().log(Level.SEVERE, "UnsafeAtomicHelper is broken!", e);
            getprescribedstreamformat.TuitionPaymentFragmentspecialinlinedviewModeldefault2().log(Level.SEVERE, "SafeAtomicHelper is broken!", e2);
        }
        NULL = new Object();
    }

    static abstract class asBinder<V> extends withValue<V> implements d<V> {
        asBinder() {
        }

        @Override // defpackage.withValue, java.util.concurrent.Future
        public final V get() throws ExecutionException, InterruptedException {
            return (V) super.get();
        }

        @Override // defpackage.withValue, java.util.concurrent.Future
        public final V get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
            return (V) super.get(j, timeUnit);
        }

        @Override // defpackage.withValue, java.util.concurrent.Future
        public final boolean isDone() {
            return super.isDone();
        }

        @Override // defpackage.withValue, java.util.concurrent.Future
        public final boolean isCancelled() {
            return super.isCancelled();
        }

        @Override // defpackage.withValue, com.google.common.util.concurrent.ListenableFuture
        public final void addListener(Runnable runnable, Executor executor) {
            super.addListener(runnable, executor);
        }

        @Override // defpackage.withValue, java.util.concurrent.Future
        public final boolean cancel(boolean z) {
            return super.cancel(z);
        }
    }

    static final class notify {
        static final notify b = new notify((byte) 0);
        volatile notify next;
        volatile Thread thread;

        private notify(byte b2) {
        }

        notify() {
            withValue.ATOMIC_HELPER.TuitionPaymentFragmentbindingInflater1(this, Thread.currentThread());
        }
    }

    private void removeWaiter(notify notifyVar) {
        notifyVar.thread = null;
        while (true) {
            notify notifyVar2 = this.waiters;
            if (notifyVar2 != notify.b) {
                notify notifyVar3 = null;
                while (notifyVar2 != null) {
                    notify notifyVar4 = notifyVar2.next;
                    if (notifyVar2.thread != null) {
                        notifyVar3 = notifyVar2;
                    } else if (notifyVar3 != null) {
                        notifyVar3.next = notifyVar4;
                        if (notifyVar3.thread == null) {
                        }
                    } else if (ATOMIC_HELPER.TuitionPaymentFragmentspecialinlinedviewModeldefault1((withValue<?>) this, notifyVar2, notifyVar4)) {
                    }
                    notifyVar2 = notifyVar4;
                }
                return;
            }
            return;
        }
    }

    static final class TuitionPaymentFragmentbindingInflater1 {
        static final TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentbindingInflater1 = new TuitionPaymentFragmentbindingInflater1();
        final Runnable TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        final Executor TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        TuitionPaymentFragmentbindingInflater1 b;

        TuitionPaymentFragmentbindingInflater1(Runnable runnable, Executor executor) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = runnable;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = executor;
        }

        TuitionPaymentFragmentbindingInflater1() {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
        }
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 {
        static final TuitionPaymentFragmentspecialinlinedviewModeldefault3 b;
        final Throwable TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        static {
            final String str = "Failure occurred while trying to finish a future.";
            b = new TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Throwable(str) { // from class: com.google.common.util.concurrent.AbstractFuture$Failure$1
                @Override // java.lang.Throwable
                public Throwable fillInStackTrace() {
                    synchronized (this) {
                    }
                    return this;
                }
            });
        }

        TuitionPaymentFragmentspecialinlinedviewModeldefault3(Throwable th) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = th;
        }
    }

    static final class b {
        static final b TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        static final b TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        final Throwable TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        final boolean b;

        static {
            if (withValue.GENERATE_CANCELLATION_CAUSES) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
            } else {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new b(false, null);
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new b(true, null);
            }
        }

        b(boolean z, Throwable th) {
            this.b = z;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = th;
        }
    }

    static final class asInterface<V> implements Runnable {
        final ListenableFuture<? extends V> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        final withValue<V> b;

        asInterface(withValue<V> withvalue, ListenableFuture<? extends V> listenableFuture) {
            this.b = withvalue;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = listenableFuture;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.b.value == this) {
                if (withValue.ATOMIC_HELPER.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b, this, withValue.getFutureValue(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1))) {
                    withValue.complete(this.b, false);
                }
            }
        }
    }

    public V get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.value;
        if ((obj != null) & (!(obj instanceof asInterface))) {
            return getDoneValue(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            notify notifyVar = this.waiters;
            if (notifyVar != notify.b) {
                notify notifyVar2 = new notify();
                while (true) {
                    ATOMIC_HELPER.TuitionPaymentFragmentspecialinlinedviewModeldefault3(notifyVar2, notifyVar);
                    if (ATOMIC_HELPER.TuitionPaymentFragmentspecialinlinedviewModeldefault1((withValue<?>) this, notifyVar, notifyVar2)) {
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                removeWaiter(notifyVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.value;
                            if ((obj2 != null) & (!(obj2 instanceof asInterface))) {
                                return getDoneValue(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        removeWaiter(notifyVar2);
                        break;
                    }
                    notifyVar = this.waiters;
                    if (notifyVar == notify.b) {
                    }
                }
            }
            return getDoneValue(Objects.requireNonNull(this.value));
        }
        while (nanos > 0) {
            Object obj3 = this.value;
            if ((obj3 != null) & (!(obj3 instanceof asInterface))) {
                return getDoneValue(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
        StringBuilder sb = new StringBuilder("Waited ");
        sb.append(j);
        sb.append(" ");
        sb.append(timeUnit.toString().toLowerCase(Locale.ROOT));
        String string2 = sb.toString();
        if (nanos + 1000 < 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(string2);
            sb2.append(" (plus ");
            String string3 = sb2.toString();
            long j2 = -nanos;
            long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(jConvert);
            boolean z = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(string3);
                sb3.append(jConvert);
                sb3.append(" ");
                sb3.append(lowerCase);
                String string4 = sb3.toString();
                if (z) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(string4);
                    sb4.append(",");
                    string4 = sb4.toString();
                }
                StringBuilder sb5 = new StringBuilder();
                sb5.append(string4);
                sb5.append(" ");
                string3 = sb5.toString();
            }
            if (z) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(string3);
                sb6.append(nanos2);
                sb6.append(" nanoseconds ");
                string3 = sb6.toString();
            }
            StringBuilder sb7 = new StringBuilder();
            sb7.append(string3);
            sb7.append("delay)");
            string2 = sb7.toString();
        }
        if (isDone()) {
            StringBuilder sb8 = new StringBuilder();
            sb8.append(string2);
            sb8.append(" but future completed as timeout expired");
            throw new TimeoutException(sb8.toString());
        }
        StringBuilder sb9 = new StringBuilder();
        sb9.append(string2);
        sb9.append(" for ");
        sb9.append(string);
        throw new TimeoutException(sb9.toString());
    }

    public V get() throws ExecutionException, InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.value;
        if ((obj2 != null) & (!(obj2 instanceof asInterface))) {
            return getDoneValue(obj2);
        }
        notify notifyVar = this.waiters;
        if (notifyVar != notify.b) {
            notify notifyVar2 = new notify();
            do {
                ATOMIC_HELPER.TuitionPaymentFragmentspecialinlinedviewModeldefault3(notifyVar2, notifyVar);
                if (ATOMIC_HELPER.TuitionPaymentFragmentspecialinlinedviewModeldefault1((withValue<?>) this, notifyVar, notifyVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            removeWaiter(notifyVar2);
                            throw new InterruptedException();
                        }
                        obj = this.value;
                    } while (!((obj != null) & (!(obj instanceof asInterface))));
                    return getDoneValue(obj);
                }
                notifyVar = this.waiters;
            } while (notifyVar != notify.b);
        }
        return getDoneValue(Objects.requireNonNull(this.value));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private V getDoneValue(Object obj) throws ExecutionException {
        if (obj instanceof b) {
            throw cancellationExceptionWithCause("Task was cancelled.", ((b) obj).TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
        if (obj instanceof TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            throw new ExecutionException(((TuitionPaymentFragmentspecialinlinedviewModeldefault3) obj).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
        if (obj == NULL) {
            return null;
        }
        return obj;
    }

    public boolean isDone() {
        Object obj = this.value;
        return (!(obj instanceof asInterface)) & (obj != null);
    }

    public boolean isCancelled() {
        return this.value instanceof b;
    }

    public boolean cancel(boolean z) {
        b bVar;
        Object objRequireNonNull;
        Object obj = this.value;
        if (!(obj == null) && !(obj instanceof asInterface)) {
            return false;
        }
        if (GENERATE_CANCELLATION_CAUSES) {
            objRequireNonNull = new b(z, new CancellationException("Future.cancel() was called."));
        } else {
            if (z) {
                bVar = b.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            } else {
                bVar = b.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            }
            objRequireNonNull = Objects.requireNonNull(bVar);
        }
        withValue<V> withvalue = this;
        boolean z2 = false;
        while (true) {
            if (ATOMIC_HELPER.TuitionPaymentFragmentspecialinlinedviewModeldefault2(withvalue, obj, objRequireNonNull)) {
                complete(withvalue, z);
                if (obj instanceof asInterface) {
                    ListenableFuture<? extends V> listenableFuture = ((asInterface) obj).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    if (listenableFuture instanceof d) {
                        withvalue = (withValue) listenableFuture;
                        obj = withvalue.value;
                        if ((obj == null) | (obj instanceof asInterface)) {
                            z2 = true;
                        }
                    } else {
                        listenableFuture.cancel(z);
                    }
                }
                return true;
            }
            obj = withvalue.value;
            if (!(obj instanceof asInterface)) {
                return z2;
            }
        }
    }

    protected final boolean wasInterrupted() {
        Object obj = this.value;
        return (obj instanceof b) && ((b) obj).b;
    }

    public void addListener(Runnable runnable, Executor executor) {
        TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1;
        if (runnable == null) {
            throw new NullPointerException("Runnable was null.");
        }
        if (executor != null) {
            if (!isDone() && (tuitionPaymentFragmentbindingInflater1 = this.listeners) != TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1) {
                TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater2 = new TuitionPaymentFragmentbindingInflater1(runnable, executor);
                do {
                    tuitionPaymentFragmentbindingInflater2.b = tuitionPaymentFragmentbindingInflater1;
                    if (ATOMIC_HELPER.TuitionPaymentFragmentspecialinlinedviewModeldefault1((withValue<?>) this, tuitionPaymentFragmentbindingInflater1, tuitionPaymentFragmentbindingInflater2)) {
                        return;
                    } else {
                        tuitionPaymentFragmentbindingInflater1 = this.listeners;
                    }
                } while (tuitionPaymentFragmentbindingInflater1 != TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1);
            }
            executeListener(runnable, executor);
            return;
        }
        throw new NullPointerException("Executor was null.");
    }

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
    public boolean set(V v) {
        if (v == null) {
            v = (V) NULL;
        }
        if (!ATOMIC_HELPER.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, null, v)) {
            return false;
        }
        complete(this, false);
        return true;
    }

    public boolean setException(Throwable th) {
        if (!ATOMIC_HELPER.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, null, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(th))) {
            return false;
        }
        complete(this, false);
        return true;
    }

    protected boolean setFuture(ListenableFuture<? extends V> listenableFuture) {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object obj = this.value;
        if (obj == null) {
            if (listenableFuture.isDone()) {
                if (!ATOMIC_HELPER.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, null, getFutureValue(listenableFuture))) {
                    return false;
                }
                complete(this, false);
                return true;
            }
            asInterface asinterface = new asInterface(this, listenableFuture);
            if (ATOMIC_HELPER.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, null, asinterface)) {
                try {
                    listenableFuture.addListener(asinterface, DirectExecutor.INSTANCE);
                } catch (Throwable th) {
                    try {
                        tuitionPaymentFragmentspecialinlinedviewModeldefault3 = new TuitionPaymentFragmentspecialinlinedviewModeldefault3(th);
                    } catch (Error | Exception unused) {
                        tuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3.b;
                    }
                    ATOMIC_HELPER.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, asinterface, tuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
                return true;
            }
            obj = this.value;
        }
        if (obj instanceof b) {
            listenableFuture.cancel(((b) obj).b);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static Object getFutureValue(ListenableFuture<?> listenableFuture) {
        Throwable thTuitionPaymentFragmentbindingInflater1;
        if (listenableFuture instanceof d) {
            Object bVar = ((withValue) listenableFuture).value;
            if (bVar instanceof b) {
                b bVar2 = (b) bVar;
                if (bVar2.b) {
                    bVar = bVar2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != null ? new b(false, bVar2.TuitionPaymentFragmentspecialinlinedviewModeldefault1) : b.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                }
            }
            return Objects.requireNonNull(bVar);
        }
        if ((listenableFuture instanceof incrementAll) && (thTuitionPaymentFragmentbindingInflater1 = DeferrableSurfaceSurfaceClosedException.TuitionPaymentFragmentbindingInflater1((incrementAll) listenableFuture)) != null) {
            return new TuitionPaymentFragmentspecialinlinedviewModeldefault3(thTuitionPaymentFragmentbindingInflater1);
        }
        boolean zIsCancelled = listenableFuture.isCancelled();
        if ((!GENERATE_CANCELLATION_CAUSES) & zIsCancelled) {
            return Objects.requireNonNull(b.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        try {
            Object uninterruptibly = getUninterruptibly(listenableFuture);
            if (!zIsCancelled) {
                return uninterruptibly == null ? NULL : uninterruptibly;
            }
            StringBuilder sb = new StringBuilder("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
            sb.append(listenableFuture);
            return new b(false, new IllegalArgumentException(sb.toString()));
        } catch (Error e2) {
            e = e2;
            return new TuitionPaymentFragmentspecialinlinedviewModeldefault3(e);
        } catch (CancellationException e3) {
            if (!zIsCancelled) {
                return new TuitionPaymentFragmentspecialinlinedviewModeldefault3(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(listenableFuture)), e3));
            }
            return new b(false, e3);
        } catch (ExecutionException e4) {
            if (zIsCancelled) {
                return new b(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(listenableFuture)), e4));
            }
            return new TuitionPaymentFragmentspecialinlinedviewModeldefault3(e4.getCause());
        } catch (Exception e5) {
            e = e5;
            return new TuitionPaymentFragmentspecialinlinedviewModeldefault3(e);
        }
    }

    private static <V> V getUninterruptibly(Future<V> future) throws ExecutionException {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    /* JADX INFO: Access modifiers changed from: private */
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
    public static void complete(withValue<?> withvalue, boolean z) {
        TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = null;
        while (true) {
            withvalue.releaseWaiters();
            if (z) {
                withvalue.interruptTask();
                z = false;
            }
            withvalue.afterDone();
            TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1ClearListeners = withvalue.clearListeners(tuitionPaymentFragmentbindingInflater1);
            while (tuitionPaymentFragmentbindingInflater1ClearListeners != null) {
                tuitionPaymentFragmentbindingInflater1 = tuitionPaymentFragmentbindingInflater1ClearListeners.b;
                Runnable runnable = (Runnable) Objects.requireNonNull(tuitionPaymentFragmentbindingInflater1ClearListeners.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                if (runnable instanceof asInterface) {
                    asInterface asinterface = (asInterface) runnable;
                    withvalue = asinterface.b;
                    if (withvalue.value == asinterface) {
                        if (ATOMIC_HELPER.TuitionPaymentFragmentspecialinlinedviewModeldefault2(withvalue, asinterface, getFutureValue(asinterface.TuitionPaymentFragmentspecialinlinedviewModeldefault1))) {
                        }
                    } else {
                        continue;
                    }
                } else {
                    executeListener(runnable, (Executor) Objects.requireNonNull(tuitionPaymentFragmentbindingInflater1ClearListeners.TuitionPaymentFragmentspecialinlinedviewModeldefault2));
                }
                tuitionPaymentFragmentbindingInflater1ClearListeners = tuitionPaymentFragmentbindingInflater1;
            }
            return;
        }
    }

    @Override // defpackage.incrementAll
    public final Throwable tryInternalFastPathGetFailure() {
        if (!(this instanceof d)) {
            return null;
        }
        Object obj = this.value;
        if (obj instanceof TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            return ((TuitionPaymentFragmentspecialinlinedviewModeldefault3) obj).TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }
        return null;
    }

    final void maybePropagateCancellationTo(Future<?> future) {
        if ((future != null) && isCancelled()) {
            future.cancel(wasInterrupted());
        }
    }

    private void releaseWaiters() {
        for (notify notifyVarTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ATOMIC_HELPER.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, notify.b); notifyVarTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null; notifyVarTuitionPaymentFragmentspecialinlinedviewModeldefault2 = notifyVarTuitionPaymentFragmentspecialinlinedviewModeldefault2.next) {
            Thread thread = notifyVarTuitionPaymentFragmentspecialinlinedviewModeldefault2.thread;
            if (thread != null) {
                notifyVarTuitionPaymentFragmentspecialinlinedviewModeldefault2.thread = null;
                LockSupport.unpark(thread);
            }
        }
    }

    private TuitionPaymentFragmentbindingInflater1 clearListeners(TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1) {
        TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater2 = tuitionPaymentFragmentbindingInflater1;
        TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1B = ATOMIC_HELPER.b(this, TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1);
        while (tuitionPaymentFragmentbindingInflater1B != null) {
            TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater3 = tuitionPaymentFragmentbindingInflater1B.b;
            tuitionPaymentFragmentbindingInflater1B.b = tuitionPaymentFragmentbindingInflater2;
            tuitionPaymentFragmentbindingInflater2 = tuitionPaymentFragmentbindingInflater1B;
            tuitionPaymentFragmentbindingInflater1B = tuitionPaymentFragmentbindingInflater3;
        }
        return tuitionPaymentFragmentbindingInflater2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            addDoneString(sb);
        } else {
            addPendingString(sb);
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String pendingToString() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        StringBuilder sb = new StringBuilder("remaining delay=[");
        sb.append(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS));
        sb.append(" ms]");
        return sb.toString();
    }

    private void addPendingString(StringBuilder sb) {
        String string;
        int length = sb.length();
        sb.append("PENDING");
        Object obj = this.value;
        if (obj instanceof asInterface) {
            sb.append(", setFuture=[");
            appendUserObject(sb, ((asInterface) obj).TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            sb.append("]");
        } else {
            try {
                string = pendingToString();
                if (string == null || string.isEmpty()) {
                    string = null;
                }
            } catch (Exception | StackOverflowError e2) {
                StringBuilder sb2 = new StringBuilder("Exception thrown from implementation: ");
                sb2.append(e2.getClass());
                string = sb2.toString();
            }
            if (string != null) {
                sb.append(", info=[");
                sb.append(string);
                sb.append("]");
            }
        }
        if (isDone()) {
            sb.delete(length, sb.length());
            addDoneString(sb);
        }
    }

    private void addDoneString(StringBuilder sb) {
        try {
            Object uninterruptibly = getUninterruptibly(this);
            sb.append("SUCCESS, result=[");
            appendResultObject(sb, uninterruptibly);
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        } catch (Exception e3) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e3.getClass());
            sb.append(" thrown from get()]");
        }
    }

    private void appendResultObject(StringBuilder sb, Object obj) {
        if (obj == null) {
            sb.append("null");
        } else {
            if (obj == this) {
                sb.append("this future");
                return;
            }
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    private void appendUserObject(StringBuilder sb, Object obj) {
        try {
            if (obj == this) {
                sb.append("this future");
            } else {
                sb.append(obj);
            }
        } catch (Exception | StackOverflowError e2) {
            sb.append("Exception thrown from implementation: ");
            sb.append(e2.getClass());
        }
    }

    private static void executeListener(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e2) {
            Logger loggerTuitionPaymentFragmentspecialinlinedviewModeldefault2 = log.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            Level level = Level.SEVERE;
            StringBuilder sb = new StringBuilder("RuntimeException while executing runnable ");
            sb.append(runnable);
            sb.append(" with executor ");
            sb.append(executor);
            loggerTuitionPaymentFragmentspecialinlinedviewModeldefault2.log(level, sb.toString(), (Throwable) e2);
        }
    }

    static abstract class TuitionPaymentFragmentspecialinlinedviewModeldefault2 {
        abstract void TuitionPaymentFragmentbindingInflater1(notify notifyVar, Thread thread);

        abstract boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(withValue<?> withvalue, TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1, TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater2);

        abstract boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(withValue<?> withvalue, notify notifyVar, notify notifyVar2);

        abstract notify TuitionPaymentFragmentspecialinlinedviewModeldefault2(withValue<?> withvalue, notify notifyVar);

        abstract boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(withValue<?> withvalue, Object obj, Object obj2);

        abstract void TuitionPaymentFragmentspecialinlinedviewModeldefault3(notify notifyVar, notify notifyVar2);

        abstract TuitionPaymentFragmentbindingInflater1 b(withValue<?> withvalue, TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1);

        private TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        }

        /* synthetic */ TuitionPaymentFragmentspecialinlinedviewModeldefault2(byte b) {
            this();
        }
    }

    static final class g extends TuitionPaymentFragmentspecialinlinedviewModeldefault2 {
        private static long TuitionPaymentFragmentbindingInflater1;
        private static Unsafe TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private static long TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private static long asInterface;
        private static long b;

        private g() {
            super((byte) 0);
        }

        /* synthetic */ g(byte b2) {
            this();
        }

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (PrivilegedActionException e2) {
                    throw new RuntimeException("Could not initialize intrinsics", e2.getCause());
                }
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() { // from class: withValue.g.5
                    @Override // java.security.PrivilegedExceptionAction
                    public final /* synthetic */ Unsafe run() throws Exception {
                        for (Field field : Unsafe.class.getDeclaredFields()) {
                            field.setAccessible(true);
                            Object obj = field.get(null);
                            if (Unsafe.class.isInstance(obj)) {
                                return (Unsafe) Unsafe.class.cast(obj);
                            }
                        }
                        throw new NoSuchFieldError("the Unsafe");
                    }
                });
            }
            try {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = unsafe.objectFieldOffset(withValue.class.getDeclaredField("waiters"));
                b = unsafe.objectFieldOffset(withValue.class.getDeclaredField("listeners"));
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = unsafe.objectFieldOffset(withValue.class.getDeclaredField("value"));
                asInterface = unsafe.objectFieldOffset(notify.class.getDeclaredField("thread"));
                TuitionPaymentFragmentbindingInflater1 = unsafe.objectFieldOffset(notify.class.getDeclaredField("next"));
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = unsafe;
            } catch (NoSuchFieldException e3) {
                throw new RuntimeException(e3);
            }
        }

        @Override // withValue.TuitionPaymentFragmentspecialinlinedviewModeldefault2
        final void TuitionPaymentFragmentbindingInflater1(notify notifyVar, Thread thread) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault1.putObject(notifyVar, asInterface, thread);
        }

        @Override // withValue.TuitionPaymentFragmentspecialinlinedviewModeldefault2
        final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(notify notifyVar, notify notifyVar2) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault1.putObject(notifyVar, TuitionPaymentFragmentbindingInflater1, notifyVar2);
        }

        @Override // withValue.TuitionPaymentFragmentspecialinlinedviewModeldefault2
        final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(withValue<?> withvalue, notify notifyVar, notify notifyVar2) {
            Unsafe unsafe = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            long j = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            while (!unsafe.compareAndSwapObject(withvalue, j, notifyVar, notifyVar2)) {
                if (unsafe.getObject(withvalue, j) != notifyVar) {
                    return false;
                }
            }
            return true;
        }

        @Override // withValue.TuitionPaymentFragmentspecialinlinedviewModeldefault2
        final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(withValue<?> withvalue, TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1, TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater2) {
            Unsafe unsafe = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            long j = b;
            while (!unsafe.compareAndSwapObject(withvalue, j, tuitionPaymentFragmentbindingInflater1, tuitionPaymentFragmentbindingInflater2)) {
                if (unsafe.getObject(withvalue, j) != tuitionPaymentFragmentbindingInflater1) {
                    return false;
                }
            }
            return true;
        }

        @Override // withValue.TuitionPaymentFragmentspecialinlinedviewModeldefault2
        final TuitionPaymentFragmentbindingInflater1 b(withValue<?> withvalue, TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1) {
            TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater2;
            do {
                tuitionPaymentFragmentbindingInflater2 = withvalue.listeners;
                if (tuitionPaymentFragmentbindingInflater1 == tuitionPaymentFragmentbindingInflater2) {
                    break;
                }
            } while (!TuitionPaymentFragmentspecialinlinedviewModeldefault1(withvalue, tuitionPaymentFragmentbindingInflater2, tuitionPaymentFragmentbindingInflater1));
            return tuitionPaymentFragmentbindingInflater2;
        }

        @Override // withValue.TuitionPaymentFragmentspecialinlinedviewModeldefault2
        final notify TuitionPaymentFragmentspecialinlinedviewModeldefault2(withValue<?> withvalue, notify notifyVar) {
            notify notifyVar2;
            do {
                notifyVar2 = withvalue.waiters;
                if (notifyVar == notifyVar2) {
                    break;
                }
            } while (!TuitionPaymentFragmentspecialinlinedviewModeldefault1(withvalue, notifyVar2, notifyVar));
            return notifyVar2;
        }

        @Override // withValue.TuitionPaymentFragmentspecialinlinedviewModeldefault2
        final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(withValue<?> withvalue, Object obj, Object obj2) {
            Unsafe unsafe = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            long j = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            while (!unsafe.compareAndSwapObject(withvalue, j, obj, obj2)) {
                if (unsafe.getObject(withvalue, j) != obj) {
                    return false;
                }
            }
            return true;
        }
    }

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 extends TuitionPaymentFragmentspecialinlinedviewModeldefault2 {
        private AtomicReferenceFieldUpdater<? super withValue<?>, notify> TuitionPaymentFragmentbindingInflater1;
        private AtomicReferenceFieldUpdater<? super withValue<?>, TuitionPaymentFragmentbindingInflater1> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private AtomicReferenceFieldUpdater<notify, notify> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private AtomicReferenceFieldUpdater<notify, Thread> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private AtomicReferenceFieldUpdater<? super withValue<?>, Object> b;

        TuitionPaymentFragmentspecialinlinedviewModeldefault1(AtomicReferenceFieldUpdater<notify, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<notify, notify> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<? super withValue<?>, notify> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<? super withValue<?>, TuitionPaymentFragmentbindingInflater1> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<? super withValue<?>, Object> atomicReferenceFieldUpdater5) {
            super((byte) 0);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = atomicReferenceFieldUpdater;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = atomicReferenceFieldUpdater2;
            this.TuitionPaymentFragmentbindingInflater1 = atomicReferenceFieldUpdater3;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = atomicReferenceFieldUpdater4;
            this.b = atomicReferenceFieldUpdater5;
        }

        @Override // withValue.TuitionPaymentFragmentspecialinlinedviewModeldefault2
        final void TuitionPaymentFragmentbindingInflater1(notify notifyVar, Thread thread) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.lazySet(notifyVar, thread);
        }

        @Override // withValue.TuitionPaymentFragmentspecialinlinedviewModeldefault2
        final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(notify notifyVar, notify notifyVar2) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.lazySet(notifyVar, notifyVar2);
        }

        @Override // withValue.TuitionPaymentFragmentspecialinlinedviewModeldefault2
        final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(withValue<?> withvalue, notify notifyVar, notify notifyVar2) {
            return AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(this.TuitionPaymentFragmentbindingInflater1, withvalue, notifyVar, notifyVar2);
        }

        @Override // withValue.TuitionPaymentFragmentspecialinlinedviewModeldefault2
        final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(withValue<?> withvalue, TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1, TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater2) {
            return AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, withvalue, tuitionPaymentFragmentbindingInflater1, tuitionPaymentFragmentbindingInflater2);
        }

        @Override // withValue.TuitionPaymentFragmentspecialinlinedviewModeldefault2
        final TuitionPaymentFragmentbindingInflater1 b(withValue<?> withvalue, TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1) {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getAndSet(withvalue, tuitionPaymentFragmentbindingInflater1);
        }

        @Override // withValue.TuitionPaymentFragmentspecialinlinedviewModeldefault2
        final notify TuitionPaymentFragmentspecialinlinedviewModeldefault2(withValue<?> withvalue, notify notifyVar) {
            return this.TuitionPaymentFragmentbindingInflater1.getAndSet(withvalue, notifyVar);
        }

        @Override // withValue.TuitionPaymentFragmentspecialinlinedviewModeldefault2
        final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(withValue<?> withvalue, Object obj, Object obj2) {
            return AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(this.b, withvalue, obj, obj2);
        }
    }

    static final class a extends TuitionPaymentFragmentspecialinlinedviewModeldefault2 {
        private a() {
            super((byte) 0);
        }

        /* synthetic */ a(byte b) {
            this();
        }

        @Override // withValue.TuitionPaymentFragmentspecialinlinedviewModeldefault2
        final void TuitionPaymentFragmentbindingInflater1(notify notifyVar, Thread thread) {
            notifyVar.thread = thread;
        }

        @Override // withValue.TuitionPaymentFragmentspecialinlinedviewModeldefault2
        final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(notify notifyVar, notify notifyVar2) {
            notifyVar.next = notifyVar2;
        }

        @Override // withValue.TuitionPaymentFragmentspecialinlinedviewModeldefault2
        final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(withValue<?> withvalue, notify notifyVar, notify notifyVar2) {
            synchronized (withvalue) {
                if (withvalue.waiters != notifyVar) {
                    return false;
                }
                withvalue.waiters = notifyVar2;
                return true;
            }
        }

        @Override // withValue.TuitionPaymentFragmentspecialinlinedviewModeldefault2
        final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(withValue<?> withvalue, TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1, TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater2) {
            synchronized (withvalue) {
                if (withvalue.listeners != tuitionPaymentFragmentbindingInflater1) {
                    return false;
                }
                withvalue.listeners = tuitionPaymentFragmentbindingInflater2;
                return true;
            }
        }

        @Override // withValue.TuitionPaymentFragmentspecialinlinedviewModeldefault2
        final TuitionPaymentFragmentbindingInflater1 b(withValue<?> withvalue, TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1) {
            TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater2;
            synchronized (withvalue) {
                tuitionPaymentFragmentbindingInflater2 = withvalue.listeners;
                if (tuitionPaymentFragmentbindingInflater2 != tuitionPaymentFragmentbindingInflater1) {
                    withvalue.listeners = tuitionPaymentFragmentbindingInflater1;
                }
            }
            return tuitionPaymentFragmentbindingInflater2;
        }

        @Override // withValue.TuitionPaymentFragmentspecialinlinedviewModeldefault2
        final notify TuitionPaymentFragmentspecialinlinedviewModeldefault2(withValue<?> withvalue, notify notifyVar) {
            notify notifyVar2;
            synchronized (withvalue) {
                notifyVar2 = withvalue.waiters;
                if (notifyVar2 != notifyVar) {
                    withvalue.waiters = notifyVar;
                }
            }
            return notifyVar2;
        }

        @Override // withValue.TuitionPaymentFragmentspecialinlinedviewModeldefault2
        final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(withValue<?> withvalue, Object obj, Object obj2) {
            synchronized (withvalue) {
                if (withvalue.value != obj) {
                    return false;
                }
                withvalue.value = obj2;
                return true;
            }
        }
    }

    private static CancellationException cancellationExceptionWithCause(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }
}
