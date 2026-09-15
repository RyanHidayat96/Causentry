package defpackage;

import androidx.recyclerview.widget.ItemTouchHelper;
import com.dynatrace.android.agent.crash.PlatformType;

/* JADX INFO: loaded from: classes4.dex */
public final class getSecondaryCamera implements getViewPortCropRect {
    private final int TuitionPaymentFragmentbindingInflater1;
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final Throwable TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final int b;

    public getSecondaryCamera(Throwable th, int i) {
        this(th, i, (byte) 0);
    }

    private getSecondaryCamera(Throwable th, int i, byte b) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = th;
        this.b = i;
        this.TuitionPaymentFragmentbindingInflater1 = 128000;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1000;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION;
    }

    @Override // defpackage.getViewPortCropRect
    public final getTargetFrameRateInternal TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        String strTrim;
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getClass().getName(), this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault4 = ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.toString(), this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        StringBuilder sb = new StringBuilder();
        int length = 0;
        int length2 = 0;
        int i = 0;
        for (Throwable cause = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2; cause != null && length2 < this.b && length <= this.TuitionPaymentFragmentbindingInflater1; cause = cause.getCause()) {
            if (length2 > 0) {
                sb.append("\nCaused by: ");
                length += 12;
            }
            String string = cause.toString();
            boolean z = length2 > 0;
            if (string == null) {
                string = "";
            } else {
                int iMin = Math.min(Math.max(0, (this.TuitionPaymentFragmentbindingInflater1 - i) - (z ? 12 : 0)), this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                if (string.length() > iMin) {
                    string = string.substring(0, iMin);
                }
            }
            String[] strArrSplit = string.split("\n");
            if (strArrSplit.length > this.b - length2) {
                int i2 = 0;
                while (length2 < this.b) {
                    if (i2 > 0) {
                        sb.append("\n");
                    }
                    sb.append(strArrSplit[i2]);
                    length = sb.length();
                    length2++;
                    i2++;
                }
                break;
            }
            sb.append(string);
            int length3 = sb.length();
            length2 += strArrSplit.length;
            int length4 = sb.length();
            StackTraceElement[] stackTrace = cause.getStackTrace();
            if (stackTrace != null) {
                int iMin2 = Math.min(stackTrace.length, this.b - length2);
                int i3 = 0;
                int i4 = length3;
                length = length4;
                int i5 = length2;
                while (i3 < iMin2 && length < this.TuitionPaymentFragmentbindingInflater1) {
                    sb.append("\n\tat ");
                    sb.append(stackTrace[i3]);
                    i5++;
                    i3++;
                    i4 = length;
                    length = sb.length();
                }
                int i6 = i5;
                i = i4;
                length2 = i6;
            } else {
                i = length3;
                length = length4;
            }
        }
        if (length > this.TuitionPaymentFragmentbindingInflater1) {
            strTrim = sb.substring(0, i).trim();
        } else {
            strTrim = sb.toString().trim();
        }
        return new getTargetFrameRateInternal(strTuitionPaymentFragmentspecialinlinedviewModeldefault3, strTuitionPaymentFragmentspecialinlinedviewModeldefault4, strTrim, PlatformType.JAVA);
    }
}
