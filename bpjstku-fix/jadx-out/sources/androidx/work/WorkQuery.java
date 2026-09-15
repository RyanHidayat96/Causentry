package androidx.work;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 \u00162\u00020\u0001:\u0002\u0017\u0016BI\b\u0000\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0002¢\u0006\u0004\b\n\u0010\u000bR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000fR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000fR \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0015\u0010\u000f"}, d2 = {"Landroidx/work/WorkQuery;", "", "", "Ljava/util/UUID;", "p0", "", "p1", "p2", "Landroidx/work/WorkInfo$State;", "p3", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "ids", "Ljava/util/List;", "getIds", "()Ljava/util/List;", "states", "getStates", "tags", "getTags", "uniqueWorkNames", "getUniqueWorkNames", "Companion", "Builder"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class WorkQuery {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final List<UUID> ids;
    private final List<WorkInfo.State> states;
    private final List<String> tags;
    private final List<String> uniqueWorkNames;

    /* JADX WARN: Multi-variable type inference failed */
    public WorkQuery(List<UUID> list, List<String> list2, List<String> list3, List<? extends WorkInfo.State> list4) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        this.ids = list;
        this.uniqueWorkNames = list2;
        this.tags = list3;
        this.states = list4;
    }

    public /* synthetic */ WorkQuery(List list, List list2, List list3, List list4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? CollectionsKt.emptyList() : list2, (i & 4) != 0 ? CollectionsKt.emptyList() : list3, (i & 8) != 0 ? CollectionsKt.emptyList() : list4);
    }

    public final List<UUID> getIds() {
        return this.ids;
    }

    public final List<String> getUniqueWorkNames() {
        return this.uniqueWorkNames;
    }

    public final List<String> getTags() {
        return this.tags;
    }

    public final List<WorkInfo.State> getStates() {
        return this.states;
    }

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0006\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\n\u001a\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\t0\u0004H\u0007¢\u0006\u0004\b\n\u0010\bJ\u001d\u0010\f\u001a\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004H\u0007¢\u0006\u0004\b\f\u0010\bJ\u001d\u0010\r\u001a\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004H\u0007¢\u0006\u0004\b\r\u0010\bJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\u00118\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00118\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00118\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013"}, d2 = {"Landroidx/work/WorkQuery$Builder;", "", "<init>", "()V", "", "Ljava/util/UUID;", "p0", "addIds", "(Ljava/util/List;)Landroidx/work/WorkQuery$Builder;", "Landroidx/work/WorkInfo$State;", "addStates", "", "addTags", "addUniqueWorkNames", "Landroidx/work/WorkQuery;", "build", "()Landroidx/work/WorkQuery;", "", "ids", "Ljava/util/List;", "states", "tags", "uniqueWorkNames", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final List<UUID> ids;
        private final List<WorkInfo.State> states;
        private final List<String> tags;
        private final List<String> uniqueWorkNames;

        private Builder() {
            this.ids = new ArrayList();
            this.uniqueWorkNames = new ArrayList();
            this.tags = new ArrayList();
            this.states = new ArrayList();
        }

        public final Builder addIds(List<UUID> p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            CollectionsKt.addAll(this.ids, p0);
            return this;
        }

        public final Builder addUniqueWorkNames(List<String> p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            CollectionsKt.addAll(this.uniqueWorkNames, p0);
            return this;
        }

        public final Builder addTags(List<String> p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            CollectionsKt.addAll(this.tags, p0);
            return this;
        }

        public final Builder addStates(List<? extends WorkInfo.State> p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            CollectionsKt.addAll(this.states, p0);
            return this;
        }

        public final WorkQuery build() {
            if (this.ids.isEmpty() && this.uniqueWorkNames.isEmpty() && this.tags.isEmpty() && this.states.isEmpty()) {
                throw new IllegalArgumentException("Must specify ids, uniqueNames, tags or states when building a WorkQuery");
            }
            return new WorkQuery(this.ids, this.uniqueWorkNames, this.tags, this.states);
        }

        public /* synthetic */ Builder(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\n0\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\tJ\u001d\u0010\r\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\f0\u0004H\u0007¢\u0006\u0004\b\r\u0010\tJ\u001d\u0010\u000e\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\f0\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\t"}, d2 = {"Landroidx/work/WorkQuery$Builder$Companion;", "", "<init>", "()V", "", "Ljava/util/UUID;", "p0", "Landroidx/work/WorkQuery$Builder;", "fromIds", "(Ljava/util/List;)Landroidx/work/WorkQuery$Builder;", "Landroidx/work/WorkInfo$State;", "fromStates", "", "fromTags", "fromUniqueWorkNames"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public final Builder fromIds(List<UUID> p0) {
                Intrinsics.checkNotNullParameter(p0, "");
                Builder builder = new Builder(null);
                builder.addIds(p0);
                return builder;
            }

            @JvmStatic
            public final Builder fromUniqueWorkNames(List<String> p0) {
                Intrinsics.checkNotNullParameter(p0, "");
                Builder builder = new Builder(null);
                builder.addUniqueWorkNames(p0);
                return builder;
            }

            @JvmStatic
            public final Builder fromTags(List<String> p0) {
                Intrinsics.checkNotNullParameter(p0, "");
                Builder builder = new Builder(null);
                builder.addTags(p0);
                return builder;
            }

            @JvmStatic
            public final Builder fromStates(List<? extends WorkInfo.State> p0) {
                Intrinsics.checkNotNullParameter(p0, "");
                Builder builder = new Builder(null);
                builder.addStates(p0);
                return builder;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @JvmStatic
        public static final Builder fromIds(List<UUID> list) {
            return INSTANCE.fromIds(list);
        }

        @JvmStatic
        public static final Builder fromStates(List<? extends WorkInfo.State> list) {
            return INSTANCE.fromStates(list);
        }

        @JvmStatic
        public static final Builder fromTags(List<String> list) {
            return INSTANCE.fromTags(list);
        }

        @JvmStatic
        public static final Builder fromUniqueWorkNames(List<String> list) {
            return INSTANCE.fromUniqueWorkNames(list);
        }
    }

    public WorkQuery() {
        this(null, null, null, null, 15, null);
    }

    @JvmStatic
    public static final WorkQuery fromIds(List<UUID> list) {
        return INSTANCE.fromIds(list);
    }

    @JvmStatic
    public static final WorkQuery fromIds(UUID... uuidArr) {
        return INSTANCE.fromIds(uuidArr);
    }

    @JvmStatic
    public static final WorkQuery fromStates(List<? extends WorkInfo.State> list) {
        return INSTANCE.fromStates(list);
    }

    @JvmStatic
    public static final WorkQuery fromStates(WorkInfo.State... stateArr) {
        return INSTANCE.fromStates(stateArr);
    }

    @JvmStatic
    public static final WorkQuery fromTags(List<String> list) {
        return INSTANCE.fromTags(list);
    }

    @JvmStatic
    public static final WorkQuery fromTags(String... strArr) {
        return INSTANCE.fromTags(strArr);
    }

    @JvmStatic
    public static final WorkQuery fromUniqueWorkNames(List<String> list) {
        return INSTANCE.fromUniqueWorkNames(list);
    }

    @JvmStatic
    public static final WorkQuery fromUniqueWorkNames(String... strArr) {
        return INSTANCE.fromUniqueWorkNames(strArr);
    }

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u00020\u00072\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\nH\u0007¢\u0006\u0004\b\b\u0010\u000bJ#\u0010\r\u001a\u00020\u00072\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u0004\"\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\r\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\f0\nH\u0007¢\u0006\u0004\b\r\u0010\u000bJ#\u0010\u0010\u001a\u00020\u00072\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u0004\"\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0010\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u000f0\nH\u0007¢\u0006\u0004\b\u0010\u0010\u000bJ#\u0010\u0012\u001a\u00020\u00072\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u0004\"\u00020\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0011J\u001d\u0010\u0012\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u000f0\nH\u0007¢\u0006\u0004\b\u0012\u0010\u000b"}, d2 = {"Landroidx/work/WorkQuery$Companion;", "", "<init>", "()V", "", "Ljava/util/UUID;", "p0", "Landroidx/work/WorkQuery;", "fromIds", "([Ljava/util/UUID;)Landroidx/work/WorkQuery;", "", "(Ljava/util/List;)Landroidx/work/WorkQuery;", "Landroidx/work/WorkInfo$State;", "fromStates", "([Landroidx/work/WorkInfo$State;)Landroidx/work/WorkQuery;", "", "fromTags", "([Ljava/lang/String;)Landroidx/work/WorkQuery;", "fromUniqueWorkNames"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public final WorkQuery fromIds(List<UUID> p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            return new WorkQuery(p0, null, null, null, 14, null);
        }

        @JvmStatic
        public final WorkQuery fromIds(UUID... p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            return new WorkQuery(ArraysKt.toList(p0), null, null, null, 14, null);
        }

        @JvmStatic
        public final WorkQuery fromTags(List<String> p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            return new WorkQuery(null, null, p0, null, 11, null);
        }

        @JvmStatic
        public final WorkQuery fromTags(String... p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            return new WorkQuery(null, null, ArraysKt.toList(p0), null, 11, null);
        }

        @JvmStatic
        public final WorkQuery fromUniqueWorkNames(String... p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            return new WorkQuery(null, ArraysKt.toList(p0), null, null, 13, null);
        }

        @JvmStatic
        public final WorkQuery fromUniqueWorkNames(List<String> p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            return new WorkQuery(null, p0, null, null, 13, null);
        }

        @JvmStatic
        public final WorkQuery fromStates(List<? extends WorkInfo.State> p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            return new WorkQuery(null, null, null, p0, 7, null);
        }

        @JvmStatic
        public final WorkQuery fromStates(WorkInfo.State... p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            return new WorkQuery(null, null, null, ArraysKt.toList(p0), 7, null);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
