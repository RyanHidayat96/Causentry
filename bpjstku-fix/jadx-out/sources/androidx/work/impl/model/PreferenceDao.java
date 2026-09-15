package androidx.work.impl.model;

import androidx.p002lifecycle.LiveData;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00072\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\nH'¢\u0006\u0004\b\f\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/work/impl/model/PreferenceDao;", "", "", "p0", "", "getLongValue", "(Ljava/lang/String;)Ljava/lang/Long;", "Landroidx/lifecycle/LiveData;", "getObservableLongValue", "(Ljava/lang/String;)Landroidx/lifecycle/LiveData;", "Landroidx/work/impl/model/Preference;", "", "insertPreference", "(Landroidx/work/impl/model/Preference;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface PreferenceDao {
    Long getLongValue(String p0);

    LiveData<Long> getObservableLongValue(String p0);

    void insertPreference(Preference p0);
}
