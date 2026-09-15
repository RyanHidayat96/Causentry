package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes3.dex */
public final class CameraConfigsDefaultCameraConfig implements getSurfaceConfig<CameraConfigs> {

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 {
        public static final CameraConfigsDefaultCameraConfig TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new CameraConfigsDefaultCameraConfig();
    }

    @Override // defpackage.ExtraSupportedResolutionQuirk
    public final /* synthetic */ Object get() throws IllegalAccessException {
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1096626159);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (46401 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), Color.green(0) + 40, 19 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 1513912262, false, "b", null);
        }
        int i = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-914723831);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 37835), 59 - ExpandableListView.getPackedPositionType(0L), 18 - ExpandableListView.getPackedPositionType(0L), 769969118, false, "TuitionPaymentFragmentbindingInflater1", null);
        }
        int i2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(null);
        long j = i2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-639884696);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TextUtils.indexOf("", "") + 37836), 58 - ExpandableListView.getPackedPositionChild(0L), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 17, 1027769791, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
        }
        int i3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).getInt(null);
        long j2 = 464;
        long j3 = -1;
        long j4 = j3 ^ 1850580008017966717L;
        long jIdentityHashCode = System.identityHashCode(this);
        long j5 = jIdentityHashCode ^ j3;
        long j6 = (j4 | 3668673489141819522L) ^ j3;
        long j7 = (((long) 465) * 3668673489141819522L) + (((long) (-463)) * 1850580008017966717L) + ((((j4 | j5) ^ j3) | j6 | ((j5 | 3668673489141819522L) ^ j3)) * j2) + (((long) (-464)) * (jIdentityHashCode | (j3 ^ 3668673489141819522L) | j4)) + (j2 * (j6 | ((jIdentityHashCode | 3668673489141819522L) ^ j3)));
        long j8 = j;
        int i4 = 0;
        while (true) {
            for (int i5 = 0; i5 != 8; i5++) {
                i3 = (((((int) (j8 >> i5)) & 255) + (i3 << 6)) + (i3 << 16)) - i3;
            }
            if (i4 != 0) {
                break;
            }
            i4++;
            j8 = j7;
        }
        if (i3 != i) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551937752);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 46399), 39 - TextUtils.lastIndexOf("", '0', 0, 0), 19 - (ViewConfiguration.getFadingEdgeLength() >> 16), -1205987569, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault2", null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null);
            Toast.makeText((Context) null, i2 / (((i2 - 1) * i2) % 2), 0).show();
        }
        return new getCameraCaptureFailure();
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        UseCaseConfigFactoryProvider.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0] = UseCaseConfigFactory.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0];
    }
}
