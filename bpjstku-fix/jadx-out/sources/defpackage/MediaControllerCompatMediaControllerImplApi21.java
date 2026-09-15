package defpackage;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.airbnb.lottie.model.DocumentData;
import java.lang.reflect.Field;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class MediaControllerCompatMediaControllerImplApi21 extends onSessionEvent<DocumentData> {
    public MediaControllerCompatMediaControllerImplApi21(List<onSkipToNext<DocumentData>> list) {
        super(list);
    }

    @Override // defpackage.binderDied
    final /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(onSkipToNext onskiptonext, float f) throws IllegalAccessException {
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1096626159);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (46400 - View.getDefaultSize(0, 0)), View.MeasureSpec.getSize(0) + 40, 19 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 1513912262, false, "b", null);
        }
        int i = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-914723831);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (37836 - TextUtils.getCapsMode("", 0, 0)), ((byte) KeyEvent.getModifierMetaStateMask()) + 60, 18 - (ViewConfiguration.getTouchSlop() >> 8), 769969118, false, "TuitionPaymentFragmentbindingInflater1", null);
        }
        int i2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(null);
        long j = i2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-639884696);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 37835), 59 - ExpandableListView.getPackedPositionType(0L), 18 - (ViewConfiguration.getLongPressTimeout() >> 16), 1027769791, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
        }
        int i3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).getInt(null);
        long j2 = 46;
        long j3 = -1;
        long j4 = j3 ^ 4717026214771217633L;
        long jMyPid = Process.myPid();
        long j5 = jMyPid ^ j3;
        long j6 = (j2 * 802227282388568606L) + (j2 * 4717026214771217633L) + (((long) (-90)) * (((j4 | j5) ^ j3) | 802227282388568606L)) + (((long) (-45)) * (((j4 | jMyPid) ^ j3) | (5437603417875144447L ^ j3))) + (((long) 45) * ((j3 ^ (j5 | 802227282388568606L)) | j4 | (((j3 ^ 802227282388568606L) | jMyPid) ^ j3)));
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
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46400 - ExpandableListView.getPackedPositionGroup(0L)), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 41, 19 - TextUtils.getCapsMode("", 0, 0), -1205987569, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault2", null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null);
            int[] iArr = new int[i2];
            int i6 = i2 - 1;
            iArr[i6] = 1;
            Toast.makeText((Context) null, iArr[((i2 * i6) % 2) - 1], 1).show();
        }
        return (DocumentData) onskiptonext.d;
    }
}
