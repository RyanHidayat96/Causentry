package defpackage;

import androidx.recyclerview.widget.ItemTouchHelper;
import com.dynatrace.android.agent.crash.PlatformType;

/* JADX INFO: loaded from: classes5.dex */
public final class isCurrentCamera implements getViewPortCropRect {
    private final String TuitionPaymentFragmentbindingInflater1;
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final int b;

    public isCurrentCamera(String str, int i) {
        this(str, i, (byte) 0);
    }

    private isCurrentCamera(String str, int i, byte b) {
        this.TuitionPaymentFragmentbindingInflater1 = str;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i;
        this.b = 128000;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1000;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION;
    }

    @Override // defpackage.getViewPortCropRect
    public final getTargetFrameRateInternal TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        String string;
        String string2;
        String[] strArrSplit = this.TuitionPaymentFragmentbindingInflater1.split("\n");
        if (strArrSplit.length <= 0) {
            throw new IllegalArgumentException("no lines");
        }
        if (strArrSplit[0].startsWith("  at ")) {
            throw new IllegalArgumentException("no reason message available");
        }
        int iIndexOf = strArrSplit[0].indexOf(":");
        if (iIndexOf < 0) {
            throw new IllegalArgumentException("no exception name available");
        }
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault3(strArrSplit[0].substring(0, iIndexOf), this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        int i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        StringBuilder sb = new StringBuilder();
        int iIndexOf2 = strArrSplit[0].indexOf(" ---> ");
        if (iIndexOf2 >= 0) {
            sb.append(strArrSplit[0].substring(0, iIndexOf2));
        } else {
            sb.append(strArrSplit[0]);
            for (int i2 = 1; i2 < strArrSplit.length && !strArrSplit[i2].startsWith("  at ") && sb.length() < i; i2++) {
                sb.append("\n");
                int iIndexOf3 = strArrSplit[i2].indexOf(" ---> ");
                if (iIndexOf3 < 0) {
                    sb.append(strArrSplit[i2]);
                } else {
                    sb.append(strArrSplit[i2].substring(0, iIndexOf3));
                    break;
                }
            }
        }
        if (sb.length() > i) {
            string = sb.substring(0, i);
        } else {
            string = sb.toString();
        }
        if (strArrSplit.length <= this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 && this.TuitionPaymentFragmentbindingInflater1.length() <= this.b) {
            string2 = this.TuitionPaymentFragmentbindingInflater1;
        } else {
            StringBuilder sb2 = new StringBuilder();
            int i3 = 0;
            int length = 0;
            while (i3 < Math.min(strArrSplit.length, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
                int i4 = i3 == 0 ? 0 : 1;
                if (strArrSplit[i3].length() + length + i4 > this.b) {
                    break;
                }
                if (i4 > 0) {
                    sb2.append("\n");
                }
                sb2.append(strArrSplit[i3]);
                length += strArrSplit[i3].length() + i4;
                i3++;
            }
            string2 = sb2.toString();
        }
        return new getTargetFrameRateInternal(strTuitionPaymentFragmentspecialinlinedviewModeldefault3, string, string2, PlatformType.XAMARIN);
    }
}
