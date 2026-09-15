package androidx.work.impl.model;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u000bH'¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Landroidx/work/impl/model/WorkTagDao;", "", "", "p0", "", "deleteByWorkSpecId", "(Ljava/lang/String;)V", "", "getTagsForWorkSpecId", "(Ljava/lang/String;)Ljava/util/List;", "getWorkSpecIdsWithTag", "Landroidx/work/impl/model/WorkTag;", "insert", "(Landroidx/work/impl/model/WorkTag;)V", "", "p1", "insertTags", "(Ljava/lang/String;Ljava/util/Set;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface WorkTagDao {
    void deleteByWorkSpecId(String p0);

    List<String> getTagsForWorkSpecId(String p0);

    List<String> getWorkSpecIdsWithTag(String p0);

    void insert(WorkTag p0);

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static void insertTags(WorkTagDao workTagDao, String str, Set<String> set) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(set, "");
            WorkTagDao.super.insertTags(str, set);
        }
    }

    default void insertTags(String p0, Set<String> p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Iterator<T> it = p1.iterator();
        while (it.hasNext()) {
            insert(new WorkTag((String) it.next(), p0));
        }
    }
}
