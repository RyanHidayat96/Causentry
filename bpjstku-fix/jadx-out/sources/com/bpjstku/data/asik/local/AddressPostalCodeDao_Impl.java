package com.bpjstku.data.asik.local;

import androidx.database.SQLiteConnection;
import androidx.database.SQLiteStatement;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RxRoom;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import com.bpjstku.data.asik.local.entity.AddressPostalCodeEntity;
import com.google.android.libraries.places.api.model.PlaceTypes;
import defpackage.deriveCodec;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class AddressPostalCodeDao_Impl implements AddressPostalCodeDao {
    private final RoomDatabase __db;
    private final EntityInsertAdapter<AddressPostalCodeEntity> __insertAdapterOfAddressPostalCodeEntity = new EntityInsertAdapter<AddressPostalCodeEntity>() { // from class: com.bpjstku.data.asik.local.AddressPostalCodeDao_Impl.1
        @Override // androidx.room.EntityInsertAdapter
        public String createQuery() {
            return "INSERT OR REPLACE INTO `address_postal_code` (`id`,`code`,`address`) VALUES (nullif(?, 0),?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.EntityInsertAdapter
        public void bind(SQLiteStatement sQLiteStatement, AddressPostalCodeEntity addressPostalCodeEntity) {
            sQLiteStatement.mo7356bindLong(1, addressPostalCodeEntity.getId());
            if (addressPostalCodeEntity.getCode() == null) {
                sQLiteStatement.mo7357bindNull(2);
            } else {
                sQLiteStatement.mo7358bindText(2, addressPostalCodeEntity.getCode());
            }
            if (addressPostalCodeEntity.getAddress() == null) {
                sQLiteStatement.mo7357bindNull(3);
            } else {
                sQLiteStatement.mo7358bindText(3, addressPostalCodeEntity.getAddress());
            }
        }
    };

    public AddressPostalCodeDao_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
    }

    @Override // com.bpjstku.data.asik.local.AddressPostalCodeDao
    public final void insertAllAddressPostalCode(final List<AddressPostalCodeEntity> list) {
        DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: com.bpjstku.data.asik.local.AddressPostalCodeDao_Impl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return this.f$0.lambda$insertAllAddressPostalCode$0(list, (SQLiteConnection) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$insertAllAddressPostalCode$0(List list, SQLiteConnection sQLiteConnection) throws Exception {
        this.__insertAdapterOfAddressPostalCodeEntity.insert(sQLiteConnection, list);
        return null;
    }

    @Override // com.bpjstku.data.asik.local.AddressPostalCodeDao
    public final deriveCodec<List<AddressPostalCodeEntity>> getAllAddressPostalCode() {
        return RxRoom.createSingle(this.__db, true, false, new Function1() { // from class: com.bpjstku.data.asik.local.AddressPostalCodeDao_Impl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AddressPostalCodeDao_Impl.lambda$getAllAddressPostalCode$1((SQLiteConnection) obj);
            }
        });
    }

    static /* synthetic */ List lambda$getAllAddressPostalCode$1(SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM address_postal_code");
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "code");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, PlaceTypes.ADDRESS);
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                long j = sQLiteStatementPrepare.getLong(columnIndexOrThrow);
                String text = null;
                String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow3)) {
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                }
                arrayList.add(new AddressPostalCodeEntity(j, text2, text));
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }
}
