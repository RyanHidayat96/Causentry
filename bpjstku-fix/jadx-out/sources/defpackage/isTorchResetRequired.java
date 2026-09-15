package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import com.bpjstku.domain.general.model.CodeNamePair;
import java.lang.reflect.Field;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R*\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR*\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\u000b\u0010\nR*\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\b\u001a\u0004\b\r\u0010\nR*\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\nR*\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000e\u0010\n"}, d2 = {"LisTorchResetRequired;", "", "<init>", "()V", "Ljava/util/ArrayList;", "Lcom/bpjstku/domain/general/model/CodeNamePair;", "Lkotlin/collections/b;", "asInterface", "Ljava/util/ArrayList;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()Ljava/util/ArrayList;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "b", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class isTorchResetRequired {
    public static final isTorchResetRequired INSTANCE = new isTorchResetRequired();

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private static final ArrayList<CodeNamePair> TuitionPaymentFragmentspecialinlinedviewModeldefault1 = CollectionsKt.arrayListOf(new CodeNamePair("1", "1"), new CodeNamePair(ExifInterface.GPS_MEASUREMENT_2D, ExifInterface.GPS_MEASUREMENT_2D));
    private static final ArrayList<CodeNamePair> b = CollectionsKt.arrayListOf(new CodeNamePair("1", "1"), new CodeNamePair(ExifInterface.GPS_MEASUREMENT_2D, ExifInterface.GPS_MEASUREMENT_2D), new CodeNamePair(ExifInterface.GPS_MEASUREMENT_3D, ExifInterface.GPS_MEASUREMENT_3D), new CodeNamePair("4", "4"), new CodeNamePair("5", "5"), new CodeNamePair("6", "6"));
    private static final ArrayList<CodeNamePair> TuitionPaymentFragmentspecialinlinedviewModeldefault3 = CollectionsKt.arrayListOf(new CodeNamePair("7", "7"), new CodeNamePair("8", "8"), new CodeNamePair("9", "9"));

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private static final ArrayList<CodeNamePair> TuitionPaymentFragmentspecialinlinedviewModeldefault2 = CollectionsKt.arrayListOf(new CodeNamePair("10", "10"), new CodeNamePair("11", "11"), new CodeNamePair("12", "12"));
    private static final ArrayList<CodeNamePair> TuitionPaymentFragmentbindingInflater1 = CollectionsKt.arrayListOf(new CodeNamePair("1", "1"), new CodeNamePair(ExifInterface.GPS_MEASUREMENT_2D, ExifInterface.GPS_MEASUREMENT_2D), new CodeNamePair(ExifInterface.GPS_MEASUREMENT_3D, ExifInterface.GPS_MEASUREMENT_3D), new CodeNamePair("4", "4"), new CodeNamePair("5", "5"));

    private isTorchResetRequired() {
    }

    public static ArrayList<CodeNamePair> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1096626159);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (46400 - (ViewConfiguration.getTapTimeout() >> 16)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 40, 18 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 1513912262, false, "b", null);
        }
        int i = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-914723831);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 37836), 60 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 18 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 769969118, false, "TuitionPaymentFragmentbindingInflater1", null);
        }
        int i2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(null);
        long j = i2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-639884696);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 37835), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 58, TextUtils.indexOf((CharSequence) "", '0', 0) + 19, 1027769791, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
        }
        int i3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).getInt(null);
        long j2 = -1;
        long j3 = j2 ^ 1355788553598550745L;
        long jUptimeMillis = (int) SystemClock.uptimeMillis();
        long j4 = TypedValues.AttributesType.TYPE_PIVOT_TARGET;
        long j5 = jUptimeMillis ^ j2;
        long j6 = (((long) 319) * 4163464943561235494L) + (((long) (-317)) * 1355788553598550745L) + (((long) (-318)) * (j3 | (((j2 ^ 4163464943561235494L) | jUptimeMillis) ^ j2))) + ((((j3 | jUptimeMillis) ^ j2) | ((j5 | 4312121669046656767L) ^ j2)) * j4) + (j4 * ((j2 ^ (4312121669046656767L | jUptimeMillis)) | (((j3 | j5) | 4163464943561235494L) ^ j2)));
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
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46399 - TextUtils.lastIndexOf("", '0')), 39 - ExpandableListView.getPackedPositionChild(0L), 19 - Color.argb(0, 0, 0, 0), -1205987569, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault2", null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null);
            Toast.makeText((Context) null, i2 / (((i2 - 1) * i2) % 2), 0).show();
        }
        return TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    public static ArrayList<CodeNamePair> TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return b;
    }

    public static ArrayList<CodeNamePair> TuitionPaymentFragmentbindingInflater1() {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    public static ArrayList<CodeNamePair> b() {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    public static ArrayList<CodeNamePair> TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return TuitionPaymentFragmentbindingInflater1;
    }
}
