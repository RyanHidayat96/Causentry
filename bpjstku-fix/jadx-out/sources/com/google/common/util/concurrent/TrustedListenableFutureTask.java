package com.google.common.util.concurrent;

import android.graphics.Color;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import defpackage.initSession;
import defpackage.removeObserver;
import java.lang.reflect.Field;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes4.dex */
public class TrustedListenableFutureTask<V> extends removeObserver.TuitionPaymentFragmentbindingInflater1<V> implements RunnableFuture<V> {
    private volatile InterruptibleTask<?> TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    public static <V> TrustedListenableFutureTask<V> TuitionPaymentFragmentspecialinlinedviewModeldefault3(Callable<V> callable) {
        return new TrustedListenableFutureTask<>(callable);
    }

    public static <V> TrustedListenableFutureTask<V> TuitionPaymentFragmentspecialinlinedviewModeldefault2(Runnable runnable, V v) {
        return new TrustedListenableFutureTask<>(Executors.callable(runnable, v));
    }

    private TrustedListenableFutureTask(Callable<V> callable) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new TrustedFutureInterruptibleTask(callable);
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public void run() throws IllegalAccessException {
        InterruptibleTask<?> interruptibleTask = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (interruptibleTask != null) {
            interruptibleTask.run();
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1096626159);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 46399), View.MeasureSpec.getMode(0) + 40, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 19, 1513912262, false, "b", null);
        }
        int i = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-914723831);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 37836), (-16777157) - Color.rgb(0, 0, 0), Color.alpha(0) + 18, 769969118, false, "TuitionPaymentFragmentbindingInflater1", null);
        }
        int i2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(null);
        long j = i2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-639884696);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 37836), TextUtils.getTrimmedLength("") + 59, 18 - (ViewConfiguration.getJumpTapTimeout() >> 16), 1027769791, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
        }
        int i3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).getInt(null);
        long j2 = -1;
        long j3 = j2 ^ 4068922814332829416L;
        long jIdentityHashCode = (((long) System.identityHashCode(this)) | 4068922814332829416L) ^ j2;
        long j4 = (((long) (-391)) * 1450330682826956823L) + (((long) (-195)) * 4068922814332829416L) + (((long) (-196)) * (((j3 | 1450330682826956823L) ^ j2) | jIdentityHashCode)) + (((long) 392) * 4357161995704368895L) + (((long) 196) * ((j2 ^ ((1450330682826956823L ^ j2) | j3)) | jIdentityHashCode));
        int i4 = 0;
        while (true) {
            for (int i5 = 0; i5 != 8; i5++) {
                i3 = (((((int) (j >> i5)) & 255) + (i3 << 6)) + (i3 << 16)) - i3;
            }
            if (i4 != 0) {
                break;
            }
            i4++;
            j = j4;
        }
        if (i3 != i) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551937752);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46400 - Gravity.getAbsoluteGravity(0, 0)), 40 - KeyEvent.getDeadChar(0, 0), Color.rgb(0, 0, 0) + 16777235, -1205987569, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault2", null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null);
            throw new RuntimeException(String.valueOf(i2));
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
    }

    final class TrustedFutureInterruptibleTask extends InterruptibleTask<V> {
        private final Callable<V> callable;

        TrustedFutureInterruptibleTask(Callable<V> callable) {
            this.callable = callable;
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        final boolean b() {
            return TrustedListenableFutureTask.this.isDone();
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        final V TuitionPaymentFragmentspecialinlinedviewModeldefault1() throws Exception {
            return this.callable.call();
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        final void b(V v) {
            TrustedListenableFutureTask.this.set(v);
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        final void TuitionPaymentFragmentbindingInflater1(Throwable th) {
            TrustedListenableFutureTask.this.setException(th);
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        final String TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            return this.callable.toString();
        }
    }

    @Override // defpackage.withValue
    public void afterDone() {
        InterruptibleTask<?> interruptibleTask;
        super.afterDone();
        if (wasInterrupted() && (interruptibleTask = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) != null) {
            Runnable runnable = interruptibleTask.get();
            if (runnable instanceof Thread) {
                InterruptibleTask.Blocker blocker = new InterruptibleTask.Blocker(interruptibleTask, (byte) 0);
                super/*java.util.concurrent.locks.AbstractOwnableSynchronizer*/.setExclusiveOwnerThread(Thread.currentThread());
                if (interruptibleTask.compareAndSet(runnable, blocker)) {
                    try {
                        ((Thread) runnable).interrupt();
                        if (interruptibleTask.getAndSet(InterruptibleTask.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == InterruptibleTask.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                            LockSupport.unpark((Thread) runnable);
                        }
                    } catch (Throwable th) {
                        if (interruptibleTask.getAndSet(InterruptibleTask.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == InterruptibleTask.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                            LockSupport.unpark((Thread) runnable);
                        }
                        throw th;
                    }
                }
            }
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
    }

    @Override // defpackage.withValue
    public String pendingToString() {
        InterruptibleTask<?> interruptibleTask = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (interruptibleTask != null) {
            StringBuilder sb = new StringBuilder("task=[");
            sb.append(interruptibleTask);
            sb.append("]");
            return sb.toString();
        }
        return super.pendingToString();
    }
}
