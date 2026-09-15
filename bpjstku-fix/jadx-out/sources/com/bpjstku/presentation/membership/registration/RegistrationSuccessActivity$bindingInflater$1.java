package com.bpjstku.presentation.membership.registration;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bpjstku.databinding.ActivityRegistrationSuccessBinding;
import defpackage.initSession;
import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class RegistrationSuccessActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityRegistrationSuccessBinding> {
    public static final RegistrationSuccessActivity$bindingInflater$1 TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new RegistrationSuccessActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
    public final ActivityRegistrationSuccessBinding invoke(LayoutInflater layoutInflater) throws IllegalAccessException {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1096626159);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 46400), TextUtils.getOffsetBefore("", 0) + 40, 19 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 1513912262, false, "b", null);
        }
        int i = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-914723831);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (Color.argb(0, 0, 0, 0) + 37836), Drawable.resolveOpacity(0, 0) + 59, 17 - TextUtils.lastIndexOf("", '0'), 769969118, false, "TuitionPaymentFragmentbindingInflater1", null);
        }
        int i2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(null);
        long j = i2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-639884696);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (37836 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), 58 - Process.getGidForName(""), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 18, 1027769791, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
        }
        int i3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).getInt(null);
        long j2 = -1;
        long j3 = j2 ^ 3735448057836979373L;
        long jIdentityHashCode = System.identityHashCode(this);
        long j4 = (((long) 303) * 3735448057836979373L) + (((long) (-301)) * 1783805439322806866L) + (((long) (-302)) * ((((j3 | (jIdentityHashCode ^ j2)) | 1783805439322806866L) ^ j2) | ((4312191969066475263L | jIdentityHashCode) ^ j2))) + (((long) (-604)) * (((j3 | 1783805439322806866L) | jIdentityHashCode) ^ j2)) + (((long) 302) * ((((j2 ^ 1783805439322806866L) | 3735448057836979373L) ^ j2) | (j2 ^ (jIdentityHashCode | 1783805439322806866L))));
        int i4 = 0;
        while (true) {
            for (int i5 = 0; i5 != 8; i5++) {
                i3 = (((((int) (j >> i5)) & 255) + (i3 << 6)) + (i3 << 16)) - i3;
            }
            if (i4 != 0) {
                break;
            }
            i4++;
            j = j4;
        }
        if (i3 != i) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551937752);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (KeyEvent.normalizeMetaState(0) + 46400), View.MeasureSpec.getSize(0) + 40, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 19, -1205987569, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault2", null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null);
            throw new RuntimeException(String.valueOf(i2));
        }
        return ActivityRegistrationSuccessBinding.inflate(layoutInflater);
    }

    RegistrationSuccessActivity$bindingInflater$1() {
        super(1, ActivityRegistrationSuccessBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityRegistrationSuccessBinding;", 0);
    }
}
