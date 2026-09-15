package com.google.android.libraries.places.api.model;

import android.os.Parcelable;
import android.text.TextUtils;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AddressComponent implements Parcelable {

    public static abstract class Builder {
        public AddressComponent build() {
            AddressComponent addressComponentZzc = zzc();
            if (!(!addressComponentZzc.getName().isEmpty())) {
                throw new IllegalArgumentException("Name must not be empty.");
            }
            List<String> types = addressComponentZzc.getTypes();
            Iterator<String> it = types.iterator();
            while (it.hasNext()) {
                if (!(!TextUtils.isEmpty(it.next()))) {
                    throw new IllegalArgumentException("Types must not contain null or empty values.");
                }
            }
            zzb(ImmutableList.TuitionPaymentFragmentspecialinlinedviewModeldefault1(types));
            return zzc();
        }

        public abstract String getShortName();

        public abstract Builder setShortName(String str);

        abstract Builder zzb(List list);

        abstract AddressComponent zzc();
    }

    public static Builder builder(String str, List<String> list) {
        zzc zzcVar = new zzc();
        zzcVar.zza(str);
        zzcVar.zzb(list);
        return zzcVar;
    }

    public abstract String getName();

    public abstract String getShortName();

    public abstract List<String> getTypes();
}
