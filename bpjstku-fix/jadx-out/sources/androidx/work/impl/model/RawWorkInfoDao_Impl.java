package androidx.work.impl.model;

import android.database.Cursor;
import androidx.database.db.SupportSQLiteQuery;
import androidx.p002lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.RelationUtil;
import androidx.room.util.StringUtil;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.NetworkType;
import androidx.work.WorkInfo;
import androidx.work.impl.utils.NetworkRequestCompat;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import defpackage.clampVideoBitrateIfNotSupported;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class RawWorkInfoDao_Impl implements RawWorkInfoDao {
    private final RoomDatabase __db;

    public RawWorkInfoDao_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
    }

    @Override // androidx.work.impl.model.RawWorkInfoDao
    public final List<WorkSpec.WorkInfoPojo> getWorkInfoPojos(SupportSQLiteQuery supportSQLiteQuery) {
        WorkInfo.State stateIntToState;
        BackoffPolicy backoffPolicyIntToBackoffPolicy;
        NetworkType networkTypeIntToNetworkType;
        NetworkRequestCompat networkRequest$work_runtime_release;
        boolean z;
        boolean z2;
        Set<Constraints.ContentUriTrigger> setByteArrayToSetOfTriggers;
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.__db, supportSQLiteQuery, true, null);
        try {
            int columnIndex = CursorUtil.getColumnIndex(cursorQuery, "id");
            int columnIndex2 = CursorUtil.getColumnIndex(cursorQuery, RemoteConfigConstants.ResponseFieldKey.STATE);
            int columnIndex3 = CursorUtil.getColumnIndex(cursorQuery, "output");
            int columnIndex4 = CursorUtil.getColumnIndex(cursorQuery, "initial_delay");
            int columnIndex5 = CursorUtil.getColumnIndex(cursorQuery, "interval_duration");
            int columnIndex6 = CursorUtil.getColumnIndex(cursorQuery, "flex_duration");
            int columnIndex7 = CursorUtil.getColumnIndex(cursorQuery, "run_attempt_count");
            int columnIndex8 = CursorUtil.getColumnIndex(cursorQuery, "backoff_policy");
            int columnIndex9 = CursorUtil.getColumnIndex(cursorQuery, "backoff_delay_duration");
            int columnIndex10 = CursorUtil.getColumnIndex(cursorQuery, "last_enqueue_time");
            int columnIndex11 = CursorUtil.getColumnIndex(cursorQuery, "period_count");
            int columnIndex12 = CursorUtil.getColumnIndex(cursorQuery, "generation");
            int columnIndex13 = CursorUtil.getColumnIndex(cursorQuery, "next_schedule_time_override");
            int columnIndex14 = CursorUtil.getColumnIndex(cursorQuery, "stop_reason");
            int columnIndex15 = CursorUtil.getColumnIndex(cursorQuery, "required_network_type");
            int columnIndex16 = CursorUtil.getColumnIndex(cursorQuery, "required_network_request");
            int columnIndex17 = CursorUtil.getColumnIndex(cursorQuery, "requires_charging");
            int columnIndex18 = CursorUtil.getColumnIndex(cursorQuery, "requires_device_idle");
            int columnIndex19 = CursorUtil.getColumnIndex(cursorQuery, "requires_battery_not_low");
            int columnIndex20 = CursorUtil.getColumnIndex(cursorQuery, "requires_storage_not_low");
            int columnIndex21 = CursorUtil.getColumnIndex(cursorQuery, "trigger_content_update_delay");
            int columnIndex22 = CursorUtil.getColumnIndex(cursorQuery, "trigger_max_content_delay");
            int columnIndex23 = CursorUtil.getColumnIndex(cursorQuery, "content_uri_triggers");
            HashMap<String, ArrayList<String>> map = new HashMap<>();
            int i = columnIndex13;
            HashMap<String, ArrayList<Data>> map2 = new HashMap<>();
            while (cursorQuery.moveToNext()) {
                int i2 = columnIndex12;
                String string = cursorQuery.getString(columnIndex);
                if (!map.containsKey(string)) {
                    map.put(string, new ArrayList<>());
                }
                String string2 = cursorQuery.getString(columnIndex);
                if (!map2.containsKey(string2)) {
                    map2.put(string2, new ArrayList<>());
                }
                columnIndex12 = i2;
                columnIndex11 = columnIndex11;
            }
            int i3 = columnIndex11;
            int i4 = columnIndex12;
            cursorQuery.moveToPosition(-1);
            __fetchRelationshipWorkTagAsjavaLangString(map);
            __fetchRelationshipWorkProgressAsandroidxWorkData(map2);
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                String string3 = columnIndex == -1 ? null : cursorQuery.getString(columnIndex);
                if (columnIndex2 == -1) {
                    stateIntToState = null;
                } else {
                    int i5 = cursorQuery.getInt(columnIndex2);
                    WorkTypeConverters workTypeConverters = WorkTypeConverters.INSTANCE;
                    stateIntToState = WorkTypeConverters.intToState(i5);
                }
                Data dataFromByteArray = columnIndex3 == -1 ? null : Data.fromByteArray(cursorQuery.getBlob(columnIndex3));
                long j = columnIndex4 == -1 ? 0L : cursorQuery.getLong(columnIndex4);
                long j2 = columnIndex5 == -1 ? 0L : cursorQuery.getLong(columnIndex5);
                long j3 = columnIndex6 == -1 ? 0L : cursorQuery.getLong(columnIndex6);
                int i6 = columnIndex7 == -1 ? 0 : cursorQuery.getInt(columnIndex7);
                if (columnIndex8 == -1) {
                    backoffPolicyIntToBackoffPolicy = null;
                } else {
                    int i7 = cursorQuery.getInt(columnIndex8);
                    WorkTypeConverters workTypeConverters2 = WorkTypeConverters.INSTANCE;
                    backoffPolicyIntToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy(i7);
                }
                long j4 = columnIndex9 == -1 ? 0L : cursorQuery.getLong(columnIndex9);
                long j5 = columnIndex10 == -1 ? 0L : cursorQuery.getLong(columnIndex10);
                int i8 = i3 == -1 ? 0 : cursorQuery.getInt(i3);
                int i9 = i4 == -1 ? 0 : cursorQuery.getInt(i4);
                long j6 = i == -1 ? 0L : cursorQuery.getLong(i);
                columnIndex14 = columnIndex14;
                int i10 = columnIndex14 == -1 ? 0 : cursorQuery.getInt(columnIndex14);
                if (columnIndex15 == -1) {
                    networkTypeIntToNetworkType = null;
                } else {
                    int i11 = cursorQuery.getInt(columnIndex15);
                    WorkTypeConverters workTypeConverters3 = WorkTypeConverters.INSTANCE;
                    networkTypeIntToNetworkType = WorkTypeConverters.intToNetworkType(i11);
                }
                if (columnIndex16 == -1) {
                    networkRequest$work_runtime_release = null;
                } else {
                    byte[] blob = cursorQuery.getBlob(columnIndex16);
                    WorkTypeConverters workTypeConverters4 = WorkTypeConverters.INSTANCE;
                    networkRequest$work_runtime_release = WorkTypeConverters.toNetworkRequest$work_runtime_release(blob);
                }
                if (columnIndex17 == -1) {
                    z = false;
                } else {
                    z = cursorQuery.getInt(columnIndex17) != 0;
                }
                if (columnIndex18 == -1) {
                    z2 = false;
                } else {
                    z2 = cursorQuery.getInt(columnIndex18) != 0;
                }
                boolean z3 = (columnIndex19 == -1 || cursorQuery.getInt(columnIndex19) == 0) ? false : true;
                boolean z4 = (columnIndex20 == -1 || cursorQuery.getInt(columnIndex20) == 0) ? false : true;
                long j7 = columnIndex21 == -1 ? 0L : cursorQuery.getLong(columnIndex21);
                long j8 = columnIndex22 != -1 ? cursorQuery.getLong(columnIndex22) : 0L;
                columnIndex22 = columnIndex22;
                int i12 = columnIndex23;
                long j9 = j8;
                if (i12 == -1) {
                    setByteArrayToSetOfTriggers = null;
                } else {
                    byte[] blob2 = cursorQuery.getBlob(i12);
                    WorkTypeConverters workTypeConverters5 = WorkTypeConverters.INSTANCE;
                    setByteArrayToSetOfTriggers = WorkTypeConverters.byteArrayToSetOfTriggers(blob2);
                }
                arrayList.add(new WorkSpec.WorkInfoPojo(string3, stateIntToState, dataFromByteArray, j, j2, j3, new Constraints(networkRequest$work_runtime_release, networkTypeIntToNetworkType, z, z2, z3, z4, j7, j9, setByteArrayToSetOfTriggers), i6, backoffPolicyIntToBackoffPolicy, j4, j5, i8, i9, j6, i10, map.get(cursorQuery.getString(columnIndex)), map2.get(cursorQuery.getString(columnIndex))));
                columnIndex23 = i12;
            }
            return arrayList;
        } finally {
            cursorQuery.close();
        }
    }

    @Override // androidx.work.impl.model.RawWorkInfoDao
    public final LiveData<List<WorkSpec.WorkInfoPojo>> getWorkInfoPojosLiveData(final SupportSQLiteQuery supportSQLiteQuery) {
        return this.__db.getInvalidationTracker().createLiveData(new String[]{"WorkTag", "WorkProgress", "WorkSpec"}, false, (Callable) new Callable<List<WorkSpec.WorkInfoPojo>>() { // from class: androidx.work.impl.model.RawWorkInfoDao_Impl.1
            @Override // java.util.concurrent.Callable
            public List<WorkSpec.WorkInfoPojo> call() throws Exception {
                WorkInfo.State stateIntToState;
                BackoffPolicy backoffPolicyIntToBackoffPolicy;
                NetworkType networkTypeIntToNetworkType;
                NetworkRequestCompat networkRequest$work_runtime_release;
                boolean z;
                boolean z2;
                Set<Constraints.ContentUriTrigger> setByteArrayToSetOfTriggers;
                Cursor cursorQuery = DBUtil.query(RawWorkInfoDao_Impl.this.__db, supportSQLiteQuery, true, null);
                try {
                    int columnIndex = CursorUtil.getColumnIndex(cursorQuery, "id");
                    int columnIndex2 = CursorUtil.getColumnIndex(cursorQuery, RemoteConfigConstants.ResponseFieldKey.STATE);
                    int columnIndex3 = CursorUtil.getColumnIndex(cursorQuery, "output");
                    int columnIndex4 = CursorUtil.getColumnIndex(cursorQuery, "initial_delay");
                    int columnIndex5 = CursorUtil.getColumnIndex(cursorQuery, "interval_duration");
                    int columnIndex6 = CursorUtil.getColumnIndex(cursorQuery, "flex_duration");
                    int columnIndex7 = CursorUtil.getColumnIndex(cursorQuery, "run_attempt_count");
                    int columnIndex8 = CursorUtil.getColumnIndex(cursorQuery, "backoff_policy");
                    int columnIndex9 = CursorUtil.getColumnIndex(cursorQuery, "backoff_delay_duration");
                    int columnIndex10 = CursorUtil.getColumnIndex(cursorQuery, "last_enqueue_time");
                    int columnIndex11 = CursorUtil.getColumnIndex(cursorQuery, "period_count");
                    int columnIndex12 = CursorUtil.getColumnIndex(cursorQuery, "generation");
                    int columnIndex13 = CursorUtil.getColumnIndex(cursorQuery, "next_schedule_time_override");
                    int columnIndex14 = CursorUtil.getColumnIndex(cursorQuery, "stop_reason");
                    int columnIndex15 = CursorUtil.getColumnIndex(cursorQuery, "required_network_type");
                    int columnIndex16 = CursorUtil.getColumnIndex(cursorQuery, "required_network_request");
                    int columnIndex17 = CursorUtil.getColumnIndex(cursorQuery, "requires_charging");
                    int columnIndex18 = CursorUtil.getColumnIndex(cursorQuery, "requires_device_idle");
                    int columnIndex19 = CursorUtil.getColumnIndex(cursorQuery, "requires_battery_not_low");
                    int columnIndex20 = CursorUtil.getColumnIndex(cursorQuery, "requires_storage_not_low");
                    int columnIndex21 = CursorUtil.getColumnIndex(cursorQuery, "trigger_content_update_delay");
                    int columnIndex22 = CursorUtil.getColumnIndex(cursorQuery, "trigger_max_content_delay");
                    int columnIndex23 = CursorUtil.getColumnIndex(cursorQuery, "content_uri_triggers");
                    HashMap map = new HashMap();
                    int i = columnIndex13;
                    HashMap map2 = new HashMap();
                    while (cursorQuery.moveToNext()) {
                        int i2 = columnIndex12;
                        String string = cursorQuery.getString(columnIndex);
                        if (!map.containsKey(string)) {
                            map.put(string, new ArrayList());
                        }
                        String string2 = cursorQuery.getString(columnIndex);
                        if (!map2.containsKey(string2)) {
                            map2.put(string2, new ArrayList());
                        }
                        columnIndex12 = i2;
                        columnIndex11 = columnIndex11;
                    }
                    int i3 = columnIndex11;
                    int i4 = columnIndex12;
                    cursorQuery.moveToPosition(-1);
                    RawWorkInfoDao_Impl.this.__fetchRelationshipWorkTagAsjavaLangString(map);
                    RawWorkInfoDao_Impl.this.__fetchRelationshipWorkProgressAsandroidxWorkData(map2);
                    ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                    while (cursorQuery.moveToNext()) {
                        String string3 = columnIndex == -1 ? null : cursorQuery.getString(columnIndex);
                        if (columnIndex2 == -1) {
                            stateIntToState = null;
                        } else {
                            int i5 = cursorQuery.getInt(columnIndex2);
                            WorkTypeConverters workTypeConverters = WorkTypeConverters.INSTANCE;
                            stateIntToState = WorkTypeConverters.intToState(i5);
                        }
                        Data dataFromByteArray = columnIndex3 == -1 ? null : Data.fromByteArray(cursorQuery.getBlob(columnIndex3));
                        long j = columnIndex4 == -1 ? 0L : cursorQuery.getLong(columnIndex4);
                        long j2 = columnIndex5 == -1 ? 0L : cursorQuery.getLong(columnIndex5);
                        long j3 = columnIndex6 == -1 ? 0L : cursorQuery.getLong(columnIndex6);
                        int i6 = columnIndex7 == -1 ? 0 : cursorQuery.getInt(columnIndex7);
                        if (columnIndex8 == -1) {
                            backoffPolicyIntToBackoffPolicy = null;
                        } else {
                            int i7 = cursorQuery.getInt(columnIndex8);
                            WorkTypeConverters workTypeConverters2 = WorkTypeConverters.INSTANCE;
                            backoffPolicyIntToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy(i7);
                        }
                        long j4 = columnIndex9 == -1 ? 0L : cursorQuery.getLong(columnIndex9);
                        long j5 = columnIndex10 == -1 ? 0L : cursorQuery.getLong(columnIndex10);
                        int i8 = i3 == -1 ? 0 : cursorQuery.getInt(i3);
                        int i9 = i4 == -1 ? 0 : cursorQuery.getInt(i4);
                        long j6 = i == -1 ? 0L : cursorQuery.getLong(i);
                        int i10 = columnIndex14 == -1 ? 0 : cursorQuery.getInt(columnIndex14);
                        if (columnIndex15 == -1) {
                            networkTypeIntToNetworkType = null;
                        } else {
                            int i11 = cursorQuery.getInt(columnIndex15);
                            WorkTypeConverters workTypeConverters3 = WorkTypeConverters.INSTANCE;
                            networkTypeIntToNetworkType = WorkTypeConverters.intToNetworkType(i11);
                        }
                        if (columnIndex16 == -1) {
                            networkRequest$work_runtime_release = null;
                        } else {
                            byte[] blob = cursorQuery.getBlob(columnIndex16);
                            WorkTypeConverters workTypeConverters4 = WorkTypeConverters.INSTANCE;
                            networkRequest$work_runtime_release = WorkTypeConverters.toNetworkRequest$work_runtime_release(blob);
                        }
                        if (columnIndex17 == -1) {
                            z = false;
                        } else {
                            z = cursorQuery.getInt(columnIndex17) != 0;
                        }
                        if (columnIndex18 == -1) {
                            z2 = false;
                        } else {
                            z2 = cursorQuery.getInt(columnIndex18) != 0;
                        }
                        boolean z3 = (columnIndex19 == -1 || cursorQuery.getInt(columnIndex19) == 0) ? false : true;
                        boolean z4 = (columnIndex20 == -1 || cursorQuery.getInt(columnIndex20) == 0) ? false : true;
                        long j7 = columnIndex21 == -1 ? 0L : cursorQuery.getLong(columnIndex21);
                        long j8 = columnIndex22 != -1 ? cursorQuery.getLong(columnIndex22) : 0L;
                        columnIndex22 = columnIndex22;
                        int i12 = columnIndex23;
                        long j9 = j8;
                        if (i12 == -1) {
                            setByteArrayToSetOfTriggers = null;
                        } else {
                            byte[] blob2 = cursorQuery.getBlob(i12);
                            WorkTypeConverters workTypeConverters5 = WorkTypeConverters.INSTANCE;
                            setByteArrayToSetOfTriggers = WorkTypeConverters.byteArrayToSetOfTriggers(blob2);
                        }
                        arrayList.add(new WorkSpec.WorkInfoPojo(string3, stateIntToState, dataFromByteArray, j, j2, j3, new Constraints(networkRequest$work_runtime_release, networkTypeIntToNetworkType, z, z2, z3, z4, j7, j9, setByteArrayToSetOfTriggers), i6, backoffPolicyIntToBackoffPolicy, j4, j5, i8, i9, j6, i10, (ArrayList) map.get(cursorQuery.getString(columnIndex)), (ArrayList) map2.get(cursorQuery.getString(columnIndex))));
                        columnIndex23 = i12;
                    }
                    return arrayList;
                } finally {
                    cursorQuery.close();
                }
            }
        });
    }

    @Override // androidx.work.impl.model.RawWorkInfoDao
    public final clampVideoBitrateIfNotSupported<List<WorkSpec.WorkInfoPojo>> getWorkInfoPojosFlow(final SupportSQLiteQuery supportSQLiteQuery) {
        return CoroutinesRoom.createFlow(this.__db, false, new String[]{"WorkTag", "WorkProgress", "WorkSpec"}, new Callable<List<WorkSpec.WorkInfoPojo>>() { // from class: androidx.work.impl.model.RawWorkInfoDao_Impl.2
            @Override // java.util.concurrent.Callable
            public List<WorkSpec.WorkInfoPojo> call() throws Exception {
                WorkInfo.State stateIntToState;
                BackoffPolicy backoffPolicyIntToBackoffPolicy;
                NetworkType networkTypeIntToNetworkType;
                NetworkRequestCompat networkRequest$work_runtime_release;
                boolean z;
                boolean z2;
                Set<Constraints.ContentUriTrigger> setByteArrayToSetOfTriggers;
                Cursor cursorQuery = DBUtil.query(RawWorkInfoDao_Impl.this.__db, supportSQLiteQuery, true, null);
                try {
                    int columnIndex = CursorUtil.getColumnIndex(cursorQuery, "id");
                    int columnIndex2 = CursorUtil.getColumnIndex(cursorQuery, RemoteConfigConstants.ResponseFieldKey.STATE);
                    int columnIndex3 = CursorUtil.getColumnIndex(cursorQuery, "output");
                    int columnIndex4 = CursorUtil.getColumnIndex(cursorQuery, "initial_delay");
                    int columnIndex5 = CursorUtil.getColumnIndex(cursorQuery, "interval_duration");
                    int columnIndex6 = CursorUtil.getColumnIndex(cursorQuery, "flex_duration");
                    int columnIndex7 = CursorUtil.getColumnIndex(cursorQuery, "run_attempt_count");
                    int columnIndex8 = CursorUtil.getColumnIndex(cursorQuery, "backoff_policy");
                    int columnIndex9 = CursorUtil.getColumnIndex(cursorQuery, "backoff_delay_duration");
                    int columnIndex10 = CursorUtil.getColumnIndex(cursorQuery, "last_enqueue_time");
                    int columnIndex11 = CursorUtil.getColumnIndex(cursorQuery, "period_count");
                    int columnIndex12 = CursorUtil.getColumnIndex(cursorQuery, "generation");
                    int columnIndex13 = CursorUtil.getColumnIndex(cursorQuery, "next_schedule_time_override");
                    int columnIndex14 = CursorUtil.getColumnIndex(cursorQuery, "stop_reason");
                    int columnIndex15 = CursorUtil.getColumnIndex(cursorQuery, "required_network_type");
                    int columnIndex16 = CursorUtil.getColumnIndex(cursorQuery, "required_network_request");
                    int columnIndex17 = CursorUtil.getColumnIndex(cursorQuery, "requires_charging");
                    int columnIndex18 = CursorUtil.getColumnIndex(cursorQuery, "requires_device_idle");
                    int columnIndex19 = CursorUtil.getColumnIndex(cursorQuery, "requires_battery_not_low");
                    int columnIndex20 = CursorUtil.getColumnIndex(cursorQuery, "requires_storage_not_low");
                    int columnIndex21 = CursorUtil.getColumnIndex(cursorQuery, "trigger_content_update_delay");
                    int columnIndex22 = CursorUtil.getColumnIndex(cursorQuery, "trigger_max_content_delay");
                    int columnIndex23 = CursorUtil.getColumnIndex(cursorQuery, "content_uri_triggers");
                    HashMap map = new HashMap();
                    int i = columnIndex13;
                    HashMap map2 = new HashMap();
                    while (cursorQuery.moveToNext()) {
                        int i2 = columnIndex12;
                        String string = cursorQuery.getString(columnIndex);
                        if (!map.containsKey(string)) {
                            map.put(string, new ArrayList());
                        }
                        String string2 = cursorQuery.getString(columnIndex);
                        if (!map2.containsKey(string2)) {
                            map2.put(string2, new ArrayList());
                        }
                        columnIndex12 = i2;
                        columnIndex11 = columnIndex11;
                    }
                    int i3 = columnIndex11;
                    int i4 = columnIndex12;
                    cursorQuery.moveToPosition(-1);
                    RawWorkInfoDao_Impl.this.__fetchRelationshipWorkTagAsjavaLangString(map);
                    RawWorkInfoDao_Impl.this.__fetchRelationshipWorkProgressAsandroidxWorkData(map2);
                    ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                    while (cursorQuery.moveToNext()) {
                        String string3 = columnIndex == -1 ? null : cursorQuery.getString(columnIndex);
                        if (columnIndex2 == -1) {
                            stateIntToState = null;
                        } else {
                            int i5 = cursorQuery.getInt(columnIndex2);
                            WorkTypeConverters workTypeConverters = WorkTypeConverters.INSTANCE;
                            stateIntToState = WorkTypeConverters.intToState(i5);
                        }
                        Data dataFromByteArray = columnIndex3 == -1 ? null : Data.fromByteArray(cursorQuery.getBlob(columnIndex3));
                        long j = columnIndex4 == -1 ? 0L : cursorQuery.getLong(columnIndex4);
                        long j2 = columnIndex5 == -1 ? 0L : cursorQuery.getLong(columnIndex5);
                        long j3 = columnIndex6 == -1 ? 0L : cursorQuery.getLong(columnIndex6);
                        int i6 = columnIndex7 == -1 ? 0 : cursorQuery.getInt(columnIndex7);
                        if (columnIndex8 == -1) {
                            backoffPolicyIntToBackoffPolicy = null;
                        } else {
                            int i7 = cursorQuery.getInt(columnIndex8);
                            WorkTypeConverters workTypeConverters2 = WorkTypeConverters.INSTANCE;
                            backoffPolicyIntToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy(i7);
                        }
                        long j4 = columnIndex9 == -1 ? 0L : cursorQuery.getLong(columnIndex9);
                        long j5 = columnIndex10 == -1 ? 0L : cursorQuery.getLong(columnIndex10);
                        int i8 = i3 == -1 ? 0 : cursorQuery.getInt(i3);
                        int i9 = i4 == -1 ? 0 : cursorQuery.getInt(i4);
                        long j6 = i == -1 ? 0L : cursorQuery.getLong(i);
                        int i10 = columnIndex14 == -1 ? 0 : cursorQuery.getInt(columnIndex14);
                        if (columnIndex15 == -1) {
                            networkTypeIntToNetworkType = null;
                        } else {
                            int i11 = cursorQuery.getInt(columnIndex15);
                            WorkTypeConverters workTypeConverters3 = WorkTypeConverters.INSTANCE;
                            networkTypeIntToNetworkType = WorkTypeConverters.intToNetworkType(i11);
                        }
                        if (columnIndex16 == -1) {
                            networkRequest$work_runtime_release = null;
                        } else {
                            byte[] blob = cursorQuery.getBlob(columnIndex16);
                            WorkTypeConverters workTypeConverters4 = WorkTypeConverters.INSTANCE;
                            networkRequest$work_runtime_release = WorkTypeConverters.toNetworkRequest$work_runtime_release(blob);
                        }
                        if (columnIndex17 == -1) {
                            z = false;
                        } else {
                            z = cursorQuery.getInt(columnIndex17) != 0;
                        }
                        if (columnIndex18 == -1) {
                            z2 = false;
                        } else {
                            z2 = cursorQuery.getInt(columnIndex18) != 0;
                        }
                        boolean z3 = (columnIndex19 == -1 || cursorQuery.getInt(columnIndex19) == 0) ? false : true;
                        boolean z4 = (columnIndex20 == -1 || cursorQuery.getInt(columnIndex20) == 0) ? false : true;
                        long j7 = columnIndex21 == -1 ? 0L : cursorQuery.getLong(columnIndex21);
                        long j8 = columnIndex22 != -1 ? cursorQuery.getLong(columnIndex22) : 0L;
                        columnIndex22 = columnIndex22;
                        int i12 = columnIndex23;
                        long j9 = j8;
                        if (i12 == -1) {
                            setByteArrayToSetOfTriggers = null;
                        } else {
                            byte[] blob2 = cursorQuery.getBlob(i12);
                            WorkTypeConverters workTypeConverters5 = WorkTypeConverters.INSTANCE;
                            setByteArrayToSetOfTriggers = WorkTypeConverters.byteArrayToSetOfTriggers(blob2);
                        }
                        arrayList.add(new WorkSpec.WorkInfoPojo(string3, stateIntToState, dataFromByteArray, j, j2, j3, new Constraints(networkRequest$work_runtime_release, networkTypeIntToNetworkType, z, z2, z3, z4, j7, j9, setByteArrayToSetOfTriggers), i6, backoffPolicyIntToBackoffPolicy, j4, j5, i8, i9, j6, i10, (ArrayList) map.get(cursorQuery.getString(columnIndex)), (ArrayList) map2.get(cursorQuery.getString(columnIndex))));
                        columnIndex23 = i12;
                    }
                    return arrayList;
                } finally {
                    cursorQuery.close();
                }
            }
        });
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void __fetchRelationshipWorkTagAsjavaLangString(HashMap<String, ArrayList<String>> map) {
        Set<String> setKeySet = map.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (map.size() > 999) {
            RelationUtil.recursiveFetchHashMap(map, true, new Function1() { // from class: androidx.work.impl.model.RawWorkInfoDao_Impl$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return this.f$0.m7527x653d68c((HashMap) obj);
                }
            });
            return;
        }
        StringBuilder sbNewStringBuilder = StringUtil.newStringBuilder();
        sbNewStringBuilder.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        int size = setKeySet.size();
        StringUtil.appendPlaceholders(sbNewStringBuilder, size);
        sbNewStringBuilder.append(")");
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire(sbNewStringBuilder.toString(), size);
        Iterator<String> it = setKeySet.iterator();
        int i = 1;
        while (it.hasNext()) {
            roomSQLiteQueryAcquire.bindString(i, it.next());
            i++;
        }
        Cursor cursorQuery = DBUtil.query(this.__db, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndex = CursorUtil.getColumnIndex(cursorQuery, "work_spec_id");
            if (columnIndex != -1) {
                while (cursorQuery.moveToNext()) {
                    ArrayList<String> arrayList = map.get(cursorQuery.getString(columnIndex));
                    if (arrayList != null) {
                        arrayList.add(cursorQuery.getString(0));
                    }
                }
                cursorQuery.close();
                return;
            }
            cursorQuery.close();
        } catch (Throwable th) {
            cursorQuery.close();
            throw th;
        }
    }

    /* JADX INFO: renamed from: lambda$__fetchRelationshipWorkTagAsjavaLangString$0$androidx-work-impl-model-RawWorkInfoDao_Impl, reason: not valid java name */
    final /* synthetic */ Unit m7527x653d68c(HashMap map) {
        __fetchRelationshipWorkTagAsjavaLangString(map);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void __fetchRelationshipWorkProgressAsandroidxWorkData(HashMap<String, ArrayList<Data>> map) {
        Set<String> setKeySet = map.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (map.size() > 999) {
            RelationUtil.recursiveFetchHashMap(map, true, new Function1() { // from class: androidx.work.impl.model.RawWorkInfoDao_Impl$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return this.f$0.m7526x83915589((HashMap) obj);
                }
            });
            return;
        }
        StringBuilder sbNewStringBuilder = StringUtil.newStringBuilder();
        sbNewStringBuilder.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        int size = setKeySet.size();
        StringUtil.appendPlaceholders(sbNewStringBuilder, size);
        sbNewStringBuilder.append(")");
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire(sbNewStringBuilder.toString(), size);
        Iterator<String> it = setKeySet.iterator();
        int i = 1;
        while (it.hasNext()) {
            roomSQLiteQueryAcquire.bindString(i, it.next());
            i++;
        }
        Cursor cursorQuery = DBUtil.query(this.__db, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndex = CursorUtil.getColumnIndex(cursorQuery, "work_spec_id");
            if (columnIndex != -1) {
                while (cursorQuery.moveToNext()) {
                    ArrayList<Data> arrayList = map.get(cursorQuery.getString(columnIndex));
                    if (arrayList != null) {
                        arrayList.add(Data.fromByteArray(cursorQuery.getBlob(0)));
                    }
                }
                cursorQuery.close();
                return;
            }
            cursorQuery.close();
        } catch (Throwable th) {
            cursorQuery.close();
            throw th;
        }
    }

    /* JADX INFO: renamed from: lambda$__fetchRelationshipWorkProgressAsandroidxWorkData$1$androidx-work-impl-model-RawWorkInfoDao_Impl, reason: not valid java name */
    final /* synthetic */ Unit m7526x83915589(HashMap map) {
        __fetchRelationshipWorkProgressAsandroidxWorkData(map);
        return Unit.INSTANCE;
    }
}
