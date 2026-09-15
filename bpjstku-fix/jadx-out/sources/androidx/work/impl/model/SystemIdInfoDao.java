package androidx.work.impl.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\u0005\u0010\nJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bH'¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0004H'¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0007H'¢\u0006\u0004\b\u0011\u0010\u0013J\u001f\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\u0011\u0010\u0014ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Landroidx/work/impl/model/SystemIdInfoDao;", "", "Landroidx/work/impl/model/WorkGenerationalId;", "p0", "Landroidx/work/impl/model/SystemIdInfo;", "getSystemIdInfo", "(Landroidx/work/impl/model/WorkGenerationalId;)Landroidx/work/impl/model/SystemIdInfo;", "", "", "p1", "(Ljava/lang/String;I)Landroidx/work/impl/model/SystemIdInfo;", "", "getWorkSpecIds", "()Ljava/util/List;", "", "insertSystemIdInfo", "(Landroidx/work/impl/model/SystemIdInfo;)V", "removeSystemIdInfo", "(Landroidx/work/impl/model/WorkGenerationalId;)V", "(Ljava/lang/String;)V", "(Ljava/lang/String;I)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface SystemIdInfoDao {
    SystemIdInfo getSystemIdInfo(String p0, int p1);

    List<String> getWorkSpecIds();

    void insertSystemIdInfo(SystemIdInfo p0);

    void removeSystemIdInfo(String p0);

    void removeSystemIdInfo(String p0, int p1);

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static SystemIdInfo getSystemIdInfo(SystemIdInfoDao systemIdInfoDao, WorkGenerationalId workGenerationalId) {
            Intrinsics.checkNotNullParameter(workGenerationalId, "");
            return SystemIdInfoDao.super.getSystemIdInfo(workGenerationalId);
        }

        @Deprecated
        public static void removeSystemIdInfo(SystemIdInfoDao systemIdInfoDao, WorkGenerationalId workGenerationalId) {
            Intrinsics.checkNotNullParameter(workGenerationalId, "");
            SystemIdInfoDao.super.removeSystemIdInfo(workGenerationalId);
        }
    }

    default SystemIdInfo getSystemIdInfo(WorkGenerationalId p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return getSystemIdInfo(p0.getWorkSpecId(), p0.getGeneration());
    }

    default void removeSystemIdInfo(WorkGenerationalId p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        removeSystemIdInfo(p0.getWorkSpecId(), p0.getGeneration());
    }
}
