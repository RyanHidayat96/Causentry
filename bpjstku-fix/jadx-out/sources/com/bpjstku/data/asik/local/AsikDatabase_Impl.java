package com.bpjstku.data.asik.local;

import androidx.database.SQLite;
import androidx.database.SQLiteConnection;
import androidx.room.InvalidationTracker;
import androidx.room.RoomMasterTable;
import androidx.room.RoomOpenDelegate;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import com.google.android.libraries.places.api.model.PlaceTypes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class AsikDatabase_Impl extends AsikDatabase {
    private volatile AddressPostalCodeDao _addressPostalCodeDao;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.room.RoomDatabase
    public final RoomOpenDelegate createOpenDelegate() {
        return new RoomOpenDelegate(1, "660c328c8a3b50c5910ce1c4935543b5", "65739da5d82860d59f4d77eda8df4f0c") { // from class: com.bpjstku.data.asik.local.AsikDatabase_Impl.1
            @Override // androidx.room.RoomOpenDelegate
            public void onCreate(SQLiteConnection sQLiteConnection) {
            }

            @Override // androidx.room.RoomOpenDelegate
            public void onPostMigrate(SQLiteConnection sQLiteConnection) {
            }

            @Override // androidx.room.RoomOpenDelegate
            public void createAllTables(SQLiteConnection sQLiteConnection) throws Exception {
                SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `address_postal_code` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `code` TEXT NOT NULL, `address` TEXT NOT NULL)");
                SQLite.execSQL(sQLiteConnection, RoomMasterTable.CREATE_QUERY);
                SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '660c328c8a3b50c5910ce1c4935543b5')");
            }

            @Override // androidx.room.RoomOpenDelegate
            public void dropAllTables(SQLiteConnection sQLiteConnection) throws Exception {
                SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `address_postal_code`");
            }

            @Override // androidx.room.RoomOpenDelegate
            public void onOpen(SQLiteConnection sQLiteConnection) {
                AsikDatabase_Impl.this.internalInitInvalidationTracker(sQLiteConnection);
            }

            @Override // androidx.room.RoomOpenDelegate
            public void onPreMigrate(SQLiteConnection sQLiteConnection) {
                DBUtil.dropFtsSyncTriggers(sQLiteConnection);
            }

            @Override // androidx.room.RoomOpenDelegate
            public RoomOpenDelegate.ValidationResult onValidateSchema(SQLiteConnection sQLiteConnection) {
                HashMap map = new HashMap(3);
                map.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
                map.put("code", new TableInfo.Column("code", "TEXT", true, 0, null, 1));
                map.put(PlaceTypes.ADDRESS, new TableInfo.Column(PlaceTypes.ADDRESS, "TEXT", true, 0, null, 1));
                TableInfo tableInfo = new TableInfo("address_postal_code", map, new HashSet(0), new HashSet(0));
                TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "address_postal_code");
                if (!tableInfo.equals(tableInfo2)) {
                    StringBuilder sb = new StringBuilder("address_postal_code(com.bpjstku.data.asik.local.entity.AddressPostalCodeEntity).\n Expected:\n");
                    sb.append(tableInfo);
                    sb.append("\n Found:\n");
                    sb.append(tableInfo2);
                    return new RoomOpenDelegate.ValidationResult(false, sb.toString());
                }
                return new RoomOpenDelegate.ValidationResult(true, null);
            }
        };
    }

    @Override // androidx.room.RoomDatabase
    public final InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "address_postal_code");
    }

    @Override // androidx.room.RoomDatabase
    public final void clearAllTables() {
        super.performClear(false, "address_postal_code");
    }

    @Override // androidx.room.RoomDatabase
    public final Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(AddressPostalCodeDao.class, AddressPostalCodeDao_Impl.getRequiredConverters());
        return map;
    }

    @Override // androidx.room.RoomDatabase
    public final Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.RoomDatabase
    public final List<Migration> getAutoMigrations(Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> map) {
        return new ArrayList();
    }

    @Override // com.bpjstku.data.asik.local.AsikDatabase
    public final AddressPostalCodeDao addressPostalCodeDao() {
        AddressPostalCodeDao addressPostalCodeDao;
        if (this._addressPostalCodeDao != null) {
            return this._addressPostalCodeDao;
        }
        synchronized (this) {
            if (this._addressPostalCodeDao == null) {
                this._addressPostalCodeDao = new AddressPostalCodeDao_Impl(this);
            }
            addressPostalCodeDao = this._addressPostalCodeDao;
        }
        return addressPostalCodeDao;
    }
}
