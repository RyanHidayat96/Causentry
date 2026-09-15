package defpackage;

import android.content.Context;
import android.os.CountDownTimer;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.bpjstku.R;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0002\u0015\u000eB\u001d\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\nR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000fR\u001c\u0010\u000b\u001a\b\u0018\u00010\u0011R\u00020\u00008\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R\u0016\u0010\t\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0017"}, d2 = {"LgetCameraCharacteristic;", "", "Landroid/widget/TextView;", "p0", "", "p1", "<init>", "(Landroid/widget/TextView;Ljava/lang/Long;)V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "()V", "b", "g", "Landroid/widget/TextView;", "TuitionPaymentFragmentbindingInflater1", "Ljava/lang/Long;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "LgetCameraCharacteristic$TuitionPaymentFragmentbindingInflater1;", "LgetCameraCharacteristic$TuitionPaymentFragmentbindingInflater1;", "J", "a", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "", "Z", "asInterface"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class getCameraCharacteristic {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private long TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private boolean asInterface;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public TuitionPaymentFragmentbindingInflater1 b;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private long TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Long TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final TextView TuitionPaymentFragmentbindingInflater1;

    public getCameraCharacteristic(TextView textView, Long l) {
        this.TuitionPaymentFragmentbindingInflater1 = textView;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = l;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = l != null ? l.longValue() : 180000L;
    }

    public /* synthetic */ getCameraCharacteristic(TextView textView, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(textView, (i & 2) != 0 ? 180000L : l);
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        this.asInterface = false;
        TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = this.b;
        if (tuitionPaymentFragmentbindingInflater1 != null) {
            tuitionPaymentFragmentbindingInflater1.cancel();
        }
        TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater2 = new TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        this.b = tuitionPaymentFragmentbindingInflater2;
        tuitionPaymentFragmentbindingInflater2.start();
    }

    public final void b() {
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 <= 0) {
            TextView textView = this.TuitionPaymentFragmentbindingInflater1;
            if (textView != null) {
                textView.setText(textView.getContext().getString(R.string.label_resend_code));
                this.asInterface = true;
                textView.setClickable(true);
                textView.setTextColor(ContextCompat.getColor(textView.getContext(), R.color.colorDarkMint));
                return;
            }
            return;
        }
        this.asInterface = false;
        TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = this.b;
        if (tuitionPaymentFragmentbindingInflater1 != null) {
            tuitionPaymentFragmentbindingInflater1.cancel();
        }
        TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater2 = new TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        this.b = tuitionPaymentFragmentbindingInflater2;
        tuitionPaymentFragmentbindingInflater2.start();
    }

    public final class TuitionPaymentFragmentbindingInflater1 extends CountDownTimer {
        public TuitionPaymentFragmentbindingInflater1(long j) {
            super(j, 1000L);
        }

        @Override // android.os.CountDownTimer
        public final void onTick(long j) throws IOException {
            getCameraCharacteristic.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = j;
            long j2 = j / 1000;
            if (getContentPaddingRight.TuitionPaymentFragmentbindingInflater1() > 0) {
                getContentPaddingRight.b("Timer : ".concat(String.valueOf(j2)), new Object[0]);
            }
            if (getCameraCharacteristic.this.TuitionPaymentFragmentbindingInflater1 != null) {
                TextView textView = getCameraCharacteristic.this.TuitionPaymentFragmentbindingInflater1;
                Context context = getCameraCharacteristic.this.TuitionPaymentFragmentbindingInflater1.getContext();
                StringBuilder sb = new StringBuilder();
                sb.append(j2);
                sb.append("s");
                textView.setText(context.getString(R.string.action_resend_code_sec, sb.toString()));
                getCameraCharacteristic.this.TuitionPaymentFragmentbindingInflater1.setClickable(false);
                getCameraCharacteristic.this.TuitionPaymentFragmentbindingInflater1.setTextColor(ContextCompat.getColor(getCameraCharacteristic.this.TuitionPaymentFragmentbindingInflater1.getContext(), R.color.colorGrey));
            }
        }

        @Override // android.os.CountDownTimer
        public final void onFinish() throws IOException {
            if (getContentPaddingRight.TuitionPaymentFragmentbindingInflater1() > 0) {
                getContentPaddingRight.b("Timer finished.", new Object[0]);
            }
            if (getCameraCharacteristic.this.TuitionPaymentFragmentbindingInflater1 != null) {
                getCameraCharacteristic.this.TuitionPaymentFragmentbindingInflater1.setText(getCameraCharacteristic.this.TuitionPaymentFragmentbindingInflater1.getContext().getString(R.string.label_resend_code));
                getCameraCharacteristic.this.asInterface = true;
                getCameraCharacteristic.this.TuitionPaymentFragmentbindingInflater1.setClickable(true);
                getCameraCharacteristic.this.TuitionPaymentFragmentbindingInflater1.setTextColor(ContextCompat.getColor(getCameraCharacteristic.this.TuitionPaymentFragmentbindingInflater1.getContext(), R.color.colorDarkMint));
            }
        }
    }
}
