package androidx.room;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000e\u001a\u00020\r2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0010\u001a\u00020\r2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bH\u0000¢\u0006\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c"}, d2 = {"Landroidx/room/ObserverWrapper;", "", "Landroidx/room/InvalidationTracker$Observer;", "p0", "", "p1", "", "", "p2", "<init>", "(Landroidx/room/InvalidationTracker$Observer;[I[Ljava/lang/String;)V", "", "", "", "notifyByTableIds$room_runtime_release", "(Ljava/util/Set;)V", "notifyByTableNames$room_runtime_release", "observer", "Landroidx/room/InvalidationTracker$Observer;", "getObserver$room_runtime_release", "()Landroidx/room/InvalidationTracker$Observer;", "tableIds", "[I", "getTableIds$room_runtime_release", "()[I", "tableNames", "[Ljava/lang/String;", "singleTableSet", "Ljava/util/Set;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ObserverWrapper {
    private final InvalidationTracker.Observer observer;
    private final Set<String> singleTableSet;
    private final int[] tableIds;
    private final String[] tableNames;

    public ObserverWrapper(InvalidationTracker.Observer observer, int[] iArr, String[] strArr) {
        Intrinsics.checkNotNullParameter(observer, "");
        Intrinsics.checkNotNullParameter(iArr, "");
        Intrinsics.checkNotNullParameter(strArr, "");
        this.observer = observer;
        this.tableIds = iArr;
        this.tableNames = strArr;
        if (iArr.length != strArr.length) {
            throw new IllegalStateException("Check failed.");
        }
        this.singleTableSet = strArr.length == 0 ? SetsKt.emptySet() : SetsKt.setOf(strArr[0]);
    }

    /* JADX INFO: renamed from: getObserver$room_runtime_release, reason: from getter */
    public final InvalidationTracker.Observer getObserver() {
        return this.observer;
    }

    /* JADX INFO: renamed from: getTableIds$room_runtime_release, reason: from getter */
    public final int[] getTableIds() {
        return this.tableIds;
    }

    public final void notifyByTableIds$room_runtime_release(Set<Integer> p0) {
        Set<String> setEmptySet;
        Intrinsics.checkNotNullParameter(p0, "");
        int[] iArr = this.tableIds;
        int length = iArr.length;
        if (length != 0) {
            int i = 0;
            if (length == 1) {
                setEmptySet = p0.contains(Integer.valueOf(iArr[0])) ? this.singleTableSet : SetsKt.emptySet();
            } else {
                Set setCreateSetBuilder = SetsKt.createSetBuilder();
                int[] iArr2 = this.tableIds;
                int length2 = iArr2.length;
                int i2 = 0;
                while (i < length2) {
                    if (p0.contains(Integer.valueOf(iArr2[i]))) {
                        setCreateSetBuilder.add(this.tableNames[i2]);
                    }
                    i++;
                    i2++;
                }
                setEmptySet = SetsKt.build(setCreateSetBuilder);
            }
        } else {
            setEmptySet = SetsKt.emptySet();
        }
        if (setEmptySet.isEmpty()) {
            return;
        }
        this.observer.onInvalidated(setEmptySet);
    }

    public final void notifyByTableNames$room_runtime_release(Set<String> p0) {
        Set<String> setEmptySet;
        Intrinsics.checkNotNullParameter(p0, "");
        int length = this.tableNames.length;
        if (length == 0) {
            setEmptySet = SetsKt.emptySet();
        } else if (length == 1) {
            Set<String> set = p0;
            if ((set instanceof Collection) && set.isEmpty()) {
                setEmptySet = SetsKt.emptySet();
                break;
            }
            Iterator<T> it = set.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (StringsKt.equals((String) it.next(), this.tableNames[0], true)) {
                        setEmptySet = this.singleTableSet;
                        break;
                    }
                } else {
                    setEmptySet = SetsKt.emptySet();
                    break;
                }
            }
        } else {
            Set setCreateSetBuilder = SetsKt.createSetBuilder();
            for (String str : p0) {
                for (String str2 : this.tableNames) {
                    if (StringsKt.equals(str2, str, true)) {
                        setCreateSetBuilder.add(str2);
                        break;
                    }
                }
            }
            setEmptySet = SetsKt.build(setCreateSetBuilder);
        }
        if (setEmptySet.isEmpty()) {
            return;
        }
        this.observer.onInvalidated(setEmptySet);
    }
}
