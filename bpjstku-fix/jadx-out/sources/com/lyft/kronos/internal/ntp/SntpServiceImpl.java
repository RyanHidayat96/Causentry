package com.lyft.kronos.internal.ntp;

import defpackage.DualSurfaceProcessorExternalSyntheticLambda1;
import defpackage.DualSurfaceProcessorNode;
import defpackage.lambdainitGlRenderer5androidxcameracoreprocessingconcurrentDualSurfaceProcessor;
import defpackage.lambdaonOutputSurface2androidxcameracoreprocessingconcurrentDualSurfaceProcessor;
import defpackage.lambdarelease4androidxcameracoreprocessingconcurrentDualSurfaceProcessor;
import defpackage.lambdasendSurfaceOutputs0androidxcameracoreprocessingconcurrentDualSurfaceProcessorNode;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u00015Ba\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\r\u0012\b\b\u0002\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u0018\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0018\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001c\u0010\u0019R\u0014\u0010\u0018\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001c\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001fR\u0014\u0010!\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010 R\u0018\u0010\u0015\u001a\u0006*\u00020\"0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001dR\u0014\u0010#\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u001dR\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010(R\u0016\u0010)\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010'\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u001dR\u0014\u0010+\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00100\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001e\u00104\u001a\f\u0012\b\u0012\u0006*\u00020202018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u00103"}, d2 = {"Lcom/lyft/kronos/internal/ntp/SntpServiceImpl;", "LlambdasendSurfaceOutputs0androidxcameracoreprocessingconcurrentDualSurfaceProcessorNode;", "Lcom/lyft/kronos/internal/ntp/SntpClient;", "p0", "LlambdainitGlRenderer5androidxcameracoreprocessingconcurrentDualSurfaceProcessor;", "p1", "LDualSurfaceProcessorNode;", "p2", "LlambdaonOutputSurface2androidxcameracoreprocessingconcurrentDualSurfaceProcessor;", "p3", "", "", "p4", "", "p5", "p6", "p7", "p8", "<init>", "(Lcom/lyft/kronos/internal/ntp/SntpClient;LlambdainitGlRenderer5androidxcameracoreprocessingconcurrentDualSurfaceProcessor;LDualSurfaceProcessorNode;LlambdaonOutputSurface2androidxcameracoreprocessingconcurrentDualSurfaceProcessor;Ljava/util/List;JJJJ)V", "LDualSurfaceProcessorExternalSyntheticLambda1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "()LDualSurfaceProcessorExternalSyntheticLambda1;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()V", "", "(Ljava/lang/String;)Z", "b", "J", "Ljava/util/concurrent/atomic/AtomicLong;", "Ljava/util/concurrent/atomic/AtomicLong;", "LlambdainitGlRenderer5androidxcameracoreprocessingconcurrentDualSurfaceProcessor;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Ljava/util/concurrent/ExecutorService;", "g", "Ljava/util/concurrent/ExecutorService;", "asBinder", "TuitionPaymentFragmentbindingInflater1", "asInterface", "Ljava/util/List;", "d", "LlambdaonOutputSurface2androidxcameracoreprocessingconcurrentDualSurfaceProcessor;", "a", "INotificationSideChannel", "LDualSurfaceProcessorNode;", "cancel", "Lcom/lyft/kronos/internal/ntp/SntpClient;", "cancelAll", "Ljava/util/concurrent/atomic/AtomicReference;", "Lcom/lyft/kronos/internal/ntp/SntpServiceImpl$State;", "Ljava/util/concurrent/atomic/AtomicReference;", "notify", "State"}, k = 1, mv = {1, 4, 0})
public final class SntpServiceImpl implements lambdasendSurfaceOutputs0androidxcameracoreprocessingconcurrentDualSurfaceProcessorNode {

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
    private final DualSurfaceProcessorNode a;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    final AtomicReference<State> notify;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final AtomicLong b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    final List<String> asBinder;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final lambdainitGlRenderer5androidxcameracoreprocessingconcurrentDualSurfaceProcessor TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long asInterface;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private final long TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final long g;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final long TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    private final SntpClient cancelAll;
    private final lambdaonOutputSurface2androidxcameracoreprocessingconcurrentDualSurfaceProcessor d;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final ExecutorService TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/lyft/kronos/internal/ntp/SntpServiceImpl$State;", "", "<init>", "(Ljava/lang/String;I)V", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentspecialinlinedviewModeldefault3"}, k = 1, mv = {1, 4, 0})
    enum State {
        IDLE,
        SYNCING,
        STOPPED
    }

    public SntpServiceImpl(SntpClient sntpClient, lambdainitGlRenderer5androidxcameracoreprocessingconcurrentDualSurfaceProcessor lambdainitglrenderer5androidxcameracoreprocessingconcurrentdualsurfaceprocessor, DualSurfaceProcessorNode dualSurfaceProcessorNode, lambdaonOutputSurface2androidxcameracoreprocessingconcurrentDualSurfaceProcessor lambdaonoutputsurface2androidxcameracoreprocessingconcurrentdualsurfaceprocessor, List<String> list, long j, long j2, long j3, long j4) {
        Intrinsics.checkNotNullParameter(sntpClient, "");
        Intrinsics.checkNotNullParameter(lambdainitglrenderer5androidxcameracoreprocessingconcurrentdualsurfaceprocessor, "");
        Intrinsics.checkNotNullParameter(dualSurfaceProcessorNode, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.cancelAll = sntpClient;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = lambdainitglrenderer5androidxcameracoreprocessingconcurrentdualsurfaceprocessor;
        this.a = dualSurfaceProcessorNode;
        this.d = lambdaonoutputsurface2androidxcameracoreprocessingconcurrentdualsurfaceprocessor;
        this.asBinder = list;
        this.asInterface = j;
        this.g = j2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = j3;
        this.TuitionPaymentFragmentbindingInflater1 = j4;
        this.notify = new AtomicReference<>(State.IDLE);
        this.b = new AtomicLong(0L);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: com.lyft.kronos.internal.ntp.SntpServiceImpl.2
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return new Thread(runnable, "kronos-android");
            }
        });
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SntpServiceImpl(SntpClient sntpClient, lambdainitGlRenderer5androidxcameracoreprocessingconcurrentDualSurfaceProcessor lambdainitglrenderer5androidxcameracoreprocessingconcurrentdualsurfaceprocessor, DualSurfaceProcessorNode dualSurfaceProcessorNode, lambdaonOutputSurface2androidxcameracoreprocessingconcurrentDualSurfaceProcessor lambdaonoutputsurface2androidxcameracoreprocessingconcurrentdualsurfaceprocessor, List list, long j, long j2, long j3, long j4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        long jTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        long jB;
        long jTuitionPaymentFragmentbindingInflater1;
        long jTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if ((i & 32) != 0) {
            lambdarelease4androidxcameracoreprocessingconcurrentDualSurfaceProcessor lambdarelease4androidxcameracoreprocessingconcurrentdualsurfaceprocessor = lambdarelease4androidxcameracoreprocessingconcurrentDualSurfaceProcessor.INSTANCE;
            jTuitionPaymentFragmentspecialinlinedviewModeldefault2 = lambdarelease4androidxcameracoreprocessingconcurrentDualSurfaceProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        } else {
            jTuitionPaymentFragmentspecialinlinedviewModeldefault2 = j;
        }
        if ((i & 64) != 0) {
            lambdarelease4androidxcameracoreprocessingconcurrentDualSurfaceProcessor lambdarelease4androidxcameracoreprocessingconcurrentdualsurfaceprocessor2 = lambdarelease4androidxcameracoreprocessingconcurrentDualSurfaceProcessor.INSTANCE;
            jB = lambdarelease4androidxcameracoreprocessingconcurrentDualSurfaceProcessor.b();
        } else {
            jB = j2;
        }
        if ((i & 128) != 0) {
            lambdarelease4androidxcameracoreprocessingconcurrentDualSurfaceProcessor lambdarelease4androidxcameracoreprocessingconcurrentdualsurfaceprocessor3 = lambdarelease4androidxcameracoreprocessingconcurrentDualSurfaceProcessor.INSTANCE;
            jTuitionPaymentFragmentbindingInflater1 = lambdarelease4androidxcameracoreprocessingconcurrentDualSurfaceProcessor.TuitionPaymentFragmentbindingInflater1();
        } else {
            jTuitionPaymentFragmentbindingInflater1 = j3;
        }
        if ((i & 256) != 0) {
            lambdarelease4androidxcameracoreprocessingconcurrentDualSurfaceProcessor lambdarelease4androidxcameracoreprocessingconcurrentdualsurfaceprocessor4 = lambdarelease4androidxcameracoreprocessingconcurrentDualSurfaceProcessor.INSTANCE;
            jTuitionPaymentFragmentspecialinlinedviewModeldefault3 = lambdarelease4androidxcameracoreprocessingconcurrentDualSurfaceProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        } else {
            jTuitionPaymentFragmentspecialinlinedviewModeldefault3 = j4;
        }
        this(sntpClient, lambdainitglrenderer5androidxcameracoreprocessingconcurrentdualsurfaceprocessor, dualSurfaceProcessorNode, lambdaonoutputsurface2androidxcameracoreprocessingconcurrentdualsurfaceprocessor, list, jTuitionPaymentFragmentspecialinlinedviewModeldefault2, jB, jTuitionPaymentFragmentbindingInflater1, jTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(String p0) {
        if (this.notify.getAndSet(State.SYNCING) == State.SYNCING) {
            return false;
        }
        long jTuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        lambdaonOutputSurface2androidxcameracoreprocessingconcurrentDualSurfaceProcessor lambdaonoutputsurface2androidxcameracoreprocessingconcurrentdualsurfaceprocessor = this.d;
        if (lambdaonoutputsurface2androidxcameracoreprocessingconcurrentdualsurfaceprocessor != null) {
            lambdaonoutputsurface2androidxcameracoreprocessingconcurrentdualsurfaceprocessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2(p0);
        }
        try {
            SntpClient.TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentbindingInflater1 = this.cancelAll.TuitionPaymentFragmentbindingInflater1(p0, Long.valueOf(this.asInterface));
            Intrinsics.checkNotNullExpressionValue(TuitionPaymentFragmentbindingInflater1, "");
            if (TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1 + (TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2() - TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) < 0) {
                StringBuilder sb = new StringBuilder("Invalid time ");
                sb.append(TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1 + (TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2() - TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
                sb.append(" received from ");
                sb.append(p0);
                throw new NTPSyncException(sb.toString());
            }
            long jTuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2() - jTuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (jTuitionPaymentFragmentspecialinlinedviewModeldefault3 > this.TuitionPaymentFragmentbindingInflater1) {
                StringBuilder sb2 = new StringBuilder("Ignoring response from ");
                sb2.append(p0);
                sb2.append(" because the network latency (");
                sb2.append(jTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                sb2.append(" ms) is longer than the required value (");
                sb2.append(this.TuitionPaymentFragmentbindingInflater1);
                sb2.append(" ms");
                throw new NTPSyncException(sb2.toString());
            }
            this.a.TuitionPaymentFragmentbindingInflater1(TuitionPaymentFragmentbindingInflater1);
            long j = TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1;
            this.notify.set(State.IDLE);
            this.b.set(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
            return true;
        } catch (Throwable th) {
            try {
                lambdaonOutputSurface2androidxcameracoreprocessingconcurrentDualSurfaceProcessor lambdaonoutputsurface2androidxcameracoreprocessingconcurrentdualsurfaceprocessor2 = this.d;
                if (lambdaonoutputsurface2androidxcameracoreprocessingconcurrentdualsurfaceprocessor2 != null) {
                    lambdaonoutputsurface2androidxcameracoreprocessingconcurrentdualsurfaceprocessor2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, th);
                }
                return false;
            } finally {
                this.notify.set(State.IDLE);
                this.b.set(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
            }
        }
    }

    @Override // defpackage.lambdasendSurfaceOutputs0androidxcameracoreprocessingconcurrentDualSurfaceProcessorNode
    public final DualSurfaceProcessorExternalSyntheticLambda1 TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        if (this.notify.get() == State.STOPPED) {
            throw new IllegalStateException("Service already shutdown");
        }
        SntpClient.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1B = this.a.b();
        if (this.notify.get() == State.IDLE && tuitionPaymentFragmentbindingInflater1B != null) {
            if (Math.abs((tuitionPaymentFragmentbindingInflater1B.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - tuitionPaymentFragmentbindingInflater1B.TuitionPaymentFragmentspecialinlinedviewModeldefault1) - (tuitionPaymentFragmentbindingInflater1B.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b() - tuitionPaymentFragmentbindingInflater1B.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2())) >= 1000) {
                this.a.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                tuitionPaymentFragmentbindingInflater1B = null;
            }
        }
        if (tuitionPaymentFragmentbindingInflater1B == null) {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2() - this.b.get() >= this.g) {
                b();
            }
            return null;
        }
        long jTuitionPaymentFragmentspecialinlinedviewModeldefault2 = tuitionPaymentFragmentbindingInflater1B.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2() - tuitionPaymentFragmentbindingInflater1B.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (jTuitionPaymentFragmentspecialinlinedviewModeldefault2 >= this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 && this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2() - this.b.get() >= this.g) {
            b();
        }
        return new DualSurfaceProcessorExternalSyntheticLambda1(tuitionPaymentFragmentbindingInflater1B.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + tuitionPaymentFragmentbindingInflater1B.TuitionPaymentFragmentbindingInflater1 + (tuitionPaymentFragmentbindingInflater1B.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2() - tuitionPaymentFragmentbindingInflater1B.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(jTuitionPaymentFragmentspecialinlinedviewModeldefault2));
    }

    @Override // defpackage.lambdasendSurfaceOutputs0androidxcameracoreprocessingconcurrentDualSurfaceProcessorNode
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        if (this.notify.get() != State.STOPPED) {
            this.notify.set(State.STOPPED);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.shutdown();
            return;
        }
        throw new IllegalStateException("Service already shutdown");
    }

    @Override // defpackage.lambdasendSurfaceOutputs0androidxcameracoreprocessingconcurrentDualSurfaceProcessorNode
    public final void b() {
        if (this.notify.get() != State.STOPPED) {
            if (this.notify.get() != State.SYNCING) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.submit(new Runnable() { // from class: com.lyft.kronos.internal.ntp.SntpServiceImpl.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        SntpServiceImpl sntpServiceImpl = SntpServiceImpl.this;
                        if (sntpServiceImpl.notify.get() != State.STOPPED) {
                            Iterator<String> it = sntpServiceImpl.asBinder.iterator();
                            while (it.hasNext() && !sntpServiceImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault3(it.next())) {
                            }
                            return;
                        }
                        throw new IllegalStateException("Service already shutdown");
                    }
                });
                return;
            }
            return;
        }
        throw new IllegalStateException("Service already shutdown");
    }
}
