package androidx.compose.foundation;

import android.view.Surface;
import defpackage.VideoMimeInfoBuilder;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.b;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\"\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ%\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010JY\u0010\u0017\u001a\u00020\u000b2H\u0010\u0004\u001aD\b\u0001\u0012\u0004\u0012\u00020\u0012\u0012\t\u0012\u00070\u0007¢\u0006\u0002\b\u0013\u0012\t\u0012\u00070\b¢\u0006\u0002\b\u0013\u0012\t\u0012\u00070\b¢\u0006\u0002\b\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0011¢\u0006\u0002\b\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018JB\u0010\u001a\u001a\u00020\u000b*\u00020\u00072-\u0010\u0004\u001a)\u0012\u0004\u0012\u00020\u0007\u0012\t\u0012\u00070\b¢\u0006\u0002\b\u0013\u0012\t\u0012\u00070\b¢\u0006\u0002\b\u0013\u0012\u0004\u0012\u00020\u000b0\u0019¢\u0006\u0002\b\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ,\u0010\u001d\u001a\u00020\u000b*\u00020\u00072\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\u001c¢\u0006\u0002\b\u0016H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!RZ\u0010\u0017\u001aF\b\u0001\u0012\u0004\u0012\u00020\u0012\u0012\t\u0012\u00070\u0007¢\u0006\u0002\b\u0013\u0012\t\u0012\u00070\b¢\u0006\u0002\b\u0013\u0012\t\u0012\u00070\b¢\u0006\u0002\b\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0018\u00010\u0011¢\u0006\u0002\b\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\"R?\u0010#\u001a+\u0012\u0004\u0012\u00020\u0007\u0012\t\u0012\u00070\b¢\u0006\u0002\b\u0013\u0012\t\u0012\u00070\b¢\u0006\u0002\b\u0013\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0019¢\u0006\u0002\b\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R)\u0010%\u001a\u0015\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001c¢\u0006\u0002\b\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010'\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*"}, d2 = {"Landroidx/compose/foundation/BaseAndroidExternalSurfaceState;", "Landroidx/compose/foundation/AndroidExternalSurfaceScope;", "Landroidx/compose/foundation/SurfaceScope;", "Lkotlinx/coroutines/CoroutineScope;", "p0", "<init>", "(Lkotlinx/coroutines/CoroutineScope;)V", "Landroid/view/Surface;", "", "p1", "p2", "", "dispatchSurfaceChanged", "(Landroid/view/Surface;II)V", "dispatchSurfaceCreated", "dispatchSurfaceDestroyed", "(Landroid/view/Surface;)V", "Lkotlin/Function5;", "Landroidx/compose/foundation/SurfaceCoroutineScope;", "Lkotlin/ParameterName;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "onSurface", "(Lkotlin/jvm/functions/Function5;)V", "Lkotlin/Function3;", "onChanged", "(Landroid/view/Surface;Lkotlin/jvm/functions/Function3;)V", "Lkotlin/Function1;", "onDestroyed", "(Landroid/view/Surface;Lkotlin/jvm/functions/Function1;)V", "LVideoMimeInfoBuilder;", "job", "LVideoMimeInfoBuilder;", "Lkotlin/jvm/functions/Function5;", "onSurfaceChanged", "Lkotlin/jvm/functions/Function3;", "onSurfaceDestroyed", "Lkotlin/jvm/functions/Function1;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "getScope", "()Lkotlinx/coroutines/CoroutineScope;"}, k = 1, mv = {1, 8, 0}, xi = 48)
abstract class BaseAndroidExternalSurfaceState implements AndroidExternalSurfaceScope, SurfaceScope {
    private VideoMimeInfoBuilder job;
    private Function5<? super SurfaceCoroutineScope, ? super Surface, ? super Integer, ? super Integer, ? super Continuation<? super Unit>, ? extends Object> onSurface;
    private Function3<? super Surface, ? super Integer, ? super Integer, Unit> onSurfaceChanged;
    private Function1<? super Surface, Unit> onSurfaceDestroyed;
    private final CoroutineScope scope;

    public BaseAndroidExternalSurfaceState(CoroutineScope coroutineScope) {
        this.scope = coroutineScope;
    }

    public final CoroutineScope getScope() {
        return this.scope;
    }

    @Override // androidx.compose.foundation.AndroidExternalSurfaceScope
    public void onSurface(Function5<? super SurfaceCoroutineScope, ? super Surface, ? super Integer, ? super Integer, ? super Continuation<? super Unit>, ? extends Object> p0) {
        this.onSurface = p0;
    }

