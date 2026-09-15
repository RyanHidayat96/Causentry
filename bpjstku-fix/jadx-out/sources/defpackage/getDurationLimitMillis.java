package defpackage;

import com.rd.animation.type.AnimationType;
import com.rd.draw.data.Orientation;

/* JADX INFO: loaded from: classes4.dex */
public final class getDurationLimitMillis {
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1(AudioStats audioStats, int i) throws Throwable {
        int iTuitionPaymentFragmentbindingInflater1 = audioStats.TuitionPaymentFragmentbindingInflater1();
        int i2 = audioStats.INotificationSideChannelStub;
        int i3 = audioStats.IconCompatParcelizer;
        int i4 = audioStats.notify;
        int i5 = 0;
        for (int i6 = 0; i6 < iTuitionPaymentFragmentbindingInflater1; i6++) {
            int i7 = i3 / 2;
            int i8 = i5 + i2 + i7;
            if (i == i6) {
                return i8;
            }
            i5 = i8 + i2 + i4 + i7;
        }
        if (audioStats.b == null) {
            audioStats.b = AnimationType.NONE;
        }
        return audioStats.b == AnimationType.DROP ? i5 + (i2 * 2) : i5;
    }

    private static int TuitionPaymentFragmentbindingInflater1(AudioStats audioStats) {
        int i = audioStats.INotificationSideChannelStub;
        if (audioStats.b == null) {
            audioStats.b = AnimationType.NONE;
        }
        return audioStats.b == AnimationType.DROP ? i * 3 : i;
    }

    public static int TuitionPaymentFragmentbindingInflater1(AudioStats audioStats, int i) throws Throwable {
        int iTuitionPaymentFragmentbindingInflater1;
        if (audioStats == null) {
            return 0;
        }
        if (audioStats.INotificationSideChannel == null) {
            audioStats.INotificationSideChannel = Orientation.HORIZONTAL;
        }
        if (audioStats.INotificationSideChannel == Orientation.HORIZONTAL) {
            iTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(audioStats, i);
        } else {
            iTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(audioStats);
        }
        return iTuitionPaymentFragmentbindingInflater1 + audioStats.cancelAll;
    }

    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2(AudioStats audioStats, int i) throws Throwable {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (audioStats == null) {
            return 0;
        }
        if (audioStats.INotificationSideChannel == null) {
            audioStats.INotificationSideChannel = Orientation.HORIZONTAL;
        }
        if (audioStats.INotificationSideChannel == Orientation.HORIZONTAL) {
            iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentbindingInflater1(audioStats);
        } else {
            iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(audioStats, i);
        }
        return iTuitionPaymentFragmentspecialinlinedviewModeldefault1 + audioStats.INotificationSideChannelDefault;
    }
}
