package com.bpjstku.presentation.country;

import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.bpjstku.domain.general.model.CodeNamePair;
import com.google.android.material.chip.Chip;
import defpackage.getItemView;
import defpackage.initSession;
import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final /* synthetic */ class ListDialCodeBottomSheetFragment$dialCodeAdapter$2$1 extends FunctionReferenceImpl implements Function1<CodeNamePair, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(CodeNamePair codeNamePair) throws IllegalAccessException {
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1096626159);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 46400), 40 - Gravity.getAbsoluteGravity(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0) + 19, 1513912262, false, "b", null);
        }
        int i = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-914723831);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.indexOf("", "", 0) + 37836), TextUtils.lastIndexOf("", '0') + 60, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 18, 769969118, false, "TuitionPaymentFragmentbindingInflater1", null);
        }
        int i2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(null);
        long j = i2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-639884696);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 37836), View.MeasureSpec.getSize(0) + 59, Process.getGidForName("") + 19, 1027769791, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
        }
        int i3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).getInt(null);
        long j2 = 764;
        long j3 = -1;
        long jIdentityHashCode = ((long) System.identityHashCode(this)) ^ j3;
        long j4 = (jIdentityHashCode | 4486707474417816976L) ^ j3;
        long j5 = ((j3 ^ 4486707474417816976L) | 1032546022741969263L) ^ j3;
        long j6 = (((long) 765) * 4486707474417816976L) + (((long) (-1527)) * 1032546022741969263L) + ((j4 | 1032546022741969263L) * j2) + (((long) (-1528)) * (j5 | ((jIdentityHashCode | 1032546022741969263L) ^ j3))) + (j2 * (j5 | (((j3 ^ 1032546022741969263L) | 4486707474417816976L) ^ j3) | j4));
        int i4 = 0;
        while (true) {
            for (int i5 = 0; i5 != 8; i5++) {
                i3 = (((((int) (j >> i5)) & 255) + (i3 << 6)) + (i3 << 16)) - i3;
            }
            if (i4 != 0) {
                break;
            }
            i4++;
            j = j6;
        }
        if (i3 != i) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551937752);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46399 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), Gravity.getAbsoluteGravity(0, 0) + 40, 19 - View.resolveSizeAndState(0, 0, 0), -1205987569, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault2", null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null);
            Toast.makeText((Context) null, i2 / (((i2 - 1) * i2) % 2), 0).show();
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(codeNamePair);
        return Unit.INSTANCE;
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(CodeNamePair codeNamePair) {
        Intrinsics.checkNotNullParameter(codeNamePair, "");
        Object[] objArr = {(getItemView) this.receiver, codeNamePair};
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        getItemView.b(Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 1675676915, objArr, Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -1675676914, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, iTuitionPaymentFragmentspecialinlinedviewModeldefault1);
    }

    public ListDialCodeBottomSheetFragment$dialCodeAdapter$2$1(Object obj) {
        super(1, obj, getItemView.class, "handleItemClicked", "handleItemClicked(Lcom/bpjstku/domain/general/model/CodeNamePair;)V", 0);
    }
}