    @Override // androidx.compose.foundation.SurfaceScope
    public void onChanged(Surface surface, Function3<? super Surface, ? super Integer, ? super Integer, Unit> function3) {
        this.onSurfaceChanged = function3;
    }

    @Override // androidx.compose.foundation.SurfaceScope
    public void onDestroyed(Surface surface, Function1<? super Surface, Unit> function1) {
        this.onSurfaceDestroyed = function1;
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1", f = "AndroidExternalSurface.android.kt", i = {0}, l = {132, 137}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $height;
        final /* synthetic */ Surface $surface;
        final /* synthetic */ int $width;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0072, code lost:
        
            if (r3.invoke(r4, r5, r6, r7, r9) == r0) goto L21;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r9.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.ResultKt.throwOnFailure(r10)
                goto L75
            L12:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L1a:
                java.lang.Object r1 = r9.L$0
                kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
                kotlin.ResultKt.throwOnFailure(r10)
                goto L4b
            L22:
                kotlin.ResultKt.throwOnFailure(r10)
                java.lang.Object r10 = r9.L$0
                r1 = r10
                kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
                androidx.compose.foundation.BaseAndroidExternalSurfaceState r10 = androidx.compose.foundation.BaseAndroidExternalSurfaceState.this
                VideoMimeInfoBuilder r10 = androidx.compose.foundation.BaseAndroidExternalSurfaceState.access$getJob$p(r10)
                if (r10 == 0) goto L4b
                r4 = r9
                kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
                r9.L$0 = r1
                r9.label = r3
                VideoMimeInfoBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1(r10)
                java.lang.Object r10 = r10.a_(r4)
                java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                if (r10 != r3) goto L47
                goto L49
            L47:
                kotlin.Unit r10 = kotlin.Unit.INSTANCE
            L49:
                if (r10 == r0) goto L74
            L4b:
                androidx.compose.foundation.BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1$receiver$1 r4 = new androidx.compose.foundation.BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1$receiver$1
                androidx.compose.foundation.BaseAndroidExternalSurfaceState r10 = androidx.compose.foundation.BaseAndroidExternalSurfaceState.this
                r4.<init>(r10, r1)
                androidx.compose.foundation.BaseAndroidExternalSurfaceState r10 = androidx.compose.foundation.BaseAndroidExternalSurfaceState.this
                kotlin.jvm.functions.Function5 r3 = androidx.compose.foundation.BaseAndroidExternalSurfaceState.access$getOnSurface$p(r10)
                if (r3 == 0) goto L75
                android.view.Surface r5 = r9.$surface
                int r10 = r9.$width
                java.lang.Integer r6 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r10)
                int r10 = r9.$height
                java.lang.Integer r7 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r10)
                r10 = 0
                r9.L$0 = r10
                r9.label = r2
                r8 = r9
                java.lang.Object r10 = r3.invoke(r4, r5, r6, r7, r8)
                if (r10 != r0) goto L75
            L74:
                return r0
            L75:
                kotlin.Unit r10 = kotlin.Unit.INSTANCE
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.BaseAndroidExternalSurfaceState.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Surface surface, int i, int i2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$surface = surface;
            this.$width = i;
            this.$height = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = BaseAndroidExternalSurfaceState.this.new AnonymousClass1(this.$surface, this.$width, this.$height, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final void dispatchSurfaceCreated(Surface p0, int p1, int p2) {
        if (this.onSurface != null) {
            this.job = b.TuitionPaymentFragmentbindingInflater1(this.scope, null, CoroutineStart.UNDISPATCHED, new AnonymousClass1(p0, p1, p2, null), 1, null);
        }
    }

    public final void dispatchSurfaceChanged(Surface p0, int p1, int p2) {
        Function3<? super Surface, ? super Integer, ? super Integer, Unit> function3 = this.onSurfaceChanged;
        if (function3 != null) {
            function3.invoke(p0, Integer.valueOf(p1), Integer.valueOf(p2));
        }
    }

    public final void dispatchSurfaceDestroyed(Surface p0) {
        Function1<? super Surface, Unit> function1 = this.onSurfaceDestroyed;
        if (function1 != null) {
            function1.invoke(p0);
        }
        VideoMimeInfoBuilder videoMimeInfoBuilder = this.job;
        if (videoMimeInfoBuilder != null) {
            videoMimeInfoBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1((CancellationException) null);
        }
        this.job = null;
    }
}
