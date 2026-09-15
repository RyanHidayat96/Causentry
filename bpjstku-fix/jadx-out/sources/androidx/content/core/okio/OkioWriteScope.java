package androidx.content.core.okio;

import androidx.content.core.WriteScope;
import androidx.exifinterface.media.ExifInterface;
import defpackage.RotationProviderListener;
import defpackage.SurfaceViewImplementation;
import defpackage.SurfaceViewImplementationExternalSyntheticLambda1;
import defpackage.animateToFullOpacity;
import defpackage.orientationToSurfaceRotation;
import java.io.Closeable;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B%\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/datastore/core/okio/OkioWriteScope;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/datastore/core/okio/OkioReadScope;", "Landroidx/datastore/core/WriteScope;", "LanimateToFullOpacity;", "p0", "LSurfaceViewImplementationExternalSyntheticLambda1;", "p1", "Landroidx/datastore/core/okio/OkioSerializer;", "p2", "<init>", "(LanimateToFullOpacity;LSurfaceViewImplementationExternalSyntheticLambda1;Landroidx/datastore/core/okio/OkioSerializer;)V", "", "writeData", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class OkioWriteScope<T> extends OkioReadScope<T> implements WriteScope<T> {

    /* JADX INFO: renamed from: androidx.datastore.core.okio.OkioWriteScope$writeData$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.datastore.core.okio.OkioWriteScope", f = "OkioStorage.kt", i = {0, 0, 0}, l = {216}, m = "writeData", n = {"$this$use$iv", "handle", "$this$use$iv"}, s = {"L$0", "L$1", "L$2"})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ OkioWriteScope<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(OkioWriteScope<T> okioWriteScope, Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
            this.this$0 = okioWriteScope;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.writeData(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OkioWriteScope(animateToFullOpacity animatetofullopacity, SurfaceViewImplementationExternalSyntheticLambda1 surfaceViewImplementationExternalSyntheticLambda1, OkioSerializer<T> okioSerializer) {
        super(animatetofullopacity, surfaceViewImplementationExternalSyntheticLambda1, okioSerializer);
        Intrinsics.checkNotNullParameter(animatetofullopacity, "");
        Intrinsics.checkNotNullParameter(surfaceViewImplementationExternalSyntheticLambda1, "");
        Intrinsics.checkNotNullParameter(okioSerializer, "");
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0099 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v8 */
    @Override // androidx.content.core.WriteScope
    public final Object writeData(T t, Continuation<? super Unit> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        Unit unit;
        RotationProviderListener rotationProviderListenerTuitionPaymentFragmentbindingInflater1;
        ?? r0;
        orientationToSurfaceRotation orientationtosurfacerotation;
        Closeable closeable;
        Unit unit2;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(this, continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(this, continuation);
        }
        orientationToSurfaceRotation orientationtosurfacerotationTuitionPaymentFragmentbindingInflater1 = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        Throwable th = null;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(orientationtosurfacerotationTuitionPaymentFragmentbindingInflater1);
                checkClose();
                animateToFullOpacity fileSystem = getFileSystem();
                SurfaceViewImplementationExternalSyntheticLambda1 path = getPath();
                Intrinsics.checkNotNullParameter(path, "");
                orientationtosurfacerotationTuitionPaymentFragmentbindingInflater1 = fileSystem.TuitionPaymentFragmentbindingInflater1(path, false, false);
                orientationToSurfaceRotation orientationtosurfacerotation2 = orientationtosurfacerotationTuitionPaymentFragmentbindingInflater1;
                rotationProviderListenerTuitionPaymentFragmentbindingInflater1 = SurfaceViewImplementation.TuitionPaymentFragmentbindingInflater1(orientationtosurfacerotation2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(0L));
                try {
                    OkioSerializer<T> serializer = getSerializer();
                    anonymousClass1.L$0 = orientationtosurfacerotationTuitionPaymentFragmentbindingInflater1;
                    anonymousClass1.L$1 = orientationtosurfacerotation2;
                    anonymousClass1.L$2 = rotationProviderListenerTuitionPaymentFragmentbindingInflater1;
                    anonymousClass1.label = 1;
                    if (serializer.writeTo(t, rotationProviderListenerTuitionPaymentFragmentbindingInflater1, anonymousClass1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    r0 = orientationtosurfacerotationTuitionPaymentFragmentbindingInflater1;
                    orientationtosurfacerotation = orientationtosurfacerotation2;
                    closeable = rotationProviderListenerTuitionPaymentFragmentbindingInflater1;
                } catch (Throwable th2) {
                    th = th2;
                    if (rotationProviderListenerTuitionPaymentFragmentbindingInflater1 != null) {
                        rotationProviderListenerTuitionPaymentFragmentbindingInflater1.close();
                    }
                    r0 = orientationtosurfacerotationTuitionPaymentFragmentbindingInflater1;
                    unit2 = null;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                closeable = (Closeable) anonymousClass1.L$2;
                orientationtosurfacerotation = (orientationToSurfaceRotation) anonymousClass1.L$1;
                r0 = (Closeable) anonymousClass1.L$0;
                try {
                    ResultKt.throwOnFailure(orientationtosurfacerotationTuitionPaymentFragmentbindingInflater1);
                    r0 = r0;
                } catch (Throwable th3) {
                    rotationProviderListenerTuitionPaymentFragmentbindingInflater1 = closeable;
                    th = th3;
                    orientationtosurfacerotationTuitionPaymentFragmentbindingInflater1 = r0;
                    if (rotationProviderListenerTuitionPaymentFragmentbindingInflater1 != null) {
                        try {
                            rotationProviderListenerTuitionPaymentFragmentbindingInflater1.close();
                        } catch (Throwable th4) {
                            ExceptionsKt.addSuppressed(th, th4);
                        }
                    }
                    r0 = orientationtosurfacerotationTuitionPaymentFragmentbindingInflater1;
                    unit2 = null;
                }
            }
            orientationtosurfacerotation.TuitionPaymentFragmentbindingInflater1();
            unit2 = Unit.INSTANCE;
            if (closeable != null) {
                closeable.close();
            }
            th = null;
            try {
                if (th != null) {
                    throw th;
                }
                Intrinsics.checkNotNull(unit2);
                unit = Unit.INSTANCE;
                if (r0 != 0) {
                    try {
                        r0.close();
                    } catch (Throwable th5) {
                        th = th5;
                    }
                }
                if (th != null) {
                    throw th;
                }
                Intrinsics.checkNotNull(unit);
                return Unit.INSTANCE;
            } catch (Throwable th6) {
                th = th6;
                orientationtosurfacerotationTuitionPaymentFragmentbindingInflater1 = r0;
                if (orientationtosurfacerotationTuitionPaymentFragmentbindingInflater1 != 0) {
                    try {
                        orientationtosurfacerotationTuitionPaymentFragmentbindingInflater1.close();
                    } catch (Throwable th7) {
                        ExceptionsKt.addSuppressed(th, th7);
                    }
                }
                th = th;
                unit = null;
            }
        } catch (Throwable th8) {
            th = th8;
        }
    }
}
