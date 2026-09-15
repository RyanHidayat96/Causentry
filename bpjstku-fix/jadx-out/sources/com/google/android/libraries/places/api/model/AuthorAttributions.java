package com.google.android.libraries.places.api.model;

import android.os.Parcelable;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AuthorAttributions implements Parcelable {
    public static AuthorAttributions newInstance(List<AuthorAttribution> list) {
        return new zzbw(ImmutableList.TuitionPaymentFragmentspecialinlinedviewModeldefault1(list));
    }

    public abstract List<AuthorAttribution> asList();
}
