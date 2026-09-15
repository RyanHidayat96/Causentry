package androidx.compose.runtime;

import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableIntSet;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.CompositionGroup;
import androidx.compose.ui.spatial.RectListKt;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010(\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0001\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\u0017\u0010\n\u001a\u0013\u0012\t\u0012\u00070\b¢\u0006\u0002\b\t\u0012\u0004\u0012\u00028\u00000\u0007H\u0086\b¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\u0017\u0010\n\u001a\u0013\u0012\t\u0012\u00070\r¢\u0006\u0002\b\t\u0012\u0004\u0012\u00028\u00000\u0007H\u0086\b¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00142\u0006\u0010\n\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\n\u001a\u00020\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\n\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010 \u001a\u00020\u001a2\u0006\u0010\n\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u0014¢\u0006\u0004\b \u0010!J?\u0010&\u001a\u00020%2\u0006\u0010\n\u001a\u00020\b2&\u0010\u001d\u001a\"\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020#\u0018\u00010\"j\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020#\u0018\u0001`$H\u0000¢\u0006\u0004\b&\u0010'J\u008f\u0001\u0010&\u001a\u00020%2\u0006\u0010\n\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020(2\u0006\u0010)\u001a\u00020\u00132\u000e\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010+0*2\u0006\u0010-\u001a\u00020\u00132\u0016\u00100\u001a\u0012\u0012\u0004\u0012\u00020\u00140.j\b\u0012\u0004\u0012\u00020\u0014`/2&\u00101\u001a\"\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020#\u0018\u00010\"j\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020#\u0018\u0001`$2\u000e\u00104\u001a\n\u0012\u0004\u0012\u000203\u0018\u000102H\u0000¢\u0006\u0004\b&\u00105J\u0087\u0001\u00106\u001a\u00020%2\u0006\u0010\n\u001a\u00020(2\u0006\u0010\u001d\u001a\u00020\u00132\u000e\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010+0*2\u0006\u0010,\u001a\u00020\u00132\u0016\u0010-\u001a\u0012\u0012\u0004\u0012\u00020\u00140.j\b\u0012\u0004\u0012\u00020\u0014`/2&\u00100\u001a\"\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020#\u0018\u00010\"j\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020#\u0018\u0001`$2\u000e\u00101\u001a\n\u0012\u0004\u0012\u000203\u0018\u000102H\u0000¢\u0006\u0004\b6\u00107J\u001f\u0010:\u001a\n\u0012\u0004\u0012\u000209\u0018\u0001082\u0006\u0010\n\u001a\u00020\u0013H\u0000¢\u0006\u0004\b:\u0010;J\r\u0010<\u001a\u00020\u001a¢\u0006\u0004\b<\u0010=J\u0017\u0010>\u001a\u0004\u0018\u00010#2\u0006\u0010\n\u001a\u00020\u0013¢\u0006\u0004\b>\u0010?J\u0019\u0010@\u001a\u0004\u0018\u0001092\u0006\u0010\n\u001a\u00020\u0013H\u0002¢\u0006\u0004\b@\u0010AJ\r\u0010B\u001a\u00020%¢\u0006\u0004\bB\u0010\u0005J\r\u0010C\u001a\u00020%¢\u0006\u0004\bC\u0010\u0005J\r\u0010D\u001a\u00020%¢\u0006\u0004\bD\u0010\u0005J\u000f\u0010F\u001a\u00020EH\u0007¢\u0006\u0004\bF\u0010GJ'\u0010J\u001a\u00020\u0013*\u00060Hj\u0002`I2\u0006\u0010\n\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u0013H\u0002¢\u0006\u0004\bJ\u0010KJ\u0015\u0010L\u001a\b\u0012\u0004\u0012\u00020\u001308H\u0002¢\u0006\u0004\bL\u0010MJ\u0015\u0010N\u001a\b\u0012\u0004\u0012\u00020\u001308H\u0002¢\u0006\u0004\bN\u0010MJ\u0015\u0010O\u001a\b\u0012\u0004\u0012\u00020\u001308H\u0002¢\u0006\u0004\bO\u0010MJ\u0015\u0010P\u001a\b\u0012\u0004\u0012\u00020\u001308H\u0002¢\u0006\u0004\bP\u0010MJ\u0015\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u001308H\u0002¢\u0006\u0004\bQ\u0010MJ\u001f\u0010R\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010+082\u0006\u0010\n\u001a\u00020\u0013H\u0001¢\u0006\u0004\bR\u0010;J!\u0010S\u001a\u0004\u0018\u00010+2\u0006\u0010\n\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u0013H\u0000¢\u0006\u0004\bS\u0010TJ\u0016\u0010V\u001a\b\u0012\u0004\u0012\u00020\u00030UH\u0097\u0002¢\u0006\u0004\bV\u0010WJ\u0019\u0010X\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020+H\u0016¢\u0006\u0004\bX\u0010YR$\u0010Z\u001a\u00020(2\u0006\u0010\n\u001a\u00020(8\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R$\u0010^\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u00138\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010aR4\u0010b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010+0*2\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010+0*8\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\bd\u0010eR$\u0010f\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u00138\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\bf\u0010_\u001a\u0004\bg\u0010aR\u0016\u0010h\u001a\u00020\u00138\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bh\u0010_R\u0018\u0010j\u001a\u00060+j\u0002`i8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bj\u0010kR$\u0010l\u001a\u00020\u001a2\u0006\u0010\n\u001a\u00020\u001a8\u0001@BX\u0081\u000e¢\u0006\f\n\u0004\bl\u0010m\u001a\u0004\bn\u0010=R\"\u0010o\u001a\u00020\u00138\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bo\u0010_\u001a\u0004\bp\u0010a\"\u0004\bq\u0010rR2\u0010s\u001a\u0012\u0012\u0004\u0012\u00020\u00140.j\b\u0012\u0004\u0012\u00020\u0014`/8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bs\u0010t\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xRB\u0010y\u001a\"\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020#\u0018\u00010\"j\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020#\u0018\u0001`$8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\by\u0010z\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R/\u0010\u007f\u001a\n\u0012\u0004\u0012\u000203\u0018\u0001028\u0001@\u0001X\u0081\u000e¢\u0006\u0017\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0016\u0010\u0085\u0001\u001a\u00020\u001a8WX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0085\u0001\u0010=R\u001d\u0010\u0088\u0001\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028WX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001"}, d2 = {"Landroidx/compose/runtime/SlotTable;", "Landroidx/compose/runtime/tooling/CompositionData;", "", "Landroidx/compose/runtime/tooling/CompositionGroup;", "<init>", "()V", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function1;", "Landroidx/compose/runtime/SlotReader;", "Lkotlin/ParameterName;", "p0", "read", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Landroidx/compose/runtime/SlotWriter;", "write", "openReader", "()Landroidx/compose/runtime/SlotReader;", "openWriter", "()Landroidx/compose/runtime/SlotWriter;", "", "Landroidx/compose/runtime/Anchor;", "anchor", "(I)Landroidx/compose/runtime/Anchor;", "tryAnchor", "anchorIndex", "(Landroidx/compose/runtime/Anchor;)I", "", "ownsAnchor", "(Landroidx/compose/runtime/Anchor;)Z", "p1", "inGroup", "(Landroidx/compose/runtime/Anchor;Landroidx/compose/runtime/Anchor;)Z", "groupContainsAnchor", "(ILandroidx/compose/runtime/Anchor;)Z", "Ljava/util/HashMap;", "Landroidx/compose/runtime/GroupSourceInformation;", "Lkotlin/collections/TuitionPaymentFragmentbindingInflater1;", "", "close$runtime", "(Landroidx/compose/runtime/SlotReader;Ljava/util/HashMap;)V", "", "p2", "", "", "p3", "p4", "Ljava/util/ArrayList;", "Lkotlin/collections/b;", "p5", "p6", "Landroidx/collection/MutableIntObjectMap;", "Landroidx/collection/MutableIntSet;", "p7", "(Landroidx/compose/runtime/SlotWriter;[II[Ljava/lang/Object;ILjava/util/ArrayList;Ljava/util/HashMap;Landroidx/collection/MutableIntObjectMap;)V", "setTo$runtime", "([II[Ljava/lang/Object;ILjava/util/ArrayList;Ljava/util/HashMap;Landroidx/collection/MutableIntObjectMap;)V", "", "Landroidx/compose/runtime/RecomposeScopeImpl;", "invalidateGroupsWithKey$runtime", "(I)Ljava/util/List;", "containsMark", "()Z", "sourceInformationOf", "(I)Landroidx/compose/runtime/GroupSourceInformation;", "findEffectiveRecomposeScope", "(I)Landroidx/compose/runtime/RecomposeScopeImpl;", "verifyWellFormed", "collectCalledByInformation", "collectSourceInformation", "", "toDebugString", "()Ljava/lang/String;", "Ljava/lang/StringBuilder;", "Lkotlin/text/TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "emitGroup", "(Ljava/lang/StringBuilder;II)I", UserMetadata.KEYDATA_FILENAME, "()Ljava/util/List;", "nodes", "parentIndexes", "dataIndexes", "groupSizes", "slotsOf$runtime", "slot$runtime", "(II)Ljava/lang/Object;", "", "iterator", "()Ljava/util/Iterator;", "find", "(Ljava/lang/Object;)Landroidx/compose/runtime/tooling/CompositionGroup;", "groups", "[I", "getGroups", "()[I", "groupsSize", "I", "getGroupsSize", "()I", "slots", "[Ljava/lang/Object;", "getSlots", "()[Ljava/lang/Object;", "slotsSize", "getSlotsSize", "readers", "Landroidx/compose/runtime/platform/SynchronizedObject;", "lock", "Ljava/lang/Object;", "writer", "Z", "getWriter$runtime", "version", "getVersion$runtime", "setVersion$runtime", "(I)V", "anchors", "Ljava/util/ArrayList;", "getAnchors$runtime", "()Ljava/util/ArrayList;", "setAnchors$runtime", "(Ljava/util/ArrayList;)V", "sourceInformationMap", "Ljava/util/HashMap;", "getSourceInformationMap$runtime", "()Ljava/util/HashMap;", "setSourceInformationMap$runtime", "(Ljava/util/HashMap;)V", "calledByMap", "Landroidx/collection/MutableIntObjectMap;", "getCalledByMap$runtime", "()Landroidx/collection/MutableIntObjectMap;", "setCalledByMap$runtime", "(Landroidx/collection/MutableIntObjectMap;)V", "isEmpty", "getCompositionGroups", "()Ljava/lang/Iterable;", "compositionGroups"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SlotTable implements CompositionData, Iterable<CompositionGroup>, KMappedMarker {
    public static final int $stable = 8;
    private MutableIntObjectMap<MutableIntSet> calledByMap;
    private int groupsSize;
    private int readers;
    private int slotsSize;
    private HashMap<Anchor, GroupSourceInformation> sourceInformationMap;
    private int version;
    private boolean writer;
    private int[] groups = new int[0];
    private Object[] slots = new Object[0];
    private final Object lock = new Object();
    private ArrayList<Anchor> anchors = new ArrayList<>();

    public final int[] getGroups() {
        return this.groups;
    }

    public final int getGroupsSize() {
        return this.groupsSize;
    }

    public final Object[] getSlots() {
        return this.slots;
    }

    public final int getSlotsSize() {
        return this.slotsSize;
    }

    /* JADX INFO: renamed from: getWriter$runtime, reason: from getter */
    public final boolean getWriter() {
        return this.writer;
    }

    /* JADX INFO: renamed from: getVersion$runtime, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    public final void setVersion$runtime(int i) {
        this.version = i;
    }

    public final ArrayList<Anchor> getAnchors$runtime() {
        return this.anchors;
    }

    public final void setAnchors$runtime(ArrayList<Anchor> arrayList) {
        this.anchors = arrayList;
    }

    public final HashMap<Anchor, GroupSourceInformation> getSourceInformationMap$runtime() {
        return this.sourceInformationMap;
    }

    public final void setSourceInformationMap$runtime(HashMap<Anchor, GroupSourceInformation> map) {
        this.sourceInformationMap = map;
    }

    public final MutableIntObjectMap<MutableIntSet> getCalledByMap$runtime() {
        return this.calledByMap;
    }

    public final void setCalledByMap$runtime(MutableIntObjectMap<MutableIntSet> mutableIntObjectMap) {
        this.calledByMap = mutableIntObjectMap;
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public final boolean isEmpty() {
        return this.groupsSize == 0;
    }

    public final <T> T read(Function1<? super SlotReader, ? extends T> p0) {
        SlotReader slotReaderOpenReader = openReader();
        try {
            return p0.invoke(slotReaderOpenReader);
        } finally {
            slotReaderOpenReader.close();
        }
    }

    public final <T> T write(Function1<? super SlotWriter, ? extends T> p0) {
        SlotWriter slotWriterOpenWriter = openWriter();
        try {
            boolean z = true;
            return p0.invoke(slotWriterOpenWriter);
        } finally {
            slotWriterOpenWriter.close(false);
        }
    }

    public final SlotReader openReader() {
        if (this.writer) {
            throw new IllegalStateException("Cannot read while a writer is pending".toString());
        }
        this.readers++;
        return new SlotReader(this);
    }

    public final SlotWriter openWriter() {
        if (this.writer) {
            ComposerKt.composeImmediateRuntimeError("Cannot start a writer when another writer is pending");
        }
        if (this.readers > 0) {
            ComposerKt.composeImmediateRuntimeError("Cannot start a writer when a reader is pending");
        }
        this.writer = true;
        this.version++;
        return new SlotWriter(this);
    }

    public final Anchor anchor(int p0) {
        if (this.writer) {
            ComposerKt.composeImmediateRuntimeError("use active SlotWriter to create an anchor location instead");
        }
        if (p0 < 0 || p0 >= this.groupsSize) {
            PreconditionsKt.throwIllegalArgumentException("Parameter index is out of range");
        }
        ArrayList<Anchor> arrayList = this.anchors;
        int iSearch = SlotTableKt.search(arrayList, p0, this.groupsSize);
        if (iSearch < 0) {
            Anchor anchor = new Anchor(p0);
            arrayList.add(-(iSearch + 1), anchor);
            return anchor;
        }
        return arrayList.get(iSearch);
    }

    private final Anchor tryAnchor(int p0) {
        int i;
        if (this.writer) {
            ComposerKt.composeImmediateRuntimeError("use active SlotWriter to crate an anchor for location instead");
        }
        if (p0 < 0 || p0 >= (i = this.groupsSize)) {
            return null;
        }
        return SlotTableKt.find(this.anchors, p0, i);
    }

    public final int anchorIndex(Anchor p0) {
        if (this.writer) {
            ComposerKt.composeImmediateRuntimeError("Use active SlotWriter to determine anchor location instead");
        }
        if (!p0.getValid()) {
            PreconditionsKt.throwIllegalArgumentException("Anchor refers to a group that was removed");
        }
        return p0.getLocation();
    }

    public final boolean ownsAnchor(Anchor p0) {
        int iSearch;
        return p0.getValid() && (iSearch = SlotTableKt.search(this.anchors, p0.getLocation(), this.groupsSize)) >= 0 && Intrinsics.areEqual(this.anchors.get(iSearch), p0);
    }

    public final boolean inGroup(Anchor p0, Anchor p1) {
        int location$runtime = p0.getLocation();
        int iGroupSize = SlotTableKt.groupSize(this.groups, location$runtime);
        int location$runtime2 = p1.getLocation();
        return location$runtime <= location$runtime2 && location$runtime2 < iGroupSize + location$runtime;
    }

    public final boolean groupContainsAnchor(int p0, Anchor p1) {
        if (this.writer) {
            ComposerKt.composeImmediateRuntimeError("Writer is active");
        }
        if (p0 < 0 || p0 >= this.groupsSize) {
            ComposerKt.composeImmediateRuntimeError("Invalid group index");
        }
        if (!ownsAnchor(p1)) {
            return false;
        }
        int iGroupSize = SlotTableKt.groupSize(this.groups, p0);
        int location$runtime = p1.getLocation();
        return p0 <= location$runtime && location$runtime < iGroupSize + p0;
    }

    public final void close$runtime(SlotReader p0, HashMap<Anchor, GroupSourceInformation> p1) {
        if (p0.getTable() != this || this.readers <= 0) {
            ComposerKt.composeImmediateRuntimeError("Unexpected reader close()");
        }
        this.readers--;
        if (p1 != null) {
            synchronized (this.lock) {
                HashMap<Anchor, GroupSourceInformation> map = this.sourceInformationMap;
                if (map != null) {
                    map.putAll(p1);
                } else {
                    this.sourceInformationMap = p1;
                }
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    public final void close$runtime(SlotWriter p0, int[] p1, int p2, Object[] p3, int p4, ArrayList<Anchor> p5, HashMap<Anchor, GroupSourceInformation> p6, MutableIntObjectMap<MutableIntSet> p7) {
        if (p0.getTable() != this || !this.writer) {
            PreconditionsKt.throwIllegalArgumentException("Unexpected writer close()");
        }
        this.writer = false;
        setTo$runtime(p1, p2, p3, p4, p5, p6, p7);
    }

    public final void setTo$runtime(int[] p0, int p1, Object[] p2, int p3, ArrayList<Anchor> p4, HashMap<Anchor, GroupSourceInformation> p5, MutableIntObjectMap<MutableIntSet> p6) {
        this.groups = p0;
        this.groupsSize = p1;
        this.slots = p2;
        this.slotsSize = p3;
        this.anchors = p4;
        this.sourceInformationMap = p5;
        this.calledByMap = p6;
    }

    public final List<RecomposeScopeImpl> invalidateGroupsWithKey$runtime(int p0) {
        MutableIntSet mutableIntSet;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = true;
        MutableIntSet mutableIntSet2 = new MutableIntSet(0, 1, null);
        mutableIntSet2.add(p0);
        mutableIntSet2.add(-3);
        MutableIntObjectMap<MutableIntSet> mutableIntObjectMap = this.calledByMap;
        if (mutableIntObjectMap != null && (mutableIntSet = mutableIntObjectMap.get(p0)) != null) {
            mutableIntSet2.addAll(mutableIntSet);
        }
        SlotReader slotReaderOpenReader = openReader();
        try {
            invalidateGroupsWithKey$lambda$20$scanGroup(slotReaderOpenReader, mutableIntSet2, arrayList, booleanRef, this, arrayList2);
            Unit unit = Unit.INSTANCE;
            slotReaderOpenReader.close();
            SlotWriter slotWriterOpenWriter = openWriter();
            try {
                slotWriterOpenWriter.startGroup();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    Anchor anchor = (Anchor) arrayList.get(i);
                    if (anchor.toIndexFor(slotWriterOpenWriter) >= slotWriterOpenWriter.getCurrentGroup()) {
                        slotWriterOpenWriter.seek(anchor);
                        slotWriterOpenWriter.bashCurrentGroup();
                    }
                }
                slotWriterOpenWriter.skipToGroupEnd();
                slotWriterOpenWriter.endGroup();
                slotWriterOpenWriter.close(true);
                if (booleanRef.element) {
                    return arrayList2;
                }
                return null;
            } catch (Throwable th) {
                slotWriterOpenWriter.close(false);
                throw th;
            }
        } catch (Throwable th2) {
            slotReaderOpenReader.close();
            throw th2;
        }
    }

    private static final void invalidateGroupsWithKey$lambda$20$scanGroup(SlotReader slotReader, MutableIntSet mutableIntSet, List<Anchor> list, Ref.BooleanRef booleanRef, SlotTable slotTable, List<RecomposeScopeImpl> list2) {
        RecomposeScopeImpl recomposeScopeImplFindEffectiveRecomposeScope;
        int groupKey = slotReader.getGroupKey();
        if (mutableIntSet.contains(groupKey)) {
            if (groupKey != -3) {
                list.add(SlotReader.anchor$default(slotReader, 0, 1, null));
            }
            if (booleanRef.element) {
                RecomposeScopeImpl recomposeScopeImplFindEffectiveRecomposeScope2 = slotTable.findEffectiveRecomposeScope(slotReader.getCurrentGroup());
                if (recomposeScopeImplFindEffectiveRecomposeScope2 != null) {
                    list2.add(recomposeScopeImplFindEffectiveRecomposeScope2);
                    Anchor anchor = recomposeScopeImplFindEffectiveRecomposeScope2.getAnchor();
                    if (anchor != null && anchor.getLocation() == slotReader.getCurrentGroup() && (recomposeScopeImplFindEffectiveRecomposeScope = slotTable.findEffectiveRecomposeScope(slotReader.getParent())) != null) {
                        list2.add(recomposeScopeImplFindEffectiveRecomposeScope);
                    }
                } else {
                    booleanRef.element = false;
                    list2.clear();
                }
            }
            slotReader.skipGroup();
            return;
        }
        slotReader.startGroup();
        while (!slotReader.isGroupEnd()) {
            invalidateGroupsWithKey$lambda$20$scanGroup(slotReader, mutableIntSet, list, booleanRef, slotTable, list2);
        }
        slotReader.endGroup();
    }

    public final boolean containsMark() {
        return this.groupsSize > 0 && (this.groups[1] & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0;
    }

    public final GroupSourceInformation sourceInformationOf(int p0) {
        Anchor anchorTryAnchor;
        HashMap<Anchor, GroupSourceInformation> map = this.sourceInformationMap;
        if (map == null || (anchorTryAnchor = tryAnchor(p0)) == null) {
            return null;
        }
        return map.get(anchorTryAnchor);
    }

    private final RecomposeScopeImpl findEffectiveRecomposeScope(int p0) {
        int i = p0;
        while (i > 0) {
            for (Object obj : new DataIterator(this, i)) {
                if (obj instanceof RecomposeScopeImpl) {
                    RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) obj;
                    if (recomposeScopeImpl.getUsed() && i != p0) {
                        return recomposeScopeImpl;
                    }
                    recomposeScopeImpl.setForcedRecompose(true);
                }
            }
            i = this.groups[(i * 5) + 2];
        }
        return null;
    }

    public final void verifyWellFormed() {
        Ref.IntRef intRef = new Ref.IntRef();
        int i = -1;
        if (this.groupsSize > 0) {
            while (intRef.element < this.groupsSize) {
                verifyWellFormed$validateGroup(intRef, this, -1, intRef.element + SlotTableKt.groupSize(this.groups, intRef.element));
            }
            if (intRef.element != this.groupsSize) {
                StringBuilder sb = new StringBuilder("Incomplete group at root ");
                sb.append(intRef.element);
                sb.append(" expected to be ");
                sb.append(this.groupsSize);
                PreconditionsKt.throwIllegalStateException(sb.toString());
            }
        }
        int length = this.slots.length;
        for (int i2 = this.slotsSize; i2 < length; i2++) {
            if (this.slots[i2] != null) {
                PreconditionsKt.throwIllegalStateException("Non null value in the slot gap at index ".concat(String.valueOf(i2)));
            }
        }
        ArrayList<Anchor> arrayList = this.anchors;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            int indexFor = arrayList.get(i3).toIndexFor(this);
            if (indexFor < 0 || indexFor > this.groupsSize) {
                PreconditionsKt.throwIllegalArgumentException("Invalid anchor, location out of bound");
            }
            if (i >= indexFor) {
                PreconditionsKt.throwIllegalArgumentException("Anchor is out of order");
            }
            i3++;
            i = indexFor;
        }
        HashMap<Anchor, GroupSourceInformation> map = this.sourceInformationMap;
        if (map != null) {
            for (Map.Entry<Anchor, GroupSourceInformation> entry : map.entrySet()) {
                Anchor key = entry.getKey();
                GroupSourceInformation value = entry.getValue();
                if (!key.getValid()) {
                    PreconditionsKt.throwIllegalArgumentException("Source map contains invalid anchor");
                }
                if (!ownsAnchor(key)) {
                    PreconditionsKt.throwIllegalArgumentException("Source map anchor is not owned by the slot table");
                }
                verifyWellFormed$verifySourceGroup(this, value);
            }
        }
    }

    private static final int verifyWellFormed$validateGroup(Ref.IntRef intRef, SlotTable slotTable, int i, int i2) {
        int i3 = intRef.element;
        int i4 = i3 + 1;
        intRef.element = i4;
        int i5 = i3 * 5;
        int i6 = slotTable.groups[i5 + 2];
        if (i6 != i) {
            StringBuilder sb = new StringBuilder("Invalid parent index detected at ");
            sb.append(i3);
            sb.append(", expected parent index to be ");
            sb.append(i);
            sb.append(" found ");
            sb.append(i6);
            PreconditionsKt.throwIllegalStateException(sb.toString());
        }
        int iGroupSize = SlotTableKt.groupSize(slotTable.groups, i3) + i3;
        if (iGroupSize > slotTable.groupsSize) {
            PreconditionsKt.throwIllegalStateException("A group extends past the end of the table at ".concat(String.valueOf(i3)));
        }
        if (iGroupSize > i2) {
            PreconditionsKt.throwIllegalStateException("A group extends past its parent group at ".concat(String.valueOf(i3)));
        }
        int[] iArr = slotTable.groups;
        int i7 = i5 + 4;
        int i8 = iArr[i7];
        int i9 = i3 >= slotTable.groupsSize - 1 ? slotTable.slotsSize : iArr[(i4 * 5) + 4];
        if (i9 > slotTable.slots.length) {
            StringBuilder sb2 = new StringBuilder("Slots for ");
            sb2.append(i3);
            sb2.append(" extend past the end of the slot table");
            PreconditionsKt.throwIllegalStateException(sb2.toString());
        }
        if (i8 > i9) {
            PreconditionsKt.throwIllegalStateException("Invalid data anchor at ".concat(String.valueOf(i3)));
        }
        if (SlotTableKt.slotAnchor(slotTable.groups, i3) > i9) {
            PreconditionsKt.throwIllegalStateException("Slots start out of range at ".concat(String.valueOf(i3)));
        }
        int i10 = i5 + 1;
        int i11 = slotTable.groups[i10];
        int iVerifyWellFormed$validateGroup = 0;
        if (i9 - i8 < ((i11 & BasicMeasure.EXACTLY) != 0 ? 1 : 0) + ((536870912 & i11) != 0 ? 1 : 0) + ((i11 & 268435456) != 0 ? 1 : 0)) {
            PreconditionsKt.throwIllegalStateException("Not enough slots added for group ".concat(String.valueOf(i3)));
        }
        int[] iArr2 = slotTable.groups;
        boolean z = (iArr2[i10] & BasicMeasure.EXACTLY) != 0;
        if (z && slotTable.slots[iArr2[i7]] == null) {
            PreconditionsKt.throwIllegalStateException("No node recorded for a node group at ".concat(String.valueOf(i3)));
        }
        while (intRef.element < iGroupSize) {
            iVerifyWellFormed$validateGroup += verifyWellFormed$validateGroup(intRef, slotTable, i3, iGroupSize);
        }
        int[] iArr3 = slotTable.groups;
        int i12 = iArr3[i10] & RectListKt.Lower26Bits;
        int iGroupSize2 = SlotTableKt.groupSize(iArr3, i3);
        if (i12 != iVerifyWellFormed$validateGroup) {
            StringBuilder sb3 = new StringBuilder("Incorrect node count detected at ");
            sb3.append(i3);
            sb3.append(", expected ");
            sb3.append(i12);
            sb3.append(", received ");
            sb3.append(iVerifyWellFormed$validateGroup);
            PreconditionsKt.throwIllegalStateException(sb3.toString());
        }
        int i13 = intRef.element - i3;
        if (iGroupSize2 != i13) {
            StringBuilder sb4 = new StringBuilder("Incorrect slot count detected at ");
            sb4.append(i3);
            sb4.append(", expected ");
            sb4.append(iGroupSize2);
            sb4.append(", received ");
            sb4.append(i13);
            PreconditionsKt.throwIllegalStateException(sb4.toString());
        }
        int[] iArr4 = slotTable.groups;
        if ((iArr4[i10] & 201326592) != 0 && i3 > 0 && (iArr4[(i * 5) + 1] & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) == 0) {
            StringBuilder sb5 = new StringBuilder("Expected group ");
            sb5.append(i);
            sb5.append(" to record it contains a mark because ");
            sb5.append(i3);
            sb5.append(" does");
            PreconditionsKt.throwIllegalStateException(sb5.toString());
        }
        if (z) {
            return 1;
        }
        return iVerifyWellFormed$validateGroup;
    }

    private static final void verifyWellFormed$verifySourceGroup(SlotTable slotTable, GroupSourceInformation groupSourceInformation) {
        ArrayList<Object> groups = groupSourceInformation.getGroups();
        if (groups != null) {
            ArrayList<Object> arrayList = groups;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                Object obj = arrayList.get(i);
                if (obj instanceof Anchor) {
                    Anchor anchor = (Anchor) obj;
                    if (!anchor.getValid()) {
                        PreconditionsKt.throwIllegalArgumentException("Source map contains invalid anchor");
                    }
                    if (!slotTable.ownsAnchor(anchor)) {
                        PreconditionsKt.throwIllegalArgumentException("Source map anchor is not owned by the slot table");
                    }
                } else if (obj instanceof GroupSourceInformation) {
                    verifyWellFormed$verifySourceGroup(slotTable, (GroupSourceInformation) obj);
                }
            }
        }
    }

    public final void collectCalledByInformation() {
        this.calledByMap = new MutableIntObjectMap<>(0, 1, null);
    }

    public final void collectSourceInformation() {
        this.sourceInformationMap = new HashMap<>();
    }

    public final String toDebugString() {
        if (this.writer) {
            return super.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append('\n');
        int i = this.groupsSize;
        if (i > 0) {
            int iEmitGroup = 0;
            while (iEmitGroup < i) {
                iEmitGroup += emitGroup(sb, iEmitGroup, 0);
            }
        } else {
            sb.append("<EMPTY>");
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    private final int emitGroup(StringBuilder sb, int i, int i2) {
        String sourceInformation;
        for (int i3 = 0; i3 < i2; i3++) {
            sb.append(' ');
        }
        sb.append("Group(");
        sb.append(i);
        sb.append(")");
        GroupSourceInformation groupSourceInformationSourceInformationOf = sourceInformationOf(i);
        if (groupSourceInformationSourceInformationOf != null && (sourceInformation = groupSourceInformationSourceInformationOf.getSourceInformation()) != null && (StringsKt.startsWith$default(sourceInformation, "C(", false, 2, (Object) null) || StringsKt.startsWith$default(sourceInformation, "CC(", false, 2, (Object) null))) {
            String str = sourceInformation;
            int iIndexOf$default = StringsKt.indexOf$default((CharSequence) str, "(", 0, false, 6, (Object) null);
            int iIndexOf$default2 = StringsKt.indexOf$default((CharSequence) str, ')', 0, false, 6, (Object) null);
            sb.append(" ");
            String strSubstring = sourceInformation.substring(iIndexOf$default + 1, iIndexOf$default2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            sb.append(strSubstring);
            sb.append("()");
        }
        sb.append(" key=");
        int i4 = i * 5;
        sb.append(this.groups[i4]);
        int iGroupSize = SlotTableKt.groupSize(this.groups, i);
        sb.append(", nodes=");
        int i5 = i4 + 1;
        sb.append(this.groups[i5] & RectListKt.Lower26Bits);
        sb.append(", size=");
        sb.append(iGroupSize);
        if ((this.groups[i5] & 134217728) != 0) {
            sb.append(", mark");
        }
        if ((this.groups[i5] & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0) {
            sb.append(", contains mark");
        }
        int iEmitGroup$dataIndex = emitGroup$dataIndex(this, i);
        int iEmitGroup = i + 1;
        int iEmitGroup$dataIndex2 = emitGroup$dataIndex(this, iEmitGroup);
        if (iEmitGroup$dataIndex < 0 || iEmitGroup$dataIndex > iEmitGroup$dataIndex2 || iEmitGroup$dataIndex2 > this.slotsSize) {
            StringBuilder sb2 = new StringBuilder(", *invalid data offsets ");
            sb2.append(iEmitGroup$dataIndex);
            sb2.append('-');
            sb2.append(iEmitGroup$dataIndex2);
            sb2.append('*');
            sb.append(sb2.toString());
        } else {
            if ((this.groups[i5] & 536870912) != 0) {
                StringBuilder sb3 = new StringBuilder(" objectKey=");
                sb3.append(SlotTableKt.summarize(String.valueOf(this.slots[SlotTableKt.objectKeyIndex(this.groups, i)]), 10));
                sb.append(sb3.toString());
            }
            if ((this.groups[i5] & BasicMeasure.EXACTLY) != 0) {
                StringBuilder sb4 = new StringBuilder(" node=");
                sb4.append(SlotTableKt.summarize(String.valueOf(this.slots[this.groups[i4 + 4]]), 10));
                sb.append(sb4.toString());
            }
            if ((this.groups[i5] & 268435456) != 0) {
                StringBuilder sb5 = new StringBuilder(" aux=");
                sb5.append(SlotTableKt.summarize(String.valueOf(this.slots[SlotTableKt.auxIndex(this.groups, i)]), 10));
                sb.append(sb5.toString());
            }
            int iSlotAnchor = SlotTableKt.slotAnchor(this.groups, i);
            if (iSlotAnchor < iEmitGroup$dataIndex2) {
                sb.append(", slots=[");
                sb.append(iSlotAnchor);
                sb.append(": ");
                for (int i6 = iSlotAnchor; i6 < iEmitGroup$dataIndex2; i6++) {
                    if (i6 != iSlotAnchor) {
                        sb.append(", ");
                    }
                    sb.append(SlotTableKt.summarize(String.valueOf(this.slots[i6]), 10));
                }
                sb.append("]");
            }
        }
        sb.append('\n');
        while (iEmitGroup < i + iGroupSize) {
            iEmitGroup += emitGroup(sb, iEmitGroup, i2 + 1);
        }
        return iGroupSize;
    }

    private static final int emitGroup$dataIndex(SlotTable slotTable, int i) {
        return i >= slotTable.groupsSize ? slotTable.slotsSize : slotTable.groups[(i * 5) + 4];
    }

    private final List<Integer> keys() {
        return SlotTableKt.keys(this.groups, this.groupsSize * 5);
    }

    private final List<Integer> nodes() {
        return SlotTableKt.nodeCounts(this.groups, this.groupsSize * 5);
    }

    private final List<Integer> parentIndexes() {
        return SlotTableKt.parentAnchors(this.groups, this.groupsSize * 5);
    }

    private final List<Integer> dataIndexes() {
        return SlotTableKt.dataAnchors(this.groups, this.groupsSize * 5);
    }

    private final List<Integer> groupSizes() {
        return SlotTableKt.groupSizes(this.groups, this.groupsSize * 5);
    }

    public final List<Object> slotsOf$runtime(int p0) {
        int length;
        int[] iArr = this.groups;
        int i = iArr[(p0 * 5) + 4];
        int i2 = p0 + 1;
        if (i2 >= this.groupsSize) {
            length = this.slots.length;
        } else {
            length = iArr[(i2 * 5) + 4];
        }
        return ArraysKt.toList(this.slots).subList(i, length);
    }

    public final Object slot$runtime(int p0, int p1) {
        int length;
        int iSlotAnchor = SlotTableKt.slotAnchor(this.groups, p0);
        int i = p0 + 1;
        if (i >= this.groupsSize) {
            length = this.slots.length;
        } else {
            length = this.groups[(i * 5) + 4];
        }
        return (p1 < 0 || p1 >= length - iSlotAnchor) ? Composer.INSTANCE.getEmpty() : this.slots[iSlotAnchor + p1];
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public final Iterable<CompositionGroup> getCompositionGroups() {
        return this;
    }

    @Override // java.lang.Iterable
    public final Iterator<CompositionGroup> iterator() {
        return new GroupIterator(this, 0, this.groupsSize);
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public final CompositionGroup find(Object p0) {
        return new SlotTableGroup(this, 0, 0, 4, null).find(p0);
    }
}
