package androidx.compose.runtime.tooling;

import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.GroupSourceInformation;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\b!\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\f\u0010\rJ#\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0013\u001a\u00020\u0012*\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0015\u001a\u00020\u000b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0015\u0010\rJ\u001f\u0010\u0016\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0010\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\u0018H&¢\u0006\u0004\b\u0010\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\t\u001a\u00020\u0018H&¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\u001d8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f"}, d2 = {"Landroidx/compose/runtime/tooling/ComposeStackTraceBuilder;", "", "<init>", "()V", "", "Landroidx/compose/runtime/tooling/ComposeStackTraceFrame;", "trace", "()Ljava/util/List;", "Landroidx/compose/runtime/GroupSourceInformation;", "p0", "p1", "", "appendTraceFrame", "(Landroidx/compose/runtime/GroupSourceInformation;Ljava/lang/Object;)V", "extractTraceFrame", "(Landroidx/compose/runtime/GroupSourceInformation;Ljava/lang/Object;)Landroidx/compose/runtime/tooling/ComposeStackTraceFrame;", "sourceInformationOf", "(Ljava/lang/Object;)Landroidx/compose/runtime/GroupSourceInformation;", "", "isCall", "(Landroidx/compose/runtime/GroupSourceInformation;)Z", "processEdge", "findInGroupSourceInformation", "(Landroidx/compose/runtime/GroupSourceInformation;Ljava/lang/Object;)Z", "Landroidx/compose/runtime/Anchor;", "(Landroidx/compose/runtime/Anchor;)Landroidx/compose/runtime/GroupSourceInformation;", "", "groupKeyOf", "(Landroidx/compose/runtime/Anchor;)I", "", "_trace", "Ljava/util/List;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ComposeStackTraceBuilder {
    public static final int $stable = 8;
    private final List<ComposeStackTraceFrame> _trace = new ArrayList();

    public abstract int groupKeyOf(Anchor p0);

    public abstract GroupSourceInformation sourceInformationOf(Anchor p0);

    public final List<ComposeStackTraceFrame> trace() {
        return this._trace;
    }

    private final void appendTraceFrame(GroupSourceInformation p0, Object p1) {
        ComposeStackTraceFrame composeStackTraceFrameExtractTraceFrame = extractTraceFrame(p0, p1);
        if (composeStackTraceFrameExtractTraceFrame != null) {
            this._trace.add(composeStackTraceFrameExtractTraceFrame);
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0087  */
    private final ComposeStackTraceFrame extractTraceFrame(GroupSourceInformation p0, Object p1) {
        ArrayList<Object> groups;
        String sourceInformation = p0.getSourceInformation();
        SourceInformation sourceInformation2 = sourceInformation != null ? SourceInformationKt.parseSourceInformation(sourceInformation) : null;
        if (sourceInformation2 == null) {
            return null;
        }
        if (p1 == null) {
            return new ComposeStackTraceFrame(sourceInformation2, null);
        }
        ArrayList<Object> groups2 = p0.getGroups();
        int i = 0;
        if (groups2 != null) {
            int size = groups2.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Object obj = groups2.get(i3);
                if (Intrinsics.areEqual(obj, p1)) {
                    break;
                }
                GroupSourceInformation groupSourceInformationSourceInformationOf = sourceInformationOf(obj);
                if (groupSourceInformationSourceInformationOf != null && (groupSourceInformationSourceInformationOf.getKey() == -127 || (groupSourceInformationSourceInformationOf.getKey() == 0 && (obj instanceof Anchor) && groupKeyOf((Anchor) obj) == -127))) {
                    if ((groupSourceInformationSourceInformationOf != null ? groupSourceInformationSourceInformationOf.getSourceInformation() : null) == null) {
                        if (groupSourceInformationSourceInformationOf != null && (groups = groupSourceInformationSourceInformationOf.getGroups()) != null) {
                            ArrayList<Object> arrayList = groups;
                            int size2 = arrayList.size();
                            for (int i4 = 0; i4 < size2; i4++) {
                                GroupSourceInformation groupSourceInformationSourceInformationOf2 = sourceInformationOf(arrayList.get(i4));
                                if (groupSourceInformationSourceInformationOf2 != null && isCall(groupSourceInformationSourceInformationOf2)) {
                                    i2++;
                                }
                            }
                        }
                    } else if (groupSourceInformationSourceInformationOf == null) {
                    }
                } else if (groupSourceInformationSourceInformationOf == null && isCall(groupSourceInformationSourceInformationOf)) {
                    i2++;
                }
            }
            i = i2;
        }
        return new ComposeStackTraceFrame(sourceInformation2, Integer.valueOf(i));
    }

    private final GroupSourceInformation sourceInformationOf(Object p0) {
        if (p0 instanceof Anchor) {
            return sourceInformationOf((Anchor) p0);
        }
        if (p0 instanceof GroupSourceInformation) {
            return (GroupSourceInformation) p0;
        }
        throw new IllegalStateException("Unexpected child source info ".concat(String.valueOf(p0)).toString());
    }

    private final boolean isCall(GroupSourceInformation groupSourceInformation) {
        String sourceInformation = groupSourceInformation.getSourceInformation();
        return sourceInformation != null && StringsKt.startsWith$default(sourceInformation, "C", false, 2, (Object) null);
    }

    public final void processEdge(GroupSourceInformation p0, Object p1) {
        if (p0 != null) {
            if (p1 == null) {
                appendTraceFrame(p0, null);
            } else {
                if (findInGroupSourceInformation(p0, p1) || p0.getClosed()) {
                    return;
                }
                appendTraceFrame(p0, null);
            }
        }
    }

    private final boolean findInGroupSourceInformation(GroupSourceInformation p0, Object p1) {
        ArrayList<Object> groups = p0.getGroups();
        boolean z = false;
        if (groups == null) {
            if (!p0.getClosed()) {
                appendTraceFrame(p0, null);
                return true;
            }
            int dataStartOffset = p0.getDataStartOffset();
            int dataEndOffset = p0.getDataEndOffset();
            boolean z2 = p1 instanceof Integer;
            if (z2) {
                Number number = (Number) p1;
                int iIntValue = number.intValue();
                if ((dataStartOffset <= iIntValue && iIntValue < dataEndOffset) || (dataStartOffset == dataEndOffset && z2 && dataStartOffset == number.intValue())) {
                    z = true;
                }
                if (z) {
                    appendTraceFrame(p0, null);
                    return true;
                }
            }
            return z;
        }
        ArrayList<Object> arrayList = groups;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof Anchor) {
                if (Intrinsics.areEqual(obj, p1)) {
                    appendTraceFrame(p0, obj);
                    return true;
                }
            } else if (obj instanceof GroupSourceInformation) {
                if (findInGroupSourceInformation((GroupSourceInformation) obj, p1)) {
                    appendTraceFrame(p0, obj);
                    return true;
                }
            } else {
                throw new IllegalStateException("Unexpected child source info ".concat(String.valueOf(obj)).toString());
            }
        }
        return false;
    }
}
