package androidx.work.impl.model;

import androidx.database.db.SupportSQLiteQuery;
import androidx.work.WorkInfo;
import defpackage.clampVideoBitrateIfNotSupported;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u001a/\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Landroidx/work/impl/model/RawWorkInfoDao;", "Lkotlinx/coroutines/CoroutineDispatcher;", "p0", "Landroidx/sqlite/db/SupportSQLiteQuery;", "p1", "LclampVideoBitrateIfNotSupported;", "", "Landroidx/work/WorkInfo;", "getWorkInfoPojosFlow", "(Landroidx/work/impl/model/RawWorkInfoDao;Lkotlinx/coroutines/CoroutineDispatcher;Landroidx/sqlite/db/SupportSQLiteQuery;)LclampVideoBitrateIfNotSupported;"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class RawWorkInfoDaoKt {
    public static final clampVideoBitrateIfNotSupported<List<WorkInfo>> getWorkInfoPojosFlow(RawWorkInfoDao rawWorkInfoDao, CoroutineDispatcher coroutineDispatcher, SupportSQLiteQuery supportSQLiteQuery) {
        Intrinsics.checkNotNullParameter(rawWorkInfoDao, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(supportSQLiteQuery, "");
        return WorkSpecDaoKt.dedup(rawWorkInfoDao.getWorkInfoPojosFlow(supportSQLiteQuery), coroutineDispatcher);
    }
}
