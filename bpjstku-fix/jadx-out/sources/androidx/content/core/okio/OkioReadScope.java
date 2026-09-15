package androidx.content.core.okio;

import androidx.content.core.ReadScope;
import androidx.exifinterface.media.ExifInterface;
import defpackage.RotationProvider1;
import defpackage.SurfaceViewImplementation;
import defpackage.SurfaceViewImplementationExternalSyntheticLambda1;
import defpackage.animateToFullOpacity;
import java.io.Closeable;
import java.io.FileNotFoundException;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0011\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0004¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u00038\u0005X\u0085\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u00058\u0005X\u0085\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR \u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0005X\u0085\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f"}, d2 = {"Landroidx/datastore/core/okio/OkioReadScope;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/datastore/core/ReadScope;", "LanimateToFullOpacity;", "p0", "LSurfaceViewImplementationExternalSyntheticLambda1;", "p1", "Landroidx/datastore/core/okio/OkioSerializer;", "p2", "<init>", "(LanimateToFullOpacity;LSurfaceViewImplementationExternalSyntheticLambda1;Landroidx/datastore/core/okio/OkioSerializer;)V", "", "checkClose", "()V", "close", "readData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/datastore/core/okio/AtomicBoolean;", "closed", "Landroidx/datastore/core/okio/AtomicBoolean;", "fileSystem", "LanimateToFullOpacity;", "getFileSystem", "()LanimateToFullOpacity;", "path", "LSurfaceViewImplementationExternalSyntheticLambda1;", "getPath", "()LSurfaceViewImplementationExternalSyntheticLambda1;", "serializer", "Landroidx/datastore/core/okio/OkioSerializer;", "getSerializer", "()Landroidx/datastore/core/okio/OkioSerializer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class OkioReadScope<T> implements ReadScope<T> {
    private final AtomicBoolean closed;
    private final animateToFullOpacity fileSystem;
    private final SurfaceViewImplementationExternalSyntheticLambda1 path;
    private final OkioSerializer<T> serializer;

    /* JADX INFO: renamed from: androidx.datastore.core.okio.OkioReadScope$readData$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.datastore.core.okio.OkioReadScope", f = "OkioStorage.kt", i = {0, 0, 1}, l = {180, 187}, m = "readData$suspendImpl", n = {"$this", "$this$use$iv$iv", "$this$use$iv$iv"}, s = {"L$0", "L$1", "L$0"})
    static final class AnonymousClass1<T> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ OkioReadScope<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(OkioReadScope<T> okioReadScope, Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
            this.this$0 = okioReadScope;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return OkioReadScope.readData$suspendImpl(this.this$0, this);
        }
    }

    public OkioReadScope(animateToFullOpacity animatetofullopacity, SurfaceViewImplementationExternalSyntheticLambda1 surfaceViewImplementationExternalSyntheticLambda1, OkioSerializer<T> okioSerializer) {
        Intrinsics.checkNotNullParameter(animatetofullopacity, "");
        Intrinsics.checkNotNullParameter(surfaceViewImplementationExternalSyntheticLambda1, "");
        Intrinsics.checkNotNullParameter(okioSerializer, "");
        this.fileSystem = animatetofullopacity;
        this.path = surfaceViewImplementationExternalSyntheticLambda1;
        this.serializer = okioSerializer;
        this.closed = new AtomicBoolean(false);
    }

    protected final animateToFullOpacity getFileSystem() {
        return this.fileSystem;
    }

    protected final SurfaceViewImplementationExternalSyntheticLambda1 getPath() {
        return this.path;
    }

    protected final OkioSerializer<T> getSerializer() {
        return this.serializer;
    }

    /* JADX WARN: Code duplicated, block: B:68:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:69:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:73:0x00df A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x00d3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Code duplicated, block: B:84:0x0086 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x0077 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v15, types: [androidx.datastore.core.okio.OkioReadScope] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r8v26 */
    static /* synthetic */ <T> Object readData$suspendImpl(OkioReadScope<T> okioReadScope, Continuation<? super T> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        Throwable th;
        Closeable closeable;
        Closeable closeable2;
        Throwable th2;
        Throwable th3;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(okioReadScope, continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(okioReadScope, continuation);
        }
        Object obj = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r2 = anonymousClass1.label;
        Throwable th4 = null;
        try {
            if (r2 == 0) {
                ResultKt.throwOnFailure(obj);
                okioReadScope.checkClose();
                try {
                    RotationProvider1 rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault3 = SurfaceViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault3(((OkioReadScope) okioReadScope).fileSystem.TuitionPaymentFragmentspecialinlinedviewModeldefault2(((OkioReadScope) okioReadScope).path));
                    try {
                        OkioSerializer<T> okioSerializer = ((OkioReadScope) okioReadScope).serializer;
                        anonymousClass1.L$0 = okioReadScope;
                        anonymousClass1.L$1 = rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        anonymousClass1.label = 1;
                        Object from = okioSerializer.readFrom(rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault3, anonymousClass1);
                        if (from != coroutine_suspended) {
                            closeable2 = rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            obj = from;
                            if (closeable2 != null) {
                                closeable2.close();
                            }
                            th3 = null;
                        }
                        return coroutine_suspended;
                    } catch (Throwable th5) {
                        r2 = okioReadScope;
                        closeable2 = rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        th2 = th5;
                        if (closeable2 != null) {
                            closeable2.close();
                        }
                        th3 = th2;
                        obj = null;
                    }
                } catch (FileNotFoundException unused) {
                    animateToFullOpacity animatetofullopacity = ((OkioReadScope) okioReadScope).fileSystem;
                    SurfaceViewImplementationExternalSyntheticLambda1 surfaceViewImplementationExternalSyntheticLambda1 = ((OkioReadScope) okioReadScope).path;
                    Intrinsics.checkNotNullParameter(surfaceViewImplementationExternalSyntheticLambda1, "");
                    Intrinsics.checkNotNullParameter(animatetofullopacity, "");
                    Intrinsics.checkNotNullParameter(surfaceViewImplementationExternalSyntheticLambda1, "");
                    if (animatetofullopacity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(surfaceViewImplementationExternalSyntheticLambda1) == null) {
                        return ((OkioReadScope) okioReadScope).serializer.getDefaultValue();
                    }
                    RotationProvider1 rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault4 = SurfaceViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault3(((OkioReadScope) okioReadScope).fileSystem.TuitionPaymentFragmentspecialinlinedviewModeldefault2(((OkioReadScope) okioReadScope).path));
                    try {
                        OkioSerializer<T> okioSerializer2 = ((OkioReadScope) okioReadScope).serializer;
                        anonymousClass1.L$0 = rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault4;
                        anonymousClass1.L$1 = null;
                        anonymousClass1.label = 2;
                        Object from2 = okioSerializer2.readFrom(rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault4, anonymousClass1);
                        if (from2 != coroutine_suspended) {
                            obj = from2;
                            closeable = rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault4;
                            if (closeable != null) {
                                closeable.close();
                            }
                            if (th4 == null) {
                                throw th4;
                            }
                            Intrinsics.checkNotNull(obj);
                            return obj;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        closeable = rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault4;
                        if (closeable != null) {
                            closeable.close();
                        }
                        th4 = th;
                        obj = null;
                    }
                }
            } else {
                if (r2 != 1) {
                    if (r2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    closeable = (Closeable) anonymousClass1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        if (closeable != null) {
                            try {
                                closeable.close();
                            } catch (Throwable th7) {
                                th4 = th7;
                            }
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        if (closeable != null) {
                            try {
                                closeable.close();
                            } catch (Throwable th9) {
                                ExceptionsKt.addSuppressed(th, th9);
                            }
                        }
                        th4 = th;
                        obj = null;
                    }
                    if (th4 == null) {
                        throw th4;
                    }
                    Intrinsics.checkNotNull(obj);
                    return obj;
                }
                closeable2 = (Closeable) anonymousClass1.L$1;
                r2 = (OkioReadScope) anonymousClass1.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    if (closeable2 != null) {
                        try {
                            closeable2.close();
                        } catch (Throwable th10) {
                            th3 = th10;
                        }
                    }
                    th3 = null;
                } catch (Throwable th11) {
                    th2 = th11;
                    if (closeable2 != null) {
                        try {
                            closeable2.close();
                        } catch (Throwable th12) {
                            ExceptionsKt.addSuppressed(th2, th12);
                        }
                    }
                    th3 = th2;
                    obj = null;
                }
            }
            if (th3 != null) {
                throw th3;
            }
            Intrinsics.checkNotNull(obj);
            return obj;
        } catch (FileNotFoundException unused2) {
            okioReadScope = (OkioReadScope<T>) r2;
        }
    }

    @Override // androidx.content.core.Closeable
    public void close() {
        this.closed.set(true);
    }

    protected final void checkClose() {
        if (this.closed.get()) {
            throw new IllegalStateException("This scope has already been closed.".toString());
        }
    }

    @Override // androidx.content.core.ReadScope
    public Object readData(Continuation<? super T> continuation) {
        return readData$suspendImpl(this, continuation);
    }
}
