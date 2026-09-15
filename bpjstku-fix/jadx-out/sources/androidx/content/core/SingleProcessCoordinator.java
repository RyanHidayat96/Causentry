package androidx.content.core;

import androidx.exifinterface.media.ExifInterface;
import defpackage.VideoEncoderConfig;
import defpackage.clampVideoBitrateIfNotSupported;
import defpackage.hasEndOfStreamFlag;
import defpackage.toIllegalArgumentException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\bJ4\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\n2\u001c\u0010\u0003\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000bH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ:\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\n2\"\u0010\u0003\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0010H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010!"}, d2 = {"Landroidx/datastore/core/SingleProcessCoordinator;", "Landroidx/datastore/core/InterProcessCoordinator;", "", "p0", "<init>", "(Ljava/lang/String;)V", "", "getVersion", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "incrementAndGetVersion", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "lock", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function2;", "", "tryLock", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "filePath", "Ljava/lang/String;", "LVideoEncoderConfig;", "mutex", "LVideoEncoderConfig;", "LclampVideoBitrateIfNotSupported;", "", "updateNotifications", "LclampVideoBitrateIfNotSupported;", "getUpdateNotifications", "()LclampVideoBitrateIfNotSupported;", "Landroidx/datastore/core/AtomicInt;", "version", "Landroidx/datastore/core/AtomicInt;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SingleProcessCoordinator implements InterProcessCoordinator {
    private final String filePath;
    private final VideoEncoderConfig mutex;
    private final clampVideoBitrateIfNotSupported<Unit> updateNotifications;
    private final AtomicInt version;

    /* JADX INFO: renamed from: androidx.datastore.core.SingleProcessCoordinator$lock$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.datastore.core.SingleProcessCoordinator", f = "SingleProcessCoordinator.kt", i = {0, 0, 1}, l = {66, 41}, m = "lock", n = {"block", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0"})
    static final class AnonymousClass1<T> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SingleProcessCoordinator.this.lock(null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.SingleProcessCoordinator$tryLock$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.datastore.core.SingleProcessCoordinator", f = "SingleProcessCoordinator.kt", i = {0, 0}, l = {50}, m = "tryLock", n = {"$this$withTryLock_u24default$iv", "locked$iv"}, s = {"L$0", "Z$0"})
    static final class C06351<T> extends ContinuationImpl {
        Object L$0;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        C06351(Continuation<? super C06351> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SingleProcessCoordinator.this.tryLock(null, this);
        }
    }

    public SingleProcessCoordinator(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.filePath = str;
        this.mutex = toIllegalArgumentException.b(false);
        this.version = new AtomicInt(0);
        this.updateNotifications = hasEndOfStreamFlag.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new SingleProcessCoordinator$updateNotifications$1(null));
    }

    @Override // androidx.content.core.InterProcessCoordinator
    public final clampVideoBitrateIfNotSupported<Unit> getUpdateNotifications() {
        return this.updateNotifications;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0065, code lost:
    
        if (r8 == r1) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r7v1, types: [VideoEncoderConfig] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v4, types: [VideoEncoderConfig] */
    @Override // androidx.content.core.InterProcessCoordinator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> java.lang.Object lock(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r7, kotlin.coroutines.Continuation<? super T> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof androidx.content.core.SingleProcessCoordinator.AnonymousClass1
            if (r0 == 0) goto L14
            r0 = r8
            androidx.datastore.core.SingleProcessCoordinator$lock$1 r0 = (androidx.content.core.SingleProcessCoordinator.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r8 = r0.label
            int r8 = r8 + r2
            r0.label = r8
            goto L19
        L14:
            androidx.datastore.core.SingleProcessCoordinator$lock$1 r0 = new androidx.datastore.core.SingleProcessCoordinator$lock$1
            r0.<init>(r8)
        L19:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L48
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r7 = r0.L$0
            VideoEncoderConfig r7 = (defpackage.VideoEncoderConfig) r7
            kotlin.ResultKt.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L32
            goto L68
        L32:
            r8 = move-exception
            goto L6c
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            java.lang.Object r7 = r0.L$1
            VideoEncoderConfig r7 = (defpackage.VideoEncoderConfig) r7
            java.lang.Object r2 = r0.L$0
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            kotlin.ResultKt.throwOnFailure(r8)
            goto L5b
        L48:
            kotlin.ResultKt.throwOnFailure(r8)
            VideoEncoderConfig r8 = r6.mutex
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r4
            java.lang.Object r2 = r8.lock(r5, r0)
            if (r2 == r1) goto L70
            r2 = r7
            r7 = r8
        L5b:
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L32
            r0.L$1 = r5     // Catch: java.lang.Throwable -> L32
            r0.label = r3     // Catch: java.lang.Throwable -> L32
            java.lang.Object r8 = r2.invoke(r0)     // Catch: java.lang.Throwable -> L32
            if (r8 != r1) goto L68
            goto L70
        L68:
            r7.unlock(r5)
            return r8
        L6c:
            r7.unlock(r5)
            throw r8
        L70:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.content.core.SingleProcessCoordinator.lock(kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005a  */
    /* JADX WARN: Code duplicated, block: B:29:0x0064  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // androidx.content.core.InterProcessCoordinator
    public final <T> Object tryLock(Function2<? super Boolean, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) throws Throwable {
        C06351 c06351;
        VideoEncoderConfig videoEncoderConfig;
        Throwable th;
        boolean z;
        if (continuation instanceof C06351) {
            c06351 = (C06351) continuation;
            if ((c06351.label & Integer.MIN_VALUE) != 0) {
                c06351.label -= Integer.MIN_VALUE;
            } else {
                c06351 = new C06351(continuation);
            }
        } else {
            c06351 = new C06351(continuation);
        }
        Object obj = c06351.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c06351.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = c06351.Z$0;
            videoEncoderConfig = (VideoEncoderConfig) c06351.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                if (z) {
                    videoEncoderConfig.unlock(null);
                }
                return obj;
            } catch (Throwable th2) {
                th = th2;
                if (z) {
                    videoEncoderConfig.unlock(null);
                }
                throw th;
            }
        }
        ResultKt.throwOnFailure(obj);
        VideoEncoderConfig videoEncoderConfig2 = this.mutex;
        boolean zTryLock = videoEncoderConfig2.tryLock(null);
        try {
            Boolean boolBoxBoolean = Boxing.boxBoolean(zTryLock);
            c06351.L$0 = videoEncoderConfig2;
            c06351.Z$0 = zTryLock;
            c06351.label = 1;
            Object objInvoke = function2.invoke(boolBoxBoolean, c06351);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
            videoEncoderConfig = videoEncoderConfig2;
            obj = objInvoke;
            z = zTryLock;
            if (z) {
                videoEncoderConfig.unlock(null);
            }
            return obj;
        } catch (Throwable th3) {
            videoEncoderConfig = videoEncoderConfig2;
            th = th3;
            z = zTryLock;
            if (z) {
                videoEncoderConfig.unlock(null);
            }
            throw th;
        }
    }

    @Override // androidx.content.core.InterProcessCoordinator
    public final Object getVersion(Continuation<? super Integer> continuation) {
        return Boxing.boxInt(this.version.get());
    }

    @Override // androidx.content.core.InterProcessCoordinator
    public final Object incrementAndGetVersion(Continuation<? super Integer> continuation) {
        return Boxing.boxInt(this.version.incrementAndGet());
    }
}
