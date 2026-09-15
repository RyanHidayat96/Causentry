package com.bpjstku.databinding;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import defpackage.initSession;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes3.dex */
public final class ItemListTuitionCompanyBinding implements ViewBinding {
    private final LinearLayout rootView;
    public final RecyclerView rvListTuitionCompany;
    public final AppCompatTextView tvTuitionCompanyName;

    @Override // androidx.viewbinding.ViewBinding
    public final /* bridge */ /* synthetic */ View getRoot() throws IllegalAccessException {
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1096626159);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (46400 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 39, 19 - Gravity.getAbsoluteGravity(0, 0), 1513912262, false, "b", null);
        }
        int i = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-914723831);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (37836 - TextUtils.indexOf("", "", 0, 0)), 59 - TextUtils.getTrimmedLength(""), KeyEvent.keyCodeFromString("") + 18, 769969118, false, "TuitionPaymentFragmentbindingInflater1", null);
        }
        int i2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(null);
        long j = i2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-639884696);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 37835), 59 - Color.alpha(0), (ViewConfiguration.getTouchSlop() >> 8) + 18, 1027769791, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
        }
        int i3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).getInt(null);
        long j2 = -721;
        long jIdentityHashCode = System.identityHashCode(this);
        long j3 = -1;
        long j4 = j3 ^ 1385575287066675674L;
        long j5 = j3 ^ 4133678210093110565L;
        long j6 = 4287373450147749375L ^ j3;
        long j7 = (j2 * 1385575287066675674L) + (j2 * 4133678210093110565L) + (((long) 1444) * ((jIdentityHashCode ^ j3) | ((j4 | j5) ^ j3) | j6)) + (((long) (-1444)) * (j6 | ((jIdentityHashCode | 1385575287066675674L) ^ j3) | ((jIdentityHashCode | 4133678210093110565L) ^ j3))) + (((long) 722) * ((j3 ^ (j5 | 1385575287066675674L)) | ((j4 | 4133678210093110565L) ^ j3)));
        int i4 = 0;
        while (true) {
            for (int i5 = 0; i5 != 8; i5++) {
                i3 = (((((int) (j >> i5)) & 255) + (i3 << 6)) + (i3 << 16)) - i3;
            }
            if (i4 != 0) {
                break;
            }
            i4++;
            j = j7;
        }
        if (i3 != i) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551937752);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (AndroidCharacter.getMirror('0') + 46352), 40 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 19 - (ViewConfiguration.getJumpTapTimeout() >> 16), -1205987569, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault2", null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null);
            Toast.makeText((Context) null, i2 / (((i2 - 1) * i2) % 2), 0).show();
        }
        return getRoot();
    }

    private ItemListTuitionCompanyBinding(LinearLayout linearLayout, RecyclerView recyclerView, AppCompatTextView appCompatTextView) {
        this.rootView = linearLayout;
        this.rvListTuitionCompany = recyclerView;
        this.tvTuitionCompanyName = appCompatTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final LinearLayout getRoot() {
        return this.rootView;
    }

    public static ItemListTuitionCompanyBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemListTuitionCompanyBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_list_tuition_company, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ItemListTuitionCompanyBinding bind(View view) {
        int i = R.id.rvListTuitionCompany;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvListTuitionCompany);
        if (recyclerView != null) {
            i = R.id.tvTuitionCompanyName;
            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvTuitionCompanyName);
            if (appCompatTextView != null) {
                return new ItemListTuitionCompanyBinding((LinearLayout) view, recyclerView, appCompatTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
