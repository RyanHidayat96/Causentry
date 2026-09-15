package defpackage;

import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.JobSupport$children$1;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated(level = DeprecationLevel.ERROR, message = "This is internal API and may be removed in the future releases")
@Metadata(d1 = {"\u0000ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\f\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\n¹\u0001º\u0001»\u0001¼\u0001½\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u001a\u001a\u00020\u001b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u0004J\u001f\u0010\u001f\u001a\u00020 2\u0014\u0010!\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u001b0\"H\u0082\bJ\u001c\u0010'\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001c\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u000eH\u0002J \u0010*\u001a\u0004\u0018\u00010+2\u0006\u0010\u001c\u001a\u00020(2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020+0-H\u0002J\u001e\u0010.\u001a\u00020\u001b2\u0006\u0010/\u001a\u00020+2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020+0-H\u0002J\u001a\u00100\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u000eH\u0002J\u001a\u00103\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u000eH\u0002J\u0018\u00104\u001a\u00020\u001b2\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020+H\u0002J\u0010\u00108\u001a\u00020\u00052\u0006\u00107\u001a\u00020+H\u0002J\u0016\u00109\u001a\u00020\u001b*\u0002062\b\u00107\u001a\u0004\u0018\u00010+H\u0002J/\u0010:\u001a\u00020\u001b2\u0006\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u00010+2\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020\u00050\"H\u0082\bJ\u0006\u0010=\u001a\u00020\u0005J\u0012\u0010>\u001a\u00020?2\b\u0010\u001c\u001a\u0004\u0018\u00010\u000eH\u0002J\b\u0010@\u001a\u00020\u001bH\u0014J\u000f\u0010A\u001a\u00060Cj\u0002`B¢\u0006\u0002\u0010DJ!\u0010E\u001a\u00060Cj\u0002`B*\u00020+2\n\b\u0002\u0010F\u001a\u0004\u0018\u00010GH\u0004¢\u0006\u0002\u0010HJ4\u0010N\u001a\u00020O2'\u0010P\u001a#\u0012\u0015\u0012\u0013\u0018\u00010+¢\u0006\f\bR\u0012\b\bS\u0012\u0004\b\b(7\u0012\u0004\u0012\u00020\u001b0\"j\u0002`Q¢\u0006\u0002\u0010TJD\u0010N\u001a\u00020O2\u0006\u0010U\u001a\u00020\u00052\u0006\u0010V\u001a\u00020\u00052'\u0010P\u001a#\u0012\u0015\u0012\u0013\u0018\u00010+¢\u0006\f\bR\u0012\b\bS\u0012\u0004\b\b(7\u0012\u0004\u0012\u00020\u001b0\"j\u0002`Q¢\u0006\u0002\u0010WJ\u001d\u0010X\u001a\u00020O2\u0006\u0010V\u001a\u00020\u00052\u0006\u0010Y\u001a\u00020<H\u0000¢\u0006\u0002\bZJ+\u0010[\u001a\u00020\u00052\u0006\u0010Y\u001a\u00020<2\u0018\u0010\\\u001a\u0014\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\u00050]H\u0082\bJ\u0010\u0010^\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020_H\u0002J\u0010\u0010`\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020<H\u0002J\u000e\u0010a\u001a\u00020\u001bH\u0086@¢\u0006\u0002\u0010bJ\b\u0010c\u001a\u00020\u0005H\u0002J\u000e\u0010d\u001a\u00020\u001bH\u0082@¢\u0006\u0002\u0010bJ\u001e\u0010k\u001a\u00020\u001b2\n\u0010l\u001a\u0006\u0012\u0002\b\u00030m2\b\u0010n\u001a\u0004\u0018\u00010\u000eH\u0002J\u0015\u0010o\u001a\u00020\u001b2\u0006\u0010Y\u001a\u00020<H\u0000¢\u0006\u0002\bpJ\u001d\u0010s\u001a\u00020\u001b2\u000e\u00107\u001a\n\u0018\u00010Cj\u0004\u0018\u0001`BH\u0016¢\u0006\u0002\u0010tJ\b\u0010u\u001a\u00020GH\u0014J\u0012\u0010s\u001a\u00020\u00052\b\u00107\u001a\u0004\u0018\u00010+H\u0017J\u0010\u0010v\u001a\u00020\u001b2\u0006\u00107\u001a\u00020+H\u0016J\u000e\u0010w\u001a\u00020\u001b2\u0006\u0010x\u001a\u00020\u0003J\u0010\u0010y\u001a\u00020\u00052\u0006\u00107\u001a\u00020+H\u0016J\u0010\u0010z\u001a\u00020\u00052\b\u00107\u001a\u0004\u0018\u00010+J\u0017\u0010{\u001a\u00020\u00052\b\u00107\u001a\u0004\u0018\u00010\u000eH\u0000¢\u0006\u0002\b|J\u0014\u0010}\u001a\u0004\u0018\u00010\u000e2\b\u00107\u001a\u0004\u0018\u00010\u000eH\u0002J'\u0010~\u001a\u00020\u007f2\n\b\u0002\u0010F\u001a\u0004\u0018\u00010G2\n\b\u0002\u00107\u001a\u0004\u0018\u00010+H\u0080\b¢\u0006\u0003\b\u0080\u0001J\u0012\u0010\u0081\u0001\u001a\u00060Cj\u0002`BH\u0016¢\u0006\u0002\u0010DJ\u0013\u0010\u0082\u0001\u001a\u00020+2\b\u00107\u001a\u0004\u0018\u00010\u000eH\u0002J\u0015\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u000e2\b\u00107\u001a\u0004\u0018\u00010\u000eH\u0002J\u0013\u0010\u0084\u0001\u001a\u0004\u0018\u0001062\u0006\u0010\u001c\u001a\u000201H\u0002J\u0019\u0010\u0085\u0001\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u0002012\u0006\u0010/\u001a\u00020+H\u0002J\u0019\u0010\u0086\u0001\u001a\u00020\u00052\b\u0010)\u001a\u0004\u0018\u00010\u000eH\u0000¢\u0006\u0003\b\u0087\u0001J\u001b\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u000e2\b\u0010)\u001a\u0004\u0018\u00010\u000eH\u0000¢\u0006\u0003\b\u0089\u0001J\u001f\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u000e2\b\u0010\u001c\u001a\u0004\u0018\u00010\u000e2\b\u0010)\u001a\u0004\u0018\u00010\u000eH\u0002J\u001d\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001c\u001a\u0002012\b\u0010)\u001a\u0004\u0018\u00010\u000eH\u0002J&\u0010\u008f\u0001\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020(2\b\u0010\u0090\u0001\u001a\u00030\u0091\u00012\b\u0010)\u001a\u0004\u0018\u00010\u000eH\u0082\u0010J%\u0010\u0092\u0001\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020(2\b\u0010\u0093\u0001\u001a\u00030\u0091\u00012\b\u0010)\u001a\u0004\u0018\u00010\u000eH\u0002J\u0011\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u0091\u0001*\u00030\u0095\u0001H\u0002J\u0010\u0010\u009a\u0001\u001a\u00020\u00102\u0007\u0010\u0090\u0001\u001a\u00020\u0002J\u0018\u0010\u009b\u0001\u001a\u00020\u001b2\u0007\u0010\u009c\u0001\u001a\u00020+H\u0010¢\u0006\u0003\b\u009d\u0001J\u0012\u0010U\u001a\u00020\u001b2\b\u00107\u001a\u0004\u0018\u00010+H\u0014J\u0012\u0010¡\u0001\u001a\u00020\u00052\u0007\u0010\u009c\u0001\u001a\u00020+H\u0014J\u0013\u0010¢\u0001\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u000eH\u0014J\u0013\u0010£\u0001\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u000eH\u0014J\t\u0010¤\u0001\u001a\u00020GH\u0016J\t\u0010¥\u0001\u001a\u00020GH\u0007J\u000f\u0010¦\u0001\u001a\u00020GH\u0010¢\u0006\u0003\b§\u0001J\u0013\u0010¨\u0001\u001a\u00020G2\b\u0010\u001c\u001a\u0004\u0018\u00010\u000eH\u0002J\t\u0010¬\u0001\u001a\u0004\u0018\u00010+J\u0011\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\u000eH\u0000¢\u0006\u0003\b®\u0001J\u0011\u0010¯\u0001\u001a\u0004\u0018\u00010\u000eH\u0084@¢\u0006\u0002\u0010bJ\u0011\u0010°\u0001\u001a\u0004\u0018\u00010\u000eH\u0082@¢\u0006\u0002\u0010bJ\u001f\u0010¶\u0001\u001a\u00020\u001b2\n\u0010l\u001a\u0006\u0012\u0002\b\u00030m2\b\u0010n\u001a\u0004\u0018\u00010\u000eH\u0002J \u0010·\u0001\u001a\u0004\u0018\u00010\u000e2\b\u0010n\u001a\u0004\u0018\u00010\u000e2\t\u0010¸\u0001\u001a\u0004\u0018\u00010\u000eH\u0002R\u0015\u0010\b\u001a\u0006\u0012\u0002\b\u00030\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rX\u0082\u0004R\u0011\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\rX\u0082\u0004R(\u0010\u0012\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00108@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u000e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010%\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b%\u0010$R\u0011\u0010&\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b&\u0010$R\u0016\u0010I\u001a\u0004\u0018\u00010+8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0014\u0010L\u001a\u00020\u00058DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bM\u0010$R\u0017\u0010e\u001a\u00020f8F¢\u0006\f\u0012\u0004\bg\u0010h\u001a\u0004\bi\u0010jR\u0014\u0010q\u001a\u00020\u00058PX\u0090\u0004¢\u0006\u0006\u001a\u0004\br\u0010$R\u001f\u0010\u008c\u0001\u001a\u0004\u0018\u00010+*\u0004\u0018\u00010\u000e8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R\u001b\u0010\u0096\u0001\u001a\t\u0012\u0004\u0012\u00020\u00010\u0097\u00018F¢\u0006\b\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001R\u0016\u0010\u009e\u0001\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0007\u001a\u0005\b\u009e\u0001\u0010$R\u0016\u0010\u009f\u0001\u001a\u00020\u00058PX\u0090\u0004¢\u0006\u0007\u001a\u0005\b \u0001\u0010$R\u001b\u0010©\u0001\u001a\u00020\u0005*\u0002018BX\u0082\u0004¢\u0006\b\u001a\u0006\b©\u0001\u0010ª\u0001R\u0013\u0010«\u0001\u001a\u00020\u00058F¢\u0006\u0007\u001a\u0005\b«\u0001\u0010$R#\u0010±\u0001\u001a\u0007\u0012\u0002\b\u00030²\u00018DX\u0084\u0004¢\u0006\u000f\u0012\u0005\b³\u0001\u0010h\u001a\u0006\b´\u0001\u0010µ\u0001¨\u0006¾\u0001"}, d2 = {"Lkotlinx/coroutines/JobSupport;", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/ChildJob;", "Lkotlinx/coroutines/ParentJob;", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "", "<init>", "(Z)V", "key", "Lkotlin/coroutines/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "_state", "Lkotlinx/atomicfu/AtomicRef;", "", "_parentHandle", "Lkotlinx/coroutines/ChildHandle;", "value", "parentHandle", "getParentHandle$kotlinx_coroutines_core", "()Lkotlinx/coroutines/ChildHandle;", "setParentHandle$kotlinx_coroutines_core", "(Lkotlinx/coroutines/ChildHandle;)V", "parent", "getParent", "()Lkotlinx/coroutines/Job;", "initParentJob", "", RemoteConfigConstants.ResponseFieldKey.STATE, "getState$kotlinx_coroutines_core", "()Ljava/lang/Object;", "loopOnState", "", "block", "Lkotlin/Function1;", "isActive", "()Z", "isCompleted", "isCancelled", "finalizeFinishingState", "Lkotlinx/coroutines/JobSupport$Finishing;", "proposedUpdate", "getFinalRootCause", "", "exceptions", "", "addSuppressedExceptions", "rootCause", "tryFinalizeSimpleState", "Lkotlinx/coroutines/Incomplete;", "update", "completeStateFinalization", "notifyCancelling", "list", "Lkotlinx/coroutines/NodeList;", "cause", "cancelParent", "notifyCompletion", "notifyHandlers", "predicate", "Lkotlinx/coroutines/JobNode;", "start", "startInternal", "", "onStart", "getCancellationException", "Lkotlinx/coroutines/CancellationException;", "Ljava/util/concurrent/CancellationException;", "()Ljava/util/concurrent/CancellationException;", "toCancellationException", "message", "", "(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/util/concurrent/CancellationException;", "completionCause", "getCompletionCause", "()Ljava/lang/Throwable;", "completionCauseHandled", "getCompletionCauseHandled", "invokeOnCompletion", "Lkotlinx/coroutines/DisposableHandle;", "handler", "Lkotlinx/coroutines/CompletionHandler;", "Lkotlin/ParameterName;", "name", "(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/DisposableHandle;", "onCancelling", "invokeImmediately", "(ZZLkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/DisposableHandle;", "invokeOnCompletionInternal", "node", "invokeOnCompletionInternal$kotlinx_coroutines_core", "tryPutNodeIntoList", "tryAdd", "Lkotlin/Function2;", "promoteEmptyToNodeList", "Lkotlinx/coroutines/Empty;", "promoteSingleToNodeList", "join", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "joinInternal", "joinSuspend", "onJoin", "Lkotlinx/coroutines/selects/SelectClause0;", "getOnJoin$annotations", "()V", "getOnJoin", "()Lkotlinx/coroutines/selects/SelectClause0;", "registerSelectForOnJoin", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "ignoredParam", "removeNode", "removeNode$kotlinx_coroutines_core", "onCancelComplete", "getOnCancelComplete$kotlinx_coroutines_core", "cancel", "(Ljava/util/concurrent/CancellationException;)V", "cancellationExceptionMessage", "cancelInternal", "parentCancelled", "parentJob", "childCancelled", "cancelCoroutine", "cancelImpl", "cancelImpl$kotlinx_coroutines_core", "cancelMakeCompleting", "defaultCancellationException", "Lkotlinx/coroutines/JobCancellationException;", "defaultCancellationException$kotlinx_coroutines_core", "getChildJobCancellationCause", "createCauseException", "makeCancelling", "getOrPromoteCancellingList", "tryMakeCancelling", "makeCompleting", "makeCompleting$kotlinx_coroutines_core", "makeCompletingOnce", "makeCompletingOnce$kotlinx_coroutines_core", "tryMakeCompleting", "tryMakeCompletingSlowPath", "exceptionOrNull", "getExceptionOrNull", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "tryWaitForChild", "child", "Lkotlinx/coroutines/ChildHandleNode;", "continueCompleting", "lastChild", "nextChild", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "children", "Lkotlin/sequences/Sequence;", "getChildren", "()Lkotlin/sequences/Sequence;", "attachChild", "handleOnCompletionException", "exception", "handleOnCompletionException$kotlinx_coroutines_core", "isScopedCoroutine", "handlesException", "getHandlesException$kotlinx_coroutines_core", "handleJobException", "onCompletionInternal", "afterCompletion", "toString", "toDebugString", "nameString", "nameString$kotlinx_coroutines_core", "stateString", "isCancelling", "(Lkotlinx/coroutines/Incomplete;)Z", "isCompletedExceptionally", "getCompletionExceptionOrNull", "getCompletedInternal", "getCompletedInternal$kotlinx_coroutines_core", "awaitInternal", "awaitSuspend", "onAwaitInternal", "Lkotlinx/coroutines/selects/SelectClause1;", "getOnAwaitInternal$annotations", "getOnAwaitInternal", "()Lkotlinx/coroutines/selects/SelectClause1;", "onAwaitInternalRegFunc", "onAwaitInternalProcessResFunc", "result", "SelectOnJoinCompletionHandler", "Finishing", "ChildCompletion", "AwaitContinuation", "SelectOnAwaitCompletionHandler", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class AudioEncoderConfigBuilder implements isHuaweiP40Lite, AutoValue_AudioEncoderConfig1 {
    private static final /* synthetic */ AtomicReferenceFieldUpdater TuitionPaymentFragmentspecialinlinedviewModeldefault1 = AtomicReferenceFieldUpdater.newUpdater(AudioEncoderConfigBuilder.class, Object.class, "_state$volatile");
    private static final /* synthetic */ AtomicReferenceFieldUpdater TuitionPaymentFragmentspecialinlinedviewModeldefault3 = AtomicReferenceFieldUpdater.newUpdater(AudioEncoderConfigBuilder.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    protected void INotificationSideChannelDefault() {
    }

    protected void TuitionPaymentFragmentbindingInflater1(Object obj) {
    }

    protected boolean TuitionPaymentFragmentbindingInflater1() {
        return false;
    }

    protected boolean a(Throwable th) {
        return false;
    }

    protected void a_(Object obj) {
    }

    public boolean o_() {
        return true;
    }

    public boolean t_() {
        return false;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <R> R fold(R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) VideoMimeInfoBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this, r, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.Element> E get(CoroutineContext.Key<E> key) {
        return (E) VideoMimeInfoBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.Key<?> key) {
        return VideoMimeInfoBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this, key);
    }

    public AudioEncoderConfigBuilder(boolean z) {
        this._state$volatile = z ? AudioEncoderInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2 : AudioEncoderInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final CoroutineContext.Key<?> getKey() {
        return VideoMimeInfoBuilder.b;
    }

    protected final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(VideoMimeInfoBuilder videoMimeInfoBuilder) {
        scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        if (videoMimeInfoBuilder == null) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault2((ReportedVideoQualityNotSupportedQuirk) AutoValue_AudioEncoderConfigBuilder.INSTANCE);
            return;
        }
        videoMimeInfoBuilder.INotificationSideChannel();
        ReportedVideoQualityNotSupportedQuirk reportedVideoQualityNotSupportedQuirkTuitionPaymentFragmentspecialinlinedviewModeldefault1 = videoMimeInfoBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this);
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(reportedVideoQualityNotSupportedQuirkTuitionPaymentFragmentspecialinlinedviewModeldefault1);
        if (cancel()) {
            reportedVideoQualityNotSupportedQuirkTuitionPaymentFragmentspecialinlinedviewModeldefault1.dispose();
            TuitionPaymentFragmentspecialinlinedviewModeldefault2((ReportedVideoQualityNotSupportedQuirk) AutoValue_AudioEncoderConfigBuilder.INSTANCE);
        }
    }

    @Override // defpackage.VideoMimeInfoBuilder
    public boolean r_() {
        Object interfaceDescriptor = getInterfaceDescriptor();
        return (interfaceDescriptor instanceof MimeInfoBuilder) && ((MimeInfoBuilder) interfaceDescriptor).k_();
    }

    @Override // defpackage.VideoMimeInfoBuilder
    public final boolean cancel() {
        return !(getInterfaceDescriptor() instanceof MimeInfoBuilder);
    }

    @Override // defpackage.VideoMimeInfoBuilder
    public final boolean d() {
        Object interfaceDescriptor = getInterfaceDescriptor();
        if (interfaceDescriptor instanceof isVivoY91i) {
            return true;
        }
        return (interfaceDescriptor instanceof TuitionPaymentFragmentbindingInflater1) && ((TuitionPaymentFragmentbindingInflater1) interfaceDescriptor).TuitionPaymentFragmentspecialinlinedviewModeldefault1();
    }

    private final Object b(TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1, Object obj) throws Throwable {
        Throwable thTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        DefaultConstructorMarker defaultConstructorMarker = null;
        isVivoY91i isvivoy91i = obj instanceof isVivoY91i ? (isVivoY91i) obj : null;
        Throwable th = isvivoy91i != null ? isvivoy91i.TuitionPaymentFragmentbindingInflater1 : null;
        synchronized (tuitionPaymentFragmentbindingInflater1) {
            tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            List<Throwable> listTuitionPaymentFragmentspecialinlinedviewModeldefault2 = tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
            thTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(tuitionPaymentFragmentbindingInflater1, (List<? extends Throwable>) listTuitionPaymentFragmentspecialinlinedviewModeldefault2);
            if (thTuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault1(thTuitionPaymentFragmentspecialinlinedviewModeldefault3, listTuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        }
        if (thTuitionPaymentFragmentspecialinlinedviewModeldefault3 != null && thTuitionPaymentFragmentspecialinlinedviewModeldefault3 != th) {
            obj = new isVivoY91i(thTuitionPaymentFragmentspecialinlinedviewModeldefault3, false, 2, defaultConstructorMarker);
        }
        if (thTuitionPaymentFragmentspecialinlinedviewModeldefault3 != null && (TuitionPaymentFragmentspecialinlinedviewModeldefault3(thTuitionPaymentFragmentspecialinlinedviewModeldefault3) || a(thTuitionPaymentFragmentspecialinlinedviewModeldefault3))) {
            Intrinsics.checkNotNull(obj, "");
            ((isVivoY91i) obj).b();
        }
        TuitionPaymentFragmentbindingInflater1(obj);
        AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(TuitionPaymentFragmentspecialinlinedviewModeldefault1, this, tuitionPaymentFragmentbindingInflater1, AudioEncoderInfo.TuitionPaymentFragmentbindingInflater1(obj));
        scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(tuitionPaymentFragmentbindingInflater1, obj);
        return obj;
    }

    private final Throwable TuitionPaymentFragmentspecialinlinedviewModeldefault3(TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1, List<? extends Throwable> list) {
        Object next;
        Object obj = null;
        if (list.isEmpty()) {
            if (tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1()) {
                return new JobCancellationException(TuitionPaymentFragmentspecialinlinedviewModeldefault3(), null, this);
            }
            return null;
        }
        List<? extends Throwable> list2 = list;
        Iterator<T> it = list2.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((Throwable) next) instanceof CancellationException);
        Throwable th = (Throwable) next;
        if (th != null) {
            return th;
        }
        Throwable th2 = list.get(0);
        if (th2 instanceof TimeoutCancellationException) {
            for (Object obj2 : list2) {
                Throwable th3 = (Throwable) obj2;
                if (th3 != th2 && (th3 instanceof TimeoutCancellationException)) {
                    obj = obj2;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    private static void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Throwable th, List<? extends Throwable> list) {
        if (list.size() > 1) {
            Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
            Throwable thB = !scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault1() ? th : reachEndData.b(th);
            for (Throwable thB2 : list) {
                if (scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault1()) {
                    thB2 = reachEndData.b(thB2);
                }
                if (thB2 != th && thB2 != thB && !(thB2 instanceof CancellationException) && setNewSetFromMap.add(thB2)) {
                    ExceptionsKt.addSuppressed(th, thB2);
                }
            }
        }
    }

    private final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(MimeInfoBuilder mimeInfoBuilder, Object obj) throws Throwable {
        scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        if (!AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(TuitionPaymentFragmentspecialinlinedviewModeldefault1, this, mimeInfoBuilder, AudioEncoderInfo.TuitionPaymentFragmentbindingInflater1(obj))) {
            return false;
        }
        TuitionPaymentFragmentbindingInflater1(obj);
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(mimeInfoBuilder, obj);
        return true;
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(MimeInfoBuilder mimeInfoBuilder, Object obj) throws Throwable {
        ReportedVideoQualityNotSupportedQuirk reportedVideoQualityNotSupportedQuirkINotificationSideChannelStub = INotificationSideChannelStub();
        if (reportedVideoQualityNotSupportedQuirkINotificationSideChannelStub != null) {
            reportedVideoQualityNotSupportedQuirkINotificationSideChannelStub.dispose();
            TuitionPaymentFragmentspecialinlinedviewModeldefault2((ReportedVideoQualityNotSupportedQuirk) AutoValue_AudioEncoderConfigBuilder.INSTANCE);
        }
        isVivoY91i isvivoy91i = obj instanceof isVivoY91i ? (isVivoY91i) obj : null;
        Throwable th = isvivoy91i != null ? isvivoy91i.TuitionPaymentFragmentbindingInflater1 : null;
        if (mimeInfoBuilder instanceof getInputTimebase) {
            try {
                ((getInputTimebase) mimeInfoBuilder).TuitionPaymentFragmentspecialinlinedviewModeldefault3(th);
                return;
            } catch (Throwable th2) {
                StringBuilder sb = new StringBuilder("Exception in completion handler ");
                sb.append(mimeInfoBuilder);
                sb.append(" for ");
                sb.append(this);
                TuitionPaymentFragmentbindingInflater1((Throwable) new CompletionHandlerException(sb.toString(), th2));
                return;
            }
        }
        AutoValue_AudioEncoderConfig tuitionPaymentFragmentbindingInflater1 = mimeInfoBuilder.getTuitionPaymentFragmentbindingInflater1();
        if (tuitionPaymentFragmentbindingInflater1 != null) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(tuitionPaymentFragmentbindingInflater1, th);
        }
    }

    private final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(Throwable th) {
        if (TuitionPaymentFragmentbindingInflater1()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        ReportedVideoQualityNotSupportedQuirk reportedVideoQualityNotSupportedQuirkINotificationSideChannelStub = INotificationSideChannelStub();
        if (reportedVideoQualityNotSupportedQuirkINotificationSideChannelStub == null || reportedVideoQualityNotSupportedQuirkINotificationSideChannelStub == AutoValue_AudioEncoderConfigBuilder.INSTANCE) {
            return z;
        }
        return reportedVideoQualityNotSupportedQuirkINotificationSideChannelStub.b(th) || z;
    }

    private final int a(Object obj) {
        if (obj instanceof setProfile) {
            if (((setProfile) obj).k_()) {
                return 0;
            }
            if (!AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(TuitionPaymentFragmentspecialinlinedviewModeldefault1, this, obj, AudioEncoderInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
                return -1;
            }
            INotificationSideChannelDefault();
            return 1;
        }
        if (!(obj instanceof getDynamicRangeDefaultMime)) {
            return 0;
        }
        if (!AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(TuitionPaymentFragmentspecialinlinedviewModeldefault1, this, obj, ((getDynamicRangeDefaultMime) obj).TuitionPaymentFragmentspecialinlinedviewModeldefault3)) {
            return -1;
        }
        INotificationSideChannelDefault();
        return 1;
    }

    @Override // defpackage.VideoMimeInfoBuilder
    public final CancellationException s_() {
        Object interfaceDescriptor = getInterfaceDescriptor();
        if (interfaceDescriptor instanceof TuitionPaymentFragmentbindingInflater1) {
            Throwable thTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ((TuitionPaymentFragmentbindingInflater1) interfaceDescriptor).TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            if (thTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(resolveAudioMimeInfo.TuitionPaymentFragmentbindingInflater1(this));
                sb.append(" is cancelling");
                CancellationException cancellationExceptionTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(thTuitionPaymentFragmentspecialinlinedviewModeldefault2, sb.toString());
                if (cancellationExceptionTuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
                    return cancellationExceptionTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                }
            }
            throw new IllegalStateException("Job is still new or active: ".concat(String.valueOf(this)).toString());
        }
        if (interfaceDescriptor instanceof MimeInfoBuilder) {
            throw new IllegalStateException("Job is still new or active: ".concat(String.valueOf(this)).toString());
        }
        if (!(interfaceDescriptor instanceof isVivoY91i)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(resolveAudioMimeInfo.TuitionPaymentFragmentbindingInflater1(this));
            sb2.append(" has completed normally");
            return new JobCancellationException(sb2.toString(), null, this);
        }
        return TuitionPaymentFragmentspecialinlinedviewModeldefault3(((isVivoY91i) interfaceDescriptor).TuitionPaymentFragmentbindingInflater1, (String) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public CancellationException TuitionPaymentFragmentspecialinlinedviewModeldefault3(Throwable th, String str) {
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (str == null) {
            str = TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        }
        return new JobCancellationException(str, th, this);
    }

    @Override // defpackage.VideoMimeInfoBuilder
    public final setCompatibleAudioProfile a_(Function1<? super Throwable, Unit> function1) {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2(true, (getInputTimebase) new toVideoEncoderConfig(function1));
    }

    @Override // defpackage.VideoMimeInfoBuilder
    public final setCompatibleAudioProfile b(boolean z, boolean z2, Function1<? super Throwable, Unit> function1) {
        toVideoEncoderConfig tovideoencoderconfig;
        if (z) {
            tovideoencoderconfig = new VideoEncoderConfigDefaultResolver(function1);
        } else {
            tovideoencoderconfig = new toVideoEncoderConfig(function1);
        }
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2(z2, tovideoencoderconfig);
    }

    public final setCompatibleAudioProfile TuitionPaymentFragmentspecialinlinedviewModeldefault2(boolean z, getInputTimebase getinputtimebase) {
        boolean zTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        getinputtimebase.TuitionPaymentFragmentbindingInflater1(this);
        while (true) {
            Object interfaceDescriptor = getInterfaceDescriptor();
            if (interfaceDescriptor instanceof setProfile) {
                setProfile setprofile = (setProfile) interfaceDescriptor;
                if (setprofile.k_()) {
                    if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(TuitionPaymentFragmentspecialinlinedviewModeldefault1, this, interfaceDescriptor, getinputtimebase)) {
                        break;
                    }
                } else {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2(setprofile);
                }
            } else {
                if (!(interfaceDescriptor instanceof MimeInfoBuilder)) {
                    if (z) {
                        Object interfaceDescriptor2 = getInterfaceDescriptor();
                        isVivoY91i isvivoy91i = interfaceDescriptor2 instanceof isVivoY91i ? (isVivoY91i) interfaceDescriptor2 : null;
                        getinputtimebase.TuitionPaymentFragmentspecialinlinedviewModeldefault3(isvivoy91i != null ? isvivoy91i.TuitionPaymentFragmentbindingInflater1 : null);
                    }
                    return AutoValue_AudioEncoderConfigBuilder.INSTANCE;
                }
                MimeInfoBuilder mimeInfoBuilder = (MimeInfoBuilder) interfaceDescriptor;
                AutoValue_AudioEncoderConfig tuitionPaymentFragmentbindingInflater1 = mimeInfoBuilder.getTuitionPaymentFragmentbindingInflater1();
                if (tuitionPaymentFragmentbindingInflater1 != null) {
                    if (getinputtimebase.TuitionPaymentFragmentspecialinlinedviewModeldefault2()) {
                        TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater2 = mimeInfoBuilder instanceof TuitionPaymentFragmentbindingInflater1 ? (TuitionPaymentFragmentbindingInflater1) mimeInfoBuilder : null;
                        Throwable thTuitionPaymentFragmentspecialinlinedviewModeldefault2 = tuitionPaymentFragmentbindingInflater2 != null ? tuitionPaymentFragmentbindingInflater2.TuitionPaymentFragmentspecialinlinedviewModeldefault2() : null;
                        if (thTuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
                            zTuitionPaymentFragmentspecialinlinedviewModeldefault2 = tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(getinputtimebase, 5);
                        } else {
                            if (z) {
                                getinputtimebase.TuitionPaymentFragmentspecialinlinedviewModeldefault3(thTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                            }
                            return AutoValue_AudioEncoderConfigBuilder.INSTANCE;
                        }
                    } else {
                        zTuitionPaymentFragmentspecialinlinedviewModeldefault2 = tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(getinputtimebase, 1);
                    }
                    if (zTuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        break;
                    }
                } else {
                    Intrinsics.checkNotNull(interfaceDescriptor, "");
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3((getInputTimebase) interfaceDescriptor);
                }
            }
        }
        return getinputtimebase;
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(setProfile setprofile) {
        AutoValue_AudioEncoderConfig autoValue_AudioEncoderConfig = new AutoValue_AudioEncoderConfig();
        AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(TuitionPaymentFragmentspecialinlinedviewModeldefault1, this, setprofile, setprofile.k_() ? autoValue_AudioEncoderConfig : new getDynamicRangeDefaultMime(autoValue_AudioEncoderConfig));
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(getInputTimebase getinputtimebase) {
        getinputtimebase.TuitionPaymentFragmentbindingInflater1(new AutoValue_AudioEncoderConfig());
        AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(TuitionPaymentFragmentspecialinlinedviewModeldefault1, this, getinputtimebase, getinputtimebase.d());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return "Job was cancelled";
    }

    public void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Throwable th) throws Throwable {
        g(th);
    }

    @Override // defpackage.isHuaweiP40Lite
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(AutoValue_AudioEncoderConfig1 autoValue_AudioEncoderConfig1) throws Throwable {
        g(autoValue_AudioEncoderConfig1);
    }

    public boolean asInterface(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return g(th) && o_();
    }

    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(Throwable th) {
        return g(th);
    }

    public final boolean g(Object obj) throws Throwable {
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault1 = AudioEncoderInfo.b;
        if (t_() && (objTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(obj)) == AudioEncoderInfo.TuitionPaymentFragmentbindingInflater1) {
            return true;
        }
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault1 == AudioEncoderInfo.b) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(obj);
        }
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault1 == AudioEncoderInfo.b || objTuitionPaymentFragmentspecialinlinedviewModeldefault1 == AudioEncoderInfo.TuitionPaymentFragmentbindingInflater1) {
            return true;
        }
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault1 == AudioEncoderInfo.f67a) {
            return false;
        }
        a_(objTuitionPaymentFragmentspecialinlinedviewModeldefault1);
        return true;
    }

    @Override // defpackage.AutoValue_AudioEncoderConfig1
    public final CancellationException onTransact() {
        Throwable thTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        Object interfaceDescriptor = getInterfaceDescriptor();
        if (interfaceDescriptor instanceof TuitionPaymentFragmentbindingInflater1) {
            thTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ((TuitionPaymentFragmentbindingInflater1) interfaceDescriptor).TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        } else if (interfaceDescriptor instanceof isVivoY91i) {
            thTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ((isVivoY91i) interfaceDescriptor).TuitionPaymentFragmentbindingInflater1;
        } else {
            if (interfaceDescriptor instanceof MimeInfoBuilder) {
                throw new IllegalStateException("Cannot be cancelling child in this state: ".concat(String.valueOf(interfaceDescriptor)).toString());
            }
            thTuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
        }
        CancellationException cancellationException = thTuitionPaymentFragmentspecialinlinedviewModeldefault2 instanceof CancellationException ? (CancellationException) thTuitionPaymentFragmentspecialinlinedviewModeldefault2 : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        StringBuilder sb = new StringBuilder("Parent job is ");
        sb.append(d(interfaceDescriptor));
        return new JobCancellationException(sb.toString(), thTuitionPaymentFragmentspecialinlinedviewModeldefault2, this);
    }

    private final Throwable b(Object obj) {
        if (obj == null || (obj instanceof Throwable)) {
            Throwable th = (Throwable) obj;
            return th == null ? new JobCancellationException(TuitionPaymentFragmentspecialinlinedviewModeldefault3(), null, this) : th;
        }
        Intrinsics.checkNotNull(obj, "");
        return ((AutoValue_AudioEncoderConfig1) obj).onTransact();
    }

    private final AutoValue_AudioEncoderConfig TuitionPaymentFragmentspecialinlinedviewModeldefault3(MimeInfoBuilder mimeInfoBuilder) {
        AutoValue_AudioEncoderConfig tuitionPaymentFragmentbindingInflater1 = mimeInfoBuilder.getTuitionPaymentFragmentbindingInflater1();
        if (tuitionPaymentFragmentbindingInflater1 != null) {
            return tuitionPaymentFragmentbindingInflater1;
        }
        if (mimeInfoBuilder instanceof setProfile) {
            return new AutoValue_AudioEncoderConfig();
        }
        if (mimeInfoBuilder instanceof getInputTimebase) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3((getInputTimebase) mimeInfoBuilder);
            return null;
        }
        throw new IllegalStateException("State should have list: ".concat(String.valueOf(mimeInfoBuilder)).toString());
    }

    private final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(MimeInfoBuilder mimeInfoBuilder, Throwable th) throws Throwable {
        scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        AutoValue_AudioEncoderConfig autoValue_AudioEncoderConfigTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(mimeInfoBuilder);
        if (autoValue_AudioEncoderConfigTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            return false;
        }
        if (!AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(TuitionPaymentFragmentspecialinlinedviewModeldefault1, this, mimeInfoBuilder, new TuitionPaymentFragmentbindingInflater1(autoValue_AudioEncoderConfigTuitionPaymentFragmentspecialinlinedviewModeldefault3, th))) {
            return false;
        }
        b(autoValue_AudioEncoderConfigTuitionPaymentFragmentspecialinlinedviewModeldefault3, th);
        return true;
    }

    private final Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object obj, Object obj2) {
        if (!(obj instanceof MimeInfoBuilder)) {
            return AudioEncoderInfo.b;
        }
        if ((!(obj instanceof setProfile) && !(obj instanceof getInputTimebase)) || (obj instanceof isHuaweiMate20Pro) || (obj2 instanceof isVivoY91i)) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault1((MimeInfoBuilder) obj, obj2);
        }
        return TuitionPaymentFragmentspecialinlinedviewModeldefault3((MimeInfoBuilder) obj, obj2) ? obj2 : AudioEncoderInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(MimeInfoBuilder mimeInfoBuilder, Object obj) throws Throwable {
        AutoValue_AudioEncoderConfig autoValue_AudioEncoderConfigTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(mimeInfoBuilder);
        if (autoValue_AudioEncoderConfigTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            return AudioEncoderInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
        TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = mimeInfoBuilder instanceof TuitionPaymentFragmentbindingInflater1 ? (TuitionPaymentFragmentbindingInflater1) mimeInfoBuilder : null;
        if (tuitionPaymentFragmentbindingInflater1 == null) {
            tuitionPaymentFragmentbindingInflater1 = new TuitionPaymentFragmentbindingInflater1(autoValue_AudioEncoderConfigTuitionPaymentFragmentspecialinlinedviewModeldefault3, null);
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        synchronized (tuitionPaymentFragmentbindingInflater1) {
            if (tuitionPaymentFragmentbindingInflater1.d()) {
                return AudioEncoderInfo.b;
            }
            tuitionPaymentFragmentbindingInflater1.asBinder();
            if (tuitionPaymentFragmentbindingInflater1 != mimeInfoBuilder && !AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(TuitionPaymentFragmentspecialinlinedviewModeldefault1, this, mimeInfoBuilder, tuitionPaymentFragmentbindingInflater1)) {
                return AudioEncoderInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            }
            scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            boolean zTuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            isVivoY91i isvivoy91i = obj instanceof isVivoY91i ? (isVivoY91i) obj : null;
            if (isvivoy91i != null) {
                tuitionPaymentFragmentbindingInflater1.b(isvivoy91i.TuitionPaymentFragmentbindingInflater1);
            }
            objectRef.element = zTuitionPaymentFragmentspecialinlinedviewModeldefault1 ^ true ? tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2() : 0;
            Unit unit = Unit.INSTANCE;
            Throwable th = (Throwable) objectRef.element;
            if (th != null) {
                b(autoValue_AudioEncoderConfigTuitionPaymentFragmentspecialinlinedviewModeldefault3, th);
            }
            AutoValue_AudioEncoderConfig autoValue_AudioEncoderConfig = autoValue_AudioEncoderConfigTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            isHuaweiMate20Pro ishuaweimate20proB = b((lambdasendEncodedData3) autoValue_AudioEncoderConfig);
            if (ishuaweimate20proB != null && TuitionPaymentFragmentspecialinlinedviewModeldefault2(tuitionPaymentFragmentbindingInflater1, ishuaweimate20proB, obj)) {
                return AudioEncoderInfo.TuitionPaymentFragmentbindingInflater1;
            }
            autoValue_AudioEncoderConfigTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new checkBufferInfo(2), 2);
            isHuaweiMate20Pro ishuaweimate20proB2 = b((lambdasendEncodedData3) autoValue_AudioEncoderConfig);
            if (ishuaweimate20proB2 != null && TuitionPaymentFragmentspecialinlinedviewModeldefault2(tuitionPaymentFragmentbindingInflater1, ishuaweimate20proB2, obj)) {
                return AudioEncoderInfo.TuitionPaymentFragmentbindingInflater1;
            }
            return b(tuitionPaymentFragmentbindingInflater1, obj);
        }
    }

    private final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1, isHuaweiMate20Pro ishuaweimate20pro, Object obj) {
        while (VideoMimeInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1(ishuaweimate20pro.b, false, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(this, tuitionPaymentFragmentbindingInflater1, ishuaweimate20pro, obj)) == AutoValue_AudioEncoderConfigBuilder.INSTANCE) {
            ishuaweimate20pro = b((lambdasendEncodedData3) ishuaweimate20pro);
            if (ishuaweimate20pro == null) {
                return false;
            }
        }
        return true;
    }

    private static isHuaweiMate20Pro b(lambdasendEncodedData3 lambdasendencodeddata3) {
        while (lambdasendencodeddata3.n_()) {
            lambdasendencodeddata3 = lambdasendencodeddata3.a();
        }
        while (true) {
            lambdasendencodeddata3 = lambdasendencodeddata3.d();
            if (!lambdasendencodeddata3.n_()) {
                if (lambdasendencodeddata3 instanceof isHuaweiMate20Pro) {
                    return (isHuaweiMate20Pro) lambdasendencodeddata3;
                }
                if (lambdasendencodeddata3 instanceof AutoValue_AudioEncoderConfig) {
                    return null;
                }
            }
        }
    }

    @Override // defpackage.VideoMimeInfoBuilder
    public final Sequence<VideoMimeInfoBuilder> asInterface() {
        return SequencesKt.sequence(new JobSupport$children$1(this, null));
    }

    @Override // defpackage.VideoMimeInfoBuilder
    public final ReportedVideoQualityNotSupportedQuirk TuitionPaymentFragmentspecialinlinedviewModeldefault1(isHuaweiP40Lite ishuaweip40lite) {
        isHuaweiMate20Pro ishuaweimate20pro = new isHuaweiMate20Pro(ishuaweip40lite);
        ishuaweimate20pro.TuitionPaymentFragmentbindingInflater1(this);
        while (true) {
            Object interfaceDescriptor = getInterfaceDescriptor();
            if (interfaceDescriptor instanceof setProfile) {
                setProfile setprofile = (setProfile) interfaceDescriptor;
                if (setprofile.k_()) {
                    if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(TuitionPaymentFragmentspecialinlinedviewModeldefault1, this, interfaceDescriptor, ishuaweimate20pro)) {
                        break;
                    }
                } else {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2(setprofile);
                }
            } else {
                Throwable thTuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
                if (!(interfaceDescriptor instanceof MimeInfoBuilder)) {
                    Object interfaceDescriptor2 = getInterfaceDescriptor();
                    isVivoY91i isvivoy91i = interfaceDescriptor2 instanceof isVivoY91i ? (isVivoY91i) interfaceDescriptor2 : null;
                    ishuaweimate20pro.TuitionPaymentFragmentspecialinlinedviewModeldefault3(isvivoy91i != null ? isvivoy91i.TuitionPaymentFragmentbindingInflater1 : null);
                    return AutoValue_AudioEncoderConfigBuilder.INSTANCE;
                }
                AutoValue_AudioEncoderConfig tuitionPaymentFragmentbindingInflater1 = ((MimeInfoBuilder) interfaceDescriptor).getTuitionPaymentFragmentbindingInflater1();
                if (tuitionPaymentFragmentbindingInflater1 != null) {
                    isHuaweiMate20Pro ishuaweimate20pro2 = ishuaweimate20pro;
                    if (tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(ishuaweimate20pro2, 7)) {
                        break;
                    }
                    boolean zTuitionPaymentFragmentspecialinlinedviewModeldefault2 = tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(ishuaweimate20pro2, 3);
                    Object interfaceDescriptor3 = getInterfaceDescriptor();
                    if (interfaceDescriptor3 instanceof TuitionPaymentFragmentbindingInflater1) {
                        thTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ((TuitionPaymentFragmentbindingInflater1) interfaceDescriptor3).TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    } else {
                        scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        isVivoY91i isvivoy91i2 = interfaceDescriptor3 instanceof isVivoY91i ? (isVivoY91i) interfaceDescriptor3 : null;
                        if (isvivoy91i2 != null) {
                            thTuitionPaymentFragmentspecialinlinedviewModeldefault2 = isvivoy91i2.TuitionPaymentFragmentbindingInflater1;
                        }
                    }
                    ishuaweimate20pro.TuitionPaymentFragmentspecialinlinedviewModeldefault3(thTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    if (zTuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        break;
                    }
                    return AutoValue_AudioEncoderConfigBuilder.INSTANCE;
                }
                Intrinsics.checkNotNull(interfaceDescriptor, "");
                TuitionPaymentFragmentspecialinlinedviewModeldefault3((getInputTimebase) interfaceDescriptor);
            }
        }
        return ishuaweimate20pro;
    }

    public void TuitionPaymentFragmentbindingInflater1(Throwable th) throws Throwable {
        throw th;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(p_());
        sb2.append('{');
        sb2.append(d(getInterfaceDescriptor()));
        sb2.append('}');
        sb.append(sb2.toString());
        sb.append('@');
        sb.append(resolveAudioMimeInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this));
        return sb.toString();
    }

    public String p_() {
        return resolveAudioMimeInfo.TuitionPaymentFragmentbindingInflater1(this);
    }

    private static String d(Object obj) {
        if (obj instanceof TuitionPaymentFragmentbindingInflater1) {
            TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = (TuitionPaymentFragmentbindingInflater1) obj;
            if (tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1()) {
                return "Cancelling";
            }
            return tuitionPaymentFragmentbindingInflater1.d() ? "Completing" : "Active";
        }
        if (obj instanceof MimeInfoBuilder) {
            return ((MimeInfoBuilder) obj).k_() ? "Active" : "New";
        }
        return obj instanceof isVivoY91i ? "Cancelled" : "Completed";
    }

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00060\u0002j\u0002`\u00012\u00020\u0003B!\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\t0$2\b\u0010%\u001a\u0004\u0018\u00010\tJ\u000e\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\tJ\u000e\u0010)\u001a\b\u0012\u0004\u0012\u00020\t0*H\u0002J\b\u0010+\u001a\u00020,H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\t\u0010\u000e\u001a\u00020\u000fX\u0082\u0004R$\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0006\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0015X\u0082\u0004R(\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0015X\u0082\u0004R(\u0010\u001b\u001a\u0004\u0018\u00010\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u00028B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0011\u0010 \u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b \u0010\u0011R\u0011\u0010!\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b!\u0010\u0011R\u0014\u0010\"\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u0011¨\u0006-"}, d2 = {"Lkotlinx/coroutines/JobSupport$Finishing;", "Lkotlinx/coroutines/internal/SynchronizedObject;", "", "Lkotlinx/coroutines/Incomplete;", "list", "Lkotlinx/coroutines/NodeList;", "isCompleting", "", "rootCause", "", "<init>", "(Lkotlinx/coroutines/NodeList;ZLjava/lang/Throwable;)V", "getList", "()Lkotlinx/coroutines/NodeList;", "_isCompleting", "Lkotlinx/atomicfu/AtomicBoolean;", "value", "()Z", "setCompleting", "(Z)V", "_rootCause", "Lkotlinx/atomicfu/AtomicRef;", "getRootCause", "()Ljava/lang/Throwable;", "setRootCause", "(Ljava/lang/Throwable;)V", "_exceptionsHolder", "exceptionsHolder", "getExceptionsHolder", "()Ljava/lang/Object;", "setExceptionsHolder", "(Ljava/lang/Object;)V", "isSealed", "isCancelling", "isActive", "sealLocked", "", "proposedException", "addExceptionLocked", "", "exception", "allocateList", "Ljava/util/ArrayList;", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class TuitionPaymentFragmentbindingInflater1 implements MimeInfoBuilder {
        private final AutoValue_AudioEncoderConfig TuitionPaymentFragmentbindingInflater1;
        private volatile /* synthetic */ Object _exceptionsHolder$volatile;
        private volatile /* synthetic */ int _isCompleting$volatile = 0;
        private volatile /* synthetic */ Object _rootCause$volatile;
        private static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(TuitionPaymentFragmentbindingInflater1.class, "_isCompleting$volatile");
        private static final /* synthetic */ AtomicReferenceFieldUpdater TuitionPaymentFragmentspecialinlinedviewModeldefault3 = AtomicReferenceFieldUpdater.newUpdater(TuitionPaymentFragmentbindingInflater1.class, Object.class, "_rootCause$volatile");
        private static final /* synthetic */ AtomicReferenceFieldUpdater TuitionPaymentFragmentspecialinlinedviewModeldefault1 = AtomicReferenceFieldUpdater.newUpdater(TuitionPaymentFragmentbindingInflater1.class, Object.class, "_exceptionsHolder$volatile");

        @Override // defpackage.MimeInfoBuilder
        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from getter */
        public final AutoValue_AudioEncoderConfig getTuitionPaymentFragmentbindingInflater1() {
            return this.TuitionPaymentFragmentbindingInflater1;
        }

        public TuitionPaymentFragmentbindingInflater1(AutoValue_AudioEncoderConfig autoValue_AudioEncoderConfig, Throwable th) {
            this.TuitionPaymentFragmentbindingInflater1 = autoValue_AudioEncoderConfig;
            this._rootCause$volatile = th;
        }

        public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault2() != null;
        }

        @Override // defpackage.MimeInfoBuilder
        public final boolean k_() {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault2() == null;
        }

        public final List<Throwable> TuitionPaymentFragmentspecialinlinedviewModeldefault2(Throwable th) {
            AbstractList abstractListA;
            Object objTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1();
            if (objTuitionPaymentFragmentbindingInflater1 == null) {
                abstractListA = a();
            } else if (objTuitionPaymentFragmentbindingInflater1 instanceof Throwable) {
                AbstractList abstractListA2 = a();
                abstractListA2.add(objTuitionPaymentFragmentbindingInflater1);
                abstractListA = abstractListA2;
            } else {
                if (!(objTuitionPaymentFragmentbindingInflater1 instanceof ArrayList)) {
                    throw new IllegalStateException("State is ".concat(String.valueOf(objTuitionPaymentFragmentbindingInflater1)).toString());
                }
                abstractListA = (ArrayList) objTuitionPaymentFragmentbindingInflater1;
            }
            Throwable thTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            if (thTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                abstractListA.add(0, thTuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
            if (th != null && !Intrinsics.areEqual(th, thTuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
                abstractListA.add(th);
            }
            b(AudioEncoderInfo.asBinder);
            return abstractListA;
        }

        public final void b(Throwable th) {
            Throwable thTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            if (thTuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
                TuitionPaymentFragmentbindingInflater1(th);
                return;
            }
            if (th != thTuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                Object objTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1();
                if (objTuitionPaymentFragmentbindingInflater1 == null) {
                    b((Object) th);
                    return;
                }
                if (!(objTuitionPaymentFragmentbindingInflater1 instanceof Throwable)) {
                    if (!(objTuitionPaymentFragmentbindingInflater1 instanceof ArrayList)) {
                        throw new IllegalStateException("State is ".concat(String.valueOf(objTuitionPaymentFragmentbindingInflater1)).toString());
                    }
                    ((ArrayList) objTuitionPaymentFragmentbindingInflater1).add(th);
                } else {
                    if (th == objTuitionPaymentFragmentbindingInflater1) {
                        return;
                    }
                    AbstractCollection abstractCollectionA = a();
                    abstractCollectionA.add(objTuitionPaymentFragmentbindingInflater1);
                    abstractCollectionA.add(th);
                    b(abstractCollectionA);
                }
            }
        }

        private static ArrayList<Throwable> a() {
            return new ArrayList<>(4);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Finishing[cancelling=");
            sb.append(TuitionPaymentFragmentspecialinlinedviewModeldefault1());
            sb.append(", completing=");
            sb.append(d());
            sb.append(", rootCause=");
            sb.append(TuitionPaymentFragmentspecialinlinedviewModeldefault2());
            sb.append(", exceptions=");
            sb.append(TuitionPaymentFragmentbindingInflater1());
            sb.append(", list=");
            sb.append(getTuitionPaymentFragmentbindingInflater1());
            sb.append(']');
            return sb.toString();
        }

        final Object TuitionPaymentFragmentbindingInflater1() {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(this);
        }

        private final void b(Object obj) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault1.set(this, obj);
        }

        public final Throwable TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            return (Throwable) TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(this);
        }

        public final boolean d() {
            return b.get(this) != 0;
        }

        public final void asBinder() {
            b.set(this, 1);
        }

        private void TuitionPaymentFragmentbindingInflater1(Throwable th) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3.set(this, th);
        }
    }

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 extends getInputTimebase {
        private final AudioEncoderConfigBuilder TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private final isHuaweiMate20Pro TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private final TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private final Object b;

        @Override // defpackage.getInputTimebase
        public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            return false;
        }

        public TuitionPaymentFragmentspecialinlinedviewModeldefault3(AudioEncoderConfigBuilder audioEncoderConfigBuilder, TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1, isHuaweiMate20Pro ishuaweimate20pro, Object obj) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = audioEncoderConfigBuilder;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = tuitionPaymentFragmentbindingInflater1;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = ishuaweimate20pro;
            this.b = obj;
        }

        @Override // defpackage.getInputTimebase
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Throwable th) {
            AudioEncoderConfigBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.b);
        }
    }

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1<T> extends CancellableContinuationImpl<T> {
        private final AudioEncoderConfigBuilder TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault1(Continuation<? super T> continuation, AudioEncoderConfigBuilder audioEncoderConfigBuilder) {
            super(continuation, 1);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = audioEncoderConfigBuilder;
        }

        @Override // kotlinx.coroutines.CancellableContinuationImpl
        public final Throwable TuitionPaymentFragmentbindingInflater1(VideoMimeInfoBuilder videoMimeInfoBuilder) {
            Throwable thTuitionPaymentFragmentspecialinlinedviewModeldefault2;
            Object interfaceDescriptor = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getInterfaceDescriptor();
            if (!(interfaceDescriptor instanceof TuitionPaymentFragmentbindingInflater1) || (thTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ((TuitionPaymentFragmentbindingInflater1) interfaceDescriptor).TuitionPaymentFragmentspecialinlinedviewModeldefault2()) == null) {
                return interfaceDescriptor instanceof isVivoY91i ? ((isVivoY91i) interfaceDescriptor).TuitionPaymentFragmentbindingInflater1 : videoMimeInfoBuilder.s_();
            }
            return thTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }

        @Override // kotlinx.coroutines.CancellableContinuationImpl
        public final String TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            return "AwaitContinuation";
        }
    }

    public final Object cancelAll() throws Throwable {
        Object interfaceDescriptor = getInterfaceDescriptor();
        if (interfaceDescriptor instanceof MimeInfoBuilder) {
            throw new IllegalStateException("This job has not completed yet".toString());
        }
        if (interfaceDescriptor instanceof isVivoY91i) {
            throw ((isVivoY91i) interfaceDescriptor).TuitionPaymentFragmentbindingInflater1;
        }
        return AudioEncoderInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3(interfaceDescriptor);
    }

    protected final Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Continuation<Object> continuation) throws Throwable {
        Object interfaceDescriptor;
        do {
            interfaceDescriptor = getInterfaceDescriptor();
            if (!(interfaceDescriptor instanceof MimeInfoBuilder)) {
                if (interfaceDescriptor instanceof isVivoY91i) {
                    Throwable th = ((isVivoY91i) interfaceDescriptor).TuitionPaymentFragmentbindingInflater1;
                    if (scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault1() && (continuation instanceof CoroutineStackFrame)) {
                        throw reachEndData.TuitionPaymentFragmentbindingInflater1(th, (CoroutineStackFrame) continuation);
                    }
                    throw th;
                }
                return AudioEncoderInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3(interfaceDescriptor);
            }
        } while (a(interfaceDescriptor) < 0);
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = new TuitionPaymentFragmentspecialinlinedviewModeldefault1(IntrinsicsKt.intercepted(continuation), this);
        tuitionPaymentFragmentspecialinlinedviewModeldefault1.initCancellability();
        MediaStoreVideoCannotWrite.b(tuitionPaymentFragmentspecialinlinedviewModeldefault1, VideoMimeInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this, true, new getIFrameInterval(tuitionPaymentFragmentspecialinlinedviewModeldefault1)));
        Object result = tuitionPaymentFragmentspecialinlinedviewModeldefault1.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    @Override // defpackage.VideoMimeInfoBuilder
    public final boolean INotificationSideChannel() {
        int iA;
        do {
            iA = a(getInterfaceDescriptor());
            if (iA == 0) {
                return false;
            }
        } while (iA != 1);
        return true;
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(getInputTimebase getinputtimebase) {
        Object interfaceDescriptor;
        do {
            interfaceDescriptor = getInterfaceDescriptor();
            if (!(interfaceDescriptor instanceof getInputTimebase)) {
                if (!(interfaceDescriptor instanceof MimeInfoBuilder) || ((MimeInfoBuilder) interfaceDescriptor).getTuitionPaymentFragmentbindingInflater1() == null) {
                    return;
                }
                getinputtimebase.q_();
                return;
            }
            if (interfaceDescriptor != getinputtimebase) {
                return;
            }
        } while (!AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(TuitionPaymentFragmentspecialinlinedviewModeldefault1, this, interfaceDescriptor, AudioEncoderInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2));
    }

    @Override // defpackage.VideoMimeInfoBuilder
    public void TuitionPaymentFragmentspecialinlinedviewModeldefault1(CancellationException cancellationException) throws Throwable {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(TuitionPaymentFragmentspecialinlinedviewModeldefault3(), null, this);
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault2((Throwable) cancellationException);
    }

    private final Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object obj) {
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        do {
            Object interfaceDescriptor = getInterfaceDescriptor();
            if (!(interfaceDescriptor instanceof MimeInfoBuilder) || ((interfaceDescriptor instanceof TuitionPaymentFragmentbindingInflater1) && ((TuitionPaymentFragmentbindingInflater1) interfaceDescriptor).d())) {
                return AudioEncoderInfo.b;
            }
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(interfaceDescriptor, new isVivoY91i(b(obj), false, 2, null));
        } while (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == AudioEncoderInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        return objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object obj) throws Throwable {
        Object[] objArr = 0;
        Throwable thB = null;
        while (true) {
            Object interfaceDescriptor = getInterfaceDescriptor();
            if (!(interfaceDescriptor instanceof TuitionPaymentFragmentbindingInflater1)) {
                if (!(interfaceDescriptor instanceof MimeInfoBuilder)) {
                    return AudioEncoderInfo.f67a;
                }
                if (thB == null) {
                    thB = b(obj);
                }
                MimeInfoBuilder mimeInfoBuilder = (MimeInfoBuilder) interfaceDescriptor;
                if (mimeInfoBuilder.k_()) {
                    if (TuitionPaymentFragmentspecialinlinedviewModeldefault3(mimeInfoBuilder, thB)) {
                        return AudioEncoderInfo.b;
                    }
                } else {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(interfaceDescriptor, new isVivoY91i(thB, false, 2, objArr == true ? 1 : 0));
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 != AudioEncoderInfo.b) {
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 != AudioEncoderInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                            return objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        }
                    } else {
                        throw new IllegalStateException("Cannot happen in ".concat(String.valueOf(interfaceDescriptor)).toString());
                    }
                }
            } else {
                synchronized (interfaceDescriptor) {
                    if (((TuitionPaymentFragmentbindingInflater1) interfaceDescriptor).TuitionPaymentFragmentbindingInflater1() == AudioEncoderInfo.asBinder) {
                        return AudioEncoderInfo.f67a;
                    }
                    boolean zTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ((TuitionPaymentFragmentbindingInflater1) interfaceDescriptor).TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    if (obj != null || !zTuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                        if (thB == null) {
                            thB = b(obj);
                        }
                        ((TuitionPaymentFragmentbindingInflater1) interfaceDescriptor).b(thB);
                    }
                    Throwable thTuitionPaymentFragmentspecialinlinedviewModeldefault2 = zTuitionPaymentFragmentspecialinlinedviewModeldefault1 ? null : ((TuitionPaymentFragmentbindingInflater1) interfaceDescriptor).TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    if (thTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                        b(((TuitionPaymentFragmentbindingInflater1) interfaceDescriptor).getTuitionPaymentFragmentbindingInflater1(), thTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    }
                    return AudioEncoderInfo.b;
                }
            }
        }
    }

    public final boolean asInterface(Object obj) {
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        do {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(getInterfaceDescriptor(), obj);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == AudioEncoderInfo.b) {
                return false;
            }
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == AudioEncoderInfo.TuitionPaymentFragmentbindingInflater1) {
                return true;
            }
        } while (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == AudioEncoderInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        a_(objTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        return true;
    }

    public final Object asBinder(Object obj) {
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        do {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(getInterfaceDescriptor(), obj);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == AudioEncoderInfo.b) {
                StringBuilder sb = new StringBuilder("Job ");
                sb.append(this);
                sb.append(" is already complete or completing, but is being completed with ");
                sb.append(obj);
                String string = sb.toString();
                isVivoY91i isvivoy91i = obj instanceof isVivoY91i ? (isVivoY91i) obj : null;
                throw new IllegalStateException(string, isvivoy91i != null ? isvivoy91i.TuitionPaymentFragmentbindingInflater1 : null);
            }
        } while (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == AudioEncoderInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        return objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    public static final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(AudioEncoderConfigBuilder audioEncoderConfigBuilder, TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1, isHuaweiMate20Pro ishuaweimate20pro, Object obj) {
        scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        isHuaweiMate20Pro ishuaweimate20pro2 = ishuaweimate20pro;
        isHuaweiMate20Pro ishuaweimate20proB = b((lambdasendEncodedData3) ishuaweimate20pro2);
        if (ishuaweimate20proB == null || !audioEncoderConfigBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault2(tuitionPaymentFragmentbindingInflater1, ishuaweimate20proB, obj)) {
            tuitionPaymentFragmentbindingInflater1.getTuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(new checkBufferInfo(2), 2);
            isHuaweiMate20Pro ishuaweimate20proB2 = b((lambdasendEncodedData3) ishuaweimate20pro2);
            if (ishuaweimate20proB2 == null || !audioEncoderConfigBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault2(tuitionPaymentFragmentbindingInflater1, ishuaweimate20proB2, obj)) {
                audioEncoderConfigBuilder.a_(audioEncoderConfigBuilder.b(tuitionPaymentFragmentbindingInflater1, obj));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003e  */
    private final void b(AutoValue_AudioEncoderConfig autoValue_AudioEncoderConfig, Throwable th) throws Throwable {
        autoValue_AudioEncoderConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new checkBufferInfo(4), 4);
        AutoValue_AudioEncoderConfig autoValue_AudioEncoderConfig2 = autoValue_AudioEncoderConfig;
        Object objAsBinder = autoValue_AudioEncoderConfig2.asBinder();
        Intrinsics.checkNotNull(objAsBinder, "");
        CompletionHandlerException completionHandlerException = null;
        for (lambdasendEncodedData3 lambdasendencodeddata3D = (lambdasendEncodedData3) objAsBinder; !Intrinsics.areEqual(lambdasendencodeddata3D, autoValue_AudioEncoderConfig2); lambdasendencodeddata3D = lambdasendencodeddata3D.d()) {
            if ((lambdasendencodeddata3D instanceof getInputTimebase) && ((getInputTimebase) lambdasendencodeddata3D).TuitionPaymentFragmentspecialinlinedviewModeldefault2()) {
                try {
                    ((getInputTimebase) lambdasendencodeddata3D).TuitionPaymentFragmentspecialinlinedviewModeldefault3(th);
                } catch (Throwable th2) {
                    CompletionHandlerException completionHandlerException2 = completionHandlerException;
                    if (completionHandlerException2 != null) {
                        ExceptionsKt.addSuppressed(completionHandlerException2, th2);
                        if (completionHandlerException2 == null) {
                            StringBuilder sb = new StringBuilder("Exception in completion handler ");
                            sb.append(lambdasendencodeddata3D);
                            sb.append(" for ");
                            sb.append(this);
                            completionHandlerException = new CompletionHandlerException(sb.toString(), th2);
                            Unit unit = Unit.INSTANCE;
                        }
                    } else {
                        StringBuilder sb2 = new StringBuilder("Exception in completion handler ");
                        sb2.append(lambdasendencodeddata3D);
                        sb2.append(" for ");
                        sb2.append(this);
                        completionHandlerException = new CompletionHandlerException(sb2.toString(), th2);
                        Unit unit2 = Unit.INSTANCE;
                    }
                }
            }
        }
        CompletionHandlerException completionHandlerException3 = completionHandlerException;
        if (completionHandlerException3 != null) {
            TuitionPaymentFragmentbindingInflater1((Throwable) completionHandlerException3);
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(th);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0038  */
    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(AutoValue_AudioEncoderConfig autoValue_AudioEncoderConfig, Throwable th) throws Throwable {
        autoValue_AudioEncoderConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new checkBufferInfo(1), 1);
        AutoValue_AudioEncoderConfig autoValue_AudioEncoderConfig2 = autoValue_AudioEncoderConfig;
        Object objAsBinder = autoValue_AudioEncoderConfig2.asBinder();
        Intrinsics.checkNotNull(objAsBinder, "");
        CompletionHandlerException completionHandlerException = null;
        for (lambdasendEncodedData3 lambdasendencodeddata3D = (lambdasendEncodedData3) objAsBinder; !Intrinsics.areEqual(lambdasendencodeddata3D, autoValue_AudioEncoderConfig2); lambdasendencodeddata3D = lambdasendencodeddata3D.d()) {
            if (lambdasendencodeddata3D instanceof getInputTimebase) {
                try {
                    ((getInputTimebase) lambdasendencodeddata3D).TuitionPaymentFragmentspecialinlinedviewModeldefault3(th);
                } catch (Throwable th2) {
                    CompletionHandlerException completionHandlerException2 = completionHandlerException;
                    if (completionHandlerException2 != null) {
                        ExceptionsKt.addSuppressed(completionHandlerException2, th2);
                        if (completionHandlerException2 == null) {
                            StringBuilder sb = new StringBuilder("Exception in completion handler ");
                            sb.append(lambdasendencodeddata3D);
                            sb.append(" for ");
                            sb.append(this);
                            completionHandlerException = new CompletionHandlerException(sb.toString(), th2);
                            Unit unit = Unit.INSTANCE;
                        }
                    } else {
                        StringBuilder sb2 = new StringBuilder("Exception in completion handler ");
                        sb2.append(lambdasendencodeddata3D);
                        sb2.append(" for ");
                        sb2.append(this);
                        completionHandlerException = new CompletionHandlerException(sb2.toString(), th2);
                        Unit unit2 = Unit.INSTANCE;
                    }
                }
            }
        }
        CompletionHandlerException completionHandlerException3 = completionHandlerException;
        if (completionHandlerException3 != null) {
            TuitionPaymentFragmentbindingInflater1((Throwable) completionHandlerException3);
        }
    }

    public final ReportedVideoQualityNotSupportedQuirk INotificationSideChannelStub() {
        return (ReportedVideoQualityNotSupportedQuirk) TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(this);
    }

    public final Object getInterfaceDescriptor() {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(this);
    }

    @Override // defpackage.VideoMimeInfoBuilder
    public final Object a_(Continuation<? super Unit> continuation) {
        Object interfaceDescriptor;
        do {
            interfaceDescriptor = getInterfaceDescriptor();
            if (!(interfaceDescriptor instanceof MimeInfoBuilder)) {
                VideoMimeInfoBuilder videoMimeInfoBuilder = (VideoMimeInfoBuilder) continuation.get$context().get(VideoMimeInfoBuilder.b);
                if (videoMimeInfoBuilder != null) {
                    VideoMimeInfo.b(videoMimeInfoBuilder);
                }
                return Unit.INSTANCE;
            }
        } while (a(interfaceDescriptor) < 0);
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        MediaStoreVideoCannotWrite.b(cancellableContinuationImpl2, VideoMimeInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this, true, new AutoValue_VideoEncoderConfig1(cancellableContinuationImpl2)));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        if (result != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            result = Unit.INSTANCE;
        }
        return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return CoroutineContext.Element.DefaultImpls.plus(this, coroutineContext);
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault2(ReportedVideoQualityNotSupportedQuirk reportedVideoQualityNotSupportedQuirk) {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3.set(this, reportedVideoQualityNotSupportedQuirk);
    }
}
