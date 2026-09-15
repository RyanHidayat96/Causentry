package androidx.compose.foundation.text.selection;

import androidx.collection.LongObjectMap;
import androidx.collection.LongObjectMapKt;
import androidx.collection.MutableLongObjectMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 m2\u00020\u0001:\u0001mB\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\u0006JB\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0010H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0018\u0010\u0003J\u001f\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ2\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010\u0005\u001a\u00020\fH\u0007¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u001f2\u0006\u0010\u0005\u001a\u00020\u001fH\u0017¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u001fH\u0016¢\u0006\u0004\b$\u0010%R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001f0&8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001f0)8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b*\u0010+R0\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t\u0018\u00010,8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001a\u00105\u001a\u000603j\u0002`48\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b5\u00106R0\u00107\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t\u0018\u00010,8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b7\u0010.\u001a\u0004\b8\u00100\"\u0004\b9\u00102R0\u0010:\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t\u0018\u00010,8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b:\u0010.\u001a\u0004\b;\u00100\"\u0004\b<\u00102RN\u0010>\u001a.\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0010\u0018\u00010=8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR*\u0010E\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010D8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR6\u0010L\u001a\u0016\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t\u0018\u00010K8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QRB\u0010S\u001a\"\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\t\u0018\u00010R8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\u001a\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u001f0Y8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010[R\u001a\u0010_\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b]\u0010^R\"\u0010`\u001a\u00020\u00108\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR7\u0010l\u001a\b\u0012\u0004\u0012\u00020f0Y2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020f0Y8W@WX\u0097\u008e\u0002¢\u0006\u0012\n\u0004\bg\u0010h\u001a\u0004\bi\u0010[\"\u0004\bj\u0010k\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;", "Landroidx/compose/foundation/text/selection/SelectionRegistrar;", "<init>", "()V", "", "p0", "(J)V", "nextSelectableId", "()J", "", "notifyPositionChange", "notifySelectableChange", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/geometry/Offset;", "p1", "p2", "", "p3", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "p4", "p5", "notifySelectionUpdate-njBpvok", "(Landroidx/compose/ui/layout/LayoutCoordinates;JJZLandroidx/compose/foundation/text/selection/SelectionAdjustment;Z)Z", "notifySelectionUpdate", "notifySelectionUpdateEnd", "notifySelectionUpdateSelectAll", "(JZ)V", "notifySelectionUpdateStart-ubNVwUQ", "(Landroidx/compose/ui/layout/LayoutCoordinates;JLandroidx/compose/foundation/text/selection/SelectionAdjustment;Z)V", "notifySelectionUpdateStart", "", "Landroidx/compose/foundation/text/selection/Selectable;", "sort", "(Landroidx/compose/ui/layout/LayoutCoordinates;)Ljava/util/List;", "subscribe", "(Landroidx/compose/foundation/text/selection/Selectable;)Landroidx/compose/foundation/text/selection/Selectable;", "unsubscribe", "(Landroidx/compose/foundation/text/selection/Selectable;)V", "Landroidx/collection/MutableLongObjectMap;", "_selectableMap", "Landroidx/collection/MutableLongObjectMap;", "", "_selectables", "Ljava/util/List;", "Lkotlin/Function1;", "afterSelectableUnsubscribe", "Lkotlin/jvm/functions/Function1;", "getAfterSelectableUnsubscribe$foundation_release", "()Lkotlin/jvm/functions/Function1;", "setAfterSelectableUnsubscribe$foundation_release", "(Lkotlin/jvm/functions/Function1;)V", "Ljava/util/concurrent/atomic/AtomicLong;", "Landroidx/compose/foundation/TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "incrementId", "Ljava/util/concurrent/atomic/AtomicLong;", "onPositionChangeCallback", "getOnPositionChangeCallback$foundation_release", "setOnPositionChangeCallback$foundation_release", "onSelectableChangeCallback", "getOnSelectableChangeCallback$foundation_release", "setOnSelectableChangeCallback$foundation_release", "Lkotlin/Function6;", "onSelectionUpdateCallback", "Lkotlin/jvm/functions/Function6;", "getOnSelectionUpdateCallback$foundation_release", "()Lkotlin/jvm/functions/Function6;", "setOnSelectionUpdateCallback$foundation_release", "(Lkotlin/jvm/functions/Function6;)V", "Lkotlin/Function0;", "onSelectionUpdateEndCallback", "Lkotlin/jvm/functions/Function0;", "getOnSelectionUpdateEndCallback$foundation_release", "()Lkotlin/jvm/functions/Function0;", "setOnSelectionUpdateEndCallback$foundation_release", "(Lkotlin/jvm/functions/Function0;)V", "Lkotlin/Function2;", "onSelectionUpdateSelectAll", "Lkotlin/jvm/functions/Function2;", "getOnSelectionUpdateSelectAll$foundation_release", "()Lkotlin/jvm/functions/Function2;", "setOnSelectionUpdateSelectAll$foundation_release", "(Lkotlin/jvm/functions/Function2;)V", "Lkotlin/Function4;", "onSelectionUpdateStartCallback", "Lkotlin/jvm/functions/Function4;", "getOnSelectionUpdateStartCallback$foundation_release", "()Lkotlin/jvm/functions/Function4;", "setOnSelectionUpdateStartCallback$foundation_release", "(Lkotlin/jvm/functions/Function4;)V", "Landroidx/collection/LongObjectMap;", "getSelectableMap$foundation_release", "()Landroidx/collection/LongObjectMap;", "selectableMap", "getSelectables$foundation_release", "()Ljava/util/List;", "selectables", "sorted", "Z", "getSorted$foundation_release", "()Z", "setSorted$foundation_release", "(Z)V", "Landroidx/compose/foundation/text/selection/Selection;", "subselections$delegate", "Landroidx/compose/runtime/MutableState;", "getSubselections", "setSubselections", "(Landroidx/collection/LongObjectMap;)V", "subselections", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SelectionRegistrarImpl implements SelectionRegistrar {
    private final MutableLongObjectMap<Selectable> _selectableMap;
    private final List<Selectable> _selectables;
    private Function1<? super Long, Unit> afterSelectableUnsubscribe;
    private AtomicLong incrementId;
    private Function1<? super Long, Unit> onPositionChangeCallback;
    private Function1<? super Long, Unit> onSelectableChangeCallback;
    private Function6<? super Boolean, ? super LayoutCoordinates, ? super Offset, ? super Offset, ? super Boolean, ? super SelectionAdjustment, Boolean> onSelectionUpdateCallback;
    private Function0<Unit> onSelectionUpdateEndCallback;
    private Function2<? super Boolean, ? super Long, Unit> onSelectionUpdateSelectAll;
    private Function4<? super Boolean, ? super LayoutCoordinates, ? super Offset, ? super SelectionAdjustment, Unit> onSelectionUpdateStartCallback;
    private boolean sorted;

    /* JADX INFO: renamed from: subselections$delegate, reason: from kotlin metadata */
    private final MutableState subselections;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final Saver<SelectionRegistrarImpl, Long> Saver = SaverKt.Saver(new Function2<SaverScope, SelectionRegistrarImpl, Long>() { // from class: androidx.compose.foundation.text.selection.SelectionRegistrarImpl$Companion$Saver$1
        @Override // kotlin.jvm.functions.Function2
        public final Long invoke(SaverScope saverScope, SelectionRegistrarImpl selectionRegistrarImpl) {
            return Long.valueOf(selectionRegistrarImpl.incrementId.get());
        }
    }, new Function1<Long, SelectionRegistrarImpl>() { // from class: androidx.compose.foundation.text.selection.SelectionRegistrarImpl$Companion$Saver$2
        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ SelectionRegistrarImpl invoke(Long l) {
            return invoke(l.longValue());
        }

        public final SelectionRegistrarImpl invoke(long j) {
            return new SelectionRegistrarImpl(j, null);
        }
    });

    private SelectionRegistrarImpl(long j) {
        this._selectables = new ArrayList();
        this._selectableMap = LongObjectMapKt.mutableLongObjectMapOf();
        this.incrementId = new AtomicLong(j);
        this.subselections = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(LongObjectMapKt.emptyLongObjectMap(), null, 2, null);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl$Companion;", "", "<init>", "()V", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;", "", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final Saver<SelectionRegistrarImpl, Long> getSaver() {
            return SelectionRegistrarImpl.Saver;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public SelectionRegistrarImpl() {
        this(1L);
    }

    /* JADX INFO: renamed from: getSorted$foundation_release, reason: from getter */
    public final boolean getSorted() {
        return this.sorted;
    }

    public final void setSorted$foundation_release(boolean z) {
        this.sorted = z;
    }

    public final List<Selectable> getSelectables$foundation_release() {
        return this._selectables;
    }

    public final LongObjectMap<Selectable> getSelectableMap$foundation_release() {
        return this._selectableMap;
    }

    public final Function1<Long, Unit> getOnPositionChangeCallback$foundation_release() {
        return this.onPositionChangeCallback;
    }

    public final void setOnPositionChangeCallback$foundation_release(Function1<? super Long, Unit> function1) {
        this.onPositionChangeCallback = function1;
    }

    public final Function4<Boolean, LayoutCoordinates, Offset, SelectionAdjustment, Unit> getOnSelectionUpdateStartCallback$foundation_release() {
        return this.onSelectionUpdateStartCallback;
    }

    public final void setOnSelectionUpdateStartCallback$foundation_release(Function4<? super Boolean, ? super LayoutCoordinates, ? super Offset, ? super SelectionAdjustment, Unit> function4) {
        this.onSelectionUpdateStartCallback = function4;
    }

    public final Function2<Boolean, Long, Unit> getOnSelectionUpdateSelectAll$foundation_release() {
        return this.onSelectionUpdateSelectAll;
    }

    public final void setOnSelectionUpdateSelectAll$foundation_release(Function2<? super Boolean, ? super Long, Unit> function2) {
        this.onSelectionUpdateSelectAll = function2;
    }

    public final Function6<Boolean, LayoutCoordinates, Offset, Offset, Boolean, SelectionAdjustment, Boolean> getOnSelectionUpdateCallback$foundation_release() {
        return this.onSelectionUpdateCallback;
    }

    public final void setOnSelectionUpdateCallback$foundation_release(Function6<? super Boolean, ? super LayoutCoordinates, ? super Offset, ? super Offset, ? super Boolean, ? super SelectionAdjustment, Boolean> function6) {
        this.onSelectionUpdateCallback = function6;
    }

    public final Function0<Unit> getOnSelectionUpdateEndCallback$foundation_release() {
        return this.onSelectionUpdateEndCallback;
    }

    public final void setOnSelectionUpdateEndCallback$foundation_release(Function0<Unit> function0) {
        this.onSelectionUpdateEndCallback = function0;
    }

    public final Function1<Long, Unit> getOnSelectableChangeCallback$foundation_release() {
        return this.onSelectableChangeCallback;
    }

    public final void setOnSelectableChangeCallback$foundation_release(Function1<? super Long, Unit> function1) {
        this.onSelectableChangeCallback = function1;
    }

    public final Function1<Long, Unit> getAfterSelectableUnsubscribe$foundation_release() {
        return this.afterSelectableUnsubscribe;
    }

    public final void setAfterSelectableUnsubscribe$foundation_release(Function1<? super Long, Unit> function1) {
        this.afterSelectableUnsubscribe = function1;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public final LongObjectMap<Selection> getSubselections() {
        return (LongObjectMap) this.subselections.getValue();
    }

    public final void setSubselections(LongObjectMap<Selection> longObjectMap) {
        this.subselections.setValue(longObjectMap);
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public final Selectable subscribe(Selectable p0) {
        if (p0.getSelectableId() == 0) {
            StringBuilder sb = new StringBuilder("The selectable contains an invalid id: ");
            sb.append(p0.getSelectableId());
            throw new IllegalArgumentException(sb.toString().toString());
        }
        if (this._selectableMap.containsKey(p0.getSelectableId())) {
            StringBuilder sb2 = new StringBuilder("Another selectable with the id: ");
            sb2.append(p0);
            sb2.append(".selectableId has already subscribed.");
            throw new IllegalArgumentException(sb2.toString().toString());
        }
        this._selectableMap.set(p0.getSelectableId(), p0);
        this._selectables.add(p0);
        this.sorted = false;
        return p0;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public final void unsubscribe(Selectable p0) {
        if (this._selectableMap.containsKey(p0.getSelectableId())) {
            this._selectables.remove(p0);
            this._selectableMap.remove(p0.getSelectableId());
            Function1<? super Long, Unit> function1 = this.afterSelectableUnsubscribe;
            if (function1 != null) {
                function1.invoke(Long.valueOf(p0.getSelectableId()));
            }
        }
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public final long nextSelectableId() {
        long andIncrement = this.incrementId.getAndIncrement();
        while (andIncrement == 0) {
            andIncrement = this.incrementId.getAndIncrement();
        }
        return andIncrement;
    }

    public final List<Selectable> sort(final LayoutCoordinates p0) {
        if (!this.sorted) {
            List<Selectable> list = this._selectables;
            final Function2<Selectable, Selectable, Integer> function2 = new Function2<Selectable, Selectable, Integer>() { // from class: androidx.compose.foundation.text.selection.SelectionRegistrarImpl.sort.1
                @Override // kotlin.jvm.functions.Function2
                public final Integer invoke(Selectable selectable, Selectable selectable2) {
                    long jM3990getZeroF1C5BW0;
                    long jM3990getZeroF1C5BW1;
                    int iCompareValues;
                    LayoutCoordinates layoutCoordinates = selectable.getLayoutCoordinates();
                    LayoutCoordinates layoutCoordinates2 = selectable2.getLayoutCoordinates();
                    if (layoutCoordinates != null) {
                        jM3990getZeroF1C5BW0 = p0.mo5646localPositionOfR5De75A(layoutCoordinates, Offset.INSTANCE.m3990getZeroF1C5BW0());
                    } else {
                        jM3990getZeroF1C5BW0 = Offset.INSTANCE.m3990getZeroF1C5BW0();
                    }
                    if (layoutCoordinates2 != null) {
                        jM3990getZeroF1C5BW1 = p0.mo5646localPositionOfR5De75A(layoutCoordinates2, Offset.INSTANCE.m3990getZeroF1C5BW0());
                    } else {
                        jM3990getZeroF1C5BW1 = Offset.INSTANCE.m3990getZeroF1C5BW0();
                    }
                    if (Offset.m3975getYimpl(jM3990getZeroF1C5BW0) == Offset.m3975getYimpl(jM3990getZeroF1C5BW1)) {
                        iCompareValues = ComparisonsKt.compareValues(Float.valueOf(Offset.m3974getXimpl(jM3990getZeroF1C5BW0)), Float.valueOf(Offset.m3974getXimpl(jM3990getZeroF1C5BW1)));
                    } else {
                        iCompareValues = ComparisonsKt.compareValues(Float.valueOf(Offset.m3975getYimpl(jM3990getZeroF1C5BW0)), Float.valueOf(Offset.m3975getYimpl(jM3990getZeroF1C5BW1)));
                    }
                    return Integer.valueOf(iCompareValues);
                }

                {
                    super(2);
                }
            };
            CollectionsKt.sortWith(list, new Comparator() { // from class: androidx.compose.foundation.text.selection.SelectionRegistrarImpl$$ExternalSyntheticLambda0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return SelectionRegistrarImpl.sort$lambda$2(function2, obj, obj2);
                }
            });
            this.sorted = true;
        }
        return getSelectables$foundation_release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int sort$lambda$2(Function2 function2, Object obj, Object obj2) {
        return ((Number) function2.invoke(obj, obj2)).intValue();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public final void notifyPositionChange(long p0) {
        this.sorted = false;
        Function1<? super Long, Unit> function1 = this.onPositionChangeCallback;
        if (function1 != null) {
            function1.invoke(Long.valueOf(p0));
        }
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    /* JADX INFO: renamed from: notifySelectionUpdateStart-ubNVwUQ */
    public final void mo1711notifySelectionUpdateStartubNVwUQ(LayoutCoordinates p0, long p1, SelectionAdjustment p2, boolean p3) {
        Function4<? super Boolean, ? super LayoutCoordinates, ? super Offset, ? super SelectionAdjustment, Unit> function4 = this.onSelectionUpdateStartCallback;
        if (function4 != null) {
            function4.invoke(Boolean.valueOf(p3), p0, Offset.m3963boximpl(p1), p2);
        }
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public final void notifySelectionUpdateSelectAll(long p0, boolean p1) {
        Function2<? super Boolean, ? super Long, Unit> function2 = this.onSelectionUpdateSelectAll;
        if (function2 != null) {
            function2.invoke(Boolean.valueOf(p1), Long.valueOf(p0));
        }
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    /* JADX INFO: renamed from: notifySelectionUpdate-njBpvok */
    public final boolean mo1710notifySelectionUpdatenjBpvok(LayoutCoordinates p0, long p1, long p2, boolean p3, SelectionAdjustment p4, boolean p5) {
        Function6<? super Boolean, ? super LayoutCoordinates, ? super Offset, ? super Offset, ? super Boolean, ? super SelectionAdjustment, Boolean> function6 = this.onSelectionUpdateCallback;
        if (function6 == null) {
            return true;
        }
        return function6.invoke(Boolean.valueOf(p5), p0, Offset.m3963boximpl(p1), Offset.m3963boximpl(p2), Boolean.valueOf(p3), p4).booleanValue();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public final void notifySelectionUpdateEnd() {
        Function0<Unit> function0 = this.onSelectionUpdateEndCallback;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public final void notifySelectableChange(long p0) {
        Function1<? super Long, Unit> function1 = this.onSelectableChangeCallback;
        if (function1 != null) {
            function1.invoke(Long.valueOf(p0));
        }
    }

    public /* synthetic */ SelectionRegistrarImpl(long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(j);
    }
}
