package androidx.content.core.okio;

import androidx.content.core.Closeable;
import androidx.content.core.InterProcessCoordinator;
import androidx.content.core.ReadScope;
import androidx.content.core.StorageConnection;
import androidx.content.core.WriteScope;
import androidx.exifinterface.media.ExifInterface;
import defpackage.RotationProviderListenerWrapper;
import defpackage.SurfaceViewImplementationExternalSyntheticLambda1;
import defpackage.VideoEncoderConfig;
import defpackage.animateToFullOpacity;
import defpackage.surfaceChanged;
import defpackage.surfaceDestroyed;
import defpackage.toIllegalArgumentException;
import java.io.IOException;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import okio.ByteString;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011JP\u0010\u001b\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u001328\u0010\u0004\u001a4\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0015\u0012\t\u0012\u00070\u0016¢\u0006\u0002\b\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0014¢\u0006\u0002\b\u001aH\u0096@¢\u0006\u0004\b\u001b\u0010\u001cJ?\u0010\u001f\u001a\u00020\f2-\u0010\u0004\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u001d¢\u0006\u0002\b\u001aH\u0096@¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020\t8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b1\u00102"}, d2 = {"Landroidx/datastore/core/okio/OkioStorageConnection;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/datastore/core/StorageConnection;", "LanimateToFullOpacity;", "p0", "LSurfaceViewImplementationExternalSyntheticLambda1;", "p1", "Landroidx/datastore/core/okio/OkioSerializer;", "p2", "Landroidx/datastore/core/InterProcessCoordinator;", "p3", "Lkotlin/Function0;", "", "p4", "<init>", "(LanimateToFullOpacity;LSurfaceViewImplementationExternalSyntheticLambda1;Landroidx/datastore/core/okio/OkioSerializer;Landroidx/datastore/core/InterProcessCoordinator;Lkotlin/jvm/functions/Function0;)V", "checkNotClosed", "()V", "close", "R", "Lkotlin/Function3;", "Landroidx/datastore/core/ReadScope;", "", "Lkotlin/ParameterName;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "readScope", "(Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function2;", "Landroidx/datastore/core/WriteScope;", "writeScope", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/datastore/core/okio/AtomicBoolean;", "closed", "Landroidx/datastore/core/okio/AtomicBoolean;", "coordinator", "Landroidx/datastore/core/InterProcessCoordinator;", "getCoordinator", "()Landroidx/datastore/core/InterProcessCoordinator;", "fileSystem", "LanimateToFullOpacity;", "onClose", "Lkotlin/jvm/functions/Function0;", "path", "LSurfaceViewImplementationExternalSyntheticLambda1;", "serializer", "Landroidx/datastore/core/okio/OkioSerializer;", "LVideoEncoderConfig;", "transactionMutex", "LVideoEncoderConfig;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class OkioStorageConnection<T> implements StorageConnection<T> {
    private final AtomicBoolean closed;
    private final InterProcessCoordinator coordinator;
    private final animateToFullOpacity fileSystem;
    private final Function0<Unit> onClose;
    private final SurfaceViewImplementationExternalSyntheticLambda1 path;
    private final OkioSerializer<T> serializer;
    private final VideoEncoderConfig transactionMutex;

    /* JADX INFO: renamed from: androidx.datastore.core.okio.OkioStorageConnection$readScope$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.datastore.core.okio.OkioStorageConnection", f = "OkioStorage.kt", i = {0, 0, 0}, l = {113}, m = "readScope", n = {"this", "$this$use$iv", "lock"}, s = {"L$0", "L$1", "Z$0"})
    static final class AnonymousClass1<R> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ OkioStorageConnection<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(OkioStorageConnection<T> okioStorageConnection, Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
            this.this$0 = okioStorageConnection;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.readScope(null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.okio.OkioStorageConnection$writeScope$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.datastore.core.okio.OkioStorageConnection", f = "OkioStorage.kt", i = {0, 0, 0, 0, 1, 1, 1, 1}, l = {236, 137}, m = "writeScope", n = {"this", "block", "parentDir", "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv", "scratchPath", "$this$use$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
    static final class C06371 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ OkioStorageConnection<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06371(OkioStorageConnection<T> okioStorageConnection, Continuation<? super C06371> continuation) {
            super(continuation);
            this.this$0 = okioStorageConnection;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.writeScope(null, this);
        }
    }

    public OkioStorageConnection(animateToFullOpacity animatetofullopacity, SurfaceViewImplementationExternalSyntheticLambda1 surfaceViewImplementationExternalSyntheticLambda1, OkioSerializer<T> okioSerializer, InterProcessCoordinator interProcessCoordinator, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(animatetofullopacity, "");
        Intrinsics.checkNotNullParameter(surfaceViewImplementationExternalSyntheticLambda1, "");
        Intrinsics.checkNotNullParameter(okioSerializer, "");
        Intrinsics.checkNotNullParameter(interProcessCoordinator, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.fileSystem = animatetofullopacity;
        this.path = surfaceViewImplementationExternalSyntheticLambda1;
        this.serializer = okioSerializer;
        this.coordinator = interProcessCoordinator;
        this.onClose = function0;
        this.closed = new AtomicBoolean(false);
        this.transactionMutex = toIllegalArgumentException.b(false);
    }

    @Override // androidx.content.core.StorageConnection
    public final InterProcessCoordinator getCoordinator() {
        return this.coordinator;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x007a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x007c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0082 A[Catch: all -> 0x0083, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0083, blocks: (B:31:0x0082, B:40:0x0093, B:39:0x0090, B:36:0x008b), top: B:47:0x0022, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [androidx.datastore.core.okio.OkioStorageConnection] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.datastore.core.okio.OkioStorageConnection$readScope$1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.datastore.core.okio.OkioStorageConnection] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [androidx.datastore.core.okio.OkioStorageConnection] */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r9v14, types: [boolean] */
    @Override // androidx.content.core.StorageConnection
    public final <R> Object readScope(Function3<? super ReadScope<T>, ? super Boolean, ? super Continuation<? super R>, ? extends Object> function3, Continuation<? super R> continuation) throws Throwable {
        ?? anonymousClass1;
        ?? r10;
        Throwable th;
        ?? r0;
        Closeable closeable;
        Throwable th2;
        ?? r1;
        if (continuation instanceof AnonymousClass1) {
            AnonymousClass1 anonymousClass2 = (AnonymousClass1) continuation;
            if ((anonymousClass2.label & Integer.MIN_VALUE) != 0) {
                anonymousClass2.label -= Integer.MIN_VALUE;
                anonymousClass1 = anonymousClass2;
            } else {
                anonymousClass1 = new AnonymousClass1(this, continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(this, continuation);
        }
        Object obj = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function3 = (Function3<? super ReadScope<T>, ? super Boolean, ? super Continuation<? super R>, ? extends Object>) anonymousClass1.Z$0;
                closeable = (Closeable) anonymousClass1.L$1;
                anonymousClass1 = (OkioStorageConnection) anonymousClass1.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    r1 = anonymousClass1;
                    try {
                        closeable.close();
                        th = null;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                    if (th == null) {
                        throw th;
                    }
                    if (function3 != null) {
                        r1.transactionMutex.unlock(null);
                    }
                    return obj;
                } catch (Throwable th4) {
                    th2 = th4;
                    try {
                        closeable.close();
                    } catch (Throwable th5) {
                        ExceptionsKt.addSuppressed(th2, th5);
                    }
                    throw th2;
                }
            }
            ResultKt.throwOnFailure(obj);
            checkNotClosed();
            boolean zTryLock = this.transactionMutex.tryLock(null);
            try {
                OkioReadScope okioReadScope = new OkioReadScope(this.fileSystem, this.path, this.serializer);
                try {
                    Boolean boolBoxBoolean = Boxing.boxBoolean(zTryLock);
                    anonymousClass1.L$0 = this;
                    anonymousClass1.L$1 = okioReadScope;
                    anonymousClass1.Z$0 = zTryLock;
                    anonymousClass1.label = 1;
                    Object objInvoke = function3.invoke(okioReadScope, boolBoxBoolean, anonymousClass1);
                    if (objInvoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    r1 = this;
                    closeable = okioReadScope;
                    obj = objInvoke;
                    function3 = zTryLock ? 1 : 0;
                    closeable.close();
                    th = null;
                    if (th == null) {
                        throw th;
                    }
                    if (function3 != null) {
                        r1.transactionMutex.unlock(null);
                    }
                    return obj;
                } catch (Throwable th6) {
                    anonymousClass1 = this;
                    closeable = okioReadScope;
                    th2 = th6;
                    function3 = zTryLock ? 1 : 0;
                    closeable.close();
                    throw th2;
                }
            } catch (Throwable th7) {
                th = th7;
                r0 = this;
                r10 = zTryLock;
                if (r10 != 0) {
                    r0.transactionMutex.unlock(null);
                }
                throw th;
            }
        } catch (Throwable th8) {
            r10 = function3;
            th = th8;
            r0 = anonymousClass1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x010c A[Catch: all -> 0x012d, IOException -> 0x012f, TRY_ENTER, TryCatch #7 {IOException -> 0x012f, blocks: (B:39:0x010c, B:41:0x011d, B:45:0x012c), top: B:85:0x010a }] */
    /* JADX WARN: Code duplicated, block: B:41:0x011d A[Catch: all -> 0x012d, IOException -> 0x012f, TRY_LEAVE, TryCatch #7 {IOException -> 0x012f, blocks: (B:39:0x010c, B:41:0x011d, B:45:0x012c), top: B:85:0x010a }] */
    /* JADX WARN: Code duplicated, block: B:45:0x012c A[Catch: all -> 0x012d, IOException -> 0x012f, TRY_ENTER, TRY_LEAVE, TryCatch #7 {IOException -> 0x012f, blocks: (B:39:0x010c, B:41:0x011d, B:45:0x012c), top: B:85:0x010a }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [animateToFullOpacity, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [animateToFullOpacity] */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [VideoEncoderConfig] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [VideoEncoderConfig] */
    /* JADX WARN: Type inference failed for: r5v7, types: [VideoEncoderConfig] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [SurfaceViewImplementationExternalSyntheticLambda1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7 */
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
    @Override // androidx.content.core.StorageConnection
    public final Object writeScope(Function2<? super WriteScope<T>, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) throws Throwable {
        C06371 c06371;
        ?? r5;
        VideoEncoderConfig videoEncoderConfig;
        Function2<? super WriteScope<T>, ? super Continuation<? super Unit>, ? extends Object> function3;
        SurfaceViewImplementationExternalSyntheticLambda1 surfaceViewImplementationExternalSyntheticLambda1;
        OkioStorageConnection<T> okioStorageConnection;
        SurfaceViewImplementationExternalSyntheticLambda1 surfaceViewImplementationExternalSyntheticLambda1TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        OkioWriteScope okioWriteScope;
        SurfaceViewImplementationExternalSyntheticLambda1 surfaceViewImplementationExternalSyntheticLambda2;
        OkioStorageConnection<T> okioStorageConnection2;
        Closeable closeable;
        Throwable th;
        animateToFullOpacity animatetofullopacity;
        if (continuation instanceof C06371) {
            c06371 = (C06371) continuation;
            if ((c06371.label & Integer.MIN_VALUE) != 0) {
                c06371.label -= Integer.MIN_VALUE;
            } else {
                c06371 = new C06371(this, continuation);
            }
        } else {
            c06371 = new C06371(this, continuation);
        }
        Object obj = c06371.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r4 = c06371.label;
        ?? r6 = 1;
        try {
            try {
                try {
                    if (r4 == 0) {
                        ResultKt.throwOnFailure(obj);
                        checkNotClosed();
                        SurfaceViewImplementationExternalSyntheticLambda1 surfaceViewImplementationExternalSyntheticLambda1TuitionPaymentFragmentbindingInflater1 = this.path.TuitionPaymentFragmentbindingInflater1();
                        if (surfaceViewImplementationExternalSyntheticLambda1TuitionPaymentFragmentbindingInflater1 == null) {
                            throw new IllegalStateException("must have a parent path".toString());
                        }
                        animateToFullOpacity animatetofullopacity2 = this.fileSystem;
                        Intrinsics.checkNotNullParameter(surfaceViewImplementationExternalSyntheticLambda1TuitionPaymentFragmentbindingInflater1, "");
                        surfaceDestroyed.TuitionPaymentFragmentspecialinlinedviewModeldefault1(animatetofullopacity2, surfaceViewImplementationExternalSyntheticLambda1TuitionPaymentFragmentbindingInflater1, false);
                        videoEncoderConfig = this.transactionMutex;
                        c06371.L$0 = this;
                        function3 = function2;
                        c06371.L$1 = function3;
                        c06371.L$2 = surfaceViewImplementationExternalSyntheticLambda1TuitionPaymentFragmentbindingInflater1;
                        c06371.L$3 = videoEncoderConfig;
                        c06371.label = 1;
                        if (videoEncoderConfig.lock(null, c06371) != coroutine_suspended) {
                            surfaceViewImplementationExternalSyntheticLambda1 = surfaceViewImplementationExternalSyntheticLambda1TuitionPaymentFragmentbindingInflater1;
                            okioStorageConnection = this;
                        }
                        return coroutine_suspended;
                    }
                    if (r4 != 1) {
                        if (r4 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        closeable = (Closeable) c06371.L$3;
                        surfaceViewImplementationExternalSyntheticLambda2 = (SurfaceViewImplementationExternalSyntheticLambda1) c06371.L$2;
                        r5 = (VideoEncoderConfig) c06371.L$1;
                        okioStorageConnection2 = (OkioStorageConnection) c06371.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            r5 = r5;
                            Unit unit = Unit.INSTANCE;
                            closeable.close();
                            th = null;
                            try {
                                try {
                                    if (th == null) {
                                        animatetofullopacity = okioStorageConnection2.fileSystem;
                                        Intrinsics.checkNotNullParameter(surfaceViewImplementationExternalSyntheticLambda2, "");
                                        Intrinsics.checkNotNullParameter(animatetofullopacity, "");
                                        Intrinsics.checkNotNullParameter(surfaceViewImplementationExternalSyntheticLambda2, "");
                                        if (animatetofullopacity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(surfaceViewImplementationExternalSyntheticLambda2) != null) {
                                            okioStorageConnection2.fileSystem.TuitionPaymentFragmentspecialinlinedviewModeldefault3(surfaceViewImplementationExternalSyntheticLambda2, okioStorageConnection2.path);
                                        }
                                        Unit unit2 = Unit.INSTANCE;
                                        r5.unlock(null);
                                        return Unit.INSTANCE;
                                    }
                                    throw th;
                                } catch (IOException e2) {
                                    e = e2;
                                    OkioStorageConnection<T> okioStorageConnection3 = okioStorageConnection2;
                                    r6 = surfaceViewImplementationExternalSyntheticLambda2;
                                    ?? r2 = okioStorageConnection3.fileSystem;
                                    Intrinsics.checkNotNullParameter(r6, "");
                                    Intrinsics.checkNotNullParameter(r2, "");
                                    Intrinsics.checkNotNullParameter(r6, "");
                                    if (r2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(r6) != null) {
                                        try {
                                            ?? r3 = okioStorageConnection3.fileSystem;
                                            Intrinsics.checkNotNullParameter(r6, "");
                                            r3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(r6, false);
                                        } catch (IOException unused) {
                                        }
                                    }
                                    throw e;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                r5.unlock(null);
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            okioWriteScope = closeable;
                            th = th;
                            try {
                                okioWriteScope.close();
                                throw th;
                            } catch (Throwable th4) {
                                ExceptionsKt.addSuppressed(th, th4);
                                throw th;
                            }
                        }
                    }
                    videoEncoderConfig = (VideoEncoderConfig) c06371.L$3;
                    surfaceViewImplementationExternalSyntheticLambda1 = (SurfaceViewImplementationExternalSyntheticLambda1) c06371.L$2;
                    function3 = (Function2) c06371.L$1;
                    okioStorageConnection = (OkioStorageConnection) c06371.L$0;
                    ResultKt.throwOnFailure(obj);
                    c06371.L$0 = okioStorageConnection;
                    c06371.L$1 = videoEncoderConfig;
                    c06371.L$2 = surfaceViewImplementationExternalSyntheticLambda1TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    c06371.L$3 = okioWriteScope;
                    c06371.label = 2;
                    if (function3.invoke(okioWriteScope, c06371) != coroutine_suspended) {
                        r5 = videoEncoderConfig;
                        surfaceViewImplementationExternalSyntheticLambda2 = surfaceViewImplementationExternalSyntheticLambda1TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        okioStorageConnection2 = okioStorageConnection;
                        closeable = okioWriteScope;
                        Unit unit3 = Unit.INSTANCE;
                        closeable.close();
                        th = null;
                        if (th == null) {
                            animatetofullopacity = okioStorageConnection2.fileSystem;
                            Intrinsics.checkNotNullParameter(surfaceViewImplementationExternalSyntheticLambda2, "");
                            Intrinsics.checkNotNullParameter(animatetofullopacity, "");
                            Intrinsics.checkNotNullParameter(surfaceViewImplementationExternalSyntheticLambda2, "");
                            if (animatetofullopacity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(surfaceViewImplementationExternalSyntheticLambda2) != null) {
                                okioStorageConnection2.fileSystem.TuitionPaymentFragmentspecialinlinedviewModeldefault3(surfaceViewImplementationExternalSyntheticLambda2, okioStorageConnection2.path);
                            }
                            Unit unit4 = Unit.INSTANCE;
                            r5.unlock(null);
                            return Unit.INSTANCE;
                        }
                        throw th;
                    }
                    return coroutine_suspended;
                } catch (Throwable th5) {
                    th = th5;
                    th = th;
                    okioWriteScope.close();
                    throw th;
                }
                StringBuilder sb = new StringBuilder();
                ByteString byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault3 = okioStorageConnection.path.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                String str = byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault3.utf8;
                if (str == null) {
                    byte[] bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1 = byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    Intrinsics.checkNotNullParameter(bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1, "");
                    String str2 = new String(bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1, Charsets.UTF_8);
                    byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault3.utf8 = str2;
                    str = str2;
                }
                sb.append(str);
                sb.append(".tmp");
                String string = sb.toString();
                Intrinsics.checkNotNullParameter(string, "");
                RotationProviderListenerWrapper rotationProviderListenerWrapper = new RotationProviderListenerWrapper();
                Intrinsics.checkNotNullParameter(string, "");
                surfaceViewImplementationExternalSyntheticLambda1TuitionPaymentFragmentspecialinlinedviewModeldefault2 = surfaceChanged.TuitionPaymentFragmentspecialinlinedviewModeldefault2(surfaceViewImplementationExternalSyntheticLambda1, surfaceChanged.TuitionPaymentFragmentbindingInflater1(rotationProviderListenerWrapper.b(string, 0, string.length()), false), false);
                okioStorageConnection.fileSystem.TuitionPaymentFragmentspecialinlinedviewModeldefault2(surfaceViewImplementationExternalSyntheticLambda1TuitionPaymentFragmentspecialinlinedviewModeldefault2, false);
                okioWriteScope = new OkioWriteScope(okioStorageConnection.fileSystem, surfaceViewImplementationExternalSyntheticLambda1TuitionPaymentFragmentspecialinlinedviewModeldefault2, okioStorageConnection.serializer);
            } catch (IOException e3) {
                e = e3;
            }
        } catch (Throwable th6) {
            th = th6;
            r5 = r4;
        }
    }

    private final void checkNotClosed() {
        if (this.closed.get()) {
            throw new IllegalStateException("StorageConnection has already been disposed.".toString());
        }
    }

    @Override // androidx.content.core.Closeable
    public final void close() {
        this.closed.set(true);
        this.onClose.invoke();
    }
}
