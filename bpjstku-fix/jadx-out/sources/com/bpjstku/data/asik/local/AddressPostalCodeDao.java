package com.bpjstku.data.asik.local;

import com.bpjstku.data.asik.local.entity.AddressPostalCodeEntity;
import defpackage.deriveCodec;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H'¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcom/bpjstku/data/asik/local/AddressPostalCodeDao;", "", "LderiveCodec;", "", "Lcom/bpjstku/data/asik/local/entity/AddressPostalCodeEntity;", "getAllAddressPostalCode", "()LderiveCodec;", "p0", "", "insertAllAddressPostalCode", "(Ljava/util/List;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface AddressPostalCodeDao {
    deriveCodec<List<AddressPostalCodeEntity>> getAllAddressPostalCode();

    void insertAllAddressPostalCode(List<AddressPostalCodeEntity> p0);
}
