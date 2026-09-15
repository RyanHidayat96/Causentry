package androidx.compose.ui.spatial;

import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.IntOffset;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b&\b\u0001\u0018\u00002\u00020\u0001:\u0001YB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012JC\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u00132\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014H\u0007¢\u0006\u0004\b\u0018\u0010\u0019JC\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u00132\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014H\u0007¢\u0006\u0004\b\u001a\u0010\u0019J-\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0010¢\u0006\u0004\b\u001b\u0010\u001cJ(\u0010\u001e\u001a\u00020\u00162\u0016\u0010\u0005\u001a\u0012\u0012\b\u0012\u00060\u001dR\u00020\u0000\u0012\u0004\u0012\u00020\u00160\u0014H\u0086\b¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010 \u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u0010¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u0010¢\u0006\u0004\b\"\u0010!J\u0015\u0010#\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u0010¢\u0006\u0004\b#\u0010!J3\u0010$\u001a\u00020\u00162\n\u0010\u0005\u001a\u00060\u001dR\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0010H\u0000¢\u0006\u0004\b$\u0010%J=\u0010(\u001a\u00020\u00162\n\u0010\u0005\u001a\u00060\u001dR\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000b\u001a\u00020\u0010H\u0002¢\u0006\u0004\b&\u0010'JE\u0010,\u001a\u00020\u00102\n\u0010\u0005\u001a\u00060\u001dR\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000b\u001a\u00020\u00102\u0006\u0010)\u001a\u00020\u0010H\u0002¢\u0006\u0004\b*\u0010+J\u001b\u0010-\u001a\u00020\u00162\n\u0010\u0005\u001a\u00060\u001dR\u00020\u0000H\u0002¢\u0006\u0004\b-\u0010.J\u001b\u0010/\u001a\u00020\f2\n\u0010\u0005\u001a\u00060\u001dR\u00020\u0000H\u0002¢\u0006\u0004\b/\u00100J0\u00101\u001a\u00020\u0016*\u00060\u001dR\u00020\u00002\u0016\u0010\u0005\u001a\u0012\u0012\b\u0012\u00060\u001dR\u00020\u0000\u0012\u0004\u0012\u00020\u00160\u0014H\u0082\b¢\u0006\u0004\b1\u00102J6\u00104\u001a\u00020\u0016*\f\u0012\b\u0012\u00060\u001dR\u00020\u0000032\u0016\u0010\u0005\u001a\u0012\u0012\b\u0012\u00060\u001dR\u00020\u0000\u0012\u0004\u0012\u00020\u00160\u0014H\u0082\b¢\u0006\u0004\b4\u00105J>\u00106\u001a\u00020\u0016*\f\u0012\b\u0012\u00060\u001dR\u00020\u0000032\u0006\u0010\u0005\u001a\u00020\t2\u0016\u0010\u0006\u001a\u0012\u0012\b\u0012\u00060\u001dR\u00020\u0000\u0012\u0004\u0012\u00020\u00160\u0014H\u0082\b¢\u0006\u0004\b6\u00107J5\u00108\u001a\u00060\u001dR\u00020\u0000*\f\u0012\b\u0012\u00060\u001dR\u00020\u0000032\u0006\u0010\u0005\u001a\u00020\t2\n\u0010\u0006\u001a\u00060\u001dR\u00020\u0000H\u0002¢\u0006\u0004\b8\u00109J1\u0010:\u001a\u00020\f*\f\u0012\b\u0012\u00060\u001dR\u00020\u0000032\u0006\u0010\u0005\u001a\u00020\t2\n\u0010\u0006\u001a\u00060\u001dR\u00020\u0000H\u0002¢\u0006\u0004\b:\u0010;R$\u0010<\u001a\f\u0012\b\u0012\u00060\u001dR\u00020\u0000038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R(\u0010@\u001a\b\u0018\u00010\u001dR\u00020\u00008\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010.R\"\u0010E\u001a\u00020\u00108\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010!R\"\u0010J\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bJ\u0010F\u001a\u0004\bK\u0010H\"\u0004\bL\u0010!R\"\u0010M\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bM\u0010F\u001a\u0004\bN\u0010H\"\u0004\bO\u0010!R\"\u0010P\u001a\u00020\u00108\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bP\u0010F\u001a\u0004\bQ\u0010H\"\u0004\bR\u0010!R$\u0010S\u001a\u0004\u0018\u00010\u00078\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010X"}, d2 = {"Landroidx/compose/ui/spatial/ThrottledCallbacks;", "", "<init>", "()V", "Landroidx/compose/ui/unit/IntOffset;", "p0", "p1", "Landroidx/compose/ui/graphics/Matrix;", "p2", "", "p3", "p4", "", "updateOffsets-LDcG7Xg", "(JJ[FII)Z", "updateOffsets", "", "roundDownToMultipleOf8", "(J)J", "Landroidx/compose/ui/node/DelegatableNode;", "Lkotlin/Function1;", "Landroidx/compose/ui/spatial/RelativeLayoutBounds;", "", "Landroidx/compose/ui/node/DelegatableNode$RegistrationHandle;", "registerOnRectChanged", "(IJJLandroidx/compose/ui/node/DelegatableNode;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/node/DelegatableNode$RegistrationHandle;", "registerOnGlobalChange", "fireOnUpdatedRect", "(IJJJ)V", "Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;", "forEachNewCallbackNeverInvoked", "(Lkotlin/jvm/functions/Function1;)V", "fireOnRectChangedEntries", "(J)V", "fireGlobalChangeEntries", "triggerDebounced", "fireWithUpdatedRect$ui_release", "(Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;JJJ)V", "fire-WY9HvpM", "(Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;JJ[FJ)V", "fire", "p5", "debounceEntry-b8qMvQI", "(Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;JJ[FJJ)J", "debounceEntry", "addToGlobalEntries", "(Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;)V", "removeFromGlobalEntries", "(Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;)Z", "linkedForEach", "(Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;Lkotlin/jvm/functions/Function1;)V", "Landroidx/collection/MutableIntObjectMap;", "multiForEach", "(Landroidx/collection/MutableIntObjectMap;Lkotlin/jvm/functions/Function1;)V", "runFor", "(Landroidx/collection/MutableIntObjectMap;ILkotlin/jvm/functions/Function1;)V", "multiPut", "(Landroidx/collection/MutableIntObjectMap;ILandroidx/compose/ui/spatial/ThrottledCallbacks$Entry;)Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;", "multiRemove", "(Landroidx/collection/MutableIntObjectMap;ILandroidx/compose/ui/spatial/ThrottledCallbacks$Entry;)Z", "rectChangedMap", "Landroidx/collection/MutableIntObjectMap;", "getRectChangedMap", "()Landroidx/collection/MutableIntObjectMap;", "globalChangeEntries", "Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;", "getGlobalChangeEntries", "()Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;", "setGlobalChangeEntries", "minDebounceDeadline", "J", "getMinDebounceDeadline", "()J", "setMinDebounceDeadline", "windowOffset", "getWindowOffset-nOcc-ac", "setWindowOffset--gyyYBs", "screenOffset", "getScreenOffset-nOcc-ac", "setScreenOffset--gyyYBs", "windowSize", "getWindowSize", "setWindowSize", "viewToWindowMatrix", "[F", "getViewToWindowMatrix-3i98HWw", "()[F", "setViewToWindowMatrix-Q8lPUPs", "([F)V", "Entry"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ThrottledCallbacks {
    public static final int $stable = 8;
    private Entry globalChangeEntries;
    private float[] viewToWindowMatrix;
    private long windowSize;
    private final MutableIntObjectMap<Entry> rectChangedMap = IntObjectMapKt.mutableIntObjectMapOf();
    private long minDebounceDeadline = -1;
    private long windowOffset = IntOffset.INSTANCE.m7074getZeronOccac();
    private long screenOffset = IntOffset.INSTANCE.m7074getZeronOccac();

    private final long roundDownToMultipleOf8(long p0) {
        return (p0 >> 3) << 3;
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0086\u0004\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J7\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00112\b\u0010\f\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u001a\u0010 \u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R&\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R(\u0010)\u001a\b\u0018\u00010\u0000R\u00020(8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u0010/\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b/\u0010\u001b\u001a\u0004\b0\u0010\u001d\"\u0004\b1\u00102R\"\u00103\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b3\u0010\u001b\u001a\u0004\b4\u0010\u001d\"\u0004\b5\u00102R\"\u00106\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b6\u0010\u001b\u001a\u0004\b7\u0010\u001d\"\u0004\b8\u00102R\"\u00109\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b9\u0010\u001b\u001a\u0004\b:\u0010\u001d\"\u0004\b;\u00102"}, d2 = {"Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;", "Landroidx/compose/ui/node/DelegatableNode$RegistrationHandle;", "", "p0", "", "p1", "p2", "Landroidx/compose/ui/node/DelegatableNode;", "p3", "Lkotlin/Function1;", "Landroidx/compose/ui/spatial/RelativeLayoutBounds;", "", "p4", "<init>", "(Landroidx/compose/ui/spatial/ThrottledCallbacks;IJJLandroidx/compose/ui/node/DelegatableNode;Lkotlin/jvm/functions/Function1;)V", "unregister", "()V", "Landroidx/compose/ui/unit/IntOffset;", "Landroidx/compose/ui/graphics/Matrix;", "fire-9b-9wPM", "(JJJJ[F)V", "fire", "id", "I", "getId", "()I", "throttleMillis", "J", "getThrottleMillis", "()J", "debounceMillis", "getDebounceMillis", "node", "Landroidx/compose/ui/node/DelegatableNode;", "getNode", "()Landroidx/compose/ui/node/DelegatableNode;", "callback", "Lkotlin/jvm/functions/Function1;", "getCallback", "()Lkotlin/jvm/functions/Function1;", "Landroidx/compose/ui/spatial/ThrottledCallbacks;", "next", "Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;", "getNext", "()Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;", "setNext", "(Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;)V", "topLeft", "getTopLeft", "setTopLeft", "(J)V", "bottomRight", "getBottomRight", "setBottomRight", "lastInvokeMillis", "getLastInvokeMillis", "setLastInvokeMillis", "lastUninvokedFireMillis", "getLastUninvokedFireMillis", "setLastUninvokedFireMillis"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class Entry implements DelegatableNode.RegistrationHandle {
        private long bottomRight;
        private final Function1<RelativeLayoutBounds, Unit> callback;
        private final long debounceMillis;
        private final int id;
        private long lastInvokeMillis = Long.MIN_VALUE;
        private long lastUninvokedFireMillis = -1;
        private Entry next;
        private final DelegatableNode node;
        private final long throttleMillis;
        private long topLeft;

        /* JADX WARN: Multi-variable type inference failed */
        public Entry(int i, long j, long j2, DelegatableNode delegatableNode, Function1<? super RelativeLayoutBounds, Unit> function1) {
            this.id = i;
            this.throttleMillis = j;
            this.debounceMillis = j2;
            this.node = delegatableNode;
            this.callback = function1;
        }

        public final int getId() {
            return this.id;
        }

        public final long getThrottleMillis() {
            return this.throttleMillis;
        }

        public final long getDebounceMillis() {
            return this.debounceMillis;
        }

        public final DelegatableNode getNode() {
            return this.node;
        }

        public final Function1<RelativeLayoutBounds, Unit> getCallback() {
            return this.callback;
        }

        public final Entry getNext() {
            return this.next;
        }

        public final void setNext(Entry entry) {
            this.next = entry;
        }

        public final long getTopLeft() {
            return this.topLeft;
        }

        public final void setTopLeft(long j) {
            this.topLeft = j;
        }

        public final long getBottomRight() {
            return this.bottomRight;
        }

        public final void setBottomRight(long j) {
            this.bottomRight = j;
        }

        public final long getLastInvokeMillis() {
            return this.lastInvokeMillis;
        }

        public final void setLastInvokeMillis(long j) {
            this.lastInvokeMillis = j;
        }

        public final long getLastUninvokedFireMillis() {
            return this.lastUninvokedFireMillis;
        }

        public final void setLastUninvokedFireMillis(long j) {
            this.lastUninvokedFireMillis = j;
        }

        @Override // androidx.compose.ui.node.DelegatableNode.RegistrationHandle
        public final void unregister() {
            ThrottledCallbacks throttledCallbacks = ThrottledCallbacks.this;
            if (throttledCallbacks.multiRemove(throttledCallbacks.getRectChangedMap(), this.id, this)) {
                return;
            }
            ThrottledCallbacks.this.removeFromGlobalEntries(this);
        }

        /* JADX INFO: renamed from: fire-9b-9wPM, reason: not valid java name */
        public final void m6185fire9b9wPM(long p0, long p1, long p2, long p3, float[] p4) {
            RelativeLayoutBounds relativeLayoutBoundsM6186rectInfoForDg36KO4 = ThrottledCallbacksKt.m6186rectInfoForDg36KO4(this.node, p0, p1, p2, p3, ThrottledCallbacks.this.getWindowSize(), p4);
            if (relativeLayoutBoundsM6186rectInfoForDg36KO4 == null) {
                return;
            }
            this.callback.invoke(relativeLayoutBoundsM6186rectInfoForDg36KO4);
        }
    }

    public final MutableIntObjectMap<Entry> getRectChangedMap() {
        return this.rectChangedMap;
    }

    public final Entry getGlobalChangeEntries() {
        return this.globalChangeEntries;
    }

    public final void setGlobalChangeEntries(Entry entry) {
        this.globalChangeEntries = entry;
    }

    public final long getMinDebounceDeadline() {
        return this.minDebounceDeadline;
    }

    public final void setMinDebounceDeadline(long j) {
        this.minDebounceDeadline = j;
    }

    /* JADX INFO: renamed from: getWindowOffset-nOcc-ac, reason: not valid java name and from getter */
    public final long getWindowOffset() {
        return this.windowOffset;
    }

    /* JADX INFO: renamed from: setWindowOffset--gyyYBs, reason: not valid java name */
    public final void m6183setWindowOffsetgyyYBs(long j) {
        this.windowOffset = j;
    }

    /* JADX INFO: renamed from: getScreenOffset-nOcc-ac, reason: not valid java name and from getter */
    public final long getScreenOffset() {
        return this.screenOffset;
    }

    /* JADX INFO: renamed from: setScreenOffset--gyyYBs, reason: not valid java name */
    public final void m6181setScreenOffsetgyyYBs(long j) {
        this.screenOffset = j;
    }

    public final long getWindowSize() {
        return this.windowSize;
    }

    public final void setWindowSize(long j) {
        this.windowSize = j;
    }

    /* JADX INFO: renamed from: getViewToWindowMatrix-3i98HWw, reason: not valid java name and from getter */
    public final float[] getViewToWindowMatrix() {
        return this.viewToWindowMatrix;
    }

    /* JADX INFO: renamed from: setViewToWindowMatrix-Q8lPUPs, reason: not valid java name */
    public final void m6182setViewToWindowMatrixQ8lPUPs(float[] fArr) {
        this.viewToWindowMatrix = fArr;
    }

    /* JADX INFO: renamed from: updateOffsets-LDcG7Xg, reason: not valid java name */
    public final boolean m6184updateOffsetsLDcG7Xg(long p0, long p1, float[] p2, int p3, int p4) {
        boolean z;
        if (IntOffset.m7062equalsimpl0(p1, this.windowOffset)) {
            z = false;
        } else {
            this.windowOffset = p1;
            z = true;
        }
        if (!IntOffset.m7062equalsimpl0(p0, this.screenOffset)) {
            this.screenOffset = p0;
            z = true;
        }
        if (p2 != null) {
            this.viewToWindowMatrix = p2;
            z = true;
        }
        long j = (((long) p3) << 32) | (((long) p4) & 4294967295L);
        if (j == this.windowSize) {
            return z;
        }
        this.windowSize = j;
        return true;
    }

    public final DelegatableNode.RegistrationHandle registerOnRectChanged(int p0, long p1, long p2, DelegatableNode p3, Function1<? super RelativeLayoutBounds, Unit> p4) {
        return multiPut(this.rectChangedMap, p0, new Entry(p0, p1, p2 == 0 ? p1 : p2, p3, p4));
    }

    public final DelegatableNode.RegistrationHandle registerOnGlobalChange(int p0, long p1, long p2, DelegatableNode p3, Function1<? super RelativeLayoutBounds, Unit> p4) {
        Entry entry = new Entry(p0, p1, p2 == 0 ? p1 : p2, p3, p4);
        addToGlobalEntries(entry);
        return entry;
    }

    public final void fireOnUpdatedRect(int p0, long p1, long p2, long p3) {
        for (Entry next = this.rectChangedMap.get(p0); next != null; next = next.getNext()) {
            fireWithUpdatedRect$ui_release(next, p1, p2, p3);
        }
    }

    public final void forEachNewCallbackNeverInvoked(Function1<? super Entry, Unit> p0) {
        MutableIntObjectMap<Entry> rectChangedMap = getRectChangedMap();
        Object[] objArr = rectChangedMap.values;
        long[] jArr = rectChangedMap.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        Entry entry = (Entry) objArr[(i << 3) + i3];
                        for (Entry next = entry; next != null; next = next.getNext()) {
                            if (entry.getLastInvokeMillis() == Long.MIN_VALUE) {
                                p0.invoke(entry);
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void fireOnRectChangedEntries(long p0) {
        long[] jArr;
        long j;
        int i;
        int i2;
        long j2 = this.windowOffset;
        long j3 = this.screenOffset;
        float[] fArr = this.viewToWindowMatrix;
        MutableIntObjectMap<Entry> mutableIntObjectMap = this.rectChangedMap;
        Object[] objArr = mutableIntObjectMap.values;
        long[] jArr2 = mutableIntObjectMap.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            long j4 = jArr2[i3];
            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8;
                int i5 = 8 - ((~(i3 - length)) >>> 31);
                long j5 = j4;
                int i6 = 0;
                while (i6 < i5) {
                    if ((j5 & 255) < 128) {
                        Entry next = (Entry) objArr[(i3 << 3) + i6];
                        while (next != null) {
                            m6177fireWY9HvpM(next, j2, j3, fArr, p0);
                            next = next.getNext();
                            i5 = i5;
                            i4 = i4;
                            i3 = i3;
                            i6 = i6;
                            j2 = j2;
                            jArr2 = jArr2;
                            length = length;
                        }
                    }
                    long j6 = j2;
                    int i7 = i4;
                    j5 >>= i7;
                    i6++;
                    i5 = i5;
                    i4 = i7;
                    i3 = i3;
                    j2 = j6;
                    jArr2 = jArr2;
                    length = length;
                }
                jArr = jArr2;
                int i8 = length;
                j = j2;
                i = i3;
                if (i5 != i4) {
                    return;
                } else {
                    i2 = i8;
                }
            } else {
                jArr = jArr2;
                j = j2;
                i = i3;
                i2 = length;
            }
            if (i == i2) {
                return;
            }
            i3 = i + 1;
            length = i2;
            j2 = j;
            jArr2 = jArr;
        }
    }

    public final void fireGlobalChangeEntries(long p0) {
        long j = this.windowOffset;
        long j2 = this.screenOffset;
        float[] fArr = this.viewToWindowMatrix;
        Entry entry = this.globalChangeEntries;
        if (entry != null) {
            for (Entry next = entry; next != null; next = next.getNext()) {
                LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(next.getNode());
                long offsetFromRoot = layoutNodeRequireLayoutNode.getOffsetFromRoot();
                long lastSize = layoutNodeRequireLayoutNode.getLastSize();
                next.setTopLeft(offsetFromRoot);
                next.setBottomRight((((long) (IntOffset.m7064getYimpl(offsetFromRoot) + ((int) (lastSize & 4294967295L)))) & 4294967295L) | ((IntOffset.m7063getXimpl(offsetFromRoot) + ((int) (lastSize >> 32))) << 32));
                m6177fireWY9HvpM(next, j, j2, fArr, p0);
            }
        }
    }

    public final void triggerDebounced(long p0) {
        float[] fArr;
        long j;
        long j2;
        long[] jArr;
        Object[] objArr;
        int i;
        int i2;
        int i3;
        int i4;
        long[] jArr2;
        int i5;
        float[] fArr2;
        Object[] objArr2;
        long j3;
        int i6;
        int i7;
        if (this.minDebounceDeadline > p0) {
            return;
        }
        long j4 = this.windowOffset;
        long j5 = this.screenOffset;
        float[] fArr3 = this.viewToWindowMatrix;
        MutableIntObjectMap<Entry> mutableIntObjectMap = this.rectChangedMap;
        Object[] objArr3 = mutableIntObjectMap.values;
        long[] jArr3 = mutableIntObjectMap.metadata;
        int length = jArr3.length - 2;
        if (length >= 0) {
            j2 = Long.MAX_VALUE;
            int i8 = 0;
            while (true) {
                long j6 = jArr3[i8];
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i9 = 8;
                    int i10 = 8 - ((~(i8 - length)) >>> 31);
                    long j7 = j6;
                    int i11 = 0;
                    while (i11 < i10) {
                        if ((j7 & 255) < 128) {
                            long jM6176debounceEntryb8qMvQI = j2;
                            Entry next = (Entry) objArr3[(i8 << 3) + i11];
                            while (next != null) {
                                jM6176debounceEntryb8qMvQI = m6176debounceEntryb8qMvQI(next, j4, j5, fArr3, p0, jM6176debounceEntryb8qMvQI);
                                next = next.getNext();
                                i10 = i10;
                                i9 = i9;
                                i11 = i11;
                                j4 = j4;
                                i8 = i8;
                                jArr3 = jArr3;
                                length = length;
                                fArr3 = fArr3;
                                objArr3 = objArr3;
                            }
                            i3 = i11;
                            i4 = i8;
                            jArr2 = jArr3;
                            i5 = length;
                            fArr2 = fArr3;
                            objArr2 = objArr3;
                            j3 = j4;
                            i6 = i10;
                            i7 = i9;
                            j2 = jM6176debounceEntryb8qMvQI;
                        } else {
                            i3 = i11;
                            i4 = i8;
                            jArr2 = jArr3;
                            i5 = length;
                            fArr2 = fArr3;
                            objArr2 = objArr3;
                            j3 = j4;
                            i6 = i10;
                            i7 = i9;
                        }
                        j7 >>= i7;
                        i11 = i3 + 1;
                        i10 = i6;
                        i9 = i7;
                        j4 = j3;
                        i8 = i4;
                        jArr3 = jArr2;
                        length = i5;
                        fArr3 = fArr2;
                        objArr3 = objArr2;
                    }
                    int i12 = i8;
                    jArr = jArr3;
                    int i13 = length;
                    fArr = fArr3;
                    objArr = objArr3;
                    j = j4;
                    if (i10 != i9) {
                        break;
                    }
                    i = i12;
                    i2 = i13;
                } else {
                    jArr = jArr3;
                    fArr = fArr3;
                    objArr = objArr3;
                    j = j4;
                    i = i8;
                    i2 = length;
                }
                if (i == i2) {
                    break;
                }
                i8 = i + 1;
                length = i2;
                j4 = j;
                jArr3 = jArr;
                fArr3 = fArr;
                objArr3 = objArr;
            }
        } else {
            fArr = fArr3;
            j = j4;
            j2 = Long.MAX_VALUE;
        }
        Entry entry = this.globalChangeEntries;
        if (entry != null) {
            long jM6176debounceEntryb8qMvQI2 = j2;
            for (Entry next2 = entry; next2 != null; next2 = next2.getNext()) {
                jM6176debounceEntryb8qMvQI2 = m6176debounceEntryb8qMvQI(next2, j, j5, fArr, p0, jM6176debounceEntryb8qMvQI2);
            }
            j2 = jM6176debounceEntryb8qMvQI2;
        }
        if (j2 == Long.MAX_VALUE) {
            j2 = -1;
        }
        this.minDebounceDeadline = j2;
    }

    public final void fireWithUpdatedRect$ui_release(Entry p0, long p1, long p2, long p3) {
        long lastInvokeMillis = p0.getLastInvokeMillis();
        long throttleMillis = p0.getThrottleMillis();
        long debounceMillis = p0.getDebounceMillis();
        boolean z = p3 - lastInvokeMillis >= throttleMillis || lastInvokeMillis == Long.MIN_VALUE;
        boolean z2 = debounceMillis == 0;
        boolean z3 = throttleMillis == 0;
        p0.setTopLeft(p1);
        p0.setBottomRight(p2);
        boolean z4 = !(z2 || z3) || z2;
        if (z && z4) {
            p0.setLastUninvokedFireMillis(-1L);
            p0.setLastInvokeMillis(p3);
            p0.m6185fire9b9wPM(p1, p2, this.windowOffset, this.screenOffset, this.viewToWindowMatrix);
        } else {
            if (z2) {
                return;
            }
            p0.setLastUninvokedFireMillis(p3);
            long j = this.minDebounceDeadline;
            if (j <= 0 || p3 + debounceMillis >= j) {
                return;
            }
            this.minDebounceDeadline = j;
        }
    }

    /* JADX INFO: renamed from: fire-WY9HvpM, reason: not valid java name */
    private final void m6177fireWY9HvpM(Entry p0, long p1, long p2, float[] p3, long p4) {
        long lastInvokeMillis = p0.getLastInvokeMillis();
        boolean z = p4 - lastInvokeMillis > p0.getThrottleMillis() || lastInvokeMillis == Long.MIN_VALUE;
        boolean z2 = p0.getDebounceMillis() == 0;
        p0.setLastUninvokedFireMillis(p4);
        if (z && z2) {
            p0.setLastInvokeMillis(p4);
            p0.m6185fire9b9wPM(p0.getTopLeft(), p0.getBottomRight(), p1, p2, p3);
        }
        if (z2) {
            return;
        }
        long j = this.minDebounceDeadline;
        long debounceMillis = p0.getDebounceMillis();
        if (j <= 0 || debounceMillis + p4 >= j) {
            return;
        }
        this.minDebounceDeadline = j;
    }

    /* JADX INFO: renamed from: debounceEntry-b8qMvQI, reason: not valid java name */
    private final long m6176debounceEntryb8qMvQI(Entry p0, long p1, long p2, float[] p3, long p4, long p5) {
        if (p0.getDebounceMillis() <= 0 || p0.getLastUninvokedFireMillis() <= 0) {
            return p5;
        }
        if (p4 - p0.getLastUninvokedFireMillis() > p0.getDebounceMillis()) {
            p0.setLastInvokeMillis(p4);
            p0.setLastUninvokedFireMillis(-1L);
            p0.m6185fire9b9wPM(p0.getTopLeft(), p0.getBottomRight(), p1, p2, p3);
            return p5;
        }
        return Math.min(p5, p0.getLastUninvokedFireMillis() + p0.getDebounceMillis());
    }

    private final void addToGlobalEntries(Entry p0) {
        p0.setNext(this.globalChangeEntries);
        this.globalChangeEntries = p0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:11:0x001e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:12:0x0020 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:13:0x0022  */
    /* JADX WARN: Code duplicated, block: B:16:0x002d  */
    /* JADX WARN: Code duplicated, block: B:17:0x0032 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x002d -> B:8:0x0016). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final boolean removeFromGlobalEntries(androidx.compose.ui.spatial.ThrottledCallbacks.Entry r6) {
        /*
            r5 = this;
            androidx.compose.ui.spatial.ThrottledCallbacks$Entry r0 = r5.globalChangeEntries
            r1 = 1
            r2 = 0
            if (r0 != r6) goto L10
            androidx.compose.ui.spatial.ThrottledCallbacks$Entry r0 = r0.getNext()
            r5.globalChangeEntries = r0
            r6.setNext(r2)
            return r1
        L10:
            if (r0 == 0) goto L1a
            androidx.compose.ui.spatial.ThrottledCallbacks$Entry r3 = r0.getNext()
        L16:
            r4 = r3
            r3 = r0
            r0 = r4
            goto L1c
        L1a:
            r3 = r0
            r0 = r2
        L1c:
            if (r0 == 0) goto L32
            if (r0 != r6) goto L2d
            if (r3 == 0) goto L29
            androidx.compose.ui.spatial.ThrottledCallbacks$Entry r0 = r0.getNext()
            r3.setNext(r0)
        L29:
            r6.setNext(r2)
            return r1
        L2d:
            androidx.compose.ui.spatial.ThrottledCallbacks$Entry r3 = r0.getNext()
            goto L16
        L32:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.spatial.ThrottledCallbacks.removeFromGlobalEntries(androidx.compose.ui.spatial.ThrottledCallbacks$Entry):boolean");
    }

    private final void linkedForEach(Entry entry, Function1<? super Entry, Unit> function1) {
        while (entry != null) {
            function1.invoke(entry);
            entry = entry.getNext();
        }
    }

    private final void multiForEach(MutableIntObjectMap<Entry> mutableIntObjectMap, Function1<? super Entry, Unit> function1) {
        MutableIntObjectMap<Entry> mutableIntObjectMap2 = mutableIntObjectMap;
        Object[] objArr = mutableIntObjectMap2.values;
        long[] jArr = mutableIntObjectMap2.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        for (Entry next = (Entry) objArr[(i << 3) + i3]; next != null; next = next.getNext()) {
                            function1.invoke(next);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    private final void runFor(MutableIntObjectMap<Entry> mutableIntObjectMap, int i, Function1<? super Entry, Unit> function1) {
        for (Entry next = mutableIntObjectMap.get(i); next != null; next = next.getNext()) {
            function1.invoke(next);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean multiRemove(MutableIntObjectMap<Entry> mutableIntObjectMap, int i, Entry entry) {
        Entry entryRemove = mutableIntObjectMap.remove(i);
        if (entryRemove == null) {
            return false;
        }
        if (Intrinsics.areEqual(entryRemove, entry)) {
            Entry next = entry.getNext();
            entry.setNext(null);
            if (next != null) {
                mutableIntObjectMap.put(i, next);
            }
            return true;
        }
        mutableIntObjectMap.put(i, entryRemove);
        while (entryRemove != null) {
            Entry next2 = entryRemove.getNext();
            if (next2 == null) {
                return false;
            }
            if (next2 == entry) {
                entryRemove.setNext(entry.getNext());
                entry.setNext(null);
                break;
            }
            entryRemove = entryRemove.getNext();
        }
        return true;
    }

    private final Entry multiPut(MutableIntObjectMap<Entry> mutableIntObjectMap, int i, Entry entry) {
        Entry entry2 = mutableIntObjectMap.get(i);
        if (entry2 == null) {
            mutableIntObjectMap.set(i, entry);
            entry2 = entry;
        }
        Entry next = entry2;
        if (next != entry) {
            while (next.getNext() != null) {
                next = next.getNext();
                Intrinsics.checkNotNull(next);
            }
            next.setNext(entry);
        }
        return entry;
    }
}
