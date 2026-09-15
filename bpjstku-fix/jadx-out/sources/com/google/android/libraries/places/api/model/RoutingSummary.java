package com.google.android.libraries.places.api.model;

import android.os.Parcelable;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class RoutingSummary implements Parcelable {
    public static RoutingSummary newInstance(List<Leg> list) {
        return new zzea(ImmutableList.TuitionPaymentFragmentspecialinlinedviewModeldefault1(list));
    }

    public abstract List<Leg> getLegs();
}
