package androidx.compose.runtime;

import androidx.collection.IntList;
import androidx.collection.ObjectList;
import com.midtrans.sdk.corekit.models.snap.EnabledPayment;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002BA\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00108WX\u0096\u0004¢\u0006\f\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001b"}, d2 = {"Landroidx/compose/runtime/ComposePausableCompositionException;", "Ljava/lang/Exception;", "Lkotlin/TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "Landroidx/collection/ObjectList;", "", "p0", "p1", "Landroidx/collection/IntList;", "p2", "", "p3", "", "p4", "<init>", "(Landroidx/collection/ObjectList;Landroidx/collection/ObjectList;Landroidx/collection/IntList;ILjava/lang/Throwable;)V", "Lkotlin/sequences/Sequence;", "", "operationsSequence", "()Lkotlin/sequences/Sequence;", "instances", "Landroidx/collection/ObjectList;", "reused", "operations", "Landroidx/collection/IntList;", "lastOperation", "I", "getMessage", "()Ljava/lang/String;", "getMessage$annotations", "()V", "message"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class ComposePausableCompositionException extends Exception {
    private final ObjectList<Object> instances;
    private final int lastOperation;
    private final IntList operations;
    private final ObjectList<Object> reused;

    public static /* synthetic */ void getMessage$annotations() {
    }

    public ComposePausableCompositionException(ObjectList<Object> objectList, ObjectList<Object> objectList2, IntList intList, int i, Throwable th) {
        super(th);
        this.instances = objectList;
        this.reused = objectList2;
        this.operations = intList;
        this.lastOperation = i;
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.ComposePausableCompositionException$operationsSequence$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.runtime.ComposePausableCompositionException$operationsSequence$1", f = "PausableComposition.kt", i = {0, 0, 0, 0}, l = {554}, m = "invokeSuspend", n = {"$this$sequence", "currentOperation", "currentInstance", "currentReused"}, s = {"L$0", "I$0", "I$1", "I$2"})
    static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super String>, Continuation<? super Unit>, Object> {
        int I$0;
        int I$1;
        int I$2;
        private /* synthetic */ Object L$0;
        int label;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            SequenceScope sequenceScope;
            int i;
            int i2;
            int i3;
            String strConcat;
            int i4;
            int i5;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i6 = this.label;
            if (i6 == 0) {
                ResultKt.throwOnFailure(obj);
                sequenceScope = (SequenceScope) this.L$0;
                i = 0;
                i2 = 0;
                i3 = 0;
            } else {
                if (i6 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = this.I$2;
                i2 = this.I$1;
                i3 = this.I$0;
                sequenceScope = (SequenceScope) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            while (i3 < Math.min(ComposePausableCompositionException.this.lastOperation, ComposePausableCompositionException.this.operations._size)) {
                int i7 = i3 + 1;
                int i8 = ComposePausableCompositionException.this.operations.get(i3);
                switch (i8) {
                    case 0:
                        strConcat = EnabledPayment.STATUS_UP;
                        break;
                    case 1:
                        strConcat = "down ".concat(String.valueOf(ComposePausableCompositionException.this.instances.get(i2)));
                        i2++;
                        break;
                    case 2:
                        int i9 = ComposePausableCompositionException.this.operations.get(i7);
                        int i10 = ComposePausableCompositionException.this.operations.get(i3 + 2);
                        StringBuilder sb = new StringBuilder("remove ");
                        sb.append(i9);
                        sb.append(' ');
                        sb.append(i10);
                        strConcat = sb.toString();
                        i7 = i3 + 3;
                        break;
                    case 3:
                        int i11 = ComposePausableCompositionException.this.operations.get(i7);
                        int i12 = ComposePausableCompositionException.this.operations.get(i3 + 2);
                        int i13 = ComposePausableCompositionException.this.operations.get(i3 + 3);
                        StringBuilder sb2 = new StringBuilder("move ");
                        sb2.append(i11);
                        sb2.append(' ');
                        sb2.append(i12);
                        sb2.append(' ');
                        sb2.append(i13);
                        strConcat = sb2.toString();
                        i7 = i3 + 4;
                        break;
                    case 4:
                        strConcat = "clear";
                        break;
                    case 5:
                        i4 = i3 + 2;
                        int i14 = ComposePausableCompositionException.this.operations.get(i7);
                        i5 = i2 + 1;
                        Object obj2 = ComposePausableCompositionException.this.instances.get(i2);
                        StringBuilder sb3 = new StringBuilder("insertBottomUp ");
                        sb3.append(i14);
                        sb3.append(' ');
                        sb3.append(obj2);
                        strConcat = sb3.toString();
                        i7 = i4;
                        i2 = i5;
                        break;
                    case 6:
                        i4 = i3 + 2;
                        int i15 = ComposePausableCompositionException.this.operations.get(i7);
                        i5 = i2 + 1;
                        Object obj3 = ComposePausableCompositionException.this.instances.get(i2);
                        StringBuilder sb4 = new StringBuilder("insertTopDown ");
                        sb4.append(i15);
                        sb4.append(' ');
                        sb4.append(obj3);
                        strConcat = sb4.toString();
                        i7 = i4;
                        i2 = i5;
                        break;
                    case 7:
                        Object obj4 = ComposePausableCompositionException.this.instances.get(i2);
                        Intrinsics.checkNotNull(obj4, "");
                        Function2 function2 = (Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(obj4, 2);
                        i5 = i2 + 2;
                        Object obj5 = ComposePausableCompositionException.this.instances.get(i2 + 1);
                        StringBuilder sb5 = new StringBuilder("apply ");
                        sb5.append(function2);
                        sb5.append(' ');
                        sb5.append(obj5);
                        strConcat = sb5.toString();
                        i2 = i5;
                        break;
                    case 8:
                        StringBuilder sb6 = new StringBuilder("reuse ");
                        sb6.append(ComposePausableCompositionException.this.reused.get(i));
                        strConcat = sb6.toString();
                        i++;
                        break;
                    default:
                        strConcat = "unknown op: ".concat(String.valueOf(i8));
                        break;
                }
                StringBuilder sb7 = new StringBuilder();
                sb7.append(i3);
                sb7.append(": ");
                sb7.append(strConcat);
                this.L$0 = sequenceScope;
                this.I$0 = i7;
                this.I$1 = i2;
                this.I$2 = i;
                this.label = 1;
                if (sequenceScope.yield(sb7.toString(), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i3 = i7;
            }
            return Unit.INSTANCE;
        }

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = ComposePausableCompositionException.this.new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SequenceScope<? super String> sequenceScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final Sequence<String> operationsSequence() {
        return SequencesKt.sequence(new AnonymousClass1(null));
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb = new StringBuilder("\n            |Exception while applying pausable composition. Last 10 operations:\n            |");
        sb.append(CollectionsKt.joinToString$default(CollectionsKt.takeLast(SequencesKt.toList(operationsSequence()), 10), "\n", null, null, 0, null, null, 62, null));
        sb.append("\n            ");
        return StringsKt.trimMargin$default(sb.toString(), null, 1, null);
    }
}
