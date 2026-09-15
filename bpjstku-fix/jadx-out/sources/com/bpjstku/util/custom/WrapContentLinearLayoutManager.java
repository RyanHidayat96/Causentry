package com.bpjstku.util.custom;

import android.content.Context;
import android.os.Process;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.getContentPaddingRight;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\u000b\u001a\u00020\n2\f\u0010\u0003\u001a\b\u0018\u00010\u0006R\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/bpjstku/util/custom/WrapContentLinearLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Landroid/content/Context;", "p0", "<init>", "(Landroid/content/Context;)V", "Landroidx/recyclerview/widget/RecyclerView$Recycler;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroidx/recyclerview/widget/RecyclerView$State;", "p1", "", "onLayoutChildren", "(Landroidx/recyclerview/widget/RecyclerView$Recycler;Landroidx/recyclerview/widget/RecyclerView$State;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class WrapContentLinearLayoutManager extends LinearLayoutManager {
    public static int TuitionPaymentFragmentbindingInflater1;
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WrapContentLinearLayoutManager(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutChildren(RecyclerView.Recycler p0, RecyclerView.State p1) throws IOException {
        try {
            super.onLayoutChildren(p0, p1);
        } catch (IndexOutOfBoundsException e2) {
            getContentPaddingRight.b bVarB = getContentPaddingRight.b("rvoutofbound");
            Intrinsics.checkExpressionValueIsNotNull(bVarB, "");
            bVarB.TuitionPaymentFragmentspecialinlinedviewModeldefault1(e2);
        }
    }

    public static int TuitionPaymentFragmentbindingInflater1() {
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i2 = i % 9834060;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i + 1;
        if (i2 != 0) {
            return TuitionPaymentFragmentbindingInflater1;
        }
        int startUptimeMillis = (int) Process.getStartUptimeMillis();
        TuitionPaymentFragmentbindingInflater1 = startUptimeMillis;
        return startUptimeMillis;
    }
}
