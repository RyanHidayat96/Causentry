package androidx.window.layout;

import android.app.Activity;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import defpackage.Encoder;
import defpackage.addSignalEosTimeoutIfNeeded;
import defpackage.clampVideoBitrateIfNotSupported;
import defpackage.hasEndOfStreamFlag;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0003\u001a\u00020\bH\u0017¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/window/layout/WindowInfoTrackerImpl;", "Landroidx/window/layout/WindowInfoTracker;", "Landroidx/window/layout/WindowMetricsCalculator;", "p0", "Landroidx/window/layout/WindowBackend;", "p1", "<init>", "(Landroidx/window/layout/WindowMetricsCalculator;Landroidx/window/layout/WindowBackend;)V", "Landroid/app/Activity;", "LclampVideoBitrateIfNotSupported;", "Landroidx/window/layout/WindowLayoutInfo;", "windowLayoutInfo", "(Landroid/app/Activity;)LclampVideoBitrateIfNotSupported;", "windowBackend", "Landroidx/window/layout/WindowBackend;", "windowMetricsCalculator", "Landroidx/window/layout/WindowMetricsCalculator;", "Companion"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class WindowInfoTrackerImpl implements WindowInfoTracker {
    private static final int BUFFER_CAPACITY = 10;
    private final WindowBackend windowBackend;
    private final WindowMetricsCalculator windowMetricsCalculator;

    public WindowInfoTrackerImpl(WindowMetricsCalculator windowMetricsCalculator, WindowBackend windowBackend) {
        Intrinsics.checkNotNullParameter(windowMetricsCalculator, "");
        Intrinsics.checkNotNullParameter(windowBackend, "");
        this.windowMetricsCalculator = windowMetricsCalculator;
        this.windowBackend = windowBackend;
    }

    /* JADX INFO: renamed from: androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Landroidx/window/layout/WindowLayoutInfo;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    @DebugMetadata(c = "androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1", f = "WindowInfoTrackerImpl.kt", i = {0, 0, 1, 1}, l = {54, 55}, m = "invokeSuspend", n = {"$this$flow", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "$this$flow", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER}, s = {"L$0", "L$1", "L$0", "L$1"})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<addSignalEosTimeoutIfNeeded<? super WindowLayoutInfo>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Activity $activity;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: Code duplicated, block: B:18:0x0071  */
        /* JADX WARN: Code duplicated, block: B:21:0x007c A[Catch: all -> 0x00a1, TRY_LEAVE, TryCatch #0 {all -> 0x00a1, blocks: (B:7:0x001a, B:16:0x0060, B:19:0x0074, B:21:0x007c, B:12:0x0033, B:15:0x005c), top: B:30:0x0008 }] */
        /* JADX WARN: Code duplicated, block: B:24:0x0094  */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0091, code lost:
        
            if (r5.emit((androidx.window.layout.WindowLayoutInfo) r1.b(), r9) == r0) goto L26;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0091 -> B:8:0x001d). Please report as a decompilation issue!!! */
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
                if (r1 == 0) goto L37
                if (r1 == r3) goto L27
                if (r1 != r2) goto L1f
                java.lang.Object r1 = r9.L$2
                getEncoderInfo r1 = (defpackage.getEncoderInfo) r1
                java.lang.Object r4 = r9.L$1
                androidx.core.util.Consumer r4 = (androidx.core.util.Consumer) r4
                java.lang.Object r5 = r9.L$0
                addSignalEosTimeoutIfNeeded r5 = (defpackage.addSignalEosTimeoutIfNeeded) r5
                kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Throwable -> La1
            L1d:
                r10 = r5
                goto L60
            L1f:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L27:
                java.lang.Object r1 = r9.L$2
                getEncoderInfo r1 = (defpackage.getEncoderInfo) r1
                java.lang.Object r4 = r9.L$1
                androidx.core.util.Consumer r4 = (androidx.core.util.Consumer) r4
                java.lang.Object r5 = r9.L$0
                addSignalEosTimeoutIfNeeded r5 = (defpackage.addSignalEosTimeoutIfNeeded) r5
                kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Throwable -> La1
                goto L74
            L37:
                kotlin.ResultKt.throwOnFailure(r10)
                java.lang.Object r10 = r9.L$0
                addSignalEosTimeoutIfNeeded r10 = (defpackage.addSignalEosTimeoutIfNeeded) r10
                kotlinx.coroutines.channels.BufferOverflow r1 = kotlinx.coroutines.channels.BufferOverflow.DROP_OLDEST
                r4 = 10
                r5 = 4
                Encoder r1 = defpackage.getInput.TuitionPaymentFragmentspecialinlinedviewModeldefault3(r4, r1, r5)
                androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1$$ExternalSyntheticLambda0 r4 = new androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1$$ExternalSyntheticLambda0
                r4.<init>()
                androidx.window.layout.WindowInfoTrackerImpl r5 = androidx.window.layout.WindowInfoTrackerImpl.this
                androidx.window.layout.WindowBackend r5 = androidx.window.layout.WindowInfoTrackerImpl.access$getWindowBackend$p(r5)
                android.app.Activity r6 = r9.$activity
                androidx.privacysandbox.ads.adservices.adid.AdIdManagerImplCommon$$ExternalSyntheticLambda0 r7 = new androidx.privacysandbox.ads.adservices.adid.AdIdManagerImplCommon$$ExternalSyntheticLambda0
                r7.<init>()
                r5.registerLayoutChangeCallback(r6, r7, r4)
                getEncoderInfo r1 = r1.a()     // Catch: java.lang.Throwable -> La1
            L60:
                r5 = r9
                kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5     // Catch: java.lang.Throwable -> La1
                r9.L$0 = r10     // Catch: java.lang.Throwable -> La1
                r9.L$1 = r4     // Catch: java.lang.Throwable -> La1
                r9.L$2 = r1     // Catch: java.lang.Throwable -> La1
                r9.label = r3     // Catch: java.lang.Throwable -> La1
                java.lang.Object r5 = r1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(r5)     // Catch: java.lang.Throwable -> La1
                if (r5 == r0) goto La0
                r8 = r5
                r5 = r10
                r10 = r8
            L74:
                java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> La1
                boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> La1
                if (r10 == 0) goto L94
                java.lang.Object r10 = r1.b()     // Catch: java.lang.Throwable -> La1
                androidx.window.layout.WindowLayoutInfo r10 = (androidx.window.layout.WindowLayoutInfo) r10     // Catch: java.lang.Throwable -> La1
                r6 = r9
                kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6     // Catch: java.lang.Throwable -> La1
                r9.L$0 = r5     // Catch: java.lang.Throwable -> La1
                r9.L$1 = r4     // Catch: java.lang.Throwable -> La1
                r9.L$2 = r1     // Catch: java.lang.Throwable -> La1
                r9.label = r2     // Catch: java.lang.Throwable -> La1
                java.lang.Object r10 = r5.emit(r10, r6)     // Catch: java.lang.Throwable -> La1
                if (r10 != r0) goto L1d
                goto La0
            L94:
                androidx.window.layout.WindowInfoTrackerImpl r10 = androidx.window.layout.WindowInfoTrackerImpl.this
                androidx.window.layout.WindowBackend r10 = androidx.window.layout.WindowInfoTrackerImpl.access$getWindowBackend$p(r10)
                r10.unregisterLayoutChangeCallback(r4)
                kotlin.Unit r10 = kotlin.Unit.INSTANCE
                return r10
            La0:
                return r0
            La1:
                r10 = move-exception
                androidx.window.layout.WindowInfoTrackerImpl r0 = androidx.window.layout.WindowInfoTrackerImpl.this
                androidx.window.layout.WindowBackend r0 = androidx.window.layout.WindowInfoTrackerImpl.access$getWindowBackend$p(r0)
                r0.unregisterLayoutChangeCallback(r4)
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.WindowInfoTrackerImpl.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: invokeSuspend$lambda-0, reason: not valid java name */
        public static final void m7511invokeSuspend$lambda0(Encoder encoder, WindowLayoutInfo windowLayoutInfo) {
            Intrinsics.checkNotNullExpressionValue(windowLayoutInfo, "");
            encoder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(windowLayoutInfo);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Activity activity, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$activity = activity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = WindowInfoTrackerImpl.this.new AnonymousClass1(this.$activity, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(addSignalEosTimeoutIfNeeded<? super WindowLayoutInfo> addsignaleostimeoutifneeded, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(addsignaleostimeoutifneeded, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // androidx.window.layout.WindowInfoTracker
    public final clampVideoBitrateIfNotSupported<WindowLayoutInfo> windowLayoutInfo(Activity p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return hasEndOfStreamFlag.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new AnonymousClass1(p0, null));
    }
}
