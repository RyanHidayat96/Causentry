package androidx.work.impl.model;

import androidx.database.db.SupportSQLiteQuery;
import androidx.p002lifecycle.LiveData;
import defpackage.clampVideoBitrateIfNotSupported;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\b2\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\t\u0010\nJ#\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\f\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/work/impl/model/RawWorkInfoDao;", "", "Landroidx/sqlite/db/SupportSQLiteQuery;", "p0", "", "Landroidx/work/impl/model/WorkSpec$WorkInfoPojo;", "getWorkInfoPojos", "(Landroidx/sqlite/db/SupportSQLiteQuery;)Ljava/util/List;", "LclampVideoBitrateIfNotSupported;", "getWorkInfoPojosFlow", "(Landroidx/sqlite/db/SupportSQLiteQuery;)LclampVideoBitrateIfNotSupported;", "Landroidx/lifecycle/LiveData;", "getWorkInfoPojosLiveData", "(Landroidx/sqlite/db/SupportSQLiteQuery;)Landroidx/lifecycle/LiveData;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface RawWorkInfoDao {
    List<WorkSpec.WorkInfoPojo> getWorkInfoPojos(SupportSQLiteQuery p0);

    clampVideoBitrateIfNotSupported<List<WorkSpec.WorkInfoPojo>> getWorkInfoPojosFlow(SupportSQLiteQuery p0);

    LiveData<List<WorkSpec.WorkInfoPojo>> getWorkInfoPojosLiveData(SupportSQLiteQuery p0);
}
