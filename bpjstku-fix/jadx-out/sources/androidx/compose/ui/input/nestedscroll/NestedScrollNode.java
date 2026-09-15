package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.TraversableNodeKt;
import androidx.compose.ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u00020\u00192\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001f\u0010\u001dJ\u000f\u0010 \u001a\u00020\u0019H\u0002¢\u0006\u0004\b \u0010\u001dJ!\u0010!\u001a\u00020\u00192\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b!\u0010\bR\"\u0010\"\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u0016\u0010(\u001a\u00020\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b(\u0010)R$\u0010*\u001a\u0004\u0018\u00010\u00008\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0016\u00101\u001a\u0004\u0018\u00010\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b0\u0010-R\u0016\u00103\u001a\u0004\u0018\u00010\u00028CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b2\u0010%R\u001a\u00105\u001a\u0002048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001a\u0010=\u001a\u0002098CX\u0082\u0004¢\u0006\f\u0012\u0004\b<\u0010\u001d\u001a\u0004\b:\u0010;"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollNode;", "Landroidx/compose/ui/node/TraversableNode;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "Landroidx/compose/ui/Modifier$Node;", "p0", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "p1", "<init>", "(Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;)V", "Landroidx/compose/ui/geometry/Offset;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "onPreScroll-OzD1aCk", "(JI)J", "onPreScroll", "p2", "onPostScroll-DzOQY0M", "(JJI)J", "onPostScroll", "Landroidx/compose/ui/unit/Velocity;", "onPreFling-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPreFling", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostFling", "", "updateDispatcher", "(Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;)V", "onAttach", "()V", "onDetach", "updateDispatcherFields", "resetDispatcherFields", "updateNode$ui_release", "connection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "getConnection", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "setConnection", "(Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;)V", "resolvedDispatcher", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "lastKnownParentNode", "Landroidx/compose/ui/input/nestedscroll/NestedScrollNode;", "getLastKnownParentNode$ui_release", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollNode;", "setLastKnownParentNode$ui_release", "(Landroidx/compose/ui/input/nestedscroll/NestedScrollNode;)V", "getParentNestedScrollNode$ui_release", "parentNestedScrollNode", "getParentConnection", "parentConnection", "", "traverseKey", "Ljava/lang/Object;", "getTraverseKey", "()Ljava/lang/Object;", "Lkotlinx/coroutines/CoroutineScope;", "getNestedCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "getNestedCoroutineScope$annotations", "nestedCoroutineScope"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NestedScrollNode extends Modifier.Node implements TraversableNode, NestedScrollConnection {
    public static final int $stable = 8;
    private NestedScrollConnection connection;
    private NestedScrollNode lastKnownParentNode;
    private NestedScrollDispatcher resolvedDispatcher;
    private final Object traverseKey;

    private static /* synthetic */ void getNestedCoroutineScope$annotations() {
    }

    public final NestedScrollConnection getConnection() {
        return this.connection;
    }

    public final void setConnection(NestedScrollConnection nestedScrollConnection) {
        this.connection = nestedScrollConnection;
    }

    public NestedScrollNode(NestedScrollConnection nestedScrollConnection, NestedScrollDispatcher nestedScrollDispatcher) {
        this.connection = nestedScrollConnection;
        this.resolvedDispatcher = nestedScrollDispatcher == null ? new NestedScrollDispatcher() : nestedScrollDispatcher;
        this.traverseKey = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    /* JADX INFO: renamed from: getLastKnownParentNode$ui_release, reason: from getter */
    public final NestedScrollNode getLastKnownParentNode() {
        return this.lastKnownParentNode;
    }

    public final void setLastKnownParentNode$ui_release(NestedScrollNode nestedScrollNode) {
        this.lastKnownParentNode = nestedScrollNode;
    }

    public final NestedScrollNode getParentNestedScrollNode$ui_release() {
        if (getIsAttached()) {
            return (NestedScrollNode) TraversableNodeKt.findNearestAncestor(this);
        }
        return null;
    }

    private final NestedScrollConnection getParentConnection() {
        if (getIsAttached()) {
            return getParentNestedScrollNode$ui_release();
        }
        return null;
    }

    @Override // androidx.compose.ui.node.TraversableNode
    public final Object getTraverseKey() {
        return this.traverseKey;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CoroutineScope getNestedCoroutineScope() {
        CoroutineScope nestedCoroutineScope;
        if (ComposeUiFlags.isNestedScrollDispatcherNodeFixEnabled) {
            NestedScrollNode parentNestedScrollNode$ui_release = getParentNestedScrollNode$ui_release();
            CoroutineScope nestedCoroutineScope2 = parentNestedScrollNode$ui_release != null ? parentNestedScrollNode$ui_release.getNestedCoroutineScope() : null;
            if (nestedCoroutineScope2 != null && CoroutineScopeKt.TuitionPaymentFragmentspecialinlinedviewModeldefault2(nestedCoroutineScope2)) {
                return nestedCoroutineScope2;
            }
            CoroutineScope scope$ui_release = this.resolvedDispatcher.getScope();
            if (scope$ui_release != null) {
                return scope$ui_release;
            }
            throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        }
        NestedScrollNode parentNestedScrollNode$ui_release2 = getParentNestedScrollNode$ui_release();
        if (parentNestedScrollNode$ui_release2 != null && (nestedCoroutineScope = parentNestedScrollNode$ui_release2.getNestedCoroutineScope()) != null) {
            return nestedCoroutineScope;
        }
        CoroutineScope scope$ui_release2 = this.resolvedDispatcher.getScope();
        if (scope$ui_release2 != null) {
            return scope$ui_release2;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPreScroll-OzD1aCk */
    public final long mo1078onPreScrollOzD1aCk(long p0, int p1) {
        NestedScrollConnection parentConnection = getParentConnection();
        long jMo1078onPreScrollOzD1aCk = parentConnection != null ? parentConnection.mo1078onPreScrollOzD1aCk(p0, p1) : Offset.INSTANCE.m3990getZeroF1C5BW0();
        return Offset.m3979plusMKHz9U(jMo1078onPreScrollOzD1aCk, this.connection.mo1078onPreScrollOzD1aCk(Offset.m3978minusMKHz9U(p0, jMo1078onPreScrollOzD1aCk), p1));
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPostScroll-DzOQY0M */
    public final long mo804onPostScrollDzOQY0M(long p0, long p1, int p2) {
        long jM3990getZeroF1C5BW0;
        long jMo804onPostScrollDzOQY0M = this.connection.mo804onPostScrollDzOQY0M(p0, p1, p2);
        NestedScrollConnection parentConnection = getParentConnection();
        if (parentConnection != null) {
            jM3990getZeroF1C5BW0 = parentConnection.mo804onPostScrollDzOQY0M(Offset.m3979plusMKHz9U(p0, jMo804onPostScrollDzOQY0M), Offset.m3978minusMKHz9U(p1, jMo804onPostScrollDzOQY0M), p2);
        } else {
            jM3990getZeroF1C5BW0 = Offset.INSTANCE.m3990getZeroF1C5BW0();
        }
        return Offset.m3979plusMKHz9U(jMo804onPostScrollDzOQY0M, jM3990getZeroF1C5BW0);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
    
        if (r9 != r1) goto L20;
     */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPreFling-QWom1Mo */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo1077onPreFlingQWom1Mo(long r7, kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPreFling$1
            if (r0 == 0) goto L14
            r0 = r9
            androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPreFling$1 r0 = (androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPreFling$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r9 = r0.label
            int r9 = r9 + r2
            r0.label = r9
            goto L19
        L14:
            androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPreFling$1 r0 = new androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPreFling$1
            r0.<init>(r6, r9)
        L19:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            long r7 = r0.J$0
            kotlin.ResultKt.throwOnFailure(r9)
            goto L6f
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            long r7 = r0.J$0
            kotlin.ResultKt.throwOnFailure(r9)
            goto L50
        L3d:
            kotlin.ResultKt.throwOnFailure(r9)
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r9 = r6.getParentConnection()
            if (r9 == 0) goto L57
            r0.J$0 = r7
            r0.label = r4
            java.lang.Object r9 = r9.mo1077onPreFlingQWom1Mo(r7, r0)
            if (r9 == r1) goto L6d
        L50:
            androidx.compose.ui.unit.Velocity r9 = (androidx.compose.ui.unit.Velocity) r9
            long r4 = r9.getPackedValue()
            goto L5d
        L57:
            androidx.compose.ui.unit.Velocity$Companion r9 = androidx.compose.ui.unit.Velocity.INSTANCE
            long r4 = r9.m7184getZero9UxMQ8M()
        L5d:
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r9 = r6.connection
            long r7 = androidx.compose.ui.unit.Velocity.m7176minusAH228Gc(r7, r4)
            r0.J$0 = r4
            r0.label = r3
            java.lang.Object r9 = r9.mo1077onPreFlingQWom1Mo(r7, r0)
            if (r9 != r1) goto L6e
        L6d:
            return r1
        L6e:
            r7 = r4
        L6f:
            androidx.compose.ui.unit.Velocity r9 = (androidx.compose.ui.unit.Velocity) r9
            long r0 = r9.getPackedValue()
            long r7 = androidx.compose.ui.unit.Velocity.m7177plusAH228Gc(r7, r0)
            androidx.compose.ui.unit.Velocity r7 = androidx.compose.ui.unit.Velocity.m7164boximpl(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.NestedScrollNode.mo1077onPreFlingQWom1Mo(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPostFling-RZ2iAVY */
    public final Object mo803onPostFlingRZ2iAVY(long j, long j2, Continuation<? super Velocity> continuation) {
        NestedScrollNode$onPostFling$1 nestedScrollNode$onPostFling$1;
        long j3;
        long j4;
        long packedValue;
        long jM7184getZero9UxMQ8M;
        long j5;
        if (continuation instanceof NestedScrollNode$onPostFling$1) {
            nestedScrollNode$onPostFling$1 = (NestedScrollNode$onPostFling$1) continuation;
            if ((nestedScrollNode$onPostFling$1.label & Integer.MIN_VALUE) != 0) {
                nestedScrollNode$onPostFling$1.label -= Integer.MIN_VALUE;
            } else {
                nestedScrollNode$onPostFling$1 = new NestedScrollNode$onPostFling$1(this, continuation);
            }
        } else {
            nestedScrollNode$onPostFling$1 = new NestedScrollNode$onPostFling$1(this, continuation);
        }
        Object objMo803onPostFlingRZ2iAVY = nestedScrollNode$onPostFling$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = nestedScrollNode$onPostFling$1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objMo803onPostFlingRZ2iAVY);
            NestedScrollConnection nestedScrollConnection = this.connection;
            j3 = j;
            nestedScrollNode$onPostFling$1.J$0 = j3;
            j4 = j2;
            nestedScrollNode$onPostFling$1.J$1 = j4;
            nestedScrollNode$onPostFling$1.label = 1;
            objMo803onPostFlingRZ2iAVY = nestedScrollConnection.mo803onPostFlingRZ2iAVY(j, j2, nestedScrollNode$onPostFling$1);
            if (objMo803onPostFlingRZ2iAVY != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i == 1) {
            long j6 = nestedScrollNode$onPostFling$1.J$1;
            long j7 = nestedScrollNode$onPostFling$1.J$0;
            ResultKt.throwOnFailure(objMo803onPostFlingRZ2iAVY);
            j4 = j6;
            j3 = j7;
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j5 = nestedScrollNode$onPostFling$1.J$0;
            ResultKt.throwOnFailure(objMo803onPostFlingRZ2iAVY);
        }
        jM7184getZero9UxMQ8M = ((Velocity) objMo803onPostFlingRZ2iAVY).getPackedValue();
        packedValue = j5;
        return Velocity.m7164boximpl(Velocity.m7177plusAH228Gc(packedValue, jM7184getZero9UxMQ8M));
        packedValue = ((Velocity) objMo803onPostFlingRZ2iAVY).getPackedValue();
        NestedScrollConnection parentConnection = getIsAttached() ? getParentConnection() : this.lastKnownParentNode;
        if (parentConnection != null) {
            long jM7177plusAH228Gc = Velocity.m7177plusAH228Gc(j3, packedValue);
            long jM7176minusAH228Gc = Velocity.m7176minusAH228Gc(j4, packedValue);
            nestedScrollNode$onPostFling$1.J$0 = packedValue;
            nestedScrollNode$onPostFling$1.label = 2;
            objMo803onPostFlingRZ2iAVY = parentConnection.mo803onPostFlingRZ2iAVY(jM7177plusAH228Gc, jM7176minusAH228Gc, nestedScrollNode$onPostFling$1);
            if (objMo803onPostFlingRZ2iAVY != coroutine_suspended) {
                j5 = packedValue;
                jM7184getZero9UxMQ8M = ((Velocity) objMo803onPostFlingRZ2iAVY).getPackedValue();
                packedValue = j5;
            }
            return coroutine_suspended;
        }
        jM7184getZero9UxMQ8M = Velocity.INSTANCE.m7184getZero9UxMQ8M();
        return Velocity.m7164boximpl(Velocity.m7177plusAH228Gc(packedValue, jM7184getZero9UxMQ8M));
    }

    private final void updateDispatcher(NestedScrollDispatcher p0) {
        resetDispatcherFields();
        if (p0 == null) {
            this.resolvedDispatcher = new NestedScrollDispatcher();
        } else if (!Intrinsics.areEqual(p0, this.resolvedDispatcher)) {
            this.resolvedDispatcher = p0;
        }
        if (getIsAttached()) {
            updateDispatcherFields();
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        updateDispatcherFields();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        NestedScrollNode nestedScrollNode = (NestedScrollNode) NestedScrollNodeKt.findNearestAttachedAncestor(this);
        this.lastKnownParentNode = nestedScrollNode;
        this.resolvedDispatcher.setLastKnownParentNode$ui_release(nestedScrollNode);
        resetDispatcherFields();
    }

    private final void updateDispatcherFields() {
        this.resolvedDispatcher.setNestedScrollNode$ui_release(this);
        this.resolvedDispatcher.setLastKnownParentNode$ui_release(null);
        this.lastKnownParentNode = null;
        this.resolvedDispatcher.setCalculateNestedScrollScope$ui_release(new Function0<CoroutineScope>() { // from class: androidx.compose.ui.input.nestedscroll.NestedScrollNode.updateDispatcherFields.1
            @Override // kotlin.jvm.functions.Function0
            public final CoroutineScope invoke() {
                return NestedScrollNode.this.getNestedCoroutineScope();
            }

            {
                super(0);
            }
        });
        this.resolvedDispatcher.setScope$ui_release(getCoroutineScope());
    }

    private final void resetDispatcherFields() {
        if (this.resolvedDispatcher.getNestedScrollNode() == this) {
            this.resolvedDispatcher.setNestedScrollNode$ui_release(null);
        }
    }

    public final void updateNode$ui_release(NestedScrollConnection p0, NestedScrollDispatcher p1) {
        this.connection = p0;
        updateDispatcher(p1);
    }
}
