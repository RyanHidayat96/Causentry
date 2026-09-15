package com.nbs.validacion.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RadioGroup;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R+\u0010\r\u001a\u0019\u0012\u0015\u0012\u0013\u0012\t\u0012\u00070\n¢\u0006\u0002\b\u000b\u0012\u0004\u0012\u00020\f0\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/nbs/validacion/views/ValidacionRadioGroup;", "Landroid/widget/RadioGroup;", "Landroid/content/Context;", "p0", "Landroid/util/AttributeSet;", "p1", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "", "b", "Ljava/util/List;"}, k = 1, mv = {2, 3, 0})
public final class ValidacionRadioGroup extends RadioGroup {
    public final List<Function1<Integer, Unit>> b;

    public ValidacionRadioGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new ArrayList();
    }
}
