package com.nbs.validacion.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import defpackage.ViewPortBuilder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R+\u0010\u000f\u001a\u0019\u0012\u0015\u0012\u0013\u0012\t\u0012\u00070\n¢\u0006\u0002\b\u000b\u0012\u0004\u0012\u00020\f0\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/nbs/validacion/views/ValidacionSpinner;", "Landroid/widget/Spinner;", "Landroid/content/Context;", "p0", "Landroid/util/AttributeSet;", "p1", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Ljava/util/List;", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {2, 3, 0})
public final class ValidacionSpinner extends Spinner {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public final List<Function1<Integer, Unit>> TuitionPaymentFragmentbindingInflater1;

    public ValidacionSpinner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.TuitionPaymentFragmentbindingInflater1 = new ArrayList();
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements AdapterView.OnItemSelectedListener {
        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onNothingSelected(AdapterView<?> adapterView) {
        }

        public TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            ViewPortBuilder.b(view);
            try {
                Iterator it = ValidacionSpinner.this.TuitionPaymentFragmentbindingInflater1.iterator();
                while (it.hasNext()) {
                    ((Function1) it.next()).invoke(Integer.valueOf(i));
                }
            } finally {
                ViewPortBuilder.TuitionPaymentFragmentbindingInflater1();
            }
        }
    }
}
