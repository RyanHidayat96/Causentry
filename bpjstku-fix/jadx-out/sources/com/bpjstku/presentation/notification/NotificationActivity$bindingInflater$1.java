package com.bpjstku.presentation.notification;

import android.graphics.Color;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bpjstku.databinding.ActivityNotificationBinding;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class NotificationActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityNotificationBinding> {
    public static final NotificationActivity$bindingInflater$1 TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new NotificationActivity$bindingInflater$1();

    public final ActivityNotificationBinding TuitionPaymentFragmentspecialinlinedviewModeldefault2(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityNotificationBinding.inflate(layoutInflater);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ ActivityNotificationBinding invoke(LayoutInflater layoutInflater) throws IllegalAccessException {
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1096626159);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (46399 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 40 - View.MeasureSpec.getMode(0), 19 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 1513912262, false, "b", null);
        }
        int i = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-914723831);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (37836 - TextUtils.indexOf("", "", 0, 0)), 59 - (Process.myTid() >> 22), ExpandableListView.getPackedPositionChild(0L) + 19, 769969118, false, "TuitionPaymentFragmentbindingInflater1", null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(null);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-639884696);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (Process.getGidForName("") + 37837), 59 - (Process.myTid() >> 22), 18 - Color.red(0), 1027769791, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
        }
        int i2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).getInt(null);
        long j2 = 628;
        long j3 = (j2 * 486633049028821440L) + (j2 * 5032620448130964799L);
        long j4 = -627;
        long jNextInt = new Random().nextInt(2114230172);
        long j5 = -1;
        long j6 = j3 + ((jNextInt | 5032620448130964799L | (j5 ^ 486633049028821440L)) * j4) + (j4 * ((((j5 ^ 5032620448130964799L) | jNextInt) ^ j5) | 486633049028821440L)) + (((long) 627) * ((j5 ^ (jNextInt | 486633049028821440L)) | (((jNextInt ^ j5) | 5032620448130964799L) ^ j5)));
        int i3 = i2;
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
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 46400), 40 - TextUtils.getCapsMode("", 0, 0), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 19, -1205987569, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault2", null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null);
            throw null;
        }
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2(layoutInflater);
    }

    NotificationActivity$bindingInflater$1() {
        super(1, ActivityNotificationBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityNotificationBinding;", 0);
    }
}
